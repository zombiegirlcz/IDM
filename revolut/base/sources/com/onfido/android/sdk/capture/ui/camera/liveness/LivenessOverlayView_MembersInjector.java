package com.onfido.android.sdk.capture.ui.camera.liveness;

import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesDrawer;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessOverlayView_MembersInjector implements MembersInjector {
    private final Provider livenessChallengesDrawerFactoryProvider;
    private final Provider presenterProvider;

    public LivenessOverlayView_MembersInjector(Provider provider, Provider provider2) {
        this.livenessChallengesDrawerFactoryProvider = provider;
        this.presenterProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new LivenessOverlayView_MembersInjector(provider, provider2);
    }

    public static void injectLivenessChallengesDrawerFactory(LivenessOverlayView livenessOverlayView, LivenessChallengesDrawer.Factory factory) {
        livenessOverlayView.livenessChallengesDrawerFactory = factory;
    }

    public static void injectPresenter(LivenessOverlayView livenessOverlayView, LivenessOverlayPresenter livenessOverlayPresenter) {
        livenessOverlayView.presenter = livenessOverlayPresenter;
    }

    public void injectMembers(LivenessOverlayView livenessOverlayView) {
        injectLivenessChallengesDrawerFactory(livenessOverlayView, (LivenessChallengesDrawer.Factory) this.livenessChallengesDrawerFactoryProvider.get());
        injectPresenter(livenessOverlayView, (LivenessOverlayPresenter) this.presenterProvider.get());
    }
}
