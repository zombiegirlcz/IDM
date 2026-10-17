package com.onfido.android.sdk.capture.internal.camera.factory;

import android.content.Context;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoCameraFactory_Factory implements b {
    private final Provider applicationContextProvider;
    private final Provider cameraxFactoryProvider;
    private final Provider frameSamplerProvider;
    private final Provider imageAnalyzerProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider useCaseConfigProvider;

    public OnfidoCameraFactory_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.applicationContextProvider = provider;
        this.onfidoRemoteConfigProvider = provider2;
        this.cameraxFactoryProvider = provider3;
        this.useCaseConfigProvider = provider4;
        this.frameSamplerProvider = provider5;
        this.imageAnalyzerProvider = provider6;
    }

    public static OnfidoCameraFactory_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new OnfidoCameraFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OnfidoCameraFactory newInstance(Context context, OnfidoRemoteConfig onfidoRemoteConfig, CameraX.Factory factory, CameraUseCaseConfigProvider cameraUseCaseConfigProvider, FrameSampler<OnfidoImage> frameSampler, ImageAnalyzer<OnfidoImage> imageAnalyzer) {
        return new OnfidoCameraFactory(context, onfidoRemoteConfig, factory, cameraUseCaseConfigProvider, frameSampler, imageAnalyzer);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoCameraFactory get() {
        return newInstance((Context) this.applicationContextProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (CameraX.Factory) this.cameraxFactoryProvider.get(), (CameraUseCaseConfigProvider) this.useCaseConfigProvider.get(), (FrameSampler) this.frameSamplerProvider.get(), (ImageAnalyzer) this.imageAnalyzerProvider.get());
    }
}
