package jxb;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.rev_points.models.IssuedPoints;
import com.revolut.feature.rev_points.models.PointsSource;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.rev_points.models.RevPointsRichText;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.rev_points.models.TimeInterval;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import dfl.r0;
import hxb.b;
import hxb.e0;
import hxb.i;
import hxb.m0;
import hxb.n;
import hxb.p;
import hxb.q;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.b0;
import m1c.c0;
import m1c.d0;
import m1c.f1;
import m1c.k1;
import m1c.l1;
import m1c.o;
import m1c.o1;
import m1c.r;
import m1c.y;
import m1c.y0;
import m1c.z;
import retrofit2.HttpException;
import yhm.m;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179114a;

    public /* synthetic */ g(int i) {
        this.f179114a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v42, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        Object objA2;
        Object objA3;
        f1 f1Var;
        y0 y0Var;
        Object objA4;
        Object objA5;
        Object objA6;
        hxb.b bVar;
        m1c.f fVar;
        m1c.e eVar;
        ArrayList arrayList;
        m1c.d dVar;
        LinkedHashMap linkedHashMap;
        hxb.b bVar2;
        k1 k1Var;
        r rVar;
        f1 f1Var2;
        ?? arrayList2;
        boolean z = false;
        switch (this.f179114a) {
            case 0:
                hxb.f it8 = (hxb.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new y(gxb.d.j(it8));
            case 1:
                n it9 = (n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return gxb.d.a(it9);
            case 2:
                p it10 = (p) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return gxb.d.i(it10);
            case 3:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Intrinsics.checkNotNullParameter(it11, "<this>");
                List<hxb.d> list = it11;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                for (hxb.d dVar2 : list) {
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    arrayList3.add(new o(dVar2.getId(), dVar2.getTitle(), dVar2.getSubtitle(), qvb.b.a(dVar2.getDescription()), dVar2.getAssetUrl(), dVar2.getDeeplink(), dVar2.getCtaText(), dVar2.getDisclaimer()));
                }
                return arrayList3;
            case 4:
                List issuedPoints = (List) obj2;
                Intrinsics.checkNotNullParameter(issuedPoints, "issuedPoints");
                List<hxb.c> list2 = issuedPoints;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                for (hxb.c cVar : list2) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    String strE = cVar.getId();
                    dj0.d dVarO = mo3.a.o(cVar.getAmount());
                    dj0.d dVarO2 = mo3.a.o(cVar.getUtilisedAmount());
                    dj0.d dVarO3 = mo3.a.o(cVar.getExpiredAmount());
                    try {
                        m.Companion companion = m.INSTANCE;
                        objA = pyd.c.H(pyd.c.H(mo3.a.o(cVar.getAmount()), mo3.a.o(cVar.getUtilisedAmount())), mo3.a.o(cVar.getExpiredAmount()));
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Object objO = mo3.a.o(cVar.getAmount());
                    if (objA instanceof yhm.n) {
                        objA = objO;
                    }
                    dj0.d dVar3 = (dj0.d) objA;
                    m0 m0VarF = cVar.getPeriod();
                    Intrinsics.checkNotNullParameter(m0VarF, "<this>");
                    try {
                        objA2 = Instant.parse(m0VarF.getStartDate());
                    } catch (Throwable th11) {
                        m.Companion companion3 = m.INSTANCE;
                        objA2 = yhm.o.a(th11);
                    }
                    Instant instantNow = Instant.now();
                    if (objA2 instanceof yhm.n) {
                        objA2 = instantNow;
                    }
                    Intrinsics.checkNotNullExpressionValue(objA2, "getOrDefault(...)");
                    Instant instant = (Instant) objA2;
                    try {
                        objA3 = Instant.parse(m0VarF.getEndDate());
                    } catch (Throwable th12) {
                        m.Companion companion4 = m.INSTANCE;
                        objA3 = yhm.o.a(th12);
                    }
                    Instant instantNow2 = Instant.now();
                    if (objA3 instanceof yhm.n) {
                        objA3 = instantNow2;
                    }
                    Intrinsics.checkNotNullExpressionValue(objA3, "getOrDefault(...)");
                    TimeInterval timeInterval = new TimeInterval(instant, (Instant) objA3);
                    hxb.e eVarG = cVar.getSource();
                    Intrinsics.checkNotNullParameter(eVarG, "<this>");
                    String type = eVarG.getType();
                    f1[] f1VarArrValues = f1.values();
                    int length = f1VarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            f1Var = f1VarArrValues[i];
                            if (!a0.z(f1Var.name(), type, true)) {
                                i++;
                            }
                        } else {
                            f1Var = null;
                        }
                    }
                    if (f1Var == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown PointsSource type received from dto: ", eVarG.getType()));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        f1Var = f1.UNKNOWN;
                    }
                    String category = eVarG.getCategory();
                    y0[] y0VarArrValues = y0.values();
                    int length2 = y0VarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            y0Var = y0VarArrValues[i2];
                            if (!a0.z(y0Var.name(), category, true)) {
                                i2++;
                            }
                        } else {
                            y0Var = null;
                        }
                    }
                    if (y0Var == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Unknown PointsSource category received from dto: ", eVarG.getCategory()));
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        y0Var = y0.UNKNOWN;
                    }
                    PointsSource pointsSource = new PointsSource(f1Var, y0Var);
                    try {
                        m.Companion companion5 = m.INSTANCE;
                        objA4 = Instant.parse(cVar.getExpirationDate());
                    } catch (Throwable th13) {
                        m.Companion companion6 = m.INSTANCE;
                        objA4 = yhm.o.a(th13);
                    }
                    Instant instantNow3 = Instant.now();
                    if (objA4 instanceof yhm.n) {
                        objA4 = instantNow3;
                    }
                    Intrinsics.checkNotNullExpressionValue(objA4, "getOrDefault(...)");
                    Instant instant2 = (Instant) objA4;
                    try {
                        objA5 = Instant.parse(cVar.getCreatedDate());
                    } catch (Throwable th14) {
                        m.Companion companion7 = m.INSTANCE;
                        objA5 = yhm.o.a(th14);
                    }
                    Instant instantNow4 = Instant.now();
                    if (objA5 instanceof yhm.n) {
                        objA5 = instantNow4;
                    }
                    Intrinsics.checkNotNullExpressionValue(objA5, "getOrDefault(...)");
                    Instant instant3 = (Instant) objA5;
                    try {
                        objA6 = Instant.parse(cVar.getUpdatedDate());
                    } catch (Throwable th15) {
                        m.Companion companion8 = m.INSTANCE;
                        objA6 = yhm.o.a(th15);
                    }
                    Instant instantNow5 = Instant.now();
                    if (objA6 instanceof yhm.n) {
                        objA6 = instantNow5;
                    }
                    Intrinsics.checkNotNullExpressionValue(objA6, "getOrDefault(...)");
                    arrayList4.add(new IssuedPoints(strE, dVarO, dVarO2, dVarO3, dVar3, timeInterval, pointsSource, instant2, instant3, (Instant) objA6));
                    break;
                }
                return arrayList4;
            case 5:
                hxb.b it12 = (hxb.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Intrinsics.checkNotNullParameter(it12, "<this>");
                o1 o1VarF = it12.getSubtitle();
                RevPointsTextWithLinks revPointsTextWithLinksA = o1VarF != null ? qvb.b.a(o1VarF) : null;
                b.e eVarD = it12.getProgress();
                if (eVarD != null) {
                    String strB = eVarD.getLabel();
                    l1 l1VarC = eVarD.getValue();
                    Intrinsics.checkNotNullParameter(l1VarC, "<this>");
                    String strB2 = l1VarC.getText();
                    Map mapA = l1VarC.getPlaceholders();
                    if (mapA != null) {
                        linkedHashMap = new LinkedHashMap(q0.b(mapA.size()));
                        for (Map.Entry entry : mapA.entrySet()) {
                            Object key = entry.getKey();
                            l1.c cVar2 = (l1.c) entry.getValue();
                            String strB3 = cVar2.getFormatting();
                            k1[] k1VarArrValues = k1.values();
                            int length3 = k1VarArrValues.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length3) {
                                    k1Var = k1VarArrValues[i3];
                                    bVar2 = it12;
                                    if (!a0.z(k1Var.name(), strB3, true)) {
                                        i3++;
                                        it12 = bVar2;
                                    }
                                } else {
                                    bVar2 = it12;
                                    k1Var = null;
                                }
                            }
                            if (k1Var == null) {
                                k1Var = k1.UNKNOWN;
                            }
                            linkedHashMap.put(key, new RevPointsRichText.Placeholder(k1Var, cVar2.getValue(), cVar2.getFallback()));
                            it12 = bVar2;
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    bVar = it12;
                    fVar = new m1c.f(strB, new RevPointsRichText(linkedHashMap, strB2), eVarD.getFraction());
                } else {
                    bVar = it12;
                    fVar = null;
                }
                String strB4 = bVar.getContentSectionTitle();
                List<b.C0896b> listA = bVar.getContentItems();
                ArrayList arrayList5 = new ArrayList(w.t(listA, 10));
                for (b.C0896b c0896b : listA) {
                    b.d dVarB = c0896b.getMarker();
                    if (dVarB != null) {
                        String strB5 = dVarB.getType();
                        m1c.d[] dVarArrValues = m1c.d.values();
                        int length4 = dVarArrValues.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length4) {
                                dVar = dVarArrValues[i5];
                                if (!a0.z(dVar.name(), strB5, true)) {
                                    i5++;
                                }
                            } else {
                                dVar = null;
                            }
                        }
                        if (dVar == null) {
                            IllegalStateException illegalStateException3 = new IllegalStateException(j6.a.q("Unknown Marker.Type value: ", dVarB.getType()));
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                            dVar = m1c.d.UNKNOWN;
                        }
                        eVar = new m1c.e(dVar, dVarB.getIconCode(), dVarB.getValue());
                    } else {
                        eVar = null;
                    }
                    String strE2 = c0896b.getTitle();
                    String strC = c0896b.getSubtitle();
                    List listD = c0896b.getTags();
                    if (listD != null) {
                        List<b.f> list3 = listD;
                        ArrayList arrayList6 = new ArrayList(w.t(list3, 10));
                        for (b.f fVar2 : list3) {
                            arrayList6.add(new m1c.g(fVar2.getIconCode(), fVar2.getText()));
                        }
                        arrayList = arrayList6;
                    } else {
                        arrayList = null;
                    }
                    b.a aVarA = c0896b.getAction();
                    arrayList5.add(new m1c.b(eVar, strE2, strC, arrayList, new m1c.a(aVarA.getDeeplink(), aVarA.getAnalyticsRef())));
                }
                b.c cVarC = bVar.getPrimaryCta();
                m1c.c cVar3 = cVarC != null ? new m1c.c(cVarC.getTitle(), cVarC.getDeeplink()) : null;
                b.c cVarE = bVar.getSecondaryCta();
                return new m1c.h(revPointsTextWithLinksA, fVar, strB4, arrayList5, cVar3, cVarE != null ? new m1c.c(cVarE.getTitle(), cVarE.getDeeplink()) : null);
            case 6:
                hxb.i it13 = (hxb.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Intrinsics.checkNotNullParameter(it13, "<this>");
                String title = it13.getTitle();
                String subtitle = it13.getSubtitle();
                List<i.b> contentItems = it13.getContentItems();
                ArrayList arrayList7 = new ArrayList(w.t(contentItems, 10));
                for (i.b bVar3 : contentItems) {
                    String title2 = bVar3.getTitle();
                    String subtitle2 = bVar3.getSubtitle();
                    String icon = bVar3.getIcon();
                    i.a action = bVar3.getAction();
                    arrayList7.add(new c0(title2, subtitle2, icon, action != null ? gxb.a.a(action) : null));
                }
                b0 b0VarA = gxb.a.a(it13.getPrimaryCta());
                i.a secondaryCta = it13.getSecondaryCta();
                b0 b0VarA2 = secondaryCta != null ? gxb.a.a(secondaryCta) : null;
                ld7.f footerText = it13.getFooterText();
                return new d0(title, subtitle, arrayList7, b0VarA, b0VarA2, footerText != null ? md7.a.a(footerText) : null);
            case 7:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Intrinsics.checkNotNullParameter(it14, "<this>");
                List<q> list4 = it14;
                ArrayList arrayList8 = new ArrayList(w.t(list4, 10));
                for (q qVar : list4) {
                    Intrinsics.checkNotNullParameter(qVar, "<this>");
                    arrayList8.add(new m1c.q0(qVar.getId(), qVar.getTitle(), qVar.getSubtitle(), qVar.getPoints(), qVar.getAssetUrl(), qVar.getIcon(), qVar.getDeeplink(), qVar.getType()));
                }
                return arrayList8;
            case 8:
                LocationDomain lastLocation = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(lastLocation, "lastLocation");
                od0.h hVar = od0.i.Companion;
                co3.a aVar = new co3.a(lastLocation.f78066a, lastLocation.f78067b);
                hVar.getClass();
                return od0.h.a(aVar);
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 10:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (!(throwable instanceof HttpException) || ((HttpException) throwable).code() != 404) {
                    return efm.d0.l(throwable);
                }
                ufm.b bVarM = efm.d0.m(z.a.f201476a);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 11:
                hxb.f it15 = (hxb.f) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return gxb.d.j(it15);
            case 12:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                List<e0> list5 = rates;
                ArrayList arrayList9 = new ArrayList(w.t(list5, 10));
                for (e0 e0Var : list5) {
                    Intrinsics.checkNotNullParameter(e0Var, "<this>");
                    String strD = e0Var.getTier();
                    r[] rVarArrValues = r.values();
                    int length5 = rVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length5) {
                            rVar = rVarArrValues[i6];
                            if (!a0.z(rVar.name(), strD, true)) {
                                i6++;
                            }
                        } else {
                            rVar = null;
                        }
                    }
                    if (rVar == null) {
                        rVar = r.UNKNOWN;
                    }
                    r rVar2 = rVar;
                    String strC2 = e0Var.getProduct();
                    f1[] f1VarArrValues2 = f1.values();
                    int length6 = f1VarArrValues2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 < length6) {
                            f1Var2 = f1VarArrValues2[i21];
                            if (!a0.z(f1Var2.name(), strC2, true)) {
                                i21++;
                            }
                        } else {
                            f1Var2 = null;
                        }
                    }
                    if (f1Var2 == null) {
                        f1Var2 = f1.UNKNOWN;
                    }
                    arrayList9.add(new RevPointsProductRate(rVar2, f1Var2, e0Var.getBooster(), e0Var.getBaseRate()));
                }
                return arrayList9;
            case 13:
                hxb.m challengesBreakdown = (hxb.m) obj2;
                Intrinsics.checkNotNullParameter(challengesBreakdown, "challengesBreakdown");
                Intrinsics.checkNotNullParameter(challengesBreakdown, "<this>");
                List active = challengesBreakdown.getActive();
                ArrayList arrayList10 = new ArrayList(w.t(active, 10));
                Iterator it16 = active.iterator();
                while (it16.hasNext()) {
                    arrayList10.add(gxb.d.k((hxb.l) it16.next(), false));
                }
                List completed = challengesBreakdown.getCompleted();
                ArrayList arrayList11 = new ArrayList(w.t(completed, 10));
                Iterator it17 = completed.iterator();
                while (it17.hasNext()) {
                    arrayList11.add(gxb.d.k((hxb.l) it17.next(), false));
                }
                List preEnrolled = challengesBreakdown.getPreEnrolled();
                if (preEnrolled != null) {
                    List list6 = preEnrolled;
                    arrayList2 = new ArrayList(w.t(list6, 10));
                    Iterator it18 = list6.iterator();
                    while (it18.hasNext()) {
                        arrayList2.add(gxb.d.k((hxb.l) it18.next(), true));
                    }
                } else {
                    arrayList2 = f0.f322471a;
                }
                return new m1c.m0(arrayList10, arrayList11, arrayList2);
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                dvg.a aVar2 = (dvg.a) pair.f186385a;
                dvg.a aVar3 = (dvg.a) pair.f186386b;
                dvg.a aVar4 = dvg.a.ONBOARDED;
                return (aVar2 == aVar4 || aVar3 == aVar4) ? aVar4 : dvg.a.NOT_ONBOARDED;
            case 15:
                whf.p it19 = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return !it19.f297646a.isEmpty() ? dvg.a.ONBOARDED : dvg.a.NOT_ONBOARDED;
            case 16:
                r0 it20 = (r0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f114451b > 0 ? dvg.a.ONBOARDED : dvg.a.NOT_ONBOARDED;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 18:
                jxi.r update = (jxi.r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jxi.r.a(update, null, null, null, null, null, null, null, null, null, null, new AnimationRequest(true), null, null, null, 15359);
            case 19:
                jxi.r update2 = (jxi.r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return jxi.r.a(update2, null, null, null, null, null, null, null, null, null, null, new AnimationRequest(false), null, null, null, 15359);
            case 20:
                TagViewData it21 = (TagViewData) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(it21.k instanceof wwk.d);
            case 21:
                String it22 = (String) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                iy2.b bVar4 = new iy2.b();
                bVar4.f169614a = it22;
                return bVar4;
            case 22:
                Data result = (Data) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                h93.f0 f0Var = (h93.f0) result.getContent();
                if (f0Var != null) {
                    return new Data(new jy2.f(f0Var), result.getError(), result.getLoading());
                }
                return new Data(null, result.getError(), result.getLoading());
            case 23:
                jy6.h update3 = (jy6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return jy6.h.a(update3, null, !update3.f179335b, false, null, 13);
            case 24:
                jy6.h update4 = (jy6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return jy6.h.a(update4, null, false, !update4.f179336c, null, 11);
            case 25:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 28:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                List list7 = tradingAccounts.f105279b;
                if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                    Iterator it23 = list7.iterator();
                    while (true) {
                        if (it23.hasNext()) {
                            if (com.revolut.shared.feature.wealth.models.trading_accounts.b.c((TradingAccountAvailableToOnboard) it23.next())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
        }
    }
}
