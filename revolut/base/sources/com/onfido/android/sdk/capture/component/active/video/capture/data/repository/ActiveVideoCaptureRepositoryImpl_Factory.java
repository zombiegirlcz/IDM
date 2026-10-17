package com.onfido.android.sdk.capture.component.active.video.capture.data.repository;

import android.content.Context;
import com.onfido.android.sdk.capture.common.result.FailureReason;
import com.onfido.android.sdk.capture.utils.mapper.Mapper;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class ActiveVideoCaptureRepositoryImpl_Factory implements el.b {
    private final Provider contextProvider;
    private final Provider errorMapperProvider;
    private final Provider motionDataSourceProvider;

    public ActiveVideoCaptureRepositoryImpl_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.motionDataSourceProvider = provider;
        this.errorMapperProvider = provider2;
        this.contextProvider = provider3;
    }

    public static ActiveVideoCaptureRepositoryImpl_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new ActiveVideoCaptureRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ActiveVideoCaptureRepositoryImpl newInstance(MotionDataSource motionDataSource, Mapper<Throwable, FailureReason> mapper, Context context) {
        return new ActiveVideoCaptureRepositoryImpl(motionDataSource, mapper, context);
    }

    @Override // com.onfido.javax.inject.Provider
    public ActiveVideoCaptureRepositoryImpl get() {
        return newInstance((MotionDataSource) this.motionDataSourceProvider.get(), (Mapper) this.errorMapperProvider.get(), (Context) this.contextProvider.get());
    }
}
