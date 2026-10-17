package z58;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.network.services.OrderInitiationPageService;
import com.revolut.feature.junior_coparent.impl.services.JuniorCoparentService;
import com.revolut.feature.pro.onboarding.impl.data.network.ProPostActivationFlowService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsBenefitsService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsOptInPlacementsService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationTargetingOnboardingService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsProductArticleService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsProductEligibilityService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsService;
import com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase;
import com.revolut.feature.travel.common.impl.database.TravelDatabase;
import com.revolut.feature.travel.common.impl.network.TravelService;
import com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase;
import com.revolut.feature.wealth.account_closure.impl.data.network.AccountClosureService;
import com.revolut.retail.feature.impl.userauth.network.services.UserAuthService;
import cu8.r0;
import et6.q1;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import ljl.q0;
import mk0.p;
import no.j2;
import nwj.a0;
import nwj.a1;
import nwj.c1;
import nwj.d1;
import nwj.e1;
import nwj.g0;
import nwj.h0;
import nwj.j0;
import nwj.l0;
import nwj.n0;
import nwj.o0;
import nwj.s0;
import nwj.t0;
import nwj.u;
import nwj.u0;
import nwj.v0;
import nwj.w;
import nwj.w0;
import nwj.x;
import nwj.x0;
import nwj.y;
import nwj.z;
import nyb.b0;
import nyb.c0;
import nyb.d0;
import nyb.e0;
import nyb.f0;
import nyb.i0;
import nyb.m0;
import nyb.p0;
import nyb.v;
import qgk.k3;
import retrofit2.Retrofit;
import te8.r;
import vc.s;
import z0g.f1;
import zu8.b1;
import zxb.k0;
import zxb.y0;
import zxb.z0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f319543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f319544c;

    public /* synthetic */ c(Object obj2, int i, int i2) {
        this.f319542a = i2;
        this.f319544c = obj2;
        this.f319543b = i;
    }

    private final Object a() {
        k0 k0Var = (k0) this.f319544c;
        int i = this.f319543b;
        switch (i) {
            case 0:
                return new nyb.k((jxb.f) k0Var.H.get());
            case 1:
                RevPointsService revPointsService = (RevPointsService) k0Var.D.get();
                ue0.c cVar = (ue0.c) k0Var.F.get();
                ne0.j jVar = (ne0.j) k0Var.G.get();
                w39.b bVarA = k0Var.e.a();
                s.j(bVarA);
                return new jxb.l(revPointsService, cVar, jVar, bVarA);
            case 2:
                return y0.s(k0Var.f326188a, (Retrofit) k0Var.C.get());
            case 3:
                return y0.k(k0Var.f326188a, ((nj0.d) k0Var.f326190b).f(), (kg.o) k0Var.B.get());
            case 4:
                return y0.j(k0Var.f326188a, fe0.c.a());
            case 5:
                je0.d dVar = (je0.d) k0Var.E.get();
                yk0.a aVarB = k0Var.d.b();
                s.j(aVarB);
                xe0.f fVarF = k0Var.f326192c.f();
                s.j(fVarF);
                return y0.t(dVar, fVarF, aVarB);
            case 6:
                kg.o oVar = (kg.o) k0Var.B.get();
                le0.b bVarC = k0Var.f326192c.c();
                s.j(bVarC);
                return y0.l(oVar, bVarC);
            case 7:
                return z0.a();
            case 8:
                return new m0((rxb.l) k0Var.K.get(), (pyb.l) k0Var.L.get());
            case 9:
                RevPointsService revPointsService2 = (RevPointsService) k0Var.D.get();
                RevPointsDatabase revPointsDatabase = (RevPointsDatabase) k0Var.J.get();
                b80.c cVarP = k0Var.f326196h.p();
                s.j(cVarP);
                lfm.c cVarB = ((g8b.a) k0Var.i).b();
                s.j(cVarB);
                return new rxb.l(revPointsService2, revPointsDatabase, cVarP, cVarB);
            case 10:
                Context context = k0Var.f;
                yk0.a aVarB2 = k0Var.d.b();
                s.j(aVarB2);
                return y0.e(context, aVarB2, ((c21.b) k0Var.f326195g).b());
            case 11:
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) k0Var.f326198j).c();
                s.j(aVarC);
                return new pyb.l(aVarC);
            case 12:
                gte.a aVarB3 = k0Var.k.b();
                s.j(aVarB3);
                xoj.a aVarA = k0Var.f326200l.a();
                s.j(aVarA);
                jla.h hVarA = k0Var.f326201m.a();
                vgc.a aVarA2 = k0Var.f326202n.a();
                s.j(aVarA2);
                return new nyb.b(aVarB3, aVarA, hVarA, aVarA2);
            case 13:
                return new nd.l((pxb.a) k0Var.P.get());
            case 14:
                return new pxb.a((RevPointsProductArticleService) k0Var.O.get());
            case 15:
                return y0.q(k0Var.f326188a, (Retrofit) k0Var.C.get());
            case 16:
                l61.a aVarB4 = k0Var.o.b();
                s.j(aVarB4);
                return new nyb.f(aVarB4, (eub.i) k0Var.U.get());
            case 17:
                e4m.e eVar = k0Var.H;
                ite.a aVar = k0Var.k;
                efk.a aVar2 = k0Var.f326206q;
                jxb.f fVar = (jxb.f) eVar.get();
                pre.c cVarA = k0Var.f326205p.a();
                s.j(cVarA);
                t tVarF = aVar2.f();
                s.j(tVarF);
                gte.a aVarB5 = aVar.b();
                s.j(aVarB5);
                t tVarF2 = aVar2.f();
                s.j(tVarF2);
                gte.a aVarB6 = aVar.b();
                s.j(aVarB6);
                oyb.e eVar2 = new oyb.e(tVarF2, aVarB6, k0Var.o.e());
                oyb.f fVar2 = new oyb.f();
                eub.a aVar3 = (eub.a) k0Var.N.get();
                j2 j2VarH = k0Var.f326207r.h();
                s.j(j2VarH);
                pyb.i iVar = new pyb.i();
                e0 e0Var = (e0) k0Var.T.get();
                fk3.a aVarA3 = k0Var.f326209s.a();
                s.j(aVarA3);
                return new nyb.o(fVar, cVarA, tVarF, aVarB5, eVar2, fVar2, aVar3, j2VarH, iVar, e0Var, aVarA3);
            case 18:
                return new e0(((c21.b) k0Var.f326195g).d(), (eub.k) k0Var.Q.get(), (qxb.c) k0Var.S.get());
            case 19:
                gte.a aVarB7 = k0Var.k.b();
                s.j(aVarB7);
                return new b0(aVarB7, k0Var.f326201m.a(), ((c21.b) k0Var.f326195g).c(), (eub.a) k0Var.N.get());
            case 20:
                return new qxb.c((RevPointsPersonalisationTargetingOnboardingService) k0Var.R.get(), (ue0.c) k0Var.F.get(), (ne0.j) k0Var.G.get());
            case 21:
                return y0.p(k0Var.f326188a, (Retrofit) k0Var.C.get());
            case 22:
                return new nyb.c((kxb.e) k0Var.X.get());
            case 23:
                return new kxb.e((RevPointsBenefitsService) k0Var.W.get(), (ue0.c) k0Var.F.get(), (ne0.j) k0Var.G.get());
            case 24:
                return y0.m(k0Var.f326188a, (Retrofit) k0Var.C.get());
            case 25:
                nyb.k kVar = (nyb.k) k0Var.I.get();
                f0 f0Var = (f0) k0Var.f326211t.i.get();
                s.j(f0Var);
                t tVarF3 = k0Var.f326206q.f();
                s.j(tVarF3);
                return new p0(kVar, f0Var, tVarF3, k0Var.u.b());
            case 26:
                t tVarF4 = k0Var.f326206q.f();
                s.j(tVarF4);
                return new i0(tVarF4, (lxb.f) k0Var.f326191b0.get());
            case 27:
                return new lxb.f((RevPointsProductEligibilityService) k0Var.f326189a0.get(), (ue0.c) k0Var.F.get(), (ne0.j) k0Var.G.get());
            case 28:
                return y0.r(k0Var.f326188a, (Retrofit) k0Var.C.get());
            case 29:
                return new nyb.j((jxb.f) k0Var.H.get(), (eub.a) k0Var.N.get());
            case 30:
                nyb.c cVar2 = (nyb.c) k0Var.Y.get();
                t tVarF5 = k0Var.f326206q.f();
                s.j(tVarF5);
                ue0.c cVar3 = (ue0.c) k0Var.F.get();
                l80.e eVarH = k0Var.f326196h.h();
                s.j(eVarH);
                return new nyb.i(cVar2, tVarF5, cVar3, eVarH);
            case 31:
                eub.a aVar4 = (eub.a) k0Var.N.get();
                eub.i iVar2 = (eub.i) k0Var.U.get();
                gte.a aVarB8 = k0Var.k.b();
                s.j(aVarB8);
                return new nyb.k0(aVar4, iVar2, aVarB8);
            case 32:
                return new dyb.a(k0Var.v.a());
            case 33:
                return new fyb.a();
            case 34:
                return new lyb.d(k0Var.f326213w.b());
            case 35:
                nyb.j jVar2 = (nyb.j) k0Var.f326193d0.get();
                t tVarF6 = k0Var.f326206q.f();
                s.j(tVarF6);
                return new byb.c(jVar2, tVarF6, k0Var.f326214x.a(), k0Var.u.b(), k0Var.f326215y.e(), new byb.b(((k3) k0Var.z).b()));
            case 36:
                nyb.k kVar2 = (nyb.k) k0Var.I.get();
                eub.a aVar5 = (eub.a) k0Var.N.get();
                gte.a aVarB9 = k0Var.k.b();
                s.j(aVarB9);
                return new lzb.a(kVar2, aVar5, aVarB9);
            case 37:
                return new lzb.c((nyb.k) k0Var.I.get());
            case 38:
                eub.i iVar3 = (eub.i) k0Var.U.get();
                nxb.b bVar = (nxb.b) k0Var.f326203n0.get();
                eub.a aVar6 = (eub.a) k0Var.N.get();
                l80.e eVarH2 = k0Var.f326196h.h();
                s.j(eVarH2);
                return new v(iVar3, bVar, aVar6, eVarH2);
            case 39:
                return new nxb.e((RevPointsOptInPlacementsService) k0Var.m0.get(), (ue0.c) k0Var.F.get(), (ne0.j) k0Var.G.get());
            case 40:
                return y0.n(k0Var.f326188a, (Retrofit) k0Var.C.get());
            case 41:
                return new c0((oxb.f) k0Var.q0.get());
            case 42:
                return new oxb.f((RevPointsPersonalisationService) k0Var.p0.get(), (ue0.c) k0Var.F.get(), (ne0.j) k0Var.G.get());
            case 43:
                return y0.o(k0Var.f326188a, (Retrofit) k0Var.C.get());
            case 44:
                return new d0((qxb.c) k0Var.S.get());
            case 45:
                return new jyb.c((eub.k) k0Var.Q.get(), (d0) k0Var.f326210s0.get(), (e0) k0Var.T.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object lVar;
        Object dVar;
        Object dVar2;
        Object bVar;
        Object fVar;
        Object nVar;
        switch (this.f319542a) {
            case 0:
                d dVar3 = (d) this.f319544c;
                a31.a aVar = dVar3.f319546b;
                a31.a aVar2 = dVar3.f319550j;
                a31.a aVar3 = dVar3.f319549h;
                a31.a aVar4 = dVar3.k;
                a31.a aVar5 = dVar3.f319548g;
                a31.a aVar6 = dVar3.f;
                a31.a aVar7 = dVar3.e;
                a31.a aVar8 = dVar3.d;
                a31.a aVar9 = dVar3.f319547c;
                int i = this.f319543b;
                if (i == 0) {
                    lVar = new l(dVar3.f319545a, aVar, aVar9, aVar8, aVar7, aVar6, aVar5, aVar3, dVar3.i, aVar2, aVar4);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            return f1.C((l) dVar3.f319554p.get());
                        }
                        throw new AssertionError(i);
                    }
                    lVar = new t29.j(dVar3.f319551l, aVar9, aVar8, aVar7, aVar6, aVar5, aVar4, aVar3, dVar3.f319555q, aVar2, dVar3.f319552m, dVar3.f319553n, dVar3.o, aVar);
                }
                return lVar;
            case 1:
                zd8.a aVar10 = (zd8.a) this.f319544c;
                ila.b bVar2 = aVar10.e;
                ee0.a aVar11 = aVar10.f321324c;
                int i2 = this.f319543b;
                if (i2 == 0) {
                    JuniorCoparentService juniorCoparentService = (JuniorCoparentService) aVar10.f321328l.get();
                    ne0.j jVar = (ne0.j) aVar10.f321329m.get();
                    sf0.h hVarB = aVar10.f321323b.b();
                    s.j(hVarB);
                    ue0.c cVar = (ue0.c) aVar10.f321330n.get();
                    ze0.a aVarA = aVar11.a();
                    s.j(aVarA);
                    return new fe8.i(juniorCoparentService, jVar, hVarB, cVar, aVarA);
                }
                if (i2 == 1) {
                    JuniorCoparentService juniorCoparentService2 = (JuniorCoparentService) a0.d.f((nj0.d) aVar10.f321322a, "retrofit", JuniorCoparentService.class, "create(...)");
                    s.k(juniorCoparentService2);
                    return juniorCoparentService2;
                }
                if (i2 == 2) {
                    return new ne0.d();
                }
                if (i2 == 3) {
                    je0.d dVarB = aVar11.b();
                    s.j(dVarB);
                    yk0.a aVarB = aVar10.d.b();
                    s.j(aVarB);
                    xe0.f fVarF = aVar11.f();
                    s.j(fVarF);
                    return f1.g(dVarB, fVarF, aVarB);
                }
                if (i2 == 4) {
                    return new yd8.h(aVar10.b(), bVar2.a(), aVar10.a());
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                ao.h hVarA = aVar10.a();
                o7.d dVar4 = new o7.d((fe8.a) aVar10.o.get());
                hj8.a aVarA2 = aVar10.f321325g.a();
                s.j(aVarA2);
                zq.a aVarC = aVar10.c();
                gte.a aVarB2 = aVar10.k.b();
                s.j(aVarB2);
                return new yd8.n(hVarA, dVar4, aVarA2, aVarC, aVarB2, bVar2.a());
            case 2:
                zia.a aVar12 = (zia.a) this.f319544c;
                ee0.a aVar13 = aVar12.f322510a;
                int i3 = this.f319543b;
                if (i3 == 0) {
                    xia.b bVar3 = (xia.b) aVar12.f322514h.get();
                    hr6.l lVarL = aVar12.d.l();
                    s.j(lVarL);
                    dVar = new aja.d(bVar3, lVarL);
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            Json jsonA = fe0.d.a();
                            ik0.b bVarM = ((nj0.d) aVar12.f322511b).m();
                            s.j(bVarM);
                            return f1.v(bVarM, jsonA);
                        }
                        if (i3 == 3) {
                            return new ne0.d();
                        }
                        if (i3 != 4) {
                            throw new AssertionError(i3);
                        }
                        je0.d dVarD = aVar13.d();
                        s.j(dVarD);
                        yk0.a aVarB3 = aVar12.f322512c.b();
                        s.j(aVarB3);
                        xe0.f fVarF2 = aVar13.f();
                        s.j(fVarF2);
                        return f1.z(dVarD, aVarB3, fVarF2);
                    }
                    dVar = new xia.b((ProPostActivationFlowService) aVar12.e.get(), (ne0.j) aVar12.f.get(), (ue0.c) aVar12.f322513g.get());
                }
                return dVar;
            case 3:
                zm8.b bVar4 = (zm8.b) this.f319544c;
                se8.a aVar14 = bVar4.e;
                tib.b bVar5 = bVar4.d;
                int i5 = this.f319543b;
                if (i5 == 0) {
                    return new cn8.a();
                }
                if (i5 == 1) {
                    hj8.a aVarA3 = bVar4.f323389a.a();
                    s.j(aVarA3);
                    xcd.a aVarA4 = bVar4.f323390b.a();
                    s.j(aVarA4);
                    an8.b bVar6 = (an8.b) bVar4.f323395l.get();
                    r rVarB = aVar14.b();
                    s.j(rVarB);
                    return new bn8.d(aVarA3, aVarA4, bVar6, rVarB);
                }
                if (i5 != 2) {
                    throw new AssertionError(i5);
                }
                jab.a aVar15 = (jab.a) bVar4.f323391c.f159986h.get();
                s.j(aVar15);
                ijb.a aVarG = ((blb.e) bVar5).g();
                s.j(aVarG);
                dcd.b bVarF = ((blb.e) bVar5).f();
                r rVarB2 = aVar14.b();
                s.j(rVarB2);
                return new an8.b(aVar15, aVarG, bVarF, rVarB2, bVar4.f.g());
            case 4:
                zs6.a aVar16 = (zs6.a) this.f319544c;
                int i6 = this.f319543b;
                if (i6 == 0) {
                    return new zt6.g((OrderInitiationPageService) aVar16.f324815b.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                Retrofit retrofitI = ((c21.b) aVar16.f324814a).i();
                s.j(retrofitI);
                return f1.s(retrofitI);
            case 5:
                zse.d dVar5 = (zse.d) this.f319544c;
                ee0.a aVar17 = dVar5.f324906a;
                frb.b bVar7 = dVar5.f324907b;
                int i21 = this.f319543b;
                if (i21 == 0) {
                    return zse.c.a();
                }
                if (i21 == 1) {
                    je0.d dVarB2 = aVar17.b();
                    s.j(dVarB2);
                    xe0.f fVarF3 = aVar17.f();
                    s.j(fVarF3);
                    return f1.y(dVarB2, fVarF3);
                }
                if (i21 == 2) {
                    grb.a aVar18 = (grb.a) bVar7.f137449a.get();
                    s.j(aVar18);
                    return new ate.e(aVar18, (yse.e) dVar5.f.get());
                }
                if (i21 == 3) {
                    ue0.c cVar2 = (ue0.c) dVar5.e.get();
                    mk0.a aVarA5 = dVar5.f324908c.a();
                    s.j(aVarA5);
                    return new yse.e(cVar2, aVarA5);
                }
                if (i21 != 4) {
                    throw new AssertionError(i21);
                }
                ate.e eVar = (ate.e) dVar5.f324909g.get();
                grb.a aVar19 = (grb.a) bVar7.f137449a.get();
                s.j(aVar19);
                ate.e eVar2 = (ate.e) dVar5.f324909g.get();
                grb.a aVar20 = (grb.a) bVar7.f137449a.get();
                s.j(aVar20);
                return new ete.a(eVar, aVar19, new zq.a(eVar2, aVar20), (CoroutineScope) dVar5.d.get());
            case 6:
                ztg.n nVar2 = (ztg.n) this.f319544c;
                int i22 = this.f319543b;
                switch (i22) {
                    case 0:
                        xtg.e eVar3 = (xtg.e) nVar2.v.get();
                        ybl.d dVarH = nVar2.f325152h.h();
                        s.j(dVarH);
                        ybl.k kVarD = nVar2.i.d();
                        s.j(kVarD);
                        dVar2 = new aug.d(eVar3, dVarH, kVarD);
                        break;
                    case 1:
                        AccountClosureService accountClosureService = (AccountClosureService) nVar2.f325157p.get();
                        ne0.j jVar2 = (ne0.j) nVar2.f325158q.get();
                        qtg.c cVar3 = (qtg.c) nVar2.f325160s.get();
                        qtg.a aVar21 = (qtg.a) nVar2.f325161t.get();
                        ue0.c cVar4 = (ue0.c) nVar2.u.get();
                        b80.c cVarP = nVar2.f325151g.p();
                        s.j(cVarP);
                        dVar2 = new xtg.e(accountClosureService, jVar2, cVar3, aVar21, cVar4, cVarP);
                        break;
                    case 2:
                        return vtc.p0.C(nVar2.f325148a, (Retrofit) nVar2.o.get());
                    case 3:
                        vtg.a aVar22 = nVar2.f325148a;
                        ik0.b bVarM2 = ((nj0.d) nVar2.f325149b).m();
                        s.j(bVarM2);
                        return vtc.p0.n(aVar22, bVarM2, fe0.d.a());
                    case 4:
                        return new ne0.d();
                    case 5:
                        return rga.l.m((WealthAccountClosureDatabase) nVar2.f325159r.get());
                    case 6:
                        Context context = nVar2.d;
                        yk0.a aVarB4 = nVar2.e.b();
                        s.j(aVarB4);
                        return rga.l.r(context, aVarB4, ((c21.b) nVar2.f).b());
                    case 7:
                        return rga.l.l((WealthAccountClosureDatabase) nVar2.f325159r.get());
                    case 8:
                        je0.d dVarB3 = nVar2.f325150c.b();
                        s.j(dVarB3);
                        yk0.a aVarB5 = nVar2.e.b();
                        s.j(aVarB5);
                        xe0.f fVarF4 = nVar2.f325150c.f();
                        s.j(fVarF4);
                        return olc.c.g(dVarB3, fVarF4, aVarB5);
                    case 9:
                        sri.m mVar = (sri.m) nVar2.f325163x.get();
                        ktg.a aVar23 = (ktg.a) nVar2.f325162w.get();
                        ybl.k kVarD2 = nVar2.i.d();
                        s.j(kVarD2);
                        dVar2 = new dug.c(mVar, aVar23, kVarD2);
                        break;
                    case 10:
                        return eug.c.D(nVar2.d);
                    case 11:
                        sri.m mVar2 = (sri.m) nVar2.f325163x.get();
                        ybl.d dVarH2 = nVar2.f325152h.h();
                        s.j(dVarH2);
                        ybl.k kVarD3 = nVar2.i.d();
                        s.j(kVarD3);
                        dVar2 = new dug.i(mVar2, dVarH2, kVarD3);
                        break;
                    case 12:
                        return new cug.c();
                    case 13:
                        return new cug.b();
                    default:
                        throw new AssertionError(i22);
                }
                return dVar2;
            case 7:
                int i32 = this.f319543b;
                if (i32 == 0) {
                    return new vw8.a();
                }
                if (i32 != 1) {
                    throw new AssertionError(i32);
                }
                gte.a aVarB6 = ((zu8.a) this.f319544c).f325223a.b();
                s.j(aVarB6);
                return new dv8.a(aVarB6);
            case 8:
                zu8.c0 c0Var = (zu8.c0) this.f319544c;
                nt8.a aVar24 = c0Var.f325238b;
                int i33 = this.f319543b;
                if (i33 == 0) {
                    return b1.a();
                }
                if (i33 == 1) {
                    mt8.d dVarB4 = aVar24.b();
                    s.j(dVarB4);
                    skd.i iVarC = c0Var.f325240g.c();
                    om4.d0 d0VarB = c0Var.f325241h.b();
                    CoroutineScope coroutineScopeA = c0Var.i.a();
                    s.j(coroutineScopeA);
                    bVar = new uw8.b(dVarB4, iVarC, d0VarB, coroutineScopeA);
                } else {
                    if (i33 == 2) {
                        return f1.r(c0Var.f325242j);
                    }
                    if (i33 != 3) {
                        if (i33 != 4) {
                            if (i33 != 5) {
                                throw new AssertionError(i33);
                            }
                            gte.a aVarB7 = c0Var.d.b();
                            s.j(aVarB7);
                            return new dv8.a(aVarB7);
                        }
                        r0 r0VarA = c0Var.a();
                        iv8.a aVar25 = new iv8.a();
                        com.revolut.feature.kyc.impl.d dVar6 = new com.revolut.feature.kyc.impl.d();
                        zu8.y0.Companion.getClass();
                        if (od0.a.e()) {
                            od0.a.i();
                        }
                        return new xu8.d(r0VarA, aVar25, dVar6);
                    }
                    sri.m mVar3 = (sri.m) c0Var.f325253y.get();
                    mt8.a aVarA6 = aVar24.a();
                    s.j(aVarA6);
                    jvh.a aVarA7 = c0Var.k.a();
                    s.j(aVarA7);
                    wx8.a aVarA8 = c0Var.f325243l.a();
                    s.j(aVarA8);
                    bVar = new yu8.d(mVar3, aVarA6, aVarA7, aVarA8);
                }
                return bVar;
            case 9:
                zua.a aVar26 = (zua.a) this.f319544c;
                int i43 = this.f319543b;
                if (i43 == 0) {
                    return new ava.c(aVar26.f325421a, aVar26.f325422b, aVar26.f325423c, aVar26.d, aVar26.e, aVar26.f, aVar26.f325424g, aVar26.f325425h, aVar26.i, aVar26.f325426j, aVar26.k, aVar26.f325427l, aVar26.f325428m, aVar26.f325429n, aVar26.o);
                }
                if (i43 == 1) {
                    return agk.b.d(aVar26.f325430p, aVar26.f325431q, aVar26.f325433s);
                }
                if (i43 == 2) {
                    return f1.D((ava.c) aVar26.f325432r.get());
                }
                throw new AssertionError(i43);
            case 10:
                zvj.a aVar27 = (zvj.a) this.f319544c;
                int i59 = this.f319543b;
                switch (i59) {
                    case 0:
                        e4m.e eVar4 = aVar27.L;
                        ite.a aVar28 = aVar27.e;
                        poi.b bVar8 = aVar27.f325699l;
                        xmg.a aVar29 = aVar27.f;
                        an0.c cVar5 = aVar27.d;
                        t0j.a aVar30 = (t0j.a) eVar4.get();
                        ang.f fVarE = aVar29.e();
                        fk3.a aVarA9 = aVar27.f325696g.a();
                        s.j(aVarA9);
                        kza.a aVarA10 = aVar27.f325697h.a();
                        fpj.e eVar5 = (fpj.e) aVar27.i.f17629h.get();
                        s.j(eVar5);
                        fn2.c cVarB = aVar27.f325698j.b();
                        ang.c cVar6 = (ang.c) aVar29.f307259x.get();
                        s.j(cVar6);
                        wsg.n nVarB = aVar27.k.b();
                        zm0.b bVarI = cVar5.i();
                        s.j(bVarI);
                        loi.b bVar9 = (loi.b) bVar8.K.get();
                        s.j(bVar9);
                        i1b.e eVar6 = (i1b.e) aVar27.f325700m.f180201r.get();
                        s.j(eVar6);
                        wl0.c cVarA = cVar5.a();
                        jte.c cVarA2 = aVar28.a();
                        s.j(cVarA2);
                        zm0.c cVarJ = cVar5.j();
                        s.j(cVarJ);
                        cn0.c cVar7 = (cn0.c) cVar5.A.get();
                        s.j(cVar7);
                        cn0.e eVarE = cVar5.e();
                        s.j(eVarE);
                        b31.a aVarD = ((c21.b) aVar27.f325694b).d();
                        zd0.b bVarB = ((vd0.e) aVar27.f325701n).b();
                        pjl.b1 b1Var = (pjl.b1) ((q0) aVar27.o).f196075r0.get();
                        s.j(b1Var);
                        p pVarB = aVar27.f325702p.b();
                        s.j(pVarB);
                        ekg.g gVarB = aVar27.f325703q.b();
                        fwj.d dVar7 = (fwj.d) aVar27.f325704r.f10791b.get();
                        s.j(dVar7);
                        loi.a aVar31 = (loi.a) bVar8.f238037t0.get();
                        s.j(aVar31);
                        k7c.m0 m0Var = (k7c.m0) aVar27.f325705s.f.get();
                        s.j(m0Var);
                        q1 q1Var = (q1) aVar27.f325706t.v.get();
                        s.j(q1Var);
                        toa.a aVarA11 = aVar27.u.a();
                        s.j(aVarA11);
                        ih0.b bVarF2 = aVar27.v.f();
                        s.j(bVarF2);
                        gte.a aVarB8 = aVar28.b();
                        s.j(aVarB8);
                        g41.b bVar10 = (g41.b) aVar27.f325707w.d.get();
                        s.j(bVar10);
                        return new fwj.p(aVar30, fVarE, aVarA9, aVarA10, eVar5, cVarB, cVar6, nVarB, bVarI, bVar9, eVar6, cVarA, cVarA2, cVarJ, cVar7, eVarE, aVarD, bVarB, b1Var, pVarB, gVarB, dVar7, aVar31, m0Var, q1Var, aVarA11, bVarF2, aVarB8, bVar10, aVar27.f325708x.a(), (twj.i) aVar27.K.get());
                    case 1:
                        UserAuthService userAuthService = (UserAuthService) aVar27.H.get();
                        ne0.j jVar3 = (ne0.j) aVar27.I.get();
                        ue0.c cVar8 = (ue0.c) aVar27.J.get();
                        gte.a aVarB9 = aVar27.e.b();
                        s.j(aVarB9);
                        fVar = new twj.f(userAuthService, jVar3, cVar8, aVarB9, new twj.a(), (twj.i) aVar27.K.get(), (kg.o) aVar27.F.get());
                        break;
                    case 2:
                        zvj.b bVar11 = aVar27.f325693a;
                        UserAuthService userAuthService2 = (UserAuthService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar27.G.get(), "retrofit", UserAuthService.class, "create(...)");
                        s.k(userAuthService2);
                        return userAuthService2;
                    case 3:
                        zvj.b bVar12 = aVar27.f325693a;
                        Retrofit retrofitI2 = ((c21.b) aVar27.f325694b).i();
                        s.j(retrofitI2);
                        kg.o oVar = (kg.o) aVar27.F.get();
                        return j6.a.B(p.a.x(retrofitI2, "retrofit", oVar, "gson"), oVar, "build(...)");
                    case 4:
                        zvj.b bVar13 = aVar27.f325693a;
                        kg.o gson = ((c21.b) aVar27.f325694b).h();
                        s.j(gson);
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        kg.p pVar = new kg.p(gson);
                        he0.m mVar4 = new he0.m("element", nwj.f1.class, true, false);
                        mVar4.c(nwj.b0.class, "COUNTRY");
                        mVar4.c(x0.class, "RETAIL_WITH_CREDIT_TERMS");
                        mVar4.c(nwj.t.class, "ADDRESS");
                        mVar4.c(nwj.m0.class, "NAME");
                        mVar4.c(n0.class, "NAME_WITH_ALIAS");
                        mVar4.c(nwj.c0.class, "BIRTH_DATE");
                        mVar4.c(g0.class, "EMAIL");
                        mVar4.c(v0.class, "ACCOUNT_PURPOSE");
                        mVar4.c(o0.class, "OCCUPATION");
                        mVar4.c(a1.class, "TAX_RESIDENCIES");
                        mVar4.c(nwj.p0.class, "PASSWORD");
                        mVar4.c(nwj.f0.class, "DUPLICATE_ACCOUNT_CHECK");
                        mVar4.c(c1.class, "WAITING_LIST");
                        mVar4.c(nwj.s.class, "ACTIVATION_READY");
                        mVar4.c(z.class, "CONTACTS_PERMISSION");
                        mVar4.c(nwj.z0.class, "SELFIE_KYC");
                        mVar4.c(u0.class, "PROFILE_DETAILS");
                        mVar4.c(a0.class, "CONTACTS_SYNC");
                        mVar4.c(nwj.e0.class, "DOCUMENT_KYC");
                        mVar4.c(u.class, "ADDRESS_VERIFICATION_KYC");
                        mVar4.c(nwj.y0.class, "RISK_CHECK");
                        mVar4.c(x.class, "BANK_TERMS");
                        mVar4.c(h0.class, "EMAIL_WITH_MARKETING_CONSENT");
                        mVar4.c(nwj.k0.class, "MARKETING_CONSENT");
                        mVar4.c(nwj.r0.class, "POLITICALLY_EXPOSED_PERSON_DECLARATION");
                        mVar4.c(l0.class, "MONTHLY_INCOME");
                        mVar4.c(y.class, "CITIZENSHIP");
                        mVar4.c(nwj.i0.class, "JUNIOR_GRADUATION");
                        mVar4.c(j0.class, "JUNIOR_GRADUATION_ACCOUNT_LINKED");
                        mVar4.c(nwj.b1.class, "FALLBACK_SUBTYPE_LABEL");
                        mVar4.c(nwj.d0.class, "DOCUMENT_ID");
                        mVar4.c(e1.class, "WORKFLOW");
                        mVar4.c(w0.class, "QES");
                        mVar4.c(nwj.v.class, "AI_CALLS_CONSENT");
                        mVar4.c(w.class, "ANALYTICS_EVENTS_TRACKING_CONSENT");
                        mVar4.c(nwj.q0.class, "POD_BENEFICIARIES");
                        mVar4.c(d1.class, "WAITING_VERIFICATION");
                        mVar4.c(s0.class, "PRODUCT_LIFECYCLE");
                        mVar4.c(t0.class, "PRODUCT_ONBOARDING");
                        pVar.e.add(mVar4);
                        kg.o oVarB = pVar.b();
                        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                        return oVarB;
                    case 5:
                        return new ne0.d();
                    case 6:
                        zvj.b bVar14 = aVar27.f325693a;
                        ee0.a aVar32 = aVar27.f325695c;
                        je0.d mapper = aVar32.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = aVar27.d.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory = aVar32.f();
                        s.j(storageFactory);
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider, "user_auth", mapper, 1, null, 48);
                    case 7:
                        fVar = new twj.i((ue0.c) aVar27.J.get());
                        break;
                    case 8:
                        fk3.a aVarA12 = aVar27.f325696g.a();
                        s.j(aVarA12);
                        fVar = new ixj.b(aVarA12);
                        break;
                    case 9:
                        sri.m mVarD = ((g8b.a) aVar27.E).d();
                        s.j(mVarD);
                        fVar = new kxj.d(mVarD);
                        break;
                    case 10:
                        aVar27.getClass();
                        fVar = new ddk.b(ImmutableSet.of(new kwj.a()), 6);
                        break;
                    case 11:
                        return new cwj.a();
                    default:
                        throw new AssertionError(i59);
                }
                return fVar;
            case 11:
                zxb.e eVar7 = (zxb.e) this.f319544c;
                int i66 = this.f319543b;
                switch (i66) {
                    case 0:
                        cri.a aVar33 = eVar7.f326117a;
                        djf.c cVar9 = eVar7.f326119b;
                        lfm.c cVarB2 = ((g8b.a) aVar33).b();
                        s.j(cVarB2);
                        thf.d dVarD2 = cVar9.d();
                        s.j(dVarD2);
                        thf.m mVarG = cVar9.g();
                        s.j(mVarG);
                        return new pyb.s(cVarB2, dVarD2, mVarG);
                    case 1:
                        return new pyb.k();
                    case 2:
                        return new pyb.j();
                    case 3:
                        eub.i iVarE = eVar7.f.e();
                        s.j(iVarE);
                        return new qyb.a(iVarE);
                    case 4:
                        gte.a aVarB10 = eVar7.f326124g.b();
                        s.j(aVarB10);
                        return new ryb.b(aVarB10);
                    case 5:
                        return new ryb.c();
                    case 6:
                        cri.a aVar34 = eVar7.f326117a;
                        w1c.j jVar4 = eVar7.k;
                        k0 k0Var = eVar7.f;
                        sri.m mVarD2 = ((g8b.a) aVar34).d();
                        s.j(mVarD2);
                        gte.a aVarB11 = eVar7.f326124g.b();
                        s.j(aVarB11);
                        t tVarF = eVar7.f326125h.f();
                        s.j(tVarF);
                        eub.i iVarE2 = k0Var.e();
                        s.j(iVarE2);
                        eub.a aVarA13 = k0Var.a();
                        s.j(aVarA13);
                        wub.a aVarA14 = eVar7.i.a();
                        s.j(aVarA14);
                        u29.g gVarA = eVar7.f326126j.a();
                        s.j(gVarA);
                        rul.e eVarA = jVar4.a();
                        a2c.e eVarB = jVar4.b();
                        xvh.c cVarA3 = ((a6d.e) eVar7.f326127l).a();
                        s.j(cVarA3);
                        return new yxb.s(mVarD2, aVarB11, tVarF, iVarE2, aVarA13, aVarA14, gVarA, eVarA, eVarB, cVarA3);
                    case 7:
                        gte.a aVarB12 = eVar7.f326124g.b();
                        s.j(aVarB12);
                        ImmutableSet immutableSetOf = ImmutableSet.of((yxb.t) new yxb.u(aVarB12), new yxb.t());
                        p56.a aVar35 = new p56.a((gub.b) eVar7.f326120b0.get());
                        gte.a aVarB13 = eVar7.f326124g.b();
                        s.j(aVarB13);
                        return new xxb.e(immutableSetOf, aVar35, aVarB13);
                    case 8:
                        return new qyb.b();
                    case 9:
                        return new q0c.u();
                    case 10:
                        return new ozb.g();
                    case 11:
                        return new pyb.e();
                    case 12:
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) eVar7.f326131q).c();
                        s.j(aVarC2);
                        return new pyb.l(aVarC2);
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                return a();
            case 13:
                zxf.a aVar36 = (zxf.a) this.f319544c;
                int i74 = this.f319543b;
                switch (i74) {
                    case 0:
                        txf.e eVar8 = (txf.e) aVar36.k.get();
                        l80.e eVarH = aVar36.e.h();
                        s.j(eVarH);
                        nVar = new ayf.n(eVar8, eVarH);
                        break;
                    case 1:
                        nVar = new txf.e((TravelService) aVar36.f326321h.get(), new ne0.d(), (wxf.a) aVar36.f326322j.get());
                        break;
                    case 2:
                        return zxf.e.a(((nj0.d) aVar36.f326317a).f());
                    case 3:
                        return y0.d((TravelDatabase) aVar36.i.get());
                    case 4:
                        Context context2 = aVar36.f326318b;
                        yk0.a aVarB14 = aVar36.f326319c.b();
                        s.j(aVarB14);
                        return y0.f(context2, aVarB14, ((c21.b) aVar36.d).b());
                    case 5:
                        nVar = new by5.a((txf.n) aVar36.f326325n.get());
                        break;
                    case 6:
                        nVar = new txf.n((TravelService) aVar36.f326321h.get(), new ne0.d(), (wxf.f) aVar36.f326324m.get());
                        break;
                    case 7:
                        return y0.i((TravelDatabase) aVar36.i.get());
                    case 8:
                        nVar = new ayf.p((txf.s) aVar36.f326326p.get());
                        break;
                    case 9:
                        nVar = new txf.s((TravelService) aVar36.f326321h.get(), new ne0.d(), (wxf.j) aVar36.o.get());
                        break;
                    case 10:
                        return y0.v((TravelDatabase) aVar36.i.get());
                    case 11:
                        eub.a aVarA15 = aVar36.f.a();
                        s.j(aVarA15);
                        nVar = new ayf.o(aVarA15);
                        break;
                    case 12:
                        y80.a aVarR = aVar36.e.r();
                        s.j(aVarR);
                        w39.b bVarA = aVar36.f326320g.a();
                        s.j(bVarA);
                        nVar = new ayf.r(aVarR, bVarA);
                        break;
                    case 13:
                        nVar = new txf.j((TravelService) aVar36.f326321h.get(), new ne0.d(), (wxf.d) aVar36.f326329s.get());
                        break;
                    case 14:
                        return y0.h((TravelDatabase) aVar36.i.get());
                    default:
                        throw new AssertionError(i74);
                }
                return nVar;
            default:
                zxf.b bVar15 = (zxf.b) this.f319544c;
                k0 k0Var2 = bVar15.f326331a;
                int i92 = this.f319543b;
                if (i92 == 0) {
                    return new dyf.i((ayf.o) bVar15.f326332b.get());
                }
                if (i92 == 1) {
                    eub.a aVarA16 = k0Var2.a();
                    s.j(aVarA16);
                    return new ayf.o(aVarA16);
                }
                if (i92 == 2) {
                    return new dyf.j((ayf.o) bVar15.f326332b.get());
                }
                if (i92 != 3) {
                    throw new AssertionError(i92);
                }
                ayf.o oVar2 = (ayf.o) bVar15.f326332b.get();
                nyb.k kVarC = k0Var2.c();
                s.j(kVarC);
                return new cyf.a(oVar2, kVarC);
        }
    }
}
