package androidx.camera.camera2.impl;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.compat.workaround.MeteringRegionCorrection;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import ard.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import fim.a;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.k0;
import skm.q;
import skm.r;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0001qB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010!\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J-\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b)\u0010*J'\u0010.\u001a\u00020\u0016\"\u0004\b\u0000\u0010+*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u0012*\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00106\u001a\u00020\u001f2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001d\u0010:\u001a\u00020\u00162\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010=J%\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120A2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020\u000f¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010T\u001a\n S*\u0004\u0018\u00010R0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001c\u0010V\u001a\n S*\u0004\u0018\u00010R0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u001c\u0010W\u001a\n S*\u0004\u0018\u00010R0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0014\u0010X\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001e\u0010]\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R \u0010`\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0014\u0010h\u001a\u00020e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010l\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006r"}, d2 = {"Landroidx/camera/camera2/impl/FocusMeteringControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/UseCaseManager$RunningUseCasesChangeListener;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "meteringRegionCorrection", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/compat/ZoomCompat;", "zoomCompat", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/compat/ZoomCompat;)V", "", "delayMillis", "Lskm/q;", "Landroidx/camera/core/FocusMeteringResult;", "resultToCancel", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "triggerAutoCancel", "(JLskm/q;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "resultToComplete", "triggerFocusTimeout", "(JLskm/q;)V", "Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "resultDeferred", "", "shouldTriggerAf", "propagateToFocusMeteringResultDeferred", "(Lskm/g0;Lskm/q;Z)V", "Landroidx/camera/camera2/pipe/AeMode;", "preferredMode", "getSupportedAeMode-rTgdhRc", "(I)I", "getSupportedAeMode", "signalToCancel", "cancelFocusAndMeteringNowAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Lskm/q;)Lskm/g0;", "T", "", "message", "setCancelException", "(Lskm/q;Ljava/lang/String;)V", "toFocusMeteringResult", "(Landroidx/camera/camera2/pipe/Result3A;Z)Landroidx/camera/core/FocusMeteringResult;", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "isAfModeSupported-wvCmZyc", "(I)Z", "isAfModeSupported", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "onRunningUseCasesChanged", "(Ljava/util/Set;)V", "reset", "()V", "Landroidx/camera/core/FocusMeteringAction;", "action", "autoFocusTimeoutMs", "Lcom/google/common/util/concurrent/ListenableFuture;", "startFocusAndMetering", "(Landroidx/camera/core/FocusMeteringAction;J)Lcom/google/common/util/concurrent/ListenableFuture;", "isFocusMeteringSupported", "(Landroidx/camera/core/FocusMeteringAction;)Z", "cancelFocusAndMeteringAsync", "()Lskm/g0;", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "Landroidx/camera/camera2/impl/State3AControl;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/compat/ZoomCompat;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Landroid/util/Rational;", "previewAspectRatio", "Landroid/util/Rational;", "", "kotlin.jvm.PlatformType", "maxAfRegionCount", "Ljava/lang/Integer;", "maxAeRegionCount", "maxAwbRegionCount", "supportsAutoFocusTrigger", "Z", "", "availableAeModes", "Ljava/util/List;", "availableAfModes", "updateSignal", "Lskm/q;", "cancelSignal", "Lkotlinx/coroutines/Job;", "focusTimeoutJob", "Lkotlinx/coroutines/Job;", "autoCancelJob", "Landroid/graphics/Rect;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "cropSensorRegion", "getDefaultAspectRatio", "()Landroid/util/Rational;", "defaultAspectRatio", "value", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusMeteringControl implements UseCaseCameraControl, UseCaseManager.RunningUseCasesChangeListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private UseCaseCameraRequestControl _requestControl;
    private Job autoCancelJob;
    private final List<AeMode> availableAeModes;
    private final List<AfMode> availableAfModes;

    @NotNull
    private final CameraProperties cameraProperties;
    private q cancelSignal;
    private Job focusTimeoutJob;
    private final Integer maxAeRegionCount;
    private final Integer maxAfRegionCount;
    private final Integer maxAwbRegionCount;

    @NotNull
    private final MeteringRegionCorrection meteringRegionCorrection;
    private Rational previewAspectRatio;

    @NotNull
    private final State3AControl state3AControl;
    private final boolean supportsAutoFocusTrigger;

    @NotNull
    private final UseCaseThreads threads;
    private q updateSignal;

    @NotNull
    private final ZoomCompat zoomCompat;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/camera/camera2/impl/FocusMeteringControl$Companion;", "", "<init>", "()V", "METERING_WEIGHT_DEFAULT", "", "AUTO_FOCUS_TIMEOUT_DURATION", "", "meteringRegionsFromMeteringPoints", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "meteringPoints", "Landroidx/camera/core/MeteringPoint;", "maxRegionCount", "cropSensorRegion", "Landroid/graphics/Rect;", "defaultAspectRatio", "Landroid/util/Rational;", "meteringMode", "meteringRegionCorrection", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "getFovAdjustedPoint", "Landroid/graphics/PointF;", "meteringPoint", "cropRegionAspectRatio", "getMeteringRect", "normalizedPointF", "normalizedSize", "", "cropRegion", "isValid", "", "pt", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PointF getFovAdjustedPoint(MeteringPoint meteringPoint, Rational cropRegionAspectRatio, Rational defaultAspectRatio, int meteringMode, MeteringRegionCorrection meteringRegionCorrection) {
            Rational surfaceAspectRatio = meteringPoint.getSurfaceAspectRatio();
            if (surfaceAspectRatio != null) {
                defaultAspectRatio = surfaceAspectRatio;
            }
            PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, meteringMode);
            if (Intrinsics.f(defaultAspectRatio, cropRegionAspectRatio)) {
                return new PointF(correctedPoint.x, correctedPoint.y);
            }
            if (defaultAspectRatio.compareTo(cropRegionAspectRatio) > 0) {
                PointF pointF = new PointF(correctedPoint.x, correctedPoint.y);
                float fDoubleValue = (float) (defaultAspectRatio.doubleValue() / cropRegionAspectRatio.doubleValue());
                pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / ((double) 2))) + pointF.y);
                return pointF;
            }
            PointF pointF2 = new PointF(correctedPoint.x, correctedPoint.y);
            float fDoubleValue2 = (float) (cropRegionAspectRatio.doubleValue() / defaultAspectRatio.doubleValue());
            pointF2.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / ((double) 2))) + pointF2.x);
            return pointF2;
        }

        private final MeteringRectangle getMeteringRect(PointF normalizedPointF, float normalizedSize, Rect cropRegion) {
            int iWidth = (int) ((normalizedPointF.x * cropRegion.width()) + cropRegion.left);
            int iHeight = (int) ((normalizedPointF.y * cropRegion.height()) + cropRegion.top);
            int iWidth2 = ((int) (cropRegion.width() * normalizedSize)) / 2;
            int iHeight2 = ((int) (normalizedSize * cropRegion.height())) / 2;
            Rect rect = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
            rect.left = f.g(rect.left, cropRegion.left, cropRegion.right);
            rect.right = f.g(rect.right, cropRegion.left, cropRegion.right);
            rect.top = f.g(rect.top, cropRegion.top, cropRegion.bottom);
            rect.bottom = f.g(rect.bottom, cropRegion.top, cropRegion.bottom);
            return new MeteringRectangle(rect, 1000);
        }

        private final boolean isValid(MeteringPoint pt7) {
            return pt7.getX() >= BitmapDescriptorFactory.HUE_RED && pt7.getX() <= 1.0f && pt7.getY() >= BitmapDescriptorFactory.HUE_RED && pt7.getY() <= 1.0f;
        }

        @NotNull
        public final List<MeteringRectangle> meteringRegionsFromMeteringPoints(@NotNull List<? extends MeteringPoint> meteringPoints, int maxRegionCount, @NotNull Rect cropSensorRegion, @NotNull Rational defaultAspectRatio, int meteringMode, @NotNull MeteringRegionCorrection meteringRegionCorrection) {
            Intrinsics.checkNotNullParameter(meteringPoints, "meteringPoints");
            Intrinsics.checkNotNullParameter(cropSensorRegion, "cropSensorRegion");
            Intrinsics.checkNotNullParameter(defaultAspectRatio, "defaultAspectRatio");
            Intrinsics.checkNotNullParameter(meteringRegionCorrection, "meteringRegionCorrection");
            if (meteringPoints.isEmpty() || maxRegionCount == 0) {
                return f0.f322471a;
            }
            ArrayList arrayList = new ArrayList();
            Rational rational = new Rational(cropSensorRegion.width(), cropSensorRegion.height());
            for (MeteringPoint meteringPoint : meteringPoints) {
                if (arrayList.size() >= maxRegionCount) {
                    break;
                }
                if (isValid(meteringPoint)) {
                    Rational rational2 = defaultAspectRatio;
                    int i = meteringMode;
                    arrayList.add(getMeteringRect(getFovAdjustedPoint(meteringPoint, rational, rational2, i, meteringRegionCorrection), meteringPoint.getSize(), cropSensorRegion));
                    defaultAspectRatio = rational2;
                    meteringMode = i;
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FocusMeteringControl$triggerAutoCancel$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.FocusMeteringControl$triggerAutoCancel$1", f = "FocusMeteringControl.kt", l = {266}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ UseCaseCameraRequestControl $requestControl;
        final /* synthetic */ q $resultToCancel;
        int label;
        final /* synthetic */ FocusMeteringControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j2, FocusMeteringControl focusMeteringControl, UseCaseCameraRequestControl useCaseCameraRequestControl, q qVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$delayMillis = j2;
            this.this$0 = focusMeteringControl;
            this.$requestControl = useCaseCameraRequestControl;
            this.$resultToCancel = qVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.$delayMillis, this.this$0, this.$requestControl, this.$resultToCancel, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                long j2 = this.$delayMillis;
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
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            long j3 = this.$delayMillis;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "triggerAutoCancel: auto-canceling after " + j3 + " ms";
            }
            this.this$0.cancelFocusAndMeteringNowAsync(this.$requestControl, this.$resultToCancel);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FocusMeteringControl$triggerFocusTimeout$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.FocusMeteringControl$triggerFocusTimeout$1", f = "FocusMeteringControl.kt", l = {280}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18291 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ q $resultToComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18291(long j2, q qVar, Continuation<? super C18291> continuation) {
            super(2, continuation);
            this.$delayMillis = j2;
            this.$resultToComplete = qVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new C18291(this.$delayMillis, this.$resultToComplete, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                long j2 = this.$delayMillis;
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
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            long j3 = this.$delayMillis;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "triggerFocusTimeout: completing with focus result unsuccessful after " + j3 + " ms";
            }
            q qVar = this.$resultToComplete;
            FocusMeteringResult focusMeteringResultCreate = FocusMeteringResult.create(false);
            Intrinsics.checkNotNullExpressionValue(focusMeteringResultCreate, "create(...)");
            ((r) qVar).U(focusMeteringResultCreate);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18291) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public FocusMeteringControl(@NotNull CameraProperties cameraProperties, @NotNull MeteringRegionCorrection meteringRegionCorrection, @NotNull State3AControl state3AControl, @NotNull UseCaseThreads threads, @NotNull ZoomCompat zoomCompat) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(meteringRegionCorrection, "meteringRegionCorrection");
        Intrinsics.checkNotNullParameter(state3AControl, "state3AControl");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(zoomCompat, "zoomCompat");
        this.cameraProperties = cameraProperties;
        this.meteringRegionCorrection = meteringRegionCorrection;
        this.state3AControl = state3AControl;
        this.threads = threads;
        this.zoomCompat = zoomCompat;
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_MAX_REGIONS_AF = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        Intrinsics.checkNotNullExpressionValue(CONTROL_MAX_REGIONS_AF, "CONTROL_MAX_REGIONS_AF");
        this.maxAfRegionCount = (Integer) metadata.getOrDefault((CameraCharacteristics.Key<int>) CONTROL_MAX_REGIONS_AF, 0);
        CameraMetadata metadata2 = cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_MAX_REGIONS_AE = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        Intrinsics.checkNotNullExpressionValue(CONTROL_MAX_REGIONS_AE, "CONTROL_MAX_REGIONS_AE");
        this.maxAeRegionCount = (Integer) metadata2.getOrDefault((CameraCharacteristics.Key<int>) CONTROL_MAX_REGIONS_AE, 0);
        CameraMetadata metadata3 = cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_MAX_REGIONS_AWB = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        Intrinsics.checkNotNullExpressionValue(CONTROL_MAX_REGIONS_AWB, "CONTROL_MAX_REGIONS_AWB");
        this.maxAwbRegionCount = (Integer) metadata3.getOrDefault((CameraCharacteristics.Key<int>) CONTROL_MAX_REGIONS_AWB, 0);
        this.supportsAutoFocusTrigger = CameraMetadata.INSTANCE.getSupportsAutoFocusTrigger(cameraProperties.getMetadata());
        CameraMetadata metadata4 = cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_AE_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AE_AVAILABLE_MODES, "CONTROL_AE_AVAILABLE_MODES");
        int[] iArr = (int[]) metadata4.get(CONTROL_AE_AVAILABLE_MODES);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList.add(AeMode.INSTANCE.m71fromIntOrNullkQd0u18(i));
            }
        } else {
            arrayList = null;
        }
        this.availableAeModes = arrayList;
        CameraMetadata metadata5 = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_AF_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AF_AVAILABLE_MODES, "CONTROL_AF_AVAILABLE_MODES");
        int[] iArr2 = (int[]) metadata5.get(CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            arrayList2 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                arrayList2.add(AfMode.INSTANCE.m82fromIntOrNullMKXwA8g(i2));
            }
        }
        this.availableAfModes = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g0 cancelFocusAndMeteringNowAsync(UseCaseCameraRequestControl requestControl, q signalToCancel) {
        if (signalToCancel != null) {
            setCancelException(signalToCancel, "Cancelled by cancelFocusAndMetering()");
        }
        this.state3AControl.setPreferredFocusModeAsync(null);
        return requestControl.cancelFocusAndMeteringAsync();
    }

    private final Rect getCropSensorRegion() {
        return this.zoomCompat.getCropSensorRegion();
    }

    private final Rational getDefaultAspectRatio() {
        Rational rational = this.previewAspectRatio;
        return rational == null ? new Rational(getCropSensorRegion().width(), getCropSensorRegion().height()) : rational;
    }

    /* JADX INFO: renamed from: getSupportedAeMode-rTgdhRc, reason: not valid java name */
    private final int m36getSupportedAeModerTgdhRc(int preferredMode) {
        List<AeMode> list = this.availableAeModes;
        if (list == null) {
            return AeMode.INSTANCE.m72getOFFbOjpiJc();
        }
        if (list.contains(AeMode.m63boximpl(preferredMode))) {
            return preferredMode;
        }
        List<AeMode> list2 = this.availableAeModes;
        AeMode.Companion companion = AeMode.INSTANCE;
        return list2.contains(AeMode.m63boximpl(companion.m73getONbOjpiJc())) ? companion.m73getONbOjpiJc() : companion.m72getOFFbOjpiJc();
    }

    /* JADX INFO: renamed from: isAfModeSupported-wvCmZyc, reason: not valid java name */
    private final boolean m37isAfModeSupportedwvCmZyc(int afMode) {
        List<AfMode> list = this.availableAfModes;
        if (list == null) {
            return false;
        }
        return list.contains(AfMode.m74boximpl(afMode));
    }

    private final void propagateToFocusMeteringResultDeferred(g0 g0Var, q qVar, boolean z) {
        g0Var.k(new t(qVar, g0Var, this, z, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit propagateToFocusMeteringResultDeferred$lambda$0(q qVar, g0 g0Var, FocusMeteringControl focusMeteringControl, boolean z, Throwable th10) {
        if (th10 != null) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
            }
            ((r) qVar).h0(th10);
        } else {
            Result3A result3A = (Result3A) g0Var.h();
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str = "propagateToFocusMeteringResultDeferred: result3A = " + result3A;
            }
            int status = result3A.getStatus();
            Result3A.Status.Companion companion = Result3A.Status.INSTANCE;
            if (Result3A.Status.m334equalsimpl0(status, companion.m340getSUBMIT_FAILEDJvTi9ms())) {
                ((r) qVar).h0(new CameraControl.OperationCanceledException("Camera is not active."));
            } else if (Result3A.Status.m334equalsimpl0(result3A.getStatus(), companion.m341getTIME_LIMIT_REACHEDJvTi9ms())) {
                FocusMeteringResult focusMeteringResultCreate = FocusMeteringResult.create(false);
                Intrinsics.checkNotNullExpressionValue(focusMeteringResultCreate, "create(...)");
                ((r) qVar).U(focusMeteringResultCreate);
            } else {
                ((r) qVar).U(focusMeteringControl.toFocusMeteringResult(result3A, z));
            }
        }
        return Unit.f186387a;
    }

    private final <T> void setCancelException(q qVar, String str) {
        ((r) qVar).h0(new CameraControl.OperationCanceledException(str));
    }

    public static /* synthetic */ ListenableFuture startFocusAndMetering$default(FocusMeteringControl focusMeteringControl, FocusMeteringAction focusMeteringAction, long j2, int i, Object obj2) {
        if ((i & 2) != 0) {
            j2 = 5000;
        }
        return focusMeteringControl.startFocusAndMetering(focusMeteringAction, j2);
    }

    private final FocusMeteringResult toFocusMeteringResult(Result3A result3A, boolean z) {
        Integer num;
        boolean z3 = false;
        if (!Result3A.Status.m334equalsimpl0(result3A.getStatus(), Result3A.Status.INSTANCE.m338getOKJvTi9ms())) {
            FocusMeteringResult focusMeteringResultCreate = FocusMeteringResult.create(false);
            Intrinsics.checkNotNullExpressionValue(focusMeteringResultCreate, "create(...)");
            return focusMeteringResultCreate;
        }
        FrameMetadata frameMetadata = result3A.getFrameMetadata();
        if (frameMetadata != null) {
            CaptureResult.Key CONTROL_AF_STATE = CaptureResult.CONTROL_AF_STATE;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AF_STATE, "CONTROL_AF_STATE");
            num = (Integer) frameMetadata.get(CONTROL_AF_STATE);
        } else {
            num = null;
        }
        if (z && (!m37isAfModeSupportedwvCmZyc(AfMode.INSTANCE.m83getAUTOvHZNRtE()) || (result3A.getFrameMetadata() != null && (num == null || num.intValue() == 4)))) {
            z3 = true;
        }
        FocusMeteringResult focusMeteringResultCreate2 = FocusMeteringResult.create(z3);
        Intrinsics.checkNotNullExpressionValue(focusMeteringResultCreate2, "create(...)");
        return focusMeteringResultCreate2;
    }

    private final void triggerAutoCancel(long delayMillis, q resultToCancel, UseCaseCameraRequestControl requestControl) {
        Job job2 = this.autoCancelJob;
        if (job2 != null) {
            job2.f(null);
        }
        this.autoCancelJob = e0.C(this.threads.getSequentialScope(), null, null, new AnonymousClass1(delayMillis, this, requestControl, resultToCancel, null), 3);
    }

    private final void triggerFocusTimeout(long delayMillis, q resultToComplete) {
        Job job2 = this.focusTimeoutJob;
        if (job2 != null) {
            job2.f(null);
        }
        this.focusTimeoutJob = e0.C(this.threads.getSequentialScope(), null, null, new C18291(delayMillis, resultToComplete, null), 3);
    }

    @NotNull
    public final g0 cancelFocusAndMeteringAsync() {
        r rVarB = e0.b();
        UseCaseCameraRequestControl useCaseCameraRequestControl = get_requestControl();
        if (useCaseCameraRequestControl == null) {
            rVarB.h0(new CameraControl.OperationCanceledException("Camera is not active."));
            return rVarB;
        }
        Job job2 = this.focusTimeoutJob;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.autoCancelJob;
        if (job3 != null) {
            job3.f(null);
        }
        q qVar = this.cancelSignal;
        if (qVar != null) {
            setCancelException(qVar, "Cancelled by another cancelFocusAndMetering()");
        }
        this.cancelSignal = rVarB;
        CoroutineAdaptersKt.propagateTo(cancelFocusAndMeteringNowAsync(useCaseCameraRequestControl, this.updateSignal), rVarB);
        return rVarB;
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    public final boolean isFocusMeteringSupported(@NotNull FocusMeteringAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Companion companion = INSTANCE;
        List<MeteringPoint> meteringPointsAe = action.getMeteringPointsAe();
        Intrinsics.checkNotNullExpressionValue(meteringPointsAe, "getMeteringPointsAe(...)");
        Integer maxAeRegionCount = this.maxAeRegionCount;
        Intrinsics.checkNotNullExpressionValue(maxAeRegionCount, "maxAeRegionCount");
        List<MeteringRectangle> listMeteringRegionsFromMeteringPoints = companion.meteringRegionsFromMeteringPoints(meteringPointsAe, maxAeRegionCount.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 2, this.meteringRegionCorrection);
        List<MeteringPoint> meteringPointsAf = action.getMeteringPointsAf();
        Intrinsics.checkNotNullExpressionValue(meteringPointsAf, "getMeteringPointsAf(...)");
        Integer maxAfRegionCount = this.maxAfRegionCount;
        Intrinsics.checkNotNullExpressionValue(maxAfRegionCount, "maxAfRegionCount");
        List<MeteringRectangle> listMeteringRegionsFromMeteringPoints2 = companion.meteringRegionsFromMeteringPoints(meteringPointsAf, maxAfRegionCount.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 1, this.meteringRegionCorrection);
        List<MeteringPoint> meteringPointsAwb = action.getMeteringPointsAwb();
        Intrinsics.checkNotNullExpressionValue(meteringPointsAwb, "getMeteringPointsAwb(...)");
        Integer maxAwbRegionCount = this.maxAwbRegionCount;
        Intrinsics.checkNotNullExpressionValue(maxAwbRegionCount, "maxAwbRegionCount");
        return (listMeteringRegionsFromMeteringPoints.isEmpty() && listMeteringRegionsFromMeteringPoints2.isEmpty() && companion.meteringRegionsFromMeteringPoints(meteringPointsAwb, maxAwbRegionCount.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 4, this.meteringRegionCorrection).isEmpty()) ? false : true;
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public void onRunningUseCasesChanged(@NotNull Set<? extends UseCase> runningUseCases) {
        Size attachedSurfaceResolution;
        Intrinsics.checkNotNullParameter(runningUseCases, "runningUseCases");
        this.previewAspectRatio = null;
        for (UseCase useCase : runningUseCases) {
            if ((useCase instanceof Preview) && (attachedSurfaceResolution = ((Preview) useCase).getAttachedSurfaceResolution()) != null) {
                this.previewAspectRatio = new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        this.previewAspectRatio = null;
        cancelFocusAndMeteringAsync();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NotNull FocusMeteringAction action, long autoFocusTimeoutMs) {
        int i;
        List<MeteringRectangle> list;
        List<MeteringRectangle> list2;
        List<MeteringRectangle> list3;
        g0 g0VarUpdate3aRegions;
        Intrinsics.checkNotNullParameter(action, "action");
        r rVarB = e0.b();
        UseCaseCameraRequestControl useCaseCameraRequestControl = get_requestControl();
        if (useCaseCameraRequestControl != null) {
            Job job2 = this.focusTimeoutJob;
            if (job2 != null) {
                job2.f(null);
            }
            Job job3 = this.autoCancelJob;
            if (job3 != null) {
                job3.f(null);
            }
            q qVar = this.cancelSignal;
            if (qVar != null) {
                setCancelException(qVar, "Cancelled by another startFocusAndMetering()");
            }
            q qVar2 = this.updateSignal;
            if (qVar2 != null) {
                setCancelException(qVar2, "Cancelled by another startFocusAndMetering()");
            }
            this.updateSignal = rVarB;
            Companion companion = INSTANCE;
            List<MeteringPoint> meteringPointsAe = action.getMeteringPointsAe();
            Intrinsics.checkNotNullExpressionValue(meteringPointsAe, "getMeteringPointsAe(...)");
            Integer maxAeRegionCount = this.maxAeRegionCount;
            Intrinsics.checkNotNullExpressionValue(maxAeRegionCount, "maxAeRegionCount");
            List<MeteringRectangle> listMeteringRegionsFromMeteringPoints = companion.meteringRegionsFromMeteringPoints(meteringPointsAe, maxAeRegionCount.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 2, this.meteringRegionCorrection);
            List<MeteringPoint> meteringPointsAf = action.getMeteringPointsAf();
            Intrinsics.checkNotNullExpressionValue(meteringPointsAf, "getMeteringPointsAf(...)");
            Integer maxAfRegionCount = this.maxAfRegionCount;
            Intrinsics.checkNotNullExpressionValue(maxAfRegionCount, "maxAfRegionCount");
            List<MeteringRectangle> listMeteringRegionsFromMeteringPoints2 = companion.meteringRegionsFromMeteringPoints(meteringPointsAf, maxAfRegionCount.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 1, this.meteringRegionCorrection);
            List<MeteringPoint> meteringPointsAwb = action.getMeteringPointsAwb();
            Intrinsics.checkNotNullExpressionValue(meteringPointsAwb, "getMeteringPointsAwb(...)");
            Integer maxAwbRegionCount = this.maxAwbRegionCount;
            Intrinsics.checkNotNullExpressionValue(maxAwbRegionCount, "maxAwbRegionCount");
            List<MeteringRectangle> listMeteringRegionsFromMeteringPoints3 = companion.meteringRegionsFromMeteringPoints(meteringPointsAwb, maxAwbRegionCount.intValue(), getCropSensorRegion(), getDefaultAspectRatio(), 4, this.meteringRegionCorrection);
            if (listMeteringRegionsFromMeteringPoints.isEmpty() && listMeteringRegionsFromMeteringPoints2.isEmpty() && listMeteringRegionsFromMeteringPoints3.isEmpty()) {
                rVarB.h0(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                return CoroutineAdaptersKt.asListenableFuture$default((g0) rVarB, (Object) null, 1, (Object) null);
            }
            List<MeteringRectangle> listV0 = listMeteringRegionsFromMeteringPoints2;
            if (!listV0.isEmpty()) {
                this.state3AControl.setPreferredFocusModeAsync(1);
            }
            if (this.maxAeRegionCount.intValue() > 0) {
                List<MeteringRectangle> listV02 = listMeteringRegionsFromMeteringPoints;
                if (listV02.isEmpty()) {
                    listV02 = kotlin.collections.d.v0(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                list = listV02;
            } else {
                list = null;
            }
            if (this.maxAfRegionCount.intValue() > 0) {
                if (listV0.isEmpty()) {
                    listV0 = kotlin.collections.d.v0(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                list2 = listV0;
            } else {
                list2 = null;
            }
            if (this.maxAwbRegionCount.intValue() > 0) {
                List<MeteringRectangle> listV03 = listMeteringRegionsFromMeteringPoints3;
                if (listV03.isEmpty()) {
                    listV03 = kotlin.collections.d.v0(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                list3 = listV03;
            } else {
                list3 = null;
            }
            if (listMeteringRegionsFromMeteringPoints2.isEmpty() || !this.supportsAutoFocusTrigger) {
                i = 1;
                List<MeteringRectangle> list4 = list;
                List<MeteringRectangle> list5 = list3;
                List<MeteringRectangle> list6 = list2;
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                }
                g0VarUpdate3aRegions = useCaseCameraRequestControl.update3aRegions(list4, list6, list5);
            } else {
                long autoCancelDurationInMillis = (!action.isAutoCancelEnabled() || action.getAutoCancelDurationInMillis() >= autoFocusTimeoutMs) ? autoFocusTimeoutMs : action.getAutoCancelDurationInMillis();
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                }
                i = 1;
                g0VarUpdate3aRegions = UseCaseCameraRequestControl.m56startFocusAndMeteringAsyncNxRnBj4$default(useCaseCameraRequestControl, list, list2, list3, null, this.maxAfRegionCount.intValue() > 0 ? Lock3ABehavior.m234boximpl(Lock3ABehavior.INSTANCE.m243getIMMEDIATEhRqSH3k()) : null, null, AeMode.m63boximpl(m36getSupportedAeModerTgdhRc(AeMode.INSTANCE.m73getONbOjpiJc())), TimeUnit.NANOSECONDS.convert(autoCancelDurationInMillis, TimeUnit.MILLISECONDS), 40, null);
            }
            propagateToFocusMeteringResultDeferred(g0VarUpdate3aRegions, rVarB, (listMeteringRegionsFromMeteringPoints2.isEmpty() ? 1 : 0) ^ i);
            triggerFocusTimeout(autoFocusTimeoutMs, rVarB);
            if (action.isAutoCancelEnabled()) {
                triggerAutoCancel(action.getAutoCancelDurationInMillis(), rVarB, useCaseCameraRequestControl);
            }
        } else {
            i = 1;
            rVarB.h0(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return CoroutineAdaptersKt.asListenableFuture$default((g0) rVarB, (Object) null, i, (Object) null);
    }
}
