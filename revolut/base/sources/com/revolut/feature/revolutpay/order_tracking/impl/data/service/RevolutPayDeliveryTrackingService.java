package com.revolut.feature.revolutpay.order_tracking.impl.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pac.a;
import pac.d;
import pac.f;
import pac.h;
import pac.m;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0006J4\u0010\u0017\u001a\u00020\u00162\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/data/service/RevolutPayDeliveryTrackingService;", "", "", "orderId", "Lpac/m;", "getTrackingOrderDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpac/d;", "getDeliveryCarriers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpac/h;", "editDeliveryRequest", "Lpac/f;", "editTracking", "(Lpac/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "deleteTracking", "", "offset", "intervalDays", "limit", "Lpac/a;", "getDeliveries", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayDeliveryTrackingService {
    @DELETE("/revpay/deliveries/{id}")
    Object deleteTracking(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/revpay/deliveries")
    Object editTracking(@Body @NotNull h hVar, @NotNull Continuation<? super f> continuation);

    @GET("/revpay/deliveries")
    Object getDeliveries(@Query("offset") Integer num, @Query("intervalDays") Integer num2, @Query("limit") Integer num3, @NotNull Continuation<? super a> continuation);

    @GET("/revpay/delivery-carriers")
    Object getDeliveryCarriers(@NotNull Continuation<? super d> continuation);

    @GET("/revpay/orders/{orderId}")
    Object getTrackingOrderDetails(@Path("orderId") @NotNull String str, @NotNull Continuation<? super m> continuation);
}
