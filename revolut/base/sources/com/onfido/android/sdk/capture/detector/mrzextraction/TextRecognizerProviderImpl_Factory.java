package com.onfido.android.sdk.capture.detector.mrzextraction;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class TextRecognizerProviderImpl_Factory implements b {

    public static final class InstanceHolder {
        private static final TextRecognizerProviderImpl_Factory INSTANCE = new TextRecognizerProviderImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static TextRecognizerProviderImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TextRecognizerProviderImpl newInstance() {
        return new TextRecognizerProviderImpl();
    }

    @Override // com.onfido.javax.inject.Provider
    public TextRecognizerProviderImpl get() {
        return newInstance();
    }
}
