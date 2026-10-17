package g65;

import android.os.Parcelable;
import c55.n0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m35.r;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f140881a;

    public j(r loanUiContentMapper) {
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        this.f140881a = loanUiContentMapper;
    }

    public final ArrayList a(List list, List list2) {
        int i;
        ArrayList<Loan> arrayList = new ArrayList();
        for (Object obj2 : list) {
            Loan loan = (Loan) obj2;
            if (!(loan.i instanceof LoanState.Repaid) && list2.contains(loan.o)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Loan loan2 : arrayList) {
            String strQ = j6.a.q("loan_", loan2.f70108a);
            b95.a aVar = loan2.o;
            n0 n0Var = (n0) this.f140881a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(n0Var.h(aVar), n0Var.a(loan2), null, false, null, false, 60);
            Clause clauseC = n0Var.c(loan2);
            TextLocalisedClause textLocalisedClauseI = n0Var.i(loan2);
            LoanState loanState = loan2.i;
            if ((loanState instanceof LoanState.Outstanding) || (loanState instanceof LoanState.Cancelled) || (loanState instanceof LoanState.Overdue) || (loanState instanceof LoanState.Terminated)) {
                i = R$attr.uikit_colorRed;
            } else {
                if (!(loanState instanceof LoanState.Forbearance) && !(loanState instanceof LoanState.Healthy) && !Intrinsics.f(loanState, LoanState.Planned.f70196a) && !(loanState instanceof LoanState.Repaid)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorGreyTone50;
            }
            arrayList2.add(new RowDelegate.Model(strQ, image40, clauseC, null, 0, sx4.g.f(textLocalisedClauseI, new Custom(Integer.valueOf(i), false, null, false, null, 254)), null, null, 0, new RowDelegate.Model.c.b(n0Var.b(loan2, true), null, null, false, 126), false, null, false, null, null, null, null, null, null, loan2, null, 0, 0, 0, 0, 532675544));
        }
        return arrayList2;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_cancellation_choose_loan, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_cancellation_choose_loan_to_cancel, null, null, 14);
        List list = domainState.f140876a;
        aim.e eVarB = u.b();
        ArrayList arrayListA = a(list, v.k(b95.a.REFINANCING_LOAN, b95.a.PERSONAL_LOAN));
        if (!arrayListA.isEmpty()) {
            eVarB.addAll(yp0.b.g(arrayListA, new ListSubheaderDelegate.Model("LOANS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.loan_management_selection_section_loans, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        ArrayList arrayListA2 = a(list, u.c(b95.a.MORTGAGE_LOAN));
        if (!arrayListA2.isEmpty()) {
            eVarB.addAll(yp0.b.g(arrayListA2, new ListSubheaderDelegate.Model("MORTGAGES_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.loan_management_selection_section_mortgages, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        return new h(u.a(eVarB), textLocalisedClause, textLocalisedClause2);
    }
}
