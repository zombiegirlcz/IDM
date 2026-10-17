package com.onfido.android.sdk.capture.native_detector;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class NativeDetector_Factory implements b {

    public static final class InstanceHolder {
        private static final NativeDetector_Factory INSTANCE = new NativeDetector_Factory();

        private InstanceHolder() {
        }
    }

    public static NativeDetector_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NativeDetector newInstance() {
        return new NativeDetector();
    }

    @Override // com.onfido.javax.inject.Provider
    public NativeDetector get() {
        return newInstance();
    }
}
