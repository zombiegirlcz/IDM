package com.revolut.feature.wealth.impl.data.network.portfolio_performance;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import y7h.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/portfolio_performance/PortfolioPerformanceService;", "", "", "portfolioId", "Ly7h/a;", "range", "Lefm/d0;", "getPortfolioPerformance", "(Ljava/lang/String;Ly7h/a;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioPerformanceService {
    @GET("trading/portfolios/{portfolioId}/performance/{range}")
    @NotNull
    d0<Object> getPortfolioPerformance(@Path("portfolioId") @NotNull String portfolioId, @Path("range") @NotNull a range);
}
