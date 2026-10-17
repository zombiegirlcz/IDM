package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2013CameraX_Factory {
    private final Provider applicationContextProvider;
    private final Provider cameraProviderFutureProvider;
    private final Provider cameraXImageAnalysisUseCaseProvider;
    private final Provider cameraXTakePictureUseCaseProvider;
    private final Provider cameraXTakeVideoUseCaseProvider;
    private final Provider dispatchersProvider;
    private final Provider remoteConfigProvider;

    public C2013CameraX_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.applicationContextProvider = provider;
        this.cameraXTakeVideoUseCaseProvider = provider2;
        this.cameraXTakePictureUseCaseProvider = provider3;
        this.cameraXImageAnalysisUseCaseProvider = provider4;
        this.dispatchersProvider = provider5;
        this.cameraProviderFutureProvider = provider6;
        this.remoteConfigProvider = provider7;
    }

    public static C2013CameraX_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C2013CameraX_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static CameraX newInstance(Context context, CameraXTakeVideoUseCase cameraXTakeVideoUseCase, CameraXTakePictureUseCase cameraXTakePictureUseCase, CameraXImageAnalysisUseCase cameraXImageAnalysisUseCase, DispatchersProvider dispatchersProvider, ListenableFuture<ProcessCameraProvider> listenableFuture, OnfidoRemoteConfig onfidoRemoteConfig, LifecycleOwner lifecycleOwner, PreviewView previewView, PreviewConfig previewConfig, ImageCaptureConfig imageCaptureConfig, VideoCaptureConfig videoCaptureConfig, ImageAnalysisConfig imageAnalysisConfig, ImageAnalyzer<?> imageAnalyzer, FrameSampler<?> frameSampler) {
        return new CameraX(context, cameraXTakeVideoUseCase, cameraXTakePictureUseCase, cameraXImageAnalysisUseCase, dispatchersProvider, listenableFuture, onfidoRemoteConfig, lifecycleOwner, previewView, previewConfig, imageCaptureConfig, videoCaptureConfig, imageAnalysisConfig, imageAnalyzer, frameSampler);
    }

    public CameraX get(LifecycleOwner lifecycleOwner, PreviewView previewView, PreviewConfig previewConfig, ImageCaptureConfig imageCaptureConfig, VideoCaptureConfig videoCaptureConfig, ImageAnalysisConfig imageAnalysisConfig, ImageAnalyzer<?> imageAnalyzer, FrameSampler<?> frameSampler) {
        return newInstance((Context) this.applicationContextProvider.get(), (CameraXTakeVideoUseCase) this.cameraXTakeVideoUseCaseProvider.get(), (CameraXTakePictureUseCase) this.cameraXTakePictureUseCaseProvider.get(), (CameraXImageAnalysisUseCase) this.cameraXImageAnalysisUseCaseProvider.get(), (DispatchersProvider) this.dispatchersProvider.get(), (ListenableFuture) this.cameraProviderFutureProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get(), lifecycleOwner, previewView, previewConfig, imageCaptureConfig, videoCaptureConfig, imageAnalysisConfig, imageAnalyzer, frameSampler);
    }
}
