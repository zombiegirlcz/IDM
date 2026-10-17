package kwg;

import aw0.hb;
import aw0.ib;
import aw0.jb;
import aw0.l1;
import aw0.lb;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.airportlounges.impl.R$plurals;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.WalletPassTarget;
import do3.n;
import hw0.z;
import ip0.hm0;
import ip0.jm0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import jel.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kp0.q;
import ku1.f0;
import org.joda.time.DateTime;
import svi.k;
import svi.p0;
import t87.o;
import wvg.r0;
import wvg.z1;
import yhm.r;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f190341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190342c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f190340a = i;
        this.f190341b = obj2;
        this.e = obj3;
        this.f190342c = obj4;
        this.d = obj5;
        this.f = obj6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        jb jbVar;
        long jLongValue;
        ?? arrayList;
        Float f;
        ArrayList arrayList2;
        Object objPrevious;
        t87.a aVar;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        int i = this.f190340a;
        Object obj5 = this.f;
        Object obj6 = this.d;
        Object obj7 = this.f190342c;
        Object obj8 = this.e;
        Object obj9 = this.f190341b;
        switch (i) {
            case 0:
                l lVar = (l) obj9;
                String userId = (String) obj2;
                xi0.b currency = (xi0.b) obj3;
                iwg.a analyticsProductType = (iwg.a) obj4;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                return rd0.e.c(nim.a.v(lVar.f190364r.a(userId, l.a(analyticsProductType), l.b((WidgetisedAnalyticsType) obj8), (eel.c) obj7, currency, (iwg.c) obj6, (String) obj5), new kvg.j(lVar, 19)), kotlin.coroutines.g.f186406a);
            case 1:
                l lVar2 = (l) obj9;
                eel.c timeSpan = (eel.c) obj7;
                iwg.c method = (iwg.c) obj6;
                a3 sector = (a3) obj5;
                String userId2 = (String) obj2;
                xi0.b currency2 = (xi0.b) obj3;
                iwg.a analyticsProductType2 = (iwg.a) obj4;
                Intrinsics.checkNotNullParameter(userId2, "userId");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                Intrinsics.checkNotNullParameter(analyticsProductType2, "analyticsProductType");
                r0 r0Var = lVar2.f190358j;
                iwg.a analyticsProductType3 = l.a(analyticsProductType2);
                DateTime to6 = ((l80.f) lVar2.f190360m).h();
                String strB = l.b((WidgetisedAnalyticsType) obj8);
                r0Var.getClass();
                Intrinsics.checkNotNullParameter(userId2, "userId");
                Intrinsics.checkNotNullParameter(analyticsProductType3, "analyticsProductType");
                Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(sector, "sector");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                return nim.a.w(r0Var.d.f(new z1(userId2, analyticsProductType3, timeSpan, to6, method, sector, strB, currency2), true), new q(analyticsProductType2, new f0(17), 18));
            case 2:
                lxi.i iVar = (lxi.i) obj9;
                AnimationRequest animationRequest = (AnimationRequest) obj8;
                hha.d dVar = (hha.d) obj7;
                Data data = (Data) obj6;
                Data userCapabilitiesData = (Data) obj5;
                r rVar = (r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                n user = (n) rVar.f314201a;
                svi.k pass = (svi.k) rVar.f314202b;
                if (!cp5.d.m(pass)) {
                    Intrinsics.checkNotNullParameter(userCapabilitiesData, "userCapabilitiesData");
                    Intrinsics.checkNotNullParameter(user, "user");
                    List list = (List) data.getContent();
                    koi.j model = list != null ? (koi.j) d0.e0(0, list) : null;
                    if (model == null) {
                        ib ibVar = new ib(new TextLocalisedClause(R$string.airport_lounges_home_wallet_empty_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_home_wallet_empty_subtitle, null, null, 14));
                        List listK = v.k(new ImageClause(R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorForeground), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.airport_lounges_home_wallet_empty_button_simple, null, null, 14));
                        m70.a.t(t0.f186434a);
                        model = new WalletWidgetDelegate.Model(ibVar, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, 24);
                    }
                    return u.c(model);
                }
                lxi.j jVar = iVar.f200587a;
                egk.e eVar = (egk.e) jVar.f200588a.f185148b;
                Intrinsics.checkNotNullParameter(pass, "pass");
                int iL = cp5.d.l(pass);
                if (pass instanceof svi.j) {
                    aim.e eVarB = u.b();
                    svi.j jVar2 = (svi.j) pass;
                    p0 p0Var = jVar2.f;
                    if (p0Var != null) {
                        int i2 = p0Var.f265961a;
                        eVarB.add(new lb(lxi.j.b(dVar != null ? egk.e.a(eVar, dVar) : null), i2 > 0 ? new TextLocalisedClause(R$string.airport_lounges_home_wallet_recurring_entries_per_year, u.c(Integer.valueOf(i2)), null, 12) : new TextLocalisedClause(R$string.airport_lounges_home_wallet_recurring_entries_left, u.c(new TimeClause(p0Var.f265963c.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12)), null, 12), lxi.j.a(i2 <= 0 ? R$drawable.uikit_icn_24_info_legacy : R$drawable.uikit_icn_24_qr_code), lxi.k.b(jVar2.f265928h), false, hb.Dark, WalletPassTarget.Recurring));
                    }
                    int i3 = jVar2.f265925b;
                    svi.e eVar2 = jVar2.e;
                    int i5 = i3 + (eVar2 != null ? eVar2.f265896a : 0);
                    if (i5 > 0) {
                        eVarB.add(new lb(new TextLocalisedQuantityClause(p0Var != null ? R$plurals.airport_lounges_home_wallet_extra_passes : R$plurals.airport_lounges_home_wallet_limited_title, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24), new TextLocalisedClause(R$string.airport_lounges_home_wallet_limited_subtitle, null, null, 14), lxi.j.a(R$drawable.uikit_icn_24_qr_code), i5 > 1, WalletPassTarget.Extra));
                    }
                    jbVar = new jb(u.a(eVarB));
                } else {
                    if (!(pass instanceof svi.l)) {
                        if (pass.equals(k.a.f265929a)) {
                            throw new IllegalStateException("NoPass is not usable and cannot reach buildPassItem");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    aim.e eVarB2 = u.b();
                    TextLocalisedClause textLocalisedClauseB = lxi.j.b(dVar != null ? egk.e.a(eVar, dVar) : null);
                    svi.l lVar3 = (svi.l) pass;
                    int i6 = lVar3.f265936b;
                    int i21 = lVar3.f265937c;
                    if (i21 > 0) {
                        int i22 = R$string.airport_lounges_home_wallet_private_subtitle;
                        f90.b bVar = jVar.f200589b;
                        Intrinsics.checkNotNullParameter(lVar3, "<this>");
                        textLocalisedClause = new TextLocalisedClause(i22, u.c(bVar.a("{0,spellout}", Integer.valueOf(i21 + 1))), null, 12);
                    } else {
                        textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_home_wallet_unlimited_entries, null, null, 14);
                    }
                    eVarB2.add(new lb(textLocalisedClauseB, textLocalisedClause, lxi.j.a(R$drawable.uikit_icn_24_qr_code), lxi.k.b(lVar3.f265939h), i21 > 0, hb.Dark, WalletPassTarget.Unlimited));
                    if (i6 > 0) {
                        eVarB2.add(new lb(new TextLocalisedQuantityClause(R$plurals.airport_lounges_home_wallet_limited_title, Integer.valueOf(i6), u.c(Integer.valueOf(i6)), (Style) null, 24), new TextLocalisedClause(R$string.airport_lounges_home_wallet_unlimited_subtitle, null, null, 14), lxi.j.a(R$drawable.uikit_icn_24_qr_code), i6 > 1, WalletPassTarget.Extra));
                    }
                    jbVar = new jb(u.a(eVarB2));
                }
                WalletWidgetDelegate.Model model2 = new WalletWidgetDelegate.Model(jbVar, new TextLocalisedQuantityClause(R$plurals.airport_lounges_home_wallet_button, Integer.valueOf(Math.max(1, iL)), zhm.f0.f322471a, (Style) null, 24), animationRequest, 16);
                List list2 = (List) data.getContent();
                return ue0.e.J(model2, v.l(list2 != null ? (koi.j) d0.e0(0, list2) : null));
            case 3:
                t87.l lVar4 = (t87.l) obj9;
                ArrayList<t87.h> arrayList3 = (ArrayList) obj8;
                eel.c selectedPeriod = (eel.c) obj7;
                List availablePeriods = (List) obj6;
                Set set = (Set) obj5;
                List historicalChartList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(historicalChartList, "historicalChartList");
                List list3 = historicalChartList;
                ArrayList arrayList4 = new ArrayList();
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    Iterator it9 = ((eel.e) it8.next()).f125227a.iterator();
                    if (it9.hasNext()) {
                        bigDecimal2 = ((eel.f) ((eel.l) it9.next()).f125239c).f125230a.f126703a;
                        while (it9.hasNext()) {
                            BigDecimal bigDecimal3 = ((eel.f) ((eel.l) it9.next()).f125239c).f125230a.f126703a;
                            if (bigDecimal2.compareTo(bigDecimal3) > 0) {
                                bigDecimal2 = bigDecimal3;
                            }
                        }
                    } else {
                        bigDecimal2 = null;
                    }
                    if (bigDecimal2 != null) {
                        arrayList4.add(bigDecimal2);
                    }
                }
                BigDecimal bigDecimal4 = (BigDecimal) d0.u0(arrayList4);
                float fFloatValue = bigDecimal4 != null ? bigDecimal4.floatValue() : BitmapDescriptorFactory.HUE_RED;
                ArrayList arrayList5 = new ArrayList();
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    Iterator it11 = ((eel.e) it10.next()).f125227a.iterator();
                    if (it11.hasNext()) {
                        bigDecimal = ((eel.f) ((eel.l) it11.next()).f125239c).f125230a.f126703a;
                        while (it11.hasNext()) {
                            BigDecimal bigDecimal5 = ((eel.f) ((eel.l) it11.next()).f125239c).f125230a.f126703a;
                            if (bigDecimal.compareTo(bigDecimal5) < 0) {
                                bigDecimal = bigDecimal5;
                            }
                        }
                    } else {
                        bigDecimal = null;
                    }
                    if (bigDecimal != null) {
                        arrayList5.add(bigDecimal);
                    }
                }
                BigDecimal bigDecimal6 = (BigDecimal) d0.p0(arrayList5);
                float fFloatValue2 = bigDecimal6 != null ? bigDecimal6.floatValue() : 0.0f;
                o oVar = lVar4.f268857a;
                ArrayList arrayList6 = new ArrayList(w.t(arrayList3, 10));
                for (t87.h hVar : arrayList3) {
                    ArrayList<t87.g> arrayList7 = hVar.f268850b;
                    ArrayList arrayList8 = new ArrayList();
                    for (t87.g gVar : arrayList7) {
                        Integer numP = ue8.c.P(gVar.f268847b);
                        Object content = gVar.f268848c.getContent();
                        if (numP == null || content == null) {
                            aVar = null;
                        } else {
                            eel.e eVar3 = (eel.e) content;
                            int iIntValue = numP.intValue();
                            String str = hVar.f268849a;
                            aVar = new t87.a(iIntValue, eVar3, str, gVar.f268847b, selectedPeriod == eel.c.ONE_DAY && set.contains(str));
                        }
                        if (aVar != null) {
                            arrayList8.add(aVar);
                        }
                    }
                    arrayList6.add(arrayList8);
                }
                ArrayList charts = w.u(arrayList6);
                PercentageClause minClause = t87.l.b(fFloatValue);
                PercentageClause maxClause = t87.l.b(fFloatValue2);
                Intrinsics.checkNotNullParameter(charts, "charts");
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
                Intrinsics.checkNotNullParameter(minClause, "minClause");
                Intrinsics.checkNotNullParameter(maxClause, "maxClause");
                ArrayList arrayList9 = new ArrayList(w.t(charts, 10));
                Iterator it12 = charts.iterator();
                while (it12.hasNext()) {
                    List list4 = ((t87.a) it12.next()).f268841b.f125227a;
                    ArrayList arrayList10 = new ArrayList(w.t(list4, 10));
                    Iterator it13 = list4.iterator();
                    while (it13.hasNext()) {
                        arrayList10.add(Long.valueOf(((eel.l) it13.next()).f125238b));
                    }
                    arrayList9.add(arrayList10);
                }
                List listO0 = d0.O0(d0.U(w.u(arrayList9)));
                if (selectedPeriod == eel.c.ONE_DAY || listO0.isEmpty()) {
                    Iterator it14 = charts.iterator();
                    if (!it14.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    long j2 = ((t87.a) it14.next()).f268841b.f125229c;
                    while (it14.hasNext()) {
                        long j3 = j2;
                        long j5 = ((t87.a) it14.next()).f268841b.f125229c;
                        j2 = j3 < j5 ? j5 : j3;
                    }
                    jLongValue = j2;
                } else {
                    jLongValue = ((Number) d0.m0(listO0)).longValue();
                }
                List listP0 = d0.P0(charts, new t87.n());
                ArrayList arrayList11 = new ArrayList(w.t(listP0, 10));
                Iterator it15 = listP0.iterator();
                while (it15.hasNext()) {
                    t87.a aVar2 = (t87.a) it15.next();
                    List<eel.l> list5 = aVar2.f268841b.f125227a;
                    Iterator it16 = it15;
                    ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                    for (eel.l lVar5 : list5) {
                        arrayList12.add(new t87.b(lVar5.f125238b, ((eel.f) lVar5.f125239c).f125230a.f126703a.floatValue()));
                        listO0 = listO0;
                        jLongValue = jLongValue;
                    }
                    List list6 = listO0;
                    long j16 = jLongValue;
                    Float fValueOf = selectedPeriod == eel.c.ONE_DAY ? Float.valueOf(BitmapDescriptorFactory.HUE_RED) : null;
                    if (arrayList12.size() <= 1) {
                        arrayList12 = null;
                    }
                    if (arrayList12 != null) {
                        long jLongValue2 = ((Number) d0.b0(list6)).longValue();
                        float fLongValue = (((Number) d0.m0(list6)).longValue() - jLongValue2) / (j16 - jLongValue2);
                        arrayList = new ArrayList();
                        int i32 = 0;
                        for (Object obj10 : list6) {
                            int i33 = i32 + 1;
                            if (i32 < 0) {
                                v.s();
                                throw null;
                            }
                            long jLongValue3 = ((Number) obj10).longValue();
                            ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                    f = fValueOf;
                                    ListIterator listIterator2 = listIterator;
                                    arrayList2 = arrayList12;
                                    if (((t87.b) objPrevious).f268843a > jLongValue3) {
                                        fValueOf = f;
                                        arrayList12 = arrayList2;
                                        listIterator = listIterator2;
                                    }
                                } else {
                                    f = fValueOf;
                                    arrayList2 = arrayList12;
                                    objPrevious = null;
                                }
                            }
                            t87.b bVar2 = (t87.b) objPrevious;
                            Float fValueOf2 = bVar2 != null ? Float.valueOf(bVar2.f268844b) : f;
                            hw0.k kVar = fValueOf2 != null ? new hw0.k("", fValueOf2.floatValue(), (i32 / v.j(list6)) * fLongValue, (iw0.a) null, (Object) null, (Clause) null, 48) : null;
                            if (kVar != null) {
                                arrayList.add(kVar);
                            }
                            i32 = i33;
                            fValueOf = f;
                            arrayList12 = arrayList2;
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = zhm.f0.f322471a;
                    }
                    arrayList11.add(new hw0.d((List) arrayList, aVar2.e, aVar2.f268840a, 8));
                    it15 = it16;
                    listO0 = list6;
                    jLongValue = j16;
                }
                jm0 jm0Var = new jm0("main-indexes-chart-list-id", null, null, false, null, null, availablePeriods.indexOf(selectedPeriod), false, 230, null, false, false, new z(new hw0.a(fFloatValue, minClause), new hw0.a(fFloatValue2, maxClause), ms0.v.WhiteTransparentBackground, false, true), arrayList11, new l1.c(0), hm0.Thick, null, null, null, null, 0, 0, 0, 0, -62918);
                int i43 = R$attr.uikit_dp8;
                int i59 = oVar.f268861b;
                yp0.b.p(jm0Var, i43, i43, i59, i59);
                FixedTabsDelegate.Model modelB = ((i4h.d) oVar.f268860a).b(selectedPeriod, availablePeriods, Integer.valueOf(availablePeriods.indexOf(selectedPeriod)));
                int i66 = R$attr.uikit_dp0;
                yp0.b.r(modelB, i66, 0, i66, i66, 2);
                return v.k(jm0Var, modelB);
            default:
                Data data2 = (Data) obj9;
                tij.m mVar = (tij.m) obj8;
                Data data3 = (Data) obj7;
                Data data4 = (Data) obj6;
                Data data5 = (Data) obj5;
                List slots = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(slots, "slots");
                return slots.isEmpty() ? tij.m.a(mVar, data3, data4, data5, data2) : (List) iii.c.f(data2, new tif.g(3), new er9.a(slots, 5), new si5.c(data5, slots, mVar));
        }
    }

    public /* synthetic */ f(l lVar, eel.c cVar, iwg.c cVar2, a3 a3Var, WidgetisedAnalyticsType widgetisedAnalyticsType) {
        this.f190340a = 1;
        this.f190341b = lVar;
        this.f190342c = cVar;
        this.d = cVar2;
        this.f = a3Var;
        this.e = widgetisedAnalyticsType;
    }
}
