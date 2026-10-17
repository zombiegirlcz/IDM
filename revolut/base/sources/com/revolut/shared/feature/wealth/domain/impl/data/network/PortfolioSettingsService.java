package com.revolut.shared.feature.wealth.domain.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qdl.a;
import qdl.c;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/PortfolioSettingsService;", "", "", "portfolioId", "Lefm/d0;", "Lqdl/a;", "getSettings", "(Ljava/lang/String;)Lefm/d0;", "Lqdl/c;", "enabled", "setBuyBlock", "(Ljava/lang/String;Lqdl/c;)Lefm/d0;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioSettingsService {
    @GET("trading/portfolios/{portfolioId}/settings")
    @NotNull
    d0<a> getSettings(@Path("portfolioId") @NotNull String portfolioId);

    @POST("trading/portfolios/{portfolioId}/settings/buy-block")
    @NotNull
    d0<a> setBuyBlock(@Path("portfolioId") @NotNull String portfolioId, @Body @NotNull c enabled);
}
