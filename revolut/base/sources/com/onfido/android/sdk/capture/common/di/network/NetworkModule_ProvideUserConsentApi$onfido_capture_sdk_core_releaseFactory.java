package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.ui.userconsent.network.UserConsentApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideUserConsentApi$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider onfidoFetcherProvider;

    public NetworkModule_ProvideUserConsentApi$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.onfidoFetcherProvider = provider;
    }

    public static NetworkModule_ProvideUserConsentApi$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideUserConsentApi$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static UserConsentApi provideUserConsentApi$onfido_capture_sdk_core_release(OnfidoFetcher onfidoFetcher) {
        UserConsentApi userConsentApiProvideUserConsentApi$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideUserConsentApi$onfido_capture_sdk_core_release(onfidoFetcher);
        e.g(userConsentApiProvideUserConsentApi$onfido_capture_sdk_core_release);
        return userConsentApiProvideUserConsentApi$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public UserConsentApi get() {
        return provideUserConsentApi$onfido_capture_sdk_core_release((OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
