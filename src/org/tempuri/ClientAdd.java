package org.tempuri;



public class ClientAdd {
	public static void main(String[] args) {
		
		Service1 s=new Service1();
		Service1Soap a=s.getService1Soap();
		System.out.println(a.product(2, 3));
		}
}
