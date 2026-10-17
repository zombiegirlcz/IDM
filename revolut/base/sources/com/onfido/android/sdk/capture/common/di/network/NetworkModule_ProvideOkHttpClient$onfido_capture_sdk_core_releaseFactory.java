package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.internal.network.InternalOnfidoNetworkInterceptorsProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideOkHttpClient$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider providerProvider;

    public NetworkModule_ProvideOkHttpClient$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.providerProvider = provider;
    }

    public static NetworkModule_ProvideOkHttpClient$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideOkHttpClient$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static OkHttpClient provideOkHttpClient$onfido_capture_sdk_core_release(InternalOnfidoNetworkInterceptorsProvider internalOnfidoNetworkInterceptorsProvider) {
        OkHttpClient okHttpClientProvideOkHttpClient$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideOkHttpClient$onfido_capture_sdk_core_release(internalOnfidoNetworkInterceptorsProvider);
        e.g(okHttpClientProvideOkHttpClient$onfido_capture_sdk_core_release);
        return okHttpClientProvideOkHttpClient$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OkHttpClient get() {
        return provideOkHttpClient$onfido_capture_sdk_core_release((InternalOnfidoNetworkInterceptorsProvider) this.providerProvider.get());
    }
}
