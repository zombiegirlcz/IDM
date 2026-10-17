package com.onfido.android.sdk.capture.internal.camera.camerax;

import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class CameraX_Factory_Impl implements CameraX.Factory {
    private final C2013CameraX_Factory delegateFactory;

    public CameraX_Factory_Impl(C2013CameraX_Factory c2013CameraX_Factory) {
        this.delegateFactory = c2013CameraX_Factory;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.Factory
    public CameraX create(LifecycleOwner lifecycleOwner, PreviewView previewView, PreviewConfig previewConfig, ImageCaptureConfig imageCaptureConfig, VideoCaptureConfig videoCaptureConfig, ImageAnalysisConfig imageAnalysisConfig, ImageAnalyzer<?> imageAnalyzer, FrameSampler<?> frameSampler) {
        return this.delegateFactory.get(lifecycleOwner, previewView, previewConfig, imageCaptureConfig, videoCaptureConfig, imageAnalysisConfig, imageAnalyzer, frameSampler);
    }

    public static Provider create(C2013CameraX_Factory c2013CameraX_Factory) {
        return new c(new CameraX_Factory_Impl(c2013CameraX_Factory));
    }
}
