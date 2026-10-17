package nfk;

import gfk.a0;
import gfk.j;
import gfk.s;
import gfk.s0;
import gfk.v;
import hha.g;
import hha.g0;
import hha.o;
import hha.p;
import hha.q;
import hha.t0;
import hha.u;
import hha.w;
import hha.x;
import hha.y;
import hha.z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import org.joda.time.Period;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f215085a = r0.k(new Pair("AVAILABLE", g0.AVAILABLE), new Pair("UNAVAILABLE", g0.UNAVAILABLE), new Pair("PENDING", g0.PENDING));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f215086b = r0.k(new Pair("ENABLED", y.ENABLED), new Pair("DISABLED", y.DISABLED), new Pair("INACTIVE", y.INACTIVE), new Pair("PENDING", y.PENDING), new Pair("LOCKED", y.LOCKED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f215087c;

    static {
        w wVar = w.EVERYDAY_BENEFITS;
        f215087c = r0.k(new Pair("everyday", wVar), new Pair("everyday_benefits", wVar), new Pair("travel", w.TRAVEL_BENEFITS), new Pair("insurance", w.INSURANCE_BENEFITS), new Pair("investments", w.INVESTMENTS), new Pair("travel_savings_and_protection", w.TRAVEL_SAVINGS_AND_PROTECTION), new Pair("features_for_you", w.FEATURES_FOR_YOU));
    }

    public static final ArrayList a(String currencyCode, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(d((s) it8.next(), currencyCode));
        }
        return arrayList;
    }

    public static final q b(q qVar) {
        if (qVar.c6() != p.CHANGE_PLAN || qVar.A0().k()) {
            return qVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException("discount has zero fee, but postDiscountOption is CHANGE_PLAN");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static final hha.d c(v vVar) {
        Map featureToggles;
        ?? arrayList;
        jha.c cVar;
        jha.b bVar;
        jha.d dVar;
        Iterator it8;
        y yVar;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        List featureToggles2 = vVar.getFeatureToggles();
        int i = 10;
        if (featureToggles2 != null) {
            List<j> list = featureToggles2;
            int iB = q0.b(zhm.w.t(list, 10));
            if (iB < 16) {
                iB = 16;
            }
            featureToggles = new LinkedHashMap(iB);
            for (j jVar : list) {
                featureToggles.put(jVar.getName(), jVar.getState());
            }
        } else {
            featureToggles = r0.g();
        }
        String id10 = vVar.getId();
        String code = vVar.getCode();
        String displayCode = vVar.getDisplayCode();
        if (displayCode == null) {
            displayCode = "";
        }
        String str = displayCode;
        xi0.a aVar = xi0.b.Companion;
        String currencyCode = vVar.getCurrencyCode();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currencyCode);
        List featureToggles3 = vVar.getFeatureToggles();
        if (featureToggles3 != null) {
            List list2 = featureToggles3;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList.add(f((j) it9.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r112 = arrayList;
        List featureGroups = vVar.getFeatureGroups();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(featureGroups, 10));
        Iterator it10 = featureGroups.iterator();
        while (it10.hasNext()) {
            gfk.e eVar = (gfk.e) it10.next();
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
            w wVar = (w) u1.v(eVar.getName(), f215087c);
            if (wVar == null) {
                wVar = w.UNKNOWN;
            }
            List<String> list3 = eVar.getIb.b.Features java.lang.String();
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, i));
            for (String str2 : list3) {
                String str3 = (String) featureToggles.get(str2);
                u uVar = new u(str2);
                if (str3 != null) {
                    it8 = it10;
                    yVar = (y) u1.t(str3, y.DISABLED, f215086b);
                    if (yVar == null) {
                    }
                    arrayList3.add(new x(uVar, yVar));
                    it10 = it8;
                } else {
                    it8 = it10;
                }
                yVar = y.DISABLED;
                arrayList3.add(new x(uVar, yVar));
                it10 = it8;
            }
            arrayList2.add(new hha.v(wVar, arrayList3));
            i = 10;
        }
        List cardDesigns = vVar.getCardDesigns();
        Intrinsics.checkNotNullParameter(cardDesigns, "<this>");
        List<b93.c> list4 = cardDesigns;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
        for (b93.c cVar2 : list4) {
            Intrinsics.checkNotNullParameter(cVar2, "<this>");
            String code2 = cVar2.getCode();
            Locale locale = Locale.UK;
            arrayList4.add(new b93.j(new b93.b(v0.a.j(locale, "UK", code2, locale, "toUpperCase(...)")), cVar2.getBrand()));
        }
        List billing = vVar.getBilling();
        List listA = billing != null ? a(vVar.getCurrencyCode(), billing) : f0.f322471a;
        List products = vVar.getProducts();
        Intrinsics.checkNotNullParameter(products, "<this>");
        List<a0> list5 = products;
        ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
        for (a0 a0Var : list5) {
            Intrinsics.checkNotNullParameter(a0Var, "<this>");
            oha.c cVar3 = new oha.c(a0Var.getCode());
            oha.e eVar2 = new oha.e(a0Var.getType());
            double fee2 = a0Var.getFee();
            Long limit = a0Var.getLimit();
            boolean recurring = a0Var.getRecurring();
            jo3.a absoluteFee = a0Var.getAbsoluteFee();
            dj0.d dVarO = absoluteFee != null ? mo3.a.o(absoluteFee) : null;
            jo3.a feeMin = a0Var.getFeeMin();
            arrayList5.add(new oha.a(cVar3, eVar2, fee2, limit, recurring, dVarO, feeMin != null ? mo3.a.o(feeMin) : null));
        }
        Period period = vVar.getMinPeriod() != null ? Period.parse(vVar.getMinPeriod()) : null;
        String state = vVar.getState();
        g0 g0Var = state != null ? (g0) u1.u(state, f215085a) : null;
        Integer queuePosition = vVar.getQueuePosition();
        int priority = vVar.getPriority();
        int cardTier = vVar.getCardTier();
        jfk.c cashback = vVar.getCashback();
        if (cashback != null) {
            Intrinsics.checkNotNullParameter(cashback, "<this>");
            BigDecimal smallPercent = cashback.getSmallPercent();
            BigDecimal largePercent = cashback.getLargePercent();
            jfk.b cap = cashback.getCap();
            if (cap != null) {
                Long startDate = cap.getStartDate();
                long amount = cap.getAmount().getAmount();
                xi0.a aVar2 = xi0.b.Companion;
                String currency = cap.getAmount().getCurrency();
                aVar2.getClass();
                bVar = new jha.b(startDate, new dj0.d(amount, xi0.a.a(currency)));
            } else {
                bVar = null;
            }
            LinkedHashMap linkedHashMap = b.f215084a;
            String userRegion = cashback.getUserRegion();
            if (userRegion == null || (dVar = (jha.d) u1.v(userRegion, b.f215084a)) == null) {
                dVar = jha.d.OTHER;
            }
            jha.d dVar2 = dVar;
            jfk.a boost = cashback.getBoost();
            cVar = new jha.c(smallPercent, largePercent, bVar, dVar2, boost != null ? new jha.a(new DateTime(boost.getEndDate()), boost.getLargePc(), boost.getSmallPc()) : null);
        } else {
            cVar = null;
        }
        return new hha.d(id10, code, str, bVarA, r112, arrayList2, arrayList4, listA, arrayList5, period, g0Var, queuePosition, priority, cardTier, cVar, vVar.getIsDefault());
    }

    public static final g d(s sVar, String currencyCode) {
        hha.f fVar;
        p pVar;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Period period = Period.parse(sVar.getPeriod());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        String fixedTermPeriod = sVar.getFixedTermPeriod();
        Period period2 = fixedTermPeriod != null ? Period.parse(fixedTermPeriod) : null;
        long fee2 = sVar.getFee();
        xi0.b.Companion.getClass();
        dj0.d dVar = new dj0.d(fee2, xi0.a.a(currencyCode));
        gfk.c charge = sVar.getCharge();
        o oVarE = charge != null ? e(charge) : null;
        s.a discount = sVar.getDiscount();
        if (discount != null) {
            Intrinsics.checkNotNullParameter(discount, "<this>");
            dj0.d dVar2 = new dj0.d(discount.getFee(), xi0.a.a(discount.getCurrency()));
            gfk.c charge2 = discount.getCharge();
            o oVarE2 = charge2 != null ? e(charge2) : null;
            Integer periodsCount = discount.getPeriodsCount();
            Long endDate = discount.getEndDate();
            String termsUrl = discount.getTermsUrl();
            String postDiscountOption = discount.getPostDiscountOption();
            p[] pVarArrValues = p.values();
            int length = pVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    pVar = null;
                    break;
                }
                pVar = pVarArrValues[i];
                if (kotlin.text.a0.z(pVar.name(), postDiscountOption, true)) {
                    break;
                }
                i++;
            }
            if (pVar == null) {
                pVar = p.KEEP_PLAN;
            }
            fVar = (hha.f) b(new hha.f(periodsCount, endDate, dVar2, oVarE2, termsUrl, pVar));
        } else {
            fVar = null;
        }
        gfk.f freeTrial = sVar.getFreeTrial();
        z zVarG = freeTrial != null ? g(freeTrial) : null;
        jo3.a reward = sVar.getReward();
        dj0.d dVarO = reward != null ? mo3.a.o(reward) : null;
        gfk.b cashbackBoostCampaign = sVar.getCashbackBoostCampaign();
        return new g(period, period2, dVar, oVarE, fVar, zVarG, dVarO, cashbackBoostCampaign != null ? bfk.b.b(cashbackBoostCampaign) : null);
    }

    public static final o e(gfk.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        dj0.d dVarO = mo3.a.o(cVar.getTotal());
        dj0.d dVarO2 = mo3.a.o(cVar.getFee());
        List taxes = cVar.getTaxes();
        if (taxes == null) {
            taxes = f0.f322471a;
        }
        List<s0> list = taxes;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (s0 s0Var : list) {
            Intrinsics.checkNotNullParameter(s0Var, "<this>");
            arrayList.add(new t0(mo3.a.o(s0Var.getValue()), s0Var.getType()));
        }
        return new o(dVarO, dVarO2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final hha.x f(gfk.j r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getName()
            java.lang.String r4 = r4.getState()
            hha.x r1 = new hha.x
            hha.u r2 = new hha.u
            r2.<init>(r0)
            if (r4 == 0) goto L22
            java.lang.Object r0 = nfk.e.f215086b
            hha.y r3 = hha.y.DISABLED
            java.lang.Object r4 = le.u1.t(r4, r3, r0)
            hha.y r4 = (hha.y) r4
            if (r4 != 0) goto L24
        L22:
            hha.y r4 = hha.y.DISABLED
        L24:
            r1.<init>(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nfk.e.f(gfk.j):hha.x");
    }

    public static final z g(gfk.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Period period = Period.parse(fVar.getDuration());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        hha.h0 h0Var = null;
        DateTime dateTime = fVar.getEndDate() != null ? new DateTime(fVar.getEndDate().longValue()) : null;
        String termsUrl = fVar.getTermsUrl();
        String type = fVar.getType();
        if (type != null) {
            hha.h0[] h0VarArrValues = hha.h0.values();
            int length = h0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                hha.h0 h0Var2 = h0VarArrValues[i];
                if (kotlin.text.a0.z(h0Var2.name(), type, true)) {
                    h0Var = h0Var2;
                    break;
                }
                i++;
            }
        }
        return new z(period, dateTime, termsUrl, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final hha.i0 h(gfk.q0 r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.Long r0 = r15.getFee()
            java.lang.String r1 = r15.getCurrency()
            r2 = 0
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
            long r3 = r0.longValue()
            dj0.d r0 = new dj0.d
            xi0.a r5 = xi0.b.Companion
            r5.getClass()
            xi0.b r1 = xi0.a.a(r1)
            r0.<init>(r3, r1)
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 != 0) goto L2f
            dj0.c r0 = dj0.d.Companion
            r0.getClass()
            dj0.d r0 = dj0.d.e
        L2f:
            r7 = r0
            gfk.c r0 = r15.getCharge()
            if (r0 == 0) goto L3c
            hha.o r0 = e(r0)
            r8 = r0
            goto L3d
        L3c:
            r8 = r2
        L3d:
            java.lang.String r0 = r15.getDuration()
            if (r0 == 0) goto L49
            org.joda.time.Period r0 = org.joda.time.Period.parse(r0)
            r4 = r0
            goto L4a
        L49:
            r4 = r2
        L4a:
            java.lang.Long r5 = r15.getStartDate()
            java.lang.Long r6 = r15.getEndDate()
            java.lang.String r9 = r15.getTermsUrl()
            java.lang.String r0 = r15.getPostDiscountOption()
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L7c
            hha.p[] r10 = hha.p.values()
            int r11 = r10.length
            r12 = r1
        L64:
            if (r12 >= r11) goto L76
            r13 = r10[r12]
            java.lang.String r14 = r13.name()
            boolean r14 = kotlin.text.a0.z(r14, r0, r3)
            if (r14 == 0) goto L73
            goto L77
        L73:
            int r12 = r12 + 1
            goto L64
        L76:
            r13 = r2
        L77:
            if (r13 != 0) goto L7a
            goto L7c
        L7a:
            r10 = r13
            goto L7f
        L7c:
            hha.p r13 = hha.p.KEEP_PLAN
            goto L7a
        L7f:
            java.lang.String r15 = r15.getType()
            if (r15 == 0) goto L9d
            hha.h0[] r0 = hha.h0.values()
            int r11 = r0.length
        L8a:
            if (r1 >= r11) goto L9d
            r12 = r0[r1]
            java.lang.String r13 = r12.name()
            boolean r13 = kotlin.text.a0.z(r13, r15, r3)
            if (r13 == 0) goto L9a
            r2 = r12
            goto L9d
        L9a:
            int r1 = r1 + 1
            goto L8a
        L9d:
            r11 = r2
            hha.i0 r3 = new hha.i0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            hha.q r15 = b(r3)
            hha.i0 r15 = (hha.i0) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: nfk.e.h(gfk.q0):hha.i0");
    }

    public static final gfk.c i(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        jo3.a aVarP = mo3.a.p(oVar.f152326a);
        jo3.a aVarP2 = mo3.a.p(oVar.f152327b);
        List<t0> list = oVar.f152328c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (t0 t0Var : list) {
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            jo3.a aVarP3 = mo3.a.p(t0Var.f152340a);
            String strA = t0Var.f152341b.a();
            if (strA == null) {
                strA = "UNKNOWN";
            }
            arrayList.add(new s0(aVarP3, strA));
        }
        return new gfk.c(aVarP, aVarP2, arrayList);
    }
}
