package com.onfido.android.sdk.capture.ui.camera.liveness;

import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.camera.liveness.turn.LivenessProgressManager;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessOverlayPresenter_Factory implements b {
    private final Provider announcementServiceProvider;
    private final Provider faceDetectorProvider;
    private final Provider livenessProgressManagerProvider;
    private final Provider schedulersProvider;
    private final Provider vibratorServiceProvider;

    public LivenessOverlayPresenter_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.faceDetectorProvider = provider;
        this.livenessProgressManagerProvider = provider2;
        this.schedulersProvider = provider3;
        this.vibratorServiceProvider = provider4;
        this.announcementServiceProvider = provider5;
    }

    public static LivenessOverlayPresenter_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new LivenessOverlayPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static LivenessOverlayPresenter newInstance(FaceDetector faceDetector, LivenessProgressManager livenessProgressManager, SchedulersProvider schedulersProvider, VibratorService vibratorService, AnnouncementService announcementService) {
        return new LivenessOverlayPresenter(faceDetector, livenessProgressManager, schedulersProvider, vibratorService, announcementService);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessOverlayPresenter get() {
        return newInstance((FaceDetector) this.faceDetectorProvider.get(), (LivenessProgressManager) this.livenessProgressManagerProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (VibratorService) this.vibratorServiceProvider.get(), (AnnouncementService) this.announcementServiceProvider.get());
    }
}
