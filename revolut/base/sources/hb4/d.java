package hb4;

import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FamilyCreditCardSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = familyCreditCardSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) familyCreditCardSettingsScreen.d3();
                eVar.getClass();
                eVar.l2(new com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.a(eVar, null, 1), new yi5.b(26));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) familyCreditCardSettingsScreen.d3()).C2(f.f150600a);
                break;
        }
        return Unit.f186387a;
    }
}
