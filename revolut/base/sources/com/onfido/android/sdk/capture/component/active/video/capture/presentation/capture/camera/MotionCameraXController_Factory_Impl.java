package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCameraXController_Factory_Impl implements MotionCameraXController.Factory {
    private final C1968MotionCameraXController_Factory delegateFactory;

    public MotionCameraXController_Factory_Impl(C1968MotionCameraXController_Factory c1968MotionCameraXController_Factory) {
        this.delegateFactory = c1968MotionCameraXController_Factory;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController.Factory
    public MotionCameraXController create(CameraX cameraX, FaceDetectorAvc faceDetectorAvc) {
        return this.delegateFactory.get(cameraX, faceDetectorAvc);
    }

    public static Provider create(C1968MotionCameraXController_Factory c1968MotionCameraXController_Factory) {
        return new c(new MotionCameraXController_Factory_Impl(c1968MotionCameraXController_Factory));
    }
}
