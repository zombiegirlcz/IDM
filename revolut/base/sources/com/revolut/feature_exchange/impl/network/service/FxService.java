package com.revolut.feature_exchange.impl.network.service;

import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import z0i.a;
import z0i.f;
import z0i.g;
import z0i.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_exchange/impl/network/service/FxService;", "", "Lz0i/b;", "body", "", "idempotencyKey", "Lefm/d0;", "Lz0i/g;", "createOrder", "(Lz0i/b;Ljava/lang/String;)Lefm/d0;", "Lz0i/a;", "Lz0i/f;", "createLinkedOrder", "(Lz0i/a;Ljava/lang/String;)Lefm/d0;", "id", "Lefm/b;", "cancelOrder", "(Ljava/lang/String;)Lefm/b;", "Lz0i/i;", "getFxOrders", "()Lefm/d0;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FxService {
    @DELETE("/fx-orders/{id}")
    @NotNull
    b cancelOrder(@Path("id") @NotNull String id10);

    @POST("/fx-order-groups")
    @NotNull
    d0<f> createLinkedOrder(@Body @NotNull a body, @Header("X-Idempotency-Key") @NotNull String idempotencyKey);

    @POST("/fx-orders")
    @NotNull
    d0<g> createOrder(@Body @NotNull z0i.b body, @Header("X-Idempotency-Key") @NotNull String idempotencyKey);

    @GET("/fx-orders")
    @NotNull
    d0<i> getFxOrders();
}
