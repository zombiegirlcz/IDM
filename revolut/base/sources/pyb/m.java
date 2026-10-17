package pyb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.youTransactor.uCube.rpc.Constants;
import ip0.k10;
import ip0.xh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.e1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f240744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f240745c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(k10 k10Var, int i, s sVar, RevPointsFlowDestination revPointsFlowDestination) {
        this.f240743a = 0;
        this.f240745c = k10Var;
        this.f240744b = i;
        this.d = sVar;
        this.e = revPointsFlowDestination;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str;
        switch (this.f240743a) {
            case 0:
                k10 k10Var = (k10) this.f240745c;
                s sVar = (s) this.d;
                RevPointsFlowDestination revPointsFlowDestination = (RevPointsFlowDestination) this.e;
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                k71.q qVar = (k71.q) pair.f186386b;
                aim.e eVarB = u.b();
                boolean zIsEmpty = list.isEmpty();
                int i = this.f240744b;
                if (zIsEmpty) {
                    eVarB.add(k10Var);
                } else {
                    List listV0 = d0.V0(list, i);
                    ArrayList arrayList = new ArrayList(w.t(listV0, 10));
                    Iterator it8 = listV0.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(sVar.f((e1) it8.next(), qVar, new TimeClause.Format.Pretty(0)));
                    }
                    eVarB.addAll(arrayList);
                }
                if (list.size() > i) {
                    eVarB.add(new LargeActionButtonDelegate.Model("TX_WIDGET_LIST_ID_SEE_ALL", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.rev_points_dashboard_see_all, null, null, 14), false, null, null, revPointsFlowDestination, null, 744));
                }
                aim.e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 1:
                q3d.e eVar = (q3d.e) this.f240745c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List<WatchlistItem> list2 = content;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (WatchlistItem watchlistItem : list2) {
                    String strQ = j6.a.q("watchlist-widget-item-", watchlistItem.getId());
                    ifd.h hVar = eVar.f241948a;
                    FavouritesAssetDetails favouritesAssetDetails = watchlistItem.f86898a;
                    arrayList2.add(new wh(strQ, ((n3d.d) hVar).e(favouritesAssetDetails.d, watchlistItem, a0.d.s("WATCHLIST_ITEM_", favouritesAssetDetails.f86863a, "_", watchlistItem.f86899b)), u.c(new SwipeToActionDelegate.SwipeAction("watchlist-widget-remove-action-id", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_watchlist_screen_item_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, str2 != null ? new s3d.f(watchlistItem, str2) : new s3d.g(watchlistItem), null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                }
                List listV02 = d0.V0(arrayList2, this.f240744b);
                boolean zIsEmpty2 = listV02.isEmpty();
                boolean zIsEmpty3 = listV02.isEmpty();
                if (zIsEmpty2) {
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 62);
                    int i2 = com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_widget_empty_title;
                    f0 f0Var = f0.f322471a;
                    listV02 = i2b.a.p(listV02, new wh("watchlist-empty-widget-item-id", new RowDelegate.Model("WATCHLIST_WIDGET_EMPTY_STATE", image40, new TextLocalisedClause(i2, f0Var, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 8), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), f0Var, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                }
                return new v1d.k(str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_widget_header_title, null, null, 14), listV02, zIsEmpty3);
            default:
                s9h.h hVar2 = (s9h.h) this.f240745c;
                String str4 = (String) this.d;
                q0h.i iVar = (q0h.i) this.e;
                List content2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                if (content2.isEmpty()) {
                    return hVar2.i(str4);
                }
                int size = content2.size();
                int i3 = this.f240744b;
                boolean z = size > i3;
                RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
                q0h.e eVarA2 = iVar.a();
                Intrinsics.checkNotNullParameter(eVarA2, "<this>");
                int i5 = s9h.a.f261179a[eVarA2.ordinal()];
                if (i5 == 1) {
                    str = "STOCK_MOST_TRADED_WIDGET_LIST_ID";
                } else if (i5 == 2) {
                    str = "CRYPTO_MOST_TRADED_WIDGET_LIST_ID";
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "CFD_MOST_TRADED_WIDGET_LIST_ID";
                }
                String str5 = str;
                wr5.b bVar = hVar2.f261192b;
                BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel = new BaseDynamicWidgetDelegate.BigHeaderModel(str5, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_most_traded_crypto_title, null, null, 14), null, false, null, 56);
                n3 n3Var = z ? new n3(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_transactions_widget_button_see_all, null, null, 14), iVar.a()) : null;
                q9h.a aVar = hVar2.d;
                Intrinsics.checkNotNullParameter(content2, "content");
                List listV03 = d0.V0(content2, i3);
                ArrayList arrayList3 = new ArrayList(w.t(listV03, 10));
                int i6 = 0;
                for (Object obj5 : listV03) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        v.s();
                        throw null;
                    }
                    xzg.v asset = (xzg.v) obj5;
                    q0h.j jVar = new q0h.j(asset);
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    arrayList3.add(aVar.f243894a.a(asset, i21, jVar));
                    i6 = i21;
                }
                return RowsWidgetDelegate.Model.Companion.d(companion, str4, bigHeaderModel, arrayList3, n3Var, null, iVar.a(), null, 80);
        }
    }

    public /* synthetic */ m(Object obj2, String str, int i, Object obj3, int i2) {
        this.f240743a = i2;
        this.f240745c = obj2;
        this.d = str;
        this.f240744b = i;
        this.e = obj3;
    }
}
