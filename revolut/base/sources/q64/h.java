package q64;

import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dx4.z2;
import iu3.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GiveConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(GiveConsentScreen giveConsentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = giveConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            case 2:
                return new h(this.v, continuation, 2);
            default:
                return new h(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GiveConsentScreen giveConsentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                giveConsentScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) giveConsentScreen.d();
                iu3.t tVar = ((v) zi0.c.I(((l) ((j2) bVar.f67236q.f22677a).getValue()).f242484a)).f168511c;
                z2 z2Var = tVar != null ? tVar.f168506b : null;
                if (z2Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar.J2(z2Var);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) giveConsentScreen.d();
                bVar2.getClass();
                bVar2.n2(new q03.m(bVar2, new com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.a(bVar2, null, 1), (Continuation) null), new whi.b(6));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) giveConsentScreen.d()).f67237r, GiveConsentScreenContract$ModalStep.DeclineConfirmation.f67232a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
        }
    }
}
