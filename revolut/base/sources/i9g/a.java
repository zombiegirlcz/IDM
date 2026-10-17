package i9g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static zfi.a a(zfi.c allFilters, List smartFilters) {
        Object next;
        Unit unit;
        Intrinsics.checkNotNullParameter(allFilters, "allFilters");
        Intrinsics.checkNotNullParameter(smartFilters, "smartFilters");
        ArrayList arrayList = allFilters.f321957b;
        int iB = q0.b(zhm.w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((zfi.b) obj2).c(), obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it8 = smartFilters.iterator();
        while (it8.hasNext()) {
            zfi.b0 b0Var = (zfi.b0) it8.next();
            if (b0Var instanceof zfi.z) {
                zfi.z zVar = (zfi.z) b0Var;
                String str = zVar.f322008a;
                Object obj3 = linkedHashMap.get(str);
                zfi.g gVar = obj3 instanceof zfi.g ? (zfi.g) obj3 : null;
                if (gVar != null) {
                    linkedHashMap2.put(str, new zfi.i(gVar.f321969c.f321970a, gVar.f321968b, zVar.f322009b));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(p.a.p("BE returned boolean smart filter with reference = ", str, ", which doesn't match any existing filter."));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
            } else if (b0Var instanceof zfi.a0) {
                zfi.a0 a0Var = (zfi.a0) b0Var;
                String str2 = a0Var.f321954a;
                Object obj4 = linkedHashMap.get(str2);
                zfi.j jVar = obj4 instanceof zfi.j ? (zfi.j) obj4 : null;
                if (jVar != null) {
                    zfi.k kVar = jVar.f321977c;
                    ArrayList arrayList2 = kVar.f321979b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList2) {
                        if (a0Var.f321955b.contains(((zfi.n) obj5).f321984c)) {
                            arrayList3.add(obj5);
                        }
                    }
                    Set setI1 = zhm.d0.i1(arrayList3);
                    if (!setI1.isEmpty()) {
                        linkedHashMap3.put(str2, new zfi.l(kVar.f321978a, setI1));
                    }
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("BE returned checkbox smart filter with reference = ", str2, ", which doesn't match any existing filter."));
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
            } else if (b0Var instanceof zfi.d0) {
                zfi.d0 d0Var = (zfi.d0) b0Var;
                String str3 = d0Var.f321963a;
                Object obj6 = linkedHashMap.get(str3);
                zfi.r rVar = obj6 instanceof zfi.r ? (zfi.r) obj6 : null;
                if (rVar != null) {
                    zfi.s sVar = rVar.f321996c;
                    Iterator it9 = sVar.f321998b.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it9.next();
                        if (Intrinsics.f(((zfi.n) next).f321984c, d0Var.f321964b)) {
                            break;
                        }
                    }
                    zfi.n nVar = (zfi.n) next;
                    if (nVar != null) {
                        linkedHashMap4.put(str3, new zfi.t(sVar.f321997a, nVar));
                        unit = Unit.f186387a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                    }
                }
                IllegalStateException illegalStateException3 = new IllegalStateException(p.a.p("BE returned radio smart filter with reference = ", str3, ", which doesn't match any existing filter."));
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
            } else {
                if (!(b0Var instanceof zfi.c0)) {
                    throw new NoWhenBranchMatchedException();
                }
                zfi.c0 c0Var = (zfi.c0) b0Var;
                String str4 = c0Var.f321958a;
                zfi.y yVar = c0Var.f321959b;
                dj0.d dVar = yVar.f322007b;
                dj0.d dVar2 = yVar.f322006a;
                Object obj7 = linkedHashMap.get(str4);
                zfi.o oVar = obj7 instanceof zfi.o ? (zfi.o) obj7 : null;
                if (oVar != null) {
                    zfi.p pVar = oVar.f321987c;
                    dj0.d dVar3 = pVar.d;
                    dj0.d dVar4 = pVar.f321990c;
                    if (Intrinsics.f(dVar2.f115083b, dVar4.f115083b) && Intrinsics.f(dVar.f115083b, dVar3.f115083b)) {
                        if (dVar2.equals(dVar4)) {
                            dVar2 = null;
                        }
                        dj0.d dVar5 = dVar.equals(dVar3) ? null : dVar;
                        if (dVar2 != null || dVar5 != null) {
                            linkedHashMap5.put(str4, new zfi.q(pVar, dVar2, dVar5));
                        }
                    } else {
                        IllegalStateException illegalStateException4 = new IllegalStateException("BE returned price range smart filter with different currency");
                        zhm.h0 h0Var4 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
                    }
                } else {
                    IllegalStateException illegalStateException5 = new IllegalStateException(p.a.p("BE returned price range smart filter with reference = ", str4, ", which doesn't match any existing filter."));
                    zhm.h0 h0Var5 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException5, h0Var5);
                }
            }
        }
        return new zfi.a(linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5);
    }
}
