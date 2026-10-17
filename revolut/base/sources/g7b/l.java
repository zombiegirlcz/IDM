package g7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoManageCardOption;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsPlanHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsPlanHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CobrandedCardsPlanHubInfoManageCardOption.Action) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CobrandedCardsPlanHubInfoManageCardOption.Action action = (CobrandedCardsPlanHubInfoManageCardOption.Action) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.v.d();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.f(action, CobrandedCardsPlanHubInfoManageCardOption.Action.Billing.f82378a)) {
            eVar.C1(CobrandedCardsFeatureConfig.PlanHubBillingDestination.f82503a);
        } else if (Intrinsics.f(action, CobrandedCardsPlanHubInfoManageCardOption.Action.PlanDashboard.f82379a)) {
            eVar.C1(CobrandedCardsFeatureConfig.PlanSwitchDestination.f82505a);
        } else {
            if (!(action instanceof CobrandedCardsPlanHubInfoManageCardOption.Action.Url)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar.I2(((CobrandedCardsPlanHubInfoManageCardOption.Action.Url) action).f82380a);
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
