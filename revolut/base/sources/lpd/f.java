package lpd;

import com.revolut.feature.spending_analytics.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FRIDAY;
    public static final f MONDAY;
    public static final f SATURDAY;
    public static final f SUNDAY;
    public static final f THURSDAY;
    public static final f TUESDAY;
    public static final f WEDNESDAY;
    private final int resourceId;
    private final int shortResourceId;

    @NotNull
    private final lzi.f weekday;

    static {
        f fVar = new f("MONDAY", 0, lzi.f.MONDAY, R$string.analytics_period_filter_screen_monthly_picker_first_monday_title, R$string.analytics_period_filter_screen_monthly_picker_first_monday_short_title);
        MONDAY = fVar;
        f fVar2 = new f("TUESDAY", 1, lzi.f.TUESDAY, R$string.analytics_period_filter_screen_monthly_picker_first_tuesday_title, R$string.analytics_period_filter_screen_monthly_picker_first_tuesday_short_title);
        TUESDAY = fVar2;
        f fVar3 = new f("WEDNESDAY", 2, lzi.f.WEDNESDAY, R$string.analytics_period_filter_screen_monthly_picker_first_wednesday_title, R$string.analytics_period_filter_screen_monthly_picker_first_wednesday_short_title);
        WEDNESDAY = fVar3;
        f fVar4 = new f("THURSDAY", 3, lzi.f.THURSDAY, R$string.analytics_period_filter_screen_monthly_picker_first_thursday_title, R$string.analytics_period_filter_screen_monthly_picker_first_thursday_short_title);
        THURSDAY = fVar4;
        f fVar5 = new f("FRIDAY", 4, lzi.f.FRIDAY, R$string.analytics_period_filter_screen_monthly_picker_first_friday_title, R$string.analytics_period_filter_screen_monthly_picker_first_friday_short_title);
        FRIDAY = fVar5;
        f fVar6 = new f("SATURDAY", 5, lzi.f.SATURDAY, R$string.analytics_period_filter_screen_monthly_picker_first_saturday_title, R$string.analytics_period_filter_screen_monthly_picker_first_saturday_short_title);
        SATURDAY = fVar6;
        f fVar7 = new f("SUNDAY", 6, lzi.f.SUNDAY, R$string.analytics_period_filter_screen_monthly_picker_first_sunday_title, R$string.analytics_period_filter_screen_monthly_picker_first_sunday_short_title);
        SUNDAY = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public f(String str, int i, lzi.f fVar, int i2, int i3) {
        this.weekday = fVar;
        this.resourceId = i2;
        this.shortResourceId = i3;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @Override // lpd.h
    public final lzi.f a() {
        return this.weekday;
    }

    public final int b() {
        return this.resourceId;
    }
}
