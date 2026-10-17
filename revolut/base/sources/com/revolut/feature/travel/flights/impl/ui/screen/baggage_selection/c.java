package com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection;

import a0.d;
import aim.e;
import android.os.Parcelable;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductOption;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFareBaggageItem;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import v2g.i;
import v4g.g;
import v4g.p;
import v4g.q;
import v4g.r;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsBaggageSelectionScreenContract$InputData f93255a;

    public c(TravelFlightsBaggageSelectionScreenContract$InputData inputData, x4g.a carrierPriceInfoMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(carrierPriceInfoMapper, "carrierPriceInfoMapper");
        this.f93255a = inputData;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(v4g.g r40, com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct r41, int r42) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.c.a(v4g.g, com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct, int):java.util.ArrayList");
    }

    public static RowDelegate.Model b(String str, String str2, String str3, RowDelegate.Model.c.a aVar, Integer num) {
        RowDelegate.Model.MainImage.Image40 image40;
        if (num != null) {
            int iIntValue = num.intValue();
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$attr.uikit_colorForeground;
            image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(companion, iIntValue, new Color.Solid(i), new Color.ModifiedColor(new Color.Solid(i), 0.1f), 12.0f, null, 48), null, null, false, null, false, 62);
        } else {
            image40 = null;
        }
        return new RowDelegate.Model(str, image40, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, aVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    @Override // cli.n
    public final o c(j jVar) {
        RowDelegate.Model model;
        RowDelegate.Model.c.a aVar;
        Integer numValueOf;
        TextDelegate.Model modelA;
        Iterator it8;
        RowDelegate.Model.c.a aVar2;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVarB = u.b();
        TravelFlightsFare travelFlightsFare = this.f93255a.f93245a;
        ArrayList arrayList = travelFlightsFare.f93518c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TravelFlightsFareBaggageItem) obj2).f93520a) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        int i = 0;
        while (true) {
            Integer numValueOf2 = null;
            if (!it9.hasNext()) {
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                e eVarB2 = u.b();
                ArrayList arrayList4 = travelFlightsFare.f93518c;
                if (!arrayList4.isEmpty()) {
                    Iterator it10 = arrayList4.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            break;
                        }
                        if (((TravelFlightsFareBaggageItem) it10.next()).f93520a) {
                            eVarB2.add(new ListSubheaderDelegate.Model("EXTRA_BAGGAGE_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.travel_flights_baggage_selection_header_add_more, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                            break;
                        }
                    }
                }
                a travellers = domainState.f286077a;
                boolean z = travellers instanceof a.C0564a;
                if (z) {
                    RowDelegate.Model model2 = new RowDelegate.Model("ALL_TRAVELLERS_SWITCH_ID", null, new TextLocalisedClause(R$string.travel_flights_baggage_selection_option_same_baggage_for_all_travellers, null, null, 14), of.SMALL, 0, null, null, null, 0, new vf(((a.C0564a) travellers).f93248a, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869874);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    model = model2;
                } else {
                    if (!(travellers instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    model = null;
                }
                if (model != null) {
                    eVarB2.add(model);
                }
                ArrayList arrayList5 = travelFlightsFare.e;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList5) {
                    if (((TravelFlightsExtraProduct) obj3).f93503a == o7g.b.BAGGAGE) {
                        arrayList6.add(obj3);
                    }
                }
                ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                int i2 = 0;
                for (Object obj4 : arrayList6) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    TravelFlightsExtraProduct product = (TravelFlightsExtraProduct) obj4;
                    e eVarB3 = u.b();
                    String strN = d.n("EXTRA_BAGGAGE_ITEM_", i2);
                    String str = product.f93505c;
                    String str2 = product.d;
                    int i5 = r.f286089a[product.f93504b.ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2) {
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_backpack);
                        } else if (i5 == 3) {
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cabin_bag);
                        } else {
                            if (i5 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_suitcase);
                        }
                        aVar = null;
                    } else {
                        aVar = null;
                        numValueOf = null;
                    }
                    eVarB3.add(b(strN, str, str2, aVar, numValueOf));
                    if (!z) {
                        if (!(travellers instanceof a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVarB3.addAll(a(domainState, product, i2));
                    } else if (((a.C0564a) travellers).f93248a) {
                        String strN2 = d.n("EXTRA_BAGGAGE_ALL_TRAVELLERS_OPTION_", i2);
                        ArrayList arrayListH = uj3.b.H(product);
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it11 = arrayListH.iterator();
                        while (it11.hasNext()) {
                            String str3 = ((TravelFlightsExtraProductOption) it11.next()).f93511c;
                            if (str3 != null) {
                                arrayList8.add(str3);
                            }
                        }
                        String strQ = j6.a.q("INNER_", strN2);
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_baggage_selection_option_all_travellers, null, null, 14);
                        dj0.d.Companion.getClass();
                        dj0.d dVarO = dj0.d.e;
                        int i6 = 0;
                        for (Object obj5 : arrayListH) {
                            int i21 = i6 + 1;
                            if (i6 < 0) {
                                v.s();
                                throw null;
                            }
                            if (i6 == 0) {
                                dVarO = ((TravelFlightsExtraProductOption) obj5).d;
                                if (dVarO == null) {
                                    dj0.d.Companion.getClass();
                                    dVarO = dj0.d.e;
                                }
                            } else {
                                dj0.d dVar = ((TravelFlightsExtraProductOption) obj5).d;
                                if (dVar == null) {
                                    dj0.d.Companion.getClass();
                                    dVar = dj0.d.e;
                                }
                                dVarO = pyd.c.O(dVarO, dVar);
                            }
                            i6 = i21;
                        }
                        eVarB3.add(new SelectableDelegate.Model(strN2, new RowDelegate.Model(strQ, null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882), (arrayList8.isEmpty() || !domainState.f286079c.containsAll(arrayList8)) ? qd0.UNSELECTED : qd0.SELECTED, null, null, false, null, new TravelFlightsBaggageSelectionScreenContract$BaggageOptionParcel(arrayList8), null, false, 32504));
                    } else {
                        eVarB3.addAll(a(domainState, product, i2));
                    }
                    Intrinsics.checkNotNullParameter(product, "product");
                    Intrinsics.checkNotNullParameter(travellers, "travellers");
                    if (!z) {
                        if (!(travellers instanceof a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modelA = x4g.a.a(product, i2);
                    } else if (((a.C0564a) travellers).f93248a) {
                        List list = (List) ue0.e.M(uj3.b.H(product));
                        if (list != null) {
                            List list2 = list;
                            ArrayList arrayList9 = new ArrayList(w.t(list2, 10));
                            Iterator it12 = list2.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    dj0.d dVar2 = ((TravelFlightsExtraProductOption) it12.next()).d;
                                    if (dVar2 == null) {
                                        break;
                                    }
                                    arrayList9.add(dVar2);
                                } else {
                                    ArrayList arrayList10 = new ArrayList();
                                    Iterator it13 = list2.iterator();
                                    while (it13.hasNext()) {
                                        List listC = x4g.a.c(((TravelFlightsExtraProductOption) it13.next()).e);
                                        if (listC != null) {
                                            a0.x(listC, arrayList10);
                                        }
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Object obj6 : arrayList10) {
                                        String str4 = ((x4g.b) obj6).f302876a;
                                        Object objO = linkedHashMap.get(str4);
                                        if (objO == null) {
                                            objO = v0.a.o(linkedHashMap, str4);
                                        }
                                        ((List) objO).add(obj6);
                                    }
                                    ArrayList arrayList11 = new ArrayList(linkedHashMap.size());
                                    Iterator it14 = linkedHashMap.entrySet().iterator();
                                    while (it14.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it14.next();
                                        String str5 = (String) entry.getKey();
                                        List list3 = (List) entry.getValue();
                                        dj0.d.Companion.getClass();
                                        dj0.d dVarO2 = dj0.d.e;
                                        int i22 = 0;
                                        for (Object obj7 : list3) {
                                            int i32 = i22 + 1;
                                            if (i22 < 0) {
                                                v.s();
                                                throw null;
                                            }
                                            if (i22 == 0) {
                                                dVarO2 = ((x4g.b) obj7).f302877b;
                                                it8 = it14;
                                            } else {
                                                it8 = it14;
                                                dVarO2 = pyd.c.O(dVarO2, ((x4g.b) obj7).f302877b);
                                            }
                                            i22 = i32;
                                            it14 = it8;
                                        }
                                        List listK = v.k(new MoneyClause(dVarO2, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, o9.NON_SENSITIVE, 4), new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                                        m70.a.t(t0.f186434a);
                                        arrayList11.add(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
                                        it14 = it14;
                                        arrayList9 = arrayList9;
                                    }
                                    dj0.d.Companion.getClass();
                                    dj0.d dVarO3 = dj0.d.e;
                                    int i33 = 0;
                                    for (Object obj8 : arrayList9) {
                                        int i43 = i33 + 1;
                                        if (i33 < 0) {
                                            v.s();
                                            throw null;
                                        }
                                        dVarO3 = i33 == 0 ? (dj0.d) obj8 : pyd.c.O(dVarO3, (dj0.d) obj8);
                                        i33 = i43;
                                    }
                                    dj0.d.Companion.getClass();
                                    dj0.d dVarO4 = dj0.d.e;
                                    int i59 = 0;
                                    for (Object obj9 : arrayList10) {
                                        int i66 = i59 + 1;
                                        if (i59 < 0) {
                                            v.s();
                                            throw null;
                                        }
                                        dVarO4 = i59 == 0 ? ((x4g.b) obj9).f302877b : pyd.c.O(dVarO4, ((x4g.b) obj9).f302877b);
                                        i59 = i66;
                                    }
                                    modelA = x4g.a.b(i2, new TextLocalisedClause(R$string.travel_flights_baggage_selection_carrier_fee, u.c(new MoneyClause(pyd.c.H(dVarO3, dVarO4), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, o9.NON_SENSITIVE, 4)), null, 12), arrayList11);
                                }
                            }
                        }
                        modelA = null;
                    } else {
                        modelA = x4g.a.a(product, i2);
                    }
                    if (modelA != null) {
                        eVarB3.add(modelA);
                    }
                    e eVarA = u.a(eVarB3);
                    yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                    arrayList7.add(eVarA);
                    i2 = i3;
                }
                eVarB2.addAll(w.u(arrayList7));
                eVarB.addAll(u.a(eVarB2));
                return new p(u.a(eVarB), (v4g.n) iii.c.f(domainState.f286078b, new i(23), new v25.g(19), new uw2.n(12)));
            }
            Object next = it9.next();
            int i74 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            TravelFlightsFareBaggageItem travelFlightsFareBaggageItem = (TravelFlightsFareBaggageItem) next;
            String strN3 = d.n("INCLUDED_BAGGAGE_ITEM_", i);
            String str6 = travelFlightsFareBaggageItem.d;
            String str7 = travelFlightsFareBaggageItem.f93522c;
            Integer num = travelFlightsFareBaggageItem.f;
            if (num != null) {
                int iIntValue = num.intValue();
                TagViewData.Companion companion = TagViewData.INSTANCE;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.travel_flights_baggage_selection_included, u.c(Integer.valueOf(iIntValue)), null, 12);
                int i92 = R$attr.uikit_colorGreyTone20;
                int i96 = R$attr.uikit_colorForeground;
                companion.getClass();
                aVar2 = new RowDelegate.Model.c.a(TagViewData.Companion.b(i92, i96, textLocalisedClause2, null), null, false, 6);
            } else {
                aVar2 = null;
            }
            int i99 = r.f286090b[travelFlightsFareBaggageItem.f93521b.ordinal()];
            if (i99 != 1) {
                if (i99 == 2) {
                    numValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_backpack);
                } else if (i99 == 3) {
                    numValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_cabin_bag);
                } else {
                    if (i99 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_suitcase);
                }
            }
            arrayList3.add(b(strN3, str6, str7, aVar2, numValueOf2));
            i = i74;
        }
    }
}
