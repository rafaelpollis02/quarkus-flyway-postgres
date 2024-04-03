package br.com.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.print.attribute.standard.Media;

@Path("api/v1/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    @ConfigProperty(name = "quarkus.message")
    String message;

    @GET
    public String getMessage(){
        return message;
    }

}
