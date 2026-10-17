package fmk;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose$GetPlanOrHigher$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a u;
    public final /* synthetic */ hha.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a aVar, hha.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xfa.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        PlanUpgradePurpose$GetPlanOrHigher$Id planUpgradePurpose$GetPlanOrHigher$Id = new PlanUpgradePurpose$GetPlanOrHigher$Id(this.v.f152287a);
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a aVar2 = this.u;
        PlanRevPointsCardsScreenContract$RevPointsCardType planRevPointsCardsScreenContract$RevPointsCardType = aVar2.o.f103531a;
        if (Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Credit.f103532a)) {
            bVar = xfa.b.PLAN_HUB_CREDIT_CARDS;
        } else {
            if (!Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Debit.f103533a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = xfa.b.PLAN_HUB_DEBIT_CARDS;
        }
        return aVar2.C1(u0.b(new FeatureCommand(new InternalPricingPlanFeatureConfig.PlanUpgrade(planUpgradePurpose$GetPlanOrHigher$Id, PlanSelection.LowestPlan.f103356a, bVar, new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(aVar2.f103538t.d()), 16))));
    }
}
