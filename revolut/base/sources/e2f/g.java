package e2f;

import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradeRevPointsAgentDetailsScreen f122065w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122065w = tradeRevPointsAgentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f122065w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f122065w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen = this.f122065w;
        switch (i) {
            case 0:
                String menuId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE3 = tradeRevPointsAgentDetailsScreen.e3();
                Intrinsics.h(menuId);
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = (com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) xVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                ((lzb.a) bVar.f91149q).b3(menuId, bVar.o.f91139c);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE32 = tradeRevPointsAgentDetailsScreen.e3();
                Intrinsics.h(clickData);
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar2 = (com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) xVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                String str = clickData.f275445a;
                if (Intrinsics.f(str, "PARTNER_TERMS_WEBSITE_ID")) {
                    if (obj3 instanceof String) {
                        bVar2.C1(new ExternalDestination.Browser((String) obj3, null));
                    }
                } else if (Intrinsics.f(str, "REV_POINTS_TERMS_ID")) {
                    bVar2.n2(new c0(bVar2, null), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
