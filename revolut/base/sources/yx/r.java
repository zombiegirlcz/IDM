package yx;

import cli.y;
import cli.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import vkm.t1;

/* JADX INFO: loaded from: classes16.dex */
public final class r extends oki.h implements z {
    public final xv.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xv.c f317515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f317516q;

    public r(xv.h detector, xv.c cameraCoreDelegate, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = detector;
        this.f317515p = cameraCoreDelegate;
        this.f317516q = mra.d.b(this, new d(xv.a.DISABLED), stateMapper, null, false, 12);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof g) {
            this.f317515p.k();
        } else if (Intrinsics.f(event, e.f317503a)) {
            C2(i.f317506a);
        } else {
            if (!Intrinsics.f(event, f.f317504a)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(j.f317507a);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        xv.h hVar = this.o;
        t1 t1VarA = hVar.a();
        p0 p0Var = o0.f186429a;
        Continuation continuation = null;
        yji.l.b1(this, new pe0.l(t1VarA, p0Var.b(dx.q.class), 1), null, new q(this, null, 0), 3);
        pe0.l lVar = new pe0.l(hVar.a(), p0Var.b(xv.j.class), 1);
        yv8.j jVar = new yv8.j(12);
        pq0.d dVar = vkm.q.f290100b;
        int i = 2;
        yji.l.b1(this, vkm.q.s(lVar, jVar, dVar), null, new xsd.a(i, 10, continuation), 3);
        xv.c cVar = this.f317515p;
        yji.l.b1(this, vkm.q.s(cVar.f(), new yv8.j(13), dVar), null, new xsd.a(i, 11, continuation), 3);
        yji.l.b1(this, cVar.a(), null, new q(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317516q;
    }
}
