package com.onfido.android.sdk.capture.common.di;

import com.google.mlkit.vision.face.FaceDetector;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideFaceDetectionModelFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideFaceDetectionModelFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideFaceDetectionModelFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideFaceDetectionModelFactory(sdkModule);
    }

    public static FaceDetector provideFaceDetectionModel(SdkModule sdkModule) {
        FaceDetector faceDetectorProvideFaceDetectionModel = sdkModule.provideFaceDetectionModel();
        e.g(faceDetectorProvideFaceDetectionModel);
        return faceDetectorProvideFaceDetectionModel;
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetector get() {
        return provideFaceDetectionModel(this.module);
    }
}
