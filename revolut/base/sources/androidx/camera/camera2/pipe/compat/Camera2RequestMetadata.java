package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import q4.d;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R \u0010\b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R \u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R \u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2RequestMetadata;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "cameraCaptureSessionWrapper", "Landroid/hardware/camera2/CaptureRequest;", "captureRequest", "", "", "defaultParameters", "graphParameters", "requiredParameters", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "streams", "Landroidx/camera/camera2/pipe/RequestTemplate;", "template", "", "repeating", "Landroidx/camera/camera2/pipe/Request;", "request", "Landroidx/camera/camera2/pipe/RequestNumber;", "requestNumber", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IZLandroidx/camera/camera2/pipe/Request;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "T", "Landroidx/camera/camera2/pipe/Metadata$Key;", "key", "get", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Ljava/lang/Object;", "default", "getOrDefault", "(Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "Landroid/hardware/camera2/CaptureRequest;", "Ljava/util/Map;", "getStreams", "()Ljava/util/Map;", "I", "getTemplate-fGx8uWA", "()I", "Z", "getRepeating", "()Z", "Landroidx/camera/camera2/pipe/Request;", "getRequest", "()Landroidx/camera/camera2/pipe/Request;", "J", "getRequestNumber-my6kx4g", "()J", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2RequestMetadata implements RequestMetadata {

    @NotNull
    private final CameraCaptureSessionWrapper cameraCaptureSessionWrapper;

    @NotNull
    private final CaptureRequest captureRequest;

    @NotNull
    private final Map<?, Object> defaultParameters;

    @NotNull
    private final Map<?, Object> graphParameters;
    private final boolean repeating;

    @NotNull
    private final Request request;
    private final long requestNumber;

    @NotNull
    private final Map<?, Object> requiredParameters;

    @NotNull
    private final Map<StreamId, Surface> streams;
    private final int template;

    public /* synthetic */ Camera2RequestMetadata(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, CaptureRequest captureRequest, Map map, Map map2, Map map3, Map map4, int i, boolean z, Request request, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraCaptureSessionWrapper, captureRequest, map, map2, map3, map4, i, z, request, j2);
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T get(@NotNull Metadata.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.requiredParameters.containsKey(key) ? (T) this.requiredParameters.get(key) : getRequest().getExtras().containsKey(key) ? (T) getRequest().getExtras().get(key) : this.graphParameters.containsKey(key) ? (T) this.graphParameters.get(key) : (T) this.defaultParameters.get(key);
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T getOrDefault(@NotNull Metadata.Key<T> key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t3 = (T) get(key);
        return t3 == null ? t2 : t3;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public boolean getRepeating() {
        return this.repeating;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    @NotNull
    public Request getRequest() {
        return this.request;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    /* JADX INFO: renamed from: getRequestNumber-my6kx4g, reason: from getter */
    public long getRequestNumber() {
        return this.requestNumber;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    @NotNull
    public Map<StreamId, Surface> getStreams() {
        return this.streams;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        p0 p0Var = o0.f186429a;
        if (Intrinsics.f(type, p0Var.b(CaptureRequest.class))) {
            T t2 = (T) this.captureRequest;
            Intrinsics.i(t2, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2RequestMetadata.unwrapAs");
            return t2;
        }
        if (Intrinsics.f(type, p0Var.b(CameraCaptureSession.class))) {
            T t3 = (T) this.cameraCaptureSessionWrapper.unwrapAs(p0Var.b(CameraCaptureSession.class));
            if (t3 == null) {
                return null;
            }
            return t3;
        }
        if (!Intrinsics.f(type, p0Var.b(d.u()))) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Check failed.");
        }
        T t5 = (T) this.cameraCaptureSessionWrapper.unwrapAs(p0Var.b(d.u()));
        if (t5 == null) {
            return null;
        }
        return t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2RequestMetadata(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, CaptureRequest captureRequest, Map<?, ? extends Object> defaultParameters, Map<?, ? extends Object> graphParameters, Map<?, ? extends Object> requiredParameters, Map<StreamId, ? extends Surface> streams, int i, boolean z, Request request, long j2) {
        Intrinsics.checkNotNullParameter(cameraCaptureSessionWrapper, "cameraCaptureSessionWrapper");
        Intrinsics.checkNotNullParameter(captureRequest, "captureRequest");
        Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
        Intrinsics.checkNotNullParameter(graphParameters, "graphParameters");
        Intrinsics.checkNotNullParameter(requiredParameters, "requiredParameters");
        Intrinsics.checkNotNullParameter(streams, "streams");
        Intrinsics.checkNotNullParameter(request, "request");
        this.cameraCaptureSessionWrapper = cameraCaptureSessionWrapper;
        this.captureRequest = captureRequest;
        this.defaultParameters = defaultParameters;
        this.graphParameters = graphParameters;
        this.requiredParameters = requiredParameters;
        this.streams = streams;
        this.template = i;
        this.repeating = z;
        this.request = request;
        this.requestNumber = j2;
    }
}
