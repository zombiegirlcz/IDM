package wdb;

import com.revolut.feature.retail.restaurants.impl.domain.interactor.InvalidGuaranteeException;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Reservation.Guarantee f296537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f296538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w6c.h f296539y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Reservation.Guarantee guarantee, w wVar, w6c.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f296537w = guarantee;
        this.f296538x = wVar;
        this.f296539y = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.f296537w, this.f296538x, this.f296539y, continuation);
        vVar.v = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Reservation.Guarantee guarantee = this.f296537w;
            Reservation.Guarantee.Order order = guarantee.f82823c;
            if (order != null) {
                if (!com.revolut.feature.retail.restaurants.impl.domain.model.f.a(guarantee)) {
                    order = null;
                }
                if (order != null) {
                    dj0.d dVar = order.f82825b;
                    if (dVar == null) {
                        throw new InvalidGuaranteeException(0);
                    }
                    q7c.g gVar = this.f296538x.f296540a;
                    w6c.h hVar = this.f296539y;
                    vkm.f fVarF = gVar.f(new u6c.p(hVar.f295415a, order.d, (u6c.u) null, u6c.t.STAYS, Long.valueOf(dVar.f115082a), dVar.f115083b, false, 64), hVar.f295416b, hVar.f295417c);
                    this.v = null;
                    this.u = 1;
                    if (vkm.q.u(flowCollector, fVarF, this) == aVar) {
                        return aVar;
                    }
                }
            }
            throw new InvalidGuaranteeException(0);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        return Unit.f186387a;
    }
}
