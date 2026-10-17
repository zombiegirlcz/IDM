package us6;

import com.revolut.feature.freelancer.api.ui.controller.contract.FreelancerCashbackUpsellContract$InputData;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.prompt.post_activation.ProPostActivationScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f282721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f282722c;
    public final Object d;

    public /* synthetic */ q0(Object obj2, Object obj3, int i, int i2) {
        this.f282720a = i2;
        this.f282721b = obj2;
        this.d = obj3;
        this.f282722c = i;
    }

    private final Object a() {
        g2 g2Var = (g2) this.f282721b;
        q qVar = g2Var.f282552a;
        l2 l2Var = (l2) this.d;
        int i = this.f282722c;
        if (i == 0) {
            return kxa.j.k((j60.a) l2Var.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) l2Var.f282620c.get(), (rp0.m) l2Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        qx6.a aVar = new qx6.a();
        j60.a aVar2 = (j60.a) l2Var.e.get();
        l80.e eVarH = g2Var.f282554c.h();
        vc.s.j(eVarH);
        et6.b1 b1Var = (et6.b1) qVar.f282682h0.get();
        vc.s.j(b1Var);
        et6.p1 p1VarO = qVar.o();
        vc.s.j(p1VarO);
        InvoiceDetailsScreenContract$InputData invoiceDetailsScreenContract$InputData = l2Var.f282618a;
        zjh.i iVarA = g2Var.e.a();
        xy6.c cVar = new xy6.c(new tx6.f(), new tx6.b(new tx6.f()));
        g2 g2Var2 = l2Var.f282619b;
        l80.e eVarH2 = g2Var2.f282554c.h();
        vc.s.j(eVarH2);
        qx6.c cVar2 = new qx6.c(eVarH2);
        jr6.n nVar = (jr6.n) g2Var2.f282552a.z0.get();
        vc.s.j(nVar);
        return new com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a(aVar, aVar2, eVarH, b1Var, p1VarO, invoiceDetailsScreenContract$InputData, iVarA, cVar, new qx6.e(cVar2, nVar, new tx6.b(new tx6.f()), new ct6.c(), new qy6.b()));
    }

    private final Object b() {
        g2 g2Var = (g2) this.f282721b;
        o2 o2Var = (o2) this.d;
        int i = this.f282722c;
        switch (i) {
            case 0:
                et6.p1 p1VarO = g2Var.f282552a.o();
                vc.s.j(p1VarO);
                et6.h3 h3Var = (et6.h3) g2Var.f282552a.f282677e1.get();
                vc.s.j(h3Var);
                return new com.revolut.feature.freelancer.impl.ui.invoice.list.a(p1VarO, h3Var, o2Var.f282646a, (cli.n) o2Var.f282652l.get());
            case 1:
                x17.f fVar = (x17.f) o2Var.f282651j.get();
                u17.l lVar = new u17.l();
                u17.n nVar = new u17.n((t17.m) o2Var.k.get());
                u17.m mVar = new u17.m((t17.m) o2Var.k.get());
                u17.o oVar = new u17.o((t17.m) o2Var.k.get());
                u17.f fVar2 = new u17.f();
                u17.i iVar = new u17.i((t17.m) o2Var.k.get());
                t70.b bVarG = o2Var.f282647b.f282554c.g();
                vc.s.j(bVarG);
                u17.k kVar = new u17.k(lVar, nVar, mVar, oVar, fVar2, iVar, new u17.h(bVarG));
                jr6.n nVar2 = (jr6.n) g2Var.f282552a.z0.get();
                vc.s.j(nVar2);
                return new rx6.u(fVar, kVar, nVar2);
            case 2:
                return new x17.f((x17.k) o2Var.f282648c.get(), (x17.g) o2Var.d.get(), (x17.l) o2Var.e.get(), (x17.e) o2Var.f.get(), (x17.c) o2Var.f282649g.get(), (x17.h) o2Var.f282650h.get(), (x17.d) o2Var.i.get());
            case 3:
                jr6.u saleStateMapper = (jr6.u) g2Var.f282552a.f282704s0.get();
                vc.s.j(saleStateMapper);
                Intrinsics.checkNotNullParameter(saleStateMapper, "saleStateMapper");
                return new x17.k();
            case 4:
                return new x17.g();
            case 5:
                return new x17.l();
            case 6:
                return new x17.e(g2Var.f282552a.b());
            case 7:
                w80.b bVarJ = g2Var.f282554c.j();
                vc.s.j(bVarJ);
                return new x17.c(bVarJ);
            case 8:
                return new x17.h();
            case 9:
                return new x17.d();
            case 10:
                return new t17.o();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object kVar;
        switch (this.f282720a) {
            case 0:
                q qVar = (q) this.f282721b;
                r0 r0Var = (r0) this.d;
                int i = this.f282722c;
                switch (i) {
                    case 0:
                        return kxa.j.l((j60.a) r0Var.f282731c.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) r0Var.f282729a.get(), (rp0.m) r0Var.f282730b.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension = (kda.b) r0Var.e.get();
                        f07.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        vc.s.k(nVar);
                        return nVar;
                    case 4:
                        j60.a bottomDialogControllerExtension = (j60.a) r0Var.f282731c.get();
                        ct6.n factory = (ct6.n) qVar.f282698p1.get();
                        f07.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(bottomDialogControllerExtension);
                    case 5:
                        kda.b bVar = (kda.b) r0Var.e.get();
                        j60.a aVar = (j60.a) r0Var.f282731c.get();
                        xa1.a aVar2 = (xa1.a) qVar.B.f194851j.get();
                        vc.s.j(aVar2);
                        return new e07.j(bVar, aVar, aVar2, (et6.h1) qVar.c0.get(), (gr6.j) qVar.W0.get(), (et6.h3) qVar.f282677e1.get(), qVar.f282712w.d(), (jki.p) r0Var.f282732g.get());
                    case 6:
                        ma1.o oVar = (ma1.o) qVar.C.S.get();
                        vc.s.j(oVar);
                        gr6.e eVarA = qVar.f282692n.a();
                        vc.s.j(eVarA);
                        return new e07.l(oVar, eVarA);
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                q qVar2 = (q) this.f282721b;
                t0 t0Var = (t0) this.d;
                int i2 = this.f282722c;
                if (i2 == 0) {
                    return new l27.i(t0Var.f282754a, qVar2.f282691m.d(), (c90.c) t0Var.d.get(), qVar2.f282699q.e(), new l27.k((ft6.i) t0Var.f282756c.P0.get()));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                ViewController controller = t0Var.f282755b;
                m27.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new c90.c(controller.m2());
            case 2:
                int i3 = this.f282722c;
                if (i3 == 0) {
                    return new j17.g((gr6.j) ((q) this.f282721b).W0.get(), (jki.p) ((u0) this.d).f282763a.get());
                }
                if (i3 == 1) {
                    return new j17.h();
                }
                throw new AssertionError(i3);
            case 3:
                q qVar3 = (q) this.f282721b;
                z0 z0Var = (z0) this.d;
                int i5 = this.f282722c;
                if (i5 == 0) {
                    gr6.i iVarA = qVar3.f282689l.a();
                    vc.s.j(iVarA);
                    r10.v vVarG = qVar3.g();
                    FreelancerSalesFiltersScreenContract$InputData freelancerSalesFiltersScreenContract$InputData = z0Var.f282820a;
                    jf1.a aVarA = qVar3.f282717y.a();
                    vc.s.j(aVarA);
                    return new v17.r(iVarA, vVarG, freelancerSalesFiltersScreenContract$InputData, aVarA, (jki.p) z0Var.f.get());
                }
                if (i5 == 1) {
                    return new v17.t((t17.j) z0Var.d.get(), (t17.m) z0Var.e.get());
                }
                if (i5 == 2) {
                    t17.d dVar = new t17.d(new t17.p(), new t17.e());
                    t17.h hVar = new t17.h(new t17.e());
                    t17.c cVar = new t17.c((rx0.i) z0Var.f282822c.get());
                    t70.b bVarG = z0Var.f282821b.f282691m.g();
                    vc.s.j(bVarG);
                    return new t17.k(dVar, hVar, cVar, new t17.g(bVarG, new t17.p()));
                }
                if (i5 != 3) {
                    if (i5 == 4) {
                        return new t17.o();
                    }
                    throw new AssertionError(i5);
                }
                qd0.b languageProvider = qVar3.f282691m.n();
                vc.s.j(languageProvider);
                w17.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return new rx0.i(2, ((s80.b) languageProvider).b());
            case 4:
                q qVar4 = (q) this.f282721b;
                int i6 = this.f282722c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new w07.o();
                    }
                    throw new AssertionError(i6);
                }
                e1 e1Var = (e1) this.d;
                FreelancerTermsScreenContract$InputData freelancerTermsScreenContract$InputData = e1Var.f282503a;
                cli.n nVar2 = (cli.n) e1Var.f282504b.get();
                gr6.r rVar = (gr6.r) qVar4.f282690l1.get();
                mre.c cVarB = qVar4.z.b();
                vc.s.j(cVarB);
                return new w07.n(freelancerTermsScreenContract$InputData, nVar2, rVar, cVarB);
            case 5:
                g1 g1Var = (g1) this.d;
                q qVar5 = (q) this.f282721b;
                int i21 = this.f282722c;
                if (i21 == 0) {
                    et6.h1 h1Var = (et6.h1) qVar5.c0.get();
                    jr6.r rVar2 = (jr6.r) qVar5.X0.get();
                    jvh.a aVarA2 = qVar5.M.a();
                    vc.s.j(aVarA2);
                    gte.a aVarB = qVar5.D.b();
                    vc.s.j(aVarB);
                    return new com.revolut.feature.freelancer.impl.ui.profile.website.flow.d(h1Var, rVar2, aVarA2, aVarB, g1Var.f282549a);
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return new com.revolut.feature.freelancer.impl.ui.onboarding.validation.a((et6.y1) qVar5.f282701r0.get());
                    }
                    throw new AssertionError(i21);
                }
                et6.k3 k3Var = (et6.k3) qVar5.f282688k1.get();
                wj0.a aVarI = ((nj0.d) qVar5.K).i();
                vc.s.j(aVarI);
                return new e17.j(k3Var, aVarI, (sz6.a) g1Var.e.get());
            case 6:
                i1 i1Var = (i1) this.d;
                q qVar6 = i1Var.f282576b;
                q qVar7 = (q) this.f282721b;
                l70.e eVar = qVar7.f282691m;
                zc6.b bVar2 = qVar7.J;
                int i22 = this.f282722c;
                if (i22 == 0) {
                    fd6.a aVar3 = (fd6.a) i1Var.d.get();
                    va.g.t(aVar3);
                    return aVar3;
                }
                if (i22 == 1) {
                    return va.g.s(((zc6.a) bVar2).d(), (xc6.a) i1Var.f282577c.get());
                }
                if (i22 == 2) {
                    return r6.b.k((zc6.a) bVar2, "factory");
                }
                if (i22 == 3) {
                    return va.g.u((xc6.a) i1Var.f282577c.get());
                }
                if (i22 != 4) {
                    if (i22 != 5) {
                        throw new AssertionError(i22);
                    }
                    com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) i1Var.f282578g.get();
                    e27.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    return rp0.x0.a(rp0.g1.Companion, controller2.D2());
                }
                w80.b bVarB = i1Var.b();
                l80.e eVarH = eVar.h();
                vc.s.j(eVarH);
                c70.a aVarZ = eVar.z();
                vc.s.j(aVarZ);
                gr6.i iVarA2 = qVar7.f282689l.a();
                vc.s.j(iVarA2);
                et6.h1 h1Var2 = (et6.h1) qVar7.c0.get();
                nd1.c cVar2 = (nd1.c) qVar6.f282697p.f193960j.get();
                vc.s.j(cVar2);
                bd1.a aVarA3 = qVar6.f282679g.a();
                vc.s.j(aVarA3);
                zq.a aVar4 = new zq.a(cVar2, aVarA3);
                OrderInitPageCreateScreenContract$InputData orderInitPageCreateScreenContract$InputData = i1Var.f282575a;
                i4b.f fVarB = ((zc6.a) bVar2).b();
                ed1.a aVar5 = (ed1.a) qVar7.f282697p.f193958g.get();
                vc.s.j(aVar5);
                f27.c cVar3 = new f27.c((ft6.i) qVar6.P0.get(), qVar6.o.g());
                bbd.b bVar3 = (bbd.b) qVar7.f282700r.f133542l.get();
                vc.s.j(bVar3);
                return new com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a(bVarB, eVarH, aVarZ, iVarA2, h1Var2, aVar4, orderInitPageCreateScreenContract$InputData, fVarB, aVar5, cVar3, bVar3, qVar7.o.e(), (rp0.g1) i1Var.f282579h.get(), qVar7.f282699q.e(), qVar7.f282667a.b(), new d27.p0(i1Var.b(), new xv6.a(), ((zc6.a) qVar6.J).c(), new u80.o()));
            case 7:
                j1 j1Var = (j1) this.d;
                q qVar8 = (q) this.f282721b;
                l70.e eVar2 = qVar8.f282691m;
                int i32 = this.f282722c;
                if (i32 != 0) {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            return new g27.y(q.a(), new ct6.c(), new g27.a0(), (jr6.t) qVar8.A0.get());
                        }
                        throw new AssertionError(i32);
                    }
                    com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) j1Var.f282591c.get();
                    h27.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller3, "controller");
                    return rp0.x0.a(rp0.g1.Companion, controller3.D2());
                }
                b9k.f fVarC = qVar8.c();
                bbd.b bVar4 = (bbd.b) qVar8.f282700r.f133542l.get();
                vc.s.j(bVar4);
                hr6.l lVar = (hr6.l) qVar8.M0.get();
                ang.f fVarE = qVar8.f282699q.e();
                l17.a aVar6 = new l17.a(j1Var.f282590b.o.g());
                tqi.g gVarE = qVar8.o.e();
                OrderInitPageDetailsScreenContract$InputData orderInitPageDetailsScreenContract$InputData = j1Var.f282589a;
                s70.a aVarM = eVar2.m();
                vc.s.j(aVarM);
                c70.a aVarZ2 = eVar2.z();
                vc.s.j(aVarZ2);
                rp0.g1 g1Var2 = (rp0.g1) j1Var.d.get();
                f80.a aVarX = eVar2.x();
                vc.s.j(aVarX);
                return new g27.t(fVarC, bVar4, lVar, fVarE, aVar6, gVarE, orderInitPageDetailsScreenContract$InputData, aVarM, aVarZ2, g1Var2, aVarX, (cli.n) j1Var.e.get());
            case 8:
                q qVar9 = (q) this.f282721b;
                int i33 = this.f282722c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new j27.n(q.a(), (jr6.t) qVar9.A0.get());
                    }
                    throw new AssertionError(i33);
                }
                b9k.f fVarC2 = qVar9.c();
                hr6.l lVar2 = (hr6.l) qVar9.M0.get();
                k1 k1Var = (k1) this.d;
                return new j27.j(fVarC2, lVar2, k1Var.f282600a, (cli.n) k1Var.f282601b.get());
            case 9:
                q qVar10 = (q) this.f282721b;
                l1 l1Var = (l1) this.d;
                int i43 = this.f282722c;
                switch (i43) {
                    case 0:
                        tzl.l lVar3 = (tzl.l) qVar10.f282700r.f133543m.get();
                        vc.s.j(lVar3);
                        gr6.e eVarA2 = qVar10.f282692n.a();
                        vc.s.j(eVarA2);
                        return new com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b(lVar3, eVarA2, (cli.n) l1Var.k.get());
                    case 1:
                        u17.l lVar4 = new u17.l();
                        u17.n nVar3 = new u17.n((t17.m) l1Var.f282612b.get());
                        u17.m mVar = new u17.m((t17.m) l1Var.f282612b.get());
                        u17.o oVar2 = new u17.o((t17.m) l1Var.f282612b.get());
                        u17.f fVar = new u17.f();
                        u17.i iVar = new u17.i((t17.m) l1Var.f282612b.get());
                        t70.b bVarG2 = l1Var.f282611a.f282691m.g();
                        vc.s.j(bVarG2);
                        return new i27.o(new u17.k(lVar4, nVar3, mVar, oVar2, fVar, iVar, new u17.h(bVarG2)), (x17.f) l1Var.f282616j.get());
                    case 2:
                        return new t17.o();
                    case 3:
                        return new x17.f((x17.k) l1Var.f282613c.get(), (x17.g) l1Var.d.get(), (x17.l) l1Var.e.get(), (x17.e) l1Var.f.get(), (x17.c) l1Var.f282614g.get(), (x17.h) l1Var.f282615h.get(), (x17.d) l1Var.i.get());
                    case 4:
                        jr6.u saleStateMapper = (jr6.u) qVar10.f282704s0.get();
                        Intrinsics.checkNotNullParameter(saleStateMapper, "saleStateMapper");
                        kVar = new x17.k();
                        break;
                    case 5:
                        return new x17.g();
                    case 6:
                        return new x17.l();
                    case 7:
                        kVar = new x17.e(qVar10.b());
                        break;
                    case 8:
                        w80.b bVarJ = qVar10.f282691m.j();
                        vc.s.j(bVarJ);
                        kVar = new x17.c(bVarJ);
                        break;
                    case 9:
                        return new x17.h();
                    case 10:
                        return new x17.d();
                    default:
                        throw new AssertionError(i43);
                }
                return kVar;
            case 10:
                m1 m1Var = (m1) this.d;
                q qVar11 = (q) this.f282721b;
                int i59 = this.f282722c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new g17.j();
                    }
                    throw new AssertionError(i59);
                }
                l93.b bVarG3 = qVar11.F.g();
                vc.s.j(bVarG3);
                gr6.h hVar2 = (gr6.h) qVar11.f282670b0.get();
                hr6.l lVar5 = (hr6.l) qVar11.M0.get();
                ProPostActivationScreenContract$InputData proPostActivationScreenContract$InputData = m1Var.f282627a;
                r0j.d dVar2 = (r0j.d) qVar11.G.e.get();
                vc.s.j(dVar2);
                return new g17.h(bVarG3, hVar2, lVar5, proPostActivationScreenContract$InputData, dVar2, (cli.n) m1Var.f282628b.get());
            case 11:
                int i66 = this.f282722c;
                if (i66 == 0) {
                    return new a17.h((et6.h1) ((q) this.f282721b).c0.get(), (jki.p) ((o1) this.d).f282644a.get());
                }
                if (i66 == 1) {
                    return new a17.i();
                }
                throw new AssertionError(i66);
            case 12:
                s1 s1Var = (s1) this.d;
                q qVar12 = (q) this.f282721b;
                int i74 = this.f282722c;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new o07.j(new o07.k());
                    }
                    throw new AssertionError(i74);
                }
                jki.p pVar = (jki.p) s1Var.f282746c.get();
                FreelancerPaymentProcessingFeesContract$InputData freelancerPaymentProcessingFeesContract$InputData = s1Var.f282745b;
                gr6.o oVar3 = (gr6.o) qVar12.V0.get();
                l61.a aVarB2 = qVar12.f282699q.b();
                vc.s.j(aVarB2);
                return new o07.d(pVar, freelancerPaymentProcessingFeesContract$InputData, oVar3, aVarB2);
            case 13:
                s1 s1Var2 = (s1) this.d;
                q qVar13 = (q) this.f282721b;
                int i92 = this.f282722c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new o07.j(new o07.k());
                    }
                    throw new AssertionError(i92);
                }
                jki.p pVar2 = (jki.p) s1Var2.f282746c.get();
                FreelancerPaymentProcessingFeesContract$InputData freelancerPaymentProcessingFeesContract$InputData2 = s1Var2.f282745b;
                gr6.o oVar4 = (gr6.o) qVar13.V0.get();
                l61.a aVarB3 = qVar13.f282699q.b();
                vc.s.j(aVarB3);
                return new o07.d(pVar2, freelancerPaymentProcessingFeesContract$InputData2, oVar4, aVarB3);
            case 14:
                s1 s1Var3 = (s1) this.d;
                q qVar14 = (q) this.f282721b;
                int i96 = this.f282722c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new o07.j(new o07.k());
                    }
                    throw new AssertionError(i96);
                }
                jki.p pVar3 = (jki.p) s1Var3.f282746c.get();
                FreelancerPaymentProcessingFeesContract$InputData freelancerPaymentProcessingFeesContract$InputData3 = s1Var3.f282745b;
                gr6.o oVar5 = (gr6.o) qVar14.V0.get();
                l61.a aVarB4 = qVar14.f282699q.b();
                vc.s.j(aVarB4);
                return new o07.d(pVar3, freelancerPaymentProcessingFeesContract$InputData3, oVar5, aVarB4);
            case 15:
                q qVar15 = (q) this.f282721b;
                u1 u1Var = (u1) this.d;
                int i99 = this.f282722c;
                if (i99 == 0) {
                    return kxa.j.l((j60.a) u1Var.d.get());
                }
                if (i99 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) u1Var.f282766b.get(), (rp0.m) u1Var.f282767c.get());
                }
                if (i99 == 2) {
                    return new rp0.m();
                }
                if (i99 == 3) {
                    return new y07.l((et6.h1) qVar15.c0.get(), qVar15.f282699q.e(), (j60.a) u1Var.d.get(), (jki.p) u1Var.f.get());
                }
                if (i99 == 4) {
                    return new y07.o(new ft6.t());
                }
                throw new AssertionError(i99);
            case 16:
                q qVar16 = (q) this.f282721b;
                u1 u1Var2 = (u1) this.d;
                int i100 = this.f282722c;
                if (i100 == 0) {
                    return kxa.j.l((j60.a) u1Var2.d.get());
                }
                if (i100 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) u1Var2.f282766b.get(), (rp0.m) u1Var2.f282767c.get());
                }
                if (i100 == 2) {
                    return new rp0.m();
                }
                if (i100 == 3) {
                    return new y07.l((et6.h1) qVar16.c0.get(), qVar16.f282699q.e(), (j60.a) u1Var2.d.get(), (jki.p) u1Var2.f.get());
                }
                if (i100 == 4) {
                    return new y07.o(new ft6.t());
                }
                throw new AssertionError(i100);
            case 17:
                g1 g1Var3 = (g1) this.f282721b;
                w1 w1Var = (w1) this.d;
                int i101 = this.f282722c;
                if (i101 == 0) {
                    return kxa.j.k((j60.a) w1Var.e.get());
                }
                if (i101 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) w1Var.f282789c.get(), (rp0.m) w1Var.d.get());
                }
                if (i101 == 2) {
                    return new rp0.m();
                }
                if (i101 == 3) {
                    return cwi.u.y(w1Var.f282788b, (e17.c) g1Var3.f.get());
                }
                if (i101 == 4) {
                    return new c17.s(new c17.a(), (j60.a) w1Var.e.get(), (sz6.a) g1Var3.e.get(), (e17.c) g1Var3.f.get(), w1Var.f282788b, (cli.n) w1Var.f282791h.get());
                }
                if (i101 == 5) {
                    return new c17.u(new c17.a());
                }
                throw new AssertionError(i101);
            case 18:
                d0 d0Var = (d0) this.f282721b;
                w1 w1Var2 = (w1) this.d;
                int i102 = this.f282722c;
                if (i102 == 0) {
                    return kxa.j.k((j60.a) w1Var2.e.get());
                }
                if (i102 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) w1Var2.f282789c.get(), (rp0.m) w1Var2.d.get());
                }
                if (i102 == 2) {
                    return new rp0.m();
                }
                if (i102 == 3) {
                    return cwi.u.y(w1Var2.f282788b, (e17.c) d0Var.i.get());
                }
                if (i102 == 4) {
                    return new c17.s(new c17.a(), (j60.a) w1Var2.e.get(), (sz6.a) d0Var.f282488g.get(), (e17.c) d0Var.i.get(), w1Var2.f282788b, (cli.n) w1Var2.f282791h.get());
                }
                if (i102 == 5) {
                    return new c17.u(new c17.a());
                }
                throw new AssertionError(i102);
            case 19:
                b0 b0Var = (b0) this.f282721b;
                w1 w1Var3 = (w1) this.d;
                int i103 = this.f282722c;
                if (i103 == 0) {
                    return kxa.j.k((j60.a) w1Var3.e.get());
                }
                if (i103 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) w1Var3.f282789c.get(), (rp0.m) w1Var3.d.get());
                }
                if (i103 == 2) {
                    return new rp0.m();
                }
                if (i103 == 3) {
                    return cwi.u.y(w1Var3.f282788b, (e17.c) b0Var.f282459h.get());
                }
                if (i103 == 4) {
                    return new c17.s(new c17.a(), (j60.a) w1Var3.e.get(), (sz6.a) b0Var.f282458g.get(), (e17.c) b0Var.f282459h.get(), w1Var3.f282788b, (cli.n) w1Var3.f282791h.get());
                }
                if (i103 == 5) {
                    return new c17.u(new c17.a());
                }
                throw new AssertionError(i103);
            case 20:
                y1 y1Var = (y1) this.d;
                c2 c2Var = (c2) this.f282721b;
                q qVar17 = c2Var.f282475a;
                int i104 = this.f282722c;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new AssertionError(i104);
                    }
                    lv6.a aVar7 = new lv6.a();
                    thf.l lVarF = y1Var.f282812a.f282477c.f();
                    vc.s.j(lVarF);
                    return new com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.c(aVar7, new jv6.b(lVarF));
                }
                gr6.h hVarK = qVar17.k();
                vc.s.j(hVarK);
                jr6.m mVarM = qVar17.m();
                vc.s.j(mVarM);
                whf.b bVarA = c2Var.f282477c.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b(hVarK, mVarM, bVarA, (cli.n) y1Var.f282813b.get());
            case 21:
                z1 z1Var = (z1) this.d;
                c2 c2Var2 = (c2) this.f282721b;
                q qVar18 = c2Var2.f282475a;
                int i105 = this.f282722c;
                if (i105 == 0) {
                    gr6.h hVarK2 = qVar18.k();
                    vc.s.j(hVarK2);
                    et6.u0 u0VarJ = qVar18.j();
                    whf.b bVarA2 = c2Var2.f282477c.a();
                    vc.s.j(bVarA2);
                    return new nv6.s(hVarK2, u0VarJ, bVarA2, (cli.n) z1Var.f282825b.get());
                }
                if (i105 != 1) {
                    throw new AssertionError(i105);
                }
                jr6.g gVar = (jr6.g) qVar18.U0.get();
                vc.s.j(gVar);
                thf.l lVarF2 = z1Var.f282824a.f282477c.f();
                vc.s.j(lVarF2);
                return new nv6.t(gVar, new jv6.b(lVarF2));
            case 22:
                c2 c2Var3 = (c2) this.f282721b;
                q qVar19 = c2Var3.f282475a;
                b2 b2Var = (b2) this.d;
                int i106 = this.f282722c;
                if (i106 == 0) {
                    return kxa.j.k((j60.a) b2Var.d.get());
                }
                if (i106 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) b2Var.f282462b.get(), (rp0.m) b2Var.f282463c.get());
                }
                if (i106 == 2) {
                    return new rp0.m();
                }
                if (i106 != 3) {
                    if (i106 != 4) {
                        throw new AssertionError(i106);
                    }
                    tv6.a aVar8 = new tv6.a();
                    thf.l lVarF3 = b2Var.f282461a.f282477c.f();
                    vc.s.j(lVarF3);
                    return new com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.b(aVar8, new jv6.b(lVarF3));
                }
                cli.n nVar4 = (cli.n) b2Var.f.get();
                j60.a aVar9 = (j60.a) b2Var.d.get();
                gr6.h hVarK3 = qVar19.k();
                vc.s.j(hVarK3);
                hr6.l lVarL = qVar19.l();
                vc.s.j(lVarL);
                jr6.m mVarM2 = qVar19.m();
                vc.s.j(mVarM2);
                whf.b bVarA3 = c2Var3.f282477c.a();
                vc.s.j(bVarA3);
                return new rv6.u(nVar4, aVar9, hVarK3, lVarL, mVarM2, bVarA3);
            case 23:
                d2 d2Var = (d2) this.d;
                c2 c2Var4 = (c2) this.f282721b;
                int i107 = this.f282722c;
                if (i107 != 0) {
                    if (i107 == 1) {
                        return new uv6.o(new wv6.a());
                    }
                    throw new AssertionError(i107);
                }
                gr6.h hVarK4 = c2Var4.f282475a.k();
                vc.s.j(hVarK4);
                FreelancerCashbackUpsellContract$InputData freelancerCashbackUpsellContract$InputData = d2Var.f282492a;
                ffk.t tVarF = c2Var4.d.f();
                vc.s.j(tVarF);
                return new uv6.l(hVarK4, freelancerCashbackUpsellContract$InputData, tVarF, c2Var4.e.e(), (cli.n) d2Var.f282493b.get());
            case 24:
                q qVar20 = ((g2) this.f282721b).f282552a;
                f2 f2Var = (f2) this.d;
                int i108 = this.f282722c;
                if (i108 == 0) {
                    return kxa.j.k((j60.a) f2Var.d.get());
                }
                if (i108 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) f2Var.f282540b.get(), (rp0.m) f2Var.f282541c.get());
                }
                if (i108 == 2) {
                    return new rp0.m();
                }
                if (i108 != 3) {
                    if (i108 == 4) {
                        return new cw6.n();
                    }
                    throw new AssertionError(i108);
                }
                FreelancerInvoiceNumberSettingsScreenContract$InputData freelancerInvoiceNumberSettingsScreenContract$InputData = f2Var.f282539a;
                et6.p1 p1VarO = qVar20.o();
                vc.s.j(p1VarO);
                jr6.m mVarM3 = qVar20.m();
                vc.s.j(mVarM3);
                return new cw6.l(freelancerInvoiceNumberSettingsScreenContract$InputData, p1VarO, mVarM3, (j60.a) f2Var.d.get(), (cli.n) f2Var.f.get());
            case 25:
                g2 g2Var = (g2) this.f282721b;
                u1 u1Var3 = (u1) this.d;
                int i109 = this.f282722c;
                if (i109 == 0) {
                    return kxa.j.l((j60.a) u1Var3.d.get());
                }
                if (i109 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) u1Var3.f282766b.get(), (rp0.m) u1Var3.f282767c.get());
                }
                if (i109 == 2) {
                    return new rp0.m();
                }
                if (i109 != 3) {
                    if (i109 == 4) {
                        return new y07.o(new ft6.t());
                    }
                    throw new AssertionError(i109);
                }
                et6.h1 h1VarN = g2Var.f282552a.n();
                vc.s.j(h1VarN);
                return new y07.l(h1VarN, g2Var.i.e(), (j60.a) u1Var3.d.get(), (jki.p) u1Var3.f.get());
            case 26:
                j2 j2Var = (j2) this.d;
                g2 g2Var2 = (g2) this.f282721b;
                q qVar21 = g2Var2.f282552a;
                l70.e eVar3 = g2Var2.f282554c;
                vl3.n nVar5 = g2Var2.f282555g;
                t2j.a aVar10 = g2Var2.f;
                int i110 = this.f282722c;
                if (i110 == 0) {
                    et6.p1 p1VarO2 = qVar21.o();
                    vc.s.j(p1VarO2);
                    et6.b1 b1Var = (et6.b1) qVar21.f282682h0.get();
                    vc.s.j(b1Var);
                    return new com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a(p1VarO2, b1Var, ((b3j.p) aVar10).e(), new sgm.e3((cl3.a) nVar5.f290239w.get()), (pn3.a) j2Var.f282593b.get(), j2Var.f282592a, (cli.n) j2Var.f282594c.get());
                }
                if (i110 == 1) {
                    s70.a aVarM2 = eVar3.m();
                    vc.s.j(aVarM2);
                    y80.a aVarR = eVar3.r();
                    vc.s.j(aVarR);
                    return new pn3.b(aVarM2, aVarR);
                }
                if (i110 != 2) {
                    throw new AssertionError(i110);
                }
                m3j.n nVarI = ((b3j.p) aVar10).i();
                dl3.f fVarC3 = nVar5.c();
                vc.s.j(fVarC3);
                return new ux6.r(nVarI, fVarC3, new jw6.d());
            case 27:
                return a();
            case 28:
                return b();
            default:
                g2 g2Var3 = (g2) this.f282721b;
                p2 p2Var = (p2) this.d;
                int i111 = this.f282722c;
                if (i111 == 0) {
                    return kxa.j.k((j60.a) p2Var.e.get());
                }
                if (i111 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) p2Var.f282665c.get(), (rp0.m) p2Var.d.get());
                }
                if (i111 == 2) {
                    return new rp0.m();
                }
                if (i111 != 3) {
                    throw new AssertionError(i111);
                }
                l80.e eVarH2 = g2Var3.f282554c.h();
                vc.s.j(eVarH2);
                hy6.a aVar11 = new hy6.a();
                InvoicePaymentScheduleScreenContract$InputData invoicePaymentScheduleScreenContract$InputData = p2Var.f282663a;
                et6.p1 p1VarO3 = g2Var3.f282552a.o();
                vc.s.j(p1VarO3);
                qy6.d dVar3 = new qy6.d(new qy6.b());
                l70.e eVar4 = p2Var.f282664b.f282554c;
                l80.e eVarH3 = eVar4.h();
                vc.s.j(eVarH3);
                iy6.a aVar12 = new iy6.a();
                l80.e eVarH4 = eVar4.h();
                vc.s.j(eVarH4);
                return new com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c(eVarH2, aVar11, invoicePaymentScheduleScreenContract$InputData, p1VarO3, dVar3, new com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.d(eVarH3, aVar12, new iy6.b(eVarH4, new ry6.b(new qy6.b()))));
        }
    }
}
