package xg6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f305602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f305603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f305604y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, Continuation continuation, x xVar) {
        super(3, continuation);
        this.u = i;
        this.f305604y = xVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t tVar = new t(0, continuation, this.f305604y);
                tVar.f305602w = flowCollector;
                tVar.f305603x = obj3;
                return tVar.invokeSuspend(Unit.f186387a);
            default:
                t tVar2 = new t(1, continuation, this.f305604y);
                tVar2.f305602w = flowCollector;
                tVar2.f305603x = obj3;
                return tVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f305602w;
                    Flow flowB = ((Boolean) this.f305603x).booleanValue() ? rd0.e.b(this.f305604y.f305610a.d.f(Unit.f186387a, true)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    this.f305602w = null;
                    this.f305603x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f305602w;
                    Continuation continuation = null;
                    if (((Boolean) this.f305603x).booleanValue()) {
                        x xVar = this.f305604y;
                        xVar.getClass();
                        gVar = nim.a.v(u0.m(vkm.q.Q(new v1(new u(0, continuation, xVar)), new t(0, continuation, xVar)), rd0.e.b(((j) xVar.f305611b).i(w4l.j.f294644c, oe6.d.f224553a))), w.f305609a);
                    } else {
                        gVar = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    }
                    this.f305602w = null;
                    this.f305603x = null;
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
        }
    }
}
