package xjh;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.feature.wealth.ui.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements hih.e {

    @NotNull
    public static final c Companion = new c();

    public f(wqi.a tabHeaderCommonActionsProvider) {
        Intrinsics.checkNotNullParameter(tabHeaderCommonActionsProvider, "tabHeaderCommonActionsProvider");
    }

    public static e4 b(boolean z) {
        return z ? e4.EnabledClickable : e4.DisabledNonClickable;
    }

    public final tx0.d a(List actions, hel.b bVar) {
        ActionsView.Item item;
        ActionsView.Item item2;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(actions, "actions");
        List<WealthAction> listP0 = d0.P0(actions, new e());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (WealthAction wealthAction : listP0) {
            if (wealthAction instanceof WealthAction.Trade) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_trade, null, null, 14);
                String str = "INVEST_TRADE_ACTION_ID";
                item = new ActionsView.Item(str, mx0.d.CONTEXTUAL, false, b(((WealthAction.Trade) wealthAction).f95889a), new TextLocalisedClause(R$string.wealth_invest_home_header_action_accessibility_label, u.c(textLocalisedClause2), null, 12), textLocalisedClause2, new ResourceImage(R$drawable.uikit_icn_24_arrow_rates, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24452);
            } else if (wealthAction instanceof WealthAction.Analytics) {
                String str2 = "INVEST_ANALYTICS_ACTION_ID";
                item = new ActionsView.Item(str2, mx0.d.CONTEXTUAL, false, b(((WealthAction.Analytics) wealthAction).f95869a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_analytics, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
            } else if (wealthAction instanceof WealthAction.AddMoney) {
                String str3 = "INVEST_ADD_MONEY_ACTION_ID";
                item = new ActionsView.Item(str3, mx0.d.CONTEXTUAL, false, b(((WealthAction.AddMoney) wealthAction).f95867a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_deposit, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
            } else if (wealthAction instanceof WealthAction.Withdraw) {
                String str4 = "INVEST_WITHDRAW_ACTION_ID";
                item = new ActionsView.Item(str4, mx0.d.CONTEXTUAL, false, b(((WealthAction.Withdraw) wealthAction).f95896a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_withdraw, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
            } else if (wealthAction instanceof WealthAction.MoveMoney) {
                String str5 = "INVEST_MOVE_MONEY_ACTION_ID";
                item = new ActionsView.Item(str5, mx0.d.CONTEXTUAL, false, b(((WealthAction.MoveMoney) wealthAction).getF95896a()), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_move_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
            } else if (wealthAction instanceof WealthAction.Settings) {
                String str6 = "INVEST_SETTINGS_ACTION_ID";
                item = new ActionsView.Item(str6, mx0.d.CONTEXTUAL, false, b(((WealthAction.Settings) wealthAction).f95880a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_settings, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
            } else if (wealthAction instanceof WealthAction.Documents) {
                String str7 = "INVEST_DOCUMENTS_ACTION_ID";
                item = new ActionsView.Item(str7, mx0.d.CONTEXTUAL, false, b(((WealthAction.Documents) wealthAction).f95871a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_documents, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
            } else if (wealthAction instanceof WealthAction.Theme) {
                WealthAction.Theme theme = (WealthAction.Theme) wealthAction;
                item = wqi.a.a("INVEST_THEME_CUSTOMISATION_ACTION_ID", b(theme.f95887a), theme);
            } else if (wealthAction instanceof WealthAction.HoldingsInformation) {
                String str8 = "INVEST_HOLDINGS_INFORMATION_ACTION_ID";
                item = new ActionsView.Item(str8, mx0.d.CONTEXTUAL, false, b(((WealthAction.HoldingsInformation) wealthAction).f95873a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_holdings_information, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_credit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
            } else {
                if (wealthAction instanceof WealthAction.TradingAddOns) {
                    WealthAction.TradingAddOns tradingAddOns = (WealthAction.TradingAddOns) wealthAction;
                    e4 e4VarB = b(tradingAddOns.f95891a);
                    switch (bVar == null ? -1 : d.f306530a[bVar.ordinal()]) {
                        case -1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_trading_add_on, null, null, 14);
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_trading_pro_uk, null, null, 14);
                            break;
                    }
                    item2 = new ActionsView.Item("INVEST_TRADING_ADD_ON_ACTION_ID", mx0.d.CONTEXTUAL, false, e4VarB, null, textLocalisedClause, new ResourceImage(R$drawable.uikit_icn_24_wealth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new NewBadgeContent.Dot(new Color.Solid(tradingAddOns.f95893c ? R$attr.uikit_colorGreen : R$attr.uikit_colorGrey10), null, 2), null, tradingAddOns, null, 11924);
                } else if (wealthAction instanceof WealthAction.TransferInvestments) {
                    String str9 = "INVEST_TRANSFER_ACTION_ID";
                    item = new ActionsView.Item(str9, mx0.d.CONTEXTUAL, false, b(((WealthAction.TransferInvestments) wealthAction).f95894a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_transfer_investments, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_send_message, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
                } else if (wealthAction instanceof WealthAction.StartOnboarding) {
                    String str10 = "INVEST_START_ONBOARDING_ACTION_ID";
                    boolean z = false;
                    Clause clause = null;
                    item2 = new ActionsView.Item(str10, mx0.d.CONTEXTUAL, z, e4.EnabledClickable, clause, new TextLocalisedClause(R$string.wealth_invest_home_intro_action, null, null, 14), null, null, null, null, false, null, null, (WealthAction.StartOnboarding) wealthAction, null, 24468);
                } else if (wealthAction instanceof WealthAction.TeenJisaStartOnboarding) {
                    WealthAction.TeenJisaStartOnboarding teenJisaStartOnboarding = (WealthAction.TeenJisaStartOnboarding) wealthAction;
                    item2 = new ActionsView.Item("INVEST_TEEN_JISA_START_ONBOARDING_ACTION_ID", mx0.d.CONTEXTUAL, false, e4.EnabledClickable, null, teenJisaStartOnboarding.f95886c ? new TextLocalisedClause(R$string.wealth_invest_home_teen_intro_uk_onboarding_in_progress_action, null, null, 14) : new TextLocalisedClause(R$string.wealth_invest_home_intro_action, null, null, 14), null, null, null, null, false, null, null, teenJisaStartOnboarding, null, 24468);
                } else {
                    if (!(wealthAction instanceof WealthAction.InviteFriends)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str11 = "INVITE_FRIENDS_ACTION_ID";
                    item = new ActionsView.Item(str11, mx0.d.CONTEXTUAL, false, b(((WealthAction.InviteFriends) wealthAction).f95875a), null, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_invite_friends, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_present, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, wealthAction, null, 24468);
                }
                item = item2;
            }
            arrayList.add(item);
        }
        return new tx0.d(u.c(arrayList));
    }
}
