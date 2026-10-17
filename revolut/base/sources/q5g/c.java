package q5g;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w4l.k f242357w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, w4l.k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f242357w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f242357w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        dj0.d dVar = (dj0.d) pair.f186385a;
        PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) ((od0.i) pair.f186386b).f224257a;
        h hVar = this.v;
        if (pocket != null) {
            dj0.d dVar2 = pocket.f84381j;
            if (Intrinsics.f(dVar.f115083b, dVar2.f115083b)) {
                hVar.getClass();
                return new go.g(new Data(new u(pocket, dVar2.e(dVar)), null, false, 6, null), 2);
            }
        }
        return xam.a.h(new b(hVar, dVar, null), hVar.f242372a.b(new u6c.n(null, null, u6c.t.FLIGHTS, new Long(dVar.f115082a), dVar.f115083b, false, null, null, 995), this.f242357w));
    }
}
