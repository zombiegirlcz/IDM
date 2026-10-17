package lu7;

import com.revolut.feature.insurance_embedded.impl.data.network.InsuranceEmbeddedService;
import qgk.k3;

/* JADX INFO: loaded from: classes13.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f200155b;

    public r(s sVar, int i) {
        this.f200154a = sVar;
        this.f200155b = i;
    }

    @Override // phm.a
    public final Object get() {
        s sVar = this.f200154a;
        int i = this.f200155b;
        switch (i) {
            case 0:
                sri.m mVar = (sri.m) sVar.f200165p.get();
                cu7.c cVar = (cu7.c) sVar.u.get();
                kw7.c cVar2 = (kw7.c) sVar.e.k.get();
                vc.s.j(cVar2);
                return new ku7.e(mVar, cVar, cVar2);
            case 1:
                return m0.u(sVar.f200156a);
            case 2:
                return new nu7.j((hu7.b) sVar.f200169t.get());
            case 3:
                return new hu7.b((InsuranceEmbeddedService) sVar.f200167r.get(), (ne0.j) sVar.f200166q.get(), (ue0.c) sVar.f200168s.get());
            case 4:
                return new ne0.d();
            case 5:
                ik0.b bVarM = ((nj0.d) sVar.f200157b).m();
                vc.s.j(bVarM);
                return p0.a(((nj0.d) sVar.f200157b).d(), bVarM);
            case 6:
                je0.d dVarD = sVar.f200158c.d();
                vc.s.j(dVarD);
                yk0.a aVarB = sVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = sVar.f200158c.f();
                vc.s.j(fVarF);
                return m0.A(dVarD, aVarB, fVarF);
            case 7:
                return new eu7.e((hu7.j) sVar.f200170w.get());
            case 8:
                return new hu7.j((InsuranceEmbeddedService) sVar.f200167r.get(), (ne0.j) sVar.f200166q.get(), (ue0.c) sVar.f200168s.get());
            case 9:
                return new hu7.o((InsuranceEmbeddedService) sVar.f200167r.get(), (ne0.j) sVar.f200166q.get(), (ue0.c) sVar.f200168s.get());
            case 10:
                dha.c cVarI = sVar.f200162l.i();
                vc.s.j(cVarI);
                return new mu7.e(cVarI, (hu7.l) sVar.z.get());
            case 11:
                return new hu7.l((InsuranceEmbeddedService) sVar.f200167r.get(), (ne0.j) sVar.f200166q.get(), (ue0.c) sVar.f200168s.get());
            case 12:
                l93.f fVarJ = sVar.f200163m.j();
                vc.s.j(fVarJ);
                return new eu7.b(fVarJ);
            case 13:
                return new xv7.b(sVar.f200161j.g());
            case 14:
                return new xv7.f(sVar.f200161j.g());
            case 15:
                return new xv7.d(sVar.f200161j.g());
            case 16:
                yik.h hVarB = ((k3) sVar.f200164n).b();
                ffk.t tVarF = sVar.f200162l.f();
                vc.s.j(tVarF);
                return new xv7.p(hVarB, tVarF);
            case 17:
                hu7.j jVar = (hu7.j) sVar.f200170w.get();
                ffk.t tVarF2 = sVar.f200162l.f();
                vc.s.j(tVarF2);
                return new mu7.c(jVar, tVarF2);
            case 18:
                return new mu7.a((hu7.j) sVar.f200170w.get());
            case 19:
                return new xv7.r();
            case 20:
                return new xv7.i();
            case 21:
                return new xv7.e(sVar.f200161j.g());
            default:
                throw new AssertionError(i);
        }
    }
}
