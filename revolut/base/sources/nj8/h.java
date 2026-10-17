package nj8;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f216395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f216396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f216397y;
    public final /* synthetic */ w4l.k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Continuation continuation, n nVar, w4l.k kVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f216397y = nVar;
        this.z = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(continuation, this.f216397y, this.z, 0);
                hVar.f216395w = flowCollector;
                hVar.f216396x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            case 1:
                h hVar2 = new h(continuation, this.f216397y, this.z, 1);
                hVar2.f216395w = flowCollector;
                hVar2.f216396x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
            default:
                h hVar3 = new h(continuation, this.f216397y, this.z, 2);
                hVar3.f216395w = flowCollector;
                hVar3.f216396x = obj3;
                return hVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f216395w;
                    akg.n nVarV = nim.a.v(this.f216397y.m((String) this.f216396x, this.z), i.f216398a);
                    this.f216395w = null;
                    this.f216396x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarV, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f216395w;
                    Flow flowK = ((Boolean) this.f216396x).booleanValue() ? this.f216397y.k(null, this.z) : new go.g(new Data(r0.g(), null, false, 6, null), 2);
                    this.f216395w = null;
                    this.f216396x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowK, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector3 = this.f216395w;
                    vkm.d dVarC = ((qj8.j) this.f216397y.f216410b).c((String) this.f216396x, this.z);
                    this.f216395w = null;
                    this.f216396x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, dVarC, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
