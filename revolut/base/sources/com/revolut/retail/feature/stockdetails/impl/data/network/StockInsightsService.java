package com.revolut.retail.feature.stockdetails.impl.data.network;

import java.util.List;
import jrk.r;
import jrk.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import m2l.i;
import m2l.i0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/data/network/StockInsightsService;", "", "", "ref", "Lm2l/r;", "getInsights", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljrk/u;", "getInsightsHistory", "Ljrk/r;", "getIndexMarketSentiment", "Lm2l/i0;", "getTechnicalInsights", "Lm2l/i;", "getAnalystRatings", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StockInsightsService {
    @GET("/trading/instrument/{ref}/analyst-ratings")
    Object getAnalystRatings(@Path("ref") @NotNull String str, @NotNull Continuation<? super i> continuation);

    @GET("/trading/markets/{ref}/sentiment")
    Object getIndexMarketSentiment(@Path("ref") @NotNull String str, @NotNull Continuation<? super r> continuation);

    @GET("/trading/instrument/{ref}/recommendation")
    Object getInsights(@Path("ref") @NotNull String str, @NotNull Continuation<? super m2l.r> continuation);

    @GET("/trading/instrument/{ref}/recommendation/history")
    Object getInsightsHistory(@Path("ref") @NotNull String str, @NotNull Continuation<? super List<u>> continuation);

    @GET("/trading/instrument/{ref}/technicals")
    Object getTechnicalInsights(@Path("ref") @NotNull String str, @NotNull Continuation<? super i0> continuation);
}
