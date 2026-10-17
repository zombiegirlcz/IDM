package qug;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.iq;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputChecklistDelegate.Model a(int i, String str, boolean z) {
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), z, false, null, iq.RADIO_BUTTON, null, null, null, null, R$attr.uikit_dp8, 0, 0, 523224);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static InputChecklistDelegate.Model b(AccountClosureFeedbackChoice accountClosureFeedbackChoice) {
        boolean z = accountClosureFeedbackChoice instanceof AccountClosureFeedbackChoice.Other;
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("FEEDBACK_OTHER", z ? new TextClause(((AccountClosureFeedbackChoice.Other) accountClosureFeedbackChoice).f94864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.trading_account_closure_reason_other, null, null, 14), z, false, z ? new InputChecklistDelegate.a.C0408a(1, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_questionary_other_hint, null, null, 14), true) : new InputChecklistDelegate.a.b(null), iq.RADIO_BUTTON, null, null, null, null, R$attr.uikit_dp8, 0, 0, 523208);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        List listK;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_title, null, null, 14);
        TradingAccount tradingAccount = domainState.f249443a;
        if ((tradingAccount instanceof TradingAccount.GIA) || (tradingAccount instanceof TradingAccount.Robo)) {
            i = R$string.trading_account_closure_feedback_screen_reason_subtitle;
        } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) {
            i = R$string.wealth_pea_account_closure_feedback_screen_reason_subtitle;
        } else if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa)) {
            i = R$string.wealth_isa_account_closure_feedback_screen_reason_subtitle;
        } else {
            if (!(tradingAccount instanceof TradingAccount.Margin)) {
                if (!(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException((tradingAccount.getF105262a() + " account closure flow not supported for feedback.").toString());
            }
            i = R$string.wealth_margin_account_closure_feedback_screen_reason_subtitle;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        AccountClosureFeedbackChoice accountClosureFeedbackChoice = domainState.f249444b;
        boolean z = accountClosureFeedbackChoice != null;
        TradingAccount tradingAccount2 = domainState.f249443a;
        boolean z3 = tradingAccount2 instanceof TradingAccount.GIA;
        AccountClosureFeedbackChoice.NotInterested notInterested = AccountClosureFeedbackChoice.NotInterested.f94863b;
        AccountClosureFeedbackChoice.AnotherPlatform anotherPlatform = AccountClosureFeedbackChoice.AnotherPlatform.f94860b;
        AccountClosureFeedbackChoice.UnhappyCustomerSupport unhappyCustomerSupport = AccountClosureFeedbackChoice.UnhappyCustomerSupport.f94867b;
        if (z3 || (tradingAccount2 instanceof TradingAccount.Margin) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.Pea) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.JIsa)) {
            listK = v.k(a(R$string.trading_account_closure_reason_features, "ACCOUNT_CLOSURE_FEEDBACK_FEATURES_DONT_WORK", accountClosureFeedbackChoice instanceof AccountClosureFeedbackChoice.FeaturesDontWork), a(R$string.trading_account_closure_reason_expensive, "FEEDBACK_TOO_EXPENSIVE", Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.TooExpensive.f94866b)), a(R$string.trading_account_closure_reason_support, "FEEDBACK_UNHAPPY_CUSTOMER_SERVICE", Intrinsics.f(accountClosureFeedbackChoice, unhappyCustomerSupport)), a(R$string.trading_account_closure_reason_platform, "FEEDBACK_ANOTHER_PLATFORM", Intrinsics.f(accountClosureFeedbackChoice, anotherPlatform)), a(R$string.trading_account_closure_reason_not_interested, "FEEDBACK_NOT_INTERESTED", Intrinsics.f(accountClosureFeedbackChoice, notInterested)), b(accountClosureFeedbackChoice));
        } else {
            if (!(tradingAccount2 instanceof TradingAccount.Robo)) {
                if (!(tradingAccount2 instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount2 instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount2 instanceof TradingAccount.PaperTrading) && !(tradingAccount2 instanceof TradingAccount.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException((tradingAccount2.getF105262a() + " account closure flow not supported for feedback.").toString());
            }
            listK = v.k(a(R$string.trading_account_closure_reason_features, "ACCOUNT_CLOSURE_FEEDBACK_FEATURES_DONT_WORK", accountClosureFeedbackChoice instanceof AccountClosureFeedbackChoice.FeaturesDontWork), a(R$string.trading_account_closure_reason_poor_performance, "FEEDBACK_POOR_PERFORMANCE", Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.PoorPerformance.f94865b)), a(R$string.trading_account_closure_reason_support, "FEEDBACK_UNHAPPY_CUSTOMER_SERVICE", Intrinsics.f(accountClosureFeedbackChoice, unhappyCustomerSupport)), a(R$string.trading_account_closure_reason_switch_investing_platform, "FEEDBACK_ANOTHER_PLATFORM", Intrinsics.f(accountClosureFeedbackChoice, anotherPlatform)), a(R$string.trading_account_closure_reason_not_interested_investing, "FEEDBACK_NOT_INTERESTED", Intrinsics.f(accountClosureFeedbackChoice, notInterested)), b(accountClosureFeedbackChoice));
        }
        return new i(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, listK, z);
    }
}
