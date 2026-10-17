package g03;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsController;
import com.revolut.feature.cards_core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DisposableCardSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DisposableCardSettingsController disposableCardSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = disposableCardSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar = (com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b) eVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        switch (str.hashCode()) {
            case -2087414264:
                if (str.equals("REMOVE_CARD_LIST_ID")) {
                    j60.a aVar2 = bVar.f64873s;
                    bVar.f64872r.getClass();
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_settings_remove_disposable_card_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_settings_remove_disposable_card_dialog_description, null, null, 14), null, 28);
                    LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CARD_TERMINATION_POSITIVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.card_settings_remove_disposable_card_dialog_confirm_button, null, null, 14), false, null, null, null, null, 1000);
                    yp0.b.r(model2, 0, 0, 0, 0, 15);
                    LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("CARD_TERMINATION_NEGATIVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.card_settings_remove_disposable_card_dialog_cancel_button, null, null, 14), false, null, null, null, null, 1000);
                    yp0.b.r(model3, 0, R$attr.uikit_dp24, 0, 0, 13);
                    aVar2.x(new rp0.y(zhm.v.k(model2, model3), tVar, null, null, null, null, 1020));
                }
                break;
            case -2047014073:
                if (str.equals("REGENERATE_CARD_DETAILS_LIST_ID")) {
                    bVar.n2(new u(bVar, null, 1), new whi.b(6));
                }
                break;
            case -2030129093:
                if (str.equals("RESET_PIN_TRIES_ID")) {
                    bVar.u.Z2(((a) ((j2) bVar.B.f22677a).getValue()).f139254b);
                }
                break;
            case -832632163:
                if (str.equals("LIST_ID_CARD_PAYMENT_METHOD_WIDGET")) {
                    bVar.l2(new u(bVar, null, 2), new yi5.b(26));
                }
                break;
            case 1869112099:
                if (str.equals("LABEL_CARD_ITEM_ID")) {
                    bVar.l2(new u(bVar, null, 0), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
