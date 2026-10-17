package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.onfido.android.sdk.capture.component.active.video.capture.data.demo.MotionDemoDataSource;
import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.MotionRemoteDataSource;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.MotionDataSource;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideMotionDataSourceFactory implements b {
    private final MotionHostModule module;
    private final Provider motionDemoDataSourceProvider;
    private final Provider motionRemoteDataSourceProvider;
    private final Provider onfidoTokenProvider;

    public MotionHostModule_ProvideMotionDataSourceFactory(MotionHostModule motionHostModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = motionHostModule;
        this.onfidoTokenProvider = provider;
        this.motionDemoDataSourceProvider = provider2;
        this.motionRemoteDataSourceProvider = provider3;
    }

    public static MotionHostModule_ProvideMotionDataSourceFactory create(MotionHostModule motionHostModule, Provider provider, Provider provider2, Provider provider3) {
        return new MotionHostModule_ProvideMotionDataSourceFactory(motionHostModule, provider, provider2, provider3);
    }

    public static MotionDataSource provideMotionDataSource(MotionHostModule motionHostModule, OnfidoTokenProvider onfidoTokenProvider, MotionDemoDataSource motionDemoDataSource, MotionRemoteDataSource motionRemoteDataSource) {
        MotionDataSource motionDataSourceProvideMotionDataSource = motionHostModule.provideMotionDataSource(onfidoTokenProvider, motionDemoDataSource, motionRemoteDataSource);
        e.g(motionDataSourceProvideMotionDataSource);
        return motionDataSourceProvideMotionDataSource;
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionDataSource get() {
        return provideMotionDataSource(this.module, (OnfidoTokenProvider) this.onfidoTokenProvider.get(), (MotionDemoDataSource) this.motionDemoDataSourceProvider.get(), (MotionRemoteDataSource) this.motionRemoteDataSourceProvider.get());
    }
}
