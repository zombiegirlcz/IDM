package pwc;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(this.v, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar2 = this.v;
        aVar2.H2(aVar2.D, new pvk.b(data, 10));
        return Unit.f186387a;
    }
}
