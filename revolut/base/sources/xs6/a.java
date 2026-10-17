package xs6;

import ael.d0;
import afj.u3;
import afj.y3;
import anb.s;
import anb.t;
import anb.z;
import android.content.Context;
import android.os.Build;
import au6.n0;
import au6.p1;
import bjf.f;
import blb.i;
import blb.k;
import c1g.a0;
import c1g.c0;
import c1g.e0;
import c1g.u;
import c1g.x;
import c1g.y;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.repository.service.BackendFlowCardsService;
import com.revolut.core.backend_flow.repository.service.BackendFlowEntitiesService;
import com.revolut.core.backend_flow.repository.service.BackendFlowEntitiesSummaryService;
import com.revolut.core.backend_flow.repository.service.BackendFlowTicketsService;
import com.revolut.core.backend_flow.repository.service.BackendFlowTransactionsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCurrencyService;
import com.revolut.feature.revpro.pro_merchant.toggles.impl.data.network.ProMerchantFeatureToggleService;
import com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase;
import com.revolut.feature.travel.experiences.impl.network.booking.TravelExperiencesBookingService;
import com.revolut.feature.travel.experiences.impl.network.experience.TravelExperiencesService;
import com.revolut.feature.travel.experiences.impl.network.options.TravelExperiencesOptionsService;
import com.revolut.feature.travel.experiences.impl.network.reviews.TravelExperiencesReviewsService;
import com.revolut.feature.travel.experiences.impl.network.search.TravelExperiencesSearchService;
import com.revolut.trading.orders.data.network.services.NbboService;
import ct6.w;
import cu8.r0;
import e4m.e;
import ecm.q;
import et6.k3;
import fnb.j;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;
import rga.l;
import rlb.m;
import ssi.o;
import va.g;
import vha.d1;
import vha.h1;
import vha.k1;
import vjb.h;
import vrl.r;
import vy5.a1;
import vy5.e1;
import vy5.i0;
import vy5.p0;
import vy5.v0;
import wsg.n;
import xsl.p;
import xsl.v;
import z0g.c1;
import z0g.f1;
import z0g.o0;
import z0g.t0;
import z0g.u0;
import z0g.w0;
import z0g.x0;
import z0g.z0;
import zxb.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f308420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f308421c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f308419a = i2;
        this.f308421c = obj2;
        this.f308420b = i;
    }

    private final Object a() {
        ymb.b bVar = (ymb.b) this.f308421c;
        int i = this.f308420b;
        switch (i) {
            case 0:
                return new t(bVar.f314945a, bVar.f314947b, bVar.f314949c, bVar.d, bVar.e, bVar.f, bVar.f314952g, bVar.f314953h, bVar.g0, bVar.f314951e0, bVar.i0, bVar.f314946a0, bVar.f314956k0, bVar.i, bVar.z, bVar.A, bVar.B, bVar.C, bVar.D, bVar.E, bVar.F, bVar.f314962p, bVar.f314972y, bVar.G, bVar.H, bVar.I, bVar.J, bVar.k, bVar.K, bVar.f314970w, bVar.L, bVar.M);
            case 1:
                s sVar = (s) ((z) bVar.f0.get()).b();
                vc.s.k(sVar);
                return sVar;
            case 2:
                return new z(bVar.f314947b, bVar.f314949c, bVar.f, bVar.i, bVar.f314953h, bVar.d, bVar.f314946a0, bVar.c0, bVar.f314966s, bVar.f314968t, bVar.u, bVar.f314951e0, bVar.f314952g, bVar.f314970w, bVar.f314971x, bVar.e);
            case 3:
                return yf6.b.C((i) bVar.Z.get());
            case 4:
                return f.a(bVar.d, bVar.f314955j, bVar.k, bVar.f314957l, bVar.f314958m, bVar.f314959n, bVar.o, bVar.i, bVar.f314962p, bVar.f314963q, bVar.f314964r, bVar.f314945a);
            case 5:
                return yf6.b.A((rjb.b) bVar.f314948b0.get());
            case 6:
                return l.i(bVar.e, bVar.f314945a);
            case 7:
                return yf6.b.x((bnb.b) bVar.f314950d0.get());
            case 8:
                return f.b(bVar.f314946a0, bVar.v);
            case 9:
                return yf6.b.y((m) bVar.f314954h0.get());
            case 10:
                return l.j(bVar.f314946a0, bVar.f314949c);
            case 11:
                return yf6.b.B((h) bVar.j0.get());
            case 12:
                return g.e(bVar.f314959n, bVar.f314958m, bVar.f314957l, bVar.f314972y);
            case 13:
                return olc.c.c(bVar.g0);
            case 14:
                return l.g(bVar.f314945a, bVar.d, bVar.f314947b, bVar.f314951e0, bVar.f314946a0, bVar.i0, bVar.f314961o0, bVar.f314962p, bVar.I, bVar.N, bVar.O, bVar.P, bVar.f314952g, bVar.k, bVar.f, bVar.e, bVar.f314949c, bVar.B, bVar.J, bVar.f314970w, bVar.f314956k0);
            case 15:
                return yf6.b.D((j) bVar.f314960n0.get());
            case 16:
                return f9f.b.b(bVar.f314945a, bVar.d, bVar.f314957l, bVar.f314958m, bVar.f314959n, bVar.f314946a0, bVar.f314956k0, bVar.f314952g);
            case 17:
                return k.a();
            case 18:
                return g.b(bVar.d, bVar.k, bVar.f314956k0, bVar.f314951e0, bVar.f);
            case 19:
                return f9f.b.d(bVar.f314945a, bVar.i0, bVar.f314946a0, bVar.g0, bVar.c0, bVar.f314951e0, bVar.f314967s0, bVar.B, bVar.D, bVar.Q, bVar.R, bVar.f314949c, bVar.S, bVar.A, bVar.d, bVar.C, bVar.E, bVar.F, bVar.T, bVar.U, bVar.V, bVar.f314971x, bVar.f, bVar.W, bVar.K, bVar.f314947b, bVar.X, bVar.M, bVar.Y, bVar.G, bVar.f314956k0, bVar.k, bVar.P, bVar.f314962p, bVar.e);
            case 20:
                return yf6.b.z((t) bVar.l0.get());
            case 21:
                return f9f.b.c(bVar.f314961o0, bVar.f314949c, bVar.f314946a0, bVar.e);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ytf.f fVar = (ytf.f) this.f308421c;
        a31.a aVar = fVar.f316784a;
        a31.a aVar2 = fVar.f316786c;
        a31.a aVar3 = fVar.e;
        a31.a aVar4 = fVar.f316785b;
        int i = this.f308420b;
        if (i == 0) {
            return new es8.b(aVar, aVar4, aVar2, fVar.d, aVar3, fVar.f, 7);
        }
        if (i == 1) {
            return new g2j.a(fVar.f316787g, fVar.f316788h, fVar.i, fVar.f316789j, fVar.k, fVar.f316790l, fVar.f316791m, fVar.f316792n, aVar4, fVar.o, fVar.f316793p, aVar3, aVar2, aVar, fVar.f316794q, fVar.f316795r, fVar.f316796s, fVar.f316797t, fVar.u, fVar.v, fVar.f316798w, fVar.f316799x, fVar.f316800y, fVar.z, fVar.A, fVar.B, fVar.C, fVar.D, fVar.E, fVar.F, fVar.G, fVar.H, fVar.I, fVar.J, fVar.K, fVar.L);
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        yy5.b bVar = (yy5.b) this.f308421c;
        fqk.a aVar = bVar.i;
        usg.a aVar2 = bVar.f317829g;
        c89.b bVar2 = bVar.f317826a;
        xmg.a aVar3 = bVar.f317834n;
        ta7.a aVar4 = bVar.e;
        k95.a aVar5 = bVar.f317832l;
        oda.d dVar = bVar.f317833m;
        int i = this.f308420b;
        if (i == 0) {
            v0 v0VarC = bVar.c();
            uy5.f fVar = (uy5.f) bVar.C.get();
            ang.f fVarE = aVar3.e();
            o oVarC = aVar.c();
            vc.s.j(oVarC);
            e1 e1Var = new e1();
            x79.a aVarA = bVar2.a();
            vc.s.j(aVarA);
            zy5.a aVarB = bVar.b();
            utk.f fVarA = bVar.a();
            p56.a aVar6 = new p56.a(dVar.f());
            n nVarB = aVar2.b();
            e95.a aVarA2 = aVar5.a();
            vc.s.j(aVarA2);
            return new i0(v0VarC, fVar, fVarE, oVarC, e1Var, aVarA, aVarB, fVarA, aVar6, nVarB, aVarA2, dVar.c(), aVar4.d());
        }
        if (i == 1) {
            n nVarB2 = aVar2.b();
            ppk.f fVarA2 = bVar.f317830h.a();
            psi.a aVarA3 = aVar.a();
            vc.s.j(aVarA3);
            qpa.b bVarB = bVar.f317831j.b();
            vc.s.j(bVarB);
            hd5.a aVarA4 = bVar.k.a();
            vc.s.j(aVarA4);
            e95.a aVarA5 = aVar5.a();
            vc.s.j(aVarA5);
            return new p0(nVarB2, fVarA2, aVarA3, bVarB, aVarA4, aVarA5, new mce.a(), dVar.a(), aVar4.d());
        }
        if (i != 2) {
            if (i == 3) {
                return new az5.a((uy5.f) bVar.C.get());
            }
            if (i == 4) {
                return new vy5.c();
            }
            throw new AssertionError(i);
        }
        v0 v0VarC2 = bVar.c();
        uy5.f fVar2 = (uy5.f) bVar.C.get();
        ang.f fVarE2 = aVar3.e();
        x79.a aVarA6 = bVar2.a();
        vc.s.j(aVarA6);
        utk.f fVarA3 = bVar.a();
        zy5.a aVarB2 = bVar.b();
        e95.a aVarA7 = aVar5.a();
        vc.s.j(aVarA7);
        return new a1(v0VarC2, fVar2, fVarE2, aVarA6, fVarA3, aVarB2, aVarA7, dVar.c(), aVar4.d());
    }

    private final Object d() {
        z0g.b bVar = (z0g.b) this.f308421c;
        int i = this.f308420b;
        switch (i) {
            case 0:
                n8b.a aVarA = bVar.f318299a.a();
                vc.s.j(aVarA);
                p0g.g gVar = (p0g.g) bVar.H.get();
                l80.e eVarH = bVar.f318306g.h();
                vc.s.j(eVarH);
                return new e0(aVarA, gVar, eVarH);
            case 1:
                return new p0g.g((TravelExperiencesSearchService) bVar.C.get(), (t0g.f) bVar.E.get(), (ue0.c) bVar.F.get(), (ne0.j) bVar.G.get());
            case 2:
                return w0.a(((nj0.d) bVar.f318301b).f());
            case 3:
                return yf6.b.u((TravelExperiencesDatabase) bVar.D.get());
            case 4:
                Context context = bVar.f318303c;
                yk0.a aVarB = bVar.d.b();
                vc.s.j(aVarB);
                return yf6.b.j(context, aVarB, ((c21.b) bVar.e).b());
            case 5:
                je0.d dVarB = bVar.f.b();
                vc.s.j(dVarB);
                yk0.a aVarB2 = bVar.d.b();
                vc.s.j(aVarB2);
                xe0.f fVarF = bVar.f.f();
                vc.s.j(fVarF);
                return yf6.b.e(dVarB, fVarF, aVarB2);
            case 6:
                return new ne0.d();
            case 7:
                return new y((n0g.g) bVar.K.get());
            case 8:
                return new n0g.g((TravelExperiencesOptionsService) bVar.J.get(), (ne0.j) bVar.G.get(), (ue0.c) bVar.F.get());
            case 9:
                return z0g.v0.a(((nj0.d) bVar.f318301b).f());
            case 10:
                return new c1g.h((j0g.j) bVar.Q.get());
            case 11:
                TravelExperiencesBookingService travelExperiencesBookingService = (TravelExperiencesBookingService) bVar.M.get();
                ne0.j jVar = (ne0.j) bVar.G.get();
                t0g.c cVar = (t0g.c) bVar.N.get();
                j0g.a aVar = (j0g.a) bVar.O.get();
                hyf.a aVarA2 = bVar.f318307h.a();
                vc.s.j(aVarA2);
                return new j0g.j(travelExperiencesBookingService, jVar, cVar, aVar, aVarA2);
            case 12:
                return t0.a(((nj0.d) bVar.f318301b).f());
            case 13:
                return yf6.b.s((TravelExperiencesDatabase) bVar.D.get());
            case 14:
                return z0.a();
            case 15:
                return new x((m0g.a) bVar.U.get(), (k0g.c) bVar.V.get());
            case 16:
                return new m0g.g((TravelExperiencesService) bVar.S.get(), (ne0.j) bVar.G.get(), (ne0.j) bVar.T.get(), (ue0.c) bVar.F.get());
            case 17:
                return u0.a(((nj0.d) bVar.f318301b).f());
            case 18:
                return c1.a();
            case 19:
                return new k0g.c((ne0.j) bVar.G.get(), (ue0.c) bVar.F.get());
            case 20:
                qd0.b bVarN = bVar.f318306g.n();
                vc.s.j(bVarN);
                return new b1g.c(bVarN, (b1g.a) bVar.X.get());
            case 21:
                return new b1g.a(bVar.f318303c);
            case 22:
                hyf.a aVarA3 = bVar.f318307h.a();
                vc.s.j(aVarA3);
                return new e1g.j(aVarA3, (hyf.d) bVar.I.get(), (c1g.k) bVar.Z.get(), (e1g.a) bVar.f318300a0.get());
            case 23:
                return new c1g.k((k0g.c) bVar.V.get());
            case 24:
                n8b.a aVarA4 = bVar.f318299a.a();
                vc.s.j(aVarA4);
                return new e1g.d(aVarA4);
            case 25:
                return new l0g.e((ue0.c) bVar.F.get(), (ne0.j) bVar.G.get(), (TravelExperiencesService) bVar.S.get(), (t0g.e) bVar.c0.get(), new i90.b());
            case 26:
                return yf6.b.t((TravelExperiencesDatabase) bVar.D.get());
            case 27:
                return new i0g.f((TravelExperiencesSearchService) bVar.C.get(), (ne0.j) bVar.G.get(), (ue0.c) bVar.F.get());
            case 28:
                return x0.a(((nj0.d) bVar.f318301b).f());
            case 29:
                return yf6.b.v((TravelExperiencesDatabase) bVar.D.get());
            case 30:
                return new o0g.d((TravelExperiencesReviewsService) bVar.f0.get(), (t0g.g) bVar.g0.get(), (ne0.j) bVar.G.get());
            case 31:
                return new c1g.g((q0g.d) bVar.j0.get());
            case 32:
                return new q0g.d((TravelExperiencesService) bVar.S.get(), (ne0.j) bVar.G.get(), (ue0.c) bVar.F.get());
            case 33:
                kf0.c cVar2 = bVar.f318317s;
                return new c0(new yk0.d(), (n0g.g) bVar.K.get(), (a0) bVar.l0.get());
            case 34:
                hyf.b bVarC = bVar.f318307h.c();
                vc.s.j(bVarC);
                return new a0(bVarC);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object a1Var;
        Object aVar;
        Object fVar;
        Object dVar;
        Object bVar;
        Object cVar;
        Object uVar;
        switch (this.f308419a) {
            case 0:
                b bVar2 = (b) this.f308421c;
                c21.e eVar = bVar2.f308423b;
                d dVar2 = bVar2.f308422a;
                int i = this.f308420b;
                switch (i) {
                    case 0:
                        a1Var = new et6.a1((n0) bVar2.f308426h.get());
                        break;
                    case 1:
                        a1Var = new n0((FreelancerCurrencyService) bVar2.e.get(), (ne0.j) bVar2.f.get(), (bu6.c) bVar2.f308425g.get());
                        break;
                    case 2:
                        return xhi.f.n(dVar2, (Retrofit) bVar2.d.get());
                    case 3:
                        Retrofit retrofitI = ((c21.b) eVar).i();
                        vc.s.j(retrofitI);
                        return xhi.f.l(dVar2, retrofitI, (kg.o) bVar2.f308424c.get());
                    case 4:
                        kg.o oVarH = ((c21.b) eVar).h();
                        vc.s.j(oVarH);
                        xhi.f.k(dVar2, oVarH);
                        return oVarH;
                    case 5:
                        return new ne0.d();
                    case 6:
                        return new bu6.c();
                    default:
                        throw new AssertionError(i);
                }
                return a1Var;
            case 1:
                p pVar = (p) this.f308421c;
                l70.e eVar2 = pVar.f308697j;
                v vVar = pVar.v;
                zdl.c cVar2 = pVar.e;
                int i2 = this.f308420b;
                switch (i2) {
                    case 0:
                        gte.a aVarB = pVar.f308692a.b();
                        vc.s.j(aVarB);
                        aVar = new yul.a(aVarB);
                        break;
                    case 1:
                        w80.b bVarJ = eVar2.j();
                        vc.s.j(bVarJ);
                        qd0.b bVarN = eVar2.n();
                        vc.s.j(bVarN);
                        return xhi.f.d(bVarJ, bVarN);
                    case 2:
                        return new dsl.b();
                    case 3:
                        ybl.b bVarB = cVar2.b();
                        vc.s.j(bVarB);
                        ybl.k kVarD = pVar.f308696h.d();
                        vc.s.j(kVarD);
                        ybl.d dVarH = cVar2.h();
                        vc.s.j(dVarH);
                        d0 d0VarK = cVar2.k();
                        vc.s.j(d0VarK);
                        vrl.s sVarD = pVar.k.d();
                        vc.s.j(sVarD);
                        return new vrl.e(bVarB, kVarD, dVarH, d0VarK, sVarD);
                    case 4:
                        prl.l lVar = (prl.l) pVar.V.get();
                        ybl.b bVarB2 = cVar2.b();
                        vc.s.j(bVarB2);
                        aVar = new r(lVar, bVarB2);
                        break;
                    case 5:
                        aVar = new prl.l((NbboService) pVar.U.get());
                        break;
                    case 6:
                        return xhi.f.C(vVar, (Retrofit) pVar.T.get());
                    case 7:
                        return xhi.f.m(vVar, ((nj0.d) pVar.f308706w).f(), fe0.c.a());
                    default:
                        throw new AssertionError(i2);
                }
                return aVar;
            case 2:
                xu8.b bVar3 = (xu8.b) this.f308421c;
                a31.a aVar2 = bVar3.f308983l;
                int i3 = this.f308420b;
                if (i3 == 0) {
                    return new c43.a(bVar3.f308977a, bVar3.f308978b, bVar3.f308979c, bVar3.d, bVar3.e, bVar3.f, bVar3.f308980g, bVar3.f308981h, bVar3.i, bVar3.f308982j, bVar3.k, aVar2, bVar3.f308984m, bVar3.f308985n, bVar3.o, bVar3.f308986p, bVar3.f308987q, bVar3.f308988r, bVar3.f308989s, bVar3.f308990t, bVar3.u, bVar3.v);
                }
                if (i3 == 1) {
                    return new awj.b(aVar2, 17);
                }
                throw new AssertionError(i3);
            case 3:
                xxb.a aVar3 = (xxb.a) this.f308421c;
                a31.a aVar4 = aVar3.f309479y;
                a31.a aVar5 = aVar3.f309475s;
                a31.a aVar6 = aVar3.f309470m;
                a31.a aVar7 = aVar3.i;
                int i5 = this.f308420b;
                if (i5 == 0) {
                    return new djf.f(aVar3.f309463a, aVar3.f309464b, aVar3.f309465c, aVar3.d, aVar3.e, aVar3.f, aVar3.f309466g, aVar3.f309467h, aVar7, aVar3.f309468j, aVar3.k, aVar3.f309469l, aVar6, aVar3.f309471n, aVar3.o, aVar3.f309472p, aVar3.f309473q, aVar3.f309474r, aVar5, aVar3.f309476t, aVar3.u, aVar3.v, aVar3.f309477w, aVar3.f309478x, aVar4, 2);
                }
                if (i5 == 1) {
                    return y0.a(aVar3.B);
                }
                if (i5 == 2) {
                    return xhi.f.D((zxb.v0) aVar3.A.get());
                }
                if (i5 == 3) {
                    return f1.e(aVar7, aVar6, aVar5, aVar4);
                }
                throw new AssertionError(i5);
            case 4:
                xxb.b bVar4 = (xxb.b) this.f308421c;
                a31.a aVar8 = bVar4.e;
                int i6 = this.f308420b;
                if (i6 == 0) {
                    return new zxb.u0(bVar4.f309480a, bVar4.f309481b, bVar4.f309482c, bVar4.d, aVar8, bVar4.f, bVar4.f309483g, bVar4.f309484h, bVar4.i, bVar4.f309485j, bVar4.k, bVar4.f309486l, bVar4.f309487m, bVar4.f309488n, bVar4.o, bVar4.f309489p, bVar4.f309490q, bVar4.f309491r, bVar4.f309492s, bVar4.f309493t, bVar4.u, bVar4.v, bVar4.f309494w, bVar4.f309495x, bVar4.f309496y, bVar4.z, bVar4.A, bVar4.B, bVar4.C, bVar4.D, bVar4.E, bVar4.F, bVar4.G, bVar4.H, bVar4.I, bVar4.J, bVar4.K, bVar4.L, bVar4.M, bVar4.N, bVar4.O, bVar4.P, bVar4.Q, bVar4.R, bVar4.S, bVar4.T, bVar4.U, bVar4.V);
                }
                if (i6 == 1) {
                    return y0.c(aVar8);
                }
                if (i6 == 2) {
                    return y0.b(aVar8);
                }
                throw new AssertionError(i6);
            case 5:
                xxj.a aVar9 = (xxj.a) this.f308421c;
                int i21 = this.f308420b;
                if (i21 == 0) {
                    return new jza.c(aVar9.f309550g, 3);
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return new yxj.f(aVar9.f309547a, aVar9.f309548b, aVar9.f309549c, aVar9.d, aVar9.e);
                    }
                    throw new AssertionError(i21);
                }
                yxj.e eVar3 = (yxj.e) ((yxj.f) aVar9.f.get()).b();
                vc.s.k(eVar3);
                return eVar3;
            case 6:
                y2d.b bVar5 = (y2d.b) this.f308421c;
                y1d.b bVar6 = bVar5.f310624a;
                int i22 = this.f308420b;
                if (i22 == 0) {
                    a2d.j jVar = (a2d.j) bVar6;
                    ImmutableSet immutableSetOf = ImmutableSet.of((x3d.b) jVar.f0.get(), (x3d.b) jVar.g0.get(), (x3d.b) jVar.f760h0.get());
                    vc.s.j(immutableSetOf);
                    return new n3d.c(immutableSetOf, new n3d.b());
                }
                if (i22 == 1) {
                    fk3.a aVarA = bVar5.f310625b.a();
                    vc.s.j(aVarA);
                    td0.b bVarA = vd0.d.a();
                    t70.b bVarG = bVar5.f310626c.g();
                    vc.s.j(bVarG);
                    return new m3d.f(aVarA, bVarA, bVarG, (z2d.c) bVar5.f310627g.get(), bVar5.d.b(), bVar5.e.a());
                }
                if (i22 == 2) {
                    ImmutableSet immutableSetA = ((a2d.j) bVar6).a();
                    vc.s.j(immutableSetA);
                    return new z2d.c(immutableSetA);
                }
                if (i22 != 3) {
                    throw new AssertionError(i22);
                }
                ImmutableSet immutableSetB = ((a2d.j) bVar6).b();
                vc.s.j(immutableSetB);
                return new n3d.d(immutableSetB);
            case 7:
                y5k.a aVar10 = (y5k.a) this.f308421c;
                pqi.a aVar11 = aVar10.f311102a;
                int i32 = this.f308420b;
                if (i32 == 0) {
                    return new z5k.b();
                }
                if (i32 != 1) {
                    throw new AssertionError(i32);
                }
                f01.c cVarG = aVar11.g();
                r0 r0VarA = aVar10.f311103b.a();
                nd.o oVarA = aVar11.a();
                rq9.a aVarA2 = aVar10.f311104c.a();
                vc.s.j(aVarA2);
                c9e.c cVarB = aVar10.d.b();
                vc.s.j(cVarB);
                return new a6k.d(cVarG, r0VarA, oVarA, aVarA2, cVarB);
            case 8:
                int i33 = this.f308420b;
                if (i33 == 0) {
                    return new z73.a();
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                y73.g gVar = (y73.g) this.f308421c;
                return f1.d(gVar.f311325a, gVar.f311326b, gVar.f311327c, gVar.d, gVar.e, gVar.f, gVar.f311328g, gVar.f311329h, gVar.i, gVar.k, gVar.f311331l, gVar.f311332m, gVar.f311333n, gVar.o, gVar.f311334p, gVar.f311335q, gVar.f311336r, gVar.f311337s, gVar.f311338t, gVar.u, gVar.v, gVar.f311339w, gVar.f311330j);
            case 9:
                y77.c cVar3 = (y77.c) this.f308421c;
                int i43 = this.f308420b;
                if (i43 == 0) {
                    return new c87.b();
                }
                if (i43 == 1) {
                    return new c87.c(cVar3.f311361a.a());
                }
                if (i43 == 2) {
                    return new d87.b(cVar3.f311362b.f(), (sri.m) cVar3.u.get());
                }
                if (i43 == 3) {
                    return xhi.f.q(cVar3.f311363c);
                }
                if (i43 == 4) {
                    return new x77.b();
                }
                if (i43 == 5) {
                    return new c87.a((c87.b) cVar3.f311373s.get());
                }
                throw new AssertionError(i43);
            case 10:
                y90.e eVar4 = (y90.e) this.f308421c;
                int i59 = this.f308420b;
                switch (i59) {
                    case 0:
                        l80.e eVarH = eVar4.f311709a.h();
                        vc.s.j(eVarH);
                        fVar = new nc0.f(eVarH, (gc0.d) eVar4.f311713h.get(), (fc0.i) eVar4.f311715l.get());
                        break;
                    case 1:
                        hbl.d dVarC = eVar4.f311710b.c();
                        vc.s.j(dVarC);
                        fVar = new gc0.e(dVarC);
                        break;
                    case 2:
                        oc0.n nVar = (oc0.n) eVar4.k.get();
                        t9l.g gVarA = eVar4.f311710b.a();
                        vc.s.j(gVarA);
                        fVar = new fc0.i(nVar, gVarA);
                        break;
                    case 3:
                        fVar = new oc0.n((BackendFlowTransactionsService) eVar4.i.get(), (gc0.f) eVar4.f311714j.get());
                        break;
                    case 4:
                        return xhi.f.w(((nj0.d) eVar4.f311711c).f());
                    case 5:
                        return new gc0.f();
                    case 6:
                        fVar = new oc0.f((ne0.j) eVar4.f311717n.get(), (BackendFlowCardsService) eVar4.o.get(), (ue0.c) eVar4.f311718p.get());
                        break;
                    case 7:
                        return new ne0.d();
                    case 8:
                        return xhi.f.f(((nj0.d) eVar4.f311711c).f());
                    case 9:
                        je0.d dVarB = eVar4.d.b();
                        vc.s.j(dVarB);
                        yk0.a aVarB2 = eVar4.e.b();
                        vc.s.j(aVarB2);
                        xe0.f fVarF = eVar4.d.f();
                        vc.s.j(fVarF);
                        return xhi.f.y(dVarB, aVarB2, fVarF);
                    case 10:
                        oc0.i iVar = (oc0.i) eVar4.f311722t.get();
                        t9l.g gVarA2 = eVar4.f311710b.a();
                        vc.s.j(gVarA2);
                        fc0.g gVar2 = new fc0.g();
                        l80.e eVarH2 = eVar4.f311709a.h();
                        vc.s.j(eVarH2);
                        fVar = new fc0.f(iVar, gVarA2, gVar2, eVarH2);
                        break;
                    case 11:
                        fVar = new oc0.i((gc0.a) eVar4.f311720r.get(), (ne0.j) eVar4.f311717n.get(), (BackendFlowEntitiesService) eVar4.f311721s.get(), (ue0.c) eVar4.f311718p.get());
                        break;
                    case 12:
                        return new gc0.b();
                    case 13:
                        return xhi.f.t(((nj0.d) eVar4.f311711c).f());
                    case 14:
                        fVar = new oc0.m((ne0.j) eVar4.f311717n.get(), (ue0.c) eVar4.f311718p.get(), (gc0.g) eVar4.v.get(), (BackendFlowTicketsService) eVar4.f311723w.get());
                        break;
                    case 15:
                        return new gc0.h();
                    case 16:
                        return xhi.f.v(((nj0.d) eVar4.f311711c).f());
                    case 17:
                        z9l.i iVar2 = (z9l.i) ((vxc.b) eVar4.f).f293051n.get();
                        vc.s.j(iVar2);
                        rxc.e eVar5 = (rxc.e) ((vxc.b) eVar4.f).d.f250070c.get();
                        vc.s.j(eVar5);
                        fVar = new ad0.z(iVar2, eVar5);
                        break;
                    case 18:
                        fVar = new oc0.k((ne0.j) eVar4.f311717n.get(), (BackendFlowEntitiesSummaryService) eVar4.z.get(), (ue0.c) eVar4.f311718p.get());
                        break;
                    case 19:
                        return xhi.f.u(((nj0.d) eVar4.f311711c).f());
                    default:
                        throw new AssertionError(i59);
                }
                return fVar;
            case 11:
                yah.a aVar12 = (yah.a) this.f308421c;
                h9h.a aVar13 = aVar12.f312021a;
                int i66 = this.f308420b;
                if (i66 == 0) {
                    return new xah.d(aVar12.b(), aVar13.i());
                }
                if (i66 == 1) {
                    return new xah.e(aVar13.z());
                }
                throw new AssertionError(i66);
            case 12:
                yc3.j jVar2 = (yc3.j) this.f308421c;
                a31.a aVar14 = jVar2.f312499m;
                a31.a aVar15 = jVar2.f312498l;
                a31.a aVar16 = jVar2.f312496h;
                a31.a aVar17 = jVar2.f312500n;
                a31.a aVar18 = jVar2.k;
                a31.a aVar19 = jVar2.f312495g;
                q qVar = jVar2.f312492a;
                int i74 = this.f308420b;
                if (i74 == 0) {
                    return new ad3.a(jVar2.f312493b, jVar2.f312494c, jVar2.d, jVar2.e, jVar2.f, aVar19, qVar);
                }
                if (i74 == 1) {
                    return new ad3.b(qVar, jVar2.D, aVar16, jVar2.i, aVar19, jVar2.f312497j, aVar18, aVar15, aVar14, aVar17);
                }
                if (i74 != 2) {
                    if (i74 == 3) {
                        return new qbj.e(qVar, aVar18, jVar2.D, aVar17, jVar2.o, jVar2.f312501p, jVar2.f312502q, jVar2.f312503r, jVar2.f312504s, jVar2.f312505t, aVar16, jVar2.u, jVar2.v, jVar2.f312506w, jVar2.f312507x, jVar2.f312508y, aVar19, aVar15, aVar14, jVar2.z, jVar2.A, jVar2.B);
                    }
                    throw new AssertionError(i74);
                }
                ad3.f fVar2 = (ad3.f) ((ad3.a) jVar2.C.get()).b();
                vc.s.k(fVar2);
                return fVar2;
            case 13:
                yej.a aVar20 = (yej.a) this.f308421c;
                a31.a aVar21 = aVar20.f313015j;
                a31.a aVar22 = aVar20.f;
                a31.a aVar23 = aVar20.d;
                a31.a aVar24 = aVar20.f313012c;
                a31.a aVar25 = aVar20.f313023t;
                a31.a aVar26 = aVar20.f313013g;
                a31.a aVar27 = aVar20.f313014h;
                int i92 = this.f308420b;
                if (i92 == 0) {
                    return new u3(aVar20.f313011b, aVar24, aVar23, aVar20.e, aVar22, aVar26, aVar27, aVar20.i, aVar21, aVar20.k, aVar20.f313016l, aVar20.f313017m, aVar20.f313018n, aVar20.o, aVar20.f313019p, aVar20.f313020q, aVar20.f313021r, aVar20.f313022s, aVar25, aVar20.u, aVar20.v, aVar20.f313024w, aVar20.f313025x, aVar20.f313026y, aVar20.z, aVar20.A, aVar20.B, aVar20.f313010a);
                }
                if (i92 == 1) {
                    return a0k.b.c(aVar20.D);
                }
                if (i92 == 2) {
                    return xhi.f.B((u3) aVar20.C.get());
                }
                if (i92 == 3) {
                    return y3.a(aVar24, aVar23, aVar22, aVar20.D, aVar27, aVar21);
                }
                if (i92 == 4) {
                    return a0k.b.b(aVar26, aVar27, aVar25);
                }
                if (i92 == 5) {
                    return aoj.c.a();
                }
                throw new AssertionError(i92);
            case 14:
                yf8.a aVar28 = (yf8.a) this.f308421c;
                mj8.b bVar7 = aVar28.f313195b;
                usg.a aVar29 = aVar28.f313194a;
                ite.a aVar30 = aVar28.f;
                se8.a aVar31 = aVar28.f313196c;
                int i96 = this.f308420b;
                if (i96 == 0) {
                    n nVarB = aVar29.b();
                    hj8.a aVarA3 = bVar7.a();
                    vc.s.j(aVarA3);
                    zf8.n nVar2 = (zf8.n) aVar28.i.get();
                    ao.h hVarA = aVar28.d.a();
                    zf8.b bVar8 = new zf8.b();
                    te8.r rVarB = aVar31.b();
                    vc.s.j(rVarB);
                    te8.v vVarD = aVar31.d();
                    vc.s.j(vVarD);
                    return new zf8.k(nVarB, aVarA3, nVar2, hVarA, bVar8, rVarB, vVarD, aVar28.e.a(), new ag8.f());
                }
                if (i96 == 1) {
                    te8.e eVarA = aVar31.a();
                    vc.s.j(eVarA);
                    hj8.a aVarA4 = bVar7.a();
                    vc.s.j(aVarA4);
                    return new zf8.n(aVarA4, eVarA);
                }
                if (i96 == 2) {
                    wsg.b bVarA2 = aVar29.a();
                    gte.a aVarB3 = aVar30.b();
                    vc.s.j(aVarB3);
                    return new zf8.o(bVarA2, aVarB3, new zf8.b());
                }
                if (i96 != 3) {
                    throw new AssertionError(i96);
                }
                zf8.k kVar = (zf8.k) aVar28.f313199j.get();
                te8.e eVarA2 = aVar31.a();
                vc.s.j(eVarA2);
                kbb.c cVarF = aVar31.f();
                zf8.n nVar3 = (zf8.n) aVar28.i.get();
                te8.c0 c0Var = (te8.c0) aVar31.z.get();
                vc.s.j(c0Var);
                hy2.f fVarA = aVar28.f313197g.a();
                ffk.t tVarF = aVar28.f313198h.f();
                vc.s.j(tVarF);
                gte.a aVarB4 = aVar30.b();
                vc.s.j(aVarB4);
                return new ag8.e(kVar, eVarA2, cVarF, nVar3, c0Var, fVarA, tVarF, aVarB4);
            case 15:
                yfc.a aVar32 = (yfc.a) this.f308421c;
                int i99 = this.f308420b;
                if (i99 == 0) {
                    return new ne0.d();
                }
                if (i99 == 1) {
                    dVar = new zfc.d(new o7.b((gr6.a) aVar32.f313208c.f291727r.get()), (vfc.f) aVar32.f313210h.get());
                } else {
                    if (i99 != 2) {
                        if (i99 != 3) {
                            if (i99 == 4) {
                                return new tfc.a();
                            }
                            throw new AssertionError(i99);
                        }
                        Retrofit retrofitI2 = ((c21.b) aVar32.d).i();
                        vc.s.j(retrofitI2);
                        return yf6.b.r(retrofitI2);
                    }
                    dVar = new vfc.f((ProMerchantFeatureToggleService) aVar32.f.get(), (ne0.j) aVar32.e.get(), (tfc.a) aVar32.f313209g.get(), aVar32.b());
                }
                return dVar;
            case 16:
                yh1.e eVar6 = (yh1.e) this.f308421c;
                kj1.a aVar33 = eVar6.f313707a;
                int i100 = this.f308420b;
                if (i100 == 0) {
                    rh1.b bVarA3 = aVar33.a();
                    vc.s.j(bVarA3);
                    return new yi1.a(new ugc.a(bVarA3), new yi1.e());
                }
                if (i100 == 1) {
                    vh1.d dVar3 = (vh1.d) aVar33.f184283g.get();
                    vc.s.j(dVar3);
                    return new xh1.a(dVar3, (x7a.d) eVar6.f313710g.get(), new vi1.i());
                }
                if (i100 != 2) {
                    throw new AssertionError(i100);
                }
                rh1.b bVarA4 = aVar33.a();
                vc.s.j(bVarA4);
                return new vi1.p(bVarA4);
            case 17:
                yh3.b bVar9 = (yh3.b) this.f308421c;
                a31.a aVar34 = bVar9.f313739h;
                a31.a aVar35 = bVar9.d;
                a31.a aVar36 = bVar9.f313740j;
                q qVar2 = bVar9.f313735a;
                int i101 = this.f308420b;
                if (i101 == 0) {
                    return new bi3.a(bVar9.f313736b, bVar9.f313737c, aVar35, bVar9.e, bVar9.f, bVar9.f313738g, aVar34, bVar9.i, aVar36, bVar9.k, qVar2);
                }
                if (i101 == 1) {
                    return agk.b.e(qVar2, aVar36, bVar9.f313743n, aVar35, aVar34, bVar9.f313741l);
                }
                if (i101 == 2) {
                    return yf6.b.w((bi3.a) bVar9.f313742m.get());
                }
                throw new AssertionError(i101);
            case 18:
                yha.a aVar37 = (yha.a) this.f308421c;
                int i102 = this.f308420b;
                switch (i102) {
                    case 0:
                        vha.s sVarD2 = aVar37.d();
                        usg.a aVar38 = aVar37.f313889c;
                        vha.v0 v0Var = new vha.v0(aVar37.d(), aVar38.a(), new mce.a());
                        vha.t0 t0VarE = aVar37.e();
                        gr6.h hVarK = aVar37.f313888b.k();
                        vc.s.j(hVarK);
                        d1 d1Var = new d1(hVarK);
                        cia.a aVar39 = (cia.a) aVar37.f313898r.get();
                        p56.a aVar40 = new p56.a(aVar37.f313891h.f());
                        n nVarB2 = aVar38.b();
                        x79.a aVarA5 = aVar37.k.a();
                        vc.s.j(aVarA5);
                        return new vha.i(sVarD2, v0Var, t0VarE, d1Var, aVar39, aVar40, nVarB2, aVarA5, aVar37.i.d());
                    case 1:
                        vha.s sVarD3 = aVar37.d();
                        vha.v0 v0Var2 = new vha.v0(aVar37.d(), aVar37.f313889c.a(), new mce.a());
                        mt8.d dVarB2 = aVar37.d.b();
                        vc.s.j(dVarB2);
                        jr6.r rVar = (jr6.r) aVar37.f313888b.X0.get();
                        vc.s.j(rVar);
                        o oVarC = aVar37.e.c();
                        vc.s.j(oVarC);
                        return new cia.e(sVarD3, v0Var2, dVarB2, rVar, oVarC);
                    case 2:
                        vs6.a aVar41 = aVar37.f;
                        vs6.a aVar42 = aVar37.f;
                        oda.d dVar4 = aVar37.f313891h;
                        us6.q qVar3 = aVar37.f313888b;
                        et6.h hVar = (et6.h) aVar41.f291729t.get();
                        vc.s.j(hVar);
                        k3 k3Var = (k3) qVar3.f282688k1.get();
                        vc.s.j(k3Var);
                        rea.m mVarF = dVar4.f();
                        vha.s sVarD4 = aVar37.d();
                        jf1.a aVarA6 = aVar37.f313890g.a();
                        vc.s.j(aVarA6);
                        jr6.h hVar2 = (jr6.h) qVar3.Y0.get();
                        vc.s.j(hVar2);
                        hr6.l lVarL = qVar3.l();
                        vc.s.j(lVarL);
                        jr6.m mVarM = qVar3.m();
                        vc.s.j(mVarM);
                        jr6.r rVar2 = (jr6.r) qVar3.X0.get();
                        vc.s.j(rVar2);
                        tha.a aVar43 = (tha.a) aVar37.f313900t.get();
                        sha.c cVar4 = (sha.c) aVar37.u.get();
                        oqk.l lVarB = aVar37.e.b();
                        vc.s.j(lVarB);
                        jr6.o oVar = (jr6.o) qVar3.O0.get();
                        vc.s.j(oVar);
                        cfa.h hVar3 = new cfa.h();
                        cfa.e eVarD = dVar4.d();
                        gr6.m mVarB = aVar42.b();
                        vc.s.j(mVarB);
                        gr6.a aVarA7 = aVar42.a();
                        vc.s.j(aVarA7);
                        xea.c cVarD = aVar37.f313894m.d();
                        kbb.c cVarB2 = aVar37.i.b();
                        l80.e eVarH3 = aVar37.f313895n.h();
                        vc.s.j(eVarH3);
                        gte.a aVarB5 = aVar37.o.b();
                        vc.s.j(aVarB5);
                        return new vha.j(hVar, k3Var, mVarF, sVarD4, aVarA6, hVar2, lVarL, mVarM, rVar2, aVar43, cVar4, lVarB, oVar, hVar3, eVarD, mVarB, aVarA7, cVarD, cVarB2, eVarH3, aVarB5);
                    case 3:
                        hr6.l lVarL2 = aVar37.f313888b.l();
                        vc.s.j(lVarL2);
                        bVar = new aia.b(lVarL2, new zjh.j((p1) aVar37.f313888b.f282705s1.get()));
                        break;
                    case 4:
                        gr6.a aVarA8 = aVar37.f.a();
                        vc.s.j(aVarA8);
                        hr6.l lVarL3 = aVar37.f313888b.l();
                        vc.s.j(lVarL3);
                        bVar = new zha.d(aVarA8, lVarL3);
                        break;
                    case 5:
                        x79.a aVarA9 = aVar37.k.a();
                        vc.s.j(aVarA9);
                        bVar = new h1(aVarA9, aVar37.d(), aVar37.e(), aVar37.i.d());
                        break;
                    case 6:
                        return aVar37.f313891h.d();
                    case 7:
                        gr6.e eVarA3 = aVar37.f313887a.a();
                        vc.s.j(eVarA3);
                        bVar = new k1(eVarA3);
                        break;
                    case 8:
                        gr6.a aVarA10 = aVar37.f.a();
                        vc.s.j(aVarA10);
                        vha.s sVarD5 = aVar37.d();
                        sha.c cVar5 = (sha.c) aVar37.u.get();
                        gte.a aVarB6 = aVar37.o.b();
                        vc.s.j(aVarB6);
                        bVar = new vha.y0(aVarA10, sVarD5, cVar5, aVarB6);
                        break;
                    case 9:
                        w wVarQ = aVar37.f313888b.q();
                        vc.s.j(wVarQ);
                        bVar = new aia.c(wVarQ);
                        break;
                    case 10:
                        bVar = new eia.a(aVar37.d());
                        break;
                    case 11:
                        gr6.e eVarA4 = aVar37.f313887a.a();
                        vc.s.j(eVarA4);
                        gr6.h hVarK2 = aVar37.f313888b.k();
                        vc.s.j(hVarK2);
                        bVar = new dia.f(eVarA4, hVarK2);
                        break;
                    case 12:
                        g6e.b bVarA5 = aVar37.f313897q.a();
                        vc.s.j(bVarA5);
                        bVar = new dia.a(bVarA5);
                        break;
                    case 13:
                        return new dia.c();
                    default:
                        throw new AssertionError(i102);
                }
                return bVar;
            case 19:
                yj3.a aVar44 = (yj3.a) this.f308421c;
                int i103 = this.f308420b;
                if (i103 == 0) {
                    tj3.a aVar45 = (tj3.a) aVar44.f314403l.get();
                    sj3.a aVar46 = (sj3.a) aVar44.f314404m.get();
                    sri.m mVarD = ((g8b.a) aVar44.f314401h).d();
                    vc.s.j(mVarD);
                    cVar = new bk3.c(aVar45, aVar46, mVarD);
                } else {
                    if (i103 != 1) {
                        if (i103 != 2) {
                            if (i103 == 3) {
                                return new ak3.b();
                            }
                            throw new AssertionError(i103);
                        }
                        hkh.a aVarA11 = aVar44.f314399c.a();
                        ang.f fVarE = aVar44.d.e();
                        r0 r0VarA2 = aVar44.e.a();
                        qka.c cVarB3 = ((ika.b) aVar44.f).b();
                        gte.a aVarB7 = aVar44.f314400g.b();
                        vc.s.j(aVarB7);
                        return new wj3.a(aVarA11, fVarE, r0VarA2, cVarB3, aVarB7);
                    }
                    pre.c cVarA = aVar44.f314397a.a();
                    vc.s.j(cVarA);
                    xoj.a aVarA12 = aVar44.f314398b.a();
                    vc.s.j(aVarA12);
                    cVar = new zj3.a(cVarA, aVarA12);
                }
                return cVar;
            case 20:
                yj4.b bVar10 = (yj4.b) this.f308421c;
                int i104 = this.f308420b;
                if (i104 == 0) {
                    return new uj4.a();
                }
                if (i104 == 1) {
                    return new dk4.b();
                }
                if (i104 != 2) {
                    if (i104 == 3) {
                        return new dk4.a();
                    }
                    throw new AssertionError(i104);
                }
                n nVarB3 = bVar10.f314410a.b();
                je6.h hVarC = ((xf6.t) bVar10.f314411b).c();
                vc.s.j(hVarC);
                return new hk4.b(nVarB3, hVarC);
            case 21:
                yk9.a aVar47 = (yk9.a) this.f308421c;
                oi9.f fVar3 = aVar47.f314598b;
                int i105 = this.f308420b;
                if (i105 != 0) {
                    if (i105 == 1) {
                        return yf6.b.m(aVar47.f314597a);
                    }
                    throw new AssertionError(i105);
                }
                sri.m mVar = (sri.m) aVar47.d.get();
                an4.i iVar3 = new an4.i(fVar3.o());
                ti9.h hVarB = fVar3.b();
                qi9.d dVarO = fVar3.o();
                xh9.a aVarE = fVar3.e();
                vc.s.j(aVarE);
                gte.a aVarB8 = aVar47.f314599c.b();
                vc.s.j(aVarB8);
                return new zk9.c(mVar, iVar3, hVarB, dVarO, aVarE, aVarB8);
            case 22:
                return a();
            case 23:
                yre.e eVar7 = (yre.e) this.f308421c;
                int i106 = this.f308420b;
                if (i106 == 0) {
                    return new xre.b();
                }
                if (i106 != 1) {
                    throw new AssertionError(i106);
                }
                q06.d dVarA = eVar7.f316294a.a();
                vc.s.j(dVarA);
                b90.a aVarA13 = eVar7.f316295b.a();
                vc.s.j(aVarA13);
                zm0.c cVarJ = eVar7.f316296c.j();
                vc.s.j(cVarJ);
                return new lhi.e0(dVarA, aVarA13, cVarJ);
            case 24:
                ysc.a aVar48 = (ysc.a) this.f308421c;
                int i107 = this.f308420b;
                if (i107 == 0) {
                    a androidScreenshotDetectorProvider = aVar48.d;
                    Intrinsics.checkNotNullParameter(androidScreenshotDetectorProvider, "androidScreenshotDetectorProvider");
                    dfm.c screenshotDetectorProvider = new dfm.c(18);
                    ysc.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(screenshotDetectorProvider, "screenshotDetectorProvider");
                    return Build.VERSION.SDK_INT > 33 ? (wsc.a) androidScreenshotDetectorProvider.get() : wsc.e.f299702a;
                }
                if (i107 != 1) {
                    if (i107 == 2) {
                        return new wsc.g();
                    }
                    throw new AssertionError(i107);
                }
                Context context = aVar48.f316447a;
                CoroutineScope coroutineScopeA = aVar48.f316448b.a();
                vc.s.j(coroutineScopeA);
                return new wsc.d(context, coroutineScopeA, (wsc.g) aVar48.f316449c.get());
            case 25:
                return b();
            case 26:
                yxf.a aVar49 = (yxf.a) this.f308421c;
                a31.a aVar50 = aVar49.f317680g;
                q qVar4 = aVar49.f317677a;
                int i108 = this.f308420b;
                if (i108 == 0) {
                    return new a96.i(qVar4, aVar49.f317678b, aVar49.f317679c, aVar49.d, aVar49.e, aVar49.f, aVar50, 12);
                }
                if (i108 == 1) {
                    return new cxj.c(qVar4, aVar50, 10);
                }
                throw new AssertionError(i108);
            case 27:
                return c();
            case 28:
                return d();
            default:
                o0 o0Var = (o0) this.f308421c;
                ee0.a aVar51 = o0Var.f318425b;
                an0.c cVar6 = o0Var.f318426c;
                int i109 = this.f308420b;
                switch (i109) {
                    case 0:
                        uVar = new u((m0g.a) o0Var.o.get(), o0Var.d.b(), (hyf.a) o0Var.f318433p.get());
                        break;
                    case 1:
                        uVar = new m0g.g((TravelExperiencesService) o0Var.k.get(), (ne0.j) o0Var.f318430l.get(), (ne0.j) o0Var.f318431m.get(), (ue0.c) o0Var.f318432n.get());
                        break;
                    case 2:
                        return u0.a(((nj0.d) o0Var.f318424a).f());
                    case 3:
                        return new ne0.d();
                    case 4:
                        return c1.a();
                    case 5:
                        je0.d dVarB3 = aVar51.b();
                        vc.s.j(dVarB3);
                        yk0.a aVarB9 = cVar6.b();
                        vc.s.j(aVarB9);
                        xe0.f fVarF2 = aVar51.f();
                        vc.s.j(fVarF2);
                        return yf6.b.e(dVarB3, fVarF2, aVarB9);
                    case 6:
                        xoj.a aVarA14 = o0Var.e.a();
                        vc.s.j(aVarA14);
                        eub.a aVarA15 = o0Var.f.a();
                        vc.s.j(aVarA15);
                        gte.a aVarB10 = o0Var.f318427g.b();
                        vc.s.j(aVarB10);
                        uVar = new c1g.m(aVarA15, aVarB10, aVarA14);
                        break;
                    case 7:
                        Context context2 = o0Var.i;
                        yk0.a aVarB11 = cVar6.b();
                        vc.s.j(aVarB11);
                        de0.a aVarA16 = ((cl0.a) o0Var.f318429j).a();
                        vc.s.j(aVarA16);
                        return yf6.b.j(context2, aVarB11, aVarA16);
                    default:
                        throw new AssertionError(i109);
                }
                return uVar;
        }
    }
}
