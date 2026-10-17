package om4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends b implements al4.c {
    public final d4m.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gte.a featureToggleInteractor, xq3.j creditApplicationInteractor, zq3.a creditEntryPointsInteractor, e0 creditCardFacilityExistsInteractor, d4m.a creditCardEntryPointDetailsInteractor, vie.h tabCreditAvailabilityInteractor) {
        super(featureToggleInteractor, creditApplicationInteractor, creditEntryPointsInteractor, creditCardFacilityExistsInteractor, tabCreditAvailabilityInteractor);
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditEntryPointsInteractor, "creditEntryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditCardFacilityExistsInteractor, "creditCardFacilityExistsInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f = creditCardEntryPointDetailsInteractor;
    }

    @Override // qx4.i
    public final Flow d() {
        return vkm.q.q(zi0.c.i(Boolean.valueOf(((jte.d) this.f226520a).c(CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c))));
    }

    @Override // qx4.f
    public final Flow k(grl.r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        if (this.f226520a.a(CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c)) {
            return new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
        }
        return vkm.q.q(n14.k.p(nim.a.v(this.f226521b.k(mif.a.m(ft3.d1.Companion, ft3.j1.CREDIT_CARD, it3.k.CC_BUILDER)), new o95.f(origin, 1)), new okk.d(19)));
    }

    @Override // om4.b
    public final jhi.k n() {
        return (jhi.k) ((s3) ((al4.j) this.f.get())).r();
    }
}
