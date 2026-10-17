package com.onfido.android.sdk.capture.internal.analytics.inhouse.utils;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class EventCache_Factory implements b {

    public static final class InstanceHolder {
        private static final EventCache_Factory INSTANCE = new EventCache_Factory();

        private InstanceHolder() {
        }
    }

    public static EventCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventCache newInstance() {
        return new EventCache();
    }

    @Override // com.onfido.javax.inject.Provider
    public EventCache get() {
        return newInstance();
    }
}
