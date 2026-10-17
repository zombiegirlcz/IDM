package xyb;

import cli.n;
import cli.y;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements e {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nyb.c f309704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f309705q;

    public h(n stateMapper, t pricingPlanInteractor, nyb.c revPointsBenefitsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsBenefitsInteractor, "revPointsBenefitsInteractor");
        this.o = pricingPlanInteractor;
        this.f309704p = revPointsBenefitsInteractor;
        this.f309705q = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        t tVar = this.o;
        Continuation continuation = null;
        l.a1(this, rd0.e.b(tVar.q()), null, null, new g(this, continuation, 0), 3);
        l.a1(this, xam.a.h(new g(this, continuation, 1), rd0.e.b(tVar.p())), null, null, new g(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f309705q;
    }
}
