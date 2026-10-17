package com.onfido.android.sdk.capture.detector.mrzextraction;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MRZDocumentExtractorEmpty_Factory implements b {

    public static final class InstanceHolder {
        private static final MRZDocumentExtractorEmpty_Factory INSTANCE = new MRZDocumentExtractorEmpty_Factory();

        private InstanceHolder() {
        }
    }

    public static MRZDocumentExtractorEmpty_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MRZDocumentExtractorEmpty newInstance() {
        return new MRZDocumentExtractorEmpty();
    }

    @Override // com.onfido.javax.inject.Provider
    public MRZDocumentExtractorEmpty get() {
        return newInstance();
    }
}
