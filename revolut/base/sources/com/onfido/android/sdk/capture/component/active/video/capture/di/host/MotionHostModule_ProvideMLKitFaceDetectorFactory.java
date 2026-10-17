package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.google.mlkit.vision.face.FaceDetector;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideMLKitFaceDetectorFactory implements b {
    private final MotionHostModule module;

    public MotionHostModule_ProvideMLKitFaceDetectorFactory(MotionHostModule motionHostModule) {
        this.module = motionHostModule;
    }

    public static MotionHostModule_ProvideMLKitFaceDetectorFactory create(MotionHostModule motionHostModule) {
        return new MotionHostModule_ProvideMLKitFaceDetectorFactory(motionHostModule);
    }

    public static FaceDetector provideMLKitFaceDetector(MotionHostModule motionHostModule) {
        FaceDetector faceDetectorProvideMLKitFaceDetector = motionHostModule.provideMLKitFaceDetector();
        e.g(faceDetectorProvideMLKitFaceDetector);
        return faceDetectorProvideMLKitFaceDetector;
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetector get() {
        return provideMLKitFaceDetector(this.module);
    }
}
