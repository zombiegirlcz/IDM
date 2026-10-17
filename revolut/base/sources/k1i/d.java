package k1i;

import efm.d0;
import ffk.t;
import jyk.g0;
import k1g.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f180273a;

    public d(t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f180273a = pricingPlanInteractor;
    }

    @Override // k1i.b
    public final ufm.i C() {
        d0 d0VarFirstOrError = m70.a.g(this.f180273a.t(false), null, null, 3).firstOrError();
        g0 g0Var = new g0(new n(1), 13);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, g0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
