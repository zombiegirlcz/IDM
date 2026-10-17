package com.onfido.android.sdk.capture.common.cryptography;

import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class Cryptography_Factory implements b {
    private final Provider helperProvider;

    public Cryptography_Factory(Provider provider) {
        this.helperProvider = provider;
    }

    public static Cryptography_Factory create(Provider provider) {
        return new Cryptography_Factory(provider);
    }

    public static Cryptography newInstance(CryptographyHelper cryptographyHelper) {
        return new Cryptography(cryptographyHelper);
    }

    @Override // com.onfido.javax.inject.Provider
    public Cryptography get() {
        return newInstance((CryptographyHelper) this.helperProvider.get());
    }
}
