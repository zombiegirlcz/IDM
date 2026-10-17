package com.onfido.android.sdk.capture.internal.usecase;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentPositionUseCase_Factory implements el.b {

    public static final class InstanceHolder {
        private static final DocumentPositionUseCase_Factory INSTANCE = new DocumentPositionUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static DocumentPositionUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DocumentPositionUseCase newInstance() {
        return new DocumentPositionUseCase();
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentPositionUseCase get() {
        return newInstance();
    }
}
