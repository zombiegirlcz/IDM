package q2e;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j0 j0Var = new j0(this.v, continuation);
        j0Var.u = obj2;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        tvb.b bVar = tvb.c.Companion;
        do3.n nVar = (do3.n) data.getContent();
        wi0.b bVarG = (nVar == null || (address = nVar.k) == null) ? null : nz8.d.g(address);
        bVar.getClass();
        tvb.c cVarA = tvb.b.a(bVarG);
        com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = this.v;
        cVar.H2(cVar.T, new q03.h(cVarA, 11));
        return Unit.f186387a;
    }
}
