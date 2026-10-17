package com.onfido.android.sdk.capture.core;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragment_MembersInjector implements MembersInjector {
    private final Provider viewModelProvider;

    public OnfidoFragment_MembersInjector(Provider provider) {
        this.viewModelProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new OnfidoFragment_MembersInjector(provider);
    }

    public static void injectViewModel(OnfidoFragment onfidoFragment, OnfidoViewModel onfidoViewModel) {
        onfidoFragment.viewModel = onfidoViewModel;
    }

    public void injectMembers(OnfidoFragment onfidoFragment) {
        injectViewModel(onfidoFragment, (OnfidoViewModel) this.viewModelProvider.get());
    }
}
