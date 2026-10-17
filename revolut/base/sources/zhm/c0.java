package zhm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class c0 extends b0 {
    public static ArrayList N(Iterable iterable, Class klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj2 : iterable) {
            if (klass.isInstance(obj2)) {
                destination.add(obj2);
            }
        }
        return destination;
    }

    public static SortedSet O(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        TreeSet treeSet = new TreeSet();
        d0.Z0(iterable, treeSet);
        return treeSet;
    }

    public static SortedSet P(List list, Comparator comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        TreeSet treeSet = new TreeSet(comparator);
        d0.Z0(list, treeSet);
        return treeSet;
    }
}
