package com.revolut.shared.feature.wealth.domain.impl.data.network;

import efm.d0;
import fdl.c3;
import fdl.d3;
import fdl.e1;
import fdl.g3;
import fdl.h3;
import fdl.l;
import fdl.n;
import hdl.e;
import ib.b;
import java.util.List;
import jj0.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mdl.c;
import org.jetbrains.annotations.NotNull;
import q90.i;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u000eH'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0007J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001e\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010%\u001a\u00020$2\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u001d\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010&J.\u0010+\u001a\u00020*2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'2\b\b\u0001\u0010)\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010,J-\u0010/\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b/\u00100J%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b3\u0010\u0007¨\u00064À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/PortfolioService;", "", "", "portfolioId", "Lefm/d0;", "Lmdl/c;", "getPortfolioById", "(Ljava/lang/String;)Lefm/d0;", "holdingId", "Lhdl/e;", "getHolding", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lfdl/e1;", "investValue", "Lefm/b;", "buy", "(Ljava/lang/String;Ljava/lang/String;Lfdl/e1;)Lefm/b;", "sell", "Lfdl/n;", "getBrokerageAccountInformation", "disableStockLending", "()Lefm/b;", "Lq90/i;", "getStockLendingFlow", b.Flow, "postStockLendingFlow", "(Ljava/lang/String;Lq90/i;)Lefm/d0;", "Lfdl/c3;", "topUpRequest", "idempotencyKey", "topUpPortfolio", "(Ljava/lang/String;Lfdl/c3;Ljava/lang/String;)Lefm/b;", "sourcePortfolioId", "sourceHoldingId", "Lfdl/d3;", "transferToPortfolioRequestDto", "", "transferToPortfolio", "(Ljava/lang/String;Ljava/lang/String;Lfdl/d3;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "amount", "currency", "Lfdl/g3;", "getWithdrawalQuote", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfdl/h3;", "withdrawalRequest", "requestWithdrawal", "(Ljava/lang/String;Lfdl/h3;Ljava/lang/String;)Lefm/b;", "", "Lfdl/l;", "getBlockedForWithdrawal", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioService {
    @POST("trading-access/portfolios/{portfolioId}/holdings/{holdingId}/buy")
    @NotNull
    efm.b buy(@Path("portfolioId") @NotNull String portfolioId, @Path("holdingId") @NotNull String holdingId, @Body @NotNull e1 investValue);

    @POST("trading/users/current/portfolio/stock-lending/disable")
    @NotNull
    efm.b disableStockLending();

    @GET("trading-access/portfolios/{portfolioId}/blocked-for-withdrawal")
    @NotNull
    d0<List<l>> getBlockedForWithdrawal(@Path("portfolioId") @NotNull String portfolioId);

    @GET("trading/portfolios/{portfolioId}/brokerage-holdings")
    @NotNull
    d0<n> getBrokerageAccountInformation(@Path("portfolioId") @NotNull String portfolioId);

    @GET("trading-access/portfolios/{portfolioId}/holdings/{holdingId}")
    @NotNull
    d0<e> getHolding(@Path("portfolioId") @NotNull String portfolioId, @Path("holdingId") @NotNull String holdingId);

    @d(tokenId = "Widget")
    @GET("trading-access/portfolios/{portfolioId}")
    @NotNull
    d0<c> getPortfolioById(@Path("portfolioId") @NotNull String portfolioId);

    @GET("trading/portfolios/{portfolioId}/stock-lending/onboarding-flow")
    @NotNull
    d0<i> getStockLendingFlow(@Path("portfolioId") @NotNull String portfolioId);

    @GET("trading/portfolios/{portfolioId}/withdrawal/quote")
    Object getWithdrawalQuote(@Path("portfolioId") @NotNull String str, @Query("amount") long j2, @NotNull @Query("currency") String str2, @NotNull Continuation<? super g3> continuation);

    @POST("trading/portfolios/{portfolioId}/stock-lending/onboarding-flow")
    @NotNull
    d0<i> postStockLendingFlow(@Path("portfolioId") @NotNull String portfolioId, @Body @NotNull i flow);

    @POST("/trading-access/portfolios/{portfolioId}/request-withdrawal")
    @NotNull
    efm.b requestWithdrawal(@Path("portfolioId") @NotNull String portfolioId, @Body @NotNull h3 withdrawalRequest, @Header("X-Idempotency-Key") @NotNull String idempotencyKey);

    @POST("trading-access/portfolios/{portfolioId}/holdings/{holdingId}/sell")
    @NotNull
    efm.b sell(@Path("portfolioId") @NotNull String portfolioId, @Path("holdingId") @NotNull String holdingId, @Body @NotNull e1 investValue);

    @POST("trading-access/portfolios/{portfolioId}/topup")
    @NotNull
    efm.b topUpPortfolio(@Path("portfolioId") @NotNull String portfolioId, @Body @NotNull c3 topUpRequest, @Header("X-Idempotency-Key") @NotNull String idempotencyKey);

    @POST("trading-access/portfolios/{sourcePortfolioId}/holdings/{sourceHoldingId}/transfer")
    Object transferToPortfolio(@Path("sourcePortfolioId") @NotNull String str, @Path("sourceHoldingId") @NotNull String str2, @Body @NotNull d3 d3Var, @Header("X-Idempotency-Key") @NotNull String str3, @NotNull Continuation<? super Unit> continuation);
}
