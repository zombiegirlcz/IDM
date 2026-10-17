package com.revolut.feature.wealth.impl.data.network.portfolio_metrics;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import x7h.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/portfolio_metrics/PortfolioMetricsService;", "", "", "portfolioId", "Lefm/d0;", "Lx7h/a;", "getPortfolioMetrics", "(Ljava/lang/String;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioMetricsService {
    @GET("/trading/portfolios/{portfolioId}/metrics")
    @NotNull
    d0<a> getPortfolioMetrics(@Path("portfolioId") @NotNull String portfolioId);
}
