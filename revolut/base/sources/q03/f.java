package q03;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.card_management.api.cardlimit.CardLimitDestination;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodNavigationDestination;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardsFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExternalAppDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutCardSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevolutCardSettingsController revolutCardSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = revolutCardSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o0 o0VarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) o0VarD3;
        cli.y yVar = bVar.E;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        int i = 2;
        Continuation continuation = null;
        switch (str.hashCode()) {
            case -2030129093:
                if (str.equals("RESET_PIN_TRIES_ID")) {
                    f03.a aVar2 = bVar.v;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                    aVar2.Z2((h93.f0) obj3);
                }
                break;
            case -832632163:
                if (str.equals("LIST_ID_CARD_PAYMENT_METHOD_WIDGET")) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                    h93.f0 card = (h93.f0) obj3;
                    y43.a aVar3 = bVar.u;
                    AccountId accountId = ((i0) ((j2) yVar.f22677a).getValue()).f241081b;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(card, "card");
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    bVar.C1(new SelectPaymentMethodNavigationDestination(new SelectPaymentMethodInputData(new SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings(card, accountId))));
                }
                break;
            case -182883600:
                if (str.equals("CARD_SCA_ITEM")) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                    bVar.I2((h93.f0) obj3);
                }
                break;
            case -153175181:
                if (str.equals("REMOVE_CARD_ITEM_ID")) {
                    bVar.n2(new k(4, bVar, continuation), new whi.b(6));
                }
                break;
            case -15843207:
                if (str.equals("DESIGN_CARD_ITEM_ID")) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                    h93.f0 f0Var = (h93.f0) obj3;
                    c93.e eVar = c93.e.VIRTUAL;
                    h93.j0 j0Var = f0Var.H;
                    if (j0Var == null) {
                        j0Var = h93.j0.RETAIL;
                    }
                    h93.j0 j0Var2 = j0Var;
                    h93.l0 l0Var = f0Var.G;
                    if (l0Var == null) {
                        l0Var = h93.l0.DEBIT;
                    }
                    bVar.C1(new CardDesignCatalogueDestination(null, eVar, j0Var2, l0Var, ((i0) ((j2) yVar.f22677a).getValue()).f241081b, f0Var.f150110a, null, null, false, true, null, null, null, f0Var.f150114h.f13640b, null, null, null, y0.b(eVar), false, null, null, 15982016));
                }
                break;
            case 84778972:
                if (str.equals("LINKED_WALLETS_ITEM_ID")) {
                    bVar.C2(new j0(bVar.o.f64900a));
                }
                break;
            case 114979327:
                if (str.equals("REPLACE_CARD_ID")) {
                    bVar.n2(new k(i, bVar, continuation), new whi.b(6));
                }
                break;
            case 515651532:
                if (str.equals("REPLACE_VIRTUAL_CARD_LIST_ID")) {
                    j60.a aVar4 = bVar.f64909p;
                    bVar.f64914w.getClass();
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_replacement_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.card_replacement_confirmation_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 28);
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_replacement_confirmation_button_replace, null, null, 14);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    int i2 = R$attr.uikit_dp16;
                    LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CONFIRM_REPLACE_CARD_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, R$attr.uikit_dp24, R$attr.uikit_dp8, i2, i2, 496);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_replacement_confirmation_button_cancel, null, null, 14);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                    int i3 = R$attr.uikit_dp16;
                    aVar4.x(new rp0.y(zhm.v.k(model2, new LargeActionButtonDelegate.Model("CANCEL_REPLACE_CARD_LIST_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, i3, i3, 496)), tVar, null, null, null, null, 1020));
                }
                break;
            case 609858286:
                if (str.equals("CHANGE_PIN_ITEM_ID")) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                    bVar.l2(new m(bVar, (h93.f0) obj3, null, 0), new yi5.b(26));
                }
                break;
            case 610061648:
                if (str.equals("SHOW_PIN_LIST_ID")) {
                    e03.b bVar2 = obj3 instanceof e03.b ? (e03.b) obj3 : null;
                    if (bVar2 != null) {
                        bVar.l2(new m(bVar, bVar2, null, 1), new yi5.b(26));
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Settings data empty when navigating to show pin");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    }
                }
                break;
            case 1185016992:
                if (str.equals("LIMITS_ITEM_ID")) {
                    bVar.C1(new CardLimitDestination(((i0) ((j2) yVar.f22677a).getValue()).f241080a));
                }
                break;
            case 1244069941:
                if (str.equals("CARD_PAYMENTS_LIMIT_LIST_ID")) {
                    qtc.k kVar = qtc.k.CARD_PAYMENTS;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails");
                    bVar.C1(new SecurityHubDestination((SecurityHubStartScreen) new SecurityHubStartScreen.WealthProtectionChangeLimit(kVar, otc.c.a((WealthProtectionFeatureDetails) obj3)), false, (String) null, false, 30));
                }
                break;
            case 1332128734:
                if (str.equals("GOOGLE_PAY_WALLET_ITEM_ID")) {
                    bVar.C1(u0.b(new ActivityNavigateCommand(new ExternalAppDestination("com.google.android.apps.walletnfcrel"), null, null, null, 268435456, null, null, null, null, false, 1006)));
                }
                break;
            case 1869112099:
                if (str.equals("LABEL_CARD_ITEM_ID")) {
                    bVar.C1(u0.b(new FeatureCommand(new CardsFeatureConfig.ChangeCardLabel(2, ((i0) ((j2) yVar.f22677a).getValue()).f241080a, 10013))));
                }
                break;
        }
        return Unit.f186387a;
    }
}
