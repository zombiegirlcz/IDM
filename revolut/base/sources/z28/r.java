package z28;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.i f319027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f319028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f319029c;
    public final x8h.m d;

    public r(ybl.i productGroupAvailabilityInteractor, tzg.m wealthAccountsInteractor, gte.a featureToggleInteractor, x8h.m etpProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        this.f319027a = productGroupAvailabilityInteractor;
        this.f319028b = wealthAccountsInteractor;
        this.f319029c = featureToggleInteractor;
        this.d = etpProductAvailabilityInteractor;
    }

    public static final yfl.a a(r rVar, l lVar) {
        if (lVar instanceof k) {
            return yfl.a.TAX_ADVANTAGE_ACCOUNTS;
        }
        if (lVar instanceof e) {
            return yfl.a.JOINT_STOCKS;
        }
        if (Intrinsics.f(lVar, i.f319015a)) {
            return yfl.a.STOCKS;
        }
        if (Intrinsics.f(lVar, h.f319014a)) {
            return yfl.a.STRATEGIES;
        }
        if (lVar instanceof d) {
            return yfl.a.ETFS;
        }
        if (Intrinsics.f(lVar, a.f319007a)) {
            return yfl.a.BONDS;
        }
        if (Intrinsics.f(lVar, c.f319009a)) {
            return yfl.a.COMMODITIES;
        }
        if (Intrinsics.f(lVar, b.f319008a)) {
            return yfl.a.CFD;
        }
        if (Intrinsics.f(lVar, g.f319013a)) {
            return yfl.a.PRIVATE_MARKETS;
        }
        if (Intrinsics.f(lVar, f.f319012a)) {
            return yfl.a.MUTUAL_FUNDS;
        }
        if (Intrinsics.f(lVar, j.f319016a)) {
            return yfl.a.STRUCTURED_NOTES;
        }
        throw new NoWhenBranchMatchedException();
    }
}
