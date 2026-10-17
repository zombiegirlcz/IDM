package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.ui.nfc.NfcHostViewModel;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcHostFragment_MembersInjector implements MembersInjector {
    private final Provider nfcViewModelFactoryProvider;

    public NfcHostFragment_MembersInjector(Provider provider) {
        this.nfcViewModelFactoryProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new NfcHostFragment_MembersInjector(provider);
    }

    public static void injectNfcViewModelFactory(NfcHostFragment nfcHostFragment, NfcHostViewModel.Factory factory) {
        nfcHostFragment.nfcViewModelFactory = factory;
    }

    public void injectMembers(NfcHostFragment nfcHostFragment) {
        injectNfcViewModelFactory(nfcHostFragment, (NfcHostViewModel.Factory) this.nfcViewModelFactoryProvider.get());
    }
}
