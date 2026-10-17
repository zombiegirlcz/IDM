package com.onfido.android.sdk.capture.detector.barcode;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class BarcodeDetectorGoogle_Factory implements b {
    private final Provider barcodeDetectorProvider;
    private final Provider remoteConfigProvider;

    public BarcodeDetectorGoogle_Factory(Provider provider, Provider provider2) {
        this.remoteConfigProvider = provider;
        this.barcodeDetectorProvider = provider2;
    }

    public static BarcodeDetectorGoogle_Factory create(Provider provider, Provider provider2) {
        return new BarcodeDetectorGoogle_Factory(provider, provider2);
    }

    public static BarcodeDetectorGoogle newInstance(OnfidoRemoteConfig onfidoRemoteConfig, Provider provider) {
        return new BarcodeDetectorGoogle(onfidoRemoteConfig, provider);
    }

    @Override // com.onfido.javax.inject.Provider
    public BarcodeDetectorGoogle get() {
        return newInstance((OnfidoRemoteConfig) this.remoteConfigProvider.get(), this.barcodeDetectorProvider);
    }
}
