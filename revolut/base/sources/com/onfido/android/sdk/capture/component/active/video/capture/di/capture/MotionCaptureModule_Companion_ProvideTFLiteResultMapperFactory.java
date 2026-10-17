package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.Detection;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureModule_Companion_ProvideTFLiteResultMapperFactory implements b {
    private final Provider motionOptionsProvider;
    private final Provider tFLiteResultMapperProvider;
    private final Provider testImplProvider;

    public MotionCaptureModule_Companion_ProvideTFLiteResultMapperFactory(Provider provider, Provider provider2, Provider provider3) {
        this.motionOptionsProvider = provider;
        this.testImplProvider = provider2;
        this.tFLiteResultMapperProvider = provider3;
    }

    public static MotionCaptureModule_Companion_ProvideTFLiteResultMapperFactory create(Provider provider, Provider provider2, Provider provider3) {
        return new MotionCaptureModule_Companion_ProvideTFLiteResultMapperFactory(provider, provider2, provider3);
    }

    public static FaceDetectorAvcResultMapper<Detection> provideTFLiteResultMapper(MotionCaptureVariantOptions motionCaptureVariantOptions, FaceDetectorAvcResultMapperTestImpl<Object> faceDetectorAvcResultMapperTestImpl, Provider provider) {
        FaceDetectorAvcResultMapper<Detection> faceDetectorAvcResultMapperProvideTFLiteResultMapper = MotionCaptureModule.INSTANCE.provideTFLiteResultMapper(motionCaptureVariantOptions, faceDetectorAvcResultMapperTestImpl, provider);
        e.g(faceDetectorAvcResultMapperProvideTFLiteResultMapper);
        return faceDetectorAvcResultMapperProvideTFLiteResultMapper;
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorAvcResultMapper<Detection> get() {
        return provideTFLiteResultMapper((MotionCaptureVariantOptions) this.motionOptionsProvider.get(), (FaceDetectorAvcResultMapperTestImpl) this.testImplProvider.get(), this.tFLiteResultMapperProvider);
    }
}
