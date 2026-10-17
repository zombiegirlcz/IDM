package com.revolut.feature.defi.currency.impl.data.network;

import i36.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/currency/impl/data/network/DeFiCurrencyService;", "", "", "externalAssetIds", "", "Li36/c;", "getCurrencies", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_defi_currency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiCurrencyService {
    @GET("crypto/defi/assets/details")
    Object getCurrencies(@Query("externalAssetIds") String str, @NotNull Continuation<? super List<c>> continuation);
}
