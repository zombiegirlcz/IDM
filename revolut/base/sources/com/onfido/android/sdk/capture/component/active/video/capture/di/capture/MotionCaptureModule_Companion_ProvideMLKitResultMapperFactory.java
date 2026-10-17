package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.javax.inject.Provider;
import el.b;
import mh.a;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureModule_Companion_ProvideMLKitResultMapperFactory implements b {
    private final Provider mLKitResultMapperProvider;
    private final Provider motionOptionsProvider;
    private final Provider testImplProvider;

    public MotionCaptureModule_Companion_ProvideMLKitResultMapperFactory(Provider provider, Provider provider2, Provider provider3) {
        this.motionOptionsProvider = provider;
        this.testImplProvider = provider2;
        this.mLKitResultMapperProvider = provider3;
    }

    public static MotionCaptureModule_Companion_ProvideMLKitResultMapperFactory create(Provider provider, Provider provider2, Provider provider3) {
        return new MotionCaptureModule_Companion_ProvideMLKitResultMapperFactory(provider, provider2, provider3);
    }

    public static FaceDetectorAvcResultMapper<a> provideMLKitResultMapper(MotionCaptureVariantOptions motionCaptureVariantOptions, FaceDetectorAvcResultMapperTestImpl<Object> faceDetectorAvcResultMapperTestImpl, Provider provider) {
        FaceDetectorAvcResultMapper<a> faceDetectorAvcResultMapperProvideMLKitResultMapper = MotionCaptureModule.INSTANCE.provideMLKitResultMapper(motionCaptureVariantOptions, faceDetectorAvcResultMapperTestImpl, provider);
        e.g(faceDetectorAvcResultMapperProvideMLKitResultMapper);
        return faceDetectorAvcResultMapperProvideMLKitResultMapper;
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorAvcResultMapper<a> get() {
        return provideMLKitResultMapper((MotionCaptureVariantOptions) this.motionOptionsProvider.get(), (FaceDetectorAvcResultMapperTestImpl) this.testImplProvider.get(), this.mLKitResultMapperProvider);
    }
}
