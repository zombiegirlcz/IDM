package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder;

import android.hardware.camera2.CameraCharacteristics;
import android.view.Surface;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0015\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapper;", "", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "videoCaptureConfig", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "initialize", "(Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;Landroid/hardware/camera2/CameraCharacteristics;)V", "reset", "Landroid/view/Surface;", "getMediaRecorderSurface", "()Landroid/view/Surface;", "", "getVideoFilePath", "()Ljava/lang/String;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecording", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "stopRecording", "()V", "releaseRecorder", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RecorderWrapper {
    @NotNull
    Surface getMediaRecorderSurface();

    @NotNull
    String getVideoFilePath();

    void initialize(@NotNull VideoCaptureConfig videoCaptureConfig, @NotNull CameraCharacteristics cameraCharacteristics);

    void releaseRecorder();

    void reset(@NotNull VideoCaptureConfig videoCaptureConfig, @NotNull CameraCharacteristics cameraCharacteristics);

    void startRecording(@NotNull Function0<Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError);

    void stopRecording();
}
