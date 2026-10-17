package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import skm.r1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/camera/camera2/impl/ResultListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "", "timeLimitNs", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameInfo;", "", "checker", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "totalCaptureResult", "", "onTotalCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onTotalCaptureResult", "J", "Lkotlin/jvm/functions/Function1;", "Lskm/q;", "completeSignal", "Lskm/q;", "timestampOfFirstUpdateNs", "Ljava/lang/Long;", "Lskm/g0;", "getResult", "()Lskm/g0;", "result", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResultListener implements Request.Listener {

    @NotNull
    private final Function1<FrameInfo, Boolean> checker;

    @NotNull
    private final q completeSignal;
    private final long timeLimitNs;
    private volatile Long timestampOfFirstUpdateNs;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultListener(long j2, @NotNull Function1<? super FrameInfo, Boolean> checker) {
        Intrinsics.checkNotNullParameter(checker, "checker");
        this.timeLimitNs = j2;
        this.checker = checker;
        this.completeSignal = e0.b();
    }

    @NotNull
    public final g0 getResult() {
        return this.completeSignal;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onTotalCaptureResult-CcXjc1I */
    public void mo8onTotalCaptureResultCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo totalCaptureResult) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
        if (((r1) this.completeSignal).isCompleted() || ((r1) this.completeSignal).isCancelled()) {
            return;
        }
        FrameMetadata metadata = totalCaptureResult.getMetadata();
        CaptureResult.Key SENSOR_TIMESTAMP = CaptureResult.SENSOR_TIMESTAMP;
        Intrinsics.checkNotNullExpressionValue(SENSOR_TIMESTAMP, "SENSOR_TIMESTAMP");
        Long l2 = (Long) metadata.get(SENSOR_TIMESTAMP);
        if (l2 != null && this.timestampOfFirstUpdateNs == null) {
            this.timestampOfFirstUpdateNs = l2;
        }
        Long l3 = this.timestampOfFirstUpdateNs;
        if (this.timeLimitNs == 0 || l3 == null || l2 == null || l2.longValue() - l3.longValue() <= this.timeLimitNs) {
            if (((Boolean) this.checker.invoke(totalCaptureResult)).booleanValue()) {
                ((r) this.completeSignal).U(totalCaptureResult);
                return;
            }
            return;
        }
        ((r) this.completeSignal).U(null);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Wait for capture result timeout, current: " + l2.longValue() + " first: " + l3.longValue();
        }
    }
}
