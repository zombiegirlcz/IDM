package zjh;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f322863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f322864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.cash_balance.b f322865y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.wealth.ui.impl.cash_balance.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f322865y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f322865y, continuation);
                zVar.f322863w = flowCollector;
                zVar.f322864x = obj3;
                return zVar.invokeSuspend(Unit.f186387a);
            default:
                z zVar2 = new z(1, this.f322865y, continuation);
                zVar2.f322863w = flowCollector;
                zVar2.f322864x = obj3;
                return zVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f322863w;
                    InvestTransactionsListContract$Disclaimers investTransactionsListContract$Disclaimers = (InvestTransactionsListContract$Disclaimers) this.f322864x;
                    com.revolut.feature.wealth.ui.impl.cash_balance.b bVar = this.f322865y;
                    g0c.e eVarC3 = bVar.u.c3(InvestTransactionsFilter.Companion.d(InvestTransactionsFilter.INSTANCE, bVar.o.f95952b), w4l.i.f294643c, new h1h.c(investTransactionsListContract$Disclaimers, 1));
                    this.f322863w = null;
                    this.f322864x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, eVarC3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f322863w;
                    wkm.l lVarZ2 = ((gah.e) this.f322865y.D).Z2((List) this.f322864x);
                    this.f322863w = null;
                    this.f322864x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, lVarZ2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
