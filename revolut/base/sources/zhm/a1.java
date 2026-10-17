package zhm;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class a1 extends z0 {
    public static LinkedHashSet j(Set set, Object obj2) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(q0.b(set.size()));
        boolean z = false;
        for (Object obj3 : set) {
            boolean z3 = true;
            if (!z && Intrinsics.f(obj3, obj2)) {
                z = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(obj3);
            }
        }
        return linkedHashSet;
    }

    public static Set k(Set set, Iterable elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> collectionA = a0.A(elements);
        if (collectionA.isEmpty()) {
            return d0.i1(set);
        }
        if (!(collectionA instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionA);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj2 : set) {
            if (!((Set) collectionA).contains(obj2)) {
                linkedHashSet2.add(obj2);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet l(Set set, Iterable elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(q0.b(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        a0.x(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet m(Set set, Object obj2) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(q0.b(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj2);
        return linkedHashSet;
    }
}
