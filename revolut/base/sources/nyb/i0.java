package nyb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffk.t f220798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lxb.f f220799b;

    public i0(ffk.t pricingPlanInteractor, lxb.f revPointsProductEligibilityRepository) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityRepository, "revPointsProductEligibilityRepository");
        this.f220798a = pricingPlanInteractor;
        this.f220799b = revPointsProductEligibilityRepository;
    }

    public final ufm.i a(m1c.o0 o0Var) {
        efm.d0 d0VarFirstOrError = m70.a.g(te0.w.f0(b(o0Var)), null, new nsl.d(22), 1).firstOrError();
        ny7.j jVar = new ny7.j(new m(10), 28);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, jVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final sfm.b b(m1c.o0 o0Var) {
        efm.d0 d0VarE = this.f220798a.e();
        ny7.j jVar = new ny7.j(new g0(this, o0Var, 0), 29);
        d0VarE.getClass();
        sfm.b bVar = new sfm.b(d0VarE, jVar, 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }
}
