package x0b;

import akg.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f301545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f301546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f301547y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Continuation continuation, g gVar) {
        super(3, continuation);
        this.u = i;
        this.f301547y = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(0, continuation, this.f301547y);
                eVar.f301545w = flowCollector;
                eVar.f301546x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(1, continuation, this.f301547y);
                eVar2.f301545w = flowCollector;
                eVar2.f301546x = obj3;
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
                    FlowCollector flowCollector = this.f301545w;
                    c1b.h hVar = (c1b.h) this.f301546x;
                    g gVar = this.f301547y;
                    n nVarA = gVar.f301549l.a(((g0b.c) ((j2) gVar.f301555s.f22677a).getValue()).d, hVar);
                    this.f301545w = null;
                    this.f301546x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarA, this) == aVar) {
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
                g gVar2 = this.f301547y;
                vki.a aVar2 = gVar2.f301555s;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f301545w;
                    Flow flowC = gVar2.f301549l.c(((g0b.c) ((j2) aVar2.f22677a).getValue()).d.getId(), ((g0b.c) ((j2) aVar2.f22677a).getValue()).f139398a);
                    this.f301545w = null;
                    this.f301546x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowC, this) == aVar3) {
                        return aVar3;
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
