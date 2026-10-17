package a92;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends oki.h implements c {
    public final l72.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y62.b f2305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f2306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f2307r;

    public i(l72.i withdrawalInteractor, y62.b withdrawalExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(withdrawalInteractor, "withdrawalInteractor");
        Intrinsics.checkNotNullParameter(withdrawalExtension, "withdrawalExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = withdrawalInteractor;
        this.f2305p = withdrawalExtension;
        this.f2306q = mra.d.b(this, new a(new Data(null, null, true, 3, null), withdrawalExtension.Z2()), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f2307r = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f2307r, new h(continuation, this, 0)), null, null, new a0l.k(this, continuation, 18), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        a2g.a func = new a2g.a(this, 7);
        y62.b bVar = this.f2305p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(func, "func");
        Job job2 = bVar.f311119m;
        if (job2 != null) {
            job2.f(null);
        }
        bVar.f311119m = (Job) func.invoke();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f2306q;
    }
}
