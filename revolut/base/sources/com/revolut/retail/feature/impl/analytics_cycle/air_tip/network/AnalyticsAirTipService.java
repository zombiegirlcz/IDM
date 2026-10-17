package com.revolut.retail.feature.impl.analytics_cycle.air_tip.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import spj.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/analytics_cycle/air_tip/network/AnalyticsAirTipService;", "", "Lretrofit2/Response;", "Lspj/a;", "getCurrentAirTip", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "airTipId", "", "registerInteraction", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsAirTipService {
    @GET("/analytics/air-tips/current")
    Object getCurrentAirTip(@NotNull Continuation<? super Response<a>> continuation);

    @POST("/analytics/air-tips/{airTipId}/interactions")
    Object registerInteraction(@Path("airTipId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
