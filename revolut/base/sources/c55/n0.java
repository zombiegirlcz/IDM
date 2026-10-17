package c55;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 implements m35.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21453a;

    public n0(r loanLateDisbursalItemFactory) {
        Intrinsics.checkNotNullParameter(loanLateDisbursalItemFactory, "loanLateDisbursalItemFactory");
        this.f21453a = loanLateDisbursalItemFactory;
    }

    public static Clause e(String str, b95.a aVar) {
        int i;
        int i2 = m0.f21451a[aVar.ordinal()];
        if (i2 == 1) {
            i = R$string.loan_management_details_personal_loan;
        } else if (i2 == 2) {
            i = R$string.credit_loan_account_product_name_refinancing_loan;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.credit_loan_account_product_name_mortgage;
        }
        if (str != null) {
            String str2 = !kotlin.text.d0.W(str) ? str : null;
            if (str2 != null) {
                return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static TextLocalisedClause f(b95.a aVar) {
        int i = m0.f21451a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            return new TextLocalisedClause(R$string.credit_switcher_loan_signifier_healthy, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.loan_management_details_loan_balance, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CircleIconBadge a(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        LoanState loanState = loan.i;
        if ((loanState instanceof LoanState.Forbearance) || (loanState instanceof LoanState.Repaid) || (loanState instanceof LoanState.Healthy)) {
            return null;
        }
        if (loanState instanceof LoanState.Outstanding) {
            return new WarningCircleBadge(dw0.a.Suspicious);
        }
        if ((loanState instanceof LoanState.Overdue) || (loanState instanceof LoanState.Terminated) || (loanState instanceof LoanState.Cancelled)) {
            return new DangerCircleBadge(dw0.a.Suspicious);
        }
        if (loanState instanceof LoanState.Planned) {
            return new InactiveCircleBadge(dw0.a.Awaiting);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.MoneyClause b(com.revolut.feature.credit.loan.api.models.rev10.Loan r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "loan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.feature.credit.loan.api.models.rev10.LoanState r0 = r12.i
            dj0.d r1 = r12.f70110c
            boolean r0 = r0 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Repaid
            r2 = 0
            if (r0 == 0) goto L24
            if (r13 == 0) goto L22
            com.revolut.core.ui_kit.models.Custom r3 = new com.revolut.core.ui_kit.models.Custom
            int r13 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorGrey50_60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r9 = 254(0xfe, float:3.56E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L38
        L22:
            r3 = r2
            goto L38
        L24:
            if (r13 == 0) goto L22
            com.revolut.core.ui_kit.models.Custom r4 = new com.revolut.core.ui_kit.models.Custom
            int r13 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorForeground
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r9 = 0
            r10 = 254(0xfe, float:3.56E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = r4
        L38:
            com.revolut.feature.credit.loan.api.models.rev10.LoanState r13 = r12.i
            boolean r0 = r13 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Planned
            if (r0 == 0) goto L41
            dj0.d r1 = r12.f70113j
            goto L50
        L41:
            boolean r13 = r13 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Repaid
            if (r13 == 0) goto L46
            goto L50
        L46:
            b95.a r13 = r12.o
            b95.a r0 = b95.a.MORTGAGE_LOAN
            if (r13 != r0) goto L50
            dj0.d r1 = r12.n1()
        L50:
            r12 = 1
            com.revolut.core.ui_kit.models.MoneyClause r12 = sx4.f.b(r12, r3, r2, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c55.n0.b(com.revolut.feature.credit.loan.api.models.rev10.Loan, boolean):com.revolut.core.ui_kit.models.MoneyClause");
    }

    public final Clause c(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        return e(loan.f70109b, loan.o);
    }

    public final Clause d(LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Loan loan = loanDetails.f70144a;
        return e(loan.f70109b, loan.o);
    }

    public final TextLocalisedClause g(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        LoanState loanState = loan.i;
        b95.a aVar = loan.o;
        if ((loanState instanceof LoanState.Forbearance) || (loanState instanceof LoanState.Healthy) || (loanState instanceof LoanState.Outstanding) || (loanState instanceof LoanState.Overdue) || (loanState instanceof LoanState.Cancelled)) {
            return f(aVar);
        }
        if (loanState instanceof LoanState.Repaid) {
            return new TextLocalisedClause(R$string.credit_switcher_loan_signifier_repaid, null, null, 14);
        }
        if (loanState instanceof LoanState.Terminated) {
            LoanState.Terminated terminated = (LoanState.Terminated) loanState;
            Intrinsics.checkNotNullParameter(terminated, "<this>");
            return terminated.d != null ? new TextLocalisedClause(R$string.post_termination_plan_section_amount_due_title, null, null, 14) : f(aVar);
        }
        if (loanState instanceof LoanState.Planned) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LayeredImage h(b95.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        int i = m0.f21451a[product.ordinal()];
        if (i == 1 || i == 2) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
        }
        if (i == 3) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_mortgage, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause i(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        LoanState loanState = loan.i;
        if ((loanState instanceof LoanState.Forbearance) || (loanState instanceof LoanState.Repaid) || (loanState instanceof LoanState.Healthy)) {
            return new TextLocalisedClause(R$string.credit_widget_loan_borrowed, zhm.u.c(sx4.f.b(3, null, null, loan.f70113j)), null, 12);
        }
        if (loanState instanceof LoanState.Outstanding) {
            return new TextLocalisedClause(R$string.loan_management_details_repayment_due, null, null, 14);
        }
        if (loanState instanceof LoanState.Overdue) {
            return new TextLocalisedClause(R$string.loan_management_details_overdue_balance, null, null, 14);
        }
        if (loanState instanceof LoanState.Terminated) {
            wi0.b bVar = loan.f70112h;
            wi0.b.Companion.getClass();
            return Intrinsics.f(bVar, wi0.b.f297756l) ? new TextLocalisedClause(R$string.loan_management_widget_terminated_subtitle_au, null, null, 14) : new TextLocalisedClause(R$string.loan_management_details_terminated, null, null, 14);
        }
        if (loanState instanceof LoanState.Cancelled) {
            return new TextLocalisedClause(R$string.loan_management_cancelled, null, null, 14);
        }
        if (loanState instanceof LoanState.Planned) {
            return this.f21453a.a(com.revolut.feature.credit.loan.api.models.rev10.e.a(loan));
        }
        throw new NoWhenBranchMatchedException();
    }
}
