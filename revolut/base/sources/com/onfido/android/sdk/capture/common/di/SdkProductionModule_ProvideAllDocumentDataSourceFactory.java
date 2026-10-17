package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsDataSource;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsRemoteDataSourceImpl;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkProductionModule_ProvideAllDocumentDataSourceFactory implements b {
    private final Provider allDocumentsRemoteDataSourceImplProvider;

    public SdkProductionModule_ProvideAllDocumentDataSourceFactory(Provider provider) {
        this.allDocumentsRemoteDataSourceImplProvider = provider;
    }

    public static SdkProductionModule_ProvideAllDocumentDataSourceFactory create(Provider provider) {
        return new SdkProductionModule_ProvideAllDocumentDataSourceFactory(provider);
    }

    public static AllDocumentsDataSource provideAllDocumentDataSource(AllDocumentsRemoteDataSourceImpl allDocumentsRemoteDataSourceImpl) {
        AllDocumentsDataSource allDocumentsDataSourceProvideAllDocumentDataSource = SdkProductionModule.INSTANCE.provideAllDocumentDataSource(allDocumentsRemoteDataSourceImpl);
        e.g(allDocumentsDataSourceProvideAllDocumentDataSource);
        return allDocumentsDataSourceProvideAllDocumentDataSource;
    }

    @Override // com.onfido.javax.inject.Provider
    public AllDocumentsDataSource get() {
        return provideAllDocumentDataSource((AllDocumentsRemoteDataSourceImpl) this.allDocumentsRemoteDataSourceImplProvider.get());
    }
}
