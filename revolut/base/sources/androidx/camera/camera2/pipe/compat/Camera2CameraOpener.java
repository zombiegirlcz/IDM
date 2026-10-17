package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Threads;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraOpener;", "Landroidx/camera/camera2/pipe/compat/CameraOpener;", "Lphm/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "<init>", "(Lphm/a;Landroidx/camera/camera2/pipe/core/Threads;)V", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "stateCallback", "", "openCamera-RzXb1QE", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openCamera", "Lphm/a;", "Landroidx/camera/camera2/pipe/core/Threads;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraOpener implements CameraOpener {

    @NotNull
    private final phm.a cameraManager;

    @NotNull
    private final Threads threads;

    public Camera2CameraOpener(@NotNull phm.a cameraManager, @NotNull Threads threads) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.cameraManager = cameraManager;
        this.threads = threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraOpener
    /* JADX INFO: renamed from: openCamera-RzXb1QE, reason: not valid java name */
    public Object mo385openCameraRzXb1QE(@NotNull String str, @NotNull CameraDevice.StateCallback stateCallback, @NotNull Continuation<? super Unit> continuation) {
        CameraManager cameraManager = (CameraManager) this.cameraManager.get();
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(((Object) CameraId.m186toStringimpl(str)) + "#openCamera");
            Intrinsics.h(cameraManager);
            Api28Compat.openCamera(cameraManager, str, this.threads.getCamera2Executor(), stateCallback);
            Unit unit = Unit.f186387a;
            Trace.endSection();
            return Unit.f186387a;
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }
}
