package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceAlignmentChecks_Factory implements b {

    public static final class InstanceHolder {
        private static final FaceAlignmentChecks_Factory INSTANCE = new FaceAlignmentChecks_Factory();

        private InstanceHolder() {
        }
    }

    public static FaceAlignmentChecks_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FaceAlignmentChecks newInstance() {
        return new FaceAlignmentChecks();
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceAlignmentChecks get() {
        return newInstance();
    }
}
