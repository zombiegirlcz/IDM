package wu4;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import nyb.j;
import nyb.k;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f300064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f300065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f300066c;

    public a(t pricingPlanInteractor, k revPointsInteractor, j revPointsEarningRatesInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        this.f300064a = pricingPlanInteractor;
        this.f300065b = revPointsInteractor;
        this.f300066c = revPointsEarningRatesInteractor;
    }
}
