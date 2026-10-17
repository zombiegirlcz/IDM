package com.revolut.retail.feature.trading_onboarding.impl.data.network;

import efm.d0;
import ib.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import q90.i;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b`\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ0\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/data/network/BackendFlowOnboardingService;", "", "", "portfolioId", "part", "remediationType", "Lefm/d0;", "Lq90/i;", "getBackendFlowOnboardingPart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "accountId", "toggles", "getBackendFlowAccountOnboardingPart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", b.Flow, "postBackendFlowOnboardingPart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq90/i;)Lefm/d0;", "postBackendFlowAccountOnboardingPart", "(Ljava/lang/String;Ljava/lang/String;Lq90/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOnboardingExtendedHours", "(Ljava/lang/String;)Lefm/d0;", "postOnboardingExtendedHours", "(Ljava/lang/String;Lq90/i;)Lefm/d0;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BackendFlowOnboardingService {
    @GET("/trading-access/accounts/{accountId}/onboarding/{part}")
    Object getBackendFlowAccountOnboardingPart(@Path("accountId") @NotNull String str, @Path("part") @NotNull String str2, @Query("toggles") String str3, @NotNull Continuation<? super i> continuation);

    @GET("/trading-access/portfolios/{portfolioId}/onboarding/flow/{part}")
    @NotNull
    d0<i> getBackendFlowOnboardingPart(@Path("portfolioId") @NotNull String portfolioId, @Path("part") @NotNull String part, @Query("remediationType") String remediationType);

    @GET("/trading/portfolios/{portfolioId}/extended-hours/onboarding-flow")
    @NotNull
    d0<i> getOnboardingExtendedHours(@Path("portfolioId") @NotNull String portfolioId);

    @POST("/trading-access/accounts/{accountId}/onboarding/{part}")
    Object postBackendFlowAccountOnboardingPart(@Path("accountId") @NotNull String str, @Path("part") @NotNull String str2, @Body @NotNull i iVar, @NotNull Continuation<? super i> continuation);

    @POST("/trading-access/portfolios/{portfolioId}/onboarding/flow/{part}")
    @NotNull
    d0<i> postBackendFlowOnboardingPart(@Path("portfolioId") @NotNull String portfolioId, @Path("part") @NotNull String part, @Query("remediationType") String remediationType, @Body @NotNull i flow);

    @POST("/trading/portfolios/{portfolioId}/extended-hours/onboarding-flow")
    @NotNull
    d0<i> postOnboardingExtendedHours(@Path("portfolioId") @NotNull String portfolioId, @Body @NotNull i flow);
}
