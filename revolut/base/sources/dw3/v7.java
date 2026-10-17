package dw3;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$InputData;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveScreenContract$InputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f120023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120024c;
    public final Object d;

    public /* synthetic */ v7(c1 c1Var, Object obj2, z7 z7Var, int i, int i2) {
        this.f120022a = i2;
        this.f120023b = obj2;
        this.d = z7Var;
        this.f120024c = i;
    }

    private final Object a() {
        uw1.b bVar = ((ea2.h) this.f120023b).f124071a;
        ea2.m mVar = (ea2.m) this.d;
        int i = this.f120024c;
        if (i != 0) {
            if (i == 1) {
                return new sa2.n();
            }
            throw new AssertionError(i);
        }
        sa2.e eVar = mVar.f124097b;
        oz1.a aVar = (oz1.a) ((lz1.m) bVar).f200879e0.get();
        vc.s.j(aVar);
        vw1.b bVarC = ((lz1.m) bVar).c();
        vc.s.j(bVarC);
        ea2.h hVar = mVar.f124098c;
        vw1.b bVarC2 = ((lz1.m) hVar.f124071a).c();
        vc.s.j(bVarC2);
        wj0.a aVarI = ((nj0.d) hVar.e).i();
        vc.s.j(aVarI);
        return new sa2.r(eVar, aVar, bVarC, new r10.w(bVarC2, aVarI), (cli.n) mVar.d.get());
    }

    private final Object b() {
        uw1.b bVar = ((ea2.h) this.f120023b).f124071a;
        ea2.m mVar = (ea2.m) this.d;
        int i = this.f120024c;
        if (i != 0) {
            if (i == 1) {
                return new sa2.n();
            }
            throw new AssertionError(i);
        }
        sa2.e eVar = mVar.f124097b;
        oz1.a aVar = (oz1.a) ((lz1.m) bVar).f200879e0.get();
        vc.s.j(aVar);
        vw1.b bVarC = ((lz1.m) bVar).c();
        vc.s.j(bVarC);
        ea2.h hVar = mVar.f124098c;
        vw1.b bVarC2 = ((lz1.m) hVar.f124071a).c();
        vc.s.j(bVarC2);
        wj0.a aVarI = ((nj0.d) hVar.e).i();
        vc.s.j(aVarI);
        return new sa2.r(eVar, aVar, bVarC, new r10.w(bVarC2, aVarI), (cli.n) mVar.d.get());
    }

    private final Object c() {
        uw1.b bVar = ((ea2.h) this.f120023b).f124071a;
        ea2.m mVar = (ea2.m) this.d;
        int i = this.f120024c;
        if (i != 0) {
            if (i == 1) {
                return new sa2.n();
            }
            throw new AssertionError(i);
        }
        sa2.e eVar = mVar.f124097b;
        oz1.a aVar = (oz1.a) ((lz1.m) bVar).f200879e0.get();
        vc.s.j(aVar);
        vw1.b bVarC = ((lz1.m) bVar).c();
        vc.s.j(bVarC);
        ea2.h hVar = mVar.f124098c;
        vw1.b bVarC2 = ((lz1.m) hVar.f124071a).c();
        vc.s.j(bVarC2);
        wj0.a aVarI = ((nj0.d) hVar.e).i();
        vc.s.j(aVarI);
        return new sa2.r(eVar, aVar, bVarC, new r10.w(bVarC2, aVarI), (cli.n) mVar.d.get());
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        switch (this.f120022a) {
            case 0:
                u7 u7Var = (u7) this.d;
                c1 c1Var = (c1) this.f120023b;
                l70.e eVar = c1Var.f118443h;
                nj0.a aVar = c1Var.d;
                int i = this.f120024c;
                if (i == 0) {
                    return new a84.e((a84.b) u7Var.d.get());
                }
                if (i == 1) {
                    return agk.b.l(u7Var.f119938b);
                }
                if (i == 2) {
                    hk0.a aVarJ = ((nj0.d) aVar).j();
                    zk0.b bVarL = eVar.l();
                    vc.s.j(bVarL);
                    n80.d dVarA = eVar.a();
                    vc.s.j(dVarA);
                    return new y74.d(aVarJ, bVarL, dVarA, c1Var.f118482w.e());
                }
                if (i != 3) {
                    if (i == 4) {
                        return new v44.q(new mx4.r());
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) u7Var.f119940g.get();
                CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = u7Var.f119939c;
                y74.a aVar2 = (y74.a) u7Var.f.get();
                hz3.c cVarB = c1Var.b();
                bk0.e eVarH = ((nj0.d) aVar).h();
                gte.a aVarB = c1Var.f118423b.b();
                vc.s.j(aVarB);
                return new v44.n(nVar, creditApplicationDocumentViewerScreenContract$InputData, aVar2, cVarB, eVarH, aVarB);
            case 1:
                u7 u7Var2 = (u7) this.d;
                c1 c1Var2 = (c1) this.f120023b;
                l70.e eVar2 = c1Var2.f118443h;
                nj0.a aVar3 = c1Var2.d;
                int i2 = this.f120024c;
                if (i2 == 0) {
                    return new a84.e((a84.b) u7Var2.d.get());
                }
                if (i2 == 1) {
                    return agk.b.l(u7Var2.f119938b);
                }
                if (i2 == 2) {
                    hk0.a aVarJ2 = ((nj0.d) aVar3).j();
                    zk0.b bVarL2 = eVar2.l();
                    vc.s.j(bVarL2);
                    n80.d dVarA2 = eVar2.a();
                    vc.s.j(dVarA2);
                    return new y74.d(aVarJ2, bVarL2, dVarA2, c1Var2.f118482w.e());
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new v44.q(new mx4.r());
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar2 = (cli.n) u7Var2.f119940g.get();
                CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData2 = u7Var2.f119939c;
                y74.a aVar4 = (y74.a) u7Var2.f.get();
                hz3.c cVarB2 = c1Var2.b();
                bk0.e eVarH2 = ((nj0.d) aVar3).h();
                gte.a aVarB2 = c1Var2.f118423b.b();
                vc.s.j(aVarB2);
                return new v44.n(nVar2, creditApplicationDocumentViewerScreenContract$InputData2, aVar4, cVarB2, eVarH2, aVarB2);
            case 2:
                u7 u7Var3 = (u7) this.d;
                c1 c1Var3 = (c1) this.f120023b;
                l70.e eVar3 = c1Var3.f118443h;
                nj0.a aVar5 = c1Var3.d;
                int i3 = this.f120024c;
                if (i3 == 0) {
                    return new a84.e((a84.b) u7Var3.d.get());
                }
                if (i3 == 1) {
                    return agk.b.l(u7Var3.f119938b);
                }
                if (i3 == 2) {
                    hk0.a aVarJ3 = ((nj0.d) aVar5).j();
                    zk0.b bVarL3 = eVar3.l();
                    vc.s.j(bVarL3);
                    n80.d dVarA3 = eVar3.a();
                    vc.s.j(dVarA3);
                    return new y74.d(aVarJ3, bVarL3, dVarA3, c1Var3.f118482w.e());
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        return new v44.q(new mx4.r());
                    }
                    throw new AssertionError(i3);
                }
                cli.n nVar3 = (cli.n) u7Var3.f119940g.get();
                CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData3 = u7Var3.f119939c;
                y74.a aVar6 = (y74.a) u7Var3.f.get();
                hz3.c cVarB3 = c1Var3.b();
                bk0.e eVarH3 = ((nj0.d) aVar5).h();
                gte.a aVarB3 = c1Var3.f118423b.b();
                vc.s.j(aVarB3);
                return new v44.n(nVar3, creditApplicationDocumentViewerScreenContract$InputData3, aVar6, cVarB3, eVarH3, aVarB3);
            case 3:
                u7 u7Var4 = (u7) this.d;
                c1 c1Var4 = (c1) this.f120023b;
                l70.e eVar4 = c1Var4.f118443h;
                nj0.a aVar7 = c1Var4.d;
                int i5 = this.f120024c;
                if (i5 == 0) {
                    return new a84.e((a84.b) u7Var4.d.get());
                }
                if (i5 == 1) {
                    return agk.b.l(u7Var4.f119938b);
                }
                if (i5 == 2) {
                    hk0.a aVarJ4 = ((nj0.d) aVar7).j();
                    zk0.b bVarL4 = eVar4.l();
                    vc.s.j(bVarL4);
                    n80.d dVarA4 = eVar4.a();
                    vc.s.j(dVarA4);
                    return new y74.d(aVarJ4, bVarL4, dVarA4, c1Var4.f118482w.e());
                }
                if (i5 != 3) {
                    if (i5 == 4) {
                        return new v44.q(new mx4.r());
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar4 = (cli.n) u7Var4.f119940g.get();
                CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData4 = u7Var4.f119939c;
                y74.a aVar8 = (y74.a) u7Var4.f.get();
                hz3.c cVarB4 = c1Var4.b();
                bk0.e eVarH4 = ((nj0.d) aVar7).h();
                gte.a aVarB4 = c1Var4.f118423b.b();
                vc.s.j(aVarB4);
                return new v44.n(nVar4, creditApplicationDocumentViewerScreenContract$InputData4, aVar8, cVarB4, eVarH4, aVarB4);
            case 4:
                z7 z7Var = (z7) this.d;
                int i6 = this.f120024c;
                if (i6 == 0) {
                    return new y44.m(z7Var.f120318b, (y44.a) ((t) this.f120023b).u.get(), (cli.n) z7Var.f120319c.get());
                }
                if (i6 == 1) {
                    return new y44.p(new mx4.y());
                }
                throw new AssertionError(i6);
            case 5:
                z7 z7Var2 = (z7) this.d;
                int i21 = this.f120024c;
                if (i21 == 0) {
                    return new y44.m(z7Var2.f120318b, (y44.a) ((h4) this.f120023b).u.get(), (cli.n) z7Var2.f120319c.get());
                }
                if (i21 == 1) {
                    return new y44.p(new mx4.y());
                }
                throw new AssertionError(i21);
            case 6:
                d8 d8Var = (d8) this.d;
                i0 i0Var = (i0) this.f120023b;
                int i22 = this.f120024c;
                if (i22 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) d8Var.f118594a.get(), (c84.b) d8Var.f118596c.get(), (PluginFlowContract$Input) i0Var.i.get());
                }
                if (i22 == 1) {
                    return new c84.b();
                }
                if (i22 == 2) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b((PluginFlowContract$Input) i0Var.i.get(), (o64.d) i0Var.f118941w.get(), new q64.t());
                }
                throw new AssertionError(i22);
            case 7:
                s4 s4Var = (s4) this.f120023b;
                h8 h8Var = (h8) this.d;
                DebtDetailsScreenContract$InputData debtDetailsScreenContract$InputData = h8Var.f118917a;
                int i32 = this.f120024c;
                if (i32 == 0) {
                    return e5f.b.d((com.revolut.kompot.navigable.a) h8Var.f118918b.get(), (c84.b) h8Var.d.get(), (PluginFlowContract$Input) s4Var.i.get());
                }
                if (i32 == 1) {
                    return new c84.b();
                }
                if (i32 == 2) {
                    return new v84.h(debtDetailsScreenContract$InputData, (j60.a) s4Var.f119762t.get(), (jki.p) h8Var.f118920g.get());
                }
                if (i32 == 3) {
                    return new v84.j(debtDetailsScreenContract$InputData, new z84.a());
                }
                throw new AssertionError(i32);
            case 8:
                x2 x2Var = (x2) this.f120023b;
                l8 l8Var = (l8) this.d;
                SummaryScreenContract$InputData summaryScreenContract$InputData = l8Var.f119219a;
                int i33 = this.f120024c;
                if (i33 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) l8Var.f119221c.get(), (c84.b) l8Var.e.get(), (PluginFlowContract$Input) x2Var.i.get());
                }
                if (i33 == 1) {
                    return new c84.b();
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                sb4.c cVar2 = (sb4.c) x2Var.u.get();
                jz3.c cVar3 = new jz3.c();
                c1 c1Var5 = l8Var.f119220b;
                je6.h hVarC = ((xf6.t) c1Var5.R).c();
                vc.s.j(hVarC);
                whf.n nVarB = c1Var5.f0.b();
                vc.s.j(nVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h(summaryScreenContract$InputData, cVar2, cVar3, new kxk.o(summaryScreenContract$InputData, new tb4.t(summaryScreenContract$InputData, new tb4.v(new tb4.b(hVarC, nVarB)))));
            case 9:
                j0 j0Var = (j0) this.f120023b;
                h9 h9Var = (h9) this.d;
                int i43 = this.f120024c;
                if (i43 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) h9Var.f118924c.get(), (c84.b) h9Var.d.get(), (PluginFlowContract$Input) j0Var.i.get());
                }
                if (i43 == 1) {
                    return new c84.b();
                }
                if (i43 == 2) {
                    return new ii4.s0(h9Var.f118923b, (ii4.o) j0Var.o.get(), (cli.n) h9Var.f118925g.get());
                }
                if (i43 == 3) {
                    return new ii4.t0();
                }
                throw new AssertionError(i43);
            case 10:
                s6 s6Var = (s6) this.f120023b;
                h9 h9Var2 = (h9) this.d;
                int i59 = this.f120024c;
                if (i59 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) h9Var2.f118924c.get(), (c84.b) h9Var2.d.get(), (PluginFlowContract$Input) s6Var.i.get());
                }
                if (i59 == 1) {
                    return new c84.b();
                }
                if (i59 == 2) {
                    return new ii4.s0(h9Var2.f118923b, (ii4.o) s6Var.o.get(), (cli.n) h9Var2.f118925g.get());
                }
                if (i59 == 3) {
                    return new ii4.t0();
                }
                throw new AssertionError(i59);
            case 11:
                u2 u2Var = (u2) this.f120023b;
                h9 h9Var3 = (h9) this.d;
                int i66 = this.f120024c;
                if (i66 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) h9Var3.f118924c.get(), (c84.b) h9Var3.d.get(), (PluginFlowContract$Input) u2Var.i.get());
                }
                if (i66 == 1) {
                    return new c84.b();
                }
                if (i66 == 2) {
                    return new ii4.s0(h9Var3.f118923b, (ii4.o) u2Var.o.get(), (cli.n) h9Var3.f118925g.get());
                }
                if (i66 == 3) {
                    return new ii4.t0();
                }
                throw new AssertionError(i66);
            case 12:
                c0 c0Var = (c0) this.f120023b;
                h9 h9Var4 = (h9) this.d;
                int i74 = this.f120024c;
                if (i74 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) h9Var4.f118924c.get(), (c84.b) h9Var4.d.get(), (PluginFlowContract$Input) c0Var.i.get());
                }
                if (i74 == 1) {
                    return new c84.b();
                }
                if (i74 == 2) {
                    return new ii4.s0(h9Var4.f118923b, (ii4.o) c0Var.o.get(), (cli.n) h9Var4.f118925g.get());
                }
                if (i74 == 3) {
                    return new ii4.t0();
                }
                throw new AssertionError(i74);
            case 13:
                dwh.b bVar = (dwh.b) this.d;
                AutoInvestMoveScreenContract$InputData autoInvestMoveScreenContract$InputData = bVar.f120396a;
                dwh.c cVar4 = (dwh.c) this.f120023b;
                zxb.k0 k0Var = cVar4.f120401c;
                int i92 = this.f120024c;
                if (i92 != 0) {
                    if (i92 != 1) {
                        if (i92 == 2) {
                            return new ewh.e(cVar4.f120399a.d());
                        }
                        throw new AssertionError(i92);
                    }
                    ewh.d dVar = (ewh.d) bVar.f120397b.get();
                    gte.a aVarB5 = cVar4.f120400b.b();
                    vc.s.j(aVarB5);
                    return new ewh.a0(dVar, autoInvestMoveScreenContract$InputData, aVarB5);
                }
                cli.n nVar5 = (cli.n) bVar.f120398c.get();
                nyb.k kVarC = k0Var.c();
                vc.s.j(kVarC);
                nyb.i0 i0VarF = k0Var.f();
                vc.s.j(i0VarF);
                aa6.c cVarB5 = cVar4.d.b();
                vc.s.j(cVarB5);
                sl5.h hVar = (sl5.h) cVar4.e.f217027x.get();
                vc.s.j(hVar);
                ppg.b bVarB = ((wpg.l) cVar4.f).b();
                vc.s.j(bVarB);
                return new ewh.v(nVar5, autoInvestMoveScreenContract$InputData, kVarC, i0VarF, cVarB5, hVar, bVarB, cVar4.f120402g.a(), cVar4.f120403h.g(), cVar4.i.f());
            case 14:
                dx2.b bVar2 = (dx2.b) this.f120023b;
                dx2.a aVar9 = (dx2.a) this.d;
                int i96 = this.f120024c;
                switch (i96) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar9.f120520a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar9.f120520a);
                        t70.g gVarO = bVar2.f120534a.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar9.f120524h.get(), gsi.c.a(aVar9.f120520a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar9.f120520a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar9.f120520a));
                    case 5:
                        cVar = new iri.g((iri.j) bVar2.f.get(), (iri.m) bVar2.f120537g.get(), bq.i.f(aVar9.f120520a), bq.i.l(aVar9.f120520a));
                        break;
                    case 6:
                        cVar = new iri.l((iri.m) bVar2.f120537g.get(), bq.i.f(aVar9.f120520a), (iri.d) aVar9.f120526l.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(aVar9.f120520a));
                    case 8:
                        return new opi.b(bq.i.f(aVar9.f120520a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar9.e.f120538h.get()), bq.i.l(aVar9.f120520a));
                    case 10:
                        return new iqi.b(aVar9.f120521b, bq.i.b(aVar9.f120520a));
                    case 11:
                        return new hqi.f(aVar9.f120522c, bq.i.b(aVar9.f120520a));
                    case 12:
                        return new k3l.d(bq.i.b(aVar9.f120520a));
                    case 13:
                        gx2.k kVar = new gx2.k((cx2.b) bVar2.i.get(), aVar9.d, (iqi.h) aVar9.f120529p.get(), (k3l.b) aVar9.f120531r.get(), (cx2.c) bVar2.f120539j.get(), (gx2.r) aVar9.f120532s.get(), (kpi.c) aVar9.f.get());
                        kli.a.p(kVar, bq.i.d(aVar9.f120520a));
                        return kVar;
                    case 14:
                        return new gx2.u();
                    default:
                        throw new AssertionError(i96);
                }
                return cVar;
            case 15:
                e48.h hVar2 = (e48.h) this.d;
                JointCloseFlowContract$InputData inputData = hVar2.f122441a;
                e48.g gVar = (e48.g) this.f120023b;
                usg.a aVar10 = gVar.e;
                int i99 = this.f120024c;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new com.revolut.feature.joint.impl.ui.close_flow.a(inputData, gVar.d.c(), (p48.k) hVar2.d.get(), aVar10.b());
                    }
                    throw new AssertionError(i99);
                }
                wsg.n nVarB2 = aVar10.b();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) gVar.f122434q).c();
                vc.s.j(aVarC);
                g48.t0 pendingTransactionProvider = new g48.t0(aVarC, nVarB2);
                usg.a aVar11 = hVar2.f122442b.e;
                jt0.b pocketsWithTotalBalanceProvider = new jt0.b(aVar11.b(), new r38.a(aVar11.b(), 0), new qq8.a(aVar11.b(), 1));
                rnb.w savingsVaultInteractor = gVar.f122435r.b();
                vc.s.j(savingsVaultInteractor);
                gte.a featureToggleInteractor = gVar.i.b();
                vc.s.j(featureToggleInteractor);
                cne.a stampDutyInteractor = gVar.f122436s.a();
                vc.s.j(stampDutyInteractor);
                zdl.f wealthTradingAccountDomainApi = gVar.f122437t;
                s48.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(pendingTransactionProvider, "pendingTransactionProvider");
                Intrinsics.checkNotNullParameter(pocketsWithTotalBalanceProvider, "pocketsWithTotalBalanceProvider");
                Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(stampDutyInteractor, "stampDutyInteractor");
                Intrinsics.checkNotNullParameter(wealthTradingAccountDomainApi, "wealthTradingAccountDomainApi");
                return new p48.k(inputData.f76512a, inputData.f76513b, pendingTransactionProvider, pocketsWithTotalBalanceProvider, savingsVaultInteractor, featureToggleInteractor, stampDutyInteractor, wealthTradingAccountDomainApi.d());
            case 16:
                zc6.b bVar3 = ((e48.g) this.f120023b).u;
                e48.j jVar = (e48.j) this.d;
                int i100 = this.f120024c;
                if (i100 == 0) {
                    fd6.a aVar12 = (fd6.a) jVar.d.get();
                    va.g.t(aVar12);
                    return aVar12;
                }
                if (i100 == 1) {
                    return va.g.s(((zc6.a) bVar3).d(), (xc6.a) jVar.f122448c.get());
                }
                if (i100 == 2) {
                    return r6.b.k((zc6.a) bVar3, "factory");
                }
                if (i100 == 3) {
                    return va.g.u((xc6.a) jVar.f122448c.get());
                }
                if (i100 == 4) {
                    return new q48.j(new q48.i(jVar.f122446a, ((zc6.a) jVar.f122447b.u).c()), ((zc6.a) bVar3).b());
                }
                throw new AssertionError(i100);
            case 17:
                e48.m mVar = (e48.m) this.d;
                e48.g gVar2 = mVar.f122456b;
                e48.g gVar3 = (e48.g) this.f120023b;
                e48.a aVar13 = gVar3.d;
                int i101 = this.f120024c;
                if (i101 == 0) {
                    return kxa.j.m((j60.a) mVar.f.get());
                }
                if (i101 == 1) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) mVar.d.get(), (rp0.m) mVar.e.get());
                }
                if (i101 == 2) {
                    return new rp0.m();
                }
                if (i101 != 3) {
                    if (i101 == 4) {
                        return new k58.a();
                    }
                    throw new AssertionError(i101);
                }
                InviteFlowContract$InputData inviteFlowContract$InputData = mVar.f122455a;
                k38.d dVar2 = (k38.d) aVar13.f122396r.get();
                vc.s.j(dVar2);
                g48.r0 r0VarC = aVar13.c();
                wsg.n nVarB3 = gVar3.e.b();
                ang.f fVarE = gVar3.f.e();
                bci.d dVar3 = (bci.d) gVar3.k.v.get();
                vc.s.j(dVar3);
                ln3.b bVar4 = new ln3.b();
                j60.a aVar14 = (j60.a) mVar.f.get();
                Context context = gVar2.f122430l;
                c58.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                zfe.e.Companion.getClass();
                zfe.e eVarA = zfe.d.a(context);
                k38.a aVarA = gVar3.f122428h.a();
                vc.s.j(aVarA);
                k38.d dVar4 = (k38.d) gVar2.d.f122396r.get();
                vc.s.j(dVar4);
                l58.c cVar5 = new l58.c(dVar4, (l58.e) gVar2.B.get(), gVar2.f.e());
                til.m mVarA = gVar3.f122432n.a();
                vc.s.j(mVarA);
                gte.a aVarB6 = gVar3.i.b();
                vc.s.j(aVarB6);
                jvh.a aVarA2 = gVar3.o.a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.joint.impl.ui.invite_flow.d(inviteFlowContract$InputData, dVar2, r0VarC, nVarB3, fVarE, dVar3, bVar4, aVar14, eVarA, aVarA, cVar5, mVarA, aVarB6, aVarA2);
            case 18:
                e53.h hVar3 = (e53.h) this.f120023b;
                e53.i iVar = (e53.i) this.d;
                int i102 = this.f120024c;
                if (i102 == 0) {
                    n60.a aVar15 = (n60.a) iVar.d.get();
                    o5k.i.l(aVar15);
                    return aVar15;
                }
                if (i102 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) iVar.f122734c.get());
                }
                if (i102 == 2) {
                    n60.b bVar5 = (n60.b) iVar.f.get();
                    o5k.i.m(bVar5);
                    return bVar5;
                }
                if (i102 == 3) {
                    return o5k.i.r((com.revolut.kompot.navigable.a) iVar.f122734c.get());
                }
                if (i102 != 4) {
                    if (i102 != 5) {
                        throw new AssertionError(i102);
                    }
                    c90.c cVar6 = (c90.c) hVar3.f122731h.get();
                    gte.a aVarB7 = hVar3.f122728b.b();
                    vc.s.j(aVarB7);
                    return new j53.t(cVar6, aVarB7);
                }
                cli.n nVar6 = (cli.n) iVar.f122736h.get();
                CustomisationImageGenerationControllerContract$InputData customisationImageGenerationControllerContract$InputData = iVar.f122732a;
                a53.a aVar16 = (a53.a) hVar3.f122729c.i.get();
                vc.s.j(aVar16);
                wj0.a aVarI = ((nj0.d) hVar3.d).i();
                vc.s.j(aVarI);
                n60.a aVar17 = (n60.a) iVar.d.get();
                n60.b bVar6 = (n60.b) iVar.f.get();
                sf0.h hVarB = hVar3.e.b();
                vc.s.j(hVarB);
                r70.c cVarA = hVar3.f122727a.A();
                vc.s.j(cVarA);
                return new com.revolut.feature.card_personalisation.generation.impl.ui.generation.a(nVar6, customisationImageGenerationControllerContract$InputData, aVar16, aVarI, aVar17, bVar6, hVarB, cVarA, new d33.f());
            case 19:
                e79.c cVar7 = (e79.c) this.f120023b;
                e79.b bVar7 = (e79.b) this.d;
                int i103 = this.f120024c;
                if (i103 == 0) {
                    cli.n nVar7 = (cli.n) bVar7.f123110b.get();
                    r69.a aVarA3 = cVar7.e.a();
                    vc.s.j(aVarA3);
                    return new i79.k(nVar7, aVarA3, ((s41.a) cVar7.f123115g).d());
                }
                if (i103 != 1) {
                    throw new AssertionError(i103);
                }
                l80.e eVarH5 = bVar7.f123109a.f123116h.h();
                vc.s.j(eVarH5);
                return new i3g.k(new i79.c(eVarH5, new h79.a(new z69.b())));
            case 20:
                e79.c cVar8 = (e79.c) this.f120023b;
                e79.f fVar = (e79.f) this.d;
                int i104 = this.f120024c;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new AssertionError(i104);
                    }
                    h79.a aVar18 = new h79.a(new z69.b());
                    fka.a aVar19 = (fka.a) ((ika.b) fVar.f123134a.f).i.get();
                    vc.s.j(aVar19);
                    return new k79.t(aVar18, new f61.a(aVar19), new k79.a());
                }
                cli.n nVar8 = (cli.n) fVar.f123135b.get();
                y69.f fVar2 = (y69.f) cVar8.D.get();
                wli.x xVarD = ((s41.a) cVar8.f123115g).d();
                r69.a aVarA4 = cVar8.e.a();
                vc.s.j(aVarA4);
                return new k79.r(nVar8, fVar2, xVarD, aVarA4);
            case 21:
                e9i.e eVar5 = (e9i.e) this.f120023b;
                e9i.d dVar5 = (e9i.d) this.d;
                int i105 = this.f120024c;
                switch (i105) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(dVar5.f124010a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar5.f124010a);
                        t70.g gVarO2 = eVar5.f124020a.o();
                        vc.s.j(gVarO2);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                    case 2:
                        return new tpi.i((rpi.c) dVar5.e.get(), gsi.c.a(dVar5.f124010a));
                    case 3:
                        return new rpi.b(bq.i.b(dVar5.f124010a));
                    case 4:
                        return new rpi.h(bq.i.b(dVar5.f124010a));
                    case 5:
                        return new iri.g((iri.j) eVar5.f.get(), (iri.m) eVar5.f124023g.get(), bq.i.f(dVar5.f124010a), bq.i.l(dVar5.f124010a));
                    case 6:
                        return new iri.l((iri.m) eVar5.f124023g.get(), bq.i.f(dVar5.f124010a), (iri.d) dVar5.i.get());
                    case 7:
                        return new iri.d(bq.i.f(dVar5.f124010a));
                    case 8:
                        return new opi.b(bq.i.f(dVar5.f124010a));
                    case 9:
                        e4m.e eVar6 = dVar5.f124016l;
                        xoi.d dVar6 = dVar5.f124010a;
                        g9i.t tVar = new g9i.t((f9b.f) eVar6.get(), (g9i.k) eVar5.f124024h.get(), (g9i.m) dVar5.f124017m.get(), (g9i.j) dVar5.f124018n.get(), bq.i.l(dVar6));
                        kli.a.p(tVar, bq.i.d(dVar6));
                        return tVar;
                    case 10:
                        return bq.i.t(dVar5.f124010a);
                    case 11:
                        e4m.e eVar7 = eVar5.f124024h;
                        l70.e eVar8 = eVar5.f124020a;
                        g9i.k kVar2 = (g9i.k) eVar7.get();
                        g9i.n nVar9 = (g9i.n) eVar5.f124023g.get();
                        zk0.b bVarL5 = eVar8.l();
                        vc.s.j(bVarL5);
                        f80.a aVarX = eVar8.x();
                        vc.s.j(aVarX);
                        return new com.revolut.feature_pdf_view.ui.a(kVar2, nVar9, bVarL5, aVarX, eVar5.f124022c.e());
                    case 12:
                        return new g9i.b((g9i.n) eVar5.f124023g.get());
                    case 13:
                        g9i.k kVar3 = (g9i.k) eVar5.f124024h.get();
                        e4m.e eVar9 = dVar5.f124017m;
                        xoi.d dVar7 = dVar5.f124010a;
                        g9i.h hVar4 = new g9i.h(kVar3, (g9i.m) eVar9.get(), (f9b.f) dVar5.f124016l.get(), bq.i.l(dVar7));
                        kli.a.p(hVar4, bq.i.d(dVar7));
                        return hVar4;
                    default:
                        throw new AssertionError(i105);
                }
            case 22:
                ea2.h hVar5 = (ea2.h) this.f120023b;
                int i106 = this.f120024c;
                if (i106 != 0) {
                    if (i106 == 1) {
                        return new ma2.o();
                    }
                    throw new AssertionError(i106);
                }
                vw1.b bVarC = ((lz1.m) hVar5.f124071a).c();
                vc.s.j(bVarC);
                wj0.a aVarI2 = ((nj0.d) hVar5.e).i();
                vc.s.j(aVarI2);
                sf0.h hVarB2 = hVar5.f.b();
                vc.s.j(hVarB2);
                return new com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a(bVarC, aVarI2, hVarB2, (cli.n) ((ea2.a) this.d).f124052a.get());
            case 23:
                ea2.c cVar9 = (ea2.c) this.d;
                ea2.h hVar6 = (ea2.h) this.f120023b;
                djf.c cVar10 = hVar6.k;
                int i107 = this.f120024c;
                if (i107 != 0) {
                    if (i107 == 1) {
                        whf.b bVarA = cVar10.a();
                        vc.s.j(bVarA);
                        return new ka2.c0(bVarA);
                    }
                    if (i107 != 2) {
                        throw new AssertionError(i107);
                    }
                    lx1.i iVarD = ((ey1.e) hVar6.f124078m).d();
                    vc.s.j(iVarD);
                    whf.n nVarB4 = cVar10.b();
                    vc.s.j(nVarB4);
                    return new ka2.x(iVarD, nVarB4);
                }
                vw1.b bVarC2 = ((lz1.m) hVar6.f124071a).c();
                vc.s.j(bVarC2);
                pn3.a aVar20 = (pn3.a) hVar6.f124083s.get();
                xx9.p pVarB = hVar6.f124076j.b();
                vc.s.j(pVarB);
                e12.f fVar3 = (e12.f) cVar9.f124057a.get();
                whf.b bVarA2 = cVar10.a();
                vc.s.j(bVarA2);
                zja.a aVarA5 = ((ika.b) hVar6.f124077l).a();
                vc.s.j(aVarA5);
                return new com.revolut.feature.apm.payid.impl.screen.area.c(bVarC2, aVar20, pVarB, fVar3, bVarA2, aVarA5, (cli.n) cVar9.f124058b.get());
            case 24:
                ea2.h hVar7 = (ea2.h) this.f120023b;
                vl3.n nVar10 = hVar7.f124074g;
                int i108 = this.f120024c;
                if (i108 == 0) {
                    fl3.a aVarE = nVar10.e();
                    vc.s.j(aVarE);
                    return new ua2.t(aVarE, ((c21.b) hVar7.f124072b).a(), new x2k.e(), (cli.n) ((ea2.e) this.d).f124063a.get());
                }
                if (i108 != 1) {
                    throw new AssertionError(i108);
                }
                dl3.f fVarC = nVar10.c();
                vc.s.j(fVarC);
                return new ua2.q(fVarC, b3j.p.d());
            case 25:
                ea2.h hVar8 = (ea2.h) this.f120023b;
                ea2.g gVar4 = (ea2.g) this.d;
                int i109 = this.f120024c;
                if (i109 == 0) {
                    ba2.e extension = (ba2.e) gVar4.f124069b.get();
                    za2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i109 != 1) {
                    if (i109 == 2) {
                        return new ya2.m(gVar4.f124068a, hVar8.a(), (ba2.e) gVar4.f124069b.get(), (cli.n) gVar4.d.get());
                    }
                    if (i109 == 3) {
                        return new ya2.l();
                    }
                    throw new AssertionError(i109);
                }
                ha2.a factory = (ha2.a) hVar8.f124082r.get();
                za2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object obj2 = factory.f150394a.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                ba2.e eVar10 = (ba2.e) obj2;
                vc.s.k(eVar10);
                return eVar10;
            case 26:
                return a();
            case 27:
                return b();
            case 28:
                return c();
            default:
                ea2.o oVar = (ea2.o) this.d;
                int i110 = this.f120024c;
                if (i110 != 0) {
                    if (i110 == 1) {
                        return new cb2.h();
                    }
                    throw new AssertionError(i110);
                }
                cb2.d dVar8 = oVar.f124103b;
                vw1.b bVarC3 = ((lz1.m) ((ea2.h) this.f120023b).f124071a).c();
                vc.s.j(bVarC3);
                ea2.h hVar9 = oVar.f124104c;
                vw1.b bVarC4 = ((lz1.m) hVar9.f124071a).c();
                vc.s.j(bVarC4);
                wj0.a aVarI3 = ((nj0.d) hVar9.e).i();
                vc.s.j(aVarI3);
                return new cb2.m(dVar8, bVarC3, new r10.w(bVarC4, aVarI3), (cli.n) oVar.d.get());
        }
    }

    public /* synthetic */ v7(Object obj2, Object obj3, int i, int i2) {
        this.f120022a = i2;
        this.f120023b = obj2;
        this.d = obj3;
        this.f120024c = i;
    }
}
