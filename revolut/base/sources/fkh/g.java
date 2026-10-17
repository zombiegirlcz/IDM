package fkh;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f135831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f135832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a f135833y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f135833y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(0, this.f135833y, continuation);
                gVar.f135831w = flowCollector;
                gVar.f135832x = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(1, this.f135833y, continuation);
                gVar2.f135831w = flowCollector;
                gVar2.f135832x = obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f135831w;
                    com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar2 = this.f135833y;
                    fkg.a aVar3 = aVar2.f95982p;
                    gkh.a aVar4 = aVar2.f95984r;
                    kel.b bVar = aVar2.o.f95927a;
                    aVar4.getClass();
                    Flow flowR = aVar3.r(gkh.a.a(bVar));
                    this.f135831w = null;
                    this.f135832x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowR, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f135831w;
                    com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar6 = this.f135833y;
                    x8h.q qVar = aVar6.f95983q;
                    gkh.b bVar2 = aVar6.f95985s;
                    kel.b cashHolding = aVar6.o.f95927a;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                    InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                    kel.a aVar7 = cashHolding.f183148a;
                    String str = aVar7.f183146b;
                    xi0.a aVar8 = xi0.b.Companion;
                    String str2 = aVar7.e;
                    aVar8.getClass();
                    List listC = u.c(xi0.a.a(str2));
                    Boolean bool = Boolean.TRUE;
                    companion.getClass();
                    Flow flowB = qVar.b(new z2f.f(InvestTransactionsFilter.Companion.c(str, listC, bool)), w4l.i.f294643c);
                    this.f135831w = null;
                    this.f135832x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
