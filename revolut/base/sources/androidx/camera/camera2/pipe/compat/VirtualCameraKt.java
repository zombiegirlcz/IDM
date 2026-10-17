package androidx.camera.camera2.pipe.compat;

import hx7.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rkm.d;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lrkm/d;", "virtualCameraDebugIds", "Lrkm/d;", "getVirtualCameraDebugIds", "()Lrkm/d;", "androidCameraDebugIds", "getAndroidCameraDebugIds", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class VirtualCameraKt {

    @NotNull
    private static final d virtualCameraDebugIds = b.h(0);

    @NotNull
    private static final d androidCameraDebugIds = b.h(0);

    @NotNull
    public static final d getAndroidCameraDebugIds() {
        return androidCameraDebugIds;
    }

    @NotNull
    public static final d getVirtualCameraDebugIds() {
        return virtualCameraDebugIds;
    }
}
