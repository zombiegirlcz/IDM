package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.graph.GraphListener;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b\n\u0010$R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\r\u0010&¨\u0006'"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RequestOpen;", "Landroidx/camera/camera2/pipe/compat/CameraRequest;", "Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "virtualCamera", "", "Landroidx/camera/camera2/pipe/CameraId;", "sharedCameraIds", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "", "isPrewarm", "Lkotlin/Function1;", "", "isForegroundObserver", "<init>", "(Landroidx/camera/camera2/pipe/compat/VirtualCameraState;Ljava/util/List;Landroidx/camera/camera2/pipe/graph/GraphListener;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "getVirtualCamera", "()Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "Ljava/util/List;", "getSharedCameraIds", "()Ljava/util/List;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "getGraphListener", "()Landroidx/camera/camera2/pipe/graph/GraphListener;", "Z", "()Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RequestOpen extends CameraRequest {

    @NotNull
    private final GraphListener graphListener;

    @NotNull
    private final Function1<Unit, Boolean> isForegroundObserver;
    private final boolean isPrewarm;

    @NotNull
    private final List<CameraId> sharedCameraIds;

    @NotNull
    private final VirtualCameraState virtualCamera;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestOpen(@NotNull VirtualCameraState virtualCamera, @NotNull List<CameraId> sharedCameraIds, @NotNull GraphListener graphListener, boolean z, @NotNull Function1<? super Unit, Boolean> isForegroundObserver) {
        super(null);
        Intrinsics.checkNotNullParameter(virtualCamera, "virtualCamera");
        Intrinsics.checkNotNullParameter(sharedCameraIds, "sharedCameraIds");
        Intrinsics.checkNotNullParameter(graphListener, "graphListener");
        Intrinsics.checkNotNullParameter(isForegroundObserver, "isForegroundObserver");
        this.virtualCamera = virtualCamera;
        this.sharedCameraIds = sharedCameraIds;
        this.graphListener = graphListener;
        this.isPrewarm = z;
        this.isForegroundObserver = isForegroundObserver;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestOpen)) {
            return false;
        }
        RequestOpen requestOpen = (RequestOpen) other;
        return Intrinsics.f(this.virtualCamera, requestOpen.virtualCamera) && Intrinsics.f(this.sharedCameraIds, requestOpen.sharedCameraIds) && Intrinsics.f(this.graphListener, requestOpen.graphListener) && this.isPrewarm == requestOpen.isPrewarm && Intrinsics.f(this.isForegroundObserver, requestOpen.isForegroundObserver);
    }

    @NotNull
    public final List<CameraId> getSharedCameraIds() {
        return this.sharedCameraIds;
    }

    @NotNull
    public final VirtualCameraState getVirtualCamera() {
        return this.virtualCamera;
    }

    public int hashCode() {
        return this.isForegroundObserver.hashCode() + j6.a.c((this.graphListener.hashCode() + p.a.d(this.virtualCamera.hashCode() * 31, 31, this.sharedCameraIds)) * 31, 31, this.isPrewarm);
    }

    @NotNull
    public final Function1<Unit, Boolean> isForegroundObserver() {
        return this.isForegroundObserver;
    }

    /* JADX INFO: renamed from: isPrewarm, reason: from getter */
    public final boolean getIsPrewarm() {
        return this.isPrewarm;
    }

    @NotNull
    public String toString() {
        return "RequestOpen(virtualCamera=" + this.virtualCamera + ", sharedCameraIds=" + this.sharedCameraIds + ", graphListener=" + this.graphListener + ", isPrewarm=" + this.isPrewarm + ", isForegroundObserver=" + this.isForegroundObserver + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
