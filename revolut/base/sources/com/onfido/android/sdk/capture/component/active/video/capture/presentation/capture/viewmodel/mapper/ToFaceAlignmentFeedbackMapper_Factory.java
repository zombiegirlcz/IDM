package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class ToFaceAlignmentFeedbackMapper_Factory implements b {

    public static final class InstanceHolder {
        private static final ToFaceAlignmentFeedbackMapper_Factory INSTANCE = new ToFaceAlignmentFeedbackMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static ToFaceAlignmentFeedbackMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ToFaceAlignmentFeedbackMapper newInstance() {
        return new ToFaceAlignmentFeedbackMapper();
    }

    @Override // com.onfido.javax.inject.Provider
    public ToFaceAlignmentFeedbackMapper get() {
        return newInstance();
    }
}
