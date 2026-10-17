package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import android.content.Context;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessInteractor_Factory implements b {
    private final Provider contextProvider;
    private final Provider timeProvider;

    public LivenessInteractor_Factory(Provider provider, Provider provider2) {
        this.contextProvider = provider;
        this.timeProvider = provider2;
    }

    public static LivenessInteractor_Factory create(Provider provider, Provider provider2) {
        return new LivenessInteractor_Factory(provider, provider2);
    }

    public static LivenessInteractor newInstance(Context context, TimeProvider timeProvider) {
        return new LivenessInteractor(context, timeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessInteractor get() {
        return newInstance((Context) this.contextProvider.get(), (TimeProvider) this.timeProvider.get());
    }
}
