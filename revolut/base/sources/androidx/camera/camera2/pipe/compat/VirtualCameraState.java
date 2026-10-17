package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.graph.GraphListener;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import skm.e0;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0014\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\n018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/graph/GraphListener;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/compat/CameraState;", "state", "", "emitState", "(Landroidx/camera/camera2/pipe/compat/CameraState;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/camera/camera2/pipe/core/Token;", "wakelockToken", "connect$camera_camera2_pipe", "(Lkotlinx/coroutines/flow/Flow;Landroidx/camera/camera2/pipe/core/Token;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect", "Landroidx/camera/camera2/pipe/CameraError;", "lastCameraError", "disconnect-TPqeGZw", "(Landroidx/camera/camera2/pipe/CameraError;)V", "disconnect", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCameraId-Dz_R5H8", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "getGraphListener", "()Landroidx/camera/camera2/pipe/graph/GraphListener;", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "", "debugId", "I", "", "lock", "Ljava/lang/Object;", "", "closed", "Z", "Landroidx/camera/camera2/pipe/compat/VirtualAndroidCameraDevice;", "currentVirtualAndroidCamera", "Landroidx/camera/camera2/pipe/compat/VirtualAndroidCameraDevice;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_stateFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_states", "Lkotlinx/coroutines/flow/Flow;", "_lastState", "Landroidx/camera/camera2/pipe/compat/CameraState;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "Landroidx/camera/camera2/pipe/core/Token;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "getValue", "()Landroidx/camera/camera2/pipe/compat/CameraState;", "value", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VirtualCameraState implements VirtualCamera {

    @NotNull
    private CameraState _lastState;

    @NotNull
    private final MutableSharedFlow _stateFlow;

    @NotNull
    private final Flow _states;

    @NotNull
    private final String cameraId;
    private boolean closed;
    private VirtualAndroidCameraDevice currentVirtualAndroidCamera;
    private final int debugId;

    @NotNull
    private final GraphListener graphListener;
    private Job job;

    @NotNull
    private final Object lock;

    @NotNull
    private final CoroutineScope scope;
    private Token wakelockToken;

    public /* synthetic */ VirtualCameraState(String str, GraphListener graphListener, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, graphListener, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitState(CameraState state) {
        this._lastState = state;
        if (this._stateFlow.k(state)) {
            return;
        }
        throw new IllegalStateException(("Failed to emit " + state + " in " + this).toString());
    }

    public final Object connect$camera_camera2_pipe(@NotNull Flow flow, Token token, @NotNull Continuation<? super Unit> continuation) {
        synchronized (this.lock) {
            try {
                if (!this.closed) {
                    this.job = e0.C(this.scope, null, null, new VirtualCameraState$connect$2$1(flow, this, null), 3);
                    this.wakelockToken = token;
                    return Unit.f186387a;
                }
                if (token != null) {
                    token.release();
                }
                return Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.VirtualCamera
    /* JADX INFO: renamed from: disconnect-TPqeGZw */
    public void mo432disconnectTPqeGZw(CameraError lastCameraError) {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    String str = "Disconnecting " + this;
                }
                VirtualAndroidCameraDevice virtualAndroidCameraDevice = this.currentVirtualAndroidCamera;
                if (virtualAndroidCameraDevice != null) {
                    virtualAndroidCameraDevice.disconnect$camera_camera2_pipe();
                }
                Job job2 = this.job;
                if (job2 != null) {
                    job2.f(null);
                }
                Token token = this.wakelockToken;
                if (token != null) {
                    token.release();
                }
                if (!(getValue() instanceof CameraStateClosed)) {
                    if (!(this._lastState instanceof CameraStateClosing)) {
                        emitState(new CameraStateClosing(null, 1, null));
                    }
                    emitState(new CameraStateClosed(this.cameraId, ClosedReason.APP_DISCONNECTED, null, null, null, null, null, null, lastCameraError, Constants.TAG_FC_SPEED_MODE, null));
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraId-Dz_R5H8, reason: not valid java name and from getter */
    public final String getCameraId() {
        return this.cameraId;
    }

    @NotNull
    public final GraphListener getGraphListener() {
        return this.graphListener;
    }

    @Override // androidx.camera.camera2.pipe.compat.VirtualCamera
    @NotNull
    /* JADX INFO: renamed from: getState, reason: from getter */
    public Flow get_states() {
        return this._states;
    }

    @NotNull
    public CameraState getValue() {
        CameraState cameraState;
        synchronized (this.lock) {
            cameraState = this._lastState;
        }
        return cameraState;
    }

    @NotNull
    public String toString() {
        return "VirtualCamera-" + this.debugId;
    }

    private VirtualCameraState(String cameraId, GraphListener graphListener, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(graphListener, "graphListener");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.cameraId = cameraId;
        this.graphListener = graphListener;
        this.scope = scope;
        d virtualCameraDebugIds = VirtualCameraKt.getVirtualCameraDebugIds();
        virtualCameraDebugIds.getClass();
        this.debugId = d.f254895b.incrementAndGet(virtualCameraDebugIds);
        this.lock = new Object();
        z1 z1VarB = q.b(3, 4, null);
        this._stateFlow = z1VarB;
        this._states = q.q(z1VarB);
        CameraStateUnopened cameraStateUnopened = CameraStateUnopened.INSTANCE;
        this._lastState = cameraStateUnopened;
        if (!z1VarB.k(cameraStateUnopened)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
