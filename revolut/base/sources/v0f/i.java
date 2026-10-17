package v0f;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ CardDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CardDetailsScreen cardDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = (com.revolut.feature.topup_screen.impl.screens.card_details.b) this.u.d();
        bVar.getClass();
        yji.l.b1(bVar, bVar.X1(new kii.c("NFC_SETTINGS_DIALOG_ID", null, new TextLocalisedClause(R.string.nfc_dialog_turnedoff, null, null, 14), new TextLocalisedClause(R.string.common_action_settings, null, null, 14), new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), null, false, 978)), null, new j0(bVar, null), 3);
        return Unit.f186387a;
    }
}
