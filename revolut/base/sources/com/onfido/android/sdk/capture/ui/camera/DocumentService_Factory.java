package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentService_Factory implements el.b {
    private final Provider apiServiceProvider;

    public DocumentService_Factory(Provider provider) {
        this.apiServiceProvider = provider;
    }

    public static DocumentService_Factory create(Provider provider) {
        return new DocumentService_Factory(provider);
    }

    public static DocumentService newInstance(OnfidoApiService onfidoApiService) {
        return new DocumentService(onfidoApiService);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentService get() {
        return newInstance((OnfidoApiService) this.apiServiceProvider.get());
    }
}
