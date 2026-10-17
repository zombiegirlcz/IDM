package g6j;

import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f140976b;

    public /* synthetic */ t(DateTime dateTime, int i) {
        this.f140975a = i;
        this.f140976b = dateTime;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f140975a;
        DateTime dateTime = this.f140976b;
        switch (i) {
            case 0:
                Pair it8 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Integer.valueOf(Long.signum(((Number) it8.f186385a).longValue() - dateTime.getMillis()));
            case 1:
                mpd.a update = (mpd.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LocalDate localDate = dateTime.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                return mpd.a.a(update, jli.b.e(localDate), null, null, false, null, 126);
            case 2:
                Pair it9 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Integer.valueOf(Long.signum(((Number) it9.f186385a).longValue() - dateTime.getMillis()));
            case 3:
                DateTime day = (DateTime) obj2;
                CalendarPickerRangeView.Companion companion = CalendarPickerRangeView.INSTANCE;
                Intrinsics.checkNotNullParameter(day, "day");
                DateTime dateTimePlusMonths = day.plusMonths(1);
                if (dateTimePlusMonths.compareTo((ReadableInstant) dateTime) <= 0) {
                    return dateTimePlusMonths;
                }
                return null;
            default:
                DateTime day2 = (DateTime) obj2;
                CalendarPickerRangeView.Companion companion2 = CalendarPickerRangeView.INSTANCE;
                Intrinsics.checkNotNullParameter(day2, "day");
                DateTime dateTimePlusDays = day2.plusDays(1);
                if (dateTimePlusDays.compareTo((ReadableInstant) dateTime) <= 0) {
                    return dateTimePlusDays;
                }
                return null;
        }
    }
}
