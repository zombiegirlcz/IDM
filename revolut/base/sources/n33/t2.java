package n33;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cha.a f211836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.h f211837b;

    public t2(cha.a creditPlansInteractor, yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(creditPlansInteractor, "creditPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f211836a = creditPlansInteractor;
        this.f211837b = pricingPlanStringMapper;
    }

    public final x a(boolean z, boolean z3, OrderNewCardContract$Configuration configuration) {
        TextLocalisedClause textLocalisedClause;
        pi3.h hVar;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        CardOrderAccountWrapper cardOrderAccountWrapper = configuration.f65210c;
        TextLocalisedClause textLocalisedClause2 = null;
        if (cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Junior) {
            return new x(new TextLocalisedClause(R$string.card_order_onboarding_youth_title, zhm.u.c(((CardOrderAccountWrapper.Junior) cardOrderAccountWrapper).f64935c), null, 12), null, configuration.e != null ? zhm.u.c(new TextNavBarMenuItem("MENU_NOT_NOW_ITEM_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14), null, null, 12)) : zhm.f0.f322471a);
        }
        if (!(cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Regular)) {
            throw new NoWhenBranchMatchedException();
        }
        AccountId accountId = ((CardOrderAccountWrapper.Regular) cardOrderAccountWrapper).f64936a;
        h93.l0 l0Var = configuration.f65214l;
        SelectedTab selectedTab = configuration.f65208a;
        boolean z4 = configuration.f65209b;
        h93.l0 l0Var2 = h93.l0.BRAZIL_LOCAL;
        boolean z6 = false;
        boolean z11 = l0Var == l0Var2;
        CardOrderContext cardOrderContext = configuration.f65213j;
        if (cardOrderContext instanceof CardOrderContext.Default) {
            if (accountId instanceof AccountId.Joint) {
                textLocalisedClause = new TextLocalisedClause(R$string.card_order_joint_title, null, null, 14);
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z12 = l0Var == l0Var2;
                if (z4 && selectedTab == SelectedTab.CREDIT) {
                    z6 = true;
                }
                textLocalisedClause = (z && z12 && z3) ? new TextLocalisedClause(R$string.card_order_credit_application_screen_title_combo, null, null, 14) : (z6 && ((jte.d) ((ffk.a) this.f211836a).f134816b).c(PricingPlansApi$Toggles.BrazilCreditPlans.f81000c) && (hVar = configuration.f65212h) != null) ? new TextLocalisedClause(R$string.card_order_credit_application_screen_title_with_plan, zhm.u.c(fgk.b.a(this.f211837b, hVar.f236404a)), null, 12) : z6 ? new TextLocalisedClause(R$string.card_order_credit_screen_title, null, null, 14) : configuration.f65211g == zn3.a.ONBOARDING ? new TextLocalisedClause(R$string.add_new_card_screen_onboarding_header_title, null, null, 14) : new TextLocalisedClause(R$string.add_new_card_screen_header_title, null, null, 14);
            }
        } else {
            if (!(cardOrderContext instanceof CardOrderContext.CreditCardApplication)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = (configuration.f65215m || z11) ? new TextLocalisedClause(R$string.card_order_credit_application_screen_title_combo, null, null, 14) : new TextLocalisedClause(R$string.card_order_credit_application_screen_title, null, null, 14);
        }
        if (z4 && selectedTab == SelectedTab.CREDIT) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.card_order_credit_application_screen_description_credit_transactions, null, null, 14);
        }
        return new x(textLocalisedClause, textLocalisedClause2, zhm.f0.f322471a);
    }
}
