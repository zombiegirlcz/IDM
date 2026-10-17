package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.adapter.ZoomValue;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.impl.ZoomControl;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import m72.b;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.q;
import skm.r;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0012J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001b\u0010'\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u0006058F¢\u0006\u0006\u001a\u0004\b6\u00107R(\u0010=\u001a\u0004\u0018\u00010/2\b\u0010\u0007\u001a\u0004\u0018\u00010/8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Landroidx/camera/camera2/impl/ZoomControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/compat/ZoomCompat;", "zoomCompat", "<init>", "(Landroidx/camera/camera2/compat/ZoomCompat;)V", "Landroidx/camera/core/ZoomState;", "value", "", "setZoomState", "(Landroidx/camera/core/ZoomState;)V", "reset", "()V", "", "linearZoom", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "setLinearZoom", "(F)Lcom/google/common/util/concurrent/ListenableFuture;", "zoomRatio", "setZoomRatio", "zoomState", "", "cancelPreviousTask", "shouldUpdateParameters", "applyZoomState", "(Landroidx/camera/core/ZoomState;ZZ)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/camera2/compat/ZoomCompat;", "minZoomRatio", "F", "getMinZoomRatio", "()F", "maxZoomRatio", "getMaxZoomRatio", "Landroidx/camera/camera2/adapter/ZoomValue;", "defaultZoomState$delegate", "Lkotlin/Lazy;", "getDefaultZoomState", "()Landroidx/camera/camera2/adapter/ZoomValue;", "defaultZoomState", "Landroidx/lifecycle/MutableLiveData;", "_zoomState$delegate", "get_zoomState", "()Landroidx/lifecycle/MutableLiveData;", "_zoomState", "isInitialized", "Z", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Lskm/q;", "updateSignal", "Lskm/q;", "Landroidx/lifecycle/LiveData;", "getZoomStateLiveData", "()Landroidx/lifecycle/LiveData;", "zoomStateLiveData", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZoomControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;

    /* JADX INFO: renamed from: _zoomState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy _zoomState;

    /* JADX INFO: renamed from: defaultZoomState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultZoomState;
    private boolean isInitialized;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private q updateSignal;

    @NotNull
    private final ZoomCompat zoomCompat;

    public ZoomControl(@NotNull ZoomCompat zoomCompat) {
        Intrinsics.checkNotNullParameter(zoomCompat, "zoomCompat");
        this.zoomCompat = zoomCompat;
        this.minZoomRatio = zoomCompat.getMinZoomRatio();
        this.maxZoomRatio = zoomCompat.getMaxZoomRatio();
        final int i = 0;
        this.defaultZoomState = j.b(new Function0(this) { // from class: s.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ZoomControl f258733b;

            {
                this.f258733b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ZoomControl.defaultZoomState_delegate$lambda$0(this.f258733b);
                    default:
                        return ZoomControl._zoomState_delegate$lambda$0(this.f258733b);
                }
            }
        });
        final int i2 = 1;
        this._zoomState = j.b(new Function0(this) { // from class: s.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ZoomControl f258733b;

            {
                this.f258733b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ZoomControl.defaultZoomState_delegate$lambda$0(this.f258733b);
                    default:
                        return ZoomControl._zoomState_delegate$lambda$0(this.f258733b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData _zoomState_delegate$lambda$0(ZoomControl zoomControl) {
        return new MutableLiveData(zoomControl.getDefaultZoomState());
    }

    public static /* synthetic */ ListenableFuture applyZoomState$default(ZoomControl zoomControl, ZoomState zoomState, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return zoomControl.applyZoomState(zoomState, z, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZoomValue defaultZoomState_delegate$lambda$0(ZoomControl zoomControl) {
        return new ZoomValue(1.0f, zoomControl.minZoomRatio, zoomControl.maxZoomRatio);
    }

    private final MutableLiveData<ZoomState> get_zoomState() {
        return (MutableLiveData) this._zoomState.getValue();
    }

    private final void setZoomState(ZoomState value) {
        if (Threads.isMainThread()) {
            get_zoomState().setValue(value);
        } else {
            get_zoomState().postValue(value);
        }
    }

    @NotNull
    public final ListenableFuture<Void> applyZoomState(@NotNull ZoomState zoomState, boolean cancelPreviousTask, boolean shouldUpdateParameters) {
        Intrinsics.checkNotNullParameter(zoomState, "zoomState");
        r rVarB = e0.b();
        q qVar = this.updateSignal;
        if (qVar != null) {
            if (cancelPreviousTask) {
                ((r) qVar).h0(new CameraControl.OperationCanceledException("Cancelled due to another zoom value being set."));
            } else {
                CoroutineAdaptersKt.propagateTo(rVarB, qVar);
            }
        }
        this.updateSignal = rVarB;
        setZoomState(zoomState);
        UseCaseCameraRequestControl useCaseCameraRequestControl = get_requestControl();
        if (useCaseCameraRequestControl != null) {
            CoroutineAdaptersKt.propagateTo(shouldUpdateParameters ? this.zoomCompat.applyAsync(zoomState.getZoomRatio(), useCaseCameraRequestControl) : this.zoomCompat.resetAsync(useCaseCameraRequestControl), rVarB);
        } else {
            rVarB.h0(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        ListenableFuture<Void> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture$default((Job) rVarB, (Object) null, 1, (Object) null));
        Intrinsics.checkNotNullExpressionValue(listenableFutureNonCancellationPropagating, "nonCancellationPropagating(...)");
        return listenableFutureNonCancellationPropagating;
    }

    @NotNull
    public final ZoomValue getDefaultZoomState() {
        return (ZoomValue) this.defaultZoomState.getValue();
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    @NotNull
    public final LiveData<ZoomState> getZoomStateLiveData() {
        return get_zoomState();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        applyZoomState$default(this, getDefaultZoomState(), false, false, 6, null);
    }

    @NotNull
    public final ListenableFuture<Void> setLinearZoom(float linearZoom) {
        if (linearZoom <= 1.0f && linearZoom >= BitmapDescriptorFactory.HUE_RED) {
            return applyZoomState$default(this, new ZoomValue(new ZoomValue.LinearZoom(linearZoom), this.minZoomRatio, this.maxZoomRatio), false, false, 6, null);
        }
        ListenableFuture<Void> listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(new IllegalArgumentException("Requested linearZoom " + linearZoom + " is not within valid range [0, 1]"));
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFailedFuture, "immediateFailedFuture(...)");
        return listenableFutureImmediateFailedFuture;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        ZoomState value = get_zoomState().getValue();
        if (value == null) {
            value = getDefaultZoomState();
        }
        applyZoomState(value, false, this.isInitialized || value.getZoomRatio() != 1.0f);
        this.isInitialized = true;
    }

    @NotNull
    public final ListenableFuture<Void> setZoomRatio(float zoomRatio) {
        float f = this.maxZoomRatio;
        if (zoomRatio <= f) {
            float f4 = this.minZoomRatio;
            if (zoomRatio >= f4) {
                return applyZoomState$default(this, new ZoomValue(zoomRatio, f4, f), false, false, 6, null);
            }
        }
        StringBuilder sb6 = new StringBuilder("Requested zoomRatio ");
        sb6.append(zoomRatio);
        sb6.append(" is not within valid range [");
        sb6.append(this.minZoomRatio);
        sb6.append(", ");
        ListenableFuture<Void> listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(new IllegalArgumentException(b.s(sb6, this.maxZoomRatio, ']')));
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFailedFuture, "immediateFailedFuture(...)");
        return listenableFutureImmediateFailedFuture;
    }
}
