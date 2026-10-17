package com.revolut.feature.travel.experiences.impl.network.booking;

import efm.b;
import efm.d0;
import gzf.d;
import gzf.f;
import gzf.g;
import izf.c;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qzf.h;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\u0006H'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/network/booking/TravelExperiencesBookingService;", "", "", "apiVersion", "Lgzf/f;", "requestDto", "Lefm/d0;", "Lgzf/g;", "createBooking", "(Ljava/lang/String;Lgzf/f;)Lefm/d0;", "bookingId", "Lgzf/h;", "getBookingStatus", "(Ljava/lang/String;)Lefm/d0;", "Lgzf/d;", "getBooking", "", "getBookings", "()Lefm/d0;", "Lizf/c;", "Lefm/b;", "deleteBooking", "(Ljava/lang/String;Lizf/c;)Lefm/b;", "id", "Lqzf/h;", "getBookingCancellationQuote", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelExperiencesBookingService {
    @POST("travels/experiences/bookings")
    @NotNull
    d0<g> createBooking(@Header("X-Api-Version") String apiVersion, @Body @NotNull f requestDto);

    @NotNull
    @HTTP(hasBody = true, method = "DELETE", path = "travels/experiences/bookings/{bookingId}")
    b deleteBooking(@Path("bookingId") @NotNull String bookingId, @Body @NotNull c requestDto);

    @GET("travels/experiences/bookings/{bookingId}")
    @NotNull
    d0<d> getBooking(@Path("bookingId") @NotNull String bookingId);

    @GET("travels/experiences/bookings/{bookingId}/cancellation-quote")
    @NotNull
    d0<h> getBookingCancellationQuote(@Path("bookingId") @NotNull String id10);

    @GET("travels/experiences/bookings/{bookingId}/status")
    @NotNull
    d0<gzf.h> getBookingStatus(@Path("bookingId") @NotNull String bookingId);

    @GET("travels/experiences/bookings")
    @NotNull
    d0<List<d>> getBookings();
}
