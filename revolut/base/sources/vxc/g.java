package vxc;

import afj.y3;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import bjl.o0;
import cc7.m;
import com.google.common.collect.ImmutableMap;
import com.revolut.data.database.AppRoomDatabase;
import com.revolut.data.database.models.openbanking.ConsentsDao;
import com.revolut.feature.confirmationcode.impl.network.retrofit.LoginService;
import com.revolut.feature.external_accounts.impl.data.open_banking.OpenBankingService;
import com.revolut.feature.external_accounts.impl.repository.network.ConsentService;
import com.revolut.feature.external_accounts.impl.repository.network.EarlyCreditService;
import com.revolut.feature.external_accounts.impl.repository.network.IndiaNetBankingService;
import com.revolut.feature.external_accounts.impl.repository.network.IndiaUpiService;
import com.revolut.feature.external_accounts.impl.repository.network.InstitutionAccountsService;
import com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService;
import com.revolut.feature.external_accounts.impl.repository.network.MandateService;
import com.revolut.feature.external_accounts.impl.repository.network.PseService;
import com.revolut.feature.form_wizard.impl.network.services.FormWizardService;
import com.revolut.feature.home.nps.data.network.HomeNPSService;
import com.revolut.feature.user.impl.network.service.UserService;
import com.revolut.feature.vaults.impl.network.SavingsService;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.feature.pcw_auth.impl.network.services.PcwApplicationService;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import lp.l9;
import qgk.k3;
import retrofit2.Retrofit;
import ssi.o;
import th6.a0;
import th6.w;
import th6.y;
import u90.c0;
import vc.s;
import vfg.p;
import wf6.f0;
import wf6.h0;
import wf6.j0;
import wf6.l0;
import wf6.m0;
import wf6.n;
import wf6.u;
import wf6.z;
import wpg.v;
import xf6.n1;
import xf6.q1;
import xf6.r1;
import xf6.t;
import xg6.b0;
import xg6.q;
import xg6.r;
import yg6.x;
import z0g.f1;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f293072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f293073c;

    public /* synthetic */ g(Object obj2, int i, int i2) {
        this.f293071a = i2;
        this.f293073c = obj2;
        this.f293072b = i;
    }

    private final Object a() {
        xb7.a aVar = (xb7.a) this.f293073c;
        ee0.a aVar2 = aVar.f304010b;
        int i = this.f293072b;
        switch (i) {
            case 0:
                g gVar = aVar.f;
                yb7.a aVar3 = (yb7.a) aVar.f304015l.get();
                gte.a aVarB = aVar.e.b();
                s.j(aVarB);
                return new xb7.b(gVar, aVar3, aVarB, new cc7.a());
            case 1:
                return new m(new cc7.a());
            case 2:
                return new yb7.a((vb7.f) aVar.k.get());
            case 3:
                HomeNPSService homeNPSService = (HomeNPSService) aVar.f304012g.get();
                ne0.j jVar = (ne0.j) aVar.f304013h.get();
                ue0.c cVar = (ue0.c) aVar.i.get();
                bc7.a aVar4 = (bc7.a) aVar.f304014j.get();
                lfm.c cVarB = ((g8b.a) aVar.d).b();
                s.j(cVarB);
                return new vb7.f(homeNPSService, jVar, cVar, aVar4, cVarB);
            case 4:
                Retrofit retrofitI = ((c21.b) aVar.f304009a).i();
                s.j(retrofitI);
                return xb7.d.a(retrofitI);
            case 5:
                return new ne0.d();
            case 6:
                je0.d dVarB = aVar2.b();
                s.j(dVarB);
                yk0.a aVarB2 = aVar.f304011c.b();
                s.j(aVarB2);
                xe0.f fVarF = aVar2.f();
                s.j(fVarF);
                return xb7.e.a(dVarB, fVarF, aVarB2);
            case 7:
                return new bc7.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        t tVar = (t) this.f293073c;
        int i = this.f293072b;
        switch (i) {
            case 0:
                je0.d dVarB = tVar.f305058a.b();
                s.j(dVarB);
                yk0.a aVarB = tVar.f305060b.b();
                s.j(aVarB);
                xe0.f fVarF = tVar.f305058a.f();
                s.j(fVarF);
                return xb1.a.g(dVarB, fVarF, aVarB);
            case 1:
                je0.d dVarB2 = tVar.f305058a.b();
                s.j(dVarB2);
                yk0.a aVarB2 = tVar.f305060b.b();
                s.j(aVarB2);
                xe0.f fVarF2 = tVar.f305058a.f();
                s.j(fVarF2);
                return xb1.a.n(dVarB2, fVarF2, aVarB2);
            case 2:
                je0.d dVarB3 = tVar.f305058a.b();
                s.j(dVarB3);
                yk0.a aVarB3 = tVar.f305060b.b();
                s.j(aVarB3);
                xe0.f fVarF3 = tVar.f305058a.f();
                s.j(fVarF3);
                return xb1.a.A(dVarB3, fVarF3, aVarB3);
            case 3:
                je0.d dVarB4 = tVar.f305058a.b();
                s.j(dVarB4);
                yk0.a aVarB4 = tVar.f305060b.b();
                s.j(aVarB4);
                xe0.f fVarF4 = tVar.f305058a.f();
                s.j(fVarF4);
                return f1.j(dVarB4, fVarF4, aVarB4);
            case 4:
                je0.d dVarB5 = tVar.f305058a.b();
                s.j(dVarB5);
                yk0.a aVarB5 = tVar.f305060b.b();
                s.j(aVarB5);
                xe0.f fVarF5 = tVar.f305058a.f();
                s.j(fVarF5);
                return y3.A(dVarB5, fVarF5, aVarB5);
            case 5:
                je0.d dVarB6 = tVar.f305058a.b();
                s.j(dVarB6);
                yk0.a aVarB6 = tVar.f305060b.b();
                s.j(aVarB6);
                xe0.f fVarF6 = tVar.f305058a.f();
                s.j(fVarF6);
                return cdj.b.u(dVarB6, fVarF6, aVarB6);
            case 6:
                return new f0((sri.m) tVar.I.get());
            case 7:
                return xb1.a.r(tVar.f305062c);
            case 8:
                return new z((sri.m) tVar.I.get(), tVar.h());
            case 9:
                return new mg6.c((mg6.d) tVar.N.get(), tVar.f305065g.b());
            case 10:
                e4m.e eVar = tVar.K;
                c21.e eVar2 = tVar.e;
                OpenBankingService openBankingService = (OpenBankingService) eVar.get();
                c21.b bVar = (c21.b) eVar2;
                ConsentsDao consentsDaoI = bjf.f.i(bVar.f20572m, (AppRoomDatabase) bVar.z.get());
                tl0.a aVarC = tVar.f.c();
                ne0.j jVar = (ne0.j) tVar.M.get();
                ue0.c cVar = (ue0.c) ((c21.b) eVar2).K.get();
                s.j(cVar);
                return new hf6.i(openBankingService, consentsDaoI, aVarC, jVar, cVar);
            case 11:
                return xb1.a.t(((nj0.d) tVar.d).f());
            case 12:
                return new ne0.d();
            case 13:
                return new h0((sri.m) tVar.I.get());
            case 14:
                return new u((sri.m) tVar.I.get(), tVar.f305068j.a());
            case 15:
                sri.m mVar = (sri.m) tVar.I.get();
                oe6.a aVarA = tVar.k.a();
                s.j(aVarA);
                return new wf6.s(mVar, aVarA, tVar.f305070l.b(), (zfe.g) tVar.S.get());
            case 16:
                return xb1.a.u(tVar.f305062c);
            case 17:
                sri.m mVar2 = (sri.m) tVar.I.get();
                f80.a aVarX = tVar.f305066h.x();
                s.j(aVarX);
                return new wf6.e(mVar2, aVarX);
            case 18:
                return new wf6.g((sri.m) tVar.I.get());
            case 19:
                return new n((sri.m) tVar.I.get());
            case 20:
                return new wf6.j((sri.m) tVar.I.get(), (com.revolut.feature.external_accounts.api.navigation.a) tVar.X.get());
            case 21:
                fk3.a aVarA2 = tVar.f305071m.a();
                s.j(aVarA2);
                xoj.a aVarA3 = tVar.f305072n.a();
                s.j(aVarA3);
                gte.a aVarB7 = tVar.o.b();
                s.j(aVarB7);
                return new ym6.d(aVarA2, aVarA3, aVarB7, tVar.f305075p.a());
            case 22:
                sri.m mVar3 = (sri.m) tVar.I.get();
                oe6.a aVarA4 = tVar.k.a();
                s.j(aVarA4);
                return new wf6.m(mVar3, aVarA4);
            case 23:
                sri.m mVar4 = (sri.m) tVar.I.get();
                oe6.a aVarA5 = tVar.k.a();
                s.j(aVarA5);
                return new j0(mVar4, aVarA5);
            case 24:
                return new wf6.b((sri.m) tVar.I.get());
            case 25:
                return new b0((ue0.c) tVar.c0.get());
            case 26:
                je0.d dVarB7 = tVar.f305058a.b();
                s.j(dVarB7);
                yk0.a aVarB8 = tVar.f305060b.b();
                s.j(aVarB8);
                xe0.f fVarF7 = tVar.f305058a.f();
                s.j(fVarF7);
                return agk.b.q(dVarB7, fVarF7, aVarB8);
            case 27:
                return new di6.a();
            case 28:
                q06.d dVarA = tVar.i.a();
                s.j(dVarA);
                return new l0(dVarA);
            case 29:
                return new eg6.a((th6.c) tVar.f305067h0.get());
            case 30:
                InstitutionAccountsService institutionAccountsService = (InstitutionAccountsService) tVar.g0.get();
                ne0.j jVar2 = (ne0.j) tVar.M.get();
                b80.c cVarP = tVar.f305066h.p();
                s.j(cVarP);
                return new th6.c(institutionAccountsService, jVar2, cVarP);
            case 31:
                return xb1.a.x(((nj0.d) tVar.d).f());
            case 32:
                xoj.a aVarA6 = tVar.f305072n.a();
                s.j(aVarA6);
                return new nd.l(aVarA6);
            case 33:
                return new do6.b((ne0.j) tVar.j0.get());
            case 34:
                th6.i iVar = (th6.i) tVar.m0.get();
                qsg.b bVarB = tVar.f305077r.b();
                s.j(bVarB);
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) tVar.f305079s).c();
                s.j(aVarC2);
                return new xg6.l(iVar, bVarB, aVarC2);
            case 35:
                LinkExternalInstitutionsService linkExternalInstitutionsService = (LinkExternalInstitutionsService) tVar.l0.get();
                sf0.h hVarB = tVar.f305076q.b();
                s.j(hVarB);
                je0.d dVarD = tVar.f305058a.d();
                s.j(dVarD);
                return new th6.m(linkExternalInstitutionsService, hVarB, new p(dVarD));
            case 36:
                return xb1.a.l(((nj0.d) tVar.d).f());
            case 37:
                return new fn6.b();
            case 38:
                return new xg6.d((th6.d) tVar.q0.get());
            case 39:
                return new th6.d((ConsentService) tVar.p0.get());
            case 40:
                return xb1.a.v(((nj0.d) tVar.d).f());
            case 41:
                r71.a aVar = (r71.a) ((c21.b) tVar.e).f0.get();
                s.j(aVar);
                qsg.b bVarB2 = tVar.f305077r.b();
                s.j(bVarB2);
                return new q(aVar, bVarB2, (a0) tVar.f305080s0.get());
            case 42:
                return new a0((ue0.c) tVar.E.get());
            case 43:
                return new hg6.a((kg6.a) tVar.f305085w0.get(), (ig6.b) tVar.z0.get());
            case 44:
                return new kg6.a((th6.h) tVar.f305083v0.get());
            case 45:
                return new th6.h((ne0.j) tVar.M.get(), (IndiaUpiService) tVar.u0.get(), (ue0.c) tVar.F.get());
            case 46:
                return f1.w(((nj0.d) tVar.d).f());
            case 47:
                return new ig6.b((zh6.c) tVar.y0.get());
            case 48:
                return new zh6.c((ne0.j) tVar.M.get(), (IndiaNetBankingService) tVar.f305087x0.get(), (ue0.c) tVar.G.get());
            case 49:
                return y3.B(((nj0.d) tVar.d).f());
            case 50:
                return new m0((b0) tVar.f305063d0.get());
            case 51:
                return new nh6.a();
            case 52:
                return new hj6.a();
            case 53:
                return new qg6.f((of6.e) tVar.E0.get());
            case 54:
                ik0.b bVarM = ((nj0.d) tVar.d).m();
                s.j(bVarM);
                return new of6.e(xb1.a.f(bVarM, fe0.d.a()), (ue0.c) tVar.C.get());
            case 55:
                y91.b bVarA = tVar.f305075p.a();
                oe6.a aVarA7 = tVar.k.a();
                s.j(aVarA7);
                return new ci6.h(bVarA, aVarA7);
            case 56:
                return new ci6.a((je6.h) tVar.f305064e0.get());
            case 57:
                return new ci6.d((com.revolut.feature.external_accounts.api.navigation.a) tVar.X.get());
            case 58:
                return new xg6.a((th6.i) tVar.m0.get());
            case 59:
                f80.a aVarX2 = tVar.f305066h.x();
                s.j(aVarX2);
                return new bh6.j(aVarX2);
            case 60:
                return new rg6.a((th6.b0) tVar.M0.get());
            case 61:
                return new th6.b0((ne0.j) tVar.M.get(), (PseService) tVar.L0.get(), (ue0.c) tVar.H.get());
            case 62:
                return cdj.b.y(((nj0.d) tVar.d).f());
            case 63:
                return new r((th6.q) tVar.O0.get());
            case 64:
                return new th6.q((LinkExternalInstitutionsService) tVar.l0.get(), (ne0.j) tVar.M.get(), (ue0.c) tVar.D.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        n1 n1Var = (n1) this.f293073c;
        int i = this.f293072b;
        if (i != 0) {
            if (i == 1) {
                return xb1.a.w(((nj0.d) n1Var.e).f());
            }
            if (i == 2) {
                return new fn6.a();
            }
            if (i == 3) {
                return new rh6.b();
            }
            throw new AssertionError(i);
        }
        r71.a aVar = (r71.a) ((c21.b) n1Var.f304959a).f0.get();
        s.j(aVar);
        qsg.b bVarB = n1Var.f304960b.b();
        s.j(bVarB);
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) n1Var.f304961c).c();
        s.j(aVarC);
        xoj.a aVarA = n1Var.d.a();
        s.j(aVarA);
        qr0.i iVar = new qr0.i((EarlyCreditService) n1Var.i.get());
        y91.b bVarA = n1Var.f.a();
        fk3.a aVarA2 = n1Var.f304962g.a();
        s.j(aVarA2);
        return new xg6.j(aVar, bVarB, aVarC, aVarA, iVar, bVarA, aVarA2);
    }

    private final Object d() {
        q1 q1Var = (q1) this.f293073c;
        vn2.e eVar = q1Var.f305003h;
        fqk.a aVar = q1Var.f304999a;
        ite.a aVar2 = q1Var.f305001c;
        je6.g gVar = q1Var.f305000b;
        aa1.a aVar3 = q1Var.f305002g;
        n1 n1Var = q1Var.d;
        usg.a aVar4 = q1Var.e;
        int i = this.f293072b;
        if (i == 0) {
            oqk.l lVarB = aVar.b();
            s.j(lVarB);
            com.revolut.feature.external_accounts.api.navigation.a aVarB = ((t) gVar).b();
            s.j(aVarB);
            gte.a aVarB2 = aVar2.b();
            s.j(aVarB2);
            oe6.a aVarA = n1Var.a();
            s.j(aVarA);
            return new hqe.i(lVarB, aVarB, aVarB2, aVarA);
        }
        if (i == 1) {
            wsg.n nVarB = aVar4.b();
            oe6.a aVarA2 = n1Var.a();
            s.j(aVarA2);
            yg6.h hVarB = q1Var.b();
            y91.b bVarA = aVar3.a();
            on2.b bVarA2 = eVar.a();
            s.j(bVarA2);
            return new x(nVarB, aVarA2, hVarB, bVarA, new usc.a(bVarA2));
        }
        if (i != 2) {
            if (i == 3) {
                return new yg6.q();
            }
            if (i != 4) {
                if (i == 5) {
                    return new yg6.r();
                }
                throw new AssertionError(i);
            }
            y91.b bVarA3 = aVar3.a();
            wsg.n nVarB2 = aVar4.b();
            com.revolut.feature.external_accounts.api.navigation.a aVarB3 = ((t) gVar).b();
            s.j(aVarB3);
            gte.a aVarB4 = aVar2.b();
            s.j(aVarB4);
            return new yg6.u(bVarA3, nVarB2, aVarB3, aVarB4);
        }
        o oVarC = aVar.c();
        s.j(oVarC);
        yg6.a aVar5 = new yg6.a();
        yg6.b bVar = new yg6.b();
        yg6.c cVar = new yg6.c();
        wsg.n nVarB3 = aVar4.b();
        oe6.a aVarA3 = n1Var.a();
        s.j(aVarA3);
        yg6.h hVarB2 = q1Var.b();
        yg6.r rVar = new yg6.r();
        on2.b bVarA4 = eVar.a();
        s.j(bVarA4);
        return new yg6.k(oVarC, aVar5, bVar, cVar, nVarB3, aVarA3, hVarB2, rVar, new usc.a(bVarA4));
    }

    private final Object e() {
        r1 r1Var = (r1) this.f293073c;
        int i = this.f293072b;
        switch (i) {
            case 0:
                w wVar = (w) r1Var.u.get();
                oe6.a aVarA = r1Var.f305020g.a();
                s.j(aVarA);
                f80.a aVarX = r1Var.d.x();
                s.j(aVarX);
                return new xg6.x(wVar, aVarA, aVarX, r1Var.f305021h.e());
            case 1:
                return new w((MandateService) r1Var.f305026p.get(), (th6.x) r1Var.f305028r.get(), (ne0.j) r1Var.f305029s.get(), (sh6.a) r1Var.f305030t.get());
            case 2:
                return xb1.a.y(((nj0.d) r1Var.f305017a).f());
            case 3:
                return new y((ue0.c) r1Var.f305027q.get());
            case 4:
                je0.d dVarB = r1Var.f305018b.b();
                s.j(dVarB);
                yk0.a aVarB = r1Var.f305019c.b();
                s.j(aVarB);
                xe0.f fVarF = r1Var.f305018b.f();
                s.j(fVarF);
                return xb1.a.z(dVarB, aVarB, fVarF);
            case 5:
                return new ne0.d();
            case 6:
                l70.e eVar = r1Var.d;
                l70.e eVar2 = r1Var.d;
                l80.h hVarV = eVar.v();
                s.j(hVarV);
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                n80.b bVar = new n80.b();
                qd0.b bVarN = eVar2.n();
                s.j(bVarN);
                c90.c cVarA = ((p41.b) r1Var.e).a();
                s.j(cVarA);
                i41.c cVar = (i41.c) r1Var.f.f192032c.get();
                s.j(cVar);
                n80.f fVar = (n80.f) eVar2.f192450x.get();
                s.j(fVar);
                return new sh6.a(hVarV, eVarH, bVar, bVarN, cVarA, cVar, fVar);
            case 7:
                loi.b bVar2 = (loi.b) r1Var.i.K.get();
                s.j(bVar2);
                return new xg6.s(bVar2);
            case 8:
                gte.a aVarB2 = r1Var.f305022j.b();
                s.j(aVarB2);
                en6.n nVar = (en6.n) r1Var.f305032x.get();
                xg6.x xVar = (xg6.x) r1Var.v.get();
                fk3.a aVarA2 = r1Var.f305023l.a();
                s.j(aVarA2);
                return new en6.s(aVarB2, nVar, xVar, aVarA2);
            case 9:
                return new en6.o(r1Var.k.a());
            case 10:
                sf0.h hVarB = r1Var.f305024m.b();
                s.j(hVarB);
                v60.e eVarA = r1Var.f305025n.a();
                s.j(eVarA);
                kge.d dVar = new kge.d(hVarB, eVarA);
                je0.d dVarD = r1Var.f305018b.d();
                s.j(dVarD);
                return new ug6.b(dVar, new ogm.i(dVarD));
            case 11:
                return new eh6.c((sri.m) r1Var.A.get());
            case 12:
                return xb1.a.s(r1Var.o);
            case 13:
                return new eh6.a((sri.m) r1Var.A.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        xh3.a aVar = (xh3.a) this.f293073c;
        efk.a aVar2 = aVar.f305801c;
        bi3.d dVar = aVar.f305799a;
        jk3.c cVar = aVar.f305803h;
        nt8.a aVar3 = aVar.f;
        ta9.m mVar = aVar.f305800b;
        int i = this.f293072b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new AssertionError(i);
                }
                onh.b bVarB = aVar.d.b();
                li0.b bVarC = t2d.c.c(aVar.e.f271230a);
                f73.c cVar2 = new f73.c();
                mt8.a aVarA = aVar3.a();
                s.j(aVarA);
                up3.a aVar4 = (up3.a) aVar.f305802g.N.get();
                s.j(aVar4);
                return new vh3.c(bVarB, bVarC, cVar2, aVarA, aVar4);
            }
            u89.a aVarB = mVar.b();
            s.j(aVarB);
            ph3.b bVar = (ph3.b) aVar.f305811s.get();
            fk3.a aVarA2 = cVar.a();
            s.j(aVarA2);
            zh3.e eVar = new zh3.e(aVarA2, aVar.i.g());
            v60.e eVarA = aVar.f305804j.a();
            s.j(eVarA);
            gte.a aVarB2 = aVar.k.b();
            s.j(aVarB2);
            return new gi3.c(aVarB, bVar, eVar, eVarA, aVarB2);
        }
        sh3.a aVarA3 = dVar.a();
        s.j(aVarA3);
        q89.e eVarA2 = mVar.a();
        s.j(eVarA2);
        sh3.a aVarA4 = dVar.a();
        s.j(aVarA4);
        ffk.t tVarF = aVar2.f();
        s.j(tVarF);
        di3.k kVar = new di3.k(aVarA4, tVarF, new di3.x());
        q89.e eVarA3 = mVar.a();
        s.j(eVarA3);
        rh3.b bVar2 = (rh3.b) aVar.f305812t.get();
        sf0.h hVarB = aVar.f305805l.b();
        s.j(hVarB);
        mt8.d dVarB = aVar3.b();
        s.j(dVarB);
        bd3.a aVarA5 = aVar.f305806m.a();
        s.j(aVarA5);
        xoj.a aVarA6 = aVar.f305807n.a();
        s.j(aVarA6);
        fk3.a aVarA7 = cVar.a();
        s.j(aVarA7);
        ffk.t tVarF2 = aVar2.f();
        s.j(tVarF2);
        fy2.d dVar2 = aVar.o;
        hy2.f fVarA = dVar2.a();
        z43.a aVarA8 = aVar.f305808p.a();
        s.j(aVarA8);
        di3.w wVar = new di3.w(eVarA3, bVar2, hVarB, dVarB, aVarA5, aVarA6, aVarA7, tVarF2, fVarA, aVarA8, dVar2.d());
        ei3.p pVar = new ei3.p();
        y51.a aVarA9 = aVar.f305809q.a();
        s.j(aVarA9);
        return new wh3.a(aVarA3, eVarA2, kVar, wVar, pVar, aVarA9, aVar.f305810r.e());
    }

    private final Object g() {
        xhi.b bVar = (xhi.b) this.f293073c;
        BaseFlow rootFlow = bVar.f306246a;
        fsi.g gVar = bVar.f;
        shi.a aVar = bVar.f306247b;
        e81.a aVar2 = bVar.d;
        int i = this.f293072b;
        if (i == 0) {
            return xhi.f.p(rootFlow, aVar.f263487c.a());
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            Fragment fragment = bVar.f306248c;
            xhi.e.Companion.getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            cpi.g gVar2 = new cpi.g(new FragmentFactory());
            od0.a aVar3 = od0.a.f224253a;
            if (od0.a.h()) {
                return sri.u.c(fragment, gVar2);
            }
            Context contextRequireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return new com.revolut.retail.core.navigation.b(contextRequireContext, null, sri.o.b(fragment.getContext()), new sri.a(fragment), gVar2, new sri.n(), new wri.b(), null, sri.o.a(fragment.getContext()), 384);
        }
        sri.m mVar = (sri.m) bVar.f306254n.get();
        g81.a aVarC = aVar2.c();
        s.j(aVarC);
        b81.c cVarB = aVar2.b();
        nhi.j jVar = (nhi.j) aVar.d.get();
        s.j(jVar);
        gte.a aVarB = bVar.e.b();
        s.j(aVarB);
        f9b.f fVarR0 = gVar.r0();
        s.j(fVarR0);
        eli.j jVarA = bVar.f306249g.a();
        msb.a aVarS0 = gVar.s0();
        s.j(aVarS0);
        wli.x xVarD = ((s41.a) bVar.f306250h).d();
        KompotFlowContract$Configuration configuration = bVar.i;
        asi.d userSessionInteractor = ((j51.a) bVar.f306251j).c();
        s.j(userSessionInteractor);
        Intrinsics.checkNotNullParameter(rootFlow, "rootFlow");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        gpk.c cVar = new gpk.c();
        cVar.f145463a = rootFlow;
        cVar.f145464b = configuration;
        cVar.f145465c = userSessionInteractor;
        o0 o0Var = (o0) ((q0) bVar.k).f196077s0.get();
        s.j(o0Var);
        return new com.revolut.kompot.bridge.impl.rootflow.a(mVar, aVarC, cVarB, jVar, aVarB, fVarR0, jVarA, aVarS0, xVarD, configuration, cVar, o0Var);
    }

    private final Object h() {
        xi3.b bVar = (xi3.b) this.f293073c;
        int i = this.f293072b;
        if (i == 0) {
            return new wi3.a();
        }
        if (i == 1) {
            return new zi3.a(bVar.f306303b);
        }
        if (i == 2) {
            return new zi3.c(new gi0.a());
        }
        throw new AssertionError(i);
    }

    private final Object i() {
        xj2.e eVar = (xj2.e) this.f293073c;
        f49.a aVar = eVar.f306454c;
        int i = this.f293072b;
        if (i == 0) {
            return xhi.f.x(eVar.f306452a, ((nj0.d) eVar.f306453b).f());
        }
        if (i == 1) {
            return new bk2.e();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        yj2.l lVarA = eVar.a();
        w39.b bVarA = aVar.a();
        s.j(bVarA);
        d49.a aVar2 = (d49.a) aVar.f132031l.get();
        s.j(aVar2);
        return new yj2.d(lVarA, bVarA, aVar2, xj2.c.a());
    }

    @Override // phm.a
    public final Object get() {
        Object eVar;
        Object pVar;
        int i = this.f293071a;
        int i2 = this.f293072b;
        Object obj2 = this.f293073c;
        switch (i) {
            case 0:
                h hVar = (h) obj2;
                if (i2 == 0) {
                    return new yxc.d();
                }
                if (i2 == 1) {
                    return new hr2.c((yxc.l) hVar.f293075b.get(), (yxc.l) hVar.f293075b.get(), (z9l.b) hVar.f293074a.get(), new fnc.s((yxc.l) hVar.f293075b.get()));
                }
                if (i2 == 2) {
                    return new yxc.l();
                }
                throw new AssertionError(i2);
            case 1:
                w5j.b bVar = (w5j.b) obj2;
                ee0.a aVar = bVar.f295298h;
                switch (i2) {
                    case 0:
                        b90.a aVarA = bVar.f295294a.a();
                        s.j(aVarA);
                        q06.d dVarA = bVar.f295295b.a();
                        s.j(dVarA);
                        t70.g gVarO = bVar.f295296c.o();
                        s.j(gVarO);
                        uli.f fVar = (uli.f) bVar.d.f16836b.get();
                        s.j(fVar);
                        return new y5j.k(aVarA, dVarA, gVarO, fVar);
                    case 1:
                        sri.m mVar = (sri.m) bVar.K.get();
                        xoj.a aVarA2 = bVar.f.a();
                        s.j(aVarA2);
                        sj3.a aVar2 = (sj3.a) bVar.f295297g.f314404m.get();
                        s.j(aVar2);
                        return new a6j.d(mVar, aVarA2, aVar2);
                    case 2:
                        return v.v(bVar.e);
                    case 3:
                        je0.d dVarB = aVar.b();
                        s.j(dVarB);
                        yk0.a aVarB = bVar.i.b();
                        s.j(aVarB);
                        xe0.f fVarF = aVar.f();
                        s.j(fVarF);
                        return v.j(dVarB, fVarF, aVarB);
                    case 4:
                        return new v5j.a();
                    case 5:
                        return new t5j.b((ue0.c) bVar.M.get());
                    case 6:
                        return new y5j.g((ue0.c) bVar.M.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                w9e.a aVar3 = (w9e.a) obj2;
                if (i2 == 0) {
                    return new x9e.b(aVar3.f295713a, aVar3.f295714b, aVar3.f295715c, aVar3.d, aVar3.e, aVar3.f, aVar3.f295716g, aVar3.f295717h, aVar3.i, aVar3.f295718j, aVar3.k, aVar3.f295719l, aVar3.f295720m, aVar3.f295721n, aVar3.o, aVar3.f295722p, aVar3.f295723q, aVar3.f295724r, aVar3.f295725s, aVar3.f295726t, aVar3.u, aVar3.v, aVar3.f295727w, aVar3.f295728x, aVar3.f295729y, aVar3.z, aVar3.A);
                }
                if (i2 == 1) {
                    return w40.c.D((x9e.b) aVar3.B.get());
                }
                throw new AssertionError(i2);
            case 3:
                w9k.a aVar4 = (w9k.a) obj2;
                switch (i2) {
                    case 0:
                        sri.m mVar2 = (sri.m) aVar4.i.get();
                        x9k.a aVar5 = (x9k.a) aVar4.f295755m.get();
                        aa5.a aVar6 = (aa5.a) aVar4.f295756n.get();
                        zm0.c cVarJ = aVar4.d.j();
                        s.j(cVarJ);
                        return new v9k.c(mVar2, aVar5, aVar6, cVarJ);
                    case 1:
                        return w40.c.s(aVar4.f295748a);
                    case 2:
                        return new x9k.a((ba5.a) aVar4.f295754l.get());
                    case 3:
                        return new dak.b((ne0.j) aVar4.f295753j.get(), (ue0.c) aVar4.k.get());
                    case 4:
                        return new ne0.d();
                    case 5:
                        w9k.d dVar = aVar4.f295749b;
                        ee0.a aVar7 = aVar4.f295750c;
                        je0.d mapper = aVar7.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = aVar4.d.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory = aVar7.f();
                        s.j(storageFactory);
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.g(storageFactory, databaseSessionProvider, "pcw_auth", mapper, 1, null, false, 48);
                    case 6:
                        return new y9k.b((x9k.a) aVar4.f295755m.get());
                    case 7:
                        return new y9k.a();
                    case 8:
                        return new dak.f((PcwApplicationService) aVar4.f295759r.get(), (ne0.j) aVar4.f295753j.get());
                    case 9:
                        w9k.d dVar2 = aVar4.f295749b;
                        PcwApplicationService pcwApplicationService = (PcwApplicationService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar4.f295758q.get(), "retrofit", PcwApplicationService.class, "create(...)");
                        s.k(pcwApplicationService);
                        return pcwApplicationService;
                    case 10:
                        w9k.d dVar3 = aVar4.f295749b;
                        Retrofit retrofitI = ((c21.b) aVar4.e).i();
                        s.j(retrofitI);
                        kg.o oVar = (kg.o) aVar4.f295757p.get();
                        return j6.a.B(p.a.x(retrofitI, "retrofit", oVar, "gson"), oVar, "build(...)");
                    case 11:
                        w9k.d dVar4 = aVar4.f295749b;
                        kg.o gson = ((c21.b) aVar4.e).h();
                        s.j(gson);
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        kg.o oVarB = new kg.p(gson).b();
                        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                        return oVarB;
                    case 12:
                        dak.f pcwCreditApplicationRepository = (dak.f) aVar4.f295760s.get();
                        xoj.a featuresInteractor = aVar4.f.a();
                        s.j(featuresInteractor);
                        x9k.a pcwAuthInteractor = (x9k.a) aVar4.f295755m.get();
                        ang.f userInteractor = aVar4.f295751g.e();
                        zm0.c sessionProvider = aVar4.d.j();
                        s.j(sessionProvider);
                        xq3.j creditAcknowledgementInteractor = aVar4.f295752h.d();
                        s.j(creditAcknowledgementInteractor);
                        Intrinsics.checkNotNullParameter(pcwCreditApplicationRepository, "pcwCreditApplicationRepository");
                        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                        Intrinsics.checkNotNullParameter(pcwAuthInteractor, "pcwAuthInteractor");
                        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
                        Intrinsics.checkNotNullParameter(creditAcknowledgementInteractor, "creditAcknowledgementInteractor");
                        return new x9k.b();
                    case 13:
                        x9k.b pcwCreditApplicationInteractor = (x9k.b) aVar4.f295761t.get();
                        x9k.a pcwAuthInteractor2 = (x9k.a) aVar4.f295755m.get();
                        zm0.c sessionProvider2 = aVar4.d.j();
                        s.j(sessionProvider2);
                        Intrinsics.checkNotNullParameter(pcwCreditApplicationInteractor, "pcwCreditApplicationInteractor");
                        Intrinsics.checkNotNullParameter(pcwAuthInteractor2, "pcwAuthInteractor");
                        Intrinsics.checkNotNullParameter(sessionProvider2, "sessionProvider");
                        return new qf.b(18);
                    default:
                        throw new AssertionError(i2);
                }
            case 4:
                if (i2 == 0) {
                    return new tab.b();
                }
                if (i2 == 1) {
                    return new uab.a(((wab.a) obj2).f295856a.a());
                }
                throw new AssertionError(i2);
            case 5:
                if (i2 == 0) {
                    wb1.a aVar8 = (wb1.a) obj2;
                    return xb1.a.a(aVar8.f295991b, aVar8.f295992c, aVar8.d, aVar8.e, aVar8.f, aVar8.f295993g, aVar8.f295990a);
                }
                if (i2 == 1) {
                    return xb1.d.a();
                }
                throw new AssertionError(i2);
            case 6:
                whc.s sVar = (whc.s) obj2;
                ite.a aVar9 = sVar.f297567a;
                whc.b bVar2 = sVar.f297568b;
                efk.a aVar10 = sVar.d;
                switch (i2) {
                    case 0:
                        gte.a aVarB2 = aVar9.b();
                        s.j(aVarB2);
                        phc.a aVarC = bVar2.c();
                        s.j(aVarC);
                        toa.a aVarA3 = sVar.f297569c.a();
                        s.j(aVarA3);
                        ffk.t tVarF = aVar10.f();
                        s.j(tVarF);
                        w39.b bVarA = sVar.e.a();
                        s.j(bVarA);
                        ang.f fVarE = sVar.f.e();
                        phc.a aVarC2 = bVar2.c();
                        s.j(aVarC2);
                        return new ugc.g(aVarB2, aVarC, aVarA3, tVarF, bVarA, fVarE, new ugc.n(aVarC2));
                    case 1:
                        wgc.c cVar = (wgc.c) sVar.v.get();
                        ffk.t tVarF2 = aVar10.f();
                        s.j(tVarF2);
                        xhc.d dVar5 = new xhc.d(sVar.d(), ((k3) sVar.i).b(), sVar.f297571h.g());
                        gte.a aVarB3 = aVar9.b();
                        s.j(aVarB3);
                        eVar = new xhc.e(cVar, tVarF2, dVar5, aVarB3);
                        break;
                    case 2:
                        igc.a aVarD = bVar2.d();
                        s.j(aVarD);
                        ffk.t tVarF3 = aVar10.f();
                        s.j(tVarF3);
                        sfk.a aVarE = aVar10.e();
                        s.j(aVarE);
                        lfm.c cVarB = ((g8b.a) sVar.f297570g).b();
                        s.j(cVarB);
                        return new wgc.c(aVarD, tVarF3, aVarE, cVarB);
                    case 3:
                        return new sic.d(new sic.b());
                    case 4:
                        return new pic.f(sVar.f(), new pic.b());
                    case 5:
                        eVar = new yhc.b(new sic.d(new sic.b()), sVar.e(), (kgc.c) sVar.f297583y.get(), (yhc.a) sVar.z.get(), sVar.k.a());
                        break;
                    case 6:
                        return new yhc.c();
                    case 7:
                        return new yhc.a();
                    default:
                        throw new AssertionError(i2);
                }
                return eVar;
            case 7:
                if (i2 == 0) {
                    return new ui8.a();
                }
                if (i2 == 1) {
                    return w40.c.B(((wi8.e) obj2).f297848b);
                }
                throw new AssertionError(i2);
            case 8:
                wk3.a aVar11 = (wk3.a) obj2;
                if (i2 == 0) {
                    return new xk3.a((al3.a) aVar11.d.get());
                }
                if (i2 == 1) {
                    return new al3.a(aVar11.f298230a.c(), (LoginService) aVar11.f298232c.get());
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                Retrofit retrofitI2 = ((c21.b) aVar11.f298231b).i();
                s.j(retrofitI2);
                return w40.c.r(retrofitI2);
            case 9:
                wpg.l lVar = (wpg.l) obj2;
                switch (i2) {
                    case 0:
                        sri.m mVarD = ((g8b.a) lVar.f299277a).d();
                        s.j(mVarD);
                        ppg.b bVar3 = (ppg.b) lVar.H.get();
                        xoj.a aVarA4 = lVar.f299281h.a();
                        s.j(aVarA4);
                        return new vpg.e(mVarD, bVar3, aVarA4, (kpg.a) lVar.I.get(), lVar.i.a());
                    case 1:
                        qdd.a aVarB4 = ((ded.a) lVar.f299278b).b();
                        s.j(aVarB4);
                        wsg.n nVarB = lVar.f299279c.b();
                        ppk.f fVarA = lVar.d.a();
                        lpg.b bVar4 = (lpg.b) lVar.G.get();
                        xvh.c cVarA = ((a6d.e) lVar.f299280g).a();
                        s.j(cVarA);
                        odd.a aVarA5 = ((ded.a) lVar.f299278b).a();
                        s.j(aVarA5);
                        return new ypg.p(aVarB4, nVarB, fVarA, bVar4, cVarA, aVarA5);
                    case 2:
                        b90.a aVarA6 = lVar.e.a();
                        s.j(aVarA6);
                        q06.d dVarA2 = lVar.f.a();
                        s.j(dVarA2);
                        return new cqg.b(aVarA6, dVarA2);
                    case 3:
                        return new aqg.b();
                    case 4:
                        return new ypg.e((dqg.a) lVar.O.get());
                    case 5:
                        return new dqg.e((SavingsService) lVar.L.get(), (ne0.j) lVar.M.get(), (ue0.c) lVar.N.get());
                    case 6:
                        return w40.c.u(lVar.f299282j, (Retrofit) lVar.K.get());
                    case 7:
                        wpg.s sVar2 = lVar.f299282j;
                        ik0.b retrofitFactory = ((nj0.d) lVar.k).m();
                        s.j(retrofitFactory);
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, null, null, 31);
                        s.k(retrofitA);
                        return retrofitA;
                    case 8:
                        return new ne0.d();
                    case 9:
                        je0.d dVarB2 = lVar.f299283l.b();
                        s.j(dVarB2);
                        yk0.a aVarB5 = lVar.f299284m.b();
                        s.j(aVarB5);
                        xe0.f fVarF2 = lVar.f299283l.f();
                        s.j(fVarF2);
                        return w40.c.v(dVarB2, fVarF2, aVarB5);
                    case 10:
                        qdd.a aVarB6 = ((ded.a) lVar.f299278b).b();
                        s.j(aVarB6);
                        return new ypg.f(aVarB6);
                    case 11:
                        return new ypg.c();
                    case 12:
                        ppg.b bVar5 = (ppg.b) lVar.H.get();
                        ypg.c cVar2 = (ypg.c) lVar.R.get();
                        g6e.b bVarA2 = lVar.f299285n.a();
                        s.j(bVarA2);
                        y91.b bVarA3 = lVar.i.a();
                        p38.a aVarA7 = lVar.o.a();
                        s.j(aVarA7);
                        gte.a aVarB7 = lVar.f299286p.b();
                        s.j(aVarB7);
                        return new ypg.b(bVar5, cVar2, bVarA2, bVarA3, aVarA7, aVarB7);
                    case 13:
                        return new ypg.d((dqg.a) lVar.O.get());
                    case 14:
                        return new rqg.a();
                    case 15:
                        xzi.a aVar12 = (xzi.a) ((dqj.r) lVar.f299287q).Y.get();
                        s.j(aVar12);
                        m93.d dVarF = lVar.f299288r.f();
                        s.j(dVarF);
                        return new zpg.d(aVar12, dVarF, (hpg.a) lVar.V.get());
                    case 16:
                        return new zpg.a((m7a.a) lVar.U.get());
                    case 17:
                        l80.e eVarH = lVar.f299289s.h();
                        s.j(eVarH);
                        t70.g gVarO2 = lVar.f299289s.o();
                        s.j(gVarO2);
                        return new m7a.b(eVarH, gVarO2);
                    case 18:
                        je0.d dVarB3 = lVar.f299283l.b();
                        s.j(dVarB3);
                        yk0.a aVarB8 = lVar.f299284m.b();
                        s.j(aVarB8);
                        xe0.f fVarF3 = lVar.f299283l.f();
                        s.j(fVarF3);
                        return v.z(dVarB3, fVarF3, aVarB8);
                    case 19:
                        return new rpg.a(ImmutableMap.of("VaultsCurrencyPickerInteractor", (a8a.d) lVar.X.get()));
                    case 20:
                        return new gqg.b();
                    case 21:
                        return new zqg.a();
                    default:
                        throw new AssertionError(i2);
                }
            case 10:
                wq6.a aVar13 = (wq6.a) obj2;
                if (i2 == 0) {
                    Retrofit retrofit = (Retrofit) aVar13.e.get();
                    wq6.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                    Object objCreate = retrofit.create(FormWizardService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                    FormWizardService formWizardService = (FormWizardService) objCreate;
                    s.k(formWizardService);
                    return new ar6.c(formWizardService, (t90.g) aVar13.f.get(), new yq6.a());
                }
                if (i2 == 1) {
                    return l9.i((kg.o) aVar13.d.get(), ((nj0.d) aVar13.f299411a).f());
                }
                if (i2 == 2) {
                    return l9.f(fe0.c.a(), new s90.a());
                }
                if (i2 == 3) {
                    return new t90.g(new e84.e(new v90.h(), new v90.e(new u90.x()), new v90.e(wq6.a.c()), new v90.c(), new v90.e(new u90.a0()), new v90.d(aVar13.b(), new t90.a(), wq6.a.c(), new c0(new u90.y())), new v90.i(aVar13.b()), new v90.g(new t90.a(), new u90.y(), new u90.a0(), wq6.a.c()), new v90.b(aVar13.b(), new t90.a(), wq6.a.c())));
                }
                if (i2 == 4) {
                    f80.a aVarX = aVar13.f299412b.x();
                    s.j(aVarX);
                    return new zq6.a(aVarX);
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                sri.m mVarD2 = ((g8b.a) aVar13.f299413c).d();
                s.j(mVarD2);
                return new br6.b(mVarD2);
            case 11:
                wzl.a aVar14 = (wzl.a) obj2;
                an0.c cVar3 = aVar14.f301428a;
                if (i2 == 0) {
                    return new vzl.b();
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                zm0.c cVarJ2 = cVar3.j();
                s.j(cVarJ2);
                vzl.a dashboardPushMessageDeeplinkTransformer = new vzl.a(cVarJ2);
                q06.d dVarA3 = aVar14.f301429b.a();
                s.j(dVarA3);
                zm0.c cVarJ3 = cVar3.j();
                s.j(cVarJ3);
                vzl.c walletPushMessageDeeplinkTransformer = new vzl.c(dVarA3, cVarJ3);
                upa.a remoteStoriesPushMessageDeeplinkTransformer = (upa.a) aVar14.f301430c.e.get();
                s.j(remoteStoriesPushMessageDeeplinkTransformer);
                wzl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(dashboardPushMessageDeeplinkTransformer, "dashboardPushMessageDeeplinkTransformer");
                Intrinsics.checkNotNullParameter(walletPushMessageDeeplinkTransformer, "walletPushMessageDeeplinkTransformer");
                Intrinsics.checkNotNullParameter(remoteStoriesPushMessageDeeplinkTransformer, "remoteStoriesPushMessageDeeplinkTransformer");
                mpa.a[] elements = {dashboardPushMessageDeeplinkTransformer, walletPushMessageDeeplinkTransformer, remoteStoriesPushMessageDeeplinkTransformer};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set setY0 = kotlin.collections.d.y0(elements);
                s.k(setY0);
                return setY0;
            case 12:
                x0g.a aVar15 = (x0g.a) obj2;
                a31.a aVar16 = aVar15.B;
                a31.a aVar17 = aVar15.f301625r;
                if (i2 == 0) {
                    return new t15.b(aVar15.f301614a, aVar15.f301615b, aVar15.f301616c, aVar15.d, aVar15.e, aVar15.f, aVar15.f301617g, aVar15.f301618h, aVar15.i, aVar15.f301619j, aVar15.k, aVar15.f301620l, aVar15.f301621m, aVar15.f301622n, aVar15.o, aVar15.f301623p, aVar15.f301624q, aVar17, aVar15.f301626s, aVar15.f301627t, aVar15.u, aVar15.v, aVar15.f301628w, aVar15.f301629x, aVar15.f301630y, aVar15.z, aVar15.A, aVar16, 1);
                }
                if (i2 == 1) {
                    return yf6.b.c(aVar15.C, aVar15.D, aVar16);
                }
                if (i2 == 2) {
                    return yf6.b.b(aVar17);
                }
                throw new AssertionError(i2);
            case 13:
                x13.p pVar2 = (x13.p) obj2;
                ta9.m mVar3 = pVar2.k;
                if (i2 == 0) {
                    gte.a aVarB9 = pVar2.f302155a.b();
                    s.j(aVarB9);
                    return new w13.a(aVarB9);
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    z70.a aVarF = pVar2.f302157c.f();
                    s.j(aVarF);
                    return x13.c.a(aVarF);
                }
                l93.f fVarJ = pVar2.o.j();
                s.j(fVarJ);
                u89.a aVarB10 = mVar3.b();
                s.j(aVarB10);
                q89.e eVarA = mVar3.a();
                s.j(eVarA);
                li0.b bVarC = t2d.c.c(pVar2.f302168t.f271230a);
                uq8.a aVarC3 = ((oq8.a) pVar2.u).c();
                wsg.n nVarB2 = pVar2.f302165q.b();
                hj8.a aVarA8 = pVar2.v.a();
                s.j(aVarA8);
                return cwi.u.a(fVarJ, aVarB10, eVarA, bVarC, aVarC3, nVarB2, aVarA8);
            case 14:
                x2c.a aVar18 = (x2c.a) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ne0.d();
                    }
                    throw new AssertionError(i2);
                }
                cl3.a aVarD2 = aVar18.f302536a.d();
                s.j(aVarD2);
                return new y2c.c(aVarD2, (ne0.j) aVar18.f302537b.get());
            case 15:
                x3e.a aVar19 = (x3e.a) obj2;
                if (i2 == 0) {
                    return new w3e.c(aVar19.f302730b, aVar19.f302731c, aVar19.f302729a);
                }
                if (i2 == 1) {
                    return v.B((w3e.c) aVar19.f302732g.get());
                }
                throw new AssertionError(i2);
            case 16:
                x77.a aVar20 = (x77.a) obj2;
                a31.a aVar21 = aVar20.f303146c;
                a31.a aVar22 = aVar20.d;
                a31.a aVar23 = aVar20.f303152n;
                ecm.q qVar = aVar20.f303144a;
                if (i2 == 0) {
                    return new qc9.i(qVar, aVar20.f303145b, aVar21, aVar22, aVar20.e, aVar20.f, aVar20.f303147g, aVar20.f303148h, aVar20.i, aVar20.v, aVar20.f303153p, aVar20.f303154q, aVar20.f303155r, aVar20.f303156s, aVar23, aVar20.f303157t);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new y77.l(aVar20.f303149j, aVar20.k, aVar20.f303150l, aVar20.f303151m, aVar23, aVar22, aVar21, aVar20.o, qVar);
                    }
                    throw new AssertionError(i2);
                }
                h77.a aVar24 = (h77.a) ((y77.l) aVar20.u.get()).b();
                s.k(aVar24);
                return aVar24;
            case 17:
                x9e.a aVar25 = (x9e.a) obj2;
                switch (i2) {
                    case 0:
                        return new i9e.c(aVar25.f303665a.a());
                    case 1:
                        e4m.e eVar2 = aVar25.z;
                        l70.e eVar3 = aVar25.e;
                        ite.a aVar26 = aVar25.f303669h;
                        djf.c cVar4 = aVar25.f303667c;
                        mae.h hVar2 = (mae.h) eVar2.get();
                        j9l.a aVarB11 = aVar25.d.b();
                        l80.e eVarH2 = eVar3.h();
                        s.j(eVarH2);
                        thf.c cVarC = cVar4.c();
                        s.j(cVarC);
                        thf.l lVarF = cVar4.f();
                        s.j(lVarF);
                        nr2.d dVar6 = (nr2.d) aVar25.f.f273705a.get();
                        s.j(dVar6);
                        jla.h hVarA = aVar25.f303668g.a();
                        gte.a aVarB12 = aVar26.b();
                        s.j(aVarB12);
                        i9e.z zVar = new i9e.z(aVarB12);
                        nm1.b bVarA4 = aVar25.i.a();
                        s.j(bVarA4);
                        mae.h hVar3 = (mae.h) aVar25.z.get();
                        vi9.b bVarL = aVar25.f303670j.l();
                        m35.q qVarB = aVar25.k.f277124a.b();
                        m3j.j jVarD = b3j.p.d();
                        thf.c cVarC2 = cVar4.c();
                        s.j(cVarC2);
                        c6c.a aVar27 = (c6c.a) aVar25.f303671l.g0.get();
                        s.j(aVar27);
                        a9e.c cVar5 = (a9e.c) aVar25.A.get();
                        mae.c cVar6 = new mae.c();
                        vb8.b bVar6 = new vb8.b();
                        dl3.f fVarC = aVar25.f303672m.c();
                        s.j(fVarC);
                        mae.m mVar4 = new mae.m(hVar3, bVarL, qVarB, jVarD, cVarC2, aVar27, cVar5, cVar6, bVar6, fVarC, new mae.k(b3j.p.d(), new vb8.b()), new mae.a());
                        mae.k kVar = new mae.k(b3j.p.d(), new vb8.b());
                        l80.e eVarH3 = eVar3.h();
                        s.j(eVarH3);
                        mae.e eVar4 = new mae.e();
                        gte.a aVarB13 = aVar26.b();
                        s.j(aVarB13);
                        mae.r rVar = new mae.r(eVarH3, eVar4, aVarB13);
                        gte.a aVarB14 = aVar26.b();
                        s.j(aVarB14);
                        pVar = new mae.p(hVar2, aVarB11, eVarH2, cVarC, lVarF, dVar6, hVarA, zVar, bVarA4, mVar4, kVar, rVar, new g1i.c(aVarB14, 1));
                        break;
                    case 2:
                        jm4.r rVar2 = aVar25.f303666b;
                        ep4.a aVar28 = new ep4.a();
                        bnf.a aVar29 = (bnf.a) aVar25.f303667c.z.get();
                        s.j(aVar29);
                        return new mae.h(aVar28, aVar29);
                    case 3:
                        return new mae.f();
                    case 4:
                        return new yae.a();
                    case 5:
                        ava.b bVar7 = aVar25.f303673n;
                        l70.e eVar5 = aVar25.e;
                        uc.d dVarA4 = bVar7.a();
                        com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) aVar25.o).c();
                        s.j(aVarC4);
                        b80.c cVarP = eVar5.p();
                        s.j(cVarP);
                        wsg.n nVarB3 = aVar25.f303674p.b();
                        e61.a aVarA9 = ((n51.a) aVar25.f303675q).a();
                        s.j(aVarA9);
                        ppg.b bVarB = ((wpg.l) aVar25.f303676r).b();
                        s.j(bVarB);
                        q7c.d dVar7 = (q7c.d) aVar25.f303671l.f0.get();
                        s.j(dVar7);
                        l80.e eVarH4 = eVar5.h();
                        s.j(eVarH4);
                        gte.a aVarB15 = aVar25.f303669h.b();
                        s.j(aVarB15);
                        mk0.a aVarA10 = aVar25.f303677s.a();
                        s.j(aVarA10);
                        jla.h hVarA2 = aVar25.f303668g.a();
                        cl3.a aVarD3 = aVar25.f303672m.d();
                        s.j(aVarD3);
                        pVar = new kce.q(dVarA4, aVarC4, cVarP, nVarB3, aVarA9, bVarB, dVar7, eVarH4, aVarB15, aVarA10, hVarA2, aVarD3, (d9e.b) aVar25.C.get());
                        break;
                    case 6:
                        xua.a aVarA11 = aVar25.f303678t.a();
                        s.j(aVarA11);
                        com.revolut.domain.interactors.transactions.a aVarC5 = ((bjf.a) aVar25.o).c();
                        s.j(aVarC5);
                        return new wae.e(aVarA11, aVarC5);
                    case 7:
                        iva.a aVarA12 = aVar25.u.a();
                        s.j(aVarA12);
                        nm1.c cVarB2 = aVar25.i.b();
                        s.j(cVarB2);
                        return new rae.c(aVarA12, cVarB2);
                    case 8:
                        mae.h hVar4 = (mae.h) aVar25.z.get();
                        ppg.b bVarB2 = ((wpg.l) aVar25.f303676r).b();
                        s.j(bVarB2);
                        l80.e eVarH5 = aVar25.e.h();
                        s.j(eVarH5);
                        c9e.c cVar7 = (c9e.c) aVar25.E.get();
                        y8k.b bVarA5 = aVar25.v.a();
                        x2k.e eVar6 = new x2k.e();
                        un9.a aVarD4 = aVar25.f303679w.d();
                        s.j(aVarD4);
                        gte.a aVarB16 = aVar25.f303669h.b();
                        s.j(aVarB16);
                        return new rae.d(hVar4, bVarB2, eVarH5, cVar7, bVarA5, eVar6, aVarD4, aVarB16);
                    case 9:
                        g9e.a aVar30 = (g9e.a) aVar25.D.get();
                        wsg.n nVarB4 = aVar25.f303674p.b();
                        a9e.a aVar31 = (a9e.a) aVar25.G.get();
                        l80.e eVarH6 = aVar25.e.h();
                        s.j(eVarH6);
                        return new mce.d(aVar30, nVarB4, new mce.f(aVar31, eVarH6), aVar25.d.b(), (c9e.c) aVar25.E.get(), new mce.a(), aVar25.f303666b.a());
                    case 10:
                        mae.p pVar3 = (mae.p) aVar25.B.get();
                        f01.c cVarG = aVar25.f303680x.g();
                        t70.b bVarG = aVar25.e.g();
                        s.j(bVarG);
                        return v.f(pVar3, cVarG, bVarG);
                    case 11:
                        return new ice.p();
                    default:
                        throw new AssertionError(i2);
                }
                return pVar;
            case 18:
                xb1.t tVar = (xb1.t) obj2;
                if (i2 == 0) {
                    t53.a aVar32 = (t53.a) tVar.f303967a.f259914g.get();
                    s.j(aVar32);
                    return new pc1.a(aVar32);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                ma1.d dVar8 = (ma1.d) tVar.f303968b.R.get();
                s.j(dVar8);
                return new fc1.a(dVar8);
            case 19:
                return a();
            case 20:
                xd8.a aVar33 = (xd8.a) obj2;
                a31.a aVar34 = aVar33.f;
                a31.a aVar35 = aVar33.i;
                if (i2 == 0) {
                    return new zd8.g(aVar33.f304288a, aVar33.f304289b, aVar33.f304290c, aVar33.d, aVar33.e, aVar34, aVar33.f304291g, aVar33.f304292h, aVar35, aVar33.f304293j, aVar33.k);
                }
                if (i2 == 1) {
                    return f1.a(aVar33.f304294l, aVar35, aVar33.f304299r, aVar34, aVar33.f304295m, aVar33.f304296n, aVar33.o, aVar33.f304297p);
                }
                if (i2 == 2) {
                    return xb1.a.B((zd8.g) aVar33.f304298q.get());
                }
                throw new AssertionError(i2);
            case 21:
                return b();
            case 22:
                return c();
            case 23:
                return d();
            case 24:
                return e();
            case 25:
                return f();
            case 26:
                return g();
            case 27:
                return h();
            case 28:
                return i();
            default:
                xmg.a aVar36 = (xmg.a) obj2;
                switch (i2) {
                    case 0:
                        return new wmg.c();
                    case 1:
                        UserService userService = (UserService) aVar36.f307253p.get();
                        ue0.c cVar8 = (ue0.c) aVar36.f307254q.get();
                        ne0.j jVar = (ne0.j) aVar36.f307255r.get();
                        sf0.h hVarB = aVar36.e.b();
                        s.j(hVarB);
                        gm0.f fVar2 = (gm0.f) aVar36.f.f175903n.get();
                        s.j(fVar2);
                        ze0.a aVarA13 = aVar36.f307246c.a();
                        s.j(aVarA13);
                        return new hng.q(userService, cVar8, jVar, hVarB, fVar2, aVarA13);
                    case 2:
                        xmg.b bVar8 = aVar36.f307244a;
                        UserService userService2 = (UserService) a0.d.f((nj0.d) aVar36.f307245b, "retrofit", UserService.class, "create(...)");
                        s.k(userService2);
                        return userService2;
                    case 3:
                        je0.d mapper2 = aVar36.f307246c.b();
                        s.j(mapper2);
                        yk0.a databaseSessionProvider2 = aVar36.d.b();
                        s.j(databaseSessionProvider2);
                        xe0.f storageFactory2 = aVar36.f307246c.f();
                        s.j(storageFactory2);
                        xmg.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider2, "profile_storage", mapper2, 0, null, 56);
                    case 4:
                        return new ne0.d();
                    case 5:
                        gng.a aVar37 = (gng.a) aVar36.f307256s.get();
                        hng.b bVarB3 = aVar36.i.b();
                        s.j(bVarB3);
                        return new zmg.d(aVar37, bVarB3);
                    case 6:
                        return new ang.b((hng.g) aVar36.v.get());
                    case 7:
                        return new hng.g((UserService) aVar36.f307253p.get(), (ne0.j) aVar36.f307255r.get(), (ue0.c) aVar36.u.get());
                    case 8:
                        je0.d dVarB4 = aVar36.f307246c.b();
                        s.j(dVarB4);
                        yk0.a aVarB17 = aVar36.d.b();
                        s.j(aVarB17);
                        xe0.f fVarF4 = aVar36.f307246c.f();
                        s.j(fVarF4);
                        return xhi.f.A(dVarB4, fVarF4, aVarB17);
                    case 9:
                        return new ang.c((hng.g) aVar36.v.get());
                    case 10:
                        return new ing.b(aVar36.f307250l, new ang.a((ue0.c) aVar36.f307254q.get()));
                    default:
                        throw new AssertionError(i2);
                }
        }
    }
}
