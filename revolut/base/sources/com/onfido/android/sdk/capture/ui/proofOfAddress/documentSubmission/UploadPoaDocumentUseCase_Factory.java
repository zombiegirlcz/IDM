package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import com.onfido.android.sdk.capture.ui.proofOfAddress.network.PoaRepository;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class UploadPoaDocumentUseCase_Factory implements el.b {
    private final Provider repositoryProvider;

    public UploadPoaDocumentUseCase_Factory(Provider provider) {
        this.repositoryProvider = provider;
    }

    public static UploadPoaDocumentUseCase_Factory create(Provider provider) {
        return new UploadPoaDocumentUseCase_Factory(provider);
    }

    public static UploadPoaDocumentUseCase newInstance(PoaRepository poaRepository) {
        return new UploadPoaDocumentUseCase(poaRepository);
    }

    @Override // com.onfido.javax.inject.Provider
    public UploadPoaDocumentUseCase get() {
        return newInstance((PoaRepository) this.repositoryProvider.get());
    }
}
