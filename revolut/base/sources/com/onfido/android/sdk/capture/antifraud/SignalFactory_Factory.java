package com.onfido.android.sdk.capture.antifraud;

import com.onfido.android.sdk.capture.utils.UuidProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SignalFactory_Factory implements b {
    private final Provider uuidProvider;

    public SignalFactory_Factory(Provider provider) {
        this.uuidProvider = provider;
    }

    public static SignalFactory_Factory create(Provider provider) {
        return new SignalFactory_Factory(provider);
    }

    public static SignalFactory newInstance(UuidProvider uuidProvider) {
        return new SignalFactory(uuidProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public SignalFactory get() {
        return newInstance((UuidProvider) this.uuidProvider.get());
    }
}
