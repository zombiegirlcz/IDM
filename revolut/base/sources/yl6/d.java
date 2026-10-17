package yl6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.LinkedAccountsConsentScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ LinkedAccountsConsentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LinkedAccountsConsentScreen linkedAccountsConsentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = linkedAccountsConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.a) ((f) this.u.O.getValue());
        aVar2.getClass();
        aVar2.l2(new y7i.h(aVar2, null, 17), new yi5.b(26));
        return Unit.f186387a;
    }
}
