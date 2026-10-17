package com.onfido.android.sdk.capture.document.supported.data.remote.datasource;

import com.onfido.android.sdk.capture.document.supported.data.SupportedDocumentMapper;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class AllDocumentsRemoteDataSourceImpl_Factory implements b {
    private final Provider apiServiceProvider;
    private final Provider documentMapperProvider;

    public AllDocumentsRemoteDataSourceImpl_Factory(Provider provider, Provider provider2) {
        this.apiServiceProvider = provider;
        this.documentMapperProvider = provider2;
    }

    public static AllDocumentsRemoteDataSourceImpl_Factory create(Provider provider, Provider provider2) {
        return new AllDocumentsRemoteDataSourceImpl_Factory(provider, provider2);
    }

    public static AllDocumentsRemoteDataSourceImpl newInstance(OnfidoApiService onfidoApiService, SupportedDocumentMapper supportedDocumentMapper) {
        return new AllDocumentsRemoteDataSourceImpl(onfidoApiService, supportedDocumentMapper);
    }

    @Override // com.onfido.javax.inject.Provider
    public AllDocumentsRemoteDataSourceImpl get() {
        return newInstance((OnfidoApiService) this.apiServiceProvider.get(), (SupportedDocumentMapper) this.documentMapperProvider.get());
    }
}
