package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSelection;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaDocumentSelectionFragment_MembersInjector implements MembersInjector {
    private final Provider poaViewModelFactoryProvider;

    public PoaDocumentSelectionFragment_MembersInjector(Provider provider) {
        this.poaViewModelFactoryProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new PoaDocumentSelectionFragment_MembersInjector(provider);
    }

    public static void injectPoaViewModelFactory(PoaDocumentSelectionFragment poaDocumentSelectionFragment, Provider provider) {
        poaDocumentSelectionFragment.poaViewModelFactory = provider;
    }

    public void injectMembers(PoaDocumentSelectionFragment poaDocumentSelectionFragment) {
        injectPoaViewModelFactory(poaDocumentSelectionFragment, this.poaViewModelFactoryProvider);
    }
}
