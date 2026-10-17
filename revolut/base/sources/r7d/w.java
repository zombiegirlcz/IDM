package r7d;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import b8d.l0;
import c8i.j0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlowContract$InputData;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.network.error.KycNotPassedErrorHandler;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import com.revolut.ui.suspicious.SuspiciousTransactionLegacyActivity;
import dcf.y0;
import et6.p1;
import et6.y1;
import g48.r0;
import h6i.e0;
import ip0.v7;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import jm4.a3;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ljl.q0;
import ljl.q1;
import lp.l9;
import lu7.m0;
import n7i.f0;
import n7i.i0;
import n7i.k0;
import n8i.g0;
import n8i.h1;
import n8i.i1;
import no.j2;
import om4.d0;
import opf.c0;
import ozc.t0;
import retrofit2.Retrofit;
import rp0.g1;
import tim.c;
import us6.g2;
import us6.h2;
import us6.i2;
import z8k.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f252187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f252188c;
    public final int d;
    public final Object e;

    public /* synthetic */ w(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f252186a = i2;
        this.f252187b = obj2;
        this.f252188c = obj3;
        this.e = obj4;
        this.d = i;
    }

    private final Object a() {
        Object obj2;
        u7i.m mVar = (u7i.m) this.f252188c;
        u7i.l lVar = (u7i.l) this.f252187b;
        u7i.o oVar = (u7i.o) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                n60.b bVar = (n60.b) oVar.e.get();
                o5k.i.m(bVar);
                return bVar;
            case 1:
                return o5k.i.r((com.revolut.kompot.navigable.a) oVar.d.get());
            case 2:
                n60.a aVar = (n60.a) oVar.f277873g.get();
                o5k.i.l(aVar);
                return aVar;
            case 3:
                return o5k.i.q((com.revolut.kompot.navigable.a) oVar.d.get());
            case 4:
                return kxa.j.k((j60.a) oVar.f277875j.get());
            case 5:
                return ehe.n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.i.get());
            case 6:
                return new rp0.m();
            case 7:
                g0 extension = (g0) oVar.f277879p.get();
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 8:
                n8i.z dataProvider = (n8i.z) oVar.f277876l.get();
                ImmutableMap extensions = ImmutableMap.of(n8i.v.class, (g0) oVar.f277877m.get(), n8i.x.class, (g0) oVar.f277878n.get(), n8i.w.class, (g0) oVar.o.get());
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                Object obj3 = extensions.get(dataProvider.getType());
                obj2 = obj3 instanceof g0 ? (g0) obj3 : null;
                return obj2 == null ? new p8i.h() : obj2;
            case 9:
                MoveMoneyTopupScreenContract$InputData inputData = oVar.f277870a;
                u7i.l lVar2 = oVar.f277871b;
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                al4.n nVarS = lVar2.f277825d0.s();
                vc.s.j(nVarS);
                builderBuilderWithExpectedSize.put(StartUpPocket.CreditCardAccount.class, new o8i.d(nVarS, lVar2.f277828h.e()));
                builderBuilderWithExpectedSize.put(StartUpPocket.SavingsAccount.class, new t8i.a());
                builderBuilderWithExpectedSize.put(StartUpPocket.JointSavingsAccount.class, new t8i.a());
                builderBuilderWithExpectedSize.put(StartUpPocket.JuniorSavingsAccount.class, new t8i.a());
                n8b.a aVarA = lVar2.V.a();
                vc.s.j(aVarA);
                builderBuilderWithExpectedSize.put(StartUpPocket.VaultAccount.class, new u8i.a(aVarA));
                n8b.a aVarA2 = lVar2.V.a();
                vc.s.j(aVarA2);
                builderBuilderWithExpectedSize.put(StartUpPocket.JointVaultAccount.class, new u8i.a(aVarA2));
                ImmutableMap dataProviders = builderBuilderWithExpectedSize.build();
                p8i.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(dataProviders, "dataProviders");
                n8i.z zVar = (n8i.z) dataProviders.get(inputData.f97413a.getClass());
                return zVar == null ? new p8i.a() : zVar;
            case 10:
                return new o8i.g();
            case 11:
                return new u8i.c(new n7i.f());
            case 12:
                return new t8i.c(new n7i.f(), new f0());
            case 13:
                Object extension2 = (v5i.a) oVar.f277881r.get();
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                vc.s.k(nVar);
                return nVar;
            case 14:
                e6i.a extensionProvider = (e6i.a) lVar.m0.get();
                j60.a bottomDialogExtension = (j60.a) oVar.f277875j.get();
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensionProvider, "extensionProvider");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                return e6i.a.a(extensionProvider, bottomDialogExtension);
            case 15:
                Object extension3 = (v5i.b) oVar.f277883t.get();
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar2 = (yji.n) extension3;
                vc.s.k(nVar2);
                return nVar2;
            case 16:
                e6i.b extensionProvider2 = (e6i.b) lVar.f277835n0.get();
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensionProvider2, "extensionProvider");
                return extensionProvider2.a();
            case 17:
                Object extension4 = (f6i.a) oVar.f277885x.get();
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar3 = (yji.n) extension4;
                vc.s.k(nVar3);
                return nVar3;
            case 18:
                wsg.n nVarB = lVar.G.b();
                f6i.e eVar = new f6i.e();
                ae5.a aVar2 = (ae5.a) oVar.f277884w.get();
                bdi.a aVar3 = (bdi.a) lVar.f277827g.f173124q.get();
                vc.s.j(aVar3);
                return new f6i.d(nVarB, eVar, aVar2, aVar3);
            case 19:
                ce5.b bVar2 = lVar.R;
                be5.b factory = new be5.b();
                ldd.b focusRequesterDelegate = (ldd.b) oVar.v.get();
                n60.a keyboardExtension = (n60.a) oVar.f277873g.get();
                u7i.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                return new be5.a();
            case 20:
                kdd.b bVar3 = lVar.S;
                ldd.a focusRequesterDelegateFactory = new ldd.a();
                p8i.l.Companion.getClass();
                Intrinsics.checkNotNullParameter(focusRequesterDelegateFactory, "focusRequesterDelegateFactory");
                return new ldd.b();
            case 21:
                Object extension5 = (bdi.a) lVar.f277827g.f173124q.get();
                vc.s.j(extension5);
                p8i.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                return (yji.n) extension5;
            case 22:
                MoveMoneyTopupScreenContract$InputData moveMoneyTopupScreenContract$InputData = oVar.f277870a;
                u7i.m mVar2 = oVar.f277872c;
                u7i.l lVar3 = oVar.f277871b;
                l70.e eVar2 = lVar.f277824c;
                v7i.a aVar4 = lVar.z;
                w80.b bVarJ = eVar2.j();
                vc.s.j(bVarJ);
                w5i.c cVarC = lVar3.z.c();
                vc.s.j(cVarC);
                p56.a aVar5 = new p56.a(cVarC);
                od0.i iVar = mVar.f277846b;
                n60.b bVar4 = (n60.b) oVar.e.get();
                h6i.o oVarH = aVar4.h();
                w5i.a aVarA3 = aVar4.a();
                vc.s.j(aVarA3);
                MoveMoneyInputData moveMoneyInputData = mVar2.f277845a;
                v7i.a aVar6 = lVar3.z;
                ite.a aVar7 = lVar3.f277830j;
                w5i.d dVarD = aVar6.d();
                vc.s.j(dVarD);
                h6i.g0 g0Var = (h6i.g0) lVar3.f277836o0.get();
                m6i.j jVarC = oVar.c();
                c0 c0Var = new c0();
                gte.a aVarB = aVar7.b();
                vc.s.j(aVarB);
                w5i.d dVarD2 = aVar6.d();
                vc.s.j(dVarD2);
                h6i.q qVar = new h6i.q();
                gte.a aVarB2 = aVar7.b();
                vc.s.j(aVarB2);
                e0 e0Var = new e0(moveMoneyInputData, dVarD, g0Var, jVarC, c0Var, new r10.a(aVarB, new h6i.r(dVarD2, qVar, aVarB2)));
                v5i.a aVar8 = (v5i.a) oVar.f277881r.get();
                v5i.b bVar5 = (v5i.b) oVar.f277883t.get();
                MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = (MoveAmountScreenContract$InputData) oVar.A.get();
                l80.e eVarH = lVar3.f277824c.h();
                vc.s.j(eVarH);
                n8i.b bVar6 = new n8i.b(moveAmountScreenContract$InputData, eVarH, new n7i.f());
                zof.f fVarD = lVar.A.d();
                vc.s.j(fVarD);
                m6i.j jVarC2 = oVar.c();
                f6i.a aVar9 = (f6i.a) oVar.f277885x.get();
                th5.a aVar10 = (th5.a) oVar.B.get();
                z5i.c cVar = (z5i.c) lVar.l0.get();
                w5i.d dVarD3 = aVar4.d();
                vc.s.j(dVarD3);
                k0 k0VarQ = mVar.q();
                ldd.b bVar7 = (ldd.b) oVar.v.get();
                g0 g0Var2 = (g0) oVar.f277879p.get();
                n8i.z zVar2 = (n8i.z) oVar.f277876l.get();
                l80.e eVarH2 = lVar3.f277824c.h();
                vc.s.j(eVarH2);
                j0 j0Var = new j0(eVarH2, 0);
                x7i.e eVar3 = (x7i.e) mVar.f277852m.get();
                MoveMoneyInputData moveMoneyInputData2 = mVar2.f277845a;
                l70.e eVar4 = lVar3.f277824c;
                w80.b bVarJ2 = eVar4.j();
                vc.s.j(bVarJ2);
                n8i.e0 e0Var2 = (n8i.e0) oVar.C.get();
                u80.o oVar2 = new u80.o();
                l80.e eVarH3 = eVar4.h();
                vc.s.j(eVarH3);
                ldd.b bVar8 = (ldd.b) oVar.v.get();
                yof.d dVar = (yof.d) oVar.D.get();
                i0 i0Var = new i0();
                yof.d dVar2 = (yof.d) oVar.D.get();
                s8i.a aVar11 = new s8i.a();
                gte.a aVarB3 = lVar3.f277830j.b();
                vc.s.j(aVarB3);
                s8i.b bVar9 = new s8i.b(dVar, i0Var, new jx0.a(dVar2, aVar11, aVarB3), new s8i.a());
                MoveMoneyInputData moveMoneyInputData3 = mVar2.f277845a;
                n8i.e0 e0Var3 = (n8i.e0) oVar.C.get();
                l80.e eVarH4 = eVar4.h();
                vc.s.j(eVarH4);
                return new com.revolut.feature_move_money.impl.topup.a(moveMoneyTopupScreenContract$InputData, bVarJ, aVar5, iVar, bVar4, oVarH, aVarA3, e0Var, aVar8, bVar5, bVar6, fVarD, jVarC2, aVar9, aVar10, cVar, dVarD3, k0VarQ, bVar7, g0Var2, zVar2, j0Var, eVar3, new h1(moveMoneyInputData2, bVarJ2, e0Var2, oVar2, eVarH3, bVar8, bVar9, new n8i.c(moveMoneyInputData3, e0Var3, eVarH4), new i1((n8i.e0) oVar.C.get(), new n7i.b0())));
            case 23:
                MoveMoneyTopupScreenContract$InputData inputData2 = oVar.f277870a;
                p8i.l.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                return new MoveAmountScreenContract$InputData.MoveMoney(inputData2.f97413a);
            case 24:
                hi5.a factory2 = (hi5.a) lVar.T.f126438y.get();
                vc.s.j(factory2);
                p8i.l.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new hi5.e(factory2.f152491a, factory2.f152492b);
            case 25:
                n8i.z dataProvider2 = (n8i.z) oVar.f277876l.get();
                ImmutableMap mappers = ImmutableMap.of(n8i.v.class, (u8i.b) new o8i.f(new o8i.e(), oVar.f277871b.f277823b0.f175963a.l()), n8i.w.class, (u8i.b) new t8i.b(), n8i.x.class, new u8i.b());
                p8i.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(dataProvider2, "dataProvider");
                Intrinsics.checkNotNullParameter(mappers, "mappers");
                Object obj4 = mappers.get(dataProvider2.getType());
                obj2 = obj4 instanceof n8i.e0 ? (n8i.e0) obj4 : null;
                return obj2 == null ? new p8i.d() : obj2;
            case 26:
                ppf.a factory3 = lVar.A.b();
                vc.s.j(factory3);
                ldd.b delegate = (ldd.b) oVar.v.get();
                p8i.l.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ubf.e eVar = (ubf.e) this.f252188c;
        ubf.d dVar = (ubf.d) this.f252187b;
        ubf.f fVar = (ubf.f) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                jki.p pVar = (jki.p) fVar.f278883j.get();
                TradingAddOnsFlowContract$InputData tradingAddOnsFlowContract$InputData = eVar.f278873a;
                kbf.a aVar = (kbf.a) dVar.E.get();
                wbf.h hVar = (wbf.h) dVar.S.get();
                fcf.e eVar2 = (fcf.e) fVar.k.get();
                wbf.l lVar = (wbf.l) dVar.T.get();
                wbf.e eVar3 = (wbf.e) dVar.P.get();
                c1l.e eVarA = dVar.f278864n.a();
                aah.i factory = ((u8h.b) fVar.f278880c.f278863m).d();
                vc.s.j(factory);
                ecf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                aah.h hVarA = factory.a();
                c1l.f fVar2 = new c1l.f();
                ybl.l lVarF = dVar.f.f();
                pre.c cVarA = dVar.o.a();
                vc.s.j(cVarA);
                du9.b bVarA = dVar.f278865p.a();
                vc.s.j(bVarA);
                acf.h hVar2 = (acf.h) fVar.f278884l.get();
                wbf.c cVar = (wbf.c) dVar.U.get();
                gte.a aVarB = dVar.e.b();
                vc.s.j(aVarB);
                return new dcf.i0(pVar, tradingAddOnsFlowContract$InputData, aVar, hVar, eVar2, lVar, eVar3, eVarA, hVarA, fVar2, lVarF, cVarA, bVarA, hVar2, cVar, aVarB);
            case 1:
                acf.c cVar2 = (acf.c) fVar.d.get();
                acf.c cVar3 = (acf.c) fVar.e.get();
                acf.a aVar2 = (acf.a) fVar.f.get();
                acf.k kVar = (acf.k) fVar.f278881g.get();
                fcf.n nVar = (fcf.n) fVar.f278882h.get();
                aah.i factory2 = ((u8h.b) fVar.f278880c.f278863m).d();
                vc.s.j(factory2);
                ecf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new y0(cVar2, cVar3, aVar2, kVar, nVar, factory2.b(), (fcf.k) fVar.i.get(), (hcf.a) dVar.N.get());
            case 2:
                return new acf.e();
            case 3:
                return new acf.f();
            case 4:
                return new acf.b();
            case 5:
                return new acf.k();
            case 6:
                return new fcf.p();
            case 7:
                return new fcf.m();
            case 8:
                return new fcf.e();
            case 9:
                return new acf.j();
            case 10:
                dcf.b binder = fVar.f278878a;
                dcf.w api2 = (dcf.w) fVar.f278885m.get();
                j60.a dialogView = (j60.a) eVar.f.get();
                dcf.c dependencies = (dcf.c) fVar.f278886n.get();
                fcf.a eligibilityDialogMapper = (fcf.a) fVar.o.get();
                ecf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(binder, "binder");
                Intrinsics.checkNotNullParameter(api2, "api");
                Intrinsics.checkNotNullParameter(dialogView, "dialogView");
                Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                Intrinsics.checkNotNullParameter(eligibilityDialogMapper, "eligibilityDialogMapper");
                return new dcf.f(binder, api2, dialogView, dependencies, eligibilityDialogMapper);
            case 11:
                Flow goToButtonFlow = fVar.f278879b;
                ecf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(goToButtonFlow, "goToButtonFlow");
                return new dcf.c(goToButtonFlow, new LargeActionButtonDelegate(), new TextDelegate(), new RowDelegate(null, null, 7), new ListCellDelegate());
            case 12:
                return new fcf.c();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        g2 g2Var = (g2) this.f252187b;
        us6.q qVar = g2Var.f282552a;
        zc6.b bVar = g2Var.d;
        i2 i2Var = (i2) this.e;
        g2 g2Var2 = i2Var.f282581b;
        int i = this.d;
        if (i == 0) {
            fd6.a aVar = (fd6.a) i2Var.d.get();
            va.g.t(aVar);
            return aVar;
        }
        if (i == 1) {
            return va.g.s(((zc6.a) bVar).d(), (xc6.a) i2Var.f282582c.get());
        }
        if (i == 2) {
            return r6.b.k((zc6.a) bVar, "factory");
        }
        if (i == 3) {
            return va.g.u((xc6.a) i2Var.f282582c.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        qd0.b languageProvider = g2Var2.f282554c.n();
        vc.s.j(languageProvider);
        jx6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        w80.b bVarB = v80.b.b(languageProvider, false, false, 58);
        et6.h1 h1VarN = qVar.n();
        vc.s.j(h1VarN);
        InvoiceCreateScreenContract$InputData invoiceCreateScreenContract$InputData = i2Var.f282580a;
        kx6.e eVarJ = ((h2) this.f252188c).j();
        l80.e eVarH = g2Var2.f282554c.h();
        vc.s.j(eVarH);
        kx6.g gVar = new kx6.g(new kx6.b(eVarH, new qy6.b()), new tx6.f());
        p1 p1VarO = qVar.o();
        vc.s.j(p1VarO);
        zjh.i iVarA = g2Var.e.a();
        i4b.f fVarB = ((zc6.a) bVar).b();
        xv6.a aVar2 = new xv6.a();
        l70.e eVar = g2Var2.f282554c;
        l80.e eVarH2 = eVar.h();
        vc.s.j(eVarH2);
        InvoiceCreateScreenContract$InputData invoiceCreateScreenContract$InputData2 = i2Var.f282580a;
        qd0.b languageProvider2 = eVar.n();
        vc.s.j(languageProvider2);
        Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
        rx0.i iVar = new rx0.i(2, ((s80.b) languageProvider2).a());
        jw6.d dVar = new jw6.d();
        l80.e eVarH3 = eVar.h();
        vc.s.j(eVarH3);
        l80.e eVarH4 = g2Var2.f282554c.h();
        vc.s.j(eVarH4);
        return new com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g(bVarB, h1VarN, invoiceCreateScreenContract$InputData, eVarJ, gVar, p1VarO, iVarA, fVarB, new com.revolut.feature.freelancer.impl.ui.invoice.create.screen.h(aVar2, eVarH2, invoiceCreateScreenContract$InputData2, new lx6.d(iVar, dVar, eVarH3, new kx6.b(eVarH4, new qy6.b()), new tx6.f()), ((zc6.a) g2Var2.d).c()));
    }

    private final Object d() {
        v8k.g gVar = (v8k.g) this.f252188c;
        v8k.c cVar = (v8k.c) this.f252187b;
        v8k.d dVar = (v8k.d) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) dVar.k.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) dVar.i.get(), (rp0.m) dVar.f286820j.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.b bVar = (n60.b) dVar.f286822m.get();
                o5k.i.n(bVar);
                return bVar;
            case 4:
                return o5k.i.s((com.revolut.kompot.navigable.a) dVar.i.get());
            case 5:
                n60.a aVar = (n60.a) dVar.o.get();
                o5k.i.k(aVar);
                return aVar;
            case 6:
                return o5k.i.p((com.revolut.kompot.navigable.a) dVar.i.get());
            case 7:
                j9i.d extension = (j9i.d) dVar.f286825q.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 8:
                o9i.a aVar2 = dVar.f286815a;
                v8k.c cVar2 = dVar.f286818g;
                o9i.c cVar3 = dVar.f286817c;
                o9i.b bVar2 = dVar.f286816b;
                Retrofit retrofit = ((nj0.d) cVar2.f286798a).f();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                q9i.d dVarE = o5k.i.e(aVar2, o5k.i.c(bVar2, o5k.i.y(cVar3, retrofit), new l9i.a(), new p9i.a()));
                Retrofit retrofit3 = ((nj0.d) cVar2.f286798a).f();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                r9i.e reactionsKeyboardViewModel = new r9i.e(new q9i.b(dVarE, o5k.i.f(aVar2, o5k.i.d(bVar2, o5k.i.y(cVar3, retrofit3), new l9i.a(), new p9i.a()))), new r9i.a());
                ReactionsKeyboardView reactionsKeyboardView = dVar.d;
                j9i.a configuration = a9k.d.a();
                Intrinsics.checkNotNullParameter(reactionsKeyboardViewModel, "reactionsKeyboardViewModel");
                Intrinsics.checkNotNullParameter(reactionsKeyboardView, "reactionsKeyboardView");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new j9i.d(reactionsKeyboardViewModel, reactionsKeyboardView, configuration);
            case 9:
                return n57.a.z(cVar.f286800c.c(), (mga.i0) dVar.f286827s.get(), (mga.f0) dVar.u.get(), (on.a) dVar.v.get());
            case 10:
                yji.o controller = (com.revolut.kompot.navigable.a) dVar.i.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                vc.s.k(i0Var);
                return i0Var;
            case 11:
                return nga.c.t(dVar.e, cVar.f286800c.c(), (wn.a) dVar.f286828t.get());
            case 12:
                return v7.z(cVar.u, "provider");
            case 13:
                os2.g factory = cVar.u.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 14:
                q8k.f extension2 = (q8k.f) dVar.f286831y.get();
                a9k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 15:
                b9k.f checksExtensionFactory = cVar.v.a();
                g1 shotDialogDisplayer = (g1) gVar.f286862q.get();
                b9k.t reviewRequirementResolver = (b9k.t) dVar.f286830x.get();
                a9k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(checksExtensionFactory, "checksExtensionFactory");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                Intrinsics.checkNotNullParameter(reviewRequirementResolver, "reviewRequirementResolver");
                return checksExtensionFactory.i(shotDialogDisplayer, reviewRequirementResolver);
            case 16:
                v8k.h hVar = cVar.v;
                ang.f fVarE = hVar.e.e();
                lpf.a aVar3 = hVar.f;
                bqf.d dVarA = aVar3.a();
                bqf.g gVarF = aVar3.f();
                p96.a reviewRequirementResolverFactory = new p96.a(fVarE, dVarA, gVarF);
                a9k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(reviewRequirementResolverFactory, "reviewRequirementResolverFactory");
                return new b9k.t(fVarE, dVarA, gVarF);
            case 17:
                return o5k.b.a((n5k.b) dVar.I.get());
            case 18:
                n5k.a aVar4 = (n5k.a) dVar.B.get();
                p5k.h hVar2 = (p5k.h) dVar.G.get();
                ffk.t tVarF = cVar.C.f();
                vc.s.j(tVarF);
                ang.f fVarE2 = cVar.o.e();
                wif.a aVarA = cVar.B.a();
                gte.a aVarB = cVar.f286809r.b();
                vc.s.j(aVarB);
                j60.a aVar5 = (j60.a) dVar.k.get();
                qpk.b bVar3 = new qpk.b();
                v2k.c cVarA = cVar.f286813x.a();
                mre.c cVarB = cVar.D.b();
                vc.s.j(cVarB);
                z0h.a aVarB2 = ((u8h.b) cVar.z).b();
                vc.s.j(aVarB2);
                l80.e eVarH = dVar.f286818g.f286799b.h();
                vc.s.j(eVarH);
                return new n5k.p(aVar4, hVar2, tVarF, fVarE2, aVarA, aVarB, aVar5, bVar3, cVarA, cVarB, aVarB2, new p5k.a(eVarH), cVar.E.b(), (n5k.q) dVar.H.get());
            case 19:
                return new e9k.g((j9k.z) gVar.f286863r.get(), (p9k.a) dVar.A.get(), (j9k.c0) gVar.f286864s.get());
            case 20:
                p9k.c.Companion.getClass();
                return new p9k.a();
            case 21:
                p5k.b bVar4 = (p5k.b) dVar.C.get();
                p5k.w wVar = (p5k.w) dVar.E.get();
                tga.k kVarB = cVar.f286814y.b();
                m5k.b bVarD = dVar.d();
                v8k.c cVar4 = dVar.f286818g;
                return new p5k.k(bVar4, wVar, kVarB, bVarD, new jt0.b(cVar4.f286814y.b(), cVar4.B.a(), dVar.d()), dVar.l(), new RateExplanationDialogMapper());
            case 22:
                return new p5k.d();
            case 23:
                p5k.y yVar = (p5k.y) dVar.D.get();
                k5i.c cVarA2 = cVar.f286812w.a();
                p5k.f fVarL = dVar.l();
                v8k.c cVar5 = dVar.f286818g;
                j9l.a aVar6 = new j9l.a();
                gte.a aVarB3 = cVar5.f286809r.b();
                vc.s.j(aVarB3);
                return new p5k.x(yVar, cVarA2, fVarL, new kgm.i(aVar6, aVarB3), new p5k.p());
            case 24:
                return new p5k.y();
            case 25:
                aah.i iVarD = ((u8h.b) cVar.z).d();
                vc.s.j(iVarD);
                return o5k.i.B(iVarD);
            case 26:
                return new n5k.r(new RateExplanationDialogMapper());
            case 27:
                return nga.c.a((n5k.q) dVar.H.get());
            case 28:
                return t5k.b.a((s5k.a) dVar.M.get());
            case 29:
                return new s5k.d((r5k.d) dVar.L.get(), (j60.a) dVar.k.get(), new r5k.a(), new r5k.b());
            case 30:
                return new r5k.e();
            case 31:
                wn.a aVar7 = (wn.a) dVar.f286828t.get();
                n57.a.c(aVar7);
                return aVar7;
            case 32:
                PeerToPeerAmountScreenContract$InputData peerToPeerAmountScreenContract$InputData = dVar.f;
                PeerToPeerAmountScreenContract$InputData peerToPeerAmountScreenContract$InputData2 = dVar.f;
                v8k.g gVar2 = dVar.f286819h;
                v8k.c cVar6 = dVar.f286818g;
                j9k.z zVar = (j9k.z) gVar2.f286863r.get();
                j9k.d dVar2 = (j9k.d) gVar2.f286865t.get();
                lpf.a aVar8 = cVar6.f286803j;
                opf.b bVarG = aVar8.g();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar8.d).c();
                vc.s.j(aVarC);
                opf.i iVar = new opf.i(aVarC);
                z70.a aVarF = cVar6.f286799b.f();
                vc.s.j(aVarF);
                ypf.b bVarB = aVar8.b();
                opf.z zVarD = aVar8.d();
                hj8.a aVarA2 = cVar6.f286810s.a();
                vc.s.j(aVarA2);
                iz9.c cVar7 = (iz9.c) cVar6.H.S.get();
                vc.s.j(cVar7);
                c9k.l lVar = new c9k.l(peerToPeerAmountScreenContract$InputData, zVar, dVar2, bVarG, iVar, aVarF, bVarB, zVarD, aVarA2, cVar7, new opf.c(), new j9k.v((j9k.d) gVar2.f286865t.get()));
                j9k.d dVar3 = (j9k.d) gVar2.f286865t.get();
                e48.a aVar9 = cVar6.I;
                ite.a aVar10 = cVar6.f286809r;
                r0 r0VarC = aVar9.c();
                gte.a aVarB4 = aVar10.b();
                vc.s.j(aVarB4);
                z80.b bVarS = cVar6.f286799b.s();
                vc.s.j(bVarS);
                mp.p pVar = new mp.p(aVarB4, bVarS, cVar6.o.e());
                gte.a aVarB5 = aVar10.b();
                vc.s.j(aVarB5);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a aVar11 = new com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a(dVar3, r0VarC, pVar, aVarB5);
                p9k.a aVar12 = (p9k.a) dVar.A.get();
                n2a.d dVar4 = cVar.J;
                npf.a aVar13 = cVar.d;
                n2a.a aVar14 = (n2a.a) dVar4;
                d0 d0VarC = aVar14.c();
                Context context = aVar14.d;
                n2a.e eVar = n2a.f.Companion;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                qz0.n nVar = new qz0.n(context, null, null);
                mk0.a aVarA3 = aVar14.e.a();
                vc.s.j(aVarA3);
                ue0.c cVar8 = (ue0.c) aVar14.k.get();
                l80.e eVarH2 = aVar14.f.h();
                vc.s.j(eVarH2);
                gte.a aVarB6 = aVar14.f211503g.b();
                vc.s.j(aVarB6);
                h2a.f fVar = new h2a.f(aVarA3, cVar8, eVarH2, aVarB6);
                eVar.getClass();
                c.Companion random = tim.c.INSTANCE;
                vc.s.k(random);
                Intrinsics.checkNotNullParameter(random, "random");
                h2a.c cVar9 = new h2a.c(d0VarC, nVar, fVar, new h2a.g(random));
                d9k.j jVar = new d9k.j();
                l80.e eVarH3 = cVar6.f286799b.h();
                vc.s.j(eVarH3);
                d9k.b bVar5 = new d9k.b(eVarH3, peerToPeerAmountScreenContract$InputData2);
                zof.f fVarD = aVar13.d();
                vc.s.j(fVarD);
                b9k.d dVar5 = (b9k.d) dVar.P.get();
                PeerToPeerTransferInputData peerToPeerTransferInputData = gVar.f286852a;
                b9k.t tVar = (b9k.t) dVar.f286830x.get();
                r9k.b bVar6 = (r9k.b) gVar.u.get();
                n5k.b bVar7 = (n5k.b) dVar.I.get();
                s5k.a aVar15 = (s5k.a) dVar.M.get();
                j60.a aVar16 = (j60.a) dVar.k.get();
                n60.a aVar17 = (n60.a) dVar.o.get();
                j9i.d dVar6 = (j9i.d) dVar.f286825q.get();
                l2j.a aVar18 = new l2j.a();
                w80.b bVar8 = (w80.b) dVar.Q.get();
                l80.e eVarH4 = cVar.f286799b.h();
                vc.s.j(eVarH4);
                ldd.b bVar9 = (ldd.b) dVar.R.get();
                to9.a aVar19 = (to9.a) ((ut9.a) cVar.L).f283050x.get();
                vc.s.j(aVar19);
                jki.p pVar2 = (jki.p) dVar.T.get();
                c9k.a aVar20 = new c9k.a(peerToPeerAmountScreenContract$InputData2);
                q8k.f fVar2 = (q8k.f) dVar.f286831y.get();
                aqf.b bVarC = aVar13.c();
                vc.s.j(bVarC);
                gte.a aVarB7 = cVar.f286809r.b();
                vc.s.j(aVarB7);
                return new com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b(peerToPeerAmountScreenContract$InputData, lVar, aVar11, aVar12, cVar9, jVar, bVar5, fVarD, dVar5, peerToPeerTransferInputData, tVar, bVar6, bVar7, aVar15, aVar16, aVar17, dVar6, aVar18, bVar8, eVarH4, bVar9, aVar19, pVar2, aVar20, fVar2, bVarC, aVarB7);
            case 33:
                PeerToPeerAmountScreenContract$InputData peerToPeerAmountScreenContract$InputData3 = dVar.f;
                j9k.c0 c0Var = (j9k.c0) gVar.f286864s.get();
                r9k.b bVar10 = (r9k.b) gVar.u.get();
                lpf.a aVar21 = cVar.f286803j;
                so9.b bVar11 = cVar.L;
                c0 c0Var2 = new c0();
                vo9.a aVarB8 = ((ut9.a) bVar11).b();
                vc.s.j(aVarB8);
                n8b.a countryInteractor = dVar.f286818g.G.a();
                vc.s.j(countryInteractor);
                PeerToPeerTransferInputData inputData = dVar.f286819h.f286852a;
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                r10.d dVar7 = new r10.d();
                dVar7.f250818a = countryInteractor;
                dVar7.f250819b = inputData;
                wt9.e eVarC = ((ut9.a) bVar11).c();
                vc.s.j(eVarC);
                return new b9k.d(peerToPeerAmountScreenContract$InputData3, c0Var, bVar10, c0Var2, aVarB8, dVar7, eVarC);
            case 34:
                qd0.b languageProvider = cVar.f286799b.n();
                vc.s.j(languageProvider);
                a9k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 35:
                kdd.b bVar12 = cVar.M;
                ldd.a factory2 = new ldd.a();
                a9k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new ldd.b();
            case 36:
                e4m.e eVar2 = dVar.S;
                v8k.c cVar10 = dVar.f286818g;
                yof.d dVar8 = (yof.d) eVar2.get();
                vo9.a aVarB9 = ((ut9.a) cVar10.L).b();
                vc.s.j(aVarB9);
                u80.o oVar = new u80.o();
                w80.b bVar13 = (w80.b) dVar.Q.get();
                ldd.b bVar14 = (ldd.b) dVar.R.get();
                d9k.j jVar2 = new d9k.j();
                gte.a aVarB10 = cVar10.d.f218200a.b();
                vc.s.j(aVarB10);
                nd.n factory3 = new nd.n(aVarB10);
                ldd.b focusRequesterDelegate = (ldd.b) dVar.R.get();
                a9k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "delegate");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                ppf.c cVar11 = new ppf.c(focusRequesterDelegate);
                d9k.f fVar3 = new d9k.f(dVar8, aVarB9, oVar, bVar13, bVar14, jVar2, new kgm.i(new jid.z(cVar11, aVarB10), cVar11), new d9k.c());
                l80.e eVarH5 = cVar10.f286799b.h();
                vc.s.j(eVarH5);
                d9k.b bVar15 = new d9k.b(eVarH5, dVar.f);
                yof.d dVar9 = (yof.d) dVar.S.get();
                d9k.l lVar2 = new d9k.l(new zjh.f(cVar10.N.g()), dVar.e());
                d9k.n nVar2 = new d9k.n(new zjh.f(cVar10.N.g()), dVar.e());
                d9k.g gVarE = dVar.e();
                thf.d dVarD = cVar10.O.d();
                vc.s.j(dVarD);
                return new h0(fVar3, bVar15, dVar9, new zjh.c(new d9k.k(lVar2, nVar2, new d9k.m(gVarE, dVarD))), ((n2a.a) cVar.J).a());
            case 37:
                ppf.a factory4 = cVar.d.b();
                vc.s.j(factory4);
                ldd.b delegate = (ldd.b) dVar.R.get();
                a9k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        vtc.v vVar = (vtc.v) this.e;
        vtc.t tVar = vVar.f292086c;
        vtc.t tVar2 = (vtc.t) this.f252187b;
        yt2.g gVar = tVar2.o;
        xmg.a aVar = tVar2.f292072n;
        int i = this.d;
        if (i == 0) {
            return kxa.j.k((j60.a) vVar.f.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) vVar.d.get(), (rp0.m) vVar.e.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            mkd.g view = vVar.f292084a;
            rkd.m factory = tVar2.f292076s.a();
            vc.s.j(factory);
            kvc.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a(view);
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        otc.b bVar = otc.b.RETAIL;
        vc.s.k(bVar);
        vc.s.k(bVar);
        n8b.a aVarA = tVar.f292077t.a();
        vc.s.j(aVarA);
        lvc.c cVar = new lvc.c();
        gte.a aVarB = tVar.k.b();
        vc.s.j(aVarB);
        jvc.j0 j0Var = new jvc.j0(bVar, new jvc.c(bVar, aVarA, cVar, aVarB));
        SecurityHubScreenContract$InputData securityHubScreenContract$InputData = vVar.f292085b;
        gte.a aVarB2 = tVar2.k.b();
        vc.s.j(aVarB2);
        jla.h hVarA = tVar2.f292066h.a();
        l93.f fVarJ = tVar2.e.j();
        vc.s.j(fVarJ);
        j60.a aVar2 = (j60.a) vVar.f.get();
        m93.d dVarF = tVar.e.f();
        vc.s.j(dVarF);
        kye.e eVar = new kye.e(new xtc.c(dVarF));
        lvc.a aVar3 = new lvc.a();
        rul.e eVarC = tVar2.c();
        zja.a aVarA2 = ((ika.b) tVar2.f292071m).a();
        vc.s.j(aVarA2);
        vc.s.k(bVar);
        kdh.b bVarD = ((n86.d) tVar2.u).d();
        ang.f fVarE = aVar.e();
        smd.s sVarB = ((vtc.u) this.f252188c).b();
        mkd.d dVar = (mkd.d) vVar.f292088h.get();
        wtc.t tVar3 = new wtc.t();
        se9.d dVar2 = (se9.d) ((re9.a) tVar2.v).f253553j.get();
        vc.s.j(dVar2);
        ptc.a aVar4 = (ptc.a) tVar2.Z.get();
        vqb.b bVarF = tVar2.f292078w.f();
        st2.e eVar2 = (st2.e) gVar.o.get();
        vc.s.j(eVar2);
        til.m mVarA = tVar2.f292079x.a();
        vc.s.j(mVarA);
        t1j.b bVar2 = new t1j.b(tVar.f292072n.d());
        zrc.d dVarA = tVar2.f292080y.a();
        vfg.p pVar = new vfg.p(new wt2.b(gVar.e.f308745a.a()));
        l61.a aVarB3 = aVar.b();
        vc.s.j(aVarB3);
        return new com.revolut.feature.security_hub.impl.ui.security_hub.c(j0Var, securityHubScreenContract$InputData, aVarB2, hVarA, fVarJ, aVar2, eVar, aVar3, eVarC, aVarA2, bVar, bVarD, fVarE, sVarB, dVar, tVar3, dVar2, aVar4, bVarF, eVar2, mVarA, bVar2, dVarA, pVar, aVarB3);
    }

    private final Object f() {
        vzc.d dVar = (vzc.d) this.e;
        vzc.b bVar = (vzc.b) this.f252187b;
        int i = this.d;
        if (i == 0) {
            pzc.k kVar = new pzc.k((ozc.d) bVar.f293465y.get(), (ozc.a) ((vzc.c) this.f252188c).G.get(), (ozc.f) bVar.C.get(), (w80.b) dVar.f293484b.get());
            kli.a.p(kVar, bq.i.d(dVar.f293483a.f293466a));
            return kVar;
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        qd0.b languageProvider = bVar.f293450b.n();
        vc.s.j(languageProvider);
        qzc.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    private final Object g() {
        vzc.b bVar = (vzc.b) this.f252187b;
        vzc.f fVar = (vzc.f) this.e;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return new wzc.f();
            }
            throw new AssertionError(i);
        }
        wzc.j jVar = new wzc.j((ozc.d) bVar.f293465y.get(), (ozc.f) bVar.C.get(), (wzc.b) fVar.f293490b.get(), (tpi.j) ((vzc.c) this.f252188c).f293469g.get());
        kli.a.p(jVar, bq.i.d(fVar.f293489a.f293466a));
        return jVar;
    }

    private final Object h() {
        vzc.c cVar = (vzc.c) this.f252188c;
        vzc.b bVar = (vzc.b) this.f252187b;
        l70.e eVar = bVar.f293450b;
        vzc.g gVar = (vzc.g) this.e;
        int i = this.d;
        if (i == 0) {
            ozc.d dVar = (ozc.d) bVar.f293465y.get();
            yzc.h hVar = (yzc.h) gVar.f293493b.get();
            swl.a aVar = (swl.a) gVar.f293494c.get();
            t70.g gVarO = eVar.o();
            vc.s.j(gVarO);
            return new yzc.v(dVar, hVar, aVar, gVarO, (ozc.f) bVar.C.get(), (yzc.c) gVar.e.get());
        }
        if (i == 1) {
            return new yzc.l((p80.a) gVar.f293492a.get());
        }
        if (i == 2) {
            Context context = bq.i.i(cVar.f293466a);
            zzc.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            return new p80.a(context);
        }
        if (i == 3) {
            upi.f fVar = (upi.f) cVar.F.get();
            t70.g gVarO2 = eVar.o();
            vc.s.j(gVarO2);
            return new qqi.c(fVar, gVarO2, (npi.f) cVar.e.get(), (swl.b) bVar.C.get(), (lpi.e) cVar.f293479t.get());
        }
        if (i == 4) {
            return new yzc.c((o80.b) gVar.d.get());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        zzc.a.Companion.getClass();
        return new o80.b();
    }

    private final Object i() {
        vzc.b bVar = (vzc.b) this.f252187b;
        vzc.i iVar = (vzc.i) this.e;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return new f0d.i();
            }
            throw new AssertionError(i);
        }
        f0d.q qVar = new f0d.q((ozc.d) bVar.f293465y.get(), (f0d.b) iVar.f293499b.get(), (ozc.f) bVar.C.get(), (ypi.i) ((vzc.c) this.f252188c).f293481x.get());
        kli.a.p(qVar, bq.i.d(iVar.f293498a.f293466a));
        return qVar;
    }

    private final Object j() {
        vzc.d dVar = (vzc.d) this.e;
        vzc.b bVar = (vzc.b) this.f252187b;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return new g0d.g((t0) ((vzc.c) this.f252188c).J.get());
            }
            throw new AssertionError(i);
        }
        g0d.p pVar = new g0d.p((ozc.d) bVar.f293465y.get(), (g0d.c) dVar.f293484b.get(), (ozc.f) bVar.C.get(), (mxc.b) bVar.z.get());
        kli.a.p(pVar, bq.i.d(dVar.f293483a.f293466a));
        return pVar;
    }

    private final Object k() {
        vzc.b bVar = (vzc.b) this.f252187b;
        vzc.e eVar = (vzc.e) this.e;
        vzc.c cVar = (vzc.c) this.f252188c;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return new h0d.m((t0) cVar.J.get());
            }
            throw new AssertionError(i);
        }
        h0d.s sVar = new h0d.s((ozc.d) bVar.f293465y.get(), (h0d.b) eVar.f293487b.get(), (ozc.f) bVar.C.get(), (tpi.j) cVar.f293469g.get());
        kli.a.p(sVar, bq.i.d(eVar.f293486a.f293466a));
        return sVar;
    }

    private final Object l() {
        vzc.g gVar = (vzc.g) this.f252188c;
        w41.a aVar = (w41.a) this.f252187b;
        w41.b bVar = (w41.b) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                return bq.i.u(bVar.e());
            case 1:
                return bq.i.B(bVar.e());
            case 2:
                return bq.i.q(bVar.e());
            case 3:
                return hsi.b.v(bVar.e());
            case 4:
                return h7d.a.l(bVar.e());
            case 5:
                return bq.i.w(bVar.e());
            case 6:
                return hsi.b.A(bVar.e());
            case 7:
                return l9.c(bVar.f294451a, aVar.f294434a.b());
            case 8:
                j2 settingsTracker = aVar.f294435b.h();
                vc.s.j(settingsTracker);
                m41.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(settingsTracker, "settingsTracker");
                return new mn.g(settingsTracker);
            case 9:
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity = bVar.f294451a;
                j2 j2VarH = aVar.f294435b.h();
                vc.s.j(j2VarH);
                return l9.g(suspiciousTransactionLegacyActivity, j2VarH);
            case 10:
                return l9.b(bVar.e(), aVar.f294434a.b());
            case 11:
                Activity activityE = bVar.e();
                mli.e eVarB = ((j51.a) aVar.f294436c).b();
                vc.s.j(eVarB);
                return l9.l(activityE, eVarB, (aqi.a) bVar.o.get(), new c5l.b());
            case 12:
                return new aqi.d(bVar.e(), new y80.b());
            case 13:
                e86.a aVar2 = aVar.d;
                asi.b bVar2 = aVar.f294436c;
                ao.h hVarA = aVar2.a();
                sri.m mVar = (sri.m) bVar.f294461q.get();
                asi.d dVarC = ((j51.a) bVar2).c();
                vc.s.j(dVarC);
                mli.e eVarA = ((j51.a) bVar2).a();
                vc.s.j(eVarA);
                uil.a aVarA = aVar.e.a();
                vc.s.j(aVarA);
                com.revolut.retail.feature.api.userauth.navigation.a aVarA2 = aVar.f.a();
                vc.s.j(aVarA2);
                return l9.d(hVarA, mVar, dVarC, eVarA, aVarA, aVarA2, (tpi.j) bVar.f294463s.get());
            case 14:
                return bq.i.c(bVar.e(), null);
            case 15:
                return new tpi.i((rpi.c) bVar.f294462r.get(), bq.i.m(bVar.e()));
            case 16:
                return new rpi.b(bVar.e());
            case 17:
                return xhi.f.o(bVar.e(), ((a0b.d) aVar.f294437g).b(), (sri.m) bVar.f294461q.get());
            case 18:
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity2 = bVar.f294451a;
                l9.a(suspiciousTransactionLegacyActivity2);
                asi.b bVar3 = aVar.f294436c;
                an0.c cVar = aVar.f294438h;
                asi.d dVarC2 = ((j51.a) bVar3).c();
                vc.s.j(dVarC2);
                sri.m mVar2 = (sri.m) bVar.f294461q.get();
                om0.b bVarC = cVar.c();
                vc.s.j(bVarC);
                p1b.b bVar4 = (p1b.b) aVar.i.f.get();
                vc.s.j(bVar4);
                zm0.b bVarI = cVar.i();
                vc.s.j(bVarI);
                return new xoi.l(suspiciousTransactionLegacyActivity2, dVarC2, mVar2, bVarC, bVar4, bVarI);
            case 19:
                yri.a aVarA3 = aVar.i.a();
                vc.s.j(aVarA3);
                return new xoi.c(aVarA3);
            case 20:
                Activity activityE2 = bVar.e();
                b80.c cVarP = aVar.f294439j.p();
                vc.s.j(cVarP);
                return new mpi.d(activityE2, cVarP);
            case 21:
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity3 = bVar.f294451a;
                l9.a(suspiciousTransactionLegacyActivity3);
                ppi.d dVar = (ppi.d) aVar.k.e.get();
                vc.s.j(dVar);
                return new ppi.c(suspiciousTransactionLegacyActivity3, dVar);
            case 22:
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity4 = bVar.f294451a;
                l9.a(suspiciousTransactionLegacyActivity4);
                bq.i.h(suspiciousTransactionLegacyActivity4);
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity5 = bVar.f294451a;
                l9.a(suspiciousTransactionLegacyActivity5);
                t70.g gVarO = aVar.f294439j.o();
                vc.s.j(gVarO);
                return new npi.c(suspiciousTransactionLegacyActivity4, suspiciousTransactionLegacyActivity5, gVarO);
            case 23:
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity6 = bVar.f294451a;
                l9.a(suspiciousTransactionLegacyActivity6);
                return new opi.b(suspiciousTransactionLegacyActivity6);
            case 24:
                om0.b bVarC2 = aVar.f294438h.c();
                vc.s.j(bVarC2);
                return new lri.b(bVarC2);
            case 25:
                return new rpi.h(bVar.e());
            case 26:
                nf0.a aVar3 = aVar.f294440l;
                asi.b bVar5 = aVar.f294436c;
                q1 q1Var = aVar.f294444q;
                qf0.c cVarA = aVar3.a();
                vc.s.j(cVarA);
                sri.m mVarD = aVar.o.d();
                vc.s.j(mVarD);
                oe.c cVarM = bq.i.m(bVar.e());
                pak.h hVarA2 = aVar.f294443p.a();
                fkl.h hVar = (fkl.h) ((q0) q1Var).G.get();
                vc.s.j(hVar);
                sf0.h hVarB = aVar.f294440l.b();
                vc.s.j(hVarB);
                yil.b bVar6 = ((q0) q1Var).f196063h.f248575j;
                oad.a aVar4 = (oad.a) aVar.f294445r;
                Optional optionalOf = Optional.of(new rad.a(e4m.b.a(aVar4.k), e4m.b.a(aVar4.f223583l)));
                vc.s.j(optionalOf);
                mli.e eVarB2 = ((j51.a) bVar5).b();
                vc.s.j(eVarB2);
                asi.d dVarC3 = ((j51.a) bVar5).c();
                vc.s.j(dVarC3);
                zm0.c cVarJ = aVar.f294438h.j();
                vc.s.j(cVarJ);
                return new com.revolut.feature.restricted_access.h(cVarA, mVarD, cVarM, hVarA2, hVar, hVarB, bVar6, optionalOf, eVarB2, dVarC3, cVarJ);
            case 27:
                qf0.c cVarA2 = aVar.f294440l.a();
                vc.s.j(cVarA2);
                sri.m mVarD2 = aVar.o.d();
                vc.s.j(mVarD2);
                return new com.revolut.feature.restricted_access.j(cVarA2, mVarD2);
            case 28:
                qf0.c cVarA3 = aVar.f294440l.a();
                vc.s.j(cVarA3);
                sri.m mVarD3 = aVar.o.d();
                vc.s.j(mVarD3);
                return new com.revolut.feature.restricted_access.c(cVarA3, mVarD3, wza.b.a());
            case 29:
                bVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) gVar.f293493b.get(), (k3l.b) bVar.G.get(), new qm.e((um.c) gVar.f293494c.get()));
            case 30:
                return new k3l.d(bVar.e());
            case 31:
                return hsi.b.B(bVar.e());
            case 32:
                return hsi.b.y(bVar.e());
            case 33:
                return bq.i.y(bVar.e());
            case 34:
                return h7d.a.n(bVar.e());
            case 35:
                return h7d.a.r(bVar.e());
            case 36:
                return h7d.a.g(bVar.e());
            case 37:
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity7 = bVar.f294451a;
                l9.a(suspiciousTransactionLegacyActivity7);
                bq.i.h(suspiciousTransactionLegacyActivity7);
                return new lpi.b(suspiciousTransactionLegacyActivity7, (yy0.f) bVar.e.get());
            case 38:
                return new gqi.b(bVar.e());
            case 39:
                f9b.g gVar2 = (f9b.g) aVar.f294446s.f141525g.get();
                vc.s.j(gVar2);
                return m0.q(gVar2, bVar.f294451a, (kwl.b) bVar.Q.get(), (Set) bVar.R.get());
            case 40:
                return l9.h(bVar.f294452b, (kwl.a) bVar.P.get());
            case 41:
                w49.a aVar5 = (w49.a) bVar.O.get();
                wsg.n nVarB = aVar.f294448w.b();
                w41.a aVar6 = bVar.f294453c;
                sri.m mVarD4 = aVar6.o.d();
                vc.s.j(mVarD4);
                com.revolut.feature.kyc.impl.e eVar = new com.revolut.feature.kyc.impl.e();
                v60.e eVarA2 = aVar6.f294442n.a();
                vc.s.j(eVarA2);
                mt8.a aVarA4 = aVar6.f294449x.a();
                vc.s.j(aVarA4);
                return new kwl.a(aVar5, nVarB, new KycNotPassedErrorHandler(mVarD4, eVar, eVarA2, aVarA4));
            case 42:
                SuspiciousTransactionLegacyActivity suspiciousTransactionLegacyActivity8 = bVar.f294451a;
                l9.a(suspiciousTransactionLegacyActivity8);
                jxj.a aVar7 = aVar.f;
                l70.e eVar2 = aVar.f294439j;
                w9k.a aVar8 = aVar.f294447t;
                com.revolut.retail.feature.api.userauth.navigation.a aVarA5 = aVar7.a();
                vc.s.j(aVarA5);
                x9k.a aVarA6 = aVar8.a();
                vc.s.j(aVarA6);
                aa5.a aVar9 = (aa5.a) aVar8.f295756n.get();
                vc.s.j(aVar9);
                t70.g gVarO2 = eVar2.o();
                vc.s.j(gVarO2);
                v60.e eVarA3 = aVar.f294442n.a();
                vc.s.j(eVarA3);
                rqi.c cVarB = aVar.k.b();
                fwj.p pVarA = aVar.u.a();
                vc.s.j(pVarA);
                qd0.b bVarN = eVar2.n();
                vc.s.j(bVarN);
                pwl.d dVar2 = new pwl.d();
                gte.a aVarB = aVar.v.b();
                vc.s.j(aVarB);
                return new cwl.g(suspiciousTransactionLegacyActivity8, aVarA5, aVarA6, aVar9, gVarO2, eVarA3, cVarB, pVarA, bVarN, dVar2, aVarB);
            case 43:
                return l9.e(bVar.f294452b, (kwl.a) bVar.P.get());
            case 44:
                return new twl.p((tpi.j) bVar.f294463s.get(), (sri.m) bVar.f294461q.get(), (twl.i) gVar.e.get(), (k3l.b) bVar.G.get(), (f9b.f) bVar.S.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        w5f.s sVar = (w5f.s) this.f252188c;
        PortfolioInsightsFlowContract$InputData portfolioInsightsFlowContract$InputData = sVar.f295233a;
        w5f.m mVar = (w5f.m) this.f252187b;
        u8h.c cVar = mVar.f295191c;
        dmc.a aVar = mVar.d;
        w5f.t tVar = (w5f.t) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                ViewController view = tVar.f295236a;
                u7f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                return (PortfolioInsightsScreen) view;
            case 1:
                return kii.e.j((u8h.b) cVar, "factory");
            case 2:
                return new g7f.b((v7f.c) tVar.f295238c.get(), (v7f.e) tVar.e.get());
            case 3:
                return new v7f.e(aVar.c(), portfolioInsightsFlowContract$InputData);
            case 4:
                return new w7f.f(aVar.c(), portfolioInsightsFlowContract$InputData);
            case 5:
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a(new cq9.m(new x7f.a(), new v7f.f(), new pak.h(new w7f.e(tVar.f295237b.d.d())), (d1h.h) tVar.f295240h.get()), sVar.f295233a, aVar.c(), (v7f.e) tVar.e.get(), (w7f.f) tVar.f295239g.get(), (d1h.e) tVar.d.get());
            case 6:
                return kii.e.k((u8h.b) cVar);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        wak.e eVar = (wak.e) this.f252188c;
        wak.f fVar = (wak.f) this.f252187b;
        wak.c cVar = (wak.c) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                Object extension = eVar.f295964b;
                dbk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 1:
                abk.b extension2 = (abk.b) cVar.f295955c.get();
                dbk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                abk.b bVar = extension2;
                vc.s.k(bVar);
                return bVar;
            case 2:
                l80.e dateProvider = fVar.f295968c.h();
                vc.s.j(dateProvider);
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new abk.b();
            case 3:
                cbk.g extension3 = (cbk.g) cVar.f295957h.get();
                dbk.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 4:
                return new cbk.h(eVar.f295963a, (cbk.j) cVar.f295956g.get());
            case 5:
                tak.d dVar = (tak.d) cVar.e.get();
                ebk.b bVar2 = (ebk.b) cVar.f.get();
                x02.a aVarH = fVar.d.h();
                vc.s.j(aVarH);
                wak.f fVar2 = cVar.f295953a;
                x02.b bVarI = fVar2.d.i();
                vc.s.j(bVarI);
                xt1.d dVarA = fVar2.e.f108736b.a();
                vc.s.j(dVarA);
                cbk.a aVar = new cbk.a(bVarI, new i4b.f(dVarA));
                vo9.a aVarB = ((ut9.a) fVar.f).b();
                vc.s.j(aVarB);
                x02.d dVarK = fVar.d.k();
                vc.s.j(dVarK);
                return new cbk.o(dVar, bVar2, aVarH, aVar, aVarB, dVarK);
            case 6:
                return new ebk.b(new abk.e(), new abk.d());
            case 7:
                cbk.j extension4 = (cbk.j) cVar.f295956g.get();
                dbk.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                vc.s.k(extension4);
                return extension4;
            case 8:
                ebk.b extension5 = (ebk.b) cVar.f.get();
                dbk.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                vc.s.k(extension5);
                return extension5;
            case 9:
                PendingPaymentContract$InputData pendingPaymentContract$InputData = eVar.f295963a;
                cbk.g gVar = (cbk.g) cVar.f295957h.get();
                tak.d dVar2 = eVar.f295964b;
                ebk.b bVar3 = (ebk.b) cVar.f.get();
                s42.c cVar2 = (s42.c) fVar.d.f231714x.get();
                vc.s.j(cVar2);
                return new bbk.d0(pendingPaymentContract$InputData, gVar, dVar2, bVar3, cVar2, (cli.n) cVar.f295959l.get());
            case 10:
                vo9.a aVarB2 = ((ut9.a) cVar.f295953a.f).b();
                vc.s.j(aVarB2);
                return new bbk.f0(new i4b.f(new cbk.c(aVarB2)));
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f252186a;
        Object obj2 = this.e;
        int i2 = this.d;
        Object obj3 = this.f252188c;
        Object obj4 = this.f252187b;
        switch (i) {
            case 0:
                x xVar = (x) obj2;
                l lVar = (l) obj4;
                if (i2 == 0) {
                    x8d.a extension = (x8d.a) xVar.f252190b.get();
                    w8d.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i2 == 1) {
                    return new x8d.b(lVar.f252129a.e());
                }
                if (i2 == 2) {
                    return new v8d.m((jki.p) xVar.d.get(), xVar.f252189a, (x8d.a) xVar.f252190b.get(), lVar.c());
                }
                if (i2 == 3) {
                    return new v8d.o(new y8d.a(), (p9d.l) ((t) obj3).f252177h.get(), ((h30.n) lVar.e).t());
                }
                throw new AssertionError(i2);
            case 1:
                y yVar = (y) obj2;
                t tVar = (t) obj3;
                l lVar2 = (l) obj4;
                kde.a aVar = lVar2.f252129a;
                if (i2 == 0) {
                    return new e9d.z((jki.p) yVar.f252193b.get(), yVar.f252192a, aVar.d(), aVar.c(), (p9d.n) tVar.i.get(), aVar.f(), lVar2.c(), new ude.a(), aVar.e());
                }
                if (i2 == 1) {
                    return new e9d.c((p9d.c) tVar.e.get(), new wde.c(), (p9d.l) tVar.f252177h.get(), new lde.o());
                }
                throw new AssertionError(i2);
            case 2:
                z zVar = (z) obj2;
                kde.a aVar2 = ((l) obj4).f252129a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new f9d.o((p9d.c) ((t) obj3).e.get());
                    }
                    throw new AssertionError(i2);
                }
                wli.x xVarA = aVar2.a();
                l0 l0Var = new l0();
                UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment recurrentPayment = zVar.f252195a;
                mde.e eVarC = aVar2.c();
                kde.a aVar3 = zVar.f252196b.f252129a;
                lde.m mVarD = aVar3.d();
                hg0.p pVar = (hg0.p) aVar3.f182872b.P.get();
                vc.s.j(pVar);
                return new com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b(xVarA, l0Var, recurrentPayment, eVarC, new r10.q(mVarD, pVar), aVar2.e(), (jki.p) zVar.f252197c.get());
            case 3:
                a0 a0Var = (a0) obj2;
                kde.a aVar4 = ((l) obj4).f252129a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new i9d.a((p9d.c) ((t) obj3).e.get(), new lde.o());
                    }
                    throw new AssertionError(i2);
                }
                mde.e eVarC2 = aVar4.c();
                UpcomingTransactionsScreenContract$InputData upcomingTransactionsScreenContract$InputData = a0Var.f252088a;
                lal.a aVarF = aVar4.f();
                ae9.b bVar = aVar4.f182877l;
                g9e.a aVarC = aVar4.i.c();
                vc.s.j(aVarC);
                return new i9d.k(eVarC2, upcomingTransactionsScreenContract$InputData, aVarF, new lde.f(aVarC, aVar4.g(), ka1.c.s(bVar.a()), ka1.c.r(bVar.a())), aVar4.e(), (jki.p) a0Var.f252089b.get());
            case 4:
                ryc.b bVar2 = (ryc.b) obj4;
                l70.e eVar = bVar2.f258293c;
                ryc.c cVar = (ryc.c) obj3;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    upi.f fVar = (upi.f) cVar.E.get();
                    t70.g gVarO = eVar.o();
                    vc.s.j(gVarO);
                    return new qqi.c(fVar, gVarO, (npi.f) cVar.f.get(), (swl.b) bVar2.f258304t.get(), (lpi.e) cVar.u.get());
                }
                pyc.f fVar2 = (pyc.f) bVar2.f258302r.get();
                swl.a aVar5 = (swl.a) ((e4m.e) ((pak.h) obj2).f234573b).get();
                p80.a aVar6 = (p80.a) cVar.J.get();
                t70.g gVarO2 = eVar.o();
                vc.s.j(gVarO2);
                return new uyc.d0(fVar2, aVar5, aVar6, gVarO2, bq.i.d(cVar.f258307a));
            case 5:
                ryc.b bVar3 = (ryc.b) obj4;
                k18.c cVar2 = (k18.c) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new syc.p();
                    }
                    throw new AssertionError(i2);
                }
                syc.r rVar = new syc.r((pyc.f) bVar3.f258302r.get(), (syc.l) ((e4m.e) cVar2.f180141c).get(), (pyc.h) bVar3.f258304t.get(), (tpi.j) ((ryc.c) obj3).f258311h.get());
                kli.a.p(rVar, bq.i.d(((ryc.c) cVar2.f180140b).f258307a));
                return rVar;
            case 6:
                srh.b bVar4 = (srh.b) obj4;
                srh.a aVar7 = (srh.a) obj2;
                if (i2 == 0) {
                    return new dr2.m(aVar7.f265212a, (ar2.c) aVar7.e.get(), (vrh.b) ((srh.d) obj3).d.get(), new dr2.n());
                }
                if (i2 == 1) {
                    xq2.d dVar = (xq2.d) aVar7.f265213b.get();
                    er2.a aVar8 = (er2.a) aVar7.f265214c.get();
                    l80.h hVarV = bVar4.f265217b.v();
                    vc.s.j(hVarV);
                    return new ar2.c(dVar, aVar8, hVarV, (LifecycleOwner) aVar7.d.get(), bVar4.f265218c.e(), new ar2.e());
                }
                if (i2 == 2) {
                    cr2.a detectorSettingsProvider = new cr2.a();
                    br2.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(detectorSettingsProvider, "detectorSettingsProvider");
                    return new xq2.d(xq2.e.QR_CODE);
                }
                if (i2 == 3) {
                    return new er2.a();
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                br2.a.Companion.getClass();
                return new cv.c(cv.a.BACK);
            case 7:
                if (i2 == 0) {
                    srh.c cVar3 = (srh.c) obj2;
                    return new wrh.k(cVar3.f265219a, (jki.p) cVar3.f265220b.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                xjl.s sVar = (xjl.s) ((srh.b) obj4).f265216a.f216604c.get();
                vc.s.j(sVar);
                return new wrh.n(sVar, ((srh.d) obj3).f265222a);
            case 8:
                ow9.d dVar2 = (ow9.d) obj2;
                switch (i2) {
                    case 0:
                        return kxa.j.l((j60.a) dVar2.d.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) dVar2.f230337b.get(), (rp0.m) dVar2.f230338c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return new epg.u((jki.p) dVar2.f230340h.get(), (cpg.a) ((ta9.o) obj3).e.get(), (j60.a) dVar2.d.get());
                    case 4:
                        return new anl.j((epg.m) dVar2.f230339g.get());
                    case 5:
                        qd0.b bVarN = ((ta9.m) obj4).i.n();
                        vc.s.j(bVarN);
                        return new epg.f((epg.b) dVar2.f.get(), bVarN);
                    case 6:
                        return new epg.c();
                    default:
                        throw new AssertionError(i2);
                }
            case 9:
                u45.h hVar = (u45.h) obj4;
                je6.g gVar = hVar.f277141t;
                dw3.o oVar = (dw3.o) obj2;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) oVar.e.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) oVar.f119377c.get(), (rp0.m) oVar.d.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new ty4.q((vy4.b) oVar.f119378g.get());
                    }
                    if (i2 == 5) {
                        return new vy4.d(new vy4.a());
                    }
                    throw new AssertionError(i2);
                }
                wli.x xVarD = ((s41.a) hVar.f277139r).d();
                DirectDebitAccountSelectionScreenContract$InputData directDebitAccountSelectionScreenContract$InputData = oVar.f119376b;
                f01.c cVarG = hVar.f277140s.g();
                cz4.b bVar5 = (cz4.b) ((u45.p) obj3).e.get();
                xy4.b bVar6 = new xy4.b();
                je6.h hVarC = ((xf6.t) gVar).c();
                vc.s.j(hVarC);
                t70.b bVarG = hVar.f277138q.g();
                vc.s.j(bVarG);
                wsg.n nVarB = hVar.k.b();
                z71.a aVarF2 = ((c21.b) hVar.d).f();
                vc.s.j(aVarF2);
                u45.h hVar2 = (u45.h) oVar.f119380j;
                wsg.n nVarB2 = hVar2.k.b();
                oe6.a aVarA = hVar2.u.a();
                vc.s.j(aVarA);
                je6.h hVarC2 = ((xf6.t) hVar2.f277141t).c();
                vc.s.j(hVarC2);
                cz4.a aVar9 = new cz4.a(nVarB2, aVarA, hVarC2);
                j60.a aVar10 = (j60.a) oVar.e.get();
                com.revolut.feature.external_accounts.api.navigation.a aVarB = ((xf6.t) gVar).b();
                vc.s.j(aVarB);
                gte.a aVarB2 = hVar.f277135m.b();
                vc.s.j(aVarB2);
                return new ty4.o(xVarD, directDebitAccountSelectionScreenContract$InputData, cVarG, bVar5, bVar6, hVarC, bVarG, nVarB, aVarF2, aVar9, aVar10, aVarB, aVarB2, (jki.p) oVar.f119379h.get());
            case 10:
                dw3.l9 l9Var = (dw3.l9) obj2;
                u45.h hVar3 = (u45.h) obj4;
                if (i2 == 0) {
                    return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b(l9Var.f119225b, (ck4.a) ((u45.i) obj3).f.get(), new wj4.b(), new pk4.a(), (cli.n) l9Var.f119226c.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                vj4.b bVarA = hVar3.f277134l.a();
                vc.s.j(bVarA);
                f90.b bVarT = hVar3.f277138q.t();
                vc.s.j(bVarT);
                return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.c(bVarA, bVarT);
            case 11:
                u7i.m mVar = (u7i.m) obj3;
                u7i.l lVar3 = (u7i.l) obj4;
                u7i.f fVar3 = (u7i.f) obj2;
                switch (i2) {
                    case 0:
                        fd6.a aVar11 = (fd6.a) fVar3.e.get();
                        va.g.t(aVar11);
                        return aVar11;
                    case 1:
                        return va.g.s(((zc6.a) lVar3.k).d(), (xc6.a) fVar3.d.get());
                    case 2:
                        return r6.b.k((zc6.a) lVar3.k, "factory");
                    case 3:
                        n60.b bVar7 = (n60.b) fVar3.f277789h.get();
                        o5k.i.m(bVar7);
                        return bVar7;
                    case 4:
                        return o5k.i.r((com.revolut.kompot.navigable.a) fVar3.f277788g.get());
                    case 5:
                        n60.a aVar12 = (n60.a) fVar3.f277790j.get();
                        o5k.i.l(aVar12);
                        return aVar12;
                    case 6:
                        return o5k.i.q((com.revolut.kompot.navigable.a) fVar3.f277788g.get());
                    case 7:
                        return kxa.j.k((j60.a) fVar3.f277792m.get());
                    case 8:
                        return ehe.n.s((com.revolut.kompot.navigable.a) fVar3.f277788g.get(), (rp0.m) fVar3.f277791l.get());
                    case 9:
                        return new rp0.m();
                    case 10:
                        return va.g.u((xc6.a) fVar3.d.get());
                    case 11:
                        Object extension2 = (f6i.a) fVar3.f277796r.get();
                        d6i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar = (yji.n) extension2;
                        vc.s.k(nVar);
                        return nVar;
                    case 12:
                        wsg.n nVarB3 = lVar3.G.b();
                        f6i.e eVar2 = new f6i.e();
                        ae5.a aVar13 = (ae5.a) fVar3.f277795q.get();
                        bdi.a aVar14 = (bdi.a) lVar3.f277827g.f173124q.get();
                        vc.s.j(aVar14);
                        return new f6i.d(nVarB3, eVar2, aVar13, aVar14);
                    case 13:
                        ce5.b bVar8 = lVar3.R;
                        be5.b factory = new be5.b();
                        ldd.b focusRequesterDelegate = (ldd.b) fVar3.f277794p.get();
                        n60.a keyboardExtension = (n60.a) fVar3.f277790j.get();
                        u7i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                        return new be5.a();
                    case 14:
                        kdd.b bVar9 = lVar3.S;
                        ldd.a focusRequesterDelegateFactory = new ldd.a();
                        d6i.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(focusRequesterDelegateFactory, "focusRequesterDelegateFactory");
                        return new ldd.b();
                    case 15:
                        Object extension3 = (v5i.a) fVar3.f277798t.get();
                        d6i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar2 = (yji.n) extension3;
                        vc.s.k(nVar2);
                        return nVar2;
                    case 16:
                        e6i.a extensionProvider = (e6i.a) lVar3.m0.get();
                        j60.a bottomDialogExtension = (j60.a) fVar3.f277792m.get();
                        d6i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensionProvider, "extensionProvider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        return e6i.a.a(extensionProvider, bottomDialogExtension);
                    case 17:
                        Object extension4 = (v5i.b) fVar3.v.get();
                        d6i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar3 = (yji.n) extension4;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 18:
                        e6i.b extensionProvider2 = (e6i.b) lVar3.f277835n0.get();
                        d6i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensionProvider2, "extensionProvider");
                        return extensionProvider2.a();
                    case 19:
                        Object extension5 = (bdi.a) lVar3.f277827g.f173124q.get();
                        vc.s.j(extension5);
                        d6i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        return (yji.n) extension5;
                    case 20:
                        hi5.a factory2 = (hi5.a) lVar3.T.f126438y.get();
                        vc.s.j(factory2);
                        uh5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return new hi5.e(factory2.f152491a, factory2.f152492b);
                    case 21:
                        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = fVar3.f277785a;
                        u7i.m mVar2 = fVar3.f277787c;
                        u7i.l lVar4 = fVar3.f277786b;
                        od0.i iVar = mVar.f277846b;
                        od0.i iVar2 = mVar.f277847c;
                        MoveMoneyInputData moveMoneyInputData = mVar2.f277845a;
                        v7i.a aVar15 = lVar4.z;
                        ite.a aVar16 = lVar4.f277830j;
                        w5i.d dVarD = aVar15.d();
                        vc.s.j(dVarD);
                        h6i.g0 g0Var = (h6i.g0) lVar4.f277836o0.get();
                        m6i.j jVarC = fVar3.c();
                        c0 c0Var = new c0();
                        gte.a aVarB3 = aVar16.b();
                        vc.s.j(aVarB3);
                        w5i.d dVarD2 = aVar15.d();
                        vc.s.j(dVarD2);
                        h6i.q qVar = new h6i.q();
                        gte.a aVarB4 = aVar16.b();
                        vc.s.j(aVarB4);
                        e0 e0Var = new e0(moveMoneyInputData, dVarD, g0Var, jVarC, c0Var, new r10.a(aVarB3, new h6i.r(dVarD2, qVar, aVarB4)));
                        l70.e eVar3 = lVar3.f277824c;
                        v7i.a aVar17 = lVar3.z;
                        w80.b bVarJ = eVar3.j();
                        vc.s.j(bVarJ);
                        r7i.u uVarJ = fVar3.j();
                        MoveMoneyInputData moveMoneyInputData2 = mVar2.f277845a;
                        w5i.a aVarA2 = lVar4.z.a();
                        vc.s.j(aVarA2);
                        h6i.s sVar2 = new h6i.s(uVarJ, moveMoneyInputData2, aVarA2);
                        h6i.o oVarH = aVar17.h();
                        w5i.d dVarD3 = aVar17.d();
                        vc.s.j(dVarD3);
                        k0 k0VarQ = mVar.q();
                        n60.a aVar18 = (n60.a) fVar3.f277790j.get();
                        ldd.b bVar10 = (ldd.b) fVar3.f277794p.get();
                        w5i.a aVarA3 = aVar17.a();
                        vc.s.j(aVarA3);
                        zof.f fVarD = lVar3.A.d();
                        vc.s.j(fVarD);
                        m6i.j jVarC2 = fVar3.c();
                        mdd.b bVar11 = (mdd.b) fVar3.z.get();
                        f6i.a aVar19 = (f6i.a) fVar3.f277796r.get();
                        ae5.a aVar20 = (ae5.a) fVar3.f277795q.get();
                        v5i.a aVar21 = (v5i.a) fVar3.f277798t.get();
                        v5i.b bVar12 = (v5i.b) fVar3.v.get();
                        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData2 = fVar3.f277785a;
                        MoveMoneyInputData moveMoneyInputData3 = mVar2.f277845a;
                        l80.e eVarH = lVar4.f277824c.h();
                        vc.s.j(eVarH);
                        u7i.t tVar2 = (u7i.t) lVar4.Y.d.get();
                        vc.s.j(tVar2);
                        n7i.f fVar4 = new n7i.f();
                        gte.a aVarB5 = lVar4.f277830j.b();
                        vc.s.j(aVarB5);
                        com.revolut.feature_move_money.impl.amount.e eVar4 = new com.revolut.feature_move_money.impl.amount.e(moveAmountScreenContract$InputData2, moveMoneyInputData3, eVarH, tVar2, fVar4, aVarB5, new f0());
                        z5i.c cVar4 = (z5i.c) lVar3.l0.get();
                        th5.a aVar22 = (th5.a) fVar3.f277801y.get();
                        r10.r rVar2 = new r10.r(fVar3.j(), lVar4.z.h(), new h6i.a());
                        com.revolut.feature_move_money.impl.amount.d dVar3 = new com.revolut.feature_move_money.impl.amount.d();
                        n7i.e eVar5 = new n7i.e(new n7i.f());
                        l80.e eVarH2 = lVar4.f277824c.h();
                        vc.s.j(eVarH2);
                        j0 j0Var = new j0(eVarH2, 0);
                        h9h.a aVar23 = lVar4.o;
                        wzg.a aVarE = aVar23.e();
                        vc.s.j(aVarE);
                        ybl.l lVarF = aVar23.f();
                        u7i.e0.Companion.getClass();
                        od0.i.Companion.getClass();
                        gte.a aVarB6 = lVar4.f277830j.b();
                        vc.s.j(aVarB6);
                        h6i.k0 k0Var = new h6i.k0(aVarE, lVarF, aVarB6);
                        h6i.c newCurrenciesFilterInteractor = new h6i.c(mVar2.e.f277834n.d());
                        od0.i newCurrenciesFilterInteractor2 = mVar2.d;
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(newCurrenciesFilterInteractor, "defaultNewCurrenciesFilterInteractor");
                        Intrinsics.checkNotNullParameter(newCurrenciesFilterInteractor2, "newCurrenciesFilterInteractor");
                        h6i.c cVar5 = (h6i.c) newCurrenciesFilterInteractor2.g();
                        if (cVar5 != null) {
                            newCurrenciesFilterInteractor = cVar5;
                        }
                        r7i.u balancePairEligibilityChecker = fVar3.j();
                        n6i.o nonExistingAccountProvider = new n6i.o(lVar4.G.b(), lVar4.f277840s.c(), mVar2.b());
                        n8b.a countryInteractor = lVar4.V.a();
                        vc.s.j(countryInteractor);
                        r0 jointAccountsInteractor = lVar4.f277840s.c();
                        gr6.a freelancerAccountDetailsInteractor = lVar4.Z.a();
                        vc.s.j(freelancerAccountDetailsInteractor);
                        u7i.t moveMoneyAppConfig = (u7i.t) lVar4.Y.d.get();
                        vc.s.j(moveMoneyAppConfig);
                        Intrinsics.checkNotNullParameter(newCurrenciesFilterInteractor, "newCurrenciesFilterInteractor");
                        Intrinsics.checkNotNullParameter(balancePairEligibilityChecker, "balancePairEligibilityChecker");
                        Intrinsics.checkNotNullParameter(nonExistingAccountProvider, "nonExistingAccountProvider");
                        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
                        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
                        Intrinsics.checkNotNullParameter(moveMoneyAppConfig, "moveMoneyAppConfig");
                        b9k.f fVar5 = new b9k.f();
                        fVar5.f13817b = newCurrenciesFilterInteractor;
                        fVar5.f13816a = balancePairEligibilityChecker;
                        fVar5.f13818c = nonExistingAccountProvider;
                        fVar5.d = countryInteractor;
                        fVar5.e = jointAccountsInteractor;
                        fVar5.f = freelancerAccountDetailsInteractor;
                        fVar5.f13819g = moveMoneyAppConfig;
                        cli.n nVar4 = (cli.n) fVar3.A.get();
                        com.revolut.feature_move_money.impl.amount.f fVar6 = new com.revolut.feature_move_money.impl.amount.f(fVar3.f277785a, lVar4.z.h());
                        v7i.a aVar24 = lVar4.z;
                        w5i.a allowedBalancePickerGroupsProvider = aVar24.a();
                        vc.s.j(allowedBalancePickerGroupsProvider);
                        w5i.c balancesInteractor = aVar24.c();
                        vc.s.j(balancesInteractor);
                        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
                        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
                        r10.a aVar25 = new r10.a();
                        aVar25.f250811a = allowedBalancePickerGroupsProvider;
                        aVar25.f250812b = balancesInteractor;
                        c6i.b bVar13 = new c6i.b();
                        t6i.e itemsBuilder = new t6i.e();
                        Intrinsics.checkNotNullParameter(itemsBuilder, "itemsBuilder");
                        t6i.b bVar14 = new t6i.b();
                        q7i.a aVar26 = new q7i.a();
                        l80.e eVarH3 = lVar4.f277824c.h();
                        vc.s.j(eVarH3);
                        c6i.c cVar6 = new c6i.c(new j0(eVarH3, 0), new q7i.a());
                        gte.a aVarB7 = lVar3.f277830j.b();
                        vc.s.j(aVarB7);
                        return new com.revolut.feature_move_money.impl.amount.c(moveAmountScreenContract$InputData, iVar, iVar2, e0Var, bVarJ, sVar2, oVarH, dVarD3, k0VarQ, aVar18, bVar10, aVarA3, fVarD, jVarC2, bVar11, aVar19, aVar20, aVar21, bVar12, eVar4, cVar4, aVar22, rVar2, dVar3, eVar5, j0Var, k0Var, fVar5, nVar4, fVar6, aVar25, bVar13, bVar14, aVar26, cVar6, aVarB7);
                    case 22:
                        kdd.b bVar15 = lVar3.S;
                        mdd.a inputChangeRequestDelegateFactory = new mdd.a();
                        d6i.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputChangeRequestDelegateFactory, "inputChangeRequestDelegateFactory");
                        return new mdd.b();
                    case 23:
                        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData3 = fVar3.f277785a;
                        u7i.m mVar3 = fVar3.f277787c;
                        u7i.l lVar5 = fVar3.f277786b;
                        w80.b bVarJ2 = lVar5.f277824c.j();
                        vc.s.j(bVarJ2);
                        u80.o oVar2 = new u80.o();
                        ldd.b bVar16 = (ldd.b) fVar3.f277794p.get();
                        mdd.b bVar17 = (mdd.b) fVar3.z.get();
                        i0 expenseStringsMapper = new i0();
                        q6i.b investMoveMoneyDualAmountHintMapper = new q6i.b();
                        q6i.j moveMoneyCountryProfileMapper = new q6i.j();
                        q6i.k moveMoneyCreditCardDualAmountHintMapper = new q6i.k();
                        q6i.i moveMoneyCollateralDualAmountHintMapper = new q6i.i();
                        Intrinsics.checkNotNullParameter(expenseStringsMapper, "expenseStringsMapper");
                        Intrinsics.checkNotNullParameter(investMoveMoneyDualAmountHintMapper, "investMoveMoneyDualAmountHintMapper");
                        Intrinsics.checkNotNullParameter(moveMoneyCountryProfileMapper, "moveMoneyCountryProfileMapper");
                        Intrinsics.checkNotNullParameter(moveMoneyCreditCardDualAmountHintMapper, "moveMoneyCreditCardDualAmountHintMapper");
                        Intrinsics.checkNotNullParameter(moveMoneyCollateralDualAmountHintMapper, "moveMoneyCollateralDualAmountHintMapper");
                        q6i.x xVar2 = new q6i.x(bVarJ2, oVar2, bVar16, bVar17, new q6i.o(), mVar3.f277845a);
                        os2.g gVar2 = new os2.g(lVar5.f277833m.a());
                        p56.a aVar27 = new p56.a(new q6i.f(mVar3.f277845a, fVar3.f277785a));
                        n7i.b0 b0Var = new n7i.b0();
                        q6i.i0 i0Var = new q6i.i0();
                        q6i.c0 c0Var2 = new q6i.c0(((zc6.a) lVar5.k).c());
                        q6i.d dVar4 = new q6i.d(new q7i.a(), (ldd.b) fVar3.f277794p.get());
                        q6i.j0 j0Var2 = (q6i.j0) lVar3.Y.f.get();
                        vc.s.j(j0Var2);
                        return new b6i.q0(moveAmountScreenContract$InputData3, xVar2, gVar2, aVar27, b0Var, i0Var, c0Var2, dVar4, j0Var2);
                    default:
                        throw new AssertionError(i2);
                }
            case 12:
                u7i.m mVar4 = (u7i.m) obj3;
                u7i.l lVar6 = (u7i.l) obj4;
                u7i.n nVar5 = (u7i.n) obj2;
                switch (i2) {
                    case 0:
                        return n57.a.z(lVar6.f277839r.c(), (mga.i0) nVar5.f.get(), (mga.f0) nVar5.f277860h.get(), (on.a) nVar5.i.get());
                    case 1:
                        yji.o controller = (com.revolut.kompot.navigable.a) nVar5.e.get();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        mga.i0 i0Var2 = (mga.i0) controller;
                        vc.s.k(i0Var2);
                        return i0Var2;
                    case 2:
                        return nga.c.t(nVar5.f277856a, lVar6.f277839r.c(), (wn.a) nVar5.f277859g.get());
                    case 3:
                        return v7.z(lVar6.f277821a0, "provider");
                    case 4:
                        os2.g factory3 = lVar6.f277821a0.c();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return (sn.a) factory3.f229224b;
                    case 5:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) nVar5.e.get();
                        i8i.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        MoveMoneyReviewScreen moveMoneyReviewScreen = (MoveMoneyReviewScreen) controller2;
                        vc.s.k(moveMoneyReviewScreen);
                        return moveMoneyReviewScreen;
                    case 6:
                        return new l8i.g();
                    case 7:
                        wn.a aVar28 = (wn.a) nVar5.f277859g.get();
                        n57.a.c(aVar28);
                        return aVar28;
                    case 8:
                        a3 a3Var = lVar6.f277823b0;
                        vt4.h mapper = new vt4.h();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        return new zrf.m(mapper);
                    case 9:
                        zrf.m transferInstalmentSelectionSectionProvider = (zrf.m) nVar5.f277864n.get();
                        yrf.a sectionDialogMapper = (yrf.a) nVar5.o.get();
                        Intrinsics.checkNotNullParameter(transferInstalmentSelectionSectionProvider, "transferInstalmentSelectionSectionProvider");
                        Intrinsics.checkNotNullParameter(sectionDialogMapper, "sectionDialogMapper");
                        return new zrf.c(transferInstalmentSelectionSectionProvider, sectionDialogMapper);
                    case 10:
                        return new yrf.a();
                    case 11:
                        return nga.c.a((n5k.q) nVar5.f277866q.get());
                    case 12:
                        return new n5k.r(new RateExplanationDialogMapper());
                    case 13:
                        MoveMoneyInputData moveMoneyInputData4 = mVar4.f277845a;
                        w5i.d dVarD4 = lVar6.z.d();
                        vc.s.j(dVarD4);
                        ang.f fVarE = lVar6.f277828h.e();
                        zof.f fVarD2 = lVar6.A.d();
                        vc.s.j(fVarD2);
                        t1 t1VarC = lVar6.f277833m.c();
                        h8i.e eVar6 = (h8i.e) lVar6.Y.e.get();
                        vc.s.j(eVar6);
                        return new g8i.e0(moveMoneyInputData4, dVarD4, fVarE, fVarD2, t1VarC, eVar6, lVar6.c0.b(), nVar5.f277857b, mVar4.c(), new g8i.d(), (vrf.h) nVar5.f277868s.get(), new f61.a((vrf.h) nVar5.f277868s.get(), new h8i.f()), new q7i.a(), (n5k.q) nVar5.f277866q.get(), (jki.p) nVar5.f277869t.get());
                    case 14:
                        zrf.m instalmentSelectionSectionProvider = (zrf.m) nVar5.f277864n.get();
                        zrf.c monthlyRepaymentSectionProvider = (zrf.c) nVar5.f277865p.get();
                        Intrinsics.checkNotNullParameter(instalmentSelectionSectionProvider, "instalmentSelectionSectionProvider");
                        Intrinsics.checkNotNullParameter(monthlyRepaymentSectionProvider, "monthlyRepaymentSectionProvider");
                        List listK = zhm.v.k(instalmentSelectionSectionProvider, monthlyRepaymentSectionProvider);
                        vc.s.k(listK);
                        List providers = listK;
                        Intrinsics.checkNotNullParameter(providers, "providers");
                        return new xrf.b(providers);
                    case 15:
                        u7i.m mVar5 = nVar5.d;
                        u7i.l lVar7 = nVar5.f277858c;
                        m8i.b bVar18 = new m8i.b(mVar5.f277845a);
                        k8i.b bVar19 = new k8i.b(lVar7.f277833m.b(), new k8i.a());
                        g8i.d dVar5 = new g8i.d();
                        vrf.h hVar4 = (vrf.h) nVar5.f277868s.get();
                        gte.a aVarB8 = lVar6.f277844y.f275661b.b();
                        vc.s.j(aVarB8);
                        d0i.m mVar6 = new d0i.m(aVarB8);
                        n7i.a0 moveMoneyCreditCardLocalizationProvider = new n7i.a0();
                        Intrinsics.checkNotNullParameter(moveMoneyCreditCardLocalizationProvider, "moveMoneyCreditCardLocalizationProvider");
                        h8i.a creditCardMoveMoneyExplainerDelegate = new h8i.a();
                        Intrinsics.checkNotNullParameter(creditCardMoveMoneyExplainerDelegate, "creditCardMoveMoneyExplainerDelegate");
                        r39.a aVar29 = new r39.a();
                        g8i.f fVar7 = new g8i.f();
                        yof.k kVarG = lVar7.A.g();
                        vc.s.j(kVarG);
                        g8i.g gVar3 = new g8i.g(kVarG, new g8i.c());
                        q7i.a noteDelegate = new q7i.a();
                        Intrinsics.checkNotNullParameter(noteDelegate, "noteDelegate");
                        m8i.d dVar6 = new m8i.d();
                        gte.a aVarB9 = lVar6.f277844y.f275661b.b();
                        vc.s.j(aVarB9);
                        return new g8i.g0(bVar18, bVar19, dVar5, hVar4, mVar6, aVar29, fVar7, gVar3, dVar6, new d0i.b(aVarB9));
                    default:
                        throw new AssertionError(i2);
                }
            case 13:
                return a();
            case 14:
                return b();
            case 15:
                ufg.g gVar4 = (ufg.g) obj4;
                if (i2 == 0) {
                    return new nig.g((cli.n) ((ufg.w) obj2).f279800a.get(), (gfg.c) gVar4.P.get(), (dgg.c) ((ufg.r) obj3).d.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                fub.k kVarD = gVar4.k.d();
                vc.s.j(kVarD);
                return new nig.h(kVarD);
            case 16:
                us6.q qVar2 = (us6.q) obj4;
                if (i2 == 0) {
                    return new hz6.k((cli.n) ((us6.r) obj2).f282727a.get(), (y1) qVar2.f282701r0.get(), (oz6.a) ((us6.d0) obj3).f.get());
                }
                if (i2 == 1) {
                    return new hz6.m(qVar2.o.g());
                }
                throw new AssertionError(i2);
            case 17:
                return c();
            case 18:
                return d();
            case 19:
                return e();
            case 20:
                return f();
            case 21:
                return g();
            case 22:
                return h();
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                whc.s sVar3 = (whc.s) obj4;
                whc.n nVar6 = (whc.n) obj3;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    bkc.e factory4 = new bkc.e();
                    nic.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    return new bkc.f();
                }
                PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = nVar6.f297546a;
                bgc.e eVar7 = (bgc.e) sVar3.u.get();
                gic.a aVar30 = new gic.a(new hic.a());
                PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData2 = nVar6.f297546a;
                whc.s sVar4 = nVar6.f297548c;
                twg.c cVar7 = new twg.c(perkDetailsFlowContract$InputData2, (bgc.e) sVar4.u.get(), new gic.a(new hic.a()), sVar4.f.e());
                h4g.g gVarB = sVar3.k.b();
                whc.o oVar3 = (whc.o) obj2;
                oic.e eVar8 = new oic.e();
                whc.s sVar5 = oVar3.f297556a;
                return new mic.g0(perkDetailsFlowContract$InputData, eVar7, aVar30, cVar7, gVarB, new mic.h0(new oic.h(eVar8, new sic.d(new sic.b()), new onh.b(new sic.d(new sic.b()), sVar5.e()), new oic.j((kgc.b) sVar5.A.get()), new pic.f(sVar5.f(), new pic.b()), new hic.c(), new oic.i(new hic.b(), oVar3.f297557b.f297548c.f297571h.g()), sVar5.d(), new sic.a())));
        }
    }
}
