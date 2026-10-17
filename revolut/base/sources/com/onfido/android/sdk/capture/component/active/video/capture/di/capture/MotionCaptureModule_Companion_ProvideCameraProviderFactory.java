package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.google.common.util.concurrent.ListenableFuture;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureModule_Companion_ProvideCameraProviderFactory implements b {
    private final Provider applicationContextProvider;

    public MotionCaptureModule_Companion_ProvideCameraProviderFactory(Provider provider) {
        this.applicationContextProvider = provider;
    }

    public static MotionCaptureModule_Companion_ProvideCameraProviderFactory create(Provider provider) {
        return new MotionCaptureModule_Companion_ProvideCameraProviderFactory(provider);
    }

    public static ListenableFuture<ProcessCameraProvider> provideCameraProvider(Context context) {
        ListenableFuture<ProcessCameraProvider> listenableFutureProvideCameraProvider = MotionCaptureModule.INSTANCE.provideCameraProvider(context);
        e.g(listenableFutureProvideCameraProvider);
        return listenableFutureProvideCameraProvider;
    }

    @Override // com.onfido.javax.inject.Provider
    public ListenableFuture<ProcessCameraProvider> get() {
        return provideCameraProvider((Context) this.applicationContextProvider.get());
    }
}
