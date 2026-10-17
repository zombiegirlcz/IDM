package com.onfido.android.sdk.capture.ui.camera.selfie;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.CaptureTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SelfieCaptureTracker_Factory implements b {
    private final Provider captureTrackerProvider;
    private final Provider livenessTrackerProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider waitingScreenTrackerProvider;

    public SelfieCaptureTracker_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.captureTrackerProvider = provider;
        this.livenessTrackerProvider = provider2;
        this.waitingScreenTrackerProvider = provider3;
        this.onfidoRemoteConfigProvider = provider4;
    }

    public static SelfieCaptureTracker_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new SelfieCaptureTracker_Factory(provider, provider2, provider3, provider4);
    }

    public static SelfieCaptureTracker newInstance(CaptureTracker captureTracker, LivenessTracker livenessTracker, WaitingScreenTracker waitingScreenTracker, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new SelfieCaptureTracker(captureTracker, livenessTracker, waitingScreenTracker, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public SelfieCaptureTracker get() {
        return newInstance((CaptureTracker) this.captureTrackerProvider.get(), (LivenessTracker) this.livenessTrackerProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
