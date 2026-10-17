package hb4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ FamilyCreditCardSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = familyCreditCardSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) this.u.d();
        eVar.H2(eVar.f67685r, new ha1.k(29));
        eVar.n2(new com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.a(eVar, null, 0), new h56.a(eVar, 20));
        return Unit.f186387a;
    }
}
