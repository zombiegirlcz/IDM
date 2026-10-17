package zpf;

import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.transfer.core.api.R$string;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f324295a;

    public e(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f324295a = dateProvider;
    }

    public static TextLocalisedClause a(jli.c cVar) {
        switch (d.f324294a[cVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_never, null, null, 14);
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

    public static Clause c(TransferScheduleEndsOn transferScheduleEndsOn) {
        if (Intrinsics.f(transferScheduleEndsOn, TransferScheduleEndsOn.Never.f104289a)) {
            return new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_never, null, null, 14);
        }
        if (transferScheduleEndsOn instanceof TransferScheduleEndsOn.Date) {
            return new TimeClause(ebm.a.P(oc.c.I(((TransferScheduleEndsOn.Date) transferScheduleEndsOn).f104288a)), TimeClause.Format.DateLong.f57962b, null, null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List b(LocalDateTime date, LocalDate minAvailableDate, LocalDate localDate, String listId) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
        Intrinsics.checkNotNullParameter(listId, "listId");
        LocalDate localDate2 = date.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
        List listC = u.c(new g5(listId, localDate2, date.toLocalDate(), true, null, minAvailableDate, localDate, null, null, date, 0, 0, 1015600));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
