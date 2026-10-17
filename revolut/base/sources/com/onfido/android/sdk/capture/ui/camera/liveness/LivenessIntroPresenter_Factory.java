package com.onfido.android.sdk.capture.ui.camera.liveness;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoRepository;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessIntroPresenter_Factory implements b {
    private final Provider livenessIntroVideoRepositoryProvider;
    private final Provider livenessTrackerProvider;
    private final Provider schedulersProvider;

    public LivenessIntroPresenter_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.livenessTrackerProvider = provider;
        this.livenessIntroVideoRepositoryProvider = provider2;
        this.schedulersProvider = provider3;
    }

    public static LivenessIntroPresenter_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new LivenessIntroPresenter_Factory(provider, provider2, provider3);
    }

    public static LivenessIntroPresenter newInstance(LivenessTracker livenessTracker, LivenessIntroVideoRepository livenessIntroVideoRepository, SchedulersProvider schedulersProvider) {
        return new LivenessIntroPresenter(livenessTracker, livenessIntroVideoRepository, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessIntroPresenter get() {
        return newInstance((LivenessTracker) this.livenessTrackerProvider.get(), (LivenessIntroVideoRepository) this.livenessIntroVideoRepositoryProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
