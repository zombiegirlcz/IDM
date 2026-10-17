package zhm;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes14.dex */
public class k0 {
    public static Map a(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itSourceIterator = j0Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            Object objKeyOf = j0Var.keyOf(itSourceIterator.next());
            Object ref$IntRef = linkedHashMap.get(objKeyOf);
            if (ref$IntRef == null && !linkedHashMap.containsKey(objKeyOf)) {
                ref$IntRef = new Ref$IntRef();
            }
            Ref$IntRef ref$IntRef2 = (Ref$IntRef) ref$IntRef;
            ref$IntRef2.f186408a++;
            linkedHashMap.put(objKeyOf, ref$IntRef2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Intrinsics.i(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            if ((entry instanceof pim.a) && !(entry instanceof pim.e)) {
                kotlin.jvm.internal.u0.i(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((Ref$IntRef) entry.getValue()).f186408a));
        }
        return kotlin.jvm.internal.u0.d(linkedHashMap);
    }
}
