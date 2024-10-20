package org.Friday.Flipkart.Entity;

import java.io.Serializable;
import java.util.Date;

public class OrderEntity implements Serializable{
	
	private long altKey;
	
	private String productId;
	
	private String quantity;
	
	private String totalPrice;
	
	private Date soldDate;
	
	private String paymentMode;

}
