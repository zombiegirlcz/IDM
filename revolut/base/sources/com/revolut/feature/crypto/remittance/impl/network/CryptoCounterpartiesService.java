package com.revolut.feature.crypto.remittance.impl.network;

import ck5.f;
import cl5.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/remittance/impl/network/CryptoCounterpartiesService;", "", "Lck5/f;", "body", "Lcl5/a;", "createPreApprovedCounterparty", "(Lck5/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoCounterpartiesService {
    @POST("/crypto/counterparties/preapproved")
    Object createPreApprovedCounterparty(@Body @NotNull f fVar, @NotNull Continuation<? super a> continuation);
}
