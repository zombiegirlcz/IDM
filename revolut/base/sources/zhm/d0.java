package zhm;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public class d0 extends c0 {
    public static ArrayList A0(Iterable iterable, Object obj2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        boolean z = false;
        for (Object obj3 : iterable) {
            boolean z3 = true;
            if (!z && Intrinsics.f(obj3, obj2)) {
                z = true;
                z3 = false;
            }
            if (z3) {
                arrayList.add(obj3);
            }
        }
        return arrayList;
    }

    public static List B0(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collectionA = a0.A(elements);
        if (collectionA.isEmpty()) {
            return d1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (!collectionA.contains(obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList C0(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return E0(elements, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        a0.x(iterable, arrayList);
        a0.x(elements, arrayList);
        return arrayList;
    }

    public static ArrayList D0(Iterable iterable, Object obj2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return F0(obj2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        a0.x(iterable, arrayList);
        arrayList.add(obj2);
        return arrayList;
    }

    public static ArrayList E0(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            a0.x(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList F0(Object obj2, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj2);
        return arrayList;
    }

    public static ArrayList G0(Collection collection, Sequence elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        a0.y(arrayList, elements);
        return arrayList;
    }

    public static Object H0(Collection collection, tim.c random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return X(random.d(collection.size()), collection);
    }

    public static List I0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return d1(iterable);
        }
        List listG1 = g1(iterable);
        Intrinsics.checkNotNullParameter(listG1, "<this>");
        Collections.reverse(listG1);
        return listG1;
    }

    public static Object J0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return K0((List) iterable);
        }
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object K0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object L0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object M0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List N0(List list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? f0.f322471a : d1(list.subList(indices.f186448a, indices.f186449b + 1));
    }

    public static List O0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listG1 = g1(iterable);
            z.v(listG1);
            return listG1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return d1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return p.c(array);
    }

    public static List P0(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listG1 = g1(iterable);
            z.w(listG1, comparator);
            return listG1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return d1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        p.B(comparator, array);
        return p.c(array);
    }

    public static lim.q Q(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new lim.q(iterable, 3);
    }

    public static Set Q0(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set setH1 = h1(iterable);
        a0.C(other, setH1);
        return setH1;
    }

    public static double R(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it8.hasNext()) {
            dFloatValue += (double) ((Number) it8.next()).floatValue();
            i++;
            if (i < 0) {
                v.r();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static double R0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Iterator it8 = collection.iterator();
        double dDoubleValue = 0.0d;
        while (it8.hasNext()) {
            dDoubleValue += ((Number) it8.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static ArrayList S(Iterable iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        kli.a.g(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itK = kli.a.K(iterable.iterator(), i, i, false);
            while (itK.hasNext()) {
                arrayList.add((List) itK.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList3.add(list.get(i5 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static float S0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        while (it8.hasNext()) {
            fFloatValue += ((Number) it8.next()).floatValue();
        }
        return fFloatValue;
    }

    public static boolean T(Iterable iterable, Object obj2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj2) : f0(iterable, obj2) >= 0;
    }

    public static int T0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        int iIntValue = 0;
        while (it8.hasNext()) {
            iIntValue += ((Number) it8.next()).intValue();
        }
        return iIntValue;
    }

    public static List U(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return d1(h1(iterable));
    }

    public static long U0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        long jLongValue = 0;
        while (it8.hasNext()) {
            jLongValue += ((Number) it8.next()).longValue();
        }
        return jLongValue;
    }

    public static List V(Iterable iterable, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return d1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return f0.f322471a;
            }
            if (size == 1) {
                return u.c(l0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= i) {
                arrayList.add(obj2);
            } else {
                i2++;
            }
        }
        return v.o(arrayList);
    }

    public static List V0(Iterable iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return f0.f322471a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return d1(iterable);
            }
            if (i == 1) {
                return u.c(a0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it8 = iterable.iterator();
        int i2 = 0;
        while (it8.hasNext()) {
            arrayList.add(it8.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return v.o(arrayList);
    }

    public static List W(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return V0(list2, size);
    }

    public static List W0(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return f0.f322471a;
        }
        int size = list.size();
        if (i >= size) {
            return d1(list);
        }
        if (i == 1) {
            return u.c(m0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object X(int i, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        wk4.k defaultValue = new wk4.k(i, 11);
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            defaultValue.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            defaultValue.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj2 : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj2;
            }
            i2 = i3;
        }
        defaultValue.invoke(Integer.valueOf(i));
        throw null;
    }

    public static boolean[] X0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            zArr[i] = ((Boolean) it8.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static ArrayList Y(Collection collection, Function1 predicate) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (((Boolean) predicate.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static byte[] Y0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it8 = collection.iterator();
        int i = 0;
        while (it8.hasNext()) {
            bArr[i] = ((Number) it8.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static ArrayList Z(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj2 : iterable) {
            if (obj2 != null) {
                destination.add(obj2);
            }
        }
        return destination;
    }

    public static void Z0(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            destination.add(it8.next());
        }
    }

    public static Object a0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return b0((List) iterable);
        }
        Iterator it8 = iterable.iterator();
        if (it8.hasNext()) {
            return it8.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static float[] a1(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArr = new float[list.size()];
        Iterator it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            fArr[i] = ((Number) it8.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static Object b0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static HashSet b1(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet(q0.b(w.t(iterable, 12)));
        Z0(iterable, hashSet);
        return hashSet;
    }

    public static Object c0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it8 = iterable.iterator();
        if (it8.hasNext()) {
            return it8.next();
        }
        return null;
    }

    public static int[] c1(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it8 = collection.iterator();
        int i = 0;
        while (it8.hasNext()) {
            iArr[i] = ((Number) it8.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static Object d0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static List d1(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return v.o(g1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return f0.f322471a;
        }
        if (size != 1) {
            return f1(collection);
        }
        return u.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Object e0(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static long[] e1(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it8 = collection.iterator();
        int i = 0;
        while (it8.hasNext()) {
            jArr[i] = ((Number) it8.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static int f0(Iterable iterable, Object obj2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj2);
        }
        int i = 0;
        for (Object obj3 : iterable) {
            if (i < 0) {
                v.s();
                throw null;
            }
            if (Intrinsics.f(obj2, obj3)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static ArrayList f1(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static int g0(Object obj2, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(obj2);
    }

    public static final List g1(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return f1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Z0(iterable, arrayList);
        return arrayList;
    }

    public static Set h0(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        Set setH1 = h1(iterable);
        Intrinsics.checkNotNullParameter(setH1, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        setH1.retainAll(a0.A(elements));
        return setH1;
    }

    public static Set h1(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Z0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final void i0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, Function1 function1) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj2 : iterable) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                kotlin.text.s.a(buffer, obj2, function1);
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append("...");
        }
        buffer.append(postfix);
    }

    public static Set i1(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Z0(iterable, linkedHashSet);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : y0.b(linkedHashSet.iterator().next()) : h0.f322473a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return h0.f322473a;
        }
        if (size2 == 1) {
            return y0.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(q0.b(collection.size()));
        Z0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static /* synthetic */ void j0(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            function1 = null;
        }
        i0(iterable, appendable, str4, str5, str6, -1, function1);
    }

    public static Set j1(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set setH1 = h1(iterable);
        a0.x(other, setH1);
        return setH1;
    }

    public static String k0(Iterable iterable, CharSequence charSequence, String str, String str2, int i, Function1 function1, int i2) throws IOException {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i2 & 2) != 0 ? "" : str;
        String postfix = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb6 = new StringBuilder();
        i0(iterable, sb6, separator, prefix, postfix, i3, function1);
        return sb6.toString();
    }

    public static q k1(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new q(new ulm.p0(iterable, 15));
    }

    public static Object l0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return m0((List) iterable);
        }
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            next = it8.next();
        }
        return next;
    }

    public static ArrayList l1(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it8 = iterable.iterator();
        Iterator it9 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(w.t(iterable, 10), w.t(other, 10)));
        while (it8.hasNext() && it9.hasNext()) {
            arrayList.add(new Pair(it8.next(), it9.next()));
        }
        return arrayList;
    }

    public static Object m0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(v.j(list));
    }

    public static List m1(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        Object next = it8.next();
        while (it8.hasNext()) {
            Object next2 = it8.next();
            arrayList.add(new Pair(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static Object n0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return a0.d.e(1, list);
        }
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            next = it8.next();
        }
        return next;
    }

    public static Object o0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return a0.d.e(1, list);
    }

    public static Comparable p0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it8.next();
        while (it8.hasNext()) {
            Comparable comparable2 = (Comparable) it8.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float q0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it8.next()).floatValue();
        while (it8.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it8.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static float r0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) it8.next()).floatValue();
        while (it8.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it8.next()).floatValue());
        }
        return fFloatValue;
    }

    public static Comparable s0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it8.next();
        while (it8.hasNext()) {
            Comparable comparable2 = (Comparable) it8.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object t0(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            Object next2 = it8.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Comparable u0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it8.next();
        while (it8.hasNext()) {
            Comparable comparable2 = (Comparable) it8.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Double v0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it8 = arrayList.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it8.next()).doubleValue();
        while (it8.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it8.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static Float w0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it8.next()).floatValue();
        while (it8.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it8.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static float x0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) it8.next()).floatValue();
        while (it8.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it8.next()).floatValue());
        }
        return fFloatValue;
    }

    public static Comparable y0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it8 = iterable.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it8.next();
        while (it8.hasNext()) {
            Comparable comparable2 = (Comparable) it8.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object z0(List list, Comparator comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator it8 = list.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            Object next2 = it8.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }
}
