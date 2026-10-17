package ld1;

import android.content.Context;
import b4b.g0;
import bjl.o0;
import bjl.p0;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.CryptoCommodityBuyCollectionAmountScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import i4b.i0;
import kotlin.jvm.internal.Intrinsics;
import ljl.k1;
import ljl.m1;
import ljl.q0;
import ljl.w0;
import okl.n1;
import rp0.g1;
import rp0.x0;
import vrl.y0;
import z0h.q1;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f193989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f193990c;
    public final qji.b d;
    public final Object e;

    public /* synthetic */ q(Object obj2, qji.b bVar, Object obj3, int i, int i2) {
        this.f193988a = i2;
        this.f193989b = obj2;
        this.d = bVar;
        this.e = obj3;
        this.f193990c = i;
    }

    private final Object a() {
        m2b.m mVar = (m2b.m) this.d;
        m2b.v vVar = (m2b.v) this.f193989b;
        m2b.n nVar = (m2b.n) this.e;
        int i = this.f193990c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) nVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) nVar.d.get(), (rp0.m) nVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.a aVar = (n60.a) nVar.f201862h.get();
                o5k.i.l(aVar);
                return aVar;
            case 4:
                return o5k.i.q((com.revolut.kompot.navigable.a) nVar.d.get());
            case 5:
                return new aah.g(nVar.f201858a, (g5b.a) nVar.k.get());
            case 6:
                return new g5b.j((t2b.d) mVar.f201856j.get(), (t2b.a) nVar.f201863j.get(), (w2b.a) mVar.k.get());
            case 7:
                return new a4b.f();
            case 8:
                cli.n nVar2 = (cli.n) nVar.A.get();
                b4b.s sVar = (b4b.s) nVar.B.get();
                b4b.p pVar = nVar.f201859b;
                t2b.c cVar = (t2b.c) mVar.f201855h.get();
                vdf.d dVar = (vdf.d) nVar.f201867p.get();
                t2b.f fVar = (t2b.f) mVar.f201857l.get();
                zdl.c cVar2 = vVar.e;
                m2b.e eVar = vVar.f201923c;
                ybl.d dVarH = cVar2.h();
                vc.s.j(dVarH);
                y1b.a aVarD = eVar.d();
                vc.s.j(aVarD);
                vrl.s sVarD = vVar.f201933s.d();
                vc.s.j(sVarD);
                a4b.a aVar2 = (a4b.a) nVar.C.get();
                ybl.b bVarB = vVar.e.b();
                vc.s.j(bVarB);
                o7.b bVarQ = mVar.q();
                g5b.a aVar3 = (g5b.a) nVar.k.get();
                a4b.f fVar2 = (a4b.f) nVar.f201863j.get();
                l80.e eVarH = vVar.f201932r.h();
                vc.s.j(eVarH);
                j60.a aVar4 = (j60.a) nVar.f.get();
                z3b.g gVar = (z3b.g) nVar.E.get();
                s2b.b bVar = (s2b.b) eVar.f201814t.get();
                vc.s.j(bVar);
                return new com.revolut.feature.retail.cfd.impl.screens.order.v2.a(nVar2, sVar, pVar, cVar, dVar, fVar, dVarH, aVarD, sVarD, aVar2, bVarB, bVarQ, aVar3, fVar2, eVarH, aVar4, gVar, bVar, (n60.a) nVar.f201862h.get(), (l4b.m) nVar.F.get(), (l4b.a) nVar.G.get(), (y3b.f) nVar.I.get(), (y3b.c) nVar.J.get());
            case 9:
                return new g0(nVar.f201859b, (d4b.g) nVar.f201869r.get(), (d4b.l) nVar.f201870s.get(), (g5b.c) nVar.f201871t.get(), (z3b.a) nVar.f201872w.get(), (m3b.i) nVar.f201873x.get(), (m3b.k) nVar.f201874y.get(), (z3b.d) nVar.z.get(), (a4b.j) nVar.f201868q.get());
            case 10:
                return new d4b.i(nVar.f201859b, (d4b.j) nVar.f201865m.get(), (d4b.b) nVar.f201866n.get(), (d4b.e) nVar.o.get(), (vdf.d) nVar.f201867p.get(), (a4b.j) nVar.f201868q.get());
            case 11:
                return new d4b.k(nVar.f201859b);
            case 12:
                j4i.a aVar5 = vVar.f201934t;
                return new d4b.c(new l4i.a());
            case 13:
                j4i.a aVar6 = vVar.f201934t;
                return new d4b.f(new l4i.a());
            case 14:
                w80.b formatter = vVar.f201932r.j();
                vc.s.j(formatter);
                qd0.b languageProvider = vVar.f201932r.n();
                vc.s.j(languageProvider);
                c4b.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(formatter, "formatter");
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                vdf.b.Companion.getClass();
                return vdf.a.a(formatter, languageProvider);
            case 15:
                b4b.p pVar2 = nVar.f201859b;
                j4i.a aVar7 = vVar.f201934t;
                return new a4b.j(pVar2, new l4i.a());
            case 16:
                return new d4b.n(nVar.f201859b, vVar.f201933s.k());
            case 17:
                return new g5b.m(new q2b.b());
            case 18:
                return new z3b.c((m3b.c) nVar.u.get(), (m3b.f) nVar.v.get());
            case 19:
                return new m3b.e();
            case 20:
                return new m3b.h();
            case 21:
                return new m3b.j();
            case 22:
                return new m3b.k();
            case 23:
                return new z3b.f();
            case 24:
                return new b4b.f0();
            case 25:
                return new a4b.a();
            case 26:
                return new z3b.g(nVar.f201859b, (z3b.h) nVar.D.get());
            case 27:
                xul.n nVar3 = (xul.n) vVar.f201933s.Y.get();
                vc.s.j(nVar3);
                return new z3b.j(nVar3);
            case 28:
                j4i.a aVar8 = vVar.f201934t;
                return new l4b.n(new l4i.a());
            case 29:
                return new l4b.b();
            case 30:
                z3b.a aVar9 = (z3b.a) nVar.f201872w.get();
                y3b.a aVar10 = (y3b.a) nVar.H.get();
                l80.e eVarH2 = vVar.f201932r.h();
                vc.s.j(eVarH2);
                return new y3b.h(aVar9, aVar10, eVarH2);
            case 31:
                return new y3b.b();
            case 32:
                l80.e eVarH3 = vVar.f201932r.h();
                vc.s.j(eVarH3);
                return new y3b.d(eVarH3);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        m2b.p pVar = (m2b.p) this.d;
        m2b.v vVar = (m2b.v) this.f193989b;
        m2b.e eVar = vVar.f201923c;
        m2b.q qVar = (m2b.q) this.e;
        m2b.v vVar2 = qVar.d;
        int i = this.f193990c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) qVar.f201888h.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) qVar.f.get(), (rp0.m) qVar.f201887g.get());
            case 2:
                return new rp0.m();
            case 3:
                return c21.l.j(eVar.i(), (b2b.f) qVar.f201890l.get());
            case 4:
                kge.d dVarA = eVar.a();
                g5b.a aVar = (g5b.a) qVar.f201889j.get();
                g4b.n nVar = qVar.f201885b;
                ybl.b bVarB = vVar.e.b();
                vc.s.j(bVarB);
                m2b.e eVar2 = vVar2.f201923c;
                d2b.a aVarC = eVar2.c();
                vc.s.j(aVarC);
                g5b.c cVar = (g5b.c) qVar.k.get();
                m3b.j jVar = new m3b.j();
                vwk.a aVar2 = (vwk.a) vVar2.f201935w.f130463l.get();
                vc.s.j(aVar2);
                g4b.y yVar = new g4b.y(aVarC, cVar, jVar, aVar2, eVar2.j(), new ufl.b(new tfl.a()));
                f2b.b bVar = (f2b.b) eVar.f201810p.get();
                vc.s.j(bVar);
                return new com.revolut.feature.retail.cfd.impl.screens.positions.a(dVarA, aVar, nVar, bVarB, yVar, bVar);
            case 5:
                t2b.d dVar = (t2b.d) pVar.f201883j.get();
                m2b.p pVar2 = qVar.e;
                y2b.e eVar3 = pVar2.f201878a;
                y1b.a aVarD = vVar2.f201923c.d();
                vc.s.j(aVarD);
                g4b.a aVar3 = new g4b.a(eVar3, aVarD, pVar2.s());
                y2b.e eVar4 = pVar.f201878a;
                y1b.a aVarD2 = pVar.f201879b.f201923c.d();
                vc.s.j(aVarD2);
                return new g5b.j(dVar, aVar3, new w2b.a(eVar4, aVarD2, pVar.s()));
            case 6:
                return new g5b.m(new q2b.b());
            case 7:
                return new aah.g(qVar.f201886c, (g5b.a) qVar.f201889j.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        m2b.p pVar = (m2b.p) this.d;
        m2b.v vVar = (m2b.v) this.f193989b;
        m2b.c0 c0Var = (m2b.c0) this.e;
        int i = this.f193990c;
        switch (i) {
            case 0:
                return new aah.g(c0Var.f201782b, (g5b.a) c0Var.f201784g.get());
            case 1:
                t2b.d dVar = (t2b.d) pVar.f201883j.get();
                t2b.a aVar = (t2b.a) c0Var.f.get();
                y2b.e eVar = pVar.f201878a;
                y1b.a aVarD = pVar.f201879b.f201923c.d();
                vc.s.j(aVarD);
                return new g5b.j(dVar, aVar, new w2b.a(eVar, aVarD, pVar.s()));
            case 2:
                return new i4b.a(c0Var.f201783c);
            case 3:
                jki.p pVar2 = (jki.p) c0Var.f201792r.get();
                ite.a aVar2 = vVar.f201927l;
                m2b.e eVar2 = vVar.f201923c;
                trl.a aVar3 = vVar.f201933s;
                gte.a aVarB = aVar2.b();
                vc.s.j(aVarB);
                CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData = c0Var.f201783c;
                y0 y0VarJ = aVar3.j();
                vc.s.j(y0VarJ);
                l4b.v vVar2 = (l4b.v) c0Var.f201793s.get();
                t2b.f fVar = (t2b.f) pVar.k.get();
                o7.b bVarQ = pVar.q();
                vrl.s sVarD = aVar3.d();
                vc.s.j(sVarD);
                ybl.l lVarF = vVar.o.f();
                ang.f fVarE = vVar.u.e();
                g5b.a aVar4 = (g5b.a) c0Var.f201784g.get();
                wj0.a aVarI = ((nj0.d) vVar.v).i();
                vc.s.j(aVarI);
                kge.d dVarA = eVar2.a();
                a4b.h hVar = new a4b.h();
                ydf.b bVar = (ydf.b) c0Var.f201794t.get();
                f2b.b bVar2 = (f2b.b) eVar2.f201810p.get();
                vc.s.j(bVar2);
                return new i4b.g0(pVar2, aVarB, cfdOrderReviewScreenContract$InputData, y0VarJ, vVar2, fVar, bVarQ, sVarD, lVarF, fVarE, aVar4, aVarI, dVarA, hVar, bVar, bVar2);
            case 4:
                j4i.a aVar5 = vVar.f201934t;
                return new i4b.u(new l4i.a(), c0Var.f201783c, vVar.f201933s.k(), (l4b.y) c0Var.f201786j.get(), (l4b.j) c0Var.f201787l.get(), (l4b.s) c0Var.f201788m.get(), (l4b.b0) c0Var.f201789n.get(), (l4b.o) c0Var.o.get(), (l4b.h) c0Var.f201790p.get(), (g5b.c) c0Var.f201791q.get(), new l4b.f());
            case 5:
                return new l4b.a0((m3b.a) c0Var.i.get());
            case 6:
                return new m3b.b();
            case 7:
                return new l4b.l((m3b.c) c0Var.k.get());
            case 8:
                return new m3b.e();
            case 9:
                j4i.a aVar6 = vVar.f201934t;
                return new l4b.t(new l4i.a());
            case 10:
                return new l4b.c0();
            case 11:
                j4i.a aVar7 = vVar.f201934t;
                l4i.a aVar8 = new l4i.a();
                xul.l lVarH = vVar.f201933s.h();
                vc.s.j(lVarH);
                return new l4b.p(aVar8, lVarH);
            case 12:
                return new l4b.i();
            case 13:
                return new g5b.m(new q2b.b());
            case 14:
                CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData2 = c0Var.f201783c;
                j4i.a aVar9 = vVar.f201934t;
                return new l4b.x(cfdOrderReviewScreenContract$InputData2, new l4i.a());
            case 15:
                fxk.a aVarA = vVar.f201935w.a();
                vc.s.j(aVarA);
                ybl.b bVarB = vVar.e.b();
                vc.s.j(bVarB);
                df0.b bVarA = vVar.f201936x.a();
                vc.s.j(bVarA);
                return iz8.c.x(aVarA, bVarB, bVarA);
            case 16:
                i4b.f fVar2 = c0Var.d;
                i4b.q qVar = (i4b.q) c0Var.u.get();
                j60.a aVar10 = (j60.a) pVar.f.get();
                l4b.q qVar2 = (l4b.q) c0Var.v.get();
                i0 i0Var = c0Var.e;
                l4b.d0 d0Var = (l4b.d0) c0Var.f201795w.get();
                return iz8.c.A(fVar2, qVar, i0Var, aVar10, (l4b.a) c0Var.f201797y.get(), (l4b.c) c0Var.z.get(), (l4b.m) c0Var.f201796x.get(), qVar2, d0Var);
            case 17:
                return new l4b.r();
            case 18:
                return new l4b.d0();
            case 19:
                j4i.a aVar11 = vVar.f201934t;
                return new l4b.n(new l4i.a());
            case 20:
                return new l4b.b();
            case 21:
                l80.e eVarH = vVar.f201932r.h();
                vc.s.j(eVarH);
                return new l4b.e(eVarH);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        m2b.m mVar = (m2b.m) this.d;
        m2b.v vVar = (m2b.v) this.f193989b;
        m2b.c0 c0Var = (m2b.c0) this.e;
        int i = this.f193990c;
        switch (i) {
            case 0:
                return new aah.g(c0Var.f201782b, (g5b.a) c0Var.f201784g.get());
            case 1:
                return new g5b.j((t2b.d) mVar.f201856j.get(), (t2b.a) c0Var.f.get(), (w2b.a) mVar.k.get());
            case 2:
                return new i4b.a(c0Var.f201783c);
            case 3:
                jki.p pVar = (jki.p) c0Var.f201792r.get();
                ite.a aVar = vVar.f201927l;
                m2b.e eVar = vVar.f201923c;
                trl.a aVar2 = vVar.f201933s;
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData = c0Var.f201783c;
                y0 y0VarJ = aVar2.j();
                vc.s.j(y0VarJ);
                l4b.v vVar2 = (l4b.v) c0Var.f201793s.get();
                t2b.f fVar = (t2b.f) mVar.f201857l.get();
                o7.b bVarQ = mVar.q();
                vrl.s sVarD = aVar2.d();
                vc.s.j(sVarD);
                ybl.l lVarF = vVar.o.f();
                ang.f fVarE = vVar.u.e();
                g5b.a aVar3 = (g5b.a) c0Var.f201784g.get();
                wj0.a aVarI = ((nj0.d) vVar.v).i();
                vc.s.j(aVarI);
                kge.d dVarA = eVar.a();
                a4b.h hVar = new a4b.h();
                ydf.b bVar = (ydf.b) c0Var.f201794t.get();
                f2b.b bVar2 = (f2b.b) eVar.f201810p.get();
                vc.s.j(bVar2);
                return new i4b.g0(pVar, aVarB, cfdOrderReviewScreenContract$InputData, y0VarJ, vVar2, fVar, bVarQ, sVarD, lVarF, fVarE, aVar3, aVarI, dVarA, hVar, bVar, bVar2);
            case 4:
                j4i.a aVar4 = vVar.f201934t;
                return new i4b.u(new l4i.a(), c0Var.f201783c, vVar.f201933s.k(), (l4b.y) c0Var.f201786j.get(), (l4b.j) c0Var.f201787l.get(), (l4b.s) c0Var.f201788m.get(), (l4b.b0) c0Var.f201789n.get(), (l4b.o) c0Var.o.get(), (l4b.h) c0Var.f201790p.get(), (g5b.c) c0Var.f201791q.get(), new l4b.f());
            case 5:
                return new l4b.a0((m3b.a) c0Var.i.get());
            case 6:
                return new m3b.b();
            case 7:
                return new l4b.l((m3b.c) c0Var.k.get());
            case 8:
                return new m3b.e();
            case 9:
                j4i.a aVar5 = vVar.f201934t;
                return new l4b.t(new l4i.a());
            case 10:
                return new l4b.c0();
            case 11:
                j4i.a aVar6 = vVar.f201934t;
                l4i.a aVar7 = new l4i.a();
                xul.l lVarH = vVar.f201933s.h();
                vc.s.j(lVarH);
                return new l4b.p(aVar7, lVarH);
            case 12:
                return new l4b.i();
            case 13:
                return new g5b.m(new q2b.b());
            case 14:
                CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData2 = c0Var.f201783c;
                j4i.a aVar8 = vVar.f201934t;
                return new l4b.x(cfdOrderReviewScreenContract$InputData2, new l4i.a());
            case 15:
                fxk.a aVarA = vVar.f201935w.a();
                vc.s.j(aVarA);
                ybl.b bVarB = vVar.e.b();
                vc.s.j(bVarB);
                df0.b bVarA = vVar.f201936x.a();
                vc.s.j(bVarA);
                return iz8.c.x(aVarA, bVarB, bVarA);
            case 16:
                i4b.f fVar2 = c0Var.d;
                i4b.q qVar = (i4b.q) c0Var.u.get();
                j60.a aVar9 = (j60.a) mVar.f.get();
                l4b.q qVar2 = (l4b.q) c0Var.v.get();
                i0 i0Var = c0Var.e;
                l4b.d0 d0Var = (l4b.d0) c0Var.f201795w.get();
                return iz8.c.A(fVar2, qVar, i0Var, aVar9, (l4b.a) c0Var.f201797y.get(), (l4b.c) c0Var.z.get(), (l4b.m) c0Var.f201796x.get(), qVar2, d0Var);
            case 17:
                return new l4b.r();
            case 18:
                return new l4b.d0();
            case 19:
                j4i.a aVar10 = vVar.f201934t;
                return new l4b.n(new l4i.a());
            case 20:
                return new l4b.b();
            case 21:
                l80.e eVarH = vVar.f201932r.h();
                vc.s.j(eVarH);
                return new l4b.e(eVarH);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        mjl.k kVar = (mjl.k) this.e;
        mjl.m mVar = (mjl.m) this.f193989b;
        l70.e eVar = mVar.d;
        int i = this.f193990c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ViewController controller = ((mjl.j) this.d).f206088a;
            upl.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new f01.c(controller.m2());
        }
        c70.a aVarZ = eVar.z();
        vc.s.j(aVarZ);
        akl.b0 b0VarB = mVar.b();
        r70.c cVarA = eVar.A();
        vc.s.j(cVarA);
        s70.a aVarM = eVar.m();
        vc.s.j(aVarM);
        o0 o0Var = (o0) mVar.O.get();
        f01.a aVar = (f01.a) kVar.f206092b.get();
        c90.a colorProvider = kVar.f206091a.d.e();
        vc.s.j(colorProvider);
        upl.b.Companion.getClass();
        cq0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(colorProvider, "colorProvider");
        cq0.c cdnBaseUrl = cq0.c.f107983a;
        Intrinsics.checkNotNullParameter(cdnBaseUrl, "cdnBaseUrl");
        return new tpl.s(aVarZ, b0VarB, cVarA, aVarM, o0Var, aVar, new tpl.u(new wpl.j()));
    }

    private final Object f() {
        mkh.s sVar = (mkh.s) this.f193989b;
        mkh.n nVar = (mkh.n) this.e;
        int i = this.f193990c;
        switch (i) {
            case 0:
                Object impl = (ylh.i) nVar.f206354g.get();
                zlh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                yji.d dVar = (yji.d) impl;
                vc.s.k(dVar);
                return dVar;
            case 1:
                return new ylh.p((j60.a) nVar.f206353c.get(), (ylh.j) nVar.f.get());
            case 2:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar.f206352b.get();
                he2.b dialogHostFinder = ehe.n.r();
                zlh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, new rp0.m(), dialogHostFinder);
            case 3:
                ylh.f fVar = (ylh.f) nVar.d.get();
                zxd.c cVarA = ((eyd.b) sVar.U).a();
                vc.s.j(cVarA);
                ybl.d dVarH = sVar.f206413j.h();
                vc.s.j(dVarH);
                return new ylh.t(fVar, cVarA, dVarH, (ylh.k) nVar.e.get(), (j60.a) nVar.f206353c.get());
            case 4:
                return new ylh.u();
            case 5:
                return new ylh.d0();
            case 6:
                Object impl2 = (j60.a) nVar.f206353c.get();
                zlh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl2, "impl");
                yji.d dVar2 = (yji.d) impl2;
                vc.s.k(dVar2);
                return dVar2;
            case 7:
                Object impl3 = (ylh.j) nVar.f.get();
                zlh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl3, "impl");
                yji.n nVar2 = (yji.n) impl3;
                vc.s.k(nVar2);
                return nVar2;
            case 8:
                amh.e eVar = new amh.e((q1) nVar.k.get(), nVar.f206351a.f206348a);
                amh.f fVar2 = ((mkh.m) this.d).f206348a;
                ylh.h hVar = (ylh.h) nVar.f.get();
                ang.f fVarE = sVar.V.e();
                vxd.b bVar = sVar.U;
                vyd.a aVar = new vyd.a();
                n0e.b bVarC = ((eyd.b) bVar).c();
                ybl.o oVarL = sVar.f206413j.l();
                vc.s.j(oVarL);
                ybl.k kVarD = sVar.f.d();
                vc.s.j(kVarD);
                return new amh.x(eVar, fVar2, hVar, fVarE, aVar, bVarC, oVarL, kVarD, sVar.d.f(), sVar.W.c());
            case 9:
                aah.i factory = ((u8h.b) sVar.i).d();
                vc.s.j(factory);
                zlh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        hc2.k kVar = (hc2.k) this.e;
        int i = this.f193990c;
        if (i == 0) {
            n60.a aVar = (n60.a) kVar.d.get();
            o5k.i.l(aVar);
            return aVar;
        }
        if (i == 1) {
            return o5k.i.q((com.revolut.kompot.navigable.a) kVar.f150795c.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new jx1.k(kVar.f150794b);
            }
            throw new AssertionError(i);
        }
        ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = kVar.f150794b;
        hx1.a aVar2 = (hx1.a) ((ms1.n) this.d).f208562g.get();
        n60.a aVar3 = (n60.a) kVar.d.get();
        z80.b bVarS = ((ms1.j) this.f193989b).f208535c.s();
        vc.s.j(bVarS);
        return new com.revolut.feature.apm.core.code.ui.a(apmCodeControllerContract$InputData, aVar2, aVar3, bVarS, (cli.n) kVar.f.get());
    }

    private final Object h() {
        BizumRegistrationFlowContract$InputData bizumRegistrationFlowContract$InputData = ((ms1.n) this.d).f208559a;
        ms1.m mVar = (ms1.m) this.e;
        ms1.j jVar = (ms1.j) this.f193989b;
        l70.e eVar = jVar.f208535c;
        int i = this.f193990c;
        if (i == 0) {
            Object extension = (at1.d) mVar.f208556a.get();
            bt1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            ps1.b bVar = (ps1.b) jVar.D.get();
            et1.a aVar = new et1.a();
            l80.h hVarV = eVar.v();
            vc.s.j(hVarV);
            return new at1.j(bizumRegistrationFlowContract$InputData, bVar, aVar, hVarV);
        }
        if (i == 2) {
            return new ys1.k(bizumRegistrationFlowContract$InputData, (at1.d) mVar.f208556a.get(), (jki.p) mVar.f208558c.get());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        z80.b bVarS = eVar.s();
        vc.s.j(bVarS);
        return new ys1.m(bVarS);
    }

    private final Object i() {
        ms1.j jVar = (ms1.j) this.f193989b;
        ms1.p pVar = (ms1.p) this.e;
        BizumRegistrationFlowContract$InputData bizumRegistrationFlowContract$InputData = ((ms1.n) this.d).f208559a;
        int i = this.f193990c;
        if (i == 0) {
            Object extension = (at1.d) pVar.f208565a.get();
            bt1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new ft1.m(bizumRegistrationFlowContract$InputData, (jki.p) pVar.f208567c.get());
            }
            if (i == 3) {
                return new ft1.n();
            }
            throw new AssertionError(i);
        }
        ps1.b bVar = (ps1.b) jVar.D.get();
        et1.a aVar = new et1.a();
        l80.h hVarV = jVar.f208535c.v();
        vc.s.j(hVarV);
        return new at1.j(bizumRegistrationFlowContract$InputData, bVar, aVar, hVarV);
    }

    private final Object j() {
        ms1.t tVar = (ms1.t) this.d;
        ms1.j jVar = (ms1.j) this.f193989b;
        ms1.r rVar = (ms1.r) this.e;
        int i = this.f193990c;
        switch (i) {
            case 0:
                n60.b bVar = (n60.b) rVar.e.get();
                o5k.i.n(bVar);
                return bVar;
            case 1:
                return o5k.i.s((com.revolut.kompot.navigable.a) rVar.d.get());
            case 2:
                n60.a aVar = (n60.a) rVar.f208574g.get();
                o5k.i.k(aVar);
                return aVar;
            case 3:
                return o5k.i.p((com.revolut.kompot.navigable.a) rVar.d.get());
            case 4:
                return kxa.j.l((j60.a) rVar.f208576j.get());
            case 5:
                return h30.l.p((com.revolut.kompot.navigable.a) rVar.d.get(), (rp0.m) rVar.i.get());
            case 6:
                return new rp0.m();
            case 7:
                xdk.b extension = (xdk.b) rVar.f208577l.get();
                ydk.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 8:
                xdk.a aVar2 = new xdk.a();
                z71.a aVarF = ((c21.b) jVar.f208544r).f();
                vc.s.j(aVarF);
                return new xdk.g(aVar2, aVarF, jVar.f208541n.a());
            case 9:
                return t5k.b.a((s5k.a) rVar.o.get());
            case 10:
                return new s5k.d((r5k.d) rVar.f208579n.get(), (j60.a) rVar.f208576j.get(), new r5k.a(), new r5k.b());
            case 11:
                return new r5k.e();
            case 12:
                BizumTransferAmountContract$InputData bizumTransferAmountContract$InputData = rVar.f208571a;
                st1.b bVar2 = (st1.b) rVar.f208573c.i.get();
                ms1.j jVar2 = rVar.f208572b;
                p12.l lVar = jVar2.f208545s;
                opf.c0 c0Var = new opf.c0();
                x02.b bVarI = lVar.i();
                vc.s.j(bVarI);
                x02.a aVarH = lVar.h();
                vc.s.j(aVarH);
                vo9.a aVarB = ((ut9.a) jVar2.f208546t).b();
                vc.s.j(aVarB);
                gte.a aVarB2 = jVar2.f208536g.b();
                vc.s.j(aVarB2);
                com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b bVar3 = new com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b(bizumTransferAmountContract$InputData, bVar2, c0Var, bVarI, aVarH, aVarB, aVarB2);
                x02.d dVarK = jVar.f208545s.k();
                vc.s.j(dVarK);
                return new jt1.z(bVar3, dVarK, (rt1.a) tVar.f208596n.get(), (st1.b) tVar.i.get(), (qt1.a) tVar.d.get(), (xdk.b) rVar.f208577l.get(), (s5k.a) rVar.o.get(), (n60.a) rVar.f208574g.get(), (ldd.b) rVar.f208581q.get(), (w80.b) rVar.f208582r.get(), rVar.f208571a, (jki.p) rVar.f208584t.get());
            case 13:
                kdd.b bVar4 = jVar.u;
                ldd.a factory = new ldd.a();
                kt1.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new ldd.b();
            case 14:
                qd0.b languageProvider = jVar.f208535c.n();
                vc.s.j(languageProvider);
                kt1.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 15:
                lx1.i iVarD = ((ey1.e) jVar.i).d();
                vc.s.j(iVarD);
                yof.d dVar = (yof.d) rVar.f208583s.get();
                vo9.a aVarB3 = ((ut9.a) rVar.f208572b.f208546t).b();
                vc.s.j(aVarB3);
                return new jt1.p(iVarD, new lt1.c(dVar, aVarB3, new u80.o(), (w80.b) rVar.f208582r.get(), (ldd.b) rVar.f208581q.get()), (yof.d) rVar.f208583s.get());
            case 16:
                ppf.a factory2 = jVar.v.b();
                vc.s.j(factory2);
                ldd.b delegate = (ldd.b) rVar.f208581q.get();
                kt1.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        ms1.t tVar = (ms1.t) this.d;
        ms1.j jVar = (ms1.j) this.f193989b;
        p12.l lVar = jVar.f208545s;
        npf.a aVar = jVar.v;
        ms1.u uVar = (ms1.u) this.e;
        int i = this.f193990c;
        switch (i) {
            case 0:
                return kxa.j.s((j60.a) uVar.e.get());
            case 1:
                return kxa.j.q((com.revolut.kompot.navigable.a) uVar.f208599c.get(), (rp0.m) uVar.d.get(), new j60.e());
            case 2:
                return new rp0.m();
            case 3:
                i5k.a extension = (i5k.a) uVar.f208600g.get();
                j5k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                l80.h hVarV = jVar.f208535c.v();
                vc.s.j(hVarV);
                return new i5k.d(hVarV);
            case 5:
                BizumTransferReviewContract$InputData bizumTransferReviewContract$InputData = uVar.f208597a;
                x02.d dVarK = lVar.k();
                vc.s.j(dVarK);
                BizumTransferReviewContract$InputData bizumTransferReviewContract$InputData2 = uVar.f208597a;
                ms1.j jVar2 = uVar.f208598b;
                x02.b bVarI = jVar2.f208545s.i();
                vc.s.j(bVarI);
                bqf.d dVarA = jVar2.f208540m.a();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) jVar2.f208547w).c();
                vc.s.j(aVarC);
                fk3.a aVarA = jVar2.d.a();
                vc.s.j(aVarA);
                ot1.o oVar = new ot1.o(bizumTransferReviewContract$InputData2, bVarI, dVarA, aVarC, aVarA);
                rt1.a aVar2 = (rt1.a) tVar.f208596n.get();
                qt1.a aVar3 = (qt1.a) tVar.d.get();
                qt1.n nVar = (qt1.n) tVar.f208591g.get();
                i5k.a aVar4 = (i5k.a) uVar.f208600g.get();
                j60.a aVar5 = (j60.a) uVar.e.get();
                yof.a aVarA2 = aVar.a();
                vc.s.j(aVarA2);
                return new ot1.b0(bizumTransferReviewContract$InputData, dVarK, oVar, aVar2, aVar3, nVar, aVar4, aVar5, aVarA2, (jki.p) uVar.i.get());
            case 6:
                lx1.i iVarD = ((ey1.e) jVar.i).d();
                vc.s.j(iVarD);
                yof.k kVarG = aVar.g();
                vc.s.j(kVarG);
                q12.g gVarJ = lVar.j();
                vc.s.j(gVarJ);
                return new ot1.x(iVarD, kVarG, gVarJ);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        mw5.j jVar = (mw5.j) this.d;
        mw5.l lVar = (mw5.l) this.f193989b;
        mw5.h hVar = (mw5.h) this.e;
        int i = this.f193990c;
        switch (i) {
            case 0:
                n60.a aVar = (n60.a) hVar.d.get();
                o5k.i.k(aVar);
                return aVar;
            case 1:
                return o5k.i.p((com.revolut.kompot.navigable.a) hVar.f209357c.get());
            case 2:
                n60.b bVar = (n60.b) hVar.f.get();
                o5k.i.n(bVar);
                return bVar;
            case 3:
                return o5k.i.s((com.revolut.kompot.navigable.a) hVar.f209357c.get());
            case 4:
                ae5.a extension = (ae5.a) hVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 5:
                be5.b factory = new be5.b();
                ldd.b focusRequesterDelegate = (ldd.b) hVar.f209359h.get();
                n60.a keyboardExtension = (n60.a) hVar.d.get();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                return new be5.a();
            case 6:
                ldd.a factory2 = new ldd.a();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new ldd.b();
            case 7:
                jki.p pVar = (jki.p) hVar.k.get();
                CryptoCommodityBuyCollectionAmountScreenContract$InputData cryptoCommodityBuyCollectionAmountScreenContract$InputData = hVar.f209355a;
                x8h.g gVarB = lVar.f209378j.b();
                wsg.n nVarB = lVar.i.b();
                w80.b bVarJ = lVar.f209379l.j();
                vc.s.j(bVarJ);
                j60.a aVar2 = (j60.a) jVar.f.get();
                uw5.b bVar2 = new uw5.b();
                vw5.a aVar3 = new vw5.a();
                xw5.d dVar = (xw5.d) jVar.i.get();
                ww5.a aVar4 = new ww5.a();
                vo9.a aVarB = ((ut9.a) lVar.f209384r).b();
                vc.s.j(aVarB);
                djb.n nVarA = lVar.f209385s.a();
                vc.s.j(nVarA);
                return new zw5.n(pVar, cryptoCommodityBuyCollectionAmountScreenContract$InputData, gVarB, nVarB, bVarJ, aVar2, bVar2, aVar3, dVar, aVar4, aVarB, nVarA, lVar.o.a(), (ae5.a) hVar.i.get());
            case 8:
                cx5.a aVar5 = new cx5.a();
                mw5.l lVar2 = hVar.f209356b;
                bx5.i mapperV2 = new bx5.i(aVar5, lVar2.f209382p.g(), lVar2.f209383q.c());
                ax5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapperV2, "mapperV2");
                return mapperV2;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        mw5.i iVar = (mw5.i) this.e;
        mw5.l lVar = (mw5.l) this.f193989b;
        int i = this.f193990c;
        if (i != 0) {
            if (i == 1) {
                return new dx5.p(lVar.f209382p.g());
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            BaseScreen screen = iVar.f209363b;
            ex5.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new rp0.d(screen.m2());
        }
        jki.p pVar = (jki.p) iVar.f209364c.get();
        CryptoCommodityBuyCollectionConfirmationScreenContract$InputData cryptoCommodityBuyCollectionConfirmationScreenContract$InputData = iVar.f209362a;
        x8h.g gVarB = lVar.f209378j.b();
        vw5.a aVar = new vw5.a();
        xw5.d dVar = (xw5.d) ((mw5.j) this.d).i.get();
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) lVar.f209386t).c();
        vc.s.j(aVarC);
        sh5.d dVarF = lVar.f209374b.f();
        vc.s.j(dVarF);
        return new dx5.n(pVar, cryptoCommodityBuyCollectionConfirmationScreenContract$InputData, gVarB, aVar, dVar, aVarC, dVarF, lVar.i.b(), (rp0.d) iVar.d.get(), lVar.u.f(), new be5.e());
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f193988a) {
            case 0:
                l lVar = (l) this.f193989b;
                int i = this.f193990c;
                if (i == 0) {
                    return new ve1.g((jki.p) ((r) this.e).f193991a.get(), (nd1.c) lVar.f193960j.get());
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                rd1.b bVar = (rd1.b) ((p) this.d).d.get();
                u80.t tVarU = lVar.e.u();
                vc.s.j(tVarU);
                return new tuk.o(bVar, tVarU);
            case 1:
                m mVar = (m) this.d;
                l lVar2 = (l) this.f193989b;
                u uVar = (u) this.e;
                int i2 = this.f193990c;
                if (i2 == 0) {
                    return new se1.i((jki.p) uVar.f194002c.get(), (nd1.n) lVar2.f193964p.get(), (nd1.i) lVar2.f193966r.get(), (xd1.d) mVar.f193974j.get(), (f01.a) mVar.f193972g.get(), (c90.c) uVar.d.get());
                }
                if (i2 == 1) {
                    ue1.a actionsMapper = new ue1.a();
                    Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
                    return new se1.j();
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                BaseScreen screen = uVar.f194000a;
                te1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new c90.c(screen.m2());
            case 2:
                lf9.m mVar2 = (lf9.m) this.f193989b;
                l70.e eVar = mVar2.f194734b;
                lf9.l lVar3 = (lf9.l) this.e;
                int i3 = this.f193990c;
                if (i3 == 0) {
                    return l70.h.b((jg9.g) lVar3.d.get());
                }
                if (i3 == 1) {
                    tg9.d dVar = new tg9.d();
                    tg9.a aVar = new tg9.a();
                    l80.e eVarH = eVar.h();
                    vc.s.j(eVarH);
                    return new jg9.l(dVar, aVar, eVarH);
                }
                if (i3 == 2) {
                    return l70.h.c((jg9.q) lVar3.f.get());
                }
                if (i3 == 3) {
                    l80.e eVarH2 = eVar.h();
                    vc.s.j(eVarH2);
                    return new jg9.s(eVarH2);
                }
                if (i3 != 4) {
                    throw new AssertionError(i3);
                }
                jg9.q qVar = (jg9.q) lVar3.f.get();
                FormScreenContract$InputData formScreenContract$InputData = lVar3.f194728a;
                wo1.b bVarB = ((up1.e) mVar2.f194736g).b();
                vc.s.j(bVarB);
                return new com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a(qVar, formScreenContract$InputData, bVarB, (w80.b) ((lf9.h) this.d).f194719g.get(), new tsk.t(fe0.c.a()), new of9.n(), new wg9.t(new of9.f((w80.b) lVar3.f194730c.f194719g.get(), new of9.g()), new of9.g()));
            case 3:
                lf9.n nVar = (lf9.n) this.d;
                lf9.m mVar3 = (lf9.m) this.f193989b;
                lf9.o oVar = (lf9.o) this.e;
                int i5 = this.f193990c;
                switch (i5) {
                    case 0:
                        return kxa.j.k((j60.a) oVar.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) oVar.f194755b.get(), (rp0.m) oVar.f194756c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return l70.h.b((jg9.g) oVar.f.get());
                    case 4:
                        tg9.d dVar2 = new tg9.d();
                        tg9.a aVar2 = new tg9.a();
                        l80.e eVarH3 = mVar3.f194734b.h();
                        vc.s.j(eVarH3);
                        return new jg9.l(dVar2, aVar2, eVarH3);
                    case 5:
                        return l70.h.c((jg9.q) oVar.f194758h.get());
                    case 6:
                        l80.e eVarH4 = mVar3.f194734b.h();
                        vc.s.j(eVarH4);
                        return new jg9.s(eVarH4);
                    case 7:
                        jg9.g gVar = (jg9.g) oVar.f.get();
                        gf9.b bVar2 = (gf9.b) nVar.f194752h.get();
                        wo1.b bVarB2 = ((up1.e) mVar3.f194736g).b();
                        vc.s.j(bVarB2);
                        return new rf9.l(gVar, bVar2, bVarB2, new onh.b(new of9.k(new of9.m())), new of9.m());
                    case 8:
                        e4m.e eVar2 = oVar.f;
                        lf9.m mVar4 = oVar.f194754a;
                        jg9.g gVar2 = (jg9.g) eVar2.get();
                        wo1.b bVarB3 = ((up1.e) mVar4.f194736g).b();
                        vc.s.j(bVarB3);
                        xua.a aVarA = mVar4.f194737h.a();
                        vc.s.j(aVarA);
                        kdh.b bVar3 = new kdh.b(bVarB3, aVarA);
                        of9.k kVar = new of9.k(new of9.m());
                        nm1.b bVarA = mVar4.i.a();
                        vc.s.j(bVarA);
                        pf9.g gVar3 = new pf9.g(kVar, bVarA);
                        sm1.d dVar3 = mVar3.i;
                        sm1.d dVar4 = mVar3.i;
                        qm1.h hVarC = dVar3.c();
                        vc.s.j(hVarC);
                        PayBillsAndTaxesNavigation$InputData payBillsAndTaxesNavigation$InputData = nVar.f194748a;
                        nm1.c cVarB = dVar4.b();
                        vc.s.j(cVarB);
                        en1.a aVar3 = (en1.a) dVar4.f264316m.get();
                        vc.s.j(aVar3);
                        return new pf9.e(gVar2, bVar3, gVar3, hVarC, payBillsAndTaxesNavigation$InputData, cVarB, aVar3);
                    case 9:
                        jg9.g gVar4 = (jg9.g) oVar.f.get();
                        wo1.b bVarB4 = ((up1.e) mVar3.f194736g).b();
                        vc.s.j(bVarB4);
                        im1.a aVar4 = (im1.a) mVar3.f194738j.f.get();
                        vc.s.j(aVar4);
                        sf9.i iVar = new sf9.i(new of9.k(new of9.m()), new of9.m());
                        sf9.a aVar5 = new sf9.a();
                        ep1.b bVar4 = (ep1.b) ((up1.e) mVar3.f194736g).f281813n.get();
                        vc.s.j(bVar4);
                        wj0.a aVarI = ((nj0.d) mVar3.f194733a).i();
                        vc.s.j(aVarI);
                        return new sf9.g(gVar4, bVarB4, aVar4, iVar, aVar5, bVar4, aVarI, nVar.f194748a);
                    case 10:
                        oVar.getClass();
                        p56.a aVar6 = new p56.a(new of9.k(new of9.m()), new of9.m());
                        jg9.g gVar5 = (jg9.g) oVar.f.get();
                        wo1.b bVarB5 = ((up1.e) mVar3.f194736g).b();
                        vc.s.j(bVarB5);
                        gte.a aVarB = mVar3.k.b();
                        vc.s.j(aVarB);
                        return new tf9.f(aVar6, gVar5, bVarB5, aVarB, nVar.f194748a);
                    case 11:
                        uf9.e eVar3 = new uf9.e();
                        wo1.b bVarB6 = ((up1.e) mVar3.f194736g).b();
                        vc.s.j(bVarB6);
                        gte.a aVarB2 = mVar3.k.b();
                        vc.s.j(aVarB2);
                        return new uf9.d(eVar3, bVarB6, aVarB2);
                    case 12:
                        nVar.getClass();
                        lf9.m mVar5 = nVar.f194749b;
                        return new bg9.r(new nf9.f(mVar5.e.e(), mVar5.f.a()), ImmutableMap.of("PT", (xf9.a) oVar.f194759j.get(), "BR", (xf9.a) oVar.k.get(), "MX", (xf9.a) oVar.f194760l.get(), "NZ", (xf9.a) oVar.f194761m.get(), "AE", (xf9.a) oVar.f194762n.get()), (rf9.n) oVar.f194759j.get(), (cli.n) oVar.o.get());
                    case 13:
                        return new bg9.s();
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                lf9.q qVar2 = (lf9.q) this.d;
                lf9.m mVar6 = (lf9.m) this.f193989b;
                lf9.p pVar = (lf9.p) this.e;
                int i6 = this.f193990c;
                switch (i6) {
                    case 0:
                        n60.b bVar5 = (n60.b) pVar.e.get();
                        o5k.i.m(bVar5);
                        return bVar5;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) pVar.d.get());
                    case 2:
                        n60.a aVar7 = (n60.a) pVar.f194767g.get();
                        o5k.i.l(aVar7);
                        return aVar7;
                    case 3:
                        return o5k.i.q((com.revolut.kompot.navigable.a) pVar.d.get());
                    case 4:
                        return kxa.j.k((j60.a) pVar.f194769j.get());
                    case 5:
                        return ehe.n.s((com.revolut.kompot.navigable.a) pVar.d.get(), (rp0.m) pVar.i.get());
                    case 6:
                        return new rp0.m();
                    case 7:
                        xdk.b bVar6 = (xdk.b) pVar.f194770l.get();
                        ydk.c.a(bVar6);
                        return bVar6;
                    case 8:
                        xdk.a aVar8 = new xdk.a();
                        z71.a aVarF = ((c21.b) mVar6.f194742p).f();
                        vc.s.j(aVarF);
                        return new xdk.g(aVar8, aVarF, mVar6.f194739l.a());
                    case 9:
                        Object extension = (s5k.a) pVar.o.get();
                        t5k.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar2 = (yji.n) extension;
                        vc.s.k(nVar2);
                        return nVar2;
                    case 10:
                        return new s5k.d((r5k.d) pVar.f194772n.get(), (j60.a) pVar.f194769j.get(), new r5k.a(), new r5k.b());
                    case 11:
                        return new r5k.e();
                    case 12:
                        PaymentAmountContract$InputData paymentAmountContract$InputData = pVar.f194764a;
                        lf9.m mVar7 = pVar.f194765b;
                        p12.l lVar4 = mVar7.f194743q;
                        x02.b bVarI = lVar4.i();
                        vc.s.j(bVarI);
                        x02.a aVarH = lVar4.h();
                        vc.s.j(aVarH);
                        vo9.a aVarB3 = ((ut9.a) mVar7.f194744r).b();
                        vc.s.j(aVarB3);
                        com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.b bVar7 = new com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.b(paymentAmountContract$InputData, bVarI, aVarH, aVarB3, (rh9.e) pVar.f194766c.f.get(), new opf.c0());
                        x02.d dVarK = mVar6.f194743q.k();
                        vc.s.j(dVarK);
                        rh9.e eVar4 = (rh9.e) qVar2.f.get();
                        nh9.d dVar5 = (nh9.d) qVar2.i.get();
                        xdk.b bVar8 = (xdk.b) pVar.f194770l.get();
                        s5k.a aVar9 = (s5k.a) pVar.o.get();
                        n60.a aVar10 = (n60.a) pVar.f194767g.get();
                        ldd.b bVar9 = (ldd.b) pVar.f194774q.get();
                        w80.b bVar10 = (w80.b) pVar.f194775r.get();
                        zof.f fVarD = mVar6.f194746t.d();
                        vc.s.j(fVarD);
                        return new eh9.z(bVar7, dVarK, eVar4, dVar5, bVar8, aVar9, aVar10, bVar9, bVar10, fVarD, (nh9.e) qVar2.f194784l.get(), pVar.f194764a, (cli.n) pVar.f194777t.get());
                    case 13:
                        kdd.b bVar11 = mVar6.f194745s;
                        ldd.a factory = new ldd.a();
                        fh9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return new ldd.b();
                    case 14:
                        qd0.b languageProvider = mVar6.f194734b.n();
                        vc.s.j(languageProvider);
                        fh9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return v80.b.b(languageProvider, false, false, 58);
                    case 15:
                        yof.d dVar6 = (yof.d) pVar.f194776s.get();
                        vo9.a aVarB4 = ((ut9.a) pVar.f194765b.f194744r).b();
                        vc.s.j(aVarB4);
                        return new eh9.q(new gh9.b(dVar6, aVarB4, new u80.o(), (w80.b) pVar.f194775r.get(), (ldd.b) pVar.f194774q.get()), (yof.d) pVar.f194776s.get(), new gh9.d());
                    case 16:
                        ppf.a factory2 = mVar6.f194746t.b();
                        vc.s.j(factory2);
                        ldd.b delegate = (ldd.b) pVar.f194774q.get();
                        fh9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(delegate, "delegate");
                        return ppf.a.a(delegate);
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                lf9.q qVar3 = (lf9.q) this.d;
                lf9.m mVar8 = (lf9.m) this.f193989b;
                p12.l lVar5 = mVar8.f194743q;
                npf.a aVar11 = mVar8.f194746t;
                lf9.r rVar = (lf9.r) this.e;
                PaymentReviewContract$InputData paymentReviewContract$InputData = rVar.f194788a;
                int i21 = this.f193990c;
                switch (i21) {
                    case 0:
                        return kxa.j.k((j60.a) rVar.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) rVar.f194790c.get(), (rp0.m) rVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        i5k.a aVar12 = (i5k.a) rVar.f194791g.get();
                        j5k.b.a(aVar12);
                        return aVar12;
                    case 4:
                        l80.h hVarV = mVar8.f194734b.v();
                        vc.s.j(hVarV);
                        return new i5k.d(hVarV);
                    case 5:
                        PaymentReviewContract$InputData paymentReviewContract$InputData2 = rVar.f194788a;
                        x02.d dVarK2 = lVar5.k();
                        vc.s.j(dVarK2);
                        x02.b bVarI2 = rVar.f194789b.f194743q.i();
                        vc.s.j(bVarI2);
                        return new th9.v(paymentReviewContract$InputData2, dVarK2, new th9.j(paymentReviewContract$InputData, bVarI2), (nh9.d) qVar3.i.get(), (nh9.e) qVar3.f194784l.get(), (cli.n) rVar.k.get());
                    case 6:
                        yof.d dVar7 = (yof.d) rVar.f194793j.get();
                        yof.k kVarG = aVar11.g();
                        vc.s.j(kVarG);
                        q12.g gVarJ = lVar5.j();
                        vc.s.j(gVarJ);
                        return new th9.r(paymentReviewContract$InputData, dVar7, kVarG, gVarJ);
                    case 7:
                        ppf.a factory3 = aVar11.b();
                        vc.s.j(factory3);
                        ldd.b delegate2 = (ldd.b) rVar.i.get();
                        uh9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(delegate2, "delegate");
                        return ppf.a.a(delegate2);
                    case 8:
                        ldd.a factory4 = new ldd.a();
                        uh9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return new ldd.b();
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                lf9.m mVar9 = (lf9.m) this.f193989b;
                l70.e eVar5 = mVar9.f194734b;
                lf9.u uVar2 = (lf9.u) this.e;
                int i22 = this.f193990c;
                if (i22 == 0) {
                    return l70.h.b((jg9.g) uVar2.d.get());
                }
                if (i22 == 1) {
                    tg9.d dVar8 = new tg9.d();
                    tg9.a aVar13 = new tg9.a();
                    l80.e eVarH5 = eVar5.h();
                    vc.s.j(eVarH5);
                    return new jg9.l(dVar8, aVar13, eVarH5);
                }
                if (i22 == 2) {
                    return l70.h.c((jg9.q) uVar2.f.get());
                }
                if (i22 == 3) {
                    l80.e eVarH6 = eVar5.h();
                    vc.s.j(eVarH6);
                    return new jg9.s(eVarH6);
                }
                if (i22 != 4) {
                    if (i22 == 5) {
                        return new com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.b(new of9.f((w80.b) uVar2.f194802c.f194719g.get(), new of9.g()), new of9.g());
                    }
                    throw new AssertionError(i22);
                }
                SubformScreenContract$InputData subformScreenContract$InputData = uVar2.f194800a;
                jg9.q qVar4 = (jg9.q) uVar2.f.get();
                wo1.b bVarB7 = ((up1.e) mVar9.f194736g).b();
                vc.s.j(bVarB7);
                return new com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a(subformScreenContract$InputData, qVar4, bVarB7, (w80.b) ((lf9.h) this.d).f194719g.get(), new of9.n(), (cli.n) uVar2.f194804h.get());
            case 7:
                ljl.j jVar = (ljl.j) this.d;
                ljl.l lVar6 = (ljl.l) this.e;
                q0 q0Var = lVar6.f196015b;
                q0 q0Var2 = (q0) this.f193989b;
                int i32 = this.f193990c;
                switch (i32) {
                    case 0:
                        Object extension2 = (eql.b) lVar6.e.get();
                        fql.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.d dVar9 = (yji.d) extension2;
                        vc.s.k(dVar9);
                        return dVar9;
                    case 1:
                        return new eql.c((eql.i) lVar6.d.get());
                    case 2:
                        th0.a aVar14 = q0Var2.i;
                        return new eql.j(t2d.c.b(aVar14.f271230a, aVar14.f271231b), (gql.a) q0Var2.V.get());
                    case 3:
                        Object extension3 = (eql.i) lVar6.d.get();
                        fql.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar3 = (yji.n) extension3;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 4:
                        mp.p pVarC = jVar.c();
                        fkg.a aVarD = q0Var2.d();
                        iy8.b bVarA2 = q0Var2.f196078t.a();
                        vc.s.j(bVarA2);
                        uil.a aVarA2 = q0Var2.f196057b.a();
                        vc.s.j(aVarA2);
                        p0 p0Var = (p0) q0Var2.H.get();
                        gnl.a aVar15 = (gnl.a) jVar.f195994r.get();
                        z80.b bVarS = q0Var2.f196062g.s();
                        vc.s.j(bVarS);
                        tll.c cVar = (tll.c) q0Var2.f196082w0.get();
                        gql.a aVar16 = (gql.a) q0Var2.V.get();
                        akl.z zVarC = q0Var2.c();
                        eql.i iVar2 = (eql.i) lVar6.d.get();
                        jol.b bVar12 = (jol.b) q0Var2.I.get();
                        q0Var2.f196063h.getClass();
                        return new com.revolut.sso.impl.ui.combined_authentication.unified.a(pVarC, aVarD, bVarA2, aVarA2, p0Var, aVar15, bVarS, cVar, aVar16, zVarC, iVar2, bVar12, new rqk.b(), (col.c) jVar.f195989l.get(), (x7a.d) jVar.f195996t.get(), (cli.n) lVar6.i.get());
                    case 5:
                        qll.r rVar2 = lVar6.f196014a;
                        z80.b bVarS2 = q0Var.f196062g.s();
                        vc.s.j(bVarS2);
                        sll.h hVar = new sll.h(bVarS2, lVar6.f196014a);
                        z80.b phoneToolsProvider = q0Var.f196062g.s();
                        vc.s.j(phoneToolsProvider);
                        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
                        sll.i iVar3 = new sll.i(phoneToolsProvider);
                        z80.b phoneToolsProvider2 = q0Var.f196062g.s();
                        vc.s.j(phoneToolsProvider2);
                        Intrinsics.checkNotNullParameter(phoneToolsProvider2, "phoneToolsProvider");
                        return new qll.i0(rVar2, hVar, iVar3, new sll.b(phoneToolsProvider2), new sll.e((tll.p) lVar6.f196018h.get()));
                    case 6:
                        return new tll.r();
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                ljl.f0 f0Var = (ljl.f0) this.e;
                q0 q0Var3 = (q0) this.f193989b;
                int i33 = this.f193990c;
                if (i33 == 0) {
                    Object extension4 = (col.c) f0Var.f195938a.get();
                    dol.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    yji.n nVar4 = (yji.n) extension4;
                    vc.s.k(nVar4);
                    return nVar4;
                }
                if (i33 == 1) {
                    com.revolut.kompot.navigable.a aVar17 = (com.revolut.kompot.navigable.a) ((ljl.g0) this.d).d.get();
                    wl0.c cVarA = q0Var3.f.a();
                    ph0.d dVarA = t2d.c.a(q0Var3.i.f271230a);
                    l80.e eVarH7 = q0Var3.f196062g.h();
                    vc.s.j(eVarH7);
                    return new col.i(aVar17, cVarA, dVarA, eVarH7);
                }
                if (i33 == 2) {
                    n1 n1Var = (n1) q0Var3.p0.get();
                    akl.l lVar7 = (akl.l) q0Var3.U.get();
                    akl.z zVarC2 = q0Var3.c();
                    col.c cVar2 = (col.c) f0Var.f195938a.get();
                    uil.a aVarA3 = q0Var3.f196057b.a();
                    vc.s.j(aVarA3);
                    return new eol.l(n1Var, lVar7, zVarC2, cVar2, aVarA3, (p0) q0Var3.H.get(), (xjl.i) q0Var3.Z.get(), (g1) f0Var.d.get(), (cli.n) f0Var.e.get());
                }
                if (i33 != 3) {
                    if (i33 == 4) {
                        return new eol.m();
                    }
                    throw new AssertionError(i33);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) f0Var.f195940c.get();
                hol.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 9:
                ljl.c cVar3 = (ljl.c) this.d;
                k1 k1Var = (k1) this.e;
                q0 q0Var4 = (q0) this.f193989b;
                l70.e eVar6 = q0Var4.f196062g;
                int i43 = this.f193990c;
                if (i43 == 0) {
                    Object extension5 = (eql.b) k1Var.d.get();
                    fql.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension5, "extension");
                    yji.d dVar10 = (yji.d) extension5;
                    vc.s.k(dVar10);
                    return dVar10;
                }
                if (i43 == 1) {
                    return new eql.c((eql.i) k1Var.f196011c.get());
                }
                if (i43 == 2) {
                    th0.a aVar18 = q0Var4.i;
                    return new eql.j(t2d.c.b(aVar18.f271230a, aVar18.f271231b), (gql.a) q0Var4.V.get());
                }
                if (i43 == 3) {
                    Object extension6 = (eql.i) k1Var.f196011c.get();
                    fql.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension6, "extension");
                    yji.n nVar5 = (yji.n) extension6;
                    vc.s.k(nVar5);
                    return nVar5;
                }
                if (i43 != 4) {
                    if (i43 != 5) {
                        throw new AssertionError(i43);
                    }
                    IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData = k1Var.f196010b;
                    z80.b bVarS3 = eVar6.s();
                    vc.s.j(bVarS3);
                    return new com.revolut.sso.impl.ui.identifier_input.a(identifierInputScreenContract$InputData, bVarS3, (p0) q0Var4.H.get(), (tll.c) q0Var4.f196082w0.get());
                }
                jki.p pVar2 = (jki.p) k1Var.f196012g.get();
                mp.p pVarS = cVar3.s();
                akl.z zVarC3 = q0Var4.c();
                gnl.a aVarY = cVar3.y();
                fkg.a aVarD2 = q0Var4.d();
                jol.b bVar13 = (jol.b) q0Var4.I.get();
                q0Var4.f196063h.getClass();
                rqk.b bVar14 = new rqk.b();
                eql.i iVar4 = (eql.i) k1Var.f196011c.get();
                gql.a aVar19 = (gql.a) q0Var4.V.get();
                IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData2 = k1Var.f196010b;
                z80.b bVarS4 = eVar6.s();
                vc.s.j(bVarS4);
                col.c cVar4 = (col.c) cVar3.f195905w.get();
                p0 p0Var2 = (p0) q0Var4.H.get();
                iy8.b bVarA3 = q0Var4.f196078t.a();
                vc.s.j(bVarA3);
                return new gnl.s(pVar2, pVarS, zVarC3, aVarY, aVarD2, bVar13, bVar14, iVar4, aVar19, identifierInputScreenContract$InputData2, bVarS4, cVar4, p0Var2, bVarA3, cVar3.R);
            case 10:
                w0 w0Var = (w0) this.d;
                k1 k1Var2 = (k1) this.e;
                q0 q0Var5 = (q0) this.f193989b;
                l70.e eVar7 = q0Var5.f196062g;
                int i59 = this.f193990c;
                if (i59 == 0) {
                    Object extension7 = (eql.b) k1Var2.d.get();
                    fql.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension7, "extension");
                    yji.d dVar11 = (yji.d) extension7;
                    vc.s.k(dVar11);
                    return dVar11;
                }
                if (i59 == 1) {
                    return new eql.c((eql.i) k1Var2.f196011c.get());
                }
                if (i59 == 2) {
                    th0.a aVar20 = q0Var5.i;
                    return new eql.j(t2d.c.b(aVar20.f271230a, aVar20.f271231b), (gql.a) q0Var5.V.get());
                }
                if (i59 == 3) {
                    Object extension8 = (eql.i) k1Var2.f196011c.get();
                    fql.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension8, "extension");
                    yji.n nVar6 = (yji.n) extension8;
                    vc.s.k(nVar6);
                    return nVar6;
                }
                if (i59 != 4) {
                    if (i59 != 5) {
                        throw new AssertionError(i59);
                    }
                    IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData3 = k1Var2.f196010b;
                    z80.b bVarS5 = eVar7.s();
                    vc.s.j(bVarS5);
                    return new com.revolut.sso.impl.ui.identifier_input.a(identifierInputScreenContract$InputData3, bVarS5, (p0) q0Var5.H.get(), (tll.c) q0Var5.f196082w0.get());
                }
                jki.p pVar3 = (jki.p) k1Var2.f196012g.get();
                mp.p pVarB = q0Var5.b();
                akl.z zVarC4 = q0Var5.c();
                gnl.a aVarC = w0Var.c();
                fkg.a aVarD3 = q0Var5.d();
                jol.b bVar15 = (jol.b) q0Var5.I.get();
                q0Var5.f196063h.getClass();
                rqk.b bVar16 = new rqk.b();
                eql.i iVar5 = (eql.i) k1Var2.f196011c.get();
                gql.a aVar21 = (gql.a) q0Var5.V.get();
                IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData4 = k1Var2.f196010b;
                z80.b bVarS6 = eVar7.s();
                vc.s.j(bVarS6);
                col.c cVar5 = (col.c) w0Var.f196127g.get();
                p0 p0Var3 = (p0) q0Var5.H.get();
                iy8.b bVarA4 = q0Var5.f196078t.a();
                vc.s.j(bVarA4);
                return new gnl.s(pVar3, pVarB, zVarC4, aVarC, aVarD3, bVar15, bVar16, iVar5, aVar21, identifierInputScreenContract$InputData4, bVarS6, cVar5, p0Var3, bVarA4, w0Var.f196133p);
            case 11:
                ljl.j jVar2 = (ljl.j) this.d;
                k1 k1Var3 = (k1) this.e;
                q0 q0Var6 = (q0) this.f193989b;
                l70.e eVar8 = q0Var6.f196062g;
                int i66 = this.f193990c;
                if (i66 == 0) {
                    Object extension9 = (eql.b) k1Var3.d.get();
                    fql.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension9, "extension");
                    yji.d dVar12 = (yji.d) extension9;
                    vc.s.k(dVar12);
                    return dVar12;
                }
                if (i66 == 1) {
                    return new eql.c((eql.i) k1Var3.f196011c.get());
                }
                if (i66 == 2) {
                    th0.a aVar22 = q0Var6.i;
                    return new eql.j(t2d.c.b(aVar22.f271230a, aVar22.f271231b), (gql.a) q0Var6.V.get());
                }
                if (i66 == 3) {
                    Object extension10 = (eql.i) k1Var3.f196011c.get();
                    fql.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension10, "extension");
                    yji.n nVar7 = (yji.n) extension10;
                    vc.s.k(nVar7);
                    return nVar7;
                }
                if (i66 != 4) {
                    if (i66 != 5) {
                        throw new AssertionError(i66);
                    }
                    IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData5 = k1Var3.f196010b;
                    z80.b bVarS7 = eVar8.s();
                    vc.s.j(bVarS7);
                    return new com.revolut.sso.impl.ui.identifier_input.a(identifierInputScreenContract$InputData5, bVarS7, (p0) q0Var6.H.get(), (tll.c) q0Var6.f196082w0.get());
                }
                jki.p pVar4 = (jki.p) k1Var3.f196012g.get();
                mp.p pVarC2 = jVar2.c();
                akl.z zVarC5 = q0Var6.c();
                gnl.a aVar23 = (gnl.a) jVar2.f195994r.get();
                fkg.a aVarD4 = q0Var6.d();
                jol.b bVar17 = (jol.b) q0Var6.I.get();
                q0Var6.f196063h.getClass();
                rqk.b bVar18 = new rqk.b();
                eql.i iVar6 = (eql.i) k1Var3.f196011c.get();
                gql.a aVar24 = (gql.a) q0Var6.V.get();
                IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData6 = k1Var3.f196010b;
                z80.b bVarS8 = eVar8.s();
                vc.s.j(bVarS8);
                col.c cVar6 = (col.c) jVar2.f195989l.get();
                p0 p0Var4 = (p0) q0Var6.H.get();
                iy8.b bVarA5 = q0Var6.f196078t.a();
                vc.s.j(bVarA5);
                return new gnl.s(pVar4, pVarC2, zVarC5, aVar23, aVarD4, bVar17, bVar18, iVar6, aVar24, identifierInputScreenContract$InputData6, bVarS8, cVar6, p0Var4, bVarA5, jVar2.f195996t);
            case 12:
                w0 w0Var2 = (w0) this.d;
                m1 m1Var = (m1) this.e;
                q0 q0Var7 = (q0) this.f193989b;
                int i74 = this.f193990c;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new com.revolut.sso.impl.ui.phone.enter_phone.b(m1Var.f196034b, (tll.c) q0Var7.f196082w0.get());
                    }
                    throw new AssertionError(i74);
                }
                EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData = m1Var.f196034b;
                cli.n nVar8 = (cli.n) m1Var.f196035c.get();
                akl.z zVarC6 = q0Var7.c();
                gnl.a aVarC2 = w0Var2.c();
                z80.b bVarS9 = q0Var7.f196062g.s();
                vc.s.j(bVarS9);
                return new com.revolut.sso.impl.ui.phone.enter_phone.a(enterPhoneScreenContract$InputData, nVar8, zVarC6, aVarC2, bVarS9, (tll.a) q0Var7.E0.get(), w0Var2.f196133p);
            case 13:
                ljl.h hVar2 = (ljl.h) this.d;
                m1 m1Var2 = (m1) this.e;
                q0 q0Var8 = (q0) this.f193989b;
                int i92 = this.f193990c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new com.revolut.sso.impl.ui.phone.enter_phone.b(m1Var2.f196034b, (tll.c) q0Var8.f196082w0.get());
                    }
                    throw new AssertionError(i92);
                }
                EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData2 = m1Var2.f196034b;
                cli.n nVar9 = (cli.n) m1Var2.f196035c.get();
                akl.z zVarC7 = q0Var8.c();
                q0 q0Var9 = hVar2.f195956c;
                Context context = q0Var9.f196055a;
                g90.a aVarW = q0Var9.f196062g.w();
                vc.s.j(aVarW);
                gnl.a aVar25 = new gnl.a(context, aVarW);
                z80.b bVarS10 = q0Var8.f196062g.s();
                vc.s.j(bVarS10);
                return new com.revolut.sso.impl.ui.phone.enter_phone.a(enterPhoneScreenContract$InputData2, nVar9, zVarC7, aVar25, bVarS10, (tll.a) q0Var8.E0.get(), hVar2.f195965r);
            case 14:
                ljl.c cVar7 = (ljl.c) this.d;
                m1 m1Var3 = (m1) this.e;
                q0 q0Var10 = (q0) this.f193989b;
                int i96 = this.f193990c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new com.revolut.sso.impl.ui.phone.enter_phone.b(m1Var3.f196034b, (tll.c) q0Var10.f196082w0.get());
                    }
                    throw new AssertionError(i96);
                }
                EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData3 = m1Var3.f196034b;
                cli.n nVar10 = (cli.n) m1Var3.f196035c.get();
                akl.z zVarC8 = q0Var10.c();
                gnl.a aVarY2 = cVar7.y();
                z80.b bVarS11 = q0Var10.f196062g.s();
                vc.s.j(bVarS11);
                return new com.revolut.sso.impl.ui.phone.enter_phone.a(enterPhoneScreenContract$InputData3, nVar10, zVarC8, aVarY2, bVarS11, (tll.a) q0Var10.E0.get(), cVar7.R);
            case 15:
                lne.e eVar9 = (lne.e) this.e;
                int i99 = this.f193990c;
                if (i99 == 0) {
                    return kxa.j.k((j60.a) eVar9.f197231c.get());
                }
                if (i99 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) eVar9.f197229a.get(), (rp0.m) eVar9.f197230b.get());
                }
                if (i99 == 2) {
                    return new rp0.m();
                }
                if (i99 == 3) {
                    return new vne.i(((lne.d) this.d).f197226a, (cli.n) eVar9.e.get(), (nne.b) ((lne.c) this.f193989b).o.get(), (j60.a) eVar9.f197231c.get());
                }
                if (i99 == 4) {
                    return new vne.j();
                }
                throw new AssertionError(i99);
            case 16:
                return a();
            case 17:
                return b();
            case 18:
                return c();
            case 19:
                return d();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                return h();
            case 24:
                return i();
            case 25:
                return j();
            case 26:
                return k();
            case 27:
                return l();
            case 28:
                return m();
            default:
                ned.a aVar26 = (ned.a) this.e;
                ned.e eVar10 = (ned.e) this.f193989b;
                k2d.e eVar11 = eVar10.f214446g;
                int i100 = this.f193990c;
                if (i100 != 0) {
                    if (i100 != 1) {
                        if (i100 == 2) {
                            return new ped.b();
                        }
                        throw new AssertionError(i100);
                    }
                    ffd.a aVarB5 = eVar11.b();
                    vc.s.j(aVarB5);
                    return new ved.p(aVarB5, (sfd.e) eVar10.f214450m.get());
                }
                jki.p pVar5 = (jki.p) aVar26.f214432b.get();
                efd.a aVarA4 = eVar11.a();
                vc.s.j(aVarA4);
                SharedAlertDetailsScreenContract$InputData sharedAlertDetailsScreenContract$InputData = aVar26.f214431a;
                sfd.b bVar19 = (sfd.b) eVar10.f214451n.get();
                n3d.c cVarA2 = eVar10.e.a();
                vc.s.j(cVarA2);
                return new ved.o(pVar5, aVarA4, sharedAlertDetailsScreenContract$InputData, bVar19, cVarA2, (g1) ((ned.d) this.d).f.get(), (ped.a) aVar26.f214433c.get());
        }
    }
}
