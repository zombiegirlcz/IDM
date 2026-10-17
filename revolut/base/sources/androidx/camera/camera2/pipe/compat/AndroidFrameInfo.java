package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.core.Debug;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidFrameInfo;", "Landroidx/camera/camera2/pipe/FrameInfo;", "Landroid/hardware/camera2/TotalCaptureResult;", "totalCaptureResult", "Landroidx/camera/camera2/pipe/CameraId;", "camera", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "<init>", "(Landroid/hardware/camera2/TotalCaptureResult;Ljava/lang/String;Landroidx/camera/camera2/pipe/RequestMetadata;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Landroid/hardware/camera2/TotalCaptureResult;", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "Landroidx/camera/camera2/pipe/compat/AndroidFrameMetadata;", "result", "Landroidx/camera/camera2/pipe/compat/AndroidFrameMetadata;", "", "Landroidx/camera/camera2/pipe/FrameMetadata;", "physicalResults", "Ljava/util/Map;", "getMetadata", "()Landroidx/camera/camera2/pipe/FrameMetadata;", "metadata", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidFrameInfo implements FrameInfo {

    @NotNull
    private final String camera;

    @NotNull
    private final Map<CameraId, FrameMetadata> physicalResults;

    @NotNull
    private final RequestMetadata requestMetadata;

    @NotNull
    private final AndroidFrameMetadata result;

    @NotNull
    private final TotalCaptureResult totalCaptureResult;

    public /* synthetic */ AndroidFrameInfo(TotalCaptureResult totalCaptureResult, String str, RequestMetadata requestMetadata, DefaultConstructorMarker defaultConstructorMarker) {
        this(totalCaptureResult, str, requestMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: getCamera-Dz_R5H8, reason: not valid java name and from getter */
    public String getCamera() {
        return this.camera;
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    @NotNull
    public FrameMetadata getMetadata() {
        return this.result;
    }

    @NotNull
    public String toString() {
        return "FrameInfo(camera: " + ((Object) CameraId.m186toStringimpl(this.result.getCamera())) + ", frameNumber: " + this.result.mo220getFrameNumberUgla2oM() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        T t2;
        Intrinsics.checkNotNullParameter(type, "type");
        p0 p0Var = o0.f186429a;
        if (Intrinsics.f(type, p0Var.b(CaptureResult.class))) {
            T t3 = (T) this.totalCaptureResult;
            Intrinsics.i(t3, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.AndroidFrameInfo.unwrapAs");
            return t3;
        }
        if (!Intrinsics.f(type, p0Var.b(TotalCaptureResult.class)) || (t2 = (T) this.totalCaptureResult) == null) {
            return null;
        }
        return t2;
    }

    private AndroidFrameInfo(TotalCaptureResult totalCaptureResult, String camera, RequestMetadata requestMetadata) {
        Map<String, CaptureResult> physicalCaptureResults;
        Map<CameraId, FrameMetadata> mapG;
        Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        this.totalCaptureResult = totalCaptureResult;
        this.camera = camera;
        this.requestMetadata = requestMetadata;
        this.result = new AndroidFrameMetadata(totalCaptureResult, getCamera(), null);
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection("physicalCaptureResults");
            if (Build.VERSION.SDK_INT >= 31) {
                physicalCaptureResults = Api31Compat.getPhysicalCameraTotalResults(this.totalCaptureResult);
                Intrinsics.i(physicalCaptureResults, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, android.hardware.camera2.CaptureResult>");
            } else {
                physicalCaptureResults = Api28Compat.getPhysicalCaptureResults(this.totalCaptureResult);
            }
            if (physicalCaptureResults == null || physicalCaptureResults.isEmpty()) {
                mapG = r0.g();
            } else {
                mapG = new ArrayMap<>(physicalCaptureResults.size());
                for (Map.Entry<String, CaptureResult> entry : physicalCaptureResults.entrySet()) {
                    String strM182constructorimpl = CameraId.m182constructorimpl(entry.getKey());
                    mapG.put(CameraId.m181boximpl(strM182constructorimpl), new AndroidFrameMetadata(entry.getValue(), strM182constructorimpl, null));
                }
            }
            Trace.endSection();
            this.physicalResults = mapG;
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }
}
