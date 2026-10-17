package com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails;

import com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaDocumentDetailsFragment_MembersInjector implements MembersInjector {
    private final Provider poaUtilsProvider;
    private final Provider poaViewModelFactoryProvider;

    public PoaDocumentDetailsFragment_MembersInjector(Provider provider, Provider provider2) {
        this.poaViewModelFactoryProvider = provider;
        this.poaUtilsProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new PoaDocumentDetailsFragment_MembersInjector(provider, provider2);
    }

    public static void injectPoaUtils(PoaDocumentDetailsFragment poaDocumentDetailsFragment, PoaUtils poaUtils) {
        poaDocumentDetailsFragment.poaUtils = poaUtils;
    }

    public static void injectPoaViewModelFactory(PoaDocumentDetailsFragment poaDocumentDetailsFragment, Provider provider) {
        poaDocumentDetailsFragment.poaViewModelFactory = provider;
    }

    public void injectMembers(PoaDocumentDetailsFragment poaDocumentDetailsFragment) {
        injectPoaViewModelFactory(poaDocumentDetailsFragment, this.poaViewModelFactoryProvider);
        injectPoaUtils(poaDocumentDetailsFragment, (PoaUtils) this.poaUtilsProvider.get());
    }
}
