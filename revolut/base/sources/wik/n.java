package wik;

import kjk.f0;
import kotlin.jvm.internal.Intrinsics;
import pfk.x;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements egk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f297925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f297926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kjk.u f297927c;

    public n(gte.a featureToggleInteractor, x pricingPlanCancelRepository, kjk.u planUiRepository) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanCancelRepository, "pricingPlanCancelRepository");
        Intrinsics.checkNotNullParameter(planUiRepository, "planUiRepository");
        this.f297925a = featureToggleInteractor;
        this.f297926b = pricingPlanCancelRepository;
        this.f297927c = planUiRepository;
    }

    public final pfm.a b(String str) {
        pfm.n nVar = new pfm.n(new m1i.t(this.f297926b, str, 26), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        f0 f0Var = (f0) this.f297927c;
        f0Var.getClass();
        pfm.n nVar2 = new pfm.n(new fag.g(f0Var, str, 26), 1);
        Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
        pfm.a aVarE = nVar.e(nVar2);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
