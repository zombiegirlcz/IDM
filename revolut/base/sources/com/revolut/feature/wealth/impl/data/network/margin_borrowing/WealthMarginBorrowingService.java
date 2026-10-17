package com.revolut.feature.wealth.impl.data.network.margin_borrowing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import t7h.c;
import t7h.n;
import t7h.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0007¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/margin_borrowing/WealthMarginBorrowingService;", "", "", "portfolioId", "currencyCode", "Lt7h/c;", "getMarginBorrowingInterest", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instrumentRef", "Lt7h/n;", "getInstrumentBorrowingLimit", "Lt7h/r;", "getMarginStatus", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthMarginBorrowingService {
    @GET("trading-access/portfolios/{portfolioId}/margin/{instrumentRef}")
    Object getInstrumentBorrowingLimit(@Path("portfolioId") @NotNull String str, @Path("instrumentRef") @NotNull String str2, @NotNull Continuation<? super n> continuation);

    @GET("trading-access/portfolios/{portfolioId}/margin/interest/{currency}")
    Object getMarginBorrowingInterest(@Path("portfolioId") @NotNull String str, @Path("currency") @NotNull String str2, @NotNull Continuation<? super c> continuation);

    @GET("/trading-access/portfolios/{portfolioId}/margin/status/{currency}")
    Object getMarginStatus(@Path("portfolioId") @NotNull String str, @Path("currency") @NotNull String str2, @NotNull Continuation<? super r> continuation);
}
