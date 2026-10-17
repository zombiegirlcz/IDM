package com.revolut.feature.crypto.tfr.validation.impl.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import sm5.f;
import sm5.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/data/network/CryptoTfrService;", "", "", "id", "Lsm5/f;", "getCounterparty", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsm5/i;", "dto", "", "updateCounterpartyOwnership", "(Ljava/lang/String;Lsm5/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoTfrService {
    @GET("crypto/counterparties/{id}")
    Object getCounterparty(@Path("id") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @PATCH("/crypto/counterparties/{id}/ownership")
    Object updateCounterpartyOwnership(@Path("id") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);
}
