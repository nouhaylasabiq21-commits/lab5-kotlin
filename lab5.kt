fun factorialIterative(number: Int): Int {
    var accumulator = 1
    for (i in 1..number) {
        accumulator *= i
    }
    return accumulator
}

fun factorialRecursive(number: Int): Int {
    if (number <= 1) return 1
    return factorialRecursive(number - 1) * number
}

fun main() {
    println("Lab récursion – Factorielle")

    println("factorialIterative(1) = " + factorialIterative(1))
    println("factorialIterative(4) = " + factorialIterative(4))
    println("factorialIterative(5) = " + factorialIterative(5))

    println(" Version itérative ")
    println("factorialIterative(4) = " + factorialIterative(4))

    println(" Version récursive ")
    println("factorialRecursive(4) = " + factorialRecursive(4))
    println("factorialRecursive(5) = " + factorialRecursive(5))
}

