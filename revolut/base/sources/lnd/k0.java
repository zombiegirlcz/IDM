package lnd;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzi.b f197185a;

    public k0(mzi.b intervalMapper) {
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        this.f197185a = intervalMapper;
    }

    public static FixedTabsDelegate.Model a(amd.a selected) {
        String str;
        Intrinsics.checkNotNullParameter(selected, "selected");
        List listK = zhm.v.k(new FixedTabs.Item("tab_1w", new TextLocalisedClause(R$string.analytics_timeframe_period_oneWeek, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("tab_1m", new TextLocalisedClause(R$string.analytics_timeframe_period_oneMonth, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("tab_6m", new TextLocalisedClause(R$string.analytics_timeframe_period_sixMonths, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("tab_1y", new TextLocalisedClause(R$string.analytics_timeframe_period_oneYear, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("tab_max", new TextLocalisedClause(R$string.analytics_timeframe_period_max, null, null, 14), (AnalyticsContext) null, 12));
        int i = j0.f197184b[selected.ordinal()];
        if (i == 1) {
            str = "tab_1w";
        } else if (i == 2) {
            str = "tab_1m";
        } else if (i == 3) {
            str = "tab_6m";
        } else if (i == 4) {
            str = "tab_1y";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "tab_max";
        }
        return new FixedTabsDelegate.Model("tabs", listK, str, false, null, SyslogConstants.LOG_CLOCK);
    }

    public static com.revolut.core.ui_kit.views.q b(int i, String str) {
        return new com.revolut.core.ui_kit.views.q(str, new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(i, null, null, 14)), 58);
    }
}
