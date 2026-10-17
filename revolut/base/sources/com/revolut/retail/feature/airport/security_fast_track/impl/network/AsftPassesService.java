package com.revolut.retail.feature.airport.security_fast_track.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import oti.b1;
import oti.h1;
import oti.p0;
import oti.s0;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/network/AsftPassesService;", "", "", "idempotencyKey", "Loti/p0;", "body", "Lretrofit2/Response;", "Loti/s0;", "postFastTrackPass", "(Ljava/lang/String;Loti/p0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loti/h1;", "getFastTrackPasses", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "passId", "Loti/b1;", "getFastTrackPass", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "revealFastTrackPass", "refundFastTrackPass", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftPassesService {
    @GET("/fast-track/passes/{passId}")
    Object getFastTrackPass(@Path("passId") @NotNull String str, @NotNull Continuation<? super b1> continuation);

    @GET("/fast-track/passes")
    Object getFastTrackPasses(@NotNull Continuation<? super h1> continuation);

    @POST("/fast-track/passes")
    Object postFastTrackPass(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull p0 p0Var, @NotNull Continuation<? super Response<s0>> continuation);

    @PUT("/fast-track/passes/{passId}/refund")
    Object refundFastTrackPass(@Path("passId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @PUT("/fast-track/passes/{passId}/reveal")
    Object revealFastTrackPass(@Path("passId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
