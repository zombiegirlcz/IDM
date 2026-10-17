package eig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f126639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f126640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.main.e f126641y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f126641y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f126641y, continuation);
                pVar.f126639w = flowCollector;
                pVar.f126640x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            case 1:
                p pVar2 = new p(1, this.f126641y, continuation);
                pVar2.f126639w = flowCollector;
                pVar2.f126640x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
            default:
                p pVar3 = new p(2, this.f126641y, continuation);
                pVar3.f126639w = flowCollector;
                pVar3.f126640x = obj3;
                return pVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f126639w;
                    q0 q0VarN = rd0.e.n(vfg.d.a(this.f126641y.o), h0.f322473a);
                    this.f126639w = null;
                    this.f126640x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, q0VarN, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f126639w;
                    q0 q0VarN2 = rd0.e.n(this.f126641y.f94371q.b(w4l.h.f294642c), h0.f322473a);
                    this.f126639w = null;
                    this.f126640x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, q0VarN2, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f126639w;
                    vfg.t tVar = (vfg.t) this.f126641y.f94372r;
                    tVar.getClass();
                    gfg.c.Companion.getClass();
                    q0 q0VarN3 = rd0.e.n(rd0.e.b(tVar.b(gfg.a.f143405b, 3)), h0.f322473a);
                    this.f126639w = null;
                    this.f126640x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, q0VarN3, this) == aVar3) {
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
