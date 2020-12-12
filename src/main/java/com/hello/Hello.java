package com.hello;

public class Hello {
	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println(System.getProperty("java.vm.version"));
		System.out.println(System.getProperty("java.vm.name"));
		@SuppressWarnings("rawtypes")
		Class thisClass = new Object(){}.getClass();
		String className = thisClass.getEnclosingClass().getSimpleName();
		System.out.println(className);
		System.out.println("===============================");
	}
}