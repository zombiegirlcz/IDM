package ael;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class r {
    public static dj0.d a(ArrayList arrayList, xi0.b bVar, List list) {
        if (arrayList.isEmpty()) {
            return new dj0.d(0L, bVar);
        }
        ArrayList arrayListF0 = zhm.d0.F0(new n9l.a(1.0d, bVar, bVar), list);
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            if (i == 0) {
                dj0.d dVar = (dj0.d) obj2;
                dVarO = pyd.c.K(dVar, hx7.b.m(arrayListF0, dVar.f115083b, bVar).f213663c, bVar);
            } else {
                dj0.d dVar2 = (dj0.d) obj2;
                dVarO = pyd.c.O(dVarO, pyd.c.K(dVar2, hx7.b.m(arrayListF0, dVar2.f115083b, bVar).f213663c, bVar));
            }
            i = i2;
        }
        return dVarO;
    }
}
