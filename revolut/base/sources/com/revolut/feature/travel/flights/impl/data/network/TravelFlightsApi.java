package com.revolut.feature.travel.flights.impl.data.network;

import a8g.b0;
import b8g.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import s7g.c;
import s7g.c0;
import s7g.f;
import s7g.f0;
import s7g.g1;
import s7g.h;
import s7g.h2;
import s7g.j1;
import s7g.m1;
import v7g.o;
import w7g.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 :2\u00020\u0001:\u0001;J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u000f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0006\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0017\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001c\u0010\u001aJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0001\u0010\u0017\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001f\u0010\u001aJ0\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0017\u001a\u00020\u00072\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\"\u0010#J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010$\u001a\u00020\u0007H§@¢\u0006\u0004\b%\u0010\u000eJ$\u0010(\u001a\u00020'2\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\b\u0001\u0010\u0006\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\b\u0001\u0010.\u001a\u00020\u0007H§@¢\u0006\u0004\b0\u0010\u001aJ$\u00103\u001a\u0002022\b\b\u0001\u00101\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b3\u0010\u000eJ$\u00105\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b5\u0010\u000eJ.\u00108\u001a\u0002072\b\b\u0001\u00101\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u0002062\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b8\u00109¨\u0006<À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/data/network/TravelFlightsApi;", "", "Ls7g/h2;", "getBookings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "La8g/b0;", "request", "", "searchSessionId", "La8g/f0;", "searchFlights", "(La8g/b0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itineraryId", "getItinerary", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls7g/g1;", "Ls7g/j1;", "previewBooking", "(Ls7g/g1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls7g/c;", "Ls7g/f;", "confirmBooking", "(Ls7g/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bookingId", "Ls7g/m1;", "getBookingStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls7g/f0;", "getBookingDetails", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getBookingDocument", "language", "Lu7g/f;", "getBookingReceipts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiptId", "getBookingReceipt", "Ls7g/h;", "Ls7g/c0;", "updateBookingContact", "(Ljava/lang/String;Ls7g/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lb8g/f;", "Lb8g/i;", "getChatRedirectUrl", "(Lb8g/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "Lx7g/f;", "searchLocations", "offerId", "Ly7g/f;", "getOfferDetails", "Lw7g/r;", "getFareOptions", "Lv7g/o;", "Lv7g/r;", "quoteExtraProducts", "(Ljava/lang/String;Lv7g/o;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelFlightsApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f93209a;

    /* JADX INFO: renamed from: com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f93209a = new Companion();

        private Companion() {
        }
    }

    @POST("/travels/flights/bookings/confirm")
    Object confirmBooking(@Body @NotNull c cVar, @Header("x-search-session-id") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("/travels/flights/bookings/{bookingId}/details")
    Object getBookingDetails(@Path("bookingId") @NotNull String str, @NotNull Continuation<? super f0> continuation);

    @Streaming
    @GET("/travels/flights/bookings/{bookingId}/download-document")
    Object getBookingDocument(@Path("bookingId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @Streaming
    @GET("/travels/flights/bookings/{bookingId}/receipts/{receiptId}")
    Object getBookingReceipt(@Path("bookingId") @NotNull String str, @Path("receiptId") @NotNull String str2, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/travels/flights/bookings/{bookingId}/receipts")
    Object getBookingReceipts(@Path("bookingId") @NotNull String str, @Query("language") String str2, @Header("x-search-session-id") @NotNull String str3, @NotNull Continuation<? super u7g.f> continuation);

    @GET("/travels/flights/bookings/{bookingId}/status")
    Object getBookingStatus(@Path("bookingId") @NotNull String str, @NotNull Continuation<? super m1> continuation);

    @GET("/travels/flights/bookings")
    Object getBookings(@NotNull Continuation<? super h2> continuation);

    @POST("/travels/flights/support/chat-redirect-url")
    Object getChatRedirectUrl(@Body @NotNull b8g.f fVar, @NotNull Continuation<? super i> continuation);

    @GET("/travels/flights/itineraries/{itineraryId}/fares")
    Object getFareOptions(@Path("itineraryId") @NotNull String str, @Header("x-search-session-id") @NotNull String str2, @NotNull Continuation<? super r> continuation);

    @GET("/travels/flights/itineraries/{itineraryId}")
    Object getItinerary(@Path("itineraryId") @NotNull String str, @Header("x-search-session-id") @NotNull String str2, @NotNull Continuation<Object> continuation);

    @GET("/travels/flights/offer/{offerId}")
    Object getOfferDetails(@Path("offerId") @NotNull String str, @Header("x-search-session-id") @NotNull String str2, @NotNull Continuation<? super y7g.f> continuation);

    @POST("/travels/flights/bookings/preview")
    Object previewBooking(@Body @NotNull g1 g1Var, @Header("x-search-session-id") @NotNull String str, @NotNull Continuation<? super j1> continuation);

    @POST("/travels/flights/offer/{offerId}/quote")
    Object quoteExtraProducts(@Path("offerId") @NotNull String str, @Body @NotNull o oVar, @Header("x-search-session-id") @NotNull String str2, @NotNull Continuation<? super v7g.r> continuation);

    @POST("/travels/flights/itineraries/search")
    Object searchFlights(@Body @NotNull b0 b0Var, @Header("x-search-session-id") @NotNull String str, @NotNull Continuation<? super a8g.f0> continuation);

    @GET("/travels/flights/locations/search")
    Object searchLocations(@NotNull @Query("name") String str, @NotNull Continuation<? super x7g.f> continuation);

    @PATCH("/travels/flights/bookings/{bookingId}/update-contact")
    Object updateBookingContact(@Path("bookingId") @NotNull String str, @Body @NotNull h hVar, @NotNull Continuation<? super c0> continuation);
}
