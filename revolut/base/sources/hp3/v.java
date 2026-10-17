package hp3;

import android.os.Parcelable;
import aw0.c7;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.corporate_events.impl.R$string;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import ifd.b;
import ip0.b5;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;
import zhm.a0;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class v implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154436a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f154437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f154438c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(List list, y yVar, boolean z, boolean z3, m mVar) {
        this.f154438c = list;
        this.e = yVar;
        this.f154437b = z;
        this.d = z3;
        this.f = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model, koi.j] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        Iterable iterableA;
        ComplexImage.Regular regular;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        ComplexImage.Regular regular2;
        TextLocalisedClause textLocalisedClause4;
        TextLocalisedClause textLocalisedClause5;
        ?? C;
        boolean z;
        switch (this.f154436a) {
            case 0:
                y yVar = (y) this.e;
                m mVar = (m) this.f;
                List firstPageEvents = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(firstPageEvents, "firstPageEvents");
                ArrayList content = d0.G0(firstPageEvents, nkm.y.t(nkm.y.m(d0.Q(this.f154438c), 1), new r(4)));
                j8b.h hVar = yVar.f154440a;
                Intrinsics.checkNotNullParameter(content, "content");
                if (this.f154437b) {
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(content, 10));
                    Iterator it8 = content.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(hVar.a((kp3.b) it8.next(), false));
                    }
                    yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                    arrayList = arrayList2;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj5 : content) {
                        LocalDate localDateWithDayOfMonth = ((kp3.b) obj5).a().f().withDayOfMonth(1);
                        Object objU = linkedHashMap.get(localDateWithDayOfMonth);
                        if (objU == null) {
                            objU = h30.l.u(linkedHashMap, localDateWithDayOfMonth);
                        }
                        ((List) objU).add(obj5);
                    }
                    arrayList = new ArrayList();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        LocalDate localDate = (LocalDate) entry.getKey();
                        List list = (List) entry.getValue();
                        String strS = h30.l.s("month_section_", localDate);
                        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                        Intrinsics.h(localDate);
                        LocalDateClause$DateFormat month = localDate.getYear() == ((l80.f) hVar.f172165a).j() ? new LocalDateClause$DateFormat.Month(0) : new LocalDateClause$DateFormat.MonthAndYear(0);
                        jVar.getClass();
                        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strS, (Image) null, (Clause) com.revolut.core.ui_kit.models.j.a(localDate, month, null), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(hVar.a((kp3.b) it9.next(), false));
                        }
                        a0.x(yp0.b.g(arrayList3, model, e0.OUTSIDE_BOX, 0, 0, 124), arrayList);
                    }
                }
                boolean z3 = this.d;
                if (z3 && arrayList.isEmpty()) {
                    iterableA = y.b();
                } else if (z3) {
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(new b5("last_page_loading_stub_0"));
                    yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                    iterableA = d0.E0(yVar.a(mVar), arrayList4);
                } else if (z3 || !arrayList.isEmpty()) {
                    iterableA = yVar.a(mVar);
                } else {
                    Set set = mVar.f154414b;
                    boolean z4 = mVar.e;
                    LinkedHashSet linkedHashSetJ = a1.j(set, iel.e.MARKET_HOLIDAY);
                    String str = mVar.f;
                    String str2 = "CORPORATE_EVENTS_EMPTY_ID";
                    if (str != null && str.length() > 0) {
                        regular2 = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
                        textLocalisedClause4 = new TextLocalisedClause(R$string.feature_corporate_events_search_empty_title, null, null, 14);
                        textLocalisedClause5 = new TextLocalisedClause(R$string.feature_corporate_events_search_empty_description_no_filters, null, null, 14);
                    } else if (!Intrinsics.f(mVar.d, "MY_EVENTS_TAB_ID") || (!Intrinsics.f(mVar.f154415c, linkedHashSetJ) && z4)) {
                        if (z4) {
                            str2 = "EMPTY_STATE_CLEAR_FILTERS_ID";
                            regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
                            textLocalisedClause = new TextLocalisedClause(R$string.feature_corporate_events_search_empty_title, null, null, 14);
                            textLocalisedClause2 = new TextLocalisedClause(R$string.feature_corporate_events_timeline_empty_filtered_description, null, null, 14);
                            textLocalisedClause3 = new TextLocalisedClause(R$string.feature_corporate_events_search_empty_button_clear_filters, null, null, 14);
                        } else {
                            regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
                            textLocalisedClause = new TextLocalisedClause(R$string.feature_corporate_events_search_empty_title, null, null, 14);
                            textLocalisedClause2 = null;
                            textLocalisedClause3 = null;
                        }
                        FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model(str2, textLocalisedClause, textLocalisedClause2, regular, zj.REGULAR, textLocalisedClause3, false, null, null, false, 0, 0, 32704);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        iterableA = zhm.u.c(model2);
                    } else {
                        regular2 = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D116", null, null, null, 30));
                        textLocalisedClause4 = new TextLocalisedClause(R$string.feature_corporate_events_timeline_my_events_empty_title, null, null, 14);
                        textLocalisedClause5 = new TextLocalisedClause(R$string.feature_corporate_events_timeline_my_events_empty_description, null, null, 14);
                        str2 = "EMPTY_STATE_INVEST_ID";
                    }
                    regular = regular2;
                    textLocalisedClause = textLocalisedClause4;
                    textLocalisedClause2 = textLocalisedClause5;
                    textLocalisedClause3 = null;
                    FullScreenStateDelegate.Model model22 = new FullScreenStateDelegate.Model(str2, textLocalisedClause, textLocalisedClause2, regular, zj.REGULAR, textLocalisedClause3, false, null, null, false, 0, 0, 32704);
                    yp0.b.l(model22, 0, 0, 0, 0, null, false, 63);
                    iterableA = zhm.u.c(model22);
                }
                return d0.E0(iterableA, arrayList);
            default:
                com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b bVar = (com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b) this.e;
                String str3 = (String) this.f;
                List content2 = (List) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content2, "content");
                if (content2.isEmpty()) {
                    C = (content2.isEmpty() && this.f154437b && !zBooleanValue) ? zhm.u.c(new FullScreenStateDelegate.Model("EMPTY_SEARCH_STATE_ID", new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_assets_search_empty_state_description, zhm.u.c(str3), null, 12), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.rates_counterpart_picker_search_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_assets_search_empty_state_button_clear_search, null, null, 14), false, null, null, false, 0, 0, 32704)) : bVar.f86816c;
                } else {
                    List<ogd.e> list3 = content2;
                    C = new ArrayList(zhm.w.t(list3, 10));
                    for (ogd.e assetPair : list3) {
                        List list4 = this.f154438c;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it10 = list4.iterator();
                            while (it10.hasNext()) {
                                if (Intrinsics.f(((AssetIdWithSymbol) ((Pair) it10.next()).f186385a).f86861a, assetPair.f225109a.f86863a)) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        ifd.d dVar = bVar.f86815b;
                        SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData = bVar.f86814a;
                        FavouritesAssetTypeKey key = sharedFavouritesAddAssetScreenContract$InputData.f86809a;
                        String listId = p.a.p("ITEM_ID_", assetPair.f225109a.f86863a, assetPair.f225110b);
                        ifd.c extras = new ifd.c(b.a.f161001a, false);
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
                        Intrinsics.checkNotNullParameter(listId, "listId");
                        Intrinsics.checkNotNullParameter(extras, "extras");
                        x3d.f fVar = (x3d.f) ((n3d.d) dVar).f211984a.get(key);
                        if (fVar == null) {
                            throw new IllegalStateException(j6.a.q("provide mapper for key = ", key.f86866a));
                        }
                        ?? J = fVar.j(assetPair, listId, n3d.d.a(extras));
                        int i = yfd.y.f313236a[sharedFavouritesAddAssetScreenContract$InputData.f86811c.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String str4 = J.f53228a;
                            SelectableDelegate.b aVar = (!this.d || z) ? null : new SelectableDelegate.b.a(false);
                            if (aVar == null) {
                                aVar = SelectableDelegate.b.C0424b.f53319a;
                            }
                            J = new SelectableDelegate.Model(str4, J, z, aVar, null, 131056);
                        }
                        C.add(J);
                    }
                }
                ?? r3 = C;
                yp0.b.k(r3, 0, 0, 0, 0, 31);
                return r3;
        }
    }

    public /* synthetic */ v(boolean z, com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b bVar, String str, List list, boolean z3) {
        this.f154437b = z;
        this.e = bVar;
        this.f = str;
        this.f154438c = list;
        this.d = z3;
    }
}
