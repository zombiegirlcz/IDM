package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2;

import androidx.camera.viewfinder.CameraViewfinder;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.internal.camera.camerax.PreviewConfig;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCamera2Controller_Factory_Impl implements MotionCamera2Controller.Factory {
    private final C1973MotionCamera2Controller_Factory delegateFactory;

    public MotionCamera2Controller_Factory_Impl(C1973MotionCamera2Controller_Factory c1973MotionCamera2Controller_Factory) {
        this.delegateFactory = c1973MotionCamera2Controller_Factory;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller.Factory
    public MotionCamera2Controller create(CameraViewfinder cameraViewfinder, VideoCaptureConfig videoCaptureConfig, PreviewConfig previewConfig, FaceDetectorAvc faceDetectorAvc) {
        return this.delegateFactory.get(cameraViewfinder, videoCaptureConfig, previewConfig, faceDetectorAvc);
    }

    public static Provider create(C1973MotionCamera2Controller_Factory c1973MotionCamera2Controller_Factory) {
        return new c(new MotionCamera2Controller_Factory_Impl(c1973MotionCamera2Controller_Factory));
    }
}
