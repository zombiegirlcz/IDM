package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;
import n14.e;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideRetrofit$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider jsonProvider;
    private final Provider okHttpClientProvider;

    public NetworkModule_ProvideRetrofit$onfido_capture_sdk_core_releaseFactory(Provider provider, Provider provider2) {
        this.okHttpClientProvider = provider;
        this.jsonProvider = provider2;
    }

    public static NetworkModule_ProvideRetrofit$onfido_capture_sdk_core_releaseFactory create(Provider provider, Provider provider2) {
        return new NetworkModule_ProvideRetrofit$onfido_capture_sdk_core_releaseFactory(provider, provider2);
    }

    public static Retrofit provideRetrofit$onfido_capture_sdk_core_release(OkHttpClient okHttpClient, Json json) {
        Retrofit retrofitProvideRetrofit$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideRetrofit$onfido_capture_sdk_core_release(okHttpClient, json);
        e.g(retrofitProvideRetrofit$onfido_capture_sdk_core_release);
        return retrofitProvideRetrofit$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public Retrofit get() {
        return provideRetrofit$onfido_capture_sdk_core_release((OkHttpClient) this.okHttpClientProvider.get(), (Json) this.jsonProvider.get());
    }
}
