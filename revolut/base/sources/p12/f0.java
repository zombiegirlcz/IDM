package p12;

import android.content.Context;
import android.content.Intent;
import b9.w2;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$InputData;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerContract$Configuration;
import com.revolut.feature.instruments.trend.collections.api.feedwidget.InstrumentsTrendCollectionsFeedWidgetContext;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import ip0.v7;
import java.util.Collection;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n33.f2;
import n33.t2;
import qgk.k3;
import sgm.e3;

/* JADX INFO: loaded from: classes20.dex */
public final class f0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f231657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f231658c;
    public final Object d;

    public /* synthetic */ f0(Object obj2, Object obj3, int i, int i2) {
        this.f231656a = i2;
        this.f231657b = obj2;
        this.d = obj3;
        this.f231658c = i;
    }

    private final Object a() {
        p2k.x xVar = (p2k.x) this.f231657b;
        p2k.y yVar = (p2k.y) this.d;
        int i = this.f231658c;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) yVar.f.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) yVar.d.get(), (rp0.m) yVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.b bVar = (n60.b) yVar.f232522h.get();
                o5k.i.n(bVar);
                return bVar;
            case 4:
                return o5k.i.s((com.revolut.kompot.navigable.a) yVar.d.get());
            case 5:
                n60.a aVar = (n60.a) yVar.f232523j.get();
                o5k.i.k(aVar);
                return aVar;
            case 6:
                return o5k.i.p((com.revolut.kompot.navigable.a) yVar.d.get());
            case 7:
                return n57.a.z(xVar.f232503c.c(), (mga.i0) yVar.f232524l.get(), (mga.f0) yVar.f232526n.get(), (on.a) yVar.o.get());
            case 8:
                yji.o controller = (com.revolut.kompot.navigable.a) yVar.d.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                vc.s.k(i0Var);
                return i0Var;
            case 9:
                return nga.c.t(yVar.f232518a, xVar.f232503c.c(), (wn.a) yVar.f232525m.get());
            case 10:
                return v7.z(xVar.o, "provider");
            case 11:
                os2.g factory = xVar.o.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 12:
                m3k.d extension = (m3k.d) yVar.f232530s.get();
                l3k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 13:
                o3k.g gVarM = yVar.m();
                r3k.f fVar = (r3k.f) yVar.f232529r.get();
                lpf.a aVar2 = xVar.f232509n;
                so9.b bVar2 = xVar.v;
                opf.c0 c0Var = new opf.c0();
                vo9.a aVarB = ((ut9.a) bVar2).b();
                vc.s.j(aVarB);
                wt9.e eVarC = ((ut9.a) bVar2).c();
                vc.s.j(eVarC);
                return new m3k.d(gVarM, fVar, c0Var, aVarB, eVarC, yVar.l());
            case 14:
                RemittanceAmountScreenContract$InputData remittanceAmountScreenContract$InputData = yVar.f232519b;
                p2k.x xVar2 = yVar.f232520c;
                a4k.a aVar3 = (a4k.a) yVar.f232528q.get();
                r3k.a aVar4 = new r3k.a();
                g3k.d dVarB = xVar.k.b();
                vc.s.j(dVarB);
                k61.a aVarE = xVar.f232513s.e();
                vc.s.j(aVarE);
                u5k.c cVar = (u5k.c) xVar.L.get();
                wsg.n nVarB = xVar.f232508m.b();
                ang.f fVarE = xVar.f232511q.e();
                l1l.a aVar5 = new l1l.a();
                l1l.d dVar = new l1l.d();
                gte.a aVarB2 = xVar2.u.b();
                vc.s.j(aVarB2);
                l1l.s sVar = new l1l.s(aVarB2);
                l1l.m mVar = new l1l.m();
                l1l.q qVar = new l1l.q();
                urf.f fVar2 = new urf.f();
                l80.e eVarH = xVar2.f232502b.h();
                vc.s.j(eVarH);
                e5k.b bVar3 = new e5k.b(eVarH, 1);
                t3k.c cVar2 = new t3k.c();
                t3k.e eVar = new t3k.e();
                l1l.o oVar = new l1l.o();
                gte.a aVarB3 = xVar2.u.b();
                vc.s.j(aVarB3);
                return new r3k.f(remittanceAmountScreenContract$InputData, aVar3, aVar4, dVarB, aVarE, cVar, nVarB, fVarE, aVar5, dVar, sVar, mVar, qVar, fVar2, bVar3, cVar2, eVar, oVar, new l1l.h(aVarB3, 1));
            case 15:
                a4k.c.Companion.getClass();
                return new a4k.a();
            case 16:
                r3k.f extension2 = (r3k.f) yVar.f232529r.get();
                l3k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 17:
                xdk.b extension3 = (xdk.b) yVar.v.get();
                ydk.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 18:
                xdk.a aVar6 = new xdk.a();
                z71.a aVarF = ((c21.b) xVar.f232515w).f();
                vc.s.j(aVarF);
                return new xdk.g(aVar6, aVarF, xVar.f232508m.a());
            case 19:
                return o5k.b.a((n5k.b) yVar.E.get());
            case 20:
                n5k.a aVar7 = (n5k.a) yVar.f232533x.get();
                p5k.h hVar = (p5k.h) yVar.C.get();
                ffk.t tVarF = xVar.D.f();
                vc.s.j(tVarF);
                ang.f fVarE2 = xVar.f232511q.e();
                wif.a aVarA = xVar.C.a();
                gte.a aVarB4 = xVar.u.b();
                vc.s.j(aVarB4);
                j60.a aVar8 = (j60.a) yVar.f.get();
                qpk.b bVar4 = new qpk.b();
                v2k.c cVarA = xVar.f232517y.a();
                mre.c cVarB = xVar.E.b();
                vc.s.j(cVarB);
                z0h.a aVarB5 = ((u8h.b) xVar.A).b();
                vc.s.j(aVarB5);
                l80.e eVarH2 = yVar.f232520c.f232502b.h();
                vc.s.j(eVarH2);
                return new n5k.p(aVar7, hVar, tVarF, fVarE2, aVarA, aVarB4, aVar8, bVar4, cVarA, cVarB, aVarB5, new p5k.a(eVarH2), xVar.F.b(), (n5k.q) yVar.D.get());
            case 21:
                return new n3k.g(yVar.f232519b, (a4k.a) yVar.f232528q.get(), yVar.m(), xVar.f232511q.e(), yVar.l());
            case 22:
                p5k.b bVar5 = (p5k.b) yVar.f232534y.get();
                p5k.w wVar = (p5k.w) yVar.A.get();
                tga.k kVarB = xVar.z.b();
                m5k.b bVarD = yVar.d();
                p2k.x xVar3 = yVar.f232520c;
                return new p5k.k(bVar5, wVar, kVarB, bVarD, new jt0.b(xVar3.z.b(), xVar3.C.a(), yVar.d()), yVar.e(), new RateExplanationDialogMapper());
            case 23:
                return new p5k.d();
            case 24:
                p5k.y yVar2 = (p5k.y) yVar.z.get();
                k5i.c cVarA2 = xVar.f232516x.a();
                p5k.f fVarE3 = yVar.e();
                p2k.x xVar4 = yVar.f232520c;
                j9l.a aVar9 = new j9l.a();
                gte.a aVarB6 = xVar4.u.b();
                vc.s.j(aVarB6);
                return new p5k.x(yVar2, cVarA2, fVarE3, new kgm.i(aVar9, aVarB6), new p5k.p());
            case 25:
                return new p5k.y();
            case 26:
                aah.i iVarD = ((u8h.b) xVar.A).d();
                vc.s.j(iVarD);
                return o5k.i.B(iVarD);
            case 27:
                return new n5k.r(new RateExplanationDialogMapper());
            case 28:
                return nga.c.a((n5k.q) yVar.D.get());
            case 29:
                return t5k.b.a((s5k.a) yVar.I.get());
            case 30:
                return new s5k.d((r5k.d) yVar.H.get(), (j60.a) yVar.f.get(), new r5k.a(), new r5k.b());
            case 31:
                return new r5k.e();
            case 32:
                wn.a aVar10 = (wn.a) yVar.f232525m.get();
                n57.a.c(aVar10);
                return aVar10;
            case 33:
                RemittanceAmountScreenContract$InputData remittanceAmountScreenContract$InputData2 = yVar.f232519b;
                p2k.x xVar5 = yVar.f232520c;
                o3k.g gVarM2 = yVar.m();
                g3k.d dVarB2 = xVar5.k.b();
                vc.s.j(dVarB2);
                fk3.a aVarA2 = xVar5.f232510p.a();
                vc.s.j(aVarA2);
                gte.a aVarB7 = xVar5.u.b();
                vc.s.j(aVarB7);
                om4.k0 k0VarQ = xVar5.G.q();
                vc.s.j(k0VarQ);
                k3k.i iVar = new k3k.i(dVarB2, aVarA2, aVarB7, k0VarQ);
                a4k.a aVar11 = (a4k.a) yVar.f232528q.get();
                com.revolut.feature.external_accounts.api.navigation.a aVarB8 = ((xf6.t) xVar.H).b();
                vc.s.j(aVarB8);
                l80.e eVarH3 = xVar5.f232502b.h();
                vc.s.j(eVarH3);
                p3k.b bVar6 = new p3k.b(eVarH3);
                e3k.e eVar2 = new e3k.e();
                f2k.k kVar = new f2k.k(xVar.f232504g.f232326a.g());
                zof.f fVarD = xVar.e.d();
                vc.s.j(fVarD);
                m3k.d dVar2 = (m3k.d) yVar.f232530s.get();
                r3k.f fVar3 = (r3k.f) yVar.f232529r.get();
                n5k.b bVar7 = (n5k.b) yVar.E.get();
                s5k.a aVar12 = (s5k.a) yVar.I.get();
                xdk.b bVar8 = (xdk.b) yVar.v.get();
                gte.a aVarB9 = xVar.u.b();
                vc.s.j(aVarB9);
                j60.a aVar13 = (j60.a) yVar.f.get();
                n60.a aVar14 = (n60.a) yVar.f232523j.get();
                l2j.a aVar15 = new l2j.a();
                w80.b bVar9 = (w80.b) yVar.L.get();
                l80.e eVarH4 = xVar.f232502b.h();
                vc.s.j(eVarH4);
                return new k3k.t0(remittanceAmountScreenContract$InputData2, gVarM2, iVar, aVar11, aVarB8, bVar6, eVar2, kVar, fVarD, dVar2, fVar3, bVar7, aVar12, bVar8, aVarB9, aVar13, aVar14, aVar15, bVar9, eVarH4, (ldd.b) yVar.M.get(), yVar.l(), (jki.p) yVar.O.get());
            case 34:
                qd0.b languageProvider = xVar.f232502b.n();
                vc.s.j(languageProvider);
                l3k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 35:
                kdd.b bVar10 = xVar.I;
                ldd.a factory2 = new ldd.a();
                l3k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new ldd.b();
            case 36:
                e4m.e eVar3 = yVar.N;
                p2k.x xVar6 = yVar.f232520c;
                yof.d dVar3 = (yof.d) eVar3.get();
                vo9.a aVarB10 = ((ut9.a) xVar6.v).b();
                vc.s.j(aVarB10);
                u80.o oVar2 = new u80.o();
                w80.b bVar11 = (w80.b) yVar.L.get();
                ldd.b bVar12 = (ldd.b) yVar.M.get();
                yof.d dVar4 = (yof.d) yVar.N.get();
                yof.d dVar5 = (yof.d) yVar.N.get();
                gte.a aVarB11 = xVar6.u.b();
                vc.s.j(aVarB11);
                p3k.e eVar4 = new p3k.e(dVar3, aVarB10, oVar2, bVar11, bVar12, new kdh.b(dVar4, new c8k.a(dVar5, aVarB11, 3)));
                l80.e eVarH5 = xVar6.f232502b.h();
                vc.s.j(eVarH5);
                return new k3k.d0(eVar4, new p3k.b(eVarH5), (yof.d) yVar.N.get(), new e3k.e());
            case 37:
                ppf.a factory3 = xVar.e.b();
                vc.s.j(factory3);
                ldd.b delegate = (ldd.b) yVar.M.get();
                l3k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        p33.b bVar = (p33.b) this.f231657b;
        p33.a aVar = (p33.a) this.d;
        int i = this.f231658c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f232561a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f232561a);
                t70.g gVarO = bVar.f232580b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f232564g.get(), gsi.c.a(aVar.f232561a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f232561a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f232561a));
            case 5:
                return new iri.g((iri.j) bVar.L.get(), (iri.m) bVar.M.get(), bq.i.f(aVar.f232561a), bq.i.l(aVar.f232561a));
            case 6:
                return new iri.l((iri.m) bVar.M.get(), bq.i.f(aVar.f232561a), (iri.d) aVar.k.get());
            case 7:
                return new iri.d(bq.i.f(aVar.f232561a));
            case 8:
                return new opi.b(bq.i.f(aVar.f232561a));
            case 9:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.N.get(), bVar.b());
            case 10:
                um.c cVar = (um.c) bVar.O.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                p33.b bVar2 = aVar.d;
                hn.h hVar = (hn.h) bVar2.P.get();
                t70.g gVarO2 = bVar2.f232580b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.c());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.o)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.b());
            case 11:
                return bq.i.t(aVar.f232561a);
            case 12:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f232571q.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f232565h)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.R.get(), bVar.b());
            case 13:
                return new zm.a();
            case 14:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.d.c());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.P.get(), (npi.f) aVar.f.get());
            case 15:
                return new en.c(ImmutableSet.of((ln.d) aVar.d.Q.get()), bq.i.l(aVar.f232561a));
            case 16:
                return new gn.c((lpi.e) aVar.u.get(), (sm.e) bVar.Y.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.b());
            case 17:
                return new lpi.b(bq.i.i(aVar.f232561a), bq.i.j(aVar.f232561a));
            case 18:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.Z.get(), bVar.b());
            case 19:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                p33.b bVar3 = aVar.d;
                builderBuilderWithExpectedSize4.add(bVar3.f232581b0.get());
                return new g3l.c(j6.a.g(bVar3.W, builderBuilderWithExpectedSize4), (g3l.g) bVar.U.get(), (k3l.b) aVar.f232576x.get(), bVar.b());
            case 20:
                return new k3l.d(bq.i.b(aVar.f232561a));
            case 21:
                return new hqi.f(aVar.f232562b, bq.i.b(aVar.f232561a));
            case 22:
                e4m.e eVar = aVar.f232565h;
                p33.b bVar4 = aVar.d;
                xoi.d dVar = aVar.f232561a;
                tpi.j jVar = (tpi.j) eVar.get();
                f9b.f fVar = (f9b.f) aVar.o.get();
                npi.f fVar2 = (npi.f) aVar.f.get();
                k3l.b bVar5 = (k3l.b) aVar.f232576x.get();
                sri.m mVarL = bq.i.l(dVar);
                n33.r rVar = (n33.r) bVar.c0.get();
                n33.u uVar = (n33.u) bVar.f232583d0.get();
                ite.a aVar2 = bVar4.F;
                gte.a aVarB = aVar2.b();
                vc.s.j(aVarB);
                n33.c0 c0Var = new n33.c0(aVarB);
                bbj.c cVarA = bVar4.H.a();
                vc.s.j(cVarA);
                gte.a aVarB2 = aVar2.b();
                vc.s.j(aVarB2);
                n33.f0 f0Var = new n33.f0(c0Var, cVarA, aVarB2);
                cha.a aVar3 = (cha.a) bVar4.u.K.get();
                vc.s.j(aVar3);
                t2 t2Var = new t2(aVar3, ((k3) bVar4.I).b());
                OrderNewCardContract$Configuration orderNewCardContract$Configuration = aVar.f232563c;
                opi.d dVar2 = (opi.d) aVar.f232568m.get();
                n33.d dVar3 = new n33.d();
                b23.m mVar = new b23.m();
                gte.a aVarB3 = bVar.F.b();
                vc.s.j(aVarB3);
                f2 f2Var = new f2(jVar, fVar, fVar2, bVar5, mVarL, rVar, uVar, f0Var, t2Var, orderNewCardContract$Configuration, dVar2, dVar3, mVar, aVarB3);
                kli.a.p(f2Var, bq.i.d(dVar));
                return f2Var;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        p5i.b bVar = (p5i.b) this.f231657b;
        p5i.a aVar = (p5i.a) this.d;
        int i = this.f231658c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f233122a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f233122a);
                t70.g gVarO = bVar.f233139a.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f.get(), gsi.c.a(aVar.f233122a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f233122a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f233122a));
            case 5:
                return new iri.g((iri.j) bVar.f233148p.get(), (iri.m) bVar.f233149q.get(), bq.i.f(aVar.f233122a), bq.i.l(aVar.f233122a));
            case 6:
                return new iri.l((iri.m) bVar.f233149q.get(), bq.i.f(aVar.f233122a), (iri.d) aVar.f233127j.get());
            case 7:
                return new iri.d(bq.i.f(aVar.f233122a));
            case 8:
                return new opi.b(bq.i.f(aVar.f233122a));
            case 9:
                return new en.c(ImmutableSet.of((ln.d) aVar.f233124c.f233150r.get()), bq.i.l(aVar.f233122a));
            case 10:
                o5i.c cVarA = bVar.a();
                s5i.b bVar2 = new s5i.b();
                p5i.b bVar3 = aVar.f233124c;
                return new g5i.a(cVarA, new g5i.e(bVar2, new l4i.a()));
            case 11:
                return new r5i.a(new r5i.d());
            case 12:
                l80.e eVarH = aVar.f233124c.f233139a.h();
                vc.s.j(eVarH);
                return new q5i.a(new q5i.b(new p5k.a(eVarH)));
            case 13:
                return new c5i.a(new c5i.b());
            case 14:
                return new i5i.b(bVar.a(), new i5i.g());
            case 15:
                j5i.d mapper = new j5i.d();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new j5i.a();
            case 16:
                return new d5i.a(new d5i.b());
            case 17:
                s5i.k kVarF = aVar.f();
                p5i.b bVar4 = aVar.f233124c;
                gte.a aVarB = bVar4.f233144j.b();
                vc.s.j(aVarB);
                n5i.f fVar = new n5i.f(kVarF, aVarB, aVar.e());
                s5i.k kVarF2 = aVar.f();
                gte.a aVarB2 = bVar4.f233144j.b();
                vc.s.j(aVarB2);
                ks0.n nVar = new ks0.n(new n5i.f(kVarF2, aVarB2, aVar.e()));
                s5i.k kVarF3 = aVar.f();
                ite.a aVar2 = bVar4.f233144j;
                gte.a aVarB3 = aVar2.b();
                vc.s.j(aVarB3);
                n5i.d dVar = new n5i.d(kVarF3, aVarB3, aVar.e());
                n5i.n nVar2 = new n5i.n(aVar.f());
                n5i.p pVar = new n5i.p(aVar.f());
                s5i.k kVarF4 = aVar.f();
                s5i.b bVar5 = new s5i.b();
                gte.a aVarB4 = aVar2.b();
                vc.s.j(aVarB4);
                n5i.q qVar = new n5i.q(kVarF4, bVar5, aVarB4);
                n5i.a aVar3 = new n5i.a(aVar.f(), new s5i.b());
                n5i.i iVar = new n5i.i(aVar.f(), new s5i.b());
                n5i.l lVar = new n5i.l(aVar.f());
                s5i.k kVarF5 = aVar.f();
                gte.a aVarB5 = aVar2.b();
                vc.s.j(aVarB5);
                return new l5i.f(new l5i.q(fVar, nVar, dVar, nVar2, pVar, qVar, aVar3, iVar, lVar, new lal.a(kVarF5, aVarB5, aVar.e(), new p5k.p())), bVar.k.b(), new m5i.a(), bVar.a());
            case 18:
                return new e5i.a(new e5i.b());
            case 19:
                f5i.b mapper2 = new f5i.b();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                return new f5i.a();
            case 20:
                RateExplanationDialogMapper dialogMapper = new RateExplanationDialogMapper();
                Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
                return new l5i.a();
            case 21:
                qga.b bVar6 = bVar.f233145l;
                vn.a aVar4 = bVar.f233146m;
                return n57.a.A(bVar6.c(), (ln.a) bVar.f233150r.get(), (wm.e) bVar.f233151s.get(), aVar4.c(), aVar4.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        p7c.h hVar = (p7c.h) this.d;
        p7c.r rVar = (p7c.r) this.f231657b;
        l70.e eVar = rVar.f233675g;
        int i = this.f231658c;
        if (i == 0) {
            u80.t tVarU = eVar.u();
            vc.s.j(tVarU);
            return new b9c.k(tVarU, (q7c.c) rVar.f233688r0.get(), rVar.f233681m.b(), (jki.p) hVar.f233615b.get());
        }
        if (i == 1) {
            w80.b bVar = (w80.b) hVar.f233614a.get();
            qd0.b bVarN = eVar.n();
            vc.s.j(bVarN);
            return new b9c.i(bVar, bVarN);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        qd0.b languageProvider = eVar.n();
        vc.s.j(languageProvider);
        c9c.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    private final Object e() {
        p7c.j jVar = (p7c.j) this.d;
        p7c.r rVar = (p7c.r) this.f231657b;
        zc6.b bVar = rVar.C;
        int i = this.f231658c;
        if (i == 0) {
            return new com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.a(jVar.f233624a, new r8c.a(), (u8c.b) jVar.f.get());
        }
        if (i == 1) {
            u0f.a aVar = (u0f.a) rVar.v.f230029a.get();
            vc.s.j(aVar);
            return new u8c.e(aVar, rVar.e(), (mki.b) jVar.e.get());
        }
        if (i == 2) {
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) jVar.d.get();
            v8c.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            mki.b bVarQ2 = controller.q2();
            vc.s.k(bVarQ2);
            return bVarQ2;
        }
        if (i == 3) {
            u8c.b extension = (u8c.b) jVar.f.get();
            v8c.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 4) {
            return new h9c.b(((zc6.a) bVar).b(), ((zc6.a) bVar).c(), new dec.j(), ((zc6.a) bVar).d());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        x8c.b.Companion.getClass();
        return new bec.b(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL);
    }

    private final Object f() {
        p7c.r rVar = (p7c.r) this.f231657b;
        p7c.o oVar = (p7c.o) this.d;
        int i = this.f231658c;
        if (i == 0) {
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) oVar.f233653a.get();
            i60.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new h60.f(controller);
        }
        if (i == 1) {
            return new k9c.j((q7c.q) rVar.L.get(), (k9c.k) oVar.f233655c.get(), (jki.p) oVar.d.get(), (h60.d) oVar.f233654b.get());
        }
        if (i == 2) {
            qd0.b bVarN = rVar.f233675g.n();
            vc.s.j(bVarN);
            return new k9c.m(bVarN);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        k9c.a descriptionMapper = new k9c.a();
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        k9c.b pendingCashbackListItemFactory = new k9c.b();
        Intrinsics.checkNotNullParameter(pendingCashbackListItemFactory, "pendingCashbackListItemFactory");
        return new k9c.i();
    }

    private final Object g() {
        p7c.t tVar = (p7c.t) this.d;
        RevolutPayRootFlowContract$InputData inputData = tVar.f233707a;
        BaseFlow baseFlow = tVar.f233708b;
        p7c.r rVar = (p7c.r) this.f231657b;
        Context context = rVar.i;
        int i = this.f231658c;
        if (i == 0) {
            a8c.k kVar = (a8c.k) tVar.f233709c.get();
            a8c.b bVar = (a8c.b) tVar.d.get();
            j6c.b bVar2 = (j6c.b) rVar.f233677h0.get();
            zm0.b bVarI = rVar.f233680l.i();
            vc.s.j(bVarI);
            q7c.x xVarG = rVar.g();
            q06.d dVarA = rVar.f233670b.a();
            vc.s.j(dVarA);
            xcc.b bVarF = rVar.f();
            com.revolut.feature.revolutpay.impl.external.d dVar = new com.revolut.feature.revolutpay.impl.external.d(context, (kg.o) rVar.F.get());
            gte.a aVarB = rVar.f233687r.b();
            vc.s.j(aVarB);
            return new com.revolut.feature.revolutpay.impl.external.ui.flow.root.a(kVar, bVar, inputData, bVar2, bVarI, xVarG, dVarA, bVarF, dVar, aVarB);
        }
        if (i == 1) {
            com.revolut.feature.revolutpay.impl.external.d webPaymentParametersParser = new com.revolut.feature.revolutpay.impl.external.d(context, (kg.o) rVar.F.get());
            b8c.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(webPaymentParametersParser, "webPaymentParametersParser");
            Intent intent = inputData.f84465a;
            Intrinsics.checkNotNullParameter(intent, "intent");
            a8c.k kVar2 = Intrinsics.f(intent.getAction(), "org.chromium.intent.action.PAY") ? a8c.k.WEB_PAYMENT : a8c.k.APP_LINK;
            vc.s.k(kVar2);
            return kVar2;
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        a8c.k entryPoint = (a8c.k) tVar.f233709c.get();
        a8c.a defaultResultDispatcher = new a8c.a(baseFlow);
        a8c.s webPaymentResultDispatcher = new a8c.s(baseFlow);
        b8c.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(defaultResultDispatcher, "defaultResultDispatcher");
        Intrinsics.checkNotNullParameter(webPaymentResultDispatcher, "webPaymentResultDispatcher");
        int i2 = b8c.a.f13147a[entryPoint.ordinal()];
        if (i2 == 1) {
            return defaultResultDispatcher;
        }
        if (i2 == 2) {
            return webPaymentResultDispatcher;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object h() {
        p7c.r rVar = (p7c.r) this.f231657b;
        bac.g gVar = (bac.g) this.d;
        int i = this.f231658c;
        if (i != 0) {
            if (i == 1) {
                return xhi.f.a(new qr0.i((q7c.s) rVar.V.get()));
            }
            if (i == 2) {
                return new com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b(gVar.f14033b, (q7c.s) rVar.V.get(), new rec.a(), (s8c.e) gVar.f14034c.get(), new xec.w(new xec.b()));
            }
            throw new AssertionError(i);
        }
        s8c.e extension = (s8c.e) gVar.f14034c.get();
        yec.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    private final Object i() {
        p7c.r rVar = (p7c.r) this.f231657b;
        bac.g gVar = (bac.g) this.d;
        int i = this.f231658c;
        if (i != 0) {
            if (i == 1) {
                return xhi.f.a(new qr0.i((q7c.s) rVar.V.get()));
            }
            if (i == 2) {
                return new com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b(gVar.f14033b, (q7c.s) rVar.V.get(), new rec.a(), (s8c.e) gVar.f14034c.get(), new xec.w(new xec.b()));
            }
            throw new AssertionError(i);
        }
        s8c.e extension = (s8c.e) gVar.f14034c.get();
        yec.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    private final Object j() {
        p84.c cVar = (p84.c) this.f231657b;
        p84.b bVar = (p84.b) this.d;
        int i = this.f231658c;
        switch (i) {
            case 0:
                bVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar.f233850j.get(), cVar.a());
            case 1:
                um.c cVar2 = (um.c) cVar.k.get();
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                p84.c cVar3 = bVar.f233830c;
                hn.h hVar = (hn.h) cVar3.f233851l.get();
                t70.g gVarO = cVar3.f233846b.o();
                vc.s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(cVar3.d());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar.e)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), cVar.a());
            case 2:
                return bq.i.t(bVar.f233828a);
            case 3:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(bVar.f233831g.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar.i)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar.f233853n.get(), cVar.a());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) bVar.f233832h.get(), gsi.c.a(bVar.f233828a));
            case 6:
                return new rpi.b(bq.i.b(bVar.f233828a));
            case 7:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(bVar.f233830c.d());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar.f233851l.get(), (npi.f) bVar.k.get());
            case 8:
                Context contextI = bq.i.i(bVar.f233828a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f233828a);
                t70.g gVarO2 = cVar.f233846b.o();
                vc.s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                return new en.c(ImmutableSet.of((ln.d) bVar.f233830c.f233852m.get()), bq.i.l(bVar.f233828a));
            case 10:
                return new gn.c((lpi.e) bVar.f233836n.get(), (sm.e) cVar.f233854p.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar.a());
            case 11:
                return new lpi.b(bq.i.i(bVar.f233828a), bq.i.j(bVar.f233828a));
            case 12:
                bVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar.f233855q.get(), cVar.a());
            case 13:
                bVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) cVar.f233856r.get(), (k3l.b) bVar.f233838q.get(), cVar.a());
            case 14:
                return new k3l.d(bq.i.b(bVar.f233828a));
            case 15:
                return kpi.f.a();
            case 16:
                return new rpi.h(bq.i.b(bVar.f233828a));
            case 17:
                return new iri.g((iri.j) cVar.i.get(), (iri.m) cVar.f233857s.get(), bq.i.f(bVar.f233828a), bq.i.l(bVar.f233828a));
            case 18:
                return new iri.l((iri.m) cVar.f233857s.get(), bq.i.f(bVar.f233828a), (iri.d) bVar.v.get());
            case 19:
                return new iri.d(bq.i.f(bVar.f233828a));
            case 20:
                return new opi.b(bq.i.f(bVar.f233828a));
            case 21:
                return new an.q((cqi.h) bVar.f233844y.get(), (an.a) cVar.f233858t.get(), ImmutableSet.copyOf((Collection) bn.b.a()), cVar.a());
            case 22:
                return new cqi.j(bq.i.f(bVar.f233828a));
            case 23:
                bVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(bVar.f233828a));
            case 24:
                bVar.getClass();
                return new iqi.b(iqi.g.f167870b, bq.i.b(bVar.f233828a));
            case 25:
                CreditApplicationDocumentViewerContract$Configuration creditApplicationDocumentViewerContract$Configuration = bVar.f233829b;
                e4m.e eVar = cVar.v;
                l70.e eVar2 = cVar.f233846b;
                nj0.a aVar = cVar.f;
                x94.k kVar = (x94.k) eVar.get();
                iqi.h hVar2 = (iqi.h) bVar.B.get();
                xpi.g gVar = (xpi.g) bVar.A.get();
                x94.e eVar3 = (x94.e) cVar.f233859w.get();
                y94.b bVar2 = (y94.b) bVar.C.get();
                tpi.j jVar = (tpi.j) bVar.i.get();
                f9b.f fVar = (f9b.f) bVar.e.get();
                hk0.a aVarJ = ((nj0.d) aVar).j();
                zk0.b bVarL = eVar2.l();
                vc.s.j(bVarL);
                n80.d dVarA = eVar2.a();
                vc.s.j(dVarA);
                return new x94.s(creditApplicationDocumentViewerContract$Configuration, kVar, hVar2, gVar, eVar3, bVar2, jVar, fVar, aVarJ, bVarL, dVarA, (rz3.b) cVar.f233860x.get(), bq.i.d(bVar.f233828a), ((nj0.d) aVar).h());
            case 26:
                return new y94.b(bVar.f233829b, (x94.k) cVar.v.get(), (iqi.h) bVar.B.get(), (x94.e) cVar.f233859w.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        p8a.g gVar = (p8a.g) this.d;
        p8a.d0 d0Var = (p8a.d0) this.f231657b;
        int i = this.f231658c;
        if (i == 0) {
            z8a.a controller = (z8a.a) gVar.f233968c.get();
            e9a.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            vc.s.k(controller);
            return controller;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new d9a.d(gVar.f233966a, (z8a.a) gVar.f233968c.get());
                }
                throw new AssertionError(i);
            }
            c70.a aVarZ = d0Var.f233933h.z();
            vc.s.j(aVarZ);
            return new t8a.b(aVarZ, d0Var.i.e());
        }
        s8a.c cVarA = d0Var.e.a();
        vc.s.j(cVarA);
        t8a.a aVar = (t8a.a) gVar.f233967b.get();
        d9a.c cVar = new d9a.c();
        wj0.a aVarI = ((nj0.d) d0Var.f233939q).i();
        vc.s.j(aVarI);
        return new z8a.d(cVarA, aVar, cVar, aVarI);
    }

    private final Object l() {
        p8a.k kVar = (p8a.k) this.d;
        p8a.d0 d0Var = kVar.f234000a;
        int i = this.f231658c;
        if (i == 0) {
            return kxa.j.k((j60.a) kVar.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) kVar.f234002c.get(), (rp0.m) kVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        t2j.a aVar = d0Var.o;
        b3j.p pVar = (b3j.p) aVar;
        bof.r rVar = new bof.r(new oaa.d(((b3j.p) aVar).i()), new oaa.a(), new oaa.f(pVar.i()), new oaa.g(pVar.i()));
        d3a.b bVarA = ((s3a.k) d0Var.f233938p).a();
        vc.s.j(bVarA);
        xx9.p pVarB = d0Var.f233936m.b();
        vc.s.j(pVarB);
        s8a.n nVar = (s8a.n) d0Var.e.J.get();
        vc.s.j(nVar);
        jpc.e eVar = new jpc.e(bVarA, pVarB, nVar);
        j60.a aVar2 = (j60.a) kVar.e.get();
        oaa.b bVar = new oaa.b(((b3j.p) d0Var.o).i());
        s8a.n nVar2 = (s8a.n) ((p8a.d0) this.f231657b).e.J.get();
        vc.s.j(nVar2);
        return new maa.s(rVar, eVar, aVar2, bVar, nVar2);
    }

    @Override // phm.a
    public final Object get() {
        Object extension;
        Object eVar;
        Object kVar;
        Object fVar;
        Object bVar;
        Object f0Var;
        Object lVar;
        switch (this.f231656a) {
            case 0:
                g0 g0Var = (g0) this.d;
                int i = this.f231658c;
                if (i == 0) {
                    return new i42.l(g0Var.f231671a, ((nj0.d) ((v) this.f231657b).f231784m).j(), (cli.n) g0Var.f231672b.get());
                }
                if (i == 1) {
                    return new i42.m();
                }
                throw new AssertionError(i);
            case 1:
                int i2 = this.f231658c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new g42.g();
                    }
                    throw new AssertionError(i2);
                }
                pre.c cVarA = ((v) this.f231657b).z.a();
                vc.s.j(cVarA);
                i0 i0Var = (i0) this.d;
                return new g42.f(cVarA, i0Var.f231682a, (cli.n) i0Var.f231683b.get());
            case 2:
                v vVar = (v) this.f231657b;
                int i3 = this.f231658c;
                if (i3 == 0) {
                    j0 j0Var = (j0) this.d;
                    return new o42.k(j0Var.f231688a, (cli.n) j0Var.f231689b.get());
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                a12.k kVar2 = (a12.k) vVar.f231786p.B.get();
                vc.s.j(kVar2);
                whf.n nVarB = vVar.f231793y.b();
                vc.s.j(nVarB);
                return new o42.m(kVar2, nVarB);
            case 3:
                v vVar2 = (v) this.f231657b;
                l0 l0Var = (l0) this.d;
                int i5 = this.f231658c;
                switch (i5) {
                    case 0:
                        extension = (h52.e) l0Var.d.get();
                        b52.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 1:
                        ApmTransferContract$InputData apmTransferContract$InputData = l0Var.f231716a;
                        wsg.n nVarB2 = vVar2.f231779c.b();
                        u5k.c cVar = (u5k.c) vVar2.M.get();
                        l12.g gVar = new l12.g();
                        l12.c cVar2 = new l12.c();
                        l12.f fVar2 = new l12.f();
                        l12.i iVar = new l12.i();
                        gte.a aVarB = l0Var.f231717b.f231777a.b();
                        vc.s.j(aVarB);
                        eVar = new h52.e(apmTransferContract$InputData, nVarB2, cVar, gVar, cVar2, fVar2, iVar, new l1l.s(aVarB));
                        return eVar;
                    case 2:
                        Object extension2 = (c52.c) l0Var.f.get();
                        b52.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar = (yji.n) extension2;
                        vc.s.k(nVar);
                        return nVar;
                    case 3:
                        ApmTransferContract$InputData apmTransferContract$InputData2 = l0Var.f231716a;
                        uw1.b bVar2 = vVar2.e;
                        uw1.b bVar3 = vVar2.e;
                        yw1.b bVarK = ((lz1.m) bVar2).k();
                        vc.s.j(bVarK);
                        iz1.n nVar2 = (iz1.n) ((lz1.m) bVar3).G.get();
                        vc.s.j(nVar2);
                        lx1.d dVarB = ((ey1.e) vVar2.f).b();
                        vc.s.j(dVarB);
                        ax1.a aVarE = ((lz1.m) bVar3).e();
                        vc.s.j(aVarE);
                        pz1.b bVar4 = (pz1.b) vVar2.f231780g.f210571b.get();
                        vc.s.j(bVar4);
                        eVar = new c52.r(apmTransferContract$InputData2, bVarK, nVar2, dVarB, aVarE, bVar4, vVar2.f231781h.a(), vVar2.f231779c.b());
                        return eVar;
                    case 4:
                        extension = (c52.s) l0Var.i.get();
                        b52.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 5:
                        return new c52.s(l0Var.q(), (e52.a) l0Var.f231720h.get());
                    case 6:
                        return new e52.b(l0Var.q());
                    case 7:
                        extension = (bsf.i) l0Var.k.get();
                        b52.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 8:
                        w2 factory = vVar2.k.b();
                        b52.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.m();
                    case 9:
                        Object extension3 = (e52.a) l0Var.f231720h.get();
                        f52.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar3 = (yji.n) extension3;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 10:
                        ApmTransferContract$InputData apmTransferContract$InputData3 = l0Var.f231716a;
                        e52.a aVar = (e52.a) l0Var.f231720h.get();
                        b3a.a aVarA = vVar2.f231783l.a();
                        vc.s.j(aVarA);
                        wj0.a aVarI = ((nj0.d) vVar2.f231784m).i();
                        vc.s.j(aVarI);
                        return new com.revolut.feature.apm.core.ui.impl.ui.transfer.a(apmTransferContract$InputData3, aVar, aVarA, aVarI);
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                n0 n0Var = (n0) this.d;
                int i6 = this.f231658c;
                if (i6 == 0) {
                    return new com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.a((cli.n) n0Var.f231732b.get());
                }
                if (i6 == 1) {
                    return new com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.b(n0Var.f231731a, ((v) this.f231657b).f231791w.a());
                }
                throw new AssertionError(i6);
            case 5:
                l lVar2 = ((v) this.f231657b).f231786p;
                o0 o0Var = (o0) this.d;
                int i21 = this.f231658c;
                if (i21 == 0) {
                    return o5k.i.a((n5k.q) o0Var.f231736b.get());
                }
                if (i21 == 1) {
                    return new n5k.r(new RateExplanationDialogMapper());
                }
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new AssertionError(i21);
                    }
                    q12.g gVarJ = lVar2.j();
                    vc.s.j(gVarJ);
                    return new a3e.u(gVarJ);
                }
                PaymentsBreakdownNavigation$InputData paymentsBreakdownNavigation$InputData = o0Var.f231735a;
                x02.b bVarI = lVar2.i();
                vc.s.j(bVarI);
                x02.d dVarK = lVar2.k();
                vc.s.j(dVarK);
                return new g22.g(paymentsBreakdownNavigation$InputData, bVarI, dVarK, (n5k.q) o0Var.f231736b.get(), (cli.n) o0Var.d.get());
            case 6:
                u0 u0Var = (u0) this.d;
                int i22 = this.f231658c;
                if (i22 == 0) {
                    return new z42.e((cli.n) u0Var.f231775b.get(), u0Var.f231774a);
                }
                if (i22 != 1) {
                    throw new AssertionError(i22);
                }
                n8b.b bVarB = ((v) this.f231657b).f231792x.b();
                vc.s.j(bVarB);
                return new z42.h(bVarB);
            case 7:
                p28.c cVar3 = (p28.c) this.d;
                p28.b bVar5 = (p28.b) this.f231657b;
                int i32 = this.f231658c;
                switch (i32) {
                    case 0:
                        ash.d dVar = (ash.d) bVar5.B0.get();
                        ish.a0 a0VarC = bVar5.f232104a.c();
                        vc.s.j(a0VarC);
                        return new f28.a0(dVar, a0VarC);
                    case 1:
                        hsh.b bVar6 = bVar5.f232104a;
                        w9h.a aVar2 = bVar5.f232122q;
                        ish.a0 a0VarC2 = bVar6.c();
                        vc.s.j(a0VarC2);
                        k39.b bVar7 = cVar3.f232135a;
                        rul.e factory2 = aVar2.a();
                        y28.a aVar3 = y28.b.Companion;
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        v9h.a aVar4 = new v9h.a();
                        rul.e factory3 = aVar2.a();
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        kVar = new x28.k(a0VarC2, bVar7, aVar4, new v9h.f((e3) factory3.f257629a, (y2f.a) factory3.f257630b));
                        return kVar;
                    case 2:
                        ish.a0 a0VarC3 = bVar5.f232104a.c();
                        vc.s.j(a0VarC3);
                        k39.b bVar8 = cVar3.f232135a;
                        nlh.b bVarA = bVar5.f232132x.a();
                        vc.s.j(bVarA);
                        kVar = new m28.f(a0VarC3, bVar8, bVarA);
                        return kVar;
                    case 3:
                        e84.e trendCollectionsWidgetFactory = ((th7.b) bVar5.u).a();
                        k39.b navigationCommandsDispatcher = cVar3.f232135a;
                        d28.a swipeActionRowClickEventHandler = cVar3.f232136b;
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler, "swipeActionRowClickEventHandler");
                        return trendCollectionsWidgetFactory.b(nh7.d.MOST_TRADED, navigationCommandsDispatcher, new a38.a(InstrumentsTrendCollectionsFeedWidgetContext.class, swipeActionRowClickEventHandler));
                    case 4:
                        g3d.b factory4 = (g3d.b) bVar5.f232125s.f180695q.get();
                        vc.s.j(factory4);
                        ash.d widgetsCommonEventDispatcher = (ash.d) bVar5.B0.get();
                        m3d.j navigationDestinationProvider = bVar5.f232134y.a();
                        vc.s.j(navigationDestinationProvider);
                        ish.a0 widgetsUiInteractor = bVar5.f232104a.c();
                        vc.s.j(widgetsUiInteractor);
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                        return new f3d.k(widgetsCommonEventDispatcher, navigationDestinationProvider, widgetsUiInteractor);
                    case 5:
                        g3d.b factory5 = (g3d.b) bVar5.f232125s.f180695q.get();
                        vc.s.j(factory5);
                        ash.d widgetsCommonEventDispatcher2 = (ash.d) bVar5.B0.get();
                        m3d.j navigationDestinationProvider2 = bVar5.f232134y.a();
                        vc.s.j(navigationDestinationProvider2);
                        ish.a0 widgetsUiInteractor2 = bVar5.f232104a.c();
                        vc.s.j(widgetsUiInteractor2);
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher2, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(navigationDestinationProvider2, "navigationDestinationProvider");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher2, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(navigationDestinationProvider2, "navigationDestinationProvider");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                        return new f3d.k(widgetsCommonEventDispatcher2, navigationDestinationProvider2, widgetsUiInteractor2);
                    case 6:
                        su9.c topMoversWidgetFactory = bVar5.f232127t.b();
                        k39.b navigationCommandsDispatcher2 = cVar3.f232135a;
                        sz5.f delegateFactory = bVar5.f232127t.c();
                        zjh.j widgetDataProvider = new zjh.j(bVar5.n());
                        Intrinsics.checkNotNullParameter(topMoversWidgetFactory, "topMoversWidgetFactory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher2, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
                        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
                        return topMoversWidgetFactory.g(delegateFactory.O(navigationCommandsDispatcher2), widgetDataProvider);
                    case 7:
                        s3d.m mVarC = bVar5.f232125s.c();
                        vc.s.j(mVarC);
                        f38.b bVarM = bVar5.m();
                        ash.d dVar2 = (ash.d) bVar5.B0.get();
                        m3d.j jVarA = bVar5.f232134y.a();
                        vc.s.j(jVarA);
                        return vtc.p0.t(mVarC, bVarM, dVar2, jVarA, cVar3.a());
                    case 8:
                        s3d.m mVarC2 = bVar5.f232125s.c();
                        vc.s.j(mVarC2);
                        f38.b bVarM2 = bVar5.m();
                        ash.d dVar3 = (ash.d) bVar5.B0.get();
                        m3d.j jVarA2 = bVar5.f232134y.a();
                        vc.s.j(jVarA2);
                        return vtc.p0.r(mVarC2, bVarM2, dVar3, jVarA2, cVar3.a());
                    case 9:
                        s3d.m mVarC3 = bVar5.f232125s.c();
                        vc.s.j(mVarC3);
                        f38.b bVarM3 = bVar5.m();
                        ash.d dVar4 = (ash.d) bVar5.B0.get();
                        m3d.j jVarA3 = bVar5.f232134y.a();
                        vc.s.j(jVarA3);
                        return vtc.p0.B(mVarC3, bVarM3, dVar4, jVarA3, cVar3.a());
                    case 10:
                        s3d.m mVarC4 = bVar5.f232125s.c();
                        vc.s.j(mVarC4);
                        f38.b bVarM4 = bVar5.m();
                        ash.d dVar5 = (ash.d) bVar5.B0.get();
                        m3d.j jVarA4 = bVar5.f232134y.a();
                        vc.s.j(jVarA4);
                        return vtc.p0.l(mVarC4, bVarM4, dVar5, jVarA4, cVar3.a());
                    case 11:
                        e84.e trendCollectionsWidgetFactory2 = ((th7.b) bVar5.u).a();
                        k39.b navigationCommandsDispatcher3 = cVar3.f232135a;
                        d28.a swipeActionRowClickEventHandler2 = cVar3.f232136b;
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory2, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher3, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler2, "swipeActionRowClickEventHandler");
                        return trendCollectionsWidgetFactory2.b(nh7.d.POPULAR_STARTER_CFDS, navigationCommandsDispatcher3, new a38.a(InstrumentsTrendCollectionsFeedWidgetContext.class, swipeActionRowClickEventHandler2));
                    case 12:
                        e84.e trendCollectionsWidgetFactory3 = ((th7.b) bVar5.u).a();
                        k39.b navigationCommandsDispatcher4 = cVar3.f232135a;
                        d28.a swipeActionRowClickEventHandler3 = cVar3.f232136b;
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory3, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher4, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler3, "swipeActionRowClickEventHandler");
                        return trendCollectionsWidgetFactory3.b(nh7.d.CFDS_PNL_DRIVERS, navigationCommandsDispatcher4, new a38.a(InstrumentsTrendCollectionsFeedWidgetContext.class, swipeActionRowClickEventHandler3));
                    case 13:
                        e84.e trendCollectionsWidgetFactory4 = ((th7.b) bVar5.u).a();
                        k39.b navigationCommandsDispatcher5 = cVar3.f232135a;
                        d28.a swipeActionRowClickEventHandler4 = cVar3.f232136b;
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory4, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher5, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler4, "swipeActionRowClickEventHandler");
                        return trendCollectionsWidgetFactory4.b(nh7.d.RECOMMENDED_BUYS, navigationCommandsDispatcher5, new a38.a(InstrumentsTrendCollectionsFeedWidgetContext.class, swipeActionRowClickEventHandler4));
                    case 14:
                        hd.r factory6 = bVar5.f232108c.a();
                        k39.b navigationCommandsDispatcher6 = cVar3.f232135a;
                        ish.a0 widgetsUiInteractor3 = bVar5.f232104a.c();
                        vc.s.j(widgetsUiInteractor3);
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher6, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                        return new t28.f(factory6, navigationCommandsDispatcher6, widgetsUiInteractor3, null);
                    case 15:
                        hd.r factory7 = bVar5.f232108c.a();
                        k39.b navigationCommandsDispatcher7 = cVar3.f232135a;
                        ish.a0 widgetsUiInteractor4 = bVar5.f232104a.c();
                        vc.s.j(widgetsUiInteractor4);
                        d28.a swipeActionRowClickEventHandler5 = cVar3.f232136b;
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher7, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor4, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler5, "swipeActionRowClickEventHandler");
                        fVar = new t28.f(factory7, navigationCommandsDispatcher7, widgetsUiInteractor4, new a38.a(InvestWidgetContext.class, swipeActionRowClickEventHandler5));
                        return fVar;
                    case 16:
                        hd.r factory8 = bVar5.f232108c.a();
                        k39.b navigationCommandsDispatcher8 = cVar3.f232135a;
                        ish.a0 widgetsUiInteractor5 = bVar5.f232104a.c();
                        vc.s.j(widgetsUiInteractor5);
                        d28.a swipeActionRowClickEventHandler6 = cVar3.f232136b;
                        Intrinsics.checkNotNullParameter(factory8, "factory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher8, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor5, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler6, "swipeActionRowClickEventHandler");
                        fVar = new t28.f(factory8, navigationCommandsDispatcher8, widgetsUiInteractor5, new a38.a(InvestWidgetContext.class, swipeActionRowClickEventHandler6));
                        return fVar;
                    case 17:
                        hd.r factory9 = bVar5.f232108c.a();
                        k39.b navigationCommandsDispatcher9 = cVar3.f232135a;
                        ish.a0 widgetsUiInteractor6 = bVar5.f232104a.c();
                        vc.s.j(widgetsUiInteractor6);
                        d28.a swipeActionRowClickEventHandler7 = cVar3.f232136b;
                        Intrinsics.checkNotNullParameter(factory9, "factory");
                        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher9, "navigationCommandsDispatcher");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor6, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler7, "swipeActionRowClickEventHandler");
                        fVar = new t28.f(factory9, navigationCommandsDispatcher9, widgetsUiInteractor6, new a38.a(InvestWidgetContext.class, swipeActionRowClickEventHandler7));
                        return fVar;
                    case 18:
                        return new l28.i();
                    case 19:
                        k39.b bVar9 = cVar3.f232135a;
                        f80.a aVarX = cVar3.e.f232118n.x();
                        vc.s.j(aVarX);
                        h8b.g gVar2 = new h8b.g(bVar9, aVarX);
                        j8b.a aVar5 = new j8b.a();
                        jx0.a aVar6 = new jx0.a(new t1(bVar5.i()), new m8b.r(bVar5.i()), new m8b.q());
                        ybl.d dVarH = bVar5.f232117m.h();
                        vc.s.j(dVarH);
                        ybl.k kVarD = bVar5.e.d();
                        vc.s.j(kVarD);
                        l80.e eVarH = bVar5.f232118n.h();
                        vc.s.j(eVarH);
                        h8b.c cVar4 = new h8b.c(aVar5, aVar6, dVarH, kVarD, eVarH);
                        nsh.p pVar = cVar3.f232137c;
                        nsh.p pVar2 = cVar3.d;
                        h8b.a aVar7 = new h8b.a();
                        ish.a0 a0VarC4 = bVar5.f232104a.c();
                        vc.s.j(a0VarC4);
                        return new o28.h(gVar2, cVar4, pVar, pVar2, aVar7, a0VarC4);
                    case 20:
                        k39.b bVar10 = cVar3.f232135a;
                        ish.a0 a0VarC5 = bVar5.f232104a.c();
                        vc.s.j(a0VarC5);
                        ash.d dVar6 = (ash.d) bVar5.B0.get();
                        gte.a aVarB2 = bVar5.f232111g.b();
                        vc.s.j(aVarB2);
                        return new s28.j(bVar10, a0VarC5, dVar6, aVarB2, new q18.h());
                    case 21:
                        m2b.f fVar3 = bVar5.z;
                        vhh.a aVar8 = bVar5.f232123r;
                        p2b.i iVarA = fVar3.a();
                        k39.b bVar11 = cVar3.f232135a;
                        oih.i iVar2 = (oih.i) ((mkh.s) aVar8).A0.get();
                        vc.s.j(iVar2);
                        oih.k kVar3 = (oih.k) ((mkh.s) aVar8).R0.get();
                        vc.s.j(kVar3);
                        oih.j jVarE = ((mkh.s) aVar8).e();
                        vc.s.j(jVarE);
                        ish.a0 a0VarC6 = bVar5.f232104a.c();
                        vc.s.j(a0VarC6);
                        sj3.a aVar9 = (sj3.a) bVar5.A.f314404m.get();
                        vc.s.j(aVar9);
                        fVar = new z28.x(iVarA, bVar11, iVar2, kVar3, jVarE, a0VarC6, aVar9);
                        return fVar;
                    case 22:
                        q28.a aVar10 = (q28.a) bVar5.B0.get();
                        nlh.b bVarA2 = bVar5.f232132x.a();
                        vc.s.j(bVarA2);
                        return new d38.j(aVar10, bVarA2, bVar5.B.b(), bVar5.f232106b.i());
                    case 23:
                        ash.d dVar7 = (ash.d) bVar5.B0.get();
                        ish.a0 a0VarC7 = bVar5.f232104a.c();
                        vc.s.j(a0VarC7);
                        return new i28.n(dVar7, a0VarC7, new d1e.a(), bVar5.m());
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                p2k.i iVar3 = (p2k.i) this.d;
                p2k.n nVar4 = (p2k.n) this.f231657b;
                int i33 = this.f231658c;
                switch (i33) {
                    case 0:
                        wj0.a idempotencyKeyHolder = ((nj0.d) nVar4.f232397a).i();
                        vc.s.j(idempotencyKeyHolder);
                        l80.e dateProvider = nVar4.f232399b.h();
                        vc.s.j(dateProvider);
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder, dateProvider, "payments_bank_transfer");
                        return bVar;
                    case 1:
                        wj0.a idempotencyKeyHolder2 = ((nj0.d) nVar4.f232397a).i();
                        vc.s.j(idempotencyKeyHolder2);
                        l80.e dateProvider2 = nVar4.f232399b.h();
                        vc.s.j(dateProvider2);
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder2, dateProvider2, "payments_recurring_transfer");
                        return bVar;
                    case 2:
                        pak.h priceQuoteTraceIdControllerExtensionFactory = nVar4.f232401c.a();
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory, "priceQuoteTraceIdControllerExtensionFactory");
                        return priceQuoteTraceIdControllerExtensionFactory.a("payments_bank_transfer_price_quote");
                    case 3:
                        Object extension4 = (a5k.u) iVar3.f232360h.get();
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar5 = (yji.n) extension4;
                        vc.s.k(nVar5);
                        return nVar5;
                    case 4:
                        return new a5k.y(iVar3.f232356a, (y1k.a) nVar4.l0.get(), nVar4.i.a(), nVar4.f.b(), nVar4.f232407j.a());
                    case 5:
                        a5k.f0 extension5 = (a5k.f0) iVar3.f232361j.get();
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        a5k.f0 f0Var2 = extension5;
                        vc.s.k(f0Var2);
                        return f0Var2;
                    case 6:
                        BankTransferFlowInputData bankTransferFlowInputData = iVar3.f232356a;
                        p2k.n nVar6 = iVar3.f232358c;
                        cpf.b bVarE = nVar6.k.e();
                        vc.s.j(bVarE);
                        sw8.a aVar11 = new sw8.a();
                        sf0.h hVarB = nVar6.f232409l.b();
                        vc.s.j(hVarB);
                        a5k.b0 b0Var = new a5k.b0(bVarE, aVar11, hVarB);
                        cpf.c cVarF = nVar4.k.f();
                        vc.s.j(cVarF);
                        jvh.a aVarA2 = nVar4.f232410m.a();
                        vc.s.j(aVarA2);
                        til.m mVarA = nVar4.f232411n.a();
                        vc.s.j(mVarA);
                        f0Var = new a5k.f0(bankTransferFlowInputData, b0Var, cVarF, aVarA2, mVarA);
                        return f0Var;
                    case 7:
                        a5k.t extension6 = (a5k.t) iVar3.f232362l.get();
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        vc.s.k(extension6);
                        return extension6;
                    case 8:
                        a5k.f0 f0Var3 = (a5k.f0) iVar3.f232361j.get();
                        p2k.n nVar7 = iVar3.f232358c;
                        hlg.a aVar12 = (hlg.a) nVar7.o.f206951p.get();
                        vc.s.j(aVar12);
                        agf.b bVarA3 = ((dgf.a) nVar7.f232412p).a();
                        vc.s.j(bVarA3);
                        a5k.f0 f0Var4 = (a5k.f0) iVar3.f232361j.get();
                        a5k.u uVar = (a5k.u) iVar3.f232360h.get();
                        b3a.a aVarA3 = nVar7.f232413q.a();
                        vc.s.j(aVarA3);
                        aqf.b bVarC = nVar7.k.c();
                        vc.s.j(bVarC);
                        w4k.k kVar4 = new w4k.k(aVar12, bVarA3, f0Var4, uVar, aVarA3, bVarC, nVar7.i.c());
                        a5k.u uVar2 = (a5k.u) iVar3.f232360h.get();
                        hlg.a aVar13 = (hlg.a) nVar4.o.f206951p.get();
                        vc.s.j(aVar13);
                        bVar = new a5k.t(f0Var3, kVar4, uVar2, aVar13);
                        return bVar;
                    case 9:
                        Object extension7 = (a5k.a) iVar3.o.get();
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar8 = (yji.n) extension7;
                        vc.s.k(nVar8);
                        return nVar8;
                    case 10:
                        i5k.a aVar14 = (i5k.a) iVar3.f232364n.get();
                        t2j.a aVar15 = nVar4.f232414r;
                        bVar = new a5k.c(aVar14, new m3j.a());
                        return bVar;
                    case 11:
                        l80.h hVarV = nVar4.f232399b.v();
                        vc.s.j(hVarV);
                        return new i5k.d(hVarV);
                    case 12:
                        r10.f factory10 = nVar4.f232415s.a();
                        o4k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory10, "factory");
                        return factory10.d();
                    case 13:
                        BankTransferFlowInputData bankTransferFlowInputData2 = iVar3.f232356a;
                        d3j.b bVarE2 = ((b3j.p) nVar4.f232414r).e();
                        a5k.t tVar = (a5k.t) iVar3.f232362l.get();
                        a5k.a aVar16 = (a5k.a) iVar3.o.get();
                        aqf.b bVarC2 = nVar4.k.c();
                        vc.s.j(bVarC2);
                        fl9.a aVar17 = (fl9.a) nVar4.f232416t;
                        zk0.b bVarL = aVar17.f135909b.l();
                        vc.s.j(bVarL);
                        gte.a aVarB3 = aVar17.e.b();
                        vc.s.j(aVarB3);
                        f0Var = new com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c(bankTransferFlowInputData2, bVarE2, tVar, aVar16, bVarC2, new hl9.d(bVarL, aVarB3));
                        return f0Var;
                    case 14:
                        i5k.a extension8 = (i5k.a) iVar3.f232364n.get();
                        j5k.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension8, "extension");
                        vc.s.k(extension8);
                        return extension8;
                    case 15:
                        b5k.c.Companion.getClass();
                        return new b5k.a();
                    case 16:
                        y1k.a aVar18 = (y1k.a) nVar4.l0.get();
                        hlg.b bVar12 = (hlg.b) nVar4.o.o.get();
                        vc.s.j(bVar12);
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) nVar4.C).c();
                        vc.s.j(aVarC);
                        ang.f fVarE = nVar4.D.e();
                        bqf.d dVarA = nVar4.i.a();
                        n8b.a aVarA4 = nVar4.E.a();
                        vc.s.j(aVarA4);
                        return new p4k.g(aVar18, bVar12, aVarC, fVarE, dVarA, new c8i.n(aVarA4, 1), new p4k.h());
                    case 17:
                        Context context = nVar4.R;
                        o4k.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return com.bumptech.glide.c.k(context).a(context);
                    case 18:
                        z4k.c.Companion.getClass();
                        return new z4k.a();
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                p2k.o oVar = (p2k.o) this.d;
                int i43 = this.f231658c;
                if (i43 == 0) {
                    Object extension9 = (i2k.d) oVar.f232421b.get();
                    j2k.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension9, "extension");
                    yji.n nVar9 = (yji.n) extension9;
                    vc.s.k(nVar9);
                    return nVar9;
                }
                if (i43 == 1) {
                    return new i2k.f(new i2k.c());
                }
                if (i43 == 2) {
                    PriceComparisonScreenContract$InputData priceComparisonScreenContract$InputData = oVar.f232420a;
                    h2k.l lVarA = ((p2k.n) this.f231657b).F.a();
                    vc.s.j(lVarA);
                    return new com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a(priceComparisonScreenContract$InputData, lVarA, (i2k.d) oVar.f232421b.get(), (cli.n) oVar.d.get());
                }
                if (i43 != 3) {
                    throw new AssertionError(i43);
                }
                k2k.d revolutOptionRowMapper = new k2k.d();
                k2k.b otherBankOptionRowMapper = new k2k.b();
                Intrinsics.checkNotNullParameter(revolutOptionRowMapper, "revolutOptionRowMapper");
                Intrinsics.checkNotNullParameter(otherBankOptionRowMapper, "otherBankOptionRowMapper");
                return new at.r(new i2k.b());
            case 10:
                p2k.n nVar10 = (p2k.n) this.f231657b;
                p2k.p pVar3 = (p2k.p) this.d;
                int i59 = this.f231658c;
                if (i59 == 0) {
                    return new c4k.k(new e5k.g(), pVar3.f232423a, (cli.n) pVar3.d.get());
                }
                if (i59 == 1) {
                    return new c4k.l(new i4k.n((yof.d) pVar3.f232425c.get()));
                }
                if (i59 != 2) {
                    if (i59 != 3) {
                        throw new AssertionError(i59);
                    }
                    ldd.a factory11 = new ldd.a();
                    d4k.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory11, "factory");
                    return new ldd.b();
                }
                ppf.a factory12 = nVar10.k.b();
                vc.s.j(factory12);
                ldd.b delegate = (ldd.b) pVar3.f232424b.get();
                d4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory12, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            case 11:
                return a();
            case 12:
                p2k.z zVar = (p2k.z) this.d;
                p2k.x xVar = zVar.f232536b;
                p2k.x xVar2 = (p2k.x) this.f231657b;
                npf.a aVar19 = xVar2.e;
                r5a.c cVar5 = xVar2.i;
                int i66 = this.f231658c;
                switch (i66) {
                    case 0:
                        wj0.a idempotencyKeyHolder3 = ((nj0.d) xVar2.f232501a).i();
                        vc.s.j(idempotencyKeyHolder3);
                        l80.e dateProvider3 = xVar2.f232502b.h();
                        vc.s.j(dateProvider3);
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder3, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider3, "dateProvider");
                        return new m60.b(idempotencyKeyHolder3, dateProvider3, "payments_peer_to_peer_transfer");
                    case 1:
                        pak.h priceQuoteTraceIdControllerExtensionFactory2 = xVar2.f232503c.a();
                        Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory2, "priceQuoteTraceIdControllerExtensionFactory");
                        return priceQuoteTraceIdControllerExtensionFactory2.a("remittance_price_quote");
                    case 2:
                        o9k.j0 extension10 = (o9k.j0) zVar.f.get();
                        Intrinsics.checkNotNullParameter(extension10, "extension");
                        vc.s.k(extension10);
                        return extension10;
                    case 3:
                        v8k.i iVar4 = xVar2.d;
                        agf.b bVarA4 = ((dgf.a) iVar4.f286880j).a();
                        vc.s.j(bVarA4);
                        ogm.i iVarC = iVar4.e.c();
                        o9k.w0 w0VarB = iVar4.b();
                        b3a.a aVarA5 = iVar4.o.a();
                        vc.s.j(aVarA5);
                        o9k.y yVar = new o9k.y(bVarA4, iVarC, w0VarB, new o9k.x0(aVarA5));
                        o9k.t0 t0VarA = iVar4.a();
                        o9k.w0 w0VarB2 = iVar4.b();
                        ks0.n nVar11 = new ks0.n(iVar4.b());
                        gte.a aVarB4 = iVar4.f286884p.b();
                        vc.s.j(aVarB4);
                        wsg.n nVarB3 = iVar4.f286878g.b();
                        hj8.a aVarA6 = iVar4.f286885q.a();
                        vc.s.j(aVarA6);
                        kbb.c cVar6 = new kbb.c(aVarB4, nVarB3, aVarA6);
                        nd.n factory13 = new nd.n(yVar, t0VarA, w0VarB2, nVar11, cVar6);
                        aqf.b controller = xVar.e.c();
                        vc.s.j(controller);
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        g9k.b executionStepListener = new g9k.b(controller, 1);
                        Intrinsics.checkNotNullParameter(factory13, "factory");
                        Intrinsics.checkNotNullParameter(executionStepListener, "executionStepListener");
                        Intrinsics.checkNotNullParameter(executionStepListener, "executionStepListener");
                        return new o9k.j0(yVar, t0VarA, w0VarB2, nVar11, executionStepListener, cVar6);
                    case 4:
                        bsf.i extension11 = (bsf.i) zVar.f232539h.get();
                        Intrinsics.checkNotNullParameter(extension11, "extension");
                        vc.s.k(extension11);
                        return extension11;
                    case 5:
                        w2 factory14 = xVar2.f.b();
                        Intrinsics.checkNotNullParameter(factory14, "factory");
                        return factory14.m();
                    case 6:
                        RemittanceInputData remittanceInputData = zVar.f232535a;
                        y1k.a aVarA7 = xVar.f232504g.a();
                        vc.s.j(aVarA7);
                        d3a.b bVarA5 = ((s3a.k) xVar.f232505h).a();
                        vc.s.j(bVarA5);
                        l80.e eVarH2 = xVar.f232502b.h();
                        vc.s.j(eVarH2);
                        w3k.d dVar8 = new w3k.d(aVarA7, bVarA5, eVarH2);
                        r3a.b bVar13 = (r3a.b) cVar5.e.get();
                        vc.s.j(bVar13);
                        x2k.a aVar20 = new x2k.a();
                        nra.b bVar14 = (nra.b) ((jqa.p) xVar2.f232506j).f177652y.get();
                        vc.s.j(bVar14);
                        b3a.a aVarA8 = cVar5.a();
                        vc.s.j(aVarA8);
                        zof.f fVarD = aVar19.d();
                        vc.s.j(fVarD);
                        g3k.d dVarB2 = xVar.k.b();
                        vc.s.j(dVarB2);
                        f2k.e eVar2 = new f2k.e(dVarB2, ((b3j.p) xVar.f232507l).e());
                        z3k.a aVar21 = new z3k.a();
                        bsf.i iVar5 = (bsf.i) zVar.f232539h.get();
                        w3k.j jVar = new w3k.j();
                        usg.a aVar22 = xVar.f232508m;
                        lpf.a aVar23 = xVar.f232509n;
                        y3k.b bVar15 = new y3k.b(aVar22.b(), aVar23.a(), aVar23.f());
                        o9k.j0 j0Var2 = (o9k.j0) zVar.f.get();
                        aqf.b bVarC3 = aVar19.c();
                        vc.s.j(bVarC3);
                        return new com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c(remittanceInputData, dVar8, bVar13, aVar20, bVar14, aVarA8, fVarD, eVar2, aVar21, iVar5, jVar, bVar15, j0Var2, bVarC3);
                    default:
                        throw new AssertionError(i66);
                }
            case 13:
                return b();
            case 14:
                p49.a aVar24 = (p49.a) this.f231657b;
                int i74 = this.f231658c;
                if (i74 == 0) {
                    return new q49.h((cli.n) ((p49.b) this.d).f232860a.get(), (ftb.c) aVar24.e.get(), aVar24.f232858b.b(), (ix0.p0) aVar24.f.get());
                }
                if (i74 == 1) {
                    return new q49.i();
                }
                throw new AssertionError(i74);
            case 15:
                return c();
            case 16:
                p7c.c cVar7 = (p7c.c) this.d;
                int i92 = this.f231658c;
                if (i92 == 0) {
                    lVar = new g8c.l(new g9c.b(new rdc.d(new rdc.b()), new gec.i()), (q7c.q) ((p7c.r) this.f231657b).L.get(), (cli.n) cVar7.f233588b.get());
                } else {
                    if (i92 != 1) {
                        if (i92 != 2) {
                            throw new AssertionError(i92);
                        }
                        h8c.b.Companion.getClass();
                        return new zzl.c();
                    }
                    lVar = new g8c.j((zzl.b) cVar7.f233587a.get());
                }
                return lVar;
            case 17:
                p7c.r rVar = (p7c.r) this.f231657b;
                p7c.e eVar3 = (p7c.e) this.d;
                int i96 = this.f231658c;
                switch (i96) {
                    case 0:
                        return kxa.j.s((j60.a) eVar3.d.get());
                    case 1:
                        return kxa.j.q((com.revolut.kompot.navigable.a) eVar3.f233600b.get(), (rp0.m) eVar3.f233601c.get(), new j60.e());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return new m8c.q((y7c.a) rVar.f233674e0.get(), (m8c.i) eVar3.f.get(), (j60.a) eVar3.f233602g.get(), (jki.p) eVar3.f233603h.get(), eVar3.f233599a, rVar.f233681m.b());
                    case 4:
                        return new m8c.a();
                    case 5:
                        j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) eVar3.d.get();
                        n8c.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                        vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
                        return bottomExpandableDialogEmbeddedControllerExtension;
                    case 6:
                        return new m8c.s(new m8c.b(), new m8c.c(), (c6c.a) rVar.g0.get());
                    default:
                        throw new AssertionError(i96);
                }
            case 18:
                p7c.f fVar4 = (p7c.f) this.d;
                int i99 = this.f231658c;
                if (i99 == 0) {
                    return new sec.o(fVar4.f233606a, (q7c.s) ((p7c.r) this.f231657b).V.get(), (cli.n) fVar4.f233607b.get());
                }
                if (i99 != 1) {
                    throw new AssertionError(i99);
                }
                sec.a itemMapper = new sec.a();
                Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
                return new sec.m();
            case 19:
                return d();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                p7c.r rVar2 = (p7c.r) this.f231657b;
                p7c.v vVar3 = (p7c.v) this.d;
                int i100 = this.f231658c;
                if (i100 == 0) {
                    return new f9c.d((jki.p) vVar3.f233732b.get(), vVar3.f233731a, oyj.c.s(rVar2.i), (f9c.a) rVar2.l0.get());
                }
                if (i100 == 1) {
                    return new f9c.e();
                }
                throw new AssertionError(i100);
            case 24:
                return h();
            case 25:
                return i();
            case 26:
                return j();
            case 27:
                return k();
            case 28:
                return l();
            default:
                p8a.l lVar3 = (p8a.l) this.d;
                int i101 = this.f231658c;
                if (i101 == 0) {
                    return new mca.h((cli.n) lVar3.f234011b.get(), lVar3.f234010a);
                }
                if (i101 != 1) {
                    throw new AssertionError(i101);
                }
                lx1.i iVarD = ((ey1.e) ((p8a.d0) this.f231657b).k).d();
                vc.s.j(iVarD);
                return new mca.k(iVarD);
        }
    }
}
