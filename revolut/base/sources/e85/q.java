package e85;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class q {
    public static CompositeClause a(LoanDetails loanDetails, TextLocalisedClause textLocalisedClause) {
        int i = R$string.loan_management_repayment_v2_amount_disclaimer_see_repayment_details;
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        return new CompositeClause(v.k(textLocalisedClause, new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) new k(loanDetails), "SEE_REPAYMENT_DETAILS", false), 10)), new DotDividerClause((Integer) null), null, null, 12);
    }
}
