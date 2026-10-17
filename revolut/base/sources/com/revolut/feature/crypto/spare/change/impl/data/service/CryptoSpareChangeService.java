package com.revolut.feature.crypto.spare.change.impl.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ll5.a;
import ll5.b;
import ll5.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/spare/change/impl/data/service/CryptoSpareChangeService;", "", "Lll5/d;", "request", "Lretrofit2/Response;", "Lll5/b;", "updateCryptoSpareChange", "(Lll5/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lll5/a;", "createCryptoSpareChange", "(Lll5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "removeCryptoSpareChange", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_crypto_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSpareChangeService {
    @POST("/crypto/auto-invest")
    Object createCryptoSpareChange(@Body @NotNull a aVar, @NotNull Continuation<? super Response<b>> continuation);

    @DELETE("/crypto/auto-invest")
    Object removeCryptoSpareChange(@NotNull Continuation<? super Response<Unit>> continuation);

    @PUT("/crypto/auto-invest")
    Object updateCryptoSpareChange(@Body @NotNull d dVar, @NotNull Continuation<? super Response<b>> continuation);
}
