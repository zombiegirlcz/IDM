package jzh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f179844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f179845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.order_summary.a f179846y;
    public final /* synthetic */ double z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Continuation continuation, com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar, double d, int i) {
        super(3, continuation);
        this.u = i;
        this.f179846y = aVar;
        this.z = d;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p0 p0Var = new p0(continuation, this.f179846y, this.z, 0);
                p0Var.f179844w = flowCollector;
                p0Var.f179845x = obj3;
                return p0Var.invokeSuspend(Unit.f186387a);
            default:
                p0 p0Var2 = new p0(continuation, this.f179846y, this.z, 1);
                p0Var2.f179844w = flowCollector;
                p0Var2.f179845x = obj3;
                return p0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f179844w;
                    v1 v1VarI2 = com.revolut.feature_crypto_order_flow.impl.order_summary.a.I2(this.f179846y, wd6.h.STOP_LOSS, this.z);
                    this.f179844w = null;
                    this.f179845x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, v1VarI2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f179844w;
                    v1 v1VarI22 = com.revolut.feature_crypto_order_flow.impl.order_summary.a.I2(this.f179846y, wd6.h.TAKE_PROFIT, this.z);
                    this.f179844w = null;
                    this.f179845x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, v1VarI22, this) == aVar2) {
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
