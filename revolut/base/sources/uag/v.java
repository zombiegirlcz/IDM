package uag;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1c.y;
import m1c.z;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        int i2;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f278637a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            LabelNavBarMenuItem labelNavBarMenuItem = null;
            if (!it8.hasNext()) {
                f fVar = new f(arrayList);
                String str = domainState.f278638b;
                z zVar = (z) domainState.f278639c.getContent();
                if (zVar != null && !(zVar instanceof z.a)) {
                    if (!(zVar instanceof y)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    labelNavBarMenuItem = new LabelNavBarMenuItem("NAV_BAR_ACTION_ID_REV_POINTS", new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), v1.c.g(0, ((y) zVar).f201475a.f201472c, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4), null, null, 504);
                }
                return new p(str, zhm.v.l(labelNavBarMenuItem), fVar);
            }
            TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = (TravelHotelsHomeFlowContract$PagerItem) it8.next();
            int[] iArr = u.f278657a;
            int i3 = iArr[travelHotelsHomeFlowContract$PagerItem.ordinal()];
            if (i3 == 1) {
                i = R$string.hotels_stays_tab_discover_title;
            } else if (i3 == 2) {
                i = R$string.hotels_stays_tab_favourites_title;
            } else if (i3 == 3) {
                i = R$string.hotels_stays_tab_bookings_title;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.hotels_stays_tab_transfers_title;
            }
            int i5 = iArr[travelHotelsHomeFlowContract$PagerItem.ordinal()];
            if (i5 == 1) {
                i2 = R$drawable.uikit_icn_24_resort;
            } else if (i5 == 2) {
                i2 = R$drawable.uikit_icn_24_heart;
            } else if (i5 == 3) {
                i2 = R$drawable.uikit_icn_24_calendar_date;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$drawable.uikit_icn_24_rev_points;
            }
            arrayList.add(new FloatingBottomBarView.Item(travelHotelsHomeFlowContract$PagerItem.getF94249a(), new TextLocalisedClause(i, null, null, 14), new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24));
        }
    }
}
