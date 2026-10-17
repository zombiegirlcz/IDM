package com.revolut.feature.transport.impl.data;

import cvf.a0;
import cvf.i;
import cvf.l;
import cvf.o;
import cvf.q;
import cvf.r;
import cvf.u;
import cvf.v;
import cvf.y;
import dvf.a;
import dvf.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0010\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u000eJ\u001a\u0010\u001e\u001a\u00020\u001b2\b\b\u0001\u0010\u0010\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u000e\b\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\"\u0010#J&\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b%\u0010#J\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010&\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010\u000eJ0\u0010+\u001a\u00020*2\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020)2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-H§@¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020-2\b\b\u0001\u0010\u0010\u001a\u000200H§@¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203H§@¢\u0006\u0004\b4\u0010/¨\u00065À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transport/impl/data/TransportService;", "", "", "countryCode", "", "latitude", "longitude", "", "Lzuf/a;", "getTransitLocations", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "locationId", "Lcvf/o;", "getTransitTicketOffers", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcvf/a0;", "body", "idempotencyKey", "Lcvf/a;", "postAsyncTransitTicketPurchase", "(Lcvf/a0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSyncTransitTicketPurchase", "Lcvf/r;", "Lcvf/u;", "getPaymentQuotes", "(Lcvf/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "Lcvf/v;", "getInitPurchaseTransitTicket", "Lcvf/q;", "postInitPurchaseTransitTicket", "(Lcvf/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logicState", "Lcvf/i;", "getPurchasedTransitTicketsByState", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "getPurchasedTransitTicketsByIds", "id", "Lcvf/l;", "postInitActivateTransitTicket", "Lcvf/y;", "", "postActivateTransitTicket", "(Ljava/lang/String;Lcvf/y;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldvf/a;", "getEligibilityState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldvf/b;", "register", "(Ldvf/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbvf/a;", "getUserHelpOtp", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransportService {
    @GET("/public-transport/user")
    Object getEligibilityState(@NotNull Continuation<? super a> continuation);

    @POST("public-transport/purchase-session")
    Object getInitPurchaseTransitTicket(@NotNull @Query("ticketOfferId") String str, @NotNull Continuation<? super v> continuation);

    @PUT("/public-transport/ticket-offers/payment-quotes")
    Object getPaymentQuotes(@Body @NotNull r rVar, @NotNull Continuation<? super u> continuation);

    @GET("/public-transport/purchased-tickets")
    Object getPurchasedTransitTicketsByIds(@NotNull @Query("ids") List<String> list, @NotNull Continuation<? super List<? extends i>> continuation);

    @GET("/public-transport/purchased-tickets")
    Object getPurchasedTransitTicketsByState(@NotNull @Query("logicState") List<String> list, @NotNull Continuation<? super List<? extends i>> continuation);

    @GET("/public-transport/locations")
    Object getTransitLocations(@NotNull @Query("countryCode") String str, @Query("latitude") Double d, @Query("longitude") Double d5, @NotNull Continuation<? super List<zuf.a>> continuation);

    @GET("/public-transport/ticket-offers")
    Object getTransitTicketOffers(@NotNull @Query("locationId") String str, @NotNull Continuation<? super List<o>> continuation);

    @GET("/public-transport/user/otp")
    Object getUserHelpOtp(@NotNull Continuation<? super bvf.a> continuation);

    @POST("/public-transport/purchased-tickets/{id}/activate")
    Object postActivateTransitTicket(@Path("id") @NotNull String str, @Body @NotNull y yVar, @Header("X-Idempotency-Key") String str2, @NotNull Continuation<? super Unit> continuation);

    @POST("/public-transport/ticket-offers/init-purchase")
    Object postAsyncTransitTicketPurchase(@Body @NotNull a0 a0Var, @Header("X-Idempotency-Key") String str, @NotNull Continuation<? super cvf.a> continuation);

    @POST("public-transport/purchased-tickets/{id}/init-activation")
    Object postInitActivateTransitTicket(@Path("id") @NotNull String str, @NotNull Continuation<? super l> continuation);

    @POST("public-transport/purchase-session/initiate")
    Object postInitPurchaseTransitTicket(@Body @NotNull q qVar, @NotNull Continuation<? super v> continuation);

    @POST("/public-transport/ticket-offers/purchase")
    Object postSyncTransitTicketPurchase(@Body @NotNull a0 a0Var, @Header("X-Idempotency-Key") String str, @NotNull Continuation<Object> continuation);

    @POST("/public-transport/user")
    Object register(@Body @NotNull b bVar, @NotNull Continuation<? super a> continuation);
}
