package mjf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f205988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f205989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61.a f205990c;
    public final ffk.t d;

    public d(gte.a featureToggleInteractor, ang.f userInteractor, l61.a userCompanyInteractor, ffk.t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f205988a = featureToggleInteractor;
        this.f205989b = userInteractor;
        this.f205990c = userCompanyInteractor;
        this.d = pricingPlanInteractor;
    }

    public final ufm.i a() {
        pfm.z zVarO = new ufm.i(new ufm.i(new ufm.c(new h4d.d(this, 24), 2), new mhd.c(new c(this, 1), 10), 0), new mhd.c(new c(this, 2), 11), 0).o(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        ufm.i iVar = new ufm.i(zVarO, new mhd.c(new c(this, 0), 9), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
