package org.superklamer.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test3")
public class MyResource3 {

	@GET
	@Produces(value = { MediaType.TEXT_PLAIN, "text/shortdate" } )
	public Date testMethod() {
		return Calendar.getInstance().getTime();
	}
}
