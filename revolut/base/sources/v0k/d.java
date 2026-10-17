package v0k;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.marketnews.api.delegate.WealthTopStoriesContract$TopStoriesOverviewParcel;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ry;
import ip0.sy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import qv0.i;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements qzj.d {
    public d(jbh.f relativeTimeClauseBuilder) {
        Intrinsics.checkNotNullParameter(relativeTimeClauseBuilder, "relativeTimeClauseBuilder");
    }

    public static void a(rzj.g gVar) {
        if (c.f284918b[gVar.ordinal()] != 4) {
            return;
        }
        throw new IllegalStateException(("Doesn't supports news asset type: " + gVar).toString());
    }

    public static ListSubheaderDelegate.Model b(qzj.a aVar) {
        int i;
        Integer numValueOf;
        int i2;
        WealthNewsCategory wealthNewsCategory = aVar.f250661a;
        qzj.c cVar = aVar.f250662b;
        if ((wealthNewsCategory instanceof WealthNewsCategory.Markets ? (WealthNewsCategory.Markets) wealthNewsCategory : null) != null) {
            numValueOf = Integer.valueOf(R$string.wealth_invest_market_news_title);
        } else {
            int i3 = c.f284918b[wealthNewsCategory.f101803a.ordinal()];
            if (i3 == 1) {
                int i5 = c.f284917a[cVar.ordinal()];
                if (i5 == 1) {
                    i = R$string.wealth_news_widget_news_for_you;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_news_title;
                }
                numValueOf = Integer.valueOf(i);
            } else if (i3 == 2) {
                numValueOf = Integer.valueOf(com.revolut.retail.feature.marketnews.impl.R$string.crypto_home_widget_news_header_topStories);
            } else if (i3 == 3) {
                int i6 = c.f284917a[cVar.ordinal()];
                if (i6 == 1) {
                    i2 = com.revolut.retail.feature.marketnews.impl.R$string.commodities_home_widget_news_header_topStories;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = com.revolut.retail.feature.marketnews.impl.R$string.trading_commodity_asset_details_news_header;
                }
                numValueOf = Integer.valueOf(i2);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "WealthTopStoriesMapper", "News with asset type " + wealthNewsCategory.f101803a + " shouldn't be mapped", null, null, 16);
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            return new ListSubheaderDelegate.Model("WEALTH_TOP_STORIES_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(numValueOf.intValue(), null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.wealth_view_all, null, null, 14), true, (Object) new WealthTopStoriesContract$TopStoriesOverviewParcel(wealthNewsCategory, false), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259874);
        }
        return null;
    }

    public static List c(qzj.a aVar) {
        a(aVar.f250661a.f101803a);
        ListSubheaderDelegate.Model modelB = b(aVar);
        IntRange intRange = new IntRange(0, 5, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            sy syVar = new sy(a0.d.n("WEALTH_TOP_STORY_LOADING_ID_", it8.nextInt()), ry.COMPACT, 60);
            yp0.b.l(syVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(syVar);
        }
        NewsDelegate.INSTANCE.getClass();
        i[] elements = {modelB, new hg("WEALTH_TOP_STORIES_SCROLLER_ID", arrayList, 2, NewsDelegate.f52830h, null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
