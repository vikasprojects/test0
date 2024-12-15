package com.example.test1

fun main() {
    val p1 = Person()
    println(p1.name)
}


class Person()
{
    lateinit var name: String
}