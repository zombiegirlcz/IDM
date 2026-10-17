package com.revolut.retail.feature.ratedetails.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rpk.d;
import rpk.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JP\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/impl/network/RatesPlotApiService;", "", "", "ccyPair", "range", "interval", "type", "side", "cutoff", "Lrpk/e;", "getLineChartMidRates", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrpk/d;", "getCandlesticksChartMidRates", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RatesPlotApiService {
    @GET("fx-charts/{ccPair}")
    Object getCandlesticksChartMidRates(@Path("ccPair") @NotNull String str, @NotNull @Query("range") String str2, @NotNull @Query("interval") String str3, @NotNull @Query("type") String str4, @NotNull Continuation<? super d> continuation);

    @GET("fx-charts/{ccPair}")
    Object getLineChartMidRates(@Path("ccPair") @NotNull String str, @NotNull @Query("range") String str2, @NotNull @Query("interval") String str3, @NotNull @Query("type") String str4, @Query("side") String str5, @Query("cutoff") String str6, @NotNull Continuation<? super e> continuation);
}
