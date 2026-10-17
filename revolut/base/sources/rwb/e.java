package rwb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f257879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f257880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f257881y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Continuation continuation, h hVar) {
        super(3, continuation);
        this.u = i;
        this.f257881y = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(0, continuation, this.f257881y);
                eVar.f257879w = flowCollector;
                eVar.f257880x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(1, continuation, this.f257881y);
                eVar2.f257879w = flowCollector;
                eVar2.f257880x = obj3;
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
                    FlowCollector flowCollector = this.f257879w;
                    vkm.d dVarB = rd0.e.b(this.f257881y.f257883q.c(false));
                    this.f257879w = null;
                    this.f257880x = null;
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
                    FlowCollector flowCollector2 = this.f257879w;
                    h hVar = this.f257881y;
                    vkm.d dVarD = hVar.f257882p.d(hVar.o.f83668a, w4l.h.f294642c);
                    this.f257879w = null;
                    this.f257880x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarD, this) == aVar2) {
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
