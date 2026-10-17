package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lfj.t;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimSubscriptionsRefundQuoteService;", "", "", "subscriptionId", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getSubscriptionsRefundQuote", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/t;", "request", "cancelSubscription", "(Ljava/lang/String;Llfj/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSubscriptionsRefundQuoteService {
    @POST("/connect/subscriptions/{subscriptionId}/cancel")
    Object cancelSubscription(@Path("subscriptionId") @NotNull String str, @Body @NotNull t tVar, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/connect/subscriptions-refund-quote")
    Object getSubscriptionsRefundQuote(@Query("subscriptionId") String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);
}
