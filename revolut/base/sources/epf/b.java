package epf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer.core.api.R$string;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import jli.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final CompositeClause a(Clause clause) {
        return new CompositeClause(v.k(new TextLocalisedClause(R$string.transfer_schedule_note_amount_screen_scheduled, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new DotDividerClause(Integer.valueOf(R$attr.uikit_colorGreyTone50)), clause), null, null, null, 14);
    }

    public static final CompositeClause b(TransferScheduleData transferScheduleData, LocalDate todayDate, boolean z) {
        Custom custom;
        Clause textClause;
        Intrinsics.checkNotNullParameter(transferScheduleData, "<this>");
        Intrinsics.checkNotNullParameter(todayDate, "todayDate");
        LocalDateTime localDateTimeAtStartOfDay = todayDate.atStartOfDay();
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "atStartOfDay(...)");
        LocalDateTime localDateTimeB = n1l.b.b(transferScheduleData, localDateTimeAtStartOfDay);
        c cVar = transferScheduleData.f104286b;
        boolean z3 = transferScheduleData.f104285a != 0 && (z || !Intrinsics.f(localDateTimeB.toLocalDate(), todayDate));
        Custom custom2 = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        LocalDate localDate = localDateTimeB.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        Clause clauseC = c(localDate, todayDate, custom2);
        c cVar2 = c.PERIOD_SELECTION_NONE;
        if (cVar == cVar2 && !z3) {
            return null;
        }
        if (cVar == cVar2 && z3) {
            return a(clauseC);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transfer_schedule_note_amount_screen_starting_date, u.c(clauseC), custom2, 8);
        switch (a.f128175a[cVar.ordinal()]) {
            case 1:
                custom = custom2;
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                return a(yoj.b.w(yoj.b.w(textClause, new TextClause(", ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124)), textLocalisedClause));
            case 2:
                textClause = new TextLocalisedClause(R$string.transfer_schedule_note_frequency_daily_uppercased, null, custom2, 10);
                custom = custom2;
                return a(yoj.b.w(yoj.b.w(textClause, new TextClause(", ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124)), textLocalisedClause));
            case 3:
                textClause = new TextLocalisedClause(R$string.transfer_schedule_note_frequency_weekly_uppercased, null, custom2, 10);
                custom = custom2;
                return a(yoj.b.w(yoj.b.w(textClause, new TextClause(", ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124)), textLocalisedClause));
            case 4:
                textClause = new TextLocalisedClause(R$string.transfer_schedule_note_frequency_bi_weekly_uppercased, null, custom2, 10);
                custom = custom2;
                return a(yoj.b.w(yoj.b.w(textClause, new TextClause(", ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124)), textLocalisedClause));
            case 5:
                textClause = new TextLocalisedClause(R$string.transfer_schedule_note_frequency_monthly_uppercased, null, custom2, 10);
                custom = custom2;
                return a(yoj.b.w(yoj.b.w(textClause, new TextClause(", ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124)), textLocalisedClause));
            case 6:
                textClause = new TextLocalisedClause(R$string.transfer_schedule_note_frequency_yearly_uppercased, null, custom2, 10);
                custom = custom2;
                return a(yoj.b.w(yoj.b.w(textClause, new TextClause(", ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124)), textLocalisedClause));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Clause c(LocalDate localDate, LocalDate todayDate, Custom style) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(todayDate, "todayDate");
        Intrinsics.checkNotNullParameter(style, "style");
        return Intrinsics.f(localDate, todayDate) ? new TextLocalisedClause(R$string.transfer_schedule_note_today, null, style, 10) : localDate.getYear() == todayDate.getYear() ? new TimeClause(ebm.a.P(localDate), new TimeClause.Format.DayAndMonth(0), style, null, 8) : new TimeClause(ebm.a.P(localDate), TimeClause.Format.DateLong.f57962b, style, null, 8);
    }

    public static final Clause d(TransferScheduleEndsOn transferScheduleEndsOn) {
        Intrinsics.checkNotNullParameter(transferScheduleEndsOn, "<this>");
        if (transferScheduleEndsOn instanceof TransferScheduleEndsOn.Date) {
            long jP = ebm.a.P(oc.c.I(((TransferScheduleEndsOn.Date) transferScheduleEndsOn).f104288a));
            TimeClause.Format.INSTANCE.getClass();
            return new TimeClause(jP, TimeClause.Format.f57959a, null, null, 12);
        }
        if (Intrinsics.f(transferScheduleEndsOn, TransferScheduleEndsOn.Never.f104289a)) {
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Clause e(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (a.f128175a[cVar.ordinal()]) {
            case 1:
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 2:
                return new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_daily, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_weekly, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_bi_weekly, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_monthly, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_yearly, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
