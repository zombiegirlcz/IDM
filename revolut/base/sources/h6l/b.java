package h6l;

import h93.f0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f149757a;

    static {
        String[] elements = {"disposable", "disposablePro", "disposableProFRNW", "disposableCredit"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f149757a = d.y0(elements);
    }

    private b() {
    }

    public static List a(List preSortedCards, List orderIds) {
        Map mapC;
        Intrinsics.checkNotNullParameter(preSortedCards, "preSortedCards");
        Intrinsics.checkNotNullParameter(orderIds, "orderIds");
        if (!orderIds.isEmpty()) {
            q qVarK1 = d0.k1(orderIds);
            int iB = q0.b(w.t(qVarK1, 10));
            if (iB < 16) {
                iB = 16;
            }
            mapC = new LinkedHashMap(iB);
            Iterator it8 = qVarK1.iterator();
            while (true) {
                kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
                if (!((Iterator) dVar.f186416c).hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) dVar.next();
                mapC.put((String) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
            }
        } else {
            mapC = q0.c(new Pair("disposable", 0));
        }
        return d0.P0(preSortedCards, new a(cim.b.g(cim.b.e()), mapC, 0));
    }

    public static String b(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        b93.b bVar = card.f150114h.f13639a;
        b93.b.Companion.getClass();
        return Intrinsics.f(bVar, b93.b.i0) ? "disposable" : Intrinsics.f(bVar, b93.b.E0) ? "disposableCredit" : Intrinsics.f(bVar, b93.b.f13608x0) ? "disposablePro" : Intrinsics.f(bVar, b93.b.z0) ? "disposableProFRNW" : card.f150110a;
    }
}
