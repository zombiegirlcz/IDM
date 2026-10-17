package com.revolut.feature.retail.cfd.impl.network;

import d3b.d;
import d3b.g;
import e4l.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Jl\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/network/CfdService;", "", "", "orderType", "side", "marginRate", "counterCurrency", "assetCurrency", "assetQuantity", "openLongQty", "openShortQty", "targetRate", "Ld3b/d;", "getMarginQuote", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "portfolioId", "Ld3b/g;", "getUnrealisedPerformance", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "positionId", "Le4l/b;", "getExitStrategiesForPosition", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdService {
    @GET("trading/portfolios/{portfolioId}/positions/{positionId}/exit-strategies")
    Object getExitStrategiesForPosition(@Path("portfolioId") @NotNull String str, @Path("positionId") @NotNull String str2, @NotNull Continuation<? super b> continuation);

    @GET("/trading/margin/quote")
    Object getMarginQuote(@NotNull @Query("orderType") String str, @NotNull @Query("side") String str2, @NotNull @Query("marginRate") String str3, @NotNull @Query("counterCurrency") String str4, @NotNull @Query("assetCurrency") String str5, @NotNull @Query("assetQuantity") String str6, @NotNull @Query("openLongQty") String str7, @NotNull @Query("openShortQty") String str8, @Query("targetRate") String str9, @NotNull Continuation<? super d> continuation);

    @GET("/trading-access/portfolios/{portfolioId}/unrealised-performance")
    Object getUnrealisedPerformance(@Path("portfolioId") @NotNull String str, @NotNull Continuation<? super g> continuation);
}
