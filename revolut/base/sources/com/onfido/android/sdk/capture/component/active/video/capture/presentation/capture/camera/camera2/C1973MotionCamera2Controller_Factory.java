package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2;

import androidx.camera.viewfinder.CameraViewfinder;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.IsPersistentSurfaceSupportedUseCase;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.camera.camerax.PreviewConfig;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1973MotionCamera2Controller_Factory {
    private final Provider camera2WrapperProvider;
    private final Provider frameSamplerProvider;
    private final Provider isPersistentSurfaceSupportedUseCaseProvider;
    private final Provider recorderWrapperProvider;

    public C1973MotionCamera2Controller_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.camera2WrapperProvider = provider;
        this.recorderWrapperProvider = provider2;
        this.isPersistentSurfaceSupportedUseCaseProvider = provider3;
        this.frameSamplerProvider = provider4;
    }

    public static C1973MotionCamera2Controller_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C1973MotionCamera2Controller_Factory(provider, provider2, provider3, provider4);
    }

    public static MotionCamera2Controller newInstance(CameraViewfinder cameraViewfinder, VideoCaptureConfig videoCaptureConfig, PreviewConfig previewConfig, FaceDetectorAvc faceDetectorAvc, Camera2Wrapper camera2Wrapper, RecorderWrapper recorderWrapper, IsPersistentSurfaceSupportedUseCase isPersistentSurfaceSupportedUseCase, FrameSampler<MotionImage> frameSampler) {
        return new MotionCamera2Controller(cameraViewfinder, videoCaptureConfig, previewConfig, faceDetectorAvc, camera2Wrapper, recorderWrapper, isPersistentSurfaceSupportedUseCase, frameSampler);
    }

    public MotionCamera2Controller get(CameraViewfinder cameraViewfinder, VideoCaptureConfig videoCaptureConfig, PreviewConfig previewConfig, FaceDetectorAvc faceDetectorAvc) {
        return newInstance(cameraViewfinder, videoCaptureConfig, previewConfig, faceDetectorAvc, (Camera2Wrapper) this.camera2WrapperProvider.get(), (RecorderWrapper) this.recorderWrapperProvider.get(), (IsPersistentSurfaceSupportedUseCase) this.isPersistentSurfaceSupportedUseCaseProvider.get(), (FrameSampler) this.frameSamplerProvider.get());
    }
}
