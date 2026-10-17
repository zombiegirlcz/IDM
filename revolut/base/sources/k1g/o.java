package k1g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        FloatingBottomBarView.Item item;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<TravelExperiencesTabsFlowContract$PagerItem> list = domainState.f180244a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TravelExperiencesTabsFlowContract$PagerItem travelExperiencesTabsFlowContract$PagerItem : list) {
            if (travelExperiencesTabsFlowContract$PagerItem instanceof TravelExperiencesTabsFlowContract$PagerItem.Discover) {
                item = new FloatingBottomBarView.Item(travelExperiencesTabsFlowContract$PagerItem.getF94249a(), new TextLocalisedClause(R$string.experiences_tab_discover_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_voucher, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
            } else {
                if (!(travelExperiencesTabsFlowContract$PagerItem instanceof TravelExperiencesTabsFlowContract$PagerItem.Bookings)) {
                    throw new NoWhenBranchMatchedException();
                }
                item = new FloatingBottomBarView.Item(travelExperiencesTabsFlowContract$PagerItem.getF94249a(), new TextLocalisedClause(R$string.experiences_tab_bookings_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
            }
            arrayList.add(item);
        }
        return new l(new j(arrayList), domainState.f180245b, (List) iii.c.f(domainState.f180246c, new n(0), new k1f.n(1), new jb8.b(26)));
    }
}
