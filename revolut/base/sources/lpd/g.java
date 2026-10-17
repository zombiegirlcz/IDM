package lpd;

import com.revolut.feature.spending_analytics.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g FRIDAY;
    public static final g MONDAY;
    public static final g SATURDAY;
    public static final g SUNDAY;
    public static final g THURSDAY;
    public static final g TUESDAY;
    public static final g WEDNESDAY;
    private final int resourceId;
    private final int shortResourceId;

    @NotNull
    private final lzi.f weekday;

    static {
        g gVar = new g("MONDAY", 0, lzi.f.MONDAY, R$string.analytics_period_filter_screen_monthly_picker_last_monday_title, R$string.analytics_period_filter_screen_monthly_picker_last_monday_short_title);
        MONDAY = gVar;
        g gVar2 = new g("TUESDAY", 1, lzi.f.TUESDAY, R$string.analytics_period_filter_screen_monthly_picker_last_tuesday_title, R$string.analytics_period_filter_screen_monthly_picker_last_tuesday_short_title);
        TUESDAY = gVar2;
        g gVar3 = new g("WEDNESDAY", 2, lzi.f.WEDNESDAY, R$string.analytics_period_filter_screen_monthly_picker_last_wednesday_title, R$string.analytics_period_filter_screen_monthly_picker_last_wednesday_short_title);
        WEDNESDAY = gVar3;
        g gVar4 = new g("THURSDAY", 3, lzi.f.THURSDAY, R$string.analytics_period_filter_screen_monthly_picker_last_thursday_title, R$string.analytics_period_filter_screen_monthly_picker_last_thursday_short_title);
        THURSDAY = gVar4;
        g gVar5 = new g("FRIDAY", 4, lzi.f.FRIDAY, R$string.analytics_period_filter_screen_monthly_picker_last_friday_title, R$string.analytics_period_filter_screen_monthly_picker_last_friday_short_title);
        FRIDAY = gVar5;
        g gVar6 = new g("SATURDAY", 5, lzi.f.SATURDAY, R$string.analytics_period_filter_screen_monthly_picker_last_saturday_title, R$string.analytics_period_filter_screen_monthly_picker_last_saturday_short_title);
        SATURDAY = gVar6;
        g gVar7 = new g("SUNDAY", 6, lzi.f.SUNDAY, R$string.analytics_period_filter_screen_monthly_picker_last_sunday_title, R$string.analytics_period_filter_screen_monthly_picker_last_sunday_short_title);
        SUNDAY = gVar7;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public g(String str, int i, lzi.f fVar, int i2, int i3) {
        this.weekday = fVar;
        this.resourceId = i2;
        this.shortResourceId = i3;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @Override // lpd.h
    public final lzi.f a() {
        return this.weekday;
    }

    public final int b() {
        return this.resourceId;
    }
}
