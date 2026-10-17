package com.onfido.android.sdk.capture.document.supported.domain.usecase;

import com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class GetSupportedDocumentsUseCase_Factory implements b {
    private final Provider remoteSupportedDocumentsRepositoryProvider;

    public GetSupportedDocumentsUseCase_Factory(Provider provider) {
        this.remoteSupportedDocumentsRepositoryProvider = provider;
    }

    public static GetSupportedDocumentsUseCase_Factory create(Provider provider) {
        return new GetSupportedDocumentsUseCase_Factory(provider);
    }

    public static GetSupportedDocumentsUseCase newInstance(RemoteSupportedDocumentsRepository remoteSupportedDocumentsRepository) {
        return new GetSupportedDocumentsUseCase(remoteSupportedDocumentsRepository);
    }

    @Override // com.onfido.javax.inject.Provider
    public GetSupportedDocumentsUseCase get() {
        return newInstance((RemoteSupportedDocumentsRepository) this.remoteSupportedDocumentsRepositoryProvider.get());
    }
}
