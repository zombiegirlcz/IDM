package rj1;

import com.revolut.feature.advised_components.network.AdvisedComponentsService;
import rga.l;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f254602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f254603b;

    public d(e eVar, int i) {
        this.f254602a = eVar;
        this.f254603b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f254602a;
        nj0.a aVar = eVar.f254604a;
        ee0.a aVar2 = eVar.f254605b;
        int i = this.f254603b;
        if (i == 0) {
            AdvisedComponentsService advisedComponentsService = (AdvisedComponentsService) eVar.f.get();
            ne0.d dVar = new ne0.d();
            ue0.c cVar = (ue0.c) eVar.f254607g.get();
            gte.a aVarB = eVar.d.b();
            s.j(aVarB);
            return new vj1.b(advisedComponentsService, dVar, cVar, aVarB);
        }
        if (i == 1) {
            ek.a aVarD = ((nj0.d) aVar).d();
            ik0.b bVarM = ((nj0.d) aVar).m();
            s.j(bVarM);
            return c.a(aVarD, bVarM);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        je0.d dVarD = aVar2.d();
        s.j(dVarD);
        yk0.a aVarB2 = eVar.f254606c.b();
        s.j(aVarB2);
        f fVarF = aVar2.f();
        s.j(fVarF);
        return l.w(dVarD, aVarB2, fVarF);
    }
}
