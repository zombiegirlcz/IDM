package com.revolut.feature.credit.card.impl.ui.instalment.repay.details;

import aim.e;
import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sx4.f;
import sx4.g;
import x0b.h;
import xlb.l;
import xs4.k;
import xs4.r;
import xs4.s;
import xs4.t;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CompositeClause a(int i, dj0.d dVar) {
        return new CompositeClause(v.k(f.b(3, null, null, dVar), new TextClause(" × ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedQuantityClause(R$plurals.months, Integer.valueOf(i), (List) null, (Style) null, 28)), null, null, null, 14);
    }

    public static TextLocalisedClause b(LocalDate localDate) {
        return new TextLocalisedClause(R$string.credit_card_instalment_repay_starting_on, u.c(j.b(c7.Companion, localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), null, 12);
    }

    public static e d(dj0.d dVar, dj0.d dVar2, dj0.d dVar3) {
        e eVarB = u.b();
        CounterTextDelegate.Model modelC = CounterTextDelegate.Model.Companion.c(CounterTextDelegate.Model.INSTANCE, "id_credit_card_instalment_repay_details_payment_section", new TextLocalisedClause(R$string.credit_card_instalment_repay_details_payment_title, null, null, 14), f.b(3, null, null, dVar), new TextLocalisedClause(R$string.credit_card_instalment_repay_full_details_description, null, null, 14), false, 2032);
        yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
        CellDetailsDelegate.Model[] elements = {new CellDetailsDelegate.Model("id_credit_card_instalment_repay_details_items_accrued_interest", new t0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_repay_principal_repayment, null, null, 14), (Image) null, 0, false, 30), f.b(3, null, null, dVar2), null, null, null, null, 0, null, false, false, null, null, 32760), dVar3 != null ? new CellDetailsDelegate.Model("id_credit_card_instalment_repay_details_items_accrued_interest", new t0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_repay_accrued_interest, null, null, 14), (Image) null, 0, false, 30), f.b(3, null, null, dVar3), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListG = yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("id_credit_card_instalment_repay_details_header_breakdown", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_card_instalment_repay_full_breakdown_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        eVarB.add(modelC);
        eVarB.addAll(arrayListG);
        return u.a(eVarB);
    }

    public static CounterTextDelegate.Model e(Clause clause, dj0.d dVar) {
        return CounterTextDelegate.Model.Companion.c(CounterTextDelegate.Model.INSTANCE, "id_credit_card_instalment_repay_details_payment_section", new TextLocalisedClause(R$string.credit_card_instalment_repay_details_payment_title, null, null, 14), f.b(3, null, null, dVar), clause, false, 2032);
    }

    public static ListSubheaderDelegate.Model f() {
        return new ListSubheaderDelegate.Model("id_credit_card_instalment_repay_details_header_schedule", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_card_instalment_repay_schedule_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static r40 g(CompositeClause compositeClause, Clause clause, Clause clause2, r rVar) {
        return new r40("id_credit_card_instalment_repay_details_items_last_amount", null, compositeClause, clause, clause2, null, R$attr.uikit_colorAccent, true, new o40(n40.CURRENT), 0, 0, 0, rVar, 7714);
    }

    public static r40 h(CompositeClause compositeClause, Clause clause, TextLocalisedClause textLocalisedClause, s sVar) {
        return new r40("id_credit_card_instalment_repay_details_items_regular_amount", null, compositeClause, clause, textLocalisedClause, null, R$attr.uikit_colorAccent, sVar != null, new o40(n40.CURRENT), 0, 0, 0, sVar, 7714);
    }

    public static r40 i(Clause clause, t tVar) {
        return new r40("id_credit_card_instalment_repay_details_items_repay_amount", null, clause, new TextLocalisedClause(R$string.credit_common_now, null, null, 14), null, null, R$attr.uikit_colorAccent, tVar != null, new o40(n40.FUTURE), 0, 0, 0, tVar, 7730);
    }

    public static boolean j(CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails repayDetails) {
        int i;
        if (repayDetails instanceof CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount) {
            i = ((CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount) repayDetails).f69482b.f68763c;
        } else {
            if (!(repayDetails instanceof CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments)) {
                throw new NoWhenBranchMatchedException();
            }
            i = ((CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments) repayDetails).f69483a.f68768a;
        }
        return i == 0;
    }

    public static Clause k(MoneyClause moneyClause) {
        return g.f(moneyClause, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        xs4.f domainState = (xs4.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f308395a, new xrl.a(this, 1), new l(this, 24), new h(this, 13));
    }
}
