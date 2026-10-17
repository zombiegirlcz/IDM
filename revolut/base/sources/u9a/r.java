package u9a;

import b8d.a0;
import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import tof.s9;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f278439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f278440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.automatico.screens.details.a f278441y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f278441y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f278441y, continuation);
                rVar.f278439w = flowCollector;
                rVar.f278440x = obj3;
                return rVar.invokeSuspend(Unit.f186387a);
            default:
                r rVar2 = new r(1, this.f278441y, continuation);
                rVar2.f278439w = flowCollector;
                rVar2.f278440x = obj3;
                return rVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f278439w;
                    com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar2 = this.f278441y;
                    wkm.l lVarQ = vkm.q.Q(aVar2.f80615p.a(aVar2.o.f80611a), new r(1, aVar2, null));
                    this.f278439w = null;
                    this.f278440x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f278439w;
                    Data data = (Data) this.f278440x;
                    whf.b bVar = this.f278441y.u;
                    g8a.k kVar = (g8a.k) data.getContent();
                    Set set = kVar != null ? kVar.o : null;
                    if (set == null) {
                        set = h0.f322473a;
                    }
                    vkm.d dVarB = rd0.e.b(whf.b.a(bVar, te0.w.h(new s9(set)), null, null, null, 14));
                    this.f278439w = null;
                    this.f278440x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = dVarB.collect(new a0(flowCollector2, data, 12), this);
                    if (objCollect != aVar3) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar3) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar3) {
                        return aVar3;
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
