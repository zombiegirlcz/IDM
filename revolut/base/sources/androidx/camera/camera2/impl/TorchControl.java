package androidx.camera.camera2.impl;

import android.os.Build;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.compat.Api35Compat;
import androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import ryd.i;
import ryd.k;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001TB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0014*\b\u0012\u0004\u0012\u00020\r0\u00142\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\n0\u001f2\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0011J/\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010)\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$¢\u0006\u0004\b,\u0010-J1\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$H\u0000¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R*\u00107\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b7\u00108\u0012\u0004\b=\u0010\u0011\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\n0\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00106R\u0014\u0010B\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\"\u0010E\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\n0\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010@R\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR(\u0010M\u001a\u0004\u0018\u0001022\b\u0010 \u001a\u0004\u0018\u0001028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\n0N8F¢\u0006\u0006\u001a\u0004\bR\u0010P¨\u0006U"}, d2 = {"Landroidx/camera/camera2/impl/TorchControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "", "level", "Lskm/g0;", "", "updateTorchStrengthLevelAsync", "(I)Lskm/g0;", "stopRunningTaskInternal", "()V", "stopTorchStateTask", "stopTorchStrengthTask", "Lskm/q;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "createFailureResult", "(Lskm/q;Ljava/lang/Exception;)Lskm/q;", "Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "mode", "updateTorchState-RaJ5uN0", "(I)V", "updateTorchState", "Landroidx/lifecycle/MutableLiveData;", "value", "setLiveDataValue", "(Landroidx/lifecycle/MutableLiveData;I)V", "torchState", "", "isFlashUnitOn-RaJ5uN0", "(I)Z", "isFlashUnitOn", "reset", "torch", "cancelPreviousTask", "ignoreFlashUnitAvailability", "setTorchAsync", "(ZZZ)Lskm/g0;", "setTorchAsync-Oup_wC0$camera_camera2", "(IZZ)Lskm/g0;", "Landroidx/camera/camera2/impl/State3AControl;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "hasFlashUnit", "Z", "torchMode", "Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "getTorchMode-MnUA4hI$camera_camera2", "()Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "setTorchMode-UuNXre8$camera_camera2", "(Landroidx/camera/camera2/impl/TorchControl$TorchMode;)V", "getTorchMode-MnUA4hI$camera_camera2$annotations", "kotlin.jvm.PlatformType", "_torchState", "Landroidx/lifecycle/MutableLiveData;", "isTorchStrengthSupported", "defaultTorchStrength", "I", "maxTorchStrength", "_torchStrength", "_updateTorchStateSignal", "Lskm/q;", "_updateTorchStrengthSignal", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "Landroidx/lifecycle/LiveData;", "getTorchStateLiveData", "()Landroidx/lifecycle/LiveData;", "torchStateLiveData", "getTorchStrengthLiveData", "torchStrengthLiveData", "TorchMode", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TorchControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;

    @NotNull
    private final MutableLiveData<Integer> _torchState;

    @NotNull
    private final MutableLiveData<Integer> _torchStrength;
    private q _updateTorchStateSignal;
    private q _updateTorchStrengthSignal;
    private final int defaultTorchStrength;
    private final boolean hasFlashUnit;
    private final boolean isTorchStrengthSupported;
    private final int maxTorchStrength;

    @NotNull
    private final State3AControl state3AControl;

    @NotNull
    private final UseCaseThreads threads;
    private TorchMode torchMode;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TorchMode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int OFF = m43constructorimpl(0);
        private static final int ON = m43constructorimpl(1);
        private static final int USED_AS_FLASH = m43constructorimpl(2);
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/impl/TorchControl$TorchMode$Companion;", "", "<init>", "()V", "OFF", "Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "getOFF-IRs_-R8", "()I", "I", "ON", "getON-IRs_-R8", "USED_AS_FLASH", "getUSED_AS_FLASH-IRs_-R8", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getOFF-IRs_-R8, reason: not valid java name */
            public final int m49getOFFIRs_R8() {
                return TorchMode.OFF;
            }

            /* JADX INFO: renamed from: getON-IRs_-R8, reason: not valid java name */
            public final int m50getONIRs_R8() {
                return TorchMode.ON;
            }

            /* JADX INFO: renamed from: getUSED_AS_FLASH-IRs_-R8, reason: not valid java name */
            public final int m51getUSED_AS_FLASHIRs_R8() {
                return TorchMode.USED_AS_FLASH;
            }

            private Companion() {
            }
        }

        private /* synthetic */ TorchMode(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ TorchMode m42boximpl(int i) {
            return new TorchMode(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m43constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m44equalsimpl(int i, Object obj2) {
            return (obj2 instanceof TorchMode) && i == ((TorchMode) obj2).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m45equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m46hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m47toStringimpl(int i) {
            return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "TorchMode(value=", i);
        }

        public boolean equals(Object obj2) {
            return m44equalsimpl(this.value, obj2);
        }

        public int hashCode() {
            return m46hashCodeimpl(this.value);
        }

        public String toString() {
            return m47toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    public TorchControl(@NotNull CameraProperties cameraProperties, @NotNull State3AControl state3AControl, @NotNull UseCaseThreads threads) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(state3AControl, "state3AControl");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.state3AControl = state3AControl;
        this.threads = threads;
        this.hasFlashUnit = FlashAvailabilityCheckerKt.isFlashAvailable$default(cameraProperties, false, 1, null);
        this._torchState = new MutableLiveData<>(0);
        CameraMetadata.Companion companion = CameraMetadata.INSTANCE;
        this.isTorchStrengthSupported = companion.getSupportsTorchStrength(cameraProperties.getMetadata());
        int defaultTorchStrengthLevel = companion.getDefaultTorchStrengthLevel(cameraProperties.getMetadata());
        this.defaultTorchStrength = defaultTorchStrengthLevel;
        this.maxTorchStrength = companion.getMaxTorchStrengthLevel(cameraProperties.getMetadata());
        this._torchStrength = new MutableLiveData<>(Integer.valueOf(defaultTorchStrengthLevel));
    }

    private final q createFailureResult(q qVar, Exception exc2) {
        r rVar = (r) qVar;
        rVar.h0(exc2);
        return rVar;
    }

    /* JADX INFO: renamed from: isFlashUnitOn-RaJ5uN0, reason: not valid java name */
    private final boolean m38isFlashUnitOnRaJ5uN0(int torchState) {
        return !TorchMode.m45equalsimpl0(torchState, TorchMode.INSTANCE.m49getOFFIRs_R8());
    }

    private final void setLiveDataValue(MutableLiveData<Integer> mutableLiveData, int i) {
        if (Threads.isMainThread()) {
            mutableLiveData.setValue(Integer.valueOf(i));
        } else {
            mutableLiveData.postValue(Integer.valueOf(i));
        }
    }

    public static /* synthetic */ g0 setTorchAsync$default(TorchControl torchControl, boolean z, boolean z3, boolean z4, int i, Object obj2) {
        if ((i & 2) != 0) {
            z3 = true;
        }
        if ((i & 4) != 0) {
            z4 = false;
        }
        return torchControl.setTorchAsync(z, z3, z4);
    }

    /* JADX INFO: renamed from: setTorchAsync-Oup_wC0$camera_camera2$default, reason: not valid java name */
    public static /* synthetic */ g0 m39setTorchAsyncOup_wC0$camera_camera2$default(TorchControl torchControl, int i, boolean z, boolean z3, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return torchControl.m41setTorchAsyncOup_wC0$camera_camera2(i, z, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTorchAsync_Oup_wC0$lambda$1$3(Result3A it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    private final void stopRunningTaskInternal() {
        stopTorchStateTask();
        stopTorchStrengthTask();
    }

    private final void stopTorchStateTask() {
        q qVar = this._updateTorchStateSignal;
        if (qVar != null) {
            createFailureResult(qVar, new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this._updateTorchStateSignal = null;
    }

    private final void stopTorchStrengthTask() {
        q qVar = this._updateTorchStrengthSignal;
        if (qVar != null) {
            createFailureResult(qVar, new CameraControl.OperationCanceledException("There is a new torch strength being set"));
        }
        this._updateTorchStrengthSignal = null;
    }

    /* JADX INFO: renamed from: updateTorchState-RaJ5uN0, reason: not valid java name */
    private final void m40updateTorchStateRaJ5uN0(int mode) {
        this.torchMode = TorchMode.m42boximpl(mode);
        setLiveDataValue(this._torchState, TorchMode.m45equalsimpl0(mode, TorchMode.INSTANCE.m50getONIRs_R8()) ? 1 : 0);
    }

    private final g0 updateTorchStrengthLevelAsync(int level) {
        g0 parametersAsync$default;
        r rVarB = e0.b();
        if (Build.VERSION.SDK_INT < 35 || !this.isTorchStrengthSupported) {
            createFailureResult(rVarB, new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return rVarB;
        }
        if (this._updateTorchStrengthSignal != null) {
            stopTorchStrengthTask();
        }
        this._updateTorchStrengthSignal = rVarB;
        rVarB.k(new i(this, 4));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Api35Compat.setFlashStrengthLevel(linkedHashMap, level);
        UseCaseCameraRequestControl useCaseCameraRequestControl = get_requestControl();
        if (useCaseCameraRequestControl == null || (parametersAsync$default = UseCaseCameraRequestControl.setParametersAsync$default(useCaseCameraRequestControl, linkedHashMap, null, null, 6, null)) == null) {
            createFailureResult(rVarB, new CameraControl.OperationCanceledException("Camera is not active."));
            return rVarB;
        }
        CoroutineAdaptersKt.propagateTo(parametersAsync$default, rVarB);
        Unit unit = Unit.f186387a;
        return rVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateTorchStrengthLevelAsync$lambda$0(TorchControl torchControl, Throwable th10) {
        torchControl._updateTorchStrengthSignal = null;
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    @NotNull
    public final LiveData<Integer> getTorchStateLiveData() {
        return this._torchState;
    }

    @NotNull
    public final LiveData<Integer> getTorchStrengthLiveData() {
        return this._torchStrength;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        stopRunningTaskInternal();
        if (this.torchMode != null) {
            m40updateTorchStateRaJ5uN0(TorchMode.INSTANCE.m49getOFFIRs_R8());
            setTorchAsync$default(this, false, false, false, 6, null);
            this.torchMode = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl r8) {
        /*
            r7 = this;
            r7._requestControl = r8
            androidx.camera.camera2.impl.TorchControl$TorchMode r8 = r7.torchMode
            if (r8 == 0) goto L26
            androidx.lifecycle.LiveData r8 = r7.getTorchStateLiveData()
            java.lang.Object r8 = r8.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L13
            goto L1c
        L13:
            int r8 = r8.intValue()
            r0 = 1
            if (r8 != r0) goto L1c
        L1a:
            r2 = r0
            goto L1e
        L1c:
            r0 = 0
            goto L1a
        L1e:
            r5 = 4
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            setTorchAsync$default(r1, r2, r3, r4, r5, r6)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.TorchControl.setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl):void");
    }

    @NotNull
    public final g0 setTorchAsync(boolean torch, boolean cancelPreviousTask, boolean ignoreFlashUnitAvailability) {
        return m41setTorchAsyncOup_wC0$camera_camera2(torch ? TorchMode.INSTANCE.m50getONIRs_R8() : TorchMode.INSTANCE.m49getOFFIRs_R8(), cancelPreviousTask, ignoreFlashUnitAvailability);
    }

    @NotNull
    /* JADX INFO: renamed from: setTorchAsync-Oup_wC0$camera_camera2, reason: not valid java name */
    public final g0 m41setTorchAsyncOup_wC0$camera_camera2(int mode, boolean cancelPreviousTask, boolean ignoreFlashUnitAvailability) {
        int iM73getONbOjpiJc;
        g0 g0VarMo34setTorchOffAsyncMtizInI;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "TorchControl#setTorchAsync: torch mode = " + ((Object) TorchMode.m47toStringimpl(mode));
        }
        r rVarB = e0.b();
        if (!ignoreFlashUnitAvailability && !this.hasFlashUnit) {
            return createFailureResult(rVarB, new IllegalStateException("No flash unit"));
        }
        UseCaseCameraRequestControl useCaseCameraRequestControl = get_requestControl();
        if (useCaseCameraRequestControl == null) {
            createFailureResult(rVarB, new CameraControl.OperationCanceledException("Camera is not active."));
            return rVarB;
        }
        m40updateTorchStateRaJ5uN0(mode);
        if (cancelPreviousTask) {
            stopTorchStateTask();
        } else {
            q qVar = this._updateTorchStateSignal;
            if (qVar != null) {
                CoroutineAdaptersKt.propagateTo(rVarB, qVar);
            }
        }
        this._updateTorchStateSignal = rVarB;
        this.state3AControl.setPreferredAeModeAsync(m38isFlashUnitOnRaJ5uN0(mode) ? 1 : null);
        AeMode.Companion companion = AeMode.INSTANCE;
        AeMode aeModeM71fromIntOrNullkQd0u18 = companion.m71fromIntOrNullkQd0u18(this.state3AControl.getFinalSupportedAeMode());
        if (aeModeM71fromIntOrNullkQd0u18 != null) {
            iM73getONbOjpiJc = aeModeM71fromIntOrNullkQd0u18.getValue();
        } else {
            if (Logger.isWarnEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = "TorchControl#setTorchAsync: Failed to convert ae mode of value " + this.state3AControl.getFinalSupportedAeMode() + " with AeMode.fromIntOrNull, fallback to AeMode.ON";
            }
            iM73getONbOjpiJc = companion.m73getONbOjpiJc();
        }
        if (m38isFlashUnitOnRaJ5uN0(mode)) {
            if (TorchMode.m45equalsimpl0(mode, TorchMode.INSTANCE.m50getONIRs_R8())) {
                Integer value = getTorchStrengthLiveData().getValue();
                if (value != null) {
                    updateTorchStrengthLevelAsync(value.intValue());
                }
            } else {
                updateTorchStrengthLevelAsync(this.defaultTorchStrength);
            }
            g0VarMo34setTorchOffAsyncMtizInI = useCaseCameraRequestControl.setTorchOnAsync();
        } else {
            g0VarMo34setTorchOffAsyncMtizInI = useCaseCameraRequestControl.mo34setTorchOffAsyncMtizInI(iM73getONbOjpiJc);
        }
        CoroutineAdaptersKt.propagateTo(g0VarMo34setTorchOffAsyncMtizInI, rVarB, new k(15));
        return rVarB;
    }
}
