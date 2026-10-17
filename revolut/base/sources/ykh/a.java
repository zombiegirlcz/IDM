package ykh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mx0.d;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ActionsView.Item b(d dVar) {
        return new ActionsView.Item("portfolio_filter_tag", dVar, false, null, null, new TextLocalisedClause(R$string.invest_smart_notifications_feed_home_tags_portfolio, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_invest, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, tdh.a.PORTFOLIO, null, 24476);
    }

    public static ActionsView.Item c(d dVar) {
        return new ActionsView.Item("watchlist_filter_tag", dVar, false, null, null, new TextLocalisedClause(R$string.invest_smart_notifications_feed_home_tags_watchlist, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_star_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, tdh.a.WATCHLIST, null, 24476);
    }

    public final List a(Set selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return v.k(b(selectedFilters.contains(tdh.a.PORTFOLIO) ? d.ACCENT : d.SEMIBLACK), c(selectedFilters.contains(tdh.a.WATCHLIST) ? d.ACCENT : d.SEMIBLACK));
    }
}
