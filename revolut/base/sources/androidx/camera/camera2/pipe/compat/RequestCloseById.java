package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RequestCloseById;", "Landroidx/camera/camera2/pipe/compat/CameraRequest;", "Landroidx/camera/camera2/pipe/CameraId;", "activeCameraId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getActiveCameraId-Dz_R5H8", "Lskm/q;", "", "deferred", "Lskm/q;", "getDeferred", "()Lskm/q;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestCloseById extends CameraRequest {

    @NotNull
    private final String activeCameraId;

    @NotNull
    private final q deferred;

    public /* synthetic */ RequestCloseById(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    /* JADX INFO: renamed from: getActiveCameraId-Dz_R5H8, reason: not valid java name and from getter */
    public final String getActiveCameraId() {
        return this.activeCameraId;
    }

    @NotNull
    public final q getDeferred() {
        return this.deferred;
    }

    @NotNull
    public String toString() {
        return "RequestCloseById(" + ((Object) CameraId.m186toStringimpl(this.activeCameraId)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RequestCloseById(String activeCameraId) {
        super(null);
        Intrinsics.checkNotNullParameter(activeCameraId, "activeCameraId");
        this.activeCameraId = activeCameraId;
        this.deferred = e0.b();
    }
}
