package t18;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ry;
import ip0.sy;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import z0h.q1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f267232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ykh.a f267233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AllInsightsScreenContract$InputData f267234c;
    public final q1 d;
    public final q18.i e;

    public u(t groupedInsightsMapper, ykh.a navBarFiltersMapper, AllInsightsScreenContract$InputData inputData, q1 wealthDisclaimerMapper, q18.i navBarMenuItemsMapper) {
        Intrinsics.checkNotNullParameter(groupedInsightsMapper, "groupedInsightsMapper");
        Intrinsics.checkNotNullParameter(navBarFiltersMapper, "navBarFiltersMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        Intrinsics.checkNotNullParameter(navBarMenuItemsMapper, "navBarMenuItemsMapper");
        this.f267232a = groupedInsightsMapper;
        this.f267233b = navBarFiltersMapper;
        this.f267234c = inputData;
        this.d = wealthDisclaimerMapper;
        this.e = navBarMenuItemsMapper;
    }

    public static List a() {
        List listC = zhm.u.c(new FullScreenStateDelegate.Model("watchlist-is-empty-list-id", new TextLocalisedClause(R$string.feed_section_insights_empty_title, null, null, 14), new TextLocalisedClause(R$string.feed_section_insights_empty_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_newspaper, null, null, 6)), new l6(12, new TextLocalisedClause(R$string.feed_section_insights_empty_action_add_to_watchlist, null, null, 14), null, h4.SEMIACCENT), null, false, q18.d.f241404a, null, null, 1760));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new sy(a0.d.n("INSIGHT_LOADING_DELEGATE_ID_", i), ry.DEFAULT, 60));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listA;
        List listA2;
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f267224b;
        if (data == null || (listA = (List) iii.c.f(data, new szb.g(this, 20), new szb.f(9), new sa5.b(this, 23))) == null) {
            listA = a();
        }
        List listB = ((aah.m) this.d).b(domainState.f267225c);
        AllInsightsScreenContract$InputData allInsightsScreenContract$InputData = this.f267234c;
        List listA3 = this.e.a(allInsightsScreenContract$InputData.f76427a instanceof FeedFilter.ByAssetFilter);
        FeedFilter feedFilter = allInsightsScreenContract$InputData.f76427a;
        if (feedFilter instanceof FeedFilter.ByAssetFilter) {
            listA2 = this.f267233b.a(domainState.f267223a);
        } else {
            if (!(feedFilter instanceof FeedFilter.ByRef)) {
                throw new NoWhenBranchMatchedException();
            }
            listA2 = f0.f322471a;
        }
        return new s(d0.E0(listB, listA), listA3, listA2);
    }
}
