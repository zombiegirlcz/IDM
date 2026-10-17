package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionImageAnalyzer_Factory implements b {

    public static final class InstanceHolder {
        private static final MotionImageAnalyzer_Factory INSTANCE = new MotionImageAnalyzer_Factory();

        private InstanceHolder() {
        }
    }

    public static MotionImageAnalyzer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MotionImageAnalyzer newInstance() {
        return new MotionImageAnalyzer();
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionImageAnalyzer get() {
        return newInstance();
    }
}
