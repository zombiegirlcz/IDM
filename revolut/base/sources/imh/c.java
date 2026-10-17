package imh;

import com.revolut.feature.globalsearch.api.navigation.GlobalSearchScreenDestination;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.TradeScreen;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TradeScreen tradeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        zel.f fVar;
        int i = this.u;
        TradeScreen tradeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) ((e) tradeScreen.L.getValue())).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a aVar3 = (com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) ((e) tradeScreen.L.getValue());
                vmh.f fVar2 = ((d) ((j2) aVar3.H.f22677a).getValue()).f162457a.f290586b;
                switch (fVar2 == null ? -1 : umh.a.f281317a[fVar2.ordinal()]) {
                    case -1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        fVar = null;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        fVar = zel.f.STOCKS;
                        break;
                    case 2:
                        fVar = zel.f.ETP;
                        break;
                    case 3:
                        fVar = zel.f.BOND;
                        break;
                    case 4:
                        fVar = zel.f.CFD;
                        break;
                }
                aVar3.C1(new ScreenerRedesignDestination(fVar, 2));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a aVar5 = (com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) ((e) tradeScreen.L.getValue());
                aVar5.getClass();
                aVar5.C1(new GlobalSearchScreenDestination(RetailGlobalSearchContext.WEALTH_TRADE));
                return Unit.f186387a;
        }
    }
}
