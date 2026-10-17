package com.revolut.feature.crypto.withdraw.api.models;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final CryptoAddressHostingCheckResult.Found a(CryptoAddressHostingCheckResult cryptoAddressHostingCheckResult) {
        if (cryptoAddressHostingCheckResult instanceof CryptoAddressHostingCheckResult.Found) {
            return (CryptoAddressHostingCheckResult.Found) cryptoAddressHostingCheckResult;
        }
        return null;
    }
}
