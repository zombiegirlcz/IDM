package vpk;

import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.retail.feature.ratedetails.impl.network.RatesService;
import efm.d0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import s7a.m0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RatesService f291266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fpk.e f291267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fpk.c f291268c;
    public final apk.a d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f291269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qe0.f f291270h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe0.f f291271j;

    public v(RatesService ratesService, fpk.e midRatesCacheDao, fpk.c allRatesCacheDao, apk.a rateRangeQueryParams) {
        Intrinsics.checkNotNullParameter(ratesService, "ratesService");
        Intrinsics.checkNotNullParameter(midRatesCacheDao, "midRatesCacheDao");
        Intrinsics.checkNotNullParameter(allRatesCacheDao, "allRatesCacheDao");
        Intrinsics.checkNotNullParameter(rateRangeQueryParams, "rateRangeQueryParams");
        this.f291266a = ratesService;
        this.f291267b = midRatesCacheDao;
        this.f291268c = allRatesCacheDao;
        this.d = rateRangeQueryParams;
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: vpk.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291260b;

            {
                this.f291260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar = this.f291260b;
                        d0<List<rpk.g>> midExchangeRates = vVar.f291266a.getMidExchangeRates(listP, vVar.a());
                        vpg.b bVar = new vpg.b(9, new m0(vVar, params));
                        midExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(midExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<qta.a> domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        for (qta.a aVar : domain) {
                            this.f291260b.f.put(new Pair(aVar.f249039a, aVar.f249040b), aVar);
                        }
                        return Unit.f186387a;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        fpk.c cVar = this.f291260b.f291268c;
                        List<qta.a> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qta.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str = aVar2.f249039a.f306286a;
                            String str2 = aVar2.f249040b.f306286a;
                            String string = aVar2.f249041c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = aVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            BigDecimal bigDecimal = aVar2.f;
                            arrayList.add(new fpk.d(str, str2, string, string2, string3, bigDecimal != null ? bigDecimal.toString() : null));
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f137119a, false, true, new fpk.b(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        List<qta.c> domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        for (qta.c cVar2 : domain3) {
                            this.f291260b.e.put(new Pair(cVar2.f249046a, cVar2.f249047b), cVar2);
                        }
                        return Unit.f186387a;
                    case 4:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        fpk.e eVar = this.f291260b.f291267b;
                        List<qta.c> list2 = domain4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (qta.c cVar3 : list2) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            String str3 = cVar3.f249046a.f306286a;
                            String str4 = cVar3.f249047b.f306286a;
                            String string4 = cVar3.f249048c.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            BigDecimal bigDecimal2 = cVar3.d;
                            arrayList2.add(new fpk.f(str3, str4, string4, bigDecimal2 != null ? bigDecimal2.toString() : null, cVar3.e, cVar3.f, cVar3.f249049g));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f137124a, false, true, new fpk.b(eVar, arrayList2, 1));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Set params2 = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List<String> listP2 = x5d.b.p(params2);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar2 = this.f291260b;
                        d0<List<rpk.a>> allExchangeRates = vVar2.f291266a.getAllExchangeRates(listP2);
                        vpg.b bVar2 = new vpg.b(10, new q(vVar2, params2, 1));
                        allExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(allExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i2 = 3;
        Function1 function1 = new Function1(this) { // from class: vpk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291262b;

            {
                this.f291262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f291262b.f;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            qta.a aVar = (qta.a) concurrentHashMap.get((Pair) it8.next());
                            if (aVar != null) {
                                arrayList.add(aVar);
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
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        fpk.c cVar = this.f291262b.f291268c;
                        cVar.getClass();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("select * from all_rates where `from` in (");
                        int size = arrayList2.size();
                        StringUtil.appendPlaceholders(sb6, size);
                        sb6.append(") and `to` in (");
                        List list = (List) DBUtil.performBlocking(cVar.f137119a, true, false, new fpk.a(arrayList2, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), size, 0));
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (true) {
                            BigDecimal bigDecimal = null;
                            if (!it11.hasNext()) {
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (params.contains(((qta.a) obj3).f249042g)) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (arrayList5.size() < params.size()) {
                                    return null;
                                }
                                return arrayList5;
                            }
                            fpk.d dVar = (fpk.d) it11.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            xi0.a aVar2 = xi0.b.Companion;
                            String str = dVar.f137121a;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str);
                            xi0.b bVarA2 = xi0.a.a(dVar.f137122b);
                            BigDecimal bigDecimal2 = new BigDecimal(dVar.f137123c);
                            BigDecimal bigDecimal3 = new BigDecimal(dVar.d);
                            BigDecimal bigDecimal4 = new BigDecimal(dVar.e);
                            String str2 = dVar.f;
                            if (str2 != null) {
                                bigDecimal = new BigDecimal(str2);
                            }
                            arrayList4.add(new qta.a(bVarA, bVarA2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal));
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        RatesService ratesService2 = this.f291262b.f291266a;
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.a>> allExchangeRates = ratesService2.getAllExchangeRates(listP);
                        vpg.b bVar = new vpg.b(7, new vn8.a(21));
                        allExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(allExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap2 = this.f291262b.e;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it12 = params.iterator();
                        while (it12.hasNext()) {
                            qta.c cVar2 = (qta.c) concurrentHashMap2.get((Pair) it12.next());
                            if (cVar2 != null) {
                                arrayList6.add(cVar2);
                            }
                        }
                        if (arrayList6.size() < params.size()) {
                            return null;
                        }
                        return arrayList6;
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set2 = params;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it13 = set2.iterator();
                        while (it13.hasNext()) {
                            arrayList7.add(((xi0.b) ((Pair) it13.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it14 = set2.iterator();
                        while (it14.hasNext()) {
                            arrayList8.add(((xi0.b) ((Pair) it14.next()).f186386b).f306286a);
                        }
                        fpk.e eVar = this.f291262b.f291267b;
                        eVar.getClass();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("select * from mid_rates_cache where `from` in (");
                        int size2 = arrayList7.size();
                        StringUtil.appendPlaceholders(sb9, size2);
                        sb9.append(") and `to` in (");
                        List list2 = (List) DBUtil.performBlocking(eVar.f137124a, true, false, new b6.a(eVar, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList8, sb9, ")"), arrayList7, size2, arrayList8));
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it15 = list2.iterator();
                        while (true) {
                            BigDecimal bigDecimal5 = null;
                            if (!it15.hasNext()) {
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : arrayList9) {
                                    if (params.contains(((qta.c) obj4).f249050h)) {
                                        arrayList10.add(obj4);
                                    }
                                }
                                if (arrayList10.size() < params.size()) {
                                    return null;
                                }
                                return arrayList10;
                            }
                            fpk.f fVar = (fpk.f) it15.next();
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            xi0.a aVar3 = xi0.b.Companion;
                            String str3 = fVar.f137127a;
                            aVar3.getClass();
                            xi0.b bVarA3 = xi0.a.a(str3);
                            xi0.b bVarA4 = xi0.a.a(fVar.f137128b);
                            BigDecimal bigDecimal6 = new BigDecimal(fVar.f137129c);
                            String str4 = fVar.d;
                            if (str4 != null) {
                                bigDecimal5 = new BigDecimal(str4);
                            }
                            arrayList9.add(new qta.c(bVarA3, bVarA4, bigDecimal6, bigDecimal5, fVar.e, fVar.f, fVar.f137130g));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v vVar = this.f291262b;
                        RatesService ratesService3 = vVar.f291266a;
                        List<String> listP2 = x5d.b.p(params);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.g>> midExchangeRates = ratesService3.getMidExchangeRates(listP2, vVar.a());
                        vpg.b bVar2 = new vpg.b(8, new vn8.a(27));
                        midExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(midExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function2 function22 = new Function2(this) { // from class: vpk.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291260b;

            {
                this.f291260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar = this.f291260b;
                        d0<List<rpk.g>> midExchangeRates = vVar.f291266a.getMidExchangeRates(listP, vVar.a());
                        vpg.b bVar = new vpg.b(9, new m0(vVar, params));
                        midExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(midExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<qta.a> domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        for (qta.a aVar : domain) {
                            this.f291260b.f.put(new Pair(aVar.f249039a, aVar.f249040b), aVar);
                        }
                        return Unit.f186387a;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        fpk.c cVar = this.f291260b.f291268c;
                        List<qta.a> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qta.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str = aVar2.f249039a.f306286a;
                            String str2 = aVar2.f249040b.f306286a;
                            String string = aVar2.f249041c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = aVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            BigDecimal bigDecimal = aVar2.f;
                            arrayList.add(new fpk.d(str, str2, string, string2, string3, bigDecimal != null ? bigDecimal.toString() : null));
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f137119a, false, true, new fpk.b(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        List<qta.c> domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        for (qta.c cVar2 : domain3) {
                            this.f291260b.e.put(new Pair(cVar2.f249046a, cVar2.f249047b), cVar2);
                        }
                        return Unit.f186387a;
                    case 4:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        fpk.e eVar = this.f291260b.f291267b;
                        List<qta.c> list2 = domain4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (qta.c cVar3 : list2) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            String str3 = cVar3.f249046a.f306286a;
                            String str4 = cVar3.f249047b.f306286a;
                            String string4 = cVar3.f249048c.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            BigDecimal bigDecimal2 = cVar3.d;
                            arrayList2.add(new fpk.f(str3, str4, string4, bigDecimal2 != null ? bigDecimal2.toString() : null, cVar3.e, cVar3.f, cVar3.f249049g));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f137124a, false, true, new fpk.b(eVar, arrayList2, 1));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Set params2 = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List<String> listP2 = x5d.b.p(params2);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar2 = this.f291260b;
                        d0<List<rpk.a>> allExchangeRates = vVar2.f291266a.getAllExchangeRates(listP2);
                        vpg.b bVar2 = new vpg.b(10, new q(vVar2, params2, 1));
                        allExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(allExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i3 = 4;
        this.f291269g = new w4l.f(function2, function1, function22, new Function1(this) { // from class: vpk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291262b;

            {
                this.f291262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f291262b.f;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            qta.a aVar = (qta.a) concurrentHashMap.get((Pair) it8.next());
                            if (aVar != null) {
                                arrayList.add(aVar);
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
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        fpk.c cVar = this.f291262b.f291268c;
                        cVar.getClass();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("select * from all_rates where `from` in (");
                        int size = arrayList2.size();
                        StringUtil.appendPlaceholders(sb6, size);
                        sb6.append(") and `to` in (");
                        List list = (List) DBUtil.performBlocking(cVar.f137119a, true, false, new fpk.a(arrayList2, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), size, 0));
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (true) {
                            BigDecimal bigDecimal = null;
                            if (!it11.hasNext()) {
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (params.contains(((qta.a) obj3).f249042g)) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (arrayList5.size() < params.size()) {
                                    return null;
                                }
                                return arrayList5;
                            }
                            fpk.d dVar = (fpk.d) it11.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            xi0.a aVar2 = xi0.b.Companion;
                            String str = dVar.f137121a;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str);
                            xi0.b bVarA2 = xi0.a.a(dVar.f137122b);
                            BigDecimal bigDecimal2 = new BigDecimal(dVar.f137123c);
                            BigDecimal bigDecimal3 = new BigDecimal(dVar.d);
                            BigDecimal bigDecimal4 = new BigDecimal(dVar.e);
                            String str2 = dVar.f;
                            if (str2 != null) {
                                bigDecimal = new BigDecimal(str2);
                            }
                            arrayList4.add(new qta.a(bVarA, bVarA2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal));
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        RatesService ratesService2 = this.f291262b.f291266a;
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.a>> allExchangeRates = ratesService2.getAllExchangeRates(listP);
                        vpg.b bVar = new vpg.b(7, new vn8.a(21));
                        allExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(allExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap2 = this.f291262b.e;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it12 = params.iterator();
                        while (it12.hasNext()) {
                            qta.c cVar2 = (qta.c) concurrentHashMap2.get((Pair) it12.next());
                            if (cVar2 != null) {
                                arrayList6.add(cVar2);
                            }
                        }
                        if (arrayList6.size() < params.size()) {
                            return null;
                        }
                        return arrayList6;
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set2 = params;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it13 = set2.iterator();
                        while (it13.hasNext()) {
                            arrayList7.add(((xi0.b) ((Pair) it13.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it14 = set2.iterator();
                        while (it14.hasNext()) {
                            arrayList8.add(((xi0.b) ((Pair) it14.next()).f186386b).f306286a);
                        }
                        fpk.e eVar = this.f291262b.f291267b;
                        eVar.getClass();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("select * from mid_rates_cache where `from` in (");
                        int size2 = arrayList7.size();
                        StringUtil.appendPlaceholders(sb9, size2);
                        sb9.append(") and `to` in (");
                        List list2 = (List) DBUtil.performBlocking(eVar.f137124a, true, false, new b6.a(eVar, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList8, sb9, ")"), arrayList7, size2, arrayList8));
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it15 = list2.iterator();
                        while (true) {
                            BigDecimal bigDecimal5 = null;
                            if (!it15.hasNext()) {
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : arrayList9) {
                                    if (params.contains(((qta.c) obj4).f249050h)) {
                                        arrayList10.add(obj4);
                                    }
                                }
                                if (arrayList10.size() < params.size()) {
                                    return null;
                                }
                                return arrayList10;
                            }
                            fpk.f fVar = (fpk.f) it15.next();
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            xi0.a aVar3 = xi0.b.Companion;
                            String str3 = fVar.f137127a;
                            aVar3.getClass();
                            xi0.b bVarA3 = xi0.a.a(str3);
                            xi0.b bVarA4 = xi0.a.a(fVar.f137128b);
                            BigDecimal bigDecimal6 = new BigDecimal(fVar.f137129c);
                            String str4 = fVar.d;
                            if (str4 != null) {
                                bigDecimal5 = new BigDecimal(str4);
                            }
                            arrayList9.add(new qta.c(bVarA3, bVarA4, bigDecimal6, bigDecimal5, fVar.e, fVar.f, fVar.f137130g));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v vVar = this.f291262b;
                        RatesService ratesService3 = vVar.f291266a;
                        List<String> listP2 = x5d.b.p(params);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.g>> midExchangeRates = ratesService3.getMidExchangeRates(listP2, vVar.a());
                        vpg.b bVar2 = new vpg.b(8, new vn8.a(27));
                        midExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(midExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: vpk.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291260b;

            {
                this.f291260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar = this.f291260b;
                        d0<List<rpk.g>> midExchangeRates = vVar.f291266a.getMidExchangeRates(listP, vVar.a());
                        vpg.b bVar = new vpg.b(9, new m0(vVar, params));
                        midExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(midExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<qta.a> domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        for (qta.a aVar : domain) {
                            this.f291260b.f.put(new Pair(aVar.f249039a, aVar.f249040b), aVar);
                        }
                        return Unit.f186387a;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        fpk.c cVar = this.f291260b.f291268c;
                        List<qta.a> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qta.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str = aVar2.f249039a.f306286a;
                            String str2 = aVar2.f249040b.f306286a;
                            String string = aVar2.f249041c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = aVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            BigDecimal bigDecimal = aVar2.f;
                            arrayList.add(new fpk.d(str, str2, string, string2, string3, bigDecimal != null ? bigDecimal.toString() : null));
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f137119a, false, true, new fpk.b(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        List<qta.c> domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        for (qta.c cVar2 : domain3) {
                            this.f291260b.e.put(new Pair(cVar2.f249046a, cVar2.f249047b), cVar2);
                        }
                        return Unit.f186387a;
                    case 4:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        fpk.e eVar = this.f291260b.f291267b;
                        List<qta.c> list2 = domain4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (qta.c cVar3 : list2) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            String str3 = cVar3.f249046a.f306286a;
                            String str4 = cVar3.f249047b.f306286a;
                            String string4 = cVar3.f249048c.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            BigDecimal bigDecimal2 = cVar3.d;
                            arrayList2.add(new fpk.f(str3, str4, string4, bigDecimal2 != null ? bigDecimal2.toString() : null, cVar3.e, cVar3.f, cVar3.f249049g));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f137124a, false, true, new fpk.b(eVar, arrayList2, 1));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Set params2 = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List<String> listP2 = x5d.b.p(params2);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar2 = this.f291260b;
                        d0<List<rpk.a>> allExchangeRates = vVar2.f291266a.getAllExchangeRates(listP2);
                        vpg.b bVar2 = new vpg.b(10, new q(vVar2, params2, 1));
                        allExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(allExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 5;
        final int i6 = 1;
        this.f291270h = new qe0.f(new Function1(this) { // from class: vpk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291262b;

            {
                this.f291262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f291262b.f;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            qta.a aVar = (qta.a) concurrentHashMap.get((Pair) it8.next());
                            if (aVar != null) {
                                arrayList.add(aVar);
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
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        fpk.c cVar = this.f291262b.f291268c;
                        cVar.getClass();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("select * from all_rates where `from` in (");
                        int size = arrayList2.size();
                        StringUtil.appendPlaceholders(sb6, size);
                        sb6.append(") and `to` in (");
                        List list = (List) DBUtil.performBlocking(cVar.f137119a, true, false, new fpk.a(arrayList2, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), size, 0));
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (true) {
                            BigDecimal bigDecimal = null;
                            if (!it11.hasNext()) {
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (params.contains(((qta.a) obj3).f249042g)) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (arrayList5.size() < params.size()) {
                                    return null;
                                }
                                return arrayList5;
                            }
                            fpk.d dVar = (fpk.d) it11.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            xi0.a aVar2 = xi0.b.Companion;
                            String str = dVar.f137121a;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str);
                            xi0.b bVarA2 = xi0.a.a(dVar.f137122b);
                            BigDecimal bigDecimal2 = new BigDecimal(dVar.f137123c);
                            BigDecimal bigDecimal3 = new BigDecimal(dVar.d);
                            BigDecimal bigDecimal4 = new BigDecimal(dVar.e);
                            String str2 = dVar.f;
                            if (str2 != null) {
                                bigDecimal = new BigDecimal(str2);
                            }
                            arrayList4.add(new qta.a(bVarA, bVarA2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal));
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        RatesService ratesService2 = this.f291262b.f291266a;
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.a>> allExchangeRates = ratesService2.getAllExchangeRates(listP);
                        vpg.b bVar = new vpg.b(7, new vn8.a(21));
                        allExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(allExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap2 = this.f291262b.e;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it12 = params.iterator();
                        while (it12.hasNext()) {
                            qta.c cVar2 = (qta.c) concurrentHashMap2.get((Pair) it12.next());
                            if (cVar2 != null) {
                                arrayList6.add(cVar2);
                            }
                        }
                        if (arrayList6.size() < params.size()) {
                            return null;
                        }
                        return arrayList6;
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set2 = params;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it13 = set2.iterator();
                        while (it13.hasNext()) {
                            arrayList7.add(((xi0.b) ((Pair) it13.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it14 = set2.iterator();
                        while (it14.hasNext()) {
                            arrayList8.add(((xi0.b) ((Pair) it14.next()).f186386b).f306286a);
                        }
                        fpk.e eVar = this.f291262b.f291267b;
                        eVar.getClass();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("select * from mid_rates_cache where `from` in (");
                        int size2 = arrayList7.size();
                        StringUtil.appendPlaceholders(sb9, size2);
                        sb9.append(") and `to` in (");
                        List list2 = (List) DBUtil.performBlocking(eVar.f137124a, true, false, new b6.a(eVar, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList8, sb9, ")"), arrayList7, size2, arrayList8));
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it15 = list2.iterator();
                        while (true) {
                            BigDecimal bigDecimal5 = null;
                            if (!it15.hasNext()) {
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : arrayList9) {
                                    if (params.contains(((qta.c) obj4).f249050h)) {
                                        arrayList10.add(obj4);
                                    }
                                }
                                if (arrayList10.size() < params.size()) {
                                    return null;
                                }
                                return arrayList10;
                            }
                            fpk.f fVar = (fpk.f) it15.next();
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            xi0.a aVar3 = xi0.b.Companion;
                            String str3 = fVar.f137127a;
                            aVar3.getClass();
                            xi0.b bVarA3 = xi0.a.a(str3);
                            xi0.b bVarA4 = xi0.a.a(fVar.f137128b);
                            BigDecimal bigDecimal6 = new BigDecimal(fVar.f137129c);
                            String str4 = fVar.d;
                            if (str4 != null) {
                                bigDecimal5 = new BigDecimal(str4);
                            }
                            arrayList9.add(new qta.c(bVarA3, bVarA4, bigDecimal6, bigDecimal5, fVar.e, fVar.f, fVar.f137130g));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v vVar = this.f291262b;
                        RatesService ratesService3 = vVar.f291266a;
                        List<String> listP2 = x5d.b.p(params);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.g>> midExchangeRates = ratesService3.getMidExchangeRates(listP2, vVar.a());
                        vpg.b bVar2 = new vpg.b(8, new vn8.a(27));
                        midExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(midExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function3(this) { // from class: vpk.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291264b;

            {
                this.f291264b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                String str = (String) obj2;
                Set params = (Set) obj3;
                List domain = (List) obj4;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291264b.i.j(params, domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291264b.f291269g.j(params, domain);
                        break;
                }
                return Unit.f186387a;
            }
        }, new vn8.a(25), new vn8.a(26));
        final int i21 = 5;
        Function2 function23 = new Function2(this) { // from class: vpk.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291260b;

            {
                this.f291260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar = this.f291260b;
                        d0<List<rpk.g>> midExchangeRates = vVar.f291266a.getMidExchangeRates(listP, vVar.a());
                        vpg.b bVar = new vpg.b(9, new m0(vVar, params));
                        midExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(midExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<qta.a> domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        for (qta.a aVar : domain) {
                            this.f291260b.f.put(new Pair(aVar.f249039a, aVar.f249040b), aVar);
                        }
                        return Unit.f186387a;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        fpk.c cVar = this.f291260b.f291268c;
                        List<qta.a> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qta.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str = aVar2.f249039a.f306286a;
                            String str2 = aVar2.f249040b.f306286a;
                            String string = aVar2.f249041c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = aVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            BigDecimal bigDecimal = aVar2.f;
                            arrayList.add(new fpk.d(str, str2, string, string2, string3, bigDecimal != null ? bigDecimal.toString() : null));
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f137119a, false, true, new fpk.b(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        List<qta.c> domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        for (qta.c cVar2 : domain3) {
                            this.f291260b.e.put(new Pair(cVar2.f249046a, cVar2.f249047b), cVar2);
                        }
                        return Unit.f186387a;
                    case 4:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        fpk.e eVar = this.f291260b.f291267b;
                        List<qta.c> list2 = domain4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (qta.c cVar3 : list2) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            String str3 = cVar3.f249046a.f306286a;
                            String str4 = cVar3.f249047b.f306286a;
                            String string4 = cVar3.f249048c.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            BigDecimal bigDecimal2 = cVar3.d;
                            arrayList2.add(new fpk.f(str3, str4, string4, bigDecimal2 != null ? bigDecimal2.toString() : null, cVar3.e, cVar3.f, cVar3.f249049g));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f137124a, false, true, new fpk.b(eVar, arrayList2, 1));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Set params2 = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List<String> listP2 = x5d.b.p(params2);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar2 = this.f291260b;
                        d0<List<rpk.a>> allExchangeRates = vVar2.f291266a.getAllExchangeRates(listP2);
                        vpg.b bVar2 = new vpg.b(10, new q(vVar2, params2, 1));
                        allExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(allExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i22 = 0;
        Function1 function12 = new Function1(this) { // from class: vpk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291262b;

            {
                this.f291262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f291262b.f;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            qta.a aVar = (qta.a) concurrentHashMap.get((Pair) it8.next());
                            if (aVar != null) {
                                arrayList.add(aVar);
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
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        fpk.c cVar = this.f291262b.f291268c;
                        cVar.getClass();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("select * from all_rates where `from` in (");
                        int size = arrayList2.size();
                        StringUtil.appendPlaceholders(sb6, size);
                        sb6.append(") and `to` in (");
                        List list = (List) DBUtil.performBlocking(cVar.f137119a, true, false, new fpk.a(arrayList2, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), size, 0));
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (true) {
                            BigDecimal bigDecimal = null;
                            if (!it11.hasNext()) {
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (params.contains(((qta.a) obj3).f249042g)) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (arrayList5.size() < params.size()) {
                                    return null;
                                }
                                return arrayList5;
                            }
                            fpk.d dVar = (fpk.d) it11.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            xi0.a aVar2 = xi0.b.Companion;
                            String str = dVar.f137121a;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str);
                            xi0.b bVarA2 = xi0.a.a(dVar.f137122b);
                            BigDecimal bigDecimal2 = new BigDecimal(dVar.f137123c);
                            BigDecimal bigDecimal3 = new BigDecimal(dVar.d);
                            BigDecimal bigDecimal4 = new BigDecimal(dVar.e);
                            String str2 = dVar.f;
                            if (str2 != null) {
                                bigDecimal = new BigDecimal(str2);
                            }
                            arrayList4.add(new qta.a(bVarA, bVarA2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal));
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        RatesService ratesService2 = this.f291262b.f291266a;
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.a>> allExchangeRates = ratesService2.getAllExchangeRates(listP);
                        vpg.b bVar = new vpg.b(7, new vn8.a(21));
                        allExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(allExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap2 = this.f291262b.e;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it12 = params.iterator();
                        while (it12.hasNext()) {
                            qta.c cVar2 = (qta.c) concurrentHashMap2.get((Pair) it12.next());
                            if (cVar2 != null) {
                                arrayList6.add(cVar2);
                            }
                        }
                        if (arrayList6.size() < params.size()) {
                            return null;
                        }
                        return arrayList6;
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set2 = params;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it13 = set2.iterator();
                        while (it13.hasNext()) {
                            arrayList7.add(((xi0.b) ((Pair) it13.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it14 = set2.iterator();
                        while (it14.hasNext()) {
                            arrayList8.add(((xi0.b) ((Pair) it14.next()).f186386b).f306286a);
                        }
                        fpk.e eVar = this.f291262b.f291267b;
                        eVar.getClass();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("select * from mid_rates_cache where `from` in (");
                        int size2 = arrayList7.size();
                        StringUtil.appendPlaceholders(sb9, size2);
                        sb9.append(") and `to` in (");
                        List list2 = (List) DBUtil.performBlocking(eVar.f137124a, true, false, new b6.a(eVar, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList8, sb9, ")"), arrayList7, size2, arrayList8));
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it15 = list2.iterator();
                        while (true) {
                            BigDecimal bigDecimal5 = null;
                            if (!it15.hasNext()) {
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : arrayList9) {
                                    if (params.contains(((qta.c) obj4).f249050h)) {
                                        arrayList10.add(obj4);
                                    }
                                }
                                if (arrayList10.size() < params.size()) {
                                    return null;
                                }
                                return arrayList10;
                            }
                            fpk.f fVar = (fpk.f) it15.next();
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            xi0.a aVar3 = xi0.b.Companion;
                            String str3 = fVar.f137127a;
                            aVar3.getClass();
                            xi0.b bVarA3 = xi0.a.a(str3);
                            xi0.b bVarA4 = xi0.a.a(fVar.f137128b);
                            BigDecimal bigDecimal6 = new BigDecimal(fVar.f137129c);
                            String str4 = fVar.d;
                            if (str4 != null) {
                                bigDecimal5 = new BigDecimal(str4);
                            }
                            arrayList9.add(new qta.c(bVarA3, bVarA4, bigDecimal6, bigDecimal5, fVar.e, fVar.f, fVar.f137130g));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v vVar = this.f291262b;
                        RatesService ratesService3 = vVar.f291266a;
                        List<String> listP2 = x5d.b.p(params);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.g>> midExchangeRates = ratesService3.getMidExchangeRates(listP2, vVar.a());
                        vpg.b bVar2 = new vpg.b(8, new vn8.a(27));
                        midExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(midExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i32 = 1;
        Function2 function24 = new Function2(this) { // from class: vpk.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291260b;

            {
                this.f291260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar = this.f291260b;
                        d0<List<rpk.g>> midExchangeRates = vVar.f291266a.getMidExchangeRates(listP, vVar.a());
                        vpg.b bVar = new vpg.b(9, new m0(vVar, params));
                        midExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(midExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<qta.a> domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        for (qta.a aVar : domain) {
                            this.f291260b.f.put(new Pair(aVar.f249039a, aVar.f249040b), aVar);
                        }
                        return Unit.f186387a;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        fpk.c cVar = this.f291260b.f291268c;
                        List<qta.a> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qta.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str = aVar2.f249039a.f306286a;
                            String str2 = aVar2.f249040b.f306286a;
                            String string = aVar2.f249041c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = aVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            BigDecimal bigDecimal = aVar2.f;
                            arrayList.add(new fpk.d(str, str2, string, string2, string3, bigDecimal != null ? bigDecimal.toString() : null));
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f137119a, false, true, new fpk.b(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        List<qta.c> domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        for (qta.c cVar2 : domain3) {
                            this.f291260b.e.put(new Pair(cVar2.f249046a, cVar2.f249047b), cVar2);
                        }
                        return Unit.f186387a;
                    case 4:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        fpk.e eVar = this.f291260b.f291267b;
                        List<qta.c> list2 = domain4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (qta.c cVar3 : list2) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            String str3 = cVar3.f249046a.f306286a;
                            String str4 = cVar3.f249047b.f306286a;
                            String string4 = cVar3.f249048c.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            BigDecimal bigDecimal2 = cVar3.d;
                            arrayList2.add(new fpk.f(str3, str4, string4, bigDecimal2 != null ? bigDecimal2.toString() : null, cVar3.e, cVar3.f, cVar3.f249049g));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f137124a, false, true, new fpk.b(eVar, arrayList2, 1));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Set params2 = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List<String> listP2 = x5d.b.p(params2);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar2 = this.f291260b;
                        d0<List<rpk.a>> allExchangeRates = vVar2.f291266a.getAllExchangeRates(listP2);
                        vpg.b bVar2 = new vpg.b(10, new q(vVar2, params2, 1));
                        allExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(allExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function13 = new Function1(this) { // from class: vpk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291262b;

            {
                this.f291262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i32) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f291262b.f;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            qta.a aVar = (qta.a) concurrentHashMap.get((Pair) it8.next());
                            if (aVar != null) {
                                arrayList.add(aVar);
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
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        fpk.c cVar = this.f291262b.f291268c;
                        cVar.getClass();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("select * from all_rates where `from` in (");
                        int size = arrayList2.size();
                        StringUtil.appendPlaceholders(sb6, size);
                        sb6.append(") and `to` in (");
                        List list = (List) DBUtil.performBlocking(cVar.f137119a, true, false, new fpk.a(arrayList2, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), size, 0));
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (true) {
                            BigDecimal bigDecimal = null;
                            if (!it11.hasNext()) {
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (params.contains(((qta.a) obj3).f249042g)) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (arrayList5.size() < params.size()) {
                                    return null;
                                }
                                return arrayList5;
                            }
                            fpk.d dVar = (fpk.d) it11.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            xi0.a aVar2 = xi0.b.Companion;
                            String str = dVar.f137121a;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str);
                            xi0.b bVarA2 = xi0.a.a(dVar.f137122b);
                            BigDecimal bigDecimal2 = new BigDecimal(dVar.f137123c);
                            BigDecimal bigDecimal3 = new BigDecimal(dVar.d);
                            BigDecimal bigDecimal4 = new BigDecimal(dVar.e);
                            String str2 = dVar.f;
                            if (str2 != null) {
                                bigDecimal = new BigDecimal(str2);
                            }
                            arrayList4.add(new qta.a(bVarA, bVarA2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal));
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        RatesService ratesService2 = this.f291262b.f291266a;
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.a>> allExchangeRates = ratesService2.getAllExchangeRates(listP);
                        vpg.b bVar = new vpg.b(7, new vn8.a(21));
                        allExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(allExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap2 = this.f291262b.e;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it12 = params.iterator();
                        while (it12.hasNext()) {
                            qta.c cVar2 = (qta.c) concurrentHashMap2.get((Pair) it12.next());
                            if (cVar2 != null) {
                                arrayList6.add(cVar2);
                            }
                        }
                        if (arrayList6.size() < params.size()) {
                            return null;
                        }
                        return arrayList6;
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set2 = params;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it13 = set2.iterator();
                        while (it13.hasNext()) {
                            arrayList7.add(((xi0.b) ((Pair) it13.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it14 = set2.iterator();
                        while (it14.hasNext()) {
                            arrayList8.add(((xi0.b) ((Pair) it14.next()).f186386b).f306286a);
                        }
                        fpk.e eVar = this.f291262b.f291267b;
                        eVar.getClass();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("select * from mid_rates_cache where `from` in (");
                        int size2 = arrayList7.size();
                        StringUtil.appendPlaceholders(sb9, size2);
                        sb9.append(") and `to` in (");
                        List list2 = (List) DBUtil.performBlocking(eVar.f137124a, true, false, new b6.a(eVar, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList8, sb9, ")"), arrayList7, size2, arrayList8));
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it15 = list2.iterator();
                        while (true) {
                            BigDecimal bigDecimal5 = null;
                            if (!it15.hasNext()) {
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : arrayList9) {
                                    if (params.contains(((qta.c) obj4).f249050h)) {
                                        arrayList10.add(obj4);
                                    }
                                }
                                if (arrayList10.size() < params.size()) {
                                    return null;
                                }
                                return arrayList10;
                            }
                            fpk.f fVar = (fpk.f) it15.next();
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            xi0.a aVar3 = xi0.b.Companion;
                            String str3 = fVar.f137127a;
                            aVar3.getClass();
                            xi0.b bVarA3 = xi0.a.a(str3);
                            xi0.b bVarA4 = xi0.a.a(fVar.f137128b);
                            BigDecimal bigDecimal6 = new BigDecimal(fVar.f137129c);
                            String str4 = fVar.d;
                            if (str4 != null) {
                                bigDecimal5 = new BigDecimal(str4);
                            }
                            arrayList9.add(new qta.c(bVarA3, bVarA4, bigDecimal6, bigDecimal5, fVar.e, fVar.f, fVar.f137130g));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v vVar = this.f291262b;
                        RatesService ratesService3 = vVar.f291266a;
                        List<String> listP2 = x5d.b.p(params);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.g>> midExchangeRates = ratesService3.getMidExchangeRates(listP2, vVar.a());
                        vpg.b bVar2 = new vpg.b(8, new vn8.a(27));
                        midExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(midExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i33 = 2;
        this.i = new w4l.f(function23, function12, function24, function13, new Function2(this) { // from class: vpk.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291260b;

            {
                this.f291260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Set params = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar = this.f291260b;
                        d0<List<rpk.g>> midExchangeRates = vVar.f291266a.getMidExchangeRates(listP, vVar.a());
                        vpg.b bVar = new vpg.b(9, new m0(vVar, params));
                        midExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(midExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List<qta.a> domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        for (qta.a aVar : domain) {
                            this.f291260b.f.put(new Pair(aVar.f249039a, aVar.f249040b), aVar);
                        }
                        return Unit.f186387a;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        fpk.c cVar = this.f291260b.f291268c;
                        List<qta.a> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qta.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            String str = aVar2.f249039a.f306286a;
                            String str2 = aVar2.f249040b.f306286a;
                            String string = aVar2.f249041c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = aVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            BigDecimal bigDecimal = aVar2.f;
                            arrayList.add(new fpk.d(str, str2, string, string2, string3, bigDecimal != null ? bigDecimal.toString() : null));
                        }
                        cVar.getClass();
                        DBUtil.performBlocking(cVar.f137119a, false, true, new fpk.b(cVar, arrayList, 0));
                        return Unit.f186387a;
                    case 3:
                        List<qta.c> domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        for (qta.c cVar2 : domain3) {
                            this.f291260b.e.put(new Pair(cVar2.f249046a, cVar2.f249047b), cVar2);
                        }
                        return Unit.f186387a;
                    case 4:
                        List domain4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        fpk.e eVar = this.f291260b.f291267b;
                        List<qta.c> list2 = domain4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (qta.c cVar3 : list2) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            String str3 = cVar3.f249046a.f306286a;
                            String str4 = cVar3.f249047b.f306286a;
                            String string4 = cVar3.f249048c.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            BigDecimal bigDecimal2 = cVar3.d;
                            arrayList2.add(new fpk.f(str3, str4, string4, bigDecimal2 != null ? bigDecimal2.toString() : null, cVar3.e, cVar3.f, cVar3.f249049g));
                        }
                        eVar.getClass();
                        DBUtil.performBlocking(eVar.f137124a, false, true, new fpk.b(eVar, arrayList2, 1));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Set params2 = (Set) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        List<String> listP2 = x5d.b.p(params2);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        v vVar2 = this.f291260b;
                        d0<List<rpk.a>> allExchangeRates = vVar2.f291266a.getAllExchangeRates(listP2);
                        vpg.b bVar2 = new vpg.b(10, new q(vVar2, params2, 1));
                        allExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(allExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 2;
        final int i59 = 0;
        this.f291271j = new qe0.f(new Function1(this) { // from class: vpk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291262b;

            {
                this.f291262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Set params = (Set) obj2;
                switch (i43) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap = this.f291262b.f;
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = params.iterator();
                        while (it8.hasNext()) {
                            qta.a aVar = (qta.a) concurrentHashMap.get((Pair) it8.next());
                            if (aVar != null) {
                                arrayList.add(aVar);
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
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it9 = set.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((xi0.b) ((Pair) it9.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                        Iterator it10 = set.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(((xi0.b) ((Pair) it10.next()).f186386b).f306286a);
                        }
                        fpk.c cVar = this.f291262b.f291268c;
                        cVar.getClass();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("select * from all_rates where `from` in (");
                        int size = arrayList2.size();
                        StringUtil.appendPlaceholders(sb6, size);
                        sb6.append(") and `to` in (");
                        List list = (List) DBUtil.performBlocking(cVar.f137119a, true, false, new fpk.a(arrayList2, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), size, 0));
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (true) {
                            BigDecimal bigDecimal = null;
                            if (!it11.hasNext()) {
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (params.contains(((qta.a) obj3).f249042g)) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (arrayList5.size() < params.size()) {
                                    return null;
                                }
                                return arrayList5;
                            }
                            fpk.d dVar = (fpk.d) it11.next();
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            xi0.a aVar2 = xi0.b.Companion;
                            String str = dVar.f137121a;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str);
                            xi0.b bVarA2 = xi0.a.a(dVar.f137122b);
                            BigDecimal bigDecimal2 = new BigDecimal(dVar.f137123c);
                            BigDecimal bigDecimal3 = new BigDecimal(dVar.d);
                            BigDecimal bigDecimal4 = new BigDecimal(dVar.e);
                            String str2 = dVar.f;
                            if (str2 != null) {
                                bigDecimal = new BigDecimal(str2);
                            }
                            arrayList4.add(new qta.a(bVarA, bVarA2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal));
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        RatesService ratesService2 = this.f291262b.f291266a;
                        List<String> listP = x5d.b.p(params);
                        if (listP == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.a>> allExchangeRates = ratesService2.getAllExchangeRates(listP);
                        vpg.b bVar = new vpg.b(7, new vn8.a(21));
                        allExchangeRates.getClass();
                        ufm.i iVar = new ufm.i(allExchangeRates, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ConcurrentHashMap concurrentHashMap2 = this.f291262b.e;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it12 = params.iterator();
                        while (it12.hasNext()) {
                            qta.c cVar2 = (qta.c) concurrentHashMap2.get((Pair) it12.next());
                            if (cVar2 != null) {
                                arrayList6.add(cVar2);
                            }
                        }
                        if (arrayList6.size() < params.size()) {
                            return null;
                        }
                        return arrayList6;
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params.isEmpty()) {
                            return f0.f322471a;
                        }
                        Set set2 = params;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it13 = set2.iterator();
                        while (it13.hasNext()) {
                            arrayList7.add(((xi0.b) ((Pair) it13.next()).f186385a).f306286a);
                        }
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(set2, 10));
                        Iterator it14 = set2.iterator();
                        while (it14.hasNext()) {
                            arrayList8.add(((xi0.b) ((Pair) it14.next()).f186386b).f306286a);
                        }
                        fpk.e eVar = this.f291262b.f291267b;
                        eVar.getClass();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("select * from mid_rates_cache where `from` in (");
                        int size2 = arrayList7.size();
                        StringUtil.appendPlaceholders(sb9, size2);
                        sb9.append(") and `to` in (");
                        List list2 = (List) DBUtil.performBlocking(eVar.f137124a, true, false, new b6.a(eVar, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList8, sb9, ")"), arrayList7, size2, arrayList8));
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it15 = list2.iterator();
                        while (true) {
                            BigDecimal bigDecimal5 = null;
                            if (!it15.hasNext()) {
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : arrayList9) {
                                    if (params.contains(((qta.c) obj4).f249050h)) {
                                        arrayList10.add(obj4);
                                    }
                                }
                                if (arrayList10.size() < params.size()) {
                                    return null;
                                }
                                return arrayList10;
                            }
                            fpk.f fVar = (fpk.f) it15.next();
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            xi0.a aVar3 = xi0.b.Companion;
                            String str3 = fVar.f137127a;
                            aVar3.getClass();
                            xi0.b bVarA3 = xi0.a.a(str3);
                            xi0.b bVarA4 = xi0.a.a(fVar.f137128b);
                            BigDecimal bigDecimal6 = new BigDecimal(fVar.f137129c);
                            String str4 = fVar.d;
                            if (str4 != null) {
                                bigDecimal5 = new BigDecimal(str4);
                            }
                            arrayList9.add(new qta.c(bVarA3, bVarA4, bigDecimal6, bigDecimal5, fVar.e, fVar.f, fVar.f137130g));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        v vVar = this.f291262b;
                        RatesService ratesService3 = vVar.f291266a;
                        List<String> listP2 = x5d.b.p(params);
                        if (listP2 == null) {
                            throw new RuntimeException("No currency pairs defined");
                        }
                        d0<List<rpk.g>> midExchangeRates = ratesService3.getMidExchangeRates(listP2, vVar.a());
                        vpg.b bVar2 = new vpg.b(8, new vn8.a(27));
                        midExchangeRates.getClass();
                        ufm.i iVar2 = new ufm.i(midExchangeRates, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function3(this) { // from class: vpk.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f291264b;

            {
                this.f291264b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                String str = (String) obj2;
                Set params = (Set) obj3;
                List domain = (List) obj4;
                switch (i59) {
                    case 0:
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291264b.i.j(params, domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291264b.f291269g.j(params, domain);
                        break;
                }
                return Unit.f186387a;
            }
        }, new vn8.a(23), new vn8.a(24));
    }

    public static Set b(Collection collection) {
        return collection instanceof Set ? (Set) collection : zhm.d0.i1(collection);
    }

    public final aim.f a() {
        aim.f builder = new aim.f();
        int i = u.f291265a[this.d.ordinal()];
        if (i == 1) {
            BigDecimal bigDecimal = w.f291272a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimal2 = w.f291272a;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // od0.e
    public final void clear() {
        this.e.clear();
    }
}
