package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoApi;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideLivenessIntroVideoAPI$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider retrofitProvider;

    public NetworkModule_ProvideLivenessIntroVideoAPI$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.retrofitProvider = provider;
    }

    public static NetworkModule_ProvideLivenessIntroVideoAPI$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideLivenessIntroVideoAPI$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static LivenessIntroVideoApi provideLivenessIntroVideoAPI$onfido_capture_sdk_core_release(Retrofit retrofit) {
        LivenessIntroVideoApi livenessIntroVideoApiProvideLivenessIntroVideoAPI$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideLivenessIntroVideoAPI$onfido_capture_sdk_core_release(retrofit);
        e.g(livenessIntroVideoApiProvideLivenessIntroVideoAPI$onfido_capture_sdk_core_release);
        return livenessIntroVideoApiProvideLivenessIntroVideoAPI$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessIntroVideoApi get() {
        return provideLivenessIntroVideoAPI$onfido_capture_sdk_core_release((Retrofit) this.retrofitProvider.get());
    }
}
