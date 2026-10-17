package h0h;

import a83.c0;
import ael.k;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import do2.o;
import e7l.g;
import e9h.d;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import vdl.y;
import vel.g;
import vel.h;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zi0.c;

/* JADX INFO: loaded from: classes9.dex */
public interface b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [e9h.d, java.lang.Object] */
    static r a(b bVar, List entries, a aVar, Set set, final boolean z, int i) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        r rVarR;
        r rVarSwitchMap;
        r rVarR2;
        Pair pair;
        if ((i & 4) != 0) {
            set = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        final ?? r92 = (d) bVar;
        r92.getClass();
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (entries.isEmpty()) {
            return c.j(f0.f322471a);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : entries) {
            h hVar = ((g) obj2).f288358b;
            Object arrayList5 = linkedHashMap.get(hVar);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(hVar, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        List list = (List) linkedHashMap.get(h.STOCK);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((g) it8.next()).f288357a);
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        List list3 = (List) linkedHashMap.get(h.CURRENCY);
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((g) it9.next()).f288357a);
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = f0.f322471a;
        }
        Iterable iterable = (Iterable) arrayList2;
        ArrayList arrayList6 = new ArrayList(w.t(iterable, 10));
        Iterator it10 = iterable.iterator();
        while (it10.hasNext()) {
            t61.a.A(xi0.b.Companion, (String) it10.next(), arrayList6);
        }
        List list5 = (List) linkedHashMap.get(h.INDEX);
        if (list5 != null) {
            List list6 = list5;
            arrayList3 = new ArrayList(w.t(list6, 10));
            Iterator it11 = list6.iterator();
            while (it11.hasNext()) {
                arrayList3.add(((g) it11.next()).f288357a);
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = f0.f322471a;
        }
        List<g> list7 = (List) linkedHashMap.get(h.CURRENCY_PAIR);
        if (list7 != null) {
            arrayList4 = new ArrayList();
            for (g gVar : list7) {
                xi0.b bVar2 = gVar.e;
                if (bVar2 == null) {
                    pair = null;
                } else {
                    xi0.a aVar2 = xi0.b.Companion;
                    String str = gVar.f288357a;
                    aVar2.getClass();
                    pair = new Pair(xi0.a.a(str), bVar2);
                }
                if (pair != null) {
                    arrayList4.add(pair);
                }
            }
        } else {
            arrayList4 = 0;
        }
        if (arrayList4 == 0) {
            arrayList4 = f0.f322471a;
        }
        if (arrayList.isEmpty()) {
            rVarR = c.j(f0.f322471a);
        } else {
            r rVarDistinctUntilChanged = nim.a.w(e.c(((k) r92.f123997a).l(d0.i1((Iterable) arrayList)), kotlin.coroutines.g.f186406a), new a83.d0(16, set)).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            final int i2 = 1;
            rVarR = pd.b.r(rVarDistinctUntilChanged, new Function1() { // from class: e9h.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    r rVarI;
                    List filteredIndexes = (List) obj3;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(filteredIndexes, "filteredIndexes");
                            List list8 = filteredIndexes;
                            ArrayList arrayList7 = new ArrayList(w.t(list8, 10));
                            Iterator it12 = list8.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((lel.b) it12.next()).f194590b);
                            }
                            boolean z3 = z;
                            d dVar = r92;
                            if (z3) {
                                rVarI = ((k) dVar.f123997a).n(arrayList7, w4l.h.f294642c);
                            } else {
                                ybl.b bVar3 = dVar.f123997a;
                                ybl.b.Companion.getClass();
                                rVarI = ((k) bVar3).i(arrayList7, InstrumentTickerInteractor$Companion.f105074b);
                            }
                            return nim.a.w(rVarI, new o(filteredIndexes, 11));
                        default:
                            Intrinsics.checkNotNullParameter(filteredIndexes, "refs");
                            boolean z4 = z;
                            d dVar2 = r92;
                            if (!z4) {
                                ybl.b bVar4 = dVar2.f123997a;
                                ybl.b.Companion.getClass();
                                return ((k) bVar4).k(filteredIndexes, InstrumentTickerInteractor$Companion.f105074b);
                            }
                            k kVar = (k) dVar2.f123997a;
                            Intrinsics.checkNotNullParameter(filteredIndexes, "refs");
                            if (filteredIndexes.isEmpty()) {
                                r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                                Intrinsics.h(rVarJust);
                                return rVarJust;
                            }
                            return nim.a.w(kli.a.h(e.c(kVar.l(d0.i1(filteredIndexes)), kotlin.coroutines.g.f186406a), ((y) kVar.f3633a).b(filteredIndexes, w4l.h.f294642c)), new aed.a(11));
                    }
                }
            });
        }
        if (arrayList6.isEmpty()) {
            f0 f0Var = f0.f322471a;
            rVarSwitchMap = c.j(new Pair(f0Var, f0Var));
        } else {
            rVarSwitchMap = m70.a.g(nim.a.w(((ik3.c) r92.f124000g).k(g.b.f123407a), new c0(18, arrayList6)), null, null, 3).switchMap(new e8h.c(12, new e9h.a(r92, aVar, 1)));
            Intrinsics.h(rVarSwitchMap);
        }
        if (arrayList3.isEmpty()) {
            rVarR2 = c.j(f0.f322471a);
        } else {
            zjh.c cVar = r92.f124001h;
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            vdl.h hVar2 = (vdl.h) cVar.f322830b;
            hVar2.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            r rVarDistinctUntilChanged2 = e.c(nim.a.v(hVar2.d.b(Unit.f186387a, loadingStrategy), new av8.o((Object) arrayList3, 13)), kotlin.coroutines.g.f186406a).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
            final int i3 = 0;
            rVarR2 = pd.b.r(rVarDistinctUntilChanged2, new Function1() { // from class: e9h.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    r rVarI;
                    List filteredIndexes = (List) obj3;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(filteredIndexes, "filteredIndexes");
                            List list8 = filteredIndexes;
                            ArrayList arrayList7 = new ArrayList(w.t(list8, 10));
                            Iterator it12 = list8.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((lel.b) it12.next()).f194590b);
                            }
                            boolean z3 = z;
                            d dVar = r92;
                            if (z3) {
                                rVarI = ((k) dVar.f123997a).n(arrayList7, w4l.h.f294642c);
                            } else {
                                ybl.b bVar3 = dVar.f123997a;
                                ybl.b.Companion.getClass();
                                rVarI = ((k) bVar3).i(arrayList7, InstrumentTickerInteractor$Companion.f105074b);
                            }
                            return nim.a.w(rVarI, new o(filteredIndexes, 11));
                        default:
                            Intrinsics.checkNotNullParameter(filteredIndexes, "refs");
                            boolean z4 = z;
                            d dVar2 = r92;
                            if (!z4) {
                                ybl.b bVar4 = dVar2.f123997a;
                                ybl.b.Companion.getClass();
                                return ((k) bVar4).k(filteredIndexes, InstrumentTickerInteractor$Companion.f105074b);
                            }
                            k kVar = (k) dVar2.f123997a;
                            Intrinsics.checkNotNullParameter(filteredIndexes, "refs");
                            if (filteredIndexes.isEmpty()) {
                                r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                                Intrinsics.h(rVarJust);
                                return rVarJust;
                            }
                            return nim.a.w(kli.a.h(e.c(kVar.l(d0.i1(filteredIndexes)), kotlin.coroutines.g.f186406a), ((y) kVar.f3633a).b(filteredIndexes, w4l.h.f294642c)), new aed.a(11));
                    }
                }
            });
        }
        return nim.a.w(nim.a.w(kli.a.h(kli.a.h(rVarR, rVarSwitchMap), kli.a.h(rVarR2, arrayList4.isEmpty() ? c.j(f0.f322471a) : r92.b(arrayList4, null))), new e8e.y(13)), new e1.b(entries, r92, 26));
    }
}
