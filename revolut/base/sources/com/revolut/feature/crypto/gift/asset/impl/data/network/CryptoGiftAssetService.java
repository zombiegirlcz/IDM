package com.revolut.feature.crypto.gift.asset.impl.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pg5.c;
import pg5.i;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/impl/data/network/CryptoGiftAssetService;", "", "Lpg5/i;", "getGiftedAssets", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpg5/c;", "request", "", "claimGiftedAssets", "(Lpg5/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_crypto_gift_asset_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoGiftAssetService {
    @POST("/crypto/gifted-assets/claim")
    Object claimGiftedAssets(@Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/crypto/gifted-assets")
    Object getGiftedAssets(@NotNull Continuation<? super i> continuation);
}
