package klf;

import kkf.h9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f185437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f185438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f185439y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Continuation continuation, h0 h0Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f185439y = h0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(continuation, this.f185439y, 0);
                a0Var.f185437w = flowCollector;
                a0Var.f185438x = obj3;
                return a0Var.invokeSuspend(Unit.f186387a);
            case 1:
                a0 a0Var2 = new a0(continuation, this.f185439y, 1);
                a0Var2.f185437w = flowCollector;
                a0Var2.f185438x = obj3;
                return a0Var2.invokeSuspend(Unit.f186387a);
            default:
                a0 a0Var3 = new a0(continuation, this.f185439y, 2);
                a0Var3.f185437w = flowCollector;
                a0Var3.f185438x = obj3;
                return a0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f185437w;
                    Flow flowA = this.f185439y.i.a((tof.a3) this.f185438x);
                    this.f185437w = null;
                    this.f185438x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = flowA.collect(new h9(flowCollector, 17), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                    FlowCollector flowCollector2 = this.f185437w;
                    vkm.y yVarE = rd0.e.e(mo3.a.e(rd0.e.b(this.f185439y.f185492g.b((tof.a3) this.f185438x)), c0.f185456a, d0.f185464a), zhm.h0.f322473a, new i23.c(3, 24, null));
                    this.f185437w = null;
                    this.f185438x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, yVarE, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f185437w;
                    String transferLinkId = (String) this.f185438x;
                    if (transferLinkId != null) {
                        k61.i iVar = (k61.i) this.f185439y.d;
                        Intrinsics.checkNotNullParameter(transferLinkId, "transferLink");
                        i31.l lVar = (i31.l) iVar.f181611a;
                        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
                        gVar = vkm.q.q(new kge.b(rd0.e.b(lVar.k.f(new i31.k(transferLinkId), false)), 12));
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f185437w = null;
                    this.f185438x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar, this) == aVar3) {
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
