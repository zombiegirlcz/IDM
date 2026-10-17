package ypg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static go.g a(List accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List list = accounts;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((s) it8.next()).f234881a);
        }
        Set setI1 = d0.i1(arrayList);
        int iB = q0.b(w.t(setI1, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it9 = setI1.iterator();
        while (it9.hasNext()) {
            linkedHashMap.put((String) it9.next(), nib.a.a());
        }
        return zi0.c.i(linkedHashMap);
    }
}
