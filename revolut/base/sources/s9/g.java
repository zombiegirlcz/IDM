package s9;

import au0.u2;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k9.p;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends c8g.c implements Serializable {
    public static void M(p9.a aVar, r9.a aVar2, m9.h hVar, p pVar, HashMap map) {
        String strU;
        if (aVar2.f252472c == null && (strU = pVar.U(aVar)) != null) {
            aVar2 = new r9.a(aVar2.f252470a, strU);
        }
        r9.a aVar3 = new r9.a(aVar2.f252470a, null);
        if (map.containsKey(aVar3)) {
            if (aVar2.f252472c == null || ((r9.a) map.get(aVar3)).f252472c != null) {
                return;
            }
            map.put(aVar3, aVar2);
            return;
        }
        map.put(aVar3, aVar2);
        List listS = pVar.S(aVar);
        if (listS != null) {
            ArrayList<r9.a> arrayList = (ArrayList) listS;
            if (arrayList.isEmpty()) {
                return;
            }
            for (r9.a aVar4 : arrayList) {
                M(u2.j(hVar, aVar4.f252470a), aVar4, hVar, pVar, map);
            }
        }
    }

    public final ArrayList N(m9.h hVar, p9.f fVar, JavaType javaType) {
        Class clsF;
        List listS;
        p pVarE = hVar.e();
        if (javaType != null) {
            clsF = javaType.f26182a;
        } else {
            if (fVar == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            clsF = fVar.f();
        }
        HashMap map = new HashMap();
        if (fVar != null && (listS = pVarE.S(fVar)) != null) {
            for (r9.a aVar : (ArrayList) listS) {
                M(u2.j(hVar, aVar.f252470a), aVar, hVar, pVarE, map);
            }
        }
        M(u2.j(hVar, clsF), new r9.a(clsF, null), hVar, pVarE, map);
        return new ArrayList(map.values());
    }
}
