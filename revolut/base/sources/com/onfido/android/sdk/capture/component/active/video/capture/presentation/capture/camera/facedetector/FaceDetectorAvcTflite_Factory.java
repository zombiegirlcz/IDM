package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.BlazeFaceModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.Detection;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceDetectorAvcTflite_Factory implements el.b {
    private final Provider blazeFaceModelProvider;
    private final Provider resultMapperProvider;
    private final Provider schedulersProvider;

    public FaceDetectorAvcTflite_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.blazeFaceModelProvider = provider;
        this.schedulersProvider = provider2;
        this.resultMapperProvider = provider3;
    }

    public static FaceDetectorAvcTflite_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new FaceDetectorAvcTflite_Factory(provider, provider2, provider3);
    }

    public static FaceDetectorAvcTflite newInstance(BlazeFaceModel blazeFaceModel, SchedulersProvider schedulersProvider, FaceDetectorAvcResultMapper<Detection> faceDetectorAvcResultMapper) {
        return new FaceDetectorAvcTflite(blazeFaceModel, schedulersProvider, faceDetectorAvcResultMapper);
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorAvcTflite get() {
        return newInstance((BlazeFaceModel) this.blazeFaceModelProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (FaceDetectorAvcResultMapper) this.resultMapperProvider.get());
    }
}
