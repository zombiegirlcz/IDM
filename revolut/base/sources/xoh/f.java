package xoh;

import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ScreenerAllFiltersFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ScreenerAllFiltersFlow screenerAllFiltersFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = screenerAllFiltersFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScreenerAllFiltersFlow screenerAllFiltersFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a) screenerAllFiltersFlow.R2()).I2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar3 = (com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a) screenerAllFiltersFlow.R2();
                y yVar = aVar3.f96172t;
                ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page = ((j) ((j2) yVar.f22677a).getValue()).f307838b;
                zel.f fVarF = hx7.b.F(screenerAllFiltersFlowContract$Page);
                List list = (List) ((j) ((j2) yVar.f22677a).getValue()).d.get(screenerAllFiltersFlowContract$Page);
                if (list == null) {
                    list = f0.f322471a;
                }
                aVar3.C2(new m(fVarF, list));
                break;
        }
        return Unit.f186387a;
    }
}
