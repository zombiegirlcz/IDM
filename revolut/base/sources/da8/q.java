package da8;

import com.revolut.data.model.Data;
import d27.g0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Data data = (Data) pair.f186385a;
        Data data2 = (Data) pair.f186386b;
        h hVar = (h) data2.getContent();
        com.revolut.feature.junior_profile.api.models.a aVar2 = hVar != null ? hVar.f112479a : null;
        com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar3 = this.v;
        aVar3.H2(aVar3.v, new g0(data2, 10, aVar2, data));
        return Unit.f186387a;
    }
}
