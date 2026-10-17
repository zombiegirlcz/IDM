package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f113983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f113984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f113985y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Continuation continuation, j jVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f113985y = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(continuation, this.f113985y, 0);
                hVar.f113983w = flowCollector;
                hVar.f113984x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(continuation, this.f113985y, 1);
                hVar2.f113983w = flowCollector;
                hVar2.f113984x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        j jVar = this.f113985y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f113983w;
                    vkm.h hVarS = vkm.q.s(mo3.a.g(jVar.d.e(((pej.h) this.f113984x).f235392a, w4l.h.f294642c), null, new dee.a0(2), 1), new dee.x(3), vkm.q.f290100b);
                    this.f113983w = null;
                    this.f113984x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = hVarS.collect(new dah.d(flowCollector, 22), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f113983w;
                    a aVar3 = (a) this.f113984x;
                    b bVar = j.Companion;
                    jVar.getClass();
                    Flow flowQ = vkm.q.q(new vkm.v1(new c5a.m0(jVar, aVar3.f113900a, null, 22)));
                    this.f113983w = null;
                    this.f113984x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect2 = flowQ.collect(new ahe.f0(flowCollector2, jVar, aVar3, 16), this);
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
