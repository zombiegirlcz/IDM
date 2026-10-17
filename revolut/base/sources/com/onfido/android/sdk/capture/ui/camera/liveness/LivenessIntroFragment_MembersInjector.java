package com.onfido.android.sdk.capture.ui.camera.liveness;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessIntroFragment_MembersInjector implements MembersInjector {
    private final Provider presenterProvider;

    public LivenessIntroFragment_MembersInjector(Provider provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new LivenessIntroFragment_MembersInjector(provider);
    }

    public static void injectPresenter(LivenessIntroFragment livenessIntroFragment, LivenessIntroPresenter livenessIntroPresenter) {
        livenessIntroFragment.presenter = livenessIntroPresenter;
    }

    public void injectMembers(LivenessIntroFragment livenessIntroFragment) {
        injectPresenter(livenessIntroFragment, (LivenessIntroPresenter) this.presenterProvider.get());
    }
}
