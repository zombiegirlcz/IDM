package com.revolut.feature.credit.direct.debit.account_confirm_v2;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$AmountType;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$RepaymentDay;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import ly4.h;
import ly4.m;
import org.jetbrains.annotations.NotNull;
import sx4.f;
import yp0.b;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements n {

    @NotNull
    public static final C0478a Companion = new C0478a();

    /* JADX INFO: renamed from: com.revolut.feature.credit.direct.debit.account_confirm_v2.a$a, reason: collision with other inner class name */
    public static final class C0478a {
        private C0478a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        Clause textClause;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        m mVar = new m(new TextLocalisedClause(R$string.credit_card_direct_debit_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_direct_debit_confirmation_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_direct_debit_confirmation_disclaimer_template, v.k(new TextLocalisedClause(R$string.credit_card_direct_debit_set_account_button, null, null, 14), new TextLocalisedClause(R$string.credit_card_direct_debit_confirmation_disclaimer_terms, null, new Click(30, (Integer) null, (Object) null, "id_direct_debit_confirm_terms", false), 10)), null, 12);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_common_confirm, null, null, 14);
        DirectDebitConfirmScreenContract$AmountType directDebitConfirmScreenContract$AmountType = domainState.f200683a;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_common_amount, null, null, 14);
        if (directDebitConfirmScreenContract$AmountType instanceof DirectDebitConfirmScreenContract$AmountType.Fixed) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_autopay_confirmation_fixed_amount, u.c(f.b(3, null, null, ((DirectDebitConfirmScreenContract$AmountType.Fixed) directDebitConfirmScreenContract$AmountType).f69854a)), null, 12);
        } else if (directDebitConfirmScreenContract$AmountType instanceof DirectDebitConfirmScreenContract$AmountType.Minimum) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_autopay_confirmation_minimum_amount, null, null, 14);
        } else {
            if (!(directDebitConfirmScreenContract$AmountType instanceof DirectDebitConfirmScreenContract$AmountType.Statement)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_autopay_confirmation_statement_balance, null, null, 14);
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("id_direct_debit_confirm_amount", textLocalisedClause4, textLocalisedClause, 0, null, null, null, null, null, false, 0, 0, 32760);
        DirectDebitConfirmScreenContract$RepaymentDay directDebitConfirmScreenContract$RepaymentDay = domainState.f200684b;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_card_auto_pay_management_day, null, null, 14);
        if (directDebitConfirmScreenContract$RepaymentDay instanceof DirectDebitConfirmScreenContract$RepaymentDay.DueDate) {
            textClause = new TextLocalisedClause(R$string.credit_card_direct_debit_confirmation_item_days_before_due_date, u.c(Integer.valueOf(((DirectDebitConfirmScreenContract$RepaymentDay.DueDate) directDebitConfirmScreenContract$RepaymentDay).f69860a)), null, 12);
        } else {
            if (!(directDebitConfirmScreenContract$RepaymentDay instanceof DirectDebitConfirmScreenContract$RepaymentDay.Fixed)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = new TextClause(j6.a.l(((DirectDebitConfirmScreenContract$RepaymentDay.Fixed) directDebitConfirmScreenContract$RepaymentDay).f69861a, "Fixed(day=", ")"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List listK = v.k(model, new CellDetailsDelegate.Model("id_direct_debit_confirm_amount", textLocalisedClause5, textClause, 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("id_direct_debit_confirm_bank_name", new TextLocalisedClause(R$string.credit_card_direct_debit_confirmation_item_bank_name, null, null, 14), domainState.f200685c, 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("id_direct_debit_confirm_clabe", new TextLocalisedClause(R$string.credit_card_direct_debit_account_type_clabe, null, null, 14), new TextClause(d0.k0(f0.M0(4, domainState.d), " ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        b.k(listK, 0, 0, 0, 0, 31);
        return new ly4.n(mVar, textLocalisedClause2, textLocalisedClause3, listK);
    }
}
