package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.FaceAlignmentChecks;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class ToFaceAlignmentMapper_Factory implements b {
    private final Provider faceAlignmentChecksProvider;

    public ToFaceAlignmentMapper_Factory(Provider provider) {
        this.faceAlignmentChecksProvider = provider;
    }

    public static ToFaceAlignmentMapper_Factory create(Provider provider) {
        return new ToFaceAlignmentMapper_Factory(provider);
    }

    public static ToFaceAlignmentMapper newInstance(FaceAlignmentChecks faceAlignmentChecks) {
        return new ToFaceAlignmentMapper(faceAlignmentChecks);
    }

    @Override // com.onfido.javax.inject.Provider
    public ToFaceAlignmentMapper get() {
        return newInstance((FaceAlignmentChecks) this.faceAlignmentChecksProvider.get());
    }
}
