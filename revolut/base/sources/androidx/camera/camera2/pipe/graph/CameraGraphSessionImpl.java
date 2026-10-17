package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import skm.g0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJc\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b-\u0010.JÐ\u0001\u0010A\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u0001002\b\u00104\u001a\u0004\u0018\u00010\u001c2\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207\u0018\u0001052\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207\u0018\u0001052\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0096@¢\u0006\u0004\b?\u0010@JZ\u0010G\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010B\u001a\u0004\u0018\u0001072\b\u0010C\u001a\u0004\u0018\u0001072\b\u0010D\u001a\u0004\u0018\u0001072\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207\u0018\u0001052\u0006\u0010;\u001a\u00020:2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bG\u0010HJ6\u0010K\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010I\u001a\u0002072\u0006\u0010J\u001a\u0002072\u0006\u0010;\u001a\u00020:2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bK\u0010LJ\u001e\u0010N\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010M\u001a\u000207H\u0096@¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010Y\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Landroidx/camera/camera2/pipe/graph/CameraGraphSessionImpl;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "Landroidx/camera/camera2/pipe/core/Token;", "token", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "controller3A", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "frameCaptureQueue", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "parameters", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "listeners", "<init>", "(Landroidx/camera/camera2/pipe/core/Token;Landroidx/camera/camera2/pipe/graph/GraphProcessor;Landroidx/camera/camera2/pipe/graph/Controller3A;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;)V", "", "Landroidx/camera/camera2/pipe/Request;", "requests", "", "submit", "(Ljava/util/List;)V", "request", "startRepeating", "(Landroidx/camera/camera2/pipe/Request;)V", "stopRepeating", "()V", "close", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "update3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lskm/g0;", "update3A", "setTorchOn", "()Lskm/g0;", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lskm/g0;", "setTorchOff", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "lock3A--tS25XM", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerAf", "waitForAwb", "lock3AForCapture", "(ZZIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAf", "unlock3APostCapture", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/core/Token;", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "debugId", "I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraGraphSessionImpl implements CameraGraph.Session {

    @NotNull
    private final Controller3A controller3A;
    private final int debugId;

    @NotNull
    private final FrameCaptureQueue frameCaptureQueue;

    @NotNull
    private final GraphProcessor graphProcessor;

    @NotNull
    private final CameraGraphRequestListenersImpl listeners;

    @NotNull
    private final CameraGraphParametersImpl parameters;

    @NotNull
    private final Token token;

    public CameraGraphSessionImpl(@NotNull Token token, @NotNull GraphProcessor graphProcessor, @NotNull Controller3A controller3A, @NotNull FrameCaptureQueue frameCaptureQueue, @NotNull CameraGraphParametersImpl parameters, @NotNull CameraGraphRequestListenersImpl listeners) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(graphProcessor, "graphProcessor");
        Intrinsics.checkNotNullParameter(controller3A, "controller3A");
        Intrinsics.checkNotNullParameter(frameCaptureQueue, "frameCaptureQueue");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.token = token;
        this.graphProcessor = graphProcessor;
        this.controller3A = controller3A;
        this.frameCaptureQueue = frameCaptureQueue;
        this.parameters = parameters;
        this.listeners = listeners;
        d cameraGraphSessionIds = CameraGraphSessionImplKt.getCameraGraphSessionIds();
        cameraGraphSessionIds.getClass();
        this.debugId = d.f254895b.incrementAndGet(cameraGraphSessionIds);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.parameters.flush();
        List<Request.Listener> listFetchUpdatedListeners$camera_camera2_pipe = this.listeners.fetchUpdatedListeners$camera_camera2_pipe();
        if (listFetchUpdatedListeners$camera_camera2_pipe != null) {
            this.graphProcessor.updateRequestListeners(listFetchUpdatedListeners$camera_camera2_pipe);
        }
        this.token.release();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    /* JADX INFO: renamed from: lock3A--tS25XM */
    public Object mo179lock3AtS25XM(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, Function1<? super FrameMetadata, Boolean> function1, Function1<? super FrameMetadata, Boolean> function12, int i, long j2, long j3, @NotNull Continuation<? super g0> continuation) {
        if (!this.token.getReleased()) {
            return this.controller3A.m452lock3AQz1gx5w(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, function1, function12, i, new Long(j2), new Long(j3), continuation);
        }
        throw new IllegalStateException(("Cannot call lock3A on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object lock3AForCapture(boolean z, boolean z3, int i, long j2, @NotNull Continuation<? super g0> continuation) {
        if (!this.token.getReleased()) {
            return this.controller3A.lock3AForCapture(z, z3, i, j2);
        }
        throw new IllegalStateException(("Cannot call lock3AForCapture on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    @NotNull
    /* JADX INFO: renamed from: setTorchOff-NqN7i0k */
    public g0 mo119setTorchOffNqN7i0k(AeMode aeMode) {
        if (!this.token.getReleased()) {
            return this.controller3A.m453setTorchOffNqN7i0k(aeMode);
        }
        throw new IllegalStateException(("Cannot call setTorchOff on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    @NotNull
    public g0 setTorchOn() {
        if (!this.token.getReleased()) {
            return this.controller3A.setTorchOn();
        }
        throw new IllegalStateException(("Cannot call setTorchOn on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void startRepeating(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!this.token.getReleased()) {
            this.graphProcessor.setRepeatingRequest(request);
            return;
        }
        throw new IllegalStateException(("Cannot call startRepeating on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void stopRepeating() {
        if (!this.token.getReleased()) {
            this.graphProcessor.setRepeatingRequest(null);
            return;
        }
        throw new IllegalStateException(("Cannot call stopRepeating on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void submit(@NotNull List<Request> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        if (this.token.getReleased()) {
            throw new IllegalStateException(("Cannot call submit on " + this + " after close.").toString());
        }
        if (requests.isEmpty()) {
            throw new IllegalStateException("Cannot call submit with an empty list of Requests!");
        }
        this.graphProcessor.submit(requests);
    }

    @NotNull
    public String toString() {
        return "CameraGraph.Session-" + this.debugId;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object unlock3A(Boolean bool, Boolean bool2, Boolean bool3, Function1<? super FrameMetadata, Boolean> function1, int i, long j2, @NotNull Continuation<? super g0> continuation) {
        if (!this.token.getReleased()) {
            return this.controller3A.unlock3A(bool, bool2, bool3, function1, i, new Long(j2));
        }
        throw new IllegalStateException(("Cannot call unlock3A on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object unlock3APostCapture(boolean z, @NotNull Continuation<? super g0> continuation) {
        if (!this.token.getReleased()) {
            return this.controller3A.unlock3APostCapture(z);
        }
        throw new IllegalStateException(("Cannot call unlock3APostCapture on " + this + " after close.").toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    @NotNull
    /* JADX INFO: renamed from: update3A-ydBZfZg */
    public g0 mo120update3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        if (!this.token.getReleased()) {
            return Controller3A.m451update3A169HPGg$default(this.controller3A, aeMode, afMode, awbMode, null, aeRegions, afRegions, awbRegions, 8, null);
        }
        throw new IllegalStateException(("Cannot call update3A on " + this + " after close.").toString());
    }
}
