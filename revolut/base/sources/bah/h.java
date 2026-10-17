package bah;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.feature.wealth.impl.R$string;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import nel.z;
import yhm.r;
import z0h.f1;
import z0h.h1;
import z0h.j1;
import z0h.k1;
import z0h.l1;
import z0h.m1;
import z0h.n1;
import z0h.r1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements pzg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy5.a f14082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f14083b;

    public h(qy5.a commonDisclaimerProvider, cah.b paymentsInvestmentsDisclaimersFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDisclaimerProvider, "commonDisclaimerProvider");
        Intrinsics.checkNotNullParameter(paymentsInvestmentsDisclaimersFactory, "paymentsInvestmentsDisclaimersFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f14082a = commonDisclaimerProvider;
        this.f14083b = featureToggleInteractor;
    }

    public static CompositeClause c(List list) {
        return yoj.b.m(new TextClause(a0.C(m70.a.o(t0.f186434a), 2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), list);
    }

    @Override // pzg.a
    public final Clause a(f1 disclaimer) {
        TextLocalisedClause textLocalisedClause;
        r rVar;
        r rVar2;
        r rVar3;
        char c2;
        char c3;
        char c5;
        TextLocalisedClause textLocalisedClause2;
        int i;
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        WealthDisclaimersContract$Disclaimer$Investment wealthDisclaimersContract$Disclaimer$Investment = (WealthDisclaimersContract$Disclaimer$Investment) disclaimer;
        if (!(wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.TopUpConfirmation) && !(wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.BankTransferWithdraw) && !(wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.GeneralTopUp) && !(wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.ExternalCardCreation) && !(wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.Fx)) {
            if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.Withdraw) {
                switch (g.f14079a[((WealthDisclaimersContract$Disclaimer$Investment.Withdraw) wealthDisclaimersContract$Disclaimer$Investment).f95354a.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 7:
                        return new TextLocalisedClause(R$string.wealth_invest_footer_disclosure_withdraw, null, null, 14);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.AddMoney) {
                    switch (g.f14079a[((WealthDisclaimersContract$Disclaimer$Investment.AddMoney) wealthDisclaimersContract$Disclaimer$Investment).f95328a.ordinal()]) {
                        case 1:
                            i = R$string.wealth_invest_footer_disclosure_add_money_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            i = R$string.wealth_invest_footer_disclosure_add_money;
                            break;
                        case 7:
                            i = R$string.wealth_invest_footer_disclosure_add_money_eea;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    return new CompositeClause(v.k(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "INFO_DISCLAIMER_LEARN_MORE_LIST_ID", false), 10)), null, null, null, 14);
                }
                if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.AccountSelector) {
                    WealthDisclaimersContract$Disclaimer$Investment.AccountSelector accountSelector = (WealthDisclaimersContract$Disclaimer$Investment.AccountSelector) wealthDisclaimersContract$Disclaimer$Investment;
                    if (!(accountSelector instanceof WealthDisclaimersContract$Disclaimer$Investment.AccountSelector.Securities)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WealthDisclaimersContract$Disclaimer$Investment.AccountSelector.Securities securities = (WealthDisclaimersContract$Disclaimer$Investment.AccountSelector.Securities) accountSelector;
                    int i2 = g.f14079a[securities.f95326a.ordinal()];
                    h1 h1Var = h1.f318510a;
                    switch (i2) {
                        case 1:
                            return new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_account_selector_disclaimers_uk_format, u.c(securities.f95327b.f306286a), (Integer) null, h1Var, 12);
                        case 2:
                            return new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_account_selector_disclaimers_us, (List) null, (Integer) null, h1Var, 14);
                        case 3:
                            return new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_account_selector_disclaimers_au, (List) null, (Integer) null, h1Var, 14);
                        case 4:
                            return new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_account_selector_disclaimers_mx, (List) null, (Integer) null, h1Var, 14);
                        case 5:
                        case 6:
                            return new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_account_selector_disclaimers_sg, (List) null, (Integer) null, h1Var, 14);
                        case 7:
                            return new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_account_selector_disclaimers, (List) null, (Integer) null, h1Var, 14);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                boolean z = wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.InvestmentPlanProjections;
                qy5.a aVar = this.f14082a;
                if (z) {
                    WealthDisclaimersContract$Disclaimer$Investment.InvestmentPlanProjections investmentPlanProjections = (WealthDisclaimersContract$Disclaimer$Investment.InvestmentPlanProjections) wealthDisclaimersContract$Disclaimer$Investment;
                    Links links = investmentPlanProjections.f95337b;
                    String str = links.f105101s;
                    if (str != null) {
                        c2 = 0;
                        c3 = 2;
                        c5 = 1;
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_footer_disclosure_investment_etf_investment_plan_projections_eeu_main, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_investment_etf_investment_plan_projections_eeu_link, null, new Click(28, (Integer) null, (Object) new l1(new TextLocalisedClause(R$string.wealth_footer_disclosure_investment_etf_investment_plan_projections_eeu_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_investment_etf_investment_plan_projections_eeu_learn_more, null, new Click(28, (Integer) null, (Object) new j1(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12);
                    } else {
                        c2 = 0;
                        c3 = 2;
                        c5 = 1;
                        textLocalisedClause2 = null;
                    }
                    switch (g.f14079a[investmentPlanProjections.f95336a.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            m70.a.c(t0.f186434a);
                            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        case 7:
                            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14);
                            TextLocalisedClause textLocalisedClauseH = aVar.h(links, r1.NONE);
                            Clause[] elements = new Clause[3];
                            elements[c2] = textLocalisedClause2;
                            elements[c5] = textLocalisedClause3;
                            elements[c3] = textLocalisedClauseH;
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            return yoj.b.m(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePicker) {
                    WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePicker disclaimer2 = (WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePicker) wealthDisclaimersContract$Disclaimer$Investment;
                    Intrinsics.checkNotNullParameter(disclaimer2, "disclaimer");
                    hel.b bVar = disclaimer2.f95349a;
                    Links links2 = disclaimer2.f95350b;
                    switch (cah.a.f22654a[bVar.ordinal()]) {
                        case 1:
                            rVar2 = new r(Integer.valueOf(R$string.payments_picker_breakdown_investment_description_uk), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_rtl_terms, null, new Click(28, (Integer) null, (Object) new n1(links2.f105092g), "ID_GB_RTL_TERMS", false), 10), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_personal_terms, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/legal/terms/"), "ID_GB_PERSONAL_TERMS", false), 10));
                            rVar3 = rVar2;
                            int iIntValue = ((Number) rVar3.f314201a).intValue();
                            TextLocalisedClause[] elements2 = {(TextLocalisedClause) rVar3.f314202b, (TextLocalisedClause) rVar3.f314203c};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            return new TextLocalisedClause(iIntValue, kotlin.collections.d.L(elements2), null, 12);
                        case 2:
                            rVar2 = new r(Integer.valueOf(R$string.payments_picker_breakdown_investment_description_eea), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_rseuab_terms, null, new Click(28, (Integer) null, (Object) new n1(links2.f105092g), "ID_EEA_RSEUAB_TERMS", false), 10), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_personal_terms, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/en-LT/legal/terms/"), "ID_EEA_PERSONAL_TERMS", false), 10));
                            rVar3 = rVar2;
                            int iIntValue2 = ((Number) rVar3.f314201a).intValue();
                            TextLocalisedClause[] elements22 = {(TextLocalisedClause) rVar3.f314202b, (TextLocalisedClause) rVar3.f314203c};
                            Intrinsics.checkNotNullParameter(elements22, "elements");
                            return new TextLocalisedClause(iIntValue2, kotlin.collections.d.L(elements22), null, 12);
                        case 3:
                            rVar2 = new r(Integer.valueOf(R$string.payments_picker_breakdown_investment_description_sg), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_rsspl_terms, null, new Click(28, (Integer) null, (Object) new n1(links2.f105092g), "ID_SG_RSSPL_TERMS", false), 10), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_personal_terms, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/en-SG/legal/terms/?geo-redirect=true"), "ID_SG_PERSONAL_TERMS", false), 10));
                            rVar3 = rVar2;
                            int iIntValue22 = ((Number) rVar3.f314201a).intValue();
                            TextLocalisedClause[] elements222 = {(TextLocalisedClause) rVar3.f314202b, (TextLocalisedClause) rVar3.f314203c};
                            Intrinsics.checkNotNullParameter(elements222, "elements");
                            return new TextLocalisedClause(iIntValue22, kotlin.collections.d.L(elements222), null, 12);
                        case 4:
                            rVar3 = new r(Integer.valueOf(R$string.payments_picker_breakdown_investment_description_usa), null, null);
                            int iIntValue222 = ((Number) rVar3.f314201a).intValue();
                            TextLocalisedClause[] elements2222 = {(TextLocalisedClause) rVar3.f314202b, (TextLocalisedClause) rVar3.f314203c};
                            Intrinsics.checkNotNullParameter(elements2222, "elements");
                            return new TextLocalisedClause(iIntValue222, kotlin.collections.d.L(elements2222), null, 12);
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePickerFooter) {
                    WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePickerFooter disclaimer3 = (WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePickerFooter) wealthDisclaimersContract$Disclaimer$Investment;
                    Intrinsics.checkNotNullParameter(disclaimer3, "disclaimer");
                    switch (cah.a.f22654a[disclaimer3.f95351a.ordinal()]) {
                        case 1:
                            return new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_disclaimer_investment_uk, null, null, 14);
                        case 2:
                            return new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_disclaimer_investment_eea, null, null, 14);
                        case 3:
                            return new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_disclaimer_investment_sg, null, null, 14);
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.TransferFeesBreakdown) {
                        WealthDisclaimersContract$Disclaimer$Investment.TransferFeesBreakdown disclaimer4 = (WealthDisclaimersContract$Disclaimer$Investment.TransferFeesBreakdown) wealthDisclaimersContract$Disclaimer$Investment;
                        Intrinsics.checkNotNullParameter(disclaimer4, "disclaimer");
                        hel.b bVar2 = disclaimer4.f95352a;
                        Links links3 = disclaimer4.f95353b;
                        switch (cah.a.f22654a[bVar2.ordinal()]) {
                            case 1:
                                rVar = new r(Integer.valueOf(R$string.payments_picker_breakdown_investment_disclaimer_uk), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_rtl_terms, null, new Click(28, (Integer) null, (Object) new n1(links3.f105092g), "ID_GB_RTL_TERMS", false), 10), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_personal_terms, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/legal/terms/"), "ID_GB_PERSONAL_TERMS", false), 10));
                                break;
                            case 2:
                                rVar = new r(Integer.valueOf(R$string.payments_picker_breakdown_investment_disclaimer_eea), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_rseuab_terms, null, new Click(28, (Integer) null, (Object) new n1(links3.f105092g), "ID_EEA_RSEUAB_TERMS", false), 10), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_personal_terms, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/en-LT/legal/terms/"), "ID_EEA_PERSONAL_TERMS", false), 10));
                                break;
                            case 3:
                                rVar = new r(Integer.valueOf(R$string.payments_picker_breakdown_investment_disclaimer_sg), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_rsspl_terms, null, new Click(28, (Integer) null, (Object) new n1(links3.f105092g), "ID_SG_RSSPL_TERMS", false), 10), new TextLocalisedClause(R$string.payments_picker_breakdown_investment_personal_terms, null, new Click(28, (Integer) null, (Object) new n1("https://www.revolut.com/en-SG/legal/terms/?geo-redirect=true"), "ID_SG_PERSONAL_TERMS", false), 10));
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        return new TextLocalisedClause(((Number) rVar.f314201a).intValue(), v.k((TextLocalisedClause) rVar.f314202b, (TextLocalisedClause) rVar.f314203c), null, 12);
                    }
                    if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTC) {
                        switch (g.f14079a[((WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTC) wealthDisclaimersContract$Disclaimer$Investment).f95338a.ordinal()]) {
                            case 1:
                                List listK = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement_uk, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                List listK2 = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTCJoint) {
                        switch (g.f14079a[((WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTCJoint) wealthDisclaimersContract$Disclaimer$Investment).f95339a.ordinal()]) {
                            case 1:
                                List listK3 = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement_joint_uk, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            case 7:
                                List listK4 = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement_joint_eea, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK4, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTCPro) {
                        switch (g.f14079a[((WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTCPro) wealthDisclaimersContract$Disclaimer$Investment).f95341a.ordinal()]) {
                            case 1:
                                List listK5 = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement_pro_uk, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK5, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            case 7:
                                List listK6 = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement_pro_eea, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK6, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTCJunior) {
                        switch (g.f14079a[((WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyDetailedTCJunior) wealthDisclaimersContract$Disclaimer$Investment).f95340a.ordinal()]) {
                            case 1:
                                List listK7 = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement_junior_uk, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK7, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            case 7:
                                List listK8 = v.k(new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_detailed_agreement_junior_eea, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_tandc_learn_more, null, new Click(28, (Integer) null, (Object) new j1("question.will-i-be-charged-for-exchanging-foreign-currencies"), "TERMS_AND_CONDITIONS_LEARN_MORE", false), 10));
                                m70.a.t(t0.f186434a);
                                return new CompositeClause(listK8, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyInvestmentFundsBreakdown) {
                        switch (g.f14079a[((WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyInvestmentFundsBreakdown) wealthDisclaimersContract$Disclaimer$Investment).f95342a.ordinal()]) {
                            case 1:
                                return new TextLocalisedClause(R$string.wealth_disclosure_investment_move_money_investment_funds_breakdown_description_uk, null, null, 14);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        boolean z3 = wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.News;
                        m1 m1Var = m1.f318535a;
                        if (z3) {
                            WealthDisclaimersContract$Disclaimer$Investment.News news = (WealthDisclaimersContract$Disclaimer$Investment.News) wealthDisclaimersContract$Disclaimer$Investment;
                            hel.b bVar3 = news.f95343a;
                            Links links4 = news.f95344b;
                            switch (g.f14079a[bVar3.ordinal()]) {
                                case 1:
                                    return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_gb, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosure_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1.f318523a, "INVEST_DISCLOSURES", false), 10)), null, 12)), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                                case 2:
                                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_us, null, null, 14);
                                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_us_all_investments_involve_risk, null, null, 14);
                                    int i3 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_trading_disclosures;
                                    t0 t0Var = t0.f186434a;
                                    m70.a.c(t0Var);
                                    return yoj.b.m(new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause4, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause5, new HtmlLocalisedClause(i3, u.c(""), (Integer) null, m1Var, 12))), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_us, null, null, 14)));
                                case 3:
                                    return ((jte.d) this.f14083b).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_au, null, null, 14) : new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_au, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_analytics_stocks_bottom_description_au, null, null, 14)), null, null, null, 14);
                                case 4:
                                case 5:
                                case 6:
                                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_sg, null, null, 14);
                                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14);
                                    TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_sg, null, null, 14);
                                    HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_terms_business, u.c(links4.f105092g), (Integer) null, new n1(links4.f105092g), 12);
                                    int i5 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_and_trading_disclosures;
                                    t0 t0Var2 = t0.f186434a;
                                    m70.a.c(t0Var2);
                                    return yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var2), m70.a.o(t0Var2)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause6, textLocalisedClause7, textLocalisedClause8, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause, new HtmlLocalisedClause(i5, u.c(""), (Integer) null, m1Var, 12)))));
                                case 7:
                                    TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_eea, null, null, 14);
                                    TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14);
                                    TextLocalisedClause textLocalisedClause11 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_eea, null, null, 14);
                                    HtmlLocalisedClause htmlLocalisedClause2 = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_capital_at_risk, u.c(links4.d), (Integer) null, new n1(links4.d), 12);
                                    int i6 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_trading_disclosures;
                                    t0 t0Var3 = t0.f186434a;
                                    m70.a.c(t0Var3);
                                    return yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var3), m70.a.o(t0Var3)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause9, textLocalisedClause10, textLocalisedClause11, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause2, new HtmlLocalisedClause(i6, u.c(""), (Integer) null, m1Var, 12)))));
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.Stats) {
                            WealthDisclaimersContract$Disclaimer$Investment.Stats stats = (WealthDisclaimersContract$Disclaimer$Investment.Stats) wealthDisclaimersContract$Disclaimer$Investment;
                            hel.b bVar4 = stats.f95345a;
                            z zVar = stats.f95347c;
                            Links links5 = stats.f95346b;
                            int i21 = g.f14079a[bVar4.ordinal()];
                            m1 m1Var2 = m1.f318535a;
                            switch (i21) {
                                case 1:
                                    if (!io3.h.i(zVar)) {
                                        return c(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1.f318523a, "INVEST_DISCLOSURES", false), 10)), null, 12)));
                                    }
                                    Clause[] elements3 = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_bond_footer, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_bonds_services_are_provided_by_revolut, null, null, 14), aVar.i(links5, r1.NONE)};
                                    Intrinsics.checkNotNullParameter(elements3, "elements");
                                    return c(kotlin.collections.d.L(elements3));
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                case 7:
                                    switch (g.f14081c[zVar.ordinal()]) {
                                        case 1:
                                            int i22 = g.f14080b[stats.d.ordinal()];
                                            if (i22 == 1) {
                                                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_stats_dictionary_risk_disclaimer, null, null, 14);
                                            } else if (i22 == 2) {
                                                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_stats_dictionary_price_disclaimer, null, null, 14);
                                            } else if (i22 == 3) {
                                                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_stats_dictionary_yield_disclaimer, null, null, 14);
                                            } else {
                                                if (i22 != 4) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_details_stats_disclaimer, null, null, 14);
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_details_stats_disclaimer, null, null, 14);
                                            break;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                    return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) m1Var2, "FOOTER_LEARN_MORE_LINK", false), 10)));
                                case 4:
                                    TextLocalisedClause textLocalisedClause12 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut_with_digital_advisory, null, null, 14);
                                    TextLocalisedClause textLocalisedClause13 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_details_stats_disclaimer, null, null, 14);
                                    TextLocalisedClause textLocalisedClause14 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_past_performance, null, null, 14);
                                    HtmlLocalisedClause htmlLocalisedClause3 = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_terms_business, u.c(links5.f105092g), (Integer) null, new n1(links5.f105092g), 12);
                                    int i32 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_and_trading_disclosures;
                                    m70.a.c(t0.f186434a);
                                    Object[] elements4 = {textLocalisedClause12, textLocalisedClause13, textLocalisedClause14, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause3, new HtmlLocalisedClause(i32, u.c(""), (Integer) null, m1Var2, 12)))};
                                    Intrinsics.checkNotNullParameter(elements4, "elements");
                                    return c(kotlin.collections.d.L(elements4));
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (!(wealthDisclaimersContract$Disclaimer$Investment instanceof WealthDisclaimersContract$Disclaimer$Investment.CashBalance)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        WealthDisclaimersContract$Disclaimer$Investment.CashBalance cashBalance = (WealthDisclaimersContract$Disclaimer$Investment.CashBalance) wealthDisclaimersContract$Disclaimer$Investment;
                        hel.b bVar5 = cashBalance.f95330a;
                        Links links6 = cashBalance.f95331b;
                        switch (g.f14079a[bVar5.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                            case 7:
                                break;
                            case 4:
                                TextLocalisedClause textLocalisedClause15 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut_with_digital_advisory, null, null, 14);
                                TextLocalisedClause textLocalisedClause16 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_past_performance, null, null, 14);
                                HtmlLocalisedClause htmlLocalisedClause4 = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_terms_business, u.c(links6.f105092g), (Integer) null, new n1(links6.f105092g), 12);
                                int i33 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_and_trading_disclosures;
                                m70.a.c(t0.f186434a);
                                return c(v.k(textLocalisedClause15, textLocalisedClause16, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause4, new HtmlLocalisedClause(i33, u.c(""), (Integer) null, m1Var, 12)))));
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof WealthDisclaimersContract$Disclaimer$Investment;
    }
}
