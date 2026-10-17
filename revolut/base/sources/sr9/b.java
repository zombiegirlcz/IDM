package sr9;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import oq9.k;
import oq9.o;
import oq9.x;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static ArrayList a(ArrayList lineItems) {
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        ArrayList arrayList = new ArrayList(w.t(lineItems, 10));
        Iterator it8 = lineItems.iterator();
        while (it8.hasNext()) {
            SplitLineItem splitLineItem = (SplitLineItem) it8.next();
            String str = splitLineItem.f79212a;
            long j2 = splitLineItem.f79213b;
            String str2 = splitLineItem.f79214c;
            List list = splitLineItem.d;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((SplitMemberType) it9.next()).O7());
            }
            arrayList.add(new k(str, j2, str2, arrayList2));
        }
        return arrayList;
    }

    public static List b(o owner, ArrayList splitLineItems) {
        String str;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(splitLineItems, "splitLineItems");
        SplitLineItem splitLineItem = (SplitLineItem) d0.d0(splitLineItems);
        if (splitLineItem == null || (str = splitLineItem.f79214c) == null) {
            e.h(new IllegalArgumentException("No line items to compute splits"));
            return f0.f322471a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = splitLineItems.iterator();
        while (it8.hasNext()) {
            SplitLineItem splitLineItem2 = (SplitLineItem) it8.next();
            List list = splitLineItem2.d;
            long j2 = splitLineItem2.f79213b;
            if (!list.isEmpty()) {
                long j3 = 0;
                if (j2 == 0) {
                    continue;
                } else {
                    long size = j2 / ((long) list.size());
                    long size2 = j2 % ((long) list.size());
                    int i = 0;
                    for (Object obj2 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            v.s();
                            throw null;
                        }
                        SplitMemberType splitMemberType = (SplitMemberType) obj2;
                        long j5 = j3;
                        if (!Intrinsics.f(splitMemberType.O7(), owner.b())) {
                            long j16 = ((long) (((long) i) < size2 ? 1 : 0)) + size;
                            if (j16 > j5) {
                                Long l2 = (Long) linkedHashMap.get(splitMemberType);
                                linkedHashMap.put(splitMemberType, Long.valueOf((l2 != null ? l2.longValue() : j5) + j16));
                            }
                        }
                        i = i2;
                        j3 = j5;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            SplitMemberType splitMemberType2 = (SplitMemberType) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            x xVar = new x(splitMemberType2.O7());
            xi0.b.Companion.getClass();
            arrayList.add(new oq9.w(xVar, new dj0.d(jLongValue, xi0.a.a(str)), false));
        }
        return arrayList;
    }
}
