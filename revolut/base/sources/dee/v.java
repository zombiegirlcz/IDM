package dee;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f113423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f113424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f113425y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, z zVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f113425y = zVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                v vVar = new v(0, this.f113425y, continuation);
                vVar.f113423w = flowCollector;
                vVar.f113424x = obj3;
                return vVar.invokeSuspend(Unit.f186387a);
            default:
                v vVar2 = new v(1, this.f113425y, continuation);
                vVar2.f113423w = flowCollector;
                vVar2.f113424x = obj3;
                return vVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f113423w;
                    String transactionId = (String) this.f113424x;
                    sde.e eVar = this.f113425y.f113429p;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    vkm.y yVar = new vkm.y(new v1(new rhl.b(eVar, transactionId, null, 26)), new pc2.d(3, 16, null));
                    this.f113423w = null;
                    this.f113424x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f113423w;
                    vkm.y yVar2 = new vkm.y(new vkm.y(new a35.j(2, 14, null), new v1(new d3i.g(this.f113425y, null, 19))), new a82.q(3, 8, null));
                    this.f113423w = null;
                    this.f113424x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, yVar2, this) == aVar2) {
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
