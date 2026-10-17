package com.revolut.feature.shared.autoinvest.impl.network;

import d6d.h;
import d6d.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\bJ$\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/autoinvest/impl/network/PortfolioAutoInvestService;", "", "", "portfolioId", "Ld6d/i;", "createSpareChangeRequest", "", "createSpareChange", "(Ljava/lang/String;Ld6d/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSpareChange", "Ld6d/h;", "migrateSpareChange", "(Ljava/lang/String;Ld6d/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_autoinvest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioAutoInvestService {
    @POST("trading/portfolios/{portfolioId}/auto-invest")
    Object createSpareChange(@Path("portfolioId") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @PATCH("trading/portfolios/{portfolioId}/auto-invest")
    Object migrateSpareChange(@Path("portfolioId") @NotNull String str, @Body @NotNull h hVar, @NotNull Continuation<? super Unit> continuation);

    @PATCH("trading/portfolios/{portfolioId}/auto-invest")
    Object updateSpareChange(@Path("portfolioId") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);
}
