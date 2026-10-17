package com.revolut.retail.feature.airport.security_fast_track.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import oti.t1;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/network/AsftSlotPrebookingService;", "", "Loti/t1;", "request", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "postAcquireBookingSlot", "(Loti/t1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "slotId", "getBookingSlotStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftSlotPrebookingService {
    @GET("/fast-track/booking-slots/{slotId}")
    Object getBookingSlotStatus(@Path("slotId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("/fast-track/booking-slots")
    Object postAcquireBookingSlot(@Body @NotNull t1 t1Var, @NotNull Continuation<? super Response<ResponseBody>> continuation);
}
