package androidx.camera.camera2.compat;

import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.pipe.Request;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import skm.g0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "bundle", "", "addRequestOption", "(Landroidx/camera/camera2/interop/CaptureRequestOptions;)V", "getRequestOption", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "clearRequestOption", "()V", "cancelCurrentTask", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lskm/g0;", "Ljava/lang/Void;", "applyAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lskm/g0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Camera2CameraControlCompat extends Request.Listener {
    static /* synthetic */ g0 applyAsync$default(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyAsync");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return camera2CameraControlCompat.applyAsync(useCaseCameraRequestControl, z);
    }

    void addRequestOption(@NotNull CaptureRequestOptions bundle);

    @NotNull
    g0 applyAsync(UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask);

    void cancelCurrentTask();

    void clearRequestOption();

    @NotNull
    CaptureRequestOptions getRequestOption();
}
