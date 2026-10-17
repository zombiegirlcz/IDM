package meg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zfi.j;
import zfi.k;
import zfi.l;
import zfi.n;
import zfi.o;
import zfi.p;
import zfi.q;
import zfi.r;
import zfi.s;
import zfi.t;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static zfi.a a(zfi.a current, d change) {
        g fVar;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(change, "change");
        zfi.b bVar = change.f204665a;
        Set set = change.f204666b;
        Object obj2 = null;
        if (bVar instanceof j) {
            j jVar = (j) bVar;
            String str = jVar.f321975a;
            k kVar = jVar.f321977c;
            String str2 = kVar.f321978a;
            ArrayList<n> arrayList = kVar.f321979b;
            ArrayList arrayList2 = new ArrayList();
            for (n nVar : arrayList) {
                efi.a aVar = new efi.a(true, nVar);
                if (!set.contains(nVar.f321982a)) {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            fVar = new c(str, str2, arrayList2);
        } else {
            if (!(bVar instanceof r)) {
                if (!(bVar instanceof zfi.g) && !(bVar instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("This filter doesn't have options: " + bVar);
            }
            r rVar = (r) bVar;
            String str3 = rVar.f321994a;
            s sVar = rVar.f321996c;
            String str4 = sVar.f321997a;
            Iterator it8 = sVar.f321998b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (set.contains(((n) next).f321982a)) {
                    obj2 = next;
                    break;
                }
            }
            fVar = new f(str3, str4, (n) obj2);
        }
        return b(current, fVar);
    }

    public static zfi.a b(zfi.a current, g change) {
        Map mapL;
        l lVar;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(change, "change");
        if (change instanceof a) {
            Map map = current.f321951a;
            a aVar = (a) change;
            zfi.i iVar = aVar.f204658b;
            String str = aVar.f204657a;
            return zfi.a.a(current, iVar.f321974c ? r0.q(map, new Pair(str, iVar)) : r0.l(str, map), null, null, null, 14);
        }
        if (change instanceof b) {
            Map map2 = current.f321952b;
            b bVar = (b) change;
            String str2 = bVar.f204659a;
            efi.a aVar2 = bVar.f204661c;
            Object obj2 = aVar2.f125328b;
            boolean z = aVar2.f125327a;
            l lVar2 = (l) map2.get(str2);
            if (lVar2 != null) {
                Set set = lVar2.f321981b;
                lVar = l.a(lVar2, z ? a1.m(set, obj2) : a1.j(set, obj2));
            } else {
                lVar = new l(bVar.f204660b, z ? y0.b(obj2) : h0.f322473a);
            }
            return zfi.a.a(current, null, !lVar.f321981b.isEmpty() ? r0.q(map2, new Pair(str2, lVar)) : r0.l(str2, map2), null, null, 13);
        }
        if (change instanceof f) {
            Map map3 = current.f321953c;
            f fVar = (f) change;
            n nVar = fVar.f204671c;
            String str3 = fVar.f204669a;
            return zfi.a.a(current, null, null, nVar != null ? r0.q(map3, new Pair(str3, new t(fVar.f204670b, nVar))) : r0.l(str3, map3), null, 11);
        }
        if (change instanceof e) {
            Map map4 = current.d;
            e eVar = (e) change;
            q qVar = eVar.f204668b;
            String str4 = eVar.f204667a;
            dj0.d dVar = qVar.f321993c;
            dj0.d dVar2 = qVar.f321992b;
            p pVar = qVar.f321991a;
            boolean z3 = true;
            boolean z4 = dVar == null || dVar.equals(pVar.d);
            if (dVar2 != null && !dVar2.equals(pVar.f321990c)) {
                z3 = false;
            }
            if (z3) {
                dVar2 = null;
            }
            return zfi.a.a(current, null, null, null, (z4 && z3) ? r0.l(str4, map4) : r0.q(map4, new Pair(str4, q.a(qVar, dVar2, z4 ? null : qVar.f321993c))), 7);
        }
        if (!(change instanceof c)) {
            if (change instanceof d) {
                return a(current, (d) change);
            }
            throw new NoWhenBranchMatchedException();
        }
        Map map5 = current.f321952b;
        c cVar = (c) change;
        ArrayList<efi.a> arrayList = cVar.f204664c;
        String str5 = cVar.f204662a;
        if (arrayList.isEmpty()) {
            mapL = r0.l(str5, map5);
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((efi.a) it8.next()).f125327a) {
                    String str6 = cVar.f204663b;
                    ArrayList arrayList2 = new ArrayList();
                    for (efi.a aVar3 : arrayList) {
                        Object obj3 = aVar3.f125328b;
                        if (!aVar3.f125327a) {
                            obj3 = null;
                        }
                        n nVar2 = (n) obj3;
                        if (nVar2 != null) {
                            arrayList2.add(nVar2);
                        }
                    }
                    mapL = r0.q(map5, new Pair(str5, new l(str6, d0.i1(arrayList2))));
                }
            }
            mapL = r0.l(str5, map5);
        }
        return zfi.a.a(current, null, mapL, null, null, 13);
    }
}
