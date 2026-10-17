package com.revolut.feature.defi.earn.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\tJ$\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\t¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/earn/impl/data/network/DeFiEarnService;", "", "", "getProducts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "accountId", "fiatCurrency", "getPositions", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardsSummary", "productId", "getProductRewards", "feature_defi_earn_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiEarnService {
    @GET("crypto/defi/earn/positions")
    Object getPositions(@NotNull @Query("accountId") String str, @NotNull @Query("fiatCurrency") String str2, @NotNull Continuation<? super List<Object>> continuation);

    @GET("crypto/defi/earn/products/{productId}/rewards")
    Object getProductRewards(@Path("productId") @NotNull String str, @NotNull @Query("accountId") String str2, @NotNull Continuation<Object> continuation);

    @GET("crypto/defi/earn/products")
    Object getProducts(@NotNull Continuation<? super List<Object>> continuation);

    @GET("crypto/defi/earn/rewards/summary")
    Object getRewardsSummary(@NotNull @Query("accountId") String str, @NotNull @Query("fiatCurrency") String str2, @NotNull Continuation<Object> continuation);
}
