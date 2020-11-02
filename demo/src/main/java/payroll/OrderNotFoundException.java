package payroll;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4004930968581022471L;

	OrderNotFoundException(Long id) {
		    super("Could not find order " + id);
		  }
}
