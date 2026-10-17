package com.onfido.android.sdk.capture.ui.documentselection;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentTypeSelectionFragment_MembersInjector implements MembersInjector {
    private final Provider viewModelProvider;

    public DocumentTypeSelectionFragment_MembersInjector(Provider provider) {
        this.viewModelProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new DocumentTypeSelectionFragment_MembersInjector(provider);
    }

    public static void injectViewModelProvider(DocumentTypeSelectionFragment documentTypeSelectionFragment, Provider provider) {
        documentTypeSelectionFragment.viewModelProvider = provider;
    }

    public void injectMembers(DocumentTypeSelectionFragment documentTypeSelectionFragment) {
        injectViewModelProvider(documentTypeSelectionFragment, this.viewModelProvider);
    }
}
