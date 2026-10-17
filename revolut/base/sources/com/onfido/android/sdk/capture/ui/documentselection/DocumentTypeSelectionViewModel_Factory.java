package com.onfido.android.sdk.capture.ui.documentselection;

import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentTypeSelectionViewModel_Factory implements el.b {
    private final Provider supportedDocumentsRepositoryProvider;

    public DocumentTypeSelectionViewModel_Factory(Provider provider) {
        this.supportedDocumentsRepositoryProvider = provider;
    }

    public static DocumentTypeSelectionViewModel_Factory create(Provider provider) {
        return new DocumentTypeSelectionViewModel_Factory(provider);
    }

    public static DocumentTypeSelectionViewModel newInstance(SupportedDocumentsRepository supportedDocumentsRepository) {
        return new DocumentTypeSelectionViewModel(supportedDocumentsRepository);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentTypeSelectionViewModel get() {
        return newInstance((SupportedDocumentsRepository) this.supportedDocumentsRepositoryProvider.get());
    }
}
