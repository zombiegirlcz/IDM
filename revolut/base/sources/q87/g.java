package q87;

import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MarketDetailsRedesignScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MarketDetailsRedesignScreen marketDetailsRedesignScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = marketDetailsRedesignScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MarketDetailsRedesignScreen marketDetailsRedesignScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vii.c cVar = ((com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) marketDetailsRedesignScreen.d3()).A;
                Unit unit = Unit.f186387a;
                cVar.b(unit);
                return unit;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) marketDetailsRedesignScreen.d3()).C, MarketDetailsRedesignScreenContract$ModalStep.EconomicIndicatorsInfo.f74601a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
        }
    }
}
