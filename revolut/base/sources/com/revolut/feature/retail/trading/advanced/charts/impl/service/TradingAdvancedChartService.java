package com.revolut.feature.retail.trading.advanced.charts.impl.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qrb.n;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/trading/advanced/charts/impl/service/TradingAdvancedChartService;", "", "", "symbol", "interval", "Lqrb/n;", "getInstrumentLastChartItem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_trading_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingAdvancedChartService {
    @GET("/instruments/{symbol}/chart/last?")
    Object getInstrumentLastChartItem(@Path("symbol") @NotNull String str, @NotNull @Query("interval") String str2, @NotNull Continuation<? super n> continuation);
}
