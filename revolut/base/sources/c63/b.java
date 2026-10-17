package c63;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.lifecycle.Lifecycle;
import anf.o;
import anf.s;
import b3j.p;
import bnf.r;
import bnf.t;
import ch.qos.logback.core.net.SyslogConstants;
import cnf.k;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cards_core.impl.data.db.CardsDatabase;
import com.revolut.feature.cards_core.impl.data.network.promotions.CardPromotionsService;
import com.revolut.feature.cards_core.impl.data.network.revolutcard.RevolutCardScaService;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.CongratulationsPluginFactory;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.StatusDialogPluginFactory;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.WorkflowPluginFactory;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.linked_accounts.LinkedAccountsV3PluginFactory;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.network.TicketorService;
import com.revolut.feature.credit.tiles.impl.network.services.CreditTilesService;
import com.revolut.feature.joint.impl.data.network.JointService;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.ArticleService;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.NotificationCentreService;
import com.revolut.feature.on_hold.accounts.impl.network.BlockedFundsService;
import com.revolut.feature.robo.impl.data.network.RoboAccountService;
import com.revolut.feature.robo.impl.data.network.TemplateService;
import com.revolut.feature.shops.impl.db.ShopsDatabase;
import did.d0;
import did.y;
import dw3.c1;
import e4m.e;
import efk.j;
import ft3.j1;
import g48.r0;
import g48.z;
import g9g.p1;
import hmc.w;
import hw3.b0;
import hw3.c0;
import hw3.h0;
import hw3.x;
import java.util.List;
import jr6.v;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import m35.q;
import mz3.a1;
import mz3.a3;
import mz3.b1;
import mz3.b3;
import mz3.c2;
import mz3.c3;
import mz3.d1;
import mz3.d2;
import mz3.d3;
import mz3.e1;
import mz3.e3;
import mz3.f0;
import mz3.f2;
import mz3.g0;
import mz3.g1;
import mz3.g2;
import mz3.g3;
import mz3.h1;
import mz3.i1;
import mz3.i2;
import mz3.i3;
import mz3.j3;
import mz3.k3;
import mz3.l2;
import mz3.l3;
import mz3.m0;
import mz3.m3;
import mz3.o0;
import mz3.p0;
import mz3.q0;
import mz3.q2;
import mz3.q3;
import mz3.r1;
import mz3.s1;
import mz3.s2;
import mz3.t0;
import mz3.u2;
import mz3.u3;
import mz3.v2;
import mz3.v3;
import mz3.w0;
import mz3.w3;
import mz3.x0;
import mz3.x2;
import mz3.y0;
import mz3.y1;
import mz3.y2;
import mz3.z1;
import mz3.z2;
import net.sf.scuba.smartcards.ISO7816;
import nx4.f1;
import om4.m4;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import p8a.q1;
import plc.n;
import retrofit2.Retrofit;
import t70.g;
import thf.i;
import thf.l;
import thf.m;
import u90.a0;
import y45.h;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21597c;

    public /* synthetic */ b(Object obj2, int i, int i2) {
        this.f21595a = i2;
        this.f21597c = obj2;
        this.f21596b = i;
    }

    private final Object a() {
        djf.c cVar = (djf.c) this.f21597c;
        int i = this.f21596b;
        switch (i) {
            case 0:
                return j.h((s) cVar.P.get(), (anf.b) cVar.Q.get());
            case 1:
                nhf.a aVarA = cVar.f115329a.a();
                vc.s.j(aVarA);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.f115330b).c();
                vc.s.j(aVarC);
                l lVar = (l) cVar.N.get();
                i iVar = (i) cVar.O.get();
                d3j.b bVarE = ((p) cVar.e).e();
                h hVarG = cVar.f115337n.g();
                vc.s.j(hVarG);
                ar3.c cVar2 = (ar3.c) cVar.u.O.get();
                vc.s.j(cVar2);
                return new s(aVarA, aVarC, lVar, iVar, bVarE, hVarG, cVar2);
            case 2:
                lfm.c cVarB = ((g8b.a) cVar.f115331c).b();
                vc.s.j(cVarB);
                thf.d dVar = (thf.d) cVar.B.get();
                m mVar = (m) cVar.K.get();
                thf.b bVar = (thf.b) cVar.L.get();
                qhf.a aVar = (qhf.a) cVar.M.get();
                wa7.p pVarE = cVar.f115342t.e();
                sj5.a aVarD = ((ak5.i) cVar.f115335l).d();
                vc.s.j(aVarD);
                return new o(cVarB, dVar, mVar, bVar, aVar, pVarE, aVarD);
            case 3:
                e eVar = cVar.f115345y;
                h9h.a aVar2 = cVar.f115333h;
                thf.c cVar3 = (thf.c) eVar.get();
                m3j.j jVarD = p.d();
                aqa.a aVarA2 = ((jqa.p) cVar.f).a();
                vc.s.j(aVarA2);
                v vVar = (v) cVar.f115332g.B0.get();
                vc.s.j(vVar);
                zpg.h hVar = new zpg.h();
                dnf.b bVar2 = new dnf.b(new f(aVar2.H()));
                m38.b bVar3 = (m38.b) cVar.i.f122397s.get();
                vc.s.j(bVar3);
                ue8.d dVar2 = (ue8.d) cVar.f115334j.B.get();
                vc.s.j(dVar2);
                l6e.a aVarA3 = cVar.k.a();
                vc.s.j(aVarA3);
                sj5.a aVarD2 = ((ak5.i) cVar.f115335l).d();
                vc.s.j(aVarD2);
                bnf.j jVar = new bnf.j(aVarD2);
                vfg.p pVarB = cVar.f115336m.b();
                q qVarB = cVar.f115337n.b();
                bnf.a aVar3 = (bnf.a) cVar.z.get();
                f01.a aVar4 = (f01.a) cVar.A.get();
                t tVar = new t();
                bnf.l lVar2 = new bnf.l();
                bnf.d dVar3 = new bnf.d(new dnf.b(new f(aVar2.H())));
                dl3.f fVarC = cVar.f115339q.c();
                vc.s.j(fVarC);
                return new bnf.o(cVar3, jVarD, aVarA2, vVar, hVar, bVar2, bVar3, dVar2, aVarA3, jVar, pVarB, qVarB, aVar3, aVar4, tVar, lVar2, dVar3, fVarC);
            case 4:
                g gVarO = cVar.d.o();
                vc.s.j(gVarO);
                return new wjf.e(gVarO);
            case 5:
                fk3.b bVarB = cVar.o.b();
                vc.s.j(bVarB);
                return new bnf.a(bVarB);
            case 6:
                return j.D(cVar.f115338p);
            case 7:
                g gVarO2 = cVar.d.o();
                vc.s.j(gVarO2);
                l6e.a aVarA4 = cVar.k.a();
                vc.s.j(aVarA4);
                cnf.f fVar = (cnf.f) cVar.J.get();
                cnf.m mVar2 = (cnf.m) cVar.C.get();
                f01.a aVar5 = (f01.a) cVar.A.get();
                n8b.b bVarB2 = cVar.f115340r.b();
                vc.s.j(bVarB2);
                v vVar2 = (v) cVar.f115332g.B0.get();
                vc.s.j(vVar2);
                return new r(gVarO2, aVarA4, fVar, mVar2, aVar5, bVarB2, vVar2, new zpg.h(), cVar.f115336m.b());
            case 8:
                return new cnf.i((cnf.m) cVar.C.get(), (cnf.c) cVar.I.get());
            case 9:
                return new cnf.m();
            case 10:
                return new cnf.c((cnf.b) cVar.G.get(), (cnf.a) cVar.H.get());
            case 11:
                return new cnf.b((k) cVar.D.get(), (cnf.j) cVar.E.get(), (cnf.e) cVar.F.get());
            case 12:
                return new cnf.l();
            case 13:
                return new cnf.j();
            case 14:
                return new cnf.e((f01.a) cVar.A.get());
            case 15:
                return new cnf.a((k) cVar.D.get(), (cnf.e) cVar.F.get());
            case 16:
                m mVar3 = (m) cVar.K.get();
                gte.a aVarB = cVar.f115341s.b();
                vc.s.j(aVarB);
                return new bnf.e(aVarB, mVar3);
            case 17:
                return new anf.d();
            case 18:
                thf.d dVar4 = (thf.d) cVar.B.get();
                m mVar4 = (m) cVar.K.get();
                thf.b bVar4 = (thf.b) cVar.L.get();
                wa7.p pVarE2 = cVar.f115342t.e();
                sj5.a aVarD3 = ((ak5.i) cVar.f115335l).d();
                vc.s.j(aVarD3);
                return new anf.l(dVar4, mVar4, bVar4, pVarE2, aVarD3);
            case 19:
                return new anf.b(cVar.v.b(), 0);
            case 20:
                return j.i((s) cVar.P.get(), (anf.b) cVar.Q.get());
            case 21:
                lfm.c cVarB2 = ((g8b.a) cVar.f115331c).b();
                vc.s.j(cVarB2);
                thf.d dVar5 = (thf.d) cVar.B.get();
                m mVar5 = (m) cVar.K.get();
                thf.b bVar5 = (thf.b) cVar.L.get();
                wa7.p pVarE3 = cVar.f115342t.e();
                sj5.a aVarD4 = ((ak5.i) cVar.f115335l).d();
                vc.s.j(aVarD4);
                return new anf.k(cVarB2, dVar5, mVar5, bVar5, pVarE3, aVarD4);
            case 22:
                thf.d dVar6 = (thf.d) cVar.B.get();
                m mVar6 = (m) cVar.K.get();
                thf.b bVar6 = (thf.b) cVar.L.get();
                wa7.p pVarE4 = cVar.f115342t.e();
                sj5.a aVarD5 = ((ak5.i) cVar.f115335l).d();
                vc.s.j(aVarD5);
                return new anf.e(dVar6, mVar6, bVar6, pVarE4, aVarD5);
            case 23:
                return new bnf.f();
            case 24:
                e eVar2 = cVar.W;
                mva.b bVar7 = cVar.f115343w;
                sri.m mVar7 = (sri.m) eVar2.get();
                iva.a aVarA5 = bVar7.a();
                vc.s.j(aVarA5);
                rjf.e eVar3 = new rjf.e(aVarA5);
                xua.a aVarA6 = cVar.f115344x.a();
                vc.s.j(aVarA6);
                iva.a aVarA7 = bVar7.a();
                vc.s.j(aVarA7);
                return new rjf.d(mVar7, eVar3, aVarA6, aVarA7);
            case 25:
                return j.u(cVar.f115338p);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        dmc.a aVar = (dmc.a) this.f21597c;
        int i = this.f21596b;
        switch (i) {
            case 0:
                RoboAccountService roboAccountService = (RoboAccountService) aVar.f115906j.get();
                rlc.c cVar = new rlc.c();
                ylc.b bVar = new ylc.b();
                wlc.b bVar2 = new wlc.b((ue0.c) aVar.k.get());
                nlc.a aVar2 = new nlc.a(new ne0.d(), 0);
                b80.c cVarP = aVar.e.p();
                vc.s.j(cVarP);
                return obk.d.q(new mlc.b(roboAccountService, cVar, bVar, bVar2, aVar2, cVarP));
            case 1:
                return qlc.b.C(aVar.f115901a, (Retrofit) aVar.i.get());
            case 2:
                return qlc.b.w(aVar.f115901a, ((nj0.d) aVar.f115902b).f(), (kg.o) aVar.f115905h.get());
            case 3:
                return qgh.c.k(aVar.f115901a, fe0.c.a());
            case 4:
                je0.d dVarB = aVar.f115903c.b();
                vc.s.j(dVarB);
                yk0.a aVarB = aVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = aVar.f115903c.f();
                vc.s.j(fVarF);
                return xhi.f.s(dVarB, fVarF, aVarB);
            case 5:
                return obk.d.r(new plc.f((RoboAccountService) aVar.f115906j.get(), new rlc.c(), new ylc.b(), (ue0.c) aVar.k.get(), new ne0.d()));
            case 6:
                b80.c cVarP2 = aVar.e.p();
                vc.s.j(cVarP2);
                return olc.c.w(new plc.l(cVarP2, (TemplateService) aVar.f115909n.get(), aVar.e(), new wlc.i((ue0.c) aVar.k.get()), new nlc.a(new ne0.d(), 4)));
            case 7:
                return qlc.b.D(aVar.f115901a, (Retrofit) aVar.i.get());
            case 8:
                b80.c cVarP3 = aVar.e.p();
                vc.s.j(cVarP3);
                return obk.d.v(new plc.j(cVarP3, (TemplateService) aVar.f115909n.get(), aVar.e(), new wlc.f((ue0.c) aVar.k.get()), new nlc.a(new ne0.d(), 1)));
            case 9:
                b80.c cVarP4 = aVar.e.p();
                vc.s.j(cVarP4);
                return obk.d.n(new plc.e(cVarP4, (TemplateService) aVar.f115909n.get(), aVar.e(), (ue0.c) aVar.k.get(), new ne0.d()));
            case 10:
                b80.c cVarP5 = aVar.e.p();
                vc.s.j(cVarP5);
                return olc.c.y(new plc.r(cVarP5, (TemplateService) aVar.f115909n.get(), aVar.e(), new wlc.d((ue0.c) aVar.k.get()), new ylc.d(), new nlc.a(new ne0.d(), 3)));
            case 11:
                b80.c cVarP6 = aVar.e.p();
                vc.s.j(cVarP6);
                return olc.c.x(new n(cVarP6, (TemplateService) aVar.f115909n.get(), aVar.e(), new ej9.c((ue0.c) aVar.k.get(), 4), new ylc.c(), new nlc.a(new ne0.d(), 2)));
            case 12:
                return obk.d.p(new frk.b((TemplateService) aVar.f115909n.get(), new ne0.d(), (ue0.c) aVar.k.get()));
            case 13:
                return obk.d.t(new plc.g((TemplateService) aVar.f115909n.get(), new ne0.d(), (ue0.c) aVar.k.get()));
            case 14:
                return obk.d.d(new plc.b((TemplateService) aVar.f115909n.get(), new ne0.d(), (ue0.c) aVar.k.get()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.f21596b;
        int i2 = i / 100;
        if (i2 == 0) {
            return i();
        }
        if (i2 != 1) {
            throw new AssertionError(i);
        }
        c1 c1Var = (c1) this.f21597c;
        switch (i) {
            case 100:
                return new k44.c((CreditPluginsService) c1Var.p0.get(), uq3.b.a(), new d24.e(), new d24.c(), new k44.b(fe0.c.a()));
            case 101:
                return new hw3.k(c1Var.k.e(), (p24.p) c1Var.f118469r0.get());
            case 102:
                return new hw3.a((p24.p) c1Var.u2.get());
            case 103:
                return new mx3.a((p34.a) c1Var.f118484w2.get());
            case 104:
                return new p34.a((CreditPluginsService) c1Var.p0.get(), uq3.b.a(), new l14.b());
            case 105:
                return new x((p24.p) c1Var.y2.get());
            case 106:
                gte.a aVarB = c1Var.f118423b.b();
                vc.s.j(aVarB);
                return new hw3.l(aVarB);
            case 107:
                return new j24.c(new sg4.a());
            case LDSFile.EF_DG12_TAG /* 108 */:
                uq3.b bVar = c1Var.f118428c;
                return new b34.b((CreditPluginsService) c1Var.p0.get(), uq3.b.a(), new ne0.d());
            case LDSFile.EF_DG13_TAG /* 109 */:
                return new nx3.a((r34.b) c1Var.E2.get());
            case LDSFile.EF_DG14_TAG /* 110 */:
                o14.h hVar = new o14.h();
                uq3.b bVar2 = c1Var.f118428c;
                mp.p pVarA = uq3.b.a();
                CreditPluginsService creditPluginsService = (CreditPluginsService) c1Var.p0.get();
                dr3.g gVarB = uq3.b.b();
                gte.a aVarB2 = c1Var.f118423b.b();
                vc.s.j(aVarB2);
                return new r34.b(hVar, pVarA, creditPluginsService, gVarB, aVarB2);
            case LDSFile.EF_DG15_TAG /* 111 */:
                return new ox3.a((s34.b) c1Var.G2.get());
            case 112:
                uq3.b bVar3 = c1Var.f118428c;
                return new s34.b(new p14.i(new p14.j(uq3.b.b())), new p14.a(), uq3.b.a(), (CreditPluginsService) c1Var.p0.get());
            case 113:
                j34.g gVar = (j34.g) c1Var.I2.get();
                wsg.n nVarB = c1Var.f118452l.b();
                oe6.a aVarA = c1Var.S.a();
                vc.s.j(aVarA);
                whf.b bVarA = c1Var.f0.a();
                vc.s.j(bVarA);
                return new hx3.g(gVar, nVarB, aVarA, bVarA);
            case 114:
                uq3.b bVar4 = c1Var.f118428c;
                d14.g gVar2 = new d14.g(uq3.b.b());
                d14.m mVar = new d14.m(uq3.b.b());
                mp.p pVarA2 = uq3.b.a();
                CreditPluginsService creditPluginsService2 = (CreditPluginsService) c1Var.p0.get();
                ve0.c cVarE = c1Var.e();
                m31.c cVarG = c1Var.f118419a.g();
                vc.s.j(cVarG);
                gte.a aVarB3 = c1Var.f118423b.b();
                vc.s.j(aVarB3);
                return new j34.g(gVar2, mVar, pVarA2, creditPluginsService2, cVarE, cVarG, aVarB3);
            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                return new h0((m24.a) c1Var.K2.get());
            case 116:
                return new m24.a((CreditPluginsService) c1Var.p0.get());
            case LDSFile.EF_DG2_TAG /* 117 */:
                return new rw3.a((w24.a) c1Var.M2.get());
            case LDSFile.EF_DG4_TAG /* 118 */:
                return new w24.a((CreditPluginsService) c1Var.p0.get(), new j04.b());
            case LDSFile.EF_SOD_TAG /* 119 */:
                return new b0((n34.b) c1Var.O2.get());
            case SyslogConstants.LOG_CLOCK /* 120 */:
                uq3.b bVar5 = c1Var.f118428c;
                return new n34.b((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 121:
                return new kx3.a((m34.c) c1Var.Q2.get());
            case 122:
                uq3.b bVar6 = c1Var.f118428c;
                mp.p pVarA3 = uq3.b.a();
                g14.b bVar7 = new g14.b(uq3.b.b(), 0);
                g14.d dVar = new g14.d(new g14.f());
                g14.f fVar = new g14.f();
                r10.d dVar2 = new r10.d(uq3.b.b(), new x04.h(uq3.b.b()));
                CreditPluginsService creditPluginsService3 = (CreditPluginsService) c1Var.p0.get();
                m31.c cVarG2 = c1Var.f118419a.g();
                vc.s.j(cVarG2);
                return new m34.c(pVarA3, bVar7, dVar, fVar, dVar2, creditPluginsService3, cVarG2);
            case 123:
                return new jw3.a((n24.c) c1Var.S2.get());
            case 124:
                return new n24.c(c1Var.e());
            case ISO781611.SMT_TAG /* 125 */:
                return new ax3.a((g34.a) c1Var.U2.get());
            case 126:
                uq3.b bVar8 = c1Var.f118428c;
                mp.p pVarA4 = uq3.b.a();
                x04.h hVar2 = new x04.h(uq3.b.b());
                CreditPluginsService creditPluginsService4 = (CreditPluginsService) c1Var.p0.get();
                m31.c cVarG3 = c1Var.f118419a.g();
                vc.s.j(cVarG3);
                return new g34.a(pVarA4, hVar2, creditPluginsService4, cVarG3);
            case CertificateBody.profileType /* 127 */:
                return new tw3.a((y24.a) c1Var.W2.get());
            case 128:
                uq3.b bVar9 = c1Var.f118428c;
                return new y24.a(uq3.b.a(), new l04.c(uq3.b.b()), new l04.f(), (CreditPluginsService) c1Var.p0.get());
            case 129:
                return new mw3.c((s24.a) c1Var.f118453l1.get());
            case 130:
                return new cy3.a((g44.b) c1Var.Z2.get());
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                uq3.b bVar10 = c1Var.f118428c;
                return new g44.b((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 132:
                return new ix3.a((k34.a) c1Var.f118427b3.get());
            case 133:
                uq3.b bVar11 = c1Var.f118428c;
                return new k34.a(new e14.d(uq3.b.b()), (CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
                return new wx3.c((a44.d) c1Var.f118433d3.get());
            case 135:
                CreditPluginsService creditPluginsService5 = (CreditPluginsService) c1Var.p0.get();
                g14.b bVar12 = new g14.b(uq3.b.b(), 1);
                m31.c cVarG4 = c1Var.f118419a.g();
                vc.s.j(cVarG4);
                mp.p pVarA5 = uq3.b.a();
                r80.c cVar = (r80.c) c1Var.f118443h.Z.get();
                vc.s.j(cVar);
                return new a44.d(creditPluginsService5, bVar12, cVarG4, pVarA5, cVar, c1Var.e());
            case 136:
                return new uw3.a((z24.a) c1Var.f118439f3.get());
            case 137:
                uq3.b bVar13 = c1Var.f118428c;
                return new z24.a(uq3.b.a(), (CreditPluginsService) c1Var.p0.get(), uq3.b.b());
            case 138:
                return new dy3.a((h44.a) c1Var.h3.get());
            case 139:
                uq3.b bVar14 = c1Var.f118428c;
                return new h44.a((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 140:
                return new fy3.a((j44.a) c1Var.j3.get());
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                return new j44.a((CreditPluginsService) c1Var.p0.get(), uq3.b.a(), new c24.i(), new c24.k());
            case 142:
                return new xx3.a((b44.a) c1Var.l3.get());
            case 143:
                uq3.b bVar15 = c1Var.f118428c;
                return new b44.a((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                return new yx3.a((c44.a) c1Var.n3.get());
            case 145:
                uq3.b bVar16 = c1Var.f118428c;
                return new c44.a((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 146:
                return new iw3.a((r24.d) c1Var.p3.get());
            case 147:
                return new r24.d((CreditPluginsService) c1Var.p0.get(), uq3.b.a(), new ne0.d());
            case 148:
                return new ey3.a((i44.b) c1Var.r3.get());
            case 149:
                b24.c cVar2 = new b24.c();
                uq3.b bVar17 = c1Var.f118428c;
                return new i44.b(cVar2, uq3.b.a(), (CreditPluginsService) c1Var.p0.get());
            case 150:
                return new qx3.a((u34.b) c1Var.t3.get());
            case ISO7816.TAG_SM_EXPECTED_LENGTH /* 151 */:
                return new u34.b((CreditPluginsService) c1Var.p0.get(), new nd.n(new f1(), new nx4.r()), uq3.b.a());
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                return new yw3.a((e34.c) c1Var.f118481v3.get());
            case 153:
                return new e34.c((CreditPluginsService) c1Var.p0.get(), new t04.o(uq3.b.b(), new t04.p()), new t04.q(), uq3.b.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        e48.a aVar = (e48.a) this.f21597c;
        int i = this.f21596b;
        switch (i) {
            case 0:
                mp.r rVar = new mp.r(aVar.f122386b.a());
                b48.b bVar = new b48.b((m38.a) aVar.f122391l.get());
                m38.a aVar2 = (m38.a) aVar.f122391l.get();
                yf.c cVar = new yf.c((m38.a) aVar.f122391l.get());
                JointService jointService = (JointService) aVar.f122392m.get();
                ue0.c cVar2 = (ue0.c) aVar.f122393n.get();
                ne0.j jVar = (ne0.j) aVar.o.get();
                y38.b bVar2 = (y38.b) aVar.f122394p.get();
                j48.b bVar3 = (j48.b) aVar.f122395q.get();
                gte.a aVarB = aVar.f122389h.b();
                vc.s.j(aVarB);
                return new c48.g(rVar, bVar, aVar2, cVar, jointService, cVar2, jVar, bVar2, bVar3, aVarB);
            case 1:
                return new b48.d();
            case 2:
                f48.c cVar3 = aVar.f122387c;
                JointService jointService2 = (JointService) a0.d.f((nj0.d) aVar.d, "retrofit", JointService.class, "create(...)");
                vc.s.k(jointService2);
                return jointService2;
            case 3:
                je0.d mapper = aVar.e.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = aVar.f.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.e.f();
                vc.s.j(storageFactory);
                f48.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "joint_accounts", mapper, 2, u.c(new exa.a(1, 2, 5)), 32);
            case 4:
                return new ne0.d();
            case 5:
                return f0k.d.m((ne0.j) aVar.o.get(), (ue0.c) aVar.f122393n.get());
            case 6:
                fn2.c cVarB = aVar.f122388g.b();
                gte.a aVarB2 = aVar.f122389h.b();
                vc.s.j(aVarB2);
                return new j48.b(cVarB, aVarB2);
            case 7:
                return new k48.c();
            case 8:
                y38.b bVar4 = (y38.b) aVar.f122394p.get();
                gte.a aVarB3 = aVar.f122389h.b();
                vc.s.j(aVarB3);
                return new j48.a(bVar4, aVarB3);
            case 9:
                gte.a aVarB4 = aVar.f122389h.b();
                vc.s.j(aVarB4);
                return new j48.c(aVarB4, (h38.c) aVar.f122398t.get(), aVar.f122388g.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        e48.b bVar = (e48.b) this.f21597c;
        a31.a aVar = bVar.d;
        a31.a aVar2 = bVar.f122402g;
        ecm.q qVar = bVar.f122399a;
        int i = this.f21596b;
        if (i == 0) {
            return new e48.s(bVar.f122400b, bVar.f122401c, aVar, bVar.e, bVar.f, aVar2, bVar.f122403h, bVar.i, bVar.f122404j, bVar.k, qVar);
        }
        if (i == 1) {
            return new dg6.b(qVar, bVar.f122409q, bVar.f122405l, aVar2, bVar.f122406m, bVar.f122407n, bVar.o, aVar, 1);
        }
        if (i == 2) {
            return dw3.l.z((e48.s) bVar.f122408p.get());
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        e48.g gVar = (e48.g) this.f21597c;
        int i = this.f21596b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            n8b.a aVarA = gVar.f122431m.a();
            vc.s.j(aVarA);
            return new l58.e(aVarA);
        }
        sri.m mVarD = ((g8b.a) gVar.f122424a).d();
        vc.s.j(mVarD);
        mp.r rVar = new mp.r(gVar.f122425b.a());
        rqi.c cVarB = gVar.f122426c.b();
        r0 r0VarC = gVar.d.c();
        wsg.n nVarB = gVar.e.b();
        ang.f fVarE = gVar.f.e();
        cl3.a aVarD = gVar.f122427g.d();
        vc.s.j(aVarD);
        e48.c cVar = gVar.f122428h;
        k38.a aVarA2 = cVar.a();
        vc.s.j(aVarA2);
        o38.a aVarC = cVar.c();
        vc.s.j(aVarC);
        z zVar = new z(r0VarC, nVarB, fVarE, aVarD, aVarA2, aVarC, cVar.b(), new w38.t());
        gte.a aVarB = gVar.i.b();
        vc.s.j(aVarB);
        return new g48.f(mVarD, rVar, cVarB, zVar, aVarB);
    }

    private final Object g() {
        e49.a aVar = (e49.a) this.f21597c;
        a31.a aVar2 = aVar.d;
        ecm.q qVar = aVar.f122508a;
        int i = this.f21596b;
        if (i == 0) {
            return new f49.c(qVar, aVar.f122509b, aVar.f122510c, aVar2, aVar.e, aVar.f, aVar.i);
        }
        if (i == 1) {
            return dw3.l.C((f49.d) aVar.f122512h.get());
        }
        if (i == 2) {
            return f0k.d.b(aVar2, aVar.f122511g, qVar);
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        e79.c cVar = (e79.c) this.f21597c;
        int i = this.f21596b;
        switch (i) {
            case 0:
                return new b79.s((ue0.c) cVar.f123117j.get(), (NotificationCentreService) cVar.f123119m.get(), ImmutableSet.of((z69.e) cVar.f123120n.get()));
            case 1:
                je0.d dVarB = cVar.f123112a.b();
                vc.s.j(dVarB);
                yk0.a aVarB = cVar.f123113b.b();
                vc.s.j(aVarB);
                xe0.f fVarF = cVar.f123112a.f();
                vc.s.j(fVarF);
                return e5f.b.y(dVarB, fVarF, aVarB);
            case 2:
                return e5f.b.t(cVar.f123114c, (Retrofit) cVar.f123118l.get());
            case 3:
                e79.m mVar = cVar.f123114c;
                Retrofit retrofitI = ((c21.b) cVar.d).i();
                vc.s.j(retrofitI);
                return e5f.b.o(mVar, retrofitI, (kg.o) cVar.k.get());
            case 4:
                e79.m mVar2 = cVar.f123114c;
                kg.o oVarH = ((c21.b) cVar.d).h();
                vc.s.j(oVarH);
                return e5f.b.m(mVar2, oVarH);
            case 5:
                return new z69.e();
            case 6:
                return new b79.r((ue0.c) cVar.f123122q.get(), (NotificationCentreService) cVar.f123119m.get(), ImmutableSet.of((f79.a) cVar.f123123r.get(), (f79.a) cVar.f123124s.get(), (f79.a) cVar.f123125t.get()), (f79.a) cVar.u.get(), (ne0.j) cVar.v.get());
            case 7:
                je0.d dVarB2 = cVar.f123112a.b();
                vc.s.j(dVarB2);
                yk0.a aVarB2 = cVar.f123113b.b();
                vc.s.j(aVarB2);
                xe0.f fVarF2 = cVar.f123112a.f();
                vc.s.j(fVarF2);
                return e5f.b.s(dVarB2, fVarF2, aVarB2);
            case 8:
                kg.o oVarH2 = ((c21.b) cVar.d).h();
                vc.s.j(oVarH2);
                return new z69.a(oVarH2, 0);
            case 9:
                kg.o oVarH3 = ((c21.b) cVar.d).h();
                vc.s.j(oVarH3);
                return new z69.a(oVarH3, 1);
            case 10:
                kg.o oVarH4 = ((c21.b) cVar.d).h();
                vc.s.j(oVarH4);
                return new z69.a(oVarH4, 2);
            case 11:
                kg.o oVarH5 = ((c21.b) cVar.d).h();
                vc.s.j(oVarH5);
                return new z69.d(oVarH5);
            case 12:
                return e79.l.a();
            case 13:
                return new nd.m((b79.n) cVar.f123128y.get(), (b79.s) cVar.z.get());
            case 14:
                b79.b bVar = (b79.b) cVar.B.get();
                r69.a aVarA = cVar.e.a();
                vc.s.j(aVarA);
                return new y69.a(bVar, aVarA);
            case 15:
                return new b79.b((ArticleService) cVar.A.get());
            case 16:
                return e5f.b.f(cVar.f123114c, (Retrofit) cVar.f123118l.get());
            case 17:
                r69.a aVarA2 = cVar.e.a();
                vc.s.j(aVarA2);
                zja.a aVarA3 = ((ika.b) cVar.f).a();
                vc.s.j(aVarA3);
                return new y69.f(aVarA2, aVarA3, new z69.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object lVar;
        Object gVar;
        Object aVar;
        Object dVar;
        Object aVar2;
        Object bVar;
        Object aVar3;
        switch (this.f21595a) {
            case 0:
                c cVar = (c) this.f21597c;
                int i = this.f21596b;
                if (i == 0) {
                    return new e63.a(new ni0.f());
                }
                if (i == 1) {
                    return new u53.b(cVar.f21598a, new ni0.k(), new ni0.d(), new gi0.a());
                }
                throw new AssertionError(i);
            case 1:
                c6e.a aVar4 = (c6e.a) this.f21597c;
                fqk.a aVar5 = aVar4.e;
                r6e.o oVar = aVar4.f;
                j25.a aVar6 = aVar4.d;
                jdi.o oVar2 = aVar4.f21779c;
                ad3.g gVar2 = aVar4.f21778b;
                b7e.a aVar7 = aVar4.f21777a;
                int i2 = this.f21596b;
                switch (i2) {
                    case 0:
                        z5e.c cVar2 = (z5e.c) aVar7.I.get();
                        vc.s.j(cVar2);
                        z5e.c cVar3 = (z5e.c) aVar7.J.get();
                        vc.s.j(cVar3);
                        z5e.c cVar4 = (z5e.c) aVar7.K.get();
                        vc.s.j(cVar4);
                        z5e.c cVar5 = (z5e.c) gVar2.f3261j.get();
                        vc.s.j(cVar5);
                        z5e.c cVar6 = (z5e.c) oVar2.i.get();
                        vc.s.j(cVar6);
                        z5e.c cVar7 = (z5e.c) aVar7.N.get();
                        vc.s.j(cVar7);
                        z5e.c cVar8 = (z5e.c) aVar7.O.get();
                        vc.s.j(cVar8);
                        z5e.c cVar9 = (z5e.c) aVar7.L.get();
                        vc.s.j(cVar9);
                        z5e.c cVar10 = (z5e.c) aVar7.M.get();
                        vc.s.j(cVar10);
                        z5e.c cVarB = aVar6.b();
                        vc.s.j(cVarB);
                        return new a6e.j(cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVarB);
                    case 1:
                        c7e.h hVar = (c7e.h) aVar7.V.get();
                        vc.s.j(hVar);
                        pfe.d dVar2 = (pfe.d) gVar2.k.get();
                        vc.s.j(dVar2);
                        pfe.d dVar3 = (pfe.d) oVar2.f173135m.get();
                        vc.s.j(dVar3);
                        pfe.d dVarA = aVar6.a();
                        vc.s.j(dVarA);
                        oqk.l lVarB = aVar5.b();
                        vc.s.j(lVarB);
                        lqk.e eVar = (lqk.e) aVar5.G.get();
                        vc.s.j(eVar);
                        x6e.d dVar4 = (x6e.d) aVar7.U.get();
                        vc.s.j(dVar4);
                        e7e.b bVar2 = (e7e.b) aVar7.Z.get();
                        vc.s.j(bVar2);
                        g6e.g gVarA = oVar.a();
                        vc.s.j(gVarA);
                        return new a6e.t(hVar, dVar2, dVar3, dVarA, lVarB, eVar, dVar4, bVar2, gVarA);
                    case 2:
                        z5e.c cVar11 = (z5e.c) aVar7.I.get();
                        vc.s.j(cVar11);
                        z5e.c cVar12 = (z5e.c) aVar7.J.get();
                        vc.s.j(cVar12);
                        z5e.c cVar13 = (z5e.c) gVar2.f3261j.get();
                        vc.s.j(cVar13);
                        z5e.c cVar14 = (z5e.c) oVar2.i.get();
                        vc.s.j(cVar14);
                        z5e.c cVar15 = (z5e.c) aVar7.N.get();
                        vc.s.j(cVar15);
                        z5e.c cVar16 = (z5e.c) aVar7.O.get();
                        vc.s.j(cVar16);
                        z5e.c cVar17 = (z5e.c) aVar7.K.get();
                        vc.s.j(cVar17);
                        z5e.c cVar18 = (z5e.c) aVar7.L.get();
                        vc.s.j(cVar18);
                        z5e.c cVar19 = (z5e.c) aVar7.M.get();
                        vc.s.j(cVar19);
                        z5e.c cVarB2 = aVar6.b();
                        vc.s.j(cVarB2);
                        return new a6e.l(new d6e.k(cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVarB2, aVar4.f21780g.g(), aVar4.f21781h.a()));
                    case 3:
                        d7e.l lVar2 = (d7e.l) aVar7.Q.get();
                        vc.s.j(lVar2);
                        return lVar2;
                    case 4:
                        return new a6e.k();
                    case 5:
                        return new b6e.b();
                    case 6:
                        z5e.a aVar8 = (z5e.a) aVar7.X.get();
                        vc.s.j(aVar8);
                        ppg.b bVarB = ((wpg.l) aVar4.f21782j).b();
                        vc.s.j(bVarB);
                        g6e.g gVarA2 = oVar.a();
                        vc.s.j(gVarA2);
                        gte.a aVarB = aVar4.k.b();
                        vc.s.j(aVarB);
                        return new a6e.d(aVar8, bVarB, gVarA2, aVarB);
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                c73.j jVar = (c73.j) this.f21597c;
                ee0.a aVar9 = jVar.f21859a;
                ila.b bVar3 = jVar.f21865l;
                da3.j jVar2 = jVar.f;
                th0.a aVar10 = jVar.f21868p;
                Context context = jVar.o;
                int i3 = this.f21596b;
                switch (i3) {
                    case 0:
                        return new ne0.d();
                    case 1:
                        je0.d dVarB = aVar9.b();
                        vc.s.j(dVarB);
                        yk0.a aVarB2 = jVar.f21860b.b();
                        vc.s.j(aVarB2);
                        xe0.f fVarF = aVar9.f();
                        vc.s.j(fVarF);
                        return c21.l.h(dVarB, fVarF, aVarB2);
                    case 2:
                        l93.f fVarJ = jVar2.j();
                        vc.s.j(fVarJ);
                        hy2.f fVarA = jVar.f21862g.a();
                        r0 r0VarC = jVar.k.c();
                        zf8.k kVarA = jVar.f21863h.a();
                        vc.s.j(kVarA);
                        jla.h hVarA = bVar3.a();
                        m4 m4VarD = jVar.f21866m.d();
                        vc.s.j(m4VarD);
                        lVar = new d73.l(fVarJ, fVarA, r0VarC, kVarA, hVarA, m4VarD, jVar.f21867n.a());
                        break;
                    case 3:
                        return new f73.a();
                    case 4:
                        sri.m mVar = (sri.m) jVar.f21873w.get();
                        li0.b bVarC = t2d.c.c(aVar10.f271230a);
                        l93.f fVarJ2 = jVar2.j();
                        vc.s.j(fVarJ2);
                        lVar = new r83.q(mVar, bVarC, fVarJ2, new f73.c(), bVar3.b(), new r83.u(context, aVar10.h()), (Lifecycle) jVar.f21874x.get());
                        break;
                    case 5:
                        return c21.l.r(context);
                    case 6:
                        return c73.e.a();
                    default:
                        throw new AssertionError(i3);
                }
                return lVar;
            case 3:
                c89.a aVar11 = (c89.a) this.f21597c;
                c89.b bVar4 = aVar11.f22141a;
                int i5 = this.f21596b;
                if (i5 == 0) {
                    x79.a aVarA = bVar4.a();
                    vc.s.j(aVarA);
                    a89.b bVar5 = new a89.b();
                    ssi.o oVarC = aVar11.f22142b.c();
                    vc.s.j(oVarC);
                    return new a89.a(aVarA, bVar5, oVarC, new a89.d());
                }
                if (i5 == 1) {
                    return ((yy5.b) aVar11.f22143c).d();
                }
                if (i5 != 2) {
                    throw new AssertionError(i5);
                }
                x79.a aVarA2 = bVar4.a();
                vc.s.j(aVarA2);
                return new a89.c(aVarA2, new a89.b());
            case 4:
                c89.b bVar6 = (c89.b) this.f21597c;
                int i6 = this.f21596b;
                if (i6 == 0) {
                    r0 r0VarC2 = bVar6.f22144a.c();
                    wsg.n nVarB = bVar6.f22145b.b();
                    ppk.f fVarA2 = bVar6.f22146c.a();
                    psi.a aVarA3 = bVar6.d.a();
                    vc.s.j(aVarA3);
                    gVar = new d89.g(r0VarC2, nVarB, fVarA2, aVarA3);
                } else {
                    if (i6 == 1) {
                        return new e89.a();
                    }
                    if (i6 != 2) {
                        if (i6 == 3) {
                            return c21.l.g(((nj0.d) bVar6.e).f());
                        }
                        throw new AssertionError(i6);
                    }
                    gVar = new g89.a((BlockedFundsService) bVar6.f22148h.get());
                }
                return gVar;
            case 5:
                ca3.a aVar12 = (ca3.a) this.f21597c;
                a31.a aVar13 = aVar12.i;
                a31.a aVar14 = aVar12.f22517j;
                a31.a aVar15 = aVar12.k;
                ecm.q qVar = aVar12.f;
                int i21 = this.f21596b;
                if (i21 == 0) {
                    return new da3.c(aVar12.f22512a, aVar12.f22513b, aVar12.f22514c, aVar12.d, aVar12.e, aVar12.f22515g, aVar12.f22516h, aVar13, aVar14, aVar15, aVar12.f22518l, aVar12.f22519m, aVar12.f22520n, aVar12.o, qVar);
                }
                if (i21 == 1) {
                    return cwi.u.d(aVar15, aVar12.f22521p, aVar14, aVar12.f22522q, aVar13, qVar);
                }
                if (i21 == 2) {
                    return da3.i.a();
                }
                throw new AssertionError(i21);
            case 6:
                cf0.f fVar = (cf0.f) this.f21597c;
                int i22 = this.f21596b;
                if (i22 == 0) {
                    aVar = new ff0.a((ik.a) fVar.f23519b.get());
                } else {
                    if (i22 == 1) {
                        Context context2 = fVar.f23518a;
                        ff0.b kronosSyncListener = new ff0.b();
                        cf0.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(kronosSyncListener, "kronosSyncListener");
                        List ntpHosts = df0.a.f113741a;
                        long j2 = df0.a.f113743c;
                        long j3 = df0.a.f113742b;
                        long j5 = hk.a.f152838b;
                        long j16 = hk.a.f152839c;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(ntpHosts, "ntpHosts");
                        dfm.c localClock = new dfm.c(6);
                        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
                        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
                        ik.c syncResponseCache = new ik.c(sharedPreferences);
                        Intrinsics.checkNotNullParameter(localClock, "localClock");
                        Intrinsics.checkNotNullParameter(syncResponseCache, "syncResponseCache");
                        Intrinsics.checkNotNullParameter(ntpHosts, "ntpHosts");
                        return new ik.a(new jk.f(new mp.r(localClock, new jk.a(), new jk.a()), localClock, new cpi.g(syncResponseCache, localClock), kronosSyncListener, ntpHosts, j5, j2, j3, j16), localClock);
                    }
                    if (i22 != 2) {
                        if (i22 == 3) {
                            cf0.d.Companion.getClass();
                            return new cf0.b();
                        }
                        if (i22 == 4) {
                            return cf0.e.a();
                        }
                        throw new AssertionError(i22);
                    }
                    aVar = new df0.b((ff0.a) fVar.f23520c.get(), (ef0.b) fVar.d.get());
                }
                return aVar;
            case 7:
                ckg.a aVar16 = (ckg.a) this.f21597c;
                ee0.a aVar17 = aVar16.f24835b;
                ip.b uiConfiguration = aVar16.f24836c;
                int i32 = this.f21596b;
                if (i32 == 0) {
                    ue0.c cVar20 = (ue0.c) aVar16.f.get();
                    ne0.j jVar3 = (ne0.j) aVar16.f24837g.get();
                    vjg.g gVar3 = (vjg.g) aVar16.f24838h.get();
                    n80.c cVar21 = (n80.c) aVar16.d.T.get();
                    vc.s.j(cVar21);
                    return new akg.o(cVar20, jVar3, uiConfiguration, gVar3, cVar21, (mk0.a) aVar16.i.get());
                }
                if (i32 == 1) {
                    je0.d mapper = aVar17.b();
                    vc.s.j(mapper);
                    xe0.f storageFactory = aVar17.f();
                    vc.s.j(storageFactory);
                    Intrinsics.checkNotNullParameter(mapper, "mapper");
                    Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                    return xe0.f.e(storageFactory, "feature_ui_personalisation", mapper, 12);
                }
                if (i32 == 2) {
                    return new ne0.d();
                }
                if (i32 == 3) {
                    ckg.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(uiConfiguration, "uiConfiguration");
                    gwl.d dVar5 = (gwl.d) uiConfiguration.f163352g.getValue();
                    vc.s.k(dVar5);
                    return dVar5;
                }
                if (i32 != 4) {
                    throw new AssertionError(i32);
                }
                mk0.a personalisationStorage = aVar16.e.a();
                vc.s.j(personalisationStorage);
                bkg.b appStyleMigration = new bkg.b((ue0.c) aVar16.f.get(), (vjg.g) aVar16.f24838h.get());
                Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
                Intrinsics.checkNotNullParameter(appStyleMigration, "appStyleMigration");
                return personalisationStorage.d(appStyleMigration);
            case 8:
                int i33 = this.f21596b;
                if (i33 == 0) {
                    return new fu1.b((ku1.c) ((cu1.i) this.f21597c).f108737c.get());
                }
                if (i33 == 1) {
                    return lu1.c.a();
                }
                if (i33 == 2) {
                    return new bu1.g();
                }
                throw new AssertionError(i33);
            case 9:
                cu1.k kVar = (cu1.k) this.f21597c;
                cu1.i iVar = kVar.f108743c;
                uw1.b bVar7 = kVar.f108745h;
                int i43 = this.f21596b;
                switch (i43) {
                    case 0:
                        return new bu1.a();
                    case 1:
                        return cu1.h.a();
                    case 2:
                        kz9.a aVarA4 = kVar.f108742b.a();
                        vc.s.j(aVarA4);
                        wt1.a aVar18 = (wt1.a) iVar.e.get();
                        vc.s.j(aVar18);
                        dVar = new gu1.d(aVarA4, aVar18);
                        break;
                    case 3:
                        hy1.p pVar = (hy1.p) ((ey1.e) kVar.d).I.get();
                        vc.s.j(pVar);
                        fnc.s sVar = new fnc.s((c12.f) kVar.f108755w.get());
                        wt1.a aVar19 = (wt1.a) iVar.e.get();
                        vc.s.j(aVar19);
                        dVar = new gu1.r(pVar, sVar, aVar19);
                        break;
                    case 4:
                        xt1.d dVarA2 = kVar.f.a();
                        vc.s.j(dVarA2);
                        pre.c cVarA = kVar.f108744g.a();
                        vc.s.j(cVarA);
                        vw1.b bVar8 = (vw1.b) kVar.f108757y.get();
                        fx1.a aVarF = ((lz1.m) bVar7).f();
                        vc.s.j(aVarF);
                        return new eu1.h(dVarA2, cVarA, bVar8, aVarF);
                    case 5:
                        uy1.b bVarB2 = ((lz1.m) bVar7).b();
                        vc.s.j(bVarB2);
                        return cdj.b.g(bVarB2);
                    case 6:
                        eu1.a aVar20 = (eu1.a) kVar.z.get();
                        w39.b bVarA = kVar.i.a();
                        vc.s.j(bVarA);
                        dVar = new gu1.o(aVar20, bVarA, kVar.a(), (ju1.a) kVar.v.get(), (ku1.d) kVar.A.get());
                        break;
                    case 7:
                        return lu1.c.a();
                    case 8:
                        eu1.a aVar21 = (eu1.a) kVar.z.get();
                        sf0.h hVarB = kVar.f108746j.b();
                        vc.s.j(hVarB);
                        v60.e eVarA = kVar.k.a();
                        vc.s.j(eVarA);
                        return new gu1.c(aVar21, new e1l.a(hVarB, eVarA, 2));
                    default:
                        throw new AssertionError(i43);
                }
                return dVar;
            case 10:
                cu1.u uVar = (cu1.u) this.f21597c;
                a31.a aVar22 = uVar.f108786c;
                a31.a aVar23 = uVar.f108785b;
                ecm.q qVar2 = uVar.f108784a;
                int i59 = this.f21596b;
                if (i59 == 0) {
                    return new cu1.a(qVar2, uVar.f108797t, aVar22);
                }
                if (i59 == 1) {
                    return cdj.b.D((cu1.b) uVar.f108796s.get());
                }
                if (i59 == 2) {
                    return new cu1.b(aVar23, qVar2);
                }
                if (i59 == 3) {
                    return new cu1.e(qVar2, uVar.d, uVar.e, uVar.f, aVar23, uVar.v, uVar.f108797t, uVar.f108787g, aVar22, uVar.f108788h, uVar.i, uVar.f108789j, uVar.k, uVar.f108790l, uVar.f108791m, uVar.f108792n, uVar.o, uVar.f108793p, uVar.f108794q, uVar.f108795r);
                }
                if (i59 != 4) {
                    throw new AssertionError(i59);
                }
                cu1.i iVar2 = (cu1.i) ((cu1.a) uVar.u.get()).b();
                vc.s.k(iVar2);
                return iVar2;
            case 11:
                d8a.a aVar24 = (d8a.a) this.f21597c;
                a31.a aVar25 = aVar24.f112185x;
                a31.a aVar26 = aVar24.f112176l;
                a31.a aVar27 = aVar24.f112175j;
                a31.a aVar28 = aVar24.i;
                a31.a aVar29 = aVar24.f112174h;
                a31.a aVar30 = aVar24.f112173g;
                a31.a aVar31 = aVar24.f112171b;
                ecm.q qVar3 = aVar24.f112170a;
                int i66 = this.f21596b;
                if (i66 == 0) {
                    return new ox9.c(qVar3, aVar31, aVar24.f112172c, aVar24.d, aVar24.L, aVar24.f, aVar30, aVar29, aVar28, aVar27, aVar24.k, aVar26, aVar24.f112177m, aVar24.f112178n, aVar24.o, aVar24.f112179p, aVar24.f112180q, aVar24.N, aVar24.z, aVar24.A, aVar24.B, aVar24.C, aVar25, aVar24.D, aVar24.E, aVar24.F, aVar24.G, aVar24.H, aVar24.I, aVar24.J);
                }
                if (i66 == 1) {
                    return cwi.u.z((p8a.a) aVar24.K.get());
                }
                if (i66 == 2) {
                    return p7h.b.e(aVar24.e, qVar3);
                }
                if (i66 == 3) {
                    return cwi.u.B((q1) aVar24.M.get());
                }
                if (i66 == 4) {
                    return p7h.b.f(aVar31, aVar24.f112181r, aVar30, aVar29, aVar24.f112182s, aVar28, aVar27, aVar24.f112183t, aVar26, aVar24.u, aVar24.v, aVar24.f112184w, aVar25, aVar24.f112186y, qVar3);
                }
                throw new AssertionError(i66);
            case 12:
                d9g.d dVar6 = (d9g.d) this.f21597c;
                a31.a aVar32 = dVar6.i;
                a31.a aVar33 = dVar6.f112373g;
                int i74 = this.f21596b;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return g7h.c.i(dVar6.M, aVar33, aVar32);
                    }
                    if (i74 == 2) {
                        return g7h.c.j(dVar6.P);
                    }
                    if (i74 == 3) {
                        return cwi.u.C((p1) dVar6.N.get());
                    }
                    throw new AssertionError(i74);
                }
                ecm.q qVar4 = dVar6.f112370a;
                return new p1(dVar6.f112371b, dVar6.f112372c, dVar6.d, dVar6.e, dVar6.f, aVar33, dVar6.f112374h, aVar32, dVar6.f112375j, dVar6.k, dVar6.f112376l, dVar6.f112377m, dVar6.f112378n, dVar6.o, dVar6.f112379p, dVar6.f112380q, dVar6.f112381r, dVar6.f112382s, dVar6.f112383t, dVar6.v, dVar6.f112384w, dVar6.f112385x, dVar6.f112386y, dVar6.z, dVar6.A, dVar6.B, dVar6.C, dVar6.D, dVar6.E, dVar6.F, dVar6.G, dVar6.H, dVar6.I, dVar6.J, dVar6.K, dVar6.L, qVar4, dVar6.u);
            case 13:
                da3.j jVar4 = (da3.j) this.f21597c;
                int i92 = this.f21596b;
                switch (i92) {
                    case 0:
                        return new ne0.d();
                    case 1:
                        Context context3 = jVar4.f112448a;
                        yk0.a aVarB3 = jVar4.f112449b.b();
                        vc.s.j(aVarB3);
                        return f9f.b.g(context3, aVarB3, ((c21.b) jVar4.f112450c).b());
                    case 2:
                        je0.d dVarB2 = jVar4.d.b();
                        vc.s.j(dVarB2);
                        yk0.a aVarB4 = jVar4.f112449b.b();
                        vc.s.j(aVarB4);
                        xe0.f fVarF2 = jVar4.d.f();
                        vc.s.j(fVarF2);
                        return e5f.b.h(dVarB2, fVarF2, aVarB4);
                    case 3:
                        v6l.s sVarC = jVar4.e.c();
                        vc.s.j(sVarC);
                        l93.f fVar2 = (l93.f) jVar4.v.get();
                        gte.a aVarB5 = jVar4.f112452h.b();
                        vc.s.j(aVarB5);
                        ffk.t tVarF = jVar4.i.f();
                        vc.s.j(tVarF);
                        return new ha3.j(sVarC, fVar2, aVarB5, tVarF);
                    case 4:
                        x6l.c cVar22 = jVar4.e;
                        x6l.c cVar23 = jVar4.e;
                        j6l.b bVarD = cVar22.d();
                        vc.s.j(bVarD);
                        wsg.n nVarB2 = jVar4.f.b();
                        mg0.a aVar34 = (mg0.a) jVar4.f112449b.C.get();
                        vc.s.j(aVar34);
                        v6l.s sVarC2 = cVar23.c();
                        vc.s.j(sVarC2);
                        return new ha3.x(bVarD, nVarB2, aVar34, sVarC2, jVar4.f112451g.e(), cVar23.e());
                    case 5:
                        l93.f fVar3 = (l93.f) jVar4.v.get();
                        ha3.f fVar4 = (ha3.f) jVar4.f112463x.get();
                        yy0.f fVar5 = (yy0.f) jVar4.f112464y.get();
                        return new ja3.j(jVar4.f112448a, (c90.c) jVar4.z.get(), fVar4, fVar3, fVar5);
                    case 6:
                        v6l.d dVarB3 = jVar4.e.b();
                        vc.s.j(dVarB3);
                        return new ha3.f(dVarB3, jVar4.f112453j.a());
                    case 7:
                        return cwi.u.s(jVar4.f112448a);
                    case 8:
                        return cwi.u.w(jVar4.f112448a);
                    case 9:
                        g gVarO = jVar4.k.o();
                        vc.s.j(gVarO);
                        l80.a aVar35 = (l80.a) jVar4.k.Q.get();
                        vc.s.j(aVar35);
                        m93.d dVar7 = (m93.d) jVar4.B.get();
                        gte.a aVarB6 = jVar4.f112452h.b();
                        vc.s.j(aVarB6);
                        return new ia3.t(gVarO, aVar35, dVar7, aVarB6);
                    case 10:
                        return new ia3.h(jVar4.f112448a, (ha3.f) jVar4.f112463x.get());
                    case 11:
                        return new ha3.c((o93.a) jVar4.E.get());
                    case 12:
                        return new ba3.d((CardPromotionsService) jVar4.D.get(), (ue0.c) jVar4.u.get(), (ne0.j) jVar4.f112460s.get());
                    case 13:
                        return e5f.b.g(jVar4.f112454l, jVar4.c());
                    case 14:
                        return new ha3.o();
                    case 15:
                        return new ha3.k(jVar4.f112451g.e());
                    case 16:
                        fk3.a aVarA5 = jVar4.f112456n.a();
                        vc.s.j(aVarA5);
                        gte.a aVarB7 = jVar4.f112452h.b();
                        vc.s.j(aVarB7);
                        return new ha3.m(aVarA5, aVarB7, jVar4.o.a());
                    case 17:
                        return new ha3.d((ba3.h) jVar4.L.get());
                    case 18:
                        return new ba3.h((RevolutCardScaService) jVar4.J.get(), (s93.c) jVar4.K.get(), (ne0.j) jVar4.f112459r.get());
                    case 19:
                        return e5f.b.B(jVar4.f112454l, jVar4.c());
                    case 20:
                        return f9f.b.q((CardsDatabase) jVar4.f112461t.get());
                    case 21:
                        return new q93.a();
                    case 22:
                        return new ia3.e();
                    case 23:
                        return new ia3.c((m93.b) jVar4.N.get(), jVar4.f112457p.g(), (c90.c) jVar4.z.get());
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                db5.f fVar6 = (db5.f) this.f21597c;
                c21.e eVar2 = fVar6.f112674b;
                db5.b bVar9 = fVar6.f112673a;
                int i96 = this.f21596b;
                if (i96 == 0) {
                    aVar2 = new eb5.a((jb5.a) fVar6.f.get());
                } else {
                    if (i96 != 1) {
                        if (i96 == 2) {
                            return cwi.u.o(bVar9, (Retrofit) fVar6.d.get());
                        }
                        if (i96 != 3) {
                            throw new AssertionError(i96);
                        }
                        Retrofit retrofitJ = ((c21.b) eVar2).j();
                        vc.s.j(retrofitJ);
                        kg.o oVarH = ((c21.b) eVar2).h();
                        vc.s.j(oVarH);
                        return cwi.u.r(bVar9, retrofitJ, oVarH);
                    }
                    CreditTilesService creditTilesService = (CreditTilesService) fVar6.e.get();
                    ne0.d dVar8 = new ne0.d();
                    ee0.a aVar36 = fVar6.f112675c;
                    le0.b bVarC2 = aVar36.c();
                    vc.s.j(bVarC2);
                    le0.a aVarT = cwi.u.t(bVarC2);
                    xe0.f fVarF3 = aVar36.f();
                    vc.s.j(fVarF3);
                    aVar2 = new jb5.a(creditTilesService, dVar8, db5.e.w(aVarT, fVarF3));
                }
                return aVar2;
            case 15:
                dfe.a aVar37 = (dfe.a) this.f21597c;
                int i99 = this.f21596b;
                if (i99 == 0) {
                    b70.e eVarB = aVar37.f113885a.b();
                    vc.s.j(eVarB);
                    pn0.c cVarA2 = aVar37.f113886b.a();
                    vc.s.j(cVarA2);
                    return new afe.d(eVarB, cVarA2, (n80.e) aVar37.d.get(), new yf.c((n80.e) aVar37.d.get()));
                }
                if (i99 != 1) {
                    throw new AssertionError(i99);
                }
                Context context4 = aVar37.f113887c;
                dfe.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context4, "context");
                PackageManager packageManager = context4.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                return new n80.e(packageManager);
            case 16:
                did.d dVar9 = (did.d) this.f21597c;
                int i100 = this.f21596b;
                switch (i100) {
                    case 0:
                        return d0.a(dVar9.f114994c);
                    case 1:
                        bVar = new pid.b(dVar9.e(), new pid.a(new hjd.z()), dVar9.f114992a.a());
                        break;
                    case 2:
                        nj0.d dVar10 = (nj0.d) dVar9.d;
                        xj0.i iVarL = dVar10.l();
                        vc.s.j(iVarL);
                        ik0.b bVarM = dVar10.m();
                        vc.s.j(bVarM);
                        return did.x.a(y.a(iVarL, bVarM, new kid.c(dVar9.f114992a.a()), (kg.o) dVar9.A.get()));
                    case 3:
                        ee0.a aVar38 = dVar9.e;
                        return db5.e.q(fe0.c.a());
                    case 4:
                        return did.v.a();
                    case 5:
                        le0.b bVarC3 = dVar9.e.c();
                        vc.s.j(bVarC3);
                        kg.o oVar3 = (kg.o) dVar9.A.get();
                        yk0.a aVarB8 = dVar9.f.b();
                        vc.s.j(aVarB8);
                        xe0.f fVarF4 = dVar9.e.f();
                        vc.s.j(fVarF4);
                        return db5.e.x(oVar3, bVarC3, fVarF4, aVarB8);
                    case 6:
                        Context context5 = dVar9.f114994c;
                        yk0.a aVarB9 = dVar9.f.b();
                        vc.s.j(aVarB9);
                        return db5.e.p(context5, aVarB9, ((c21.b) dVar9.i).b());
                    case 7:
                        return new fjd.n();
                    case 8:
                        lvb.d dVar11 = (lvb.d) dVar9.o.v.get();
                        vc.s.j(dVar11);
                        nyb.k kVarC = dVar9.f114997j.c();
                        vc.s.j(kVarC);
                        bVar = new jid.p(dVar11, kVarC);
                        break;
                    case 9:
                        return db5.e.z((ShopsDatabase) dVar9.F.get());
                    case 10:
                        Retrofit retrofitI = ((c21.b) dVar9.i).i();
                        vc.s.j(retrofitI);
                        return did.z.a(retrofitI);
                    default:
                        throw new AssertionError(i100);
                }
                return bVar;
            case 17:
                dj7.b bVar10 = (dj7.b) this.f21597c;
                a31.a aVar39 = bVar10.f115120b;
                ecm.q qVar5 = bVar10.f115119a;
                int i101 = this.f21596b;
                if (i101 == 0) {
                    return nga.c.c(qVar5, aVar39, bVar10.f115121c, bVar10.f115125l, bVar10.f115122g, bVar10.f115123h, bVar10.i, bVar10.f115124j);
                }
                if (i101 == 1) {
                    return db5.e.B((ej7.c) bVar10.k.get());
                }
                if (i101 == 2) {
                    return new ej7.c(bVar10.d, aVar39, bVar10.e, bVar10.f, qVar5);
                }
                throw new AssertionError(i101);
            case 18:
                return a();
            case 19:
                dm5.d dVar12 = (dm5.d) this.f21597c;
                ei5.d dVar13 = dVar12.f115863b;
                int i102 = this.f21596b;
                if (i102 == 0) {
                    sri.m mVar2 = (sri.m) dVar12.f115865g.get();
                    xh5.a aVarA6 = dVar13.a();
                    vc.s.j(aVarA6);
                    ai5.b bVarB3 = dVar13.b();
                    vc.s.j(bVarB3);
                    return new cm5.c(mVar2, aVarA6, bVarB3);
                }
                if (i102 != 1) {
                    if (i102 == 2) {
                        return new em5.a();
                    }
                    throw new AssertionError(i102);
                }
                z70.a aVarF2 = dVar12.f115862a.f();
                vc.s.j(aVarF2);
                return db5.e.r(aVarF2);
            case 20:
                return b();
            case 21:
                dmc.r rVar = (dmc.r) this.f21597c;
                int i103 = this.f21596b;
                switch (i103) {
                    case 0:
                        zjh.f fVarA3 = rVar.e.a();
                        tul.b bVarN = rVar.f116028b.n();
                        clc.b bVarA2 = rVar.f.a();
                        vc.s.j(bVarA2);
                        hmc.g gVar4 = new hmc.g(rVar.e.d());
                        dlc.g gVar5 = (dlc.g) rVar.f116040t.get();
                        dlc.f fVar7 = (dlc.f) rVar.u.get();
                        gte.a aVarB10 = rVar.d.b();
                        vc.s.j(aVarB10);
                        return new hmc.h(fVarA3, bVarN, bVarA2, gVar4, gVar5, fVar7, aVarB10);
                    case 1:
                        qmc.b bVarF = rVar.f();
                        dmc.a aVar40 = rVar.e;
                        emc.e eVarC = aVar40.c();
                        zjh.f fVarA4 = aVar40.a();
                        tzg.m mVarT = rVar.f116028b.t();
                        vc.s.j(mVarT);
                        l80.e eVarH = rVar.f116031h.h();
                        vc.s.j(eVarH);
                        return new w(bVarF, eVarC, fVarA4, mVarT, new a0e.w(eVarH, 3));
                    case 2:
                        dmc.a aVar41 = rVar.e;
                        ite.a aVar42 = rVar.d;
                        nmc.d dVarD = aVar41.d();
                        gte.a aVarB11 = aVar42.b();
                        vc.s.j(aVarB11);
                        hmc.n nVar = new hmc.n(dVarD, aVarB11);
                        gte.a aVarB12 = aVar42.b();
                        vc.s.j(aVarB12);
                        hmc.j jVar5 = new hmc.j(aVarB12);
                        gte.a aVarB13 = aVar42.b();
                        vc.s.j(aVarB13);
                        hmc.m mVar3 = new hmc.m(aVarB13);
                        gte.a aVarB14 = aVar42.b();
                        vc.s.j(aVarB14);
                        hmc.k kVar2 = new hmc.k(aVarB14);
                        gte.a aVarB15 = aVar42.b();
                        vc.s.j(aVarB15);
                        return new hmc.o(nVar, jVar5, mVar3, kVar2, aVarB15);
                    case 3:
                        aVar3 = new vmc.a(rVar.f116029c.a(), rVar.f116028b.G(), new nmc.k(), new yoc.e());
                        break;
                    case 4:
                        nmc.d dVarD2 = rVar.e.d();
                        gte.a aVarB16 = rVar.d.b();
                        vc.s.j(aVarB16);
                        aVar3 = new vmc.e(new yoc.m(dVarD2, aVarB16));
                        break;
                    case 5:
                        return new vmc.g(new vmc.b());
                    case 6:
                        return new vmc.h();
                    case 7:
                        return db5.e.A(new r39.a(rVar));
                    case 8:
                        return db5.e.D(new zjh.j(rVar));
                    case 9:
                        return db5.e.C(new zjh.i(rVar, 22));
                    default:
                        throw new AssertionError(i103);
                }
                return aVar3;
            case 22:
                return c();
            case 23:
                dzj.a aVar43 = (dzj.a) this.f21597c;
                a31.a aVar44 = aVar43.f;
                a31.a aVar45 = aVar43.f121347g;
                int i104 = this.f21596b;
                if (i104 == 0) {
                    return new ezj.g(aVar43.f121344a, aVar43.f121345b, aVar43.f121346c, aVar43.d, aVar43.e, aVar44, aVar45, aVar43.f121348h, aVar43.i, aVar43.f121349j);
                }
                if (i104 == 1) {
                    return ewg.w.a(aVar43.k, aVar45, aVar43.f121351m, aVar44);
                }
                if (i104 == 2) {
                    return dw3.l.A((ezj.g) aVar43.f121350l.get());
                }
                throw new AssertionError(i104);
            case 24:
                return d();
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                return h();
            default:
                e86.a aVar46 = (e86.a) this.f21597c;
                ee0.a aVar47 = aVar46.f123602c;
                int i105 = this.f21596b;
                if (i105 == 0) {
                    return new f86.a(aVar46.f123600a, aVar46.f123601b);
                }
                if (i105 != 1) {
                    if (i105 == 2) {
                        return new d86.b();
                    }
                    throw new AssertionError(i105);
                }
                je0.d objectMapper = aVar47.b();
                vc.s.j(objectMapper);
                xe0.f storageFactory2 = aVar47.f();
                vc.s.j(storageFactory2);
                e86.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.e(storageFactory2, "device_lock_protection.pref", objectMapper, 12);
        }
    }

    public Object i() {
        c1 c1Var = (c1) this.f21597c;
        int i = this.f21596b;
        switch (i) {
            case 0:
                return new hw3.c((p24.p) c1Var.f118469r0.get());
            case 1:
                uq3.b bVar = c1Var.f118428c;
                mp.p pVarA = uq3.b.a();
                r10.f fVarK = ((nj0.d) c1Var.d).k();
                CreditPluginsService creditPluginsService = (CreditPluginsService) c1Var.p0.get();
                b80.c cVarP = c1Var.f118443h.p();
                vc.s.j(cVarP);
                return new p24.p(pVarA, fVarK, creditPluginsService, cVarP);
            case 2:
                return dqj.d.g(c1Var.e, (Retrofit) c1Var.f118460o0.get());
            case 3:
                dw3.a aVar = c1Var.e;
                Retrofit retrofitJ = ((c21.b) c1Var.f).j();
                vc.s.j(retrofitJ);
                return dqj.d.m(aVar, retrofitJ, (kg.o) c1Var.f118457n0.get(), c1Var.c());
            case 4:
                kg.o oVarH = ((c21.b) c1Var.f).h();
                vc.s.j(oVarH);
                return dqj.d.o(oVarH);
            case 5:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarG = bVar2.g();
                vc.s.j(jVarG);
                xq3.y yVar = (xq3.y) bVar3.A.get();
                vc.s.j(yVar);
                eb5.a aVar2 = (eb5.a) c1Var.i.f112676g.get();
                vc.s.j(aVar2);
                al4.j jVarC = c1Var.f118447j.c();
                xq3.w wVarL = bVar3.l();
                vc.s.j(wVarL);
                return new hw3.i(jVarG, yVar, aVar2, jVarC, wVarL);
            case 6:
                return new c0((p24.d) c1Var.u0.get());
            case 7:
                uq3.b bVar4 = c1Var.f118428c;
                return new p24.d(uq3.b.a(), ((nj0.d) c1Var.d).k(), (CreditPluginsService) c1Var.p0.get());
            case 8:
                return new hw3.e(c1Var.k.e(), (sv3.a) c1Var.P0.get());
            case 9:
                c1Var.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(17);
                builderBuilderWithExpectedSize.put(j1.CREDIT_CARD, c1Var.f118483w0.get());
                builderBuilderWithExpectedSize.put(j1.FAMILY_CREDIT_CARD, c1Var.y0.get());
                builderBuilderWithExpectedSize.put(j1.FIXED_TERM_CREDIT, c1Var.z0.get());
                builderBuilderWithExpectedSize.put(j1.BUY_NOW_PAY_LATER, c1Var.A0.get());
                builderBuilderWithExpectedSize.put(j1.CREDIT_CARD_LIMIT_INCREASE, c1Var.B0.get());
                builderBuilderWithExpectedSize.put(j1.MORTGAGE, c1Var.C0.get());
                builderBuilderWithExpectedSize.put(j1.REFINANCING_MORTGAGE, c1Var.D0.get());
                builderBuilderWithExpectedSize.put(j1.MORTGAGE_RENEGOTIATION, c1Var.E0.get());
                builderBuilderWithExpectedSize.put(j1.OVERDRAFT, c1Var.F0.get());
                builderBuilderWithExpectedSize.put(j1.FTC_FORBEARANCE, c1Var.G0.get());
                builderBuilderWithExpectedSize.put(j1.CC_FORBEARANCE, c1Var.H0.get());
                builderBuilderWithExpectedSize.put(j1.POST_TERMINATION_REPAYMENT_PLAN, c1Var.J0.get());
                builderBuilderWithExpectedSize.put(j1.POST_TERMINATION_PARTIAL_SETTLEMENTS, c1Var.K0.get());
                builderBuilderWithExpectedSize.put(j1.BASIC_CREDIT_CARD, c1Var.L0.get());
                builderBuilderWithExpectedSize.put(j1.CREDIT_CARD_LIMIT_DECREASE, c1Var.M0.get());
                builderBuilderWithExpectedSize.put(j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC, c1Var.N0.get());
                builderBuilderWithExpectedSize.put(j1.NON_EMBEDDED_CREDIT_INSURANCE_CC, c1Var.O0.get());
                return new j24.b(builderBuilderWithExpectedSize.build());
            case 10:
                return new k24.e(c1Var.f118447j.c());
            case 11:
                return new k24.i();
            case 12:
                return new k24.j();
            case 13:
                return new k24.b();
            case 14:
                return new k24.h();
            case 15:
                return new k24.l();
            case 16:
                return new k24.p();
            case 17:
                return new k24.m();
            case 18:
                return new k24.k();
            case 19:
                return new k24.f();
            case 20:
                return new k24.n();
            case 21:
                return new k24.c();
            case 22:
                return new k24.g();
            case 23:
                return new hw3.d0((yv3.b) c1Var.S0.get());
            case 24:
                uq3.b bVar5 = c1Var.f118428c;
                mp.p pVarA2 = uq3.b.a();
                CreditPluginsService creditPluginsService2 = (CreditPluginsService) c1Var.p0.get();
                TicketorService ticketorService = (TicketorService) c1Var.R0.get();
                m31.c cVarG = c1Var.f118419a.g();
                vc.s.j(cVarG);
                return new q34.d(pVarA2, creditPluginsService2, ticketorService, cVarG);
            case 25:
                return dqj.d.w(c1Var.e, (Retrofit) c1Var.f118460o0.get());
            case 26:
                return new zx3.a((d44.a) c1Var.V0.get());
            case 27:
                return new d44.a((CreditPluginsService) c1Var.p0.get(), (t90.g) c1Var.U0.get());
            case 28:
                c1Var.getClass();
                return new t90.g(new e84.e(new v90.h(), new v90.e(new u90.x()), new v90.e(c1Var.k()), new v90.c(), new v90.e(new a0()), new v90.d(c1Var.j(), new t90.a(), c1Var.k(), new u90.c0(new u90.y())), new v90.i(c1Var.j()), new v90.g(new t90.a(), new u90.y(), new a0(), c1Var.k()), new v90.b(c1Var.j(), new t90.a(), c1Var.k())));
            case 29:
                q24.c cVar = (q24.c) c1Var.X0.get();
                xq3.j jVarH = c1Var.f118428c.h();
                vc.s.j(jVarH);
                return new ow3.e(cVar, jVarH);
            case 30:
                return new q24.c((CreditPluginsService) c1Var.p0.get(), (t90.g) c1Var.U0.get());
            case 31:
                return new sw3.c((x24.a) c1Var.Z0.get(), new ne0.d());
            case 32:
                uq3.b bVar6 = c1Var.f118428c;
                return new x24.a(uq3.b.a(), new j04.b(), (CreditPluginsService) c1Var.p0.get(), ((nj0.d) c1Var.d).k());
            case 33:
                return new ex3.a((q24.e) c1Var.f118425b1.get());
            case 34:
                uq3.b bVar7 = c1Var.f118428c;
                mp.p pVarA3 = uq3.b.a();
                b14.e eVar = new b14.e(uq3.b.b());
                CreditPluginsService creditPluginsService3 = (CreditPluginsService) c1Var.p0.get();
                gte.a aVarB = c1Var.f118423b.b();
                vc.s.j(aVarB);
                return new q24.e(pVarA3, eVar, creditPluginsService3, aVarB);
            case 35:
                return new ww3.c((c34.e) c1Var.f118431d1.get());
            case 36:
                uq3.b bVar8 = c1Var.f118428c;
                return new c34.e(uq3.b.a(), (CreditPluginsService) c1Var.p0.get(), c1Var.f118452l.b(), new ne0.d());
            case 37:
                return new xw3.a((d34.e) c1Var.f118441g1.get());
            case 38:
                return new d34.e((CreditPluginsService) c1Var.p0.get(), new s04.g(uq3.b.b()), uq3.b.a(), c1Var.f118452l.b(), (xx4.d) c1Var.f118437f1.get());
            case 39:
                return dqj.d.B(new ne0.d());
            case 40:
                return new kw3.a((o24.e) c1Var.f118446i1.get());
            case 41:
                CreditPluginsService creditPluginsService4 = (CreditPluginsService) c1Var.p0.get();
                ne0.d dVar = new ne0.d();
                ve0.c cVarE = c1Var.e();
                aq3.a aVarE = c1Var.f118428c.e();
                vc.s.j(aVarE);
                return new o24.e(creditPluginsService4, dVar, cVarE, aVarE);
            case 42:
                return new kw3.b();
            case 43:
                return new mw3.a((s24.a) c1Var.f118453l1.get());
            case 44:
                uq3.b bVar9 = c1Var.f118428c;
                return new s24.a((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 45:
                return new mw3.d((mw3.e) c1Var.f118458n1.get(), c1Var.f118454m);
            case 46:
                return new mw3.e();
            case 47:
                return new rz3.c(c1Var.k.e(), (j24.d) c1Var.f118464p1.get(), c1Var.b());
            case 48:
                dw3.m mVar = c1Var.v;
                cri.d dVar2 = c1Var.u;
                ew3.b bVar10 = c1Var.f118471s;
                Pair pairN = eug.c.n(bVar10, (hw3.e) c1Var.Q0.get());
                Pair pairX = ew3.d.x(bVar10, new StatusDialogPluginFactory());
                Pair pairA = ew3.c.a(bVar10);
                ite.a aVar3 = c1Var.f118423b;
                gte.a aVarB2 = aVar3.b();
                vc.s.j(aVarB2);
                Pair pairR = ew3.d.r(bVar10, new j3(aVarB2));
                Pair pairE = eug.c.e(bVar10);
                Pair pairW = ew3.c.w(bVar10, new y1((hw3.d0) c1Var.T0.get(), (hw3.e) c1Var.Q0.get(), new f(c1Var.b())));
                Pair pairA2 = eug.c.a(bVar10, new mz3.y());
                Pair pairD = ew3.c.D(bVar10, new z1(c1Var.b()));
                Pair pairB = ew3.c.b(bVar10, new w0());
                l93.f fVarJ = c1Var.f118474t.j();
                vc.s.j(fVarJ);
                ozl.a aVar4 = (ozl.a) dVar2;
                mri.w wVarA = aVar4.a();
                vc.s.j(wVarA);
                Pair pairC = ew3.c.c(bVar10, new mz3.b0(fVarJ, wVarA, new an4.i(c1Var.f118463p.o())));
                mri.w wVarA2 = aVar4.a();
                vc.s.j(wVarA2);
                jm4.r rVar = c1Var.f118447j;
                al4.n nVarS = rVar.s();
                vc.s.j(nVarS);
                Pair pairV = eug.c.v(bVar10, new mz3.b0(wVarA2, nVarS, rVar.a()));
                mri.w wVarA3 = ((ozl.a) dVar2).a();
                vc.s.j(wVarA3);
                fmc.z zVar = new fmc.z(wVarA3);
                Context context = c1Var.f118454m;
                Pair pairT = eug.c.t(bVar10, new mz3.a0(zVar, dw3.l.B(context)));
                mri.w wVarA4 = ((ozl.a) dVar2).a();
                vc.s.j(wVarA4);
                Pair pairF = ew3.c.f(bVar10, new a1(new fmc.z(wVarA4), dw3.l.B(context)));
                mri.w wVarA5 = aVar4.a();
                vc.s.j(wVarA5);
                Pair pairY = eug.c.y(bVar10, new mz3.h0(wVarA5, c1Var.o.n()));
                mri.w wVarA6 = aVar4.a();
                vc.s.j(wVarA6);
                u45.h hVar = c1Var.f118456n;
                vx4.a aVar5 = (vx4.a) hVar.R.get();
                vc.s.j(aVar5);
                Pair pairT2 = ew3.c.t(bVar10, new r1(wVarA6, aVar5));
                mri.w wVarA7 = aVar4.a();
                vc.s.j(wVarA7);
                Pair pairX2 = ew3.c.x(bVar10, new z1(wVarA7));
                hz3.c cVarB = c1Var.b();
                mri.w wVarA8 = aVar4.a();
                vc.s.j(wVarA8);
                Pair pairK = ew3.c.k(bVar10, new r1(cVarB, wVarA8));
                mri.w wVarA9 = aVar4.a();
                vc.s.j(wVarA9);
                k95.a aVar6 = c1Var.f118465q;
                o95.i iVarD = aVar6.d();
                vc.s.j(iVarD);
                vx4.b bVarE = aVar6.e();
                vc.s.j(bVarE);
                Pair pairF2 = ew3.d.f(bVar10, new mz3.b0(wVarA9, iVarD, bVarE));
                mri.w wVarA10 = aVar4.a();
                vc.s.j(wVarA10);
                vx4.a aVar7 = (vx4.a) hVar.R.get();
                vc.s.j(aVar7);
                Pair pairC2 = ew3.c.C(bVar10, new i2(wVarA10, aVar7));
                Pair pairO = eug.c.o(bVar10, (hw3.e) c1Var.Q0.get(), (hw3.c) c1Var.f118472s0.get());
                Pair pairP = eug.c.p(bVar10, new mz3.v());
                gte.a aVarB3 = aVar3.b();
                vc.s.j(aVarB3);
                Pair pairD2 = ew3.c.d(bVar10, new x0(aVarB3));
                hz3.c cVarB2 = c1Var.b();
                i1 i1Var = new i1();
                gte.a aVarB4 = aVar3.b();
                vc.s.j(aVarB4);
                Pair pairO2 = ew3.c.o(bVar10, new mz3.j1(cVarB2, i1Var, aVarB4));
                Pair pairA3 = ew3.d.A(bVar10, new WorkflowPluginFactory());
                Pair pairB2 = ew3.d.B(bVar10, new WorkflowPluginFactory());
                Pair pairM = ew3.c.m(bVar10, new g1(c1Var.b()));
                Pair pairJ = ew3.c.j(bVar10, new e1());
                Pair pairJ2 = eug.c.j(bVar10, new mz3.l());
                Pair pairM2 = eug.c.m(bVar10, new mz3.o());
                gte.a aVarB5 = aVar3.b();
                vc.s.j(aVarB5);
                Pair pairQ = ew3.d.q(bVar10, new i3(aVarB5));
                Pair pairF3 = eug.c.f(bVar10, new mz3.g());
                Pair pairM3 = ew3.d.m(bVar10, new d3());
                Pair pairE2 = ew3.c.e(bVar10, new y0());
                Pair pairR2 = ew3.c.r(bVar10, new qz3.a());
                Pair pairS = ew3.c.s(bVar10, new LinkedAccountsV3PluginFactory());
                Pair pairR3 = eug.c.r(bVar10, new CongratulationsPluginFactory());
                Pair pairC3 = ew3.d.c(bVar10, new s2());
                Pair pairD3 = ew3.d.d(bVar10, new u2());
                Pair pairE3 = ew3.d.e(bVar10, new v2());
                Pair pairH = eug.c.h(bVar10, new t0(c1Var.k.e()));
                Pair pairA4 = ew3.c.A(bVar10, new f2());
                Pair pairA5 = ew3.d.a(bVar10, new l2((hw3.e) c1Var.Q0.get(), (rx3.a) c1Var.f118473s1.get()));
                Pair pairB3 = ew3.d.b(bVar10, new q2((rx3.a) c1Var.f118473s1.get()));
                Pair pairW2 = eug.c.w(bVar10, new f0((vw3.f) c1Var.f118480v1.get(), (vw3.d) c1Var.f118477u1.get()));
                Pair pairY2 = ew3.c.y(bVar10, new c2((rx3.a) c1Var.f118473s1.get()));
                Pair pairZ = ew3.c.z(bVar10, new d2());
                Pair pairP2 = ew3.d.p(bVar10, new g3());
                Pair pairO3 = ew3.d.o(bVar10, new e3());
                Pair pairC4 = eug.c.c(bVar10, new mz3.c());
                Pair pairD4 = eug.c.d(bVar10, new mz3.d());
                hz3.c cVarB3 = c1Var.b();
                uq3.b bVar11 = c1Var.f118428c;
                sp3.a aVarM = bVar11.m();
                vc.s.j(aVarM);
                Pair pairN2 = ew3.d.n(bVar10, cVarB3, aVarM);
                Pair pairV2 = ew3.d.v(bVar10, new q3((hw3.e) c1Var.Q0.get()));
                Pair pairW3 = ew3.d.w(bVar10, new u3((hw3.e) c1Var.Q0.get()));
                xq3.j jVarG2 = bVar11.g();
                vc.s.j(jVarG2);
                Pair pairP3 = ew3.c.p(bVar10, new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.a(jVarG2, (hw3.e) c1Var.Q0.get(), new pz3.d(new pz3.b(), new pz3.g()), c1Var.b(), c1Var.d()));
                xq3.j jVarG3 = bVar11.g();
                vc.s.j(jVarG3);
                return new j24.d(dw3.l.j(mVar, ew3.d.C(bVar10, ImmutableSet.of(pairN, pairX, pairA, pairR, pairE, pairW, pairA2, pairD, pairB, pairC, pairV, pairT, pairF, pairY, pairT2, pairX2, pairK, pairF2, pairC2, pairO, pairP, pairD2, pairO2, pairA3, pairB2, pairM, pairJ, pairJ2, pairM2, pairQ, pairF3, pairM3, pairE2, pairR2, pairS, pairR3, pairC3, pairD3, pairE3, pairH, pairA4, pairA5, pairB3, pairW2, pairY2, pairZ, pairP2, pairO3, pairC4, pairD4, pairN2, pairV2, pairW3, pairP3, ew3.c.q(bVar10, new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.b(jVarG3, (hw3.e) c1Var.Q0.get(), new pz3.d(new pz3.b(), new pz3.g()), c1Var.b(), c1Var.d())), eug.c.z(bVar10, new m0((hw3.c) c1Var.f118472s0.get())), eug.c.i(bVar10, new mz3.j()), eug.c.g(bVar10, new mz3.h()), eug.c.A(bVar10, new o0()), eug.c.k(bVar10, new mz3.m()), eug.c.l(bVar10, new mz3.n()), ew3.c.u(bVar10, (hw3.e) c1Var.Q0.get()), eug.c.u(bVar10, (hw3.e) c1Var.Q0.get()), ew3.d.i(bVar10, new z2()), ew3.c.h(bVar10, new mz3.c1()), eug.c.B(bVar10, new p0()), ew3.c.l(bVar10, new mz3.f1()), eug.c.q(bVar10, new mz3.w()), ew3.c.n(bVar10, new h1()), ew3.c.i(bVar10, new d1()), ew3.d.j(bVar10, new a3()), ew3.d.g(bVar10, new x2((tx3.d) c1Var.f118490y1.get())), eug.c.s(bVar10, new mz3.x()), ew3.d.s(bVar10, new k3()), ew3.c.g(bVar10, new b1()), ew3.d.y(bVar10, new v3()), ew3.d.u(bVar10, new m3()), ew3.d.k(bVar10, new b3()), ew3.d.l(bVar10, new c3()), ew3.d.z(bVar10, new w3()), ew3.d.t(bVar10, new l3()), ew3.c.B(bVar10, new g2()), ew3.d.h(bVar10, new y2()), eug.c.C(bVar10, new q0()), eug.c.x(bVar10, new g0()), ew3.c.v(bVar10, new s1()), eug.c.b(bVar10, new mz3.b())))));
            case 49:
                return new rx3.a(c1Var.e());
            case 50:
                return dqj.d.f((vw3.d) c1Var.f118477u1.get(), (xx4.d) c1Var.f118437f1.get());
            case 51:
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                return new vw3.d(aVarM2, (a34.c) c1Var.f118476t1.get());
            case 52:
                uq3.b bVar12 = c1Var.f118428c;
                return new a34.c(uq3.b.a(), (CreditPluginsService) c1Var.p0.get(), new o04.i());
            case 53:
                return dqj.d.u((tx3.b) c1Var.f118487x1.get(), (xx4.d) c1Var.f118437f1.get());
            case 54:
                return new tx3.b((x34.b) c1Var.w1.get());
            case 55:
                return new x34.b((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 56:
                return new lx3.b((o34.b) c1Var.f118491z1.get(), 0);
            case 57:
                uq3.b bVar13 = c1Var.f118428c;
                return new o34.b(uq3.b.a(), (CreditPluginsService) c1Var.p0.get(), 0);
            case 58:
                return new lx3.b((o34.b) c1Var.B1.get(), 1);
            case 59:
                uq3.b bVar14 = c1Var.f118428c;
                return new o34.b(uq3.b.a(), (CreditPluginsService) c1Var.p0.get(), 1);
            case 60:
                return new qw3.a((v24.a) c1Var.D1.get());
            case 61:
                uq3.b bVar15 = c1Var.f118428c;
                return new v24.a(uq3.b.a(), c1Var.f118452l.b(), (CreditPluginsService) c1Var.p0.get());
            case 62:
                return new lw3.a((p24.p) c1Var.F1.get());
            case 63:
                return new lw3.b((p24.p) c1Var.F1.get());
            case 64:
                mri.w wVarA11 = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA11);
                return new nw3.d(wVarA11, c1Var.f118447j.a(), (u24.a) c1Var.I1.get(), (p24.p) c1Var.f118469r0.get());
            case 65:
                uq3.b bVar16 = c1Var.f118428c;
                return new u24.a((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 66:
                return new pw3.a((t24.d) c1Var.K1.get());
            case 67:
                uq3.b bVar17 = c1Var.f118428c;
                mp.p pVarA4 = uq3.b.a();
                CreditPluginsService creditPluginsService5 = (CreditPluginsService) c1Var.p0.get();
                sf0.h hVarB = c1Var.f118440g.b();
                vc.s.j(hVarB);
                return new t24.d(pVarA4, creditPluginsService5, new fn2.c(hVarB));
            case 68:
                return new pw3.b((t24.f) c1Var.M1.get());
            case 69:
                return new t24.f((CreditPluginsService) c1Var.p0.get(), (t90.g) c1Var.U0.get());
            case 70:
                return new hw3.f((p24.r) c1Var.O1.get());
            case 71:
                return new p24.r((CreditPluginsService) c1Var.p0.get(), new ne0.d(), c1Var.e());
            case 72:
                jm4.r rVar2 = c1Var.f118447j;
                u45.h hVar2 = c1Var.f118456n;
                al4.p pVarI = rVar2.i();
                al4.u uVarJ = c1Var.f118447j.j();
                h hVarG = hVar2.g();
                ti9.h hVarB2 = c1Var.f118463p.b();
                o95.g gVarC = c1Var.f118465q.c();
                vc.s.j(gVarC);
                return new hy3.j(pVarI, uVarJ, hVarG, hVarB2, gVarC, hVar2.e(), hVar2.j());
            case 73:
                return new vx3.a((z34.b) c1Var.R1.get(), c1Var.k.e());
            case 74:
                uq3.b bVar18 = c1Var.f118428c;
                return new z34.b((CreditPluginsService) c1Var.p0.get(), uq3.b.a(), new ne0.d());
            case 75:
                return new h64.d();
            case 76:
                return new ow3.h(c1Var.b(), (ow3.e) c1Var.Y0.get(), (ow3.g) c1Var.U1.get());
            case 77:
                return new ow3.g(c1Var.d());
            case 78:
                gte.a aVarB6 = c1Var.f118423b.b();
                vc.s.j(aVarB6);
                return new ow3.c(aVarB6, (ow3.e) c1Var.Y0.get());
            case 79:
                return new ow3.a();
            case 80:
                return new ow3.i();
            case 81:
                return new jx3.a((l34.b) c1Var.Z1.get());
            case 82:
                return new l34.b((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 83:
                return new px3.a((t34.e) c1Var.f118426b2.get());
            case 84:
                uq3.b bVar19 = c1Var.f118428c;
                mp.p pVarA5 = uq3.b.a();
                CreditPluginsService creditPluginsService6 = (CreditPluginsService) c1Var.p0.get();
                r10.f fVarK2 = ((nj0.d) c1Var.d).k();
                sf0.h hVarB3 = c1Var.f118440g.b();
                vc.s.j(hVarB3);
                return new t34.e(pVarA5, creditPluginsService6, fVarK2, hVarB3);
            case 85:
                return new by3.a((f44.c) c1Var.f118432d2.get());
            case 86:
                uq3.b bVar20 = c1Var.f118428c;
                return new f44.c((CreditPluginsService) c1Var.p0.get(), uq3.b.a(), new ne0.d());
            case 87:
                return new ay3.a((e44.b) c1Var.f118438f2.get());
            case 88:
                uq3.b bVar21 = c1Var.f118428c;
                mp.p pVarA6 = uq3.b.a();
                CreditPluginsService creditPluginsService7 = (CreditPluginsService) c1Var.p0.get();
                ne0.d dVar3 = new ne0.d();
                m31.c cVarG2 = c1Var.f118419a.g();
                vc.s.j(cVarG2);
                return new e44.b(pVarA6, creditPluginsService7, dVar3, cVarG2);
            case 89:
                return new rx3.b((v34.a) c1Var.h2.get());
            case 90:
                return new v34.a((CreditPluginsService) c1Var.p0.get());
            case 91:
                return new sx3.a((w34.b) c1Var.j2.get());
            case 92:
                uq3.b bVar22 = c1Var.f118428c;
                return new w34.b(uq3.b.a(), (CreditPluginsService) c1Var.p0.get(), new t14.p(), new t14.c(new dr3.a(), new dr3.h()));
            case 93:
                return new hw3.n((p24.v) c1Var.l2.get());
            case 94:
                return new p24.v((CreditPluginsService) c1Var.p0.get(), (xx4.d) c1Var.f118437f1.get(), dqj.d.C(c1Var.e()));
            case 95:
                return new zw3.a((f34.a) c1Var.f118459n2.get());
            case 96:
                return new f34.a((CreditPluginsService) c1Var.p0.get());
            case 97:
                return new gx3.a((i34.b) c1Var.p2.get());
            case 98:
                return new i34.b((CreditPluginsService) c1Var.p0.get(), uq3.b.a());
            case 99:
                return new gy3.a((k44.c) c1Var.r2.get());
            default:
                throw new AssertionError(i);
        }
    }
}
