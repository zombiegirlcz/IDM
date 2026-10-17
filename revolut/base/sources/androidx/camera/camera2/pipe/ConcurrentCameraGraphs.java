package androidx.camera.camera2.pipe;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "", "", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphIds", "Landroidx/camera/camera2/pipe/CameraId;", "cameraIds", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getCameraGraphIds", "()Ljava/util/Set;", "getCameraIds", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConcurrentCameraGraphs {

    @NotNull
    private final Set<CameraGraphId> cameraGraphIds;

    @NotNull
    private final Set<CameraId> cameraIds;

    public ConcurrentCameraGraphs(@NotNull Set<CameraGraphId> cameraGraphIds, @NotNull Set<CameraId> cameraIds) {
        Intrinsics.checkNotNullParameter(cameraGraphIds, "cameraGraphIds");
        Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
        this.cameraGraphIds = cameraGraphIds;
        this.cameraIds = cameraIds;
        if (cameraGraphIds.size() <= 1) {
            throw new IllegalStateException("Check failed.");
        }
        if (cameraGraphIds.size() != cameraIds.size()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConcurrentCameraGraphs)) {
            return false;
        }
        ConcurrentCameraGraphs concurrentCameraGraphs = (ConcurrentCameraGraphs) other;
        return Intrinsics.f(this.cameraGraphIds, concurrentCameraGraphs.cameraGraphIds) && Intrinsics.f(this.cameraIds, concurrentCameraGraphs.cameraIds);
    }

    @NotNull
    public final Set<CameraGraphId> getCameraGraphIds() {
        return this.cameraGraphIds;
    }

    @NotNull
    public final Set<CameraId> getCameraIds() {
        return this.cameraIds;
    }

    public int hashCode() {
        return this.cameraIds.hashCode() + (this.cameraGraphIds.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ConcurrentCameraGraphs(cameraGraphIds=" + this.cameraGraphIds + ", cameraIds=" + this.cameraIds + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
