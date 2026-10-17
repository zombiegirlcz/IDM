package com.revolut.feature.crypto_investments.impl.data.network;

import efm.d0;
import gu5.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto_investments/impl/data/network/CryptoPositionsService;", "", "", "userId", "baseCurrency", "Lefm/d0;", "Lgu5/a;", "getCryptoPositions", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "getCommoditiesPositions", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoPositionsService {
    @GET("/trading/users/{userId}/positions/commodity")
    @NotNull
    d0<a> getCommoditiesPositions(@Path("userId") @NotNull String userId, @Query("baseCurrency") String baseCurrency);

    @GET("/trading/users/{userId}/positions/crypto")
    @NotNull
    d0<a> getCryptoPositions(@Path("userId") @NotNull String userId, @Query("baseCurrency") String baseCurrency);
}
