package ueg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f279439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f279440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b f279441y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f279441y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w0 w0Var = new w0(0, this.f279441y, continuation);
                w0Var.f279439w = flowCollector;
                w0Var.f279440x = obj3;
                return w0Var.invokeSuspend(Unit.f186387a);
            default:
                w0 w0Var2 = new w0(1, this.f279441y, continuation);
                w0Var2.f279439w = flowCollector;
                w0Var2.f279440x = obj3;
                return w0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f279439w;
                    vkm.d dVarB = rd0.e.b(nim.a.w(nim.a.w(this.f279441y.f94061q.f159841a.N.f(Unit.f186387a, false), new fag.o0(7)), new i6j.p(23)));
                    this.f279439w = null;
                    this.f279440x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f279439w;
                    vkm.d dVarB2 = rd0.e.b(i9g.y.b(this.f279441y.f94062r, 1));
                    this.f279439w = null;
                    this.f279440x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
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
