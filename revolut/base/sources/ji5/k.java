package ji5;

import g48.r;
import jfb.v0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f174366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f174367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f174368y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Continuation continuation, m mVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f174368y = mVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                k kVar = new k(continuation, this.f174368y, 0);
                kVar.f174366w = flowCollector;
                kVar.f174367x = obj3;
                return kVar.invokeSuspend(Unit.f186387a);
            default:
                k kVar2 = new k(continuation, this.f174368y, 1);
                kVar2.f174366w = flowCollector;
                kVar2.f174367x = obj3;
                return kVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f174366w;
                    Flow flowA = ((Boolean) this.f174367x).booleanValue() ? this.f174368y.a() : new go.g(Boolean.FALSE, 2);
                    this.f174366w = null;
                    this.f174367x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowA, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f174366w;
                    Flow rVar = ((Boolean) this.f174367x).booleanValue() ? new r(mo3.a.g(rd0.e.b(((e) this.f174368y.f174371b).f()), null, new v0(9), 1), 17) : new go.g(Boolean.FALSE, 2);
                    this.f174366w = null;
                    this.f174367x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, rVar, this) == aVar2) {
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
