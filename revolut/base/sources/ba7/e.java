package ba7;

import akg.n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f13970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f13972y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Continuation continuation, h hVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f13972y = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(continuation, this.f13972y, 0);
                eVar.f13970w = flowCollector;
                eVar.f13971x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(continuation, this.f13972y, 1);
                eVar2.f13970w = flowCollector;
                eVar2.f13971x = obj3;
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
                    FlowCollector flowCollector = this.f13970w;
                    Pair pair = (Pair) this.f13971x;
                    xi0.b currency = (xi0.b) pair.f186385a;
                    xi0.b baseCurrency = (xi0.b) pair.f186386b;
                    r10.f fVar = this.f13972y.f13977b;
                    Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    vkm.d dVarB = rd0.e.b(f61.a.H((f61.a) fVar.b, new Pair(currency, baseCurrency), qta.f.DAY, 12));
                    this.f13970w = null;
                    this.f13971x = null;
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f13970w;
                    Pair pair2 = (Pair) this.f13971x;
                    xi0.b currency2 = (xi0.b) pair2.f186385a;
                    xi0.b baseCurrency2 = (xi0.b) pair2.f186386b;
                    r10.f fVar2 = this.f13972y.f13977b;
                    Intrinsics.checkNotNullParameter(baseCurrency2, "baseCurrency");
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    n nVarV = nim.a.v(rd0.e.b(((ppk.f) fVar2.c).e(v1.c.w(currency2, baseCurrency2), n9l.b.SEC_3)), new b96.a(13));
                    this.f13970w = null;
                    this.f13971x = null;
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
