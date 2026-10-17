package androidx.camera.camera2.pipe.graph;

import aim.f;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestsKt;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.ProcessingQueue;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import skm.b0;
import skm.e0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u0000 \u0085\u00012\u00020\u0001:\u0004\u0086\u0001\u0085\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001e\u0010%\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020'2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b(\u0010)J7\u0010.\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010/J-\u00101\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J/\u00104\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'2\b\b\u0002\u00103\u001a\u00020\u0015H\u0002¢\u0006\u0004\b4\u00105J-\u00107\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J-\u0010:\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J.\u0010=\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u00020<H\u0082@¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\bA\u0010@J\u001e\u0010B\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0004\bB\u0010&J\u000f\u0010C\u001a\u00020\u0015H\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u00020\u001b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020#0\bH\u0002¢\u0006\u0004\bH\u0010FJ;\u0010K\u001a\u00020\u00152\u0006\u0010I\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0014\b\u0002\u0010J\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR \u0010\u0006\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR \u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010OR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010OR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0014\u0010Q\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020#0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010^\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010NR\"\u0010_\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010NR\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010OR\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010]R\"\u0010e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010NR\"\u0010f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010NR\"\u0010g\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010NR\u001c\u0010h\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010OR\u0018\u0010i\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010[R(\u0010o\u001a\u0004\u0018\u00010Y2\b\u0010j\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR(\u0010t\u001a\u0004\u0018\u00010\u00132\b\u0010j\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR<\u0010y\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010j\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR<\u0010|\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010j\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010v\"\u0004\b{\u0010xR1\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\t0\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010~\"\u0004\b\u007f\u0010FR(\u0010\u0084\u0001\u001a\u00020\u00152\u0006\u0010j\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0081\u0001\u0010D\"\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphLoop;", "Ljava/io/Closeable;", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "", "", "defaultParameters", "requiredParameters", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "requiredListeners", "Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "listeners", "Lkotlinx/coroutines/CoroutineScope;", "shutdownScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraphId;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/camera/camera2/pipe/Request;", "requests", "", "submit", "(Ljava/util/List;)Z", "parameters", "trigger", "(Ljava/util/Map;)Z", "", "invalidate", "()V", "close", "", "toString", "()Ljava/lang/String;", "", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "commands", "process", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "selectGraphCommand", "(Ljava/util/List;)I", "idx", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Capture;", "command", "repeatAllowed", "processCapture", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$Capture;Z)V", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Trigger;", "processTrigger", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$Trigger;)V", "captureAllowed", "processRepeat", "(Ljava/util/List;IZ)V", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Parameters;", "processParameters", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$Parameters;)V", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Listeners;", "processListeners", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$Listeners;)V", "Landroidx/camera/camera2/pipe/graph/GraphCommand$RequestProcessor;", "processRequestProcessor", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$RequestProcessor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processStop", "(Ljava/util/List;I)V", "processAbort", "processShutdown", "reissueRepeatingRequest", "()Z", "abortRequests", "(Ljava/util/List;)V", "unprocessedCommands", "finalizeUnprocessedCommands", "isRepeating", "oneTimeRequiredParameters", "buildAndSubmit", "(ZLjava/util/List;Ljava/util/Map;)Z", "Landroidx/camera/camera2/pipe/CameraGraphId;", "Ljava/util/Map;", "Ljava/util/List;", "Lkotlinx/coroutines/CoroutineScope;", "graphLoopScope", "Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "processingQueue", "Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "lock", "Ljava/lang/Object;", "closed", "Z", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "_requestProcessor", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "_repeatingRequest", "Landroidx/camera/camera2/pipe/Request;", "_graphParameters", "_graph3AParameters", "_requestListeners", "Lrkm/b;", "_captureProcessingEnabled", "Lrkm/b;", "currentRepeatingRequest", "currentGraphParameters", "currentGraph3AParameters", "currentRequiredParameters", "currentRequestListeners", "currentRequestProcessor", "value", "getRequestProcessor", "()Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "setRequestProcessor", "(Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;)V", "requestProcessor", "getRepeatingRequest", "()Landroidx/camera/camera2/pipe/Request;", "setRepeatingRequest", "(Landroidx/camera/camera2/pipe/Request;)V", "repeatingRequest", "getGraphParameters", "()Ljava/util/Map;", "setGraphParameters", "(Ljava/util/Map;)V", "graphParameters", "getGraph3AParameters", "setGraph3AParameters", "graph3AParameters", "getRequestListeners", "()Ljava/util/List;", "setRequestListeners", "requestListeners", "getCaptureProcessingEnabled", "setCaptureProcessingEnabled", "(Z)V", "captureProcessingEnabled", "Companion", "Listener", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphLoop implements Closeable {

    @NotNull
    private final b _captureProcessingEnabled;

    @NotNull
    private Map<?, ? extends Object> _graph3AParameters;

    @NotNull
    private Map<?, ? extends Object> _graphParameters;
    private Request _repeatingRequest;

    @NotNull
    private List<? extends Request.Listener> _requestListeners;
    private GraphRequestProcessor _requestProcessor;

    @NotNull
    private final CameraGraphId cameraGraphId;
    private volatile boolean closed;

    @NotNull
    private Map<?, ? extends Object> currentGraph3AParameters;

    @NotNull
    private Map<?, ? extends Object> currentGraphParameters;
    private Request currentRepeatingRequest;

    @NotNull
    private List<? extends Request.Listener> currentRequestListeners;
    private GraphRequestProcessor currentRequestProcessor;

    @NotNull
    private Map<?, ? extends Object> currentRequiredParameters;

    @NotNull
    private final Map<?, Object> defaultParameters;

    @NotNull
    private final CoroutineScope graphLoopScope;

    @NotNull
    private final List<Listener> listeners;

    @NotNull
    private final Object lock;

    @NotNull
    private final ProcessingQueue<GraphCommand> processingQueue;

    @NotNull
    private final List<Request.Listener> requiredListeners;

    @NotNull
    private final Map<?, Object> requiredParameters;

    @NotNull
    private final CoroutineScope shutdownScope;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "", "onStopRepeating", "", "onGraphStopped", "onGraphShutdown", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onGraphShutdown();

        void onGraphStopped();

        void onStopRepeating();
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.graph.GraphLoop$finalizeUnprocessedCommands$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.graph.GraphLoop$finalizeUnprocessedCommands$1", f = "GraphLoop.kt", l = {630, 631}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GraphCommand $command;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GraphCommand graphCommand, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$command = graphCommand;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.$command, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        
            if (r5.shutdown$camera_camera2_pipe(r4) == r0) goto L19;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r5)
                goto L45
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                yhm.o.b(r5)
                goto L32
            L1c:
                yhm.o.b(r5)
                androidx.camera.camera2.pipe.graph.GraphCommand r5 = r4.$command
                androidx.camera.camera2.pipe.graph.GraphCommand$RequestProcessor r5 = (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) r5
                androidx.camera.camera2.pipe.graph.GraphRequestProcessor r5 = r5.getOld()
                if (r5 == 0) goto L32
                r4.label = r3
                java.lang.Object r5 = r5.shutdown$camera_camera2_pipe(r4)
                if (r5 != r0) goto L32
                goto L44
            L32:
                androidx.camera.camera2.pipe.graph.GraphCommand r5 = r4.$command
                androidx.camera.camera2.pipe.graph.GraphCommand$RequestProcessor r5 = (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) r5
                androidx.camera.camera2.pipe.graph.GraphRequestProcessor r5 = r5.getNew()
                if (r5 == 0) goto L45
                r4.label = r2
                java.lang.Object r5 = r5.shutdown$camera_camera2_pipe(r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r5 = kotlin.Unit.f186387a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.pipe.graph.GraphLoop", f = "GraphLoop.kt", l = {479, DefaultFrameSampler.DESIRED_FRAME_WIDTH, 488}, m = "processRequestProcessor", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18441 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C18441(Continuation<? super C18441> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GraphLoop.this.processRequestProcessor(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.graph.GraphLoop$processShutdown$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.pipe.graph.GraphLoop", f = "GraphLoop.kt", l = {566, 572, 573}, m = "processShutdown", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18451 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18451(Continuation<? super C18451> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GraphLoop.this.processShutdown(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphLoop(@NotNull CameraGraphId cameraGraphId, @NotNull Map<?, ? extends Object> defaultParameters, @NotNull Map<?, ? extends Object> requiredParameters, @NotNull List<? extends Request.Listener> requiredListeners, @NotNull List<? extends Listener> listeners, @NotNull CoroutineScope shutdownScope, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(cameraGraphId, "cameraGraphId");
        Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
        Intrinsics.checkNotNullParameter(requiredParameters, "requiredParameters");
        Intrinsics.checkNotNullParameter(requiredListeners, "requiredListeners");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(shutdownScope, "shutdownScope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.cameraGraphId = cameraGraphId;
        this.defaultParameters = defaultParameters;
        this.requiredParameters = requiredParameters;
        this.requiredListeners = requiredListeners;
        this.listeners = listeners;
        this.shutdownScope = shutdownScope;
        zkm.d dVarC = e0.c(dispatcher.plus(new b0("CXCP-GraphLoop")));
        this.graphLoopScope = dVarC;
        this.processingQueue = ProcessingQueue.INSTANCE.processIn(new ProcessingQueue(0, new GraphLoop$processingQueue$1(this), new GraphLoop$processingQueue$2(this), 1, null), dVarC);
        this.lock = new Object();
        this._graphParameters = r0.g();
        this._graph3AParameters = r0.g();
        this._requestListeners = f0.f322471a;
        this._captureProcessingEnabled = hx7.b.g(true);
        this.currentGraphParameters = r0.g();
        this.currentGraph3AParameters = r0.g();
        this.currentRequiredParameters = requiredParameters;
        this.currentRequestListeners = requiredListeners;
    }

    private final void abortRequests(List<Request> requests) {
        List<Request> list = requests;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Request request = requests.get(i);
            int size2 = this.currentRequestListeners.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.currentRequestListeners.get(i2).onAborted(request);
            }
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Request request2 = requests.get(i3);
            int size4 = request2.getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                request2.getListeners().get(i5).onAborted(request2);
            }
        }
    }

    private final boolean buildAndSubmit(boolean isRepeating, List<Request> requests, Map<?, ? extends Object> oneTimeRequiredParameters) throws Exception {
        Map<?, ? extends Object> mapB;
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor == null) {
            return false;
        }
        Map<?, ? extends Object> map = this.defaultParameters;
        Map<?, ? extends Object> map2 = this.currentGraphParameters;
        if (oneTimeRequiredParameters.isEmpty()) {
            mapB = this.currentRequiredParameters;
        } else {
            f builder = new f();
            RequestsKt.putAllMetadata(builder, this.currentGraph3AParameters);
            RequestsKt.putAllMetadata(builder, oneTimeRequiredParameters);
            RequestsKt.putAllMetadata(builder, this.requiredParameters);
            Unit unit = Unit.f186387a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            mapB = builder.b();
        }
        boolean zSubmit$camera_camera2_pipe = graphRequestProcessor.submit$camera_camera2_pipe(isRepeating, requests, map, map2, mapB, this.currentRequestListeners);
        if (!zSubmit$camera_camera2_pipe) {
            if (isRepeating) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str = "Failed to repeat with " + d0.K0(requests);
                    return zSubmit$camera_camera2_pipe;
                }
            } else if (oneTimeRequiredParameters.isEmpty()) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str2 = "Failed to submit capture with " + requests;
                    return zSubmit$camera_camera2_pipe;
                }
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str3 = "Failed to trigger with " + d0.K0(requests) + " and " + oneTimeRequiredParameters;
            }
        }
        return zSubmit$camera_camera2_pipe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean buildAndSubmit$default(GraphLoop graphLoop, boolean z, List list, Map map, int i, Object obj2) {
        if ((i & 4) != 0) {
            map = r0.g();
        }
        return graphLoop.buildAndSubmit(z, list, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalizeUnprocessedCommands(List<? extends GraphCommand> unprocessedCommands) {
        for (GraphCommand graphCommand : unprocessedCommands) {
            if (graphCommand instanceof GraphCommand.Capture) {
                abortRequests(((GraphCommand.Capture) graphCommand).getRequests());
            } else if (graphCommand instanceof GraphCommand.RequestProcessor) {
                e0.C(this.shutdownScope, null, skm.d0.UNDISPATCHED, new AnonymousClass1(graphCommand, null), 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object process(List<GraphCommand> list, Continuation<? super Unit> continuation) {
        int iSelectGraphCommand = selectGraphCommand(list);
        GraphCommand graphCommand = list.get(iSelectGraphCommand);
        if (Intrinsics.f(graphCommand, GraphCommand.Invalidate.INSTANCE)) {
            list.remove(iSelectGraphCommand);
        } else {
            if (Intrinsics.f(graphCommand, GraphCommand.Shutdown.INSTANCE)) {
                Object objProcessShutdown = processShutdown(list, continuation);
                return objProcessShutdown == a.COROUTINE_SUSPENDED ? objProcessShutdown : Unit.f186387a;
            }
            if (Intrinsics.f(graphCommand, GraphCommand.Abort.INSTANCE)) {
                processAbort(list, iSelectGraphCommand);
            } else if (Intrinsics.f(graphCommand, GraphCommand.Stop.INSTANCE)) {
                processStop(list, iSelectGraphCommand);
            } else {
                if (graphCommand instanceof GraphCommand.RequestProcessor) {
                    Object objProcessRequestProcessor = processRequestProcessor(list, iSelectGraphCommand, (GraphCommand.RequestProcessor) graphCommand, continuation);
                    return objProcessRequestProcessor == a.COROUTINE_SUSPENDED ? objProcessRequestProcessor : Unit.f186387a;
                }
                if (graphCommand instanceof GraphCommand.Capture) {
                    processCapture$default(this, list, iSelectGraphCommand, (GraphCommand.Capture) graphCommand, false, 8, null);
                } else if (graphCommand instanceof GraphCommand.Trigger) {
                    processTrigger(list, iSelectGraphCommand, (GraphCommand.Trigger) graphCommand);
                } else if (graphCommand instanceof GraphCommand.Parameters) {
                    processParameters(list, iSelectGraphCommand, (GraphCommand.Parameters) graphCommand);
                } else if (graphCommand instanceof GraphCommand.Listeners) {
                    processListeners(list, iSelectGraphCommand, (GraphCommand.Listeners) graphCommand);
                } else {
                    if (!(graphCommand instanceof GraphCommand.Repeat)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    processRepeat$default(this, list, iSelectGraphCommand, false, 4, null);
                }
            }
        }
        return Unit.f186387a;
    }

    private final void processAbort(List<GraphCommand> commands, int idx) {
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor != null) {
            graphRequestProcessor.abortCaptures$camera_camera2_pipe();
        }
        this.currentRepeatingRequest = null;
        commands.remove(idx);
        int i = 0;
        while (i < idx) {
            GraphCommand graphCommand = commands.get(i);
            if (!Intrinsics.f(graphCommand, GraphCommand.Stop.INSTANCE) && !Intrinsics.f(graphCommand, GraphCommand.Abort.INSTANCE) && !(graphCommand instanceof GraphCommand.Repeat) && !(graphCommand instanceof GraphCommand.Trigger)) {
                if (graphCommand instanceof GraphCommand.Capture) {
                    abortRequests(((GraphCommand.Capture) graphCommand).getRequests());
                } else {
                    i++;
                }
            }
            commands.remove(i);
            idx--;
        }
    }

    private final void processCapture(List<GraphCommand> commands, int idx, GraphCommand.Capture command, boolean repeatAllowed) {
        if (getCaptureProcessingEnabled() && buildAndSubmit$default(this, false, command.getRequests(), null, 4, null)) {
            commands.remove(idx);
            return;
        }
        if (!repeatAllowed || idx <= 0) {
            return;
        }
        int i = idx - 1;
        if (!(commands.get(i) instanceof GraphCommand.Repeat)) {
            throw new IllegalStateException("Check failed.");
        }
        processRepeat(commands, i, false);
    }

    public static /* synthetic */ void processCapture$default(GraphLoop graphLoop, List list, int i, GraphCommand.Capture capture, boolean z, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        graphLoop.processCapture(list, i, capture, z);
    }

    private final void processListeners(List<GraphCommand> commands, int idx, GraphCommand.Listeners command) {
        this.currentRequestListeners = d0.U(d0.E0(this.requiredListeners, command.getListeners()));
        commands.remove(idx);
        int i = 0;
        while (i < idx) {
            if (commands.get(i) instanceof GraphCommand.Listeners) {
                commands.remove(i);
                idx--;
            } else {
                i++;
            }
        }
        reissueRepeatingRequest();
    }

    private final void processParameters(List<GraphCommand> commands, int idx, GraphCommand.Parameters command) {
        Map<?, ? extends Object> mapB;
        this.currentGraphParameters = command.getGraphParameters();
        this.currentGraph3AParameters = command.getGraph3AParameters();
        if (command.getGraph3AParameters().isEmpty()) {
            mapB = this.requiredParameters;
        } else {
            f builder = new f();
            RequestsKt.putAllMetadata(builder, command.getGraph3AParameters());
            RequestsKt.putAllMetadata(builder, this.requiredParameters);
            Intrinsics.checkNotNullParameter(builder, "builder");
            mapB = builder.b();
        }
        this.currentRequiredParameters = mapB;
        commands.remove(idx);
        int i = 0;
        while (i < idx) {
            if (commands.get(i) instanceof GraphCommand.Parameters) {
                commands.remove(i);
                idx--;
            } else {
                i++;
            }
        }
        reissueRepeatingRequest();
    }

    private final void processRepeat(List<GraphCommand> commands, int idx, boolean captureAllowed) {
        int i;
        int i2 = idx;
        while (true) {
            int i3 = 0;
            if (-1 >= i2) {
                if (!captureAllowed || (i = idx + 1) >= commands.size()) {
                    return;
                }
                GraphCommand graphCommand = commands.get(i);
                if (graphCommand instanceof GraphCommand.Capture) {
                    processCapture(commands, i, (GraphCommand.Capture) graphCommand, false);
                    return;
                } else {
                    if (graphCommand instanceof GraphCommand.Trigger) {
                        processTrigger(commands, i, (GraphCommand.Trigger) graphCommand);
                        return;
                    }
                    return;
                }
            }
            GraphCommand graphCommand2 = commands.get(i2);
            if (graphCommand2 instanceof GraphCommand.Repeat) {
                GraphCommand.Repeat repeat = (GraphCommand.Repeat) graphCommand2;
                if (buildAndSubmit$default(this, true, u.c(repeat.getRequest()), null, 4, null)) {
                    this.currentRepeatingRequest = repeat.getRequest();
                    commands.remove(i2);
                    while (i3 < i2) {
                        if (commands.get(i3) instanceof GraphCommand.Repeat) {
                            commands.remove(i3);
                            i2--;
                        } else {
                            i3++;
                        }
                    }
                    return;
                }
            }
            i2--;
        }
    }

    public static /* synthetic */ void processRepeat$default(GraphLoop graphLoop, List list, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        graphLoop.processRepeat(list, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00dc -> B:37:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f5 -> B:36:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0104 -> B:39:0x0105). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRequestProcessor(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> r18, int r19, androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.processRequestProcessor(java.util.List, int, androidx.camera.camera2.pipe.graph.GraphCommand$RequestProcessor, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r12.shutdown$camera_camera2_pipe(r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if (r12.shutdown$camera_camera2_pipe(r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ae -> B:48:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d7 -> B:47:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e7 -> B:47:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processShutdown(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.processShutdown(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void processStop(List<GraphCommand> commands, int idx) {
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor != null) {
            graphRequestProcessor.stopRepeating$camera_camera2_pipe();
        }
        this.currentRepeatingRequest = null;
        commands.remove(idx);
        int i = 0;
        while (i < idx) {
            GraphCommand graphCommand = commands.get(i);
            if (Intrinsics.f(graphCommand, GraphCommand.Stop.INSTANCE) || (graphCommand instanceof GraphCommand.Repeat)) {
                commands.remove(i);
                idx--;
            } else {
                i++;
            }
        }
    }

    private final void processTrigger(List<GraphCommand> commands, int idx, GraphCommand.Trigger command) {
        Request request = this.currentRepeatingRequest;
        if (request == null && idx == 0) {
            commands.remove(idx);
            return;
        }
        if (getCaptureProcessingEnabled() && request != null && buildAndSubmit(false, u.c(request), command.getTriggerParameters())) {
            commands.remove(idx);
        } else if (idx > 0) {
            int i = idx - 1;
            if (!(commands.get(i) instanceof GraphCommand.Repeat)) {
                throw new IllegalStateException("Check failed.");
            }
            processRepeat(commands, i, false);
        }
    }

    private final boolean reissueRepeatingRequest() {
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor == null) {
            return false;
        }
        Request request = this.currentRepeatingRequest;
        return Intrinsics.f(request != null ? Boolean.valueOf(graphRequestProcessor.submit$camera_camera2_pipe(true, u.c(request), this.defaultParameters, this.currentGraphParameters, this.currentRequiredParameters, this.currentRequestListeners)) : null, Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int selectGraphCommand(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> r11) {
        /*
            r10 = this;
            int r0 = r11.size()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r3 = -1
            int r1 = r1 + r3
            r4 = r3
            if (r1 < 0) goto L4b
        L15:
            int r5 = r1 + (-1)
            java.lang.Object r6 = r11.get(r1)
            androidx.camera.camera2.pipe.graph.GraphCommand r6 = (androidx.camera.camera2.pipe.graph.GraphCommand) r6
            androidx.camera.camera2.pipe.graph.GraphCommand$Abort r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Abort.INSTANCE
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 != 0) goto L4a
            androidx.camera.camera2.pipe.graph.GraphCommand$Invalidate r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 != 0) goto L4a
            androidx.camera.camera2.pipe.graph.GraphCommand$Stop r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Stop.INSTANCE
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 != 0) goto L4a
            androidx.camera.camera2.pipe.graph.GraphCommand$Shutdown r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Shutdown.INSTANCE
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L3e
            goto L4a
        L3e:
            boolean r6 = r6 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor
            if (r6 == 0) goto L45
            if (r4 >= 0) goto L45
            r4 = r1
        L45:
            if (r5 >= 0) goto L48
            goto L4b
        L48:
            r1 = r5
            goto L15
        L4a:
            return r1
        L4b:
            if (r4 < 0) goto L4e
            return r4
        L4e:
            int r1 = r0.size()
            r4 = r2
            r5 = r3
            r6 = r5
        L55:
            if (r4 >= r1) goto L71
            java.lang.Object r7 = r11.get(r4)
            androidx.camera.camera2.pipe.graph.GraphCommand r7 = (androidx.camera.camera2.pipe.graph.GraphCommand) r7
            boolean r8 = r7 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Parameters
            if (r8 == 0) goto L63
            r5 = r4
            goto L6e
        L63:
            boolean r8 = r7 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Listeners
            if (r8 == 0) goto L69
            r6 = r4
            goto L6e
        L69:
            boolean r7 = r7 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat
            if (r7 != 0) goto L6e
            goto L71
        L6e:
            int r4 = r4 + 1
            goto L55
        L71:
            if (r5 < 0) goto L74
            return r5
        L74:
            if (r6 < 0) goto L77
            return r6
        L77:
            androidx.camera.camera2.pipe.Request r1 = r10.currentRepeatingRequest
            if (r1 == 0) goto L9b
            boolean r1 = r10.getCaptureProcessingEnabled()
            if (r1 == 0) goto L9b
            int r1 = r0.size()
            r4 = r2
        L86:
            if (r4 >= r1) goto L9b
            java.lang.Object r5 = r11.get(r4)
            androidx.camera.camera2.pipe.graph.GraphCommand r5 = (androidx.camera.camera2.pipe.graph.GraphCommand) r5
            boolean r6 = r5 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture
            if (r6 != 0) goto L9a
            boolean r5 = r5 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Trigger
            if (r5 == 0) goto L97
            goto L9a
        L97:
            int r4 = r4 + 1
            goto L86
        L9a:
            return r4
        L9b:
            int r0 = r0.size()
            r1 = r3
            r3 = r2
        La1:
            if (r3 >= r0) goto Lb3
            java.lang.Object r4 = r11.get(r3)
            androidx.camera.camera2.pipe.graph.GraphCommand r4 = (androidx.camera.camera2.pipe.graph.GraphCommand) r4
            boolean r4 = r4 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat
            if (r4 == 0) goto Lb3
            int r1 = r3 + 1
            r9 = r3
            r3 = r1
            r1 = r9
            goto La1
        Lb3:
            if (r1 < 0) goto Lb6
            return r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.selectGraphCommand(java.util.List):int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                GraphRequestProcessor graphRequestProcessor = this._requestProcessor;
                if (graphRequestProcessor != null) {
                    e0.C(this.shutdownScope, null, null, new GraphLoop$close$1$1$1(graphRequestProcessor, null), 3);
                }
                this._requestProcessor = null;
                this.processingQueue.tryEmit(GraphCommand.Shutdown.INSTANCE);
                int size = this.listeners.size();
                for (int i = 0; i < size; i++) {
                    this.listeners.get(i).onGraphShutdown();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final boolean getCaptureProcessingEnabled() {
        return this._captureProcessingEnabled.b();
    }

    public final Request getRepeatingRequest() {
        Request request;
        synchronized (this.lock) {
            request = this._repeatingRequest;
        }
        return request;
    }

    public final void invalidate() {
        this.processingQueue.tryEmit(GraphCommand.Invalidate.INSTANCE);
    }

    public final void setCaptureProcessingEnabled(boolean z) {
        this._captureProcessingEnabled.f254894a = z ? 1 : 0;
        if (z) {
            invalidate();
        }
    }

    public final void setGraph3AParameters(@NotNull Map<?, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            this._graph3AParameters = value;
            this.processingQueue.tryEmit(new GraphCommand.Parameters(this._graphParameters, value));
            Unit unit = Unit.f186387a;
        }
    }

    public final void setGraphParameters(@NotNull Map<?, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            this._graphParameters = value;
            this.processingQueue.tryEmit(new GraphCommand.Parameters(value, this._graph3AParameters));
            Unit unit = Unit.f186387a;
        }
    }

    public final void setRepeatingRequest(Request request) {
        synchronized (this.lock) {
            try {
                Request request2 = this._repeatingRequest;
                this._repeatingRequest = request;
                if (request2 != null || request != null) {
                    if (request != null) {
                        this.processingQueue.tryEmit(new GraphCommand.Repeat(request));
                    } else {
                        this.processingQueue.tryEmit(GraphCommand.Stop.INSTANCE);
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (request == null) {
            int size = this.listeners.size();
            for (int i = 0; i < size; i++) {
                this.listeners.get(i).onStopRepeating();
            }
        }
    }

    public final void setRequestListeners(@NotNull List<? extends Request.Listener> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            this._requestListeners = value;
            this.processingQueue.tryEmit(new GraphCommand.Listeners(value));
            Unit unit = Unit.f186387a;
        }
    }

    public final void setRequestProcessor(GraphRequestProcessor graphRequestProcessor) {
        synchronized (this.lock) {
            GraphRequestProcessor graphRequestProcessor2 = this._requestProcessor;
            this._requestProcessor = graphRequestProcessor;
            if (this.closed) {
                this._requestProcessor = null;
                if (graphRequestProcessor != null) {
                    e0.C(this.shutdownScope, null, null, new GraphLoop$requestProcessor$2$1(graphRequestProcessor, null), 3);
                }
                return;
            }
            if (graphRequestProcessor2 != graphRequestProcessor) {
                this.processingQueue.tryEmit(new GraphCommand.RequestProcessor(graphRequestProcessor2, graphRequestProcessor));
            }
            Unit unit = Unit.f186387a;
            if (graphRequestProcessor == null) {
                int size = this.listeners.size();
                for (int i = 0; i < size; i++) {
                    this.listeners.get(i).onGraphStopped();
                }
            }
        }
    }

    public final boolean submit(@NotNull List<Request> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        if (this.processingQueue.tryEmit(new GraphCommand.Capture(requests))) {
            return true;
        }
        abortRequests(requests);
        return false;
    }

    @NotNull
    public String toString() {
        return "GraphLoop(" + this.cameraGraphId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean trigger(@NotNull Map<?, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (getRepeatingRequest() != null) {
            return this.processingQueue.tryEmit(new GraphCommand.Trigger(parameters));
        }
        throw new IllegalStateException("Cannot submit parameters without an active repeating request!");
    }
}
