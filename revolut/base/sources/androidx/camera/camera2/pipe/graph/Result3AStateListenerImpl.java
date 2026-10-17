package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.RequestNumber;
import androidx.camera.camera2.pipe.Result3A;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import skm.r1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u001c\u0010\u0010\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u001dR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0018\u0010+\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020$0-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/camera/camera2/pipe/graph/Result3AStateListenerImpl;", "Landroidx/camera/camera2/pipe/graph/Result3AStateListener;", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "exitCondition", "", "frameLimit", "", "timeLimitNs", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Long;)V", "", "Landroid/hardware/camera2/CaptureResult$Key;", "", "", "exitConditionForKeys", "(Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Long;)V", "Landroidx/camera/camera2/pipe/RequestNumber;", "requestNumber", "", "onRequestSequenceCreated-DThHKJ0", "(J)V", "onRequestSequenceCreated", "frameMetadata", "update-voP-kFw", "(JLandroidx/camera/camera2/pipe/FrameMetadata;)Z", "update", "onStopRepeating", "()V", "onGraphStopped", "onGraphShutdown", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Integer;", "Ljava/lang/Long;", "Lskm/q;", "Landroidx/camera/camera2/pipe/Result3A;", "_result", "Lskm/q;", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumberOfFirstUpdate", "Landroidx/camera/camera2/pipe/FrameNumber;", "timestampOfFirstUpdateNs", "initialRequestNumber", "Landroidx/camera/camera2/pipe/RequestNumber;", "Lskm/g0;", "getResult", "()Lskm/g0;", "result", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Result3AStateListenerImpl implements Result3AStateListener {

    @NotNull
    private final q _result;

    @NotNull
    private final Function1<FrameMetadata, Boolean> exitCondition;
    private final Integer frameLimit;
    private volatile FrameNumber frameNumberOfFirstUpdate;
    private RequestNumber initialRequestNumber;
    private final Long timeLimitNs;
    private volatile Long timestampOfFirstUpdateNs;

    /* JADX WARN: Multi-variable type inference failed */
    public Result3AStateListenerImpl(@NotNull Function1<? super FrameMetadata, Boolean> exitCondition, Integer num, Long l2) {
        Intrinsics.checkNotNullParameter(exitCondition, "exitCondition");
        this.exitCondition = exitCondition;
        this.frameLimit = num;
        this.timeLimitNs = l2;
        this._result = e0.b();
    }

    @NotNull
    public final g0 getResult() {
        return this._result;
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphShutdown() {
        ((r) this._result).U(new Result3A(Result3A.Status.INSTANCE.m339getSUBMIT_CANCELLEDJvTi9ms(), null, 2, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphStopped() {
        ((r) this._result).U(new Result3A(Result3A.Status.INSTANCE.m339getSUBMIT_CANCELLEDJvTi9ms(), null, 2, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.Result3AStateListener
    /* JADX INFO: renamed from: onRequestSequenceCreated-DThHKJ0 */
    public void mo466onRequestSequenceCreatedDThHKJ0(long requestNumber) {
        synchronized (this) {
            try {
                if (this.initialRequestNumber == null) {
                    this.initialRequestNumber = RequestNumber.m318boximpl(requestNumber);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onStopRepeating() {
        ((r) this._result).U(new Result3A(Result3A.Status.INSTANCE.m339getSUBMIT_CANCELLEDJvTi9ms(), null, 2, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.Result3AStateListener
    /* JADX INFO: renamed from: update-voP-kFw */
    public boolean mo467updatevoPkFw(long requestNumber, @NotNull FrameMetadata frameMetadata) {
        Intrinsics.checkNotNullParameter(frameMetadata, "frameMetadata");
        if (((r1) this._result).isCompleted() || ((r1) this._result).isCancelled()) {
            return true;
        }
        synchronized (this) {
            RequestNumber requestNumber2 = this.initialRequestNumber;
            if (requestNumber2 != null && requestNumber >= requestNumber2.getValue()) {
                Unit unit = Unit.f186387a;
                CaptureResult.Key SENSOR_TIMESTAMP = CaptureResult.SENSOR_TIMESTAMP;
                Intrinsics.checkNotNullExpressionValue(SENSOR_TIMESTAMP, "SENSOR_TIMESTAMP");
                Long l2 = (Long) frameMetadata.get(SENSOR_TIMESTAMP);
                long jMo220getFrameNumberUgla2oM = frameMetadata.mo220getFrameNumberUgla2oM();
                if (l2 != null && this.timestampOfFirstUpdateNs == null) {
                    this.timestampOfFirstUpdateNs = l2;
                }
                Long l3 = this.timestampOfFirstUpdateNs;
                if (this.timeLimitNs != null && l3 != null && l2 != null && l2.longValue() - l3.longValue() > this.timeLimitNs.longValue()) {
                    ((r) this._result).U(new Result3A(Result3A.Status.INSTANCE.m341getTIME_LIMIT_REACHEDJvTi9ms(), frameMetadata, null));
                    return true;
                }
                if (this.frameNumberOfFirstUpdate == null) {
                    this.frameNumberOfFirstUpdate = FrameNumber.m221boximpl(jMo220getFrameNumberUgla2oM);
                }
                FrameNumber frameNumber = this.frameNumberOfFirstUpdate;
                if (frameNumber != null && this.frameLimit != null && jMo220getFrameNumberUgla2oM - frameNumber.getValue() > this.frameLimit.intValue()) {
                    ((r) this._result).U(new Result3A(Result3A.Status.INSTANCE.m337getFRAME_LIMIT_REACHEDJvTi9ms(), frameMetadata, null));
                    return true;
                }
                if (!((Boolean) this.exitCondition.invoke(frameMetadata)).booleanValue()) {
                    return false;
                }
                ((r) this._result).U(new Result3A(Result3A.Status.INSTANCE.m338getOKJvTi9ms(), frameMetadata, null));
                return true;
            }
            return false;
        }
    }

    public /* synthetic */ Result3AStateListenerImpl(Function1 function1, Integer num, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function1<? super FrameMetadata, Boolean>) function1, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l2);
    }

    public /* synthetic */ Result3AStateListenerImpl(Map map, Integer num, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Map<CaptureResult.Key<?>, ? extends List<? extends Object>>) map, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result3AStateListenerImpl(@NotNull Map<CaptureResult.Key<?>, ? extends List<? extends Object>> exitConditionForKeys, Integer num, Long l2) {
        this(Result3AStateListenerKt.toConditionChecker(exitConditionForKeys), num, l2);
        Intrinsics.checkNotNullParameter(exitConditionForKeys, "exitConditionForKeys");
    }
}
