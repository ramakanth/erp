package eprcom.examples;

public class Operation {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int result = add(10, 20);
		System.out.println("Add operation result :"+ result);
	}

}
