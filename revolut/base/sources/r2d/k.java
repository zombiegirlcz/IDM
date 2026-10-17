package r2d;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffd.a f251111a;

    public k(ffd.a alertsMapper) {
        Intrinsics.checkNotNullParameter(alertsMapper, "alertsMapper");
        this.f251111a = alertsMapper;
    }

    public final ArrayList a(List list, boolean z) {
        List<AlertItem> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (AlertItem alertItem : list2) {
            qv0.l lVarB = ((p2d.b) this.f251111a).b(alertItem.getF86877b().d, alertItem);
            if (z) {
                lVarB = new wh(j6.a.q("ALERTS_WIDGET_SWIPE_DELETE_", alertItem.getF86876a()), lVarB, zhm.u.c(new SwipeToActionDelegate.SwipeAction(j6.a.q("ALERTS_WIDGET_SWIPE_DELETE_ACTION_", alertItem.getF86876a()), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_item_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, alertItem, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            }
            arrayList.add(lVarB);
        }
        return arrayList;
    }
}
