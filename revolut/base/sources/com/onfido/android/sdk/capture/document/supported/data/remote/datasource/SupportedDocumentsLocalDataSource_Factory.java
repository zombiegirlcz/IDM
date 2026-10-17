package com.onfido.android.sdk.capture.document.supported.data.remote.datasource;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SupportedDocumentsLocalDataSource_Factory implements b {

    public static final class InstanceHolder {
        private static final SupportedDocumentsLocalDataSource_Factory INSTANCE = new SupportedDocumentsLocalDataSource_Factory();

        private InstanceHolder() {
        }
    }

    public static SupportedDocumentsLocalDataSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SupportedDocumentsLocalDataSource newInstance() {
        return new SupportedDocumentsLocalDataSource();
    }

    @Override // com.onfido.javax.inject.Provider
    public SupportedDocumentsLocalDataSource get() {
        return newInstance();
    }
}
