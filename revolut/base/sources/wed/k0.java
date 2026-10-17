package wed;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements jki.p {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedAlertsScreenContract$InputData f296739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifd.h f296740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffd.a f296741c;

    public k0(SharedAlertsScreenContract$InputData inputData, ifd.h watchlistMapper, ffd.a alertsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        Intrinsics.checkNotNullParameter(alertsMapper, "alertsMapper");
        this.f296739a = inputData;
        this.f296740b = watchlistMapper;
        this.f296741c = alertsMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listC;
        int i;
        Data data;
        ListSubheaderDelegate.Model model;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        k0 k0Var = this;
        l domainState = (l) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Set set = domainState.f296743b;
        mgd.d dVar = domainState.d;
        int size = set.size();
        ifd.h hVar = k0Var.f296740b;
        if (size == 0 || size == 1) {
            listC = zhm.f0.f322471a;
        } else {
            Set set2 = domainState.f296742a;
            listC = zhm.u.c(new ActionsView.Item("SWITCH_ASSET_ACTION_ID", mx0.d.SEMIBLACK, false, null, null, set2.size() == 1 ? new TextLocalisedClause(((n3d.d) hVar).c((FavouritesAssetTypeKey) zhm.d0.a0(set2)), null, null, 14) : new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.shared_watchlist_filtering_action_assetTypes, null, null, 14), new DotDividerClause((Integer) null), new TextClause(String.valueOf(set2.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668));
        }
        List list = listC;
        List listC2 = zhm.u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ADD_NAV_BAR_ITEM_ID", new TextLocalisedClause(R$string.shared_alerts_new_alert_action_new, null, null, 14), null, 56));
        Set set3 = domainState.f296743b;
        TextLocalisedClause textLocalisedClause3 = (set3.size() != 1 || k0Var.f296739a.f86721a.e) ? new TextLocalisedClause(R$string.shared_alerts_alerts_screen_header_title, null, null, 14) : new TextLocalisedClause(R$string.shared_alerts_alerts_screen_header_specialized_title, zhm.u.c(new TextLocalisedClause(((n3d.d) hVar).c((FavouritesAssetTypeKey) zhm.d0.a0(set3)), null, null, 14)), null, 12);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FixedTabsDelegate.Model("shared_alerts_tabs", zhm.v.k(new FixedTabs.Item(mgd.d.COMPLETED.toString(), new TextLocalisedClause(R$string.shared_alerts_alerts_tab_completed, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item(mgd.d.ACTIVE.toString(), new TextLocalisedClause(R$string.shared_alerts_alerts_tab_active, null, null, 14), (AnalyticsContext) null, 12)), dVar.toString(), false, null, 56));
        List list2 = domainState.e;
        Map map = domainState.f;
        List<mgd.c> list3 = list2;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
        for (mgd.c cVar : list3) {
            FavouritesAssetTypeKey favouritesAssetTypeKey = cVar.f205260a;
            Data data2 = cVar.f205261b;
            List list4 = (List) data2.component1();
            int i2 = Integer.MAX_VALUE;
            if (list2.size() != 1 && (i = j0.f296738b[dVar.ordinal()]) != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 3;
            }
            int i3 = i2;
            ArrayList arrayList3 = arrayList;
            if (list2.size() > 1) {
                Integer numValueOf = list4 != null ? Integer.valueOf(list4.size()) : null;
                boolean z = numValueOf != null && numValueOf.intValue() > i3;
                String strQ = j6.a.q("SECTION_HEADER_", favouritesAssetTypeKey.f86866a);
                data = data2;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(((n3d.d) hVar).c(favouritesAssetTypeKey), null, null, 14);
                if (z) {
                    textLocalisedClause = textLocalisedClause4;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.shared_watchlist_widget_header_end_title_see_all, null, null, 14);
                } else {
                    textLocalisedClause = textLocalisedClause4;
                    textLocalisedClause2 = null;
                }
                model = new ListSubheaderDelegate.Model(strQ, (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) textLocalisedClause2, z, (Object) favouritesAssetTypeKey, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
                yp0.b.r(model, 0, 0, 0, 0, 15);
            } else {
                data = data2;
                model = null;
            }
            ArrayList arrayList4 = arrayList2;
            arrayList4.add(i2b.a.q(model, (List) iii.c.f(data, new l2d.c(k0Var, favouritesAssetTypeKey, 2), new g0(favouritesAssetTypeKey, 0), new bsd.f(i3, 2, k0Var, dVar == mgd.d.ACTIVE ? i0.ADD_ALERT : list2.size() == 1 ? i0.FULL_TRIGGERED : i0.NORMAL_TRIGGERED, favouritesAssetTypeKey, (Map) map.get(favouritesAssetTypeKey)))));
            k0Var = this;
            arrayList2 = arrayList4;
            arrayList = arrayList3;
            map = map;
            dVar = dVar;
            hVar = hVar;
            list2 = list2;
            list = list;
        }
        ArrayList arrayList5 = arrayList;
        arrayList5.addAll(zhm.w.u(arrayList2));
        arrayList5.addAll(domainState.i);
        return new r(list, textLocalisedClause3, listC2, arrayList5);
    }
}
