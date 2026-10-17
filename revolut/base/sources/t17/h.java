package t17;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.R$string;
import ip0.z;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public h(e chipsItemsProvider) {
        Intrinsics.checkNotNullParameter(chipsItemsProvider, "chipsItemsProvider");
    }

    public static ListSubheaderDelegate.Model a(String headerId, FilteringDateRange filteringDateRange) {
        Intrinsics.checkNotNullParameter(headerId, "headerId");
        return new ListSubheaderDelegate.Model(headerId, (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (filteringDateRange != null ? new TextLocalisedClause(R$string.freelancer_common_action_reset, null, null, 14) : null), filteringDateRange != null, (Object) Boolean.valueOf(filteringDateRange != null), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
    }

    public final z b(String groupId, AbstractList allDateRanges, l lVar) {
        List listC;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(allDateRanges, "allDateRanges");
        if (lVar == null || (listC = u.c(lVar)) == null) {
            listC = f0.f322471a;
        }
        return e.a(groupId, allDateRanges, listC);
    }
}
