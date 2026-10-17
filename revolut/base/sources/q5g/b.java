package q5g;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import q5g.t;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f242356w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f242356w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f242356w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = iVar.f224257a;
        PaymentMethod.Pocket pocket = obj3 instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) obj3 : null;
        if (pocket == null) {
            return new go.g(new Data(t.a.f242391a, null, false, 6, null), 2);
        }
        j2 j2Var = this.v.d;
        od0.i.Companion.getClass();
        od0.i iVarA = od0.h.a(pocket);
        j2Var.getClass();
        j2Var.g(null, iVarA);
        return new go.g(new Data(new u(pocket, pocket.f84381j.e(this.f242356w)), null, false, 6, null), 2);
    }
}
