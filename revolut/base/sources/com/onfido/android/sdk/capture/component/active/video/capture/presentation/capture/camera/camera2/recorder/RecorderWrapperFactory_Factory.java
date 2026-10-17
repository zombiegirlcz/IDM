package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder;

import android.content.Context;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.IsPersistentSurfaceSupportedUseCase;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.SurfaceSizeProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class RecorderWrapperFactory_Factory implements b {
    private final Provider contextProvider;
    private final Provider isPersistentSurfaceSupportedUseCaseProvider;
    private final Provider surfaceSizeProvider;

    public RecorderWrapperFactory_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.contextProvider = provider;
        this.isPersistentSurfaceSupportedUseCaseProvider = provider2;
        this.surfaceSizeProvider = provider3;
    }

    public static RecorderWrapperFactory_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new RecorderWrapperFactory_Factory(provider, provider2, provider3);
    }

    public static RecorderWrapperFactory newInstance(Context context, IsPersistentSurfaceSupportedUseCase isPersistentSurfaceSupportedUseCase, SurfaceSizeProvider surfaceSizeProvider) {
        return new RecorderWrapperFactory(context, isPersistentSurfaceSupportedUseCase, surfaceSizeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public RecorderWrapperFactory get() {
        return newInstance((Context) this.contextProvider.get(), (IsPersistentSurfaceSupportedUseCase) this.isPersistentSurfaceSupportedUseCaseProvider.get(), (SurfaceSizeProvider) this.surfaceSizeProvider.get());
    }
}
