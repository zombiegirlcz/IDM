package ble;

import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(int i, com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k1(0, this.v, continuation);
            case 1:
                return new k1(1, this.v, continuation);
            case 2:
                return new k1(2, this.v, continuation);
            default:
                return new k1(3, this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Boolean bool = Boolean.FALSE;
                gte.a aVar2 = fVar.N;
                FeatureTradingApi$Toggles$InvestmentPlanHub featureTradingApi$Toggles$InvestmentPlanHub = FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c;
                if (!((jte.d) aVar2).c(featureTradingApi$Toggles$InvestmentPlanHub)) {
                    bool = null;
                }
                return zhm.v.k(new vkm.q0(((fsl.w) fVar.L).a(new InvestOrdersParams.OrdersAll((k4l.d) null, bool, (String) null, 13)), new g0(fVar, null), 1), ((jte.d) aVar2).c(featureTradingApi$Toggles$InvestmentPlanHub) ? new vkm.q0(boh.f.e(fVar.P.b(), new y(fVar, 3)), new n1(fVar, null), 1) : vkm.i.f290039a);
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return zhm.u.c(new vkm.q0(fVar.M.Z2(vke.d.NEWS), new f0(fVar, null), 1));
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return zhm.u.c(new vkm.q0(rd0.e.d(fVar.O.b3(), zhm.h0.f322473a), new h0(fVar, null), 1));
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return zhm.u.c(new vkm.q0(((cc7.h) fVar.K).Z2(zb7.f.STOCKS), new i0(fVar, null), 1));
        }
    }
}
