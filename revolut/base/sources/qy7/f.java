package qy7;

import android.app.Activity;
import android.content.Context;
import b9.w2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.android.sdk.capture.OnfidoFactory;
import com.onfido.workflow.OnfidoWorkflow;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountScreen;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryScreen;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreenContract$InputData;
import com.revolut.feature.localisation.ui.api.navigation.DateInputInputData;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.network.error.KycNotPassedErrorHandler;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$InputData;
import cu8.r0;
import d7j.a0;
import d7j.a2;
import d7j.b2;
import dw3.c1;
import dw3.u7;
import dw3.z7;
import e8e.b0;
import e8e.d0;
import e8e.e0;
import e8e.x;
import et6.h1;
import fmc.z;
import h30.l;
import h8d.v;
import h8d.w;
import h8e.i;
import ip0.v7;
import java.util.Optional;
import java.util.Set;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kxa.j;
import ljl.q0;
import ljl.q1;
import lp.l9;
import lu7.m0;
import mga.f0;
import mga.i0;
import mx4.r;
import no.j2;
import o7e.k;
import qgk.k3;
import r6e.o;
import r6e.s;
import r6e.t;
import r6e.u;
import r6e.y;
import rp0.g1;
import rp0.m;
import rp0.x0;
import ty8.q;
import vrl.u0;
import wsg.n;
import yik.h;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f250233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f250234c;
    public final Object d;

    public /* synthetic */ f(Object obj2, Object obj3, int i, int i2) {
        this.f250232a = i2;
        this.f250234c = obj2;
        this.d = obj3;
        this.f250233b = i;
    }

    private final Object a() {
        s sVar = (s) this.d;
        int i = this.f250233b;
        if (i == 0) {
            return j.l((j60.a) sVar.d.get());
        }
        if (i == 1) {
            return l.p((com.revolut.kompot.navigable.a) sVar.f251800b.get(), (m) sVar.f251801c.get());
        }
        if (i == 2) {
            return new m();
        }
        if (i != 3) {
            if (i == 4) {
                return new h8e.j();
            }
            throw new AssertionError(i);
        }
        p pVar = (p) sVar.f.get();
        UserPermissionEditScreenContract$InputData userPermissionEditScreenContract$InputData = sVar.f251799a;
        j60.a aVar = (j60.a) sVar.d.get();
        g6e.d dVarB = ((o) this.f250234c).f251773c.b();
        vc.s.j(dVarB);
        return new i(pVar, userPermissionEditScreenContract$InputData, aVar, dVarB);
    }

    private final Object b() {
        t tVar = (t) this.d;
        int i = this.f250233b;
        if (i == 0) {
            return j.l((j60.a) tVar.d.get());
        }
        if (i == 1) {
            return l.p((com.revolut.kompot.navigable.a) tVar.f251804b.get(), (m) tVar.f251805c.get());
        }
        if (i == 2) {
            return new m();
        }
        if (i == 3) {
            return new x7e.i((p) tVar.f.get(), tVar.f251803a, (j60.a) tVar.d.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        dl3.f fVarC = ((o) this.f250234c).F.c();
        vc.s.j(fVarC);
        return new x7e.j(fVarC);
    }

    private final Object c() {
        o oVar = (o) this.f250234c;
        u uVar = (u) this.d;
        int i = this.f250233b;
        if (i == 0) {
            return j.l((j60.a) uVar.d.get());
        }
        if (i == 1) {
            return l.p((com.revolut.kompot.navigable.a) uVar.f251808b.get(), (m) uVar.f251809c.get());
        }
        if (i == 2) {
            return new m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            o8e.c mapper = new o8e.c();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return new o8e.b();
        }
        g6e.b bVarA = oVar.f251775h.a();
        vc.s.j(bVarA);
        ppg.b bVarB = ((wpg.l) oVar.i).b();
        vc.s.j(bVarB);
        ang.f fVarE = oVar.f.e();
        mre.c cVarB = oVar.f251776j.b();
        vc.s.j(cVarB);
        return new l8e.l(bVarA, bVarB, fVarE, cVarB, (p) uVar.f.get(), uVar.f251807a);
    }

    private final Object d() {
        o oVar = (o) this.f250234c;
        x9e.a aVar = oVar.f251787y;
        y yVar = (y) this.d;
        int i = this.f250233b;
        switch (i) {
            case 0:
                return j.l((j60.a) yVar.f.get());
            case 1:
                return l.p((com.revolut.kompot.navigable.a) yVar.d.get(), (m) yVar.e.get());
            case 2:
                return new m();
            case 3:
                p pVar = (p) yVar.f251823h.get();
                g6e.d dVarB = oVar.f251773c.b();
                vc.s.j(dVarB);
                xua.a aVarA = oVar.f251782r.a();
                vc.s.j(aVarA);
                j60.a aVar2 = (j60.a) yVar.f.get();
                BillSelectorScreenContract$InputData billSelectorScreenContract$InputData = yVar.f251820b;
                z8e.a aVarD = aVar.d();
                vc.s.j(aVarD);
                g9e.b bVar = (g9e.b) aVar.I.get();
                vc.s.j(bVar);
                g1 g1Var = (g1) yVar.i.get();
                m93.d dVarF = yVar.f251821c.E.f();
                vc.s.j(dVarF);
                c7e.b bVar2 = new c7e.b(dVarF);
                d0 d0Var = (d0) yVar.f251824j.get();
                nhf.a aVarA2 = oVar.A.a();
                vc.s.j(aVarA2);
                return new x(pVar, dVarB, aVarA, aVar2, billSelectorScreenContract$InputData, aVarD, bVar, g1Var, bVar2, d0Var, aVarA2);
            case 4:
                l80.e eVarH = oVar.o.h();
                vc.s.j(eVarH);
                return new b0((a9e.a) oVar.P.get(), eVarH);
            case 5:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) yVar.d.get();
                f8e.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 6:
                return new e0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        o oVar = (o) this.f250234c;
        x9e.a aVar = oVar.f251787y;
        y yVar = (y) this.d;
        int i = this.f250233b;
        switch (i) {
            case 0:
                return j.l((j60.a) yVar.f.get());
            case 1:
                return l.p((com.revolut.kompot.navigable.a) yVar.d.get(), (m) yVar.e.get());
            case 2:
                return new m();
            case 3:
                p pVar = (p) yVar.f251823h.get();
                g6e.d dVarB = oVar.f251773c.b();
                vc.s.j(dVarB);
                xua.a aVarA = oVar.f251782r.a();
                vc.s.j(aVarA);
                j60.a aVar2 = (j60.a) yVar.f.get();
                BillSelectorScreenContract$InputData billSelectorScreenContract$InputData = yVar.f251820b;
                z8e.a aVarD = aVar.d();
                vc.s.j(aVarD);
                g9e.b bVar = (g9e.b) aVar.I.get();
                vc.s.j(bVar);
                g1 g1Var = (g1) yVar.i.get();
                m93.d dVarF = yVar.f251821c.E.f();
                vc.s.j(dVarF);
                c7e.b bVar2 = new c7e.b(dVarF);
                d0 d0Var = (d0) yVar.f251824j.get();
                nhf.a aVarA2 = oVar.A.a();
                vc.s.j(aVarA2);
                return new x(pVar, dVarB, aVarA, aVar2, billSelectorScreenContract$InputData, aVarD, bVar, g1Var, bVar2, d0Var, aVarA2);
            case 4:
                l80.e eVarH = oVar.o.h();
                vc.s.j(eVarH);
                return new b0((a9e.a) oVar.P.get(), eVarH);
            case 5:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) yVar.d.get();
                f8e.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 6:
                return new e0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        r6j.c cVar = (r6j.c) this.f250234c;
        r6j.b bVar = (r6j.b) this.d;
        int i = this.f250233b;
        switch (i) {
            case 0:
                KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) bVar.d.get();
                pl1.d.n(keyboardSuggestionsControllerExtension);
                return keyboardSuggestionsControllerExtension;
            case 1:
                return pl1.d.u((com.revolut.kompot.navigable.a) bVar.f251870c.get());
            case 2:
                n60.a aVar = (n60.a) bVar.f.get();
                o5k.i.l(aVar);
                return aVar;
            case 3:
                return o5k.i.q((com.revolut.kompot.navigable.a) bVar.f251870c.get());
            case 4:
                j4i.a aVar2 = cVar.f;
                l4i.a aVar3 = new l4i.a();
                w80.b bVarJ = cVar.d.j();
                vc.s.j(bVarJ);
                e4m.e eVar = bVar.f251872h;
                r6j.c cVar2 = bVar.f251869b;
                g7j.b bVar2 = (g7j.b) eVar.get();
                gte.a aVarB = cVar2.f251880g.b();
                vc.s.j(aVarB);
                dkf.a aVar4 = new dkf.a(aVarB, 1);
                b7j.j jVarB = bVar.b();
                g7j.e eVar2 = new g7j.e(cVar2.f251881h.b());
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.a aVar5 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.a(new l4i.a());
                l2j.a aVar6 = new l2j.a();
                b7j.b bVar3 = new b7j.b();
                gte.a aVarB2 = cVar.f251880g.b();
                vc.s.j(aVarB2);
                n60.a aVar7 = (n60.a) bVar.f.get();
                r0 r0VarA = cVar.i.a();
                b2 b2Var = (b2) bVar.i.get();
                o7.b bVarA = cVar.f251883l.a();
                vo9.a aVarB3 = ((ut9.a) cVar.f251884m).b();
                vc.s.j(aVarB3);
                a2 a2Var = new a2();
                ybl.d dVarH = cVar.f251882j.h();
                vc.s.j(dVarH);
                ppk.f fVarA = cVar.f251885n.a();
                l6j.b bVar4 = (l6j.b) cVar.H.get();
                ang.f fVarE = cVar.o.e();
                n nVarB = cVar.f251881h.b();
                tzg.m mVarT = cVar.k.t();
                vc.s.j(mVarT);
                u6j.c cVar3 = new u6j.c(new l4i.a(), cVar2.f251886p.b());
                l80.e eVarH = cVar2.d.h();
                vc.s.j(eVarH);
                fuk.a aVar8 = new fuk.a(eVarH, 1);
                l80.e eVarH2 = cVar2.d.h();
                vc.s.j(eVarH2);
                return new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g(aVar3, bVarJ, bVar2, aVar4, jVarB, eVar2, aVar5, aVar6, bVar3, aVarB2, aVar7, r0VarA, b2Var, bVarA, aVarB3, a2Var, dVarH, fVarA, bVar4, fVarE, nVarB, mVarT, cVar3, aVar8, new g7j.g(eVarH2), new z(cVar2.e.c(), new g7j.a()), bVar.f251868a, (d7j.x) bVar.f251873j.get(), (cli.n) bVar.f251875m.get());
            case 5:
                return new g7j.b();
            case 6:
                b7j.j jVarB2 = bVar.b();
                ybl.d dVarH2 = cVar.f251882j.h();
                vc.s.j(dVarH2);
                n nVarB2 = cVar.f251881h.b();
                tzg.m mVarT2 = cVar.k.t();
                vc.s.j(mVarT2);
                i90.b bVar5 = new i90.b();
                g7j.b bVar6 = (g7j.b) bVar.f251872h.get();
                l80.e eVarH3 = bVar.f251869b.d.h();
                vc.s.j(eVarH3);
                return new d7j.f(jVarB2, dVarH2, nVarB2, mVarT2, bVar5, bVar6, new fuk.a(eVarH3, 1), (l6j.b) cVar.H.get());
            case 7:
                return new d7j.g();
            case 8:
                y6j.a aVar9 = new y6j.a();
                d7j.b0 b0Var = (d7j.b0) bVar.k.get();
                a0 a0Var = (a0) bVar.f251874l.get();
                f7j.i iVar = new f7j.i();
                zjh.c cVar4 = new zjh.c(bVar.f251869b.f251887q.f());
                l4i.a aVar10 = new l4i.a();
                l4i.a converter = new l4i.a();
                Intrinsics.checkNotNullParameter(converter, "converter");
                f7j.p pVar = new f7j.p(aVar10, new f7j.n());
                vfl.a aVar11 = new vfl.a();
                f7j.g gVar = new f7j.g();
                gte.a aVarB4 = cVar.f251880g.b();
                vc.s.j(aVarB4);
                return new f7j.f(aVar9, b0Var, a0Var, iVar, cVar4, pVar, aVar11, gVar, aVarB4, bVar.f251868a);
            case 9:
                return new f7j.e();
            case 10:
                w80.b bVarJ2 = cVar.d.j();
                vc.s.j(bVarJ2);
                return new f7j.c(bVarJ2, new u80.o(), new l4i.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        r6j.c cVar = (r6j.c) this.f250234c;
        nj0.a aVar = cVar.f251879c;
        int i = this.f250233b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            wj0.a aVarI = ((nj0.d) aVar).i();
            vc.s.j(aVarI);
            return new com.revolut.retail.feature.commodity.order_flow.impl.ui.a(aVarI, ((r6j.d) this.d).f251894a, cVar.e.b());
        }
        wj0.a idempotencyKeyHolder = ((nj0.d) aVar).i();
        vc.s.j(idempotencyKeyHolder);
        l80.e dateProvider = cVar.d.h();
        vc.s.j(dateProvider);
        z6j.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return new m60.b(idempotencyKeyHolder, dateProvider, "payments_recurring_transfer");
    }

    private final Object h() {
        r6j.c cVar = (r6j.c) this.f250234c;
        r6j.e eVar = (r6j.e) this.d;
        int i = this.f250233b;
        switch (i) {
            case 0:
                return j.k((j60.a) eVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) eVar.d.get(), (m) eVar.e.get());
            case 2:
                return new m();
            case 3:
                return nga.c.s(cVar.f251888r.c(), (i0) eVar.f251901h.get(), (f0) eVar.f251902j.get(), (on.a) eVar.k.get());
            case 4:
                yji.o controller = (com.revolut.kompot.navigable.a) eVar.d.get();
                m7j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                i0 i0Var = (i0) controller;
                vc.s.k(i0Var);
                return i0Var;
            case 5:
                return nga.c.u(cVar.f251888r.c(), eVar.f251897a, (wn.a) eVar.i.get());
            case 6:
                return v7.z(cVar.f251889s, "provider");
            case 7:
                os2.g factory = cVar.f251889s.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 8:
                wn.a aVar = (wn.a) eVar.i.get();
                n57.a.d(aVar);
                return aVar;
            case 9:
                j4i.a aVar2 = cVar.f;
                l4i.a aVar3 = new l4i.a();
                e4m.e eVar2 = eVar.f;
                r6j.c cVar2 = eVar.f251899c;
                j60.a aVar4 = (j60.a) eVar2.get();
                xv5.a aVar5 = (xv5.a) cVar2.f251890t.f.get();
                vc.s.j(aVar5);
                ffk.t tVarF = cVar2.u.f();
                vc.s.j(tVarF);
                h hVarB = ((k3) cVar2.v).b();
                sf0.h hVarB2 = cVar2.f251891w.b();
                vc.s.j(hVarB2);
                v60.e eVarA = cVar2.f251892x.a();
                vc.s.j(eVarA);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a aVar6 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a(aVar5, tVarF, hVarB, hVarB2, eVarA);
                n7j.c cVar3 = new n7j.c();
                n7j.j orderSummaryMapper = new n7j.j();
                Intrinsics.checkNotNullParameter(orderSummaryMapper, "orderSummaryMapper");
                c7j.f fVar = new c7j.f();
                b7j.b bVar = new b7j.b();
                m41.c cVar4 = cVar2.f251893y;
                usg.a aVar7 = cVar2.f251881h;
                oda.d dVar = cVar2.z;
                k61.a aVarE = cVar4.e();
                vc.s.j(aVarE);
                a7j.d dVar2 = new a7j.d(aVarE, dVar.f(), aVar7.b());
                rea.m mVarF = dVar.f();
                h1 h1VarN = cVar2.A.n();
                vc.s.j(h1VarN);
                a7j.j jVar = new a7j.j(mVarF, h1VarN, aVar7.b());
                u0 u0VarI = cVar2.f251887q.i();
                vc.s.j(u0VarI);
                tzg.m mVarT = cVar2.k.t();
                vc.s.j(mVarT);
                a7j.g gVar = new a7j.g(ImmutableMap.of("DEFAULT", (a7j.l) dVar2, "FREELANCER", (a7j.l) jVar, "TRADING", new a7j.l(u0VarI, mVarT)), 0);
                p0i.b bVarE = cVar2.B.e();
                vc.s.j(bVarE);
                rea.m mVarF2 = dVar.f();
                n nVarB = aVar7.b();
                xua.a aVarA = cVar2.C.a();
                vc.s.j(aVarA);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a aVar8 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a(gVar, bVarE, mVarF2, nVarB, aVarA);
                o7.b bVarA = cVar.f251883l.a();
                rea.m mVarF3 = cVar.z.f();
                ffk.t tVarF2 = cVar.u.f();
                vc.s.j(tVarF2);
                mre.c cVarB = cVar.D.b();
                vc.s.j(cVarB);
                return new l7j.z(aVar3, aVar4, aVar6, cVar3, fVar, bVar, aVar8, bVarA, mVarF3, tVarF2, cVarB, cVar.E.b(), (cli.n) eVar.f251905n.get(), eVar.f251898b);
            case 10:
                return new n7j.e(new kgm.c(new n7j.i(eVar.f251899c.f251887q.f())));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        r6j.c cVar = (r6j.c) this.f250234c;
        r6j.g gVar = (r6j.g) this.d;
        int i = this.f250233b;
        if (i == 0) {
            n60.a aVar = (n60.a) gVar.d.get();
            o5k.i.l(aVar);
            return aVar;
        }
        if (i == 1) {
            return o5k.i.q((com.revolut.kompot.navigable.a) gVar.f251911c.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = gVar.f251909a;
        q7j.e eVar = new q7j.e();
        q7j.b bVar = new q7j.b();
        u80.t tVarU = gVar.f251910b.d.u();
        vc.s.j(tVarU);
        q7j.g gVar2 = new q7j.g(new q7j.c(eVar, bVar, tVarU));
        o7j.a0 a0Var = new o7j.a0();
        l4i.a aVar2 = new l4i.a();
        o7j.a aVar3 = new o7j.a();
        u80.t tVarU2 = cVar.d.u();
        vc.s.j(tVarU2);
        return new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b(commodityTargetPriceScreenContract$InputData, gVar2, a0Var, aVar2, aVar3, tVarU2, cVar.f251885n.a(), (n60.a) gVar.d.get());
    }

    private final Object j() {
        r7d.l lVar = (r7d.l) this.f250234c;
        r7d.b bVar = (r7d.b) this.d;
        int i = this.f250233b;
        switch (i) {
            case 0:
                return j.l((j60.a) bVar.d.get());
            case 1:
                return l.p((com.revolut.kompot.navigable.a) bVar.f252092b.get(), (m) bVar.f252093c.get());
            case 2:
                return new m();
            case 3:
                n60.b bVar2 = (n60.b) bVar.f.get();
                o5k.i.n(bVar2);
                return bVar2;
            case 4:
                return o5k.i.s((com.revolut.kompot.navigable.a) bVar.f252092b.get());
            case 5:
                n60.a aVar = (n60.a) bVar.f252095h.get();
                o5k.i.k(aVar);
                return aVar;
            case 6:
                return o5k.i.p((com.revolut.kompot.navigable.a) bVar.f252092b.get());
            case 7:
                x8d.a extension = (x8d.a) bVar.f252096j.get();
                z7d.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 8:
                return new x8d.b(lVar.f252129a.e());
            case 9:
                Object extension2 = (ep6.n) bVar.f252098m.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                vc.s.k(nVar);
                return nVar;
            case 10:
                return h7d.a.i(lVar.a(), (j60.a) bVar.d.get(), (g1) bVar.f252097l.get());
            case 11:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) bVar.f252092b.get();
                z7d.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 12:
                p pVar = (p) bVar.o.get();
                kde.a aVar2 = lVar.f252129a;
                kde.a aVar3 = lVar.f252129a;
                gg0.d dVar = aVar2.f182872b;
                toh.d dVar2 = new toh.d(dVar.f143575a.a(), (wf0.f) dVar.f.get());
                wli.x xVarA = aVar3.a();
                k18.c cVarC = lVar.c();
                ep6.n nVar2 = (ep6.n) bVar.f252098m.get();
                n60.a aVar4 = (n60.a) bVar.f252095h.get();
                lde.n nVarE = aVar3.e();
                l80.h hVarV = lVar.f252133h.v();
                vc.s.j(hVarV);
                return new y7d.x(pVar, dVar2, xVarA, cVarC, nVar2, aVar4, nVarE, hVarV, (x8d.a) bVar.f252096j.get());
            case 13:
                bVar.getClass();
                return new y7d.t(new a8d.f(new a8d.a(), new y8d.a()), new a8d.d(new a8d.a(), bVar.f252091a.b()), lVar.f252129a.e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        r7d.e eVar = (r7d.e) this.d;
        kde.a aVar = ((r7d.l) this.f250234c).f252129a;
        int i = this.f250233b;
        if (i == 0) {
            return new i8d.e((p) eVar.f252108b.get(), eVar.f252107a, aVar.b());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        kg0.c cVar = (kg0.c) aVar.f182872b.I.get();
        vc.s.j(cVar);
        return new ajd.u(cVar);
    }

    private final Object l() {
        r7d.l lVar = (r7d.l) this.f250234c;
        kde.a aVar = lVar.f252129a;
        r7d.j jVar = (r7d.j) this.d;
        int i = this.f250233b;
        if (i == 0) {
            n60.a aVar2 = (n60.a) jVar.f252124b.get();
            o5k.i.k(aVar2);
            return aVar2;
        }
        if (i == 1) {
            return o5k.i.p((com.revolut.kompot.navigable.a) jVar.f252123a.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new w();
            }
            throw new AssertionError(i);
        }
        p pVar = (p) jVar.d.get();
        wf0.a0 a0Var = (wf0.a0) aVar.f182872b.G.get();
        vc.s.j(a0Var);
        f80.a aVarX = lVar.f252133h.x();
        vc.s.j(aVarX);
        return new v(pVar, a0Var, aVarX, (n60.a) jVar.f252124b.get(), aVar.e());
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object gVar;
        Object lVar;
        switch (this.f250232a) {
            case 0:
                c cVar2 = (c) this.f250234c;
                g gVar2 = (g) this.d;
                int i = this.f250233b;
                switch (i) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(gVar2.f250235a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(gVar2.f250235a);
                        t70.g gVarO = cVar2.f250188b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) gVar2.f.get(), gsi.c.a(gVar2.f250235a));
                    case 3:
                        return new rpi.b(bq.i.b(gVar2.f250235a));
                    case 4:
                        return new rpi.h(bq.i.b(gVar2.f250235a));
                    case 5:
                        cVar = new iri.g((iri.j) cVar2.i.get(), (iri.m) cVar2.f250197q.get(), bq.i.f(gVar2.f250235a), bq.i.l(gVar2.f250235a));
                        break;
                    case 6:
                        cVar = new iri.l((iri.m) cVar2.f250197q.get(), bq.i.f(gVar2.f250235a), (iri.d) gVar2.f250240j.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(gVar2.f250235a));
                    case 8:
                        return new opi.b(bq.i.f(gVar2.f250235a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) gVar2.f250237c.f250198r.get()), bq.i.l(gVar2.f250235a));
                    case 10:
                        return new xpi.c(gVar2.f250236b, bq.i.b(gVar2.f250235a));
                    case 11:
                        hy7.i iVar = new hy7.i((xpi.g) gVar2.f250243n.get(), (f9b.f) gVar2.o.get(), (hy7.g) cVar2.f250199s.get(), (hy7.b) cVar2.f250200t.get(), new iy7.a());
                        kli.a.p(iVar, bq.i.d(gVar2.f250235a));
                        return iVar;
                    case 12:
                        return bq.i.t(gVar2.f250235a);
                    default:
                        throw new AssertionError(i);
                }
                return cVar;
            case 1:
                zu8.a aVar = ((qy8.a) this.f250234c).f250247c;
                qy8.c cVar3 = (qy8.c) this.d;
                ViewController viewController = cVar3.f250254b;
                int i2 = this.f250233b;
                if (i2 == 0) {
                    return new com.revolut.feature.kyc_documents_scan.ui.onfido.c(cVar3.f250253a, e4m.b.a(cVar3.f250255c), e4m.b.a(cVar3.d), (sy8.c) cVar3.e.get(), e4m.b.a(cVar3.f), e4m.b.a(cVar3.f250256g));
                }
                if (i2 == 1) {
                    zy8.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(viewController, "viewController");
                    Onfido client = OnfidoFactory.INSTANCE.create(viewController.m2()).getClient();
                    vc.s.k(client);
                    return client;
                }
                if (i2 == 2) {
                    zy8.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(viewController, "viewController");
                    OnfidoWorkflow onfidoWorkflowCreate = OnfidoWorkflow.INSTANCE.create(viewController.m2());
                    vc.s.k(onfidoWorkflowCreate);
                    return onfidoWorkflowCreate;
                }
                if (i2 == 3) {
                    ny8.a aVar2 = (ny8.a) aVar.f325225c.get();
                    vc.s.j(aVar2);
                    return new sy8.b(aVar2);
                }
                if (i2 == 4) {
                    vw8.a aVar3 = (vw8.a) aVar.f325224b.get();
                    vc.s.j(aVar3);
                    return new az8.c(viewController, aVar3);
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                vw8.a aVar4 = (vw8.a) aVar.f325224b.get();
                vc.s.j(aVar4);
                return new az8.e(viewController, aVar4);
            case 2:
                qy8.a aVar5 = (qy8.a) this.f250234c;
                int i3 = this.f250233b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new q();
                    }
                    throw new AssertionError(i3);
                }
                qy8.d dVar = (qy8.d) this.d;
                TrustdockScreenContract$InputData trustdockScreenContract$InputData = dVar.f250258a;
                q qVar = (q) dVar.f250259b.get();
                y80.a aVarR = aVar5.f250246b.r();
                vc.s.j(aVarR);
                vw8.a aVar6 = (vw8.a) aVar5.f250247c.f325224b.get();
                vc.s.j(aVar6);
                return new ty8.p(trustdockScreenContract$InputData, qVar, aVarR, aVar6);
            case 3:
                u7 u7Var = (u7) this.d;
                qz4.a aVar7 = (qz4.a) this.f250234c;
                l70.e eVar = aVar7.d;
                nj0.a aVar8 = aVar7.e;
                int i5 = this.f250233b;
                if (i5 == 0) {
                    return new a84.e((a84.b) u7Var.d.get());
                }
                if (i5 == 1) {
                    return agk.b.l(u7Var.f119938b);
                }
                if (i5 == 2) {
                    hk0.a aVarJ = ((nj0.d) aVar8).j();
                    zk0.b bVarL = eVar.l();
                    vc.s.j(bVarL);
                    n80.d dVarA = eVar.a();
                    vc.s.j(dVarA);
                    return new y74.d(aVarJ, bVarL, dVarA, aVar7.i.e());
                }
                if (i5 != 3) {
                    if (i5 == 4) {
                        return new v44.q(new r());
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar = (cli.n) u7Var.f119940g.get();
                CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = u7Var.f119939c;
                y74.a aVar9 = (y74.a) u7Var.f.get();
                hz3.c cVarB = ((c1) aVar7.f250342a).b();
                bk0.e eVarH = ((nj0.d) aVar8).h();
                gte.a aVarB = aVar7.f250347j.b();
                vc.s.j(aVarB);
                return new v44.n(nVar, creditApplicationDocumentViewerScreenContract$InputData, aVar9, cVarB, eVarH, aVarB);
            case 4:
                z7 z7Var = (z7) this.d;
                int i6 = this.f250233b;
                if (i6 == 0) {
                    return new y44.m(z7Var.f120318b, (y44.a) ((qz4.b) this.f250234c).d.get(), (cli.n) z7Var.f120319c.get());
                }
                if (i6 == 1) {
                    return new y44.p(new mx4.y());
                }
                throw new AssertionError(i6);
            case 5:
                qz4.b bVar = (qz4.b) this.d;
                qz4.a aVar10 = (qz4.a) this.f250234c;
                u45.h hVar = aVar10.f250346h;
                int i21 = this.f250233b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new AssertionError(i21);
                    }
                    l35.b bVarN = hVar.n();
                    vc.s.j(bVarN);
                    return new zz4.d(bVarN, (rz4.b) aVar10.f250354s.get());
                }
                CreditForbearanceAgreementsContract$InputData creditForbearanceAgreementsContract$InputData = bVar.f250356a;
                mz4.a aVar11 = (mz4.a) aVar10.f250355t.get();
                zz4.d dVar2 = (zz4.d) bVar.d.get();
                l35.b bVarN2 = hVar.n();
                vc.s.j(bVarN2);
                return new com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c(creditForbearanceAgreementsContract$InputData, aVar11, dVar2, bVarN2, (rz4.b) aVar10.f250354s.get(), new v44.r(), new y44.q());
            case 6:
                r36.e eVar2 = (r36.e) this.f250234c;
                r36.c cVar4 = (r36.c) this.d;
                r36.e eVar3 = cVar4.f251159c;
                int i22 = this.f250233b;
                switch (i22) {
                    case 0:
                        jyh.a extensions = (jyh.a) cVar4.e.get();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        return extensions.f179443a;
                    case 1:
                        return m0.s(new smd.s(new zyh.d(new l4i.a()), new azh.a()), (kyh.c) cVar4.d.get());
                    case 2:
                        ViewController view = cVar4.f251157a;
                        y36.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        return (DeFiExchangeAmountScreen) view;
                    case 3:
                        KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) cVar4.f251161h.get();
                        pl1.d.n(keyboardSuggestionsControllerExtension);
                        return keyboardSuggestionsControllerExtension;
                    case 4:
                        return pl1.d.u((com.revolut.kompot.navigable.a) cVar4.f251160g.get());
                    case 5:
                        jyh.a extensions2 = (jyh.a) cVar4.e.get();
                        Intrinsics.checkNotNullParameter(extensions2, "extensions");
                        return extensions2.f179444b;
                    case 6:
                        tyh.b bVar2 = eVar3.f251167c;
                        bof.r rVar = new bof.r(new com.revolut.feature_crypto_order_flow.impl.exchange.mappers.a(bVar2.d.c(), bVar2.c()), new bzh.j(), new a46.e(), new a46.a(), cVar4.f251158b);
                        DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = cVar4.f251158b;
                        o36.f fVar = (o36.f) eVar3.z.get();
                        xv5.c cVarA = eVar3.f251168g.a();
                        vc.s.j(cVarA);
                        kgm.i iVar2 = new kgm.i(fVar, cVarA);
                        k18.c cVarA2 = eVar2.f251169h.a();
                        b46.c cVar5 = new b46.c();
                        g26.b bVarA = eVar2.i.a();
                        vc.s.j(bVarA);
                        o36.d dVar3 = new o36.d((ue0.c) eVar3.f251179w.get());
                        k18.c cVarA3 = eVar3.f251169h.a();
                        g26.b bVarA2 = eVar3.i.a();
                        vc.s.j(bVarA2);
                        k18.c cVar6 = new k18.c(dVar3, cVarA3, bVarA2);
                        w80.a aVar12 = (w80.a) eVar2.f251170j.X.get();
                        vc.s.j(aVar12);
                        z36.a aVar13 = new z36.a();
                        gte.a aVarB2 = eVar2.k.b();
                        vc.s.j(aVarB2);
                        return new x36.y(rVar, deFiExchangeAmountContract$InputData, iVar2, cVarA2, cVar5, bVarA, cVar6, aVar12, aVar13, aVarB2, eVar2.f251171l.d());
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                r36.e eVar4 = (r36.e) this.f250234c;
                r36.g gVar3 = (r36.g) this.d;
                r36.e eVar5 = gVar3.f251187c;
                int i32 = this.f250233b;
                if (i32 == 0) {
                    return new aah.g((e46.a) gVar3.d.get(), (c76.a) gVar3.e.get());
                }
                if (i32 == 1) {
                    ViewController screen = gVar3.f251185a;
                    d46.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(screen, "screen");
                    return (DeFiExchangeSummaryScreen) screen;
                }
                if (i32 == 2) {
                    i76.c cVar7 = new i76.c();
                    f61.a factory = new f61.a(cVar7);
                    f46.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return new i76.d(cVar7);
                }
                if (i32 == 3) {
                    return new aah.g((g46.b) gVar3.d.get(), (g46.a) gVar3.f251188g.get());
                }
                if (i32 == 4) {
                    mre.c cVarB2 = eVar4.f251172m.b();
                    vc.s.j(cVarB2);
                    return new g46.f(cVarB2, new g46.d());
                }
                if (i32 != 5) {
                    throw new AssertionError(i32);
                }
                bof.r rVar2 = new bof.r(new d0i.j(), eVar5.f251173n.b(), new c46.i(eVar5.o.g()), new a46.a());
                DeFiExchangeSummaryContract$InputData deFiExchangeSummaryContract$InputData = gVar3.f251186b;
                wj0.a aVarI = ((nj0.d) eVar4.d).i();
                vc.s.j(aVarI);
                o36.f fVar2 = (o36.f) eVar5.z.get();
                xv5.c cVarA4 = eVar5.f251168g.a();
                vc.s.j(cVarA4);
                kgm.i iVar3 = new kgm.i(fVar2, cVarA4);
                o36.f fVar3 = (o36.f) eVar5.z.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) eVar5.f251174p).c();
                vc.s.j(aVarC);
                s36.p pVar = new s36.p(fVar3, aVarC);
                sh5.d dVarF = eVar4.f251175q.f();
                vc.s.j(dVarF);
                c46.b bVar3 = new c46.b();
                b46.c cVar8 = new b46.c();
                o36.d dVar4 = new o36.d((ue0.c) eVar5.f251179w.get());
                i46.a aVar14 = new i46.a();
                g26.b bVarA3 = eVar4.i.a();
                vc.s.j(bVarA3);
                return new com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a(rVar2, deFiExchangeSummaryContract$InputData, aVarI, iVar3, pVar, dVarF, bVar3, cVar8, dVar4, aVar14, bVarA3);
            case 8:
                r39.b bVar4 = (r39.b) this.d;
                int i33 = this.f250233b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new s39.g();
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar2 = (cli.n) bVar4.f251226b.get();
                DateInputInputData dateInputInputData = bVar4.f251225a;
                l80.e eVarH2 = ((r39.c) this.f250234c).f251228a.h();
                vc.s.j(eVarH2);
                return new s39.f(nVar2, dateInputInputData, eVarH2);
            case 9:
                r41.b bVar5 = (r41.b) this.f250234c;
                r41.a aVar15 = (r41.a) this.d;
                int i43 = this.f250233b;
                switch (i43) {
                    case 0:
                        return bq.i.u(aVar15.y());
                    case 1:
                        return bq.i.B(aVar15.y());
                    case 2:
                        return bq.i.q(aVar15.y());
                    case 3:
                        return hsi.b.v(aVar15.y());
                    case 4:
                        return h7d.a.l(aVar15.y());
                    case 5:
                        return bq.i.w(aVar15.y());
                    case 6:
                        return hsi.b.A(aVar15.y());
                    case 7:
                        return l9.c(aVar15.f251388a, bVar5.f251405a.b());
                    case 8:
                        j2 settingsTracker = bVar5.f251406b.h();
                        vc.s.j(settingsTracker);
                        m41.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(settingsTracker, "settingsTracker");
                        gVar = new mn.g(settingsTracker);
                        return gVar;
                    case 9:
                        u2l.a aVar16 = aVar15.f251388a;
                        j2 j2VarH = bVar5.f251406b.h();
                        vc.s.j(j2VarH);
                        return l9.g(aVar16, j2VarH);
                    case 10:
                        return l9.b(aVar15.y(), bVar5.f251405a.b());
                    case 11:
                        Activity activityY = aVar15.y();
                        mli.e eVarB = ((j51.a) bVar5.f251407c).b();
                        vc.s.j(eVarB);
                        return l9.l(activityY, eVarB, (aqi.a) aVar15.f251397p.get(), new c5l.b());
                    case 12:
                        return new aqi.d(aVar15.y(), new y80.b());
                    case 13:
                        e86.a aVar17 = bVar5.d;
                        asi.b bVar6 = bVar5.f251407c;
                        ao.h hVarA = aVar17.a();
                        sri.m mVar = (sri.m) aVar15.f251399r.get();
                        asi.d dVarC = ((j51.a) bVar6).c();
                        vc.s.j(dVarC);
                        mli.e eVarA = ((j51.a) bVar6).a();
                        vc.s.j(eVarA);
                        uil.a aVarA = bVar5.e.a();
                        vc.s.j(aVarA);
                        com.revolut.retail.feature.api.userauth.navigation.a aVarA2 = bVar5.f.a();
                        vc.s.j(aVarA2);
                        return l9.d(hVarA, mVar, dVarC, eVarA, aVarA, aVarA2, (tpi.j) aVar15.f251401t.get());
                    case 14:
                        return bq.i.c(aVar15.y(), aVar15.f251389b);
                    case 15:
                        return new tpi.i((rpi.c) aVar15.f251400s.get(), bq.i.m(aVar15.y()));
                    case 16:
                        return new rpi.b(aVar15.y());
                    case 17:
                        return xhi.f.o(aVar15.y(), ((a0b.d) bVar5.f251408g).b(), (sri.m) aVar15.f251399r.get());
                    case 18:
                        u2l.a aVar18 = aVar15.f251388a;
                        l9.a(aVar18);
                        asi.b bVar7 = bVar5.f251407c;
                        an0.c cVar9 = bVar5.f251409h;
                        asi.d dVarC2 = ((j51.a) bVar7).c();
                        vc.s.j(dVarC2);
                        sri.m mVar2 = (sri.m) aVar15.f251399r.get();
                        om0.b bVarC = cVar9.c();
                        vc.s.j(bVarC);
                        p1b.b bVar8 = (p1b.b) bVar5.i.f.get();
                        vc.s.j(bVar8);
                        zm0.b bVarI = cVar9.i();
                        vc.s.j(bVarI);
                        lVar = new xoi.l(aVar18, dVarC2, mVar2, bVarC, bVar8, bVarI);
                        return lVar;
                    case 19:
                        yri.a aVarA3 = bVar5.i.a();
                        vc.s.j(aVarA3);
                        gVar = new xoi.c(aVarA3);
                        return gVar;
                    case 20:
                        Activity activityY2 = aVar15.y();
                        b80.c cVarP = bVar5.f251410j.p();
                        vc.s.j(cVarP);
                        lVar = new mpi.d(activityY2, cVarP);
                        return lVar;
                    case 21:
                        u2l.a aVar19 = aVar15.f251388a;
                        l9.a(aVar19);
                        ppi.d dVar5 = (ppi.d) bVar5.k.e.get();
                        vc.s.j(dVar5);
                        lVar = new ppi.c(aVar19, dVar5);
                        return lVar;
                    case 22:
                        u2l.a aVar20 = aVar15.f251388a;
                        l9.a(aVar20);
                        bq.i.h(aVar20);
                        u2l.a aVar21 = aVar15.f251388a;
                        l9.a(aVar21);
                        t70.g gVarO2 = bVar5.f251410j.o();
                        vc.s.j(gVarO2);
                        lVar = new npi.c(aVar20, aVar21, gVarO2);
                        return lVar;
                    case 23:
                        u2l.a aVar22 = aVar15.f251388a;
                        l9.a(aVar22);
                        return new opi.b(aVar22);
                    case 24:
                        om0.b bVarC2 = bVar5.f251409h.c();
                        vc.s.j(bVarC2);
                        gVar = new lri.b(bVarC2);
                        return gVar;
                    case 25:
                        return new rpi.h(aVar15.y());
                    case 26:
                        return new iri.j();
                    case 27:
                        nf0.a aVar23 = bVar5.f251411l;
                        asi.b bVar9 = bVar5.f251407c;
                        q1 q1Var = bVar5.f251415q;
                        qf0.c cVarA5 = aVar23.a();
                        vc.s.j(cVarA5);
                        sri.m mVarD = bVar5.o.d();
                        vc.s.j(mVarD);
                        oe.c cVarM = bq.i.m(aVar15.y());
                        pak.h hVarA2 = bVar5.f251414p.a();
                        fkl.h hVar2 = (fkl.h) ((q0) q1Var).G.get();
                        vc.s.j(hVar2);
                        sf0.h hVarB = bVar5.f251411l.b();
                        vc.s.j(hVarB);
                        yil.b bVar10 = ((q0) q1Var).f196063h.f248575j;
                        oad.a aVar24 = (oad.a) bVar5.f251416r;
                        Optional optionalOf = Optional.of(new rad.a(e4m.b.a(aVar24.k), e4m.b.a(aVar24.f223583l)));
                        vc.s.j(optionalOf);
                        mli.e eVarB2 = ((j51.a) bVar9).b();
                        vc.s.j(eVarB2);
                        asi.d dVarC3 = ((j51.a) bVar9).c();
                        vc.s.j(dVarC3);
                        zm0.c cVarJ = bVar5.f251409h.j();
                        vc.s.j(cVarJ);
                        return new com.revolut.feature.restricted_access.h(cVarA5, mVarD, cVarM, hVarA2, hVar2, hVarB, bVar10, optionalOf, eVarB2, dVarC3, cVarJ);
                    case 28:
                        qf0.c cVarA6 = bVar5.f251411l.a();
                        vc.s.j(cVarA6);
                        sri.m mVarD2 = bVar5.o.d();
                        vc.s.j(mVarD2);
                        gVar = new com.revolut.feature.restricted_access.j(cVarA6, mVarD2);
                        return gVar;
                    case 29:
                        qf0.c cVarA7 = bVar5.f251411l.a();
                        vc.s.j(cVarA7);
                        sri.m mVarD3 = bVar5.o.d();
                        vc.s.j(mVarD3);
                        gVar = new com.revolut.feature.restricted_access.c(cVarA7, mVarD3, wza.b.a());
                        return gVar;
                    case 30:
                        return hsi.b.B(aVar15.y());
                    case 31:
                        return hsi.b.y(aVar15.y());
                    case 32:
                        return bq.i.y(aVar15.y());
                    case 33:
                        return h7d.a.n(aVar15.y());
                    case 34:
                        return h7d.a.r(aVar15.y());
                    case 35:
                        return h7d.a.g(aVar15.y());
                    case 36:
                        u2l.a aVar25 = aVar15.f251388a;
                        l9.a(aVar25);
                        bq.i.h(aVar25);
                        return new lpi.b(aVar25, (yy0.f) aVar15.f.get());
                    case 37:
                        return new gqi.b(aVar15.y());
                    case 38:
                        f9b.g gVar4 = (f9b.g) bVar5.f251417s.f141525g.get();
                        vc.s.j(gVar4);
                        return m0.q(gVar4, aVar15.f251388a, (kwl.b) aVar15.Q.get(), (Set) aVar15.R.get());
                    case 39:
                        return l9.h(aVar15.f251390c, (kwl.a) aVar15.P.get());
                    case 40:
                        w49.a aVar26 = (w49.a) aVar15.O.get();
                        n nVarB = bVar5.f251419w.b();
                        r41.b bVar11 = aVar15.e;
                        sri.m mVarD4 = bVar11.o.d();
                        vc.s.j(mVarD4);
                        com.revolut.feature.kyc.impl.e eVar6 = new com.revolut.feature.kyc.impl.e();
                        v60.e eVarA2 = bVar11.f251413n.a();
                        vc.s.j(eVarA2);
                        mt8.a aVarA4 = bVar11.f251420x.a();
                        vc.s.j(aVarA4);
                        lVar = new kwl.a(aVar26, nVarB, new KycNotPassedErrorHandler(mVarD4, eVar6, eVarA2, aVarA4));
                        return lVar;
                    case 41:
                        u2l.a aVar27 = aVar15.f251388a;
                        l9.a(aVar27);
                        jxj.a aVar28 = bVar5.f;
                        l70.e eVar7 = bVar5.f251410j;
                        w9k.a aVar29 = bVar5.f251418t;
                        com.revolut.retail.feature.api.userauth.navigation.a aVarA5 = aVar28.a();
                        vc.s.j(aVarA5);
                        x9k.a aVarA6 = aVar29.a();
                        vc.s.j(aVarA6);
                        aa5.a aVar30 = (aa5.a) aVar29.f295756n.get();
                        vc.s.j(aVar30);
                        t70.g gVarO3 = eVar7.o();
                        vc.s.j(gVarO3);
                        v60.e eVarA3 = bVar5.f251413n.a();
                        vc.s.j(eVarA3);
                        rqi.c cVarB3 = bVar5.k.b();
                        fwj.p pVarA = bVar5.u.a();
                        vc.s.j(pVarA);
                        qd0.b bVarN3 = eVar7.n();
                        vc.s.j(bVarN3);
                        pwl.d dVar6 = new pwl.d();
                        gte.a aVarB3 = bVar5.v.b();
                        vc.s.j(aVarB3);
                        gVar = new cwl.g(aVar27, aVarA5, aVarA6, aVar30, gVarO3, eVarA3, cVarB3, pVarA, bVarN3, dVar6, aVarB3);
                        return gVar;
                    case 42:
                        return l9.e(aVar15.f251390c, (kwl.a) aVar15.P.get());
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                o oVar = (o) this.f250234c;
                l70.e eVar8 = oVar.o;
                r6e.c cVar10 = (r6e.c) this.d;
                int i59 = this.f250233b;
                switch (i59) {
                    case 0:
                        return j.l((j60.a) cVar10.d.get());
                    case 1:
                        return l.p((com.revolut.kompot.navigable.a) cVar10.f251714b.get(), (m) cVar10.f251715c.get());
                    case 2:
                        return new m();
                    case 3:
                        k6e.e delegate = (k6e.e) cVar10.f.get();
                        p7e.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(delegate, "delegate");
                        vc.s.k(delegate);
                        return delegate;
                    case 4:
                        j60.a expandableControllerExtension = (j60.a) cVar10.d.get();
                        e7e.b provider = (e7e.b) oVar.O.get();
                        p7e.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(expandableControllerExtension, "dialogExtension");
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        provider.getClass();
                        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
                        return new e7e.a(expandableControllerExtension, provider.f123309a, provider.f123310b);
                    case 5:
                        p pVar2 = (p) cVar10.f251717h.get();
                        g6e.d dVarB = oVar.f251773c.b();
                        vc.s.j(dVarB);
                        ppk.f fVarA = oVar.z.a();
                        BillAccountDetailScreenContract$InputData billAccountDetailScreenContract$InputData = cVar10.f251713a;
                        o7e.n nVar3 = new o7e.n();
                        j60.a aVar31 = (j60.a) cVar10.d.get();
                        k6e.e eVar9 = (k6e.e) cVar10.f.get();
                        l80.e eVarH3 = eVar8.h();
                        vc.s.j(eVarH3);
                        nhf.a aVarA7 = oVar.A.a();
                        vc.s.j(aVarA7);
                        return new k(pVar2, dVarB, fVarA, billAccountDetailScreenContract$InputData, nVar3, aVar31, eVar9, eVarH3, aVarA7);
                    case 6:
                        a9e.a aVar32 = (a9e.a) oVar.P.get();
                        l80.e eVarH4 = eVar8.h();
                        vc.s.j(eVarH4);
                        return new o7e.m(aVar32, eVarH4);
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                o oVar2 = (o) this.f250234c;
                r6e.d dVar7 = (r6e.d) this.d;
                int i66 = this.f250233b;
                if (i66 == 0) {
                    return j.m((j60.a) dVar7.f.get());
                }
                if (i66 == 1) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) dVar7.d.get(), (m) dVar7.e.get());
                }
                if (i66 == 2) {
                    return new m();
                }
                if (i66 != 3) {
                    throw new AssertionError(i66);
                }
                BillsEditFlowContract$InputData billsEditFlowContract$InputData = dVar7.f251719a;
                g6e.d dVarB2 = oVar2.f251773c.b();
                vc.s.j(dVarB2);
                xua.a aVarA8 = oVar2.f251782r.a();
                vc.s.j(aVarA8);
                return new com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a(billsEditFlowContract$InputData, dVarB2, aVarA8, (g6e.g) oVar2.L.get(), (j60.a) dVar7.f.get());
            case 12:
                r6e.f fVar4 = (r6e.f) this.d;
                o oVar3 = (o) this.f250234c;
                e48.a aVar33 = oVar3.d;
                int i74 = this.f250233b;
                if (i74 == 0) {
                    w2 jointMcyErrorGuardianControllerExtensionProvider = aVar33.b();
                    u7e.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(jointMcyErrorGuardianControllerExtensionProvider, "jointMcyErrorGuardianControllerExtensionProvider");
                    return jointMcyErrorGuardianControllerExtensionProvider.S();
                }
                if (i74 != 1) {
                    if (i74 == 2) {
                        return new r7e.c();
                    }
                    throw new AssertionError(i74);
                }
                CreateSubaccountFlowContract$InputData createSubaccountFlowContract$InputData = fVar4.f251728a;
                g6e.d dVarB3 = oVar3.f251773c.b();
                vc.s.j(dVarB3);
                zja.a aVarA9 = ((ika.b) oVar3.B).a();
                vc.s.j(aVarA9);
                zfe.e eVar10 = fVar4.f251729b;
                g6e.b bVarA4 = oVar3.f251775h.a();
                vc.s.j(bVarA4);
                return new com.revolut.feature.subaccount.impl.ui.create.flow.main.c(createSubaccountFlowContract$InputData, dVarB3, aVarA9, eVar10, bVarA4, new l2j.a(), (r7e.c) fVar4.f.get(), new t7e.k(fVar4.f251730c.f.e()), aVar33.c(), new w38.t());
            case 13:
                o oVar4 = (o) this.f250234c;
                xmg.a aVar34 = oVar4.f;
                r6e.g gVar5 = (r6e.g) this.d;
                int i92 = this.f250233b;
                switch (i92) {
                    case 0:
                        return j.l((j60.a) gVar5.d.get());
                    case 1:
                        return l.p((com.revolut.kompot.navigable.a) gVar5.f251733b.get(), (m) gVar5.f251734c.get());
                    case 2:
                        return new m();
                    case 3:
                        rsi.g delegate2 = (rsi.g) gVar5.f.get();
                        s8e.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(delegate2, "delegate");
                        vc.s.k(delegate2);
                        return delegate2;
                    case 4:
                        j60.a expandableControllerExtension2 = (j60.a) gVar5.d.get();
                        lqk.e provider2 = (lqk.e) oVar4.v.G.get();
                        vc.s.j(provider2);
                        s8e.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(expandableControllerExtension2, "dialogExtension");
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        Intrinsics.checkNotNullParameter(expandableControllerExtension2, "expandableControllerExtension");
                        return new lqk.d(expandableControllerExtension2, provider2.f199333b, provider2.f199332a);
                    case 5:
                        p pVar3 = (p) gVar5.f251736h.get();
                        GroupMembersScreenContract$InputData groupMembersScreenContract$InputData = gVar5.f251732a;
                        g6e.d dVarB4 = oVar4.f251773c.b();
                        vc.s.j(dVarB4);
                        ang.f fVarE = aVar34.e();
                        l61.a aVarB4 = aVar34.b();
                        vc.s.j(aVarB4);
                        return new r8e.n(pVar3, groupMembersScreenContract$InputData, dVarB4, fVarE, aVarB4, (rsi.g) gVar5.f.get(), new p8e.a(), (j60.a) gVar5.d.get());
                    case 6:
                        return new r8e.o();
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                r6e.j jVar = (r6e.j) this.d;
                o oVar5 = (o) this.f250234c;
                usg.a aVar35 = oVar5.k;
                r6e.a0 a0Var = oVar5.f251773c;
                l70.e eVar11 = oVar5.o;
                int i96 = this.f250233b;
                if (i96 == 0) {
                    wj0.a idempotencyKeyHolder = ((nj0.d) oVar5.f251779n).i();
                    vc.s.j(idempotencyKeyHolder);
                    l80.e dateProvider = eVar11.h();
                    vc.s.j(dateProvider);
                    v8e.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    return new m60.b(idempotencyKeyHolder, dateProvider, "payments_recurring_transfer");
                }
                if (i96 == 1) {
                    r10.f factory2 = oVar5.f251780p.a();
                    v8e.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return factory2.d();
                }
                if (i96 == 2) {
                    RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = jVar.f251755a;
                    zof.f fVarD = oVar5.f251781q.d();
                    vc.s.j(fVarD);
                    g6e.d dVarB5 = a0Var.b();
                    vc.s.j(dVarB5);
                    l80.e eVarH5 = eVar11.h();
                    vc.s.j(eVarH5);
                    return new com.revolut.feature.subaccount.impl.ui.recurring_transfer.b(recurringTransferFlowContract$FlowInput, fVarD, dVarB5, eVarH5);
                }
                if (i96 != 3) {
                    if (i96 != 4) {
                        throw new AssertionError(i96);
                    }
                    g6e.d dVarB6 = a0Var.b();
                    vc.s.j(dVarB6);
                    n nVarB2 = aVar35.b();
                    ppg.a aVarA10 = ((wpg.l) oVar5.i).a();
                    vc.s.j(aVarA10);
                    l80.e eVarH6 = eVar11.h();
                    vc.s.j(eVarH6);
                    srf.e transferValidator = xbb.e.a();
                    Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
                    return new u8e.a(dVarB6, nVarB2, aVarA10, eVarH6, new o7.d(transferValidator));
                }
                l80.e dateProvider2 = eVar11.h();
                vc.s.j(dateProvider2);
                n walletInteractor = aVar35.b();
                xua.a recurringPaymentInteractor = oVar5.f251782r.a();
                vc.s.j(recurringPaymentInteractor);
                com.revolut.domain.interactors.transactions.a transactionsInteractor = ((bjf.a) oVar5.f251783s).c();
                vc.s.j(transactionsInteractor);
                v8e.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
                Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                return new uqg.a(dateProvider2, walletInteractor, recurringPaymentInteractor, transactionsInteractor, 1);
            case 15:
                int i99 = this.f250233b;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new a8e.k();
                    }
                    throw new AssertionError(i99);
                }
                p pVar4 = (p) ((r6e.k) this.d).f251761a.get();
                fk3.a aVarA11 = ((o) this.f250234c).u.a();
                vc.s.j(aVarA11);
                return new a8e.i(pVar4, new u6e.b(aVarA11));
            case 16:
                r6e.p pVar5 = (r6e.p) this.d;
                o oVar6 = (o) this.f250234c;
                zc6.b bVar12 = oVar6.G;
                int i100 = this.f250233b;
                if (i100 == 0) {
                    fd6.a aVar36 = (fd6.a) pVar5.d.get();
                    va.g.t(aVar36);
                    return aVar36;
                }
                if (i100 == 1) {
                    return va.g.s(((zc6.a) bVar12).d(), (xc6.a) pVar5.f251790c.get());
                }
                if (i100 == 2) {
                    return r6.b.k((zc6.a) bVar12, "factory");
                }
                if (i100 == 3) {
                    return va.g.u((xc6.a) pVar5.f251790c.get());
                }
                if (i100 != 4) {
                    if (i100 == 5) {
                        return new c8e.c();
                    }
                    throw new AssertionError(i100);
                }
                ac4.g gVar6 = new ac4.g((c8e.b) pVar5.f251791g.get(), ((zc6.a) pVar5.f251789b.G).c());
                g6e.d dVarB7 = oVar6.f251773c.b();
                vc.s.j(dVarB7);
                g6e.g gVar7 = (g6e.g) oVar6.L.get();
                ang.f fVarE2 = oVar6.f.e();
                hj8.a aVarA12 = oVar6.H.a();
                vc.s.j(aVarA12);
                xqe.b bVarA5 = oVar6.I.a();
                vc.s.j(bVarA5);
                return new b8e.m(gVar6, dVarB7, gVar7, fVarE2, aVarA12, bVarA5, ((zc6.a) bVar12).b(), pVar5.f251788a);
            case 17:
                return a();
            case 18:
                return b();
            case 19:
                return c();
            case 20:
                return d();
            case 21:
                return e();
            case 22:
                return f();
            case 23:
                return g();
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
                h30.a aVar37 = ((r7d.l) this.f250234c).e;
                r7d.m mVar3 = (r7d.m) this.d;
                int i101 = this.f250233b;
                if (i101 == 0) {
                    return new com.revolut.feature.shared.help_centre.impl.main.a(mVar3.f252137a);
                }
                if (i101 == 1) {
                    w50.l factory3 = (w50.l) ((h30.n) aVar37).f148928t0.get();
                    vc.s.j(factory3);
                    y40.b pdfViewExtension = (y40.b) mVar3.e.get();
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) mVar3.f.get();
                    k9d.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory3, "factory");
                    Intrinsics.checkNotNullParameter(pdfViewExtension, "pdfViewExtension");
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return factory3.a(controller, pdfViewExtension);
                }
                if (i101 == 2) {
                    rf3.b factory4 = (rf3.b) ((h30.n) aVar37).f148906b.C.get();
                    vc.s.j(factory4);
                    k9d.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    return new rf3.a();
                }
                if (i101 != 3) {
                    throw new AssertionError(i101);
                }
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) mVar3.f.get();
                k9d.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return x0.a(g1.Companion, controller2.D2());
        }
    }

    public f(qz4.a aVar, qz4.b bVar, z7 z7Var, int i) {
        this.f250232a = 4;
        this.f250234c = bVar;
        this.d = z7Var;
        this.f250233b = i;
    }
}
