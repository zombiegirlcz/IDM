package q16;

import f3d.g;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import vkm.v1;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f241389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f241390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k18.c f241391y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Continuation continuation, k18.c cVar, boolean z, int i) {
        super(3, continuation);
        this.u = i;
        this.f241391y = cVar;
        this.z = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b bVar = new b(continuation, this.f241391y, this.z, 0);
                bVar.f241389w = flowCollector;
                bVar.f241390x = obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            default:
                b bVar2 = new b(continuation, this.f241391y, this.z, 1);
                bVar2.f241389w = flowCollector;
                bVar2.f241390x = obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f241389w;
                    xi0.b bVar = (xi0.b) this.f241390x;
                    k18.c cVar = this.f241391y;
                    f16.b bVar2 = (f16.b) cVar.f180140b;
                    Intrinsics.h(bVar);
                    v1 v1Var = new v1(new a9j.o(f16.b.a(bVar2, bVar), bVar, cVar, this.z, (Continuation) null, 3));
                    this.f241389w = null;
                    this.f241390x = null;
                    this.v = 1;
                    if (q.u(flowCollector, v1Var, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f241389w;
                    List list = (List) this.f241390x;
                    List list2 = list;
                    Flow flowI = (list2 == null || list2.isEmpty()) ? zi0.c.i(f0.f322471a) : new g(t46.a.a((t46.a) this.f241391y.d, list), this.z, 2);
                    this.f241389w = null;
                    this.f241390x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowI, this) == aVar2) {
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
