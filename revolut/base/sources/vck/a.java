package vck;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import pck.h;
import pck.i;
import tck.g;
import tck.j;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final List a(g.c cVar) {
        h hVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List list = cVar.f269868a;
        ArrayList arrayList = null;
        if (list != null) {
            List<j> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (j jVar : list2) {
                String str = jVar.f269871a;
                String str2 = jVar.f269872b;
                h[] hVarArrValues = h.values();
                int length = hVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        hVar = null;
                        break;
                    }
                    hVar = hVarArrValues[i];
                    if (a0.z(hVar.name(), str2, true)) {
                        break;
                    }
                    i++;
                }
                if (hVar == null) {
                    hVar = h.UNKNOWN;
                }
                arrayList2.add(new i(str, hVar));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }
}
