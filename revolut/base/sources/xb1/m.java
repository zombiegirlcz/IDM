package xb1;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Collection;
import ke6.d0;
import kotlin.jvm.internal.Intrinsics;
import ma1.y;
import oee.v;
import rp0.g1;
import rp0.x0;
import xf6.c0;
import xf6.c1;
import xf6.e0;
import xf6.i1;
import xf6.k1;
import xf6.m1;
import xf6.n1;
import xf6.s1;
import xf6.t0;
import xf6.v0;
import xf6.w;
import xf6.y1;
import xf6.z0;
import xg6.x;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f303947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f303948c;
    public final Object d;

    public /* synthetic */ m(Object obj2, Object obj3, int i, int i2) {
        this.f303946a = i2;
        this.f303947b = obj2;
        this.d = obj3;
        this.f303948c = i;
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        switch (this.f303946a) {
            case 0:
                n nVar = (n) this.d;
                p pVar = (p) this.f303947b;
                bfc.d dVar = pVar.f303955a;
                ka1.l lVar = pVar.f303956b;
                int i = this.f303948c;
                if (i != 0) {
                    if (i != 1) {
                        throw new AssertionError(i);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar.d.get();
                    dc1.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return x0.a(g1.Companion, controller.D2());
                }
                CardReaderRootFlowContract$InputData cardReaderRootFlowContract$InputData = nVar.f303949a;
                ma1.k kVar = (ma1.k) lVar.f182381r.get();
                vc.s.j(kVar);
                oa1.a aVar = (oa1.a) lVar.X.get();
                vc.s.j(aVar);
                ed1.a aVar2 = (ed1.a) pVar.f303957c.f193958g.get();
                vc.s.j(aVar2);
                sfc.f fVar = (sfc.f) pVar.d.f.get();
                vc.s.j(fVar);
                t53.a aVar3 = (t53.a) pVar.e.f259914g.get();
                vc.s.j(aVar3);
                efc.c cVar2 = (efc.c) dVar.o.get();
                vc.s.j(cVar2);
                efc.a aVar4 = (efc.a) dVar.f14956p.get();
                vc.s.j(aVar4);
                return new com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a(cardReaderRootFlowContract$InputData, kVar, aVar, aVar2, fVar, aVar3, cVar2, aVar4, (g1) nVar.e.get());
            case 1:
                o oVar = (o) this.d;
                p pVar2 = (p) this.f303947b;
                bfc.d dVar2 = pVar2.f303955a;
                int i2 = this.f303948c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new anl.j((gc1.n) oVar.f303952a.get());
                    }
                    if (i2 == 2) {
                        return new gc1.o();
                    }
                    throw new AssertionError(i2);
                }
                jki.p pVar3 = (jki.p) oVar.f303953b.get();
                ma1.o oVar2 = (ma1.o) pVar2.f303956b.S.get();
                vc.s.j(oVar2);
                cfc.b bVarA = dVar2.a();
                vc.s.j(bVarA);
                dfc.a aVar5 = (dfc.a) dVar2.f14954m.get();
                vc.s.j(aVar5);
                gc1.n nVar2 = (gc1.n) oVar.f303952a.get();
                cfc.a aVar6 = (cfc.a) dVar2.f14955n.get();
                vc.s.j(aVar6);
                return new gc1.q(pVar3, oVar2, bVarA, aVar5, nVar2, aVar6);
            case 2:
                r rVar = (r) this.d;
                int i3 = this.f303948c;
                if (i3 == 0) {
                    jki.p pVar4 = (jki.p) rVar.f303962a.get();
                    cfc.b bVarA2 = ((p) this.f303947b).f303955a.a();
                    vc.s.j(bVarA2);
                    return new hc1.g(pVar4, bVarA2, (hc1.b) rVar.f303963b.get());
                }
                if (i3 == 1) {
                    return new hc1.h();
                }
                if (i3 == 2) {
                    return new hc1.e();
                }
                throw new AssertionError(i3);
            case 3:
                p pVar5 = (p) this.f303947b;
                ka1.l lVar2 = pVar5.f303956b;
                bfc.d dVar3 = pVar5.f303955a;
                int i5 = this.f303948c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new AssertionError(i5);
                    }
                    cfc.a cardReaderUiListItemsInteractor = (cfc.a) dVar3.f14955n.get();
                    vc.s.j(cardReaderUiListItemsInteractor);
                    Intrinsics.checkNotNullParameter(cardReaderUiListItemsInteractor, "cardReaderUiListItemsInteractor");
                    return new sc1.m();
                }
                jki.p pVar6 = (jki.p) ((s) this.d).f303965a.get();
                y yVar = (y) lVar2.f182382s.get();
                vc.s.j(yVar);
                da1.d dVar4 = (da1.d) lVar2.f182384w.get();
                vc.s.j(dVar4);
                s70.a aVarM = pVar5.f.m();
                vc.s.j(aVarM);
                dfc.a aVar7 = (dfc.a) dVar3.f14954m.get();
                vc.s.j(aVar7);
                return new sc1.l(pVar6, yVar, dVar4, aVarM, aVar7, new sc1.a());
            case 4:
                vee.c cVar3 = (vee.c) this.f303947b;
                xee.a aVar8 = (xee.a) this.d;
                int i6 = this.f303948c;
                switch (i6) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar8.f304636a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar8.f304636a);
                        t70.g gVarO = cVar3.f288309b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar8.f304639g.get(), gsi.c.a(aVar8.f304636a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar8.f304636a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar8.f304636a));
                    case 5:
                        cVar = new iri.g((iri.j) cVar3.f288313j.get(), new iri.b(), bq.i.f(aVar8.f304636a), bq.i.l(aVar8.f304636a));
                        break;
                    case 6:
                        return new iri.l(new iri.b(), bq.i.f(aVar8.f304636a), (iri.d) aVar8.k.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar8.f304636a));
                    case 8:
                        return new opi.b(bq.i.f(aVar8.f304636a));
                    case 9:
                        return new xpi.c(aVar8.f304637b, bq.i.b(aVar8.f304636a));
                    case 10:
                        u3l.e eVar = (u3l.e) cVar3.k.get();
                        aVar8.getClass();
                        u3l.d.Companion.getClass();
                        h0 h0Var = h0.f322473a;
                        vc.s.k(h0Var);
                        cVar = new com.revolut.retail.retail_snackbar.mediator.a(eVar, ImmutableSet.copyOf((Collection) h0Var), (t3l.d) aVar8.o.get(), new qm.e((um.c) cVar3.f288314l.get()));
                        break;
                    case 11:
                        return new t3l.h(bq.i.b(aVar8.f304636a), bq.i.g(aVar8.f304636a));
                    case 12:
                        aVar8.getClass();
                        cVar = new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) cVar3.f288315m.get(), (k3l.b) aVar8.f304646q.get(), new qm.e((um.c) cVar3.f288314l.get()));
                        break;
                    case 13:
                        return new k3l.d(bq.i.b(aVar8.f304636a));
                    case 14:
                        return new nee.j((nee.c) cVar3.f288316n.get(), bq.i.l(aVar8.f304636a), bq.i.e(aVar8.f304636a), (xpi.g) aVar8.f304644n.get(), aVar8.f304638c);
                    case 15:
                        opi.d dVar5 = (opi.d) aVar8.f304643m.get();
                        nee.c cVar4 = (nee.c) cVar3.f288316n.get();
                        oee.m mVar = (oee.m) aVar8.u.get();
                        oee.h hVar = new oee.h();
                        vee.c cVar5 = aVar8.d;
                        l80.e eVarH = cVar5.f288309b.h();
                        vc.s.j(eVarH);
                        gte.a aVarB = cVar5.f288312h.b();
                        vc.s.j(aVarB);
                        oee.c cVar6 = new oee.c(aVarB, eVarH);
                        l80.e eVarH2 = cVar5.f288309b.h();
                        vc.s.j(eVarH2);
                        ha3.o oVar3 = (ha3.o) cVar5.f288310c.G.get();
                        vc.s.j(oVar3);
                        nee.g gVar = new nee.g(cVar6, new oee.g(eVarH2, oVar3));
                        l80.e eVarH3 = cVar3.f288309b.h();
                        vc.s.j(eVarH3);
                        f9b.f fVar2 = (f9b.f) aVar8.v.get();
                        tpi.j jVar = (tpi.j) aVar8.f304640h.get();
                        k3l.b bVar = (k3l.b) aVar8.f304646q.get();
                        uce.c cVar7 = aVar8.f304638c;
                        az2.b bVarA3 = cVar3.e.a();
                        vc.s.j(bVarA3);
                        cVar = new v(dVar5, cVar4, mVar, hVar, gVar, eVarH3, fVar2, jVar, bVar, cVar7, bVarA3);
                        break;
                    case 16:
                        nee.d dVar6 = (nee.d) aVar8.f304649t.get();
                        l93.f fVarJ = cVar3.f288310c.j();
                        vc.s.j(fVarJ);
                        fk3.a aVarA = cVar3.d.a();
                        vc.s.j(aVarA);
                        uz2.b bVar2 = (uz2.b) cVar3.e.f275756j.get();
                        vc.s.j(bVar2);
                        l93.e eVar2 = (l93.e) cVar3.f288310c.I.get();
                        vc.s.j(eVar2);
                        return new oee.m(dVar6, fVarJ, aVarA, bVar2, eVar2, cVar3.f.e(), cVar3.f288311g.a());
                    case 17:
                        pee.b.Companion.getClass();
                        return new nee.d();
                    case 18:
                        return bq.i.t(aVar8.f304636a);
                    default:
                        throw new AssertionError(i6);
                }
                return cVar;
            case 5:
                xf6.f fVar3 = (xf6.f) this.d;
                xf6.e eVar3 = (xf6.e) this.f303947b;
                int i21 = this.f303948c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new pn6.m();
                    }
                    throw new AssertionError(i21);
                }
                cli.n nVar3 = (cli.n) fVar3.f304842b.get();
                pn6.g gVar2 = fVar3.f304841a;
                eg6.a aVar9 = (eg6.a) ((xf6.t) eVar3.f304827a).i0.get();
                vc.s.j(aVar9);
                sf0.h hVarB = eVar3.f304828b.b();
                vc.s.j(hVarB);
                v60.e eVarA = eVar3.f304829c.a();
                vc.s.j(eVarA);
                return new pn6.l(nVar3, gVar2, aVar9, hVarB, eVarA);
            case 6:
                xf6.p pVar7 = (xf6.p) this.d;
                int i22 = this.f303948c;
                if (i22 == 0) {
                    return new sj6.f((cli.n) pVar7.f304982b.get(), pVar7.f304981a, new os2.g((of6.e) ((xf6.t) this.f303947b).E0.get()));
                }
                if (i22 == 1) {
                    return new sj6.g();
                }
                throw new AssertionError(i22);
            case 7:
                w wVar = (w) this.d;
                xf6.t tVar = (xf6.t) this.f303947b;
                int i32 = this.f303948c;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new gn6.l((je6.h) tVar.f305064e0.get());
                    }
                    throw new AssertionError(i32);
                }
                oe6.a aVarA2 = tVar.k.a();
                vc.s.j(aVarA2);
                return new gn6.j(aVarA2, (cli.n) wVar.f305126b.get(), wVar.f305125a);
            case 8:
                xf6.t tVar2 = (xf6.t) this.f303947b;
                int i33 = this.f303948c;
                if (i33 == 0) {
                    c0 c0Var = (c0) this.d;
                    return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a(c0Var.f304804a, (cli.n) c0Var.f304805b.get(), (xg6.r) tVar2.P0.get());
                }
                if (i33 == 1) {
                    return new wl6.i((je6.h) tVar2.f305064e0.get());
                }
                throw new AssertionError(i33);
            case 9:
                xf6.t tVar3 = (xf6.t) this.f303947b;
                int i43 = this.f303948c;
                if (i43 == 0) {
                    return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.a((cli.n) ((e0) this.d).f304830a.get(), (xg6.r) tVar3.P0.get());
                }
                if (i43 == 1) {
                    return new yl6.h((je6.h) tVar3.f305064e0.get());
                }
                throw new AssertionError(i43);
            case 10:
                xf6.h0 h0Var2 = (xf6.h0) this.d;
                PennyTopUpFlowContract$InputData pennyTopUpFlowContract$InputData = h0Var2.f304870a;
                xf6.t tVar4 = (xf6.t) this.f303947b;
                n1 n1Var = tVar4.k;
                int i59 = this.f303948c;
                if (i59 == 0) {
                    oe6.a aVarA3 = n1Var.a();
                    vc.s.j(aVarA3);
                    return new mn6.j(aVarA3, new nn6.a(), new i90.b(), pennyTopUpFlowContract$InputData);
                }
                if (i59 != 1) {
                    throw new AssertionError(i59);
                }
                xf6.t tVar5 = h0Var2.f304871b;
                r10.a aVar10 = new r10.a(tVar5.f305081t.e(), ((c21.b) tVar5.e).a());
                mn6.a aVar11 = (mn6.a) h0Var2.d.get();
                sf0.h hVarB2 = tVar4.f305076q.b();
                vc.s.j(hVarB2);
                v60.e eVarA2 = tVar4.f305084w.a();
                vc.s.j(eVarA2);
                d0 d0Var = (d0) tVar4.f0.get();
                oe6.a aVarA4 = n1Var.a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d(pennyTopUpFlowContract$InputData, aVar10, aVar11, hVarB2, eVarA2, d0Var, aVarA4);
            case 11:
                t0 t0Var = (t0) this.d;
                BranchesScreenContract$InputData branchesScreenContract$InputData = t0Var.f305090b;
                int i66 = this.f303948c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new kxk.o(branchesScreenContract$InputData, new an6.b((je6.h) t0Var.f305091c.f305064e0.get()));
                    }
                    throw new AssertionError(i66);
                }
                cli.n nVar4 = (cli.n) t0Var.d.get();
                oe6.a aVarA5 = ((xf6.t) this.f303947b).k.a();
                vc.s.j(aVarA5);
                return new rn6.i(nVar4, branchesScreenContract$InputData, aVarA5);
            case 12:
                t0 t0Var2 = (t0) this.d;
                BranchesScreenContract$InputData branchesScreenContract$InputData2 = t0Var2.f305090b;
                int i74 = this.f303948c;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new kxk.o(branchesScreenContract$InputData2, new an6.b((je6.h) t0Var2.f305091c.f305064e0.get()));
                    }
                    throw new AssertionError(i74);
                }
                cli.n nVar5 = (cli.n) t0Var2.d.get();
                oe6.a aVarA6 = ((xf6.t) this.f303947b).k.a();
                vc.s.j(aVarA6);
                return new rn6.i(nVar5, branchesScreenContract$InputData2, aVarA6);
            case 13:
                t0 t0Var3 = (t0) this.d;
                BranchesScreenContract$InputData branchesScreenContract$InputData3 = t0Var3.f305090b;
                int i92 = this.f303948c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new kxk.o(branchesScreenContract$InputData3, new an6.b((je6.h) t0Var3.f305091c.f305064e0.get()));
                    }
                    throw new AssertionError(i92);
                }
                cli.n nVar6 = (cli.n) t0Var3.d.get();
                oe6.a aVarA7 = ((xf6.t) this.f303947b).k.a();
                vc.s.j(aVarA7);
                return new rn6.i(nVar6, branchesScreenContract$InputData3, aVarA7);
            case 14:
                v0 v0Var = (v0) this.d;
                int i96 = this.f303948c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new tn6.m(v0Var.f305116b, new bn6.a());
                    }
                    throw new AssertionError(i96);
                }
                cli.n nVar7 = (cli.n) v0Var.f305117c.get();
                l61.a aVarB2 = ((xf6.t) this.f303947b).f305081t.b();
                vc.s.j(aVarB2);
                return new tn6.l(nVar7, aVarB2);
            case 15:
                v0 v0Var2 = (v0) this.d;
                int i99 = this.f303948c;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new tn6.m(v0Var2.f305116b, new bn6.a());
                    }
                    throw new AssertionError(i99);
                }
                cli.n nVar8 = (cli.n) v0Var2.f305117c.get();
                l61.a aVarB3 = ((xf6.t) this.f303947b).f305081t.b();
                vc.s.j(aVarB3);
                return new tn6.l(nVar8, aVarB3);
            case 16:
                v0 v0Var3 = (v0) this.d;
                int i100 = this.f303948c;
                if (i100 != 0) {
                    if (i100 == 1) {
                        return new tn6.m(v0Var3.f305116b, new bn6.a());
                    }
                    throw new AssertionError(i100);
                }
                cli.n nVar9 = (cli.n) v0Var3.f305117c.get();
                l61.a aVarB4 = ((xf6.t) this.f303947b).f305081t.b();
                vc.s.j(aVarB4);
                return new tn6.l(nVar9, aVarB4);
            case 17:
                xf6.t tVar6 = (xf6.t) this.f303947b;
                z0 z0Var = (z0) this.d;
                xn6.f fVar4 = z0Var.f305186b;
                int i101 = this.f303948c;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new xn6.p(fVar4, new en6.l((je6.h) z0Var.f305187c.f305064e0.get(), new fl6.b()));
                    }
                    throw new AssertionError(i101);
                }
                xoj.a aVarA8 = tVar6.f305072n.a();
                vc.s.j(aVarA8);
                oe6.a aVarA9 = tVar6.k.a();
                vc.s.j(aVarA9);
                return new xn6.o(fVar4, aVarA8, aVarA9, (cli.n) z0Var.d.get());
            case 18:
                xf6.t tVar7 = (xf6.t) this.f303947b;
                z0 z0Var2 = (z0) this.d;
                xn6.f fVar5 = z0Var2.f305186b;
                int i102 = this.f303948c;
                if (i102 != 0) {
                    if (i102 == 1) {
                        return new xn6.p(fVar5, new en6.l((je6.h) z0Var2.f305187c.f305064e0.get(), new fl6.b()));
                    }
                    throw new AssertionError(i102);
                }
                xoj.a aVarA10 = tVar7.f305072n.a();
                vc.s.j(aVarA10);
                oe6.a aVarA11 = tVar7.k.a();
                vc.s.j(aVarA11);
                return new xn6.o(fVar5, aVarA10, aVarA11, (cli.n) z0Var2.d.get());
            case 19:
                xf6.t tVar8 = (xf6.t) this.f303947b;
                z0 z0Var3 = (z0) this.d;
                xn6.f fVar6 = z0Var3.f305186b;
                int i103 = this.f303948c;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new xn6.p(fVar6, new en6.l((je6.h) z0Var3.f305187c.f305064e0.get(), new fl6.b()));
                    }
                    throw new AssertionError(i103);
                }
                xoj.a aVarA12 = tVar8.f305072n.a();
                vc.s.j(aVarA12);
                oe6.a aVarA13 = tVar8.k.a();
                vc.s.j(aVarA13);
                return new xn6.o(fVar6, aVarA12, aVarA13, (cli.n) z0Var3.d.get());
            case 20:
                c1 c1Var = (c1) this.d;
                xf6.t tVar9 = (xf6.t) this.f303947b;
                int i104 = this.f303948c;
                if (i104 == 0) {
                    return new com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c((cli.n) c1Var.f304809c.get(), c1Var.f304808b, (xg6.l) tVar9.f305073n0.get(), (xg6.a) tVar9.J0.get(), (bh6.j) tVar9.K0.get());
                }
                if (i104 == 1) {
                    return new zn6.n();
                }
                throw new AssertionError(i104);
            case 21:
                c1 c1Var2 = (c1) this.d;
                xf6.t tVar10 = (xf6.t) this.f303947b;
                int i105 = this.f303948c;
                if (i105 == 0) {
                    return new com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c((cli.n) c1Var2.f304809c.get(), c1Var2.f304808b, (xg6.l) tVar10.f305073n0.get(), (xg6.a) tVar10.J0.get(), (bh6.j) tVar10.K0.get());
                }
                if (i105 == 1) {
                    return new zn6.n();
                }
                throw new AssertionError(i105);
            case 22:
                xf6.g1 g1Var = (xf6.g1) this.d;
                xf6.t tVar11 = (xf6.t) this.f303947b;
                int i106 = this.f303948c;
                if (i106 != 0) {
                    if (i106 == 1) {
                        return new fo6.s((je6.h) tVar11.f305064e0.get());
                    }
                    throw new AssertionError(i106);
                }
                cli.n nVar10 = (cli.n) g1Var.f304861c.get();
                fo6.j jVar2 = g1Var.f304860b;
                fg6.d dVarA = tVar11.f305086x.a();
                vc.s.j(dVarA);
                return new fo6.p(nVar10, jVar2, dVarA);
            case 23:
                xf6.g1 g1Var2 = (xf6.g1) this.d;
                xf6.t tVar12 = (xf6.t) this.f303947b;
                int i107 = this.f303948c;
                if (i107 != 0) {
                    if (i107 == 1) {
                        return new fo6.s((je6.h) tVar12.f305064e0.get());
                    }
                    throw new AssertionError(i107);
                }
                cli.n nVar11 = (cli.n) g1Var2.f304861c.get();
                fo6.j jVar3 = g1Var2.f304860b;
                fg6.d dVarA2 = tVar12.f305086x.a();
                vc.s.j(dVarA2);
                return new fo6.p(nVar11, jVar3, dVarA2);
            case 24:
                i1 i1Var = (i1) this.d;
                int i108 = this.f303948c;
                if (i108 != 0) {
                    if (i108 == 1) {
                        return new ho6.q();
                    }
                    throw new AssertionError(i108);
                }
                cli.n nVar12 = (cli.n) i1Var.f304888c.get();
                ho6.i iVar = i1Var.f304887b;
                fg6.d dVarA3 = ((xf6.t) this.f303947b).f305086x.a();
                vc.s.j(dVarA3);
                return new ho6.p(nVar12, iVar, dVarA3);
            case 25:
                i1 i1Var2 = (i1) this.d;
                int i109 = this.f303948c;
                if (i109 != 0) {
                    if (i109 == 1) {
                        return new ho6.q();
                    }
                    throw new AssertionError(i109);
                }
                cli.n nVar13 = (cli.n) i1Var2.f304888c.get();
                ho6.i iVar2 = i1Var2.f304887b;
                fg6.d dVarA4 = ((xf6.t) this.f303947b).f305086x.a();
                vc.s.j(dVarA4);
                return new ho6.p(nVar13, iVar2, dVarA4);
            case 26:
                xf6.t tVar13 = (xf6.t) this.f303947b;
                k1 k1Var = (k1) this.d;
                xf6.t tVar14 = k1Var.f304915c;
                int i110 = this.f303948c;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new AssertionError(i110);
                    }
                    je6.h hVar2 = (je6.h) tVar13.f305064e0.get();
                    fl6.b bVar3 = new fl6.b();
                    gte.a aVarB5 = tVar13.o.b();
                    vc.s.j(aVarB5);
                    return new jo6.u(hVar2, bVar3, aVarB5);
                }
                cli.n nVar14 = (cli.n) k1Var.d.get();
                jo6.l lVar3 = k1Var.f304914b;
                fg6.d dVarA5 = tVar13.f305086x.a();
                vc.s.j(dVarA5);
                q8b.a aVar12 = tVar14.f305088y;
                n8b.a aVarA14 = aVar12.a();
                vc.s.j(aVarA14);
                n8b.b bVarB = aVar12.b();
                vc.s.j(bVarB);
                qd0.b bVarN = tVar14.f305066h.n();
                vc.s.j(bVarN);
                jo6.b bVar4 = new jo6.b(aVarA14, bVarB, bVarN);
                gte.a aVarB6 = tVar14.o.b();
                vc.s.j(aVarB6);
                return new com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b(nVar14, lVar3, dVarA5, bVar4, new fg6.b(tVar14.f305081t.e(), aVarB6));
            case 27:
                xf6.t tVar15 = (xf6.t) this.f303947b;
                k1 k1Var2 = (k1) this.d;
                xf6.t tVar16 = k1Var2.f304915c;
                int i111 = this.f303948c;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new AssertionError(i111);
                    }
                    je6.h hVar3 = (je6.h) tVar15.f305064e0.get();
                    fl6.b bVar5 = new fl6.b();
                    gte.a aVarB7 = tVar15.o.b();
                    vc.s.j(aVarB7);
                    return new jo6.u(hVar3, bVar5, aVarB7);
                }
                cli.n nVar15 = (cli.n) k1Var2.d.get();
                jo6.l lVar4 = k1Var2.f304914b;
                fg6.d dVarA6 = tVar15.f305086x.a();
                vc.s.j(dVarA6);
                q8b.a aVar13 = tVar16.f305088y;
                n8b.a aVarA15 = aVar13.a();
                vc.s.j(aVarA15);
                n8b.b bVarB2 = aVar13.b();
                vc.s.j(bVarB2);
                qd0.b bVarN2 = tVar16.f305066h.n();
                vc.s.j(bVarN2);
                jo6.b bVar6 = new jo6.b(aVarA15, bVarB2, bVarN2);
                gte.a aVarB8 = tVar16.o.b();
                vc.s.j(aVarB8);
                return new com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b(nVar15, lVar4, dVarA6, bVar6, new fg6.b(tVar16.f305081t.e(), aVarB8));
            case 28:
                n1 n1Var2 = (n1) this.f303947b;
                m1 m1Var = (m1) this.d;
                int i112 = this.f303948c;
                if (i112 == 0) {
                    cli.n nVar16 = (cli.n) m1Var.d.get();
                    cm6.e eVar4 = m1Var.f304949b;
                    oe6.a aVar14 = (oe6.a) n1Var2.f304964j.get();
                    wj0.a aVarI = ((nj0.d) n1Var2.e).i();
                    vc.s.j(aVarI);
                    return new cm6.i(nVar16, eVar4, aVar14, aVarI);
                }
                if (i112 == 1) {
                    c90.c uiResources = (c90.c) m1Var.f304950c.get();
                    Intrinsics.checkNotNullParameter(uiResources, "uiResources");
                    return new at.r();
                }
                if (i112 != 2) {
                    throw new AssertionError(i112);
                }
                ViewController controller2 = m1Var.f304948a;
                dm6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new c90.c(controller2.m2());
            default:
                y1 y1Var = (y1) this.f303947b;
                s1 s1Var = (s1) this.d;
                int i113 = this.f303948c;
                switch (i113) {
                    case 0:
                        return kxa.j.k((j60.a) s1Var.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) s1Var.f305047b.get(), (rp0.m) s1Var.f305048c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        cli.n nVar17 = (cli.n) s1Var.f.get();
                        CreateMandateScreenContract$InputData createMandateScreenContract$InputData = s1Var.f305046a;
                        x xVarA = y1Var.f305171a.a();
                        vc.s.j(xVarA);
                        ch6.o oVar4 = (ch6.o) s1Var.f305049g.get();
                        bh6.a aVar15 = (bh6.a) y1Var.f305177l.get();
                        bh6.j jVar4 = (bh6.j) y1Var.f305178m.get();
                        oe6.a aVarA16 = y1Var.e.a();
                        vc.s.j(aVarA16);
                        fk3.a aVarA17 = y1Var.f.a();
                        vc.s.j(aVarA17);
                        j60.a aVar16 = (j60.a) s1Var.d.get();
                        ch6.a aVar17 = (ch6.a) s1Var.f305050h.get();
                        wj0.a aVarI2 = ((nj0.d) y1Var.f305174g).i();
                        vc.s.j(aVarI2);
                        return new com.revolut.feature.external_accounts.impl.mandate.create_mandate.b(nVar17, createMandateScreenContract$InputData, xVarA, oVar4, aVar15, jVar4, aVarA16, aVarA17, aVar16, aVar17, aVarI2);
                    case 4:
                        return new com.revolut.feature.external_accounts.impl.mandate.create_mandate.c((bh6.c) y1Var.f305176j.get(), (bh6.h) y1Var.k.get());
                    case 5:
                        return new ch6.p();
                    case 6:
                        return new ch6.b();
                    default:
                        throw new AssertionError(i113);
                }
        }
    }
}
