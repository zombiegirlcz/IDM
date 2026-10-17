package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcDataRepository_Factory implements el.b {
    private final Provider jsonParserProvider;
    private final Provider onfidoApiServiceProvider;

    public NfcDataRepository_Factory(Provider provider, Provider provider2) {
        this.onfidoApiServiceProvider = provider;
        this.jsonParserProvider = provider2;
    }

    public static NfcDataRepository_Factory create(Provider provider, Provider provider2) {
        return new NfcDataRepository_Factory(provider, provider2);
    }

    public static NfcDataRepository newInstance(OnfidoApiService onfidoApiService, Json json) {
        return new NfcDataRepository(onfidoApiService, json);
    }

    @Override // com.onfido.javax.inject.Provider
    public NfcDataRepository get() {
        return newInstance((OnfidoApiService) this.onfidoApiServiceProvider.get(), (Json) this.jsonParserProvider.get());
    }
}
