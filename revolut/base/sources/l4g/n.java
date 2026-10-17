package l4g;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        int i2;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f192110b;
        List<TravelFlightsHomeFlowContract$PagerItem> list = domainState.f192109a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TravelFlightsHomeFlowContract$PagerItem travelFlightsHomeFlowContract$PagerItem : list) {
            String f103057c = travelFlightsHomeFlowContract$PagerItem.getF103057c();
            int[] iArr = m.f192125a;
            int i3 = iArr[travelFlightsHomeFlowContract$PagerItem.ordinal()];
            if (i3 == 1) {
                i = R$string.travel_flights_tab_bar_discover_title;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.travel_flights_tab_bar_bookings_title;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            int i5 = iArr[travelFlightsHomeFlowContract$PagerItem.ordinal()];
            if (i5 == 1) {
                i2 = R$drawable.uikit_icn_24_airplane_departure;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$drawable.uikit_icn_24_calendar_date;
            }
            arrayList.add(new FloatingBottomBarView.Item(f103057c, textLocalisedClause, new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24));
        }
        return new i(str, arrayList, v.l(domainState.f192111c.getContent()));
    }
}
