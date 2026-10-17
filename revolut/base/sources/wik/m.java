package wik;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptPresentAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod;
import ggk.q1;
import hha.i0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements egk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffk.t f297923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kjk.f f297924b;

    public m(ffk.t pricingPlanInteractor, kjk.f pricingPlansOffersRepository) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansOffersRepository, "pricingPlansOffersRepository");
        this.f297923a = pricingPlanInteractor;
        this.f297924b = pricingPlansOffersRepository;
    }

    public static PricingPlanOfferPeriod.Discount a(q1 q1Var, PricingPlanSubscription pricingPlanSubscription, i0 i0Var, Long l2) {
        Long l3;
        Period period = i0Var.f152311a;
        if (period == null) {
            return null;
        }
        hha.g gVarG = cp5.c.g(pricingPlanSubscription.f81129a, (period.getYears() <= 1 || period.getMonths() != 0) ? jli.e.f175845h : jli.e.f175842b);
        if (gVarG == null || (l3 = i0Var.f152313c) == null) {
            return null;
        }
        long jLongValue = l3.longValue();
        dj0.d dVar = i0Var.d;
        return new PricingPlanOfferPeriod.Discount(l2 != null ? oi0.d.Y(l2.longValue()) : null, oi0.d.Y(jLongValue), dVar, period, q1Var, gVarG);
    }

    public static PricingPlanOfferPeriod.FreeTrial b(q1 q1Var, PricingPlanSubscription pricingPlanSubscription, Period period, Long l2, Long l3) {
        hha.g gVarG = cp5.c.g(pricingPlanSubscription.f81129a, (period.getYears() <= 1 || period.getMonths() != 0) ? jli.e.f175845h : jli.e.f175842b);
        if (gVarG == null) {
            return null;
        }
        return new PricingPlanOfferPeriod.FreeTrial(l3 != null ? oi0.d.Y(l3.longValue()) : null, l2 != null ? oi0.d.Y(l2.longValue()) : null, period, q1Var, gVarG);
    }

    public final Object c(PlanOfferPromptPresentAction planOfferPromptPresentAction, gim.i iVar) throws Throwable {
        kjk.o oVar = (kjk.o) this.f297924b;
        oVar.getClass();
        kb7.c cVar = new kb7.c(oVar, planOfferPromptPresentAction, null, 11);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
