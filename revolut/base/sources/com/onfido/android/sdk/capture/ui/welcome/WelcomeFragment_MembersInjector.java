package com.onfido.android.sdk.capture.ui.welcome;

import com.onfido.android.sdk.capture.ui.welcome.WelcomePresenter;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class WelcomeFragment_MembersInjector implements MembersInjector {
    private final Provider presenterFactoryProvider;

    public WelcomeFragment_MembersInjector(Provider provider) {
        this.presenterFactoryProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new WelcomeFragment_MembersInjector(provider);
    }

    public static void injectPresenterFactory(WelcomeFragment welcomeFragment, WelcomePresenter.Factory factory) {
        welcomeFragment.presenterFactory = factory;
    }

    public void injectMembers(WelcomeFragment welcomeFragment) {
        injectPresenterFactory(welcomeFragment, (WelcomePresenter.Factory) this.presenterFactoryProvider.get());
    }
}
