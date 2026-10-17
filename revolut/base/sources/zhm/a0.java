package zhm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public class a0 extends z {
    public static final Collection A(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : d0.d1(iterable);
    }

    public static final boolean B(Iterable iterable, Function1 function1, boolean z) {
        Iterator it8 = iterable.iterator();
        boolean z3 = false;
        while (it8.hasNext()) {
            if (((Boolean) function1.invoke(it8.next())).booleanValue() == z) {
                it8.remove();
                z3 = true;
            }
        }
        return z3;
    }

    public static void C(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        collection.removeAll(A(elements));
    }

    public static void D(Iterable iterable, Function1 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        B(iterable, predicate, true);
    }

    public static boolean E(List list, Function1 predicate) {
        int i;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if ((list instanceof pim.a) && !(list instanceof pim.b)) {
                kotlin.jvm.internal.u0.i(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                return B(list, predicate, true);
            } catch (ClassCastException e) {
                Intrinsics.n(e, kotlin.jvm.internal.u0.class.getName());
                throw e;
            }
        }
        int iJ = v.j(list);
        if (iJ >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj2 = list.get(i2);
                if (!((Boolean) predicate.invoke(obj2)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj2);
                    }
                    i++;
                }
                if (i2 == iJ) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iJ2 = v.j(list);
        if (i <= iJ2) {
            while (true) {
                list.remove(iJ2);
                if (iJ2 == i) {
                    break;
                }
                iJ2--;
            }
        }
        return true;
    }

    public static Object F(AbstractList abstractList) {
        Intrinsics.checkNotNullParameter(abstractList, "<this>");
        if (abstractList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return abstractList.remove(0);
    }

    public static Object G(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object H(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(v.j(list));
    }

    public static Object I(AbstractList abstractList) {
        Intrinsics.checkNotNullParameter(abstractList, "<this>");
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(v.j(abstractList));
    }

    public static void x(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it8 = elements.iterator();
        while (it8.hasNext()) {
            collection.add(it8.next());
        }
    }

    public static void y(ArrayList arrayList, Sequence elements) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it8 = elements.iterator();
        while (it8.hasNext()) {
            arrayList.add(it8.next());
        }
    }

    public static void z(Collection collection, Object[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        collection.addAll(p.c(elements));
    }
}
