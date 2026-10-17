package v9h;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f287069a;

    public c(jbh.e performanceAssetMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        this.f287069a = performanceAssetMapper;
    }

    public static List a() {
        return v.k(new FixedTabs.Item("POPULAR_FIRST_BUY_WIDGET_STOCKS_TAB_ID", new TextLocalisedClause(R$string.wealth_trading_home_widget_popular_first_buy_stocks, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("POPULAR_FIRST_BUY_ETFS_WIDGET_TAB_ID", new TextLocalisedClause(R$string.wealth_trading_home_widget_popular_first_buy_etfs, null, null, 14), (AnalyticsContext) null, 12));
    }
}
