package com.onfido.android.sdk.capture.utils;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DeviceUtils_Factory implements b {

    public static final class InstanceHolder {
        private static final DeviceUtils_Factory INSTANCE = new DeviceUtils_Factory();

        private InstanceHolder() {
        }
    }

    public static DeviceUtils_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DeviceUtils newInstance() {
        return new DeviceUtils();
    }

    @Override // com.onfido.javax.inject.Provider
    public DeviceUtils get() {
        return newInstance();
    }
}
