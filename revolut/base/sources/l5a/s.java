package l5a;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar = this.u;
        return eVar.C1(u0.b(((rae.c) eVar.f80198s).h(AccountId.Personal.f51414a)));
    }
}
