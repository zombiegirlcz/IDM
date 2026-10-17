package ck2;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import ffk.j;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends oki.h implements e {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f24749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f24750q;

    public d(n stateMapper, t pricingPlanInteractor, j pricingPlanLimitsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor, "pricingPlanLimitsInteractor");
        this.o = pricingPlanInteractor;
        this.f24749p = pricingPlanLimitsInteractor;
        this.f24750q = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        t tVar = this.o;
        l.a1(this, rd0.e.b(tVar.q()), null, null, new b(this, null, 0), 3);
        l.a1(this, rd0.e.b(tVar.o()), null, null, new b(this, null, 2), 3);
        l.a1(this, rd0.e.b(this.f24749p.b(w4l.h.f294642c)), null, null, new b(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f24750q;
    }
}
