package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.MotionApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideMotionApiFactory implements b {
    private final MotionHostModule module;
    private final Provider onfidoFetcherProvider;

    public MotionHostModule_ProvideMotionApiFactory(MotionHostModule motionHostModule, Provider provider) {
        this.module = motionHostModule;
        this.onfidoFetcherProvider = provider;
    }

    public static MotionHostModule_ProvideMotionApiFactory create(MotionHostModule motionHostModule, Provider provider) {
        return new MotionHostModule_ProvideMotionApiFactory(motionHostModule, provider);
    }

    public static MotionApi provideMotionApi(MotionHostModule motionHostModule, OnfidoFetcher onfidoFetcher) {
        MotionApi motionApiProvideMotionApi = motionHostModule.provideMotionApi(onfidoFetcher);
        e.g(motionApiProvideMotionApi);
        return motionApiProvideMotionApi;
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionApi get() {
        return provideMotionApi(this.module, (OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
