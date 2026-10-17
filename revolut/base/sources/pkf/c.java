package pkf;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.a3;
import tof.ba;
import tof.i7;
import tof.na;
import tof.r9;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f237023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f237024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f237025y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, h hVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f237025y = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.f237025y, 0);
                cVar.f237023w = flowCollector;
                cVar.f237024x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(continuation, this.f237025y, 1);
                cVar2.f237023w = flowCollector;
                cVar2.f237024x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        int i = this.u;
        h hVar = this.f237025y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f237023w;
                    a3 a3Var = (a3) this.f237024x;
                    hVar.getClass();
                    if (a3Var.f272599l.f115082a == 0) {
                        i7.c cVar = i7.Companion;
                        i7[] i7VarArr = {new r9(a3Var.f272581b), new na(new ba(a3Var.f272579a))};
                        cVar.getClass();
                        gVar = new okl.l1(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(hVar.f237061s, i7.c.a(i7VarArr), null, null, null, new TransactionContext(new Priority.HIGH("CryptoCommodityExchangeDetails counterPartyFee"), TransactionContext.DataSet.AllExcluded.f60267a), 14)), zhm.h0.f322473a), 1);
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f237023w = null;
                    this.f237024x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f237023w;
                    a3 a3Var2 = (a3) this.f237024x;
                    Flow l1Var = a3Var2.f272600m != null ? new okl.l1(rd0.e.n(hVar.o.m(a3Var2), zhm.h0.f322473a), 2) : new go.g(null, 2);
                    this.f237023w = null;
                    this.f237024x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, l1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
