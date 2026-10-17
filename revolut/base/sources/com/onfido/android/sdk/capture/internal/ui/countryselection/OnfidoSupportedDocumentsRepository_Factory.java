package com.onfido.android.sdk.capture.internal.ui.countryselection;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsDataSource;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoSupportedDocumentsRepository_Factory implements b {
    private final Provider allDocumentsDataSourceProvider;
    private final Provider onfidoConfigProvider;

    public OnfidoSupportedDocumentsRepository_Factory(Provider provider, Provider provider2) {
        this.onfidoConfigProvider = provider;
        this.allDocumentsDataSourceProvider = provider2;
    }

    public static OnfidoSupportedDocumentsRepository_Factory create(Provider provider, Provider provider2) {
        return new OnfidoSupportedDocumentsRepository_Factory(provider, provider2);
    }

    public static OnfidoSupportedDocumentsRepository newInstance(OnfidoConfig onfidoConfig, AllDocumentsDataSource allDocumentsDataSource) {
        return new OnfidoSupportedDocumentsRepository(onfidoConfig, allDocumentsDataSource);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoSupportedDocumentsRepository get() {
        return newInstance((OnfidoConfig) this.onfidoConfigProvider.get(), (AllDocumentsDataSource) this.allDocumentsDataSourceProvider.get());
    }
}
