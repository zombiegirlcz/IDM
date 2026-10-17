package xhj;

import c5a.m0;
import dfj.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f306265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f306266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.help.b f306267y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f306267y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                k kVar = new k(0, this.f306267y, continuation);
                kVar.f306265w = flowCollector;
                kVar.f306266x = obj3;
                return kVar.invokeSuspend(Unit.f186387a);
            default:
                k kVar2 = new k(1, this.f306267y, continuation);
                kVar2.f306265w = flowCollector;
                kVar2.f306266x = obj3;
                return kVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f306265w;
                    w4l.k loadingStrategy = (w4l.k) this.f306266x;
                    com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar = this.f306267y;
                    g0 g0Var = bVar.f100981p;
                    String str = bVar.o.f306260a;
                    g0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Flow flowQ = q.q(q.m(new m0(g0Var, loadingStrategy, str, null, 23)));
                    this.f306265w = null;
                    this.f306266x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowQ, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f306265w;
                    vkm.d dVarG = this.f306267y.f100983r.g((w4l.k) this.f306266x);
                    this.f306265w = null;
                    this.f306266x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarG, this) == aVar2) {
                        return aVar2;
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
