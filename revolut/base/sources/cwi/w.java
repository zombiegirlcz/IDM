package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungePassesCheckoutService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungePassesService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesDisclaimerService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesPassActivityService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesProductArticleService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesUserCapabilitiesService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportSavedLoungesService;
import com.revolut.retail.feature.airportlounges.impl.network.SchemeAirportLoungesService;

/* JADX INFO: loaded from: classes13.dex */
public final class w implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f109782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109783b;

    public w(x xVar, int i) {
        this.f109782a = xVar;
        this.f109783b = i;
    }

    @Override // phm.a
    public final Object get() {
        x xVar = this.f109782a;
        int i = this.f109783b;
        switch (i) {
            case 0:
                return new dwi.x(xVar.f109788a.a());
            case 1:
                return new dwi.s((hwi.w) xVar.f109806q.get());
            case 2:
                AirportLoungePassesService airportLoungePassesService = (AirportLoungePassesService) xVar.f109802n.get();
                ue0.c cVar = (ue0.c) xVar.o.get();
                ne0.j jVar = (ne0.j) xVar.f109805p.get();
                b80.c cVarP = xVar.f.p();
                vc.s.j(cVarP);
                return new hwi.a0(airportLoungePassesService, cVar, jVar, cVarP);
            case 3:
                h hVar = xVar.f109790b;
                nj0.a aVar = xVar.f109792c;
                ik0.b bVarM = ((nj0.d) aVar).m();
                vc.s.j(bVarM);
                return k.a(hVar, bVarM, ((nj0.d) aVar).d());
            case 4:
                je0.d dVarB = xVar.d.b();
                vc.s.j(dVarB);
                yk0.a aVarB = xVar.e.b();
                vc.s.j(aVarB);
                xe0.f fVarF = xVar.d.f();
                vc.s.j(fVarF);
                return u.f(dVarB, fVarF, aVarB);
            case 5:
                return new ne0.d();
            case 6:
                return new dwi.a((hwi.c) xVar.u.get());
            case 7:
                return new hwi.c((AirportLoungeNewPassesService) xVar.f109808s.get(), (ue0.c) xVar.f109809t.get(), (ne0.j) xVar.f109805p.get());
            case 8:
                h hVar2 = xVar.f109790b;
                nj0.a aVar2 = xVar.f109792c;
                ik0.b bVarM2 = ((nj0.d) aVar2).m();
                vc.s.j(bVarM2);
                return i.a(hVar2, bVarM2, ((nj0.d) aVar2).d());
            case 9:
                je0.d dVarD = xVar.d.d();
                vc.s.j(dVarD);
                yk0.a aVarB2 = xVar.e.b();
                vc.s.j(aVarB2);
                xe0.f fVarF2 = xVar.d.f();
                vc.s.j(fVarF2);
                return cdj.b.d(dVarD, fVarF2, aVarB2);
            case 10:
                return new dwi.d((hwi.d) xVar.f109811x.get(), new zjh.c((dwi.a) xVar.v.get()));
            case 11:
                return new hwi.g((AirportLoungeNewPassesService) xVar.f109808s.get(), (ue0.c) xVar.f109810w.get(), (ne0.j) xVar.f109805p.get());
            case 12:
                je0.d dVarD2 = xVar.d.d();
                vc.s.j(dVarD2);
                yk0.a aVarB3 = xVar.e.b();
                vc.s.j(aVarB3);
                xe0.f fVarF3 = xVar.d.f();
                vc.s.j(fVarF3);
                return cdj.b.e(dVarD2, fVarF3, aVarB3);
            case 13:
                return new dwi.k((hwi.h) xVar.z.get(), new zjh.c((dwi.a) xVar.v.get()));
            case 14:
                return new hwi.k((AirportLoungeNewPassesService) xVar.f109808s.get());
            case 15:
                return new dwi.r((hwi.n) xVar.D.get());
            case 16:
                return new hwi.v((AirportLoungePassesCheckoutService) xVar.B.get(), (ue0.c) xVar.C.get(), (ne0.j) xVar.f109805p.get());
            case 17:
                h hVar3 = xVar.f109790b;
                nj0.a aVar3 = xVar.f109792c;
                ik0.b bVarM3 = ((nj0.d) aVar3).m();
                vc.s.j(bVarM3);
                return j.a(hVar3, bVarM3, ((nj0.d) aVar3).d());
            case 18:
                je0.d dVarB2 = xVar.d.b();
                vc.s.j(dVarB2);
                yk0.a aVarB4 = xVar.e.b();
                vc.s.j(aVarB4);
                xe0.f fVarF4 = xVar.d.f();
                vc.s.j(fVarF4);
                return u.e(dVarB2, fVarF4, aVarB4);
            case 19:
                dwi.n0 n0Var = new dwi.n0((hwi.n0) xVar.H.get(), (ewi.a) xVar.I.get());
                hwi.n0 n0Var2 = (hwi.n0) xVar.H.get();
                hwi.y0 y0Var = (hwi.y0) xVar.L.get();
                hwi.n0 n0Var3 = (hwi.n0) xVar.H.get();
                y80.a aVarR = xVar.f.r();
                vc.s.j(aVarR);
                f49.a aVar4 = xVar.f109795g;
                w39.b bVarA = aVar4.a();
                vc.s.j(bVarA);
                d49.a aVar5 = (d49.a) aVar4.f132031l.get();
                vc.s.j(aVar5);
                return new dwi.b0(n0Var, n0Var2, y0Var, new dwi.r0(n0Var3, aVarR, bVarA, aVar5));
            case 20:
                AirportLoungesService airportLoungesService = (AirportLoungesService) xVar.F.get();
                ne0.j jVar2 = (ne0.j) xVar.f109805p.get();
                ue0.c cVar2 = (ue0.c) xVar.G.get();
                b80.c cVarP2 = xVar.f.p();
                vc.s.j(cVarP2);
                return new hwi.v0(airportLoungesService, jVar2, cVar2, cVarP2);
            case 21:
                h hVar4 = xVar.f109790b;
                nj0.a aVar6 = xVar.f109792c;
                ik0.b bVarM4 = ((nj0.d) aVar6).m();
                vc.s.j(bVarM4);
                return o.a(hVar4, bVarM4, ((nj0.d) aVar6).d());
            case 22:
                je0.d dVarB3 = xVar.d.b();
                vc.s.j(dVarB3);
                yk0.a aVarB5 = xVar.e.b();
                vc.s.j(aVarB5);
                xe0.f fVarF5 = xVar.d.f();
                vc.s.j(fVarF5);
                return u.i(dVarB3, fVarF5, aVarB5);
            case 23:
                return new ewi.a();
            case 24:
                AirportSavedLoungesService airportSavedLoungesService = (AirportSavedLoungesService) xVar.J.get();
                ue0.c cVar3 = (ue0.c) xVar.K.get();
                ne0.j jVar3 = (ne0.j) xVar.f109805p.get();
                b80.c cVarP3 = xVar.f.p();
                vc.s.j(cVarP3);
                return new hwi.c1(airportSavedLoungesService, cVar3, jVar3, cVarP3);
            case 25:
                h hVar5 = xVar.f109790b;
                nj0.a aVar7 = xVar.f109792c;
                ik0.b bVarM5 = ((nj0.d) aVar7).m();
                vc.s.j(bVarM5);
                return q.a(hVar5, bVarM5, ((nj0.d) aVar7).d());
            case 26:
                je0.d dVarB4 = xVar.d.b();
                vc.s.j(dVarB4);
                yk0.a aVarB6 = xVar.e.b();
                vc.s.j(aVarB6);
                xe0.f fVarF6 = xVar.d.f();
                vc.s.j(fVarF6);
                return u.k(dVarB4, fVarF6, aVarB6);
            case 27:
                return new dwi.e0((hwi.m0) xVar.P.get());
            case 28:
                return new hwi.m0((AirportLoungesProductArticleService) xVar.N.get(), (ue0.c) xVar.O.get(), (ne0.j) xVar.f109805p.get());
            case 29:
                h hVar6 = xVar.f109790b;
                nj0.a aVar8 = xVar.f109792c;
                ik0.b bVarM6 = ((nj0.d) aVar8).m();
                vc.s.j(bVarM6);
                return n.a(hVar6, bVarM6, ((nj0.d) aVar8).d());
            case 30:
                xe0.f fVarF7 = xVar.d.f();
                vc.s.j(fVarF7);
                je0.d dVarD3 = xVar.d.d();
                vc.s.j(dVarD3);
                yk0.a aVarB7 = xVar.e.b();
                vc.s.j(aVarB7);
                return u.h(dVarD3, fVarF7, aVarB7);
            case 31:
                hwi.x0 x0Var = (hwi.x0) xVar.T.get();
                ang.f fVarE = xVar.f109796h.e();
                pre.c cVarA = xVar.i.a();
                vc.s.j(cVarA);
                return new dwi.i0(x0Var, fVarE, cVarA);
            case 32:
                return new hwi.x0((AirportLoungesUserCapabilitiesService) xVar.R.get(), (ue0.c) xVar.S.get(), (ne0.j) xVar.f109805p.get());
            case 33:
                h hVar7 = xVar.f109790b;
                nj0.a aVar9 = xVar.f109792c;
                ik0.b bVarM7 = ((nj0.d) aVar9).m();
                vc.s.j(bVarM7);
                return p.a(hVar7, bVarM7, ((nj0.d) aVar9).d());
            case 34:
                je0.d dVarD4 = xVar.d.d();
                vc.s.j(dVarD4);
                yk0.a aVarB8 = xVar.e.b();
                vc.s.j(aVarB8);
                xe0.f fVarF8 = xVar.d.f();
                vc.s.j(fVarF8);
                return u.x(dVarD4, fVarF8, aVarB8);
            case 35:
                return new dwi.d0((hwi.w) xVar.f109806q.get(), (hwi.j0) xVar.W.get());
            case 36:
                return new hwi.j0((ue0.c) xVar.V.get());
            case 37:
                je0.d dVarB5 = xVar.d.b();
                vc.s.j(dVarB5);
                yk0.a aVarB9 = xVar.e.b();
                vc.s.j(aVarB9);
                xe0.f fVarF9 = xVar.d.f();
                vc.s.j(fVarF9);
                return u.j(dVarB5, fVarF9, aVarB9);
            case 38:
                egk.e eVarE = xVar.f109798j.e();
                vc.s.j(eVarE);
                kl.c0 c0Var = new kl.c0(eVarE);
                lxi.k kVar = new lxi.k();
                f90.b bVarT = xVar.f.t();
                vc.s.j(bVarT);
                return cdj.b.f(new lxi.j(c0Var, kVar, bVarT));
            case 39:
                ffk.t tVarF = xVar.k.f();
                vc.s.j(tVarF);
                return new dwi.t0(tVarF, (hwi.f1) xVar.f109791b0.get());
            case 40:
                return new hwi.f1((SchemeAirportLoungesService) xVar.Z.get(), (ue0.c) xVar.f109789a0.get(), (ne0.j) xVar.f109805p.get());
            case 41:
                h hVar8 = xVar.f109790b;
                nj0.a aVar10 = xVar.f109792c;
                ik0.b bVarM8 = ((nj0.d) aVar10).m();
                vc.s.j(bVarM8);
                return r.a(hVar8, bVarM8, ((nj0.d) aVar10).d());
            case 42:
                je0.d dVarB6 = xVar.d.b();
                vc.s.j(dVarB6);
                yk0.a aVarB10 = xVar.e.b();
                vc.s.j(aVarB10);
                xe0.f fVarF10 = xVar.d.f();
                vc.s.j(fVarF10);
                return u.u(dVarB6, fVarF10, aVarB10);
            case 43:
                return new fwi.a((dwi.x) xVar.f109801m.get());
            case 44:
                return new dwi.c0((hwi.h0) xVar.g0.get());
            case 45:
                return new hwi.h0((AirportLoungesPassActivityService) xVar.f109794e0.get(), (ue0.c) xVar.f0.get(), (ne0.j) xVar.f109805p.get());
            case 46:
                h hVar9 = xVar.f109790b;
                nj0.a aVar11 = xVar.f109792c;
                ik0.b bVarM9 = ((nj0.d) aVar11).m();
                vc.s.j(bVarM9);
                return m.a(hVar9, bVarM9, ((nj0.d) aVar11).d());
            case 47:
                je0.d dVarD5 = xVar.d.d();
                vc.s.j(dVarD5);
                yk0.a aVarB11 = xVar.e.b();
                vc.s.j(aVarB11);
                xe0.f fVarF11 = xVar.d.f();
                vc.s.j(fVarF11);
                return u.g(dVarD5, fVarF11, aVarB11);
            case 48:
                return new dwi.a0((hwi.d0) xVar.f109799k0.get(), (hwi.c) xVar.u.get(), (hwi.x0) xVar.T.get());
            case 49:
                return new hwi.d0((AirportLoungesDisclaimerService) xVar.i0.get(), (ue0.c) xVar.j0.get());
            case 50:
                h hVar10 = xVar.f109790b;
                nj0.a aVar12 = xVar.f109792c;
                ik0.b bVarM10 = ((nj0.d) aVar12).m();
                vc.s.j(bVarM10);
                return l.a(hVar10, bVarM10, ((nj0.d) aVar12).d());
            case 51:
                je0.d dVarD6 = xVar.d.d();
                vc.s.j(dVarD6);
                yk0.a aVarB12 = xVar.e.b();
                vc.s.j(aVarB12);
                xe0.f fVarF12 = xVar.d.f();
                vc.s.j(fVarF12);
                return u.q(dVarD6, fVarF12, aVarB12);
            case 52:
                return new awi.b(ImmutableSet.of(new bwi.e((dwi.x) xVar.f109801m.get())), (tvi.a) xVar.f109793d0.get());
            case 53:
                return new bwi.d((sri.m) xVar.f109803n0.get(), (dwi.x) xVar.f109801m.get(), (tvi.a) xVar.f109793d0.get());
            case 54:
                return cdj.b.r(xVar.f109800l);
            default:
                throw new AssertionError(i);
        }
    }
}
