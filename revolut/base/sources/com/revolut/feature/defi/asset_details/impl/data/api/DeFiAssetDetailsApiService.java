package com.revolut.feature.defi.asset_details.impl.data.api;

import h26.f;
import h26.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\t\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J8\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/asset_details/impl/data/api/DeFiAssetDetailsApiService;", "", "", "assetId", "fiatCurrency", "Lh26/i;", "getAssetDetails", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "excludeAssetId", "getDefaultAsset", "range", "type", "Lh26/f;", "getAssetChart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_defi_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiAssetDetailsApiService {
    @GET("crypto/defi/assets/charts/{assetId}/{fiatCurrency}")
    Object getAssetChart(@Path("assetId") @NotNull String str, @Path("fiatCurrency") @NotNull String str2, @NotNull @Query("range") String str3, @NotNull @Query("type") String str4, @NotNull Continuation<? super f> continuation);

    @GET("crypto/defi/assets/{assetId}")
    Object getAssetDetails(@Path("assetId") @NotNull String str, @NotNull @Query("fiatCurrency") String str2, @NotNull Continuation<? super i> continuation);

    @GET("crypto/defi/assets/default")
    Object getDefaultAsset(@Query("excludeAssetId") String str, @NotNull @Query("fiatCurrency") String str2, @NotNull Continuation<? super i> continuation);
}
