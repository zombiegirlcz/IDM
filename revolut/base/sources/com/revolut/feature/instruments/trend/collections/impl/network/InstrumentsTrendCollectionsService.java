package com.revolut.feature.instruments.trend.collections.impl.network;

import ci7.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b`\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0015\u0010\u000fJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0016\u0010\u000fJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0017\u0010\u000fJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0018\u0010\u000fJ\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0019\u0010\u000fJ\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u001a\u0010\u000fJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u001b\u0010\u000fJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u001c\u0010\u000fJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u001d\u0010\u000f¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/impl/network/InstrumentsTrendCollectionsService;", "", "", "timeSpan", "assetType", "securityTypes", "", "Lci7/v;", "getMostTradedCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "securityType", "getPopularFirstTimeBuysCollections", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCfdsPnlDrivers", "getCfdsMostShorted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sort", "sortDirection", "issuerType", "getAllBondsCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIndexEtfs", "getTechnologyEtfs", "getEtnsCryptoExposure", "getEtcsCommodityExposure", "getEtpsLeveraged", "getDividendLeaders", "getRecommendedBuyCollection", "getPreciousMetalsEtcs", "getFreeStocks", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsTrendCollectionsService {
    @GET("/instruments/collections/all-bonds")
    Object getAllBondsCollection(@Query("sort") String str, @Query("sort_direction") String str2, @Query("issuerType") List<String> list, @NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/cfds-most-shorted")
    Object getCfdsMostShorted(@NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/cfds-pnl-drivers")
    Object getCfdsPnlDrivers(@NotNull @Query("timeSpan") String str, @NotNull Continuation<? super List<v>> continuation);

    @GET("trading/instruments/rank/DIV_YLD")
    Object getDividendLeaders(@NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/etcs-commodity-exposure")
    Object getEtcsCommodityExposure(@NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/etns-crypto-exposure")
    Object getEtnsCryptoExposure(@NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/etps-leveraged")
    Object getEtpsLeveraged(@NotNull Continuation<? super List<v>> continuation);

    @GET("trading/free-stocks/instrument-collection")
    Object getFreeStocks(@NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/index-etfs")
    Object getIndexEtfs(@NotNull Continuation<? super List<v>> continuation);

    @GET("instruments/collections/most-traded")
    Object getMostTradedCollection(@NotNull @Query("timeSpan") String str, @NotNull @Query("assetType") String str2, @Query("securityTypes") String str3, @NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/popular-first-time-buys")
    Object getPopularFirstTimeBuysCollections(@Query("securityType") String str, @NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/precious-metals-etcs")
    Object getPreciousMetalsEtcs(@NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/recommended-buy")
    Object getRecommendedBuyCollection(@NotNull Continuation<? super List<v>> continuation);

    @GET("/instruments/collections/etfs-technology")
    Object getTechnologyEtfs(@NotNull Continuation<? super List<v>> continuation);
}
