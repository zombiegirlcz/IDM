package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionConfig;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import org.jetbrains.annotations.NotNull;
import rsl.p;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001TB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00122\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010'\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010'\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010'\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00122\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b4\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120B0A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010MR(\u0010S\u001a\u0004\u0018\u00010>2\b\u0010'\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Landroidx/camera/camera2/impl/State3AControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/UseCaseManager$RunningUseCasesChangeListener;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;", "aeModeDisabler", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "", "Landroidx/camera/core/UseCase;", "useCases", "", "calculateTemplateFromUseCases", "(Ljava/util/Set;)I", "Lskm/g0;", "", "update", "()Lskm/g0;", "", "myRevision", "applyUpdate", "(J)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failAllPendingSignals", "(Ljava/lang/Exception;)V", "flashMode", "", "tryExternalFlashAeMode", "preferredAeMode", "getFinalPreferredAeMode", "(IZLjava/lang/Integer;)I", "template", "getDefaultAfMode", "(I)I", "value", "setFlashModeAsync", "(I)Lskm/g0;", "setTryExternalFlashAeModeAsync", "(Z)Lskm/g0;", "setPreferredAeModeAsync", "(Ljava/lang/Integer;)Lskm/g0;", "setPreferredFocusModeAsync", "reset", "()V", "runningUseCases", "onRunningUseCasesChanged", "(Ljava/util/Set;)V", "getFinalSupportedAeMode", "()I", "Landroidx/camera/camera2/impl/CameraProperties;", "getCameraProperties", "()Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "", "lock", "Ljava/lang/Object;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "", "Lskm/q;", "pendingSignals", "Ljava/util/List;", "currentRevision", "J", "_flashMode", "I", "_template", "_tryExternalFlashAeMode", "Z", "_preferredAeMode", "Ljava/lang/Integer;", "_preferredFocusMode", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "StateSnapshot", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class State3AControl implements UseCaseCameraControl, UseCaseManager.RunningUseCasesChangeListener {
    private int _flashMode;
    private Integer _preferredAeMode;
    private Integer _preferredFocusMode;
    private UseCaseCameraRequestControl _requestControl;
    private int _template;
    private boolean _tryExternalFlashAeMode;

    @NotNull
    private final AutoFlashAEModeDisabler aeModeDisabler;

    @NotNull
    private final CameraProperties cameraProperties;
    private long currentRevision;

    @NotNull
    private final Object lock;

    @NotNull
    private final List<q> pendingSignals;

    @NotNull
    private final UseCaseThreads threads;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/camera/camera2/impl/State3AControl$StateSnapshot;", "", "", "flashMode", "template", "", "tryExternalFlashAeMode", "preferredAeMode", "preferredFocusMode", "<init>", "(IIZLjava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getFlashMode", "getTemplate", "Z", "getTryExternalFlashAeMode", "()Z", "Ljava/lang/Integer;", "getPreferredAeMode", "()Ljava/lang/Integer;", "getPreferredFocusMode", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StateSnapshot {
        private final int flashMode;
        private final Integer preferredAeMode;
        private final Integer preferredFocusMode;
        private final int template;
        private final boolean tryExternalFlashAeMode;

        public StateSnapshot(int i, int i2, boolean z, Integer num, Integer num2) {
            this.flashMode = i;
            this.template = i2;
            this.tryExternalFlashAeMode = z;
            this.preferredAeMode = num;
            this.preferredFocusMode = num2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateSnapshot)) {
                return false;
            }
            StateSnapshot stateSnapshot = (StateSnapshot) other;
            return this.flashMode == stateSnapshot.flashMode && this.template == stateSnapshot.template && this.tryExternalFlashAeMode == stateSnapshot.tryExternalFlashAeMode && Intrinsics.f(this.preferredAeMode, stateSnapshot.preferredAeMode) && Intrinsics.f(this.preferredFocusMode, stateSnapshot.preferredFocusMode);
        }

        public final int getFlashMode() {
            return this.flashMode;
        }

        public final Integer getPreferredAeMode() {
            return this.preferredAeMode;
        }

        public final Integer getPreferredFocusMode() {
            return this.preferredFocusMode;
        }

        public final int getTemplate() {
            return this.template;
        }

        public final boolean getTryExternalFlashAeMode() {
            return this.tryExternalFlashAeMode;
        }

        public int hashCode() {
            int iC = a.c(a.b(this.template, Integer.hashCode(this.flashMode) * 31, 31), 31, this.tryExternalFlashAeMode);
            Integer num = this.preferredAeMode;
            int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.preferredFocusMode;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "StateSnapshot(flashMode=" + this.flashMode + ", template=" + this.template + ", tryExternalFlashAeMode=" + this.tryExternalFlashAeMode + ", preferredAeMode=" + this.preferredAeMode + ", preferredFocusMode=" + this.preferredFocusMode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public State3AControl(@NotNull CameraProperties cameraProperties, @NotNull AutoFlashAEModeDisabler aeModeDisabler, @NotNull UseCaseThreads threads) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(aeModeDisabler, "aeModeDisabler");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.cameraProperties = cameraProperties;
        this.aeModeDisabler = aeModeDisabler;
        this.threads = threads;
        this.lock = new Object();
        this.pendingSignals = new ArrayList();
        this._flashMode = 2;
        this._template = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUpdate(long myRevision) {
        boolean z;
        StateSnapshot stateSnapshot;
        List listD1;
        UseCaseCameraRequestControl useCaseCameraRequestControl = get_requestControl();
        if (useCaseCameraRequestControl == null) {
            failAllPendingSignals(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        synchronized (this.lock) {
            z = myRevision == this.currentRevision;
        }
        if (z) {
            synchronized (this.lock) {
                stateSnapshot = new StateSnapshot(this._flashMode, this._template, this._tryExternalFlashAeMode, this._preferredAeMode, this._preferredFocusMode);
            }
            int finalPreferredAeMode = getFinalPreferredAeMode(stateSnapshot.getFlashMode(), stateSnapshot.getTryExternalFlashAeMode(), stateSnapshot.getPreferredAeMode());
            Integer preferredFocusMode = stateSnapshot.getPreferredFocusMode();
            try {
                g0 g0VarSubmitParameters$default = UseCaseCameraRequestControl.submitParameters$default(useCaseCameraRequestControl, r0.k(new Pair(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(CameraMetadataIntegrationKt.getSupportedAeMode(this.cameraProperties.getMetadata(), finalPreferredAeMode))), new Pair(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(CameraMetadataIntegrationKt.getSupportedAfMode(this.cameraProperties.getMetadata(), preferredFocusMode != null ? preferredFocusMode.intValue() : getDefaultAfMode(stateSnapshot.getTemplate())))), new Pair(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(CameraMetadataIntegrationKt.getSupportedAwbMode(this.cameraProperties.getMetadata(), 1)))), null, null, 6, null);
                synchronized (this.lock) {
                    listD1 = d0.d1(this.pendingSignals);
                }
                g0VarSubmitParameters$default.k(new p(listD1, this, 21));
            } catch (Exception e) {
                failAllPendingSignals(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyUpdate$lambda$3(List list, State3AControl state3AControl, Throwable th10) {
        if (th10 != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                ((r) ((q) it8.next())).h0(th10);
            }
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                ((r) ((q) it9.next())).U(Unit.f186387a);
            }
        }
        synchronized (state3AControl.lock) {
            state3AControl.pendingSignals.removeAll(list);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int calculateTemplateFromUseCases(Set<? extends UseCase> useCases) {
        CaptureConfig repeatingCaptureConfig;
        SessionConfig validSessionConfigOrNull = new SessionConfigAdapter(useCases, false, 2, 0 == true ? 1 : 0).getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null || (repeatingCaptureConfig = validSessionConfigOrNull.getRepeatingCaptureConfig()) == null) {
            return 1;
        }
        Integer numValueOf = Integer.valueOf(repeatingCaptureConfig.getTemplateType());
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    private final void failAllPendingSignals(Exception e) {
        List listD1;
        synchronized (this.lock) {
            listD1 = d0.d1(this.pendingSignals);
            this.pendingSignals.clear();
        }
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            ((r) ((q) it8.next())).h0(e);
        }
    }

    private final int getDefaultAfMode(int template) {
        return (template == 1 || template != 3) ? 4 : 3;
    }

    private final int getFinalPreferredAeMode(int flashMode, boolean tryExternalFlashAeMode, Integer preferredAeMode) {
        int iIntValue = preferredAeMode != null ? preferredAeMode.intValue() : flashMode != 0 ? flashMode != 1 ? 1 : 3 : this.aeModeDisabler.getCorrectedAeMode(2);
        if (tryExternalFlashAeMode && CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.cameraProperties.getMetadata())) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
            }
            iIntValue = 5;
        }
        Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            p.a.z(iIntValue, "State3AControl.getFinalPreferredAeMode: preferAeMode = ", Camera2Logger.TRUNCATED_TAG);
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g0 update() {
        r rVarB = e0.b();
        n0 n0Var = new n0();
        synchronized (this.lock) {
            this.pendingSignals.add(rVarB);
            long j2 = this.currentRevision + 1;
            this.currentRevision = j2;
            n0Var.f186428a = j2;
            Unit unit = Unit.f186387a;
        }
        e0.C(this.threads.getSequentialScope(), null, null, new State3AControl$update$$inlined$confineLaunch$1(null, this, n0Var), 3);
        return rVarB;
    }

    public final int getFinalSupportedAeMode() {
        int supportedAeMode;
        synchronized (this.lock) {
            supportedAeMode = CameraMetadataIntegrationKt.getSupportedAeMode(this.cameraProperties.getMetadata(), getFinalPreferredAeMode(this._flashMode, this._tryExternalFlashAeMode, this._preferredAeMode));
        }
        return supportedAeMode;
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public void onRunningUseCasesChanged(@NotNull Set<? extends UseCase> runningUseCases) {
        Intrinsics.checkNotNullParameter(runningUseCases, "runningUseCases");
        e0.C(this.threads.getSequentialScope(), null, null, new State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1(null, d0.i1(runningUseCases), this), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        synchronized (this.lock) {
            this._tryExternalFlashAeMode = false;
            this._preferredAeMode = null;
            this._preferredFocusMode = null;
            this._flashMode = 2;
            this._template = 1;
            Unit unit = Unit.f186387a;
        }
        update();
    }

    @NotNull
    public final g0 setFlashModeAsync(int value) {
        synchronized (this.lock) {
            this._flashMode = value;
            Unit unit = Unit.f186387a;
        }
        return update();
    }

    @NotNull
    public final g0 setPreferredAeModeAsync(Integer value) {
        synchronized (this.lock) {
            this._preferredAeMode = value;
            Unit unit = Unit.f186387a;
        }
        return update();
    }

    @NotNull
    public final g0 setPreferredFocusModeAsync(Integer value) {
        synchronized (this.lock) {
            this._preferredFocusMode = value;
            Unit unit = Unit.f186387a;
        }
        return update();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        update();
    }

    @NotNull
    public final g0 setTryExternalFlashAeModeAsync(boolean value) {
        synchronized (this.lock) {
            this._tryExternalFlashAeMode = value;
            Unit unit = Unit.f186387a;
        }
        return update();
    }
}
