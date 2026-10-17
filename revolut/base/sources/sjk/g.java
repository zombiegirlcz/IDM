package sjk;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import sek.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends oki.h implements e {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f263740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f263741q;

    public g(n stateMapper, t pricingPlanInteractor, h planNameMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planNameMapper, "planNameMapper");
        this.o = pricingPlanInteractor;
        this.f263740p = planNameMapper;
        this.f263741q = mra.d.b(this, new b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(mo3.a.n(this.o.v(w4l.h.f294642c))), null, null, new q(this, null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f263741q;
    }
}
