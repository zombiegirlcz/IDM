package androidx.camera.camera2.impl;

import a0.d;
import androidx.camera.camera2.adapter.EvCompValue;
import androidx.camera.camera2.compat.EvCompCompat;
import androidx.camera.core.CameraControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010*\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/camera/camera2/impl/EvCompControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/compat/EvCompCompat;", "compat", "<init>", "(Landroidx/camera/camera2/compat/EvCompCompat;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lskm/q;", "", "createFailureResult", "(Ljava/lang/Exception;)Lskm/q;", "", "reset", "()V", "exposureIndex", "", "cancelPreviousTask", "Lskm/g0;", "updateAsync", "(IZ)Lskm/g0;", "Landroidx/camera/camera2/compat/EvCompCompat;", "value", "evCompIndex", "I", "setEvCompIndex", "(I)V", "Landroidx/camera/camera2/adapter/EvCompValue;", "exposureState", "Landroidx/camera/camera2/adapter/EvCompValue;", "getExposureState", "()Landroidx/camera/camera2/adapter/EvCompValue;", "setExposureState", "(Landroidx/camera/camera2/adapter/EvCompValue;)V", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EvCompControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;

    @NotNull
    private final EvCompCompat compat;
    private int evCompIndex;

    @NotNull
    private EvCompValue exposureState;

    public EvCompControl(@NotNull EvCompCompat compat) {
        Intrinsics.checkNotNullParameter(compat, "compat");
        this.compat = compat;
        this.exposureState = new EvCompValue(compat.getSupported(), this.evCompIndex, compat.getRange(), compat.getStep());
    }

    private final q createFailureResult(Exception exception) {
        r rVarB = e0.b();
        rVarB.h0(exception);
        return rVarB;
    }

    private final void setEvCompIndex(int i) {
        this.evCompIndex = i;
        this.exposureState = this.exposureState.updateIndex$camera_camera2(i);
    }

    public static /* synthetic */ g0 updateAsync$default(EvCompControl evCompControl, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return evCompControl.updateAsync(i, z);
    }

    @NotNull
    public final EvCompValue getExposureState() {
        return this.exposureState;
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        setEvCompIndex(0);
        updateAsync$default(this, 0, false, 2, null);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        updateAsync(this.evCompIndex, false);
    }

    @NotNull
    public final g0 updateAsync(int exposureIndex, boolean cancelPreviousTask) {
        if (!this.compat.getSupported()) {
            return createFailureResult(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        if (!this.compat.getRange().contains(Integer.valueOf(exposureIndex))) {
            StringBuilder sbW = d.w(exposureIndex, "Requested ExposureCompensation ", " is not within valid range [");
            sbW.append(this.compat.getRange().getUpper());
            sbW.append(" .. ");
            sbW.append(this.compat.getRange().getLower());
            sbW.append(']');
            return createFailureResult(new IllegalArgumentException(sbW.toString()));
        }
        UseCaseCameraRequestControl useCaseCameraRequestControl = get_requestControl();
        if (useCaseCameraRequestControl != null) {
            setEvCompIndex(exposureIndex);
            g0 g0VarApplyAsync = this.compat.applyAsync(exposureIndex, useCaseCameraRequestControl, cancelPreviousTask);
            if (g0VarApplyAsync != null) {
                return g0VarApplyAsync;
            }
        }
        CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
        this.compat.stopRunningTask(operationCanceledException);
        return createFailureResult(operationCanceledException);
    }
}
