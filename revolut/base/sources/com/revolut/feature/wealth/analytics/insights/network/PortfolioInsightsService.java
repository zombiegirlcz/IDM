package com.revolut.feature.wealth.analytics.insights.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rwg.f;
import rwg.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/analytics/insights/network/PortfolioInsightsService;", "", "Lrwg/x;", "getPortfolioInsights", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "indicatorKey", "Lrwg/f;", "getPortfolioInsightsAssetIndicator", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionKey", "getPortfolioInsightsCollectionIndicator", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioInsightsService {
    @GET("/portfolio-insights")
    Object getPortfolioInsights(@NotNull Continuation<? super x> continuation);

    @GET("/portfolio-insights/assets/{indicatorKey}")
    Object getPortfolioInsightsAssetIndicator(@Path("indicatorKey") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("/portfolio-insights/collections/{collectionKey}")
    Object getPortfolioInsightsCollectionIndicator(@Path("collectionKey") @NotNull String str, @NotNull Continuation<Object> continuation);
}
