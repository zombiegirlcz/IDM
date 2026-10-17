package hu4;

import aim.e;
import aw0.c7;
import aw0.ka;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.r0;
import com.revolut.core.ui_kit.delegates.s0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.credit.core.R$string;
import ip0.ej;
import ip0.s7;
import ip0.t1;
import ip0.xk;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;
import org.jetbrains.annotations.NotNull;
import sx4.f;
import sx4.g;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements dm4.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f155552a;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.f297756l;
        aVar.getClass();
        wi0.b[] elements = {bVar, wi0.b.A};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f155552a = d.y0(elements);
    }

    public c(iu4.a creditCardRepayLocalizationProvider) {
        Intrinsics.checkNotNullParameter(creditCardRepayLocalizationProvider, "creditCardRepayLocalizationProvider");
    }

    public static AttributeSelectorSmallDelegate.Model c(String str, TextLocalisedClause textLocalisedClause, dj0.d dVar, dj0.d dVar2) {
        r0 r0Var = null;
        MoneyClause moneyClauseB = f.b(3, null, null, dVar);
        Clause clauseF = g.f(textLocalisedClause, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
        dj0.d dVar3 = dj0.d.e;
        s0 s0Var = dVar.f(dVar3) ? s0.NORMAL : s0.DISABLED;
        if (dVar.f(dVar3) && dVar.equals(dVar2)) {
            r0Var = new r0(v.k(Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent)));
        }
        AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(str, moneyClauseB, clauseF, r0Var, s0Var, dVar.f(dVar3), new dm4.b(dVar), null, 384);
        int i = R$attr.uikit_dp0;
        yp0.b.l(model, i, i, i, i, null, false, 48);
        return model;
    }

    public final e a(dj0.d inputAmount, CreditCardPaymentDetails paymentDetails, wi0.b countryCode, boolean z) {
        AttributeSelectorSmallDelegate.Model modelC;
        List listK;
        d7 d7Var;
        TextLocalisedClause textLocalisedClause;
        Object obj2;
        TextLocalisedClause textLocalisedClause2;
        Style style;
        TextLocalisedClause textLocalisedClause3;
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        e eVarB = u.b();
        e eVarB2 = u.b();
        dj0.d dVar = paymentDetails.f;
        LocalDate localDate = paymentDetails.f68744p;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.f297756l;
        eVarB2.add(c("id_credit_card_pse_repay_min_repayment", Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_card_topup_item_monthly_payment_due, null, null, 14) : new TextLocalisedClause(R$string.credit_card_topup_item_minimum, null, null, 14), dVar, inputAmount));
        dj0.d dVar2 = paymentDetails.f68739h;
        wi0.b bVar2 = wi0.b.O;
        if (Intrinsics.f(countryCode, bVar2)) {
            modelC = null;
        } else {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            modelC = c("id_credit_card_pse_repay_statement_repayment", Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_card_topup_item_statement_balance, null, null, 14) : new TextLocalisedClause(R$string.credit_card_topup_item_statement, null, null, 14), dVar2, inputAmount);
        }
        if (paymentDetails.f68745q == xw4.a.OVERDUE) {
            eVarB2.add(c("id_credit_card_pse_repay_overdue", new TextLocalisedClause(R$string.credit_topup_overdue, null, null, 14), paymentDetails.i, inputAmount));
            n14.e.b(eVarB2, modelC);
        } else {
            n14.e.b(eVarB2, modelC);
            n14.e.b(eVarB2, f155552a.contains(countryCode) ? null : c("id_credit_card_pse_repay_total_repayment", new TextLocalisedClause(R$string.credit_card_topup_item_total, null, null, 14), paymentDetails.f68742m, inputAmount));
        }
        e eVarA = u.a(eVarB2);
        eVarB.add(new xk("id_credit_card_pse_repay_payment_suggestions", eVarA, Integer.valueOf(eVarA.size()), Float.valueOf(8.0f), null, 48));
        if (!z) {
            if (paymentDetails.f68747s) {
                LocalDate date = paymentDetails.f68743n.minusDays(1L);
                Intrinsics.h(date);
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(date, "date");
                if (Intrinsics.f(countryCode, bVar2)) {
                    int i = R$string.credit_card_topup_item_statement_closes;
                    j jVar = c7.Companion;
                    LocalDateClause$DateFormat.Month month = new LocalDateClause$DateFormat.Month(0);
                    jVar.getClass();
                    textLocalisedClause2 = new TextLocalisedClause(i, u.c(j.a(date, month, null)), null, 12);
                } else {
                    int i2 = R$string.credit_card_topup_item_dynamic_closing_date;
                    j jVar2 = c7.Companion;
                    LocalDateClause$DateFormat.Month month2 = new LocalDateClause$DateFormat.Month(0);
                    jVar2.getClass();
                    textLocalisedClause2 = new TextLocalisedClause(i2, u.c(j.a(date, month2, null)), null, 12);
                }
                t0 t0Var = new t0((Clause) textLocalisedClause2, (Image) null, 0, false, 30);
                j jVar3 = c7.Companion;
                ka kaVar = ka.SHORT;
                LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(kaVar);
                jVar3.getClass();
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("id_credit_card_pse_repay_statement_closed_date", t0Var, j.a(date, dayAndMonth, null), null, null, null, null, 0, null, false, false, null, null, 32760);
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(date, "date");
                if (Intrinsics.f(countryCode, bVar2)) {
                    style = null;
                    textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_topup_item_next_payment_due, null, null, 14);
                } else {
                    style = null;
                    textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_topup_item_dynamic_statement_due, u.c(j.a(date, new LocalDateClause$DateFormat.Month(0), null)), null, 12);
                }
                listK = v.k(model, new CellDetailsDelegate.Model("id_credit_card_pse_repay_statement_due_date", new t0((Clause) textLocalisedClause3, (Image) null, 0, false, 30), j.a(localDate, new LocalDateClause$DateFormat.DayAndMonth(kaVar), style), null, null, null, null, 0, null, false, false, null, null, 32760));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
            } else {
                e eVarB3 = u.b();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                t0 t0Var2 = new t0((Clause) (Intrinsics.f(countryCode, bVar2) ? new TextLocalisedClause(R$string.credit_card_topup_item_minimum_due, null, null, 14) : new TextLocalisedClause(R$string.credit_card_topup_item_statement_due, null, null, 14)), (Image) null, 0, false, 30);
                j jVar4 = c7.Companion;
                ka kaVar2 = ka.SHORT;
                eVarB3.add(new CellDetailsDelegate.Model("id_credit_card_pse_repay_statement_due_date", t0Var2, j.b(jVar4, localDate, new LocalDateClause$DateFormat.DayAndMonth(kaVar2)), null, null, null, null, 0, null, false, false, null, null, 32760));
                LocalDate localDate2 = paymentDetails.o;
                LocalDate localDateMinusDays = localDate2 != null ? localDate2.minusDays(1L) : null;
                if (localDateMinusDays != null) {
                    eVarB3.add(new CellDetailsDelegate.Model("id_credit_card_pse_repay_statement_closed_date", new t0((Clause) new TextLocalisedClause(R$string.credit_card_topup_item_statement_closed, u.c(j.a(localDateMinusDays, new LocalDateClause$DateFormat.Month(0), null)), null, 12), (Image) null, 0, false, 30), j.a(localDateMinusDays, new LocalDateClause$DateFormat.DayAndMonth(kaVar2), null), null, null, null, null, 0, null, false, false, null, null, 32760));
                }
                e eVarA2 = u.a(eVarB3);
                yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
                listK = eVarA2;
            }
            eVarB.addAll(listK);
            String facilityId = paymentDetails.f68735a;
            boolean z3 = paymentDetails.f68750x;
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            if (Intrinsics.f(countryCode, bVar2)) {
                textLocalisedClause = new TextLocalisedClause(R$string.credit_card_topup_footer_gmf_tax_info, null, null, 14);
                d7Var = null;
            } else if (Intrinsics.f(countryCode, bVar) && z3) {
                d7Var = null;
                textLocalisedClause = new TextLocalisedClause(R$string.credit_card_topup_footer_remaining_instalments_note, u.c(new TextLocalisedClause(R$string.credit_card_topup_footer_remaining_instalments_link, null, new Click(28, (Integer) null, (Object) new dm4.a(facilityId), "id_credit_card_repay_footer", false), 10)), null, 12);
            } else {
                d7Var = null;
                textLocalisedClause = z3 ? new TextLocalisedClause(R$string.credit_card_topup_footer_remaining_instalments, null, null, 14) : null;
            }
            if (textLocalisedClause == null) {
                obj2 = d7Var;
            } else {
                ej ejVar = new ej("id_credit_card_pse_repay_footer", new mx0.c7(textLocalisedClause, false, d7Var, 6));
                yp0.b.r(ejVar, R$attr.uikit_dp0, 0, 0, 0, 14);
                obj2 = ejVar;
            }
            n14.e.b(eVarB, obj2);
        }
        return u.a(eVarB);
    }

    public final e b() {
        e eVarB = u.b();
        t1 t1Var = new t1("id_credit_card_pse_repay_suggestion_1", null, 6);
        yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
        t1 t1Var2 = new t1("id_credit_card_pse_repay_suggestion_2", null, 6);
        yp0.b.l(t1Var2, 0, 0, 0, 0, null, false, 63);
        t1 t1Var3 = new t1("id_credit_card_pse_repay_suggestion_3", null, 6);
        yp0.b.l(t1Var3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(new xk("id_credit_card_pse_repay_payment_suggestions", v.k(t1Var, t1Var2, t1Var3), 3, Float.valueOf(8.0f), null, 48));
        List listK = v.k(new s7("id_credit_card_pse_repay_statement_due_date", 0, 0, 0, 0, false, null, 126), new s7("id_credit_card_pse_repay_statement_closed_date", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return u.a(eVarB);
    }
}
