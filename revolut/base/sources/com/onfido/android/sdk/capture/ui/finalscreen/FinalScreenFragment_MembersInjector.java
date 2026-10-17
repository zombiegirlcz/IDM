package com.onfido.android.sdk.capture.ui.finalscreen;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FinalScreenFragment_MembersInjector implements MembersInjector {
    private final Provider presenterProvider;

    public FinalScreenFragment_MembersInjector(Provider provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new FinalScreenFragment_MembersInjector(provider);
    }

    public static void injectPresenter(FinalScreenFragment finalScreenFragment, FinalScreenPresenter finalScreenPresenter) {
        finalScreenFragment.presenter = finalScreenPresenter;
    }

    public void injectMembers(FinalScreenFragment finalScreenFragment) {
        injectPresenter(finalScreenFragment, (FinalScreenPresenter) this.presenterProvider.get());
    }
}
