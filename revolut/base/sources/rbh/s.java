package rbh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    public static io3.d a(xi0.b targetCurrency, Pair walletWithPockets, Set prohibitedCurrencies) throws Throwable {
        Object obj2;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
        Intrinsics.checkNotNullParameter(prohibitedCurrencies, "prohibitedCurrencies");
        fo3.c cVar = (fo3.c) walletWithPockets.f186385a;
        List<io3.d> list = (List) walletWithPockets.f186386b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (!prohibitedCurrencies.contains(z92.f.l((io3.d) obj3))) {
                arrayList.add(obj3);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            io3.d dVar = (io3.d) next;
            if (dVar.e == io3.l.CURRENT && dVar.f == io3.k.ACTIVE && z92.f.l(dVar).equals(targetCurrency)) {
                break;
            }
        }
        io3.d dVar2 = (io3.d) next;
        if (dVar2 != null) {
            return dVar2;
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (z92.f.l((io3.d) next2).equals(cVar.d)) {
                break;
            }
        }
        io3.d dVar3 = (io3.d) next2;
        if (dVar3 != null) {
            return dVar3;
        }
        Iterator it10 = arrayList.iterator();
        while (true) {
            if (!it10.hasNext()) {
                break;
            }
            Object next3 = it10.next();
            io3.d dVar4 = (io3.d) next3;
            if (dVar4.e == io3.l.CURRENT && dVar4.f == io3.k.ACTIVE) {
                obj2 = next3;
                break;
            }
        }
        io3.d dVar5 = (io3.d) obj2;
        if (dVar5 != null) {
            return dVar5;
        }
        hx7.e.n(new Exception("No eligible source pocket found: all pockets use prohibited currencies"));
        for (io3.d dVar6 : list) {
            if (z92.f.l(dVar6).equals(cVar.d)) {
                return dVar6;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
