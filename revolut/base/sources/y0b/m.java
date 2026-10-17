package y0b;

import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yrb.x;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a f310191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310191w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f310191w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f310191w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            case 2:
                m mVar3 = new m(this.f310191w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
            case 3:
                m mVar4 = new m(this.f310191w, continuation, 3);
                mVar4.v = obj2;
                return mVar4;
            default:
                m mVar5 = new m(this.f310191w, continuation, 4);
                mVar5.v = obj2;
                return mVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((m) create((AdvancedChartSymbol) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a aVar = this.f310191w;
        switch (i) {
            case 0:
                c1b.i iVar = (c1b.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.f82079q.o3(iVar);
                break;
            case 1:
                g0b.c cVar = (g0b.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f82081s, new xw9.c(cVar, 26));
                break;
            case 2:
                x xVar = (x) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f82081s, new xw9.c(xVar, 27));
                break;
            case 3:
                AdvancedChartSymbol advancedChartSymbol = (AdvancedChartSymbol) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.f82080r.d3(advancedChartSymbol);
                break;
            default:
                AdvancedChartSymbol advancedChartSymbol2 = (AdvancedChartSymbol) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f82081s, new xyc.j(aVar, advancedChartSymbol2, 7));
                break;
        }
        return Unit.f186387a;
    }
}
