package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.CaptureTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.usecase.FaceProcessingUseCase;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessCaptureViewModel_Factory implements b {
    private final Provider captureTrackerProvider;
    private final Provider dispatchersProvider;
    private final Provider faceDetectorProvider;
    private final Provider faceProcessingUseCaseProvider;
    private final Provider identityInteractorProvider;
    private final Provider livenessInteractorProvider;
    private final Provider livenessTrackerProvider;
    private final Provider onfidoConfigProvider;
    private final Provider schedulersProvider;
    private final Provider timeProvider;

    public LivenessCaptureViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.faceProcessingUseCaseProvider = provider;
        this.faceDetectorProvider = provider2;
        this.identityInteractorProvider = provider3;
        this.livenessInteractorProvider = provider4;
        this.livenessTrackerProvider = provider5;
        this.captureTrackerProvider = provider6;
        this.timeProvider = provider7;
        this.schedulersProvider = provider8;
        this.onfidoConfigProvider = provider9;
        this.dispatchersProvider = provider10;
    }

    public static LivenessCaptureViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new LivenessCaptureViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static LivenessCaptureViewModel newInstance(FaceProcessingUseCase faceProcessingUseCase, FaceDetector faceDetector, IdentityInteractor identityInteractor, LivenessInteractor livenessInteractor, LivenessTracker livenessTracker, CaptureTracker captureTracker, TimeProvider timeProvider, SchedulersProvider schedulersProvider, OnfidoConfig onfidoConfig, DispatchersProvider dispatchersProvider) {
        return new LivenessCaptureViewModel(faceProcessingUseCase, faceDetector, identityInteractor, livenessInteractor, livenessTracker, captureTracker, timeProvider, schedulersProvider, onfidoConfig, dispatchersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessCaptureViewModel get() {
        return newInstance((FaceProcessingUseCase) this.faceProcessingUseCaseProvider.get(), (FaceDetector) this.faceDetectorProvider.get(), (IdentityInteractor) this.identityInteractorProvider.get(), (LivenessInteractor) this.livenessInteractorProvider.get(), (LivenessTracker) this.livenessTrackerProvider.get(), (CaptureTracker) this.captureTrackerProvider.get(), (TimeProvider) this.timeProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get(), (DispatchersProvider) this.dispatchersProvider.get());
    }
}
