package eac;

import com.revolut.data.model.Data;
import k7c.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f124180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f124181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.management.impl.ui.management.home.a f124182y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f124182y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f124182y, continuation);
                tVar.f124180w = flowCollector;
                tVar.f124181x = obj3;
                return tVar.invokeSuspend(Unit.f186387a);
            case 1:
                t tVar2 = new t(1, this.f124182y, continuation);
                tVar2.f124180w = flowCollector;
                tVar2.f124181x = obj3;
                return tVar2.invokeSuspend(Unit.f186387a);
            default:
                t tVar3 = new t(2, this.f124182y, continuation);
                tVar3.f124180w = flowCollector;
                tVar3.f124181x = obj3;
                return tVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowV;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f124180w;
                    ul9.g gVar = this.f124182y.f84598y;
                    gVar.getClass();
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    if (gVar.c() == nl9.f.NOT_AVAILABLE) {
                        od0.i.Companion.getClass();
                        flowV = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                    } else {
                        ql9.d dVar = gVar.f280917a;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowV = nim.a.v(dVar.f247561c.a(Unit.f186387a, loadingStrategy), new uj6.v(14));
                    }
                    this.f124180w = null;
                    this.f124181x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowV, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f124180w;
                    akg.n nVarB = this.f124182y.u.b(new u6c.n(null, null, u6c.t.REVPAY, null, null, false, null, null, 995), w4l.i.f294643c);
                    this.f124180w = null;
                    this.f124181x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarB, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f124180w;
                    q7c.s sVar = this.f124182y.v;
                    sVar.getClass();
                    w4l.i loadingStrategy2 = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    y0 y0Var = sVar.f242835a;
                    y0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV = nim.a.v(nim.a.v(y0Var.d.b(Unit.f186387a, loadingStrategy2), new q75.n(13)), v.f124183a);
                    this.f124180w = null;
                    this.f124181x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, nVarV, this) == aVar3) {
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
