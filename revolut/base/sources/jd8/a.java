package jd8;

import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentPromptService;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentRequestService;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentService;
import gd8.p;
import kd8.q;
import kd8.v;
import kd8.x;
import te8.z;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f172998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172999b;

    public a(b bVar, int i) {
        this.f172998a = bVar;
        this.f172999b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f172998a;
        int i = this.f172999b;
        switch (i) {
            case 0:
                return new ld8.c((kd8.e) bVar.f173008n.get(), (q) bVar.f173010q.get());
            case 1:
                return new kd8.e((gd8.i) bVar.f173007m.get());
            case 2:
                JuniorConsentService juniorConsentService = (JuniorConsentService) bVar.f173005j.get();
                ne0.j jVar = (ne0.j) bVar.k.get();
                ue0.c cVar = (ue0.c) bVar.f173006l.get();
                b80.c cVarP = bVar.e.p();
                s.j(cVarP);
                return new p(juniorConsentService, jVar, cVar, cVarP);
            case 3:
                return iz8.c.u(bVar.f173000a, ((nj0.d) bVar.f173001b).f());
            case 4:
                return new ne0.d();
            case 5:
                je0.d dVarB = bVar.f173002c.b();
                s.j(dVarB);
                yk0.a aVarB = bVar.d.b();
                s.j(aVarB);
                xe0.f fVarF = bVar.f173002c.f();
                s.j(fVarF);
                return iz8.c.v(dVarB, fVarF, aVarB);
            case 6:
                return new q((gd8.d) bVar.f173009p.get());
            case 7:
                JuniorConsentPromptService juniorConsentPromptService = (JuniorConsentPromptService) bVar.o.get();
                l80.e eVarH = bVar.e.h();
                s.j(eVarH);
                return new gd8.h(juniorConsentPromptService, eVarH, (ue0.c) bVar.f173006l.get());
            case 8:
                return iz8.c.s(bVar.f173000a, ((nj0.d) bVar.f173001b).f());
            case 9:
                hj8.a aVarA = bVar.f.a();
                s.j(aVarA);
                return new v(aVarA, (kd8.e) bVar.f173008n.get());
            case 10:
                return new x((gd8.q) bVar.u.get(), bVar.f173003g.a());
            case 11:
                return new gd8.x((JuniorConsentRequestService) bVar.f173013t.get(), (ne0.j) bVar.k.get(), (ue0.c) bVar.f173006l.get());
            case 12:
                return iz8.c.t(bVar.f173000a, ((nj0.d) bVar.f173001b).f());
            case 13:
                x xVar = (x) bVar.v.get();
                hj8.a aVarA2 = bVar.f.a();
                s.j(aVarA2);
                return new id8.e(xVar, aVarA2);
            case 14:
                x xVar2 = (x) bVar.v.get();
                hj8.a aVarA3 = bVar.f.a();
                s.j(aVarA3);
                z zVarE = bVar.f173004h.e();
                s.j(zVarE);
                return new id8.j(xVar2, aVarA3, zVarE);
            case 15:
                gd8.c cVar2 = (gd8.c) bVar.A.get();
                gd8.i iVar = (gd8.i) bVar.f173007m.get();
                kbb.c cVarF = bVar.f173004h.f();
                hj8.a aVarA4 = bVar.f.a();
                s.j(aVarA4);
                l80.e eVarH2 = bVar.e.h();
                s.j(eVarH2);
                return new kd8.p(cVar2, iVar, cVarF, aVarA4, eVarH2, bVar.i.b());
            case 16:
                return new gd8.c((JuniorConsentPromptService) bVar.f173016y.get(), (ue0.c) bVar.z.get(), (ne0.j) bVar.k.get());
            case 17:
                h hVar = bVar.f173000a;
                nj0.a aVar = bVar.f173001b;
                ik0.b bVarM = ((nj0.d) aVar).m();
                s.j(bVarM);
                return i.a(hVar, bVarM, ((nj0.d) aVar).d());
            case 18:
                je0.d dVarD = bVar.f173002c.d();
                s.j(dVarD);
                yk0.a aVarB2 = bVar.d.b();
                s.j(aVarB2);
                xe0.f fVarF2 = bVar.f173002c.f();
                s.j(fVarF2);
                return iz8.c.g(dVarD, fVarF2, aVarB2);
            default:
                throw new AssertionError(i);
        }
    }
}
