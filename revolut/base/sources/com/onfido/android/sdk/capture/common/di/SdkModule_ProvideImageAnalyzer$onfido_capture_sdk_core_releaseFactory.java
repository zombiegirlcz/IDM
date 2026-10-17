package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideImageAnalyzer$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideImageAnalyzer$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideImageAnalyzer$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideImageAnalyzer$onfido_capture_sdk_core_releaseFactory(sdkModule);
    }

    public static ImageAnalyzer<OnfidoImage> provideImageAnalyzer$onfido_capture_sdk_core_release(SdkModule sdkModule) {
        ImageAnalyzer<OnfidoImage> imageAnalyzerProvideImageAnalyzer$onfido_capture_sdk_core_release = sdkModule.provideImageAnalyzer$onfido_capture_sdk_core_release();
        e.g(imageAnalyzerProvideImageAnalyzer$onfido_capture_sdk_core_release);
        return imageAnalyzerProvideImageAnalyzer$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public ImageAnalyzer<OnfidoImage> get() {
        return provideImageAnalyzer$onfido_capture_sdk_core_release(this.module);
    }
}
