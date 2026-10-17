package qph;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jmrtd.cbeff.ISO781611;
import z0h.q1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sph.l f248424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerEmbeddedFiltersControllerContract$InputData f248425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f248426c;

    public v(sph.l filtersListMapper, wqh.b statsWidgetMapper, ScreenerEmbeddedFiltersControllerContract$InputData inputData, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(filtersListMapper, "filtersListMapper");
        Intrinsics.checkNotNullParameter(statsWidgetMapper, "statsWidgetMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f248424a = filtersListMapper;
        this.f248425b = inputData;
        this.f248426c = wealthDisclaimersMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listU;
        char c2;
        List listG;
        List listB;
        Map map;
        int i;
        ScreenerStatsGroup screenerStatsGroup;
        ArrayList arrayList;
        char c3;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f248410g;
        Data data2 = domainState.e;
        List selectedFilters = domainState.f248409c;
        Data data3 = domainState.f248408b;
        String str = domainState.f248407a;
        List list = data != null ? (List) data.getContent() : null;
        q1 q1Var = this.f248426c;
        sph.l lVar = this.f248424a;
        int i2 = 14;
        if (str == null || d0.W(str) || list == null) {
            List list2 = (List) data3.getContent();
            sph.h hVar = sph.h.CHIPS;
            List listA = lVar.a(data3, selectedFilters, new sph.g(zhm.v.k(hVar, sph.h.SLIDER, sph.h.ROWS, hVar, hVar)));
            if (list2 != null) {
                zel.f instrumentGroup = this.f248425b.f96208a;
                Data data4 = domainState.d;
                Float fValueOf = Float.valueOf(16.0f);
                Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
                Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
                if (data4 == null || (map = (Map) data4.getContent()) == null) {
                    c2 = 1;
                    listG = f0.f322471a;
                } else {
                    List listD1 = zhm.d0.d1(map.keySet());
                    if (listD1.isEmpty()) {
                        listG = f0.f322471a;
                        c2 = 1;
                    } else {
                        List list3 = selectedFilters;
                        c2 = 1;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((ScreenerSelectedFilter) it8.next()).getF105167a());
                        }
                        List<ScreenerStatsGroup> list4 = listD1;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (ScreenerStatsGroup screenerStatsGroup2 : list4) {
                            Iterable iterable = (Set) map.get(screenerStatsGroup2);
                            if (iterable == null) {
                                iterable = h0.f322473a;
                            }
                            Iterable iterable2 = iterable;
                            if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                                i = 0;
                            } else {
                                Iterator it9 = iterable2.iterator();
                                int i3 = 0;
                                while (it9.hasNext()) {
                                    if (arrayList2.contains((zel.g) it9.next()) && (i3 = i3 + 1) < 0) {
                                        zhm.v.r();
                                        throw null;
                                    }
                                }
                                i = i3;
                            }
                            Clause imageClause = new ImageClause(R$drawable.uikit_icn_24_chevron_right, Integer.valueOf(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28);
                            Clause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth_discovery.impl.screener.domain.model.b.a(screenerStatsGroup2), null, null, i2);
                            if (i > 0) {
                                arrayList = arrayList2;
                                screenerStatsGroup = screenerStatsGroup2;
                                textLocalisedClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(textLocalisedClause, new ImageClause(R$drawable.uikit_icn_24_dot, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16)));
                            } else {
                                screenerStatsGroup = screenerStatsGroup2;
                                arrayList = arrayList2;
                            }
                            String str2 = "stats-group-" + screenerStatsGroup;
                            Clause clause = textLocalisedClause;
                            if (i > 0) {
                                c3 = 6;
                                imageClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6), imageClause));
                            } else {
                                c3 = 6;
                            }
                            arrayList3.add(new RowDelegate.Model(str2, null, clause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(null, imageClause, null, false, ISO781611.SMT_TAG), false, null, false, null, null, null, null, null, null, new wqh.a(screenerStatsGroup), null, 0, 0, 0, 0, 532675578));
                            arrayList2 = arrayList;
                            i2 = 14;
                        }
                        listG = yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("stats-header", (Image) null, (Clause) new TextLocalisedClause(R$string.screener_section_stats_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                    }
                }
                listB = data2 != null ? ((aah.m) q1Var).b(data2) : null;
                if (listB == null) {
                    listB = f0.f322471a;
                }
                List[] listArr = new List[3];
                listArr[0] = listA;
                listArr[c2] = listG;
                listArr[2] = listB;
                listU = zhm.w.u(zhm.v.k(listArr));
            } else {
                listU = listA;
            }
        } else if (list.isEmpty()) {
            listU = zhm.u.c(new FullScreenStateDelegate.Model("EMPTY_FILTERS_SEARCH", new TextLocalisedClause(R$string.screener_filters_empty_state_search_title, null, null, 14), new TextLocalisedClause(R$string.screener_filters_empty_state_search_subtitle, zhm.u.c(str), null, 12), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_bar_chart_search, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1984));
            yp0.b.k(listU, 0, 0, 0, 0, 31);
        } else {
            List listA2 = lVar.a(new Data(list, null, false, 6, null), selectedFilters, sph.l.f264956c);
            listB = data2 != null ? ((aah.m) q1Var).b(data2) : null;
            if (listB == null) {
                listB = f0.f322471a;
            }
            listU = zhm.d0.E0(listB, listA2);
        }
        return new q(listU);
    }
}
