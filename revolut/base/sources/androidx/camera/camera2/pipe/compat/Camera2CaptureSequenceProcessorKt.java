package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.RequestNumber;
import hx7.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import rkm.f;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/RequestNumber;", "nextRequestNumber", "()J", "Lrkm/d;", "captureSequenceProcessorDebugIds", "Lrkm/d;", "getCaptureSequenceProcessorDebugIds", "()Lrkm/d;", "Lrkm/f;", "captureSequenceDebugIds", "Lrkm/f;", "getCaptureSequenceDebugIds", "()Lrkm/f;", "requestTags", "getRequestTags", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class Camera2CaptureSequenceProcessorKt {

    @NotNull
    private static final d captureSequenceProcessorDebugIds = b.h(0);

    @NotNull
    private static final f captureSequenceDebugIds = b.i();

    @NotNull
    private static final f requestTags = b.i();

    @NotNull
    public static final f getCaptureSequenceDebugIds() {
        return captureSequenceDebugIds;
    }

    @NotNull
    public static final d getCaptureSequenceProcessorDebugIds() {
        return captureSequenceProcessorDebugIds;
    }

    public static final long nextRequestNumber() {
        f fVar = requestTags;
        fVar.getClass();
        return RequestNumber.m319constructorimpl(f.f254897b.incrementAndGet(fVar));
    }
}
