package com.revolut.feature.travel.miles.impl.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import xfg.b0;
import xfg.g;
import xfg.h0;
import xfg.i0;
import xfg.k;
import xfg.l;
import xfg.m;
import xfg.n;
import xfg.o;
import xfg.p;
import xfg.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH'¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\bJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010 \u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010\bJ\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0004H'¢\u0006\u0004\b$\u0010\u001fJ\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010\u0016\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0016\u001a\u00020%H'¢\u0006\u0004\b*\u0010(¨\u0006+À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/network/TravelMilesSearchService;", "", "", "userLocation", "Lefm/d0;", "", "Lxfg/i0;", "getTopDestinations", "(Ljava/lang/String;)Lefm/d0;", "location", "Lxfg/p;", "getSearchSuggestions", "query", "", "limit", "offset", "Lxfg/o;", "getAirports", "(Ljava/lang/String;II)Lefm/d0;", "", "isLiveSearchEnabled", "Lxfg/d0;", "request", "Lxfg/h0;", "getSearchResults", "(ZLxfg/d0;)Lefm/d0;", "flightId", "Lxfg/b0;", "getFlightDetails", "Lxfg/g;", "getAvailableAirlines", "()Lefm/d0;", "liveSearchId", "Lxfg/n;", "getLiveSearchDetails", "Lxfg/m;", "getFlightsFilters", "Lxfg/l;", "Lxfg/k;", "getFlightAvailability", "(Lxfg/l;)Lefm/d0;", "Lxfg/q;", "getFlightSuggestions", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelMilesSearchService {
    @GET("/loyalty/airports/search")
    @NotNull
    d0<o> getAirports(@NotNull @Query("query") String query, @Query("limit") int limit, @Query("offset") int offset);

    @GET("/loyalty/airlines-availability")
    @NotNull
    d0<g> getAvailableAirlines();

    @POST("/loyalty/flights/availability-calendar")
    @NotNull
    d0<k> getFlightAvailability(@Body @NotNull l request);

    @GET("/loyalty/flights/{id}")
    @NotNull
    d0<b0> getFlightDetails(@Path("id") @NotNull String flightId);

    @POST("/loyalty/flights/search-suggestions")
    @NotNull
    d0<q> getFlightSuggestions(@Body @NotNull l request);

    @GET("/loyalty/flights/filters")
    @NotNull
    d0<m> getFlightsFilters();

    @GET("/loyalty/flights/search/live/{id}")
    @NotNull
    d0<n> getLiveSearchDetails(@Path("id") @NotNull String liveSearchId);

    @POST("/loyalty/flights/search")
    @NotNull
    d0<h0> getSearchResults(@Query("liveSearchEnabled") boolean isLiveSearchEnabled, @Body @NotNull xfg.d0 request);

    @GET("loyalty/popular-flights/search-suggestions")
    @NotNull
    d0<p> getSearchSuggestions(@Header("X-Client-Geo-Location") String location);

    @GET("loyalty/popular-flights/top-destinations")
    @NotNull
    d0<List<i0>> getTopDestinations(@Header("X-Client-Geo-Location") String userLocation);
}
