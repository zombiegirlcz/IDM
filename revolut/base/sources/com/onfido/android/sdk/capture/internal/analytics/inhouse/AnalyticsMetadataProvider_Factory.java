package com.onfido.android.sdk.capture.internal.analytics.inhouse;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class AnalyticsMetadataProvider_Factory implements b {

    public static final class InstanceHolder {
        private static final AnalyticsMetadataProvider_Factory INSTANCE = new AnalyticsMetadataProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static AnalyticsMetadataProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AnalyticsMetadataProvider newInstance() {
        return new AnalyticsMetadataProvider();
    }

    @Override // com.onfido.javax.inject.Provider
    public AnalyticsMetadataProvider get() {
        return newInstance();
    }
}
