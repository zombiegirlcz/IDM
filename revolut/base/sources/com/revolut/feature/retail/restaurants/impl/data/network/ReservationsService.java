package com.revolut.feature.retail.restaurants.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qdb.b;
import qdb.h;
import qdb.i;
import qdb.j;
import qdb.k;
import qdb.m;
import qdb.o;
import qdb.p;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJL\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0006J$\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010 \u001a\u00020\u001c2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J$\u0010#\u001a\u00020\u00012\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001c2\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010\u0006¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/data/network/ReservationsService;", "", "", "reservationPageId", "Lqdb/m;", "getReservationPage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "guests", "time", "", "getAvailabilityCalendar", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reservationDate", "slots", "Lqdb/o;", "getTimeSlots", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idempotencyKey", "Lqdb/j;", "body", "Lqdb/b;", "createReservation", "(Ljava/lang/String;Ljava/lang/String;Lqdb/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reservationId", "Lqdb/k;", "getReservation", "Lqdb/p;", "", "updateReservation", "(Ljava/lang/String;Lqdb/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqdb/i;", "confirmReservation", "(Ljava/lang/String;Lqdb/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqdb/h;", "authoriseReservation", "(Ljava/lang/String;Lqdb/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelReservation", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReservationsService {
    @POST("reservations/{reservationId}/authorise")
    Object authoriseReservation(@Path("reservationId") @NotNull String str, @Body @NotNull h hVar, @NotNull Continuation<Object> continuation);

    @POST("reservations/{reservationId}/cancel")
    Object cancelReservation(@Path("reservationId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("reservations/{reservationId}/confirm")
    Object confirmReservation(@Path("reservationId") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @POST("reservation-pages/{reservationPageId}/reservations")
    Object createReservation(@Path("reservationPageId") @NotNull String str, @Header("X-Idempotency-Key") @NotNull String str2, @Body @NotNull j jVar, @NotNull Continuation<? super b> continuation);

    @GET("reservation-pages/{reservationPageId}/availability-calendar")
    Object getAvailabilityCalendar(@Path("reservationPageId") @NotNull String str, @Query("guests") int i, @Query("time") String str2, @NotNull Continuation<? super List<String>> continuation);

    @GET("reservations/{reservationId}")
    Object getReservation(@Path("reservationId") @NotNull String str, @NotNull Continuation<? super k> continuation);

    @GET("reservation-pages/{reservationPageId}")
    Object getReservationPage(@Path("reservationPageId") @NotNull String str, @NotNull Continuation<? super m> continuation);

    @GET("reservation-pages/{reservationPageId}/time-slots")
    Object getTimeSlots(@Path("reservationPageId") @NotNull String str, @NotNull @Query("reservationDate") String str2, @Query("guests") int i, @Query("time") String str3, @Query("slots") Integer num, @NotNull Continuation<? super List<o>> continuation);

    @PUT("reservations/{reservationId}")
    Object updateReservation(@Path("reservationId") @NotNull String str, @Body @NotNull p pVar, @NotNull Continuation<? super Unit> continuation);
}
