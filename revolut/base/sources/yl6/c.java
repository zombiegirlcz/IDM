package yl6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.LinkedAccountsConsentScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.LinkedAccountsConsentScreenContract$OutputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LinkedAccountsConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LinkedAccountsConsentScreen linkedAccountsConsentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = linkedAccountsConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.O.getValue();
        String consentId = model.f53228a;
        com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.a) fVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        aVar2.C2(new LinkedAccountsConsentScreenContract$OutputData.AccountClicked(consentId));
        return Unit.f186387a;
    }
}
