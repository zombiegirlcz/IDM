package androidx.camera.camera2.impl;

import android.view.Surface;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.ListenableFutureKt;
import com.google.common.util.concurrent.ListenableFuture;
import com.youTransactor.uCube.rpc.Constants;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import q2j.j;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ.\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u0018*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceListener;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "inactiveSurfaceCloser", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapter", "<init>", "(Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;Landroidx/camera/camera2/adapter/SessionConfigAdapter;)V", "", "setSurfaceListener", "()V", "tryClearSurfaceListener", "", "Landroidx/camera/core/impl/DeferrableSurface;", "deferrableSurfaces", "", "timeoutMillis", "Landroid/view/Surface;", "getSurfaces", "(Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "areValid", "(Ljava/util/List;)Z", "Landroidx/camera/camera2/pipe/CameraGraph;", "graph", "", "Landroidx/camera/camera2/pipe/StreamId;", "surfaceToStreamMap", "Lskm/g0;", "setupAsync", "(Landroidx/camera/camera2/pipe/CameraGraph;Landroidx/camera/camera2/adapter/SessionConfigAdapter;Ljava/util/Map;J)Lskm/g0;", "stopAsync", "()Lskm/g0;", "awaitSetupCompletion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "surface", "onSurfaceActive", "(Landroid/view/Surface;)V", "onSurfaceInactive", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/pipe/CameraPipe;", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "", "lock", "Ljava/lang/Object;", "setupDeferred", "Lskm/g0;", "", "activeSurfaceMap", "Ljava/util/Map;", "configuredSurfaceMap", "Lskm/q;", "stopDeferred", "Lskm/q;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class UseCaseSurfaceManager implements CameraSurfaceManager.SurfaceListener {

    @NotNull
    private final Map<Surface, DeferrableSurface> activeSurfaceMap;

    @NotNull
    private final CameraPipe cameraPipe;
    private Map<Surface, ? extends DeferrableSurface> configuredSurfaceMap;

    @NotNull
    private final InactiveSurfaceCloser inactiveSurfaceCloser;

    @NotNull
    private final Object lock;

    @NotNull
    private final SessionConfigAdapter sessionConfigAdapter;
    private g0 setupDeferred;
    private q stopDeferred;

    @NotNull
    private final UseCaseThreads threads;

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager", f = "UseCaseSurfaceManager.kt", l = {Constants.TAG_ATMEL_SERIAL}, m = "awaitSetupCompletion$suspendImpl", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return UseCaseSurfaceManager.awaitSetupCompletion$suspendImpl(UseCaseSurfaceManager.this, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager", f = "UseCaseSurfaceManager.kt", l = {254}, m = "getSurfaces", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18351 extends c {
        int label;
        /* synthetic */ Object result;

        public C18351(Continuation<? super C18351> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return UseCaseSurfaceManager.this.getSurfaces(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2", f = "UseCaseSurfaceManager.kt", l = {258}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Landroid/view/Surface;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super List<Surface>>, Object> {
        final /* synthetic */ List<DeferrableSurface> $deferrableSurfaces;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends DeferrableSurface> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$deferrableSurfaces = list;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass2(this.$deferrableSurfaces, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            }
            o.b(obj2);
            List<DeferrableSurface> list = this.$deferrableSurfaces;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(Futures.nonCancellationPropagating(((DeferrableSurface) it8.next()).getSurface()));
            }
            ListenableFuture listenableFutureSuccessfulAsList = Futures.successfulAsList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listenableFutureSuccessfulAsList, "successfulAsList(...)");
            this.label = 1;
            Object objAwait = ListenableFutureKt.await(listenableFutureSuccessfulAsList, this);
            return objAwait == aVar ? aVar : objAwait;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Surface>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public UseCaseSurfaceManager(@NotNull UseCaseThreads threads, @NotNull CameraPipe cameraPipe, @NotNull InactiveSurfaceCloser inactiveSurfaceCloser, @NotNull SessionConfigAdapter sessionConfigAdapter) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(cameraPipe, "cameraPipe");
        Intrinsics.checkNotNullParameter(inactiveSurfaceCloser, "inactiveSurfaceCloser");
        Intrinsics.checkNotNullParameter(sessionConfigAdapter, "sessionConfigAdapter");
        this.threads = threads;
        this.cameraPipe = cameraPipe;
        this.inactiveSurfaceCloser = inactiveSurfaceCloser;
        this.sessionConfigAdapter = sessionConfigAdapter;
        this.lock = new Object();
        this.activeSurfaceMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean areValid(List<? extends Surface> list) {
        return (list.isEmpty() || list.contains(null)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object awaitSetupCompletion$suspendImpl(androidx.camera.camera2.impl.UseCaseSurfaceManager r4, kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            boolean r0 = r5 instanceof androidx.camera.camera2.impl.UseCaseSurfaceManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1 r0 = (androidx.camera.camera2.impl.UseCaseSurfaceManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1 r0 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.util.concurrent.CancellationException -> L49
            return r5
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.lock
            monitor-enter(r5)
            skm.g0 r2 = r4.setupDeferred     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L5f
            skm.q r4 = r4.stopDeferred     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L3e
            goto L5f
        L3e:
            monitor-exit(r5)
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r4 = r2.i(r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r4 != r1) goto L48
            return r1
        L48:
            return r4
        L49:
            androidx.camera.camera2.impl.Camera2Logger r4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            java.lang.String r4 = "CXCP"
            boolean r4 = androidx.camera.core.Logger.isWarnEnabled(r4)
            if (r4 == 0) goto L5a
            java.lang.String r4 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r5 = "Surface setup was cancelled"
        L5a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L5d:
            r4 = move-exception
            goto L63
        L5f:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return r4
        L63:
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseSurfaceManager.awaitSetupCompletion$suspendImpl(androidx.camera.camera2.impl.UseCaseSurfaceManager, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSurfaces(java.util.List<? extends androidx.camera.core.impl.DeferrableSurface> r5, long r6, kotlin.coroutines.Continuation<? super java.util.List<? extends android.view.Surface>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.impl.UseCaseSurfaceManager.C18351
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1 r0 = (androidx.camera.camera2.impl.UseCaseSurfaceManager.C18351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1 r0 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r8)
            androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2 r8 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2
            r2 = 0
            r8.<init>(r5, r2)
            r0.label = r3
            java.lang.Object r8 = skm.h2.d(r6, r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L48
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        L48:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseSurfaceManager.getSurfaces(java.util.List, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSurfaceListener() {
        this.cameraPipe.cameraSurfaceManager().addListener(this);
    }

    public static /* synthetic */ g0 setupAsync$default(UseCaseSurfaceManager useCaseSurfaceManager, CameraGraph cameraGraph, SessionConfigAdapter sessionConfigAdapter, Map map, long j2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupAsync");
        }
        if ((i & 8) != 0) {
            j2 = 5000;
        }
        return useCaseSurfaceManager.setupAsync(cameraGraph, sessionConfigAdapter, map, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupAsync$lambda$0$3$0(List list, Throwable th10) {
        DeferrableSurfaces.decrementAll(list);
        return Unit.f186387a;
    }

    private final void tryClearSurfaceListener() {
        synchronized (this.lock) {
            try {
                if (this.activeSurfaceMap.isEmpty() && this.configuredSurfaceMap == null) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    if (Logger.isDebugEnabled("CXCP")) {
                        String unused = Camera2Logger.TRUNCATED_TAG;
                        String str = this + " remove surface listener";
                    }
                    this.cameraPipe.cameraSurfaceManager().removeListener(this);
                    q qVar = this.stopDeferred;
                    if (qVar != null) {
                        ((r) qVar).U(Unit.f186387a);
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public Object awaitSetupCompletion(@NotNull Continuation<? super Boolean> continuation) {
        return awaitSetupCompletion$suspendImpl(this, continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener
    public void onSurfaceActive(@NotNull Surface surface) {
        DeferrableSurface deferrableSurface;
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.lock) {
            try {
                Map<Surface, ? extends DeferrableSurface> map = this.configuredSurfaceMap;
                if (map != null && (deferrableSurface = map.get(surface)) != null) {
                    if (!this.activeSurfaceMap.containsKey(surface)) {
                        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                        if (Logger.isDebugEnabled("CXCP")) {
                            String unused = Camera2Logger.TRUNCATED_TAG;
                            String str = "SurfaceActive " + deferrableSurface + " in " + this;
                        }
                        this.activeSurfaceMap.put(surface, deferrableSurface);
                        try {
                            deferrableSurface.incrementUseCount();
                        } catch (DeferrableSurface.SurfaceClosedException e) {
                            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                            if (Logger.isWarnEnabled("CXCP")) {
                                String unused2 = Camera2Logger.TRUNCATED_TAG;
                                String str2 = "Error when " + surface + " going to increase the use count.";
                            }
                            SessionConfigAdapter sessionConfigAdapter = this.sessionConfigAdapter;
                            DeferrableSurface deferrableSurface2 = e.getDeferrableSurface();
                            Intrinsics.checkNotNullExpressionValue(deferrableSurface2, "getDeferrableSurface(...)");
                            sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface2);
                        }
                    }
                    Unit unit = Unit.f186387a;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener
    public void onSurfaceInactive(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.lock) {
            try {
                DeferrableSurface deferrableSurfaceRemove = this.activeSurfaceMap.remove(surface);
                if (deferrableSurfaceRemove != null) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    if (Logger.isDebugEnabled("CXCP")) {
                        String unused = Camera2Logger.TRUNCATED_TAG;
                        String str = "SurfaceInactive " + deferrableSurfaceRemove + " in " + this;
                    }
                    this.inactiveSurfaceCloser.onSurfaceInactive(deferrableSurfaceRemove);
                    try {
                        deferrableSurfaceRemove.decrementUseCount();
                    } catch (IllegalStateException e) {
                        Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                        if (Logger.isWarnEnabled("CXCP")) {
                            String unused2 = Camera2Logger.TRUNCATED_TAG;
                            String str2 = "Error when " + surface + " going to decrease the use count.";
                        }
                    }
                    tryClearSurfaceListener();
                    Unit unit = Unit.f186387a;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @NotNull
    public final g0 setupAsync(@NotNull CameraGraph graph, @NotNull SessionConfigAdapter sessionConfigAdapter, @NotNull Map<DeferrableSurface, StreamId> surfaceToStreamMap, long timeoutMillis) {
        g0 g0VarA;
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(sessionConfigAdapter, "sessionConfigAdapter");
        Intrinsics.checkNotNullParameter(surfaceToStreamMap, "surfaceToStreamMap");
        synchronized (this.lock) {
            try {
                if (this.setupDeferred != null) {
                    throw new IllegalStateException("Surfaces should only be set up once!");
                }
                if (this.stopDeferred != null) {
                    throw new IllegalStateException("Surfaces being setup after stopped!");
                }
                if (this.configuredSurfaceMap != null) {
                    throw new IllegalStateException("Check failed.");
                }
                List<DeferrableSurface> deferrableSurfaces = sessionConfigAdapter.getDeferrableSurfaces();
                try {
                    DeferrableSurfaces.incrementAll(deferrableSurfaces);
                    g0VarA = e0.g(this.threads.getScope(), null, null, new UseCaseSurfaceManager$setupAsync$1$deferred$1(sessionConfigAdapter, this, deferrableSurfaces, timeoutMillis, surfaceToStreamMap, graph, null), 3);
                    g0VarA.k(new j(deferrableSurfaces, 28));
                    this.setupDeferred = g0VarA;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    if (Logger.isWarnEnabled("CXCP")) {
                        String unused = Camera2Logger.TRUNCATED_TAG;
                    }
                    e0.C(this.threads.getScope(), null, null, new UseCaseSurfaceManager$setupAsync$1$4(sessionConfigAdapter, e, null), 3);
                    g0VarA = e0.a(Boolean.FALSE);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return g0VarA;
    }

    @NotNull
    public final g0 stopAsync() {
        q qVarB;
        synchronized (this.lock) {
            try {
                qVarB = this.stopDeferred;
                if (qVarB != null) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    if (Logger.isWarnEnabled("CXCP")) {
                        String unused = Camera2Logger.TRUNCATED_TAG;
                    }
                } else {
                    g0 g0Var = this.setupDeferred;
                    if (g0Var != null) {
                        g0Var.f(null);
                    }
                    this.inactiveSurfaceCloser.closeAll();
                    this.configuredSurfaceMap = null;
                    qVarB = e0.b();
                    this.stopDeferred = qVarB;
                    tryClearSurfaceListener();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return qVarB;
    }
}
