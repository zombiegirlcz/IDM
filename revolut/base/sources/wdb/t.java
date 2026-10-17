package wdb;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f296533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f296534x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dj0.d f296535y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, PaymentMethod.Pocket pocket, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f296533w = wVar;
        this.f296534x = pocket;
        this.f296535y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.f296533w, this.f296534x, this.f296535y, continuation);
        tVar.v = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            q7c.m mVar = this.f296533w.f296541b;
            xi0.b bVar = this.f296534x.i.f115083b;
            dj0.d dVar = this.f296535y;
            vkm.d dVarB = mVar.b(bVar, dVar.f115082a, new k6c.e(dVar.f115083b));
            this.v = null;
            this.u = 1;
            if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
