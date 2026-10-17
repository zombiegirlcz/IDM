package w37;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static Clause a(ds6.a taxPeriod) {
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        switch (a.f294152a[taxPeriod.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_monthly_title, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_bi_monthly_title, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_quarterly_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_four_monthly_title, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_half_yearly_title, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_yearly_title, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_single_installment_title, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.freelancer_tax_profile_assessment_period_two_installments_title, null, null, 14);
            case 9:
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
