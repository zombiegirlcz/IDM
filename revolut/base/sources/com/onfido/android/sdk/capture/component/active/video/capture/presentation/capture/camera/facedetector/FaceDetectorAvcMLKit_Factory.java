package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceDetectorAvcMLKit_Factory implements el.b {
    private final Provider analyticsProvider;
    private final Provider resultMapperProvider;
    private final Provider schedulersProvider;

    public FaceDetectorAvcMLKit_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.analyticsProvider = provider;
        this.schedulersProvider = provider2;
        this.resultMapperProvider = provider3;
    }

    public static FaceDetectorAvcMLKit_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new FaceDetectorAvcMLKit_Factory(provider, provider2, provider3);
    }

    public static FaceDetectorAvcMLKit newInstance(OnfidoAnalytics onfidoAnalytics, SchedulersProvider schedulersProvider, FaceDetectorAvcResultMapper<mh.a> faceDetectorAvcResultMapper) {
        return new FaceDetectorAvcMLKit(onfidoAnalytics, schedulersProvider, faceDetectorAvcResultMapper);
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorAvcMLKit get() {
        return newInstance((OnfidoAnalytics) this.analyticsProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (FaceDetectorAvcResultMapper) this.resultMapperProvider.get());
    }
}
