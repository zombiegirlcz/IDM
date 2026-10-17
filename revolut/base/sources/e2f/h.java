package e2f;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TradeRevPointsAgentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tradeRevPointsAgentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.R2();
        String listId = item.f58316a;
        Object obj3 = item.f58324n;
        com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = (com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) xVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "NAV_BAR_ACTION_ID_VISIT_WEB")) {
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str != null) {
                bVar.C1(new ExternalDestination.Browser(str, null));
            }
        }
        return Unit.f186387a;
    }
}
