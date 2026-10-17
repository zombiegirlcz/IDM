package com.onfido.android.sdk.capture.ui.camera.liveness.turn;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessProgressManager_Factory implements b {

    public static final class InstanceHolder {
        private static final LivenessProgressManager_Factory INSTANCE = new LivenessProgressManager_Factory();

        private InstanceHolder() {
        }
    }

    public static LivenessProgressManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LivenessProgressManager newInstance() {
        return new LivenessProgressManager();
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessProgressManager get() {
        return newInstance();
    }
}
