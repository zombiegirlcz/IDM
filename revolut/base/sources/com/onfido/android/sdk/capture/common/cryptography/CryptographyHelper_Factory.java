package com.onfido.android.sdk.capture.common.cryptography;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class CryptographyHelper_Factory implements b {

    public static final class InstanceHolder {
        private static final CryptographyHelper_Factory INSTANCE = new CryptographyHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static CryptographyHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CryptographyHelper newInstance() {
        return new CryptographyHelper();
    }

    @Override // com.onfido.javax.inject.Provider
    public CryptographyHelper get() {
        return newInstance();
    }
}
