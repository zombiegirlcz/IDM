package j9l;

import dj0.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import xi0.b;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e9l.a {

    @NotNull
    private static final C0980a Companion = new C0980a();

    /* JADX INFO: renamed from: j9l.a$a, reason: collision with other inner class name */
    public static final class C0980a {
        private C0980a() {
        }
    }

    public final d a(b targetCcy, Iterable items, Collection rates) {
        Intrinsics.checkNotNullParameter(targetCcy, "targetCcy");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(rates, "rates");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : items) {
            b bVar = ((d) obj2).f115083b;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (true) {
            long j2 = 0;
            if (!it8.hasNext()) {
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    j2 += ((d) it9.next()).f115082a;
                }
                return new d(j2, targetCcy);
            }
            Map.Entry entry = (Map.Entry) it8.next();
            b bVar2 = (b) entry.getKey();
            Iterator it10 = ((List) entry.getValue()).iterator();
            while (it10.hasNext()) {
                j2 += ((d) it10.next()).f115082a;
            }
            d dVar = new d(j2, bVar2);
            if (!Intrinsics.f(targetCcy, bVar2)) {
                Double dM = l.m(rates, bVar2, targetCcy);
                if (dM == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(c.ERROR, "MoneyCalculator", j6.a.s("No ", bVar2.f306286a, "-", targetCcy.f306286a, " rate provided, return null"), null, h0Var);
                    return null;
                }
                dVar = pyd.c.K(dVar, dM.doubleValue(), targetCcy);
            }
            arrayList2.add(dVar);
        }
    }
}
