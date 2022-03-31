package com.zensar1;
import org.junit.*;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

class ArithmeticTest  {
	
	Arithmetic arithmetic = null;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Inside beforeClass()");
	}
	@Before
	public void before() {
		this.arithmetic = new Arithmetic();
	}
	@After
	public void after() {
		this.arithmetic = null;
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Inside afterClass()");
	}
	@Test
	public void testAdd() {
		Arithmetic arithmetic = new Arithmetic();
		assertEquals(arithmetic.add(5, 10),15);
	}
	@Test
	@Ignore("Not ready to execute")
	public void testAdd1() {
		Arithmetic arithmetic = new Arithmetic();
		assertEquals(arithmetic.add(50, 40),35);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideException() {
		assertEquals(arithmetic.divide(50, 0), 5);
	}
	
}
