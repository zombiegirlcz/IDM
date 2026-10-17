package com.onfido.android.sdk.capture.common.result;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class HapticFeedback_Factory implements b {

    public static final class InstanceHolder {
        private static final HapticFeedback_Factory INSTANCE = new HapticFeedback_Factory();

        private InstanceHolder() {
        }
    }

    public static HapticFeedback_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HapticFeedback newInstance() {
        return new HapticFeedback();
    }

    @Override // com.onfido.javax.inject.Provider
    public HapticFeedback get() {
        return newInstance();
    }
}
