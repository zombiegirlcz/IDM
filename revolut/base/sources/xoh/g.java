package xoh;

import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScreenerAllFiltersFlow f307836w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ScreenerAllFiltersFlow screenerAllFiltersFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307836w = screenerAllFiltersFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f307836w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f307836w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ScreenerAllFiltersFlowContract$Page) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScreenerAllFiltersFlow screenerAllFiltersFlow = this.f307836w;
        switch (i) {
            case 0:
                ScreenerAllFiltersFlowContract$Page page = (ScreenerAllFiltersFlowContract$Page) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar2 = (com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a) screenerAllFiltersFlow.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                aVar2.H2(aVar2.f96172t, new xng.l(page, 7));
                break;
            default:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                screenerAllFiltersFlow.P.setValue(str);
                break;
        }
        return Unit.f186387a;
    }
}
