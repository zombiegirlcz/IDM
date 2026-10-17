package u3k;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import smd.s;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements f {
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f276946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f276947q;

    public h(s interactor, qee.s stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f276946p = mra.d.b(this, new e(0), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f276947q = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(new t38.e(this.f276947q, 24, this.f276946p.B(new u3a.g(19)), new lld.a(3, 2, null)), new tik.b(continuation, this, 21)), null, null, new tz6.e(this, continuation, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f276946p;
    }
}
