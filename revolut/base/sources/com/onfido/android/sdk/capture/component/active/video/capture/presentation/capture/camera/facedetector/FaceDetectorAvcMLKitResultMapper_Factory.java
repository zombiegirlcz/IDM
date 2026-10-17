package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.CoordinatesTransformer;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceDetectorAvcMLKitResultMapper_Factory implements el.b {
    private final Provider coordinatesTransformerProvider;

    public FaceDetectorAvcMLKitResultMapper_Factory(Provider provider) {
        this.coordinatesTransformerProvider = provider;
    }

    public static FaceDetectorAvcMLKitResultMapper_Factory create(Provider provider) {
        return new FaceDetectorAvcMLKitResultMapper_Factory(provider);
    }

    public static FaceDetectorAvcMLKitResultMapper newInstance(CoordinatesTransformer coordinatesTransformer) {
        return new FaceDetectorAvcMLKitResultMapper(coordinatesTransformer);
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorAvcMLKitResultMapper get() {
        return newInstance((CoordinatesTransformer) this.coordinatesTransformerProvider.get());
    }
}
