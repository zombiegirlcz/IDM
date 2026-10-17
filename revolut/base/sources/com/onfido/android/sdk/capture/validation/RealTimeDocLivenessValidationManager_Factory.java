package com.onfido.android.sdk.capture.validation;

/* JADX INFO: loaded from: classes17.dex */
public final class RealTimeDocLivenessValidationManager_Factory implements el.b {

    public static final class InstanceHolder {
        private static final RealTimeDocLivenessValidationManager_Factory INSTANCE = new RealTimeDocLivenessValidationManager_Factory();

        private InstanceHolder() {
        }
    }

    public static RealTimeDocLivenessValidationManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RealTimeDocLivenessValidationManager newInstance() {
        return new RealTimeDocLivenessValidationManager();
    }

    @Override // com.onfido.javax.inject.Provider
    public RealTimeDocLivenessValidationManager get() {
        return newInstance();
    }
}
