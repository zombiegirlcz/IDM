package com.onfido.android.sdk.capture.ui.userconsent;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class UserConsentFragment_MembersInjector implements MembersInjector {
    private final Provider viewModelProvider;

    public UserConsentFragment_MembersInjector(Provider provider) {
        this.viewModelProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new UserConsentFragment_MembersInjector(provider);
    }

    public static void injectViewModelProvider(UserConsentFragment userConsentFragment, Provider provider) {
        userConsentFragment.viewModelProvider = provider;
    }

    public void injectMembers(UserConsentFragment userConsentFragment) {
        injectViewModelProvider(userConsentFragment, this.viewModelProvider);
    }
}
