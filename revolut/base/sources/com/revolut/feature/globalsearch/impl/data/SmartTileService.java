package com.revolut.feature.globalsearch.impl.data;

import d97.a;
import d97.b;
import d97.c;
import d97.e;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/globalsearch/impl/data/SmartTileService;", "", "", "query", "Lefm/d0;", "Ld97/c;", "extractExchangeData", "(Ljava/lang/String;)Lefm/d0;", "Ld97/e;", "extractSendMoneyData", "Ld97/a;", "extractAssetViewData", "Ld97/b;", "extractCryptoAssetViewData", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SmartTileService {
    @GET("/global-search/extractor/asset-view")
    @NotNull
    d0<a> extractAssetViewData(@NotNull @Query("query") String query);

    @GET("/global-search/extractor/crypto-asset-view")
    @NotNull
    d0<b> extractCryptoAssetViewData(@NotNull @Query("query") String query);

    @GET("/global-search/extractor/exchange")
    @NotNull
    d0<c> extractExchangeData(@NotNull @Query("query") String query);

    @GET("/global-search/extractor/payment")
    @NotNull
    d0<e> extractSendMoneyData(@NotNull @Query("query") String query);
}
