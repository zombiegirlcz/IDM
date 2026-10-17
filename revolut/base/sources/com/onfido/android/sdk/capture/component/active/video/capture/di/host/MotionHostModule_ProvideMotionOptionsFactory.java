package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideMotionOptionsFactory implements b {
    private final MotionHostModule module;

    public MotionHostModule_ProvideMotionOptionsFactory(MotionHostModule motionHostModule) {
        this.module = motionHostModule;
    }

    public static MotionHostModule_ProvideMotionOptionsFactory create(MotionHostModule motionHostModule) {
        return new MotionHostModule_ProvideMotionOptionsFactory(motionHostModule);
    }

    public static MotionCaptureVariantOptions provideMotionOptions(MotionHostModule motionHostModule) {
        MotionCaptureVariantOptions motionOptions = motionHostModule.getMotionOptions();
        e.g(motionOptions);
        return motionOptions;
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionCaptureVariantOptions get() {
        return provideMotionOptions(this.module);
    }
}
