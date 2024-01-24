package com.salazarcodes.junitapp.examples.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Jimmy", new BigDecimal("25000.1478"));
//        cuenta.setPersona("Jimmys");

        String esperado = "Jimmy";
        String real = cuenta.getPersona();
        assertEquals(esperado,real);
        assertTrue(real.equals("Jimmy"));
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Jimmy", new BigDecimal("25000.1478"));
        assertEquals(25000.1478, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
    }
}