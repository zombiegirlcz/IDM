package ugb;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.salary_account.impl.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        ugb.a domainState = (ugb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.salary_account_income_insurance_claim_title, null, null, 14), new TextLocalisedClause(R$string.salary_account_income_insurance_claim_subtitle, null, null, 14), null, null, false, 28);
        EnumEntries<b> enumEntriesA = b.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (b bVar : enumEntriesA) {
            Set set = domainState.f279990a;
            String strQ = j6.a.q("ELIGIBILITY_CRITERION_", bVar.name());
            String strQ2 = j6.a.q("ELIGIBILITY_CRITERION_ROW_", bVar.name());
            switch (h.f279996a[bVar.ordinal()]) {
                case 1:
                    i = R$string.salary_account_income_insurance_claim_criterion_tax_residency;
                    break;
                case 2:
                    i = R$string.salary_account_income_insurance_claim_criterion_employment_contract;
                    break;
                case 3:
                    i = R$string.salary_account_income_insurance_claim_criterion_self_employment;
                    break;
                case 4:
                    i = R$string.salary_account_income_insurance_claim_criterion_fit_for_work;
                    break;
                case 5:
                    i = R$string.salary_account_income_insurance_claim_criterion_data_sharing;
                    break;
                case 6:
                    i = R$string.salary_account_income_insurance_claim_criterion_other_income_insurance;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, null, new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532676602), set.contains(bVar) ? qd0.SELECTED : qd0.UNSELECTED, SelectableDelegate.b.C0424b.f53319a, vd0.CHECKBOX, false, null, null, null, false, 32736));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.salary_account_income_insurance_claim_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, domainState.f279990a.size() == b.a().size(), null, null, null, 988), null, null, 55), arrayList, aVar);
    }
}
