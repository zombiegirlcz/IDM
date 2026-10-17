package com.revolut.feature.travel.hotels.impl.network;

import cag.e;
import dag.g;
import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import r9g.a;
import r9g.g0;
import r9g.i;
import r9g.i0;
import r9g.k;
import r9g.l;
import r9g.u;
import r9g.y;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Tag;
import rfi.n;
import rfi.t;
import x9g.c;
import z9g.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0018\b\u0001\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010j\u0002`\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\bJ+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H'¢\u0006\u0004\b\u001d\u0010\u000fJO\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b$\u0010%J3\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020&2\b\b\u0001\u0010(\u001a\u00020&H'¢\u0006\u0004\b*\u0010+J%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b-\u0010\bJ%\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010\bJC\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H'¢\u0006\u0004\b1\u00102J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00050\u00042\b\b\u0001\u00104\u001a\u000203H'¢\u0006\u0004\b6\u00107J+\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00109\u001a\u000208H'¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010\bJ5\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010>\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b@\u0010AJ1\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00050\u00042\b\b\u0001\u0010>\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bB\u0010\fJ\u001b\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00050\u0004H'¢\u0006\u0004\bD\u0010\u000fJ#\u0010H\u001a\u00020G2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020EH'¢\u0006\u0004\bH\u0010IJ.\u0010N\u001a\u00020M2\b\b\u0001\u0010J\u001a\u00020\u00022\b\b\u0001\u0010K\u001a\u00020\u00022\b\b\u0001\u0010L\u001a\u00020\u0002H§@¢\u0006\u0004\bN\u0010OJ.\u0010U\u001a\u00020T2\b\b\u0001\u0010J\u001a\u00020\u00022\b\b\u0001\u0010Q\u001a\u00020P2\b\b\u0001\u0010S\u001a\u00020RH§@¢\u0006\u0004\bU\u0010VJ$\u0010X\u001a\u00020T2\b\b\u0001\u0010J\u001a\u00020\u00022\b\b\u0001\u0010W\u001a\u00020\u0002H§@¢\u0006\u0004\bX\u0010YJ\u001f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00042\b\b\u0001\u0010Z\u001a\u00020\u001eH'¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020G2\b\b\u0001\u0010^\u001a\u00020\u0002H'¢\u0006\u0004\b_\u0010`J\u0019\u0010a\u001a\u00020G2\b\b\u0001\u0010^\u001a\u00020\u0002H'¢\u0006\u0004\ba\u0010`J\u001b\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\u00050\u0004H'¢\u0006\u0004\bc\u0010\u000fJ%\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\be\u0010\bJ'\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\u00050\u00042\n\b\u0001\u0010f\u001a\u0004\u0018\u00010&H'¢\u0006\u0004\bh\u0010iJ\u001f\u0010j\u001a\b\u0012\u0004\u0012\u00020g0\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\bj\u0010\bJ\u0019\u0010m\u001a\u00020G2\b\b\u0001\u0010l\u001a\u00020kH'¢\u0006\u0004\bm\u0010nJ\u001b\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\u00050\u0004H'¢\u0006\u0004\bp\u0010\u000fJ)\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\br\u0010\fJ+\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\u00042\b\b\u0001\u0010s\u001a\u00020\u00022\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bv\u0010\fJ\u001f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0\u00042\b\b\u0001\u0010S\u001a\u00020wH'¢\u0006\u0004\by\u0010zJ\u0015\u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u0004H'¢\u0006\u0004\b|\u0010\u000fJ\u001f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010}\u001a\u00020\u0002H'¢\u0006\u0004\b~\u0010\bJ\u0017\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\u0004H'¢\u0006\u0005\b\u0080\u0001\u0010\u000fJ)\u0010\u0083\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00010\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0005\b\u0083\u0001\u0010\bJ%\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u00042\u000b\b\u0001\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\b\u0086\u0001\u0010\b¨\u0006\u0087\u0001À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/network/TravelHotelsService;", "", "", "apiVersion", "Lefm/d0;", "", "Lpfi/a;", "getPopularLocations", "(Ljava/lang/String;)Lefm/d0;", "type", "id", "getLocationsById", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Laag/a;", "getPropertyTypeCategories", "()Lefm/d0;", "", "Lcom/revolut/feature/travel/hotels/impl/network/SearchQueryMap;", "queryMap", "Ly9g/b;", "getPropertyAvailabilityResult", "(Ljava/util/Map;)Lefm/d0;", "currency", "getPopularProperties", "", "pointsBalance", "getPopularPropertiesByBalance", "(Ljava/lang/String;Ljava/lang/Double;)Lefm/d0;", "Lz9g/d;", "getAvailabilityFilters", "", "checkAvailability", "checkInDate", "checkOutDate", "occupancy", "Lrfi/n;", "getPropertyDetails", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "limit", "offset", "Lrfi/t;", "getPropertyGuestsReviews", "(Ljava/lang/String;II)Lefm/d0;", "Lofi/e;", "getPropertyFacilities", "Lx9g/e;", "getPropertyPolicies", "Lcag/d;", "getPropertyRooms", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcag/e;", "ratesRequestBody", "Lr9g/u;", "checkSelectedRoomsPrice", "(Lcag/e;)Lefm/d0;", "Lr9g/k;", "bookingRequestBody", "Lr9g/l;", "createPropertyBooking", "(Ljava/lang/String;Lr9g/k;)Lefm/d0;", "getPropertyBookingStatus", "include", "Lr9g/i;", "getPropertyBookingDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "getAllBookings", "Lt9g/a;", "getCashbackRates", "Lr9g/a;", "cancelBookingDto", "Lefm/b;", "deleteBooking", "(Ljava/lang/String;Lr9g/a;)Lefm/b;", "bookingId", "checkin", "checkout", "Lr9g/i0;", "getAmendmentAvailability", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwj0/b;", "idempotencyTag", "Lr9g/y;", "body", "Lr9g/g0;", "confirmAmendment", "(Ljava/lang/String;Lwj0/b;Lr9g/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "amendmentId", "getAmendmentStatus", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unscopedProperties", "Lx9g/c;", "getFavoritesProperties", "(Z)Lefm/d0;", "propertyId", "addPropertyToFavorites", "(Ljava/lang/String;)Lefm/b;", "removePropertyToFavorites", "Lnfi/a;", "getCampaigns", "Ls9g/a;", "getCampaignLocations", "size", "Lu9g/a;", "getDropoffs", "(Ljava/lang/Integer;)Lefm/d0;", "getDropoffById", "Lu9g/b;", "dropoffRequestBody", "saveDropoff", "(Lu9g/b;)Lefm/b;", "Lbag/b;", "getInventoryProviders", "Lv9g/i;", "getSuggestedExperiences", "text", "suggestionTypes", "Ldag/b;", "getStaysSearch", "Ldag/d;", "Ldag/e;", "getSmartSearch", "(Ldag/d;)Lefm/d0;", "Lw9g/a;", "getStaysPromotions", "userPlan", "getDiscounts", "Lsfi/a;", "getBoostedProperties", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getConfirmation", "locationType", "Ldag/g;", "getSortingOptions", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsService {
    @PUT("travels/stays/preferences/favorites/properties/{propertyId}")
    @NotNull
    b addPropertyToFavorites(@Path("propertyId") @NotNull String propertyId);

    @POST("travels/stays/pricecheck")
    @NotNull
    d0<List<u>> checkSelectedRoomsPrice(@Body @NotNull e ratesRequestBody);

    @POST("travels/stays/bookings/{bookingId}/amendments/confirm")
    Object confirmAmendment(@Path("bookingId") @NotNull String str, @Tag @NotNull wj0.b bVar, @Body @NotNull y yVar, @NotNull Continuation<? super g0> continuation);

    @POST("travels/stays/bookings")
    @NotNull
    d0<l> createPropertyBooking(@Header("X-Api-Version") String apiVersion, @Body @NotNull k bookingRequestBody);

    @NotNull
    @HTTP(hasBody = true, method = "DELETE", path = "travels/stays/bookings/{id}")
    b deleteBooking(@Path("id") @NotNull String id10, @Body @NotNull a cancelBookingDto);

    @GET("travels/stays/aggregators/bookings")
    @NotNull
    d0<List<i>> getAllBookings(@NotNull @Query(encoded = true, value = "include") String include, @Query("currency") String currency);

    @GET("travels/stays/bookings/{bookingId}/amendments/availability")
    Object getAmendmentAvailability(@Path("bookingId") @NotNull String str, @NotNull @Query("checkin") String str2, @NotNull @Query("checkout") String str3, @NotNull Continuation<? super i0> continuation);

    @GET("travels/stays/bookings/{bookingId}/amendments/{amendmentId}/status")
    Object getAmendmentStatus(@Path("bookingId") @NotNull String str, @Path("amendmentId") @NotNull String str2, @NotNull Continuation<? super g0> continuation);

    @Headers({"X-Api-Version: 2"})
    @GET("travels/properties/availability/filters")
    @NotNull
    d0<d> getAvailabilityFilters();

    @GET("travels/properties/boosted")
    @NotNull
    d0<sfi.a> getBoostedProperties();

    @GET("travels/campaigns/{id}/locations")
    @NotNull
    d0<List<s9g.a>> getCampaignLocations(@Path("id") @NotNull String id10);

    @GET("travels/campaigns")
    @NotNull
    d0<List<nfi.a>> getCampaigns();

    @GET("travels/stays/cashbacks/rates")
    @NotNull
    d0<List<t9g.a>> getCashbackRates();

    @GET("travels/stays/aggregators/bookings/{id}/confirmation")
    @NotNull
    d0<Response<ResponseBody>> getConfirmation(@Path("id") @NotNull String id10);

    @GET("travels/stays/discounts")
    @NotNull
    d0<Object> getDiscounts(@NotNull @Query("userPlan") String userPlan);

    @GET("travels/stays/dropoffs/{id}")
    @NotNull
    d0<u9g.a> getDropoffById(@Path("id") @NotNull String id10);

    @GET("travels/stays/dropoffs")
    @NotNull
    d0<List<u9g.a>> getDropoffs(@Query("size") Integer size);

    @GET("travels/stays/preferences/favorites/properties")
    @NotNull
    d0<c> getFavoritesProperties(@Query("unscoped_properties") boolean unscopedProperties);

    @GET("travels/stays/providers")
    @NotNull
    d0<List<bag.b>> getInventoryProviders();

    @GET("travels/locations/{type}/{id}")
    @NotNull
    d0<pfi.a> getLocationsById(@Path("type") @NotNull String type, @Path("id") @NotNull String id10);

    @GET("travels/locations/popular")
    @NotNull
    d0<List<pfi.a>> getPopularLocations(@Header("X-Api-Version") String apiVersion);

    @GET("travels/properties/popular")
    @NotNull
    d0<Object> getPopularProperties(@NotNull @Query("currency") String currency);

    @GET("travels/properties/discover")
    @NotNull
    d0<Object> getPopularPropertiesByBalance(@NotNull @Query("currency") String currency, @Query("pointsBalance") Double pointsBalance);

    @GET("travels/properties/availability")
    @NotNull
    d0<y9g.b> getPropertyAvailabilityResult(@QueryMap @NotNull Map<String, String> queryMap);

    @GET("travels/stays/aggregators/bookings/{id}")
    @NotNull
    d0<i> getPropertyBookingDetails(@Path("id") @NotNull String id10, @NotNull @Query(encoded = true, value = "include") String include, @Query("currency") String currency);

    @GET("travels/stays/bookings/{id}/status")
    @NotNull
    d0<l> getPropertyBookingStatus(@Path("id") @NotNull String id10);

    @GET("travels/properties/{id}")
    @NotNull
    d0<n> getPropertyDetails(@Path("id") @NotNull String id10, @Query("checkAvailability") Boolean checkAvailability, @Query("checkin") String checkInDate, @Query("checkout") String checkOutDate, @Query("occupancy") String occupancy);

    @GET("travels/properties/{id}/amenities")
    @NotNull
    d0<List<ofi.e>> getPropertyFacilities(@Path("id") @NotNull String id10);

    @GET("travels/properties/{id}/reviews/guest")
    @NotNull
    d0<t> getPropertyGuestsReviews(@Path("id") @NotNull String id10, @Query("limit") int limit, @Query("offset") int offset);

    @GET("travels/properties/{id}/policies")
    @NotNull
    d0<List<x9g.e>> getPropertyPolicies(@Path("id") @NotNull String id10);

    @GET("travels/properties/{id}/rooms")
    @NotNull
    d0<List<cag.d>> getPropertyRooms(@Path("id") @NotNull String id10, @NotNull @Query("checkin") String checkInDate, @NotNull @Query("checkout") String checkOutDate, @NotNull @Query("occupancy") String occupancy);

    @GET("travels/properties/types/categories")
    @NotNull
    d0<List<aag.a>> getPropertyTypeCategories();

    @POST("travels/stays/smart-search")
    @NotNull
    d0<dag.e> getSmartSearch(@Body @NotNull dag.d body);

    @GET("travels/properties/availability/sorting")
    @NotNull
    d0<g> getSortingOptions(@Query("locationType") String locationType);

    @GET("travels/stays/promotions")
    @NotNull
    d0<w9g.a> getStaysPromotions();

    @GET("travels/stays/search")
    @NotNull
    d0<dag.b> getStaysSearch(@NotNull @Query("text") String text, @Query("suggestion_types") String suggestionTypes);

    @GET("travels/stays/bookings/{id}/suggested-experiences")
    @NotNull
    d0<v9g.i> getSuggestedExperiences(@Path("id") @NotNull String id10, @NotNull @Query("currency") String currency);

    @DELETE("travels/stays/preferences/favorites/properties/{propertyId}")
    @NotNull
    b removePropertyToFavorites(@Path("propertyId") @NotNull String propertyId);

    @POST("travels/stays/dropoffs")
    @NotNull
    b saveDropoff(@Body @NotNull u9g.b dropoffRequestBody);
}
