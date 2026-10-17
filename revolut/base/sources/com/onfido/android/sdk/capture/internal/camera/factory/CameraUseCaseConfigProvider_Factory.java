package com.onfido.android.sdk.capture.internal.camera.factory;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class CameraUseCaseConfigProvider_Factory implements b {
    private final Provider docCaptureCameraConfigProvider;
    private final Provider onfidoRemoteConfigProvider;

    public CameraUseCaseConfigProvider_Factory(Provider provider, Provider provider2) {
        this.onfidoRemoteConfigProvider = provider;
        this.docCaptureCameraConfigProvider = provider2;
    }

    public static CameraUseCaseConfigProvider_Factory create(Provider provider, Provider provider2) {
        return new CameraUseCaseConfigProvider_Factory(provider, provider2);
    }

    public static CameraUseCaseConfigProvider newInstance(OnfidoRemoteConfig onfidoRemoteConfig, DocCaptureCameraConfigProvider docCaptureCameraConfigProvider) {
        return new CameraUseCaseConfigProvider(onfidoRemoteConfig, docCaptureCameraConfigProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public CameraUseCaseConfigProvider get() {
        return newInstance((OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (DocCaptureCameraConfigProvider) this.docCaptureCameraConfigProvider.get());
    }
}
