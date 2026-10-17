package com.onfido.android.sdk.capture.internal.util.environment;

import android.content.Context;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class EnvironmentIntegrityCheckerImpl_Factory implements b {
    private final Provider contextProvider;
    private final Provider nativeDetectorProvider;
    private final Provider remoteConfigProvider;

    public EnvironmentIntegrityCheckerImpl_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.contextProvider = provider;
        this.nativeDetectorProvider = provider2;
        this.remoteConfigProvider = provider3;
    }

    public static EnvironmentIntegrityCheckerImpl_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new EnvironmentIntegrityCheckerImpl_Factory(provider, provider2, provider3);
    }

    public static EnvironmentIntegrityCheckerImpl newInstance(Context context, NativeDetector nativeDetector, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new EnvironmentIntegrityCheckerImpl(context, nativeDetector, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public EnvironmentIntegrityCheckerImpl get() {
        return newInstance((Context) this.contextProvider.get(), (NativeDetector) this.nativeDetectorProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get());
    }
}
