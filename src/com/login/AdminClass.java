package com.login;

public class AdminClass {
	
	String uname;
	String passwd;
	
	public AdminClass(String uname, String passwd) {
		super();
		this.uname = uname;
		this.passwd = passwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
