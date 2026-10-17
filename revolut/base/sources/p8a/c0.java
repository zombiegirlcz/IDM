package p8a;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.db.AqueductDatabase;
import com.revolut.feature.credit.forbearance.application.impl.network.ForbearanceApplicationService;
import com.revolut.feature.credit_card.autopay.impl.network.ApiService;
import com.revolut.feature.credit_card.autopay.impl.v3.network.CreditCardAutopayService;
import com.revolut.feature.donations.impl.database.DonationsDatabase;
import com.revolut.feature.donations.impl.network.service.DonationsService;
import com.revolut.feature.insurance_common.data.network.InsuranceCommonService;
import com.revolut.feature.onboarding.impl.esignature.data.network.ESignatureService;
import com.revolut.retail.analytics.tracking.impl.privacy.PrivacyService;
import com.revolut.retail.feature.crypto_deposits.impl.database.CryptoDepositsDatabase;
import com.revolut.retail.feature.crypto_deposits.impl.network.CryptoDepositsService;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanUiService;
import et6.h3;
import java.time.Clock;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import no.d2;
import no.i2;
import no.j2;
import no.y2;
import qgk.i3;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f233919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f233920c;

    public /* synthetic */ c0(Object obj2, int i, int i2) {
        this.f233918a = i2;
        this.f233920c = obj2;
        this.f233919b = i;
    }

    private final Object a() {
        ppd.n nVar = (ppd.n) this.f233920c;
        xmg.a aVar = nVar.i;
        ite.a aVar2 = nVar.f238482a;
        int i = this.f233919b;
        switch (i) {
            case 0:
                gte.a aVarB = aVar2.b();
                vc.s.j(aVarB);
                return new opd.a(ImmutableSet.of(new pmd.b(aVarB)));
            case 1:
                return new knd.l1();
            case 2:
                xod.b bVarF = nVar.f();
                xod.e eVarG = nVar.g();
                fsd.c cVar = new fsd.c();
                thf.c cVarC = nVar.f238490h.c();
                vc.s.j(cVarC);
                xod.i iVar = new xod.i(new yod.f(cVar, cVarC, nVar.k()), nVar.h());
                lnd.h0 h0VarI = nVar.i();
                xod.s sVarJ = nVar.j();
                xod.n nVarH = nVar.h();
                gte.a aVarB2 = aVar2.b();
                vc.s.j(aVarB2);
                xod.h hVar = new xod.h(h0VarI, sVarJ, nVarH, aVarB2);
                xod.n nVarH2 = nVar.h();
                gte.a aVarB3 = aVar2.b();
                vc.s.j(aVarB3);
                return new xod.p(bVarF, eVarG, iVar, hVar, new xod.c(nVarH2, aVarB3));
            case 3:
                pzi.a aVar3 = (pzi.a) nVar.f238493k0.B.get();
                vc.s.j(aVar3);
                return new xnd.f(aVar3, nVar.f.b(), (xnd.s) nVar.P0.get());
            case 4:
                return ppd.d.a();
            case 5:
                mae.p pVarE = nVar.G0.e();
                vc.s.j(pVarE);
                f01.c cVarG = nVar.H0.g();
                t70.b bVarG = nVar.d.g();
                vc.s.j(bVarG);
                return pl1.d.k(pVarE, cVarG, bVarG);
            case 6:
                l61.a aVarB4 = aVar.b();
                vc.s.j(aVarB4);
                ang.f fVarE = aVar.e();
                zja.a aVarA = ((ika.b) nVar.I0).a();
                vc.s.j(aVarA);
                gte.a aVarB5 = aVar2.b();
                vc.s.j(aVarB5);
                mk0.a aVarA2 = nVar.J0.a();
                vc.s.j(aVarA2);
                return new dtd.d(aVarB4, fVarE, aVarA, aVarB5, aVarA2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        psb.a aVar = (psb.a) this.f233920c;
        int i = this.f233919b;
        if (i == 0) {
            return rga.l.d(aVar.f239465a);
        }
        if (i == 1) {
            return new awj.b(aVar.f239466b, 16);
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        pud.a aVar = (pud.a) this.f233920c;
        a31.a aVar2 = aVar.v;
        a31.a aVar3 = aVar.f239851n;
        a31.a aVar4 = aVar.e;
        ecm.q qVar = aVar.f239843a;
        int i = this.f233919b;
        if (i == 0) {
            return new lf9.c0(qVar, aVar.f239844b, aVar.f239845c, aVar.d, aVar4, aVar.f, aVar.f239846g, aVar.f239847h, aVar.i, aVar.f239848j, aVar.k, aVar.f239849l, aVar.f239850m, aVar3, aVar.o, aVar.D, aVar.F, aVar.f239857w, aVar.f239858x, aVar.f239859y, aVar.z, aVar.A, aVar2, aVar.B);
        }
        if (i == 1) {
            return pl1.d.C((qud.l) aVar.C.get());
        }
        if (i == 2) {
            return qlc.b.d(aVar.f239852p, aVar.f239853q, aVar.f239854r, aVar.f239855s, aVar4, aVar.f239856t, aVar3, aVar.u, aVar2, qVar);
        }
        if (i == 3) {
            return pl1.d.D((qud.o) aVar.E.get());
        }
        if (i == 4) {
            return qud.p.a();
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        int i = this.f233919b;
        if (i == 0) {
            return new hz.a();
        }
        if (i == 1) {
            return new py.d();
        }
        if (i == 2) {
            return new sx.b(((px.g) this.f233920c).f240528b.a());
        }
        if (i == 3) {
            return new gy.c();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        q38.b bVar = (q38.b) this.f233920c;
        int i = this.f233919b;
        switch (i) {
            case 0:
                u38.m mVarD = bVar.d();
                ite.a aVar = bVar.f241865a;
                oda.d dVar = bVar.f241873n;
                ang.f fVarE = bVar.f241868g.e();
                wsg.n nVarB = bVar.f241869h.b();
                g48.r0 r0VarC = bVar.i.c();
                r38.b bVar2 = (r38.b) bVar.f241880x.get();
                x79.a aVarA = bVar.d.a();
                vc.s.j(aVarA);
                p56.a aVar2 = new p56.a(dVar.f());
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                w38.s sVar = new w38.s(aVarB);
                wda.r rVarC = dVar.c();
                wa7.m mVarD2 = bVar.f.d();
                kge.d dVarB = bVar.f241867c.b();
                gte.a aVarB2 = aVar.b();
                vc.s.j(aVarB2);
                return new w38.q0(mVarD, fVarE, nVarB, r0VarC, bVar2, aVarA, aVar2, sVar, rVarC, mVarD2, new r10.f(dVarB, aVarB2));
            case 1:
                g48.r0 r0VarC2 = bVar.i.c();
                wsg.n nVarB2 = bVar.f241869h.b();
                ppk.f fVarA = bVar.f241870j.a();
                psi.a aVarA2 = bVar.k.a();
                vc.s.j(aVarA2);
                qpa.b bVarB = bVar.f241871l.b();
                vc.s.j(bVarB);
                return new r38.l(r0VarC2, nVarB2, fVarA, aVarA2, bVarB, (CoroutineScope) bVar.f241879w.get(), new mce.a(), bVar.f241873n.a(), bVar.f.d());
            case 2:
                return q38.g.a();
            case 3:
                usg.a aVar3 = bVar.f241869h;
                e48.a aVar4 = bVar.i;
                oda.d dVar2 = bVar.f241873n;
                usg.a aVar5 = bVar.f241869h;
                jt0.b bVar3 = new jt0.b(aVar3.b(), new r38.a(aVar3.b(), 0), new qq8.a(aVar3.b(), 1));
                zca.a aVar6 = new zca.a();
                wsg.n nVarB3 = aVar5.b();
                rea.m mVarF = dVar2.f();
                r38.b bVar4 = (r38.b) bVar.f241880x.get();
                oqk.l lVarB = bVar.k.b();
                vc.s.j(lVarB);
                z8e.a aVarD = bVar.f241872m.d();
                vc.s.j(aVarD);
                g48.r0 r0VarC3 = aVar4.c();
                gte.a aVarB3 = bVar.f241865a.b();
                vc.s.j(aVarB3);
                a9e.h hVar = (a9e.h) bVar.z.get();
                l80.e eVarH = bVar.f241874p.h();
                vc.s.j(eVarH);
                return new vy5.k0(bVar3, aVar6, nVarB3, mVarF, bVar4, lVarB, aVarD, r0VarC3, aVarB3, new u38.q(hVar, eVarH), bVar.f241875q.d(), bVar.f241876r.b(), (u38.a) bVar.A.get(), new cfa.h(), new i48.c(dVar2.d(), bVar.f241868g.e(), aVar5.b(), aVar4.c()), bVar.f241878t.a(), bVar.f.b(), new w38.t());
            case 4:
                mae.p pVarE = bVar.f241872m.e();
                vc.s.j(pVarE);
                f01.c cVarG = bVar.o.g();
                t70.b bVarG = bVar.f241874p.g();
                vc.s.j(bVarG);
                return pl1.d.z(pVarE, cVarG, bVarG);
            case 5:
                q06.d dVarA = bVar.f241877s.a();
                vc.s.j(dVarA);
                return new u38.b(dVarA);
            case 6:
                u38.m mVarD3 = bVar.d();
                ite.a aVar7 = bVar.f241865a;
                g48.r0 r0VarC4 = bVar.i.c();
                r38.b bVar5 = (r38.b) bVar.f241880x.get();
                ang.f fVarE2 = bVar.f241868g.e();
                wsg.n nVarB4 = bVar.f241869h.b();
                x79.a aVarA3 = bVar.d.a();
                vc.s.j(aVarA3);
                gte.a aVarB4 = aVar7.b();
                vc.s.j(aVarB4);
                w38.s sVar2 = new w38.s(aVarB4);
                wda.r rVarC2 = bVar.f241873n.c();
                wa7.m mVarD4 = bVar.f.d();
                kge.d dVarB2 = bVar.f241867c.b();
                gte.a aVarB5 = aVar7.b();
                vc.s.j(aVarB5);
                return new w38.w0(mVarD3, r0VarC4, bVar5, fVarE2, nVarB4, aVarA3, sVar2, rVarC2, mVarD4, new r10.f(dVarB2, aVarB5));
            case 7:
                r38.b bVar6 = (r38.b) bVar.f241880x.get();
                gte.a aVarB6 = bVar.f241865a.b();
                vc.s.j(aVarB6);
                return new a89.c(bVar6, aVarB6, new u38.d());
            case 8:
                return new w38.p((r38.b) bVar.f241880x.get(), new u38.d());
            case 9:
                oqk.l lVarB2 = bVar.k.b();
                vc.s.j(lVarB2);
                return new r25.e(lVarB2);
            case 10:
                return new i48.c(bVar.f241873n.d(), bVar.f241868g.e(), bVar.f241869h.b(), bVar.i.c());
            case 11:
                g48.r0 r0VarC5 = bVar.i.c();
                r38.b bVar7 = (r38.b) bVar.f241880x.get();
                gte.a aVarB7 = bVar.f241865a.b();
                vc.s.j(aVarB7);
                return new w38.m(r0VarC5, bVar7, aVarB7);
            case 12:
                g48.r0 r0VarC6 = bVar.i.c();
                gte.a aVarB8 = bVar.f241865a.b();
                vc.s.j(aVarB8);
                p38.a aVarA4 = bVar.i.a();
                vc.s.j(aVarA4);
                return new w38.a1(r0VarC6, aVarB8, aVarA4);
            case 13:
                qpa.b bVarB2 = bVar.f241871l.b();
                vc.s.j(bVarB2);
                g48.r0 r0VarC7 = bVar.i.c();
                r38.b bVar8 = (r38.b) bVar.f241880x.get();
                l80.e eVarH2 = bVar.f241874p.h();
                vc.s.j(eVarH2);
                return new w38.e(bVarB2, r0VarC7, bVar8, eVarH2, new w38.t());
            case 14:
                return new x38.h((r38.b) bVar.f241880x.get());
            case 15:
                return new x38.d((r38.b) bVar.f241880x.get());
            case 16:
                return new m48.f(bVar.i.c(), bVar.f241868g.e());
            case 17:
                return new m48.a();
            case 18:
                return new m48.c();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        q57.a aVar = (q57.a) this.f233920c;
        whc.s sVar = aVar.f242324g;
        ws6.a aVar2 = aVar.f242322b;
        bt6.b bVar = aVar.f;
        us6.q qVar = aVar.f242321a;
        int i = this.f233919b;
        if (i == 0) {
            zt6.b bVar2 = (zt6.b) qVar.f282696o1.get();
            vc.s.j(bVar2);
            o57.a aVar3 = (o57.a) aVar.f242328m.get();
            ct6.w wVarQ = qVar.q();
            vc.s.j(wVarQ);
            return new r57.b(wVarQ, aVar3, bVar2);
        }
        if (i != 1) {
            if (i == 2) {
                return new r57.a();
            }
            throw new AssertionError(i);
        }
        b9k.f fVarC = qVar.c();
        gr6.e eVarA = aVar2.a();
        vc.s.j(eVarA);
        gr6.a aVarA = aVar.f242323c.a();
        vc.s.j(aVarA);
        et6.u0 u0VarJ = qVar.j();
        ct6.w wVarQ2 = qVar.q();
        vc.s.j(wVarQ2);
        jr6.g gVar = (jr6.g) qVar.U0.get();
        vc.s.j(gVar);
        u57.e eVar = new u57.e(wVarQ2, gVar);
        gr6.h hVarK = qVar.k();
        vc.s.j(hVarK);
        et6.p1 p1VarO = qVar.o();
        vc.s.j(p1VarO);
        ct6.w wVarQ3 = qVar.q();
        vc.s.j(wVarQ3);
        x57.g gVar2 = new x57.g(wVarQ3, new ft6.n());
        r10.v vVarG = qVar.g();
        h3 h3Var = (h3) qVar.f282677e1.get();
        vc.s.j(h3Var);
        dmd.b bVar3 = (dmd.b) aVar.d.M0.get();
        vc.s.j(bVar3);
        ct6.w wVarQ4 = qVar.q();
        vc.s.j(wVarQ4);
        z57.c cVar = new z57.c(bVar3, wVarQ4);
        ct6.w wVarQ5 = qVar.q();
        vc.s.j(wVarQ5);
        ct6.u uVar = (ct6.u) qVar.f282694n1.get();
        vc.s.j(uVar);
        aia.c cVar2 = (aia.c) ((yha.a) aVar.e).A.get();
        vc.s.j(cVar2);
        y57.e eVar2 = new y57.e(wVarQ5, uVar, cVar2);
        zjh.i iVarH = bVar.h();
        ct6.w wVarQ6 = qVar.q();
        vc.s.j(wVarQ6);
        gr6.e eVarA2 = aVar2.a();
        vc.s.j(eVarA2);
        b67.f fVar = new b67.f(wVarQ6, eVarA2);
        gr6.e eVarA3 = aVar2.a();
        vc.s.j(eVarA3);
        ct6.w wVarQ7 = qVar.q();
        vc.s.j(wVarQ7);
        c67.d dVar = new c67.d(wVarQ7, eVarA3);
        ct6.w wVarQ8 = qVar.q();
        vc.s.j(wVarQ8);
        a67.f fVar2 = new a67.f(wVarQ8, bVar.j());
        ct6.w wVarQ9 = qVar.q();
        vc.s.j(wVarQ9);
        kgc.d dVarB = sVar.b();
        vc.s.j(dVarB);
        w57.d dVar2 = new w57.d(wVarQ9, dVarB, new ft6.l());
        wwa.b bVarA = aVar.f242325h.a();
        vc.s.j(bVarA);
        hia.a aVar4 = (hia.a) aVar.i.e.get();
        vc.s.j(aVar4);
        jf1.a aVarA2 = aVar.f242326j.a();
        vc.s.j(aVarA2);
        bgc.e eVarC = sVar.c();
        vc.s.j(eVarC);
        r10.d dVarF = bVar.f();
        a61.a aVarG = bVar.g();
        r10.f fVarI = bVar.i();
        ang.f fVarE = aVar.k.e();
        ppg.b bVarB = ((wpg.l) aVar.f242327l).b();
        vc.s.j(bVarB);
        return new s57.m(fVarC, eVarA, aVarA, u0VarJ, eVar, hVarK, p1VarO, gVar2, vVarG, h3Var, cVar, eVar2, iVarH, fVar, dVar, fVar2, dVar2, bVarA, aVar4, aVarA2, eVarC, dVarF, aVarG, fVarI, fVarE, bVarB);
    }

    private final Object g() {
        q6e.a aVar = (q6e.a) this.f233920c;
        a31.a aVar2 = aVar.d;
        a31.a aVar3 = aVar.k;
        a31.a aVar4 = aVar.f242571c;
        a31.a aVar5 = aVar.H;
        a31.a aVar6 = aVar.f242583q;
        a31.a aVar7 = aVar.z;
        a31.a aVar8 = aVar.f242579l;
        a31.a aVar9 = aVar.K;
        a31.a aVar10 = aVar.J;
        a31.a aVar11 = aVar.R;
        a31.a aVar12 = aVar.v;
        a31.a aVar13 = aVar.E;
        a31.a aVar14 = aVar.A;
        a31.a aVar15 = aVar.D;
        a31.a aVar16 = aVar.o;
        a31.a aVar17 = aVar.i;
        a31.a aVar18 = aVar.f242574g;
        a31.a aVar19 = aVar.f242582p;
        a31.a aVar20 = aVar.e;
        a31.a aVar21 = aVar.f;
        a31.a aVar22 = aVar.f242575h;
        a31.a aVar23 = aVar.f242569b;
        int i = this.f233919b;
        switch (i) {
            case 0:
                return new r6e.b0(aVar.f242567a, aVar23, aVar4, aVar2, aVar20, aVar21, aVar18, aVar22, aVar17, aVar.f242577j, aVar.i0, aVar.g0, aVar12, aVar.f242587w, aVar.f242588x, aVar.f242589y, aVar7, aVar14, aVar.B, aVar.C, aVar15, aVar13, aVar.F, aVar.G, aVar3, aVar5, aVar.I, aVar16, aVar10, aVar9, aVar.L, aVar.M, aVar19, aVar.N, aVar.O, aVar.P, aVar.Q, aVar11, aVar.S, aVar.T);
            case 1:
                r6e.a0 a0Var = (r6e.a0) ((r6e.i0) aVar.f242576h0.get()).b();
                vc.s.k(a0Var);
                return a0Var;
            case 2:
                return new r6e.i0(aVar23, aVar4, aVar21, aVar20, aVar3, aVar18, aVar8, aVar.f242580m, aVar17, aVar.g0, aVar16, aVar19, aVar2, aVar6, aVar.f242584r, aVar.f242585s, aVar.f242586t, aVar22, aVar.u);
            case 3:
                r6e.b bVar = (r6e.b) ((r6e.c0) aVar.f0.get()).b();
                vc.s.k(bVar);
                return bVar;
            case 4:
                return new r6e.c0(aVar.f242581n);
            case 5:
                return new b7e.d(aVar23, aVar.f242578k0, aVar22, aVar15, aVar21, aVar20, aVar14, aVar13, aVar.i0, aVar.g0, aVar19, aVar18, aVar.U, aVar12, aVar.V, aVar17, aVar11, aVar.W, aVar16, aVar10, aVar.X, aVar9, aVar.Y, aVar.Z, aVar.f242568a0, aVar8, aVar7, aVar.f242570b0, aVar.c0, aVar.f242572d0, aVar6, aVar5, aVar.f242573e0);
            case 6:
                r6e.o oVar = (r6e.o) ((r6e.b0) aVar.j0.get()).b();
                vc.s.k(oVar);
                return oVar;
            case 7:
                return qw7.u.b(aVar.g0);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        q8b.a aVar = (q8b.a) this.f233920c;
        xmg.a aVar2 = aVar.f243049c;
        l70.e eVar = aVar.f243047a;
        int i = this.f233919b;
        if (i != 0) {
            if (i == 1) {
                return new o8b.f();
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            qd0.b bVarN = eVar.n();
            vc.s.j(bVarN);
            return new o8b.g(bVarN);
        }
        z80.b bVarS = eVar.s();
        vc.s.j(bVarS);
        fk3.a aVarA = aVar.f243048b.a();
        vc.s.j(aVarA);
        qd0.b bVarN2 = eVar.n();
        vc.s.j(bVarN2);
        ang.a aVar3 = new ang.a((ue0.c) aVar2.f307254q.get());
        t70.g gVarO = eVar.o();
        vc.s.j(gVarO);
        gte.a aVarB = aVar.d.b();
        vc.s.j(aVarB);
        o8b.f fVar = (o8b.f) aVar.e.get();
        x80.a aVarQ = eVar.q();
        vc.s.j(aVarQ);
        l61.a aVarB2 = aVar2.b();
        vc.s.j(aVarB2);
        return new o8b.c(bVarS, aVarA, bVarN2, aVar3, gVarO, aVarB, fVar, aVarQ, aVarB2);
    }

    private final Object i() {
        qbj.m mVar = (qbj.m) this.f233920c;
        int i = this.f233919b;
        switch (i) {
            case 0:
                sd5.c cVarA = mVar.f244308a.a();
                vc.s.j(cVarA);
                return new kbj.d(cVarA);
            case 1:
                CryptoDepositsService cryptoDepositsService = (CryptoDepositsService) mVar.k.get();
                ne0.j jVar = (ne0.j) mVar.f244314l.get();
                ne0.j jVar2 = (ne0.j) mVar.f244315m.get();
                nbj.a aVar = (nbj.a) mVar.o.get();
                kg.o oVarA = fe0.c.a();
                ik5.f fVar = (ik5.f) ((ak5.i) mVar.f).f5696m.get();
                vc.s.j(fVar);
                return new ubj.h(cryptoDepositsService, jVar, jVar2, aVar, oVarA, fVar, (ue0.c) mVar.f244317p.get());
            case 2:
                return pl1.d.p((Retrofit) mVar.f244313j.get());
            case 3:
                Retrofit retrofitI = ((c21.b) mVar.f244309b).i();
                vc.s.j(retrofitI);
                return pl1.d.s((kg.o) mVar.i.get(), retrofitI);
            case 4:
                kg.o oVarH = ((c21.b) mVar.f244309b).h();
                vc.s.j(oVarH);
                return oVarH;
            case 5:
                return new ne0.d();
            case 6:
                return qbj.l.a();
            case 7:
                return pl1.d.o((CryptoDepositsDatabase) mVar.f244316n.get());
            case 8:
                Context context = mVar.f244310c;
                yk0.a aVarB = mVar.d.b();
                vc.s.j(aVarB);
                return pl1.d.r(context, aVarB, ((c21.b) mVar.f244309b).b());
            case 9:
                je0.d dVarB = mVar.e.b();
                vc.s.j(dVarB);
                yk0.a aVarB2 = mVar.d.b();
                vc.s.j(aVarB2);
                xe0.f fVarF = mVar.e.f();
                vc.s.j(fVarF);
                return va.g.n(dVarB, fVarF, aVarB2);
            case 10:
                ibj.a aVar2 = (ibj.a) mVar.f244318q.get();
                sf0.h hVarB = mVar.f244311g.b();
                vc.s.j(hVarB);
                sd5.c cVarA2 = mVar.f244308a.a();
                vc.s.j(cVarA2);
                return new rbj.e(aVar2, hVarB, cVarA2);
            case 11:
                return new vbj.c((ue0.c) mVar.f244317p.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        qc9.c cVar = (qc9.c) this.f233920c;
        int i = this.f233919b;
        switch (i) {
            case 0:
                return new oc9.a((sri.m) cVar.f244626r.get());
            case 1:
                return pl1.d.v(cVar.f244615a);
            case 2:
                return new oc9.b();
            case 3:
                return new o99.c();
            case 4:
                return new o99.a((p99.c) cVar.f244630x.get());
            case 5:
                return new p99.c((ne0.j) cVar.v.get(), (ESignatureService) cVar.f244629w.get());
            case 6:
                return new ne0.d();
            case 7:
                return qw7.u.n(((nj0.d) cVar.f244616b).f());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        qf5.c cVar = (qf5.c) this.f233920c;
        a31.a aVar = cVar.e;
        int i = this.f233919b;
        if (i == 0) {
            return new ak5.b(cVar.f245244a, cVar.f245255r, cVar.f, cVar.f245247g, cVar.f245248h, cVar.i, aVar, cVar.f245249j, cVar.k, cVar.f245250l, cVar.f245251m, cVar.f245252n, cVar.o, cVar.f245253p);
        }
        if (i == 1) {
            return pl1.d.B((tf5.b) cVar.f245254q.get());
        }
        if (i == 2) {
            return t2d.c.h(cVar.f245245b, cVar.f245246c, cVar.d, aVar);
        }
        throw new AssertionError(i);
    }

    private final Object l() {
        qga.b bVar = (qga.b) this.f233920c;
        ee0.a aVar = bVar.d;
        int i = this.f233919b;
        if (i == 0) {
            return new rga.c(new i90.b());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        yk0.a aVarB = bVar.f245716c.b();
        vc.s.j(aVarB);
        xe0.f fVarF = aVar.f();
        vc.s.j(fVarF);
        je0.d dVarB = aVar.b();
        vc.s.j(dVarB);
        return rga.l.D(dVarB, fVarF, aVarB);
    }

    private final Object m() {
        qgk.i0 i0Var = (qgk.i0) this.f233920c;
        int i = this.f233919b;
        if (i != 0) {
            if (i == 1) {
                return i0Var.f246008a.a();
            }
            if (i == 2) {
                return new snk.u();
            }
            throw new AssertionError(i);
        }
        ImmutableSet immutableSetOf = ImmutableSet.of(new pgk.c(e4m.b.a(i0Var.Y)));
        ogk.e eVar = new ogk.e();
        ajk.b bVarF = i0Var.f246010b.f();
        gte.a aVarB = i0Var.f246011c.b();
        vc.s.j(aVarB);
        return new ogk.d(immutableSetOf, eVar, bVarF, aVarB);
    }

    private final Object n() {
        i3 i3Var = (i3) this.f233920c;
        int i = this.f233919b;
        switch (i) {
            case 0:
                kjk.u uVar = (kjk.u) i3Var.K.get();
                ffk.t tVarF = i3Var.e.f();
                vc.s.j(tVarF);
                l61.a aVarB = i3Var.f.b();
                vc.s.j(aVarB);
                gte.a aVarB2 = i3Var.f246038g.b();
                vc.s.j(aVarB2);
                return new wik.t(uVar, tVarF, aVarB, aVarB2);
            case 1:
                return new kjk.f0((PricingPlanUiService) i3Var.G.get(), i3Var.j(), (ne0.j) i3Var.J.get(), new mjk.x(i3Var.i(), new mjk.h(), new mjk.i()), new mjk.u(i3Var.i()), new kl.c0(i3Var.i(), new mjk.i()));
            case 2:
                return qgh.c.s(i3Var.f246035a, (Retrofit) i3Var.F.get());
            case 3:
                return qgh.c.l(i3Var.f246035a, ((nj0.d) i3Var.f246036b).f(), (kg.o) i3Var.E.get());
            case 4:
                return qgh.c.t(i3Var.f246035a, fe0.c.a(), new cjk.i());
            case 5:
                kg.o oVar = (kg.o) i3Var.H.get();
                le0.b bVarC = i3Var.f246037c.c();
                vc.s.j(bVarC);
                return qgh.c.r(oVar, bVarC);
            case 6:
                ee0.a aVar = i3Var.f246037c;
                return qgh.c.m(fe0.c.a(), new cjk.i());
            case 7:
                return new ne0.d();
            case 8:
                cha.b bVarC2 = i3Var.e.c();
                vc.s.j(bVarC2);
                ffk.t tVarF2 = i3Var.e.f();
                vc.s.j(tVarF2);
                gte.a aVarB3 = i3Var.f246038g.b();
                vc.s.j(aVarB3);
                return new wik.e(bVarC2, tVarF2, aVarB3);
            case 9:
                al4.q qVarA = i3Var.f246039h.a();
                vc.s.j(qVarA);
                l61.a aVarB4 = i3Var.f.b();
                vc.s.j(aVarB4);
                return new wik.d(qVarA, aVarB4);
            case 10:
                gte.a aVarB5 = i3Var.f246038g.b();
                vc.s.j(aVarB5);
                pfk.x xVarD = i3Var.e.d();
                vc.s.j(xVarD);
                return new wik.n(aVarB5, xVarD, (kjk.u) i3Var.K.get());
            case 11:
                e4m.e eVar = i3Var.P;
                ckg.a aVar2 = i3Var.i;
                kjk.t tVar = (kjk.t) eVar.get();
                vjg.g gVarA = aVar2.a();
                vc.s.j(gVarA);
                ekg.g gVarB = aVar2.b();
                q89.e eVarA = i3Var.f246040j.a();
                vc.s.j(eVarA);
                return new wik.u(tVar, gVarA, gVarB, eVarA);
            case 12:
                return new kjk.t(i3Var.j());
            case 13:
                xoj.a aVarA = i3Var.f246044p.a();
                vc.s.j(aVarA);
                ijb.a aVarG = ((blb.e) i3Var.f246045q).g();
                vc.s.j(aVarG);
                return new dkk.h0(aVarA, aVarG);
            case 14:
                i3Var.getClass();
                return new djk.a(new nd.o(new ejk.b()), new djk.b());
            case 15:
                ffk.t tVarF3 = i3Var.e.f();
                vc.s.j(tVarF3);
                return new nd.p(tVarF3, new zlk.c());
            case 16:
                q89.e eVarA2 = i3Var.f246040j.a();
                vc.s.j(eVarA2);
                return new qy5.a(eVarA2);
            case 17:
                si7.a aVarA2 = i3Var.f246041l.a();
                vc.s.j(aVarA2);
                return new ejk.e(new ejk.f(aVarA2), new ejk.b(), new cjk.b());
            case 18:
                pre.c cVarA = i3Var.f246050x.a();
                vc.s.j(cVarA);
                ang.f fVarE = i3Var.f.e();
                gte.a aVarB6 = i3Var.f246038g.b();
                vc.s.j(aVarB6);
                return new jjk.c(new wik.q(cVarA, fVarE, aVarB6), new jjk.d());
            case 19:
                return new ijk.c(new ijk.b(), new ijk.a());
            case 20:
                bgc.e eVarC = i3Var.f246051y.c();
                vc.s.j(eVarC);
                return new fjk.a(new hjk.a(new nd.m(eVarC)));
            case 21:
                return new gjk.a();
            case 22:
                return new cjk.g(new cjk.d());
            case 23:
                return new nd.m(((s41.a) i3Var.A).d(), i3Var.f(), new ajk.c(i3Var.g()));
            case 24:
                ffk.t tVarF4 = i3Var.e.f();
                vc.s.j(tVarF4);
                sjk.h hVar = new sjk.h();
                gte.a aVarB7 = i3Var.f246038g.b();
                vc.s.j(aVarB7);
                kjk.c cVar = new kjk.c(i3Var.j());
                l80.e eVarH = i3Var.B.h();
                vc.s.j(eVarH);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.widget.b(tVarF4, hVar, aVarB7, cVar, eVarH);
            case 25:
                e4m.e eVar2 = i3Var.X;
                efk.a aVar3 = i3Var.e;
                ite.a aVar4 = i3Var.f246038g;
                sri.m mVar = (sri.m) eVar2.get();
                gte.a aVarB8 = aVar4.b();
                vc.s.j(aVarB8);
                ffk.t tVarF5 = aVar3.f();
                vc.s.j(tVarF5);
                ffk.e0 e0Var = (ffk.e0) aVar3.N.get();
                vc.s.j(e0Var);
                pgk.l lVar = new pgk.l();
                ajk.f fVarH = i3Var.h();
                skk.a aVar5 = new skk.a();
                ajk.d dVarG = i3Var.g();
                gte.a aVarB9 = aVar4.b();
                vc.s.j(aVarB9);
                return new pgk.k(mVar, aVarB8, tVarF5, e0Var, lVar, fVarH, aVar5, dVarG, new ef3.b(aVarB9, 1));
            case 26:
                return qgh.c.q(i3Var.D);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        qr7.b bVar = (qr7.b) this.f233920c;
        nj0.a aVar = bVar.f248660a;
        ee0.a aVar2 = bVar.f248661b;
        int i = this.f233919b;
        if (i == 0) {
            InsuranceCommonService insuranceCommonService = (InsuranceCommonService) bVar.f.get();
            ne0.j jVar = (ne0.j) bVar.f248663g.get();
            ue0.c cVar = (ue0.c) bVar.f248664h.get();
            mk0.a aVarA = bVar.d.a();
            vc.s.j(aVarA);
            return new or7.c(insuranceCommonService, jVar, cVar, aVarA, ((nj0.d) aVar).f216295c);
        }
        if (i == 1) {
            return qlc.b.x(((nj0.d) aVar).f());
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        je0.d dVarB = aVar2.b();
        vc.s.j(dVarB);
        yk0.a aVarB = bVar.f248662c.b();
        vc.s.j(aVarB);
        xe0.f fVarF = aVar2.f();
        vc.s.j(fVarF);
        return qlc.b.B(dVarB, aVarB, fVarF);
    }

    private final Object p() {
        qud.c cVar = (qud.c) this.f233920c;
        rtd.b bVar = cVar.f249364b;
        int i = this.f233919b;
        switch (i) {
            case 0:
                return new fwd.a((gwd.a) cVar.A.get());
            case 1:
                return new gwd.a((hwd.a) cVar.z.get());
            case 2:
                return new hwd.a(bVar.h());
            case 3:
                return new iwd.b(bVar.h());
            case 4:
                sri.m mVar = (sri.m) cVar.C.get();
                yud.g gVarD = cVar.f249363a.d();
                vc.s.j(gVarD);
                wsg.n nVarB = cVar.d.b();
                xoj.a aVarA = cVar.e.a();
                vc.s.j(aVarA);
                ai5.b bVarB = cVar.f.b();
                vc.s.j(bVarB);
                return new pud.g(mVar, gVarD, nVarB, aVarA, bVarB);
            case 5:
                return qlc.b.y(cVar.f249365c);
            case 6:
                return new fwd.b((gwd.a) cVar.A.get());
            case 7:
                return new pud.h(cVar.i());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object q() {
        int i = this.f233919b;
        if (i == 0) {
            return new rxc.e(((qxc.b) this.f233920c).f250068a.a());
        }
        if (i == 1) {
            return new oxc.b();
        }
        throw new AssertionError(i);
    }

    private final Object r() {
        qy8.a aVar = (qy8.a) this.f233920c;
        th0.a aVar2 = aVar.f250245a;
        int i = this.f233919b;
        if (i == 0) {
            return new bz8.a((xu.g) aVar.e.get(), (xu.h) aVar.f.get(), (xu.j) aVar.f250248g.get());
        }
        if (i == 1) {
            ih0.b remoteConfig = aVar2.f();
            vc.s.j(remoteConfig);
            qy8.g.Companion.getClass();
            Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
            return new xu.g(remoteConfig);
        }
        if (i == 2) {
            ih0.b remoteConfig2 = aVar2.f();
            vc.s.j(remoteConfig2);
            qy8.g.Companion.getClass();
            Intrinsics.checkNotNullParameter(remoteConfig2, "remoteConfig");
            return new xu.h(remoteConfig2);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        ih0.b remoteConfig3 = aVar2.f();
        vc.s.j(remoteConfig3);
        qy8.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(remoteConfig3, "remoteConfig");
        return new xu.j(remoteConfig3);
    }

    private final Object s() {
        qz4.a aVar = (qz4.a) this.f233920c;
        c21.e eVar = aVar.f250344c;
        qz4.f fVar = aVar.f250343b;
        int i = this.f233919b;
        switch (i) {
            case 0:
                return new sz4.d(((dw3.c1) aVar.f250342a).b());
            case 1:
                return new rz4.b((uz4.c) aVar.f250353r.get());
            case 2:
                return new uz4.c((ForbearanceApplicationService) aVar.o.get(), (t90.g) aVar.f250351p.get(), (ne0.j) aVar.f250352q.get(), ((nj0.d) aVar.e).k());
            case 3:
                return qw7.u.p(fVar, (Retrofit) aVar.f250350n.get());
            case 4:
                Retrofit retrofitJ = ((c21.b) eVar).j();
                vc.s.j(retrofitJ);
                return qw7.u.o(fVar, retrofitJ, (kg.o) aVar.f250349m.get());
            case 5:
                kg.o oVarH = ((c21.b) eVar).h();
                vc.s.j(oVarH);
                return qw7.u.s(fVar, oVarH);
            case 6:
                return new t90.g(new e84.e(new v90.h(), new v90.e(new u90.x()), new v90.e(aVar.f()), new v90.c(), new v90.e(new u90.a0()), new v90.d(aVar.e(), new t90.a(), aVar.f(), new u90.c0(new u90.y())), new v90.i(aVar.e()), new v90.g(new t90.a(), new u90.y(), new u90.a0(), aVar.f()), new v90.b(aVar.e(), new t90.a(), aVar.f())));
            case 7:
                return new ne0.d();
            case 8:
                return new sz4.b((mz4.b) aVar.f250348l.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object t() {
        int i = this.f233919b;
        if (i == 0) {
            r13.a aVar = (r13.a) this.f233920c;
            return new h5c.b(aVar.f250891a, aVar.f250892b, aVar.f250893c, aVar.d, aVar.e, aVar.f, 7);
        }
        if (i == 1) {
            return x13.j.a();
        }
        if (i == 2) {
            return x13.e.a();
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object gson;
        Object bVar;
        Object pVar;
        Object bVar2;
        Object zVar;
        Object g1Var;
        int i = this.f233918a;
        int i2 = 0;
        int i3 = this.f233919b;
        Object obj2 = this.f233920c;
        switch (i) {
            case 0:
                d0 d0Var = (d0) obj2;
                l70.e eVar = d0Var.f233933h;
                if (i3 == 0) {
                    return new d8a.b();
                }
                if (i3 == 1) {
                    z80.b bVarS = eVar.s();
                    vc.s.j(bVarS);
                    return new vca.f(bVarS);
                }
                if (i3 == 2) {
                    return x1.a();
                }
                if (i3 != 3) {
                    throw new AssertionError(i3);
                }
                n8b.b bVarB = d0Var.f233940r.b();
                vc.s.j(bVarB);
                fk3.a aVarA = d0Var.f233941s.a();
                vc.s.j(aVarA);
                z80.b bVarS2 = eVar.s();
                vc.s.j(bVarS2);
                return new c9a.b(bVarB, aVarA, bVarS2);
            case 1:
                pa6.m mVar = (pa6.m) obj2;
                switch (i3) {
                    case 0:
                        ya6.q qVar = (ya6.q) mVar.M.get();
                        xua.a aVarA2 = mVar.f234393j.a();
                        vc.s.j(aVarA2);
                        xvh.c cVarA = ((a6d.e) mVar.k).a();
                        vc.s.j(cVarA);
                        pre.c cVarA2 = mVar.f234394l.a();
                        vc.s.j(cVarA2);
                        ya6.q qVar2 = (ya6.q) mVar.M.get();
                        wsg.n nVarB = mVar.f234395m.b();
                        j61.b bVarC = mVar.f234396n.c();
                        vc.s.j(bVarC);
                        wj0.a aVarI = ((nj0.d) mVar.f234386b).i();
                        vc.s.j(aVarI);
                        sa6.a0 a0Var = (sa6.a0) mVar.P.get();
                        sa6.e eVar2 = (sa6.e) mVar.S.get();
                        l93.b bVarG = mVar.f234397p.g();
                        vc.s.j(bVarG);
                        nyb.k kVarC = mVar.f234398q.c();
                        vc.s.j(kVarC);
                        return new sa6.t(qVar, aVarA2, cVarA, cVarA2, new sa6.j0(qVar2, nVarB, bVarC, aVarI, a0Var, eVar2, bVarG, kVarC, mVar.f234399r.e()));
                    case 1:
                        rj0.a aVar = ((nj0.d) mVar.f234386b).i;
                        DonationsService donationsService = (DonationsService) mVar.J.get();
                        ja6.f fVar = (ja6.f) mVar.L.get();
                        ne0.d dVar = new ne0.d();
                        ne0.n nVarA = pa6.d0.a();
                        ne0.n nVarA2 = pa6.c0.a();
                        xe0.e eVarE = mVar.e();
                        CoroutineScope coroutineScopeA = mVar.f234392h.a();
                        vc.s.j(coroutineScopeA);
                        b80.c cVarP = mVar.i.p();
                        vc.s.j(cVarP);
                        gson = new ya6.z(aVar, donationsService, fVar, dVar, nVarA, nVarA2, eVarE, coroutineScopeA, cVarP);
                        break;
                    case 2:
                        pa6.z zVar2 = mVar.f234388c;
                        DonationsService donationsService2 = (DonationsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) mVar.I.get(), "retrofit", DonationsService.class, "create(...)");
                        vc.s.k(donationsService2);
                        return donationsService2;
                    case 3:
                        pa6.z zVar3 = mVar.f234388c;
                        Retrofit retrofitI = ((c21.b) mVar.d).i();
                        vc.s.j(retrofitI);
                        kg.o oVar = (kg.o) mVar.H.get();
                        return j6.a.B(p.a.x(retrofitI, "retrofit", oVar, "gson"), oVar, "build(...)");
                    case 4:
                        pa6.z zVar4 = mVar.f234388c;
                        gson = ((c21.b) mVar.d).h();
                        vc.s.j(gson);
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        break;
                    case 5:
                        DonationsDatabase database = (DonationsDatabase) mVar.K.get();
                        pa6.y.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        ja6.f fVarH = database.h();
                        vc.s.k(fVarH);
                        return fVarH;
                    case 6:
                        Context context = mVar.e;
                        yk0.a databaseSessionProvider = mVar.f.b();
                        vc.s.j(databaseSessionProvider);
                        de0.a databaseEncryptionMigratorFactory = ((c21.b) mVar.d).b();
                        pa6.y.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        DonationsDatabase.Companion aVar2 = DonationsDatabase.INSTANCE;
                        aVar2.getClass();
                        DonationsDatabase donationsDatabase = (DonationsDatabase) aVar2.a(context, databaseSessionProvider, new Migration[]{ka6.a.f182434c, ka6.b.f182435c, ka6.c.f182436c, ka6.d.f182437c, ka6.e.f182438c}, databaseEncryptionMigratorFactory);
                        vc.s.k(donationsDatabase);
                        return donationsDatabase;
                    case 7:
                        ya6.e0 e0Var = (ya6.e0) mVar.N.get();
                        l80.e eVarH = mVar.i.h();
                        vc.s.j(eVarH);
                        return new sa6.a0(e0Var, eVarH, (ya6.n) mVar.O.get());
                    case 8:
                        return new ya6.h0(mVar.e());
                    case 9:
                        lte.c cVar = (lte.c) mVar.o.f168370h.get();
                        vc.s.j(cVar);
                        return new ya6.o(cVar);
                    case 10:
                        return new sa6.e((ya6.d) mVar.R.get());
                    case 11:
                        return new ya6.d((DonationsService) mVar.J.get(), (ja6.b) mVar.Q.get(), new ne0.d());
                    case 12:
                        return p7h.b.k((DonationsDatabase) mVar.K.get());
                    case 13:
                        wsg.n nVarB2 = mVar.f234395m.b();
                        fk3.a aVarA3 = mVar.f234400s.a();
                        vc.s.j(aVarA3);
                        return new sa6.j(aVarA3, nVarB2);
                    case 14:
                        return new sa6.z((ya6.b0) mVar.V.get());
                    case 15:
                        return new ya6.d0(mVar.e());
                    case 16:
                        sa6.a0 a0Var2 = (sa6.a0) mVar.P.get();
                        lfm.c cVarB = ((g8b.a) mVar.f234401t).b();
                        vc.s.j(cVarB);
                        return new xa6.d(a0Var2, cVarB);
                    case 17:
                        return new cb6.b();
                    case 18:
                        return new ga6.a(mVar.f234384a.a());
                    case 19:
                        return new db6.a();
                    case 20:
                        return new sa6.b((ya6.e) mVar.f234387b0.get(), (ya6.q) mVar.M.get());
                    case 21:
                        return new ya6.l((DonationsService) mVar.J.get(), (ja6.f) mVar.L.get(), new ne0.d());
                    case 22:
                        aa6.c cVar2 = (aa6.c) mVar.T.get();
                        whf.b bVarA = mVar.f234402w.a();
                        vc.s.j(bVarA);
                        nyb.m0 m0VarG = mVar.f234398q.g();
                        vc.s.j(m0VarG);
                        return new sa6.h(cVar2, bVarA, m0VarG);
                    case 23:
                        ang.f fVarE = mVar.f234399r.e();
                        t70.g gVarO = mVar.i.o();
                        vc.s.j(gVarO);
                        return new uc6.a(fVarE, gVarO);
                    case 24:
                        return new sa6.x(mVar.F.e());
                    default:
                        throw new AssertionError(i3);
                }
                return gson;
            case 2:
                pb5.a aVar3 = (pb5.a) obj2;
                c21.e eVar3 = aVar3.f234634b;
                ee0.a aVar4 = aVar3.d;
                ava.a aVar5 = aVar3.f;
                ite.a aVar6 = aVar3.f234636g;
                nj0.a aVar7 = aVar3.f234635c;
                pb5.g gVar = aVar3.f234633a;
                switch (i3) {
                    case 0:
                        ob5.a aVar8 = (ob5.a) aVar3.f234641n.get();
                        xua.a aVarA4 = aVar5.a();
                        vc.s.j(aVarA4);
                        gte.a aVarB = aVar6.b();
                        vc.s.j(aVarB);
                        bVar = new qb5.b(aVar8, aVarA4, aVarB, aVar3.f234637h.e());
                        break;
                    case 1:
                        return new xb5.g((ApiService) aVar3.f234639l.get(), new ne0.d(), ((nj0.d) aVar7).k(), (ue0.c) aVar3.f234640m.get());
                    case 2:
                        return p7h.b.i(gVar, (Retrofit) aVar3.k.get());
                    case 3:
                        Retrofit retrofitJ = ((c21.b) eVar3).j();
                        vc.s.j(retrofitJ);
                        return p7h.b.m(gVar, retrofitJ, (kg.o) aVar3.f234638j.get());
                    case 4:
                        kg.o oVarH = ((c21.b) eVar3).h();
                        vc.s.j(oVarH);
                        return p7h.b.n(gVar, oVarH);
                    case 5:
                        le0.b bVarC2 = aVar4.c();
                        vc.s.j(bVarC2);
                        kg.o oVarA = fe0.c.a();
                        yk0.a aVarB2 = aVar3.e.b();
                        vc.s.j(aVarB2);
                        xe0.f fVarF = aVar4.f();
                        vc.s.j(fVarF);
                        return p7h.b.o(oVarA, bVarC2, fVarF, aVarB2);
                    case 6:
                        hd.r rVar = new hd.r((CreditCardAutopayService) aVar3.f234642p.get(), p7h.b.q(new ne0.d()), p7h.b.r((ue0.c) aVar3.f234640m.get()));
                        ij0.a aVar9 = ((nj0.d) aVar7).f216295c;
                        gte.a aVarB3 = aVar6.b();
                        vc.s.j(aVarB3);
                        xua.a aVarA5 = aVar5.a();
                        vc.s.j(aVarA5);
                        bVar = new yb5.e(rVar, aVar9, aVarB3, aVarA5, aVar3.i.c());
                        break;
                    case 7:
                        return p7h.b.j(gVar, (Retrofit) aVar3.k.get());
                    case 8:
                        return new rb5.a();
                    default:
                        throw new AssertionError(i3);
                }
                return bVar;
            case 3:
                pbj.b bVar3 = (pbj.b) obj2;
                a31.a aVar10 = bVar3.e;
                ecm.q qVar3 = bVar3.f234695a;
                if (i3 == 0) {
                    return new qbj.a(bVar3.f234696b, bVar3.f234697c, bVar3.d, aVar10, bVar3.f, bVar3.f234698g, qVar3);
                }
                if (i3 == 1) {
                    return pl1.d.b(qVar3, bVar3.D, bVar3.f234699h, bVar3.i);
                }
                if (i3 == 2) {
                    return p7h.b.v((qbj.a) bVar3.C.get());
                }
                if (i3 == 3) {
                    return pl1.d.h(qVar3, bVar3.f234700j, bVar3.k, bVar3.f234701l, bVar3.f234702m, bVar3.D, bVar3.f234703n, bVar3.o, aVar10, bVar3.f234704p, bVar3.f234705q, bVar3.f234706r, bVar3.f234707s, bVar3.f234708t, bVar3.u, bVar3.v, bVar3.f234709w, bVar3.f234710x, bVar3.f234711y, bVar3.z, bVar3.A, bVar3.B);
                }
                throw new AssertionError(i3);
            case 4:
                if (i3 == 0) {
                    return new qgh.d();
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                pgh.c cVar3 = (pgh.c) obj2;
                return rga.l.f(cVar3.f235949a, cVar3.f235950b);
            case 5:
                ph8.a aVar11 = (ph8.a) obj2;
                ecm.q qVar4 = aVar11.f236239l;
                a31.a aVar12 = aVar11.e;
                a31.a aVar13 = aVar11.k;
                a31.a aVar14 = aVar11.f236234b;
                a31.a aVar15 = aVar11.f;
                a31.a aVar16 = aVar11.d;
                a31.a aVar17 = aVar11.f236240m;
                a31.a aVar18 = aVar11.f236233a;
                a31.a aVar19 = aVar11.i;
                a31.a aVar20 = aVar11.f236235c;
                if (i3 == 0) {
                    pVar = new qh8.p(aVar18, aVar14, aVar20, aVar16, aVar12, aVar15, aVar11.f236245s, aVar17, qVar4, aVar11.f236241n, aVar19);
                } else {
                    if (i3 == 1) {
                        qh8.d dVar2 = (qh8.d) ((qh8.v) aVar11.f236244r.get()).b();
                        vc.s.k(dVar2);
                        return dVar2;
                    }
                    if (i3 == 2) {
                        pVar = new qh8.v(aVar18, aVar11.f236236g, aVar11.f236237h, aVar20, aVar19, aVar12, aVar11.f236238j, aVar13, qVar4);
                    } else {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new AssertionError(i3);
                            }
                            qh8.b bVar4 = (qh8.b) ((qh8.p) aVar11.f236246t.get()).b();
                            vc.s.k(bVar4);
                            return bVar4;
                        }
                        pVar = new fw2.a(aVar11.f236245s, aVar11.u, aVar11.o, aVar17, aVar11.f236242p, aVar16, aVar20, aVar11.f236243q, aVar19, aVar15, aVar14, aVar18, aVar13);
                    }
                }
                return pVar;
            case 6:
                poi.b bVar5 = (poi.b) obj2;
                switch (i3) {
                    case 0:
                        CoroutineScope coroutineScopeA2 = bVar5.f238013a.a();
                        vc.s.j(coroutineScopeA2);
                        return coroutineScopeA2;
                    case 1:
                        so.c failFastCoroutinesExceptionHandler = new so.c(new ecm.q(bVar5.i()));
                        Intrinsics.checkNotNullParameter(failFastCoroutinesExceptionHandler, "failFastCoroutinesExceptionHandler");
                        return skm.e0.c(kotlin.coroutines.e.d(skm.e0.e(), skm.p0.f264003c).plus(failFastCoroutinesExceptionHandler));
                    case 2:
                        return new uo.b(bVar5.i());
                    case 3:
                        gte.a aVarB4 = bVar5.f238015b.b();
                        vc.s.j(aVarB4);
                        noi.c cVar4 = new noi.c(bVar5.f238017c);
                        soi.e eVar4 = (soi.e) bVar5.D.get();
                        zm0.c cVarJ = bVar5.f238021h.j();
                        vc.s.j(cVarJ);
                        ang.f fVarE2 = bVar5.i.e();
                        noi.k kVar = new noi.k((ho.b0) bVar5.R.get(), ImmutableSet.of((e0m.d) bVar5.W.get(), (e0m.d) bVar5.V.get(), (e0m.d) bVar5.X.get()));
                        bm0.a aVar21 = new bm0.a();
                        h70.a aVar22 = (h70.a) bVar5.k.G.get();
                        vc.s.j(aVar22);
                        ImmutableSet immutableSetOf = ImmutableSet.of((qoi.d) kVar, (qoi.d) new noi.i(aVar21, aVar22, new sh0.a(), new gi0.a()), new qoi.d(new bm0.a(), new yf.c((qoi.a) bVar5.Y.get()), new roi.a()));
                        ifm.b bVar6 = (ifm.b) bVar5.Z.get();
                        yk0.d dVar3 = new yk0.d();
                        d4m.a aVarA6 = e4m.b.a(bVar5.f238014a0);
                        i1b.f fVar2 = (i1b.f) bVar5.f238036t.f180200q.get();
                        vc.s.j(fVar2);
                        bVar2 = new com.revolut.retail.analytics.tracking.impl.b(aVarB4, cVar4, eVar4, cVarJ, fVarE2, immutableSetOf, bVar6, dVar3, aVarA6, fVar2);
                        return bVar2;
                    case 4:
                        return new soi.e((PrivacyService) bVar5.A.get(), (ne0.j) bVar5.B.get(), (ue0.c) bVar5.C.get());
                    case 5:
                        poi.c cVar5 = bVar5.d;
                        PrivacyService privacyService = (PrivacyService) a0.d.f((nj0.d) bVar5.e, "retrofit", PrivacyService.class, "create(...)");
                        vc.s.k(privacyService);
                        return privacyService;
                    case 6:
                        return new ne0.d();
                    case 7:
                        je0.d mapper = bVar5.f.b();
                        vc.s.j(mapper);
                        fni.a nativeValuesProvider = bVar5.f238020g.f175897c;
                        xe0.f storageFactory = bVar5.f.f();
                        vc.s.j(storageFactory);
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, new bn0.f(nativeValuesProvider, 2), "analytics", mapper, 0, null, 56);
                    case 8:
                        return new ho.b0(bVar5.a(), (uo.f) bVar5.I.get(), (no.q) bVar5.Q.get());
                    case 9:
                        e4m.e eVar5 = bVar5.E;
                        l70.e eVar6 = bVar5.k;
                        uo.k kVar2 = (uo.k) eVar5.get();
                        uo.c cVar6 = (uo.c) bVar5.F.get();
                        l80.e eVarH2 = eVar6.h();
                        vc.s.j(eVarH2);
                        dm0.d dVarD = bVar5.f238020g.d();
                        vc.s.j(dVarD);
                        qd0.b bVarN = eVar6.n();
                        vc.s.j(bVarN);
                        rm0.b0 b0Var = new rm0.b0();
                        no.n nVar = no.n.Retail;
                        vc.s.k(nVar);
                        uo.s sVar = (uo.s) bVar5.H.get();
                        df0.b bVarA2 = bVar5.f238025l.a();
                        vc.s.j(bVarA2);
                        i90.b bVar7 = new i90.b();
                        i70.a aVar23 = (i70.a) eVar6.f192443n.get();
                        vc.s.j(aVar23);
                        bVar2 = new uo.h(kVar2, cVar6, eVarH2, dVarD, bVarN, b0Var, nVar, sVar, bVarA2, bVar7, aVar23);
                        return bVar2;
                    case 10:
                        th0.a aVar24 = bVar5.f238023j;
                        return new uo.k(new nh0.b(new nh0.a(aVar24.f271230a), aVar24.f271231b));
                    case 11:
                        Context context2 = bVar5.f238017c;
                        qd0.b bVarN2 = bVar5.k.n();
                        vc.s.j(bVarN2);
                        return new uo.e(context2, bVarN2);
                    case 12:
                        l70.e eVar7 = bVar5.k;
                        return new uo.s(new i90.b(), (uo.i0) bVar5.G.get());
                    case 13:
                        ue0.c cVar7 = (ue0.c) bVar5.C.get();
                        ef0.b bVarB2 = bVar5.f238025l.b();
                        vc.s.j(bVarB2);
                        return new uo.l0(cVar7, bVarB2);
                    case 14:
                        y60.c cVar8 = bVar5.f238026m;
                        jo.c cVar9 = bVar5.f238027n;
                        w60.b bVarB3 = cVar8.b();
                        com.revolut.retail.analytics.tracking.impl.a aVarI2 = bVar5.i();
                        fo.a aVar25 = new fo.a();
                        gpk.c cVarA3 = bVar5.a();
                        ho.d0 d0Var2 = (ho.d0) bVar5.J.get();
                        no.e eVar8 = (no.e) bVar5.L.get();
                        uo.f fVar3 = (uo.f) bVar5.I.get();
                        b80.c cVarP2 = bVar5.k.p();
                        vc.s.j(cVarP2);
                        fo.f fVar4 = (fo.f) bVar5.O.get();
                        df0.b bVarA3 = bVar5.f238025l.a();
                        vc.s.j(bVarA3);
                        fo.a aVar26 = new fo.a();
                        jm0.a aVar27 = bVar5.f238020g;
                        bm0.a aVar28 = new bm0.a();
                        dm0.d dVarD2 = aVar27.d();
                        vc.s.j(dVarD2);
                        zVar = new no.z(bVarB3, aVarI2, cVar9, aVar25, cVarA3, d0Var2, eVar8, fVar3, cVarP2, fVar4, new to.h(cVar9, bVarA3, aVar26, aVar28, dVarD2, (to.e) bVar5.P.get(), new yf.c(aVar27.f175898g)));
                        return zVar;
                    case 15:
                        return new ho.d0();
                    case 16:
                        return new com.revolut.analytics.tracking.v3.a(e4m.b.a(bVar5.K), bVar5.a());
                    case 17:
                        return new fo.f(new fo.a(), e4m.b.a(bVar5.M), new fo.g((uo.f) bVar5.I.get(), (ue0.c) bVar5.N.get()), bVar5.f238027n);
                    case 18:
                        Context context3 = bVar5.f238017c;
                        fni.a nativeValuesProvider2 = bVar5.f238020g.f175897c;
                        ee0.d databaseEncryptionFactoryProvider = bVar5.o;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider2, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionFactoryProvider, "databaseEncryptionFactoryProvider");
                        AqueductDatabase.Companion aVar29 = AqueductDatabase.INSTANCE;
                        String passPhrase = nativeValuesProvider2.a();
                        de0.a databaseEncryptionMigratorFactory2 = ((mp.m) databaseEncryptionFactoryProvider).a();
                        aVar29.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(passPhrase, "passPhrase");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory2, "databaseEncryptionMigratorFactory");
                        AqueductDatabase aqueductDatabase = (AqueductDatabase) ce0.a.b(new ao.a(context3, i2, databaseEncryptionMigratorFactory2, passPhrase));
                        vc.s.k(aqueductDatabase);
                        return aqueductDatabase;
                    case 19:
                        je0.d mapper2 = bVar5.f.b();
                        vc.s.j(mapper2);
                        fni.a nativeValuesProvider3 = bVar5.f238020g.f175897c;
                        xe0.f storageFactory2 = bVar5.f.f();
                        vc.s.j(storageFactory2);
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider3, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, new bn0.f(nativeValuesProvider3, 3), "offline_events", mapper2, 0, null, 56);
                    case 20:
                        return new to.e(bVar5.f238017c, bVar5.f238027n, new to.c());
                    case 21:
                        ite.a aVar30 = bVar5.f238015b;
                        ite.a aVar31 = bVar5.f238015b;
                        jte.c cVarA4 = aVar30.a();
                        vc.s.j(cVarA4);
                        gte.a aVarB5 = aVar31.b();
                        vc.s.j(aVarB5);
                        lte.b bVar8 = (lte.b) aVar31.f168372l.get();
                        vc.s.j(bVar8);
                        return new no.i1(cVarA4, aVarB5, bVar8, (j2) bVar5.V.get(), bVar5.a());
                    case 22:
                        poi.a aVar32 = bVar5.f238030p;
                        dfe.a aVar33 = bVar5.f238031q;
                        uo.b activeScreenHolder = (uo.b) bVar5.z.get();
                        uo.q0 screenNameFinder = bVar5.j();
                        uo.l productMapper = (uo.l) bVar5.T.get();
                        ue0.c storage = (ue0.c) bVar5.U.get();
                        gpk.c coroutineScopeProvider = bVar5.a();
                        d4m.a tracker = e4m.b.a(bVar5.K);
                        no.p eventNotifier = (no.p) bVar5.Q.get();
                        l70.e eVar9 = aVar33.f113885a;
                        b70.e eVarB = eVar9.b();
                        vc.s.j(eVarB);
                        bfe.f suspiciousAccessibilityDetector = new bfe.f(eVarB, (afe.d) aVar33.e.get());
                        afe.d dVar4 = (afe.d) aVar33.e.get();
                        n80.e eVar10 = (n80.e) aVar33.d.get();
                        y80.a aVarR = eVar9.r();
                        vc.s.j(aVarR);
                        bfe.d remoteControlDetector = new bfe.d(dVar4, eVar10, aVarR, new fn0.a());
                        dfe.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(suspiciousAccessibilityDetector, "suspiciousAccessibilityDetector");
                        Intrinsics.checkNotNullParameter(remoteControlDetector, "remoteControlDetector");
                        yee.a[] elements = {suspiciousAccessibilityDetector, remoteControlDetector};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        afe.b suspiciousAppDetector = new afe.b(kotlin.collections.d.y0(elements));
                        bfe.f overlayAppDetector = new bfe.f((n80.e) aVar33.d.get(), (afe.d) aVar33.e.get());
                        Context context4 = bVar5.f238017c;
                        mp.r rVar2 = new mp.r(new b70.e(context4));
                        go.h hVar = new go.h(bVar5.f238032r.b());
                        l70.e eVar11 = bVar5.k;
                        y80.a permissionProvider = eVar11.r();
                        vc.s.j(permissionProvider);
                        wl0.c biometricHelper = bVar5.f238021h.a();
                        b90.e notificationsStatusProvider = (b90.e) eVar11.U.get();
                        vc.s.j(notificationsStatusProvider);
                        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
                        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
                        Intrinsics.checkNotNullParameter(notificationsStatusProvider, "notificationsStatusProvider");
                        gpk.c cVar10 = new gpk.c();
                        cVar10.f145463a = permissionProvider;
                        cVar10.f145464b = biometricHelper;
                        cVar10.f145465c = notificationsStatusProvider;
                        go.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context4, "context");
                        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context4);
                        Intrinsics.checkNotNullExpressionValue(appWidgetManager, "getInstance(...)");
                        vc.s.k(appWidgetManager);
                        com.google.firebase.messaging.t settingsInfoProvider = new com.google.firebase.messaging.t(rVar2, hVar, cVar10, new uo.r0(context4, appWidgetManager));
                        uo.s sessionIdProvider = (uo.s) bVar5.H.get();
                        ef0.b currentTimeProvider = bVar5.f238025l.b();
                        vc.s.j(currentTimeProvider);
                        f86.a deviceLockProtectionChecker = (f86.a) bVar5.f238034s.d.get();
                        vc.s.j(deviceLockProtectionChecker);
                        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
                        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
                        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
                        Intrinsics.checkNotNullParameter(storage, "storage");
                        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
                        Intrinsics.checkNotNullParameter(tracker, "tracker");
                        Intrinsics.checkNotNullParameter(eventNotifier, "eventNotifier");
                        Intrinsics.checkNotNullParameter(suspiciousAppDetector, "suspiciousAppDetector");
                        Intrinsics.checkNotNullParameter(overlayAppDetector, "overlayAppDetector");
                        Intrinsics.checkNotNullParameter(settingsInfoProvider, "settingsInfoProvider");
                        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
                        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
                        Intrinsics.checkNotNullParameter(deviceLockProtectionChecker, "deviceLockProtectionChecker");
                        return new com.revolut.analytics.tracking.v3.l(suspiciousAppDetector, overlayAppDetector, activeScreenHolder, screenNameFinder, productMapper, storage, coroutineScopeProvider, tracker, settingsInfoProvider, eventNotifier, sessionIdProvider, currentTimeProvider, deviceLockProtectionChecker);
                    case 23:
                        mn.b bVar9 = (mn.b) bVar5.S.get();
                        moi.a aVar34 = new moi.a();
                        no.n nVar2 = no.n.Retail;
                        vc.s.k(nVar2);
                        return new uo.o(bVar9, aVar34, nVar2);
                    case 24:
                        ecm.q qVar5 = new ecm.q(bVar5.i());
                        Context context5 = bVar5.f238017c;
                        no.n nVar3 = no.n.Retail;
                        vc.s.k(nVar3);
                        return new ho.j0(qVar5, context5, nVar3);
                    case 25:
                        je0.d mapper3 = bVar5.f.b();
                        vc.s.j(mapper3);
                        fni.a nativeValuesProvider4 = bVar5.f238020g.f175897c;
                        xe0.f storageFactory3 = bVar5.f.f();
                        vc.s.j(storageFactory3);
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider4, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, new bn0.f(nativeValuesProvider4, 4), "settings_events", mapper3, 0, null, 56);
                    case 26:
                        com.revolut.retail.analytics.tracking.impl.a aVarI3 = bVar5.i();
                        l70.e eVar12 = bVar5.k;
                        l80.e eVarH3 = eVar12.h();
                        vc.s.j(eVarH3);
                        l80.h hVarV = eVar12.v();
                        vc.s.j(hVarV);
                        zVar = new lo.d(aVarI3, new lo.i(eVarH3, hVarV, new lo.e()), new lo.j(), new sh0.a(), (uo.b) bVar5.z.get(), bVar5.j(), qo.a.a(), bVar5.a());
                        return zVar;
                    case 27:
                        return new qoi.a(bVar5.f238017c);
                    case 28:
                        poi.a aVar35 = bVar5.f238030p;
                        return new ifm.b();
                    case 29:
                        return aoi.f.a();
                    case 30:
                        return new ho.c0(ImmutableSet.of((ho.z) bVar5.L.get(), (ho.z) bVar5.Q.get()));
                    case 31:
                        return new oo.a();
                    case 32:
                        gpk.c cVarA5 = bVar5.a();
                        no.n nVar4 = no.n.Retail;
                        vc.s.k(nVar4);
                        mo.b bVar10 = new mo.b(nVar4);
                        mo.c cVar11 = (mo.c) bVar5.f238018d0.get();
                        uo.q0 q0VarJ = bVar5.j();
                        uo.l lVar = (uo.l) bVar5.T.get();
                        d4m.a aVarA7 = e4m.b.a(bVar5.K);
                        Context context6 = bVar5.f238017c;
                        vp.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context6, "context");
                        int i5 = Build.VERSION.SDK_INT;
                        Intrinsics.checkNotNullParameter(context6, "context");
                        icm.m mVar2 = new icm.m();
                        mVar2.f160343b = context6;
                        mVar2.f160342a = i5;
                        Optional optionalOf = Optional.of((qoi.b) bVar5.f238019e0.get());
                        an0.c cVar12 = bVar5.f238021h;
                        vl0.a aVar36 = (vl0.a) cVar12.D.get();
                        vc.s.j(aVar36);
                        tb4.t tVar = new tb4.t(aVar36, cVar12.f());
                        uo.a0 a0Var3 = new uo.a0();
                        no.j1 j1Var = new no.j1();
                        uo.y yVar = (uo.y) bVar5.f0.get();
                        uo.x xVar = (uo.x) bVar5.g0.get();
                        g5l.a aVar37 = (g5l.a) bVar5.v.f158850b.get();
                        vc.s.j(aVar37);
                        rh0.b bVarI = bVar5.f238023j.i();
                        kj0.d dVar5 = (kj0.d) ((nj0.d) bVar5.e).B.get();
                        vc.s.j(dVar5);
                        zVar = new com.revolut.analytics.tracking.v3.f(cVarA5, bVar10, cVar11, q0VarJ, lVar, aVarA7, mVar2, optionalOf, tVar, a0Var3, j1Var, yVar, xVar, aVar37, bVarI, dVar5);
                        return zVar;
                    case 33:
                        return new mo.c(bVar5.u);
                    case 34:
                        return new qoi.b((qoi.a) bVar5.Y.get());
                    case 35:
                        return qlc.b.g(bVar5.f238017c);
                    case 36:
                        return qlc.b.f(bVar5.f238017c);
                    case 37:
                        Context context7 = bVar5.f238017c;
                        xg0.a aVarA8 = bVar5.f238023j.a();
                        vc.s.j(aVarA8);
                        g1Var = new no.g1(context7, aVarA8, (com.revolut.analytics.tracking.v3.d) bVar5.f238022h0.get(), new gi0.a(), bVar5.a(), th0.f.a(), th0.e.a(), bVar5.i());
                        return g1Var;
                    case 38:
                        d4m.a aVarA9 = e4m.b.a(bVar5.K);
                        uo.b bVar11 = (uo.b) bVar5.z.get();
                        uo.q0 q0VarJ2 = bVar5.j();
                        uo.l lVar2 = (uo.l) bVar5.T.get();
                        gpk.c cVarA6 = bVar5.a();
                        ef0.b bVarB4 = bVar5.f238025l.b();
                        vc.s.j(bVarB4);
                        bVar2 = new no.r1(aVarA9, bVar11, q0VarJ2, lVar2, cVarA6, bVarB4);
                        return bVar2;
                    case 39:
                        uo.b bVar12 = (uo.b) bVar5.z.get();
                        gpk.c cVarA7 = bVar5.a();
                        ro.a aVar38 = (ro.a) bVar5.f238024k0.get();
                        ho.e0 e0Var2 = new ho.e0();
                        com.revolut.analytics.tracking.v3.k kVar3 = new com.revolut.analytics.tracking.v3.k((mo.c) bVar5.f238018d0.get(), (uo.l) bVar5.T.get(), bVar5.j());
                        co.a aVar39 = (co.a) bVar5.l0.get();
                        no.n nVar5 = no.n.Retail;
                        vc.s.k(nVar5);
                        zVar = new no.y1(bVar12, cVarA7, aVar38, e0Var2, kVar3, aVar39, nVar5, e4m.b.a(bVar5.K));
                        return zVar;
                    case 40:
                        l80.e eVarH4 = bVar5.k.h();
                        vc.s.j(eVarH4);
                        return new ro.c(eVarH4);
                    case 41:
                        return new co.a();
                    case 42:
                        d4m.a aVarA10 = e4m.b.a(bVar5.K);
                        uo.b bVar13 = (uo.b) bVar5.z.get();
                        uo.q0 q0VarJ3 = bVar5.j();
                        uo.l lVar3 = (uo.l) bVar5.T.get();
                        wsc.a aVar40 = (wsc.a) bVar5.f238039w.e.get();
                        vc.s.j(aVar40);
                        zVar = new i2(aVarA10, bVar13, q0VarJ3, lVar3, aVar40, bVar5.a());
                        return zVar;
                    case 43:
                        return new y2((com.revolut.analytics.tracking.v3.d) bVar5.f238022h0.get());
                    case 44:
                        g1Var = new lo0.f((uo.b) bVar5.z.get(), bVar5.a(), new ho.e0(), (mo.c) bVar5.f238018d0.get(), (uo.l) bVar5.T.get(), bVar5.j(), (ho.t) bVar5.K.get());
                        return g1Var;
                    case 45:
                        return new io.f(bVar5.i(), bVar5.f238022h0, bVar5.a());
                    case 46:
                        com.revolut.analytics.tracking.v3.d dVar6 = (com.revolut.analytics.tracking.v3.d) bVar5.f238022h0.get();
                        com.revolut.retail.analytics.tracking.impl.a aVarI4 = bVar5.i();
                        l80.h hVarV2 = bVar5.k.v();
                        vc.s.j(hVarV2);
                        return new d2(dVar6, aVarI4, hVarV2);
                    case 47:
                        return new no.h1((com.revolut.analytics.tracking.v3.d) bVar5.f238022h0.get(), bVar5.i());
                    case 48:
                        return new noi.a((loi.b) bVar5.K.get(), (soi.e) bVar5.D.get());
                    case 49:
                        ifm.b bVar14 = (ifm.b) bVar5.Z.get();
                        ee0.a aVar41 = bVar5.f;
                        je0.d objectMapper = aVar41.b();
                        vc.s.j(objectMapper);
                        xe0.f storageFactory4 = aVar41.f();
                        vc.s.j(storageFactory4);
                        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                        Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                        ve0.c cVarE = xe0.f.e(storageFactory4, "retail_analytics.pref", objectMapper, 12);
                        Clock clockSystemUTC = Clock.systemUTC();
                        Intrinsics.checkNotNullExpressionValue(clockSystemUTC, "systemUTC(...)");
                        vc.s.k(clockSystemUTC);
                        yh0.c cVar13 = (yh0.c) bVar5.f238023j.d.get();
                        vc.s.j(cVar13);
                        zVar = new bo.f(bVar14, cVarE, clockSystemUTC, cVar13, (j2) bVar5.V.get());
                        return zVar;
                    case 50:
                        e4m.e eVar13 = bVar5.Z;
                        th0.a aVar42 = bVar5.f238023j;
                        ifm.b bVar15 = (ifm.b) eVar13.get();
                        yh0.c cVar14 = (yh0.c) aVar42.d.get();
                        vc.s.j(cVar14);
                        yh0.c cVar15 = (yh0.c) aVar42.d.get();
                        vc.s.j(cVar15);
                        com.revolut.analytics.tracking.v3.d dVar7 = (com.revolut.analytics.tracking.v3.d) bVar5.f238022h0.get();
                        gte.a aVarB6 = bVar5.f238015b.b();
                        vc.s.j(aVarB6);
                        return new com.revolut.analytics.integrity.a(bVar15, cVar14, cVar15, dVar7, aVarB6);
                    default:
                        throw new AssertionError(i3);
                }
            case 7:
                return a();
            case 8:
                Context context8 = ((pqi.a) obj2).f238791a;
                if (i3 == 0) {
                    return new sqi.a(context8);
                }
                if (i3 == 1) {
                    return new ppi.d();
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                pqi.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context8, "context");
                SharedPreferences sharedPreferences = context8.getApplicationContext().getSharedPreferences("common_ui_preferences", 0);
                Intrinsics.h(sharedPreferences);
                return new fqi.b(sharedPreferences);
            case 9:
                pqk.a aVar43 = (pqk.a) obj2;
                a31.a aVar44 = aVar43.f238803m;
                if (i3 == 0) {
                    return new nu9.e(aVar43.f238796a, aVar43.f238797b, aVar43.f238798c, aVar43.d, aVar43.e, aVar43.f, aVar43.f238799g, aVar43.f238800h, aVar43.i, aVar43.f238801j, aVar43.k, aVar43.f238802l, aVar44, 2);
                }
                if (i3 == 1) {
                    return qlc.b.a(aVar44, aVar43.f238804n);
                }
                throw new AssertionError(i3);
            case 10:
                return b();
            case 11:
                return c();
            case 12:
                return d();
            case 13:
                return e();
            case 14:
                return f();
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case 20:
                return l();
            case 21:
                return m();
            case 22:
                return n();
            case 23:
                return o();
            case 24:
                return p();
            case 25:
                return q();
            case 26:
                return r();
            case 27:
                return s();
            case 28:
                return t();
            default:
                r1b.a aVar45 = (r1b.a) obj2;
                if (i3 == 0) {
                    yri.a aVar46 = (yri.a) aVar45.d.get();
                    zm0.b bVarI2 = aVar45.f250953b.i();
                    vc.s.j(bVarI2);
                    asi.d dVarC = ((j51.a) aVar45.f250954c).c();
                    vc.s.j(dVarC);
                    return new p1b.c(aVar46, bVarI2, dVarC);
                }
                if (i3 == 1) {
                    l80.h hVarV3 = aVar45.f250952a.v();
                    vc.s.j(hVarV3);
                    return new yri.b(hVarV3);
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                tli.a retailAuthorizedScreenLoginCommandProvider = new tli.a();
                Intrinsics.checkNotNullParameter(retailAuthorizedScreenLoginCommandProvider, "retailAuthorizedScreenLoginCommandProvider");
                return new p1b.b();
        }
    }
}
