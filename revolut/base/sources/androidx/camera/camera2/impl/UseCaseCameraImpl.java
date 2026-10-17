package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import phm.a;
import rkm.b;
import rkm.d;
import skm.e0;
import yhm.j;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u00020 2\u0006\u0010'\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J(\u00105\u001a\u0002042\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u000200H\u0096@¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010=\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR#\u0010G\u001a\n B*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR#\u0010K\u001a\n B*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010JR#\u0010O\u001a\n B*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraImpl;", "Landroidx/camera/camera2/impl/UseCaseCamera;", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/core/impl/SessionProcessor;", "sessionProcessor", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lphm/a;", "Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "useCaseSurfaceManagerProvider", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapterProvider", "Landroidx/camera/camera2/impl/CapturePipeline;", "capturePipelineProvider", "<init>", "(Landroidx/camera/camera2/config/UseCaseGraphContext;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/core/impl/SessionProcessor;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Lphm/a;Lphm/a;Lphm/a;)V", "Landroidx/camera/camera2/pipe/StreamId;", "findStillCaptureStreamId-4TVKcYk", "()Landroidx/camera/camera2/pipe/StreamId;", "findStillCaptureStreamId", "stillCaptureStreamId", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "", "setCaptureSessionRequestProcessor-9O56998", "(Landroidx/camera/camera2/pipe/StreamId;Landroidx/camera/camera2/pipe/CameraGraph;)V", "setCaptureSessionRequestProcessor", "start", "()V", "Lkotlinx/coroutines/Job;", "close", "()Lkotlinx/coroutines/Job;", "", "enabled", "setActiveResumeMode", "(Z)V", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lkotlinx/coroutines/Job;", "", "toString", "()Ljava/lang/String;", "", "captureMode", "flashMode", "flashType", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipeline", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Lphm/a;", "debugId", "I", "Lrkm/b;", "closed", "Lrkm/b;", "kotlin.jvm.PlatformType", "useCaseSurfaceManager$delegate", "Lkotlin/Lazy;", "getUseCaseSurfaceManager", "()Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "useCaseSurfaceManager", "sessionConfigAdapter$delegate", "getSessionConfigAdapter", "()Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapter", "capturePipeline$delegate", "getCapturePipeline", "()Landroidx/camera/camera2/impl/CapturePipeline;", "capturePipeline", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseCaseCameraImpl implements UseCaseCamera {

    /* JADX INFO: renamed from: capturePipeline$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy capturePipeline;

    @NotNull
    private final a capturePipelineProvider;

    @NotNull
    private final b closed;
    private final int debugId;

    @NotNull
    private final UseCaseCameraRequestControl requestControl;

    /* JADX INFO: renamed from: sessionConfigAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sessionConfigAdapter;

    @NotNull
    private final a sessionConfigAdapterProvider;

    @NotNull
    private final UseCaseThreads threads;

    @NotNull
    private final UseCaseGraphContext useCaseGraphContext;

    /* JADX INFO: renamed from: useCaseSurfaceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy useCaseSurfaceManager;

    @NotNull
    private final a useCaseSurfaceManagerProvider;

    public UseCaseCameraImpl(@NotNull UseCaseGraphContext useCaseGraphContext, @NotNull UseCaseThreads threads, SessionProcessor sessionProcessor, @NotNull UseCaseCameraRequestControl requestControl, @NotNull a useCaseSurfaceManagerProvider, @NotNull a sessionConfigAdapterProvider, @NotNull a capturePipelineProvider) {
        Intrinsics.checkNotNullParameter(useCaseGraphContext, "useCaseGraphContext");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(requestControl, "requestControl");
        Intrinsics.checkNotNullParameter(useCaseSurfaceManagerProvider, "useCaseSurfaceManagerProvider");
        Intrinsics.checkNotNullParameter(sessionConfigAdapterProvider, "sessionConfigAdapterProvider");
        Intrinsics.checkNotNullParameter(capturePipelineProvider, "capturePipelineProvider");
        this.useCaseGraphContext = useCaseGraphContext;
        this.threads = threads;
        this.requestControl = requestControl;
        this.useCaseSurfaceManagerProvider = useCaseSurfaceManagerProvider;
        this.sessionConfigAdapterProvider = sessionConfigAdapterProvider;
        this.capturePipelineProvider = capturePipelineProvider;
        d useCaseCameraIds = UseCaseCameraKt.getUseCaseCameraIds();
        useCaseCameraIds.getClass();
        this.debugId = d.f254895b.incrementAndGet(useCaseCameraIds);
        final int i = 0;
        this.closed = hx7.b.g(false);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Configured " + this;
        }
        this.useCaseSurfaceManager = j.b(new Function0(this) { // from class: s.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraImpl f258729b;

            {
                this.f258729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return UseCaseCameraImpl.useCaseSurfaceManager_delegate$lambda$0(this.f258729b);
                    case 1:
                        return UseCaseCameraImpl.sessionConfigAdapter_delegate$lambda$0(this.f258729b);
                    default:
                        return UseCaseCameraImpl.capturePipeline_delegate$lambda$0(this.f258729b);
                }
            }
        });
        final int i2 = 1;
        this.sessionConfigAdapter = j.b(new Function0(this) { // from class: s.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraImpl f258729b;

            {
                this.f258729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return UseCaseCameraImpl.useCaseSurfaceManager_delegate$lambda$0(this.f258729b);
                    case 1:
                        return UseCaseCameraImpl.sessionConfigAdapter_delegate$lambda$0(this.f258729b);
                    default:
                        return UseCaseCameraImpl.capturePipeline_delegate$lambda$0(this.f258729b);
                }
            }
        });
        final int i3 = 2;
        this.capturePipeline = j.b(new Function0(this) { // from class: s.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraImpl f258729b;

            {
                this.f258729b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return UseCaseCameraImpl.useCaseSurfaceManager_delegate$lambda$0(this.f258729b);
                    case 1:
                        return UseCaseCameraImpl.sessionConfigAdapter_delegate$lambda$0(this.f258729b);
                    default:
                        return UseCaseCameraImpl.capturePipeline_delegate$lambda$0(this.f258729b);
                }
            }
        });
    }

    public static final /* synthetic */ SessionProcessor access$getSessionProcessor$p(UseCaseCameraImpl useCaseCameraImpl) {
        useCaseCameraImpl.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CapturePipeline capturePipeline_delegate$lambda$0(UseCaseCameraImpl useCaseCameraImpl) {
        return (CapturePipeline) useCaseCameraImpl.capturePipelineProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: findStillCaptureStreamId-4TVKcYk, reason: not valid java name */
    public final StreamId m54findStillCaptureStreamId4TVKcYk() {
        Object next;
        SessionConfig validSessionConfigOrNull = getSessionConfigAdapter().getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null) {
            return null;
        }
        List<DeferrableSurface> surfaces = validSessionConfigOrNull.getRepeatingCaptureConfig().getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
        List<DeferrableSurface> surfaces2 = validSessionConfigOrNull.getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces2, "getSurfaces(...)");
        Iterator<T> it8 = surfaces2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (!surfaces.contains((DeferrableSurface) next)) {
                break;
            }
        }
        DeferrableSurface deferrableSurface = (DeferrableSurface) next;
        if (deferrableSurface == null) {
            return null;
        }
        return (StreamId) d0.c0(this.useCaseGraphContext.getStreamIdsFromSurfaces(u.c(deferrableSurface)));
    }

    private final CapturePipeline getCapturePipeline() {
        return (CapturePipeline) this.capturePipeline.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionConfigAdapter getSessionConfigAdapter() {
        return (SessionConfigAdapter) this.sessionConfigAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UseCaseSurfaceManager getUseCaseSurfaceManager() {
        return (UseCaseSurfaceManager) this.useCaseSurfaceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionConfigAdapter sessionConfigAdapter_delegate$lambda$0(UseCaseCameraImpl useCaseCameraImpl) {
        return (SessionConfigAdapter) useCaseCameraImpl.sessionConfigAdapterProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCaptureSessionRequestProcessor-9O56998, reason: not valid java name */
    public final void m55setCaptureSessionRequestProcessor9O56998(StreamId stillCaptureStreamId, CameraGraph cameraGraph) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseCaseSurfaceManager useCaseSurfaceManager_delegate$lambda$0(UseCaseCameraImpl useCaseCameraImpl) {
        return (UseCaseSurfaceManager) useCaseCameraImpl.useCaseSurfaceManagerProvider.get();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    @NotNull
    public Job close() {
        if (!this.closed.a()) {
            return e0.a(Unit.f186387a);
        }
        getRequestControl().close();
        return e0.C(this.threads.getSequentialScope(), null, null, new UseCaseCameraImpl$close$$inlined$confineLaunch$1(null, this), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public Object getCameraCapturePipeline(int i, int i2, int i3, @NotNull Continuation<? super CameraCapturePipeline> continuation) {
        return getCapturePipeline().getCameraCapturePipeline(i, i2, i3, continuation);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    @NotNull
    public UseCaseCameraRequestControl getRequestControl() {
        return this.requestControl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public void setActiveResumeMode(boolean enabled) {
        e0.C(this.threads.getSequentialScope(), null, null, new UseCaseCameraImpl$setActiveResumeMode$$inlined$confineLaunch$1(null, this, enabled), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public void start() {
        e0.C(this.threads.getSequentialScope(), null, null, new UseCaseCameraImpl$start$$inlined$confineLaunch$1(null, this), 3);
    }

    @NotNull
    public String toString() {
        return "UseCaseCamera-" + this.debugId;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    @NotNull
    public Job updateRepeatingRequestAsync(boolean isPrimary, @NotNull Collection<? extends UseCase> runningUseCases) {
        Intrinsics.checkNotNullParameter(runningUseCases, "runningUseCases");
        return getRequestControl().updateRepeatingRequestAsync(isPrimary, runningUseCases);
    }
}
