package nj8;

import ek2.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f216388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f216389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f216390y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Continuation continuation, n nVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f216390y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(continuation, this.f216390y, 0);
                eVar.f216388w = flowCollector;
                eVar.f216389x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(continuation, this.f216390y, 1);
                eVar2.f216388w = flowCollector;
                eVar2.f216389x = obj3;
                return eVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f216388w;
                    akg.n nVarM = this.f216390y.m((String) this.f216389x, w4l.j.f294644c);
                    this.f216388w = null;
                    this.f216389x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarM, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f216388w;
                    String str = (String) this.f216389x;
                    akg.n nVarV = nim.a.v(this.f216390y.k(str, w4l.j.f294644c), new p(str, 1));
                    this.f216388w = null;
                    this.f216389x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, nVarV, this) == aVar2) {
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
