package d3i;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f111171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f111172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f111173y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Continuation continuation, n nVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f111173y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(continuation, this.f111173y, 0);
                iVar.f111171w = flowCollector;
                iVar.f111172x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            case 1:
                i iVar2 = new i(continuation, this.f111173y, 1);
                iVar2.f111171w = flowCollector;
                iVar2.f111172x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
            case 2:
                i iVar3 = new i(continuation, this.f111173y, 2);
                iVar3.f111171w = flowCollector;
                iVar3.f111172x = obj3;
                return iVar3.invokeSuspend(Unit.f186387a);
            default:
                i iVar4 = new i(continuation, this.f111173y, 3);
                iVar4.f111171w = flowCollector;
                iVar4.f111172x = obj3;
                return iVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowB;
        Flow flowS;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f111171w;
                    Pair pair = (Pair) this.f111172x;
                    vkm.d dVarB = rd0.e.b(f61.a.H(this.f111173y.f111181b, new Pair((xi0.b) pair.f186385a, (xi0.b) pair.f186386b), qta.f.DAY, 12));
                    this.f111171w = null;
                    this.f111172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f111171w;
                    vkm.d dVarB2 = rd0.e.b(this.f111173y.f111182c.e(zhm.u.c((Pair) this.f111172x), n9l.b.SEC_3));
                    this.f111171w = null;
                    this.f111172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f111171w;
                    if (((c) this.f111172x) instanceof a) {
                        flowB = rd0.e.b(this.f111173y.f111183g.d(w4l.h.f294642c, wd6.i.CURRENT, AccountId.Personal.f51414a, false));
                    } else {
                        flowB = vkm.i.f290039a;
                    }
                    this.f111171w = null;
                    this.f111172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f111171w;
                    c cVar = (c) this.f111172x;
                    if (cVar instanceof a) {
                        ExchangeOrderDraft exchangeOrderDraft = ((a) cVar).f111158a;
                        n nVar = this.f111173y;
                        flowS = o7.b.s(nVar.f111180a, r1i.g.a(exchangeOrderDraft, nVar.e, AccountId.Personal.f51414a, null));
                    } else {
                        flowS = vkm.i.f290039a;
                    }
                    this.f111171w = null;
                    this.f111172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowS, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
