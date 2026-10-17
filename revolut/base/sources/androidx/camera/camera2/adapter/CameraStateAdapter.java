package androidx.camera.camera2.adapter;

import android.os.Looper;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.core.util.Consumer;
import androidx.lifecycle.MutableLiveData;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import k0.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 02\u00020\u0001:\u0002/0B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0010J\u0016\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0003J\u001c\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0013H\u0002J\u001f\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b(J#\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00192\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0000¢\u0006\u0002\b,J\u001b\u0010-\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0000¢\u0006\u0002\b.R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Landroidx/camera/camera2/adapter/CameraStateAdapter;", "", "<init>", "()V", "lock", "cameraInternalState", "Landroidx/camera/core/impl/LiveDataObservable;", "Landroidx/camera/core/impl/CameraInternal$State;", "getCameraInternalState$camera_camera2", "()Landroidx/camera/core/impl/LiveDataObservable;", "cameraState", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/camera/core/CameraState;", "getCameraState$camera_camera2", "()Landroidx/lifecycle/MutableLiveData;", "currentGraph", "Landroidx/camera/camera2/pipe/CameraGraph;", "currentCameraInternalState", "currentCameraStateError", "Landroidx/camera/core/CameraState$StateError;", "isRemoved", "", "cameraStateListeners", "", "Landroidx/core/util/Consumer;", "Ljava/util/concurrent/Executor;", "onRemoved", "", "onGraphUpdated", "cameraGraph", "onGraphStateUpdated", "graphState", "Landroidx/camera/camera2/pipe/GraphState;", "handleStateTransition", "postCameraState", "internalState", "stateError", "calculateNextState", "Landroidx/camera/camera2/adapter/CameraStateAdapter$CombinedCameraState;", "currentState", "calculateNextState$camera_camera2", "addCameraStateListener", "executor", "listener", "addCameraStateListener$camera_camera2", "removeCameraStateListener", "removeCameraStateListener$camera_camera2", "CombinedCameraState", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraStateAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<Consumer<CameraState>, Executor> cameraStateListeners;

    @NotNull
    private CameraInternal.State currentCameraInternalState;
    private CameraState.StateError currentCameraStateError;
    private CameraGraph currentGraph;
    private boolean isRemoved;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final LiveDataObservable<CameraInternal.State> cameraInternalState = new LiveDataObservable<>();

    @NotNull
    private final MutableLiveData<CameraState> cameraState = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u00020\n*\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u0017\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/adapter/CameraStateAdapter$Companion;", "", "<init>", "()V", "toCameraStateError", "Landroidx/camera/core/CameraState$StateError;", "Landroidx/camera/camera2/pipe/CameraError;", "toCameraStateError-90vkdD0$camera_camera2", "(I)Landroidx/camera/core/CameraState$StateError;", "toCameraState", "Landroidx/camera/core/CameraState$Type;", "Landroidx/camera/core/impl/CameraInternal$State;", "toCameraState$camera_camera2", "isRecoverableError", "", "cameraError", "isRecoverableError-90vkdD0$camera_camera2", "(I)Z", "setOrPostValue", "", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/camera/core/CameraState;", "cameraState", "setOrPostValue$camera_camera2", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CameraInternal.State.values().length];
                try {
                    iArr[CameraInternal.State.CLOSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CameraInternal.State.OPENING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CameraInternal.State.OPEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CameraInternal.State.CLOSING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: isRecoverableError-90vkdD0$camera_camera2, reason: not valid java name */
        public final boolean m2isRecoverableError90vkdD0$camera_camera2(int cameraError) {
            CameraError.Companion companion = CameraError.INSTANCE;
            return CameraError.m132equalsimpl0(cameraError, companion.m142getERROR_CAMERA_DISCONNECTEDv7Vf74A()) || CameraError.m132equalsimpl0(cameraError, companion.m143getERROR_CAMERA_IN_USEv7Vf74A()) || CameraError.m132equalsimpl0(cameraError, companion.m144getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A()) || CameraError.m132equalsimpl0(cameraError, companion.m140getERROR_CAMERA_DEVICEv7Vf74A());
        }

        public final void setOrPostValue$camera_camera2(@NotNull MutableLiveData<CameraState> mutableLiveData, @NotNull CameraState cameraState) {
            Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
            Intrinsics.checkNotNullParameter(cameraState, "cameraState");
            if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                mutableLiveData.setValue(cameraState);
            } else {
                mutableLiveData.postValue(cameraState);
            }
        }

        @NotNull
        public final CameraState.Type toCameraState$camera_camera2(@NotNull CameraInternal.State state) {
            Intrinsics.checkNotNullParameter(state, "<this>");
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                return CameraState.Type.CLOSED;
            }
            if (i == 2) {
                return CameraState.Type.OPENING;
            }
            if (i == 3) {
                return CameraState.Type.OPEN;
            }
            if (i == 4) {
                return CameraState.Type.CLOSING;
            }
            if (i == 5) {
                return CameraState.Type.PENDING_OPEN;
            }
            throw new IllegalArgumentException("Unexpected CameraInternal state: " + state);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: toCameraStateError-90vkdD0$camera_camera2, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.camera.core.CameraState.StateError m3toCameraStateError90vkdD0$camera_camera2(int r5) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.CameraStateAdapter.Companion.m3toCameraStateError90vkdD0$camera_camera2(int):androidx.camera.core.CameraState$StateError");
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            try {
                iArr[CameraInternal.State.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraInternal.State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CameraStateAdapter() {
        CameraInternal.State state = CameraInternal.State.CLOSED;
        this.currentCameraInternalState = state;
        this.cameraStateListeners = new LinkedHashMap();
        postCameraState$default(this, state, null, 2, null);
    }

    private final void handleStateTransition(CameraGraph cameraGraph, GraphState graphState) {
        if (!Intrinsics.f(cameraGraph, this.currentGraph)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "Ignored stale transition " + graphState + " for " + cameraGraph;
                return;
            }
            return;
        }
        CombinedCameraState combinedCameraStateCalculateNextState$camera_camera2 = calculateNextState$camera_camera2(this.currentCameraInternalState, graphState);
        if (combinedCameraStateCalculateNextState$camera_camera2 == null) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = "Impermissible state transition: current camera internal state: " + this.currentCameraInternalState + ", received graph state: " + graphState;
                return;
            }
            return;
        }
        this.currentCameraInternalState = combinedCameraStateCalculateNextState$camera_camera2.getState();
        this.currentCameraStateError = combinedCameraStateCalculateNextState$camera_camera2.getError();
        Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused3 = Camera2Logger.TRUNCATED_TAG;
            String str3 = "Updated current camera internal state to " + combinedCameraStateCalculateNextState$camera_camera2;
        }
        postCameraState(this.currentCameraInternalState, this.currentCameraStateError);
    }

    private final void postCameraState(CameraInternal.State internalState, CameraState.StateError stateError) {
        List<Map.Entry> listD1;
        this.cameraInternalState.postValue(internalState);
        Companion companion = INSTANCE;
        CameraState cameraStateCreate = CameraState.create(companion.toCameraState$camera_camera2(internalState), stateError);
        Intrinsics.checkNotNullExpressionValue(cameraStateCreate, "create(...)");
        companion.setOrPostValue$camera_camera2(this.cameraState, cameraStateCreate);
        synchronized (this.lock) {
            listD1 = d0.d1(this.cameraStateListeners.entrySet());
        }
        for (Map.Entry entry : listD1) {
            ((Executor) entry.getValue()).execute(new b((Consumer) entry.getKey(), cameraStateCreate, 19));
        }
    }

    public static /* synthetic */ void postCameraState$default(CameraStateAdapter cameraStateAdapter, CameraInternal.State state, CameraState.StateError stateError, int i, Object obj2) {
        if ((i & 2) != 0) {
            stateError = null;
        }
        cameraStateAdapter.postCameraState(state, stateError);
    }

    public final void addCameraStateListener$camera_camera2(@NotNull Executor executor, @NotNull Consumer<CameraState> listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            this.cameraStateListeners.put(listener, executor);
            Unit unit = Unit.f186387a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CombinedCameraState calculateNextState$camera_camera2(@NotNull CameraInternal.State currentState, @NotNull GraphState graphState) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(graphState, "graphState");
        int i = WhenMappings.$EnumSwitchMapping$0[currentState.ordinal()];
        int i2 = 2;
        CameraState.StateError stateError = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        if (i == 1) {
            if (Intrinsics.f(graphState, GraphState.GraphStateStarting.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPENING, objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0);
            }
            if (Intrinsics.f(graphState, GraphState.GraphStateStarted.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPEN, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            }
            return null;
        }
        if (i == 2) {
            if (Intrinsics.f(graphState, GraphState.GraphStateStarted.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPEN, objArr10 == true ? 1 : 0, i2, objArr9 == true ? 1 : 0);
            }
            if (graphState instanceof GraphState.GraphStateError) {
                GraphState.GraphStateError graphStateError = (GraphState.GraphStateError) graphState;
                if (graphStateError.getWillAttemptRetry()) {
                    return new CombinedCameraState(CameraInternal.State.OPENING, INSTANCE.m3toCameraStateError90vkdD0$camera_camera2(graphStateError.getCameraError()));
                }
                Companion companion = INSTANCE;
                return companion.m2isRecoverableError90vkdD0$camera_camera2(graphStateError.getCameraError()) ? new CombinedCameraState(CameraInternal.State.PENDING_OPEN, companion.m3toCameraStateError90vkdD0$camera_camera2(graphStateError.getCameraError())) : new CombinedCameraState(CameraInternal.State.CLOSING, companion.m3toCameraStateError90vkdD0$camera_camera2(graphStateError.getCameraError()));
            }
            if (Intrinsics.f(graphState, GraphState.GraphStateStopping.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.CLOSING, objArr8 == true ? 1 : 0, i2, objArr7 == true ? 1 : 0);
            }
            if (Intrinsics.f(graphState, GraphState.GraphStateStopped.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.CLOSED, objArr6 == true ? 1 : 0, i2, objArr5 == true ? 1 : 0);
            }
            return null;
        }
        if (i == 3) {
            if (Intrinsics.f(graphState, GraphState.GraphStateStopping.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.CLOSING, objArr14 == true ? 1 : 0, i2, objArr13 == true ? 1 : 0);
            }
            if (Intrinsics.f(graphState, GraphState.GraphStateStopped.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.CLOSED, objArr12 == true ? 1 : 0, i2, objArr11 == true ? 1 : 0);
            }
            if (!(graphState instanceof GraphState.GraphStateError)) {
                return null;
            }
            Companion companion2 = INSTANCE;
            GraphState.GraphStateError graphStateError2 = (GraphState.GraphStateError) graphState;
            return companion2.m2isRecoverableError90vkdD0$camera_camera2(graphStateError2.getCameraError()) ? new CombinedCameraState(CameraInternal.State.PENDING_OPEN, companion2.m3toCameraStateError90vkdD0$camera_camera2(graphStateError2.getCameraError())) : new CombinedCameraState(CameraInternal.State.CLOSED, companion2.m3toCameraStateError90vkdD0$camera_camera2(graphStateError2.getCameraError()));
        }
        if (i == 4) {
            if (Intrinsics.f(graphState, GraphState.GraphStateStopped.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.CLOSED, objArr18 == true ? 1 : 0, i2, objArr17 == true ? 1 : 0);
            }
            if (Intrinsics.f(graphState, GraphState.GraphStateStarting.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPENING, objArr16 == true ? 1 : 0, i2, objArr15 == true ? 1 : 0);
            }
            if (graphState instanceof GraphState.GraphStateError) {
                return new CombinedCameraState(CameraInternal.State.CLOSING, INSTANCE.m3toCameraStateError90vkdD0$camera_camera2(((GraphState.GraphStateError) graphState).getCameraError()));
            }
            return null;
        }
        if (i != 5) {
            return null;
        }
        if (Intrinsics.f(graphState, GraphState.GraphStateStarting.INSTANCE)) {
            return new CombinedCameraState(CameraInternal.State.OPENING, stateError, i2, objArr21 == true ? 1 : 0);
        }
        if (Intrinsics.f(graphState, GraphState.GraphStateStarted.INSTANCE)) {
            return new CombinedCameraState(CameraInternal.State.OPEN, objArr20 == true ? 1 : 0, i2, objArr19 == true ? 1 : 0);
        }
        if (!(graphState instanceof GraphState.GraphStateError)) {
            return null;
        }
        Companion companion3 = INSTANCE;
        GraphState.GraphStateError graphStateError3 = (GraphState.GraphStateError) graphState;
        return companion3.m2isRecoverableError90vkdD0$camera_camera2(graphStateError3.getCameraError()) ? new CombinedCameraState(CameraInternal.State.PENDING_OPEN, companion3.m3toCameraStateError90vkdD0$camera_camera2(graphStateError3.getCameraError())) : new CombinedCameraState(CameraInternal.State.CLOSED, companion3.m3toCameraStateError90vkdD0$camera_camera2(graphStateError3.getCameraError()));
    }

    @NotNull
    public final LiveDataObservable<CameraInternal.State> getCameraInternalState$camera_camera2() {
        return this.cameraInternalState;
    }

    @NotNull
    public final MutableLiveData<CameraState> getCameraState$camera_camera2() {
        return this.cameraState;
    }

    public final void onGraphStateUpdated(@NotNull CameraGraph cameraGraph, @NotNull GraphState graphState) {
        Intrinsics.checkNotNullParameter(cameraGraph, "cameraGraph");
        Intrinsics.checkNotNullParameter(graphState, "graphState");
        synchronized (this.lock) {
            if (this.isRemoved) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "Ignoring graph state update " + graphState + " on removed camera.";
                }
                return;
            }
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = cameraGraph + " state updated to " + graphState;
            }
            handleStateTransition(cameraGraph, graphState);
            Unit unit = Unit.f186387a;
        }
    }

    public final void onGraphUpdated(@NotNull CameraGraph cameraGraph) {
        Intrinsics.checkNotNullParameter(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            try {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "Camera graph updated from " + this.currentGraph + " to " + cameraGraph;
                }
                CameraInternal.State state = this.currentCameraInternalState;
                CameraInternal.State state2 = CameraInternal.State.CLOSED;
                if (state != state2) {
                    postCameraState$default(this, CameraInternal.State.CLOSING, null, 2, null);
                    postCameraState$default(this, state2, null, 2, null);
                }
                this.currentGraph = cameraGraph;
                this.currentCameraInternalState = state2;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void onRemoved() {
        CameraState.StateError stateErrorCreate = CameraState.StateError.create(8);
        Intrinsics.checkNotNullExpressionValue(stateErrorCreate, "create(...)");
        synchronized (this.lock) {
            try {
                if (this.isRemoved) {
                    return;
                }
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                }
                this.isRemoved = true;
                CameraInternal.State state = CameraInternal.State.CLOSED;
                this.currentCameraInternalState = state;
                this.currentCameraStateError = stateErrorCreate;
                postCameraState(state, stateErrorCreate);
                this.currentGraph = null;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void removeCameraStateListener$camera_camera2(@NotNull Consumer<CameraState> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            this.cameraStateListeners.remove(listener);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/adapter/CameraStateAdapter$CombinedCameraState;", "", "Landroidx/camera/core/impl/CameraInternal$State;", "state", "Landroidx/camera/core/CameraState$StateError;", "error", "<init>", "(Landroidx/camera/core/impl/CameraInternal$State;Landroidx/camera/core/CameraState$StateError;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/core/impl/CameraInternal$State;", "getState", "()Landroidx/camera/core/impl/CameraInternal$State;", "Landroidx/camera/core/CameraState$StateError;", "getError", "()Landroidx/camera/core/CameraState$StateError;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CombinedCameraState {
        private final CameraState.StateError error;

        @NotNull
        private final CameraInternal.State state;

        public CombinedCameraState(@NotNull CameraInternal.State state, CameraState.StateError stateError) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.error = stateError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CombinedCameraState)) {
                return false;
            }
            CombinedCameraState combinedCameraState = (CombinedCameraState) other;
            return this.state == combinedCameraState.state && Intrinsics.f(this.error, combinedCameraState.error);
        }

        public final CameraState.StateError getError() {
            return this.error;
        }

        @NotNull
        public final CameraInternal.State getState() {
            return this.state;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            CameraState.StateError stateError = this.error;
            return iHashCode + (stateError == null ? 0 : stateError.hashCode());
        }

        @NotNull
        public String toString() {
            return "CombinedCameraState(state=" + this.state + ", error=" + this.error + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ CombinedCameraState(CameraInternal.State state, CameraState.StateError stateError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(state, (i & 2) != 0 ? null : stateError);
        }
    }
}
