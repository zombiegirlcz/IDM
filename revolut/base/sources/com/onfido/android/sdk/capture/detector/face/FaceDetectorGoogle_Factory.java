package com.onfido.android.sdk.capture.detector.face;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceDetectorGoogle_Factory implements b {

    public static final class InstanceHolder {
        private static final FaceDetectorGoogle_Factory INSTANCE = new FaceDetectorGoogle_Factory();

        private InstanceHolder() {
        }
    }

    public static FaceDetectorGoogle_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FaceDetectorGoogle newInstance() {
        return new FaceDetectorGoogle();
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorGoogle get() {
        return newInstance();
    }
}
