package androidx.camera.core;

import androidx.tracing.Trace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/camera/core/CameraXTracer;", "", "<init>", "()V", "", "label", "Ljava/lang/Runnable;", "block", "", "trace", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraXTracer {

    @NotNull
    public static final CameraXTracer INSTANCE = new CameraXTracer();

    private CameraXTracer() {
    }

    public static final void trace(@NotNull String label, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace.beginSection("CX:" + label);
        try {
            block.run();
            Unit unit = Unit.f186387a;
        } finally {
            Trace.endSection();
        }
    }
}
