package com.revolut.feature.revolutpay.order_tracking.impl.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oac.a;
import oac.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/data/service/RevolutPayFlightBookingApiService;", "", "", "flightBookingOrderId", "Loac/a;", "getFlightBooking", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loac/b;", "notificationSettings", "Lretrofit2/Response;", "", "updateFlightBookingNotificationSettings", "(Ljava/lang/String;Loac/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayFlightBookingApiService {
    @GET("/revpay/orders/{flightBookingOrderId}/flight-bookings")
    Object getFlightBooking(@Path("flightBookingOrderId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @PATCH("/revpay/orders/{flightBookingOrderId}/flight-bookings/notifications")
    Object updateFlightBookingNotificationSettings(@Path("flightBookingOrderId") @NotNull String str, @Body @NotNull b bVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
