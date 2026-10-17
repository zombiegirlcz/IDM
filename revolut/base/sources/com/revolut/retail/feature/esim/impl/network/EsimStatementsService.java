package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJT\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0010JF\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0012J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\b¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimStatementsService;", "", "getSubscriptionStatement", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "idempotencyKey", "", "subscriptionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionCheckoutStatement", "mobilePlanId", "phoneNumberId", "contractDate", "", "contractVersion", "offerType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionPhoneNumberCheckoutStatement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionInvoiceStatement", "invoiceId", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimStatementsService {
    @GET("/connect/subscription-checkout-statement")
    Object getSubscriptionCheckoutStatement(@Header("X-Idempotency-Key") @NotNull String str, @NotNull @Query("mobilePlanId") String str2, @Query("phoneNumberId") String str3, @Query("contractDate") long j2, @NotNull @Query("contractVersion") String str4, @Query("offerType") String str5, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/connect/subscriptions/{subscriptionId}/invoices/{invoiceId}/document")
    Object getSubscriptionInvoiceStatement(@Path("subscriptionId") @NotNull String str, @Path("invoiceId") @NotNull String str2, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/connect/phone-number-checkout-statement")
    Object getSubscriptionPhoneNumberCheckoutStatement(@Header("X-Idempotency-Key") @NotNull String str, @NotNull @Query("subscriptionId") String str2, @NotNull @Query("phoneNumberId") String str3, @Query("contractDate") long j2, @NotNull @Query("contractVersion") String str4, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/connect/subscriptions/{subscriptionId}/statement")
    Object getSubscriptionStatement(@Header("X-Idempotency-Key") @NotNull String str, @Path("subscriptionId") @NotNull String str2, @NotNull Continuation<? super Response<ResponseBody>> continuation);
}
