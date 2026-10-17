package com.onfido.android.sdk.capture.ui.proofOfAddress.network;

import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaRepository_Factory implements b {
    private final Provider onfidoApiServiceProvider;
    private final Provider proofOfAddressApiProvider;

    public PoaRepository_Factory(Provider provider, Provider provider2) {
        this.proofOfAddressApiProvider = provider;
        this.onfidoApiServiceProvider = provider2;
    }

    public static PoaRepository_Factory create(Provider provider, Provider provider2) {
        return new PoaRepository_Factory(provider, provider2);
    }

    public static PoaRepository newInstance(ProofOfAddressApi proofOfAddressApi, OnfidoApiService onfidoApiService) {
        return new PoaRepository(proofOfAddressApi, onfidoApiService);
    }

    @Override // com.onfido.javax.inject.Provider
    public PoaRepository get() {
        return newInstance((ProofOfAddressApi) this.proofOfAddressApiProvider.get(), (OnfidoApiService) this.onfidoApiServiceProvider.get());
    }
}
