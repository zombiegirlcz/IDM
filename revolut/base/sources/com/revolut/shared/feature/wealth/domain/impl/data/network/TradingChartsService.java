package com.revolut.shared.feature.wealth.domain.impl.data.network;

import adl.j;
import fdl.e;
import fdl.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0004J8\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ.\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/TradingChartsService;", "", "", "ref", "Ladl/j;", "type", "valueType", "tradingHours", "Lfdl/e;", "getInstrumentHistoricalPricesChart", "(Ljava/lang/String;Ladl/j;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfdl/p;", "getInstrumentCandlestickPricesChart", "(Ljava/lang/String;Ladl/j;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingChartsService {
    @GET("instrument/{ref}/chart/{type}/CANDLESTICK?valueType=PRICE_PRECISE")
    Object getInstrumentCandlestickPricesChart(@Path("ref") @NotNull String str, @Path("type") @NotNull j jVar, @NotNull @Query("tradingHours") String str2, @NotNull Continuation<? super p> continuation);

    @GET("instrument/{ref}/chart/{type}/LINE")
    Object getInstrumentHistoricalPricesChart(@Path("ref") @NotNull String str, @Path("type") @NotNull j jVar, @NotNull @Query("valueType") String str2, @NotNull @Query("tradingHours") String str3, @NotNull Continuation<? super e> continuation);
}
