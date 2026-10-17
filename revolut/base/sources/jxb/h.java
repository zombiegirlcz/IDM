package jxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsService;
import com.revolut.feature.rev_points.models.EarnOptionsBottomSheetParams;
import com.revolut.feature.rev_points.models.IssuedPoints;
import com.revolut.feature.rev_points.models.PointsSource;
import com.revolut.feature.rev_points.models.RevPointsEarningBreakdown;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.rev_points.models.RevPointsRichText;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.rev_points.models.TimeInterval;
import efm.d0;
import hxb.n;
import hxb.p;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import m1c.b0;
import m1c.c0;
import m1c.e0;
import m1c.f1;
import m1c.k1;
import m1c.m0;
import m1c.m1;
import m1c.o;
import m1c.p1;
import m1c.q0;
import m1c.r;
import m1c.x;
import m1c.y;
import m1c.y0;
import m1c.z;
import vxb.a;
import vxb.e;
import vxb.g0;
import vxb.h;
import yhm.m;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f179116b;

    public /* synthetic */ h(l lVar, int i) {
        this.f179115a = i;
        this.f179116b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        Object objA;
        Object objA2;
        Object objA3;
        f1 f1Var;
        y0 y0Var;
        Object objA4;
        Object objA5;
        Object objA6;
        vxb.a aVar;
        m1c.f fVar;
        m1c.e eVar;
        ArrayList arrayList2;
        m1c.d dVar;
        LinkedHashMap linkedHashMap;
        vxb.a aVar2;
        k1 k1Var;
        r rVar;
        f1 f1Var2;
        int i = this.f179115a;
        l lVar = this.f179116b;
        switch (i) {
            case 0:
                hxb.l challenge = (hxb.l) obj2;
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                efm.b bVarG = lVar.f179130l.g(Unit.f186387a, false);
                ufm.b bVarM = d0.m(gxb.d.k(challenge, false));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarG.f(bVarM);
            case 1:
                x xVar = (x) obj2;
                w4l.f fVar2 = lVar.e;
                Unit unit = Unit.f186387a;
                Intrinsics.h(xVar);
                fVar2.j(unit, new y(xVar));
                return unit;
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (RevPointsEarningBreakdown) lVar.f179126c.get("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY");
            case 3:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                n nVar = (n) lVar.f179125b.T2("REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", l.f179121p);
                if (nVar != null) {
                    return gxb.d.a(nVar);
                }
                return null;
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) lVar.f179126c.get("REV_POINTS_EARNING_RATES_MEM_KEY");
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                p pVar = (p) j6.a.k(p.class, lVar.f179125b, "REV_POINTS_EARNING_RATES_STORAGE_KEY");
                if (pVar != null) {
                    return gxb.d.i(pVar);
                }
                return null;
            case 6:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (z) lVar.f179126c.get("REV_POINTS_ACCOUNT_MEM_KEY");
            case 7:
                m1c.p learnType = (m1c.p) obj2;
                Intrinsics.checkNotNullParameter(learnType, "learnType");
                return (List) v7.r("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType.name(), lVar.f179126c);
            case 8:
                ArrayList arrayList3 = null;
                m1c.p learnType2 = (m1c.p) obj2;
                Intrinsics.checkNotNullParameter(learnType2, "learnType");
                List list = (List) p.a.j(vxb.c.class, KTypeProjection.INSTANCE, List.class, lVar.f179125b, j6.a.q("LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY", learnType2.name()));
                if (list != null) {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    List<vxb.c> list2 = list;
                    arrayList3 = new ArrayList(w.t(list2, 10));
                    for (vxb.c cVar : list2) {
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        arrayList3.add(new o(cVar.getId(), cVar.getTitle(), cVar.getSubtitle(), qvb.b.b(cVar.getDescription()), cVar.getAssetUrl(), cVar.getDeeplink(), cVar.getCtaText(), cVar.getDisclaimer()));
                    }
                }
                return arrayList3;
            case 9:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (List) lVar.f179126c.get("REV_POINTS_FEATURED_REWARDS_MEM_KEY");
            case 10:
                ArrayList arrayList4 = null;
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                List list3 = (List) p.a.j(vxb.l.class, KTypeProjection.INSTANCE, List.class, lVar.f179125b, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY");
                if (list3 != null) {
                    Intrinsics.checkNotNullParameter(list3, "<this>");
                    List<vxb.l> list4 = list3;
                    arrayList4 = new ArrayList(w.t(list4, 10));
                    for (vxb.l lVar2 : list4) {
                        Intrinsics.checkNotNullParameter(lVar2, "<this>");
                        arrayList4.add(new q0(lVar2.getId(), lVar2.getTitle(), lVar2.getSubtitle(), lVar2.getPoints(), lVar2.getAssetUrl(), lVar2.getIcon(), lVar2.getDeeplink(), lVar2.getType()));
                    }
                }
                return arrayList4;
            case 11:
                e0 context = (e0) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                return (m1c.d0) v7.r("REV_POINTS_BOTTOM_SHEET_MEM_KEY", context.name(), lVar.f179126c);
            case 12:
                e0 context2 = (e0) obj2;
                Intrinsics.checkNotNullParameter(context2, "context");
                vxb.h hVar = (vxb.h) j6.a.k(vxb.h.class, lVar.f179125b, j6.a.q("REV_POINTS_BOTTOM_SHEET_STORAGE_KEY", context2.name()));
                if (hVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                String title = hVar.getTitle();
                String subtitle = hVar.getSubtitle();
                List<h.b> contentItems = hVar.getContentItems();
                ArrayList arrayList5 = new ArrayList(w.t(contentItems, 10));
                for (h.b bVar : contentItems) {
                    String title2 = bVar.getTitle();
                    String subtitle2 = bVar.getSubtitle();
                    String icon = bVar.getIcon();
                    h.a action = bVar.getAction();
                    arrayList5.add(new c0(title2, subtitle2, icon, action != null ? gxb.a.b(action) : null));
                }
                b0 b0VarB = gxb.a.b(hVar.getPrimaryCta());
                h.a secondaryCta = hVar.getSecondaryCta();
                b0 b0VarB2 = secondaryCta != null ? gxb.a.b(secondaryCta) : null;
                ld7.f footerText = hVar.getFooterText();
                return new m1c.d0(title, subtitle, arrayList5, b0VarB, b0VarB2, footerText != null ? md7.a.a(footerText) : null);
            case 13:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (m0) lVar.f179126c.get("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY");
            case 14:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                vxb.k kVar = (vxb.k) lVar.f179125b.T2("REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", l.f179122q);
                if (kVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                List active = kVar.getActive();
                ArrayList arrayList6 = new ArrayList(w.t(active, 10));
                Iterator it13 = active.iterator();
                while (it13.hasNext()) {
                    arrayList6.add(gxb.d.l((vxb.j) it13.next(), false));
                }
                List completed = kVar.getCompleted();
                ArrayList arrayList7 = new ArrayList(w.t(completed, 10));
                Iterator it14 = completed.iterator();
                while (it14.hasNext()) {
                    arrayList7.add(gxb.d.l((vxb.j) it14.next(), false));
                }
                List preEnrolled = kVar.getPreEnrolled();
                if (preEnrolled != null) {
                    List list5 = preEnrolled;
                    arrayList = new ArrayList(w.t(list5, 10));
                    Iterator it15 = list5.iterator();
                    while (it15.hasNext()) {
                        arrayList.add(gxb.d.l((vxb.j) it15.next(), true));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                return new m0(arrayList6, arrayList7, arrayList);
            case 15:
                m1c.w wVar = null;
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                vxb.e eVar2 = (vxb.e) j6.a.k(vxb.e.class, lVar.f179125b, "REV_POINTS_ACCOUNT_STORAGE_KEY");
                if (eVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                if (!(eVar2 instanceof e.a)) {
                    if (eVar2.equals(e.b.f292940a)) {
                        return z.a.f201476a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                e.a aVar3 = (e.a) eVar2;
                String pointsAccountId = aVar3.getPointsAccountId();
                String state = aVar3.getState();
                m1c.w[] wVarArrValues = m1c.w.values();
                int length = wVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        m1c.w wVar2 = wVarArrValues[i2];
                        if (a0.z(wVar2.name(), state, true)) {
                            wVar = wVar2;
                        } else {
                            i2++;
                        }
                    }
                }
                if (wVar == null) {
                    wVar = m1c.w.UNKNOWN;
                }
                return new y(new x(pointsAccountId, wVar, qvb.a.a(aVar3.getBalance()), qvb.a.a(aVar3.getTotalAward()), qvb.a.a(aVar3.getTotalRedeemed()), hx7.a.v(aVar3.getTotalRedeemedCash()), aVar3.getEarnedPointsMultiplier(), aVar3.getActivationDate()));
            case 16:
                return (List) lVar.f179126c.get("ISSUED_POINTS_MEM_KEY" + ((Boolean) obj2).booleanValue());
            case 17:
                int i3 = 0;
                List list6 = (List) lVar.f179125b.T2(com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", ((Boolean) obj2).booleanValue()), l.f179123r);
                if (list6 == null) {
                    return null;
                }
                List<vxb.b> list7 = list6;
                ArrayList arrayList8 = new ArrayList(w.t(list7, 10));
                for (vxb.b bVar2 : list7) {
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    String id10 = bVar2.getId();
                    dj0.d dVarV = hx7.a.v(bVar2.getAmount());
                    dj0.d dVarV2 = hx7.a.v(bVar2.getUtilisedAmount());
                    dj0.d dVarV3 = hx7.a.v(bVar2.getExpiredAmount());
                    try {
                        m.Companion companion = m.INSTANCE;
                        objA = pyd.c.H(pyd.c.H(hx7.a.v(bVar2.getAmount()), hx7.a.v(bVar2.getUtilisedAmount())), hx7.a.v(bVar2.getExpiredAmount()));
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Object objV = hx7.a.v(bVar2.getAmount());
                    if (objA instanceof yhm.n) {
                        objA = objV;
                    }
                    dj0.d dVar2 = (dj0.d) objA;
                    g0 period = bVar2.getPeriod();
                    Intrinsics.checkNotNullParameter(period, "<this>");
                    try {
                        objA2 = Instant.parse(period.getStartDate());
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
                        objA3 = Instant.parse(period.getEndDate());
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
                    vxb.d source = bVar2.getSource();
                    Intrinsics.checkNotNullParameter(source, "<this>");
                    String type = source.getType();
                    f1[] f1VarArrValues = f1.values();
                    int length2 = f1VarArrValues.length;
                    int i5 = i3;
                    while (true) {
                        if (i5 < length2) {
                            f1Var = f1VarArrValues[i5];
                            if (!a0.z(f1Var.name(), type, true)) {
                                i5++;
                            }
                        } else {
                            f1Var = null;
                        }
                    }
                    if (f1Var == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown PointsSource type received from entity: ", source.getType()));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        f1Var = f1.UNKNOWN;
                    }
                    String category = source.getCategory();
                    y0[] y0VarArrValues = y0.values();
                    int length3 = y0VarArrValues.length;
                    int i6 = i3;
                    while (true) {
                        if (i6 < length3) {
                            y0Var = y0VarArrValues[i6];
                            if (!a0.z(y0Var.name(), category, true)) {
                                i6++;
                            }
                        } else {
                            y0Var = null;
                        }
                    }
                    if (y0Var == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Unknown PointsSource category received from entity: ", source.getCategory()));
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        y0Var = y0.UNKNOWN;
                    }
                    PointsSource pointsSource = new PointsSource(f1Var, y0Var);
                    try {
                        m.Companion companion5 = m.INSTANCE;
                        objA4 = Instant.parse(bVar2.getExpirationDate());
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
                        objA5 = Instant.parse(bVar2.getCreatedDate());
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
                        objA6 = Instant.parse(bVar2.getUpdatedDate());
                    } catch (Throwable th15) {
                        m.Companion companion8 = m.INSTANCE;
                        objA6 = yhm.o.a(th15);
                    }
                    Instant instantNow5 = Instant.now();
                    if (objA6 instanceof yhm.n) {
                        objA6 = instantNow5;
                    }
                    Intrinsics.checkNotNullExpressionValue(objA6, "getOrDefault(...)");
                    arrayList8.add(new IssuedPoints(id10, dVarV, dVarV2, dVarV3, dVar2, timeInterval, pointsSource, instant2, instant3, (Instant) objA6));
                    i3 = 0;
                    break;
                }
                return arrayList8;
            case 18:
                EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (m1c.h) v7.r("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY", l.b(params), lVar.f179126c);
            case 19:
                EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                vxb.a aVar4 = (vxb.a) j6.a.k(vxb.a.class, lVar.f179125b, j6.a.q("EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY", l.b(params2)));
                if (aVar4 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar4, "<this>");
                p1 subtitle3 = aVar4.getSubtitle();
                RevPointsTextWithLinks revPointsTextWithLinksB = subtitle3 != null ? qvb.b.b(subtitle3) : null;
                a.e progress = aVar4.getProgress();
                if (progress != null) {
                    String label = progress.getLabel();
                    m1 value = progress.getValue();
                    Intrinsics.checkNotNullParameter(value, "<this>");
                    String text = value.getText();
                    Map placeholders = value.getPlaceholders();
                    if (placeholders != null) {
                        linkedHashMap = new LinkedHashMap(zhm.q0.b(placeholders.size()));
                        for (Map.Entry entry : placeholders.entrySet()) {
                            Object key = entry.getKey();
                            m1.a aVar5 = (m1.a) entry.getValue();
                            String formatting = aVar5.getFormatting();
                            k1[] k1VarArrValues = k1.values();
                            int length4 = k1VarArrValues.length;
                            int i21 = 0;
                            while (true) {
                                if (i21 < length4) {
                                    k1Var = k1VarArrValues[i21];
                                    aVar2 = aVar4;
                                    if (!a0.z(k1Var.name(), formatting, true)) {
                                        i21++;
                                        aVar4 = aVar2;
                                    }
                                } else {
                                    aVar2 = aVar4;
                                    k1Var = null;
                                }
                            }
                            if (k1Var == null) {
                                k1Var = k1.UNKNOWN;
                            }
                            linkedHashMap.put(key, new RevPointsRichText.Placeholder(k1Var, aVar5.getValue(), aVar5.getFallback()));
                            aVar4 = aVar2;
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    aVar = aVar4;
                    fVar = new m1c.f(label, new RevPointsRichText(linkedHashMap, text), progress.getFraction());
                } else {
                    aVar = aVar4;
                    fVar = null;
                }
                String contentSectionTitle = aVar.getContentSectionTitle();
                List<a.b> contentItems2 = aVar.getContentItems();
                ArrayList arrayList9 = new ArrayList(w.t(contentItems2, 10));
                for (a.b bVar3 : contentItems2) {
                    a.d marker = bVar3.getMarker();
                    if (marker != null) {
                        String type2 = marker.getType();
                        m1c.d[] dVarArrValues = m1c.d.values();
                        int length5 = dVarArrValues.length;
                        int i22 = 0;
                        while (true) {
                            if (i22 < length5) {
                                dVar = dVarArrValues[i22];
                                if (!a0.z(dVar.name(), type2, true)) {
                                    i22++;
                                }
                            } else {
                                dVar = null;
                            }
                        }
                        if (dVar == null) {
                            IllegalStateException illegalStateException3 = new IllegalStateException(j6.a.q("Unknown Marker.Type value: ", marker.getType()));
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                            dVar = m1c.d.UNKNOWN;
                        }
                        eVar = new m1c.e(dVar, marker.getIconCode(), marker.getValue());
                    } else {
                        eVar = null;
                    }
                    String title3 = bVar3.getTitle();
                    String subtitle4 = bVar3.getSubtitle();
                    List tags = bVar3.getTags();
                    if (tags != null) {
                        List<a.f> list8 = tags;
                        ArrayList arrayList10 = new ArrayList(w.t(list8, 10));
                        for (a.f fVar3 : list8) {
                            arrayList10.add(new m1c.g(fVar3.getIconCode(), fVar3.getText()));
                        }
                        arrayList2 = arrayList10;
                    } else {
                        arrayList2 = null;
                    }
                    a.C1622a action2 = bVar3.getAction();
                    arrayList9.add(new m1c.b(eVar, title3, subtitle4, arrayList2, new m1c.a(action2.getDeeplink(), action2.getAnalyticsRef())));
                }
                a.c primaryCta = aVar.getPrimaryCta();
                m1c.c cVar2 = primaryCta != null ? new m1c.c(primaryCta.getTitle(), primaryCta.getDeeplink()) : null;
                a.c secondaryCta2 = aVar.getSecondaryCta();
                return new m1c.h(revPointsTextWithLinksB, fVar, contentSectionTitle, arrayList9, cVar2, secondaryCta2 != null ? new m1c.c(secondaryCta2.getTitle(), secondaryCta2.getDeeplink()) : null);
            case 20:
                Unit it17 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (List) lVar.f179126c.get("REV_POINTS_PRODUCT_RATES_MEM_KEY");
            case 21:
                Unit it18 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                List list9 = (List) lVar.f179125b.T2("REV_POINTS_PRODUCT_RATES_STORAGE_KEY", l.o);
                if (list9 == null) {
                    return null;
                }
                List<vxb.x> list10 = list9;
                ArrayList arrayList11 = new ArrayList(w.t(list10, 10));
                for (vxb.x xVar2 : list10) {
                    Intrinsics.checkNotNullParameter(xVar2, "<this>");
                    String tier = xVar2.getTier();
                    r[] rVarArrValues = r.values();
                    int length6 = rVarArrValues.length;
                    int i32 = 0;
                    while (true) {
                        if (i32 < length6) {
                            rVar = rVarArrValues[i32];
                            if (!a0.z(rVar.name(), tier, true)) {
                                i32++;
                            }
                        } else {
                            rVar = null;
                        }
                    }
                    if (rVar == null) {
                        rVar = r.UNKNOWN;
                    }
                    r rVar2 = rVar;
                    String product = xVar2.getProduct();
                    f1[] f1VarArrValues2 = f1.values();
                    int length7 = f1VarArrValues2.length;
                    int i33 = 0;
                    while (true) {
                        if (i33 < length7) {
                            f1Var2 = f1VarArrValues2[i33];
                            if (!a0.z(f1Var2.name(), product, true)) {
                                i33++;
                            }
                        } else {
                            f1Var2 = null;
                        }
                    }
                    if (f1Var2 == null) {
                        f1Var2 = f1.UNKNOWN;
                    }
                    arrayList11.add(new RevPointsProductRate(rVar2, f1Var2, xVar2.getBooster(), xVar2.getBaseRate()));
                }
                return arrayList11;
            default:
                od0.i locationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(locationOptional, "locationOptional");
                RevPointsService revPointsService = lVar.f179124a;
                co3.a aVar6 = (co3.a) locationOptional.f224257a;
                return new ufm.i(revPointsService.getRevPointsFeaturedRewards(aVar6 != null ? aVar6.f25486a + "," + aVar6.f25487b : null).s(hhm.f.f152431c), new ju0.f(20, new g(7)), 1);
        }
    }
}
