package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionFaceDetectorFactory_Factory implements el.b {
    private final Provider analyticsProvider;
    private final Provider faceDetectorAvcMLKitProvider;
    private final Provider faceDetectorAvcTfliteProvider;

    public MotionFaceDetectorFactory_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.analyticsProvider = provider;
        this.faceDetectorAvcMLKitProvider = provider2;
        this.faceDetectorAvcTfliteProvider = provider3;
    }

    public static MotionFaceDetectorFactory_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new MotionFaceDetectorFactory_Factory(provider, provider2, provider3);
    }

    public static MotionFaceDetectorFactory newInstance(OnfidoAnalytics onfidoAnalytics, Provider provider, Provider provider2) {
        return new MotionFaceDetectorFactory(onfidoAnalytics, provider, provider2);
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionFaceDetectorFactory get() {
        return newInstance((OnfidoAnalytics) this.analyticsProvider.get(), this.faceDetectorAvcMLKitProvider, this.faceDetectorAvcTfliteProvider);
    }
}
