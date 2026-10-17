package com.onfido.android.sdk.capture.detector.mrz;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MRZDetectorEmpty_Factory implements b {

    public static final class InstanceHolder {
        private static final MRZDetectorEmpty_Factory INSTANCE = new MRZDetectorEmpty_Factory();

        private InstanceHolder() {
        }
    }

    public static MRZDetectorEmpty_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MRZDetectorEmpty newInstance() {
        return new MRZDetectorEmpty();
    }

    @Override // com.onfido.javax.inject.Provider
    public MRZDetectorEmpty get() {
        return newInstance();
    }
}
