package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessChallengesTransformer_Factory implements b {

    public static final class InstanceHolder {
        private static final LivenessChallengesTransformer_Factory INSTANCE = new LivenessChallengesTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static LivenessChallengesTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LivenessChallengesTransformer newInstance() {
        return new LivenessChallengesTransformer();
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessChallengesTransformer get() {
        return newInstance();
    }
}
