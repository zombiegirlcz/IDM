package aa7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import r10.t;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f2768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r10.f f2770y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Continuation continuation, r10.f fVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f2770y = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                f fVar = new f(continuation, this.f2770y, 0);
                fVar.f2768w = flowCollector;
                fVar.f2769x = obj3;
                return fVar.invokeSuspend(Unit.f186387a);
            default:
                f fVar2 = new f(continuation, this.f2770y, 1);
                fVar2.f2768w = flowCollector;
                fVar2.f2769x = obj3;
                return fVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f2768w;
                    String ref2 = (String) this.f2769x;
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    r10.f fVar = this.f2770y;
                    Flow flowE = boh.f.e(((t) fVar.b).m(ref2), new a08.o(fVar, ref2, 25));
                    this.f2768w = null;
                    this.f2769x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f2768w;
                    String ref3 = (String) this.f2769x;
                    Intrinsics.checkNotNullParameter(ref3, "ref");
                    akg.n nVarM = ((t) this.f2770y.b).m(ref3);
                    this.f2768w = null;
                    this.f2769x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, nVarM, this) == aVar2) {
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
