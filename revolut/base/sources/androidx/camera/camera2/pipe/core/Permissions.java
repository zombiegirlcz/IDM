package androidx.camera.camera2.pipe.core;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/pipe/core/Permissions;", "", "cameraPipeContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "_hasCameraPermission", "", "hasCameraPermission", "getHasCameraPermission", "()Z", "checkCameraPermission", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Permissions {
    private volatile boolean _hasCameraPermission;

    @NotNull
    private final Context cameraPipeContext;

    public Permissions(@NotNull Context cameraPipeContext) {
        Intrinsics.checkNotNullParameter(cameraPipeContext, "cameraPipeContext");
        this.cameraPipeContext = cameraPipeContext;
    }

    private final boolean checkCameraPermission() {
        if (Intrinsics.f(Build.FINGERPRINT, "robolectric")) {
            return true;
        }
        if (!this._hasCameraPermission) {
            Debug debug = Debug.INSTANCE;
            Trace.beginSection("CXCP#checkCameraPermission");
            if (this.cameraPipeContext.checkSelfPermission("android.permission.CAMERA") == 0) {
                this._hasCameraPermission = true;
            }
            Trace.endSection();
        }
        return this._hasCameraPermission;
    }

    public final boolean getHasCameraPermission() {
        return checkCameraPermission();
    }
}
