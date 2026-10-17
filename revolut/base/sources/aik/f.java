package aik;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d f5304b;

    public /* synthetic */ f(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar, int i) {
        this.f5303a = i;
        this.f5304b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f5303a) {
            case 0:
                igk.c result = (igk.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar = this.f5304b;
                com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = dVar.f103204p;
                String str = result.f161237a;
                hha.i iVar = result.f161238b;
                PricingPlanOffer pricingPlanOffer = result.d;
                bVar.d3(new PricingPlanAction.Upgrade(str, iVar, pricingPlanOffer != null ? pricingPlanOffer.f81123a : null, false), new f(dVar, 2));
                return Unit.f186387a;
            case 1:
                umk.i result2 = (umk.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof umk.h;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar2 = this.f5304b;
                if (z) {
                    oki.h.D2(dVar2.u);
                } else {
                    if (!(result2 instanceof umk.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2.J2(((umk.g) result2).f281324a, new a2g.a(dVar2, 16));
                }
                return Unit.f186387a;
            default:
                c.b planChangeResult = (c.b) obj2;
                Intrinsics.checkNotNullParameter(planChangeResult, "planChangeResult");
                boolean z3 = planChangeResult instanceof zfk.i;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar3 = this.f5304b;
                if (z3) {
                    dVar3.K2();
                } else if (!(planChangeResult instanceof zfk.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.D2(dVar3.u);
                return Unit.f186387a;
        }
    }
}
