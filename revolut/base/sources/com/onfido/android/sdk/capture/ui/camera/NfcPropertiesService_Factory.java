package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcPropertiesService_Factory implements el.b {
    private final Provider apiServiceProvider;

    public NfcPropertiesService_Factory(Provider provider) {
        this.apiServiceProvider = provider;
    }

    public static NfcPropertiesService_Factory create(Provider provider) {
        return new NfcPropertiesService_Factory(provider);
    }

    public static NfcPropertiesService newInstance(OnfidoApiService onfidoApiService) {
        return new NfcPropertiesService(onfidoApiService);
    }

    @Override // com.onfido.javax.inject.Provider
    public NfcPropertiesService get() {
        return newInstance((OnfidoApiService) this.apiServiceProvider.get());
    }
}
