package ghd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import ifd.h;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f143905a;

    public d(h watchlistMapper) {
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        this.f143905a = watchlistMapper;
    }

    public final y a(Set availableAssets, Set assetsBeingSelected, Map map) {
        Intrinsics.checkNotNullParameter(availableAssets, "availableAssets");
        Intrinsics.checkNotNullParameter(assetsBeingSelected, "assetsBeingSelected");
        List listE = oc.c.e(map, availableAssets);
        t tVar = new t(new TextLocalisedClause(R$string.shared_watchlist_filtering_selection_dialog_title, null, null, 14), null, null, 30);
        l lVar = l.WINDOW;
        List<FavouritesAssetTypeKey> list = listE;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (FavouritesAssetTypeKey favouritesAssetTypeKey : list) {
            boolean zContains = assetsBeingSelected.contains(favouritesAssetTypeKey);
            String strQ = j6.a.q("ASSET_TYPE_CHOOSER_DIALOG_LIST_ITEM_", favouritesAssetTypeKey.f86866a);
            qd0 qd0Var = qd0.SELECTED;
            if (!zContains) {
                qd0Var = null;
            }
            if (qd0Var == null) {
                qd0Var = qd0.UNSELECTED;
            }
            arrayList.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(j6.a.q("ASSET_TYPE_CHOOSER_DIALOG_LIST_ITEM_", favouritesAssetTypeKey.f86866a), null, new TextLocalisedClause(((n3d.d) this.f143905a).c(favouritesAssetTypeKey), null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, favouritesAssetTypeKey, null, 0, 0, 0, 0, 532676602), qd0Var, null, null, false, null, null, null, false, 32760));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ASSET_TYPE_SELECTION_DIALOG_LARGE_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, yoj.b.w(new TextLocalisedClause(R$string.shared_watchlist_filtering_selection_dialog_button_title, null, null, 14), new TextClause(a0.d.n(" · ", assetsBeingSelected.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), !assetsBeingSelected.isEmpty(), null, null, null, null, 968);
        yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
        return new y(d0.F0(model, arrayList), tVar, lVar, null, null, null, 1016);
    }
}
