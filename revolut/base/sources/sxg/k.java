package sxg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import cul.j2;
import efm.r;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import kwg.l;
import org.jetbrains.annotations.NotNull;
import s78.n;
import ss4.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @NotNull
    private static final a Companion = new a();
    public static final List d = u.c(o0.f186429a.b(WidgetisedAnalyticsType.Robo.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f266492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f266493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tyg.j f266494c;

    public k(ybl.b instrumentTickerInteractor, l complexAnalyticsInteractor, tyg.j configInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f266492a = instrumentTickerInteractor;
        this.f266493b = complexAnalyticsInteractor;
        this.f266494c = configInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        r1 = mwg.f.a(r2, null, null, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, r1, com.onfido.android.sdk.capture.utils.yearclass.YearClass.CLASS_2015);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Float] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(sxg.k r12, java.util.List r13, iwg.a r14, vyg.e r15) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sxg.k.a(sxg.k, java.util.List, iwg.a, vyg.e):java.util.List");
    }

    public static final Flow b(k kVar, iwg.a aVar, List list) {
        kVar.getClass();
        switch (b.f266486b[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return kVar.f(new a0(14), list);
            case 6:
                List<mwg.f> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (mwg.f crypto : list2) {
                    Intrinsics.checkNotNullParameter(crypto, "crypto");
                    xi0.a aVar2 = xi0.b.Companion;
                    String str = crypto.f209455c;
                    aVar2.getClass();
                    arrayList.add(new rxg.e(xi0.a.a(str), crypto.d, crypto.e, crypto.f209456g));
                }
                return zi0.c.i(arrayList);
            case 7:
                List<mwg.f> list3 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (mwg.f commodity : list3) {
                    Intrinsics.checkNotNullParameter(commodity, "commodity");
                    xi0.a aVar3 = xi0.b.Companion;
                    String str2 = commodity.f209455c;
                    aVar3.getClass();
                    arrayList2.add(new rxg.d(xi0.a.a(str2), commodity.d, commodity.e, commodity.f209456g));
                }
                return zi0.c.i(arrayList2);
            case 8:
                return zi0.c.i(f0.f322471a);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Flow c(k kVar, iwg.a aVar, List list) {
        switch (b.f266486b[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((mwg.k) obj2).f != null) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    String str = ((mwg.k) it8.next()).f;
                    if (str != null) {
                        arrayList3.add(str);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((mwg.k) it9.next()).f209470b);
                }
                return nim.a.v(kVar.i(arrayList3, arrayList4), new n(list, 6));
            case 6:
                List<mwg.k> list2 = list;
                ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                for (mwg.k crypto : list2) {
                    Intrinsics.checkNotNullParameter(crypto, "crypto");
                    xi0.a aVar2 = xi0.b.Companion;
                    String str2 = crypto.f209470b;
                    aVar2.getClass();
                    arrayList5.add(new rxg.e(xi0.a.a(str2), crypto.d, r2.f115082a, crypto.f209471c));
                }
                return zi0.c.i(arrayList5);
            case 7:
                List<mwg.k> list3 = list;
                ArrayList arrayList6 = new ArrayList(w.t(list3, 10));
                for (mwg.k commodity : list3) {
                    Intrinsics.checkNotNullParameter(commodity, "commodity");
                    xi0.a aVar3 = xi0.b.Companion;
                    String str3 = commodity.f209470b;
                    aVar3.getClass();
                    arrayList6.add(new rxg.d(xi0.a.a(str3), commodity.d, r2.f115082a, commodity.f209471c));
                }
                return zi0.c.i(arrayList6);
            case 8:
                return zi0.c.i(f0.f322471a);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final go.g d(k kVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            iwg.a aVar = ((mwg.f) obj2).f209453a;
            Object arrayList = linkedHashMap.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(aVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            iwg.a aVar2 = (iwg.a) entry.getKey();
            List list2 = (List) entry.getValue();
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj3 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i == 0 ? ((mwg.f) obj3).d : pyd.c.O(dVarO, ((mwg.f) obj3).d);
                i = i2;
            }
            Iterator it8 = list2.iterator();
            double d5 = 0.0d;
            while (it8.hasNext()) {
                d5 += (double) ((mwg.f) it8.next()).e;
            }
            arrayList2.add(new rxg.g(aVar2, dVarO, (float) d5, null));
        }
        return zi0.c.i(arrayList2);
    }

    public static final go.g e(k kVar, List list, iwg.c calculationMethod, WidgetisedAnalyticsType analyticsType, eel.c timeSpan) {
        List<mwg.f> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (mwg.f contributor : list2) {
            Intrinsics.checkNotNullParameter(contributor, "contributor");
            Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            arrayList.add(new rxg.h(ta6.a.c0(contributor.f209455c), calculationMethod, analyticsType, timeSpan, contributor.d, contributor.e, contributor.f209456g));
        }
        return zi0.c.i(arrayList);
    }

    public final akg.n f(Function2 function2, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((mwg.f) obj2).f209457h != null) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            String str = ((mwg.f) it8.next()).f209457h;
            if (str != null) {
                arrayList3.add(str);
            }
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((mwg.f) it9.next()).f209455c);
        }
        return nim.a.v(i(arrayList3, arrayList4), new sx2.h(list, function2, 6));
    }

    public final Flow g(WidgetisedAnalyticsType analyticsType, final List analyticsProductTypes, final eel.c timeSpan, final iwg.c method, vyg.e category) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(category, "category");
        boolean z = category == vyg.e.SECTOR;
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        final l lVar = this.f266493b;
        final boolean z3 = z;
        return xam.a.h(new j2(category, this, method, analyticsType, timeSpan, (Continuation) null, 3), lVar.g(new Function2() { // from class: kwg.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String userId = (String) obj2;
                xi0.b currency = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                l lVar2 = lVar;
                wvg.k kVar = lVar2.f190362p;
                Instant to6 = ((l80.f) lVar2.f190360m).b();
                kVar.getClass();
                Intrinsics.checkNotNullParameter(userId, "userId");
                List analyticsProductTypes2 = analyticsProductTypes;
                Intrinsics.checkNotNullParameter(analyticsProductTypes2, "analyticsProductTypes");
                eel.c timeSpan2 = timeSpan;
                Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
                iwg.c method2 = method;
                Intrinsics.checkNotNullParameter(method2, "method");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(currency, "currency");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return kVar.d.b(new wvg.d(userId, timeSpan2, analyticsProductTypes2, currency, method2, z3, to6), loadingStrategy);
            }
        }));
    }

    public final Flow h(WidgetisedAnalyticsType analyticsType, eel.c timeSpan, iwg.c method, vyg.e category) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(category, "category");
        tyg.j jVar = this.f266494c;
        if (!jVar.h(analyticsType)) {
            return vkm.i.f290039a;
        }
        iwg.a aVarC = jVar.c(analyticsType);
        boolean z = category == vyg.e.SECTOR;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        l lVar = this.f266493b;
        return xam.a.h(new h(0, category, this, aVarC, method, analyticsType, timeSpan, null), rd0.e.b(lVar.e(analyticsType, new g5b.k(lVar, timeSpan, method, z, analyticsType, 2))));
    }

    public final vkm.d i(ArrayList arrayList, ArrayList symbols) {
        r rVarJ;
        r rVarJ2;
        boolean zIsEmpty = arrayList.isEmpty();
        ybl.b bVar = this.f266492a;
        if (zIsEmpty) {
            rVarJ = zi0.c.j(f0.f322471a);
        } else {
            rVarJ = rd0.e.c(((ael.k) bVar).l(d0.i1(arrayList)), kotlin.coroutines.g.f186406a);
        }
        if (symbols.isEmpty()) {
            rVarJ2 = zi0.c.j(f0.f322471a);
        } else {
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            rVarJ2 = nim.a.w(ybl.b.c((ael.k) bVar), new a26.j(symbols, 8));
        }
        return rd0.e.b(kli.a.h(rVarJ, rVarJ2));
    }
}
