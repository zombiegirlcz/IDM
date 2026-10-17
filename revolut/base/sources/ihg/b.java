package ihg;

import aw0.c7;
import aw0.g6;
import aw0.h6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import ghg.g;
import ghg.m;
import ieg.y;
import ip0.vr;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xgg.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f161404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f161405b;

    public b(d topDestinationsMapper, a searchInputMapper, e travelMilesAirlineRedeemOptionsMapper) {
        Intrinsics.checkNotNullParameter(topDestinationsMapper, "topDestinationsMapper");
        Intrinsics.checkNotNullParameter(searchInputMapper, "searchInputMapper");
        Intrinsics.checkNotNullParameter(travelMilesAirlineRedeemOptionsMapper, "travelMilesAirlineRedeemOptionsMapper");
        this.f161404a = topDestinationsMapper;
        this.f161405b = travelMilesAirlineRedeemOptionsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        String f94143a;
        String f94143a2;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        TravelMilesSearchLocation travelMilesSearchLocation = domainState.e;
        TravelMilesSearchLocation travelMilesSearchLocation2 = domainState.d;
        LocalDate date = domainState.f143908a.a();
        Intrinsics.checkNotNullParameter(date, "date");
        vr vrVar = new vr("SEARCH_INPUT_LIST_ITEM_ID", new h6((travelMilesSearchLocation == null || (f94143a2 = travelMilesSearchLocation.getF94143a()) == null) ? null : new TextClause(f94143a2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (travelMilesSearchLocation2 == null || (f94143a = travelMilesSearchLocation2.getF94143a()) == null) ? null : new TextClause(f94143a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.core.ui_kit.models.j.b(c7.Companion, date, new LocalDateClause$DateFormat.DateMedium(n0.HIDE_CURRENT_YEAR)), new CompositeClause(v.k(new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.uikit_travel_flight_search_one_way_label, null, null, 14)), null, null, null, 14), g6.RIGHT));
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("SEARCH_CTA_LIST_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_tab_flight_finder_search_cta, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        eVarB.addAll(v.k(vrVar, model));
        eVarB.addAll(this.f161404a.b(domainState.f143909b, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_top_destinations_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10)));
        eVarB.addAll((List) iii.c.f(domainState.f143910c, new i9e.a(this, 29), new y(18), new igh.o(this, 4)));
        return new m(u.a(eVarB));
    }
}
