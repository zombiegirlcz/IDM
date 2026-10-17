package com.onfido.android.sdk.capture.ui.camera.liveness.intro;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessIntroVideoUrlProvider_Factory implements b {

    public static final class InstanceHolder {
        private static final LivenessIntroVideoUrlProvider_Factory INSTANCE = new LivenessIntroVideoUrlProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static LivenessIntroVideoUrlProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LivenessIntroVideoUrlProvider newInstance() {
        return new LivenessIntroVideoUrlProvider();
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessIntroVideoUrlProvider get() {
        return newInstance();
    }
}
