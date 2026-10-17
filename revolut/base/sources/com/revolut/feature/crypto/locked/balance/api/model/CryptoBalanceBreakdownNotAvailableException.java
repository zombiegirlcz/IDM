package com.revolut.feature.crypto.locked.balance.api.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/api/model/CryptoBalanceBreakdownNotAvailableException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "feature_crypto_locked_balance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoBalanceBreakdownNotAvailableException extends IllegalStateException {
    public CryptoBalanceBreakdownNotAvailableException() {
        super("Balance breakdown is not available for the requested currency");
    }
}
