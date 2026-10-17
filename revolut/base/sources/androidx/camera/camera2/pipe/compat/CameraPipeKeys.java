package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.Metadata;
import kotlin.Metadata;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraPipeKeys;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/Metadata$Key;", "", "camera2ExtensionMode", "Landroidx/camera/camera2/pipe/Metadata$Key;", "getCamera2ExtensionMode", "()Landroidx/camera/camera2/pipe/Metadata$Key;", "camera2CaptureRequestTag", "getCamera2CaptureRequestTag", "", "ignore3ARequiredParameters", "getIgnore3ARequiredParameters", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraPipeKeys {

    @NotNull
    public static final CameraPipeKeys INSTANCE = new CameraPipeKeys();

    @NotNull
    private static final Metadata.Key<Object> camera2CaptureRequestTag;

    @NotNull
    private static final Metadata.Key<Integer> camera2ExtensionMode;

    @NotNull
    private static final Metadata.Key<Boolean> ignore3ARequiredParameters;

    static {
        Metadata.Key.Companion companion = Metadata.Key.INSTANCE;
        p0 p0Var = o0.f186429a;
        camera2ExtensionMode = companion.create("androidx.camera.camera2.pipe.extensionMode", p0Var.b(Integer.class));
        camera2CaptureRequestTag = companion.create("androidx.camera.camera2.pipe.captureRequestTag", p0Var.b(Object.class));
        ignore3ARequiredParameters = companion.create("androidx.camera.camera2.pipe.ignore3ARequiredParameters", p0Var.b(Boolean.class));
    }

    private CameraPipeKeys() {
    }

    @NotNull
    public final Metadata.Key<Object> getCamera2CaptureRequestTag() {
        return camera2CaptureRequestTag;
    }

    @NotNull
    public final Metadata.Key<Integer> getCamera2ExtensionMode() {
        return camera2ExtensionMode;
    }

    @NotNull
    public final Metadata.Key<Boolean> getIgnore3ARequiredParameters() {
        return ignore3ARequiredParameters;
    }
}
