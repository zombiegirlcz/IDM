package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.GraphStateListener;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.CameraPipeKeys;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000bH\u0016¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u00122\u0012\u0010'\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00122\u0012\u0010'\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b,\u0010+J\u001d\u0010.\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u0014J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010E\u001a\u0004\u0018\u00010 2\b\u0010@\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "cameraGraphConfig", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "graphListener3A", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "graphListeners", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "camera2Quirks", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/Listener3A;Ljava/util/List;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;)V", "", "onGraphStarting", "()V", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "requestProcessor", "onGraphStarted", "(Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;)V", "onGraphStopping", "onGraphStopped", "onGraphModified", "Landroidx/camera/camera2/pipe/GraphState$GraphStateError;", "graphStateError", "onGraphError", "(Landroidx/camera/camera2/pipe/GraphState$GraphStateError;)V", "Landroidx/camera/camera2/pipe/Request;", "requests", "", "submit", "(Ljava/util/List;)Z", "", "", "parameters", "trigger", "(Ljava/util/Map;)Z", "updateGraphParameters", "(Ljava/util/Map;)V", "update3AParameters", "listeners", "updateRequestListeners", "(Ljava/util/List;)V", "close", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/CameraGraphId;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "graphLoop", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "Landroidx/camera/camera2/pipe/GraphStateListener;", "externalStateGraphListeners", "Ljava/util/List;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/camera/camera2/pipe/GraphState;", "_graphState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "value", "getRepeatingRequest", "()Landroidx/camera/camera2/pipe/Request;", "setRepeatingRequest", "(Landroidx/camera/camera2/pipe/Request;)V", "repeatingRequest", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphProcessorImpl implements GraphProcessor, GraphListener {

    @NotNull
    private final MutableStateFlow _graphState;

    @NotNull
    private final CameraGraph.Config cameraGraphConfig;

    @NotNull
    private final CameraGraphId cameraGraphId;

    @NotNull
    private final List<GraphStateListener> externalStateGraphListeners;

    @NotNull
    private final GraphLoop graphLoop;

    public GraphProcessorImpl(@NotNull Threads threads, @NotNull CameraGraphId cameraGraphId, @NotNull CameraGraph.Config cameraGraphConfig, @NotNull Listener3A graphListener3A, @NotNull List<Request.Listener> graphListeners, @NotNull Camera2Quirks camera2Quirks) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(cameraGraphId, "cameraGraphId");
        Intrinsics.checkNotNullParameter(cameraGraphConfig, "cameraGraphConfig");
        Intrinsics.checkNotNullParameter(graphListener3A, "graphListener3A");
        Intrinsics.checkNotNullParameter(graphListeners, "graphListeners");
        Intrinsics.checkNotNullParameter(camera2Quirks, "camera2Quirks");
        this.cameraGraphId = cameraGraphId;
        this.cameraGraphConfig = cameraGraphConfig;
        this.externalStateGraphListeners = cameraGraphConfig.getGraphStateListeners();
        Map<?, Object> defaultParameters = cameraGraphConfig.getDefaultParameters();
        Map<?, Object> requiredParameters = cameraGraphConfig.getRequiredParameters();
        CameraPipeKeys cameraPipeKeys = CameraPipeKeys.INSTANCE;
        Object obj2 = defaultParameters.get(cameraPipeKeys.getIgnore3ARequiredParameters());
        Boolean bool = Boolean.TRUE;
        if ((Intrinsics.f(obj2, bool) || Intrinsics.f(requiredParameters.get(cameraPipeKeys.getIgnore3ARequiredParameters()), bool)) && Log.INSTANCE.getINFO_LOGGABLE()) {
            String str = cameraPipeKeys.getIgnore3ARequiredParameters() + " is set to true, ignoring GraphState3A parameters.";
        }
        int repeatingRequestFrameCountForCapture$camera_camera2_pipe = camera2Quirks.getRepeatingRequestFrameCountForCapture$camera_camera2_pipe(cameraGraphConfig.getFlags());
        CaptureLimiter captureLimiter = repeatingRequestFrameCountForCapture$camera_camera2_pipe != 0 ? new CaptureLimiter(repeatingRequestFrameCountForCapture$camera_camera2_pipe) : null;
        ArrayList arrayListE0 = d0.E0(v.l(captureLimiter), graphListeners);
        Object[] elements = {graphListener3A, captureLimiter};
        Intrinsics.checkNotNullParameter(elements, "elements");
        GraphLoop graphLoop = new GraphLoop(cameraGraphId, defaultParameters, requiredParameters, arrayListE0, d.L(elements), threads.getCameraPipeScope(), threads.getLightweightDispatcher());
        this.graphLoop = graphLoop;
        if (captureLimiter != null) {
            captureLimiter.setGraphLoop(graphLoop);
        }
        this._graphState = q.c(GraphState.GraphStateStopped.INSTANCE);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void close() {
        this.graphLoop.close();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public Request getRepeatingRequest() {
        return this.graphLoop.getRepeatingRequest();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphError(@NotNull GraphState.GraphStateError graphStateError) {
        Object value;
        GraphState graphState;
        Intrinsics.checkNotNullParameter(graphStateError, "graphStateError");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " onGraphError(" + graphStateError + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        MutableStateFlow mutableStateFlow = this._graphState;
        do {
            value = mutableStateFlow.getValue();
            graphState = (GraphState) value;
        } while (!mutableStateFlow.h(value, ((graphState instanceof GraphState.GraphStateStopping) || (graphState instanceof GraphState.GraphStateStopped)) ? GraphState.GraphStateStopped.INSTANCE : graphStateError));
        Iterator<GraphStateListener> it8 = this.externalStateGraphListeners.iterator();
        while (it8.hasNext()) {
            it8.next().onGraphError(graphStateError);
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphModified(@NotNull GraphRequestProcessor requestProcessor) {
        Intrinsics.checkNotNullParameter(requestProcessor, "requestProcessor");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " onGraphModified";
        }
        this.graphLoop.invalidate();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStarted(@NotNull GraphRequestProcessor requestProcessor) {
        Intrinsics.checkNotNullParameter(requestProcessor, "requestProcessor");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " onGraphStarted";
        }
        this._graphState.setValue(GraphState.GraphStateStarted.INSTANCE);
        this.graphLoop.setRequestProcessor(requestProcessor);
        Iterator<GraphStateListener> it8 = this.externalStateGraphListeners.iterator();
        while (it8.hasNext()) {
            it8.next().onGraphStarted();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStarting() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " onGraphStarting";
        }
        this._graphState.setValue(GraphState.GraphStateStarting.INSTANCE);
        Iterator<GraphStateListener> it8 = this.externalStateGraphListeners.iterator();
        while (it8.hasNext()) {
            it8.next().onGraphStarting();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStopped(GraphRequestProcessor requestProcessor) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " onGraphStopped";
        }
        this._graphState.setValue(GraphState.GraphStateStopped.INSTANCE);
        this.graphLoop.setRequestProcessor(null);
        Iterator<GraphStateListener> it8 = this.externalStateGraphListeners.iterator();
        while (it8.hasNext()) {
            it8.next().onGraphStopped();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public void onGraphStopping() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + " onGraphStopping";
        }
        this._graphState.setValue(GraphState.GraphStateStopping.INSTANCE);
        this.graphLoop.setRequestProcessor(null);
        Iterator<GraphStateListener> it8 = this.externalStateGraphListeners.iterator();
        while (it8.hasNext()) {
            it8.next().onGraphStopping();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void setRepeatingRequest(Request request) {
        this.graphLoop.setRepeatingRequest(request);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public boolean submit(@NotNull List<Request> requests) {
        Object next;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Iterator<T> it8 = requests.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((Request) next).getInputRequest() != null) {
                break;
            }
        }
        Request request = (Request) next;
        if (request == null || this.cameraGraphConfig.getInput() != null) {
            return this.graphLoop.submit(requests);
        }
        throw new IllegalStateException(("Cannot submit " + request + " with input request " + request.getInputRequest() + " to " + this + " because CameraGraph was not configured to support reprocessing").toString());
    }

    @NotNull
    public String toString() {
        return "GraphProcessor(cameraGraph: " + this.cameraGraphId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public boolean trigger(@NotNull Map<?, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return this.graphLoop.trigger(parameters);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void update3AParameters(@NotNull Map<?, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.graphLoop.setGraph3AParameters(parameters);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void updateGraphParameters(@NotNull Map<?, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.graphLoop.setGraphParameters(parameters);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public void updateRequestListeners(@NotNull List<? extends Request.Listener> listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.graphLoop.setRequestListeners(listeners);
    }
}
