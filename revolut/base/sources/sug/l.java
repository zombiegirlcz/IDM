package sug;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureCompetitorCompanyChoice;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_platform_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice = domainState.f265760b;
        boolean z = accountClosureCompetitorCompanyChoice != null;
        List<String> list = domainState.f265759a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (String str : list) {
            String strQ = j6.a.q("FEEDBACK_COMPETITOR_COMPANY_ITEM_", str);
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            iq iqVar = iq.RADIO_BUTTON;
            AccountClosureCompetitorCompanyChoice.Company company = accountClosureCompetitorCompanyChoice instanceof AccountClosureCompetitorCompanyChoice.Company ? (AccountClosureCompetitorCompanyChoice.Company) accountClosureCompetitorCompanyChoice : null;
            InputChecklistDelegate.Model model = new InputChecklistDelegate.Model(strQ, textClause, str.equals(company != null ? company.f94852a : null), false, null, iqVar, null, null, str, null, R$attr.uikit_dp8, 0, 0, 522968);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        boolean z3 = accountClosureCompetitorCompanyChoice instanceof AccountClosureCompetitorCompanyChoice.Other;
        InputChecklistDelegate.Model model2 = new InputChecklistDelegate.Model("FEEDBACK_OTHER_COMPANY_ITEM", z3 ? new TextClause(((AccountClosureCompetitorCompanyChoice.Other) accountClosureCompetitorCompanyChoice).f94853a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.trading_account_closure_reason_other, null, null, 14), z3, false, z3 ? new InputChecklistDelegate.a.C0408a(1, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_questionary_other_hint, null, null, 14), true) : new InputChecklistDelegate.a.b(null), iq.RADIO_BUTTON, null, null, null, null, R$attr.uikit_dp8, 0, 0, 523208);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new j(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, d0.F0(model2, arrayList), z);
    }
}
