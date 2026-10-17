package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import ch.qos.logback.core.CoreConstants;
import com.google.common.util.concurrent.ListenableFuture;
import fim.a;
import gim.d;
import gim.i;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import skm.e0;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\u00020\u00122\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b9\u00108J\u0017\u0010:\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b:\u00108J\u0017\u0010;\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b;\u00108J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0012H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0010H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010D\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010W¨\u0006X"}, d2 = {"Landroidx/camera/camera2/adapter/CameraInternalAdapter;", "Landroidx/camera/core/impl/CameraInternal;", "Landroidx/camera/camera2/config/CameraConfig;", "config", "Landroidx/camera/camera2/impl/UseCaseManager;", "useCaseManager", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "Landroidx/camera/core/impl/CameraControlInternal;", "cameraController", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "<init>", "(Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/camera2/impl/UseCaseManager;Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/impl/CameraControlInternal;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/adapter/CameraStateAdapter;)V", "", "createImmediately", "", "setCameraGraphCreationMode$camera_camera2", "(Z)V", "setCameraGraphCreationMode", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getDeferredCameraGraphConfig$camera_camera2", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getDeferredCameraGraphConfig", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "resumeDeferredCameraGraphCreation$camera_camera2", "(Landroidx/camera/camera2/pipe/CameraGraph;)V", "resumeDeferredCameraGraphCreation", "isPrimary", "setPrimary", "enabled", "setActiveResumingMode", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "release", "()Lcom/google/common/util/concurrent/ListenableFuture;", "getCameraInfoInternal", "()Landroidx/camera/core/impl/CameraInfoInternal;", "Landroidx/camera/core/impl/Observable;", "Landroidx/camera/core/impl/CameraInternal$State;", "getCameraState", "()Landroidx/camera/core/impl/Observable;", "getCameraControlInternal", "()Landroidx/camera/core/impl/CameraControlInternal;", "", "Landroidx/camera/core/UseCase;", "useCasesToAdd", "attachUseCases", "(Ljava/util/Collection;)V", "useCasesToRemove", "detachUseCases", "useCase", "onUseCaseActive", "(Landroidx/camera/core/UseCase;)V", "onUseCaseUpdated", "onUseCaseReset", "onUseCaseInactive", "Landroidx/camera/core/impl/CameraConfig;", "getExtendedConfig", "()Landroidx/camera/core/impl/CameraConfig;", "cameraConfig", "setExtendedConfig", "(Landroidx/camera/core/impl/CameraConfig;)V", "onRemoved", "()V", "isRemoved", "()Z", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/impl/UseCaseManager;", "Landroidx/camera/core/impl/CameraInfoInternal;", "Landroidx/camera/core/impl/CameraControlInternal;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Ljava/lang/String;", "coreCameraConfig", "Landroidx/camera/core/impl/CameraConfig;", "", "debugId", "I", "Lrkm/b;", "Lrkm/b;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraInternalAdapter implements CameraInternal {

    @NotNull
    private final CameraControlInternal cameraController;

    @NotNull
    private final String cameraId;

    @NotNull
    private final CameraInfoInternal cameraInfo;

    @NotNull
    private final CameraStateAdapter cameraStateAdapter;

    @NotNull
    private CameraConfig coreCameraConfig;
    private final int debugId;

    @NotNull
    private final b isRemoved;

    @NotNull
    private final UseCaseThreads threads;

    @NotNull
    private final UseCaseManager useCaseManager;

    /* JADX INFO: renamed from: androidx.camera.camera2.adapter.CameraInternalAdapter$onRemoved$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.adapter.CameraInternalAdapter$onRemoved$2", f = "CameraInternalAdapter.kt", l = {161}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return CameraInternalAdapter.this.new AnonymousClass2(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CameraInternalAdapter.this.cameraStateAdapter.onRemoved();
                UseCaseManager useCaseManager = CameraInternalAdapter.this.useCaseManager;
                this.label = 1;
                if (useCaseManager.close(this) == aVar) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.adapter.CameraInternalAdapter$release$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.adapter.CameraInternalAdapter$release$1", f = "CameraInternalAdapter.kt", l = {96}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return CameraInternalAdapter.this.new AnonymousClass1(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                UseCaseManager useCaseManager = CameraInternalAdapter.this.useCaseManager;
                this.label = 1;
                if (useCaseManager.close(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            e0.k(CameraInternalAdapter.this.threads.getScope(), null);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public CameraInternalAdapter(@NotNull androidx.camera.camera2.config.CameraConfig config, @NotNull UseCaseManager useCaseManager, @NotNull CameraInfoInternal cameraInfo, @NotNull CameraControlInternal cameraController, @NotNull UseCaseThreads threads, @NotNull CameraStateAdapter cameraStateAdapter) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(useCaseManager, "useCaseManager");
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(cameraStateAdapter, "cameraStateAdapter");
        this.useCaseManager = useCaseManager;
        this.cameraInfo = cameraInfo;
        this.cameraController = cameraController;
        this.threads = threads;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraId = config.getCameraId();
        CameraConfig cameraConfigDefaultConfig = CameraConfigs.defaultConfig();
        Intrinsics.checkNotNullExpressionValue(cameraConfigDefaultConfig, "defaultConfig(...)");
        this.coreCameraConfig = cameraConfigDefaultConfig;
        rkm.d cameraAdapterIds = CameraInternalAdapterKt.getCameraAdapterIds();
        cameraAdapterIds.getClass();
        this.debugId = rkm.d.f254895b.incrementAndGet(cameraAdapterIds);
        this.isRemoved = hx7.b.g(false);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Created " + this + " for " + ((Object) CameraId.m186toStringimpl(this.cameraId));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(@NotNull Collection<UseCase> useCasesToAdd) {
        Intrinsics.checkNotNullParameter(useCasesToAdd, "useCasesToAdd");
        this.useCaseManager.attach(d0.d1(useCasesToAdd));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(@NotNull Collection<UseCase> useCasesToRemove) {
        Intrinsics.checkNotNullParameter(useCasesToRemove, "useCasesToRemove");
        this.useCaseManager.detach(d0.d1(useCasesToRemove));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NotNull
    /* JADX INFO: renamed from: getCameraControlInternal, reason: from getter */
    public CameraControlInternal getCameraController() {
        return this.cameraController;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NotNull
    /* JADX INFO: renamed from: getCameraInfoInternal, reason: from getter */
    public CameraInfoInternal getCameraInfo() {
        return this.cameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NotNull
    public Observable<CameraInternal.State> getCameraState() {
        return this.cameraStateAdapter.getCameraInternalState$camera_camera2();
    }

    public final CameraGraph.Config getDeferredCameraGraphConfig$camera_camera2() {
        return this.useCaseManager.getDeferredCameraGraphConfig$camera_camera2();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NotNull
    /* JADX INFO: renamed from: getExtendedConfig, reason: from getter */
    public CameraConfig getCoreCameraConfig() {
        return this.coreCameraConfig;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean isRemoved() {
        return this.isRemoved.b();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void onRemoved() {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = this + " received removed signal. Cleaning up.";
        }
        if (this.isRemoved.a()) {
            e0.C(this.threads.getScope(), null, null, new AnonymousClass2(null), 3);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.useCaseManager.activate(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.useCaseManager.deactivate(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.useCaseManager.reset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(@NotNull UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.useCaseManager.update(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NotNull
    public ListenableFuture<Void> release() {
        return CoroutineAdaptersKt.asListenableFuture$default(e0.C(this.threads.getScope(), null, null, new AnonymousClass1(null), 3), (Object) null, 1, (Object) null);
    }

    public final void resumeDeferredCameraGraphCreation$camera_camera2(@NotNull CameraGraph cameraGraph) {
        Intrinsics.checkNotNullParameter(cameraGraph, "cameraGraph");
        this.useCaseManager.resumeDeferredComponentCreation$camera_camera2(cameraGraph);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(boolean enabled) {
        this.useCaseManager.setActiveResumeMode(enabled);
    }

    public final void setCameraGraphCreationMode$camera_camera2(boolean createImmediately) {
        this.useCaseManager.setCameraGraphCreationMode$camera_camera2(createImmediately);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setExtendedConfig(CameraConfig cameraConfig) {
        CameraConfig cameraConfigDefaultConfig;
        if (cameraConfig == null) {
            cameraConfigDefaultConfig = CameraConfigs.defaultConfig();
            Intrinsics.checkNotNullExpressionValue(cameraConfigDefaultConfig, "defaultConfig(...)");
        } else {
            cameraConfigDefaultConfig = cameraConfig;
        }
        this.coreCameraConfig = cameraConfigDefaultConfig;
        if (cameraConfig != null) {
            cameraConfig.getSessionProcessor(null);
        }
        this.useCaseManager.setSessionProcessor$camera_camera2(null);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setPrimary(boolean isPrimary) {
        this.useCaseManager.setPrimary(isPrimary);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("CameraInternalAdapter<");
        sb6.append((Object) CameraId.m186toStringimpl(this.cameraId));
        sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        return j6.a.v(sb6, ")>", this.debugId);
    }
}
