package sdd;

import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vdd.i;
import vdd.o;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public abstract int a(String str);

    public abstract List b(String str);

    public abstract d0 c(String str);

    public abstract i d(String str);

    public List e(String accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        if (i(accountType)) {
            return b(accountType);
        }
        return null;
    }

    public abstract void f(i iVar);

    public abstract void g(o oVar);

    public abstract void h(ArrayList arrayList);

    public abstract boolean i(String str);

    public final ArrayList j(List list, pcd.b bVar) {
        Iterator it8;
        List<i> listB = b(bVar.name());
        int iB = q0.b(w.t(listB, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (i iVar : listB) {
            linkedHashMap.put(iVar.f287894a, iVar.f287901m);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            i iVar2 = (i) it9.next();
            if (iVar2.f287901m != null) {
                it8 = it9;
            } else {
                Long l2 = (Long) linkedHashMap.get(iVar2.f287894a);
                String id10 = iVar2.f287894a;
                String str = iVar2.f287895b;
                String state = iVar2.f287896c;
                vdd.e eVar = iVar2.d;
                String type = iVar2.e;
                String ownerId = iVar2.f;
                long j2 = iVar2.f287897g;
                String str2 = iVar2.f287898h;
                String underlyingId = iVar2.i;
                vdd.d dVar = iVar2.f287899j;
                it8 = it9;
                vdd.a aVar = iVar2.k;
                List list3 = iVar2.f287900l;
                Long l3 = iVar2.f287902n;
                List list4 = iVar2.o;
                String accountType = iVar2.f287903p;
                long j3 = iVar2.f287904q;
                Long l4 = iVar2.f287905r;
                String str3 = iVar2.f287906s;
                String str4 = iVar2.f287907t;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                iVar2 = new i(id10, str, state, eVar, type, ownerId, j2, str2, underlyingId, dVar, aVar, list3, l2, l3, list4, accountType, j3, l4, str3, str4);
            }
            arrayList.add(iVar2);
            it9 = it8;
        }
        return arrayList;
    }

    public List k(pcd.b accountType, ArrayList items) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayListJ = j(items, accountType);
        a(accountType.name());
        h(arrayListJ);
        g(new o(accountType.name()));
        return b(accountType.name());
    }

    public void l(i item) {
        Intrinsics.checkNotNullParameter(item, "item");
        h(j(u.c(item), pcd.b.valueOf(item.f287903p)));
    }
}
