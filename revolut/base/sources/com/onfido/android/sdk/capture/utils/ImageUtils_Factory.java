package com.onfido.android.sdk.capture.utils;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class ImageUtils_Factory implements b {

    public static final class InstanceHolder {
        private static final ImageUtils_Factory INSTANCE = new ImageUtils_Factory();

        private InstanceHolder() {
        }
    }

    public static ImageUtils_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ImageUtils newInstance() {
        return new ImageUtils();
    }

    @Override // com.onfido.javax.inject.Provider
    public ImageUtils get() {
        return newInstance();
    }
}
