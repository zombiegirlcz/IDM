package d57;

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
public final class c {
    public static Clause a(fs6.b assessmentPeriod) {
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        switch (b.f111394a[assessmentPeriod.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.freelancer_vat_reminder_assessment_period_monthly_title, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.freelancer_vat_reminder_assessment_period_bi_monthly_title, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.freelancer_vat_reminder_assessment_period_quarterly_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.freelancer_vat_reminder_assessment_period_half_yearly_title, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.freelancer_vat_reminder_assessment_period_yearly_title, null, null, 14);
            case 6:
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
