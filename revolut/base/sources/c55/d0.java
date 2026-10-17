package c55;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import d9.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 {
    public static Clause a(LoanBorrower borrower) {
        Intrinsics.checkNotNullParameter(borrower, "borrower");
        return kotlin.text.d0.W(borrower.b()) ? new TextLocalisedClause(R$string.loan_management_details_borrower_co_borrower, null, null, 14) : new TextClause(borrower.b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextLocalisedClause b(LoanBorrower borrower) {
        Intrinsics.checkNotNullParameter(borrower, "borrower");
        return new TextLocalisedClause(R$string.loan_management_details_repayment_methods_rev_account_template, zhm.u.c(new CurrencyClause(borrower.e.e, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
    }

    public static ArrayList c(List borrowers) {
        TextLocalisedClause textLocalisedClauseB;
        Intrinsics.checkNotNullParameter(borrowers, "borrowers");
        List<LoanBorrower> list = borrowers;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (LoanBorrower loanBorrower : list) {
            TextLocalisedClause textLocalisedClauseB2 = null;
            if (t0.i(borrowers)) {
                textLocalisedClauseB = loanBorrower.f70139b == 0 ? new TextLocalisedClause(R$string.loan_management_details_repayment_methods_account_priority_primary, null, null, 14) : new TextLocalisedClause(R$string.loan_management_details_repayment_methods_account_priority_secondary, null, null, 14);
                textLocalisedClauseB2 = b(loanBorrower);
            } else {
                textLocalisedClauseB = b(loanBorrower);
            }
            arrayList.add(new RowDelegate.Model(j6.a.q("ID_BORROWER_", loanBorrower.f70138a), new RowDelegate.Model.MainImage.Image40(new ContactImage(loanBorrower.f70138a, (String) null, (String) null, (String) null, (String) null, loanBorrower.b(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), RetailBadge.f58066a, null, false, null, false, 60), a(loanBorrower), null, 0, textLocalisedClauseB, textLocalisedClauseB2, null, 0, null, false, null, false, null, null, null, null, null, null, loanBorrower, null, 0, 0, 0, 0, 532674456));
        }
        return arrayList;
    }
}
