package com.onfido.android.sdk.capture.ui.faceintro;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceIntroFragment_MembersInjector implements MembersInjector {
    private final Provider presenterProvider;

    public FaceIntroFragment_MembersInjector(Provider provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new FaceIntroFragment_MembersInjector(provider);
    }

    public static void injectPresenter(FaceIntroFragment faceIntroFragment, FaceIntroPresenter faceIntroPresenter) {
        faceIntroFragment.presenter = faceIntroPresenter;
    }

    public void injectMembers(FaceIntroFragment faceIntroFragment) {
        injectPresenter(faceIntroFragment, (FaceIntroPresenter) this.presenterProvider.get());
    }
}
