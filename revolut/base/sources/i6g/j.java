package i6g;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f158999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f159000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f159001y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, m mVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f159001y = mVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j jVar = new j(0, this.f159001y, continuation);
                jVar.f158999w = flowCollector;
                jVar.f159000x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            default:
                j jVar2 = new j(1, this.f159001y, continuation);
                jVar2.f158999w = flowCollector;
                jVar2.f159000x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f158999w;
                    String str = (String) this.f159000x;
                    Flow flowR = str.length() >= 3 ? this.f159001y.o.r(str, w4l.h.f294642c) : new go.g(new Data(null, null, false, 7, null), 2);
                    this.f158999w = null;
                    this.f159000x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowR, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f158999w;
                    w4l.k kVar = (w4l.k) this.f159000x;
                    m mVar = this.f159001y;
                    vkm.d dVarR = mVar.o.r(((f) ((j2) mVar.f159006r.f22677a).getValue()).f158995a, kVar);
                    this.f158999w = null;
                    this.f159000x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarR, this) == aVar2) {
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
