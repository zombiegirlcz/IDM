package ec8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f124468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f124469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_allowance.impl.ui.screen.list.a f124470y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f124470y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f124470y, continuation);
                oVar.f124468w = flowCollector;
                oVar.f124469x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(1, this.f124470y, continuation);
                oVar2.f124468w = flowCollector;
                oVar2.f124469x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar = this.f124470y;
                h hVar = aVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f124468w;
                    w4l.k kVar = (w4l.k) this.f124469x;
                    j23.b bVarD = yh5.b.d(hj8.a.a(aVar.f76847q, hVar.f124465a, kVar), rd0.e.b(aVar.f76848r.m(hVar.f124465a, kVar instanceof w4l.i)));
                    this.f124468w = null;
                    this.f124469x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, bVarD, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f124468w;
                    w4l.k kVar2 = (w4l.k) this.f124469x;
                    com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar4 = this.f124470y;
                    j23.b bVarD2 = yh5.b.d(aVar4.f76846p.j(kVar2), aVar4.f76849s.g(aVar4.o.f124465a, w4l.i.f294643c));
                    this.f124468w = null;
                    this.f124469x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarD2, this) == aVar3) {
                        return aVar3;
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
