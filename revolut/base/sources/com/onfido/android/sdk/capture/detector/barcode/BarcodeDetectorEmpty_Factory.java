package com.onfido.android.sdk.capture.detector.barcode;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class BarcodeDetectorEmpty_Factory implements b {

    public static final class InstanceHolder {
        private static final BarcodeDetectorEmpty_Factory INSTANCE = new BarcodeDetectorEmpty_Factory();

        private InstanceHolder() {
        }
    }

    public static BarcodeDetectorEmpty_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BarcodeDetectorEmpty newInstance() {
        return new BarcodeDetectorEmpty();
    }

    @Override // com.onfido.javax.inject.Provider
    public BarcodeDetectorEmpty get() {
        return newInstance();
    }
}
