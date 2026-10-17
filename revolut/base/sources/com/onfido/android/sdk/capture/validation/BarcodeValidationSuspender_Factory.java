package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class BarcodeValidationSuspender_Factory implements el.b {
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;

    public BarcodeValidationSuspender_Factory(Provider provider, Provider provider2) {
        this.remoteConfigProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static BarcodeValidationSuspender_Factory create(Provider provider, Provider provider2) {
        return new BarcodeValidationSuspender_Factory(provider, provider2);
    }

    public static BarcodeValidationSuspender newInstance(OnfidoRemoteConfig onfidoRemoteConfig, SchedulersProvider schedulersProvider) {
        return new BarcodeValidationSuspender(onfidoRemoteConfig, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public BarcodeValidationSuspender get() {
        return newInstance((OnfidoRemoteConfig) this.remoteConfigProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
