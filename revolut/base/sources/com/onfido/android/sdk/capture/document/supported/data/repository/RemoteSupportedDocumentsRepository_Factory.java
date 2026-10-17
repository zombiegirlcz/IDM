package com.onfido.android.sdk.capture.document.supported.data.repository;

import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsDataSource;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.SupportedDocumentsApi;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.SupportedDocumentsLocalDataSource;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class RemoteSupportedDocumentsRepository_Factory implements b {
    private final Provider allDocumentsDataSourceProvider;
    private final Provider supportedDocumentsApiProvider;
    private final Provider supportedDocumentsLocalDataSourceProvider;

    public RemoteSupportedDocumentsRepository_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.supportedDocumentsApiProvider = provider;
        this.supportedDocumentsLocalDataSourceProvider = provider2;
        this.allDocumentsDataSourceProvider = provider3;
    }

    public static RemoteSupportedDocumentsRepository_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new RemoteSupportedDocumentsRepository_Factory(provider, provider2, provider3);
    }

    public static RemoteSupportedDocumentsRepository newInstance(SupportedDocumentsApi supportedDocumentsApi, SupportedDocumentsLocalDataSource supportedDocumentsLocalDataSource, AllDocumentsDataSource allDocumentsDataSource) {
        return new RemoteSupportedDocumentsRepository(supportedDocumentsApi, supportedDocumentsLocalDataSource, allDocumentsDataSource);
    }

    @Override // com.onfido.javax.inject.Provider
    public RemoteSupportedDocumentsRepository get() {
        return newInstance((SupportedDocumentsApi) this.supportedDocumentsApiProvider.get(), (SupportedDocumentsLocalDataSource) this.supportedDocumentsLocalDataSourceProvider.get(), (AllDocumentsDataSource) this.allDocumentsDataSourceProvider.get());
    }
}
