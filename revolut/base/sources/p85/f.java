package p85;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f233867a;

    public f(a loanPartialRepaymentBehaviourMapper) {
        Intrinsics.checkNotNullParameter(loanPartialRepaymentBehaviourMapper, "loanPartialRepaymentBehaviourMapper");
        this.f233867a = loanPartialRepaymentBehaviourMapper;
    }

    public static ProductSelectionDelegate.Model a() {
        ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model("REDUCE_AMOUNT_REPAYMENT_ITEM_ID", b.a(R$drawable.uikit_icn_24_bar_chart_decreasing), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_healthy_loan_reduce_repayments_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_healthy_loan_reduce_repayments_subtitle, null, null, 14), null, null, null, false, false, false, 1008);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ProductSelectionDelegate.Model b(b95.a aVar) {
        int i;
        int i2;
        int[] iArr = e.f233866c;
        int i3 = iArr[aVar.ordinal()];
        if (i3 == 1) {
            i = R$string.loan_management_repayment_type_picker_payment_type_healthy_mortgage_reduce_term_title;
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.loan_management_repayment_type_picker_payment_type_healthy_loan_reduce_term_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i5 = iArr[aVar.ordinal()];
        if (i5 == 1) {
            i2 = R$string.loan_management_repayment_type_picker_payment_type_healthy_mortgage_reduce_term_subtitle;
        } else {
            if (i5 != 2 && i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.loan_management_repayment_type_picker_payment_type_healthy_loan_reduce_term_subtitle;
        }
        ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model("REDUCE_TERM_REPAYMENT_ITEM_ID", b.a(R$drawable.uikit_icn_24_calendar_date), textLocalisedClause, new TextLocalisedClause(i2, null, null, 14), null, null, null, false, false, false, 1008);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
