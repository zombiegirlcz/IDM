package zbj;

import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l0 l0Var = new l0(this.v, continuation);
        l0Var.u = obj2;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((DisclaimerParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DisclaimerParams disclaimerParams = (DisclaimerParams) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = this.v;
        cVar.H2(cVar.F, new bzg.r(disclaimerParams, 6));
        return Unit.f186387a;
    }
}
