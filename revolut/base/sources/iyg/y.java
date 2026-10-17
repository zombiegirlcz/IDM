package iyg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f169753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f169754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a f169755y;
    public FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f169755y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f169755y, continuation);
                yVar.f169753w = flowCollector;
                yVar.f169754x = obj3;
                return yVar.invokeSuspend(Unit.f186387a);
            default:
                y yVar2 = new y(1, this.f169755y, continuation);
                yVar2.f169753w = flowCollector;
                yVar2.f169754x = obj3;
                return yVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    flowCollector = this.f169753w;
                    mwg.b bVar = (mwg.b) this.f169754x;
                    jwg.h hVar = this.f169755y.v;
                    this.f169753w = null;
                    this.f169754x = null;
                    this.z = flowCollector;
                    this.v = 1;
                    obj2 = hVar.c(bVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = this.z;
                    yhm.o.b(obj2);
                }
                this.f169753w = null;
                this.f169754x = null;
                this.z = null;
                this.v = 2;
                if (vkm.q.u(flowCollector, (Flow) obj2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar3 = this.f169755y;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    flowCollector2 = this.f169753w;
                    mwg.b bVar2 = (mwg.b) this.f169754x;
                    jwg.h hVar2 = aVar3.v;
                    this.f169753w = null;
                    this.f169754x = null;
                    this.z = flowCollector2;
                    this.v = 1;
                    obj2 = hVar2.c(bVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector2 = this.z;
                    yhm.o.b(obj2);
                }
                akg.n nVarV = nim.a.v((Flow) obj2, new ghk.x(aVar3, 13));
                this.f169753w = null;
                this.f169754x = null;
                this.z = null;
                this.v = 2;
                if (vkm.q.u(flowCollector2, nVarV, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
