package com.revolut.feature.crypto.account.impl.service;

import com.revolut.feature.crypto.account.impl.model.CryptoAccountDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/account/impl/service/CryptoAccountService;", "", "getCryptoAccount", "Lcom/revolut/feature/crypto/account/impl/model/CryptoAccountDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_crypto_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoAccountService {
    @GET("/crypto/account")
    Object getCryptoAccount(@NotNull Continuation<? super CryptoAccountDto> continuation);
}
