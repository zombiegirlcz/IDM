package androidx.camera.camera2.pipe.graph;

import a82.n;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import skm.e0;
import skm.g0;
import skm.q;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 c2\u00020\u0001:\u0001cB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJy\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001cJÎ\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*H\u0086@¢\u0006\u0004\b-\u0010.Je\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u00100\u001a\u0004\u0018\u00010%2\n\b\u0002\u00101\u001a\u0004\u0018\u00010%2\n\b\u0002\u00102\u001a\u0004\u0018\u00010%2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u00104\u001a\u0004\u0018\u00010*¢\u0006\u0004\b5\u00106J;\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u00107\u001a\u00020%2\b\b\u0002\u00108\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u00104\u001a\u00020*¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010;\u001a\u00020%¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b@\u0010AJ]\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u001a\b\u0002\u0010E\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030D\u0012\u0004\u0012\u00020\u0001\u0018\u00010C2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u00104\u001a\u00020*H\u0002¢\u0006\u0004\b9\u0010FJ\u001f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010;\u001a\u00020%H\u0002¢\u0006\u0004\bG\u0010=Ji\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u00104\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bH\u0010IJ=\u0010O\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030N\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00140C2\u0006\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020%2\u0006\u0010M\u001a\u00020%H\u0002¢\u0006\u0004\bO\u0010PJ=\u0010T\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030N\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00140C2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020%H\u0002¢\u0006\u0004\bT\u0010PJ+\u0010V\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#2\u0006\u0010U\u001a\u00020%2\u0006\u00108\u001a\u00020%H\u0002¢\u0006\u0004\bV\u0010WJ=\u0010X\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030N\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00140C2\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020%H\u0002¢\u0006\u0004\bX\u0010PJ?\u0010\\\u001a\u00020Y2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bZ\u0010[R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010`R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006d"}, d2 = {"Landroidx/camera/camera2/pipe/graph/Controller3A;", "", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Landroidx/camera/camera2/pipe/CameraMetadata;", "metadata", "Landroidx/camera/camera2/pipe/graph/GraphState3A;", "graphState3A", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "graphListener3A", "<init>", "(Landroidx/camera/camera2/pipe/graph/GraphProcessor;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/graph/GraphState3A;Landroidx/camera/camera2/pipe/graph/Listener3A;)V", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroidx/camera/camera2/pipe/FlashMode;", "flashMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "update3A-169HPGg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lskm/g0;", "update3A", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "lock3A-Qz1gx5w", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;ILjava/lang/Long;)Lskm/g0;", "triggerAf", "waitForAwb", "lock3AForCapture", "(ZZIJ)Lskm/g0;", "cancelAf", "unlock3APostCapture", "(Z)Lskm/g0;", "setTorchOn", "()Lskm/g0;", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lskm/g0;", "setTorchOff", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "triggerCondition", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;IJ)Lskm/g0;", "unlock3APostCaptureAndroidMAndAbove", "lock3ANow-R6AlCjU", "(Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Long;)Lskm/g0;", "lock3ANow", "waitForAeToConverge", "waitForAfToConverge", "waitForAwbToConverge", "Landroid/hardware/camera2/CaptureResult$Key;", "createConverged3AExitConditions", "(ZZZ)Ljava/util/Map;", "waitForAeToLock", "waitForAfToLock", "waitForAwbToLock", "createLocked3AExitConditions", "isAfTriggered", "createLock3AForCaptureExitConditions", "(ZZ)Lkotlin/jvm/functions/Function1;", "createUnLocked3AExitConditions", "Landroidx/camera/camera2/pipe/graph/Result3AStateListenerImpl;", "createListenerFor3AParams-0dPwJB0", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;)Landroidx/camera/camera2/pipe/graph/Result3AStateListenerImpl;", "createListenerFor3AParams", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroidx/camera/camera2/pipe/graph/GraphState3A;", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "lastUpdate3AResult", "Lskm/g0;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Controller3A {

    @NotNull
    private static final Map<CaptureRequest.Key<?>, Object> aePrecaptureAndAfCancelParams;

    @NotNull
    private static final Map<CaptureRequest.Key<?>, Object> aePrecaptureCancelParams;

    @NotNull
    private static final List<Integer> aeUnlockedStateList;

    @NotNull
    private static final List<Integer> afUnlockedStateList;

    @NotNull
    private static final List<Integer> awbUnlockedStateList;

    @NotNull
    private static final q deferredResult3ASubmitFailed;

    @NotNull
    private static final Map<CaptureRequest.Key<?>, Object> parameterForAfTriggerCancel;

    @NotNull
    private static final Map<CaptureRequest.Key<?>, Object> parameterForAfTriggerStart;

    @NotNull
    private static final Map<CaptureRequest.Key<?>, Object> parametersForAePrecapture;

    @NotNull
    private static final Map<CaptureRequest.Key<?>, Object> parametersForAePrecaptureAndAfTrigger;

    @NotNull
    private static final Function1<FrameMetadata, Boolean> unlock3APostCaptureAfUnlockedCondition;

    @NotNull
    private static final Map<? extends CaptureRequest.Key<? extends Object>, Object> unlock3APostCaptureLockAeAndCancelAfParams;

    @NotNull
    private static final Map<CaptureRequest.Key<Boolean>, Boolean> unlock3APostCaptureLockAeParams;

    @NotNull
    private static final Map<CaptureRequest.Key<?>, Object> unlock3APostCaptureUnlockAeParams;

    @NotNull
    private final Listener3A graphListener3A;

    @NotNull
    private final GraphProcessor graphProcessor;

    @NotNull
    private final GraphState3A graphState3A;
    private g0 lastUpdate3AResult;

    @NotNull
    private final CameraMetadata metadata;

    @NotNull
    private static final List<Integer> aeConvergedStateList = v.k(2, 4, 3);

    @NotNull
    private static final List<Integer> awbConvergedStateList = v.k(2, 3);

    @NotNull
    private static final List<Integer> afConvergedStateList = v.k(2, 6, 4, 5);

    @NotNull
    private static final List<Integer> aeLockedStateList = u.c(3);

    @NotNull
    private static final List<Integer> awbLockedStateList = u.c(3);

    @NotNull
    private static final List<Integer> afLockedStateList = v.k(4, 5);

    @NotNull
    private static final List<Integer> aePostPrecaptureStateList = v.k(2, 4, 3);

    @NotNull
    private static final List<Integer> awbPostPrecaptureStateList = v.k(2, 3);

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        parameterForAfTriggerStart = q0.c(new Pair(key, 1));
        parameterForAfTriggerCancel = q0.c(new Pair(key, 2));
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        parametersForAePrecapture = q0.c(new Pair(key2, 1));
        parametersForAePrecaptureAndAfTrigger = r0.k(new Pair(key, 1), new Pair(key2, 1));
        deferredResult3ASubmitFailed = e0.a(new Result3A(Result3A.Status.INSTANCE.m340getSUBMIT_FAILEDJvTi9ms(), null, 2, null));
        aeUnlockedStateList = v.k(0, 1, 2, 4);
        List<Integer> listK = v.k(0, 3, 1, 2, 6);
        afUnlockedStateList = listK;
        awbUnlockedStateList = v.k(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        unlock3APostCaptureLockAeParams = q0.c(new Pair(key3, bool));
        unlock3APostCaptureLockAeAndCancelAfParams = r0.k(new Pair(key, 2), new Pair(key3, bool));
        unlock3APostCaptureUnlockAeParams = q0.c(new Pair(key3, Boolean.FALSE));
        aePrecaptureCancelParams = q0.c(new Pair(key2, 2));
        aePrecaptureAndAfCancelParams = r0.k(new Pair(key, 2), new Pair(key2, 2));
        unlock3APostCaptureAfUnlockedCondition = Result3AStateListenerKt.toConditionChecker(q0.c(new Pair(CaptureResult.CONTROL_AF_STATE, listK)));
    }

    public Controller3A(@NotNull GraphProcessor graphProcessor, @NotNull CameraMetadata metadata, @NotNull GraphState3A graphState3A, @NotNull Listener3A graphListener3A) {
        Intrinsics.checkNotNullParameter(graphProcessor, "graphProcessor");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(graphState3A, "graphState3A");
        Intrinsics.checkNotNullParameter(graphListener3A, "graphListener3A");
        this.graphProcessor = graphProcessor;
        this.metadata = metadata;
        this.graphState3A = graphState3A;
        this.graphListener3A = graphListener3A;
    }

    private final Map<CaptureResult.Key<?>, List<Object>> createConverged3AExitConditions(boolean waitForAeToConverge, boolean waitForAfToConverge, boolean waitForAwbToConverge) {
        if (!waitForAeToConverge && !waitForAfToConverge && !waitForAwbToConverge) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (waitForAeToConverge) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, aeConvergedStateList);
        }
        if (waitForAwbToConverge) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, awbConvergedStateList);
        }
        if (waitForAfToConverge) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, afConvergedStateList);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: createListenerFor3AParams-0dPwJB0, reason: not valid java name */
    private final Result3AStateListenerImpl m449createListenerFor3AParams0dPwJB0(AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aeMode != null) {
            int value = aeMode.getValue();
            CaptureResult.Key CONTROL_AE_MODE = CaptureResult.CONTROL_AE_MODE;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AE_MODE, "CONTROL_AE_MODE");
        }
        if (afMode != null) {
            int value2 = afMode.getValue();
            CaptureResult.Key CONTROL_AF_MODE = CaptureResult.CONTROL_AF_MODE;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AF_MODE, "CONTROL_AF_MODE");
        }
        if (awbMode != null) {
            int value3 = awbMode.getValue();
            CaptureResult.Key CONTROL_AWB_MODE = CaptureResult.CONTROL_AWB_MODE;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AWB_MODE, "CONTROL_AWB_MODE");
        }
        if (flashMode != null) {
            int value4 = flashMode.getValue();
            CaptureResult.Key FLASH_MODE = CaptureResult.FLASH_MODE;
            Intrinsics.checkNotNullExpressionValue(FLASH_MODE, "FLASH_MODE");
        }
        return new Result3AStateListenerImpl(r0.u(linkedHashMap), (Integer) null, (Long) null, 6, (DefaultConstructorMarker) null);
    }

    private final Function1<FrameMetadata, Boolean> createLock3AForCaptureExitConditions(boolean isAfTriggered, boolean waitForAwb) {
        return new n(waitForAwb, isAfTriggered, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean createLock3AForCaptureExitConditions$lambda$0(boolean r6, boolean r7, androidx.camera.camera2.pipe.FrameMetadata r8) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.Controller3A.createLock3AForCaptureExitConditions$lambda$0(boolean, boolean, androidx.camera.camera2.pipe.FrameMetadata):boolean");
    }

    private final Map<CaptureResult.Key<?>, List<Object>> createLocked3AExitConditions(boolean waitForAeToLock, boolean waitForAfToLock, boolean waitForAwbToLock) {
        if (!waitForAeToLock && !waitForAfToLock && !waitForAwbToLock) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (waitForAeToLock) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, aeLockedStateList);
        }
        if (waitForAfToLock) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, afLockedStateList);
        }
        if (waitForAwbToLock) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, awbLockedStateList);
        }
        return linkedHashMap;
    }

    private final Map<CaptureResult.Key<?>, List<Object>> createUnLocked3AExitConditions(boolean ae2, boolean af10, boolean awb2) {
        if (!ae2 && !af10 && !awb2) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (ae2) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, aeUnlockedStateList);
        }
        if (af10) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, afUnlockedStateList);
        }
        if (awb2) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, awbUnlockedStateList);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: lock3ANow-R6AlCjU, reason: not valid java name */
    private final g0 m450lock3ANowR6AlCjU(Lock3ABehavior aeLockBehavior, Lock3ABehavior afLockBehavior, Lock3ABehavior awbLockBehavior, AeMode afTriggerStartAeMode, Function1<? super FrameMetadata, Boolean> lockedCondition, Integer frameLimit, Long timeLimitNs) {
        g0 result;
        AeMode aeMode = null;
        Boolean bool = aeLockBehavior == null ? null : Boolean.TRUE;
        Boolean bool2 = awbLockBehavior == null ? null : Boolean.TRUE;
        Map<CaptureResult.Key<?>, List<Object>> mapCreateLocked3AExitConditions = createLocked3AExitConditions(bool != null, afLockBehavior != null, bool2 != null);
        if (lockedCondition == null && mapCreateLocked3AExitConditions.isEmpty()) {
            result = null;
        } else {
            Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(lockedCondition == null ? Result3AStateListenerKt.toConditionChecker(mapCreateLocked3AExitConditions) : lockedCondition, frameLimit, timeLimitNs);
            this.graphListener3A.addListener(result3AStateListenerImpl);
            GraphState3A.m461update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, bool, null, bool2, 383, null);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str = "lock3A - submitting request with aeLock=" + bool + " , awbLock=" + bool2;
            }
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
            result = result3AStateListenerImpl.getResult();
        }
        if (afLockBehavior == null) {
            Intrinsics.h(result);
            return result;
        }
        if (afTriggerStartAeMode != null) {
            int value = afTriggerStartAeMode.getValue();
            AeMode aeMode2 = this.graphState3A.getCurrent().getAeMode();
            GraphState3A.m461update7jOEVJU$default(this.graphState3A, AeMode.m63boximpl(value), null, null, null, null, null, null, null, null, null, 1022, null);
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
            aeMode = aeMode2;
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        if (!this.graphProcessor.trigger(parameterForAfTriggerStart)) {
            return deferredResult3ASubmitFailed;
        }
        GraphState3A.m461update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 767, null);
        if (aeMode != null) {
            GraphState3A.m461update7jOEVJU$default(this.graphState3A, AeMode.m63boximpl(aeMode.getValue()), null, null, null, null, null, null, null, null, null, 1022, null);
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        }
        Intrinsics.h(result);
        return result;
    }

    private final g0 unlock3APostCaptureAndroidMAndAbove(boolean cancelAf) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        if (!this.graphProcessor.trigger(cancelAf ? aePrecaptureAndAfCancelParams : aePrecaptureCancelParams)) {
            return deferredResult3ASubmitFailed;
        }
        Result3AStateListenerImpl result3AStateListenerImpl = cancelAf ? new Result3AStateListenerImpl(unlock3APostCaptureAfUnlockedCondition, (Integer) null, (Long) null, 6, (DefaultConstructorMarker) null) : new Result3AStateListenerImpl(r0.g(), (Integer) null, (Long) null, 6, (DefaultConstructorMarker) null);
        this.graphListener3A.addListener(result3AStateListenerImpl);
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: update3A-169HPGg$default, reason: not valid java name */
    public static /* synthetic */ g0 m451update3A169HPGg$default(Controller3A controller3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, List list, List list2, List list3, int i, Object obj2) {
        if ((i & 1) != 0) {
            aeMode = null;
        }
        if ((i & 2) != 0) {
            afMode = null;
        }
        if ((i & 4) != 0) {
            awbMode = null;
        }
        if ((i & 8) != 0) {
            flashMode = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        if ((i & 64) != 0) {
            list3 = null;
        }
        return controller3A.m454update3A169HPGg(aeMode, afMode, awbMode, flashMode, list, list2, list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX INFO: renamed from: lock3A-Qz1gx5w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m452lock3AQz1gx5w(java.util.List<android.hardware.camera2.params.MeteringRectangle> r27, java.util.List<android.hardware.camera2.params.MeteringRectangle> r28, java.util.List<android.hardware.camera2.params.MeteringRectangle> r29, androidx.camera.camera2.pipe.Lock3ABehavior r30, androidx.camera.camera2.pipe.Lock3ABehavior r31, androidx.camera.camera2.pipe.Lock3ABehavior r32, androidx.camera.camera2.pipe.AeMode r33, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> r34, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> r35, int r36, java.lang.Long r37, java.lang.Long r38, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super skm.g0> r39) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.Controller3A.m452lock3AQz1gx5w(java.util.List, java.util.List, java.util.List, androidx.camera.camera2.pipe.Lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior, androidx.camera.camera2.pipe.AeMode, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final g0 lock3AForCapture(boolean triggerAf, boolean waitForAwb, int frameLimit, long timeLimitNs) {
        return lock3AForCapture(triggerAf ? parametersForAePrecaptureAndAfTrigger : parametersForAePrecapture, createLock3AForCaptureExitConditions(triggerAf, waitForAwb), frameLimit, timeLimitNs);
    }

    @NotNull
    /* JADX INFO: renamed from: setTorchOff-NqN7i0k, reason: not valid java name */
    public final g0 m453setTorchOffNqN7i0k(AeMode aeMode) {
        return m451update3A169HPGg$default(this, aeMode, null, null, FlashMode.m209boximpl(FlashMode.INSTANCE.m215getOFFLe5xUZU()), null, null, null, LDSFile.EF_DG4_TAG, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final skm.g0 setTorchOn() {
        /*
            r11 = this;
            androidx.camera.camera2.pipe.graph.GraphState3A r0 = r11.graphState3A
            androidx.camera.camera2.pipe.graph.State3A r0 = r0.getCurrent()
            androidx.camera.camera2.pipe.AeMode r0 = r0.getAeMode()
            androidx.camera.camera2.pipe.AeMode$Companion r1 = androidx.camera.camera2.pipe.AeMode.INSTANCE
            int r2 = r1.m73getONbOjpiJc()
            r3 = 0
            if (r0 != 0) goto L15
            r2 = r3
            goto L1d
        L15:
            int r4 = r0.getValue()
            boolean r2 = androidx.camera.camera2.pipe.AeMode.m66equalsimpl0(r4, r2)
        L1d:
            if (r2 != 0) goto L3b
            int r2 = r1.m72getOFFbOjpiJc()
            if (r0 != 0) goto L26
            goto L2e
        L26:
            int r0 = r0.getValue()
            boolean r3 = androidx.camera.camera2.pipe.AeMode.m66equalsimpl0(r0, r2)
        L2e:
            if (r3 == 0) goto L31
            goto L3b
        L31:
            int r0 = r1.m73getONbOjpiJc()
            androidx.camera.camera2.pipe.AeMode r0 = androidx.camera.camera2.pipe.AeMode.m63boximpl(r0)
        L39:
            r2 = r0
            goto L3d
        L3b:
            r0 = 0
            goto L39
        L3d:
            androidx.camera.camera2.pipe.FlashMode$Companion r0 = androidx.camera.camera2.pipe.FlashMode.INSTANCE
            int r0 = r0.m216getTORCHLe5xUZU()
            androidx.camera.camera2.pipe.FlashMode r5 = androidx.camera.camera2.pipe.FlashMode.m209boximpl(r0)
            r9 = 118(0x76, float:1.65E-43)
            r10 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            skm.g0 r0 = m451update3A169HPGg$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.Controller3A.setTorchOn():skm.g0");
    }

    @NotNull
    public final g0 unlock3A(Boolean ae2, Boolean af10, Boolean awb2, Function1<? super FrameMetadata, Boolean> unlockedCondition, int frameLimit, Long timeLimitNs) {
        Boolean bool = !CameraMetadata.INSTANCE.getSupportsAutoFocusTrigger(this.metadata) ? null : af10;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.f(ae2, bool2) && !Intrinsics.f(bool, bool2) && !Intrinsics.f(awb2, bool2)) {
            return e0.a(new Result3A(Result3A.Status.INSTANCE.m338getOKJvTi9ms(), null, null));
        }
        if (this.graphProcessor.getRepeatingRequest() == null) {
            return deferredResult3ASubmitFailed;
        }
        if (Intrinsics.f(bool, bool2)) {
            Log log2 = Log.INSTANCE;
            if (log2.getDEBUG_LOGGABLE()) {
            }
            if (!this.graphProcessor.trigger(parameterForAfTriggerCancel)) {
                if (log2.getDEBUG_LOGGABLE()) {
                }
                return deferredResult3ASubmitFailed;
            }
            GraphState3A.m461update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767, null);
        }
        Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(unlockedCondition == null ? Result3AStateListenerKt.toConditionChecker(createUnLocked3AExitConditions(Intrinsics.f(ae2, bool2), Intrinsics.f(bool, bool2), Intrinsics.f(awb2, bool2))) : unlockedCondition, Integer.valueOf(frameLimit), timeLimitNs);
        this.graphListener3A.addListener(result3AStateListenerImpl);
        Boolean bool3 = Intrinsics.f(ae2, bool2) ? Boolean.FALSE : null;
        Boolean bool4 = Intrinsics.f(awb2, bool2) ? Boolean.FALSE : null;
        if (bool3 != null || bool4 != null) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str = "unlock3A - updating graph state, aeLock=" + bool3 + ", awbLock=" + bool4;
            }
            GraphState3A.m461update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, bool3, null, bool4, 383, null);
        }
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }

    @NotNull
    public final g0 unlock3APostCapture(boolean cancelAf) {
        return this.graphProcessor.getRepeatingRequest() == null ? deferredResult3ASubmitFailed : unlock3APostCaptureAndroidMAndAbove(cancelAf);
    }

    @NotNull
    /* JADX INFO: renamed from: update3A-169HPGg, reason: not valid java name */
    public final g0 m454update3A169HPGg(AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        if (this.graphProcessor.getRepeatingRequest() == null) {
            GraphState3A.m461update7jOEVJU$default(this.graphState3A, aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, null, null, null, 896, null);
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
            return deferredResult3ASubmitFailed;
        }
        Result3AStateListenerImpl result3AStateListenerImplM449createListenerFor3AParams0dPwJB0 = m449createListenerFor3AParams0dPwJB0(aeMode, afMode, awbMode, flashMode);
        this.graphListener3A.addListener(result3AStateListenerImplM449createListenerFor3AParams0dPwJB0);
        GraphState3A.m461update7jOEVJU$default(this.graphState3A, aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, null, null, null, 896, null);
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        g0 result = result3AStateListenerImplM449createListenerFor3AParams0dPwJB0.getResult();
        synchronized (this) {
            try {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    String str = "Controller3A#update3A: cancelling previous request " + this.lastUpdate3AResult;
                }
                g0 g0Var = this.lastUpdate3AResult;
                if (g0Var != null) {
                    e0.l(g0Var, "A newer call for 3A state update initiated.", null);
                }
                this.lastUpdate3AResult = result;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return result;
    }

    private final g0 lock3AForCapture(Map<CaptureRequest.Key<?>, ? extends Object> triggerCondition, Function1<? super FrameMetadata, Boolean> lockedCondition, int frameLimit, long timeLimitNs) {
        if (this.graphProcessor.getRepeatingRequest() == null) {
            return deferredResult3ASubmitFailed;
        }
        if (triggerCondition == null) {
            triggerCondition = parametersForAePrecaptureAndAfTrigger;
        }
        Iterator<Map.Entry<CaptureRequest.Key<?>, ? extends Object>> it8 = triggerCondition.entrySet().iterator();
        boolean z = false;
        while (it8.hasNext()) {
            if (Intrinsics.f(it8.next().getValue(), 1)) {
                z = true;
            }
        }
        if (lockedCondition == null) {
            lockedCondition = createLock3AForCaptureExitConditions(z, false);
        }
        Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(lockedCondition, Integer.valueOf(frameLimit), Long.valueOf(timeLimitNs));
        this.graphListener3A.addListener(result3AStateListenerImpl);
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        if (!this.graphProcessor.trigger(triggerCondition)) {
            this.graphListener3A.removeListener(result3AStateListenerImpl);
            return deferredResult3ASubmitFailed;
        }
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }
}
