package yr5;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.retail.feature.crypto.asset_details_chart_mapping.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f316152a = v.k(qta.f.DAY, qta.f.WEEK, qta.f.MONTH, qta.f.SIX_MONTH, qta.f.YEAR, qta.f.FIVE_YEARS, qta.f.ALL);

    public static final FixedTabsDelegate.Model a(qta.f selectedChartPeriod) {
        int i;
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        List<qta.f> list = f316152a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (qta.f fVar : list) {
            String strName = fVar.name();
            switch (r.f316151a[fVar.ordinal()]) {
                case 1:
                    i = R$string.crypto_asset_details_chart_mapping_tab_1d;
                    break;
                case 2:
                    i = R$string.crypto_asset_details_chart_mapping_tab_1w;
                    break;
                case 3:
                    i = R$string.crypto_asset_details_chart_mapping_tab_1m;
                    break;
                case 4:
                    i = R$string.crypto_asset_details_chart_mapping_tab_3m;
                    break;
                case 5:
                    i = R$string.crypto_asset_details_chart_mapping_tab_6m;
                    break;
                case 6:
                    i = R$string.crypto_asset_details_chart_mapping_tab_1y;
                    break;
                case 7:
                    i = R$string.crypto_asset_details_chart_mapping_tab_5y;
                    break;
                case 8:
                    i = R$string.crypto_asset_details_chart_mapping_tab_all;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new FixedTabs.Item(strName, new TextLocalisedClause(i, null, null, 14), (AnalyticsContext) null, 12));
        }
        return new FixedTabsDelegate.Model("crypto_price_chart_widget_tabs", arrayList, selectedChartPeriod.name(), false, null, SyslogConstants.LOG_CLOCK);
    }
}
