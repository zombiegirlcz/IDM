package m4k;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static ArrayList a(List list, List list2) {
        dj0.d amount;
        ArrayList<nrf.d> arrayListE0 = d0.E0(list2, list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (nrf.d dVar : arrayListE0) {
            String str = dVar.f;
            dj0.d dVarO = dVar.d;
            if (str != null) {
                dj0.d dVar2 = (dj0.d) linkedHashMap.get(str);
                if (dVar2 != null) {
                    dVarO = pyd.c.O(dVar2, dVarO);
                }
                linkedHashMap.put(str, dVarO);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (nrf.d dVar3 : arrayListE0) {
            String str2 = dVar3.f;
            nrf.d dVar4 = null;
            if (str2 != null && (amount = (dj0.d) linkedHashMap.get(str2)) != null && !linkedHashSet.contains(str2)) {
                linkedHashSet.add(str2);
                if (!amount.equals(dVar3.d)) {
                    String shortDescription = dVar3.f218630a;
                    String title = dVar3.f218631b;
                    String description = dVar3.f218632c;
                    dj0.d dVar5 = dVar3.e;
                    String str3 = dVar3.f;
                    Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    dVar3 = new nrf.d(shortDescription, title, description, amount, dVar5, str3);
                }
                dVar4 = dVar3;
            }
            if (dVar4 != null) {
                arrayList.add(dVar4);
            }
        }
        return arrayList;
    }

    public static nrf.e b(nrf.e eVar, nrf.e eVar2) {
        dj0.d dVarO;
        dj0.d dVarO2;
        if (eVar != null) {
            nrf.h hVar = eVar.f218635c;
            nrf.f fVar = eVar.f218634b;
            if (eVar2 != null) {
                try {
                    nrf.h hVar2 = eVar2.f218635c;
                    dj0.d dVar = hVar2.f218643c;
                    nrf.f fVar2 = eVar2.f218634b;
                    dj0.d dVar2 = fVar2.d;
                    dj0.d dVarO3 = pyd.c.O(eVar.f218633a, eVar2.f218633a);
                    dj0.d dVarO4 = pyd.c.O(fVar.f218636a, fVar2.f218636a);
                    boolean z = fVar.f218637b;
                    ArrayList arrayListA = a(fVar.f218638c, fVar2.f218638c);
                    dj0.d dVar3 = fVar.d;
                    if (dVar3 != null && (dVarO2 = pyd.c.O(dVar3, dVar2)) != null) {
                        dVar2 = dVarO2;
                    }
                    nrf.f fVar3 = new nrf.f(dVarO4, z, arrayListA, dVar2);
                    dj0.d dVarO5 = pyd.c.O(hVar.f218641a, hVar2.f218641a);
                    ArrayList arrayListA2 = a(hVar.f218642b, hVar2.f218642b);
                    dj0.d dVar4 = hVar.f218643c;
                    if (dVar4 != null && (dVarO = pyd.c.O(dVar4, dVar)) != null) {
                        dVar = dVarO;
                    }
                    return new nrf.e(dVarO3, fVar3, new nrf.h(dVarO5, dVar, arrayListA2));
                } catch (IllegalStateException e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            }
        }
        return eVar == null ? eVar2 : eVar;
    }
}
