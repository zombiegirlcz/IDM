package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phm.a;
import skm.e0;
import skm.g0;
import skm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010$\u001a\u00020#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u00132\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/Ju\u0010>\u001a\b\u0012\u0004\u0012\u00020)0\u00132\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00182\u000e\u00103\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00182\u000e\u00104\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00182\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u0001052\b\u00108\u001a\u0004\u0018\u0001052\b\u00109\u001a\u0004\u0018\u00010,2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0016¢\u0006\u0004\b?\u0010+JE\u0010@\u001a\b\u0012\u0004\u0012\u00020)0\u00132\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00182\u000e\u00103\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00182\u000e\u00104\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0018H\u0016¢\u0006\u0004\b@\u0010AJC\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u00130\u00182\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00182\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020DH\u0016¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u001cH\u0096@¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0014H\u0016¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Landroidx/camera/camera2/impl/DeferredUseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Lphm/a;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl;", "implProvider", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Lphm/a;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "getOrCreateImpl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "values", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "type", "Landroidx/camera/core/impl/Config$OptionPriority;", "optionPriority", "Lskm/g0;", "", "setParametersAsync", "(Ljava/util/Map;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;Landroidx/camera/core/impl/Config$OptionPriority;)Lskm/g0;", "submitParameters", "", "keys", "removeParametersAsync", "(Ljava/util/List;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;)Lskm/g0;", "", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lskm/g0;", "Landroidx/camera/core/impl/Config;", "config", "", "tags", "updateCamera2ConfigAsync", "(Landroidx/camera/core/impl/Config;Ljava/util/Map;)Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "setTorchOnAsync", "()Lskm/g0;", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "setTorchOffAsync-MtizInI", "(I)Lskm/g0;", "setTorchOffAsync", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "", "timeLimitNs", "startFocusAndMeteringAsync-NxRnBj4", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;J)Lskm/g0;", "startFocusAndMeteringAsync", "cancelFocusAndMeteringAsync", "update3aRegions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lskm/g0;", "Landroidx/camera/core/impl/CaptureConfig;", "captureSequence", "", "captureMode", "flashType", "flashMode", "Ljava/lang/Void;", "issueSingleCaptureAsync", "(Ljava/util/List;III)Ljava/util/List;", "awaitSurfaceSetup", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Lphm/a;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "impl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeferredUseCaseCameraRequestControl implements UseCaseCameraRequestControl {
    private volatile UseCaseCameraRequestControlImpl impl;

    @NotNull
    private final a implProvider;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final UseCaseThreads threads;

    public DeferredUseCaseCameraRequestControl(@NotNull a implProvider, @NotNull UseCaseThreads threads) {
        Intrinsics.checkNotNullParameter(implProvider, "implProvider");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.implProvider = implProvider;
        this.threads = threads;
        this.isClosed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UseCaseCameraRequestControlImpl getOrCreateImpl() {
        if (this.isClosed.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl;
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = (UseCaseCameraRequestControlImpl) this.implProvider.get();
        if (this.isClosed.get()) {
            useCaseCameraRequestControlImpl2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        this.impl = useCaseCameraRequestControlImpl2;
        Intrinsics.h(useCaseCameraRequestControlImpl2);
        return useCaseCameraRequestControlImpl2;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public Object awaitSurfaceSetup(@NotNull Continuation<? super Boolean> continuation) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.awaitSurfaceSetup(continuation) : e0.J(e0.r(this.threads.getSequentialExecutor()), new DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1(this, null), continuation);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 cancelFocusAndMeteringAsync() {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.cancelFocusAndMeteringAsync() : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$cancelFocusAndMeteringAsync$$inlined$runOnSequential$1(this, null), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public void close() {
        if (this.isClosed.getAndSet(true)) {
            return;
        }
        e0.C(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1(null, this), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public List<g0> issueSingleCaptureAsync(@NotNull List<CaptureConfig> captureSequence, int captureMode, int flashType, int flashMode) {
        Intrinsics.checkNotNullParameter(captureSequence, "captureSequence");
        int size = captureSequence.size();
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl.issueSingleCaptureAsync(captureSequence, captureMode, flashType, flashMode);
        }
        h0 h0VarG = e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$issueSingleCaptureAsync$$inlined$runOnSequentialList$1(this, null, captureSequence, captureMode, flashType, flashMode), 3);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(h0VarG, i, null), 3));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 removeParametersAsync(@NotNull List<? extends CaptureRequest.Key<?>> keys, @NotNull UseCaseCameraRequestControl.Type type) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(type, "type");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.removeParametersAsync(keys, type) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$removeParametersAsync$$inlined$runOnSequential$1(this, null, keys, type), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 setParametersAsync(@NotNull Map<CaptureRequest.Key<?>, ? extends Object> values, @NotNull UseCaseCameraRequestControl.Type type, @NotNull Config.OptionPriority optionPriority) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(optionPriority, "optionPriority");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.setParametersAsync(values, type, optionPriority) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1(this, null, values, type, optionPriority), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    /* JADX INFO: renamed from: setTorchOffAsync-MtizInI, reason: not valid java name */
    public g0 mo34setTorchOffAsyncMtizInI(int aeMode) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.mo34setTorchOffAsyncMtizInI(aeMode) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$setTorchOffAsyncMtizInI$$inlined$runOnSequential$1(this, null, aeMode), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 setTorchOnAsync() {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.setTorchOnAsync() : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(this, null), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    /* JADX INFO: renamed from: startFocusAndMeteringAsync-NxRnBj4, reason: not valid java name */
    public g0 mo35startFocusAndMeteringAsyncNxRnBj4(List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions, Lock3ABehavior aeLockBehavior, Lock3ABehavior afLockBehavior, Lock3ABehavior awbLockBehavior, AeMode afTriggerStartAeMode, long timeLimitNs) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.mo35startFocusAndMeteringAsyncNxRnBj4(aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, timeLimitNs) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$startFocusAndMeteringAsyncNxRnBj4$$inlined$runOnSequential$1(this, null, aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, timeLimitNs), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 submitParameters(@NotNull Map<CaptureRequest.Key<?>, ? extends Object> values, @NotNull UseCaseCameraRequestControl.Type type, @NotNull Config.OptionPriority optionPriority) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(optionPriority, "optionPriority");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.submitParameters(values, type, optionPriority) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1(this, null, values, type, optionPriority), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 update3aRegions(List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.update3aRegions(aeRegions, afRegions, awbRegions) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$update3aRegions$$inlined$runOnSequential$1(this, null, aeRegions, afRegions, awbRegions), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 updateCamera2ConfigAsync(@NotNull Config config, @NotNull Map<String, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(tags, "tags");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.updateCamera2ConfigAsync(config, tags) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$updateCamera2ConfigAsync$$inlined$runOnSequential$1(this, null, config, tags), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 updateRepeatingRequestAsync(boolean isPrimary, @NotNull Collection<? extends UseCase> runningUseCases) {
        Intrinsics.checkNotNullParameter(runningUseCases, "runningUseCases");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.updateRepeatingRequestAsync(isPrimary, runningUseCases) : e0.g(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$updateRepeatingRequestAsync$$inlined$runOnSequential$1(this, null, isPrimary, runningUseCases), 3);
    }
}
