package org.college;

public class College {
	public College() {
		System.out.println("Name of the college");
	}
	public void collegename() {
	System.out.println("Name of the collegename");
}
	
public void collegecode() {
	System.out.println("Collegecode is ss648");
}
public void collegerank() {
	System.out.println("Collegerankis first");
}
public static void main(String[] args) {
	
	College c = new College();
	c.collegecode();
	c.collegename();
	c.collegerank();
	
	Student s = new Student();
	s.studentdept();
	s.studentname();
	s.studentid();
	s.studentdept();
	
	Hostel h = new Hostel();
	h.hostelname();
	
	Dept d = new Dept();
	d.deptname();
	
}
}

