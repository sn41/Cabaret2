/*
Willkommen, bienvenue, welcome!
Fremde, étranger, stranger
Glücklich zu sehen, je suis enchanté
Happy to see you
Bleibe, reste, stay
Willkommen, bienvenue, welcome
Im Cabaret, au Cabaret, to Cabaret
 */

fun main() {
    val germanWords = Words("Willkommen, Fremde, Glücklich zu sehen, Bleibe, Willkommen, Im Cabaret", ",")
    val frenchWords = Words("bienvenue, étranger, je suis enchanté, reste, bienvenue, au Cabaret", ",")
    val englishWords = Words("welcome!, stranger, Happy to see you, stay, welcome, to Cabaret", ",")

    println("___________German words____________")
    germanWords.forEach { println(it.get()) }

    println("___________French words____________")
    val frenchIterator = frenchWords.iterator()
    while (frenchIterator.hasNext()) {
        val word = frenchIterator.next()
        println(word.get())
    }

    println("__________English words____________")
    val englishIterator = englishWords.iterator()
    while (englishIterator.hasNext()) {
        val word = englishIterator.next()
        println(word.get())
    }

    /*
    * todo вывести первый куплет мелодии, используя итераторы коллекций и функции next()
    *  */



}

data class Word(private val word: String){
    fun get():String = word
}

class Words private constructor(strings: List<String>) : Iterable<Word> {
    constructor(string: String, delimiter:String) : this(string.split(Regex("[$delimiter]")))

    private val words: List<Word>

    init {
        words = strings.map { Word(it) }
    }

    override fun iterator(): Iterator<Word> = words.iterator()
}