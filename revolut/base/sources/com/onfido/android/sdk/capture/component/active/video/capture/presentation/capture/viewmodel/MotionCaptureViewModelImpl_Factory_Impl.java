package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureViewModelImpl_Factory_Impl implements MotionCaptureViewModelImpl.Factory {
    private final C1999MotionCaptureViewModelImpl_Factory delegateFactory;

    public MotionCaptureViewModelImpl_Factory_Impl(C1999MotionCaptureViewModelImpl_Factory c1999MotionCaptureViewModelImpl_Factory) {
        this.delegateFactory = c1999MotionCaptureViewModelImpl_Factory;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.Factory
    public MotionCaptureViewModelImpl create(boolean z, MotionCameraController motionCameraController, FaceDetectorAvc faceDetectorAvc) {
        return this.delegateFactory.get(z, motionCameraController, faceDetectorAvc);
    }

    public static Provider create(C1999MotionCaptureViewModelImpl_Factory c1999MotionCaptureViewModelImpl_Factory) {
        return new c(new MotionCaptureViewModelImpl_Factory_Impl(c1999MotionCaptureViewModelImpl_Factory));
    }
}
