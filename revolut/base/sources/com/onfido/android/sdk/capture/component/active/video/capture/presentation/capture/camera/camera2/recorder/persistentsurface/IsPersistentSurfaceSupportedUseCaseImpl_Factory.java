package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.ApiLevelUtil;
import com.onfido.android.sdk.capture.utils.DeviceUtils;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class IsPersistentSurfaceSupportedUseCaseImpl_Factory implements b {
    private final Provider apiLevelUtilProvider;
    private final Provider deviceUtilsProvider;
    private final Provider repositoryProvider;

    public IsPersistentSurfaceSupportedUseCaseImpl_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.apiLevelUtilProvider = provider;
        this.deviceUtilsProvider = provider2;
        this.repositoryProvider = provider3;
    }

    public static IsPersistentSurfaceSupportedUseCaseImpl_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new IsPersistentSurfaceSupportedUseCaseImpl_Factory(provider, provider2, provider3);
    }

    public static IsPersistentSurfaceSupportedUseCaseImpl newInstance(ApiLevelUtil apiLevelUtil, DeviceUtils deviceUtils, PersistentRecorderSurfaceRepository persistentRecorderSurfaceRepository) {
        return new IsPersistentSurfaceSupportedUseCaseImpl(apiLevelUtil, deviceUtils, persistentRecorderSurfaceRepository);
    }

    @Override // com.onfido.javax.inject.Provider
    public IsPersistentSurfaceSupportedUseCaseImpl get() {
        return newInstance((ApiLevelUtil) this.apiLevelUtilProvider.get(), (DeviceUtils) this.deviceUtilsProvider.get(), (PersistentRecorderSurfaceRepository) this.repositoryProvider.get());
    }
}
