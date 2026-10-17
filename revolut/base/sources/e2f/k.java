package e2f;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TradeRevPointsAgentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tradeRevPointsAgentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = (com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) xVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "TRANSACTIONS_SEE_ALL_BUTTON_ITEM_ID")) {
            bVar.F1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(new RevPointsTransactionPageParams(0, null, null, null, f1.TRAINS_POINTS, null, null, null, null, 495), new RevPointsFlowDestination.StartType.OpenTransactionList.UiOverrides(null, null, 13))));
        } else if (Intrinsics.f(str, "YOUR_GIFT_CARDS_SEE_ALL_LIST_ID")) {
            bVar.C2(new t(bVar.o.f91137a));
        }
        return Unit.f186387a;
    }
}
