package cf5;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.Comparator;
import ofm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        io3.d dVar;
        io3.d dVar2;
        we5.a aVar = (we5.a) obj3;
        dj0.d dVarJ = aVar.e;
        if (!aVar.f296622a.f88087b.f88067m && (dVar2 = aVar.f296624c) != null) {
            dVarJ = z92.f.j(dVar2);
        }
        dj0.d dVarO = pyd.c.O(dVarJ, aVar.b());
        qta.c cVar = aVar.d;
        dj0.d dVarC = cVar != null ? t1.C(dVarO, q.f0(cVar)) : null;
        we5.a aVar2 = (we5.a) obj2;
        dj0.d dVarJ2 = aVar2.e;
        if (!aVar2.f296622a.f88087b.f88067m && (dVar = aVar2.f296624c) != null) {
            dVarJ2 = z92.f.j(dVar);
        }
        dj0.d dVarO2 = pyd.c.O(dVarJ2, aVar2.b());
        qta.c cVar2 = aVar2.d;
        return cim.b.b(dVarC, cVar2 != null ? t1.C(dVarO2, q.f0(cVar2)) : null);
    }
}
