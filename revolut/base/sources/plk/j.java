package plk;

import cli.n;
import cli.y;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends oki.h implements f {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f237440p;

    public j(n stateMapper, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = pricingPlanInteractor;
        this.f237440p = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new h(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f237440p;
    }
}
