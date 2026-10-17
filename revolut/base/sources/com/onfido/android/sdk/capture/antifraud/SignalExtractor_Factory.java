package com.onfido.android.sdk.capture.antifraud;

import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SignalExtractor_Factory implements b {
    private final Provider signalFactoryProvider;

    public SignalExtractor_Factory(Provider provider) {
        this.signalFactoryProvider = provider;
    }

    public static SignalExtractor_Factory create(Provider provider) {
        return new SignalExtractor_Factory(provider);
    }

    public static SignalExtractor newInstance(SignalFactory signalFactory) {
        return new SignalExtractor(signalFactory);
    }

    @Override // com.onfido.javax.inject.Provider
    public SignalExtractor get() {
        return newInstance((SignalFactory) this.signalFactoryProvider.get());
    }
}
