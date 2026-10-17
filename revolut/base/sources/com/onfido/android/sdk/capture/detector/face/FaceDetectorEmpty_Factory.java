package com.onfido.android.sdk.capture.detector.face;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceDetectorEmpty_Factory implements b {

    public static final class InstanceHolder {
        private static final FaceDetectorEmpty_Factory INSTANCE = new FaceDetectorEmpty_Factory();

        private InstanceHolder() {
        }
    }

    public static FaceDetectorEmpty_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FaceDetectorEmpty newInstance() {
        return new FaceDetectorEmpty();
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceDetectorEmpty get() {
        return newInstance();
    }
}
