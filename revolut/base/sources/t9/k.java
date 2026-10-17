package t9;

import d9.z;
import java.io.Serializable;
import k9.p;
import k9.q;

/* JADX INFO: loaded from: classes16.dex */
public abstract class k implements k9.d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f268932a;

    public k(q qVar) {
        this.f268932a = qVar == null ? q.f182189j : qVar;
    }

    @Override // k9.d
    public final z c(m9.h hVar, Class cls) {
        p pVarE = hVar.e();
        p9.f fVarB = b();
        if (fVarB == null) {
            m9.i iVar = (m9.i) hVar;
            iVar.f(cls);
            z zVar = (z) iVar.f203602g.f25476b;
            if (zVar == null) {
                return null;
            }
            return zVar;
        }
        m9.i iVar2 = (m9.i) hVar;
        iVar2.f(fVarB.f());
        iVar2.f(cls);
        z zVar2 = (z) iVar2.f203602g.f25476b;
        if (zVar2 == null) {
            zVar2 = null;
        }
        z zVar3 = zVar2 != null ? zVar2 : null;
        z zVarB = pVarE.B(fVarB);
        return zVar3 == null ? zVarB : zVar3.a(zVarB);
    }

    @Override // k9.d
    public final d9.p d(m9.h hVar, Class cls) {
        d9.p pVarH = hVar.h(cls);
        p pVarE = hVar.e();
        p9.f fVarB = b();
        d9.p pVarI = fVarB != null ? pVarE.i(fVarB) : null;
        return pVarH == null ? pVarI == null ? k9.d.m1 : pVarI : pVarI == null ? pVarH : pVarH.d(pVarI);
    }

    public k(c cVar) {
        this.f268932a = cVar.f268932a;
    }
}
