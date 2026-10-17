package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadService;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CaptureUploadService_Factory_Impl implements CaptureUploadService.Factory {
    private final C2050CaptureUploadService_Factory delegateFactory;

    public CaptureUploadService_Factory_Impl(C2050CaptureUploadService_Factory c2050CaptureUploadService_Factory) {
        this.delegateFactory = c2050CaptureUploadService_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadService.Factory
    public CaptureUploadService create(CaptureType captureType, CaptureUploadServiceListener captureUploadServiceListener) {
        return this.delegateFactory.get(captureType, captureUploadServiceListener);
    }

    public static Provider create(C2050CaptureUploadService_Factory c2050CaptureUploadService_Factory) {
        return new el.c(new CaptureUploadService_Factory_Impl(c2050CaptureUploadService_Factory));
    }
}
