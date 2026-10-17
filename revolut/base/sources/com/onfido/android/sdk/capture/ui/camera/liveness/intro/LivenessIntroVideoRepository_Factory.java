package com.onfido.android.sdk.capture.ui.camera.liveness.intro;

import com.onfido.android.sdk.capture.internal.util.FileCache;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessIntroVideoRepository_Factory implements b {
    private final Provider apiProvider;
    private final Provider cacheProvider;
    private final Provider urlProvider;

    public LivenessIntroVideoRepository_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.urlProvider = provider;
        this.cacheProvider = provider2;
        this.apiProvider = provider3;
    }

    public static LivenessIntroVideoRepository_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new LivenessIntroVideoRepository_Factory(provider, provider2, provider3);
    }

    public static LivenessIntroVideoRepository newInstance(LivenessIntroVideoUrlProvider livenessIntroVideoUrlProvider, FileCache fileCache, LivenessIntroVideoApi livenessIntroVideoApi) {
        return new LivenessIntroVideoRepository(livenessIntroVideoUrlProvider, fileCache, livenessIntroVideoApi);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessIntroVideoRepository get() {
        return newInstance((LivenessIntroVideoUrlProvider) this.urlProvider.get(), (FileCache) this.cacheProvider.get(), (LivenessIntroVideoApi) this.apiProvider.get());
    }
}
