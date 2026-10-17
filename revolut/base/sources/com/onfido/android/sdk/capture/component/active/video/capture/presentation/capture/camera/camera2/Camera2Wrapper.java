package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2;

import android.hardware.camera2.CameraCharacteristics;
import android.view.Surface;
import androidx.camera.viewfinder.CameraViewfinder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\b\u0010\tJA\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2Wrapper;", "", "Lkotlin/Function1;", "Landroid/hardware/camera2/CameraCharacteristics;", "", "onSuccess", "", "onError", "findSelfieCamera", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/camera/viewfinder/CameraViewfinder;", "cameraViewfinder", "Landroid/view/Surface;", "recorderSurface", "Lkotlin/Function0;", "start", "(Landroidx/camera/viewfinder/CameraViewfinder;Landroid/view/Surface;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "resetCaptureSession", "(Landroid/view/Surface;)V", "setPreviewMode", "()V", "setRecordingMode", "stopPreview", "closeCamera", "cleanup", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Camera2Wrapper {
    void cleanup();

    void closeCamera();

    void findSelfieCamera(@NotNull Function1<? super CameraCharacteristics, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError);

    @NotNull
    CameraCharacteristics getCharacteristics();

    void resetCaptureSession(@NotNull Surface recorderSurface);

    void setPreviewMode();

    void setRecordingMode(@NotNull Surface recorderSurface);

    void start(@NotNull CameraViewfinder cameraViewfinder, @NotNull Surface recorderSurface, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError);

    void stopPreview();
}
