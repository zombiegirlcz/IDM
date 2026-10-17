package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.OvalRect;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureModule_Companion_ProvideOvalRectFactory implements b {

    public static final class InstanceHolder {
        private static final MotionCaptureModule_Companion_ProvideOvalRectFactory INSTANCE = new MotionCaptureModule_Companion_ProvideOvalRectFactory();

        private InstanceHolder() {
        }
    }

    public static MotionCaptureModule_Companion_ProvideOvalRectFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OvalRect provideOvalRect() {
        OvalRect ovalRectProvideOvalRect = MotionCaptureModule.INSTANCE.provideOvalRect();
        e.g(ovalRectProvideOvalRect);
        return ovalRectProvideOvalRect;
    }

    @Override // com.onfido.javax.inject.Provider
    public OvalRect get() {
        return provideOvalRect();
    }
}
