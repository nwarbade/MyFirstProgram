package com.nonStaticMethod;

public class NonStaticMethod {
	
	
	public static void main(String[] args) {
		
		
		NonStaticMethod a = new NonStaticMethod();
		a.myMethod1 (); //static method reference
		a.myMethod2 ();  //non static method reference
		
		
	}
	
	public static void myMethod1 () {
		
		System.out.println("static method");
	}
	
	public void myMethod2 () {
		
		System.out.println("non static method");
	}

}
