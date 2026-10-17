package b75;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.mapper.LoanInterestRateTypeInfo;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInterestRate;
import ip0.ak0;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q35.l;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {
    public static ResourceImage a(j jVar) {
        return new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static CellDetailsDelegate.Model b(l lVar) {
        if (lVar == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_INTEREST_ONLY_REPAYMENTS_LEFT_CELL", new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_interest_only_period_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedQuantityClause(R$plurals.loan_management_account_interest_only_period_remaining, Integer.valueOf(lVar.f241830a), (List) null, (Style) null, 28), null, lVar, null, null, 0, null, false, false, null, null, 32696);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model model2;
        List listL;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.loan_management_widget_mortgage_interest_rate_interest_rate, null, null, 14), null, null, null, false, 30);
        aim.e eVarB = u.b();
        LoanInterestRate loanInterestRate = domainState.f12916b;
        l lVar = domainState.f12917c;
        wi0.b bVar = domainState.f12915a;
        if (loanInterestRate instanceof LoanInterestRate.Fixed) {
            throw new IllegalStateException("Fixed interest rate is not supported for Mortgage product");
        }
        if (loanInterestRate instanceof LoanInterestRate.TemporaryFixed) {
            LoanInterestRate.TemporaryFixed temporaryFixed = (LoanInterestRate.TemporaryFixed) loanInterestRate;
            aim.e eVarB2 = u.b();
            eVarB2.add(new CellDetailsDelegate.Model("ID_RATE_TYPE_CELL", new t0(new TextLocalisedClause(R$string.loan_management_account_rate_type, null, null, 14), LoanInterestRate.y9(bVar) ? a(this) : null, 0, LoanInterestRate.y9(bVar), 20), new TextLocalisedQuantityClause(R$plurals.loan_management_account_rate_temporary_fixed_term, Integer.valueOf(temporaryFixed.a()), (List) null, (Style) null, 28), null, new LoanInterestRateTypeInfo.TemporaryFixed(temporaryFixed.a()), null, null, 0, null, false, false, null, null, 32696));
            eVarB2.add(new CellDetailsDelegate.Model("ID_TOTAL_ANNUAL_RATE_CELL", new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_total_annual_interest_rate, null, null, 14), (Image) null, 0, false, 30), new TextClause(temporaryFixed.f70166a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
            LocalDate localDate = temporaryFixed.f70168c;
            if (localDate != null) {
                t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_rate_temporary_fixed_end_date, null, null, 14), (Image) null, 0, false, 30);
                com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                LocalDateClause$DateFormat.INSTANCE.getClass();
                LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
                jVar2.getClass();
                eVarB2.add(new CellDetailsDelegate.Model("ID_FIXED_RATE_END_DATE_CELL", t0Var, com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, null), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            n14.e.b(eVarB2, b(lVar));
            listL = u.a(eVarB2);
        } else {
            if (!(loanInterestRate instanceof LoanInterestRate.Variable)) {
                throw new NoWhenBranchMatchedException();
            }
            LoanInterestRate.Variable variable = (LoanInterestRate.Variable) loanInterestRate;
            LoanInterestRate.Variable.BaseRate baseRate = variable.f70170b;
            if (baseRate == null) {
                model = null;
            } else {
                model = new CellDetailsDelegate.Model("ID_RATE_TYPE_CELL", new t0(new TextLocalisedClause(R$string.loan_management_account_rate_type, null, null, 14), LoanInterestRate.y9(bVar) ? a(this) : null, 0, LoanInterestRate.y9(bVar), 20), new TextLocalisedClause(R$string.loan_management_account_variable_interest_euribor, u.c(Integer.valueOf(baseRate.a())), null, 12), null, new LoanInterestRateTypeInfo.Variable(baseRate.a()), null, null, 0, null, false, false, null, null, 32696);
            }
            CellDetailsDelegate.Model model3 = baseRate == null ? null : new CellDetailsDelegate.Model("ID_EURIBOR_RATE_CELL", new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_variable_interest_euribor_rate, null, null, 14), (Image) null, 0, false, 30), new TextClause(baseRate.f70174c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
            String str = variable.f70171c;
            CellDetailsDelegate.Model model4 = str == null ? null : new CellDetailsDelegate.Model("ID_REVOLUT_FIXED_RATE_CELL", new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_variable_interest_margin, null, null, 14), (Image) null, 0, false, 30), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
            CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("ID_TOTAL_ANNUAL_RATE_CELL", new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_total_annual_interest_rate, null, null, 14), (Image) null, 0, false, 30), new TextClause(variable.f70169a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
            LocalDate localDate2 = variable.d;
            if (localDate2 == null) {
                model2 = null;
            } else {
                t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_variable_interest_next_update, null, null, 14), (Image) null, 0, false, 30);
                com.revolut.core.ui_kit.models.j jVar3 = c7.Companion;
                LocalDateClause$DateFormat.INSTANCE.getClass();
                LocalDateClause$DateFormat.DateMedium dateMedium2 = LocalDateClause$DateFormat.Companion.f57815b;
                jVar3.getClass();
                model2 = new CellDetailsDelegate.Model("ID_NEXT_INTEREST_RATE_UPDATE_CELL", t0Var2, com.revolut.core.ui_kit.models.j.a(localDate2, dateMedium2, null), null, null, null, null, 0, null, false, false, null, null, 32760);
            }
            qv0.i[] elements = {model, model3, model4, model5, model2, b(lVar)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        }
        List list = listL;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        eVarB.addAll(list);
        if ((domainState.f12916b instanceof LoanInterestRate.TemporaryFixed) && !LoanInterestRate.y9(bVar)) {
            eVarB.add(new TextDelegate.Model("LOAN_INTEREST_RATE_DISCLAIMER", new TextLocalisedClause(R$string.loan_management_account_rate_temporary_fixed_explainer_disclaimer, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        }
        LargeActionButtonDelegate.Model model6 = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model6, R$attr.uikit_dp8, 0, 0, 0, 14);
        eVarB.add(model6);
        return new i(aVar, u.a(eVarB));
    }
}
