package tcg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ox5.r0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oag.a f269779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oag.b f269780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f269781c;
    public final gte.a d;

    public b0(oag.a travelHotelsLocationPickerItemFactory, oag.b itemMapper, a searchResultsItemFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsLocationPickerItemFactory, "travelHotelsLocationPickerItemFactory");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(searchResultsItemFactory, "searchResultsItemFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f269779a = travelHotelsLocationPickerItemFactory;
        this.f269780b = itemMapper;
        this.f269781c = searchResultsItemFactory;
        this.d = featureToggleInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v5, types: [java.lang.Throwable] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        List listF0;
        List listQ;
        int i;
        int i2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f269786a;
        List recentLocationSearches = domainState.f269788c;
        List recentPropertySearches = domainState.d;
        int length = str.length();
        gte.a aVar = this.d;
        Integer num = null;
        if (length >= 3) {
            Data searchItems = domainState.f269787b;
            String query = domainState.f269786a;
            e0 e0Var = (e0) this.f269781c;
            e0Var.getClass();
            Intrinsics.checkNotNullParameter(searchItems, "searchItems");
            Intrinsics.checkNotNullParameter(query, "query");
            listF0 = (List) iii.c.f(searchItems, new t5e.m(e0Var, 29), new tc6.b(3), new si5.c(e0Var, query, 17));
        } else {
            boolean zC = ((jte.d) aVar).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c);
            int i3 = zC ? R$attr.uikit_dp0 : R$attr.uikit_dp8;
            List recentSmartSearches = domainState.e;
            if (!zC) {
                recentSmartSearches = null;
            }
            if (recentSmartSearches == null) {
                recentSmartSearches = f0.f322471a;
            }
            if (recentSmartSearches.size() + recentLocationSearches.size() + recentPropertySearches.size() > 1) {
                List listA = ((oag.k) this.f269779a).a();
                ((oag.l) this.f269780b).getClass();
                Intrinsics.checkNotNullParameter(recentLocationSearches, "recentLocationSearches");
                Intrinsics.checkNotNullParameter(recentPropertySearches, "recentPropertySearches");
                Intrinsics.checkNotNullParameter(recentSmartSearches, "recentSmartSearches");
                if (recentLocationSearches.isEmpty() && recentPropertySearches.isEmpty() && recentSmartSearches.isEmpty()) {
                    listQ = f0.f322471a;
                    z = true;
                } else {
                    List list = recentLocationSearches;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    int i5 = 0;
                    for (Object obj2 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            ?? r44 = num;
                            zhm.v.s();
                            throw r44;
                        }
                        ffi.c cVar = (ffi.c) obj2;
                        oag.c cVar2 = oag.c.RECENT_LOCATION;
                        String strO = p.a.o(oag.l.a(cVar2), cVar.hashCode());
                        LayeredImage.Companion companion = LayeredImage.INSTANCE;
                        switch (oag.m.f223632b[cVar2.ordinal()]) {
                            case 1:
                            case 2:
                                i2 = R$drawable.uikit_icn_24_location_pin;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i2 = R$drawable.uikit_icn_24_search;
                                break;
                            case 4:
                                i2 = R$drawable.uikit_icn_24_hotel;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        LayeredImage layeredImageB = LayeredImage.Companion.b(companion, i2, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                        TextClause textClause = new TextClause(cVar.f134810a.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        TimeRangeClause timeRangeClause = new TimeRangeClause(oc.c.F(cVar.f134812c), oc.c.F(cVar.d), ZoneId.systemDefault(), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254));
                        DotDividerClause dotDividerClause = new DotDividerClause(num);
                        int i21 = R$plurals.hotels_stays_search_guests_count;
                        String str2 = cVar.e;
                        arrayList.add(new RowDelegate.Model(strO, layeredImageB, null, null, textClause, new CompositeClause(zhm.v.k(timeRangeClause, dotDividerClause, new TextLocalisedQuantityClause(i21, Integer.valueOf(v04.b.e(str2)), zhm.u.c(Integer.valueOf(v04.b.e(str2))), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8)), null, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, new oag.f(cVar, i6, cVar.f134811b), null, 0, 0, 0, 0, 1056964460));
                        i5 = i6;
                        num = num;
                    }
                    Integer num2 = num;
                    List list2 = recentPropertySearches;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                    int i22 = 0;
                    for (Object obj3 : list2) {
                        int i32 = i22 + 1;
                        if (i22 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        dgi.d dVar = (dgi.d) obj3;
                        oag.c cVar3 = oag.c.RECENT_PROPERTY;
                        String strO2 = p.a.o(oag.l.a(cVar3), dVar.hashCode());
                        LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                        switch (oag.m.f223632b[cVar3.ordinal()]) {
                            case 1:
                            case 2:
                                i = R$drawable.uikit_icn_24_hotel;
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
                        LayeredImage layeredImageB2 = LayeredImage.Companion.b(companion2, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                        TextClause textClause2 = new TextClause(dVar.f114681c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        TimeRangeClause timeRangeClause2 = new TimeRangeClause(oc.c.F(dVar.f), oc.c.F(dVar.f114682g), ZoneId.systemDefault(), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254));
                        DotDividerClause dotDividerClause2 = new DotDividerClause(num2);
                        int i33 = R$plurals.hotels_stays_search_guests_count;
                        String str3 = dVar.f114683h;
                        arrayList2.add(new RowDelegate.Model(strO2, layeredImageB2, null, null, textClause2, new CompositeClause(zhm.v.k(timeRangeClause2, dotDividerClause2, new TextLocalisedQuantityClause(i33, Integer.valueOf(v04.b.e(str3)), zhm.u.c(Integer.valueOf(v04.b.e(str3))), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8)), null, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, new oag.g(dVar, i32, dVar.f114680b), null, 0, 0, 0, 0, 1056964460));
                        i22 = i32;
                        num2 = null;
                    }
                    List list3 = recentSmartSearches;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    int i43 = 0;
                    for (Object obj4 : list3) {
                        int i59 = i43 + 1;
                        if (i43 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        ffi.d dVar2 = (ffi.d) obj4;
                        arrayList3.add(new RowDelegate.Model(j6.a.q("SMART_SEARCH_RECENT_ITEM_ID", dVar2.f134813a), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_search, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextClause(dVar2.f134813a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, null, false, false, null, null, null, null, null, new oag.i(dVar2, i59, dVar2.f134814b), null, 0, 0, 0, 0, 1056964460));
                        i43 = i59;
                    }
                    List listP0 = zhm.d0.P0(zhm.w.u(zhm.v.k(arrayList, arrayList2, arrayList3)), new oag.n());
                    z = true;
                    yp0.b.k(listP0, 0, i3, 0, 0, 29);
                    listQ = i2b.a.q(new ListSubheaderDelegate.Model("LOCATION_RECENT_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_stays_section_recent_searches_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), listP0);
                }
                listF0 = zhm.d0.E0(listQ, listA);
            } else {
                z = true;
                listF0 = (List) iii.c.f(domainState.f, new a0(0), new tc6.b(2), new r0(this, i3));
            }
            if (zC) {
                List list4 = listF0;
                if (!list4.isEmpty()) {
                    listF0 = zhm.d0.F0(z92.f.e(R$string.hotels_stays_location_search_smart_search_disclaimer, z), list4);
                }
            }
        }
        aim.e eVarB = zhm.u.b();
        eVarB.add(new TextLocalisedClause(R$string.hotels_stays_location_search_placeholder, null, null, 14));
        if (((jte.d) aVar).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c)) {
            eVarB.add(new TextLocalisedClause(R$string.hotels_stays_location_search_smart_search_placeholder, null, null, 14));
        }
        return new o(zhm.u.a(eVarB), listF0);
    }
}
