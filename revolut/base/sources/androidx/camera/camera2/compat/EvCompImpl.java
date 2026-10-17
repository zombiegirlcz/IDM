package androidx.camera.camera2.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.CameraControl;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nvg.b0;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import zhm.q0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroidx/camera/camera2/compat/EvCompImpl;", "Landroidx/camera/camera2/compat/EvCompCompat;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "comboRequestListener", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)V", "", "throwable", "", "stopRunningTask", "(Ljava/lang/Throwable;)V", "", "evCompIndex", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lskm/g0;", "applyAsync", "(ILandroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lskm/g0;", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroid/util/Range;", "range", "Landroid/util/Range;", "getRange", "()Landroid/util/Range;", "supported", "Z", "getSupported", "()Z", "Landroid/util/Rational;", "step", "Landroid/util/Rational;", "getStep", "()Landroid/util/Rational;", "Lskm/q;", "updateSignal", "Lskm/q;", "Landroidx/camera/camera2/pipe/Request$Listener;", "updateListener", "Landroidx/camera/camera2/pipe/Request$Listener;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EvCompImpl implements EvCompCompat {

    @NotNull
    private final CameraProperties cameraProperties;

    @NotNull
    private final ComboRequestListener comboRequestListener;

    @NotNull
    private final Range<Integer> range;

    @NotNull
    private final Rational step;
    private final boolean supported;

    @NotNull
    private final UseCaseThreads threads;
    private Request.Listener updateListener;
    private q updateSignal;

    public EvCompImpl(@NotNull CameraProperties cameraProperties, @NotNull UseCaseThreads threads, @NotNull ComboRequestListener comboRequestListener) {
        Integer num;
        Rational rational;
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(comboRequestListener, "comboRequestListener");
        this.cameraProperties = cameraProperties;
        this.threads = threads;
        this.comboRequestListener = comboRequestListener;
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_AE_COMPENSATION_RANGE = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AE_COMPENSATION_RANGE, "CONTROL_AE_COMPENSATION_RANGE");
        Object orDefault = metadata.getOrDefault((CameraCharacteristics.Key<Range<Integer>>) CONTROL_AE_COMPENSATION_RANGE, EvCompCompatKt.getEMPTY_RANGE());
        Intrinsics.checkNotNullExpressionValue(orDefault, "getOrDefault(...)");
        this.range = (Range) orDefault;
        Integer num2 = (Integer) getRange().getUpper();
        this.supported = (num2 == null || num2.intValue() != 0) && ((num = (Integer) getRange().getLower()) == null || num.intValue() != 0);
        if (getSupported()) {
            CameraMetadata metadata2 = cameraProperties.getMetadata();
            CameraCharacteristics.Key CONTROL_AE_COMPENSATION_STEP = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AE_COMPENSATION_STEP, "CONTROL_AE_COMPENSATION_STEP");
            Object obj2 = metadata2.get((CameraCharacteristics.Key<Object>) CONTROL_AE_COMPENSATION_STEP);
            Intrinsics.h(obj2);
            rational = (Rational) obj2;
        } else {
            rational = Rational.ZERO;
            Intrinsics.h(rational);
        }
        this.step = rational;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyAsync$lambda$2$0(EvCompImpl evCompImpl, AnonymousClass3 anonymousClass3, Throwable th10) {
        evCompImpl.comboRequestListener.removeListener(anonymousClass3);
        return Unit.f186387a;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    @NotNull
    public g0 applyAsync(final int evCompIndex, @NotNull UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask) {
        Intrinsics.checkNotNullParameter(requestControl, "requestControl");
        final r rVarB = e0.b();
        q qVar = this.updateSignal;
        if (qVar != null) {
            if (cancelPreviousTask) {
                ((r) qVar).h0(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            } else {
                CoroutineAdaptersKt.propagateTo(rVarB, qVar);
            }
        }
        this.updateSignal = rVarB;
        Request.Listener listener = this.updateListener;
        if (listener != null) {
            this.comboRequestListener.removeListener(listener);
            this.updateListener = null;
        }
        UseCaseCameraRequestControl.setParametersAsync$default(requestControl, q0.c(new Pair(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(evCompIndex))), null, null, 6, null);
        Request.Listener listener2 = new Request.Listener() { // from class: androidx.camera.camera2.compat.EvCompImpl.applyAsync.3
            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* JADX INFO: renamed from: onComplete-CcXjc1I */
            public void mo6onCompleteCcXjc1I(RequestMetadata requestMetadata, long frameNumber, FrameInfo result) {
                Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
                Intrinsics.checkNotNullParameter(result, "result");
                FrameMetadata metadata = result.getMetadata();
                CaptureResult.Key CONTROL_AE_STATE = CaptureResult.CONTROL_AE_STATE;
                Intrinsics.checkNotNullExpressionValue(CONTROL_AE_STATE, "CONTROL_AE_STATE");
                Integer num = (Integer) metadata.get(CONTROL_AE_STATE);
                FrameMetadata metadata2 = result.getMetadata();
                CaptureResult.Key CONTROL_AE_EXPOSURE_COMPENSATION = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
                Intrinsics.checkNotNullExpressionValue(CONTROL_AE_EXPOSURE_COMPENSATION, "CONTROL_AE_EXPOSURE_COMPENSATION");
                Integer num2 = (Integer) metadata2.get(CONTROL_AE_EXPOSURE_COMPENSATION);
                if (num == null || num2 == null) {
                    if (num2 != null) {
                        if (num2.intValue() == evCompIndex) {
                            ((r) rVarB).U(Integer.valueOf(evCompIndex));
                            return;
                        }
                        return;
                    }
                    return;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 2 || iIntValue == 3 || iIntValue == 4) {
                    if (num2.intValue() == evCompIndex) {
                        ((r) rVarB).U(Integer.valueOf(evCompIndex));
                    }
                }
            }
        };
        this.comboRequestListener.addListener(listener2, this.threads.getSequentialExecutor());
        rVarB.k(new b0(this, listener2, 14));
        this.updateListener = listener2;
        return rVarB;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    @NotNull
    public Range<Integer> getRange() {
        return this.range;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    @NotNull
    public Rational getStep() {
        return this.step;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public boolean getSupported() {
        return this.supported;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public void stopRunningTask(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        q qVar = this.updateSignal;
        if (qVar != null) {
            ((r) qVar).h0(throwable);
        }
    }
}
