package tl6;

import com.revolut.domain.models.openbanking.OpenBankingConsentsFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.a aVar2 = this.u;
        return yji.l.a1(aVar2, ((mg6.c) aVar2.o).b(aVar2.f72791p.f72789a.f60395a, OpenBankingConsentsFilter.INACTIVE), null, null, new h(aVar2, null), 3);
    }
}
