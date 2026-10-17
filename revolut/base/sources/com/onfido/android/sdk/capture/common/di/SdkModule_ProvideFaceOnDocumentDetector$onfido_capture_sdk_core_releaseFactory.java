package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import com.onfido.android.sdk.capture.detector.face.FaceOnDocumentDetector;
import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;
import el.a;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideFaceOnDocumentDetector$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider contextProvider;
    private final Provider faceOnDocumentDetectorEmptyProvider;
    private final Provider faceOnDocumentDetectorGoogleProvider;
    private final SdkModule module;

    public SdkModule_ProvideFaceOnDocumentDetector$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = sdkModule;
        this.contextProvider = provider;
        this.faceOnDocumentDetectorGoogleProvider = provider2;
        this.faceOnDocumentDetectorEmptyProvider = provider3;
    }

    public static SdkModule_ProvideFaceOnDocumentDetector$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        return new SdkModule_ProvideFaceOnDocumentDetector$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3);
    }

    public static FaceOnDocumentDetector provideFaceOnDocumentDetector$onfido_capture_sdk_core_release(SdkModule sdkModule, Context context, Lazy lazy, Lazy lazy2) {
        FaceOnDocumentDetector faceOnDocumentDetectorProvideFaceOnDocumentDetector$onfido_capture_sdk_core_release = sdkModule.provideFaceOnDocumentDetector$onfido_capture_sdk_core_release(context, lazy, lazy2);
        e.g(faceOnDocumentDetectorProvideFaceOnDocumentDetector$onfido_capture_sdk_core_release);
        return faceOnDocumentDetectorProvideFaceOnDocumentDetector$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceOnDocumentDetector get() {
        return provideFaceOnDocumentDetector$onfido_capture_sdk_core_release(this.module, (Context) this.contextProvider.get(), a.a(this.faceOnDocumentDetectorGoogleProvider), a.a(this.faceOnDocumentDetectorEmptyProvider));
    }
}
