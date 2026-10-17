package g7b;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderAction;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderContext;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubPlan f141158w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar, CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f141158w = cobrandedCardsPlanHubPlan;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, this.f141158w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar = this.v;
        CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = this.f141158w;
        if (i == 0) {
            yhm.o.b(obj2);
            r10.f fVar = eVar.f82589t;
            Intrinsics.checkNotNullParameter(cobrandedCardsPlanHubPlan, "<this>");
            CobrandedCardsCardOrderContext cobrandedCardsCardOrderContext = new CobrandedCardsCardOrderContext(cobrandedCardsPlanHubPlan.f82415a, cobrandedCardsPlanHubPlan.f82416b, CobrandedCardsCardOrderAction.Order.f82511a, cobrandedCardsPlanHubPlan.f82417c, cobrandedCardsPlanHubPlan.d, null);
            CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration = cobrandedCardsPlanHubPlan.f82417c;
            this.u = 1;
            objX0 = fVar.x0(cobrandedCardsCardOrderContext, cobrandedCardsCardConfiguration, this);
            if (objX0 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objX0 = obj2;
        }
        return eVar.C1(new CardOrderFlowDestination.CardDelivery(new c93.b((e93.f) objX0), (String) null, (Address) null, (pi3.h) null, (NaviCommand) null, (xfa.b) null, (c93.j) null, (c93.j) null, (AccountId) null, (String) null, (String) null, cobrandedCardsPlanHubPlan.f82417c.f82302a, (AnalyticsProduct) null, (i93.d) null, (Set) null, (String) null, 126974));
    }
}
