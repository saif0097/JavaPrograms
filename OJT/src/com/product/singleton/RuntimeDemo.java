package com.product.singleton;

import java.io.IOException;

public class RuntimeDemo {
	
	public static void main(String[] args) throws IOException {
		
		Runtime r= Runtime.getRuntime();
		r.exec("notepad");
		r.exec("calc");
		r.exec("mspaint");
	}

}
