package com.onfido.android.sdk.capture.core;

import com.onfido.android.sdk.FlowConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoViewModel_Factory implements b {
    private final Provider flowConfigProvider;

    public OnfidoViewModel_Factory(Provider provider) {
        this.flowConfigProvider = provider;
    }

    public static OnfidoViewModel_Factory create(Provider provider) {
        return new OnfidoViewModel_Factory(provider);
    }

    public static OnfidoViewModel newInstance(FlowConfig flowConfig) {
        return new OnfidoViewModel(flowConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoViewModel get() {
        return newInstance((FlowConfig) this.flowConfigProvider.get());
    }
}
