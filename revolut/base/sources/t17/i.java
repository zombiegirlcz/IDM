package t17;

import androidx.room.RoomDatabase;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f267201a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f267201a = dateProvider;
    }

    public final Pair a(FilteringDateRange dateRange) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        LocalDateTime localDateTime = ((l80.f) this.f267201a).g().toLocalDateTime();
        if (dateRange instanceof FilteringDateRange.Custom) {
            FilteringDateRange.Custom custom = (FilteringDateRange.Custom) dateRange;
            LocalDate localDate = custom.f73463b;
            LocalDate localDate2 = custom.f73462a;
            return new Pair(new LocalDateTime(localDate2.getYear(), localDate2.getMonthValue(), localDate2.getDayOfMonth(), 0, 0, 0, 0), new LocalDateTime(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 23, 59, 59, RoomDatabase.MAX_BIND_PARAMETER_CNT));
        }
        if (Intrinsics.f(dateRange, FilteringDateRange.Today.f73467a)) {
            return new Pair(localDateTime.withTime(0, 0, 0, 0), localDateTime.withTime(23, 59, 59, RoomDatabase.MAX_BIND_PARAMETER_CNT));
        }
        if (Intrinsics.f(dateRange, FilteringDateRange.ThisWeek.f73466a)) {
            return new Pair(localDateTime.dayOfWeek().withMinimumValue().withTime(0, 0, 0, 0), localDateTime.dayOfWeek().withMaximumValue().withTime(23, 59, 59, RoomDatabase.MAX_BIND_PARAMETER_CNT));
        }
        if (Intrinsics.f(dateRange, FilteringDateRange.ThisMonth.f73464a)) {
            return new Pair(localDateTime.dayOfMonth().withMinimumValue().withTime(0, 0, 0, 0), localDateTime.dayOfMonth().withMaximumValue().withTime(23, 59, 59, RoomDatabase.MAX_BIND_PARAMETER_CNT));
        }
        if (!Intrinsics.f(dateRange, FilteringDateRange.ThisQuarter.f73465a)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.h(localDateTime);
        LocalDateTime localDateTimeWithMonthOfYear = localDateTime.withDayOfMonth(1).withMonthOfYear((((localDateTime.getMonthOfYear() - 1) / 3) * 3) + 1);
        Intrinsics.checkNotNullExpressionValue(localDateTimeWithMonthOfYear, "withMonthOfYear(...)");
        LocalDateTime localDateTimeWithTime = localDateTimeWithMonthOfYear.withTime(0, 0, 0, 0);
        LocalDateTime localDateTimeWithMonthOfYear2 = localDateTime.withDayOfMonth(1).withMonthOfYear((((localDateTime.getMonthOfYear() - 1) / 3) * 3) + 1);
        Intrinsics.checkNotNullExpressionValue(localDateTimeWithMonthOfYear2, "withMonthOfYear(...)");
        LocalDateTime localDateTimeMinusDays = localDateTimeWithMonthOfYear2.plusMonths(3).minusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDateTimeMinusDays, "minusDays(...)");
        return new Pair(localDateTimeWithTime, localDateTimeMinusDays.withTime(23, 59, 59, RoomDatabase.MAX_BIND_PARAMETER_CNT));
    }
}
