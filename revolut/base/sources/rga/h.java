package rga;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mga.e0;
import mga.f0;
import mga.i0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f254052c;
    public final f0 d;
    public final on.a e;
    public final gte.a f;

    public h(i0 screen, f0 controllerModelExtension, on.a viewableRecordItemCollector, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f254052c = screen;
        this.d = controllerModelExtension;
        this.e = viewableRecordItemCollector;
        this.f = featureToggleInteractor;
    }

    @Override // yji.d
    public final void M() {
        i0 i0Var = this.f254052c;
        Continuation continuation = null;
        yji.d.H(this, new r7b.e(rd0.e.b(i0Var.a2()), 3), new f(this, null), 3);
        yji.d.H(this, new r7b.e(rd0.e.b(i0Var.N0()), 4), new g(this, null), 3);
        if (aha.a.a(this.f)) {
            yji.d.H(this, ((sn.a) this.e).b(i0Var.g0(), true), new r5e.e(this, continuation, 19), 3);
        }
    }
}
