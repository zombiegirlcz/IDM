package ngg;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n87.r;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        FloatingBottomBarView.Item item;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f215148a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str = ((TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem) it8.next()).f94249a;
            int iHashCode = str.hashCode();
            if (iHashCode != 737101391) {
                if (iHashCode != 1170482849) {
                    if (iHashCode != 1432165819 || !str.equals("TAB_AIRLINES_HOME_ID")) {
                        throw new IllegalArgumentException("Unsupported tab item id: ".concat(str));
                    }
                    item = new FloatingBottomBarView.Item(str, new TextLocalisedClause(R$string.miles_airlines_tab, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
                } else {
                    if (!str.equals("TAB_AIRLINES_MAIN_ID")) {
                        throw new IllegalArgumentException("Unsupported tab item id: ".concat(str));
                    }
                    item = new FloatingBottomBarView.Item(str, new TextLocalisedClause(R$string.miles_airlines_tab, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
                }
                arrayList.add(item);
            } else {
                if (!str.equals("TAB_FLIGHT_FINDER_ID")) {
                    throw new IllegalArgumentException("Unsupported tab item id: ".concat(str));
                }
                item = new FloatingBottomBarView.Item(str, new TextLocalisedClause(R$string.miles_flight_finder_tab, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
                arrayList.add(item);
            }
        }
        return new l(new j(arrayList), domainState.f215149b, (List) iii.c.f(domainState.f215150c, new nd8.i(20), new r(26), new mig.a(29)));
    }
}
