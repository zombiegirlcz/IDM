package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.c;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import skm.b0;
import skm.c2;
import skm.e0;
import ukm.y;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraStatusMonitor;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor;", "Lphm/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "<init>", "(Lphm/a;Landroidx/camera/camera2/pipe/core/Threads;Ljava/lang/String;Lkotlinx/coroutines/Job;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "cameraStatusFlow", "()Lkotlinx/coroutines/flow/Flow;", "", "close", "()V", "Landroidx/camera/camera2/pipe/core/Threads;", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "manager", "Landroid/hardware/camera2/CameraManager;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lrkm/b;", "closed", "Lrkm/b;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_cameraAvailability", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "cameraAvailability", "Lkotlinx/coroutines/flow/StateFlow;", "getCameraAvailability", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_cameraPriorities", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "cameraPriorities", "Lkotlinx/coroutines/flow/SharedFlow;", "getCameraPriorities", "()Lkotlinx/coroutines/flow/SharedFlow;", "cameraStatus", "Lkotlinx/coroutines/flow/Flow;", "cameraStatusJob", "Lkotlinx/coroutines/Job;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraStatusMonitor implements CameraStatusMonitor {

    @NotNull
    private final MutableStateFlow _cameraAvailability;

    @NotNull
    private final MutableSharedFlow _cameraPriorities;

    @NotNull
    private final StateFlow cameraAvailability;

    @NotNull
    private final String cameraId;

    @NotNull
    private final SharedFlow cameraPriorities;

    @NotNull
    private final Flow cameraStatus;

    @NotNull
    private final Job cameraStatusJob;

    @NotNull
    private final b closed;
    private final CameraManager manager;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final Threads threads;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1", f = "Camera2CameraStatusMonitor.kt", l = {114}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<ProducerScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Camera2CameraStatusMonitor camera2CameraStatusMonitor, Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1 camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1) {
            camera2CameraStatusMonitor.manager.unregisterAvailabilityCallback(camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1);
            return Unit.f186387a;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = Camera2CameraStatusMonitor.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final Camera2CameraStatusMonitor camera2CameraStatusMonitor = Camera2CameraStatusMonitor.this;
                CameraManager.AvailabilityCallback availabilityCallback = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1
                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraAccessPrioritiesChanged() {
                        Log log2 = Log.INSTANCE;
                        if (log2.getDEBUG_LOGGABLE()) {
                        }
                        if (!(c.E(producerScope, CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged.INSTANCE) instanceof y) || log2.getWARN_LOGGABLE()) {
                        }
                    }

                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraAvailable(String cameraId) {
                        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
                        if (Intrinsics.f(cameraId, camera2CameraStatusMonitor.cameraId)) {
                            Log log2 = Log.INSTANCE;
                            if (log2.getDEBUG_LOGGABLE()) {
                                String str = "Camera " + cameraId + " has become available";
                            }
                            if ((c.E(producerScope, new CameraStatusMonitor.CameraStatus.CameraAvailable(CameraId.m182constructorimpl(cameraId), null)) instanceof y) && log2.getWARN_LOGGABLE()) {
                                String str2 = "Failed to emit CameraAvailable(" + cameraId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                            }
                        }
                    }

                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraUnavailable(String cameraId) {
                        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
                        if (Intrinsics.f(cameraId, camera2CameraStatusMonitor.cameraId)) {
                            Log log2 = Log.INSTANCE;
                            if (log2.getDEBUG_LOGGABLE()) {
                                String str = "Camera " + cameraId + " has become unavailable";
                            }
                            if ((c.E(producerScope, new CameraStatusMonitor.CameraStatus.CameraUnavailable(CameraId.m182constructorimpl(cameraId), null)) instanceof y) && log2.getWARN_LOGGABLE()) {
                                String str2 = "Failed to emit CameraUnavailable(" + cameraId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                            }
                        }
                    }
                };
                CameraManager cameraManager = Camera2CameraStatusMonitor.this.manager;
                Intrinsics.checkNotNullExpressionValue(cameraManager, "access$getManager$p(...)");
                Api28Compat.registerAvailabilityCallback(cameraManager, Camera2CameraStatusMonitor.this.threads.getLightweightExecutor(), availabilityCallback);
                a aVar2 = new a(Camera2CameraStatusMonitor.this, availabilityCallback, 1);
                this.label = 1;
                if (com.bumptech.glide.d.d(producerScope, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public /* synthetic */ Camera2CameraStatusMonitor(phm.a aVar, Threads threads, String str, Job job2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, threads, str, job2);
    }

    private final Flow cameraStatusFlow() {
        return q.k(new AnonymousClass1(null));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed.a()) {
            this.cameraStatusJob.f(null);
            e0.k(this.scope, null);
        }
    }

    @Override // androidx.camera.camera2.pipe.internal.CameraStatusMonitor
    @NotNull
    public StateFlow getCameraAvailability() {
        return this.cameraAvailability;
    }

    @Override // androidx.camera.camera2.pipe.internal.CameraStatusMonitor
    @NotNull
    public SharedFlow getCameraPriorities() {
        return this.cameraPriorities;
    }

    private Camera2CameraStatusMonitor(phm.a cameraManager, Threads threads, String cameraId, Job cameraPipeJob) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(cameraPipeJob, "cameraPipeJob");
        this.threads = threads;
        this.cameraId = cameraId;
        this.manager = (CameraManager) cameraManager.get();
        zkm.d dVarC = e0.c(e.d(new c2(cameraPipeJob), threads.getLightweightDispatcher().plus(new b0("CXCP-CameraStatusMonitor"))));
        this.scope = dVarC;
        this.closed = hx7.b.g(false);
        j2 j2VarC = q.c(CameraStatusMonitor.CameraStatus.Unknown.INSTANCE);
        this._cameraAvailability = j2VarC;
        this.cameraAvailability = q.h(j2VarC);
        z1 z1VarB = q.b(0, 7, null);
        this._cameraPriorities = z1VarB;
        this.cameraPriorities = q.g(z1VarB);
        this.cameraStatus = cameraStatusFlow();
        this.cameraStatusJob = e0.C(dVarC, null, null, new Camera2CameraStatusMonitor$cameraStatusJob$1(this, null), 3);
    }
}
