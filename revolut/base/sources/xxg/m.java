package xxg;

import efm.r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements a {

    @NotNull
    public static final c Companion = new c();
    public static final Set e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f309523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kwg.l f309524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tyg.j f309525c;
    public final qmc.h d;

    static {
        xdh.c[] elements = {xdh.c.SUSPENDED, xdh.c.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
    }

    public m(ybl.b instrumentTickerInteractor, kwg.l complexAnalyticsInteractor, tyg.j configInteractor, qmc.h roboPortfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        this.f309523a = instrumentTickerInteractor;
        this.f309524b = complexAnalyticsInteractor;
        this.f309525c = configInteractor;
        this.d = roboPortfolioInfoProvider;
    }

    public static final go.g a(m mVar, List list) {
        mVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new wxg.f((mwg.c) it8.next()));
        }
        return zi0.c.i(arrayList);
    }

    public static go.g b(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String str = ((mwg.d) obj2).f209447a;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            mwg.d dVar = (mwg.d) d0.b0((List) ((Map.Entry) it8.next()).getValue());
            dj0.d.Companion.getClass();
            dj0.d value = dj0.d.e;
            int i = 0;
            for (Object obj3 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                value = i == 0 ? ((mwg.d) obj3).f209448b : pyd.c.O(value, ((mwg.d) obj3).f209448b);
                i = i2;
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                bigDecimalValueOf = bigDecimalValueOf.add(new BigDecimal(String.valueOf(((mwg.d) it9.next()).f209449c)));
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
            }
            float fFloatValue = bigDecimalValueOf.floatValue();
            String asset = dVar.f209447a;
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList2.add(new wxg.b(new mwg.d(asset, value, fFloatValue)));
        }
        return zi0.c.i(arrayList2);
    }

    public static go.g c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new wxg.g((mwg.c) it8.next()));
        }
        return zi0.c.i(arrayList);
    }

    public final vkm.d d(List list, iwg.a aVar, vyg.a aVar2) {
        r rVarJ;
        r rVarJ2;
        List listZ;
        Object obj2;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((mwg.c) obj3).e != null) {
                arrayList.add(obj3);
            } else {
                arrayList2.add(obj3);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ybl.b bVar = this.f309523a;
        if (zIsEmpty) {
            rVarJ = zi0.c.j(f0.f322471a);
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                String str = ((mwg.c) it8.next()).e;
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            rVarJ = rd0.e.c(((ael.k) bVar).l(d0.i1(d0.U(arrayList3))), kotlin.coroutines.g.f186406a);
        }
        if (arrayList2.isEmpty()) {
            rVarJ2 = zi0.c.j(f0.f322471a);
        } else {
            ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((mwg.c) it9.next()).f209442a);
            }
            List symbols = d0.U(arrayList4);
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            rVarJ2 = nim.a.w(ybl.b.c((ael.k) bVar), new a26.j(symbols, 8));
        }
        if (aVar == iwg.a.CFD && aVar2 == vyg.a.ASSET) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj4 : list2) {
                mwg.c cVar = (mwg.c) obj4;
                String str2 = cVar.e;
                if (str2 == null) {
                    str2 = cVar.f209442a;
                }
                Object objO = linkedHashMap.get(str2);
                if (objO == null) {
                    objO = v0.a.o(linkedHashMap, str2);
                }
                ((List) objO).add(obj4);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Iterator it10 = ((Iterable) entry.getValue()).iterator();
                if (it10.hasNext()) {
                    Object next = it10.next();
                    while (it10.hasNext()) {
                        mwg.c cVar2 = (mwg.c) it10.next();
                        mwg.c cVar3 = (mwg.c) next;
                        BigDecimal quantity = cVar3.f209443b.add(cVar2.f209443b);
                        Intrinsics.checkNotNullExpressionValue(quantity, "add(...)");
                        dj0.d value = pyd.c.O(cVar3.f209444c, cVar2.f209444c);
                        float f = cVar3.d + cVar2.d;
                        String asset = cVar3.f209442a;
                        String str3 = cVar3.e;
                        ej0.b bVar2 = cVar3.f209445g;
                        BigDecimal bigDecimal = cVar3.i;
                        Intrinsics.checkNotNullParameter(asset, "asset");
                        Intrinsics.checkNotNullParameter(quantity, "quantity");
                        Intrinsics.checkNotNullParameter(value, "value");
                        next = new mwg.c(asset, quantity, value, f, str3, null, bVar2, null, bigDecimal);
                    }
                    obj2 = next;
                } else {
                    obj2 = null;
                }
                linkedHashMap2.put(key, (mwg.c) obj2);
            }
            listZ = d0.Z(linkedHashMap2.values());
        } else {
            listZ = list;
        }
        return rd0.e.b(nim.a.w(kli.a.h(rVarJ, rVarJ2), new b(listZ, aVar2)));
    }
}
