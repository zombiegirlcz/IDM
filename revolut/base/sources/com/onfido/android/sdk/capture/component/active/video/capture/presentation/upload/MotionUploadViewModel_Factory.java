package com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload;

import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.UploadActiveVideoCaptureUseCase;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionUploadViewModel_Factory implements b {
    private final Provider analyticsProvider;
    private final Provider schedulersProvider;
    private final Provider uploadActiveVideoCaptureProvider;
    private final Provider waitingScreenTrackerProvider;

    public MotionUploadViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.uploadActiveVideoCaptureProvider = provider;
        this.schedulersProvider = provider2;
        this.analyticsProvider = provider3;
        this.waitingScreenTrackerProvider = provider4;
    }

    public static MotionUploadViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new MotionUploadViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static MotionUploadViewModel newInstance(UploadActiveVideoCaptureUseCase uploadActiveVideoCaptureUseCase, SchedulersProvider schedulersProvider, OnfidoAnalytics onfidoAnalytics, WaitingScreenTracker waitingScreenTracker) {
        return new MotionUploadViewModel(uploadActiveVideoCaptureUseCase, schedulersProvider, onfidoAnalytics, waitingScreenTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionUploadViewModel get() {
        return newInstance((UploadActiveVideoCaptureUseCase) this.uploadActiveVideoCaptureProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (OnfidoAnalytics) this.analyticsProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get());
    }
}
