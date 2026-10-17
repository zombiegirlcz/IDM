package jsk;

import cli.y;
import com.revolut.data.model.Data;
import e8h.k0;
import e8h.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vfg.p;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends oki.h implements dli.b {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f178193p;

    public l(j stateMapper, p traderProfileInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(traderProfileInteractor, "traderProfileInteractor");
        this.o = traderProfileInteractor;
        this.f178193p = mra.d.b(this, new f(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n0 n0Var = (n0) this.o.f288633b;
        Continuation continuation = null;
        yji.l.b1(this, nim.a.v(rd0.e.b(nim.a.w(n0Var.e.f(Unit.f186387a, false), new k0(n0Var, 0))), new jpl.e(20)), null, new k(this, continuation, 0), 3);
        yji.l.b1(this, new go.g(zi0.c.P(Boolean.FALSE, false, null, 3), 2), null, new k(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f178193p;
    }
}
