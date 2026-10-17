package com.onfido.android.sdk.capture.ui.camera.liveness;

import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesDrawer;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessConfirmationFragment_MembersInjector implements MembersInjector {
    private final Provider livenessChallengesDrawerFactoryProvider;
    private final Provider presenterProvider;

    public LivenessConfirmationFragment_MembersInjector(Provider provider, Provider provider2) {
        this.presenterProvider = provider;
        this.livenessChallengesDrawerFactoryProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new LivenessConfirmationFragment_MembersInjector(provider, provider2);
    }

    public static void injectLivenessChallengesDrawerFactory(LivenessConfirmationFragment livenessConfirmationFragment, LivenessChallengesDrawer.Factory factory) {
        livenessConfirmationFragment.livenessChallengesDrawerFactory = factory;
    }

    public static void injectPresenter(LivenessConfirmationFragment livenessConfirmationFragment, LivenessConfirmationPresenter livenessConfirmationPresenter) {
        livenessConfirmationFragment.presenter = livenessConfirmationPresenter;
    }

    public void injectMembers(LivenessConfirmationFragment livenessConfirmationFragment) {
        injectPresenter(livenessConfirmationFragment, (LivenessConfirmationPresenter) this.presenterProvider.get());
        injectLivenessChallengesDrawerFactory(livenessConfirmationFragment, (LivenessChallengesDrawer.Factory) this.livenessChallengesDrawerFactoryProvider.get());
    }
}
