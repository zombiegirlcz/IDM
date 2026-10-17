package com.onfido.android.sdk.capture.internal.camera.camerax;

/* JADX INFO: loaded from: classes17.dex */
public final class DefaultImageAnalyzer_Factory implements el.b {

    public static final class InstanceHolder {
        private static final DefaultImageAnalyzer_Factory INSTANCE = new DefaultImageAnalyzer_Factory();

        private InstanceHolder() {
        }
    }

    public static DefaultImageAnalyzer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultImageAnalyzer newInstance() {
        return new DefaultImageAnalyzer();
    }

    @Override // com.onfido.javax.inject.Provider
    public DefaultImageAnalyzer get() {
        return newInstance();
    }
}
