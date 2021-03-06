package com.soywiz.krypto

import kotlin.test.Test
import kotlin.test.assertNotEquals

class SecureRandomTest {
    @Test
    fun test() {
        assertNotEquals(SecureRandom().nextBytes(16).toList(), SecureRandom().nextBytes(16).toList())
        assertNotEquals(SecureRandom.nextBytes(16).toList(), SecureRandom.nextBytes(16).toList())
        println(SecureRandom.nextBytes(15).toList())
    }
}