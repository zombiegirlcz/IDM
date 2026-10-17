package com.revolut.feature.travel.miles.impl.network;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import xfg.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/network/TravelMilesRecommendedFlightsService;", "", "", "departureIataCode", "arrivalIataCode", "provider", "Lefm/d0;", "Lxfg/y;", "getRecommendedFlights", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelMilesRecommendedFlightsService {
    @GET("loyalty/popular-flights/details")
    @NotNull
    d0<y> getRecommendedFlights(@NotNull @Query("departureIataCode") String departureIataCode, @NotNull @Query("arrivalIataCode") String arrivalIataCode, @NotNull @Query("provider") String provider);
}
