package qnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nnd.c1;
import nnd.j;
import zhm.a1;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static LinkedHashSet a(AnalyticsAccount analyticsAccount, AnalyticsAccount analyticsAccount2, j jVar, Function1 function1) {
        int i;
        Set set = jVar.f217562c;
        ArrayList arrayList = jVar.d;
        if (set.contains(analyticsAccount2)) {
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((c1) it8.next()).a());
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj2 : arrayList2) {
                AnalyticsAccount analyticsAccount3 = (AnalyticsAccount) obj2;
                if (((Boolean) function1.invoke(analyticsAccount3)).booleanValue() && !Intrinsics.f(analyticsAccount3, analyticsAccount)) {
                    linkedHashSet.add(obj2);
                }
            }
            return a1.l(a1.j(set, analyticsAccount2), linkedHashSet);
        }
        LinkedHashSet linkedHashSetM = a1.m(set, analyticsAccount);
        int i2 = 0;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it9 = arrayList.iterator();
            i = 0;
            while (it9.hasNext()) {
                if (((Boolean) function1.invoke(((c1) it9.next()).a())).booleanValue() && (i = i + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        if (!linkedHashSetM.isEmpty()) {
            Iterator it10 = linkedHashSetM.iterator();
            while (it10.hasNext()) {
                if (((Boolean) function1.invoke((AnalyticsAccount) it10.next())).booleanValue() && (i2 = i2 + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        if (i != i2) {
            return linkedHashSetM;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj3 : linkedHashSetM) {
            if (!((Boolean) function1.invoke((AnalyticsAccount) obj3)).booleanValue()) {
                linkedHashSet2.add(obj3);
            }
        }
        return a1.m(linkedHashSet2, analyticsAccount2);
    }
}
