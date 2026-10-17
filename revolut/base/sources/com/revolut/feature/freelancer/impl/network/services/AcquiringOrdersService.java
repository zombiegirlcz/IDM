package com.revolut.feature.freelancer.impl.network.services;

import com.revolut.feature.freelancer.impl.network.models.g;
import java.util.List;
import jt6.e;
import jt6.i;
import jt6.k;
import jt6.m;
import jt6.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0015\u0010\u000bJ(\u0010\u001a\u001a\u00020\u00192\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/AcquiringOrdersService;", "", "Lcom/revolut/feature/freelancer/impl/network/models/g;", "params", "Ljt6/e;", "createOrder", "(Lcom/revolut/feature/freelancer/impl/network/models/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "", "cancelOrder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idempotencyKey", "Ljt6/m;", "refundOrder", "(Ljava/lang/String;Ljava/lang/String;Ljt6/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljt6/i;", "getLineItems", "Ljt6/k;", "getOrderPayments", "getOrder", "", "from", "to", "Ljt6/o;", "getOrders", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AcquiringOrdersService {
    @POST("/acquiring/merchant/orders/{id}/cancel")
    Object cancelOrder(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/acquiring/merchant/orders")
    Object createOrder(@Body @NotNull g gVar, @NotNull Continuation<? super e> continuation);

    @GET("/acquiring/merchant/orders/{id}/line-items")
    Object getLineItems(@Path("id") @NotNull String str, @NotNull Continuation<? super List<i>> continuation);

    @GET("/acquiring/merchant/orders/{id}")
    Object getOrder(@Path("id") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @GET("/acquiring/merchant/orders/{id}/payments")
    Object getOrderPayments(@Path("id") @NotNull String str, @NotNull Continuation<? super k> continuation);

    @Headers({"X-Api-Version: 2"})
    @GET("/acquiring/merchant/orders")
    Object getOrders(@Query("from") Long l2, @Query("to") Long l3, @NotNull Continuation<? super o> continuation);

    @POST("/acquiring/merchant/orders/{id}/refund")
    Object refundOrder(@Path("id") @NotNull String str, @Header("X-Idempotency-Key") @NotNull String str2, @Body @NotNull m mVar, @NotNull Continuation<? super Unit> continuation);
}
