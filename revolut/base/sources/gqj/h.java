package gqj;

import aw0.ka;
import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements mzi.b {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeClause.Format.Month f145757b = new TimeClause.Format.Month(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeClause.Format.Month f145758c;
    public static final TimeClause.Format.MonthAndYear d;
    public static final TimeClause.Format.DayAndMonth e;
    public static final TimeClause.Format.Year f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f145759a;

    static {
        ka kaVar = ka.SHORT;
        f145758c = new TimeClause.Format.Month(kaVar);
        d = new TimeClause.Format.MonthAndYear((ka) null, 3);
        e = new TimeClause.Format.DayAndMonth(kaVar);
        f = new TimeClause.Format.Year(0);
    }

    public h(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f145759a = dateProvider;
    }

    public static boolean b(Interval interval) {
        return interval.getStart().getMonthOfYear() == interval.getEnd().getMonthOfYear() && interval.getStart().getDayOfMonth() == 1 && interval.getEnd().getDayOfMonth() == interval.getEnd().dayOfMonth().getMaximumValue();
    }
}
