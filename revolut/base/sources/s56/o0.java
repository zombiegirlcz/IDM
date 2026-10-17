package s56;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f259977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f259978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.remittances.impl.ui.send.amount.b f259979y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i, com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f259979y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o0 o0Var = new o0(0, this.f259979y, continuation);
                o0Var.f259977w = flowCollector;
                o0Var.f259978x = obj3;
                return o0Var.invokeSuspend(Unit.f186387a);
            case 1:
                o0 o0Var2 = new o0(1, this.f259979y, continuation);
                o0Var2.f259977w = flowCollector;
                o0Var2.f259978x = obj3;
                return o0Var2.invokeSuspend(Unit.f186387a);
            default:
                o0 o0Var3 = new o0(2, this.f259979y, continuation);
                o0Var3.f259977w = flowCollector;
                o0Var3.f259978x = obj3;
                return o0Var3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f259977w;
                    vkm.y yVarE = rd0.e.e(new v1(new d0(this.f259979y, (w4l.k) this.f259978x, null, 1)), zhm.h0.f322473a, new pc2.d(3, 14, null));
                    this.f259977w = null;
                    this.f259978x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f259977w;
                    vkm.y yVarD = rd0.e.d(new v1(new q0((DeFiBalance) this.f259978x, this.f259979y, null)), zhm.h0.f322473a);
                    this.f259977w = null;
                    this.f259978x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, yVarD, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f259977w;
                    s sVar = (s) this.f259978x;
                    if (sVar == null || ta6.a.E(sVar.f259986a)) {
                        gVar = new go.g(new Data(null, null, false, 7, null), 2);
                    } else {
                        com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = this.f259979y;
                        gVar = r10.t.p(bVar.f71832p, bVar.I2(sVar));
                    }
                    this.f259977w = null;
                    this.f259978x = null;
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
