package com.redhat;

import io.quarkus.vertx.http.HttpServerOptionsCustomizer;
import io.vertx.core.http.HttpServerOptions;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Http1OnlyCustomizer implements HttpServerOptionsCustomizer {
  @Override
  public void customizeHttpServer(HttpServerOptions options) {
    options.setHttp2ClearTextEnabled(false);
  }
}
