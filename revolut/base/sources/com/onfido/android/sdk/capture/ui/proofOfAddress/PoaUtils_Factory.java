package com.onfido.android.sdk.capture.ui.proofOfAddress;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaUtils_Factory implements b {

    public static final class InstanceHolder {
        private static final PoaUtils_Factory INSTANCE = new PoaUtils_Factory();

        private InstanceHolder() {
        }
    }

    public static PoaUtils_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PoaUtils newInstance() {
        return new PoaUtils();
    }

    @Override // com.onfido.javax.inject.Provider
    public PoaUtils get() {
        return newInstance();
    }
}
