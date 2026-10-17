package com.revolut.feature.revolutpay.impl.data.service;

import e7c.a;
import e7c.b;
import e7c.b0;
import e7c.c;
import e7c.c0;
import e7c.e0;
import e7c.h0;
import e7c.i;
import e7c.i0;
import e7c.j0;
import e7c.k0;
import e7c.l0;
import e7c.n;
import e7c.n0;
import e7c.o0;
import e7c.p0;
import e7c.q;
import e7c.q0;
import e7c.r;
import e7c.s;
import e7c.u;
import e7c.w;
import e7c.z;
import i7c.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u0006Jt\u0010\u0015\u001a\u00020\t2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0082\u0001\u0010\u001a\u001a\u00020\u00192\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00112\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\u0006J:\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0003\u0010 \u001a\u00020\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010\u0006J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010'\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\u0006J&\u0010-\u001a\u00020,2\b\b\u0001\u0010+\u001a\u00020*2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b-\u0010.J\u001a\u0010/\u001a\u00020%2\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u0010\u0006J\u001a\u00103\u001a\u0002022\b\b\u0001\u00101\u001a\u000200H§@¢\u0006\u0004\b3\u00104J$\u00106\u001a\u0002072\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u000205H§@¢\u0006\u0004\b6\u00108J<\u0010=\u001a\u00020<2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u0002052\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020%2\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b?\u0010\u0006J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010@H§@¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020CH§@¢\u0006\u0004\bD\u0010BJ\u0010\u0010F\u001a\u00020EH§@¢\u0006\u0004\bF\u0010BJ\u001a\u0010J\u001a\u00020I2\b\b\u0001\u0010H\u001a\u00020GH§@¢\u0006\u0004\bJ\u0010KJ$\u0010N\u001a\u00020%2\b\b\u0001\u0010L\u001a\u00020\u00022\b\b\u0001\u0010M\u001a\u00020IH§@¢\u0006\u0004\bN\u0010OJ\u001a\u0010P\u001a\u00020%2\b\b\u0001\u0010L\u001a\u00020\u0002H§@¢\u0006\u0004\bP\u0010\u0006J$\u0010T\u001a\u00020S2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010R\u001a\u00020QH§@¢\u0006\u0004\bT\u0010UJ$\u0010Y\u001a\u00020X2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010W\u001a\u00020VH§@¢\u0006\u0004\bY\u0010ZJ$\u0010^\u001a\u00020]2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020[H§@¢\u0006\u0004\b^\u0010_J \u0010b\u001a\b\u0012\u0004\u0012\u00020%0@2\b\b\u0001\u0010a\u001a\u00020`H§@¢\u0006\u0004\bb\u0010cJ:\u0010g\u001a\u00020f2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010d\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bg\u0010hJ\u001a\u0010j\u001a\u00020%2\b\b\u0001\u0010\u001f\u001a\u00020iH§@¢\u0006\u0004\bj\u0010kJ\u001a\u0010n\u001a\u00020m2\b\b\u0001\u0010\u001f\u001a\u00020lH§@¢\u0006\u0004\bn\u0010o¨\u0006pÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/data/service/RevolutPayService;", "", "", "orderId", "Le7c/s;", "getOrderDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "merchantPublicKey", "", "Le7c/z;", "getPaymentMethods", "paymentMethodId", "saveFor", "product", "", "amount", "currency", "", "wealthProtectionSupported", "bnpl", "withNonSelectablePockets", "getPaymentMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentToken", "orderToken", "Le7c/p0;", "getWrappedPaymentMethods", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/e0;", "getProcessingOrderState", "Le7c/n;", "request", "accept", "idempotencyKey", "initiatePayment", "(Ljava/lang/String;Le7c/n;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentId", "", "declinePayment", "bin", "Lg7c/a;", "getCardIssuerInfo", "Le7c/b;", "cardRequest", "Le7c/w;", "addPaymentMethod", "(Le7c/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePaymentMethod", "Lg7c/c;", "quoteRequest", "Lg7c/b;", "getQuote", "(Lg7c/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/a;", "acceptPayment", "Le7c/b0;", "(Ljava/lang/String;Le7c/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestBody", "authCode", "codeVerifier", "Le7c/u;", "acceptNew", "(Ljava/lang/String;Le7c/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "failPayment", "Lretrofit2/Response;", "getCashback", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/c0;", "getCashbackV2", "Le7c/q0;", "getWrappedShippingContacts", "Le7c/c;", "address", "Le7c/k0;", "addShippingContact", "(Le7c/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "shippingContact", "updateShippingContact", "(Ljava/lang/String;Le7c/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteShippingContact", "Le7c/j0;", "shippingContactBodyDto", "Le7c/l0;", "validateShippingContact", "(Ljava/lang/String;Le7c/j0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/i;", "deliveryMethodBody", "Le7c/i0;", "setDeliveryMethod", "(Ljava/lang/String;Le7c/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/o0;", "usageCheckRequest", "Le7c/n0;", "getUsageCheck", "(Ljava/lang/String;Le7c/o0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/h0;", "saveEmailDto", "saveEmail", "(Le7c/h0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "totalAmount", "pocketId", "Li7c/g;", "getPaymentOptions", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh7c/a;", "updateUserPreferences", "(Lh7c/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/q;", "Le7c/r;", "createOAuthSetup", "(Le7c/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayService {
    @POST("/revpay/payments/{paymentId}/accept")
    Object acceptNew(@Path("paymentId") @NotNull String str, @Body @NotNull a aVar, @Header("X-Auth-Code") String str2, @Header("X-Auth-Code-Verifier") String str3, @NotNull Continuation<? super u> continuation);

    @POST("rev-payment/token/{paymentId}/accept")
    Object acceptPayment(@Path("paymentId") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super b0> continuation);

    @POST("rev-payment/payment-methods")
    Object addPaymentMethod(@Body @NotNull b bVar, @Header("Revolut-Pay-Merchant-Public-Key") String str, @NotNull Continuation<? super w> continuation);

    @POST("rev-payment/shipping-contacts")
    Object addShippingContact(@Body @NotNull c cVar, @NotNull Continuation<? super k0> continuation);

    @POST("/revpay/oauth-setup")
    Object createOAuthSetup(@Body @NotNull q qVar, @NotNull Continuation<? super r> continuation);

    @POST("rev-payment/token/{paymentId}/decline")
    Object declinePayment(@Path("paymentId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @DELETE("rev-payment/payment-methods/{paymentMethodId}")
    Object deletePaymentMethod(@Path("paymentMethodId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @DELETE("rev-payment/shipping-contacts/{id}")
    Object deleteShippingContact(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("rev-payment/token/{paymentToken}/fail")
    Object failPayment(@Path("paymentToken") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("card-issuer/{BIN}/info")
    Object getCardIssuerInfo(@Path("BIN") @NotNull String str, @NotNull Continuation<? super g7c.a> continuation);

    @GET("revolut-pay/cashback")
    Object getCashback(@NotNull Continuation<? super Response<Object>> continuation);

    @Headers({"X-Api-Version: v2"})
    @GET("revolut-pay/cashback")
    Object getCashbackV2(@NotNull Continuation<? super c0> continuation);

    @GET("rev-payment/token/{orderId}/order-details")
    Object getOrderDetails(@Path("orderId") @NotNull String str, @NotNull Continuation<? super s> continuation);

    @GET("rev-payment/payment-methods/{paymentMethodId}")
    Object getPaymentMethod(@Header("Revolut-Pay-Merchant-Public-Key") String str, @Path("paymentMethodId") @NotNull String str2, @Query("saveFor") String str3, @Query("product") String str4, @Query("amount") Long l2, @Query("currency") String str5, @Query("wpSupported") boolean z, @Query("bnpl") boolean z3, @Query("withNonSelectablePockets") boolean z4, @NotNull Continuation<? super z> continuation);

    @GET("rev-payment/payment-methods")
    Object getPaymentMethods(@Header("Revolut-Pay-Merchant-Public-Key") String str, @NotNull Continuation<? super List<? extends z>> continuation);

    @GET("/revpay/payment-options")
    Object getPaymentOptions(@NotNull @Query("orderToken") String str, @Query("amount") long j2, @NotNull @Query("paymentMethodId") String str2, @Query("pocketId") String str3, @NotNull Continuation<? super g> continuation);

    @Headers({"Serialise-Unified-Reason: true"})
    @GET("rev-payment/token/{paymentToken}/payment-details")
    Object getProcessingOrderState(@Path("paymentToken") @NotNull String str, @NotNull Continuation<? super e0> continuation);

    @POST("revpay/rev-payment/quote")
    Object getQuote(@Body @NotNull g7c.c cVar, @NotNull Continuation<? super g7c.b> continuation);

    @POST("revolut-pay/payment-methods/{paymentMethodId}/check-usage")
    Object getUsageCheck(@Path("paymentMethodId") @NotNull String str, @Body @NotNull o0 o0Var, @NotNull Continuation<? super n0> continuation);

    @Headers({"Wrap-Payment-Methods: true"})
    @GET("rev-payment/payment-methods")
    Object getWrappedPaymentMethods(@Header("Revolut-Pay-Merchant-Public-Key") String str, @Query("saveFor") String str2, @Query("product") String str3, @Query("amount") Long l2, @Query("currency") String str4, @Query("wpSupported") boolean z, @Query("bnpl") boolean z3, @Query("paymentToken") String str5, @Query("orderToken") String str6, @Query("withNonSelectablePockets") boolean z4, @NotNull Continuation<? super p0> continuation);

    @Headers({"Wrap-Shipping-Contacts: true", "Account-Type-Supported: true"})
    @GET("rev-payment/shipping-contacts")
    Object getWrappedShippingContacts(@NotNull Continuation<? super q0> continuation);

    @Headers({"Serialise-Unified-Reason: true"})
    @oql.a
    @POST("rev-payment/token/{orderToken}/initiate-now")
    Object initiatePayment(@Path("orderToken") @NotNull String str, @Body @NotNull n nVar, @Header("Accept") @NotNull String str2, @Header("X-Idempotency-Key") String str3, @NotNull Continuation<? super e0> continuation);

    @PUT("rev-payment/user-details")
    Object saveEmail(@Body @NotNull h0 h0Var, @NotNull Continuation<? super Response<Unit>> continuation);

    @PUT("rev-payment/token/{orderToken}/delivery-method")
    Object setDeliveryMethod(@Path("orderToken") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super i0> continuation);

    @PATCH("rev-payment/shipping-contacts/{id}")
    Object updateShippingContact(@Path("id") @NotNull String str, @Body @NotNull k0 k0Var, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/revpay/user-preferences")
    Object updateUserPreferences(@Body @NotNull h7c.a aVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("rev-payment/token/{orderToken}/shipping-contact")
    Object validateShippingContact(@Path("orderToken") @NotNull String str, @Body @NotNull j0 j0Var, @NotNull Continuation<? super l0> continuation);
}
