package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraGraphConfigModule;", "", "config", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "cameraGraphId", "Landroidx/camera/camera2/pipe/CameraGraphId;", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraGraphId;)V", "provideCameraGraphConfig", "provideCameraGraphId", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraGraphConfigModule {

    @NotNull
    private final CameraGraphId cameraGraphId;

    @NotNull
    private final CameraGraph.Config config;

    public CameraGraphConfigModule(@NotNull CameraGraph.Config config, @NotNull CameraGraphId cameraGraphId) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cameraGraphId, "cameraGraphId");
        this.config = config;
        this.cameraGraphId = cameraGraphId;
    }

    @NotNull
    /* JADX INFO: renamed from: provideCameraGraphConfig, reason: from getter */
    public final CameraGraph.Config getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: provideCameraGraphId, reason: from getter */
    public final CameraGraphId getCameraGraphId() {
        return this.cameraGraphId;
    }
}
