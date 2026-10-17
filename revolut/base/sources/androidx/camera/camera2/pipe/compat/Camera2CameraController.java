package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.ConcurrentCameraGraphs;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import ch.qos.logback.core.CoreConstants;
import com.youTransactor.uCube.rpc.Constants;
import gim.c;
import gim.d;
import gim.i;
import ib.b;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import skm.k0;
import skm.q;
import skm.r;
import yhm.o;
import zhm.a1;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u008b\u0001\u008a\u0001B\u0091\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010(J\u0010\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010,J#\u00101\u001a\u00020&2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020&H\u0003¢\u0006\u0004\b6\u0010(J\u000f\u00107\u001a\u00020&H\u0003¢\u0006\u0004\b7\u0010(J\u000f\u00108\u001a\u00020&H\u0003¢\u0006\u0004\b8\u0010(J\u0017\u0010;\u001a\u00020&2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020&H\u0082@¢\u0006\u0004\b=\u0010,J\u0017\u0010@\u001a\u00020&2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ#\u0010F\u001a\u00020&2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010E\u001a\u0004\u0018\u00010DH\u0003¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020*H\u0003¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010OR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010SR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010TR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010UR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010VR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010ZR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010`R(\u0010b\u001a\u00020a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bb\u0010c\u0012\u0004\bh\u0010(\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010i\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u0004\u0018\u00010t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020&0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010|\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R$\u0010~\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010sR\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010sR\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010sR\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u00105R)\u0010\u0087\u0001\u001a\u00020*2\u0007\u0010\u0086\u0001\u001a\u00020*8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0087\u0001\u0010I\"\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraController;", "Landroidx/camera/camera2/pipe/CameraController;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/StrictMode;", "strictMode", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "surfaceTracker", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor;", "cameraStatusMonitor", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "captureSessionFactory", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;", "captureSequenceProcessorFactory", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "camera2DeviceManager", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "camera2Quirks", "Landroidx/camera/camera2/pipe/core/TimeSource;", "timeSource", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "Landroidx/camera/camera2/pipe/compat/Camera2CameraController$ShutdownListener;", "shutdownListener", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencers;", "concurrentSessionSequencers", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/StrictMode;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/GraphListener;Landroidx/camera/camera2/pipe/SurfaceTracker;Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor;Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;Landroidx/camera/camera2/pipe/CameraSurfaceManager;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;Landroidx/camera/camera2/pipe/core/TimeSource;Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/compat/Camera2CameraController$ShutdownListener;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencers;)V", "", "start", "()V", "close", "", "awaitClosed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaceMap", "updateSurfaceMap", "(Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "tryRestart", "startLocked", "stopLocked", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "cameraStatus", "onCameraStatusChanged", "(Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;)V", "bindSessionToCamera", "Landroidx/camera/camera2/pipe/compat/CameraStateClosed;", "cameraState", "onStateClosed", "(Landroidx/camera/camera2/pipe/compat/CameraStateClosed;)V", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", b.Session, "Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "camera", "detachSessionAndCamera", "(Landroidx/camera/camera2/pipe/compat/CaptureSessionState;Landroidx/camera/camera2/pipe/compat/VirtualCamera;)V", "isClosed", "()Z", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/StrictMode;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "Landroidx/camera/camera2/pipe/core/TimeSource;", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getCameraGraphId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "Landroidx/camera/camera2/pipe/compat/Camera2CameraController$ShutdownListener;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "", "lock", "Ljava/lang/Object;", "_isForeground", "Z", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "controllerState", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "getControllerState$camera_camera2_pipe", "()Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "setControllerState$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/CameraController$ControllerState;)V", "getControllerState$camera_camera2_pipe$annotations", "cameraAvailability", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "Landroidx/camera/camera2/pipe/CameraError;", "lastCameraError", "Landroidx/camera/camera2/pipe/CameraError;", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "lastCameraPrioritiesChangedTs", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "Lkotlinx/coroutines/Job;", "restartJob", "Lkotlinx/coroutines/Job;", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "concurrentSessionSequencer", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "Lskm/q;", "closedDeferred", "Lskm/q;", "currentCamera", "Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "currentSession", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "currentSurfaceMap", "Ljava/util/Map;", "currentCameraStateJob", "cameraAvailabilityJob", "cameraPrioritiesJob", "Landroidx/camera/camera2/pipe/CameraId;", "getCameraId-Dz_R5H8", "cameraId", "value", "isForeground", "setForeground", "(Z)V", "Companion", "ShutdownListener", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraController implements CameraController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long PRIORITIES_CHANGED_THRESHOLD_NS = DurationNs.m436constructorimpl(200000000);
    private boolean _isForeground;

    @NotNull
    private final Camera2DeviceManager camera2DeviceManager;

    @NotNull
    private final Camera2Quirks camera2Quirks;

    @NotNull
    private CameraStatusMonitor.CameraStatus cameraAvailability;
    private Job cameraAvailabilityJob;

    @NotNull
    private final CameraGraphId cameraGraphId;
    private Job cameraPrioritiesJob;

    @NotNull
    private final CameraStatusMonitor cameraStatusMonitor;

    @NotNull
    private final CameraSurfaceManager cameraSurfaceManager;

    @NotNull
    private final Camera2CaptureSequenceProcessorFactory captureSequenceProcessorFactory;

    @NotNull
    private final CaptureSessionFactory captureSessionFactory;

    @NotNull
    private final q closedDeferred;
    private final ConcurrentSessionSequencer concurrentSessionSequencer;

    @NotNull
    private CameraController.ControllerState controllerState;
    private VirtualCamera currentCamera;
    private Job currentCameraStateJob;
    private CaptureSessionState currentSession;
    private Map<StreamId, ? extends Surface> currentSurfaceMap;

    @NotNull
    private final CameraGraph.Config graphConfig;

    @NotNull
    private final GraphListener graphListener;
    private CameraError lastCameraError;
    private TimestampNs lastCameraPrioritiesChangedTs;

    @NotNull
    private final Object lock;
    private Job restartJob;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final ShutdownListener shutdownListener;

    @NotNull
    private final StreamGraphImpl streamGraph;

    @NotNull
    private final StrictMode strictMode;

    @NotNull
    private final SurfaceTracker surfaceTracker;

    @NotNull
    private final Threads threads;

    @NotNull
    private final TimeSource timeSource;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraController$1", f = "Camera2CameraController.kt", l = {124}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return Camera2CameraController.this.new AnonymousClass1(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                StateFlow cameraAvailability = Camera2CameraController.this.cameraStatusMonitor.getCameraAvailability();
                final Camera2CameraController camera2CameraController = Camera2CameraController.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                        return emit((CameraStatusMonitor.CameraStatus) obj3, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CameraStatusMonitor.CameraStatus cameraStatus, Continuation<? super Unit> continuation) {
                        if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraAvailable) {
                            if (!CameraId.m184equalsimpl0(((CameraStatusMonitor.CameraStatus.CameraAvailable) cameraStatus).getCameraId(), camera2CameraController.m382getCameraIdDz_R5H8())) {
                                throw new IllegalStateException("Check failed.");
                            }
                            camera2CameraController.onCameraStatusChanged(cameraStatus);
                        } else if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraUnavailable) {
                            if (!CameraId.m184equalsimpl0(((CameraStatusMonitor.CameraStatus.CameraUnavailable) cameraStatus).getCameraId(), camera2CameraController.m382getCameraIdDz_R5H8())) {
                                throw new IllegalStateException("Check failed.");
                            }
                            camera2CameraController.onCameraStatusChanged(cameraStatus);
                        }
                        return Unit.f186387a;
                    }
                };
                this.label = 1;
                if (cameraAvailability.collect(flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraController$2", f = "Camera2CameraController.kt", l = {140}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return Camera2CameraController.this.new AnonymousClass2(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                SharedFlow cameraPriorities = Camera2CameraController.this.cameraStatusMonitor.getCameraPriorities();
                final Camera2CameraController camera2CameraController = Camera2CameraController.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                        return emit((Unit) obj3, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        camera2CameraController.onCameraStatusChanged(CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged.INSTANCE);
                        return Unit.f186387a;
                    }
                };
                this.label = 1;
                if (cameraPriorities.collect(flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraController$Companion;", "", "<init>", "()V", "RESTART_TIMEOUT_WHEN_ENABLED_MS", "", "MS_TO_NS", "", "PRIORITIES_CHANGED_THRESHOLD_NS", "Landroidx/camera/camera2/pipe/core/DurationNs;", "J", "shouldRestart", "", "controllerState", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "lastCameraError", "Landroidx/camera/camera2/pipe/CameraError;", "cameraAvailability", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "lastCameraPrioritiesChangedTs", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "currentTs", "shouldRestart-X9Wt83s$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/CameraController$ControllerState;Landroidx/camera/camera2/pipe/CameraError;Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;Landroidx/camera/camera2/pipe/core/TimestampNs;J)Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX INFO: renamed from: shouldRestart-X9Wt83s$camera_camera2_pipe, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m383shouldRestartX9Wt83s$camera_camera2_pipe(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.CameraController.ControllerState r5, androidx.camera.camera2.pipe.CameraError r6, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus r7, androidx.camera.camera2.pipe.core.TimestampNs r8, long r9) {
            /*
                r4 = this;
                java.lang.String r0 = "controllerState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "cameraAvailability"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r7 = r7 instanceof androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraAvailable
                r0 = 1
                r1 = 0
                if (r7 == 0) goto L26
                androidx.camera.camera2.pipe.CameraError$Companion r7 = androidx.camera.camera2.pipe.CameraError.INSTANCE
                int r7 = r7.m141getERROR_CAMERA_DISABLEDv7Vf74A()
                if (r6 != 0) goto L1a
                r7 = r1
                goto L22
            L1a:
                int r2 = r6.getValue()
                boolean r7 = androidx.camera.camera2.pipe.CameraError.m132equalsimpl0(r2, r7)
            L22:
                if (r7 != 0) goto L26
                r7 = r0
                goto L27
            L26:
                r7 = r1
            L27:
                if (r8 != 0) goto L2b
            L29:
                r8 = r1
                goto L3f
            L2b:
                long r2 = r8.getValue()
                long r9 = r9 - r2
                long r8 = androidx.camera.camera2.pipe.core.DurationNs.m436constructorimpl(r9)
                long r2 = androidx.camera.camera2.pipe.compat.Camera2CameraController.access$getPRIORITIES_CHANGED_THRESHOLD_NS$cp()
                int r8 = androidx.camera.camera2.pipe.core.DurationNs.m435compareTozYRVrok(r8, r2)
                if (r8 > 0) goto L29
                r8 = r0
            L3f:
                androidx.camera.camera2.pipe.CameraController$ControllerState$DISCONNECTED r9 = androidx.camera.camera2.pipe.CameraController.ControllerState.DISCONNECTED.INSTANCE
                boolean r9 = kotlin.jvm.internal.Intrinsics.f(r5, r9)
                if (r9 == 0) goto L69
                if (r7 != 0) goto L68
                if (r8 == 0) goto L4c
                goto L68
            L4c:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 29
                if (r6 > r5) goto L58
                r6 = 33
                if (r5 >= r6) goto L58
                r5 = r0
                goto L59
            L58:
                r5 = r1
            L59:
                if (r5 == 0) goto L9a
                androidx.camera.camera2.pipe.core.Log r5 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r5 = r5.getDEBUG_LOGGABLE()
                if (r5 == 0) goto L68
                java.lang.String r5 = "CXCP"
                java.lang.String r6 = "Quirk for multi-resume activated: Kicking off restart."
            L68:
                return r0
            L69:
                androidx.camera.camera2.pipe.CameraController$ControllerState$ERROR r8 = androidx.camera.camera2.pipe.CameraController.ControllerState.ERROR.INSTANCE
                boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r8)
                if (r5 == 0) goto L9a
                if (r7 == 0) goto L9a
                androidx.camera.camera2.pipe.CameraError$Companion r5 = androidx.camera.camera2.pipe.CameraError.INSTANCE
                int r7 = r5.m149getERROR_GRAPH_CONFIGv7Vf74A()
                if (r6 != 0) goto L7d
                r7 = r1
                goto L85
            L7d:
                int r8 = r6.getValue()
                boolean r7 = androidx.camera.camera2.pipe.CameraError.m132equalsimpl0(r8, r7)
            L85:
                if (r7 != 0) goto L9a
                int r5 = r5.m151getERROR_SECURITY_EXCEPTIONv7Vf74A()
                if (r6 != 0) goto L8f
                r5 = r1
                goto L97
            L8f:
                int r6 = r6.getValue()
                boolean r5 = androidx.camera.camera2.pipe.CameraError.m132equalsimpl0(r6, r5)
            L97:
                if (r5 != 0) goto L9a
                return r0
            L9a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CameraController.Companion.m383shouldRestartX9Wt83s$camera_camera2_pipe(androidx.camera.camera2.pipe.CameraController$ControllerState, androidx.camera.camera2.pipe.CameraError, androidx.camera.camera2.pipe.internal.CameraStatusMonitor$CameraStatus, androidx.camera.camera2.pipe.core.TimestampNs, long):boolean");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraController$ShutdownListener;", "", "onControllerClosed", "", "cameraController", "Landroidx/camera/camera2/pipe/CameraController;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ShutdownListener {
        void onControllerClosed(@NotNull CameraController cameraController);
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraController", f = "Camera2CameraController.kt", l = {340}, m = "awaitClosed", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18361 extends c {
        int label;
        /* synthetic */ Object result;

        public C18361(Continuation<? super C18361> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return Camera2CameraController.this.awaitClosed(this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$startLocked$5, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraController$startLocked$5", f = "Camera2CameraController.kt", l = {Constants.TAG_FB_CHARGING_STATUS}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass5 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return Camera2CameraController.this.new AnonymousClass5(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                Camera2CameraController camera2CameraController = Camera2CameraController.this;
                this.label = 1;
                if (camera2CameraController.bindSessionToCamera(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$tryRestart$2, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraController$tryRestart$2", f = "Camera2CameraController.kt", l = {181}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18372 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayMs;
        int label;
        final /* synthetic */ Camera2CameraController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18372(long j2, Camera2CameraController camera2CameraController, Continuation<? super C18372> continuation) {
            super(2, continuation);
            this.$delayMs = j2;
            this.this$0 = camera2CameraController;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new C18372(this.$delayMs, this.this$0, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                long j2 = this.$delayMs;
                this.label = 1;
                if (k0.b(j2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            Object obj3 = this.this$0.lock;
            Camera2CameraController camera2CameraController = this.this$0;
            synchronized (obj3) {
                try {
                    if (!camera2CameraController.isClosed() && !Intrinsics.f(camera2CameraController.getControllerState(), CameraController.ControllerState.STOPPING.INSTANCE) && !Intrinsics.f(camera2CameraController.getControllerState(), CameraController.ControllerState.STOPPED.INSTANCE)) {
                        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                            String str = "Restarting " + camera2CameraController + "...";
                        }
                        camera2CameraController.surfaceTracker.registerAllSurfaces();
                        camera2CameraController.stopLocked();
                        camera2CameraController.startLocked();
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18372) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public Camera2CameraController(@NotNull CoroutineScope scope, @NotNull Threads threads, @NotNull StrictMode strictMode, @NotNull CameraGraph.Config graphConfig, @NotNull GraphListener graphListener, @NotNull SurfaceTracker surfaceTracker, @NotNull CameraStatusMonitor cameraStatusMonitor, @NotNull CaptureSessionFactory captureSessionFactory, @NotNull Camera2CaptureSequenceProcessorFactory captureSequenceProcessorFactory, @NotNull Camera2DeviceManager camera2DeviceManager, @NotNull CameraSurfaceManager cameraSurfaceManager, @NotNull Camera2Quirks camera2Quirks, @NotNull TimeSource timeSource, @NotNull CameraGraphId cameraGraphId, @NotNull ShutdownListener shutdownListener, @NotNull StreamGraphImpl streamGraph, @NotNull ConcurrentSessionSequencers concurrentSessionSequencers) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(strictMode, "strictMode");
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        Intrinsics.checkNotNullParameter(graphListener, "graphListener");
        Intrinsics.checkNotNullParameter(surfaceTracker, "surfaceTracker");
        Intrinsics.checkNotNullParameter(cameraStatusMonitor, "cameraStatusMonitor");
        Intrinsics.checkNotNullParameter(captureSessionFactory, "captureSessionFactory");
        Intrinsics.checkNotNullParameter(captureSequenceProcessorFactory, "captureSequenceProcessorFactory");
        Intrinsics.checkNotNullParameter(camera2DeviceManager, "camera2DeviceManager");
        Intrinsics.checkNotNullParameter(cameraSurfaceManager, "cameraSurfaceManager");
        Intrinsics.checkNotNullParameter(camera2Quirks, "camera2Quirks");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(cameraGraphId, "cameraGraphId");
        Intrinsics.checkNotNullParameter(shutdownListener, "shutdownListener");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(concurrentSessionSequencers, "concurrentSessionSequencers");
        this.scope = scope;
        this.threads = threads;
        this.strictMode = strictMode;
        this.graphConfig = graphConfig;
        this.graphListener = graphListener;
        this.surfaceTracker = surfaceTracker;
        this.cameraStatusMonitor = cameraStatusMonitor;
        this.captureSessionFactory = captureSessionFactory;
        this.captureSequenceProcessorFactory = captureSequenceProcessorFactory;
        this.camera2DeviceManager = camera2DeviceManager;
        this.cameraSurfaceManager = cameraSurfaceManager;
        this.camera2Quirks = camera2Quirks;
        this.timeSource = timeSource;
        this.cameraGraphId = cameraGraphId;
        this.shutdownListener = shutdownListener;
        this.streamGraph = streamGraph;
        this.lock = new Object();
        this._isForeground = true;
        this.controllerState = CameraController.ControllerState.STOPPED.INSTANCE;
        this.cameraAvailability = new CameraStatusMonitor.CameraStatus.CameraUnavailable(m382getCameraIdDz_R5H8(), null);
        ConcurrentCameraGraphs concurrentCameraGraphs$camera_camera2_pipe = graphConfig.getConcurrentCameraGraphs();
        this.concurrentSessionSequencer = concurrentCameraGraphs$camera_camera2_pipe != null ? concurrentSessionSequencers.getSequencer(getCameraGraphId(), concurrentCameraGraphs$camera_camera2_pipe) : null;
        this.closedDeferred = e0.b();
        this.cameraAvailabilityJob = e0.C(scope, null, null, new AnonymousClass1(null), 3);
        this.cameraPrioritiesJob = e0.C(scope, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bindSessionToCamera(Continuation<? super Unit> continuation) {
        VirtualCamera virtualCamera;
        CaptureSessionState captureSessionState;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.lock) {
            virtualCamera = this.currentCamera;
            captureSessionState = this.currentSession;
            ref$ObjectRef.f186409a = captureSessionState;
            Unit unit = Unit.f186387a;
        }
        if (virtualCamera == null || captureSessionState == null) {
            return Unit.f186387a;
        }
        Object objCollect = virtualCamera.get_states().collect(new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.bindSessionToCamera.3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                return emit((CameraState) obj2, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(CameraState cameraState, Continuation<? super Unit> continuation2) {
                if (cameraState instanceof CameraStateOpen) {
                    ((CaptureSessionState) ref$ObjectRef.f186409a).setCameraDevice(((CameraStateOpen) cameraState).getCameraDevice());
                } else if (cameraState instanceof CameraStateClosing) {
                    ((CaptureSessionState) ref$ObjectRef.f186409a).shutdown();
                } else if (cameraState instanceof CameraStateClosed) {
                    ((CaptureSessionState) ref$ObjectRef.f186409a).shutdown();
                    this.onStateClosed((CameraStateClosed) cameraState);
                }
                return Unit.f186387a;
            }
        }, continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    private final void detachSessionAndCamera(CaptureSessionState session, VirtualCamera camera) {
        a2 a2VarC = e0.C(this.scope, null, null, new Camera2CameraController$detachSessionAndCamera$job$1(session, camera, null), 3);
        if (Intrinsics.f(this.controllerState, CameraController.ControllerState.CLOSING.INSTANCE)) {
            a2VarC.k(new w.b(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detachSessionAndCamera$lambda$0(Camera2CameraController camera2CameraController, Throwable th10) {
        synchronized (camera2CameraController.lock) {
            try {
                camera2CameraController.controllerState = CameraController.ControllerState.CLOSED.INSTANCE;
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    String str = camera2CameraController + " is closed";
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th11) {
                throw th11;
            }
        }
        camera2CameraController.shutdownListener.onControllerClosed(camera2CameraController);
        q qVar = camera2CameraController.closedDeferred;
        Unit unit2 = Unit.f186387a;
        ((r) qVar).U(unit2);
        e0.k(camera2CameraController.scope, null);
        return unit2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosed() {
        return Intrinsics.f(this.controllerState, CameraController.ControllerState.CLOSING.INSTANCE) || Intrinsics.f(this.controllerState, CameraController.ControllerState.CLOSED.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraStatusChanged(CameraStatusMonitor.CameraStatus cameraStatus) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " (" + ((Object) CameraId.m186toStringimpl(m382getCameraIdDz_R5H8())) + ") camera status changed: " + cameraStatus;
        }
        synchronized (this.lock) {
            try {
                if (isClosed()) {
                    return;
                }
                if ((cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraAvailable) || (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraUnavailable)) {
                    this.cameraAvailability = cameraStatus;
                } else if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged) {
                    this.lastCameraPrioritiesChangedTs = TimestampNs.m442boximpl(this.timeSource.mo441nowvQl9yQU());
                }
                tryRestart();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStateClosed(CameraStateClosed cameraState) {
        synchronized (this.lock) {
            try {
                if (isClosed()) {
                    return;
                }
                if (cameraState.getCameraErrorCode() != null) {
                    this.lastCameraError = cameraState.getCameraErrorCode();
                    if (CameraError.m134isDisconnectedimpl(cameraState.getCameraErrorCode().getValue())) {
                        this.controllerState = CameraController.ControllerState.DISCONNECTED.INSTANCE;
                        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                            String str = this + " is disconnected";
                        }
                    } else {
                        this.controllerState = CameraController.ControllerState.ERROR.INSTANCE;
                        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                            String str2 = this + " encountered error: " + ((Object) CameraError.m135toStringimpl(cameraState.getCameraErrorCode().getValue()));
                        }
                    }
                } else {
                    this.controllerState = CameraController.ControllerState.STOPPED.INSTANCE;
                }
                this.surfaceTracker.unregisterAllSurfaces();
                tryRestart();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLocked() {
        Set<CameraId> setB;
        if (isClosed()) {
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                String str = "Ignoring start(): " + this + " is already closed";
                return;
            }
            return;
        }
        CameraController.ControllerState controllerState = this.controllerState;
        CameraController.ControllerState.STARTED started = CameraController.ControllerState.STARTED.INSTANCE;
        if (Intrinsics.f(controllerState, started)) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str2 = "Ignoring start(): " + this + " is already started";
                return;
            }
            return;
        }
        this.lastCameraError = null;
        String strM154getCameraDz_R5H8 = this.graphConfig.getCamera();
        ConcurrentCameraGraphs concurrentCameraGraphs$camera_camera2_pipe = this.graphConfig.getConcurrentCameraGraphs();
        if (concurrentCameraGraphs$camera_camera2_pipe == null || (setB = concurrentCameraGraphs$camera_camera2_pipe.getCameraIds()) == null) {
            setB = y0.b(CameraId.m181boximpl(strM154getCameraDz_R5H8));
        }
        VirtualCamera virtualCameraMo395openzDSwpeU = this.camera2DeviceManager.mo395openzDSwpeU(strM154getCameraDz_R5H8, d0.d1(a1.j(setB, CameraId.m181boximpl(strM154getCameraDz_R5H8))), this.graphListener, false, new w.b(this, 1));
        if (virtualCameraMo395openzDSwpeU == null) {
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                String str3 = "Failed to start " + this + ": Open request submission failed";
                return;
            }
            return;
        }
        if (this.currentCamera != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.currentSession != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.currentCamera = virtualCameraMo395openzDSwpeU;
        CaptureSessionState captureSessionState = new CaptureSessionState(this.graphListener, this.captureSessionFactory, this.captureSequenceProcessorFactory, this.cameraSurfaceManager, this.timeSource, this.graphConfig.getFlags(), this.concurrentSessionSequencer, this.streamGraph, this.strictMode, this.threads, this.scope);
        this.currentSession = captureSessionState;
        Map<StreamId, ? extends Surface> map = this.currentSurfaceMap;
        if (map != null) {
            captureSessionState.configureSurfaceMap(map);
        }
        this.controllerState = started;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str4 = "Started " + this;
        }
        Job job2 = this.currentCameraStateJob;
        if (job2 != null) {
            job2.f(null);
        }
        this.currentCameraStateJob = e0.C(this.scope, null, null, new AnonymousClass5(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startLocked$lambda$2(Camera2CameraController camera2CameraController, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        return camera2CameraController.isForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocked() {
        if (isClosed()) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Ignoring stop(): " + this + " is already closed";
                return;
            }
            return;
        }
        CameraController.ControllerState controllerState = this.controllerState;
        CameraController.ControllerState.STOPPING stopping = CameraController.ControllerState.STOPPING.INSTANCE;
        if (Intrinsics.f(controllerState, stopping) || Intrinsics.f(this.controllerState, CameraController.ControllerState.STOPPED.INSTANCE)) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str2 = "Ignoring stop(): " + this + " already stopping or stopped";
                return;
            }
            return;
        }
        VirtualCamera virtualCamera = this.currentCamera;
        CaptureSessionState captureSessionState = this.currentSession;
        this.currentCamera = null;
        this.currentSession = null;
        this.controllerState = stopping;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str3 = "Stopping " + this;
        }
        detachSessionAndCamera(captureSessionState, virtualCamera);
    }

    private final void tryRestart() {
        long jMo441nowvQl9yQU = this.timeSource.mo441nowvQl9yQU();
        if (INSTANCE.m383shouldRestartX9Wt83s$camera_camera2_pipe(this.controllerState, this.lastCameraError, this.cameraAvailability, this.lastCameraPrioritiesChangedTs, jMo441nowvQl9yQU)) {
            long j2 = this.graphConfig.getFlags().getEnableRestartDelays() ? 700L : 0L;
            Job job2 = this.restartJob;
            if (job2 != null) {
                job2.f(null);
            }
            this.restartJob = e0.C(this.scope, null, null, new C18372(j2, this, null), 3);
            return;
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + ": Not restarting. Controller state = " + getControllerState() + ", last camera error = " + this.lastCameraError + ", camera availability = " + this.cameraAvailability + ", last camera priorities changed = " + this.lastCameraPrioritiesChangedTs + ", current timestamp = " + ((Object) TimestampNs.m447toStringimpl(jMo441nowvQl9yQU)) + CoreConstants.DOT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitClosed(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.compat.Camera2CameraController.C18361
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2CameraController.C18361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto Lb5
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            androidx.camera.camera2.pipe.core.Log r7 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r2 = r7.getDEBUG_LOGGABLE()
            if (r2 == 0) goto L4f
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = "#awaitClosed"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L4f:
            java.lang.Object r2 = r6.lock
            monitor-enter(r2)
            androidx.camera.camera2.pipe.CameraController$ControllerState r4 = r6.controllerState     // Catch: java.lang.Throwable -> L77
            androidx.camera.camera2.pipe.CameraController$ControllerState$CLOSED r5 = androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSED.INSTANCE     // Catch: java.lang.Throwable -> L77
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L7d
            boolean r7 = r7.getDEBUG_LOGGABLE()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L79
            java.lang.String r7 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L77
            r0.append(r6)     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "#awaitClosed: Controller is already closed."
            r0.append(r1)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L77
            goto L79
        L77:
            r7 = move-exception
            goto Lb8
        L79:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L77
            monitor-exit(r2)
            return r7
        L7d:
            androidx.camera.camera2.pipe.CameraController$ControllerState r4 = r6.controllerState     // Catch: java.lang.Throwable -> L77
            androidx.camera.camera2.pipe.CameraController$ControllerState$CLOSING r5 = androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSING.INSTANCE     // Catch: java.lang.Throwable -> L77
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto La5
            boolean r7 = r7.getWARN_LOGGABLE()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto La1
            java.lang.String r7 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L77
            r0.append(r6)     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "#awaitClosed: Controller isn't closing!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L77
        La1:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L77
            monitor-exit(r2)
            return r7
        La5:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L77
            monitor-exit(r2)
            skm.q r7 = r6.closedDeferred
            r0.label = r3
            skm.r r7 = (skm.r) r7
            java.lang.Object r7 = r7.y(r0)
            if (r7 != r1) goto Lb5
            return r1
        Lb5:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        Lb8:
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CameraController.awaitClosed(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void close() {
        synchronized (this.lock) {
            try {
                if (isClosed()) {
                    return;
                }
                this.controllerState = CameraController.ControllerState.CLOSING.INSTANCE;
                Log log2 = Log.INSTANCE;
                if (log2.getDEBUG_LOGGABLE()) {
                    String str = "Closed " + this;
                }
                VirtualCamera virtualCamera = this.currentCamera;
                CaptureSessionState captureSessionState = this.currentSession;
                this.currentCamera = null;
                this.currentSession = null;
                Job job2 = this.restartJob;
                if (job2 != null) {
                    job2.f(null);
                }
                Job job3 = this.currentCameraStateJob;
                if (job3 != null) {
                    job3.f(null);
                }
                this.currentCameraStateJob = null;
                Job job4 = this.cameraAvailabilityJob;
                if (job4 != null) {
                    job4.f(null);
                }
                this.cameraAvailabilityJob = null;
                Job job5 = this.cameraPrioritiesJob;
                if (job5 != null) {
                    job5.f(null);
                }
                this.cameraPrioritiesJob = null;
                v1.c.z(this.cameraStatusMonitor);
                detachSessionAndCamera(captureSessionState, virtualCamera);
                if (this.graphConfig.getFlags().getCloseCameraDeviceOnClose() || this.camera2Quirks.m408x552c1673(m382getCameraIdDz_R5H8())) {
                    if (log2.getDEBUG_LOGGABLE()) {
                        String str2 = "Quirk: Closing " + ((Object) CameraId.m186toStringimpl(m382getCameraIdDz_R5H8())) + " during " + this + "#close";
                    }
                    this.camera2DeviceManager.mo394closeEfqyGwQ(m382getCameraIdDz_R5H8());
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @NotNull
    public CameraGraphId getCameraGraphId() {
        return this.cameraGraphId;
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public String m382getCameraIdDz_R5H8() {
        return this.graphConfig.getCamera();
    }

    @NotNull
    /* JADX INFO: renamed from: getControllerState$camera_camera2_pipe, reason: from getter */
    public final CameraController.ControllerState getControllerState() {
        return this.controllerState;
    }

    public boolean isForeground() {
        boolean z;
        synchronized (this.lock) {
            z = this._isForeground;
        }
        return z;
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void setForeground(boolean z) {
        synchronized (this.lock) {
            this._isForeground = z;
            Unit unit = Unit.f186387a;
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void start() {
        synchronized (this.lock) {
            startLocked();
            Unit unit = Unit.f186387a;
        }
    }

    @NotNull
    public String toString() {
        return "Camera2CameraController(" + getCameraGraphId() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void updateSurfaceMap(@NotNull Map<StreamId, ? extends Surface> surfaceMap) {
        Intrinsics.checkNotNullParameter(surfaceMap, "surfaceMap");
        synchronized (this.lock) {
            if (isClosed()) {
                return;
            }
            this.currentSurfaceMap = surfaceMap;
            CaptureSessionState captureSessionState = this.currentSession;
            if (captureSessionState != null) {
                captureSessionState.configureSurfaceMap(surfaceMap);
            }
        }
    }
}
