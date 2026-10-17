package com.revolut.retail.feature.esim.impl.network;

import kfj.e3;
import kfj.k3;
import kfj.q3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lfj.r;
import lfj.s;
import lfj.u;
import lfj.v;
import lfj.y;
import mfj.a;
import mfj.l;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\t2\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\r\u001a\u00020\u0007H§@¢\u0006\u0004\b \u0010\u0016J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\t2\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimSubscriptionsService;", "", "Lmfj/l;", "getSubscriptions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/y;", "request", "", "idempotencyKey", "Lretrofit2/Response;", "Lkfj/q3;", "postSubscriptions", "(Llfj/y;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscriptionId", "Llfj/r;", "postResubscription", "(Ljava/lang/String;Llfj/r;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/u;", "Lkfj/k3;", "postSubscriptionChanges", "(Llfj/u;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscription", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/s;", "Lkfj/e3;", "patchSubscriptionAutoRenewal", "(Ljava/lang/String;Llfj/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/v;", "Lokhttp3/ResponseBody;", "patchSubscriptionPaymentMethod", "(Ljava/lang/String;Llfj/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmfj/a;", "getSubscriptionCreationOrder", "", "activateSubscription", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSubscriptionsService {
    @POST("/connect/subscriptions/{subscriptionId}/activate")
    Object activateSubscription(@Path("subscriptionId") @NotNull String str, @Header("X-Idempotency-Key") @NotNull String str2, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("/connect/subscriptions/{subscriptionId}")
    Object getSubscription(@Path("subscriptionId") @NotNull String str, @NotNull Continuation<? super q3> continuation);

    @GET("/connect/subscriptions/{subscriptionId}/creation-order")
    Object getSubscriptionCreationOrder(@Path("subscriptionId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/connect/subscriptions")
    Object getSubscriptions(@NotNull Continuation<? super l> continuation);

    @PATCH("/connect/subscriptions/{subscriptionId}/auto-renewal")
    Object patchSubscriptionAutoRenewal(@Path("subscriptionId") @NotNull String str, @Body @NotNull s sVar, @NotNull Continuation<? super Response<e3>> continuation);

    @PATCH("/connect/subscriptions/{subscriptionId}/pending-invoice")
    Object patchSubscriptionPaymentMethod(@Path("subscriptionId") @NotNull String str, @Body @NotNull v vVar, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("/connect/subscriptions/{subscriptionId}/re-subscribe")
    Object postResubscription(@Path("subscriptionId") @NotNull String str, @Body @NotNull r rVar, @Header("X-Idempotency-Key") @NotNull String str2, @NotNull Continuation<? super Response<q3>> continuation);

    @POST("/connect/subscription-changes")
    Object postSubscriptionChanges(@Body @NotNull u uVar, @Header("X-Idempotency-Key") @NotNull String str, @NotNull Continuation<? super Response<k3>> continuation);

    @POST("/connect/subscriptions")
    Object postSubscriptions(@Body @NotNull y yVar, @Header("X-Idempotency-Key") @NotNull String str, @NotNull Continuation<? super Response<q3>> continuation);
}
