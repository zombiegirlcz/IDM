package kkf;

import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.i7;
import tof.r9;

/* JADX INFO: loaded from: classes8.dex */
public final class p2 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f184878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f184879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t2 f184880y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(Continuation continuation, t2 t2Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f184880y = t2Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p2 p2Var = new p2(continuation, this.f184880y, 0);
                p2Var.f184878w = flowCollector;
                p2Var.f184879x = obj3;
                return p2Var.invokeSuspend(Unit.f186387a);
            default:
                p2 p2Var2 = new p2(continuation, this.f184880y, 1);
                p2Var2.f184878w = flowCollector;
                p2Var2.f184879x = obj3;
                return p2Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowQ;
        Flow gVar;
        int i = this.u;
        Continuation continuation = null;
        t2 t2Var = this.f184880y;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f184878w;
                    String str = (String) this.f184879x;
                    if (str == null) {
                        t2Var.getClass();
                        flowQ = new go.g(zhm.f0.f322471a, 2);
                    } else {
                        com.revolut.domain.interactors.transactions.a aVar2 = t2Var.f184950m;
                        i7.c cVar = tof.i7.Companion;
                        tof.i7[] i7VarArr = {new r9(str), new tof.l7()};
                        cVar.getClass();
                        tof.q7 q7VarA = i7.c.a(i7VarArr);
                        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.LOANS, TransactionContext.TransactionData.MERCHANT_PAYMENTS, TransactionContext.TransactionData.ACQUIRING_CASHBACK, TransactionContext.TransactionData.TRANSFER_USERS, TransactionContext.TransactionData.EXCLUDED_FROM_SPENDING_ANALYTICS};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        flowQ = vkm.q.Q(vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar2, q7VarA, null, 1, null, new TransactionContext(null, new TransactionContext.DataSet.Excluded(kotlin.collections.d.y0(elements)), 1), 10)), zhm.h0.f322473a), 11)), new p2(continuation, t2Var, i2));
                    }
                    this.f184878w = null;
                    this.f184879x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f184878w;
                    tof.a3 a3Var = (tof.a3) this.f184879x;
                    if (a3Var != null) {
                        efm.r map = ((njf.j) t2Var.f184951n).f().map(new fkg.a(new a26.s(t2Var, a3Var, 22)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        gVar = rd0.e.b(ue0.e.E(map, zhm.f0.f322471a));
                    } else {
                        gVar = new go.g(zhm.f0.f322471a, 2);
                    }
                    this.f184878w = null;
                    this.f184879x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar3) {
                        return aVar3;
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
