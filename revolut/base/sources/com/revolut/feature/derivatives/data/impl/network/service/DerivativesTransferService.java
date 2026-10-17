package com.revolut.feature.derivatives.data.impl.network.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import r76.f;
import r76.i;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/derivatives/data/impl/network/service/DerivativesTransferService;", "", "", "idempotencyKey", "Lr76/f;", "body", "deposit", "(Ljava/lang/String;Lr76/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr76/i;", "withdraw", "(Ljava/lang/String;Lr76/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_derivatives_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DerivativesTransferService {
    @PUT("crypto-exchange/transfers/derivatives/deposit")
    Object deposit(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<Object> continuation);

    @PUT("crypto-exchange/transfers/derivatives/withdraw")
    Object withdraw(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<Object> continuation);
}
