package com.onfido.android.sdk.capture.detector.mrzextraction;

import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MRZDocumentExtractorGoogle_Factory implements b {
    private final Provider textRecognizerProvider;

    public MRZDocumentExtractorGoogle_Factory(Provider provider) {
        this.textRecognizerProvider = provider;
    }

    public static MRZDocumentExtractorGoogle_Factory create(Provider provider) {
        return new MRZDocumentExtractorGoogle_Factory(provider);
    }

    public static MRZDocumentExtractorGoogle newInstance(TextRecognizerProvider textRecognizerProvider) {
        return new MRZDocumentExtractorGoogle(textRecognizerProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public MRZDocumentExtractorGoogle get() {
        return newInstance((TextRecognizerProvider) this.textRecognizerProvider.get());
    }
}
