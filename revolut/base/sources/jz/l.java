package jz;

import androidx.lifecycle.Lifecycle;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlowContract$InputData;
import jyk.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import vkm.t0;
import vkm.v1;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends c {

    @NotNull
    public static final d Companion = new d();
    public a2 A;
    public a2 B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f179545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f179546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fz.c f179547n;
    public final vv.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dz.a f179548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pw.c f179549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PreviewlessSelfieFlowContract$InputData f179550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sx.a f179551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ww.b f179552t;
    public final ww.b u;
    public final xv.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vki.a f179553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f179554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f179555y;
    public a2 z;

    public l(q previewlessSelfieDialogMapper, s hintMapper, fz.c cameraLifecycleOwner, vv.d previewlessClient, dz.a cameraKitErrorDialogMapper, pw.c systemCurrentTimeProvider, PreviewlessSelfieFlowContract$InputData inputData, sx.a cameraKitAnalyticsContextHolder, ww.b cameraPerformanceObserver, ww.b cameraPerformanceTracker, xv.h detector) {
        Intrinsics.checkNotNullParameter(previewlessSelfieDialogMapper, "previewlessSelfieDialogMapper");
        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
        Intrinsics.checkNotNullParameter(cameraLifecycleOwner, "cameraLifecycleOwner");
        Intrinsics.checkNotNullParameter(previewlessClient, "previewlessClient");
        Intrinsics.checkNotNullParameter(cameraKitErrorDialogMapper, "cameraKitErrorDialogMapper");
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cameraKitAnalyticsContextHolder, "cameraKitAnalyticsContextHolder");
        Intrinsics.checkNotNullParameter(cameraPerformanceObserver, "cameraPerformanceObserver");
        Intrinsics.checkNotNullParameter(cameraPerformanceTracker, "cameraPerformanceTracker");
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f179545l = previewlessSelfieDialogMapper;
        this.f179546m = hintMapper;
        this.f179547n = cameraLifecycleOwner;
        this.o = previewlessClient;
        this.f179548p = cameraKitErrorDialogMapper;
        this.f179549q = systemCurrentTimeProvider;
        this.f179550r = inputData;
        this.f179551s = cameraKitAnalyticsContextHolder;
        this.f179552t = cameraPerformanceObserver;
        this.u = cameraPerformanceTracker;
        this.v = detector;
        this.f179553w = pyd.c.a(this, new b(0));
        this.f179554x = vkm.q.c(Boolean.FALSE);
    }

    @Override // yji.n
    public final void D2() {
        Continuation continuation = null;
        int i = 1;
        yji.n.j2(this, vkm.q.Q(vkm.q.r(new jul.c(15), new t0(vkm.q.H(new g(0, this, continuation), new v1(new i4g.d(vkm.q.Q(this.f179554x, new e(0, this, continuation)), this, new d0(8), continuation, 17))), 1)), new e(i, this, continuation)), null, new g(i, this, continuation), 3);
    }

    @Override // yji.n
    public final void E2() {
        b3();
    }

    @Override // yji.n
    public final void F2() {
        if (((Boolean) this.f179554x.getValue()).booleanValue()) {
            this.f179547n.a(Lifecycle.Event.ON_STOP);
        }
    }

    @Override // yji.n
    public final void H2() {
        if (((Boolean) this.f179554x.getValue()).booleanValue()) {
            this.f179547n.a(Lifecycle.Event.ON_RESUME);
        }
    }

    @Override // jz.c
    public final void Z2() {
        Boolean bool = Boolean.TRUE;
        j2 j2Var = this.f179554x;
        j2Var.getClass();
        j2Var.g(null, bool);
    }

    public final void b3() {
        fz.c cVar = this.f179547n;
        if (cVar.f139067a.getState().isAtLeast(Lifecycle.State.CREATED)) {
            cVar.a(Lifecycle.Event.ON_DESTROY);
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f179553w;
    }
}
