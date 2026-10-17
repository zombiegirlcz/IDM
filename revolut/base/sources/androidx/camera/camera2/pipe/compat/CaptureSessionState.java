package androidx.camera.camera2.pipe.compat;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.core.Timestamps;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.GraphRequestProcessor;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import gim.d;
import gim.i;
import ib.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rkm.h;
import skm.e0;
import v1.c;
import vc.s;
import yhm.o;
import zhm.a1;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ~2\u00020\u0001:\u0004\u007f\u0080\u0001~Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010$J\u0017\u0010)\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001eH\u0016¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010+J\r\u0010.\u001a\u00020\u001e¢\u0006\u0004\b.\u0010+J\u0019\u00103\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b7\u0010$J\u0019\u0010:\u001a\u00020\u001e2\b\b\u0002\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b<\u0010=J7\u0010@\u001a\u00020\u001e2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0003¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010IR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010KR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u0002080S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010URT\u0010X\u001aB\u0012\f\u0012\n W*\u0004\u0018\u00010\u001b0\u001b\u0012\f\u0012\n W*\u0004\u0018\u00010\u001c0\u001c W* \u0012\f\u0012\n W*\u0004\u0018\u00010\u001b0\u001b\u0012\f\u0012\n W*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001a0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YRT\u0010[\u001aB\u0012\f\u0012\n W*\u0004\u0018\u00010Z0Z\u0012\f\u0012\n W*\u0004\u0018\u00010\u001c0\u001c W* \u0012\f\u0012\n W*\u0004\u0018\u00010Z0Z\u0012\f\u0012\n W*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001a0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u0004\u0018\u00010_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020h\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010YR$\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bj\u0010YR\u0016\u0010l\u001a\u00020k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010pR$\u0010t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010YR$\u0010w\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u00060uj\u0002`v0V8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bw\u0010YR(\u0010}\u001a\u0004\u0018\u00010b2\b\u0010x\u001a\u0004\u0018\u00010b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u0081\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "captureSessionFactory", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;", "captureSequenceProcessorFactory", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "Landroidx/camera/camera2/pipe/core/TimeSource;", "timeSource", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "cameraGraphFlags", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "concurrentSessionSequencer", "Landroidx/camera/camera2/pipe/StreamGraph;", "streamGraph", "Landroidx/camera/camera2/pipe/StrictMode;", "strictMode", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Landroidx/camera/camera2/pipe/graph/GraphListener;Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;Landroidx/camera/camera2/pipe/CameraSurfaceManager;Landroidx/camera/camera2/pipe/core/TimeSource;Landroidx/camera/camera2/pipe/CameraGraph$Flags;Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;Landroidx/camera/camera2/pipe/StreamGraph;Landroidx/camera/camera2/pipe/StrictMode;Landroidx/camera/camera2/pipe/core/Threads;Lkotlinx/coroutines/CoroutineScope;)V", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "", "configureSurfaceMap", "(Ljava/util/Map;)V", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", b.Session, "onActive", "(Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;)V", "onClosed", "onConfigureFailed", "onConfigured", "onReady", "onCaptureQueueEmpty", "onSessionDisconnected", "()V", "onSessionFinalized", "disconnect", "shutdown", "", "delayMs", "finalizeSession$camera_camera2_pipe", "(J)V", "finalizeSession", "", "toString", "()Ljava/lang/String;", "configure", "", "retryAllowed", "finalizeOutputsIfAvailable", "(Z)V", "tryCreateCaptureSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oldSurfaceMap", "newSurfaceMap", "updateTrackedSurfaces", "(Ljava/util/Map;Ljava/util/Map;)V", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "Landroidx/camera/camera2/pipe/core/TimeSource;", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "Landroidx/camera/camera2/pipe/StreamGraph;", "Landroidx/camera/camera2/pipe/StrictMode;", "Landroidx/camera/camera2/pipe/core/Threads;", "Lkotlinx/coroutines/CoroutineScope;", "", "debugId", "I", "", "lock", "Ljava/lang/Object;", "Lrkm/h;", "finalized", "Lrkm/h;", "", "kotlin.jvm.PlatformType", "activeStreamSurfaceMap", "Ljava/util/Map;", "Landroidx/camera/camera2/pipe/OutputId;", "activeOutputSurfaceMap", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "sessionCreatingTimestamp", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "Landroidx/camera/camera2/pipe/compat/SessionSequencer;", "sessionSequencer", "Landroidx/camera/camera2/pipe/compat/SessionSequencer;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "_cameraDevice", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState$ConfiguredCameraCaptureSession;", "cameraCaptureSession", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState$ConfiguredCameraCaptureSession;", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "pendingOutputMap", "pendingSurfaceMap", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState$State;", "state", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState$State;", "Ljava/util/concurrent/CountDownLatch;", "sessionDisconnected", "Ljava/util/concurrent/CountDownLatch;", "hasAttemptedCaptureSession", "Z", "captureSessionAttemptCompleted", "_surfaceMap", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "_surfaceTokenMap", "value", "getCameraDevice", "()Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "setCameraDevice", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;)V", "cameraDevice", "Companion", "State", "ConfiguredCameraCaptureSession", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CaptureSessionState implements CameraCaptureSessionWrapper.StateCallback {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private CameraDeviceWrapper _cameraDevice;
    private Map<StreamId, ? extends Surface> _surfaceMap;

    @NotNull
    private final Map<Surface, AutoCloseable> _surfaceTokenMap;
    private final Map<OutputId, Surface> activeOutputSurfaceMap;
    private final Map<StreamId, Surface> activeStreamSurfaceMap;
    private ConfiguredCameraCaptureSession cameraCaptureSession;

    @NotNull
    private final CameraGraph.Flags cameraGraphFlags;

    @NotNull
    private final CameraSurfaceManager cameraSurfaceManager;

    @NotNull
    private final Camera2CaptureSequenceProcessorFactory captureSequenceProcessorFactory;

    @NotNull
    private final CountDownLatch captureSessionAttemptCompleted;

    @NotNull
    private final CaptureSessionFactory captureSessionFactory;
    private final ConcurrentSessionSequencer concurrentSessionSequencer;
    private final int debugId;

    @NotNull
    private final h finalized;

    @NotNull
    private final GraphListener graphListener;
    private boolean hasAttemptedCaptureSession;

    @NotNull
    private final Object lock;
    private Map<StreamId, ? extends OutputConfigurationWrapper> pendingOutputMap;
    private Map<StreamId, ? extends Surface> pendingSurfaceMap;

    @NotNull
    private final CoroutineScope scope;
    private TimestampNs sessionCreatingTimestamp;

    @NotNull
    private final CountDownLatch sessionDisconnected;
    private final SessionSequencer sessionSequencer;

    @NotNull
    private State state;

    @NotNull
    private final StreamGraph streamGraph;

    @NotNull
    private final StrictMode strictMode;

    @NotNull
    private final Threads threads;

    @NotNull
    private final TimeSource timeSource;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionState$Companion;", "", "<init>", "()V", "CAPTURE_SESSION_TIMEOUT_MS", "", "ABORT_CAPTURES_TIMEOUT_MS", "CLOSE_SESSION_TIMEOUT_MS", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionState$ConfiguredCameraCaptureSession;", "", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", b.Session, "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "processor", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessor;", "captureSequenceProcessor", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "getSession", "()Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "getProcessor", "()Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessor;", "getCaptureSequenceProcessor", "()Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessor;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfiguredCameraCaptureSession {
        private final Camera2CaptureSequenceProcessor captureSequenceProcessor;

        @NotNull
        private final GraphRequestProcessor processor;

        @NotNull
        private final CameraCaptureSessionWrapper session;

        public ConfiguredCameraCaptureSession(@NotNull CameraCaptureSessionWrapper session, @NotNull GraphRequestProcessor processor, Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(processor, "processor");
            this.session = session;
            this.processor = processor;
            this.captureSequenceProcessor = camera2CaptureSequenceProcessor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfiguredCameraCaptureSession)) {
                return false;
            }
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = (ConfiguredCameraCaptureSession) other;
            return Intrinsics.f(this.session, configuredCameraCaptureSession.session) && Intrinsics.f(this.processor, configuredCameraCaptureSession.processor) && Intrinsics.f(this.captureSequenceProcessor, configuredCameraCaptureSession.captureSequenceProcessor);
        }

        public final Camera2CaptureSequenceProcessor getCaptureSequenceProcessor() {
            return this.captureSequenceProcessor;
        }

        @NotNull
        public final GraphRequestProcessor getProcessor() {
            return this.processor;
        }

        @NotNull
        public final CameraCaptureSessionWrapper getSession() {
            return this.session;
        }

        public int hashCode() {
            int iHashCode = (this.processor.hashCode() + (this.session.hashCode() * 31)) * 31;
            Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor = this.captureSequenceProcessor;
            return iHashCode + (camera2CaptureSequenceProcessor == null ? 0 : camera2CaptureSequenceProcessor.hashCode());
        }

        @NotNull
        public String toString() {
            return "ConfiguredCameraCaptureSession(session=" + this.session + ", processor=" + this.processor + ", captureSequenceProcessor=" + this.captureSequenceProcessor + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionState$State;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "CREATING", "CREATED", "CLOSING", "CLOSED", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State PENDING = new State("PENDING", 0);
        public static final State CREATING = new State("CREATING", 1);
        public static final State CREATED = new State("CREATED", 2);
        public static final State CLOSING = new State("CLOSING", 3);
        public static final State CLOSED = new State("CLOSED", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{PENDING, CREATING, CREATED, CLOSING, CLOSED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = s.n(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$12, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$12", f = "CaptureSessionState.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass12 extends i implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ ConfiguredCameraCaptureSession $captureSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(ConfiguredCameraCaptureSession configuredCameraCaptureSession, Continuation<? super AnonymousClass12> continuation) {
            super(1, continuation);
            this.$captureSession = configuredCameraCaptureSession;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CaptureSessionState.this.new AnonymousClass12(this.$captureSession, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            Debug debug = Debug.INSTANCE;
            String str = CaptureSessionState.this + " CameraCaptureSessionWrapper#close";
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.$captureSession;
            CaptureSessionState captureSessionState = CaptureSessionState.this;
            try {
                Trace.beginSection(str);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    String str2 = "Closing capture session for " + captureSessionState;
                }
                c.x(configuredCameraCaptureSession.getSession());
                Unit unit = Unit.f186387a;
                Trace.endSection();
                return Unit.f186387a;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass12) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$3, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$3", f = "CaptureSessionState.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function1<Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(1, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CaptureSessionState.this.new AnonymousClass3(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws InterruptedException {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            CaptureSessionState.this.captureSessionAttemptCompleted.await();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$9, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$9", f = "CaptureSessionState.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass9 extends i implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ GraphRequestProcessor $graphProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(GraphRequestProcessor graphRequestProcessor, Continuation<? super AnonymousClass9> continuation) {
            super(1, continuation);
            this.$graphProcessor = graphRequestProcessor;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CaptureSessionState.this.new AnonymousClass9(this.$graphProcessor, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            Debug debug = Debug.INSTANCE;
            String str = CaptureSessionState.this + " stopRepeating";
            GraphRequestProcessor graphRequestProcessor = this.$graphProcessor;
            try {
                Trace.beginSection(str);
                graphRequestProcessor.stopRepeating$camera_camera2_pipe();
                Unit unit = Unit.f186387a;
                Trace.endSection();
                String str2 = CaptureSessionState.this + " abortCaptures";
                GraphRequestProcessor graphRequestProcessor2 = this.$graphProcessor;
                try {
                    Trace.beginSection(str2);
                    graphRequestProcessor2.abortCaptures$camera_camera2_pipe();
                    Trace.endSection();
                    return Unit.f186387a;
                } finally {
                }
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass9) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$tryCreateCaptureSession$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState", f = "CaptureSessionState.kt", l = {567}, m = "tryCreateCaptureSession", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends gim.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CaptureSessionState.this.tryCreateCaptureSession(this);
        }
    }

    public CaptureSessionState(@NotNull GraphListener graphListener, @NotNull CaptureSessionFactory captureSessionFactory, @NotNull Camera2CaptureSequenceProcessorFactory captureSequenceProcessorFactory, @NotNull CameraSurfaceManager cameraSurfaceManager, @NotNull TimeSource timeSource, @NotNull CameraGraph.Flags cameraGraphFlags, ConcurrentSessionSequencer concurrentSessionSequencer, @NotNull StreamGraph streamGraph, @NotNull StrictMode strictMode, @NotNull Threads threads, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(graphListener, "graphListener");
        Intrinsics.checkNotNullParameter(captureSessionFactory, "captureSessionFactory");
        Intrinsics.checkNotNullParameter(captureSequenceProcessorFactory, "captureSequenceProcessorFactory");
        Intrinsics.checkNotNullParameter(cameraSurfaceManager, "cameraSurfaceManager");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(cameraGraphFlags, "cameraGraphFlags");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(strictMode, "strictMode");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.graphListener = graphListener;
        this.captureSessionFactory = captureSessionFactory;
        this.captureSequenceProcessorFactory = captureSequenceProcessorFactory;
        this.cameraSurfaceManager = cameraSurfaceManager;
        this.timeSource = timeSource;
        this.cameraGraphFlags = cameraGraphFlags;
        this.concurrentSessionSequencer = concurrentSessionSequencer;
        this.streamGraph = streamGraph;
        this.strictMode = strictMode;
        this.threads = threads;
        this.scope = scope;
        rkm.d captureSessionDebugIds = CaptureSessionStateKt.getCaptureSessionDebugIds();
        captureSessionDebugIds.getClass();
        this.debugId = rkm.d.f254895b.incrementAndGet(captureSessionDebugIds);
        this.lock = new Object();
        this.finalized = hx7.b.j(Boolean.FALSE);
        this.activeStreamSurfaceMap = Collections.synchronizedMap(new HashMap());
        this.activeOutputSurfaceMap = Collections.synchronizedMap(new HashMap());
        this.sessionSequencer = concurrentSessionSequencer != null ? new SessionSequencer(concurrentSessionSequencer) : null;
        this.state = State.PENDING;
        this.sessionDisconnected = new CountDownLatch(1);
        this.captureSessionAttemptCompleted = new CountDownLatch(1);
        this._surfaceTokenMap = new LinkedHashMap();
    }

    private final void configure(CameraCaptureSessionWrapper session) {
        synchronized (this.lock) {
            try {
                ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
                if (configuredCameraCaptureSession == null && session != null) {
                    Camera2CaptureSequenceProcessorFactory camera2CaptureSequenceProcessorFactory = this.captureSequenceProcessorFactory;
                    Map<StreamId, Surface> activeStreamSurfaceMap = this.activeStreamSurfaceMap;
                    Intrinsics.checkNotNullExpressionValue(activeStreamSurfaceMap, "activeStreamSurfaceMap");
                    Map<OutputId, Surface> activeOutputSurfaceMap = this.activeOutputSurfaceMap;
                    Intrinsics.checkNotNullExpressionValue(activeOutputSurfaceMap, "activeOutputSurfaceMap");
                    CaptureSequenceProcessor<?, ?> captureSequenceProcessorCreate = camera2CaptureSequenceProcessorFactory.create(session, activeStreamSurfaceMap, activeOutputSurfaceMap);
                    configuredCameraCaptureSession = captureSequenceProcessorCreate instanceof Camera2CaptureSequenceProcessor ? new ConfiguredCameraCaptureSession(session, GraphRequestProcessor.INSTANCE.from(captureSequenceProcessorCreate), (Camera2CaptureSequenceProcessor) captureSequenceProcessorCreate) : new ConfiguredCameraCaptureSession(session, GraphRequestProcessor.INSTANCE.from(captureSequenceProcessorCreate), null);
                    this.cameraCaptureSession = configuredCameraCaptureSession;
                }
                if (this.state == State.CREATED && configuredCameraCaptureSession != null) {
                    boolean z = (this.pendingOutputMap == null || this.pendingSurfaceMap == null) ? false : true;
                    Unit unit = Unit.f186387a;
                    if (z) {
                        finalizeOutputsIfAvailable(false);
                    }
                    synchronized (this.lock) {
                        try {
                            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                                Timestamps timestamps = Timestamps.INSTANCE;
                                long jMo441nowvQl9yQU = this.timeSource.mo441nowvQl9yQU();
                                TimestampNs timestampNs = this.sessionCreatingTimestamp;
                                Intrinsics.h(timestampNs);
                                long jM436constructorimpl = DurationNs.m436constructorimpl(jMo441nowvQl9yQU - timestampNs.getValue());
                                StringBuilder sb6 = new StringBuilder("Configured ");
                                sb6.append(this);
                                sb6.append(" in ");
                                String str = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jM436constructorimpl / 1000000.0d)}, 1));
                                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                sb6.append(str);
                                sb6.toString();
                            }
                            this.graphListener.onGraphStarted(configuredCameraCaptureSession.getProcessor());
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    }
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    private final void finalizeOutputsIfAvailable(boolean retryAllowed) {
        ConfiguredCameraCaptureSession configuredCameraCaptureSession;
        Map<StreamId, ? extends OutputConfigurationWrapper> map;
        Map<StreamId, ? extends Surface> map2;
        boolean z;
        synchronized (this.lock) {
            configuredCameraCaptureSession = this.cameraCaptureSession;
            map = this.pendingOutputMap;
            map2 = this.pendingSurfaceMap;
            Unit unit = Unit.f186387a;
        }
        if (configuredCameraCaptureSession == null || map == null || map2 == null) {
            return;
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        Timestamps timestamps = Timestamps.INSTANCE;
        long jMo441nowvQl9yQU = this.timeSource.mo441nowvQl9yQU();
        for (Map.Entry<StreamId, ? extends OutputConfigurationWrapper> entry : map.entrySet()) {
            int value = entry.getKey().getValue();
            OutputConfigurationWrapper value2 = entry.getValue();
            Surface surface = map2.get(StreamId.m355boximpl(value));
            if (surface == null) {
                throw new IllegalStateException("Required value was null.");
            }
            value2.addSurface(surface);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<StreamId, ? extends OutputConfigurationWrapper>> it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(it8.next().getValue());
        }
        configuredCameraCaptureSession.getSession().finalizeOutputConfigurations(d0.d1(linkedHashSet));
        synchronized (this.lock) {
            try {
                if (this.state == State.CREATED) {
                    this.activeStreamSurfaceMap.putAll(map2);
                    Iterator<Map.Entry<StreamId, ? extends Surface>> it9 = map2.entrySet().iterator();
                    while (true) {
                        z = true;
                        if (it9.hasNext()) {
                            Map.Entry<StreamId, ? extends Surface> next = it9.next();
                            int value3 = next.getKey().getValue();
                            Surface value4 = next.getValue();
                            CameraStream cameraStreamM353getaKI5c8E = this.streamGraph.m353getaKI5c8E(value3);
                            if (cameraStreamM353getaKI5c8E == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (cameraStreamM353getaKI5c8E.getOutputs().size() != 1) {
                                throw new IllegalStateException("Cannot finalize a multi-output stream!");
                            }
                            Map<OutputId, Surface> activeOutputSurfaceMap = this.activeOutputSurfaceMap;
                            Intrinsics.checkNotNullExpressionValue(activeOutputSurfaceMap, "activeOutputSurfaceMap");
                            activeOutputSurfaceMap.put(OutputId.m244boximpl(((OutputStream) d0.K0(cameraStreamM353getaKI5c8E.getOutputs())).getId()), value4);
                        } else if (Log.INSTANCE.getINFO_LOGGABLE()) {
                            Timestamps timestamps2 = Timestamps.INSTANCE;
                            long jM436constructorimpl = DurationNs.m436constructorimpl(this.timeSource.mo441nowvQl9yQU() - jMo441nowvQl9yQU);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Finalized ");
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator<Map.Entry<StreamId, ? extends OutputConfigurationWrapper>> it10 = map.entrySet().iterator();
                            while (it10.hasNext()) {
                                arrayList.add(StreamId.m355boximpl(it10.next().getKey().getValue()));
                            }
                            sb6.append(arrayList);
                            sb6.append(" for ");
                            sb6.append(this);
                            sb6.append(" in ");
                            Timestamps timestamps3 = Timestamps.INSTANCE;
                            String str = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jM436constructorimpl / 1000000.0d)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            sb6.append(str);
                            sb6.toString();
                        }
                    }
                } else {
                    z = false;
                }
                Unit unit2 = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z && retryAllowed) {
            this.graphListener.onGraphModified(configuredCameraCaptureSession.getProcessor());
        }
        Debug debug2 = Debug.INSTANCE;
        Trace.endSection();
    }

    public static /* synthetic */ void finalizeOutputsIfAvailable$default(CaptureSessionState captureSessionState, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        captureSessionState.finalizeOutputsIfAvailable(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryCreateCaptureSession(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CaptureSessionState.tryCreateCaptureSession(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void updateTrackedSurfaces(Map<StreamId, ? extends Surface> oldSurfaceMap, Map<StreamId, ? extends Surface> newSurfaceMap) throws Exception {
        boolean zIsTerminated;
        Set setI1 = d0.i1(oldSurfaceMap.values());
        Set setI12 = d0.i1(newSurfaceMap.values());
        for (Surface surface : a1.k(setI1, setI12)) {
            AutoCloseable autoCloseableRemove = this._surfaceTokenMap.remove(surface);
            if (autoCloseableRemove == null) {
                autoCloseableRemove = null;
            } else if (autoCloseableRemove instanceof AutoCloseable) {
                autoCloseableRemove.close();
            } else if (autoCloseableRemove instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseableRemove;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseableRemove instanceof TypedArray) {
                ((TypedArray) autoCloseableRemove).recycle();
            } else {
                if (!(autoCloseableRemove instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseableRemove).release();
            }
            if (autoCloseableRemove == null) {
                throw new IllegalStateException(("Surface " + surface + " doesn't have a matching surface token!").toString());
            }
        }
        for (Surface surface2 : a1.k(setI12, setI1)) {
            this._surfaceTokenMap.put(surface2, this.cameraSurfaceManager.registerSurface$camera_camera2_pipe(surface2));
        }
    }

    public final void configureSurfaceMap(@NotNull Map<StreamId, ? extends Surface> surfaces) {
        Intrinsics.checkNotNullParameter(surfaces, "surfaces");
        synchronized (this.lock) {
            try {
                State state = this.state;
                if (state != State.CLOSING && state != State.CLOSED) {
                    Map<StreamId, ? extends Surface> mapG = this._surfaceMap;
                    if (mapG == null) {
                        mapG = r0.g();
                    }
                    updateTrackedSurfaces(mapG, surfaces);
                    this._surfaceMap = surfaces;
                    Map<StreamId, ? extends OutputConfigurationWrapper> map = this.pendingOutputMap;
                    if (map != null && this.pendingSurfaceMap == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<StreamId, ? extends Surface> entry : surfaces.entrySet()) {
                            if (map.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map.size()) {
                            this.pendingSurfaceMap = linkedHashMap;
                            e0.C(this.scope, null, null, new CaptureSessionState$configureSurfaceMap$1$1(this, null), 3);
                        }
                    }
                    e0.C(this.scope, null, null, new CaptureSessionState$configureSurfaceMap$1$2(this, null), 3);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void disconnect() {
        synchronized (this.lock) {
            try {
                State state = this.state;
                State state2 = State.CLOSING;
                if (state != state2 && state != State.CLOSED) {
                    this.state = state2;
                    ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
                    boolean z = false;
                    if (configuredCameraCaptureSession != null) {
                        this.cameraCaptureSession = null;
                    } else {
                        if (this.cameraGraphFlags.getCloseCaptureSessionOnDisconnect() && this.hasAttemptedCaptureSession) {
                            z = true;
                        }
                        configuredCameraCaptureSession = null;
                    }
                    Unit unit = Unit.f186387a;
                    SessionSequencer sessionSequencer = this.sessionSequencer;
                    if (sessionSequencer != null) {
                        sessionSequencer.release();
                    }
                    if (z) {
                        Log log2 = Log.INSTANCE;
                        if (log2.getDEBUG_LOGGABLE()) {
                        }
                        if (((Unit) this.threads.runBlockingCheckedOrNull(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, new AnonymousClass3(null))) != null || log2.getERROR_LOGGABLE()) {
                        }
                        synchronized (this.lock) {
                            configuredCameraCaptureSession = this.cameraCaptureSession;
                            this.cameraCaptureSession = null;
                        }
                    }
                    Debug debug = Debug.INSTANCE;
                    Trace.beginSection(this.graphListener + "#onGraphStopping");
                    this.graphListener.onGraphStopping();
                    Trace.endSection();
                    if (configuredCameraCaptureSession != null) {
                        GraphRequestProcessor processor = configuredCameraCaptureSession.getProcessor();
                        Log log3 = Log.INSTANCE;
                        if (log3.getDEBUG_LOGGABLE()) {
                            String str = this + " Shutdown";
                        }
                        Trace.beginSection(this + "#shutdown");
                        if (!this.cameraGraphFlags.getAbortCapturesOnStop() || ((Unit) this.threads.runBlockingCheckedOrNull(2000L, new AnonymousClass9(processor, null))) != null || log3.getERROR_LOGGABLE()) {
                        }
                        Trace.beginSection(this + "#disconnect");
                        Camera2CaptureSequenceProcessor captureSequenceProcessor = configuredCameraCaptureSession.getCaptureSequenceProcessor();
                        if (captureSequenceProcessor != null) {
                            captureSequenceProcessor.disconnect$camera_camera2_pipe();
                        }
                        Trace.endSection();
                        if (!this.cameraGraphFlags.getCloseCaptureSessionOnDisconnect() || ((Unit) this.threads.runBlockingCheckedOrNull(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, new AnonymousClass12(configuredCameraCaptureSession, null))) != null || log3.getERROR_LOGGABLE()) {
                        }
                        Trace.beginSection(this.graphListener + "#onGraphStopped");
                        this.graphListener.onGraphStopped(processor);
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.graphListener + "#onGraphStopped");
                        this.graphListener.onGraphStopped(null);
                        Trace.endSection();
                    }
                    this.sessionDisconnected.countDown();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void finalizeSession$camera_camera2_pipe(long delayMs) throws Exception {
        List<AutoCloseable> listD1;
        boolean zIsTerminated;
        if (delayMs != 0) {
            e0.C(this.scope, null, null, new CaptureSessionState$finalizeSession$1(delayMs, this, null), 3);
            return;
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = "Finalizing " + this;
        }
        synchronized (this.lock) {
            listD1 = d0.d1(this._surfaceTokenMap.values());
            this._surfaceTokenMap.clear();
        }
        for (AutoCloseable autoCloseable : listD1) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onActive(@NotNull CameraCaptureSessionWrapper session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " Active";
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onCaptureQueueEmpty(@NotNull CameraCaptureSessionWrapper session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " CaptureQueueEmpty";
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onClosed(@NotNull CameraCaptureSessionWrapper session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " Closed";
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(this + "#onClosed");
        shutdown();
        this.captureSessionAttemptCompleted.countDown();
        SessionSequencer sessionSequencer = this.sessionSequencer;
        if (sessionSequencer != null) {
            sessionSequencer.release();
        }
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onConfigureFailed(@NotNull CameraCaptureSessionWrapper session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            String str = this + " Configuration Failed";
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(this + "#onConfigureFailed");
        this.graphListener.onGraphError(new GraphState.GraphStateError(CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false, null));
        shutdown();
        this.captureSessionAttemptCompleted.countDown();
        SessionSequencer sessionSequencer = this.sessionSequencer;
        if (sessionSequencer != null) {
            sessionSequencer.release();
        }
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onConfigured(@NotNull CameraCaptureSessionWrapper session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " Configured";
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(this + "#configure");
        configure(session);
        this.captureSessionAttemptCompleted.countDown();
        SessionSequencer sessionSequencer = this.sessionSequencer;
        if (sessionSequencer != null) {
            sessionSequencer.release();
        }
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onReady(@NotNull CameraCaptureSessionWrapper session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " Ready";
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public void onSessionDisconnected() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " session disconnecting";
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(this + "#onSessionDisconnected");
        disconnect();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.sessionDisconnected.await();
            Unit unit = Unit.f186387a;
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public void onSessionFinalized() throws Exception {
        if (this.finalized.a(Boolean.FALSE, Boolean.TRUE)) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str = this + " session finalizing";
            }
            Debug debug = Debug.INSTANCE;
            Trace.beginSection(this + "#onSessionFinalized");
            shutdown();
            finalizeSession$camera_camera2_pipe(0L);
            Trace.endSection();
        }
    }

    public final void setCameraDevice(CameraDeviceWrapper cameraDeviceWrapper) {
        synchronized (this.lock) {
            try {
                State state = this.state;
                if (state != State.CLOSING && state != State.CLOSED) {
                    this._cameraDevice = cameraDeviceWrapper;
                    if (cameraDeviceWrapper != null) {
                        e0.C(this.scope, null, null, new CaptureSessionState$cameraDevice$2$1(this, null), 3);
                    }
                    Unit unit = Unit.f186387a;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void shutdown() {
        /*
            r8 = this;
            r8.disconnect()
            java.lang.Object r0 = r8.lock
            monitor-enter(r0)
            androidx.camera.camera2.pipe.compat.CaptureSessionState$State r1 = r8.state     // Catch: java.lang.Throwable -> L38
            androidx.camera.camera2.pipe.compat.CaptureSessionState$State r2 = androidx.camera.camera2.pipe.compat.CaptureSessionState.State.CLOSED     // Catch: java.lang.Throwable -> L38
            r3 = 0
            if (r1 == r2) goto L3a
            androidx.camera.camera2.pipe.compat.CameraDeviceWrapper r1 = r8._cameraDevice     // Catch: java.lang.Throwable -> L38
            r5 = 1
            if (r1 == 0) goto L3b
            boolean r1 = r8.hasAttemptedCaptureSession     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L18
            goto L3b
        L18:
            androidx.camera.camera2.pipe.CameraGraph$Flags r1 = r8.cameraGraphFlags     // Catch: java.lang.Throwable -> L38
            int r1 = r1.getFinalizeSessionOnCloseBehavior()     // Catch: java.lang.Throwable -> L38
            androidx.camera.camera2.pipe.CameraGraph$Flags$FinalizeSessionOnCloseBehavior$Companion r6 = androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.INSTANCE     // Catch: java.lang.Throwable -> L38
            int r7 = r6.m165getIMMEDIATEBm6Tfm4()     // Catch: java.lang.Throwable -> L38
            boolean r7 = androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.m162equalsimpl0(r1, r7)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L2b
            goto L3b
        L2b:
            int r6 = r6.m167getTIMEOUTBm6Tfm4()     // Catch: java.lang.Throwable -> L38
            boolean r1 = androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.m162equalsimpl0(r1, r6)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            r3 = 2000(0x7d0, double:9.88E-321)
            goto L3b
        L38:
            r1 = move-exception
            goto L49
        L3a:
            r5 = 0
        L3b:
            r1 = 0
            r8._cameraDevice = r1     // Catch: java.lang.Throwable -> L38
            r8.state = r2     // Catch: java.lang.Throwable -> L38
            kotlin.Unit r1 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            if (r5 == 0) goto L48
            r8.finalizeSession$camera_camera2_pipe(r3)
        L48:
            return
        L49:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CaptureSessionState.shutdown():void");
    }

    @NotNull
    public String toString() {
        return "CaptureSessionState-" + this.debugId;
    }
}
