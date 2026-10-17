package com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase;

import com.onfido.android.sdk.capture.component.active.video.capture.domain.repository.ActiveVideoCaptureRepository;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class UploadActiveVideoCaptureUseCase_Factory implements b {
    private final Provider repositoryProvider;
    private final Provider schedulersProvider;

    public UploadActiveVideoCaptureUseCase_Factory(Provider provider, Provider provider2) {
        this.repositoryProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static UploadActiveVideoCaptureUseCase_Factory create(Provider provider, Provider provider2) {
        return new UploadActiveVideoCaptureUseCase_Factory(provider, provider2);
    }

    public static UploadActiveVideoCaptureUseCase newInstance(ActiveVideoCaptureRepository activeVideoCaptureRepository, SchedulersProvider schedulersProvider) {
        return new UploadActiveVideoCaptureUseCase(activeVideoCaptureRepository, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public UploadActiveVideoCaptureUseCase get() {
        return newInstance((ActiveVideoCaptureRepository) this.repositoryProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
