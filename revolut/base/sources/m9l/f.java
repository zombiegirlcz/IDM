package m9l;

import com.revolut.shared.feature.rates.impl.network.RatesService;
import efm.d0;
import efm.r;
import io3.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk7.n;
import m9d.l0;
import org.bouncycastle.asn1.BERTags;
import org.joda.time.DateTime;
import ufm.i;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RatesService f203836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9l.b f203837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f203838c;
    public final w4l.f d;
    public final qe0.f e;

    public f(RatesService ratesService, f9l.b ratesCacheDao) {
        Intrinsics.checkNotNullParameter(ratesService, "ratesService");
        Intrinsics.checkNotNullParameter(ratesCacheDao, "ratesCacheDao");
        this.f203836a = ratesService;
        this.f203837b = ratesCacheDao;
        this.f203838c = new ConcurrentHashMap();
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: m9l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f203827b;

            {
                this.f203827b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listU = h.u(params);
                        if (listU == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        f fVar = this.f203827b;
                        d0<List<l9l.a>> bidExchangeRates = fVar.f203836a.getBidExchangeRates(listU);
                        m78.e eVar = new m78.e(new imk.e(fVar, params, 10), 4);
                        bidExchangeRates.getClass();
                        i iVar = new i(bidExchangeRates, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<g> rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        for (g gVar : rates) {
                            this.f203827b.f203838c.compute(gVar.f203839a.f213664g, new c(new m84.e(gVar, 3), 0));
                        }
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        f9l.b bVar = this.f203827b.f203837b;
                        List<g> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (g gVar2 : list) {
                            n9l.a aVar = gVar2.f203839a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String from = aVar.f213661a.f306286a;
                            String to6 = aVar.f213662b.f306286a;
                            double d = aVar.f213663c;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Boolean bool = aVar.d;
                            DateTime dateTime = aVar.e;
                            DateTime dateTime2 = aVar.f;
                            Intrinsics.checkNotNullParameter(from, "from");
                            Intrinsics.checkNotNullParameter(to6, "to");
                            Double d5 = gVar2.f203840b;
                            Intrinsics.checkNotNullParameter(from, "from");
                            Intrinsics.checkNotNullParameter(to6, "to");
                            arrayList.add(new f9l.e(from, to6, d, d5, jCurrentTimeMillis, bool, dateTime, dateTime2));
                        }
                        bVar.a(arrayList);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: m9l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f203829b;

            {
                this.f203829b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f203829b.f203838c;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            g gVar = (g) concurrentHashMap.get((Pair) it8.next());
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                        }
                        if (arrayList.size() < params.size()) {
                            return null;
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set = params;
                        ArrayList arrayList2 = new ArrayList(w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        List listC = this.f203829b.f203837b.c(arrayList2, arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it11 = listC.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                if (arrayList4.size() < params.size()) {
                                    return null;
                                }
                                return arrayList4;
                            }
                            f9l.e eVar = (f9l.e) it11.next();
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            xi0.a aVar = xi0.b.Companion;
                            String str = eVar.f132995a;
                            aVar.getClass();
                            n9l.a aVar2 = new n9l.a(xi0.a.a(str), xi0.a.a(eVar.f132996b), eVar.f132997c, eVar.f, eVar.f132998g, eVar.f132999h);
                            g gVar2 = params.contains(aVar2.f213664g) ? new g(aVar2, eVar.d) : null;
                            if (gVar2 != null) {
                                arrayList4.add(gVar2);
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listU = h.u(params);
                        if (listU == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<l9l.a>> bidExchangeRates = this.f203829b.f203836a.getBidExchangeRates(listU);
                        m78.e eVar2 = new m78.e(new l0(29), 5);
                        bidExchangeRates.getClass();
                        i iVar = new i(bidExchangeRates, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: m9l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f203827b;

            {
                this.f203827b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listU = h.u(params);
                        if (listU == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        f fVar = this.f203827b;
                        d0<List<l9l.a>> bidExchangeRates = fVar.f203836a.getBidExchangeRates(listU);
                        m78.e eVar = new m78.e(new imk.e(fVar, params, 10), 4);
                        bidExchangeRates.getClass();
                        i iVar = new i(bidExchangeRates, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<g> rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        for (g gVar : rates) {
                            this.f203827b.f203838c.compute(gVar.f203839a.f213664g, new c(new m84.e(gVar, 3), 0));
                        }
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        f9l.b bVar = this.f203827b.f203837b;
                        List<g> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (g gVar2 : list) {
                            n9l.a aVar = gVar2.f203839a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String from = aVar.f213661a.f306286a;
                            String to6 = aVar.f213662b.f306286a;
                            double d = aVar.f213663c;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Boolean bool = aVar.d;
                            DateTime dateTime = aVar.e;
                            DateTime dateTime2 = aVar.f;
                            Intrinsics.checkNotNullParameter(from, "from");
                            Intrinsics.checkNotNullParameter(to6, "to");
                            Double d5 = gVar2.f203840b;
                            Intrinsics.checkNotNullParameter(from, "from");
                            Intrinsics.checkNotNullParameter(to6, "to");
                            arrayList.add(new f9l.e(from, to6, d, d5, jCurrentTimeMillis, bool, dateTime, dateTime2));
                        }
                        bVar.a(arrayList);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: m9l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f203829b;

            {
                this.f203829b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f203829b.f203838c;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            g gVar = (g) concurrentHashMap.get((Pair) it8.next());
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                        }
                        if (arrayList.size() < params.size()) {
                            return null;
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set = params;
                        ArrayList arrayList2 = new ArrayList(w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        List listC = this.f203829b.f203837b.c(arrayList2, arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it11 = listC.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                if (arrayList4.size() < params.size()) {
                                    return null;
                                }
                                return arrayList4;
                            }
                            f9l.e eVar = (f9l.e) it11.next();
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            xi0.a aVar = xi0.b.Companion;
                            String str = eVar.f132995a;
                            aVar.getClass();
                            n9l.a aVar2 = new n9l.a(xi0.a.a(str), xi0.a.a(eVar.f132996b), eVar.f132997c, eVar.f, eVar.f132998g, eVar.f132999h);
                            g gVar2 = params.contains(aVar2.f213664g) ? new g(aVar2, eVar.d) : null;
                            if (gVar2 != null) {
                                arrayList4.add(gVar2);
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listU = h.u(params);
                        if (listU == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<l9l.a>> bidExchangeRates = this.f203829b.f203836a.getBidExchangeRates(listU);
                        m78.e eVar2 = new m78.e(new l0(29), 5);
                        bidExchangeRates.getClass();
                        i iVar = new i(bidExchangeRates, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: m9l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f203827b;

            {
                this.f203827b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listU = h.u(params);
                        if (listU == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        f fVar = this.f203827b;
                        d0<List<l9l.a>> bidExchangeRates = fVar.f203836a.getBidExchangeRates(listU);
                        m78.e eVar = new m78.e(new imk.e(fVar, params, 10), 4);
                        bidExchangeRates.getClass();
                        i iVar = new i(bidExchangeRates, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<g> rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        for (g gVar : rates) {
                            this.f203827b.f203838c.compute(gVar.f203839a.f213664g, new c(new m84.e(gVar, 3), 0));
                        }
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        f9l.b bVar = this.f203827b.f203837b;
                        List<g> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (g gVar2 : list) {
                            n9l.a aVar = gVar2.f203839a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String from = aVar.f213661a.f306286a;
                            String to6 = aVar.f213662b.f306286a;
                            double d = aVar.f213663c;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Boolean bool = aVar.d;
                            DateTime dateTime = aVar.e;
                            DateTime dateTime2 = aVar.f;
                            Intrinsics.checkNotNullParameter(from, "from");
                            Intrinsics.checkNotNullParameter(to6, "to");
                            Double d5 = gVar2.f203840b;
                            Intrinsics.checkNotNullParameter(from, "from");
                            Intrinsics.checkNotNullParameter(to6, "to");
                            arrayList.add(new f9l.e(from, to6, d, d5, jCurrentTimeMillis, bool, dateTime, dateTime2));
                        }
                        bVar.a(arrayList);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 2;
        this.e = new qe0.f(new Function1(this) { // from class: m9l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f203829b;

            {
                this.f203829b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f203829b.f203838c;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            g gVar = (g) concurrentHashMap.get((Pair) it8.next());
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                        }
                        if (arrayList.size() < params.size()) {
                            return null;
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set = params;
                        ArrayList arrayList2 = new ArrayList(w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        List listC = this.f203829b.f203837b.c(arrayList2, arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it11 = listC.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                if (arrayList4.size() < params.size()) {
                                    return null;
                                }
                                return arrayList4;
                            }
                            f9l.e eVar = (f9l.e) it11.next();
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            xi0.a aVar = xi0.b.Companion;
                            String str = eVar.f132995a;
                            aVar.getClass();
                            n9l.a aVar2 = new n9l.a(xi0.a.a(str), xi0.a.a(eVar.f132996b), eVar.f132997c, eVar.f, eVar.f132998g, eVar.f132999h);
                            g gVar2 = params.contains(aVar2.f213664g) ? new g(aVar2, eVar.d) : null;
                            if (gVar2 != null) {
                                arrayList4.add(gVar2);
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listU = h.u(params);
                        if (listU == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<l9l.a>> bidExchangeRates = this.f203829b.f203836a.getBidExchangeRates(listU);
                        m78.e eVar2 = new m78.e(new l0(29), 5);
                        bidExchangeRates.getClass();
                        i iVar = new i(bidExchangeRates, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new n(this, 23), new l0(27), new l0(28));
    }

    public final r a(Collection currencyPairs, boolean z) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        r rVarCompose = nim.a.w(nim.a.w(this.d.f(currencyPairs instanceof Set ? (Set) currencyPairs : zhm.d0.i1(currencyPairs), z), new d(0)), new l0(26)).compose(new m78.e(currencyPairs, 6));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }

    public final ArrayList b(List list, Set set, boolean z) {
        Double d;
        if (!z) {
            List list2 = list;
            int iB = q0.b(w.t(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
            for (Object obj2 : list2) {
                linkedHashMap.put(((n9l.a) obj2).f213664g, obj2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                n9l.a aVar = (n9l.a) linkedHashMap.get((Pair) it8.next());
                if (aVar == null || aVar.f213663c == -1.0d) {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
        List list3 = list;
        int iB2 = q0.b(w.t(list3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj3 : list3) {
            linkedHashMap2.put(((n9l.a) obj3).f213664g, obj3);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = set.iterator();
        while (it9.hasNext()) {
            Pair pair = (Pair) it9.next();
            n9l.a aVarA = (n9l.a) linkedHashMap2.get(pair);
            if (aVarA == null || aVarA.f213663c == -1.0d) {
                g gVar = (g) this.f203838c.get(pair);
                if (gVar == null || (d = gVar.f203840b) == null) {
                    aVarA = null;
                } else {
                    double dDoubleValue = d.doubleValue();
                    if (aVarA == null) {
                        aVarA = gVar.f203839a;
                    }
                    aVarA = n9l.a.a(aVarA, dDoubleValue);
                }
            }
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
        }
        return arrayList2;
    }

    @Override // od0.e
    public final void clear() {
        this.f203838c.clear();
    }
}
