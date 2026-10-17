package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraPipe;
import hx7.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.d;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Config;", "config", "Landroidx/camera/camera2/pipe/CameraPipe;", "CameraPipe", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/CameraPipe;", "Lrkm/d;", "cameraPipeIds", "Lrkm/d;", "getCameraPipeIds", "()Lrkm/d;", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class CameraPipeKt {

    @NotNull
    private static final d cameraPipeIds = b.h(0);

    @NotNull
    public static final CameraPipe CameraPipe(@NotNull CameraPipe.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return CameraPipe.INSTANCE.create(config);
    }

    @NotNull
    public static final d getCameraPipeIds() {
        return cameraPipeIds;
    }
}
