package com.onfido.android.sdk.capture.detector.face;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceOnDocumentDetectorEmpty_Factory implements b {

    public static final class InstanceHolder {
        private static final FaceOnDocumentDetectorEmpty_Factory INSTANCE = new FaceOnDocumentDetectorEmpty_Factory();

        private InstanceHolder() {
        }
    }

    public static FaceOnDocumentDetectorEmpty_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FaceOnDocumentDetectorEmpty newInstance() {
        return new FaceOnDocumentDetectorEmpty();
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceOnDocumentDetectorEmpty get() {
        return newInstance();
    }
}
