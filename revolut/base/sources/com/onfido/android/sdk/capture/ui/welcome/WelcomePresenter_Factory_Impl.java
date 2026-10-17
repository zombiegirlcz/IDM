package com.onfido.android.sdk.capture.ui.welcome;

import com.onfido.android.sdk.capture.ui.options.WelcomeScreenOptions;
import com.onfido.android.sdk.capture.ui.welcome.WelcomePresenter;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class WelcomePresenter_Factory_Impl implements WelcomePresenter.Factory {
    private final C2156WelcomePresenter_Factory delegateFactory;

    public WelcomePresenter_Factory_Impl(C2156WelcomePresenter_Factory c2156WelcomePresenter_Factory) {
        this.delegateFactory = c2156WelcomePresenter_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.welcome.WelcomePresenter.Factory
    public WelcomePresenter create(WelcomeScreenOptions welcomeScreenOptions) {
        return this.delegateFactory.get(welcomeScreenOptions);
    }

    public static Provider create(C2156WelcomePresenter_Factory c2156WelcomePresenter_Factory) {
        return new c(new WelcomePresenter_Factory_Impl(c2156WelcomePresenter_Factory));
    }
}
