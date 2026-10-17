package h36;

import g36.d;
import i36.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import xi0.e;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f149038a = new a();

    private a() {
    }

    public static LinkedHashMap a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<c> list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (c cVar : list2) {
            String str = cVar.f158104a;
            int i = cVar.f158106c;
            e eVar = e.CRYPTO;
            String str2 = cVar.e;
            String str3 = cVar.f158105b;
            Integer numValueOf = Integer.valueOf(cVar.d);
            String str4 = cVar.f;
            linkedHashMap.put(str, new xi0.c(i, eVar, str2, str3, str2, numValueOf, str4 == null ? "" : str4, str4 == null ? "" : str4));
        }
        return linkedHashMap;
    }

    public static ArrayList b(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            xi0.c cVar = (xi0.c) entry.getValue();
            arrayList.add(new d(cVar.f306288a, cVar.f306291g, str, cVar.d, cVar.e, cVar.i));
        }
        return arrayList;
    }
}
