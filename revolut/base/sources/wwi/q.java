package wwi;

import dwi.b0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import vy5.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends jki.g implements k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f300688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f300689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f300690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f300691s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, b0 airportLoungesInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(airportLoungesInteractor, "airportLoungesInteractor");
        this.f300688p = airportLoungesInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f300689q = z1VarB;
        this.f300690r = yhm.j.b(new wp0.b(this, 10));
        this.f300691s = new h(0);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(vkm.q.q(new d0(q2(), 11)), new m(continuation, this, 0)), null, null, new wuh.q(this, continuation, 14), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f300691s;
    }
}
