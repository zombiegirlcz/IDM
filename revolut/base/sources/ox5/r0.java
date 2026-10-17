package ox5;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230612a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f230613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cli.n f230614c;

    public /* synthetic */ r0(int i, x0 x0Var) {
        this.f230613b = i;
        this.f230614c = x0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Iterable iterableQ;
        int i;
        Clause compositeClause;
        switch (this.f230612a) {
            case 0:
                x0 x0Var = (x0) this.f230614c;
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List<WatchlistItem> listV0 = zhm.d0.V0(content, this.f230613b);
                ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
                for (WatchlistItem watchlistItem : listV0) {
                    arrayList.add(new wh(watchlistItem.getId(), ((n3d.d) x0Var.e).e(watchlistItem.f86898a.d, watchlistItem, watchlistItem.getId()), zhm.u.c(new SwipeToActionDelegate.SwipeAction("WATCHLIST_REMOVE", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_item_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, watchlistItem, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                ArrayList arrayListF1 = zhm.d0.f1(arrayList);
                if (!arrayListF1.isEmpty()) {
                    arrayListF1.add(0, new ListSubheaderDelegate.Model("WATCHLIST_LIST_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.shared_watchlist_widget_header_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.shared_watchlist_widget_header_end_title_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
                }
                return arrayListF1;
            default:
                tcg.b0 b0Var = (tcg.b0) this.f230614c;
                List locationsList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(locationsList, "content");
                List listA = ((oag.k) b0Var.f269779a).a();
                ((oag.l) b0Var.f269780b).getClass();
                Intrinsics.checkNotNullParameter(locationsList, "locationsList");
                if (locationsList.isEmpty()) {
                    iterableQ = zhm.f0.f322471a;
                } else {
                    int i2 = 14;
                    ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LOCATION_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_search_location_popular_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                    List list = locationsList;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                    int i3 = 0;
                    for (Object obj5 : list) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        HotelsLocation hotelsLocation = (HotelsLocation) obj5;
                        oag.c cVar = oag.c.POPULAR;
                        String strR = a0.d.r(oag.l.a(cVar), hotelsLocation.f97953a);
                        LayeredImage.Companion companion = LayeredImage.INSTANCE;
                        switch (oag.m.f223632b[cVar.ordinal()]) {
                            case 1:
                            case 2:
                                i = R$drawable.uikit_icn_24_location_pin;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i = R$drawable.uikit_icn_24_search;
                                break;
                            case 4:
                                i = R$drawable.uikit_icn_24_hotel;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        LayeredImage layeredImageB = LayeredImage.Companion.b(companion, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                        TextClause textClause = new TextClause(hotelsLocation.f97955c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        if (oag.m.f223631a[hotelsLocation.f97954b.ordinal()] == 1) {
                            compositeClause = new TextLocalisedClause(oag.l.b(hotelsLocation), null, null, i2);
                        } else {
                            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(oag.l.b(hotelsLocation), null, null, i2);
                            m70.a.t(kotlin.jvm.internal.t0.f186434a);
                            compositeClause = new CompositeClause(zhm.v.k(textLocalisedClause, new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(hotelsLocation.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
                        }
                        arrayList2.add(new RowDelegate.Model(strR, layeredImageB, null, null, textClause, compositeClause, null, null, 0, null, false, false, null, null, null, null, null, new oag.d(hotelsLocation, i5), null, 0, 0, 0, 0, 1056964460));
                        i3 = i5;
                        i2 = 14;
                    }
                    yp0.b.k(arrayList2, 0, this.f230613b, 0, 0, 29);
                    iterableQ = i2b.a.q(model, arrayList2);
                }
                return zhm.d0.E0(iterableQ, listA);
        }
    }

    public /* synthetic */ r0(tcg.b0 b0Var, int i) {
        this.f230614c = b0Var;
        this.f230613b = i;
    }
}
