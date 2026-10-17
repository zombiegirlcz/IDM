package ic6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import jli.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final TextLocalisedClause a(DonationSchedule donationSchedule) {
        Intrinsics.checkNotNullParameter(donationSchedule, "<this>");
        int i = R$string.donations_recurring_schedule_selection_description;
        TextLocalisedClause textLocalisedClauseB = b(donationSchedule.f72098a);
        LocalDate localDate = donationSchedule.f72099b;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return new TextLocalisedClause(i, v.k(textLocalisedClauseB, new TimeClause(jli.b.b(localDate), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)), null, 12);
    }

    public static final TextLocalisedClause b(Period period) {
        Intrinsics.checkNotNullParameter(period, "<this>");
        return new TextLocalisedClause(Intrinsics.f(period, e.f175845h) ? com.revolut.feature.period_chooser.R$string.period_chooser_common_recurring_period_monthly : (Intrinsics.f(period, e.f175843c) || Intrinsics.f(period, e.d)) ? com.revolut.feature.period_chooser.R$string.period_chooser_common_recurring_period_weekly : Intrinsics.f(period, e.f175841a) ? com.revolut.feature.period_chooser.R$string.period_picker_period_daily : R$string.donations_recurring_schedule_selection_period_not_selected, null, null, 14);
    }

    public static final Period c(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = b.f160215a[aVar.ordinal()];
        if (i == 1) {
            return e.f175841a;
        }
        if (i == 2) {
            return e.f175843c;
        }
        if (i == 3) {
            return e.f175845h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
