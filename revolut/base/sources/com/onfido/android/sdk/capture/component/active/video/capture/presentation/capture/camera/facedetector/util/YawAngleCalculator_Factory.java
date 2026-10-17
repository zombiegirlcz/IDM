package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class YawAngleCalculator_Factory implements b {

    public static final class InstanceHolder {
        private static final YawAngleCalculator_Factory INSTANCE = new YawAngleCalculator_Factory();

        private InstanceHolder() {
        }
    }

    public static YawAngleCalculator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static YawAngleCalculator newInstance() {
        return new YawAngleCalculator();
    }

    @Override // com.onfido.javax.inject.Provider
    public YawAngleCalculator get() {
        return newInstance();
    }
}
