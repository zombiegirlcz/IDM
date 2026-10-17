package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.ui.proofOfAddress.network.ProofOfAddressApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideProofOfAddressApi$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider onfidoFetcherProvider;

    public NetworkModule_ProvideProofOfAddressApi$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.onfidoFetcherProvider = provider;
    }

    public static NetworkModule_ProvideProofOfAddressApi$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideProofOfAddressApi$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static ProofOfAddressApi provideProofOfAddressApi$onfido_capture_sdk_core_release(OnfidoFetcher onfidoFetcher) {
        ProofOfAddressApi proofOfAddressApiProvideProofOfAddressApi$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideProofOfAddressApi$onfido_capture_sdk_core_release(onfidoFetcher);
        e.g(proofOfAddressApiProvideProofOfAddressApi$onfido_capture_sdk_core_release);
        return proofOfAddressApiProvideProofOfAddressApi$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public ProofOfAddressApi get() {
        return provideProofOfAddressApi$onfido_capture_sdk_core_release((OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
