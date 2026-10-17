package om4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class q4 extends b implements al4.u {

    @NotNull
    public static final o4 Companion = new o4();
    public final jla.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final al4.j f226673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(gte.a featureToggleInteractor, jla.h productCatalogInteractor, xq3.j creditApplicationInteractor, zq3.a creditEntryPointsInteractor, e0 creditCardFacilityExistsInteractor, al4.j creditCardEntryPointDetailsInteractor, vie.h tabCreditAvailabilityInteractor) {
        super(featureToggleInteractor, creditApplicationInteractor, creditEntryPointsInteractor, creditCardFacilityExistsInteractor, tabCreditAvailabilityInteractor);
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogInteractor, "productCatalogInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditEntryPointsInteractor, "creditEntryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditCardFacilityExistsInteractor, "creditCardFacilityExistsInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f = productCatalogInteractor;
        this.f226673g = creditCardEntryPointDetailsInteractor;
    }

    @Override // qx4.i
    public final Flow d() {
        if (((jte.d) this.f226520a).c(CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c)) {
            return new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
        }
        return rd0.e.e(vkm.q.q(new ae8.c(bla.b.b(this.f, "SECURED_CREDIT_CARD"), 21)), zhm.h0.f322473a, new n28.b(3, 27, null));
    }

    @Override // qx4.f
    public final Flow k(grl.r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint creditBuilderCardEntryPoint = CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c;
        gte.a aVar = this.f226520a;
        if (((jte.d) aVar).c(creditBuilderCardEntryPoint)) {
            return new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
        }
        boolean zA = aVar.a(CreditApplicationApi$Toggles.CreditApplicationSecuredCreditCardHomeScreen.f66184c);
        if (origin == grl.r2.DISCOVER && zA) {
            return new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
        }
        return xam.a.h(new au.c0(this, origin, (Continuation) null, 21), d());
    }

    @Override // om4.b
    public final Flow m() {
        CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint creditBuilderCardEntryPoint = CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c;
        gte.a aVar = this.f226520a;
        return (((jte.d) aVar).c(creditBuilderCardEntryPoint) || aVar.a(CreditApplicationApi$Toggles.CreditApplicationSecuredCreditCardHomeScreen.f66184c)) ? new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2) : super.m();
    }

    @Override // om4.b
    public final jhi.k n() {
        return (jhi.k) ((s3) this.f226673g).r();
    }
}
