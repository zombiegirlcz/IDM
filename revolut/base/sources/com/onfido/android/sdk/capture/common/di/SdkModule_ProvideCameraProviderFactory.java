package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.google.common.util.concurrent.ListenableFuture;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideCameraProviderFactory implements b {
    private final Provider applicationContextProvider;
    private final SdkModule module;

    public SdkModule_ProvideCameraProviderFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.applicationContextProvider = provider;
    }

    public static SdkModule_ProvideCameraProviderFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideCameraProviderFactory(sdkModule, provider);
    }

    public static ListenableFuture<ProcessCameraProvider> provideCameraProvider(SdkModule sdkModule, Context context) {
        ListenableFuture<ProcessCameraProvider> listenableFutureProvideCameraProvider = sdkModule.provideCameraProvider(context);
        e.g(listenableFutureProvideCameraProvider);
        return listenableFutureProvideCameraProvider;
    }

    @Override // com.onfido.javax.inject.Provider
    public ListenableFuture<ProcessCameraProvider> get() {
        return provideCameraProvider(this.module, (Context) this.applicationContextProvider.get());
    }
}
