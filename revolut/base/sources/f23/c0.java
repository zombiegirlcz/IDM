package f23;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cha.a f131354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.h f131355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q89.e f131356c;

    public c0(cha.a creditPlansInteractor, yik.h pricingPlanStringMapper, q89.e onboardingInteractor) {
        Intrinsics.checkNotNullParameter(creditPlansInteractor, "creditPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.f131354a = creditPlansInteractor;
        this.f131355b = pricingPlanStringMapper;
        this.f131356c = onboardingInteractor;
    }

    public final m0 a(OrderNewCardFlowContract$InputData inputData, boolean z) {
        TextLocalisedClause textLocalisedClause;
        pi3.h hVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CardOrderAccountWrapper cardOrderAccountWrapper = inputData.f65091b;
        TextLocalisedClause textLocalisedClause2 = null;
        if (cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Junior) {
            return new m0(new TextLocalisedClause(R$string.card_order_onboarding_youth_title, zhm.u.c(((CardOrderAccountWrapper.Junior) cardOrderAccountWrapper).f64935c), null, 12), null, inputData.f65096l != null ? zhm.u.c(new TextNavBarMenuItem("MENU_NOT_NOW_ITEM_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14), null, null, 12)) : zhm.f0.f322471a);
        }
        if (!(cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Regular)) {
            throw new NoWhenBranchMatchedException();
        }
        AccountId accountId = ((CardOrderAccountWrapper.Regular) cardOrderAccountWrapper).f64936a;
        h93.l0 l0Var = inputData.i;
        SelectedTab selectedTab = inputData.f65090a;
        boolean z3 = inputData.f65092c;
        boolean z4 = false;
        boolean z6 = l0Var == h93.l0.BRAZIL_LOCAL;
        CardOrderContext cardOrderContext = inputData.e;
        if (cardOrderContext instanceof CardOrderContext.Default) {
            if (accountId instanceof AccountId.Joint) {
                textLocalisedClause = new TextLocalisedClause(R$string.card_order_joint_title, null, null, 14);
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z3 && selectedTab == SelectedTab.CREDIT) {
                    z4 = true;
                }
                textLocalisedClause = (z6 && z && !((db9.d) this.f131356c).c()) ? new TextLocalisedClause(R$string.card_order_credit_application_screen_title_combo, null, null, 14) : (z4 && ((jte.d) ((ffk.a) this.f131354a).f134816b).c(PricingPlansApi$Toggles.BrazilCreditPlans.f81000c) && (hVar = inputData.f65093g) != null) ? new TextLocalisedClause(R$string.card_order_credit_application_screen_title_with_plan, zhm.u.c(fgk.b.a(this.f131355b, hVar.f236404a)), null, 12) : z4 ? new TextLocalisedClause(R$string.card_order_credit_screen_title, null, null, 14) : inputData.f == zn3.a.ONBOARDING ? new TextLocalisedClause(R$string.add_new_card_screen_onboarding_header_title, null, null, 14) : new TextLocalisedClause(R$string.add_new_card_screen_header_title, null, null, 14);
            }
        } else {
            if (!(cardOrderContext instanceof CardOrderContext.CreditCardApplication)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = (inputData.f65095j || z6) ? new TextLocalisedClause(R$string.card_order_credit_application_screen_title_combo, null, null, 14) : new TextLocalisedClause(R$string.card_order_credit_application_screen_title, null, null, 14);
        }
        if (z3 && selectedTab == SelectedTab.CREDIT) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.card_order_credit_application_screen_description_credit_transactions, null, null, 14);
        }
        return new m0(textLocalisedClause, textLocalisedClause2, zhm.f0.f322471a);
    }
}
