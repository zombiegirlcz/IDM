package com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessChallengesLoadingView_MembersInjector implements MembersInjector {
    private final Provider presenterProvider;

    public LivenessChallengesLoadingView_MembersInjector(Provider provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new LivenessChallengesLoadingView_MembersInjector(provider);
    }

    public static void injectPresenter(LivenessChallengesLoadingView livenessChallengesLoadingView, LivenessChallengesLoadingPresenter livenessChallengesLoadingPresenter) {
        livenessChallengesLoadingView.presenter = livenessChallengesLoadingPresenter;
    }

    public void injectMembers(LivenessChallengesLoadingView livenessChallengesLoadingView) {
        injectPresenter(livenessChallengesLoadingView, (LivenessChallengesLoadingPresenter) this.presenterProvider.get());
    }
}
