package com.onfido.android.sdk.capture.ui.documentselection.host;

import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentSelectionHostFragment_MembersInjector implements MembersInjector {
    private final Provider factoryProvider;

    public DocumentSelectionHostFragment_MembersInjector(Provider provider) {
        this.factoryProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new DocumentSelectionHostFragment_MembersInjector(provider);
    }

    public static void injectFactory(DocumentSelectionHostFragment documentSelectionHostFragment, DocumentSelectionHostViewModel.Factory factory) {
        documentSelectionHostFragment.factory = factory;
    }

    public void injectMembers(DocumentSelectionHostFragment documentSelectionHostFragment) {
        injectFactory(documentSelectionHostFragment, (DocumentSelectionHostViewModel.Factory) this.factoryProvider.get());
    }
}
