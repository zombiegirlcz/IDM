package zw7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private g() {
    }

    public static ArrayList a() {
        h[] hVarArrValues = h.values();
        ArrayList arrayList = new ArrayList();
        for (h hVar : hVarArrValues) {
            if (hVar != h.UNKNOWN) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }
}
