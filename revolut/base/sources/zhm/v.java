package zhm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes13.dex */
public class v extends u {
    public static ArrayList e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        Intrinsics.checkNotNullParameter(elements, "<this>");
        return new ArrayList(new l(true, elements));
    }

    public static int f(List list, Comparable comparable) {
        int size = list.size();
        Intrinsics.checkNotNullParameter(list, "<this>");
        p(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iB = cim.b.b((Comparable) list.get(i3), comparable);
            if (iB < 0) {
                i2 = i3 + 1;
            } else {
                if (iB <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int g(List list, Function1 comparison) {
        int size = list.size();
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        p(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iIntValue = ((Number) comparison.invoke(list.get(i3))).intValue();
            if (iIntValue < 0) {
                i2 = i3 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static f0 h() {
        return f0.f322471a;
    }

    public static IntRange i(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int j(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List k(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? p.c(elements) : f0.f322471a;
    }

    public static List l(Object obj2) {
        return obj2 != null ? u.c(obj2) : f0.f322471a;
    }

    public static List m(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static ArrayList n(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        Intrinsics.checkNotNullParameter(elements, "<this>");
        return new ArrayList(new l(true, elements));
    }

    public static final List o(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : u.c(list.get(0)) : f0.f322471a;
    }

    public static final void p(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(j6.a.l(i2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.mlkit_vision_face.a.m("toIndex (", i2, i, ") is greater than size (", ")."));
        }
    }

    public static List q(Iterable iterable, tim.c random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List listG1 = d0.g1(iterable);
        Intrinsics.checkNotNullParameter(listG1, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int iJ = j(listG1); iJ > 0; iJ--) {
            int iD = random.d(iJ + 1);
            ArrayList arrayList = (ArrayList) listG1;
            arrayList.set(iD, arrayList.set(iJ, arrayList.get(iD)));
        }
        return listG1;
    }

    public static void r() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void s() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
