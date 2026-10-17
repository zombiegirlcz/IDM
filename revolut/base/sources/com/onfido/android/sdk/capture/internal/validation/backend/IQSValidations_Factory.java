package com.onfido.android.sdk.capture.internal.validation.backend;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class IQSValidations_Factory implements b {
    private final Provider nativeDetectorProvider;
    private final Provider onfidoRemoteConfigProvider;

    public IQSValidations_Factory(Provider provider, Provider provider2) {
        this.nativeDetectorProvider = provider;
        this.onfidoRemoteConfigProvider = provider2;
    }

    public static IQSValidations_Factory create(Provider provider, Provider provider2) {
        return new IQSValidations_Factory(provider, provider2);
    }

    public static IQSValidations newInstance(NativeDetector nativeDetector, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new IQSValidations(nativeDetector, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public IQSValidations get() {
        return newInstance((NativeDetector) this.nativeDetectorProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
