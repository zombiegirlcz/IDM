package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;
import el.a;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideFaceDetector$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider contextProvider;
    private final Provider faceDetectorEmptyProvider;
    private final Provider faceDetectorGoogleProvider;
    private final SdkModule module;

    public SdkModule_ProvideFaceDetector$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = sdkModule;
        this.contextProvider = provider;
        this.faceDetectorGoogleProvider = provider2;
        this.faceDetectorEmptyProvider = provider3;
    }

    public static SdkModule_ProvideFaceDetector$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        return new SdkModule_ProvideFaceDetector$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3);
    }

    public static FaceDetector provideFaceDetector$onfido_capture_sdk_core_release(SdkModule sdkModule, Context context, Lazy lazy, Lazy lazy2) {
        FaceDetector faceDetectorProvideFaceDetector$onfido_capture_sdk_core_release = sdkModule.provideFaceDetector$onfido_capture_sdk_core_release(context, lazy, lazy2);
        e.g(faceDetectorProvideFaceDetector$onfido_capture_sdk_core_release);
        return faceDetectorProvideFaceDetector$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetector get() {
        return provideFaceDetector$onfido_capture_sdk_core_release(this.module, (Context) this.contextProvider.get(), a.a(this.faceDetectorGoogleProvider), a.a(this.faceDetectorEmptyProvider));
    }
}
