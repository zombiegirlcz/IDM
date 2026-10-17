package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.graph.GraphLoop;
import hx7.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.f;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/camera/camera2/pipe/graph/CaptureLimiter;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "", "requestsUntilActive", "<init>", "(J)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "onStopRepeating", "()V", "onGraphStopped", "onGraphShutdown", "J", "Lrkm/f;", "frameCount", "Lrkm/f;", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "_graphLoop", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "value", "getGraphLoop", "()Landroidx/camera/camera2/pipe/graph/GraphLoop;", "setGraphLoop", "(Landroidx/camera/camera2/pipe/graph/GraphLoop;)V", "graphLoop", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CaptureLimiter implements Request.Listener, GraphLoop.Listener {
    private GraphLoop _graphLoop;

    @NotNull
    private final f frameCount;
    private final long requestsUntilActive;

    public CaptureLimiter(long j2) {
        this.requestsUntilActive = j2;
        if (j2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.frameCount = b.i();
    }

    @NotNull
    public final GraphLoop getGraphLoop() {
        GraphLoop graphLoop = this._graphLoop;
        Intrinsics.h(graphLoop);
        return graphLoop;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onComplete-CcXjc1I */
    public void mo6onCompleteCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo result) {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(result, "result");
        f fVar = this.frameCount;
        do {
            j2 = fVar.f254898a;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!f.f254897b.compareAndSet(fVar, j2, j3));
        if (j3 == this.requestsUntilActive) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Capture processing is now enabled for " + this._graphLoop + " after " + j3 + " frames.";
            }
            getGraphLoop().setCaptureProcessingEnabled(true);
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphShutdown() {
        this.frameCount.f254898a = -1L;
        getGraphLoop().setCaptureProcessingEnabled(false);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphStopped() {
        long j2;
        f fVar = this.frameCount;
        do {
            j2 = fVar.f254898a;
        } while (!f.f254897b.compareAndSet(fVar, j2, j2 != -1 ? 0L : -1L));
        getGraphLoop().setCaptureProcessingEnabled(false);
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            String str = "Capture processing has been disabled for " + getGraphLoop() + " until " + this.requestsUntilActive + " frames have been completed.";
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onStopRepeating() {
    }

    public final void setGraphLoop(@NotNull GraphLoop value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this._graphLoop != null) {
            throw new IllegalStateException("GraphLoop has already been set!");
        }
        this._graphLoop = value;
        value.setCaptureProcessingEnabled(false);
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            String str = "Capture processing has been disabled for " + value + " until " + this.requestsUntilActive + " frames have been completed.";
        }
    }
}
