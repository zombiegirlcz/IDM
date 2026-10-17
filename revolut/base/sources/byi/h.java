package byi;

import akg.n;
import dwi.i0;
import hwi.a0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f19833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f19834x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b f19835y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f19835y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(0, this.f19835y, continuation);
                hVar.f19833w = flowCollector;
                hVar.f19834x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            case 1:
                h hVar2 = new h(1, this.f19835y, continuation);
                hVar2.f19833w = flowCollector;
                hVar2.f19834x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
            case 2:
                h hVar3 = new h(2, this.f19835y, continuation);
                hVar3.f19833w = flowCollector;
                hVar3.f19834x = obj3;
                return hVar3.invokeSuspend(Unit.f186387a);
            case 3:
                h hVar4 = new h(3, this.f19835y, continuation);
                hVar4.f19833w = flowCollector;
                hVar4.f19834x = obj3;
                return hVar4.invokeSuspend(Unit.f186387a);
            default:
                h hVar5 = new h(4, this.f19835y, continuation);
                hVar5.f19833w = flowCollector;
                hVar5.f19834x = obj3;
                return hVar5.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f19833w;
                    vkm.d dVarB = rd0.e.b(this.f19835y.f99127q.a(true, true));
                    this.f19833w = null;
                    this.f19834x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f19833w;
                    jhi.k kVarB = this.f19835y.f99126p.b();
                    this.f19833w = null;
                    this.f19834x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, kVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector3 = this.f19833w;
                    vkm.d dVarB2 = rd0.e.b(((a0) this.f19835y.f99127q.f120458a).f156191g.e(Unit.f186387a, w4l.i.f294643c));
                    this.f19833w = null;
                    this.f19834x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, dVarB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector4 = this.f19833w;
                    vkm.d dVarB3 = rd0.e.b(((i0) this.f19835y.f99128r).a());
                    this.f19833w = null;
                    this.f19834x = null;
                    this.v = 1;
                    if (q.u(flowCollector4, dVarB3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector5 = this.f19833w;
                    n nVarJ = this.f19835y.o.j(w4l.h.f294642c);
                    this.f19833w = null;
                    this.f19834x = null;
                    this.v = 1;
                    if (q.u(flowCollector5, nVarJ, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
