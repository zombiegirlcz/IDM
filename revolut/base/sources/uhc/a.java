package uhc;

import android.content.Context;
import androidx.room.migration.Migration;
import atg.l;
import au6.a2;
import au6.b2;
import au6.d0;
import au6.e0;
import au6.k1;
import au6.k2;
import au6.l0;
import au6.m2;
import au6.n1;
import au6.o2;
import au6.q2;
import au6.r1;
import au6.s1;
import au6.u1;
import au6.v0;
import au6.v1;
import au6.z1;
import com.feature.user.details.impl.network.UserDetailsService;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.contacts.impl.data.database.ContactsDatabase;
import com.revolut.feature.contacts.impl.data.network.UserService;
import com.revolut.feature.credit.loan.impl.database.LoanDatabase;
import com.revolut.feature.credit.loan.impl.network.LoanProductService;
import com.revolut.feature.credit.loan.impl.network.LoanRepaymentsService;
import com.revolut.feature.credit.loan.impl.network.LoanServiceLegacy;
import com.revolut.feature.credit.loan.impl.network.LoanStatementsService;
import com.revolut.feature.freelancer.impl.database.FreelancerDatabase;
import com.revolut.feature.freelancer.impl.network.services.AcquiringOrdersService;
import com.revolut.feature.freelancer.impl.network.services.AcquiringPaymentsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerAccountService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerBrandingService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCashbackService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCustomersService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerInvoiceService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerLearnLessonsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerOnboardingService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerPartnerService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerPaymentsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerProTrackService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerProductArticleService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerPromptService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerSettingsFeaturesService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerSettingsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerSettlementService;
import com.revolut.feature.junior_referrals.impl.services.JuniorReferralsService;
import com.revolut.feature.payments.impl.interactor.qr.QrCodeService;
import com.revolut.feature.profile.notificationsettings.impl.network.NotificationSettingsService;
import com.revolut.feature.security_hub.impl.network.LinkedWalletsService;
import com.revolut.feature.security_hub.impl.network.SecurityHubChecklistService;
import com.revolut.feature.security_hub.impl.network.SecurityHubService;
import com.revolut.feature.wallets.impl.network.WalletsService;
import e4m.e;
import et6.a3;
import et6.b4;
import et6.c1;
import et6.d2;
import et6.h1;
import et6.h3;
import et6.i2;
import et6.l2;
import et6.n0;
import et6.p1;
import et6.q1;
import et6.x2;
import et6.y0;
import et6.y1;
import et6.y2;
import et6.y3;
import is6.y;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kyk.a0;
import kyk.x;
import kyk.z;
import m6i.h0;
import mn8.b0;
import nx4.r;
import o55.f0;
import o55.j0;
import o55.q;
import o55.w;
import om4.k0;
import qgk.k3;
import r7i.p;
import r7i.u;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tnb.g0;
import ts6.s0;
import ts6.t0;
import ts6.z0;
import us6.e2;
import us6.f3;
import us6.g3;
import us6.i3;
import us6.j3;
import us6.l3;
import us6.m3;
import us6.n3;
import us6.o3;
import us6.p3;
import us6.r3;
import us6.u3;
import us6.v3;
import us6.w3;
import v0i.f;
import v8k.m;
import vc.s;
import vie.h;
import vtc.o0;
import vtc.p0;
import vtc.t;
import vxc.j;
import wtc.a1;
import wtc.b1;
import wtc.e1;
import wtc.q0;
import wtc.u0;
import x0i.g;
import y45.i;
import y45.k;
import y45.n;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f280201c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f280199a = i2;
        this.f280201c = obj2;
        this.f280200b = i;
    }

    private final Object a() {
        uxc.a aVar = (uxc.a) this.f280201c;
        a31.a aVar2 = aVar.f;
        a31.a aVar3 = aVar.f283970c;
        int i = this.f280200b;
        if (i == 0) {
            return new j(aVar.f283968a, aVar.f283969b, aVar3, aVar.d, aVar.e, aVar2, aVar.f283971g, aVar.f283972h);
        }
        if (i == 1) {
            return p0.c(aVar3, aVar.k, aVar2, aVar.i);
        }
        if (i == 2) {
            return w3.y((j) aVar.f283973j.get());
        }
        throw new AssertionError(i);
    }

    private final Object b() {
        uxk.a aVar = (uxk.a) this.f280201c;
        a31.a aVar2 = aVar.o;
        int i = this.f280200b;
        if (i == 0) {
            return new a0(aVar.f284015a, aVar.f284016b, aVar.f284017c, aVar.d, aVar.e, aVar.f, aVar.f284018g, aVar.f284019h, aVar.i, aVar.f284020j, aVar.k, aVar.f284021l, aVar.f284022m, aVar.f284023n, aVar.G, aVar.f284025q, aVar.f284026r, aVar.f284027s, aVar.f284028t, aVar2, aVar.u, aVar.v, aVar.f284029w, aVar.f284030x, aVar.f284031y);
        }
        if (i == 1) {
            x xVar = (x) ((z) aVar.F.get()).b();
            s.k(xVar);
            return xVar;
        }
        if (i == 2) {
            return new z(aVar2, aVar.f284024p);
        }
        if (i == 3) {
            return qyk.b.a();
        }
        if (i == 4) {
            return w3.C((a0) aVar.H.get());
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        v0i.b bVar = (v0i.b) this.f280201c;
        int i = this.f280200b;
        if (i == 0) {
            return new g(new c1i.g(w3.k(bVar.f284857a, ((nj0.d) bVar.f284858b).f()), bVar.b()));
        }
        if (i == 1) {
            return new b1i.a();
        }
        if (i == 2) {
            return w3.n(bVar.f284867q);
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        f fVar = (f) this.f280201c;
        a31.a aVar = fVar.k;
        a31.a aVar2 = fVar.f284890l;
        a31.a aVar3 = fVar.f284888h;
        a31.a aVar4 = fVar.f284889j;
        a31.a aVar5 = fVar.f284891m;
        a31.a aVar6 = fVar.f;
        a31.a aVar7 = fVar.f284892n;
        int i = this.f280200b;
        if (i == 0) {
            return new v0i.g(fVar.f284884a, fVar.f284885b, fVar.f284886c, fVar.d, fVar.e, aVar6, fVar.f284887g, aVar3, fVar.i, aVar4, aVar, aVar2, aVar5, aVar7, fVar.o, fVar.f284893p, fVar.f284894q, fVar.f284895r);
        }
        if (i == 1) {
            return f0k.d.a(aVar7, aVar6, fVar.v, fVar.f284896s, aVar5, aVar4, aVar3, aVar2, aVar, fVar.f284897t);
        }
        if (i == 2) {
            return w3.z((v0i.g) fVar.u.get());
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        v45.a aVar = (v45.a) this.f280201c;
        int i = this.f280200b;
        switch (i) {
            case 0:
                return new i((o55.j) aVar.f285977t.get());
            case 1:
                String str = aVar.f285964a;
                w45.a aVar2 = aVar.d;
                return new q(str, (LoanProductService) aVar.f285973p.get(), w40.c.z(aVar2, (ue0.c) aVar.f285974q.get()), w40.c.y(aVar2, new ne0.d()), (n45.c) aVar.f285976s.get(), new c55.s(((nj0.d) aVar.f285968h).f216295c));
            case 2:
                w45.b bVar = aVar.f285965b;
                LoanProductService loanProductService = (LoanProductService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar.o.get(), "retrofit", LoanProductService.class, "create(...)");
                s.k(loanProductService);
                return loanProductService;
            case 3:
                w45.b bVar2 = aVar.f285965b;
                Retrofit retrofitJ = ((c21.b) aVar.f285966c).j();
                s.j(retrofitJ);
                o oVar = (o) aVar.f285972n.get();
                Retrofit.Builder builderX = p.a.x(retrofitJ, "retrofit", oVar, "gson");
                builderX.converterFactories().clear();
                Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 4:
                o gson = ((c21.b) aVar.f285966c).h();
                s.j(gson);
                w45.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                return h55.a.a(gson);
            case 5:
                le0.b bVarC = aVar.e.c();
                s.j(bVarC);
                o oVarA = fe0.c.a();
                yk0.a aVarB = aVar.f.b();
                s.j(aVarB);
                xe0.f fVarF = aVar.e.f();
                s.j(fVarF);
                return w40.c.i(oVarA, bVarC, fVarF, aVarB);
            case 6:
                return w40.c.o((LoanDatabase) aVar.f285975r.get());
            case 7:
                Context context = aVar.f285967g;
                yk0.a aVarB2 = aVar.f.b();
                s.j(aVarB2);
                return w40.c.k(context, aVarB2, ((c21.b) aVar.f285966c).b());
            case 8:
                return new k((j0) aVar.z.get());
            case 9:
                return new j0((LoanStatementsService) aVar.v.get(), (ne0.j) aVar.f285978w.get(), (n45.e) aVar.f285979x.get(), (n45.f) aVar.f285980y.get(), ((nj0.d) aVar.f285968h).f216295c);
            case 10:
                return w40.c.q(aVar.f285965b, (Retrofit) aVar.o.get());
            case 11:
                return new ne0.d();
            case 12:
                return w40.c.w((LoanDatabase) aVar.f285975r.get());
            case 13:
                return w40.c.C((LoanDatabase) aVar.f285975r.get());
            case 14:
                return new f0(aVar.f285964a, (LoanServiceLegacy) aVar.B.get(), (ne0.j) aVar.f285978w.get(), w40.c.y(aVar.d, new ne0.d()), (n45.c) aVar.f285976s.get(), (ue0.c) aVar.f285974q.get());
            case 15:
                w45.b bVar3 = aVar.f285965b;
                LoanServiceLegacy loanServiceLegacy = (LoanServiceLegacy) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar.o.get(), "retrofit", LoanServiceLegacy.class, "create(...)");
                s.k(loanServiceLegacy);
                return loanServiceLegacy;
            case 16:
                e eVar = aVar.u;
                uq3.b bVar4 = aVar.i;
                i iVar = (i) eVar.get();
                xq3.j jVarG = bVar4.g();
                s.j(jVarG);
                up3.b bVarI = bVar4.i();
                s.j(bVarI);
                h hVarA = aVar.f285969j.a();
                s.j(hVarA);
                return new y45.h(iVar, jVarG, bVarI, hVarA);
            case 17:
                i iVar2 = (i) aVar.u.get();
                xoj.a aVarA = aVar.k.a();
                s.j(aVarA);
                xq3.j jVarG2 = aVar.i.g();
                s.j(jVarG2);
                return new n(iVar2, aVarA, jVarG2);
            case 18:
                i iVar3 = (i) aVar.u.get();
                xoj.a aVarA2 = aVar.k.a();
                s.j(aVarA2);
                xq3.j jVarG3 = aVar.i.g();
                s.j(jVarG3);
                return new y45.o(iVar3, aVarA2, jVarG3);
            case 19:
                i iVar4 = (i) aVar.u.get();
                up3.b bVarI2 = aVar.i.i();
                s.j(bVarI2);
                return new y45.a(iVar4, bVarI2);
            case 20:
                return new y45.j((w) aVar.J.get(), (i) aVar.u.get());
            case 21:
                LoanRepaymentsService loanRepaymentsService = (LoanRepaymentsService) aVar.H.get();
                xx4.d dVarY = w40.c.y(aVar.d, new ne0.d());
                n45.d dVar = (n45.d) aVar.I.get();
                d55.g gVar = new d55.g(new r());
                l lVar = (l) aVar.f285970l.k.get();
                s.j(lVar);
                return new w(loanRepaymentsService, dVarY, dVar, gVar, lVar);
            case 22:
                w45.b bVar5 = aVar.f285965b;
                LoanRepaymentsService loanRepaymentsService2 = (LoanRepaymentsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar.o.get(), "retrofit", LoanRepaymentsService.class, "create(...)");
                s.k(loanRepaymentsService2);
                return loanRepaymentsService2;
            case 23:
                return w40.c.p((LoanDatabase) aVar.f285975r.get());
            case 24:
                gte.a aVarB3 = aVar.f285971m.b();
                s.j(aVarB3);
                return new y45.q(aVarB3);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        v7i.a aVar = (v7i.a) this.f280201c;
        g2j.f fVar = aVar.f286669r;
        us6.q qVar = aVar.f286668q;
        q8b.a aVar2 = aVar.f286672w;
        ite.a aVar3 = aVar.k;
        int i = this.f280200b;
        if (i == 0) {
            h6i.o oVarH = aVar.h();
            k6i.k kVarJ = aVar.j();
            o6i.f fVarK = aVar.k();
            ppg.b bVarB = ((wpg.l) aVar.d).b();
            s.j(bVarB);
            n6i.x xVar = new n6i.x(bVarB, aVar.i());
            djb.n nVarA = aVar.f286661g.a();
            s.j(nVarA);
            n6i.s sVar = new n6i.s(nVarA);
            wsg.n nVarB = aVar.f286658a.b();
            h1 h1VarN = qVar.n();
            s.j(h1VarN);
            w5i.c cVar = (w5i.c) aVar.D.get();
            w5i.a aVar4 = (w5i.a) aVar.A.get();
            aVar.f286667p.a();
            n6i.h hVar = new n6i.h();
            ta7.a aVar5 = aVar.f286673x;
            h0 h0Var = new h0(oVarH, kVarJ, fVarK, xVar, sVar, nVarB, h1VarN, cVar, aVar4, hVar, aVar5.d(), aVar5.f());
            n8b.a aVarA = aVar2.a();
            s.j(aVarA);
            return new c8i.x(h0Var, aVarA);
        }
        if (i == 1) {
            m2j.j jVarC = fVar.c();
            kdh.b bVar = new kdh.b(fVar.f140104y.a(), fVar.e.b());
            w5i.b bVar2 = (w5i.b) aVar.C.get();
            r7i.a0 a0VarM = aVar.m();
            ou5.b bVarL = aVar.l();
            r7i.s sVarF = aVar.f();
            g8i.a aVarN = aVar.n();
            n8b.a aVarA2 = aVar2.a();
            s.j(aVarA2);
            c8i.n nVar = new c8i.n(aVarA2, 0);
            p pVarE = aVar.e();
            h6i.o oVarH2 = aVar.h();
            n7i.j0 j0Var = new n7i.j0((w5i.b) aVar.C.get());
            n8b.a aVarA3 = aVar2.a();
            s.j(aVarA3);
            k7i.i iVar = new k7i.i(oVarH2, new u(j0Var, new c8i.n(aVarA3, 0)));
            gte.a aVarB = aVar3.b();
            s.j(aVarB);
            return new c8i.s(jVarC, bVar, bVar2, a0VarM, bVarL, sVarF, aVarN, nVar, pVarE, iVar, aVarB);
        }
        if (i == 2) {
            h1 h1VarN2 = qVar.n();
            s.j(h1VarN2);
            ldi.f fVarA = aVar.f286660c.a();
            s.j(fVarA);
            c8i.a aVar6 = (c8i.a) aVar.B.get();
            r7i.s sVarF2 = aVar.f();
            g8i.a aVarN2 = aVar.n();
            r7i.g gVar = new r7i.g();
            r7i.a0 a0VarM2 = aVar.m();
            ou5.b bVarL2 = aVar.l();
            p pVarE2 = aVar.e();
            tj3.a aVarA4 = aVar.v.a();
            s.j(aVarA4);
            k18.c cVar2 = new k18.c(aVarA4);
            k0 k0VarQ = aVar.f286666n.q();
            s.j(k0VarQ);
            return new n7i.s(h1VarN2, fVarA, aVar6, sVarF2, aVarN2, gVar, a0VarM2, bVarL2, pVarE2, cVar2, new r7i.f(k0VarQ), new kbb.c(aVar.e.a(), aVar.i(), aVar.f.i()), new r7i.w(), new r7i.h());
        }
        if (i == 3) {
            w5i.a aVar7 = (w5i.a) aVar.A.get();
            gte.a aVarB2 = aVar3.b();
            s.j(aVarB2);
            gte.a aVarB3 = aVar3.b();
            s.j(aVarB3);
            return new c8i.b(aVar7, aVarB2, new c8i.h0(aVarB3));
        }
        if (i == 4) {
            gte.a aVarB4 = aVar3.b();
            s.j(aVarB4);
            return new n7i.a(aVarB4, new r7i.w(), new r7i.h());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        o7.b bVarA = aVar.f286674y.a();
        gte.a aVarB5 = aVar3.b();
        s.j(aVarB5);
        n6i.b bVar3 = new n6i.b();
        rga.c cVarB = aVar.z.b();
        s.j(cVarB);
        return new c8i.z(bVarA, aVarB5, bVar3, cVarB);
    }

    private final Object g() {
        v8k.b bVar = (v8k.b) this.f280201c;
        a31.a aVar = bVar.f286794t;
        a31.a aVar2 = bVar.f286788m;
        a31.a aVar3 = bVar.u;
        a31.a aVar4 = bVar.f286795w;
        a31.a aVar5 = bVar.f286792r;
        a31.a aVar6 = bVar.f286783g;
        a31.a aVar7 = bVar.f286786j;
        a31.a aVar8 = bVar.f286796x;
        a31.a aVar9 = bVar.i;
        a31.a aVar10 = bVar.f286793s;
        a31.a aVar11 = bVar.I;
        a31.a aVar12 = bVar.H;
        a31.a aVar13 = bVar.f286791q;
        a31.a aVar14 = bVar.f286790p;
        a31.a aVar15 = bVar.o;
        a31.a aVar16 = bVar.f286789n;
        a31.a aVar17 = bVar.f286787l;
        a31.a aVar18 = bVar.k;
        a31.a aVar19 = bVar.f286784h;
        a31.a aVar20 = bVar.e;
        a31.a aVar21 = bVar.d;
        a31.a aVar22 = bVar.f286776a;
        int i = this.f280200b;
        if (i == 0) {
            return new v8k.j(aVar22, bVar.f286778b, bVar.f286780c, aVar21, aVar20, bVar.f, aVar6);
        }
        if (i == 1) {
            return new b0(aVar22, aVar19, aVar21, aVar20, aVar9, aVar7, aVar18, aVar17, aVar2, aVar16, aVar15, aVar14, aVar13, bVar.f0, aVar5, aVar10, aVar, aVar3, bVar.v, aVar4, aVar8, bVar.f286797y);
        }
        if (i == 2) {
            return w3.A((v8k.j) bVar.f286782e0.get());
        }
        if (i == 3) {
            return new ske.e(aVar22, aVar10, bVar.z, aVar16, aVar9, aVar14, bVar.A, bVar.B, aVar8, aVar18, aVar19, bVar.C, bVar.D, aVar7, aVar13, bVar.f0, bVar.i0, bVar.J, bVar.K, aVar6, aVar5, aVar4, aVar17, aVar3, bVar.L, aVar2, aVar11, bVar.M, aVar21, bVar.N, aVar20, bVar.O, aVar, bVar.v, bVar.P, bVar.Q, bVar.R, bVar.S, bVar.T, bVar.f286797y, bVar.U, bVar.V, bVar.W, bVar.X, bVar.Y, aVar15, aVar12, bVar.Z, bVar.f286777a0, bVar.f286779b0, bVar.c0, bVar.f286781d0);
        }
        if (i == 4) {
            return w3.B((m) bVar.f286785h0.get());
        }
        if (i == 5) {
            return new m(aVar22, aVar19, aVar21, aVar20, aVar18, aVar17, aVar16, aVar15, aVar14, aVar13, bVar.E, bVar.F, bVar.G, aVar12, aVar11);
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        va.a aVar = (va.a) this.f280201c;
        ee0.a aVar2 = aVar.e;
        int i = this.f280200b;
        switch (i) {
            case 0:
                jvh.a aVarA = aVar.f287081a.a();
                s.j(aVarA);
                return new wa.a(aVarA);
            case 1:
                return new xa.b((sri.m) aVar.f287093s.get(), (pa.a) aVar.f287092r.get());
            case 2:
                return va.g.w(aVar.f287083c);
            case 3:
                return new bb.b((ue0.c) aVar.u.get(), (cb.a) aVar.v.get(), (UserDetailsService) aVar.f287095w.get(), (ne0.j) aVar.f287096x.get());
            case 4:
                je0.d dVarB = aVar2.b();
                s.j(dVarB);
                yk0.a aVarB = aVar.f.b();
                s.j(aVarB);
                xe0.f fVarF = aVar2.f();
                s.j(fVarF);
                return va.g.A(dVarB, aVarB, fVarF);
            case 5:
                return new cb.a();
            case 6:
                return va.g.B(((nj0.d) aVar.f287084g).f());
            case 7:
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        vak.a aVar = (vak.a) this.f280201c;
        a31.a aVar2 = aVar.d;
        int i = this.f280200b;
        if (i == 0) {
            return new es8.b(aVar.f287321a, aVar.f287322b, aVar.f287323c, aVar2, aVar.e, aVar.f, 5);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        return w40.c.a(aVar2, aVar.f287325h, aVar.i, aVar.f287326j, aVar.k, aVar.f287327l, aVar.f287324g);
    }

    private final Object j() {
        vbb.a aVar = (vbb.a) this.f280201c;
        int i = this.f280200b;
        switch (i) {
            case 0:
                return ((h30.n) aVar.f287453a).n();
            case 1:
                return new rg8.d(aVar.f287455b.b());
            case 2:
                jk8.a aVar2 = (jk8.a) aVar.f287457c;
                xoj.a aVarA = aVar2.f175125c.a();
                s.j(aVarA);
                return new mk8.d(new jx0.a(aVarA, aVar2.a()), aVar2.f.e());
            case 3:
                return aVar.d.a();
            case 4:
                s6k.b bVar = (s6k.b) aVar.e;
                vv9.c cVar = (vv9.c) bVar.A.get();
                vv9.a aVar3 = (vv9.a) bVar.C.get();
                vv9.a aVar4 = (vv9.a) bVar.C.get();
                vv9.b bVar2 = (vv9.b) bVar.D.get();
                wv9.c cVar2 = (wv9.c) bVar.E.get();
                utf.a aVarA2 = bVar.f260383p.a();
                s.j(aVarA2);
                ite.a aVar5 = bVar.k;
                gte.a aVarB = aVar5.b();
                s.j(aVarB);
                pqi.a aVar6 = bVar.f260385r;
                q6k.c cVar3 = new q6k.c(aVar4, bVar2, cVar2, aVarA2, aVarB, aVar6.e(), aVar6.g());
                q6k.e eVar = new q6k.e((wv9.c) bVar.E.get(), new q6k.f((wv9.c) bVar.E.get()));
                wv9.c cVar4 = (wv9.c) bVar.E.get();
                gte.a aVarB2 = aVar5.b();
                s.j(aVarB2);
                return new p6k.c(cVar, aVar3, new p6k.e(cVar3, eVar, new r6k.a(cVar4, aVarB2, aVar6.e()), new r6k.b()), bVar.f260386s.a(), bVar.f260377g.c(), bVar.f260375b.e());
            case 5:
                q7k.c cVar5 = aVar.f;
                k61.a aVarE = cVar5.f242872a.e();
                s.j(aVarE);
                t7k.a aVar7 = new t7k.a();
                pqi.a aVar8 = cVar5.f242874c;
                return new s7k.d(aVarE, aVar7, new l7k.d(aVar8.e(), aVar8.g()), new u7k.n(new u7k.q()));
            case 6:
                i38.a aVar9 = (i38.a) ((q38.b) aVar.f287460g).J.get();
                s.j(aVar9);
                return aVar9;
            case 7:
                g6e.e eVar2 = (g6e.e) aVar.f287461h.W.get();
                s.j(eVar2);
                return eVar2;
            case 8:
                fqk.a aVar10 = aVar.i;
                usg.a aVar11 = aVar10.u;
                qsi.b bVar3 = (qsi.b) aVar10.f137291y.get();
                djf.c cVar6 = aVar10.f137280j;
                thf.m mVarG = cVar6.g();
                s.j(mVarG);
                thf.d dVarD = cVar6.d();
                s.j(dVarD);
                return new hqk.d(bVar3, new iqk.c(new iqk.h(mVarG, dVarD), new iqk.f(aVar11.b(), new f73.c())), (iqk.d) aVar10.F.get(), aVar11.b());
            case 9:
                p58.a aVar12 = (p58.a) aVar.f287463j.f319541s.get();
                s.j(aVar12);
                return aVar12;
            case 10:
                td8.a aVar13 = (td8.a) aVar.k.f321331p.get();
                s.j(aVar13);
                return aVar13;
            case 11:
                td8.b bVar4 = (td8.b) aVar.k.f321332q.get();
                s.j(bVar4);
                return bVar4;
            case 12:
                s68.a aVarN = ((k78.b) aVar.f287464l).n();
                s.j(aVarN);
                return aVarN;
            case 13:
                hc8.a aVar14 = (hc8.a) aVar.f287465m.o.get();
                s.j(aVar14);
                return aVar14;
            case 14:
                xm8.a aVar15 = (xm8.a) aVar.f287466n.f323396m.get();
                s.j(aVar15);
                return aVar15;
            case 15:
                uc8.a aVar16 = (uc8.a) aVar.o.f173014w.get();
                s.j(aVar16);
                return aVar16;
            case 16:
                uc8.b bVar5 = (uc8.b) aVar.o.f173015x.get();
                s.j(bVar5);
                return bVar5;
            case 17:
                adi.b bVar6 = (adi.b) aVar.f287467p.f173136n.get();
                s.j(bVar6);
                return bVar6;
            case 18:
                mb3.i iVar = aVar.f287468q;
                return new sc3.c(iVar.a(), iVar.b());
            case 19:
                return aVar.f287469r.a();
            case 20:
                kgk.a aVar17 = (kgk.a) aVar.f287470s.W.get();
                s.j(aVar17);
                return aVar17;
            case 21:
                q52.a aVarA3 = aVar.f287471t.a();
                s.j(aVarA3);
                return aVarA3;
            case 22:
                dh2.a aVarA4 = aVar.u.a();
                s.j(aVarA4);
                return aVarA4;
            case 23:
                return aVar.v.a();
            case 24:
                ll1.a aVarA5 = aVar.f287472w.a();
                s.j(aVarA5);
                return aVarA5;
            case 25:
                return aVar.f287473x.a();
            case 26:
                gk1.a aVarA6 = aVar.f287474y.a();
                s.j(aVarA6);
                return aVarA6;
            case 27:
                esf.a aVarA7 = aVar.z.a();
                s.j(aVarA7);
                return aVarA7;
            case 28:
                return aVar.A.a();
            case 29:
                return new tbb.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        vd0.e eVar = (vd0.e) this.f280201c;
        ee0.a aVar = eVar.e;
        int i = this.f280200b;
        if (i == 0) {
            return new yd0.b((ue0.c) eVar.f287765g.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        yk0.a databaseSessionProvider = eVar.d.b();
        s.j(databaseSessionProvider);
        le0.b factory = aVar.c();
        s.j(factory);
        vd0.a aVar2 = vd0.b.Companion;
        aVar2.getClass();
        o gson = new o();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        le0.a objectMapper = factory.a(gson);
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        return xe0.f.f(fVarF, databaseSessionProvider, "currencies_info_storage", objectMapper, 5, v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5)), 32);
    }

    private final Object l() {
        vj2.a aVar = (vj2.a) this.f280201c;
        a31.a aVar2 = aVar.f;
        a31.a aVar3 = aVar.e;
        a31.a aVar4 = aVar.d;
        a31.a aVar5 = aVar.f289634c;
        a31.a aVar6 = aVar.f289633b;
        int i = this.f280200b;
        if (i == 0) {
            return new h5c.b(aVar.f289632a, aVar6, aVar5, aVar4, aVar3, aVar2, 12);
        }
        if (i == 1) {
            return xhi.f.c(aVar.f289635g, aVar6, aVar5, aVar4, aVar3, aVar2, aVar.f289636h, aVar.i, aVar.f289637j, aVar.k, aVar.f289638l, aVar.f289639m, aVar.f289640n, aVar.o, aVar.f289641p, aVar.f289642q, aVar.f289643r);
        }
        throw new AssertionError(i);
    }

    private final Object m() {
        vk8.a aVar = (vk8.a) this.f280201c;
        ee0.a aVar2 = aVar.f289883c;
        int i = this.f280200b;
        if (i == 0) {
            zk8.a aVar3 = (zk8.a) aVar.i.get();
            wwa.b bVarA = aVar.e.a();
            s.j(bVarA);
            return new wk8.a(aVar3, bVarA);
        }
        if (i == 1) {
            return new zk8.e((JuniorReferralsService) aVar.f.get(), (ne0.j) aVar.f289884g.get(), (ue0.c) aVar.f289885h.get());
        }
        if (i == 2) {
            return va.g.x(aVar.f289881a, ((nj0.d) aVar.f289882b).f());
        }
        if (i == 3) {
            return new ne0.d();
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        je0.d dVarB = aVar2.b();
        s.j(dVarB);
        yk0.a aVarB = aVar.d.b();
        s.j(aVarB);
        xe0.f fVarF = aVar2.f();
        s.j(fVarF);
        return va.g.z(dVarB, fVarF, aVarB);
    }

    private final Object n() {
        wq6.a aVar = ((vl2.a) this.f280201c).f290172a;
        int i = this.f280200b;
        if (i == 0) {
            ar6.c cVar = (ar6.c) aVar.f299414g.get();
            s.j(cVar);
            return new ul2.h(cVar);
        }
        if (i == 1) {
            ar6.c cVar2 = (ar6.c) aVar.f299414g.get();
            s.j(cVar2);
            return new ul2.c(cVar2);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        uq6.a aVar2 = (uq6.a) aVar.f299415h.get();
        s.j(aVar2);
        return new ul2.i(aVar2);
    }

    private final Object o() {
        vl3.n nVar = (vl3.n) this.f280201c;
        int i = this.f280200b;
        switch (i) {
            case 0:
                Context context = nVar.f290225a;
                yk0.a databaseSessionProvider = nVar.f290226b.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((cl0.a) nVar.f290227c).a();
                s.j(databaseEncryptionMigratorFactory);
                vl3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                ContactsDatabase.Companion aVar = ContactsDatabase.INSTANCE;
                aVar.getClass();
                ContactsDatabase contactsDatabase = (ContactsDatabase) aVar.a(context, databaseSessionProvider, new Migration[]{ol3.a.f226320c, ol3.b.f226321c, ol3.c.f226322c, ol3.d.f226323c, ol3.e.f226324c, ol3.f.f226325c}, databaseEncryptionMigratorFactory);
                s.k(contactsDatabase);
                return contactsDatabase;
            case 1:
                return new ne0.d();
            case 2:
                return vl3.e.a();
            case 3:
                return vl3.f.a();
            case 4:
                ao.h hVarA = nVar.a();
                l70.e eVar = nVar.f;
                UserService userServiceH = nVar.h();
                gl3.f fVar = (gl3.f) nVar.f290235q.get();
                xe0.e eVarB = nVar.b();
                y80.a aVarR = eVar.r();
                s.j(aVarR);
                sl3.b bVar = new sl3.b(aVarR, nVar.b());
                y80.a aVarR2 = eVar.r();
                s.j(aVarR2);
                sl3.b bVar2 = new sl3.b(aVarR2, nVar.b());
                xe0.e eVarB2 = nVar.b();
                ao.h hVarA2 = nVar.a();
                l80.e eVarH = eVar.h();
                s.j(eVarH);
                sl3.p pVar = new sl3.p(eVarB2, hVarA2, eVarH);
                wl3.n nVar2 = new wl3.n((gl3.f) nVar.f290235q.get());
                l80.e eVarH2 = eVar.h();
                s.j(eVarH2);
                return new sl3.k(hVarA, userServiceH, fVar, eVarB, bVar, new wl3.s(bVar2, pVar, nVar2, eVarH2, new wl3.l((gl3.f) nVar.f290235q.get(), nVar.a()), new uvl.c(nVar.g(), nVar.i(), nVar.a(), new g0(nVar.h()), new xl3.e())), new g0(nVar.h()));
            case 5:
                ContactsDatabase database = (ContactsDatabase) nVar.f290232m.get();
                vl3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                ml3.a aVarG = database.g();
                s.k(aVarG);
                return aVarG;
            case 6:
                z70.a aVarF = nVar.f.f();
                s.j(aVarF);
                y80.a aVarR3 = nVar.f.r();
                s.j(aVarR3);
                return bq.i.s(aVarF, aVarR3, new gl3.g());
            case 7:
                ContactsDatabase database2 = (ContactsDatabase) nVar.f290232m.get();
                vl3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database2, "database");
                ml3.q qVarH = database2.h();
                s.k(qVarH);
                return qVarH;
            case 8:
                ContactsDatabase database3 = (ContactsDatabase) nVar.f290232m.get();
                vl3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database3, "database");
                ml3.s sVarI = database3.i();
                s.k(sVarI);
                return sVarI;
            case 9:
                ContactsDatabase database4 = (ContactsDatabase) nVar.f290232m.get();
                vl3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database4, "database");
                ml3.x xVarJ = database4.j();
                s.k(xVarJ);
                return xVarJ;
            case 10:
                return new sl3.q(nVar.h());
            case 11:
                fl3.a aVar2 = (fl3.a) nVar.u.get();
                sl3.u uVarG = nVar.g();
                ang.f fVarE = nVar.f290228g.e();
                fk3.b bVarB = nVar.f290229h.b();
                s.j(bVarB);
                return new wl3.h(aVar2, uVarG, fVarE, bVarB);
            case 12:
                return new wl3.c((fl3.a) nVar.u.get());
            case 13:
                return new xl3.d(((k3) nVar.f290231l).a());
            case 14:
                return new im3.c();
            case 15:
                return new xl3.f();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        vo5.b bVar = (vo5.b) this.f280201c;
        a31.a aVar = bVar.f290863p;
        a31.a aVar2 = bVar.f290860l;
        a31.a aVar3 = bVar.f290858h;
        a31.a aVar4 = bVar.f;
        a31.a aVar5 = bVar.e;
        a31.a aVar6 = bVar.f290854b;
        ecm.q qVar = bVar.f290852a;
        int i = this.f280200b;
        if (i == 0) {
            return new yo5.b(aVar6, bVar.f290856c, bVar.d, aVar5, aVar4, bVar.f290857g, aVar3, bVar.i, bVar.f290859j, bVar.k, aVar2, bVar.f290861m, bVar.f290862n, bVar.o, aVar, qVar);
        }
        if (i == 1) {
            return new g2j.a(qVar, bVar.f290864q, bVar.f290865r, bVar.f290866s, aVar6, bVar.f290867t, aVar5, bVar.u, bVar.v, aVar4, bVar.f290868w, bVar.f290869x, aVar3, bVar.f290870y, bVar.z, bVar.A, bVar.f290855b0, bVar.B, bVar.C, bVar.D, bVar.E, bVar.F, bVar.G, bVar.H, aVar2, bVar.I, bVar.J, bVar.K, bVar.L, bVar.M, bVar.N, bVar.O, bVar.P, bVar.Q, aVar, bVar.R);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        go5.c cVar = (go5.c) ((yo5.b) bVar.f290853a0.get()).b();
        s.k(cVar);
        return cVar;
    }

    private final Object q() {
        voa.a aVar = (voa.a) this.f280201c;
        ee0.a aVar2 = aVar.f290924b;
        int i = this.f280200b;
        if (i == 0) {
            return new woa.a((yoa.c) aVar.f290926g.get());
        }
        if (i == 1) {
            return new yoa.c((NotificationSettingsService) aVar.d.get(), (ue0.c) aVar.e.get(), (ne0.j) aVar.f.get());
        }
        if (i == 2) {
            NotificationSettingsService notificationSettingsService = (NotificationSettingsService) v0.a.f((c21.b) aVar.f290923a, "retrofit", NotificationSettingsService.class, "create(...)");
            s.k(notificationSettingsService);
            return notificationSettingsService;
        }
        if (i != 3) {
            if (i == 4) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = aVar.f290925c.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar2.f();
        s.j(storageFactory);
        voa.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "notification_settings", mapper, 1, null, 48);
    }

    private final Object r() {
        vs6.a aVar = (vs6.a) this.f280201c;
        int i = this.f280200b;
        switch (i) {
            case 0:
                return new et6.g((au6.a) aVar.f291724n.get(), (gr6.m) aVar.f291726q.get());
            case 1:
                FreelancerAccountService freelancerAccountService = (FreelancerAccountService) aVar.f291721j.get();
                ne0.j jVar = (ne0.j) aVar.k.get();
                ue0.c cVar = (ue0.c) aVar.f291722l.get();
                it6.c cVar2 = (it6.c) aVar.f291723m.get();
                q06.d dVarA = aVar.e.a();
                s.j(dVarA);
                return new au6.f(freelancerAccountService, jVar, cVar, cVar2, new ft6.b(dVarA));
            case 2:
                vs6.c cVar3 = aVar.f291716a;
                FreelancerAccountService freelancerAccountService2 = (FreelancerAccountService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar.i.get(), "retrofit", FreelancerAccountService.class, "create(...)");
                s.k(freelancerAccountService2);
                return freelancerAccountService2;
            case 3:
                vs6.c cVar4 = aVar.f291716a;
                Retrofit retrofitI = ((c21.b) aVar.f291717b).i();
                s.j(retrofitI);
                o oVar = (o) aVar.f291720h.get();
                Retrofit.Builder builderX = p.a.x(retrofitI, "retrofit", oVar, "gson");
                builderX.converterFactories().clear();
                Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 4:
                vs6.c cVar5 = aVar.f291716a;
                o gson = ((c21.b) aVar.f291717b).h();
                s.j(gson);
                Intrinsics.checkNotNullParameter(gson, "gson");
                return gson;
            case 5:
                return new ne0.d();
            case 6:
                je0.d mapper = aVar.f291718c.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = aVar.d.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f291718c.f();
                s.j(storageFactory);
                vs6.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "freelancer_account", mapper, 2, zhm.u.c(new eu6.a()), 32);
            case 7:
                return new com.revolut.feature.freelancer.impl.network.errorhandling.b((o) aVar.f291720h.get());
            case 8:
                return new i2((v1) aVar.f291725p.get(), aVar.f.a(), aVar.f291719g.b());
            case 9:
                return new v1((FreelancerAccountService) aVar.f291721j.get(), (go3.b) aVar.o.get());
            case 10:
                return new go3.d();
            case 11:
                return new et6.h((au6.g) aVar.f291728s.get());
            case 12:
                return new au6.k((ue0.c) aVar.f291722l.get());
            case 13:
                return new q1((n1) aVar.u.get());
            case 14:
                return new n1((FreelancerAccountService) aVar.f291721j.get(), (ne0.j) aVar.k.get(), (ue0.c) aVar.f291722l.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        t tVar = (t) this.f280201c;
        int i = this.f280200b;
        switch (i) {
            case 0:
                return new wtc.h((cuc.d) tVar.T.get());
            case 1:
                return new cuc.d((LinkedWalletsService) tVar.P.get(), (ue0.c) tVar.R.get(), (ne0.j) tVar.S.get(), new cuc.a());
            case 2:
                return va.g.v((Retrofit) tVar.O.get());
            case 3:
                return p0.w((o) tVar.N.get(), ((nj0.d) tVar.f292058a).f());
            case 4:
                ee0.a aVar = tVar.f292060b;
                return va.g.q(fe0.c.a());
            case 5:
                xe0.f fVarF = tVar.f292060b.f();
                s.j(fVarF);
                je0.d dVar = (je0.d) tVar.Q.get();
                yk0.a aVarB = tVar.f292062c.b();
                s.j(aVarB);
                return va.g.r(dVar, fVarF, aVarB);
            case 6:
                o oVar = (o) tVar.N.get();
                le0.b bVarC = tVar.f292060b.c();
                s.j(bVarC);
                return p0.v(oVar, bVarC);
            case 7:
                return o0.a();
            case 8:
                return new ztc.g();
            case 9:
                sri.m mVar = (sri.m) tVar.W.get();
                l93.f fVarJ = tVar.e.j();
                s.j(fVarJ);
                return new ztc.f(mVar, fVarJ, (wtc.h) tVar.U.get(), (ptc.a) tVar.Z.get());
            case 10:
                return p0.u(tVar.d);
            case 11:
                cuc.u uVar = (cuc.u) tVar.Y.get();
                otc.b bVarX = wpg.v.x(tVar.f.f300644a);
                xoj.a aVarA = tVar.f292065g.a();
                s.j(aVarA);
                jla.h hVarA = tVar.f292066h.a();
                w39.b bVarA = tVar.i.a();
                s.j(bVarA);
                wtc.g0 g0VarB = tVar.f292068j.b();
                gte.a aVarB2 = tVar.k.b();
                s.j(aVarB2);
                return new a1(uVar, bVarX, aVarA, hVarA, bVarA, g0VarB, aVarB2);
            case 12:
                return new cuc.z((ue0.c) tVar.R.get(), (ne0.j) tVar.S.get(), (SecurityHubService) tVar.X.get(), new com.revolut.feature.security_hub.impl.repository.b(), new cuc.f0());
            case 13:
                return p0.y((Retrofit) tVar.O.get());
            case 14:
                return new b1((cuc.u) tVar.Y.get(), tVar.f292066h.a());
            case 15:
                return new wtc.u((cuc.t) tVar.f292063d0.get());
            case 16:
                return new cuc.t((ue0.c) tVar.R.get(), (ne0.j) tVar.S.get(), (SecurityHubChecklistService) tVar.c0.get(), new cuc.s());
            case 17:
                return p0.x((Retrofit) tVar.O.get());
            case 18:
                return new q0();
            case 19:
                return new wtc.n((cuc.u) tVar.Y.get(), tVar.f292074q.b());
            case 20:
                return new u0();
            case 21:
                return new e1();
            case 22:
                return new wtc.j((cuc.u) tVar.Y.get());
            case 23:
                y80.a aVarR = tVar.f292075r.r();
                s.j(aVarR);
                tb4.t tVarB = tVar.b();
                wtc.g0 g0VarB2 = tVar.f292068j.b();
                gte.a aVarB3 = tVar.k.b();
                s.j(aVarB3);
                return new wtc.k0(aVarR, tVarB, g0VarB2, aVarB3, (ue0.c) tVar.R.get());
            case 24:
                return new xtc.d();
            case 25:
                th0.a aVar2 = tVar.J;
                return va.g.g(th0.g.a());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        Object h1Var;
        Object k2Var;
        int i = this.f280199a;
        int i2 = 1;
        int i3 = this.f280200b;
        Object obj2 = this.f280201c;
        switch (i) {
            case 0:
                b bVar2 = (b) obj2;
                a31.a aVar = bVar2.f280204c;
                a31.a aVar2 = bVar2.v;
                a31.a aVar3 = bVar2.f280217x;
                a31.a aVar4 = bVar2.f280210n;
                a31.a aVar5 = bVar2.f280205g;
                ecm.q qVar = bVar2.f280202a;
                if (i3 == 0) {
                    return w40.c.f(bVar2.f280203b, aVar, bVar2.d, bVar2.e, bVar2.f, aVar5, qVar);
                }
                if (i3 == 1) {
                    return new whc.f0(qVar, bVar2.f280206h, bVar2.i, aVar, bVar2.f280207j, bVar2.k, aVar5, bVar2.f280208l, bVar2.f280209m, aVar4, bVar2.o, bVar2.f280211p, bVar2.f280212q, bVar2.f280213r, bVar2.f280214s, bVar2.f280215t, bVar2.u, aVar2, bVar2.f280216w, aVar3, bVar2.I);
                }
                if (i3 == 2) {
                    return ufg.p0.C((whc.a0) bVar2.H.get());
                }
                if (i3 == 3) {
                    return w40.c.e(qVar, aVar4, bVar2.K, bVar2.f280218y, aVar5, bVar2.z, bVar2.A, bVar2.B, bVar2.C, aVar3, bVar2.D, bVar2.E, bVar2.F, aVar2, bVar2.G);
                }
                if (i3 == 4) {
                    return ufg.p0.D((whc.f0) bVar2.J.get());
                }
                if (i3 == 5) {
                    return w40.c.b(bVar2.I);
                }
                throw new AssertionError(i3);
            case 1:
                uk8.a aVar6 = (uk8.a) obj2;
                if (i3 == 0) {
                    return new fh7.c(aVar6.f280695a, aVar6.f280696b, aVar6.f280697c, aVar6.d, 12);
                }
                if (i3 == 1) {
                    return va.g.c(aVar6.e);
                }
                throw new AssertionError(i3);
            case 2:
                ul3.d dVar = (ul3.d) obj2;
                a31.a aVar7 = dVar.f280868c;
                a31.a aVar8 = dVar.f280869g;
                a31.a aVar9 = dVar.f280867b;
                a31.a aVar10 = dVar.i;
                a31.a aVar11 = dVar.d;
                ecm.q qVar2 = dVar.f280866a;
                if (i3 == 0) {
                    return new vl3.c(aVar9, aVar7, aVar11, dVar.e, dVar.f, aVar8, dVar.f280870h, aVar10, dVar.f280871j, dVar.k, dVar.f280872l, qVar2);
                }
                if (i3 == 1) {
                    return va.g.d(qVar2, dVar.f280873m, dVar.H, aVar11, dVar.f280874n, dVar.o, aVar10, dVar.f280875p, dVar.f280876q, dVar.f280877r, dVar.f280878s, dVar.f280879t, dVar.u, dVar.v, dVar.f280880w, dVar.f280881x, dVar.f280882y, dVar.z, dVar.A, dVar.B, dVar.C, dVar.D, dVar.E, aVar9, aVar8, aVar7, dVar.F);
                }
                if (i3 == 2) {
                    return ufg.p0.x((vl3.c) dVar.G.get());
                }
                throw new AssertionError(i3);
            case 3:
                upg.a aVar12 = (upg.a) obj2;
                a31.a aVar13 = aVar12.f282045n;
                a31.a aVar14 = aVar12.u;
                a31.a aVar15 = aVar12.A;
                a31.a aVar16 = aVar12.f282040g;
                if (i3 == 0) {
                    return new wpg.r(aVar12.f282038b, aVar12.f282039c, aVar12.d, aVar12.e, aVar12.f, aVar16, aVar12.f282041h, aVar12.i, aVar12.f282042j, aVar12.k, aVar12.f282043l, aVar12.f282044m, aVar13, aVar12.o, aVar12.f282046p, aVar12.f282047q, aVar12.f282048r, aVar12.f282049s, aVar12.f282050t, aVar14, aVar12.v, aVar12.f282051w, aVar12.f282052x, aVar12.f282053y, aVar12.z, aVar15, aVar12.B, aVar12.C, aVar12.D, aVar12.E, aVar12.f282037a);
                }
                if (i3 == 1) {
                    return w40.c.d(aVar12.F, aVar12.G, aVar16, aVar15, aVar12.H, aVar12.I, aVar14, aVar12.J, aVar13);
                }
                throw new AssertionError(i3);
            case 4:
                url.a aVar17 = (url.a) obj2;
                a31.a aVar18 = aVar17.f282365n;
                a31.a aVar19 = aVar17.f282372x;
                a31.a aVar20 = aVar17.f282371w;
                a31.a aVar21 = aVar17.f282370t;
                a31.a aVar22 = aVar17.v;
                a31.a aVar23 = aVar17.u;
                a31.a aVar24 = aVar17.f282363l;
                a31.a aVar25 = aVar17.f282364m;
                a31.a aVar26 = aVar17.f;
                a31.a aVar27 = aVar17.f282357c;
                a31.a aVar28 = aVar17.f282355b;
                a31.a aVar29 = aVar17.f282361h;
                a31.a aVar30 = aVar17.i;
                switch (i3) {
                    case 0:
                        bVar = new trl.b(aVar17.f282353a, aVar28, aVar27, aVar17.d, aVar17.e, aVar26, aVar17.f282360g, aVar29, aVar30, aVar17.f282362j, aVar17.k, aVar24, aVar25, aVar18, aVar17.o, aVar17.f282366p, aVar17.f282367q, aVar17.f282368r, aVar17.f282369s, aVar21, aVar23, aVar22, aVar20, aVar19);
                        break;
                    case 1:
                        return new c1j.b(aVar29, aVar17.c0, i2);
                    case 2:
                        ktl.a aVar31 = (ktl.a) ((ktl.b) aVar17.f282356b0.get()).b();
                        s.k(aVar31);
                        return aVar31;
                    case 3:
                        return new ktl.b(aVar17.f282354a0, aVar17.f282373y, aVar30);
                    case 4:
                        trl.a aVar32 = (trl.a) ((trl.b) aVar17.Z.get()).b();
                        s.k(aVar32);
                        return aVar32;
                    case 5:
                        return new gtl.b(aVar17.f282354a0);
                    case 6:
                        bVar = new xsl.s(aVar28, aVar27, aVar17.z, aVar26, aVar25, aVar17.f282354a0, aVar30, aVar29, aVar17.A, aVar17.B, aVar17.C, aVar17.D, aVar17.E, aVar17.F, aVar17.G, aVar17.H, aVar24, aVar17.I, aVar17.J, aVar17.c0, aVar17.f0, aVar17.K, aVar17.L, aVar23, aVar22, aVar17.M, aVar17.N, aVar17.O, aVar17.P, aVar17.Q, aVar17.R, aVar17.S, aVar17.T, aVar21, aVar17.U, aVar17.V, aVar20, aVar17.W, aVar17.X, aVar19, aVar18, aVar17.Y);
                        break;
                    case 7:
                        gtl.a aVar33 = (gtl.a) ((gtl.b) aVar17.f282359e0.get()).b();
                        s.k(aVar33);
                        return aVar33;
                    default:
                        throw new AssertionError(i3);
                }
                return bVar;
            case 5:
                us6.q qVar3 = (us6.q) obj2;
                switch (i3) {
                    case 0:
                        usg.a aVar34 = qVar3.f282667a;
                        vs6.a aVar35 = qVar3.f282681h;
                        wsg.n nVarB = aVar34.b();
                        b2 b2Var = (b2) qVar3.Y.get();
                        gr6.a aVarA = aVar35.a();
                        s.j(aVarA);
                        et6.h hVar = (et6.h) aVar35.f291729t.get();
                        s.j(hVar);
                        gr6.m mVarB = aVar35.b();
                        s.j(mVarB);
                        gr6.h hVar2 = (gr6.h) qVar3.f282670b0.get();
                        r10.w wVarF = qVar3.f();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) qVar3.k).c();
                        s.j(aVarC);
                        h1Var = new h1(nVarB, b2Var, aVarA, hVar, mVarB, hVar2, wVarF, aVarC);
                        return h1Var;
                    case 1:
                        FreelancerService freelancerService = (FreelancerService) qVar3.T.get();
                        is6.z zVar = (is6.z) qVar3.V.get();
                        ne0.j jVar = (ne0.j) qVar3.W.get();
                        ue0.c cVar = (ue0.c) qVar3.X.get();
                        bd1.a aVarA2 = qVar3.f282679g.a();
                        s.j(aVarA2);
                        k2Var = new k2(freelancerService, zVar, jVar, cVar, new ft6.u(aVarA2));
                        return k2Var;
                    case 2:
                        return w3.s(qVar3.f282669b, (Retrofit) qVar3.S.get());
                    case 3:
                        v3 v3Var = qVar3.f282669b;
                        Retrofit retrofitI = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI);
                        return ufg.p0.q(v3Var, retrofitI, (o) qVar3.R.get());
                    case 4:
                        v3 v3Var2 = qVar3.f282669b;
                        o oVarH = ((c21.b) qVar3.f282672c).h();
                        s.j(oVarH);
                        return ufg.p0.p(v3Var2, oVarH);
                    case 5:
                        return o3.a((FreelancerDatabase) qVar3.U.get());
                    case 6:
                        Context context = qVar3.d;
                        yk0.a aVarB = qVar3.e.b();
                        s.j(aVarB);
                        return m3.a(context, aVarB, ((c21.b) qVar3.f282672c).b());
                    case 7:
                        return new ne0.d();
                    case 8:
                        je0.d dVarB = qVar3.f.b();
                        s.j(dVarB);
                        yk0.a aVarB2 = qVar3.e.b();
                        s.j(aVarB2);
                        xe0.f fVarF = qVar3.f.f();
                        s.j(fVarF);
                        return w3.u(dVarB, aVarB2, fVarF);
                    case 9:
                        l0 l0Var = (l0) qVar3.f282668a0.get();
                        ffk.t tVarF = qVar3.i.f();
                        s.j(tVarF);
                        return new y0(l0Var, tVarF, qVar3.f282667a.b());
                    case 10:
                        return new l0((FreelancerCashbackService) qVar3.Z.get(), (ne0.j) qVar3.W.get(), (ue0.c) qVar3.X.get());
                    case 11:
                        v3 v3Var3 = qVar3.f282669b;
                        Retrofit retrofitI2 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI2);
                        return ufg.p0.r(v3Var3, retrofitI2);
                    case 12:
                        gr6.a aVarA3 = qVar3.f282681h.a();
                        s.j(aVarA3);
                        return new n0(aVarA3, (b2) qVar3.Y.get());
                    case 13:
                        return new et6.b1((au6.o0) qVar3.g0.get());
                    case 14:
                        return new au6.u0((FreelancerCustomersService) qVar3.f282676e0.get(), (ne0.j) qVar3.W.get(), (is6.e) qVar3.f0.get());
                    case 15:
                        return ufg.p0.n(qVar3.f282669b, (Retrofit) qVar3.S.get());
                    case 16:
                        return l3.a((FreelancerDatabase) qVar3.U.get());
                    case 17:
                        gr6.i iVarA = qVar3.f282689l.a();
                        s.j(iVarA);
                        return new p1(iVarA, (v0) qVar3.m0.get());
                    case 18:
                        e eVar = qVar3.i0;
                        l70.e eVar2 = qVar3.f282691m;
                        FreelancerInvoiceService freelancerInvoiceService = (FreelancerInvoiceService) eVar.get();
                        ne0.j jVar2 = (ne0.j) qVar3.W.get();
                        is6.u uVar = (is6.u) qVar3.j0.get();
                        y yVar = (y) qVar3.f282687k0.get();
                        zk0.b bVarL = eVar2.l();
                        s.j(bVarL);
                        f80.a aVarX = eVar2.x();
                        s.j(aVarX);
                        k2Var = new k1(freelancerInvoiceService, jVar2, uVar, yVar, bVarL, aVarX, (it6.c) qVar3.l0.get());
                        return k2Var;
                    case 19:
                        return w3.m(qVar3.f282669b, (Retrofit) qVar3.S.get());
                    case 20:
                        return p3.a((FreelancerDatabase) qVar3.U.get());
                    case 21:
                        return n3.a((FreelancerDatabase) qVar3.U.get());
                    case 22:
                        return new com.revolut.feature.freelancer.impl.network.errorhandling.b((o) qVar3.R.get());
                    case 23:
                        return new y1((r1) qVar3.q0.get());
                    case 24:
                        return new r1((FreelancerOnboardingService) qVar3.f282695o0.get(), (is6.d) qVar3.p0.get(), (ne0.j) qVar3.W.get());
                    case 25:
                        return w3.o(qVar3.f282669b, (Retrofit) qVar3.S.get());
                    case 26:
                        return us6.k3.a((FreelancerDatabase) qVar3.U.get());
                    case 27:
                        return new a3((b2) qVar3.Y.get(), (jr6.u) qVar3.f282704s0.get());
                    case 28:
                        l80.e eVarH = qVar3.f282691m.h();
                        s.j(eVarH);
                        return new k17.d(eVarH);
                    case 29:
                        e eVar3 = qVar3.f282710v0;
                        l70.e eVar4 = qVar3.f282691m;
                        e0 e0Var = (e0) eVar3.get();
                        r80.c cVar2 = (r80.c) eVar4.Z.get();
                        s.j(cVar2);
                        f80.a aVarX2 = eVar4.x();
                        s.j(aVarX2);
                        return new et6.q0(e0Var, cVar2, aVarX2);
                    case 30:
                        return new e0((FreelancerBrandingService) qVar3.u0.get());
                    case 31:
                        return ufg.p0.m(qVar3.f282669b, (Retrofit) qVar3.S.get());
                    case 32:
                        gr6.a aVarA4 = qVar3.f282681h.a();
                        s.j(aVarA4);
                        gr6.k kVar = (gr6.k) qVar3.f282715x0.get();
                        gr6.e eVarA = qVar3.f282692n.a();
                        s.j(eVarA);
                        return new b4(aVarA4, kVar, eVarA);
                    case 33:
                        gr6.a aVarA5 = qVar3.f282681h.a();
                        s.j(aVarA5);
                        return new et6.v1(aVarA5);
                    case 34:
                        return new k17.c((jr6.u) qVar3.f282704s0.get(), (jr6.n) qVar3.z0.get());
                    case 35:
                        l80.e eVarH2 = qVar3.f282691m.h();
                        s.j(eVarH2);
                        return new tx6.e(eVarH2);
                    case 36:
                        return new y47.b(qVar3.o.g());
                    case 37:
                        gr6.a aVarA6 = qVar3.f282681h.a();
                        s.j(aVarA6);
                        return new mz6.b(aVarA6, (hr6.l) qVar3.M0.get());
                    case 38:
                        ld1.l lVar = qVar3.f282697p;
                        ika.f fVar = qVar3.f282703s;
                        nd1.b bVar3 = (nd1.b) lVar.k.get();
                        s.j(bVar3);
                        gr6.a aVarA7 = qVar3.f282681h.a();
                        s.j(aVarA7);
                        gr6.e eVarA2 = qVar3.f282692n.a();
                        s.j(eVarA2);
                        gr6.h hVar3 = (gr6.h) qVar3.f282670b0.get();
                        gr6.p pVar = (gr6.p) qVar3.L0.get();
                        zjh.i iVarH = qVar3.f282712w.h();
                        zja.a aVarA8 = ((ika.b) fVar).a();
                        s.j(aVarA8);
                        return new ct6.m(bVar3, aVarA7, eVarA2, hVar3, pVar, iVarH, aVarA8, ((ika.b) fVar).b());
                    case 39:
                        b9k.f fVarC = qVar3.c();
                        xmg.a aVar36 = qVar3.f282699q;
                        zja.a aVarA9 = ((ika.b) qVar3.f282703s).a();
                        s.j(aVarA9);
                        z1 z1Var = (z1) qVar3.K0.get();
                        hs6.b bVar4 = new hs6.b(qVar3.o.g());
                        p1 p1Var = (p1) qVar3.f282693n0.get();
                        zjh.c cVarA = qVar3.f282706t.a();
                        gr6.h hVar4 = (gr6.h) qVar3.f282670b0.get();
                        bbd.b bVar5 = (bbd.b) qVar3.f282700r.f133542l.get();
                        s.j(bVar5);
                        bgc.e eVarC = qVar3.u.c();
                        s.j(eVarC);
                        ang.f fVarE = aVar36.e();
                        l61.a aVarB3 = aVar36.b();
                        s.j(aVarB3);
                        ppg.b bVarB = ((wpg.l) qVar3.v).b();
                        s.j(bVarB);
                        return new x2(fVarC, aVarA9, z1Var, bVar4, p1Var, cVarA, hVar4, bVar5, eVarC, fVarE, aVarB3, bVarB);
                    case 40:
                        CoroutineScope coroutineScope = (CoroutineScope) qVar3.C0.get();
                        l80.e eVarH3 = qVar3.f282691m.h();
                        s.j(eVarH3);
                        return new et6.v(coroutineScope, eVarH3, (au6.m) qVar3.D0.get(), (au6.v) qVar3.H0.get());
                    case 41:
                        return f3.a();
                    case 42:
                        return new au6.m((ue0.c) qVar3.X.get());
                    case 43:
                        AcquiringOrdersService acquiringOrdersService = (AcquiringOrdersService) qVar3.E0.get();
                        CoroutineScope coroutineScope2 = (CoroutineScope) qVar3.C0.get();
                        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) qVar3.F0.get();
                        ne0.j jVar3 = (ne0.j) qVar3.W.get();
                        is6.a aVar37 = (is6.a) qVar3.G0.get();
                        w80.b bVarJ = qVar3.f282691m.j();
                        s.j(bVarJ);
                        k2Var = new au6.v(acquiringOrdersService, coroutineScope2, coroutineDispatcher, jVar3, aVar37, new cu6.a(bVarJ, qVar3.b()), (au6.m) qVar3.D0.get(), (ue0.c) qVar3.X.get());
                        return k2Var;
                    case 44:
                        return ufg.p0.h(qVar3.f282669b, (Retrofit) qVar3.S.get());
                    case 45:
                        return g3.a();
                    case 46:
                        return i3.a((FreelancerDatabase) qVar3.U.get());
                    case 47:
                        return new z1((ne0.j) qVar3.W.get(), (FreelancerProductArticleService) qVar3.J0.get(), (ue0.c) qVar3.X.get());
                    case 48:
                        v3 v3Var4 = qVar3.f282669b;
                        Retrofit retrofitI3 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI3);
                        return w3.f(v3Var4, retrofitI3);
                    case 49:
                        gr6.a aVarA10 = qVar3.f282681h.a();
                        s.j(aVarA10);
                        return new s17.d(aVarA10, (gr6.f) qVar3.f282674d0.get());
                    case 50:
                        return new ft6.i();
                    case 51:
                        return new ct6.t((h1) qVar3.c0.get(), (gr6.h) qVar3.f282670b0.get(), (et6.l3) qVar3.S0.get(), new wv6.a());
                    case 52:
                        return new et6.l3((q2) qVar3.R0.get());
                    case 53:
                        return new q2((FreelancerSettlementService) qVar3.Q0.get(), (ne0.j) qVar3.W.get());
                    case 54:
                        v3 v3Var5 = qVar3.f282669b;
                        Retrofit retrofitI4 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI4);
                        return w3.i(v3Var5, retrofitI4);
                    case 55:
                        return new hw6.b((ft6.i) qVar3.P0.get(), qVar3.o.g());
                    case 56:
                        return new qv6.a(new pv6.a(), new wv6.a());
                    case 57:
                        return new l2(qVar3.f282706t.a(), qVar3.f282699q.e(), qVar3.f282706t.b());
                    case 58:
                        wwa.b bVarA = qVar3.f282714x.a();
                        s.j(bVarA);
                        return new et6.k1(bVarA);
                    case 59:
                        return new ct6.v();
                    case 60:
                        return new ct6.f((gr6.h) qVar3.f282670b0.get());
                    case 61:
                        return new y2((a2) qVar3.a1.get(), (au6.y1) qVar3.f282673c1.get(), (b2) qVar3.Y.get());
                    case 62:
                        return new a2((FreelancerPromptService) qVar3.Z0.get());
                    case 63:
                        v3 v3Var6 = qVar3.f282669b;
                        Retrofit retrofitI5 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI5);
                        return w3.g(v3Var6, retrofitI5);
                    case 64:
                        return new au6.y1((FreelancerProTrackService) qVar3.f282671b1.get());
                    case 65:
                        v3 v3Var7 = qVar3.f282669b;
                        Retrofit retrofitI6 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI6);
                        return w3.e(v3Var7, retrofitI6);
                    case 66:
                        gr6.e eVarA3 = qVar3.f282692n.a();
                        s.j(eVarA3);
                        jf1.a aVarA11 = qVar3.f282717y.a();
                        s.j(aVarA11);
                        return new h3(eVarA3, aVarA11);
                    case 67:
                        jf1.a aVarA12 = qVar3.f282717y.a();
                        s.j(aVarA12);
                        return new c1(aVarA12);
                    case 68:
                        gr6.e eVarA4 = qVar3.f282692n.a();
                        s.j(eVarA4);
                        p1 p1Var2 = (p1) qVar3.f282693n0.get();
                        gt6.h hVar5 = (gt6.h) qVar3.f282680g1.get();
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) qVar3.k).c();
                        s.j(aVarC2);
                        return new d2(eVarA4, p1Var2, hVar5, aVarC2);
                    case 69:
                        h1Var = new gt6.h(new gt6.a(), new gt6.f((jr6.u) qVar3.f282704s0.get()), new gt6.c(), new gt6.e(), new gt6.i());
                        return h1Var;
                    case 70:
                        return new et6.k3((o2) qVar3.f282686j1.get());
                    case 71:
                        return new o2((FreelancerSettingsService) qVar3.f282684i1.get());
                    case 72:
                        v3 v3Var8 = qVar3.f282669b;
                        Retrofit retrofitI7 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI7);
                        return ufg.p0.s(v3Var8, retrofitI7);
                    case 73:
                        pre.c cVarA2 = qVar3.z.a();
                        s.j(cVarA2);
                        l61.a aVarB4 = qVar3.f282699q.b();
                        s.j(aVarB4);
                        return new y3(cVarA2, aVarB4);
                    case 74:
                        return new ct6.w();
                    case 75:
                        return new ct6.u();
                    case 76:
                        return new zt6.b();
                    case 77:
                        gr6.a aVarA13 = qVar3.f282681h.a();
                        s.j(aVarA13);
                        gr6.m mVarB2 = qVar3.f282681h.b();
                        s.j(mVarB2);
                        jr6.m mVar = (jr6.m) qVar3.T0.get();
                        jr6.o oVar = (jr6.o) qVar3.O0.get();
                        cne.a aVarA14 = qVar3.A.a();
                        s.j(aVarA14);
                        ppg.b bVarB2 = ((wpg.l) qVar3.v).b();
                        s.j(bVarB2);
                        k2Var = new ct6.n(aVarA13, mVarB2, mVar, oVar, aVarA14, bVarB2, qVar3.f282667a.b());
                        return k2Var;
                    case 78:
                        return new yz6.a();
                    case 79:
                        return new au6.p1((FreelancerLearnLessonsService) qVar3.f282702r1.get(), (ne0.j) qVar3.W.get(), (ue0.c) qVar3.X.get());
                    case 80:
                        v3 v3Var9 = qVar3.f282669b;
                        Retrofit retrofitI8 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI8);
                        return ufg.p0.t(v3Var9, retrofitI8);
                    case 81:
                        return new d0((AcquiringPaymentsService) qVar3.f282708t1.get(), (ne0.j) qVar3.W.get(), (is6.c) qVar3.f282709u1.get(), (ue0.c) qVar3.X.get());
                    case 82:
                        return ufg.p0.i(qVar3.f282669b, (Retrofit) qVar3.S.get());
                    case 83:
                        return j3.a((FreelancerDatabase) qVar3.U.get());
                    case 84:
                        return new u1((FreelancerPaymentsService) qVar3.w1.get(), (ne0.j) qVar3.W.get(), (ue0.c) qVar3.X.get());
                    case 85:
                        v3 v3Var10 = qVar3.f282669b;
                        Retrofit retrofitI9 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI9);
                        return w3.d(v3Var10, retrofitI9);
                    case 86:
                        gte.a aVarB5 = qVar3.D.b();
                        s.j(aVarB5);
                        return new et6.j3(aVarB5, (m2) qVar3.f282719z1.get());
                    case 87:
                        return new m2((FreelancerSettingsFeaturesService) qVar3.f282718y1.get(), (ne0.j) qVar3.W.get(), (ue0.c) qVar3.X.get());
                    case 88:
                        v3 v3Var11 = qVar3.f282669b;
                        Retrofit retrofitI10 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI10);
                        return w3.h(v3Var11, retrofitI10);
                    case 89:
                        return new s1((FreelancerPartnerService) qVar3.B1.get());
                    case 90:
                        v3 v3Var12 = qVar3.f282669b;
                        Retrofit retrofitI11 = ((c21.b) qVar3.f282672c).i();
                        s.j(retrofitI11);
                        return w3.c(v3Var12, retrofitI11);
                    default:
                        throw new AssertionError(i3);
                }
            case 6:
                e2 e2Var = (e2) obj2;
                bt6.b bVar6 = e2Var.f;
                us6.q qVar4 = e2Var.e;
                vs6.a aVar38 = e2Var.f282508c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return r3.a(e2Var.f282509g);
                    }
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return u3.a();
                        }
                        throw new AssertionError(i3);
                    }
                    CoroutineScope coroutineScope3 = (CoroutineScope) e2Var.o.get();
                    q06.d dVarA = e2Var.k.a();
                    s.j(dVarA);
                    h1b.b bVar7 = (h1b.b) e2Var.f282512l.f180199p.get();
                    s.j(bVar7);
                    t0 t0Var = new t0();
                    q1 q1Var = (q1) aVar38.v.get();
                    s.j(q1Var);
                    return new z0(coroutineScope3, dVarA, bVar7, t0Var, q1Var);
                }
                l93.f fVarJ = e2Var.f282506a.j();
                s.j(fVarJ);
                l80.e eVarH4 = e2Var.f282507b.h();
                s.j(eVarH4);
                gr6.a aVarA15 = aVar38.a();
                s.j(aVarA15);
                gr6.e eVarA5 = e2Var.d.a();
                s.j(eVarA5);
                et6.u0 u0VarJ = qVar4.j();
                hr6.l lVarL = qVar4.l();
                s.j(lVarL);
                t0 t0Var2 = new t0();
                h1 h1VarN = qVar4.n();
                s.j(h1VarN);
                gr6.j jVar4 = (gr6.j) qVar4.W0.get();
                s.j(jVar4);
                q1 q1Var2 = (q1) aVar38.v.get();
                s.j(q1Var2);
                gr6.m mVarB3 = aVar38.b();
                s.j(mVarB3);
                r10.d dVarF = bVar6.f();
                zjh.i iVarH2 = bVar6.h();
                sri.m mVar2 = (sri.m) e2Var.f282513m.get();
                jf1.a aVarA16 = e2Var.f282510h.a();
                s.j(aVarA16);
                f73.b bVar8 = new f73.b();
                f73.c cVar3 = new f73.c();
                gte.a aVarB6 = e2Var.i.b();
                s.j(aVarB6);
                return new s0(fVarJ, eVarH4, aVarA15, eVarA5, u0VarJ, lVarL, t0Var2, h1VarN, jVar4, q1Var2, mVarB3, dVarF, iVarH2, mVar2, aVarA16, bVar8, cVar3, aVarB6, e2Var.f282511j.a());
            case 7:
                usg.b bVar9 = (usg.b) obj2;
                if (i3 == 0) {
                    WalletsService walletsServiceD = bVar9.d();
                    ne0.d dVar2 = new ne0.d();
                    xe0.e eVarC2 = bVar9.c();
                    atg.k kVar2 = new atg.k(bVar9.c());
                    ze0.a aVarA17 = bVar9.f282905b.a();
                    s.j(aVarA17);
                    return new atg.v(walletsServiceD, dVar2, eVarC2, kVar2, aVarA17, (atg.i) bVar9.i.get(), bVar9.e.e());
                }
                if (i3 == 1) {
                    return new atg.h(bVar9.d(), bVar9.d.a(), (go3.b) bVar9.f.get(), new ne0.d(), bVar9.c(), (btg.c) bVar9.f282908h.get());
                }
                if (i3 == 2) {
                    return new go3.d();
                }
                if (i3 == 3) {
                    usg.g.Companion.getClass();
                    h80.e eVar5 = h80.e.f149934a;
                    return new btg.d(ImmutableSet.of((btg.a) bVar9.f282907g.get()));
                }
                if (i3 == 4) {
                    return new btg.a();
                }
                if (i3 == 5) {
                    return new l((atg.i) bVar9.i.get(), (qsg.b) bVar9.f282909j.get());
                }
                throw new AssertionError(i3);
            case 8:
                ut9.a aVar39 = (ut9.a) obj2;
                switch (i3) {
                    case 0:
                        return new au9.b((ue0.c) aVar39.f283043n.get());
                    case 1:
                        je0.d dVarB2 = aVar39.f283035a.b();
                        s.j(dVarB2);
                        yk0.a aVarB7 = aVar39.f283036b.b();
                        s.j(aVarB7);
                        xe0.f fVarF2 = aVar39.f283035a.f();
                        s.j(fVarF2);
                        return w3.v(dVarB2, fVarF2, aVarB7);
                    case 2:
                        ang.f fVarE2 = aVar39.f283037c.e();
                        fk3.b bVarB3 = aVar39.d.b();
                        s.j(bVarB3);
                        return new wt9.a(fVarE2, bVarB3);
                    case 3:
                        return new wt9.b(new xt9.f((QrCodeService) aVar39.f283047s.get(), fe0.c.a()));
                    case 4:
                        return w3.q((Retrofit) aVar39.f283046r.get());
                    case 5:
                        Retrofit retrofitI12 = ((c21.b) aVar39.e).i();
                        s.j(retrofitI12);
                        return w3.r((o) aVar39.f283045q.get(), retrofitI12);
                    case 6:
                        o oVarH2 = ((c21.b) aVar39.e).h();
                        s.j(oVarH2);
                        return w3.l(oVarH2);
                    case 7:
                        return new zt9.a();
                    case 8:
                        po5.a aVarD = ((yo5.w) aVar39.f).d();
                        s.j(aVarD);
                        return new bu9.a(aVarD);
                    case 9:
                        jm4.r rVar = aVar39.f283038g;
                        fpg.c cVar4 = aVar39.f283039h;
                        al4.n nVarS = rVar.s();
                        s.j(nVarS);
                        ppg.b bVarB4 = ((wpg.l) cVar4).b();
                        s.j(bVarB4);
                        ppg.a aVarA18 = ((wpg.l) cVar4).a();
                        s.j(aVarA18);
                        c91.a aVarA19 = aVar39.i.a();
                        s.j(aVarA19);
                        je6.h hVarC = ((xf6.t) aVar39.f283040j).c();
                        s.j(hVarC);
                        return new yt9.g(nVarS, bVarB4, aVarA18, aVarA19, hVarC, new yt9.a(), aVar39.k.i());
                    case 10:
                        g6e.d dVarB3 = aVar39.f283041l.b();
                        s.j(dVarB3);
                        gte.a aVarB8 = aVar39.f283042m.b();
                        s.j(aVarB8);
                        return new vt9.d(dVarB3, aVarB8);
                    case 11:
                        al4.n nVarS2 = aVar39.f283038g.s();
                        s.j(nVarS2);
                        return new wt9.e(nVarS2);
                    default:
                        throw new AssertionError(i3);
                }
            case 9:
                uvh.c cVar5 = (uvh.c) obj2;
                ecm.q qVar5 = cVar5.f283461a;
                if (i3 == 0) {
                    return new a16.b(qVar5, cVar5.f283462b, 20);
                }
                if (i3 == 1) {
                    return new bo9.d(qVar5, cVar5.f283463c, cVar5.d, cVar5.e, cVar5.f, cVar5.f283464g, 13);
                }
                throw new AssertionError(i3);
            case 10:
                return a();
            case 11:
                return b();
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                return e();
            case 15:
                return f();
            case 16:
                return g();
            case 17:
                return h();
            case 18:
                return i();
            case 19:
                return j();
            case 20:
                return k();
            case 21:
                return l();
            case 22:
                return m();
            case 23:
                return n();
            case 24:
                return o();
            case 25:
                return p();
            case 26:
                return q();
            case 27:
                return r();
            case 28:
                return s();
            default:
                vv5.e eVar6 = (vv5.e) obj2;
                ee0.a aVar40 = eVar6.f292453b;
                if (i3 == 0) {
                    return new xv5.a();
                }
                if (i3 == 1) {
                    xe0.e eVarB = eVar6.b();
                    mk0.a personalisationStorage = eVar6.f292454c.a();
                    s.j(personalisationStorage);
                    uk0.b personalisationStorageModifier = (uk0.b) eVar6.f292455g.get();
                    vv5.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
                    Intrinsics.checkNotNullParameter(personalisationStorageModifier, "personalisationStorageModifier");
                    return new xv5.g(eVarB, personalisationStorage.d(personalisationStorageModifier), ue5.e.a());
                }
                if (i3 == 2) {
                    return new xv5.b(eVar6.b(), ue5.e.a());
                }
                if (i3 == 3) {
                    return new xv5.c(eVar6.d.b(), (xv5.g) eVar6.f292456h.get());
                }
                if (i3 == 4) {
                    yv5.d dVar3 = new yv5.d((ue0.c) eVar6.f292457j.get());
                    fk3.a aVarA20 = eVar6.e.a();
                    s.j(aVarA20);
                    return new xv5.h(dVar3, aVarA20);
                }
                if (i3 != 5) {
                    throw new AssertionError(i3);
                }
                je0.d dVarB4 = aVar40.b();
                s.j(dVarB4);
                yk0.a aVarB9 = eVar6.f292452a.b();
                s.j(aVarB9);
                xe0.f fVarF3 = aVar40.f();
                s.j(fVarF3);
                return p0.j(dVarB4, fVarF3, aVarB9);
        }
    }
}
