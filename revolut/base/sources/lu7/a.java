package lu7;

import com.revolut.feature.insurance_embedded.impl.data.network.InsuranceEmbeddedService;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f200060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f200061b;

    public a(b bVar, int i) {
        this.f200060a = bVar;
        this.f200061b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f200060a;
        nj0.a aVar = bVar.f200065a;
        ee0.a aVar2 = bVar.f200066b;
        int i = this.f200061b;
        switch (i) {
            case 0:
                return new nu7.j((hu7.b) bVar.f200068g.get());
            case 1:
                return new hu7.b((InsuranceEmbeddedService) bVar.e.get(), (ne0.j) bVar.d.get(), (ue0.c) bVar.f.get());
            case 2:
                return new ne0.d();
            case 3:
                ik0.b bVarM = ((nj0.d) aVar).m();
                vc.s.j(bVarM);
                return p0.a(((nj0.d) aVar).d(), bVarM);
            case 4:
                je0.d dVarD = aVar2.d();
                vc.s.j(dVarD);
                yk0.a aVarB = bVar.f200067c.b();
                vc.s.j(aVarB);
                xe0.f fVarF = aVar2.f();
                vc.s.j(fVarF);
                return m0.A(dVarD, aVarB, fVarF);
            case 5:
                return new mu7.a((hu7.j) bVar.f200069h.get());
            case 6:
                return new hu7.j((InsuranceEmbeddedService) bVar.e.get(), (ne0.j) bVar.d.get(), (ue0.c) bVar.f.get());
            default:
                throw new AssertionError(i);
        }
    }
}
