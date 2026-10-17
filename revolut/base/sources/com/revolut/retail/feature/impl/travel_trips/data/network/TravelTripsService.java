package com.revolut.retail.feature.impl.travel_trips.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import quj.c;
import quj.l;
import quj.o;
import quj.r;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0006J$\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/data/network/TravelTripsService;", "", "", "itineraryId", "Lquj/l;", "getItinerary", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lquj/r;", "getCurrentItinerary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lquj/c;", "request", "", "addCustomEvent", "(Ljava/lang/String;Lquj/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itineraryItemId", "editCustomEvent", "removeCustomEvent", "proposalId", "removeProposal", "Lquj/o;", "editItineraryDates", "(Ljava/lang/String;Lquj/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelTripsService {
    @POST("/travels/itineraries/{itineraryId}/bookings")
    Object addCustomEvent(@Path("itineraryId") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("/travels/itineraries/bookings/{itineraryItemId}")
    Object editCustomEvent(@Path("itineraryItemId") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/travels/itineraries/{itineraryId}")
    Object editItineraryDates(@Path("itineraryId") @NotNull String str, @Body @NotNull o oVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/travels/itineraries/current")
    Object getCurrentItinerary(@NotNull Continuation<? super r> continuation);

    @GET("/travels/itineraries/{itineraryId}")
    Object getItinerary(@Path("itineraryId") @NotNull String str, @NotNull Continuation<? super l> continuation);

    @DELETE("/travels/itineraries/bookings/{itineraryItemId}")
    Object removeCustomEvent(@Path("itineraryItemId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @DELETE("/travels/itineraries/proposals/{proposalId}")
    Object removeProposal(@Path("proposalId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
