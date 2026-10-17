package klf;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.models.transactions.SavingsTransactionLeg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.m3;
import tof.r9;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f185580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f185581x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z1 f185582y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Continuation continuation, z1 z1Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f185582y = z1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u1 u1Var = new u1(continuation, this.f185582y, 0);
                u1Var.f185580w = flowCollector;
                u1Var.f185581x = obj3;
                return u1Var.invokeSuspend(Unit.f186387a);
            case 1:
                u1 u1Var2 = new u1(continuation, this.f185582y, 1);
                u1Var2.f185580w = flowCollector;
                u1Var2.f185581x = obj3;
                return u1Var2.invokeSuspend(Unit.f186387a);
            default:
                u1 u1Var3 = new u1(continuation, this.f185582y, 2);
                u1Var3.f185580w = flowCollector;
                u1Var3.f185581x = obj3;
                return u1Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f185580w;
                    String str = (String) this.f185581x;
                    if (str == null) {
                        throw new IllegalStateException("Savings Account id not found for savings interest transaction");
                    }
                    jhi.b bVarG = mo3.a.g(rd0.e.b(((rnb.i) this.f185582y.f185617c).b(str, w4l.j.f294644c)), null, t1.f185578a, 1);
                    this.f185580w = null;
                    this.f185581x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, bVarG, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f185580w;
                    tof.a3 a3Var = (tof.a3) this.f185581x;
                    SavingsTransactionLeg savingsTransactionLeg = SavingsTransactionLeg.SAVINGS;
                    z1 z1Var = this.f185582y;
                    if (z1.a(z1Var, a3Var, savingsTransactionLeg)) {
                        Flow flowQ = vkm.q.q(new vkm.y(new w1(2, 0, null), rd0.e.e(new g48.r(mo3.a.g(nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(z1Var.e, new r9(a3Var.f272581b), null, null, null, new TransactionContext(new Priority.HIGH("Savings - Get Transaction Taxes"), null, 2), 14)), new ghk.x(a3Var, 19)), null, v1.f185588a, 1), 23), zhm.h0.f322473a, new l1(3, 1, null))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        gVar = vkm.q.C(flowQ, oji.e.f225788b);
                    } else if (z1.a(z1Var, a3Var, SavingsTransactionLeg.COUNTERPART)) {
                        m3 m3Var = a3Var.f272589e1;
                        gVar = new go.g(m3Var != null ? m3Var.f272930b : null, 2);
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f185580w = null;
                    this.f185581x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f185580w;
                    String transactionId = (String) this.f185581x;
                    ypg.f fVar = this.f185582y.d;
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    aed.o oVar = (aed.o) fVar.f315870a;
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    vkm.y yVarE = rd0.e.e(mo3.a.g(rd0.e.b(oVar.o.f(transactionId, true)), null, y1.f185610a, 1), zhm.h0.f322473a, new l1(3, 2, null));
                    this.f185580w = null;
                    this.f185581x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, yVarE, this) == aVar3) {
                        return aVar3;
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
