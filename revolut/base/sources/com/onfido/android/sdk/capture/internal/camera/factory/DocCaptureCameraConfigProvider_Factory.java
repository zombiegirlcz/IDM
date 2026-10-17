package com.onfido.android.sdk.capture.internal.camera.factory;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DocCaptureCameraConfigProvider_Factory implements b {
    private final Provider onfidoRemoteConfigProvider;

    public DocCaptureCameraConfigProvider_Factory(Provider provider) {
        this.onfidoRemoteConfigProvider = provider;
    }

    public static DocCaptureCameraConfigProvider_Factory create(Provider provider) {
        return new DocCaptureCameraConfigProvider_Factory(provider);
    }

    public static DocCaptureCameraConfigProvider newInstance(OnfidoRemoteConfig onfidoRemoteConfig) {
        return new DocCaptureCameraConfigProvider(onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocCaptureCameraConfigProvider get() {
        return newInstance((OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
