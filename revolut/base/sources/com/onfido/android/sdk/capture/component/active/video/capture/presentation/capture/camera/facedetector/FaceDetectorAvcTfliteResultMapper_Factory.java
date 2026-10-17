package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.CoordinatesTransformer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.YawAngleCalculator;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceDetectorAvcTfliteResultMapper_Factory implements el.b {
    private final Provider coordinatesTransformerProvider;
    private final Provider yawAngleCalculatorProvider;

    public FaceDetectorAvcTfliteResultMapper_Factory(Provider provider, Provider provider2) {
        this.coordinatesTransformerProvider = provider;
        this.yawAngleCalculatorProvider = provider2;
    }

    public static FaceDetectorAvcTfliteResultMapper_Factory create(Provider provider, Provider provider2) {
        return new FaceDetectorAvcTfliteResultMapper_Factory(provider, provider2);
    }

    public static FaceDetectorAvcTfliteResultMapper newInstance(CoordinatesTransformer coordinatesTransformer, YawAngleCalculator yawAngleCalculator) {
        return new FaceDetectorAvcTfliteResultMapper(coordinatesTransformer, yawAngleCalculator);
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorAvcTfliteResultMapper get() {
        return newInstance((CoordinatesTransformer) this.coordinatesTransformerProvider.get(), (YawAngleCalculator) this.yawAngleCalculatorProvider.get());
    }
}
