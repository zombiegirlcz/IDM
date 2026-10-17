package com.onfido.android.sdk.capture.detector.mrz;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MRZDetectorGoogle_Factory implements b {

    public static final class InstanceHolder {
        private static final MRZDetectorGoogle_Factory INSTANCE = new MRZDetectorGoogle_Factory();

        private InstanceHolder() {
        }
    }

    public static MRZDetectorGoogle_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MRZDetectorGoogle newInstance() {
        return new MRZDetectorGoogle();
    }

    @Override // com.onfido.javax.inject.Provider
    public MRZDetectorGoogle get() {
        return newInstance();
    }
}
