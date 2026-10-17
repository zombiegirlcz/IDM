package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

/* JADX INFO: loaded from: classes17.dex */
public final class CompressPoaDocumentUseCase_Factory implements el.b {

    public static final class InstanceHolder {
        private static final CompressPoaDocumentUseCase_Factory INSTANCE = new CompressPoaDocumentUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static CompressPoaDocumentUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CompressPoaDocumentUseCase newInstance() {
        return new CompressPoaDocumentUseCase();
    }

    @Override // com.onfido.javax.inject.Provider
    public CompressPoaDocumentUseCase get() {
        return newInstance();
    }
}
