package mem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes23.dex */
public final class a {
    public static c a(List from, Function1 length, Function2 charAt) {
        Object obj2;
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(length, "length");
        Intrinsics.checkNotNullParameter(charAt, "charAt");
        List list = from;
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                Comparable comparable = (Comparable) length.invoke(next);
                do {
                    Object next2 = it8.next();
                    Comparable comparable2 = (Comparable) length.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            throw new NoSuchElementException("Unable to build char tree from an empty list");
        }
        ((Number) length.invoke(obj2)).intValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (((Number) length.invoke(it9.next())).intValue() == 0) {
                    throw new IllegalArgumentException("There should be no empty entries");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        b(arrayList, from, 0, length, charAt);
        arrayList.trimToSize();
        b root = new b((char) 0, f0.f322471a, arrayList);
        Intrinsics.checkNotNullParameter(root, "root");
        return new c();
    }

    public static void b(ArrayList arrayList, List list, int i, Function1 function1, Function2 function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Character ch5 = (Character) function2.invoke(obj2, Integer.valueOf(i));
            ch5.getClass();
            Object arrayList2 = linkedHashMap.get(ch5);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ch5, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i2 = i + 1;
            ArrayList arrayList3 = new ArrayList();
            a aVar = c.Companion;
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list3) {
                if (((Number) function1.invoke(obj3)).intValue() > i2) {
                    arrayList4.add(obj3);
                }
            }
            aVar.getClass();
            b(arrayList3, arrayList4, i2, function1, function2);
            arrayList3.trimToSize();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list3) {
                if (((Number) function1.invoke(obj4)).intValue() == i2) {
                    arrayList5.add(obj4);
                }
            }
            arrayList.add(new b(cCharValue, arrayList5, arrayList3));
        }
    }
}
