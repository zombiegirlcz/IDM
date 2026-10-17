package com.revolut.retail.feature.impl.trips.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import wvj.c;
import wvj.f;
import wvj.p;
import wvj.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u000e\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/trips/network/TripsApiService;", "", "", "lastModified", "Lwvj/p;", "getTrips", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyKey", "Lwvj/c;", "request", "Lwvj/f;", "createTrip", "(Ljava/lang/String;Lwvj/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tripId", "Lwvj/q;", "", "updateTrip", "(Ljava/lang/String;Lwvj/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTrip", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TripsApiService {
    @POST("/analytics/trips")
    Object createTrip(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super f> continuation);

    @DELETE("/analytics/trips/{tripId}")
    Object deleteTrip(@Path("tripId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/analytics/trips")
    Object getTrips(@Query("lastModified") long j2, @NotNull Continuation<? super p> continuation);

    @PATCH("/analytics/trips/{tripId}")
    Object updateTrip(@Path("tripId") @NotNull String str, @Body @NotNull q qVar, @NotNull Continuation<? super Unit> continuation);
}
