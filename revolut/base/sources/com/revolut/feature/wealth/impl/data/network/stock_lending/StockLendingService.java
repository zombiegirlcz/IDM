package com.revolut.feature.wealth.impl.data.network.stock_lending;

import efm.d0;
import ib.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import q90.i;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/stock_lending/StockLendingService;", "", "Lefm/b;", "disableStockLending", "()Lefm/b;", "", "portfolioId", "Lefm/d0;", "Lq90/i;", "getStockLendingFlow", "(Ljava/lang/String;)Lefm/d0;", b.Flow, "postStockLendingFlow", "(Ljava/lang/String;Lq90/i;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StockLendingService {
    @POST("trading/users/current/portfolio/stock-lending/disable")
    @NotNull
    efm.b disableStockLending();

    @GET("trading/portfolios/{portfolioId}/stock-lending/onboarding-flow")
    @NotNull
    d0<i> getStockLendingFlow(@Path("portfolioId") @NotNull String portfolioId);

    @POST("trading/portfolios/{portfolioId}/stock-lending/onboarding-flow")
    @NotNull
    d0<i> postStockLendingFlow(@Path("portfolioId") @NotNull String portfolioId, @Body @NotNull i flow);
}
