package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.validation.BarcodeValidationSuspender;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideBarcodeValidationSuspenderFactory implements b {
    private final SdkModule module;
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;

    public SdkModule_ProvideBarcodeValidationSuspenderFactory(SdkModule sdkModule, Provider provider, Provider provider2) {
        this.module = sdkModule;
        this.remoteConfigProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static SdkModule_ProvideBarcodeValidationSuspenderFactory create(SdkModule sdkModule, Provider provider, Provider provider2) {
        return new SdkModule_ProvideBarcodeValidationSuspenderFactory(sdkModule, provider, provider2);
    }

    public static BarcodeValidationSuspender provideBarcodeValidationSuspender(SdkModule sdkModule, OnfidoRemoteConfig onfidoRemoteConfig, SchedulersProvider schedulersProvider) {
        BarcodeValidationSuspender barcodeValidationSuspenderProvideBarcodeValidationSuspender = sdkModule.provideBarcodeValidationSuspender(onfidoRemoteConfig, schedulersProvider);
        e.g(barcodeValidationSuspenderProvideBarcodeValidationSuspender);
        return barcodeValidationSuspenderProvideBarcodeValidationSuspender;
    }

    @Override // com.onfido.javax.inject.Provider
    public BarcodeValidationSuspender get() {
        return provideBarcodeValidationSuspender(this.module, (OnfidoRemoteConfig) this.remoteConfigProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
