package com.onfido.android.sdk.capture.internal.validation;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentProcessingResultsFailureAnalyzerImpl_Factory implements b {

    public static final class InstanceHolder {
        private static final DocumentProcessingResultsFailureAnalyzerImpl_Factory INSTANCE = new DocumentProcessingResultsFailureAnalyzerImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static DocumentProcessingResultsFailureAnalyzerImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DocumentProcessingResultsFailureAnalyzerImpl newInstance() {
        return new DocumentProcessingResultsFailureAnalyzerImpl();
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentProcessingResultsFailureAnalyzerImpl get() {
        return newInstance();
    }
}
