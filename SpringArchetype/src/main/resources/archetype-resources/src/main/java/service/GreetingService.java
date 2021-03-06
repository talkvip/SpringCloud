#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.dao.UserDao;

public class GreetingService {
	private UserDao dao;
	
	public String getGreet() {
		dao = dao == null ? new UserDao() : dao;
		return "Hello " + dao.getUser();
	}
	
	public String getGreetForUser(int i) {
		return "Hello " + dao.getUser(i);
	}
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
}
