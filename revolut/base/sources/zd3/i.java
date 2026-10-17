package zd3;

import ffk.t;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bd3.a f321308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f321309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f321310r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, bd3.a cashbackInteractor, t pricingPlanInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f321308p = cashbackInteractor;
        this.f321309q = pricingPlanInteractor;
        this.f321310r = new c(0);
    }

    @Override // yji.l
    public final void I1() {
        bd3.a aVar = this.f321308p;
        w4l.h hVar = w4l.h.f294642c;
        l.a1(this, rd0.e.b(nim.a.w(aVar.c(hVar), new bbh.a(12))), null, null, new g(this, null, 0), 3);
        l.a1(this, rd0.e.b(nim.a.w(aVar.c(hVar), new bbh.a(11))), null, null, new g(this, null, 1), 3);
        t tVar = this.f321309q;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        l.a1(this, rd0.e.b(nim.a.w(u1.d(tVar.o(), tVar.n()), new ebi.i(12))), null, null, new g(this, null, 2), 3);
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        l.a1(this, rd0.e.b(nim.a.w(u1.d(tVar.o(), tVar.n()), new ebi.i(13))), null, null, new g(this, null, 3), 3);
        l.a1(this, rd0.e.b(tVar.q()), null, null, new g(this, null, 4), 3);
        l.a1(this, aVar.f(hVar), null, null, new g(this, null, 5), 3);
        l2(new yzb.c(this, null, 9), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f321310r;
    }
}
