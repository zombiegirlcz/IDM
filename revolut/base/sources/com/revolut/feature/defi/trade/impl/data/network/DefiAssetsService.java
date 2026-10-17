package com.revolut.feature.defi.trade.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import t66.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\\\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/trade/impl/data/network/DefiAssetsService;", "", "", "offset", "limit", "", "query", "sort", "fiatCurrency", "externalAssetIds", "chain", "Lt66/f;", "getAssets", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_defi_trade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DefiAssetsService {
    @GET("crypto/defi/assets")
    Object getAssets(@Query("offset") int i, @Query("limit") int i2, @Query("query") String str, @NotNull @Query("sort") String str2, @NotNull @Query("fiatCurrency") String str3, @Query("externalAssetIds") String str4, @Query("chain") String str5, @NotNull Continuation<? super f> continuation);
}
