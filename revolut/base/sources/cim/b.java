package cim;

import ael.f;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class b {
    public static afa.a a(Function1... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new afa.a(selectors, 1);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int c(Object obj2, Object obj3, Function1... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return d(obj2, obj3, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int d(Object obj2, Object obj3, Function1[] function1Arr) {
        for (Function1 function1 : function1Arr) {
            int iB = b((Comparable) function1.invoke(obj2), (Comparable) function1.invoke(obj3));
            if (iB != 0) {
                return iB;
            }
        }
        return 0;
    }

    public static Comparator e() {
        d dVar = d.f24565a;
        Intrinsics.i(dVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return dVar;
    }

    public static a f(Comparator comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new a(comparator, 0);
    }

    public static a g(Comparator comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new a(comparator, 1);
    }

    public static Comparator h() {
        e eVar = e.f24566a;
        Intrinsics.i(eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return eVar;
    }

    public static f i(Comparator comparator, Comparator comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new f(comparator, comparator2, 2);
    }
}
