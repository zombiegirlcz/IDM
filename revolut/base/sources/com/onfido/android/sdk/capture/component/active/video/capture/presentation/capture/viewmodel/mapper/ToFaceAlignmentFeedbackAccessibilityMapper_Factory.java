package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper;

import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class ToFaceAlignmentFeedbackAccessibilityMapper_Factory implements b {

    public static final class InstanceHolder {
        private static final ToFaceAlignmentFeedbackAccessibilityMapper_Factory INSTANCE = new ToFaceAlignmentFeedbackAccessibilityMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static ToFaceAlignmentFeedbackAccessibilityMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ToFaceAlignmentFeedbackAccessibilityMapper newInstance() {
        return new ToFaceAlignmentFeedbackAccessibilityMapper();
    }

    @Override // com.onfido.javax.inject.Provider
    public ToFaceAlignmentFeedbackAccessibilityMapper get() {
        return newInstance();
    }
}
