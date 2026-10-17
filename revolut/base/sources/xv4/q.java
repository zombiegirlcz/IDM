package xv4;

import aw0.c7;
import aw0.ka;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsStateMapper$StatementParcel$AutoPaySettings;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsStateMapper$StatementParcel$SetupAutoPay;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import xo8.j0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(em4.h hVar) {
        Clause clauseB;
        CreditCardAutopayPayments creditCardAutopayPayments = hVar.f127617b;
        if (creditCardAutopayPayments == null) {
            return f0.f322471a;
        }
        CreditCardAutopayPayment.AutoPayment autoPaymentA = creditCardAutopayPayments.a();
        Object obj2 = CreditCardStatementDetailsStateMapper$StatementParcel$AutoPaySettings.f69723a;
        if (autoPaymentA == null) {
            boolean zIsEmpty = creditCardAutopayPayments.d.isEmpty();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_details_info_autopay, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_statement_details_info_autopay_set_up, null, null, 14);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            if (zIsEmpty) {
                obj2 = CreditCardStatementDetailsStateMapper$StatementParcel$SetupAutoPay.f69724a;
            }
            return u.c(new CellDetailsActionDelegate.Model("id_statement_details_auto_pay", textLocalisedClause, 0, resourceImage, textLocalisedClause2, false, false, null, obj2, 0, 0, 32224));
        }
        CreditCardAutopayPayment.PaymentAmount paymentAmount = autoPaymentA.e;
        xi0.b bVar = hVar.f127616a.f196542m;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_statement_details_info_autopay, null, null, 14);
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.StatementBalance) {
            clauseB = new TextLocalisedClause(R$string.credit_card_statement_details_info_autopay_statement_balance, null, null, 14);
        } else if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.MinRepayment) {
            clauseB = new TextLocalisedClause(R$string.credit_card_statement_details_info_autopay_minimum_amount, null, null, 14);
        } else if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Fixed) {
            clauseB = sx4.f.b(3, null, null, ((CreditCardAutopayPayment.PaymentAmount.Fixed) paymentAmount).f70712a);
        } else {
            if (!(paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            clauseB = sx4.f.b(3, null, null, new dj0.d(0L, bVar));
        }
        return u.c(new CellDetailsActionDelegate.Model("id_statement_details_auto_pay", textLocalisedClause3, 0, new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clauseB, false, false, null, obj2, 0, 0, 32224));
    }

    public static List b(em4.h hVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_details_info_interest, null, null, 14);
        long j2 = hVar.d.e;
        ll4.u uVar = hVar.f127616a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("id_statement_interests", textLocalisedClause, sx4.f.b(3, null, null, new dj0.d(j2, uVar.f196542m)), 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_statement_details_info_due_by, null, null, 14);
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        long j3 = uVar.k;
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        LocalDate localDateH = oc.c.H(j3, UTC);
        LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        jVar.getClass();
        List listK = v.k(model, new CellDetailsDelegate.Model("id_statement_details_due_by", textLocalisedClause2, com.revolut.core.ui_kit.models.j.a(localDateH, dayAndMonth, custom), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public static List d(boolean z, boolean z3) {
        List listK = v.k(new ExpandableCellDelegate.Model("id_statement_details_minimum_pay_details", new TextLocalisedClause(R$string.credit_card_statement_details_info_explanation_minimum, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, z, null, null, LDSFile.EF_DG12_TAG), new ExpandableCellDelegate.Model("id_statement_details_estimated_interest_details", new TextLocalisedClause(R$string.credit_card_statement_details_info_explanation_interest, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, z3, null, null, LDSFile.EF_DG12_TAG));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public static TextLocalisedClause e(em4.h hVar) {
        int i = R$string.credit_card_statement_details_header_title;
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        long j2 = hVar.f127616a.f196548t;
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        return new TextLocalisedClause(i, u.c(com.revolut.core.ui_kit.models.j.b(jVar, oc.c.H(j2, UTC), new LocalDateClause$DateFormat.Month(ka.FULL))), null, 12);
    }

    public static CellDetailsDelegate.Model f(String str, int i, MoneyClause moneyClause) {
        return new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), moneyClause, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
    }

    public static CellDetailsDelegate.Model g(em4.h hVar) {
        Clause clauseB;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_details_info_minimum, null, null, 14);
        if (hVar.f127616a.f196540j == 0) {
            clauseB = new TextLocalisedClause(R$string.credit_card_statement_details_info_state_paid, null, null, 14);
        } else {
            ll4.u uVar = hVar.f127616a;
            clauseB = sx4.f.b(3, null, null, new dj0.d(uVar.f196540j, uVar.f196542m));
        }
        return new CellDetailsDelegate.Model("id_statement_details_minimum", textLocalisedClause, clauseB, 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model h(em4.h hVar) {
        TextLocalisedClause textLocalisedClause;
        Clause clauseB;
        switch (r.f309202a[hVar.a().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_details_info_total, null, null, 14);
                break;
            case 4:
            case 5:
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_details_info_left, null, null, 14);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (hVar.a() == em4.g.PaidInFull) {
            clauseB = new TextLocalisedClause(R$string.credit_card_statement_details_info_state_paid, null, null, 14);
        } else {
            ll4.u uVar = hVar.f127616a;
            clauseB = sx4.f.b(3, null, null, new dj0.d(uVar.f196539h, uVar.f196542m));
        }
        return new CellDetailsDelegate.Model("id_statement_details_total", textLocalisedClause, clauseB, 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f309187a, new xub.e(this, 6), new xti.k(3), new j0(this, domainState, 5));
    }
}
