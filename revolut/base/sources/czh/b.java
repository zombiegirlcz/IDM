package czh;

import aim.o;
import com.revolut.feature.crypto.onboarding.api.CryptoOnboardingApi$Toggles;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import cu8.u0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2j.j f110233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f110234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eub.a f110235c;

    public b(m2j.j balancesInteractor, gte.a featureToggleInteractor, eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f110233a = balancesInteractor;
        this.f110234b = featureToggleInteractor;
        this.f110235c = revPointsAvailabilityInteractor;
    }

    public final vkm.d a(boolean z) {
        k1j.d dVar = k1j.d.RETAIL;
        io3.l lVar = io3.l.CURRENT;
        o oVar = new o();
        oVar.add(k1j.a.POCKETS);
        oVar.add(k1j.a.CRYPTO);
        oVar.add(k1j.a.VAULTS);
        oVar.add(k1j.a.SAVINGS);
        oVar.add(k1j.a.JOINT_ACCOUNT);
        oVar.add(k1j.a.REVOLUT_X_FIAT);
        if (z) {
            if (((jte.d) this.f110234b).c(CryptoOnboardingApi$Toggles.RevPointsCrypto.f70885c) && ((nyb.b) this.f110235c).f()) {
                oVar.add(k1j.a.REV_POINTS);
            }
        }
        Unit unit = Unit.f186387a;
        r map = m70.a.g(this.f110233a.e(new BalancesInteractor$InputData(dVar, lVar, y0.a(oVar), h0.f322473a, null, null, null, null, 240), null), null, new a(0), 1).map(new u0(18, new cw7.j(22)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}
