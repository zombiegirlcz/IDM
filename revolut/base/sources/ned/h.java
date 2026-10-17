package ned;

import a32.a0;
import a32.c0;
import al4.p;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.shared.CFACInsuranceAddExpensesItemMapper;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreenContract$InputData;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.summary_screen.mapper.RevPointsEarningItemMapper;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreenContract$InputData;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreenContract$InputData;
import d73.u;
import g48.r0;
import g4k.f0;
import g4k.g0;
import g4k.i0;
import i52.z;
import ip0.v7;
import java.util.List;
import java.util.Optional;
import jm4.a3;
import k7c.d0;
import kotlin.jvm.internal.Intrinsics;
import n5k.q;
import om4.k0;
import p12.b0;
import p12.l0;
import p12.p0;
import p12.t0;
import p12.v;
import p12.v0;
import p12.w0;
import p5k.w;
import p5k.y;
import qgk.k3;
import rp0.g1;
import rp0.x0;
import t73.d3;
import t73.u2;
import t73.w2;
import v73.o;
import v73.r;
import vc.s;
import vgf.e1;
import vgf.i1;
import vgf.j1;
import vgf.k1;
import vi9.e0;
import wf0.u0;
import wli.x;
import xf6.n1;
import xf6.t;
import z0h.q1;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f214458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f214459c;
    public final int d;
    public final Object e;

    public /* synthetic */ h(Object obj2, qji.b bVar, Object obj3, int i, int i2) {
        this.f214457a = i2;
        this.f214458b = obj2;
        this.f214459c = bVar;
        this.e = obj3;
        this.d = i;
    }

    private final Object a() {
        o73.f fVar = (o73.f) this.f214459c;
        o73.g gVar = (o73.g) this.e;
        o73.e eVar = (o73.e) this.f214458b;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) gVar.f222678g.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) gVar.e.get(), (rp0.m) gVar.f.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) gVar.f222680j.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) eVar.d).d(), (xc6.a) gVar.i.get());
            case 5:
                return r6.b.k((zc6.a) eVar.d, "factory");
            case 6:
                Object extension = (v73.a) gVar.f222681l.get();
                u73.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                s.k(nVar);
                return nVar;
            case 7:
                l93.b bVarG = eVar.e.g();
                s.j(bVarG);
                wg1.b bVarB = eVar.f.f138522a.b();
                s.j(bVarB);
                li0.a aVar2 = new li0.a();
                li0.d dVar = new li0.d();
                ang.f fVarE = eVar.f222657h.e();
                wsg.n nVarB = eVar.i.b();
                li0.b bVarC = t2d.c.c(eVar.f222656g.f271230a);
                gte.a aVarB = eVar.f222655c.b();
                s.j(aVarB);
                return new v73.j(bVarG, bVarB, aVar2, dVar, fVarE, nVarB, bVarC, aVarB, gVar.f222675a);
            case 8:
                Object extension2 = (v73.k) gVar.f222683n.get();
                u73.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar2 = (yji.n) extension2;
                s.k(nVar2);
                return nVar2;
            case 9:
                ic8.a aVar3 = (ic8.a) eVar.f222658j.f.get();
                s.j(aVar3);
                return new o(aVar3, eVar.f222657h.e(), eVar.i.b(), eVar.k.a());
            case 10:
                r extension3 = (r) gVar.f222684p.get();
                u73.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                s.k(extension3);
                return extension3;
            case 11:
                return new r(eVar.f222659l.d());
            case 12:
                Object extension4 = (di9.c) gVar.f222686r.get();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar3 = (yji.n) extension4;
                s.k(nVar3);
                return nVar3;
            case 13:
                ij9.a provider = eVar.f222660m.k();
                s.j(provider);
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider.a();
            case 14:
                Object extension5 = (di9.d) gVar.f222688t.get();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                yji.n nVar4 = (yji.n) extension5;
                s.k(nVar4);
                return nVar4;
            case 15:
                ij9.a provider2 = eVar.f222660m.k();
                s.j(provider2);
                j60.a bottomDialogExtension = (j60.a) gVar.f222678g.get();
                di9.c payLaterModeActivationExtension = (di9.c) gVar.f222686r.get();
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "dialogControllerExtension");
                Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
                return new ij9.i(bottomDialogExtension, provider2.f161734a, provider2.f161735b, provider2.f161736c, provider2.e, payLaterModeActivationExtension);
            case 16:
                return va.g.u((xc6.a) gVar.i.get());
            case 17:
                e4m.e eVar2 = gVar.f222690x;
                o73.f fVar2 = gVar.d;
                cli.n nVar5 = (cli.n) eVar2.get();
                CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = gVar.f222676b;
                oi9.f fVar3 = eVar.f222660m;
                tz2.d dVar2 = eVar.A;
                da3.j jVar = eVar.e;
                l70.e eVar3 = eVar.f222662p;
                xh9.a aVarE = fVar3.e();
                s.j(aVarE);
                CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData2 = gVar.f222676b;
                o73.e eVar4 = gVar.f222677c;
                c73.j jVar2 = eVar4.f222653a;
                ava.a aVar4 = eVar4.f222668x;
                da3.j jVar3 = eVar4.e;
                oi9.f fVar4 = eVar4.f222660m;
                l63.a aVar5 = (l63.a) jVar2.u.get();
                s.j(aVar5);
                fy2.d dVar3 = eVar4.f222665s;
                l93.f fVarJ = dVar3.f138882a.j();
                s.j(fVarJ);
                r10.a aVar6 = new r10.a(fVarJ, dVar3.a());
                k63.a aVar7 = (k63.a) fVar2.i.get();
                sh3.a aVarA = eVar4.f222666t.a();
                s.j(aVarA);
                fk3.a aVarA2 = eVar4.u.a();
                s.j(aVarA2);
                mt8.d dVarB = eVar4.f222654b.b();
                s.j(dVarB);
                p pVarI = eVar4.f222664r.i();
                xh9.a aVarE2 = fVar4.e();
                s.j(aVarE2);
                ti9.h hVarB = fVar4.b();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) eVar4.v).c();
                s.j(aVarC);
                nhf.a aVarA3 = eVar4.f222667w.a();
                s.j(aVarA3);
                ha3.f fVarD = jVar3.d();
                s.j(fVarD);
                xua.a aVarA4 = aVar4.a();
                s.j(aVarA4);
                wsg.n nVarB2 = eVar4.i.b();
                l93.f fVarJ2 = jVar3.j();
                s.j(fVarJ2);
                n6e.b bVarA = eVar4.f222669y.a();
                k63.a aVar8 = (k63.a) fVar2.i.get();
                r0 r0VarC = eVar4.z.c();
                xua.a aVarA5 = aVar4.a();
                s.j(aVarA5);
                gte.a aVarB2 = eVar4.f222655c.b();
                s.j(aVarB2);
                l80.e eVarH = eVar4.f222662p.h();
                s.j(eVarH);
                ang.f fVarE2 = eVar4.f222657h.e();
                d9e.b bVar = (d9e.b) eVar4.f222661n.C.get();
                s.j(bVar);
                d3 d3Var = new d3(cardsCarouselScreenContract$InputData2, aVar5, aVar6, aVar7, aVarA, aVarA2, dVarB, pVarI, aVarE2, hVarB, aVarC, aVarA3, fVarD, aVarA4, nVarB2, fVarJ2, bVarA, aVar8, r0VarC, new t73.f(aVarA5, aVarB2, eVarH, fVarE2, bVar));
                di9.d dVar4 = (di9.d) gVar.f222688t.get();
                e0 e0VarQ = eVar.f222660m.q();
                c90.c cVar = (c90.c) gVar.f222689w.get();
                j60.a aVar9 = (j60.a) gVar.f222678g.get();
                w73.b bVar2 = new w73.b((p63.a) fVar2.f222673g.get());
                y63.h hVar = new y63.h();
                u2 u2Var = new u2();
                c70.a aVarZ = eVar3.z();
                s.j(aVarZ);
                r70.c cVarA = eVar3.A();
                s.j(cVarA);
                g1 g1Var = (g1) gVar.f222691y.get();
                x63.a aVar10 = new x63.a();
                l93.f fVarJ3 = jVar.j();
                s.j(fVarJ3);
                ha3.k kVar = (ha3.k) jVar.H.get();
                s.j(kVar);
                hy2.f fVarA = eVar.f222665s.a();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) eVar.v).c();
                s.j(aVarC2);
                r0 r0VarC2 = eVar.z.c();
                k63.a aVar11 = (k63.a) fVar.i.get();
                v73.a aVar12 = (v73.a) gVar.f222681l.get();
                v73.k kVar2 = (v73.k) gVar.f222683n.get();
                r rVar = (r) gVar.f222684p.get();
                sh3.a aVarA6 = eVar.f222666t.a();
                s.j(aVarA6);
                az2.b bVarA2 = dVar2.a();
                s.j(bVarA2);
                t73.c cVar2 = new t73.c();
                u03.c cVar3 = (u03.c) dVar2.f275757l.get();
                s.j(cVar3);
                gte.a aVarB3 = eVar.f222655c.b();
                s.j(aVarB3);
                zf8.k kVarA = eVar.B.a();
                s.j(kVarA);
                kd8.e eVarA = eVar.C.a();
                s.j(eVarA);
                te8.e eVarA2 = eVar.D.a();
                s.j(eVarA2);
                hj8.a aVarA7 = eVar.E.a();
                s.j(aVarA7);
                x xVarD = ((s41.a) eVar.F).d();
                hvh.a aVar13 = (hvh.a) eVar.G.f147175r.get();
                s.j(aVar13);
                jx2.a aVar14 = new jx2.a();
                jx2.m mVar = new jx2.m();
                u uVarA = eVar.f222653a.a();
                t73.b bVar3 = new t73.b();
                zt2.c cVar4 = (zt2.c) eVar.H.f316620m.get();
                s.j(cVar4);
                sf0.h hVarB2 = eVar.I.b();
                s.j(hVarB2);
                i4b.f fVarB = ((zc6.a) eVar.d).b();
                b80.c cVarP = eVar3.p();
                s.j(cVarP);
                ang.f fVarE3 = eVar.f222657h.e();
                al4.b bVarN = eVar.f222664r.n();
                s.j(bVarN);
                wtc.h hVar2 = (wtc.h) eVar.J.U.get();
                s.j(hVar2);
                return new com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g(nVar5, cardsCarouselScreenContract$InputData, aVarE, d3Var, dVar4, e0VarQ, cVar, aVar9, bVar2, hVar, u2Var, aVarZ, cVarA, g1Var, aVar10, fVarJ3, kVar, fVarA, aVarC2, r0VarC2, aVar11, aVar12, kVar2, rVar, aVarA6, bVarA2, cVar2, cVar3, aVarB3, kVarA, eVarA, eVarA2, aVarA7, xVarD, aVar13, aVar14, mVar, uVarA, bVar3, cVar4, hVarB2, fVarB, cVarP, fVarE3, bVarN, hVar2, (j63.a) fVar.e.get());
            case 18:
                o73.f fVar5 = gVar.d;
                o73.f fVar6 = gVar.d;
                o73.e eVar5 = gVar.f222677c;
                p63.a aVar15 = (p63.a) fVar5.f222673g.get();
                da3.j jVar4 = eVar5.e;
                ite.a aVar16 = eVar5.f222655c;
                l93.f fVarJ4 = jVar4.j();
                s.j(fVarJ4);
                s5l.a aVar17 = new s5l.a();
                gte.a aVarB4 = aVar16.b();
                s.j(aVarB4);
                v63.b bVar4 = new v63.b(aVar17, aVarB4);
                y63.b bVar5 = new y63.b((p63.a) fVar5.f222673g.get());
                gte.a aVarB5 = aVar16.b();
                s.j(aVarB5);
                y63.g gVar2 = new y63.g(aVarB5);
                y63.l lVar = new y63.l((a9e.a) fVar6.f222674h.get());
                thf.g gVarE = eVar5.f222663q.e();
                s.j(gVarE);
                y63.n nVar6 = new y63.n(lVar, new y63.p(gVarE));
                vi9.i iVar = new vi9.i();
                gte.a aVarB6 = aVar16.b();
                s.j(aVarB6);
                y63.l lVar2 = new y63.l((a9e.a) fVar6.f222674h.get());
                thf.g gVarE2 = eVar5.f222663q.e();
                s.j(gVarE2);
                y63.p pVar = new y63.p(gVarE2);
                al4.b bVarN2 = eVar5.f222664r.n();
                s.j(bVarN2);
                gte.a aVarB7 = aVar16.b();
                s.j(aVarB7);
                y63.f fVar7 = new y63.f(aVar15, fVarJ4, bVar4, bVar5, gVar2, nVar6, iVar, aVarB6, lVar2, pVar, bVarN2, new y63.s(aVarB7));
                y63.j jVar5 = new y63.j(new ugc.a((k63.a) fVar6.i.get(), (j63.a) fVar6.e.get()));
                vi9.n nVarN = eVar.f222660m.n();
                vi9.i iVar2 = new vi9.i();
                j63.a aVar18 = (j63.a) fVar.e.get();
                zjh.j jVarC = ((zc6.a) eVar.d).c();
                t73.a aVar19 = new t73.a((c90.c) gVar.f222689w.get());
                l80.e eVarH2 = eVar.f222662p.h();
                s.j(eVarH2);
                return new w2(fVar7, jVar5, nVarN, iVar2, aVar18, jVarC, aVar19, eVarH2);
            case 19:
                ViewController viewController = fVar.f222671b;
                u73.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return new c90.c(viewController.m2());
            case 20:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) gVar.e.get();
                u73.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ow9.f fVar = (ow9.f) this.f214459c;
        ow9.e eVar = (ow9.e) this.f214458b;
        l70.e eVar2 = eVar.f230341a;
        ow9.j jVar = (ow9.j) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                n60.b bVar = (n60.b) jVar.e.get();
                o5k.i.n(bVar);
                return bVar;
            case 1:
                return o5k.i.s((com.revolut.kompot.navigable.a) jVar.d.get());
            case 2:
                n60.a aVar = (n60.a) jVar.f230394g.get();
                o5k.i.k(aVar);
                return aVar;
            case 3:
                return o5k.i.p((com.revolut.kompot.navigable.a) jVar.d.get());
            case 4:
                i4b.f fVarD = jVar.d();
                y80.a aVarR = eVar2.r();
                s.j(aVarR);
                ar2.c cVar = (ar2.c) jVar.k.get();
                sf0.h hVarB = eVar.e.b();
                s.j(hVarB);
                ax9.i iVarE = jVar.e();
                q06.l lVarA = eVar.f230354t.a();
                s.j(lVarA);
                return new com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f(fVarD, aVarR, cVar, hVarB, iVarE, lVarA, (vw9.a) fVar.f230371t.get(), (jki.p) jVar.f230397l.get());
            case 5:
                xq2.d dVar = (xq2.d) fVar.f230374y.get();
                er2.a aVar2 = (er2.a) jVar.i.get();
                l80.h hVarV = eVar2.v();
                s.j(hVarV);
                return new ar2.c(dVar, aVar2, hVarV, (LifecycleOwner) jVar.f230396j.get(), eVar.u.e(), new ar2.e());
            case 6:
                return new er2.a();
            case 7:
                return new com.revolut.feature.payments.profile.impl.ui_kompot.scanner.g();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        p12.g gVar = (p12.g) this.f214459c;
        p12.d dVar = (p12.d) this.f214458b;
        p12.k kVar = (p12.k) this.e;
        int i = this.d;
        if (i == 0) {
            g12.l lVar = kVar.f231692b;
            ar2.c cVar = (ar2.c) kVar.e.get();
            q12.a aVarG = dVar.e.g();
            s.j(aVarG);
            return new com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d(lVar, cVar, aVarG, (n32.f) gVar.f231669q.get(), new n32.a(), (cli.n) kVar.f.get());
        }
        if (i != 1) {
            if (i == 2) {
                return new er2.a();
            }
            if (i == 3) {
                return new x32.j();
            }
            throw new AssertionError(i);
        }
        xq2.d dVar2 = (xq2.d) gVar.f231668p.get();
        er2.a aVar = (er2.a) kVar.f231693c.get();
        l80.h hVarV = dVar.f231629a.v();
        s.j(hVarV);
        return new ar2.c(dVar2, aVar, hVarV, (LifecycleOwner) kVar.d.get(), dVar.d.e(), new ar2.e());
    }

    private final Object d() {
        p12.f fVar = (p12.f) this.f214459c;
        p12.d dVar = (p12.d) this.f214458b;
        p12.k kVar = (p12.k) this.e;
        int i = this.d;
        if (i == 0) {
            g12.l lVar = kVar.f231692b;
            ar2.c cVar = (ar2.c) kVar.e.get();
            q12.a aVarG = dVar.e.g();
            s.j(aVarG);
            return new com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d(lVar, cVar, aVarG, (n32.f) fVar.f231654r.get(), new n32.a(), (cli.n) kVar.f.get());
        }
        if (i != 1) {
            if (i == 2) {
                return new er2.a();
            }
            if (i == 3) {
                return new x32.j();
            }
            throw new AssertionError(i);
        }
        xq2.d dVar2 = (xq2.d) fVar.f231653q.get();
        er2.a aVar = (er2.a) kVar.f231693c.get();
        l80.h hVarV = dVar.f231629a.v();
        s.j(hVarV);
        return new ar2.c(dVar2, aVar, hVarV, (LifecycleOwner) kVar.d.get(), dVar.d.e(), new ar2.e());
    }

    private final Object e() {
        hc2.k kVar = (hc2.k) this.e;
        int i = this.d;
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
        hx1.a aVar2 = (hx1.a) ((t0) this.f214459c).e.get();
        n60.a aVar3 = (n60.a) kVar.d.get();
        z80.b bVarS = ((v) this.f214458b).o.s();
        s.j(bVarS);
        return new com.revolut.feature.apm.core.code.ui.a(apmCodeControllerContract$InputData, aVar2, aVar3, bVarS, (cli.n) kVar.f.get());
    }

    private final Object f() {
        b0 b0Var = (b0) this.f214459c;
        p0 p0Var = (p0) this.e;
        v vVar = p0Var.f231741a;
        int i = this.d;
        if (i == 0) {
            Object extension = b0Var.f231623b;
            b32.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            vo9.a aVarB = ((ut9.a) vVar.f231787q).b();
            s.j(aVarB);
            q12.g gVarJ = vVar.f231786p.j();
            s.j(gVarJ);
            return new c0(new d32.b(aVarB, gVarJ));
        }
        ApmPaymentAuthorisationNavigation$InputData apmPaymentAuthorisationNavigation$InputData = b0Var.f231622a;
        b0 b0Var2 = p0Var.f231742b;
        ApmPaymentAuthorisationNavigation$InputData apmPaymentAuthorisationNavigation$InputData2 = b0Var2.f231622a;
        g32.b bVar = (g32.b) b0Var2.e.get();
        p12.l lVar = vVar.f231786p;
        x02.a aVarH = lVar.h();
        s.j(aVarH);
        x02.b bVarI = lVar.i();
        s.j(bVarI);
        vo9.a aVarB2 = ((ut9.a) vVar.f231787q).b();
        s.j(aVarB2);
        a32.f fVar = new a32.f(apmPaymentAuthorisationNavigation$InputData2, bVar, aVarH, bVarI, aVarB2);
        f12.a aVar = b0Var.f231623b;
        g32.b bVar2 = (g32.b) b0Var.e.get();
        x02.d dVarK = ((v) this.f214458b).f231786p.k();
        s.j(dVarK);
        return new a0(apmPaymentAuthorisationNavigation$InputData, fVar, aVar, bVar2, dVarK, (cli.n) p0Var.d.get());
    }

    private final Object g() {
        v vVar = (v) this.f214458b;
        nz1.a aVar = vVar.J;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            gx1.e eVar = (gx1.e) aVar.f220932h.get();
            s.j(eVar);
            return new com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.a(eVar);
        }
        ApmTopupRequestNavigation$InputData apmTopupRequestNavigation$InputData = ((t0) this.f214459c).f231768a;
        ang.f fVarE = vVar.H.e();
        wz1.f fVar = (wz1.f) aVar.f220931g.get();
        s.j(fVar);
        gx1.e eVar2 = (gx1.e) aVar.f220932h.get();
        s.j(eVar2);
        return new com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b(apmTopupRequestNavigation$InputData, fVarE, fVar, eVar2, (cli.n) ((p12.r0) this.e).f231758a.get());
    }

    private final Object h() {
        l0 l0Var = (l0) this.f214459c;
        v vVar = (v) this.f214458b;
        v0 v0Var = (v0) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                n60.b bVar = (n60.b) v0Var.e.get();
                o5k.i.m(bVar);
                return bVar;
            case 1:
                return o5k.i.r((com.revolut.kompot.navigable.a) v0Var.d.get());
            case 2:
                n60.a aVar = (n60.a) v0Var.f231797g.get();
                o5k.i.l(aVar);
                return aVar;
            case 3:
                return o5k.i.q((com.revolut.kompot.navigable.a) v0Var.d.get());
            case 4:
                return kxa.j.k((j60.a) v0Var.f231799j.get());
            case 5:
                return ehe.n.s((com.revolut.kompot.navigable.a) v0Var.d.get(), (rp0.m) v0Var.i.get());
            case 6:
                return new rp0.m();
            case 7:
                xdk.b bVar2 = (xdk.b) v0Var.f231800l.get();
                ydk.c.a(bVar2);
                return bVar2;
            case 8:
                xdk.a aVar2 = new xdk.a();
                z71.a aVarF = ((c21.b) vVar.f231785n).f();
                s.j(aVarF);
                return new xdk.g(aVar2, aVarF, vVar.f231779c.a());
            case 9:
                Object extension = (s5k.a) v0Var.o.get();
                t5k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                s.k(nVar);
                return nVar;
            case 10:
                return new s5k.d((r5k.d) v0Var.f231802n.get(), (j60.a) v0Var.f231799j.get(), new r5k.a(), new r5k.b());
            case 11:
                return new r5k.e();
            case 12:
                TransferAmountContract$InputData transferAmountContract$InputData = v0Var.f231794a;
                l0 l0Var2 = v0Var.f231796c;
                ApmTransferContract$InputData apmTransferContract$InputData = l0Var2.f231716a;
                v vVar2 = v0Var.f231795b;
                p12.l lVar = vVar2.f231786p;
                x02.b bVarI = lVar.i();
                s.j(bVarI);
                h52.e eVar = (h52.e) l0Var2.d.get();
                x02.a aVarH = lVar.h();
                s.j(aVarH);
                vo9.a aVarB = ((ut9.a) vVar2.f231787q).b();
                s.j(aVarB);
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.b bVar3 = new com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.b(transferAmountContract$InputData, apmTransferContract$InputData, bVarI, eVar, aVarH, aVarB, new opf.c0(), vVar2.f231788r.g());
                x02.d dVarK = vVar.f231786p.k();
                s.j(dVarK);
                h52.e eVar2 = (h52.e) l0Var.d.get();
                c52.c cVar = (c52.c) l0Var.f.get();
                xdk.b bVar4 = (xdk.b) v0Var.f231800l.get();
                s5k.a aVar3 = (s5k.a) v0Var.o.get();
                n60.a aVar4 = (n60.a) v0Var.f231797g.get();
                ldd.b bVar5 = (ldd.b) v0Var.f231804q.get();
                w80.b bVar6 = (w80.b) v0Var.f231805r.get();
                wj0.a aVarI = ((nj0.d) vVar.f231784m).i();
                s.j(aVarI);
                v42.c cVar2 = new v42.c();
                kz9.a aVarA = vVar.f231790t.a();
                s.j(aVarA);
                s42.c cVar3 = (s42.c) vVar.f231786p.f231714x.get();
                s.j(cVar3);
                c52.a aVar5 = new c52.a();
                zof.f fVarD = vVar.u.d();
                s.j(fVarD);
                return new com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c(bVar3, dVarK, eVar2, cVar, bVar4, aVar3, aVar4, bVar5, bVar6, aVarI, cVar2, aVarA, cVar3, aVar5, fVarD, (bsf.i) l0Var.k.get(), v0Var.f231794a, l0Var.f231716a, (cli.n) v0Var.f231807t.get());
            case 13:
                kdd.b bVar7 = vVar.f231789s;
                ldd.a factory = new ldd.a();
                u42.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new ldd.b();
            case 14:
                qd0.b languageProvider = vVar.o.n();
                s.j(languageProvider);
                u42.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 15:
                l80.e eVarH = vVar.o.h();
                s.j(eVarH);
                lx1.i iVarD = ((ey1.e) vVar.f).d();
                s.j(iVarD);
                yof.d dVar = (yof.d) v0Var.f231806s.get();
                v vVar3 = v0Var.f231795b;
                a12.s sVar = (a12.s) vVar3.f231786p.u.get();
                s.j(sVar);
                vo9.a aVarB2 = ((ut9.a) vVar3.f231787q).b();
                s.j(aVarB2);
                return new t42.p(eVarH, iVarD, new w42.c(dVar, sVar, aVarB2, new u80.o(), (w80.b) v0Var.f231805r.get(), (ldd.b) v0Var.f231804q.get()), (yof.d) v0Var.f231806s.get());
            case 16:
                ppf.a factory2 = vVar.u.b();
                s.j(factory2);
                ldd.b delegate = (ldd.b) v0Var.f231804q.get();
                u42.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        l0 l0Var = (l0) this.f214459c;
        v vVar = (v) this.f214458b;
        p12.l lVar = vVar.f231786p;
        l70.e eVar = vVar.o;
        w0 w0Var = (w0) this.e;
        v vVar2 = w0Var.f231811b;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) w0Var.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) w0Var.d.get(), (rp0.m) w0Var.e.get());
            case 2:
                return new rp0.m();
            case 3:
                i5k.a aVar = (i5k.a) w0Var.f231814h.get();
                j5k.b.a(aVar);
                return aVar;
            case 4:
                l80.h hVarV = eVar.v();
                s.j(hVarV);
                return new i5k.d(hVarV);
            case 5:
                TransferReviewContract$InputData transferReviewContract$InputData = w0Var.f231810a;
                x02.d dVarK = lVar.k();
                s.j(dVarK);
                TransferReviewContract$InputData transferReviewContract$InputData2 = w0Var.f231810a;
                ApmTransferContract$InputData apmTransferContract$InputData = w0Var.f231812c.f231716a;
                x02.b bVarI = vVar2.f231786p.i();
                s.j(bVarI);
                bqf.d dVarA = vVar2.f231781h.a();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) vVar2.v).c();
                s.j(aVarC);
                i52.o oVar = new i52.o(transferReviewContract$InputData2, apmTransferContract$InputData, bVarI, dVarA, aVarC);
                c52.c cVar = (c52.c) l0Var.f.get();
                c52.s sVar = (c52.s) l0Var.i.get();
                i5k.a aVar2 = (i5k.a) w0Var.f231814h.get();
                j60.a aVar3 = (j60.a) w0Var.f.get();
                yof.a aVarA = vVar.u.a();
                s.j(aVarA);
                v2k.c cVarA = vVar.f231791w.a();
                s42.c cVar2 = (s42.c) lVar.f231714x.get();
                s.j(cVar2);
                c52.a aVar4 = new c52.a();
                w80.b bVar = (w80.b) w0Var.f231815j.get();
                npf.a aVar5 = vVar2.u;
                p12.l lVar2 = vVar2.f231786p;
                yof.k kVarG = aVar5.g();
                s.j(kVarG);
                lx1.i iVarD = ((ey1.e) vVar2.f).d();
                s.j(iVarD);
                u80.o oVar2 = new u80.o();
                a12.s sVar2 = (a12.s) lVar2.u.get();
                s.j(sVar2);
                q12.g gVarJ = lVar2.j();
                s.j(gVarJ);
                return new com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a(transferReviewContract$InputData, dVarK, oVar, cVar, sVar, aVar2, aVar3, aVarA, cVarA, cVar2, aVar4, new z(bVar, kVarG, iVarD, oVar2, sVar2, gVarJ));
            case 6:
                qd0.b languageProvider = eVar.n();
                s.j(languageProvider);
                j52.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        p2k.i iVar = (p2k.i) this.f214459c;
        p2k.n nVar = (p2k.n) this.f214458b;
        p2k.g gVar = (p2k.g) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                f0 extension = (f0) gVar.f232335g.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 1:
                return new f0((j60.a) gVar.e.get(), (g0) gVar.f.get());
            case 2:
                BaseScreen screen = gVar.f232332a;
                he2.b dialogHostFinder = ehe.n.r();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(screen, new rp0.m(), dialogHostFinder);
            case 3:
                BankTransferFlowInputData bankTransferFlowInputData = iVar.f232356a;
                sf0.h hVarB = nVar.f232409l.b();
                s.j(hVarB);
                return new i0(bankTransferFlowInputData, hVarB, (j60.a) gVar.e.get());
            case 4:
                Object impl = (j60.a) gVar.e.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                yji.d dVar = (yji.d) impl;
                s.k(dVar);
                return dVar;
            case 5:
                n60.a aVar = (n60.a) gVar.k.get();
                o5k.i.k(aVar);
                return aVar;
            case 6:
                return o5k.i.p((com.revolut.kompot.navigable.a) gVar.f232337j.get());
            case 7:
                return kxa.j.l((j60.a) gVar.f232340n.get());
            case 8:
                return h30.l.p((com.revolut.kompot.navigable.a) gVar.f232337j.get(), (rp0.m) gVar.f232339m.get());
            case 9:
                return new rp0.m();
            case 10:
                n60.b bVar = (n60.b) gVar.f232341p.get();
                o5k.i.n(bVar);
                return bVar;
            case 11:
                return o5k.i.s((com.revolut.kompot.navigable.a) gVar.f232337j.get());
            case 12:
                return n57.a.z(nVar.f232401c.c(), (mga.i0) gVar.f232343r.get(), (mga.f0) gVar.f232345t.get(), (on.a) gVar.u.get());
            case 13:
                yji.o controller = (com.revolut.kompot.navigable.a) gVar.f232337j.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                s.k(i0Var);
                return i0Var;
            case 14:
                return nga.c.t(gVar.f232332a, nVar.f232401c.c(), (wn.a) gVar.f232344s.get());
            case 15:
                return v7.z(nVar.u, "provider");
            case 16:
                os2.g factory = nVar.u.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 17:
                Object extension2 = (to9.a) ((ut9.a) nVar.v).f283050x.get();
                s.j(extension2);
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                return (yji.n) extension2;
            case 18:
                g4k.s extension3 = (g4k.s) gVar.f232347x.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                s.k(extension3);
                return extension3;
            case 19:
                ce5.b bVar2 = nVar.f232417w;
                ldd.a aVar2 = new ldd.a();
                xdk.a aVar3 = new xdk.a();
                z71.a aVarF = ((c21.b) nVar.e).f();
                s.j(aVarF);
                utk.f fVar = new utk.f(aVar3, aVarF, nVar.f.a());
                b9.w2 w2VarB = nVar.f232419y.b();
                twg.c cVarB = nVar.z.b();
                f2k.n nVar2 = new f2k.n();
                t tVar = (t) nVar.A;
                xg6.l lVarD = tVar.d();
                s.j(lVarD);
                com.revolut.feature.external_accounts.api.navigation.a aVarB = tVar.b();
                s.j(aVarB);
                f80.a aVarX = nVar.f232399b.x();
                s.j(aVarX);
                b9k.f checksExtensionFactory = new b9k.f(bVar2, aVar2, fVar, w2VarB, cVarB, nVar2, lVarD, aVarB, aVarX);
                BaseScreen screen2 = gVar.f232332a;
                n60.a keyboardExtension = (n60.a) gVar.k.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(checksExtensionFactory, "checksExtensionFactory");
                Intrinsics.checkNotNullParameter(screen2, "screen");
                Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                return checksExtensionFactory.j(screen2, keyboardExtension);
            case 20:
                ae5.a extension4 = (ae5.a) gVar.A.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                s.k(extension4);
                return extension4;
            case 21:
                ce5.b bVar3 = nVar.f232417w;
                be5.b cryptoConvertDialogDisclaimerFactory = new be5.b();
                ldd.b focusRequesterDelegate = (ldd.b) gVar.z.get();
                n60.a keyboardExtension2 = (n60.a) gVar.k.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerFactory, "cryptoConvertDialogDisclaimerFactory");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                Intrinsics.checkNotNullParameter(keyboardExtension2, "keyboardExtension");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                Intrinsics.checkNotNullParameter(keyboardExtension2, "keyboardExtension");
                return new be5.a();
            case 22:
                kdd.b bVar4 = nVar.f232418x;
                ldd.a factory2 = new ldd.a();
                f4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new ldd.b();
            case 23:
                Object extension5 = (g4k.b) gVar.C.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                yji.n nVar3 = (yji.n) extension5;
                s.k(nVar3);
                return nVar3;
            case 24:
                sf0.h hVarB2 = nVar.f232409l.b();
                s.j(hVarB2);
                v60.e eVarA = nVar.B.a();
                s.j(eVarA);
                return new com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions.a(hVarB2, eVarA);
            case 25:
                Object extension6 = (g0) gVar.f.get();
                f4k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                yji.n nVar4 = (yji.n) extension6;
                s.k(nVar4);
                return nVar4;
            case 26:
                return o5k.b.a((n5k.b) gVar.M.get());
            case 27:
                n5k.a aVar4 = (n5k.a) gVar.F.get();
                p5k.h hVar = (p5k.h) gVar.K.get();
                ffk.t tVarF = nVar.N.f();
                s.j(tVarF);
                ang.f fVarE = nVar.D.e();
                wif.a aVarA = nVar.M.a();
                gte.a aVarB2 = nVar.G.b();
                s.j(aVarB2);
                j60.a aVar5 = (j60.a) gVar.f232340n.get();
                qpk.b bVar5 = new qpk.b();
                v2k.c cVarA = nVar.I.a();
                mre.c cVarB2 = nVar.O.b();
                s.j(cVarB2);
                z0h.a aVarB3 = ((u8h.b) nVar.K).b();
                s.j(aVarB3);
                l80.e eVarH = gVar.f232334c.f232399b.h();
                s.j(eVarH);
                return new n5k.p(aVar4, hVar, tVarF, fVarE, aVarA, aVarB2, aVar5, bVar5, cVarA, cVarB2, aVarB3, new p5k.a(eVarH), nVar.P.b(), (q) gVar.L.get());
            case 28:
                BankTransferFlowInputData bankTransferFlowInputData2 = iVar.f232356a;
                b5k.a aVar6 = (b5k.a) iVar.f232369t.get();
                p4k.g gVar2 = (p4k.g) iVar.u.get();
                ang.f fVarE2 = nVar.D.e();
                j9l.a aVar7 = new j9l.a();
                l80.e eVarH2 = nVar.f232399b.h();
                s.j(eVarH2);
                m4k.h hVar2 = new m4k.h();
                h2k.k kVarM = gVar.m();
                gte.a aVarB4 = nVar.G.b();
                s.j(aVarB4);
                return new m4k.g(bankTransferFlowInputData2, aVar6, gVar2, fVarE2, aVar7, eVarH2, hVar2, kVarM, aVarB4, new f2k.p());
            case 29:
                p5k.b bVar6 = (p5k.b) gVar.G.get();
                w wVar = (w) gVar.I.get();
                tga.k kVarB = nVar.J.b();
                m5k.b bVarE = gVar.e();
                p2k.n nVar5 = gVar.f232334c;
                return new p5k.k(bVar6, wVar, kVarB, bVarE, new jt0.b(nVar5.J.b(), nVar5.M.a(), gVar.e()), gVar.l(), new RateExplanationDialogMapper());
            case 30:
                return new p5k.d();
            case 31:
                y yVar = (y) gVar.H.get();
                k5i.c cVarA2 = nVar.H.a();
                p5k.f fVarL = gVar.l();
                p2k.n nVar6 = gVar.f232334c;
                j9l.a aVar8 = new j9l.a();
                gte.a aVarB5 = nVar6.G.b();
                s.j(aVarB5);
                return new p5k.x(yVar, cVarA2, fVarL, new kgm.i(aVar8, aVarB5), new p5k.p());
            case 32:
                return new y();
            case 33:
                aah.i iVarD = ((u8h.b) nVar.K).d();
                s.j(iVarD);
                return o5k.i.B(iVarD);
            case 34:
                return new n5k.r(new RateExplanationDialogMapper());
            case 35:
                return nga.c.a((q) gVar.L.get());
            case 36:
                return t5k.b.a((s5k.a) gVar.Q.get());
            case 37:
                return new s5k.d((r5k.d) gVar.P.get(), (j60.a) gVar.f232340n.get(), new r5k.a(), new r5k.b());
            case 38:
                return new r5k.e();
            case 39:
                wn.a aVar9 = (wn.a) gVar.f232344s.get();
                n57.a.c(aVar9);
                return aVar9;
            case 40:
                BankTransferAmountScreenContract$InputData bankTransferAmountScreenContract$InputData = gVar.f232333b;
                p2k.i iVar2 = gVar.d;
                p2k.n nVar7 = gVar.f232334c;
                BankTransferAmountScreenContract$InputData bankTransferAmountScreenContract$InputData2 = gVar.f232333b;
                p4k.g gVar3 = (p4k.g) iVar2.u.get();
                lpf.a aVar10 = nVar7.i;
                opf.b bVarG = aVar10.g();
                fk3.a aVarA2 = nVar7.Q.a();
                s.j(aVarA2);
                y1k.a aVar11 = (y1k.a) nVar7.l0.get();
                wsg.n nVarB = nVar7.f.b();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar10.d).c();
                s.j(aVarC);
                opf.i iVar3 = new opf.i(aVarC);
                ty0.c cVar = (ty0.c) iVar2.v.get();
                Context context = nVar7.R;
                ypf.b bVarB = aVar10.b();
                opf.z zVarD = aVar10.d();
                iz9.c cVar2 = (iz9.c) nVar7.S.S.get();
                s.j(cVar2);
                h4k.k kVar = new h4k.k(bankTransferAmountScreenContract$InputData2, gVar3, bVarG, aVarA2, aVar11, nVarB, iVar3, cVar, context, bVarB, zVarD, cVar2, new opf.c(), gVar.d());
                oy1.b bVarB2 = nVar7.U.b();
                fk3.a aVarA3 = nVar7.Q.a();
                s.j(aVarA3);
                gte.a aVarB6 = nVar7.G.b();
                s.j(aVarB6);
                n8b.a aVarA4 = nVar7.E.a();
                s.j(aVarA4);
                cw9.d dVarA = nVar7.V.a();
                k0 k0VarQ = nVar7.W.q();
                s.j(k0VarQ);
                e4k.e eVar = new e4k.e(bVarB2, aVarA3, aVarB6, aVarA4, dVarA, k0VarQ, gVar.d());
                b5k.a aVar12 = (b5k.a) iVar.f232369t.get();
                l80.e eVarH3 = nVar7.f232399b.h();
                s.j(eVarH3);
                i4k.b bVar7 = new i4k.b(eVarH3);
                x1k.a aVar13 = (x1k.a) gVar.T.get();
                zof.f fVarD = nVar.k.d();
                s.j(fVarD);
                g4k.q qVar = (g4k.q) gVar.U.get();
                n5k.b bVar8 = (n5k.b) gVar.M.get();
                s5k.a aVar14 = (s5k.a) gVar.Q.get();
                g4k.s sVar = (g4k.s) gVar.f232347x.get();
                g4k.b bVar9 = (g4k.b) gVar.C.get();
                g0 g0Var = (g0) gVar.f.get();
                gte.a aVarB7 = nVar.G.b();
                s.j(aVarB7);
                com.revolut.feature.external_accounts.api.navigation.a aVarB8 = ((t) nVar.A).b();
                s.j(aVarB8);
                j60.a aVar15 = (j60.a) gVar.f232340n.get();
                n60.a aVar16 = (n60.a) gVar.k.get();
                i1j.a defaultInteractor = new h4k.m();
                od0.i customInteractor = iVar2.f232357b;
                Intrinsics.checkNotNullParameter(defaultInteractor, "defaultInteractor");
                Intrinsics.checkNotNullParameter(customInteractor, "customInteractor");
                by5.a bankTransferBalancesFilterInteractorFactory = new by5.a(10);
                f4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bankTransferBalancesFilterInteractorFactory, "bankTransferBalancesFilterInteractorFactory");
                i1j.a aVar17 = (i1j.a) customInteractor.f224257a;
                if (aVar17 != null) {
                    defaultInteractor = aVar17;
                }
                w80.b bVar10 = (w80.b) gVar.V.get();
                l80.e eVarH4 = nVar.f232399b.h();
                s.j(eVarH4);
                ldd.b bVar11 = (ldd.b) gVar.z.get();
                klg.b bVar12 = (klg.b) nVar.o.f206952q.get();
                s.j(bVar12);
                skd.i iVarC = nVar.f232400b0.c();
                to9.a aVar18 = (to9.a) ((ut9.a) nVar.v).f283050x.get();
                s.j(aVar18);
                l80.e eVarH5 = nVar7.f232399b.h();
                s.j(eVarH5);
                return new com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a(bankTransferAmountScreenContract$InputData, kVar, eVar, aVar12, bVar7, aVar13, fVarD, qVar, bVar8, aVar14, sVar, bVar9, g0Var, aVarB7, aVarB8, aVar15, aVar16, defaultInteractor, bVar10, eVarH4, bVar11, bVar12, iVarC, aVar18, new p5k.a(eVarH5), (ae5.a) gVar.A.get(), (jki.p) gVar.X.get());
            case 41:
                return new f2k.k(nVar.X.g());
            case 42:
                p4k.g gVar4 = (p4k.g) gVar.d.u.get();
                p2k.n nVar8 = gVar.f232334c;
                p2k.u uVar = nVar8.F;
                so9.b bVar13 = nVar8.v;
                ite.a aVar19 = nVar8.G;
                g3k.d dVarB = uVar.b();
                s.j(dVarB);
                opf.c0 c0Var = new opf.c0();
                ut9.a aVar20 = (ut9.a) bVar13;
                vo9.a aVarB9 = aVar20.b();
                s.j(aVarB9);
                k61.a aVarE = nVar8.Y.e();
                s.j(aVarE);
                u5k.c cVar3 = (u5k.c) nVar8.m0.get();
                wsg.n nVarB2 = nVar8.f.b();
                ang.f fVarE3 = nVar8.D.e();
                c5k.a aVar21 = new c5k.a();
                gte.a aVarB10 = aVar19.b();
                s.j(aVarB10);
                l1l.s sVar2 = new l1l.s(aVarB10);
                l1l.m mVar = new l1l.m();
                l1l.q qVar2 = new l1l.q();
                l1l.k kVar2 = new l1l.k();
                urf.f fVar2 = new urf.f();
                l80.e eVarH6 = nVar8.f232399b.h();
                s.j(eVarH6);
                e5k.b bVar14 = new e5k.b(eVarH6, 0);
                e5k.f fVar3 = new e5k.f();
                e5k.d dVar2 = new e5k.d();
                e5k.g gVar5 = new e5k.g();
                kak.a aVarA5 = nVar8.f232398a0.a();
                l1l.o oVar = new l1l.o();
                wt9.e eVarC = aVar20.c();
                s.j(eVarC);
                gte.a aVarB11 = aVar19.b();
                s.j(aVarB11);
                l1l.h hVar3 = new l1l.h(aVarB11, 0);
                gte.a aVarB12 = aVar19.b();
                s.j(aVarB12);
                return new g4k.q(new g4k.p(gVar4, dVarB, c0Var, aVarB9, aVarE, cVar3, nVarB2, fVarE3, aVar21, sVar2, mVar, qVar2, kVar2, fVar2, bVar14, fVar3, dVar2, gVar5, aVarA5, oVar, eVarC, hVar3, new l1l.h(aVarB12, 1), gVar.m()));
            case 43:
                qd0.b languageProvider = nVar.f232399b.n();
                s.j(languageProvider);
                f4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 44:
                e4m.e eVar2 = gVar.W;
                p2k.n nVar9 = gVar.f232334c;
                yof.d dVar3 = (yof.d) eVar2.get();
                vo9.a aVarB13 = ((ut9.a) nVar9.v).b();
                s.j(aVarB13);
                u80.o oVar2 = new u80.o();
                w80.b bVar15 = (w80.b) gVar.V.get();
                ldd.b bVar16 = (ldd.b) gVar.z.get();
                l80.e dateProvider = nVar9.f232399b.h();
                s.j(dateProvider);
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                i4k.k kVar3 = new i4k.k();
                yof.d transferAmountMapper = (yof.d) gVar.W.get();
                yof.d dVar4 = (yof.d) gVar.W.get();
                gte.a aVarB14 = nVar9.G.b();
                s.j(aVarB14);
                c8k.a amountHintMapperV2 = new c8k.a(dVar4, aVarB14, new m4k.h());
                Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
                Intrinsics.checkNotNullParameter(amountHintMapperV2, "amountHintMapperV2");
                r10.d dVar5 = new r10.d();
                dVar5.f250818a = transferAmountMapper;
                dVar5.f250819b = amountHintMapperV2;
                i4k.e eVar3 = new i4k.e(dVar3, aVarB13, oVar2, bVar15, bVar16, kVar3, dVar5);
                l80.e eVarH7 = nVar9.f232399b.h();
                s.j(eVarH7);
                i4k.b bVar17 = new i4k.b(eVarH7);
                yof.d dVar6 = (yof.d) gVar.W.get();
                t2j.a aVar22 = nVar.f232414r;
                return new e4k.l0(eVar3, bVar17, dVar6, b3j.p.f(), new i4k.n((yof.d) gVar.W.get()));
            case 45:
                ppf.a factory3 = nVar.k.b();
                s.j(factory3);
                ldd.b delegate = (ldd.b) gVar.z.get();
                f4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        p2k.i iVar = (p2k.i) this.f214459c;
        p2k.n nVar = (p2k.n) this.f214458b;
        p2k.k kVar = (p2k.k) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.j((j60.a) kVar.f232378h.get());
            case 1:
                return v1.c.r((com.revolut.kompot.navigable.a) kVar.f.get(), (rp0.m) kVar.f232377g.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.b bVar = (n60.b) kVar.f232379j.get();
                o5k.i.m(bVar);
                return bVar;
            case 4:
                return o5k.i.r((com.revolut.kompot.navigable.a) kVar.f.get());
            case 5:
                n60.a aVar = (n60.a) kVar.f232380l.get();
                o5k.i.l(aVar);
                return aVar;
            case 6:
                return o5k.i.q((com.revolut.kompot.navigable.a) kVar.f.get());
            case 7:
                return nga.c.s(nVar.f232401c.c(), (mga.i0) kVar.f232382n.get(), (mga.f0) kVar.f232383p.get(), (on.a) kVar.f232384q.get());
            case 8:
                yji.o controller = (com.revolut.kompot.navigable.a) kVar.f.get();
                o4k.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                s.k(i0Var);
                return i0Var;
            case 9:
                return nga.c.u(nVar.f232401c.c(), kVar.f232374a, (wn.a) kVar.o.get());
            case 10:
                return v7.z(nVar.u, "provider");
            case 11:
                os2.g factory = nVar.u.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 12:
                Object extension = (w4k.l) kVar.f232386s.get();
                u4k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar2 = (yji.n) extension;
                s.k(nVar2);
                return nVar2;
            case 13:
                j60.a aVar2 = (j60.a) kVar.f232378h.get();
                q06.l lVarA = nVar.c0.a();
                s.j(lVarA);
                return new w4k.p(aVar2, lVarA);
            case 14:
                bsf.i extension2 = (bsf.i) kVar.u.get();
                u4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 15:
                b9.w2 factory2 = nVar.f232419y.b();
                u4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.m();
            case 16:
                return o5k.d.a((n5k.b) kVar.f232390y.get());
            case 17:
                kVar.getClass();
                p2k.n nVar3 = kVar.d;
                p2k.i iVar2 = kVar.e;
                BankTransferFlowInputData bankTransferFlowInputData = iVar2.f232356a;
                b5k.a aVar3 = (b5k.a) iVar2.f232369t.get();
                p4k.g gVar = (p4k.g) iVar2.u.get();
                ang.f fVarE = nVar3.D.e();
                j9l.a aVar4 = new j9l.a();
                l80.e eVarH = nVar3.f232399b.h();
                s.j(eVarH);
                m4k.h hVar = new m4k.h();
                h2k.k kVarQ = kVar.q();
                gte.a aVarB = nVar3.G.b();
                s.j(aVarB);
                m4k.g gVar2 = new m4k.g(bankTransferFlowInputData, aVar3, gVar, fVarE, aVar4, eVarH, hVar, kVarQ, aVarB, new f2k.p());
                p5k.d dVar = new p5k.d();
                p5k.x xVarS = kVar.s();
                qga.a aVar5 = nVar3.J;
                p5k.k kVar2 = new p5k.k(dVar, xVarS, aVar5.b(), kVar.c(), new jt0.b(aVar5.b(), nVar3.M.a(), kVar.c()), kVar.j(), new RateExplanationDialogMapper());
                ffk.t tVarF = nVar.N.f();
                s.j(tVarF);
                ang.f fVarE2 = nVar.D.e();
                wif.a aVarA = nVar.M.a();
                gte.a aVarB2 = nVar.G.b();
                s.j(aVarB2);
                j60.a aVar6 = (j60.a) kVar.f232378h.get();
                qpk.b bVar2 = new qpk.b();
                v2k.c cVarA = nVar.I.a();
                mre.c cVarB = nVar.O.b();
                s.j(cVarB);
                z0h.a aVarB3 = ((u8h.b) nVar.K).b();
                s.j(aVarB3);
                l80.e eVarH2 = nVar3.f232399b.h();
                s.j(eVarH2);
                return new n5k.p(gVar2, kVar2, tVarF, fVarE2, aVarA, aVarB2, aVar6, bVar2, cVarA, cVarB, aVarB3, new p5k.a(eVarH2), nVar.P.b(), (q) kVar.f232389x.get());
            case 18:
                aah.i iVarD = ((u8h.b) nVar.K).d();
                s.j(iVarD);
                return o5k.i.C(iVarD);
            case 19:
                return new n5k.r(new RateExplanationDialogMapper());
            case 20:
                return o5k.i.a((q) kVar.f232389x.get());
            case 21:
                wn.a aVar7 = (wn.a) kVar.o.get();
                n57.a.d(aVar7);
                return aVar7;
            case 22:
                a3 a3Var = nVar.f232402d0;
                vt4.h mapper = new vt4.h();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new zrf.m(mapper);
            case 23:
                return wpg.v.C((zrf.m) kVar.C.get(), (yrf.a) kVar.D.get());
            case 24:
                return new yrf.a();
            case 25:
                mkd.g view = kVar.f232375b;
                rkd.m factory3 = nVar.f232400b0.a();
                s.j(factory3);
                u4k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.a(view);
            case 26:
                sh5.d dVarF = nVar.f232403e0.f();
                s.j(dVarF);
                gte.a aVarB4 = nVar.G.b();
                s.j(aVarB4);
                return new v4k.l(dVarF, aVarB4, (aah.h) kVar.G.get(), (b5k.a) iVar.f232369t.get(), (z4k.a) iVar.f232370w.get(), new be5.e());
            case 27:
                aah.i factory4 = ((u8h.b) nVar.K).d();
                s.j(factory4);
                u4k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return factory4.a();
            case 28:
                BankTransferReviewScreenContract$InputData inputData = kVar.f232376c;
                p2k.n nVar4 = kVar.d;
                p2k.i iVar3 = kVar.e;
                p4k.g flowInteractor = (p4k.g) iVar3.u.get();
                d3j.b beneficiaryInteractor = ((b3j.p) nVar4.f232414r).e();
                y1k.a bankTransferInteractor = (y1k.a) nVar4.l0.get();
                z4k.a transferReviewTypeObserver = (z4k.a) iVar3.f232370w.get();
                m4k.h transferQuoteChargesMerger = new m4k.h();
                h2k.k priceComparisonDelegate = kVar.q();
                sfk.a pricingPlanChangeObservable = nVar4.N.e();
                s.j(pricingPlanChangeObservable);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
                Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
                Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
                Intrinsics.checkNotNullParameter(transferReviewTypeObserver, "transferReviewTypeObserver");
                Intrinsics.checkNotNullParameter(transferQuoteChargesMerger, "transferQuoteChargesMerger");
                Intrinsics.checkNotNullParameter(priceComparisonDelegate, "priceComparisonDelegate");
                Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
                b9k.f fVar = new b9k.f();
                fVar.f13817b = inputData;
                fVar.f13816a = flowInteractor;
                fVar.f13818c = beneficiaryInteractor;
                fVar.d = bankTransferInteractor;
                fVar.e = transferReviewTypeObserver;
                fVar.f = priceComparisonDelegate;
                fVar.f13819g = pricingPlanChangeObservable;
                ite.a aVar8 = nVar.G;
                npf.a aVar9 = nVar.k;
                gte.a aVarB5 = aVar8.b();
                s.j(aVarB5);
                m3j.h hVarB = ((b3j.p) nVar4.f232414r).b();
                qd0.b bVarN = nVar4.f232399b.n();
                s.j(bVarN);
                y4k.g gVar3 = new y4k.g(hVarB, bVarN);
                b5k.a aVar10 = (b5k.a) iVar.f232369t.get();
                zof.f fVarD = aVar9.d();
                s.j(fVarD);
                j60.a aVar11 = (j60.a) kVar.f232378h.get();
                yof.a aVarA2 = aVar9.a();
                s.j(aVarA2);
                l80.e eVarH3 = nVar.f232399b.h();
                s.j(eVarH3);
                mkd.d dVar2 = (mkd.d) kVar.F.get();
                v2k.c cVarA2 = nVar.I.a();
                v4k.a aVar12 = (v4k.a) kVar.H.get();
                tga.k kVarB = nVar.J.b();
                f2k.p pVar = new f2k.p();
                i4k.f fVar2 = new i4k.f();
                vrf.h hVar2 = (vrf.h) kVar.J.get();
                zk0.b bVarL = ((fl9.a) nVar.f232416t).f135909b.l();
                s.j(bVarL);
                fnc.s sVar = new fnc.s(bVarL);
                bsf.i iVar4 = (bsf.i) kVar.u.get();
                afd.a aVar13 = new afd.a((q1) kVar.f232388w.get(), new v4k.m());
                y4k.d dVarB = kVar.b();
                m3j.h hVarB2 = ((b3j.p) nVar4.f232414r).b();
                yof.k kVarG = nVar4.k.g();
                s.j(kVarG);
                y4k.d dVarB2 = kVar.b();
                l80.e eVarH4 = nVar4.f232399b.h();
                s.j(eVarH4);
                return new com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a(inputData, fVar, aVarB5, gVar3, aVar10, fVarD, aVar11, aVarA2, eVarH3, dVar2, cVarA2, aVar12, kVarB, pVar, fVar2, hVar2, sVar, iVar4, new r4k.v(aVar13, dVarB, new y4k.e(hVarB2, kVarG, dVarB2, eVarH4, (vrf.h) kVar.J.get())), (i5k.a) iVar.f232364n.get());
            case 29:
                List providers = wpg.v.D((zrf.g) kVar.E.get(), (zrf.m) kVar.C.get(), (zrf.n) kVar.I.get());
                Intrinsics.checkNotNullParameter(providers, "providers");
                return new xrf.b(providers);
            case 30:
                return new zrf.n();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        p2k.a0 a0Var = (p2k.a0) this.e;
        int i = this.d;
        if (i == 0) {
            g3k.a aVar = (g3k.a) ((p2k.x) this.f214458b).k.f232493x.get();
            s.j(aVar);
            return new c3k.g(aVar, (cli.n) a0Var.f232269b.get());
        }
        if (i == 1) {
            return new c3k.h((f01.a) a0Var.f232268a.get(), new w2k.a());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        ViewController screen = ((p2k.v) this.f214459c).f232496b;
        d3k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new f01.c(screen.m2());
    }

    private final Object m() {
        p7c.r rVar = (p7c.r) this.f214458b;
        p7c.u uVar = (p7c.u) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                Object ext = (pec.o) uVar.f233714c.get();
                p9c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(ext, "ext");
                yji.n nVar = (yji.n) ext;
                s.k(nVar);
                return nVar;
            case 1:
                return new uec.e((q7c.s) rVar.V.get(), uVar.f233712a);
            case 2:
                Object ext2 = (tdc.q) uVar.e.get();
                p9c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(ext2, "ext");
                yji.n nVar2 = (yji.n) ext2;
                s.k(nVar2);
                return nVar2;
            case 3:
                return new tdc.r(rVar.e(), new tdc.e(), new zcc.b(), uVar.f233712a);
            case 4:
                Object ext3 = (q9c.t) uVar.f233715g.get();
                p9c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(ext3, "ext");
                yji.n nVar3 = (yji.n) ext3;
                s.k(nVar3);
                return nVar3;
            case 5:
                RevolutPaySummaryScreenContract$InputData revolutPaySummaryScreenContract$InputData = uVar.f233712a;
                gte.a aVarB = rVar.f233687r.b();
                s.j(aVarB);
                return new q9c.b0(revolutPaySummaryScreenContract$InputData, aVarB, new ogm.i((k7c.b0) rVar.f233690s0.get()));
            case 6:
                Object ext4 = (q9c.h) uVar.i.get();
                p9c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(ext4, "ext");
                yji.n nVar4 = (yji.n) ext4;
                s.k(nVar4);
                return nVar4;
            case 7:
                RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = ((p7c.x) this.f214459c).f233741a;
                ang.f fVarE = rVar.f.e();
                p7c.r rVar2 = uVar.f233713b;
                z70.a aVarF = rVar2.f233675g.f();
                s.j(aVarF);
                uli.c cVarA = rVar2.f233691t.a();
                s.j(cVarA);
                return new q9c.i(revolutPayOrderSummaryContract$InputData, fVarE, new t9c.a(aVarF, cVarA));
            case 8:
                q9c.l ext5 = (q9c.l) uVar.k.get();
                p9c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(ext5, "ext");
                s.k(ext5);
                return ext5;
            case 9:
                return new q9c.l(uVar.f233712a, (q7c.q) rVar.L.get());
            case 10:
                hec.a ext6 = (hec.a) uVar.f233719m.get();
                p9c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(ext6, "ext");
                s.k(ext6);
                return ext6;
            case 11:
                til.m mVarA = uVar.f233713b.u.a();
                s.j(mVarA);
                return new hec.a(new iec.a(mVarA), (b6c.a) rVar.S.get(), new rdc.d(new rdc.b()));
            case 12:
                sdc.f ext7 = (sdc.f) uVar.o.get();
                p9c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(ext7, "ext");
                s.k(ext7);
                return ext7;
            case 13:
                l70.e eVar = rVar.f233675g;
                return new sdc.f(new i90.b(), uVar.f233712a);
            case 14:
                u8c.b extension = (u8c.b) uVar.f233724s.get();
                v8c.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 15:
                u0f.a aVar = (u0f.a) rVar.v.f230029a.get();
                s.j(aVar);
                return new u8c.e(aVar, rVar.e(), (mki.b) uVar.f233723r.get());
            case 16:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) uVar.f233722q.get();
                v8c.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mki.b bVarQ2 = controller.q2();
                s.k(bVarQ2);
                return bVarQ2;
            case 17:
                Object extension2 = (p8c.c) uVar.u.get();
                q8c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar5 = (yji.n) extension2;
                s.k(nVar5);
                return nVar5;
            case 18:
                b6c.a aVar2 = (b6c.a) rVar.S.get();
                uVar.getClass();
                return new p8c.g(aVar2, new g9c.b(new rdc.d(new rdc.b()), new gec.i()));
            case 19:
                RevolutPaySummaryScreenContract$InputData revolutPaySummaryScreenContract$InputData2 = uVar.f233712a;
                RevolutPaySummaryScreenContract$InputData revolutPaySummaryScreenContract$InputData3 = uVar.f233712a;
                p7c.r rVar3 = uVar.f233713b;
                q7c.q qVar = (q7c.q) rVar.L.get();
                k7c.k kVar = (k7c.k) rVar.f233692t0.get();
                b6c.a aVar3 = (b6c.a) rVar.S.get();
                q7c.m mVar = (q7c.m) rVar.X.get();
                g9c.b bVar = new g9c.b(new rdc.d(new rdc.b()), new gec.i());
                d0 d0Var = (d0) rVar.N.get();
                k67.a aVar4 = (k67.a) rVar.f233693w.i.get();
                s.j(aVar4);
                p8c.c cVar = (p8c.c) uVar.u.get();
                agf.b bVarA = ((dgf.a) rVar.f233694x).a();
                s.j(bVarA);
                pec.o oVar = (pec.o) uVar.f233714c.get();
                tdc.q qVar2 = (tdc.q) uVar.e.get();
                u8c.b bVar2 = (u8c.b) uVar.f233724s.get();
                r8c.a aVar5 = new r8c.a();
                q9c.t tVar = (q9c.t) uVar.f233715g.get();
                r9c.i iVar = new r9c.i();
                ndc.a aVar6 = new ndc.a();
                zcc.a aVar7 = new zcc.a();
                q9c.h hVar = (q9c.h) uVar.i.get();
                til.m workflowFlowDestinationProvider = rVar3.u.a();
                s.j(workflowFlowDestinationProvider);
                Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
                s9c.a aVar8 = new s9c.a();
                hec.a aVar9 = (hec.a) uVar.f233719m.get();
                q9c.l lVar = (q9c.l) uVar.k.get();
                sh5.d dVarF = rVar.f233695y.f();
                s.j(dVarF);
                gte.a aVarB2 = rVar.f233687r.b();
                s.j(aVarB2);
                sdc.f fVar = (sdc.f) uVar.o.get();
                r9c.j jVar = new r9c.j();
                ydc.a aVar10 = new ydc.a();
                ydc.c cVar2 = new ydc.c(new kdc.d());
                l70.e eVar2 = rVar3.f233675g;
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                odc.o oVar2 = new odc.o(eVarH);
                odc.n nVar6 = new odc.n();
                y6c.a aVar11 = (y6c.a) rVar3.z.i.get();
                s.j(aVar11);
                r9c.d dVar = new r9c.d(new odc.p(oVar2, nVar6, aVar11), revolutPaySummaryScreenContract$InputData3);
                r9c.f fVar2 = new r9c.f();
                dec.r rVar4 = new dec.r();
                dec.g gVar = new dec.g();
                dec.a aVar12 = new dec.a();
                l80.e eVarH2 = eVar2.h();
                s.j(eVarH2);
                dec.d dVar2 = new dec.d(new dec.q(rVar4, gVar, aVar12, eVarH2));
                qd0.b bVarN = eVar2.n();
                s.j(bVarN);
                prl.e eVar3 = new prl.e(dVar2, new uec.g(new uec.b(bVarN)), new r9c.l(revolutPaySummaryScreenContract$InputData3), revolutPaySummaryScreenContract$InputData3);
                gec.c cVar3 = new gec.c();
                r9c.p pVar = new r9c.p(revolutPaySummaryScreenContract$InputData3, new gec.h());
                vdc.a merchantImageMapper = new vdc.a();
                Intrinsics.checkNotNullParameter(merchantImageMapper, "merchantImageMapper");
                r9c.h hVar2 = new r9c.h(revolutPaySummaryScreenContract$InputData3, new gec.j());
                uj5.a aVarB3 = ((ak5.i) rVar3.A).b();
                s.j(aVarB3);
                return new com.revolut.feature.revolutpay.impl.ui.summary_screen.f(revolutPaySummaryScreenContract$InputData2, qVar, kVar, aVar3, mVar, bVar, d0Var, aVar4, cVar, bVarA, oVar, qVar2, bVar2, aVar5, tVar, iVar, aVar6, aVar7, hVar, aVar8, aVar9, lVar, dVarF, aVarB2, fVar, new o9c.i0(jVar, aVar10, cVar2, dVar, fVar2, eVar3, cVar3, pVar, hVar2, new r9c.n(aVarB3, new ydc.c(new kdc.d())), new RevPointsEarningItemMapper(), new r9c.a(), revolutPaySummaryScreenContract$InputData3, new r9c.e(), new gec.a()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        p8a.n nVar = (p8a.n) this.f214459c;
        p8a.d0 d0Var = (p8a.d0) this.f214458b;
        p8a.o oVar = (p8a.o) this.e;
        p8a.d0 d0Var2 = oVar.f234040b;
        int i = this.d;
        if (i == 0) {
            t8a.a controller = (t8a.a) oVar.d.get();
            waa.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            s.k(controller);
            return controller;
        }
        if (i == 1) {
            c70.a aVarZ = d0Var.f233933h.z();
            s.j(aVarZ);
            return new t8a.b(aVarZ, d0Var.i.e());
        }
        if (i == 2) {
            ry9.d sendFromClipboardModelExtension = (ry9.d) nVar.e.get();
            waa.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(sendFromClipboardModelExtension, "sendFromClipboardModelExtension");
            s.k(sendFromClipboardModelExtension);
            return sendFromClipboardModelExtension;
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        vy9.b bVar = d0Var2.f233932g;
        p12.l lVar = d0Var2.f233934j;
        ty9.b bVarC = bVar.c();
        s.j(bVarC);
        a12.j jVarE = lVar.e();
        s.j(jVarE);
        tnb.g0 g0Var = new tnb.g0(jVarE);
        a12.o oVarM = lVar.m();
        s.j(oVarM);
        xaa.h hVar = new xaa.h(oVarM);
        lx1.i iVarD = ((ey1.e) d0Var2.k).d();
        s.j(iVarD);
        xaa.b bVar2 = new xaa.b(iVarD);
        a12.j jVarE2 = lVar.e();
        s.j(jVarE2);
        xaa.f fVar = new xaa.f(jVarE2, (j8a.a) d0Var2.E.get(), new xaa.d((j8a.a) d0Var2.E.get()));
        a12.j jVarE3 = lVar.e();
        s.j(jVarE3);
        vaa.g0 g0Var2 = new vaa.g0(bVarC, g0Var, hVar, bVar2, fVar, new usc.a(jVarE3), new xaa.g());
        vaa.k kVar = oVar.f234039a;
        f8a.a aVarB = d0Var.e.b();
        s.j(aVarB);
        whf.b bVarA = d0Var2.f233935l.a();
        s.j(bVarA);
        vaa.b bVar3 = new vaa.b(bVarA);
        xx9.p pVarB = d0Var2.f233936m.b();
        s.j(pVarB);
        ogm.i iVar = new ogm.i(pVarB);
        t8a.a aVar = (t8a.a) oVar.d.get();
        kz9.a aVarA = d0Var2.f233931c.a();
        s.j(aVarA);
        return new vaa.f0(g0Var2, kVar, aVarB, bVar3, iVar, aVar, new vaa.l0(aVarA, d0Var2.f233937n.b()), (ry9.d) nVar.e.get());
    }

    private final Object o() {
        pbk.b bVar = (pbk.b) this.f214458b;
        l70.e eVar = bVar.f234715a;
        pbk.e eVar2 = (pbk.e) this.e;
        int i = this.d;
        if (i == 0) {
            return new com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a((cli.n) eVar2.f234736c.get(), eVar2.f234734a, ((pbk.g) this.f214459c).b(), ((c21.b) bVar.e).c(), (pn3.a) eVar2.d.get(), new jck.a());
        }
        if (i == 1) {
            PlanGiftingReceiverPickerScreenContract$InputData planGiftingReceiverPickerScreenContract$InputData = eVar2.f234734a;
            dl3.f fVarC = eVar2.f234735b.f234716b.c();
            s.j(fVarC);
            return new com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b(planGiftingReceiverPickerScreenContract$InputData, new jck.c(fVarC));
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        s70.a aVarM = eVar.m();
        s.j(aVarM);
        y80.a aVarR = eVar.r();
        s.j(aVarR);
        return new pn3.b(aVarM, aVarR);
    }

    @Override // phm.a
    public final Object get() {
        Object f0Var;
        switch (this.f214457a) {
            case 0:
                e eVar = (e) this.f214458b;
                i iVar = (i) this.e;
                int i = this.d;
                switch (i) {
                    case 0:
                        return kxa.j.l((j60.a) iVar.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) iVar.f214462c.get(), (rp0.m) iVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return s2l.c.k((r60.b) iVar.f214464h.get());
                    case 4:
                        return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) iVar.f214462c.get(), (rp0.p0) iVar.f214463g.get());
                    case 5:
                        return new rp0.p0();
                    case 6:
                        return trl.f.i((t60.b) iVar.f214465j.get());
                    case 7:
                        return trl.f.r(iVar.f214460a);
                    case 8:
                        SharedAlertsScreenContract$InputData sharedAlertsScreenContract$InputData = iVar.f214461b;
                        j60.a aVar = (j60.a) iVar.e.get();
                        efd.a aVarA = eVar.f214446g.a();
                        s.j(aVarA);
                        ghd.c cVar = (ghd.c) iVar.f214466l.get();
                        jki.p pVar = (jki.p) iVar.f214467m.get();
                        n3d.c cVarA = eVar.e.a();
                        s.j(cVarA);
                        f0Var = new wed.f0(sharedAlertsScreenContract$InputData, aVar, aVarA, cVar, pVar, cVarA, (g1) ((g) this.f214459c).f.get(), (ped.a) iVar.f214468n.get());
                        break;
                    case 9:
                        ifd.h hVarB = eVar.f214447h.b();
                        s.j(hVarB);
                        return new ghd.d(hVarB);
                    case 10:
                        SharedAlertsScreenContract$InputData sharedAlertsScreenContract$InputData2 = iVar.f214461b;
                        ifd.h hVarB2 = eVar.f214447h.b();
                        s.j(hVarB2);
                        ffd.a aVarB = eVar.f214446g.b();
                        s.j(aVarB);
                        f0Var = new wed.k0(sharedAlertsScreenContract$InputData2, hVarB2, aVarB);
                        break;
                    case 11:
                        return new ped.b();
                    default:
                        throw new AssertionError(i);
                }
                return f0Var;
            case 1:
                j jVar = (j) this.e;
                e eVar2 = (e) this.f214458b;
                k2d.e eVar3 = eVar2.f214446g;
                int i2 = this.d;
                if (i2 == 0) {
                    SharedCompletedAlertsScreenContract$InputData sharedCompletedAlertsScreenContract$InputData = jVar.f214469a;
                    efd.a aVarA2 = eVar3.a();
                    s.j(aVarA2);
                    return new xed.n(sharedCompletedAlertsScreenContract$InputData, aVarA2, (jki.p) jVar.f214470b.get(), (g1) ((g) this.f214459c).f.get(), (ped.a) jVar.f214471c.get());
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new ped.b();
                    }
                    throw new AssertionError(i2);
                }
                ifd.h hVarB3 = eVar2.f214447h.b();
                s.j(hVarB3);
                ffd.a aVarB2 = eVar3.b();
                s.j(aVarB2);
                return new xed.o(aVarB2, hVarB3);
            case 2:
                hc2.k kVar = (hc2.k) this.e;
                int i3 = this.d;
                if (i3 == 0) {
                    n60.a aVar2 = (n60.a) kVar.d.get();
                    o5k.i.l(aVar2);
                    return aVar2;
                }
                if (i3 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) kVar.f150795c.get());
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        return new jx1.k(kVar.f150794b);
                    }
                    throw new AssertionError(i3);
                }
                ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = kVar.f150794b;
                hx1.a aVar3 = (hx1.a) ((nh2.s) this.f214459c).f215350j.get();
                n60.a aVar4 = (n60.a) kVar.d.get();
                z80.b bVarS = ((nh2.o) this.f214458b).i.s();
                s.j(bVarS);
                return new com.revolut.feature.apm.core.code.ui.a(apmCodeControllerContract$InputData, aVar3, aVar4, bVarS, (cli.n) kVar.f.get());
            case 3:
                int i5 = this.d;
                if (i5 == 0) {
                    return new pi2.j(((nh2.y) this.f214459c).f215362a, (cli.n) ((nh2.x) this.e).f215360a.get());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                z80.b bVarS2 = ((nh2.o) this.f214458b).i.s();
                s.j(bVarS2);
                return new pi2.l(bVarS2);
            case 4:
                nh2.a0 a0Var = (nh2.a0) this.e;
                p12.l lVar = ((nh2.o) this.f214458b).f215321n;
                int i6 = this.d;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new AssertionError(i6);
                    }
                    v02.a aVarA3 = lVar.a();
                    s.j(aVarA3);
                    return new bi2.q(aVarA3);
                }
                nh2.o oVar = a0Var.f215270a;
                bi2.f fVar = new bi2.f((vw1.b) oVar.C.get(), oVar.f215323q.e());
                com.revolut.feature.apm.core.ui.api.navigation.a aVar5 = (com.revolut.feature.apm.core.ui.api.navigation.a) ((nh2.s) this.f214459c).d.get();
                v02.b bVarB = lVar.b();
                s.j(bVarB);
                os2.g gVar = new os2.g((com.revolut.feature.apm.core.ui.api.navigation.a) a0Var.f215271b.d.get());
                v02.c cVarC = lVar.c();
                s.j(cVarC);
                return new bi2.o(fVar, aVar5, bVarB, gVar, cVarC, (cli.n) a0Var.f215272c.get());
            case 5:
                nk7.v vVar = (nk7.v) this.e;
                int i21 = this.d;
                if (i21 == 0) {
                    return kxa.j.l((j60.a) vVar.e.get());
                }
                if (i21 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) vVar.f216733c.get(), (rp0.m) vVar.d.get());
                }
                if (i21 == 2) {
                    return new rp0.m();
                }
                if (i21 != 3) {
                    if (i21 != 4) {
                        throw new AssertionError(i21);
                    }
                    thf.g gVarE = vVar.f216732b.f216717c.e();
                    s.j(gVarE);
                    return new ek7.q(new ik7.j(gVarE), new CFACInsuranceAddExpensesItemMapper());
                }
                jki.p pVar2 = (jki.p) vVar.f216734g.get();
                CFACInsuranceReviewClaimScreenContract$InputData cFACInsuranceReviewClaimScreenContract$InputData = vVar.f216731a;
                fj7.a aVar6 = (fj7.a) ((nk7.q) this.f214458b).f216715a.o.get();
                s.j(aVar6);
                return new ek7.p(pVar2, cFACInsuranceReviewClaimScreenContract$InputData, aVar6, (mj7.b) ((nk7.j) this.f214459c).e.get(), (j60.a) vVar.e.get(), new ek7.r());
            case 6:
                nk7.w wVar = (nk7.w) this.e;
                nk7.q qVar = (nk7.q) this.f214458b;
                djf.c cVar2 = qVar.f216717c;
                int i22 = this.d;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new gk7.n();
                    }
                    throw new AssertionError(i22);
                }
                jki.p pVar3 = (jki.p) wVar.f216737b.get();
                CFACInsuranceSelectExpensesScreenContract$InputData cFACInsuranceSelectExpensesScreenContract$InputData = wVar.f216736a;
                whf.b bVarA = cVar2.a();
                s.j(bVarA);
                whf.n nVarB = cVar2.b();
                s.j(nVarB);
                thf.m mVarG = cVar2.g();
                s.j(mVarG);
                mj7.b bVar = (mj7.b) ((nk7.j) this.f214459c).e.get();
                ffk.t tVarF = qVar.f.f();
                s.j(tVarF);
                return new gk7.m(pVar3, cFACInsuranceSelectExpensesScreenContract$InputData, bVarA, nVarB, mVarG, bVar, tVarF);
            case 7:
                nk7.q qVar2 = (nk7.q) this.f214458b;
                nk7.y yVar = (nk7.y) this.e;
                int i32 = this.d;
                switch (i32) {
                    case 0:
                        return kxa.j.l((j60.a) yVar.f216745g.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) yVar.e.get(), (rp0.m) yVar.f.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return f0k.d.o((e60.a) yVar.f216750n.get());
                    case 4:
                        com.revolut.kompot.navigable.a aVar7 = (com.revolut.kompot.navigable.a) yVar.e.get();
                        g60.a aVarA4 = f60.n.a((com.revolut.kompot.navigable.a) yVar.e.get());
                        Activity activityA = f60.l.a((com.revolut.kompot.navigable.a) yVar.e.get());
                        t80.g gVar2 = (t80.g) yVar.i.get();
                        com.revolut.kompot.navigable.a aVar8 = (com.revolut.kompot.navigable.a) yVar.e.get();
                        f60.q.a(aVar8);
                        d4m.a aVarA5 = e4m.b.a((h) yVar.f216754s);
                        nli.a aVar9 = new nli.a((t80.c) yVar.f216747j.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar.e.get()));
                        t80.g gVar3 = (t80.g) yVar.i.get();
                        zk0.b bVarL = yVar.f216744c.d.l();
                        s.j(bVarL);
                        return f0k.d.u(aVar7, new t80.v(aVarA4, activityA, gVar2, aVar8, aVarA5, aVar9, new oli.c(gVar3, bVarL, new nli.a((t80.c) yVar.f216747j.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar.e.get())), f60.n.a((com.revolut.kompot.navigable.a) yVar.e.get()), yVar.e()), new oli.g(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) yVar.e.get())), pli.b.a(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) yVar.e.get()))), new ami.n(e4m.b.a((h) yVar.f216755t), 1), e4m.b.a((h) yVar.f216754s), (t80.g) yVar.i.get(), new nli.a((t80.c) yVar.f216747j.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar.e.get())), new i90.b(), yVar.d(), yVar.e()), yVar.e()), f60.p.a(), (rp0.m) yVar.k.get(), (e60.t) yVar.f216749m.get(), new nji.b());
                    case 5:
                        f80.a aVarX = qVar2.d.x();
                        s.j(aVarX);
                        return new t80.x(aVarX, new i90.b());
                    case 6:
                        com.revolut.kompot.navigable.a aVar10 = (com.revolut.kompot.navigable.a) yVar.e.get();
                        f60.q.a(aVar10);
                        return pli.c.a(new ks0.n(aVar10));
                    case 7:
                        return kk7.c.a();
                    case 8:
                        return t96.a.a();
                    case 9:
                        return f60.r.a();
                    case 10:
                        aii.o oVar2 = (aii.o) yVar.f216748l.get();
                        y80.a aVarR = qVar2.d.r();
                        s.j(aVarR);
                        return new e60.y(oVar2, aVarR, yVar.d(), Optional.empty());
                    case 11:
                        e60.t tVar = (e60.t) yVar.f216749m.get();
                        f60.o.a(tVar);
                        return tVar;
                    case 12:
                        return new jk7.k((jki.p) yVar.f216752q.get(), yVar.f216743b, (e60.a) yVar.f216750n.get(), (j60.a) yVar.f216745g.get(), new jk7.m(), new jk7.n(), (mj7.b) ((nk7.j) this.f214459c).e.get());
                    case 13:
                        return new jk7.l();
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                nk7.q qVar3 = (nk7.q) this.f214458b;
                nk7.y yVar2 = (nk7.y) this.e;
                int i33 = this.d;
                switch (i33) {
                    case 0:
                        return kxa.j.l((j60.a) yVar2.f216745g.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) yVar2.e.get(), (rp0.m) yVar2.f.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return f0k.d.o((e60.a) yVar2.f216750n.get());
                    case 4:
                        com.revolut.kompot.navigable.a aVar11 = (com.revolut.kompot.navigable.a) yVar2.e.get();
                        g60.a aVarA6 = f60.n.a((com.revolut.kompot.navigable.a) yVar2.e.get());
                        Activity activityA2 = f60.l.a((com.revolut.kompot.navigable.a) yVar2.e.get());
                        t80.g gVar4 = (t80.g) yVar2.i.get();
                        com.revolut.kompot.navigable.a aVar12 = (com.revolut.kompot.navigable.a) yVar2.e.get();
                        f60.q.a(aVar12);
                        d4m.a aVarA7 = e4m.b.a((h) yVar2.f216754s);
                        nli.a aVar13 = new nli.a((t80.c) yVar2.f216747j.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar2.e.get()));
                        t80.g gVar5 = (t80.g) yVar2.i.get();
                        zk0.b bVarL2 = yVar2.f216744c.d.l();
                        s.j(bVarL2);
                        return f0k.d.u(aVar11, new t80.v(aVarA6, activityA2, gVar4, aVar12, aVarA7, aVar13, new oli.c(gVar5, bVarL2, new nli.a((t80.c) yVar2.f216747j.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar2.e.get())), f60.n.a((com.revolut.kompot.navigable.a) yVar2.e.get()), yVar2.e()), new oli.g(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) yVar2.e.get())), pli.b.a(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) yVar2.e.get()))), new ami.n(e4m.b.a((h) yVar2.f216755t), 1), e4m.b.a((h) yVar2.f216754s), (t80.g) yVar2.i.get(), new nli.a((t80.c) yVar2.f216747j.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar2.e.get())), new i90.b(), yVar2.d(), yVar2.e()), yVar2.e()), f60.p.a(), (rp0.m) yVar2.k.get(), (e60.t) yVar2.f216749m.get(), new nji.b());
                    case 5:
                        f80.a aVarX2 = qVar3.d.x();
                        s.j(aVarX2);
                        return new t80.x(aVarX2, new i90.b());
                    case 6:
                        com.revolut.kompot.navigable.a aVar14 = (com.revolut.kompot.navigable.a) yVar2.e.get();
                        f60.q.a(aVar14);
                        return pli.c.a(new ks0.n(aVar14));
                    case 7:
                        return kk7.c.a();
                    case 8:
                        return t96.a.a();
                    case 9:
                        return f60.r.a();
                    case 10:
                        aii.o oVar3 = (aii.o) yVar2.f216748l.get();
                        y80.a aVarR2 = qVar3.d.r();
                        s.j(aVarR2);
                        return new e60.y(oVar3, aVarR2, yVar2.d(), Optional.empty());
                    case 11:
                        e60.t tVar2 = (e60.t) yVar2.f216749m.get();
                        f60.o.a(tVar2);
                        return tVar2;
                    case 12:
                        return new jk7.k((jki.p) yVar2.f216752q.get(), yVar2.f216743b, (e60.a) yVar2.f216750n.get(), (j60.a) yVar2.f216745g.get(), new jk7.m(), new jk7.n(), (mj7.b) ((nk7.r) this.f214459c).f.get());
                    case 13:
                        return new jk7.l();
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                hc2.k kVar2 = (hc2.k) this.e;
                int i43 = this.d;
                if (i43 == 0) {
                    n60.a aVar15 = (n60.a) kVar2.d.get();
                    o5k.i.l(aVar15);
                    return aVar15;
                }
                if (i43 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) kVar2.f150795c.get());
                }
                if (i43 != 2) {
                    if (i43 == 3) {
                        return new jx1.k(kVar2.f150794b);
                    }
                    throw new AssertionError(i43);
                }
                ApmCodeControllerContract$InputData apmCodeControllerContract$InputData2 = kVar2.f150794b;
                ci2.a aVar16 = new ci2.a((vw1.b) ((nv1.e) this.f214459c).f219389b.u.get(), 1);
                n60.a aVar17 = (n60.a) kVar2.d.get();
                z80.b bVarS3 = ((nv1.g) this.f214458b).f219401j.s();
                s.j(bVarS3);
                return new com.revolut.feature.apm.core.code.ui.a(apmCodeControllerContract$InputData2, aVar16, aVar17, bVarS3, (cli.n) kVar2.f.get());
            case 10:
                nv1.j jVar2 = (nv1.j) this.e;
                int i59 = this.d;
                if (i59 == 0) {
                    return new aw1.q((zu1.a) ((nv1.g) this.f214458b).f219411x.get(), new sv1.d(), (com.revolut.feature.apm.core.ui.api.navigation.a) ((nv1.e) this.f214459c).d.get(), (cli.n) jVar2.f219420b.get());
                }
                if (i59 != 1) {
                    throw new AssertionError(i59);
                }
                z80.b bVarS4 = jVar2.f219419a.f219401j.s();
                s.j(bVarS4);
                return new aw1.s(new sv1.a(bVarS4));
            case 11:
                nv1.g gVar6 = (nv1.g) this.f214458b;
                nv1.k kVar3 = (nv1.k) this.e;
                int i66 = this.d;
                if (i66 == 0) {
                    return new ew1.m(kVar3.f219422a, (zu1.a) gVar6.f219411x.get(), new sv1.d(), (com.revolut.feature.apm.core.ui.api.navigation.a) ((nv1.e) this.f214459c).d.get(), (cli.n) kVar3.f219424c.get());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                l80.e eVarH = gVar6.f219401j.h();
                s.j(eVarH);
                z80.b bVarS5 = kVar3.f219423b.f219401j.s();
                s.j(bVarS5);
                return new ew1.o(eVarH, new sv1.a(bVarS5));
            case 12:
                return a();
            case 13:
                oda.g gVar7 = (oda.g) this.e;
                oda.o oVar4 = (oda.o) this.f214458b;
                n1 n1Var = oVar4.O;
                je6.g gVar8 = oVar4.f;
                l70.e eVar4 = oVar4.f224400h;
                int i74 = this.d;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new AssertionError(i74);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) gVar7.f224360c.get();
                    dea.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return x0.a(g1.Companion, controller.D2());
                }
                LinkedAccountDetailsScreenContract$InputData linkedAccountDetailsScreenContract$InputData = gVar7.f224358a;
                oda.o oVar5 = gVar7.f224359b;
                je6.h hVarC = ((t) oVar5.f).c();
                s.j(hVarC);
                cea.z zVar = new cea.z(hVarC, oVar5.a());
                c70.a aVarZ = eVar4.z();
                s.j(aVarZ);
                r70.c cVarA2 = eVar4.A();
                s.j(cVarA2);
                oe6.a aVarA8 = n1Var.a();
                s.j(aVarA8);
                xg6.l lVarD = ((t) gVar8).d();
                s.j(lVarD);
                wsg.n nVarB2 = oVar4.f224396a.b();
                gte.a aVarB3 = oVar4.I.b();
                s.j(aVarB3);
                rea.m mVarF = oVar4.f224405p.f();
                uea.f fVar2 = (uea.f) oVar4.T.get();
                zca.b bVar2 = new zca.b();
                g1 g1Var = (g1) gVar7.d.get();
                vi0.b bVar3 = (vi0.b) ((oda.l) this.f214459c).f.get();
                f80.a aVarX3 = eVar4.x();
                s.j(aVarX3);
                le6.c cVar3 = (le6.c) ((t) gVar8).f305074o0.get();
                s.j(cVar3);
                com.revolut.feature.external_accounts.api.navigation.a aVarB4 = ((t) gVar8).b();
                s.j(aVarB4);
                s70.a aVarM = eVar4.m();
                s.j(aVarM);
                rh6.b bVar4 = (rh6.b) n1Var.f304965l.get();
                s.j(bVar4);
                l61.a aVarB5 = oVar4.f224411x.b();
                s.j(aVarB5);
                return new com.revolut.feature.pockets.impl.details_v2.linked_account_details.a(linkedAccountDetailsScreenContract$InputData, zVar, aVarZ, cVarA2, aVarA8, lVarD, nVarB2, aVarB3, mVarF, fVar2, bVar2, g1Var, bVar3, aVarX3, cVar3, aVarB4, aVarM, bVar4, aVarB5);
            case 14:
                ove.b0 b0Var = (ove.b0) this.f214459c;
                ove.d0 d0Var = (ove.d0) this.f214458b;
                ove.c0 c0Var = (ove.c0) this.e;
                ove.d0 d0Var2 = c0Var.f230044b;
                int i92 = this.d;
                if (i92 != 0) {
                    if (i92 != 1) {
                        if (i92 == 2) {
                            return new fxe.e();
                        }
                        if (i92 != 3) {
                            if (i92 == 4) {
                                return new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.a(((k3) d0Var.f230063x).b(), c0Var.b());
                            }
                            throw new AssertionError(i92);
                        }
                        mt8.d dVarB = d0Var.f230051g.b();
                        s.j(dVarB);
                        xoj.a aVarA9 = d0Var.B.a();
                        s.j(aVarA9);
                        return new t0f.b(dVarB, aVarA9);
                    }
                    gte.a aVarB6 = d0Var2.f230053j.b();
                    s.j(aVarB6);
                    jub.b bVar5 = (jub.b) d0Var2.f230062w.Z.get();
                    s.j(bVar5);
                    ixe.e eVar5 = new ixe.e(aVarB6, bVar5);
                    ixe.r rVar = new ixe.r();
                    ixe.m mVarB = c0Var.b();
                    ixe.s sVar = new ixe.s();
                    ite.a aVar18 = d0Var2.f230053j;
                    gte.a aVarB7 = aVar18.b();
                    s.j(aVarB7);
                    ixe.g gVar9 = new ixe.g(aVarB7);
                    gte.a aVarB8 = aVar18.b();
                    s.j(aVarB8);
                    zq.a aVar19 = new zq.a(gVar9, new ixe.b(aVarB8));
                    ixe.o oVar6 = new ixe.o();
                    sze.d imageFactory = new sze.d(new sze.b());
                    Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
                    hye.o selectedMethodDetailsFactory = new hye.o();
                    Intrinsics.checkNotNullParameter(selectedMethodDetailsFactory, "selectedMethodDetailsFactory");
                    iye.b checkoutPaymentMethodMapperRevamped = new iye.b();
                    Intrinsics.checkNotNullParameter(checkoutPaymentMethodMapperRevamped, "checkoutPaymentMethodMapperRevamped");
                    return new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.d(eVar5, rVar, mVarB, sVar, aVar19, oVar6, new ixe.q(), new exe.b(), new ixe.n());
                }
                cli.n nVar = (cli.n) c0Var.d.get();
                CheckoutScreenContract$InputData checkoutScreenContract$InputData = c0Var.f230043a;
                ove.b0 b0Var2 = c0Var.f230045c;
                uwe.j jVar3 = (uwe.j) b0Var2.f230038n.get();
                bi3.d dVar = d0Var2.f230050c;
                xmg.a aVar20 = d0Var2.z;
                efk.a aVar21 = d0Var2.f230064y;
                sh3.a aVarA10 = dVar.a();
                s.j(aVarA10);
                dha.c cVarI = aVar21.i();
                s.j(cVarI);
                ffk.t tVarF2 = aVar21.f();
                s.j(tVarF2);
                hxe.a aVar22 = new hxe.a();
                te8.d0 d0Var3 = (te8.d0) b0Var2.f230032c.k.A.get();
                s.j(d0Var3);
                hxe.b bVar6 = new hxe.b(aVar22, new fmc.z(d0Var3));
                hxe.e eVar6 = new hxe.e();
                mp.p pVar4 = new mp.p(aVar20.e(), (wwe.a) b0Var2.f230036l.get(), (fxe.e) c0Var.e.get());
                ppk.f fVarA = d0Var2.A.a();
                t0f.b bVar7 = (t0f.b) c0Var.f.get();
                l61.a aVarB9 = aVar20.b();
                s.j(aVarB9);
                n8b.a aVarA11 = d0Var2.C.a();
                s.j(aVarA11);
                s33.e eVar7 = (s33.e) d0Var2.D.k.get();
                s.j(eVar7);
                gte.a aVarB10 = d0Var2.f230053j.b();
                s.j(aVarB10);
                te8.e eVarA = d0Var2.k.a();
                s.j(eVarA);
                wsg.n nVarB3 = d0Var2.f.b();
                qe7.a aVarA12 = ((te7.b) d0Var2.E).a();
                s.j(aVarA12);
                exe.l lVar2 = new exe.l(checkoutScreenContract$InputData, jVar3, aVarA10, cVarI, tVarF2, bVar6, eVar6, pVar4, fVarA, bVar7, aVarB9, aVarA11, eVar7, aVarB10, eVarA, nVarB3, aVarA12);
                cxe.a aVar23 = (cxe.a) c0Var.f230046g.get();
                rwe.a aVar24 = (rwe.a) b0Var.k.get();
                fxe.e eVar8 = (fxe.e) c0Var.e.get();
                y51.a aVarA13 = d0Var2.e.a();
                s.j(aVarA13);
                fxe.d dVar2 = new fxe.d(aVarA13);
                wj0.a aVarI = ((nj0.d) d0Var.f230060s).i();
                s.j(aVarI);
                sh3.a aVarA14 = d0Var.f230050c.a();
                s.j(aVarA14);
                return new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c(nVar, checkoutScreenContract$InputData, lVar2, aVar23, aVar24, eVar8, dVar2, aVarI, aVarA14, (uwe.j) b0Var.f230038n.get(), (qwe.s) b0Var.f230037m.get());
            case 15:
                return b();
            case 16:
                return c();
            case 17:
                return d();
            case 18:
                return e();
            case 19:
                return f();
            case 20:
                return g();
            case 21:
                return h();
            case 22:
                return i();
            case 23:
                return j();
            case 24:
                return k();
            case 25:
                return l();
            case 26:
                return m();
            case 27:
                return n();
            case 28:
                return o();
            default:
                pgf.f fVar3 = (pgf.f) this.f214459c;
                pgf.h hVar = (pgf.h) this.e;
                pgf.e eVar9 = (pgf.e) this.f214458b;
                int i96 = this.d;
                switch (i96) {
                    case 0:
                        return trl.f.j((t60.b) hVar.e.get());
                    case 1:
                        return trl.f.s(hVar.f235917a);
                    case 2:
                        return kxa.j.k((j60.a) hVar.i.get());
                    case 3:
                        return ehe.n.s((com.revolut.kompot.navigable.a) hVar.f235920g.get(), (rp0.m) hVar.f235921h.get());
                    case 4:
                        return new rp0.m();
                    case 5:
                        fd6.a aVar25 = (fd6.a) hVar.f235923l.get();
                        va.g.t(aVar25);
                        return aVar25;
                    case 6:
                        return va.g.s(((zc6.a) eVar9.d).d(), (xc6.a) hVar.k.get());
                    case 7:
                        return r6.b.k((zc6.a) eVar9.d, "factory");
                    case 8:
                        return va.g.u((xc6.a) hVar.k.get());
                    case 9:
                        okg.a aVar26 = eVar9.e;
                        jhf.a aVar27 = eVar9.f235895b;
                        gte.a featureToggleInteractor = aVar26.d.b();
                        s.j(featureToggleInteractor);
                        oai.s legacyAdapter = aVar26.f226046j;
                        oai.s unifiedImpl = aVar26.k;
                        okg.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        Intrinsics.checkNotNullParameter(legacyAdapter, "legacyAdapter");
                        Intrinsics.checkNotNullParameter(unifiedImpl, "unifiedImpl");
                        TransactionListApi$Toggles$UnifiedTransactionList transactionListApi$Toggles$UnifiedTransactionList = TransactionListApi$Toggles$UnifiedTransactionList.f91964c;
                        pkg.b bVar8 = ((jte.d) featureToggleInteractor).c(transactionListApi$Toggles$UnifiedTransactionList) ? (pkg.b) unifiedImpl.get() : (pkg.b) legacyAdapter.get();
                        jkg.d dVarD = eVar9.e.d();
                        qgf.s sVar2 = (qgf.s) fVar3.e.get();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar27).c();
                        s.j(aVarC);
                        sjf.e eVarD = ((bjf.a) aVar27).d();
                        s.j(eVarD);
                        eqj.g gVarG = ((dqj.r) eVar9.f235897g).g();
                        s.j(gVarG);
                        pgf.e eVar10 = hVar.f235919c;
                        pgf.e eVar11 = hVar.f235919c;
                        pkg.b bVar9 = bVar8;
                        x9e.a aVar28 = eVar10.f235898h;
                        l70.e eVar12 = eVar10.f235896c;
                        g9e.a aVarC2 = aVar28.c();
                        s.j(aVarC2);
                        wsg.n nVarB4 = eVar10.i.b();
                        al4.n nVarS = eVar10.f235899j.s();
                        s.j(nVarS);
                        mhf.a aVar29 = (mhf.a) ((bjf.a) eVar10.f235895b).u0.get();
                        s.j(aVar29);
                        kgf.c cVar4 = new kgf.c(nVarB4, nVarS, aVar29, eVar10.k.a(), eVar10.f235900l.e());
                        l80.e eVarH2 = eVar12.h();
                        s.j(eVarH2);
                        n8b.a aVarA15 = eVar10.f235901m.a();
                        s.j(aVarA15);
                        thf.c cVarC2 = eVar10.f235902n.c();
                        s.j(cVarC2);
                        f01.c cVarG = eVar10.o.g();
                        t70.b bVarG = eVar12.g();
                        s.j(bVarG);
                        kgf.e eVar13 = new kgf.e(aVarC2, cVar4, new dhf.b(new dhf.d(eVarH2, aVarA15, cVarC2, cVarG, bVarG)));
                        qgf.j jVar4 = (qgf.j) fVar3.d.get();
                        j1 j1Var = (j1) hVar.o.get();
                        ujf.h hVarA = eVar9.f235903p.a();
                        c9e.c cVarB = eVar11.f235898h.b();
                        s.j(cVarB);
                        b3a.a aVarA16 = eVar11.f235904q.a();
                        s.j(aVarA16);
                        e1 e1Var = new e1(cVarB, aVarA16, hVar.f235918b, (vgf.a) hVar.f235926p.get(), eVar11.u.c(), eVar11.v.b(), eVar11.f235908w);
                        j60.a aVar30 = (j60.a) hVar.i.get();
                        anf.b bVar10 = (anf.b) eVar9.f235902n.Q.get();
                        s.j(bVar10);
                        TransactionsScreenContract$InputData transactionsScreenContract$InputData = hVar.f235918b;
                        x xVarD = ((s41.a) eVar9.f235909x).d();
                        gte.a aVarB11 = eVar9.f.b();
                        s.j(aVarB11);
                        pgf.e eVar14 = fVar3.f235912b;
                        com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) eVar14.f235895b).c();
                        s.j(aVarC3);
                        qgf.b bVar11 = new qgf.b(aVarC3, (rgf.y) eVar14.W.get(), fVar3.f235911a);
                        mjf.f fVar4 = new mjf.f(((bjf.a) aVar27).f15623l.a());
                        whf.b bVarA2 = eVar11.f235902n.a();
                        s.j(bVarA2);
                        vgf.z zVar2 = new vgf.z(bVarA2, hVar.f235918b, eVar11.u.c());
                        i4b.f fVarB = ((zc6.a) eVar9.d).b();
                        wsg.b bVarA3 = eVar9.i.a();
                        g8i.a aVarQ = eVar9.f235910y.Q();
                        okg.a aVar31 = eVar11.e;
                        gte.a featureToggleInteractor2 = aVar31.d.b();
                        s.j(featureToggleInteractor2);
                        oai.s legacyMapper = aVar31.f226045h;
                        oai.s unifiedMapper = aVar31.i;
                        Intrinsics.checkNotNullParameter(featureToggleInteractor2, "featureToggleInteractor");
                        Intrinsics.checkNotNullParameter(legacyMapper, "legacyMapper");
                        Intrinsics.checkNotNullParameter(unifiedMapper, "unifiedMapper");
                        kkg.b bVar12 = ((jte.d) featureToggleInteractor2).c(transactionListApi$Toggles$UnifiedTransactionList) ? (kkg.b) unifiedMapper.get() : (kkg.b) legacyMapper.get();
                        a9e.d dVar3 = (a9e.d) hVar.f235928r.get();
                        zjh.j jVarC = ((zc6.a) eVar11.d).c();
                        j1 j1Var2 = (j1) hVar.o.get();
                        qgf.j jVar5 = (qgf.j) hVar.d.d.get();
                        gte.a aVarB12 = eVar11.f.b();
                        s.j(aVarB12);
                        return new com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a(bVar9, dVarD, sVar2, aVarC, eVarD, gVarG, eVar13, jVar4, j1Var, hVarA, e1Var, aVar30, bVar10, transactionsScreenContract$InputData, xVarD, aVarB11, bVar11, fVar4, zVar2, fVarB, bVarA3, aVarQ, new i1(bVar12, dVar3, jVarC, j1Var2, jVar5, aVarB12, hVar.f235918b, new wde.b()));
                    case 10:
                        return new k1();
                    case 11:
                        gg0.d dVar4 = eVar9.f235905r;
                        r7d.l lVar3 = eVar9.f235906s;
                        u0 u0Var = (u0) dVar4.H.get();
                        s.j(u0Var);
                        mde.e eVarE = lVar3.e();
                        lde.n nVarE = lVar3.f252129a.e();
                        pff.a aVar32 = (pff.a) eVar9.f235907t.f224814p.get();
                        s.j(aVar32);
                        return new vgf.e(u0Var, eVarE, nVarE, aVar32);
                    case 12:
                        mae.p factory = eVar9.f235898h.e();
                        s.j(factory);
                        f01.a uiKitResources = (f01.a) hVar.f235927q.get();
                        t70.b currenciesLocalization = eVar9.f235896c.g();
                        s.j(currenciesLocalization);
                        wgf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                        return factory.c(uiKitResources, currenciesLocalization);
                    case 13:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) hVar.f235920g.get();
                        wgf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        return new f01.c(controller2.m2());
                    default:
                        throw new AssertionError(i96);
                }
        }
    }
}
