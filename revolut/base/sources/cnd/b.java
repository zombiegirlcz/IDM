package cnd;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.List;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements cmd.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f25405a = v.k(new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_monday_short, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_tuesday_short, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_wednesday_short, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_thursday_short, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_friday_short, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_saturday_short, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_sunday_short, null, null, 14));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f25406b = v.k(new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_monday, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_tuesday, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_wednesday, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_thursday, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_friday, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_saturday, null, null, 14), new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_sunday, null, null, 14));

    public static final class a {
        private a() {
        }
    }

    public final Clause a(int i) {
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) d0.e0(f.h(i, new IntRange(1, 7, 1)) - 1, f25406b);
        if (textLocalisedClause != null) {
            return textLocalisedClause;
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
