package com.onfido.android.sdk.capture.ui.faceintro;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceIntroPresenter_Factory implements b {
    private final Provider livenessTrackerProvider;
    private final Provider screenLoadTrackerProvider;

    public FaceIntroPresenter_Factory(Provider provider, Provider provider2) {
        this.livenessTrackerProvider = provider;
        this.screenLoadTrackerProvider = provider2;
    }

    public static FaceIntroPresenter_Factory create(Provider provider, Provider provider2) {
        return new FaceIntroPresenter_Factory(provider, provider2);
    }

    public static FaceIntroPresenter newInstance(LivenessTracker livenessTracker, ScreenLoadTracker screenLoadTracker) {
        return new FaceIntroPresenter(livenessTracker, screenLoadTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceIntroPresenter get() {
        return newInstance((LivenessTracker) this.livenessTrackerProvider.get(), (ScreenLoadTracker) this.screenLoadTrackerProvider.get());
    }
}
