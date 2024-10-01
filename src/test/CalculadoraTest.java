package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	private int a,b;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll");

	}

	
	// Se ejecuta al inicio de cada prueba
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
		this.a = 5;
		this.b = 3;

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach");

	}

	@Test
	void testSuma() {
		assertEquals(5+3,Calculadora.suma(5, 3));
		
	}

	@Test
	void testResta() {
		assertEquals(5-3,Calculadora.resta(5, 3));
	}

	@Test
	void testMultiplica() {
		assertEquals(1*0,Calculadora.multiplica(1, -0));
	}

	@Test
	void testDivide() {
		assertEquals(-1,Calculadora.divide(5, 0));
		assertEquals(-1,Calculadora.divide(5, -5));
		assertEquals(-5,Calculadora.divide(5, -1));
		assertEquals(0,Calculadora.divide(0, 5));

	}

}
