package com.revolut.feature.retail.advanced_charts.impl.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import p0b.a;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001JL\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJB\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/data/AdvancedChartsService;", "", "", "ref", "", "from", "to", "interval", "", "countBack", "tradingHours", "Lp0b/a;", "getStocksChartHistory", "(Ljava/lang/String;JJLjava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "symbol", "getCryptoSymbolChartHistory", "(Ljava/lang/String;JJLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRevolutXSymbolChartHistory", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AdvancedChartsService {
    @GET("currencies/{symbol}/chart/history")
    Object getCryptoSymbolChartHistory(@Path("symbol") @NotNull String str, @Query("from") long j2, @Query("to") long j3, @NotNull @Query("interval") String str2, @Query("countBack") int i, @NotNull Continuation<? super a> continuation);

    @GET("crypto-exchange/currencies/{symbol}/chart/history")
    Object getRevolutXSymbolChartHistory(@Path("symbol") @NotNull String str, @Query("from") long j2, @Query("to") long j3, @NotNull @Query("interval") String str2, @Query("countBack") int i, @NotNull Continuation<? super a> continuation);

    @GET("instruments/{ref}/chart/history")
    Object getStocksChartHistory(@Path("ref") @NotNull String str, @Query("from") long j2, @Query("to") long j3, @NotNull @Query("interval") String str2, @Query("countBack") int i, @NotNull @Query("tradingHours") String str3, @NotNull Continuation<? super a> continuation);
}
