package lne;

import com.revolut.feature.tax_residency.impl.exemption.services.TaxExemptionService;
import ljl.w1;
import ne0.j;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f197215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f197216b;

    public b(c cVar, int i) {
        this.f197215a = cVar;
        this.f197216b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f197215a;
        nj0.a aVar = cVar.f197218b;
        ee0.a aVar2 = cVar.f197219c;
        int i = this.f197216b;
        switch (i) {
            case 0:
                return new kne.b((m) cVar.f197220g.get(), (wme.a) cVar.f197223l.get());
            case 1:
                return w1.k(cVar.f197217a);
            case 2:
                return new nne.a((sne.g) cVar.k.get());
            case 3:
                return new sne.g((TaxExemptionService) cVar.f197221h.get(), (j) cVar.i.get(), (ue0.c) cVar.f197222j.get());
            case 4:
                ik0.b bVarM = ((nj0.d) aVar).m();
                s.j(bVarM);
                return i.a(((nj0.d) aVar).d(), bVarM);
            case 5:
                return new ne0.d();
            case 6:
                je0.d dVarD = aVar2.d();
                s.j(dVarD);
                yk0.a aVarB = cVar.d.b();
                s.j(aVarB);
                xe0.f fVarF = aVar2.f();
                s.j(fVarF);
                return w1.v(dVarD, aVarB, fVarF);
            case 7:
                return new jne.a();
            case 8:
                return new nne.b((sne.g) cVar.k.get());
            default:
                throw new AssertionError(i);
        }
    }
}
