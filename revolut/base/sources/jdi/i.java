package jdi;

import android.text.InputFilter;
import c84.w;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreenContract$InputData;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesControllerContract$InputData;
import com.revolut.feature.defi.accounts.api.DeFiAccountsApi$Toggles$CryptoDeFiAccount;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.services.TransactionRecogniserService;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlowContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import cu8.r0;
import eu4.d0;
import fmc.z;
import java.time.Clock;
import java.util.Optional;
import java.util.Set;
import jm4.a0;
import jm4.a3;
import jm4.e0;
import jm4.e1;
import jm4.j0;
import jm4.m0;
import jm4.q0;
import jm4.s0;
import jm4.u0;
import jm4.x0;
import kotlin.jvm.internal.Intrinsics;
import mq4.x;
import om4.e3;
import om4.g3;
import om4.h3;
import om4.k0;
import om4.n4;
import retrofit2.Retrofit;
import rp0.l0;
import tnb.g0;
import wp5.y;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f173102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f173103c;
    public final Object d;

    public /* synthetic */ i(Object obj2, Object obj3, int i, int i2) {
        this.f173101a = i2;
        this.f173102b = obj2;
        this.d = obj3;
        this.f173103c = i;
    }

    private final Object a() {
        jje.c cVar = (jje.c) this.f173102b;
        jje.h hVar = (jje.h) this.d;
        int i = this.f173103c;
        switch (i) {
            case 0:
                ev5.d factory = ((ku5.f) cVar.N).d();
                vc.s.j(factory);
                pt5.s viewDelegate = (pt5.s) hVar.f174893n.get();
                qt5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                return new w(viewDelegate);
            case 1:
                ev5.d dVarD = ((ku5.f) cVar.N).d();
                vc.s.j(dVarD);
                ev5.d factory2 = ((ku5.f) hVar.f174890j.N).d();
                vc.s.j(factory2);
                Optional transactionsFilterProvider = Optional.empty();
                qt5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
                return qt5.b.a(dVarD, factory2.a((pt5.t) gj7.b.m(transactionsFilterProvider)), (pt5.r) hVar.f174891l.get(), (pt5.m) hVar.f174892m.get());
            case 2:
                BaseScreen screen = hVar.f174885a;
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                CryptoPortfolioScreen cryptoPortfolioScreen = (CryptoPortfolioScreen) screen;
                vc.s.k(cryptoPortfolioScreen);
                return cryptoPortfolioScreen;
            case 3:
                ev5.d dVarD2 = ((ku5.f) cVar.N).d();
                vc.s.j(dVarD2);
                return qt5.c.a(dVarD2, Optional.empty(), Optional.empty());
            case 4:
                return ci5.b.a(cVar.O.a(), hVar.f174886b, (bi5.a) hVar.f174894p.get());
            case 5:
                smd.s factory3 = cVar.O.a();
                ci5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return new si5.b((ji5.i) factory3.f264432a, (xh5.a) factory3.f264433b);
            case 6:
                return kxa.j.l((j60.a) hVar.f174898t.get());
            case 7:
                return h30.l.p((com.revolut.kompot.navigable.a) hVar.f174896r.get(), (rp0.m) hVar.f174897s.get());
            case 8:
                return new rp0.m();
            case 9:
                return obk.d.C(((rs5.c) cVar.H).k(), hVar.f174887c, (pr5.a) hVar.v.get());
            case 10:
                fn2.c factory4 = ((rs5.c) cVar.H).k();
                oje.k.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return new fs5.b((fnc.s) factory4.f136517b);
            case 11:
                return obk.d.B(((rs5.c) cVar.H).j(), hVar.d, (qr5.a) hVar.f174900x.get());
            case 12:
                z factory5 = ((rs5.c) cVar.H).j();
                oje.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return new hs5.b((j5c.a) factory5.f136369b);
            case 13:
                ku5.j api2 = (ku5.j) hVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api2, "api");
                return api2.a();
            case 14:
                hd.r rVarH = cVar.f174841q.h();
                ut5.l lVar = hVar.e;
                nw5.j jVarD = cVar.P.d();
                vc.s.j(jVarD);
                return obk.d.s(rVarH, lVar, jVarD, (l0) hVar.z.get(), (j60.a) hVar.f174898t.get(), new jx0.a((pr5.a) hVar.v.get(), hVar.f174890j.d(), new vr5.a()));
            case 15:
                BaseScreen screen2 = hVar.f174885a;
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen2, "screen");
                return new l0(screen2.m2());
            case 16:
                rr5.c cVar2 = hVar.f;
                ash.j jVar = hVar.f174888g;
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) hVar.f174896r.get();
                p56.a factory6 = new p56.a(((rs5.c) cVar.H).D, 18);
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return rga.l.z(cVar2, jVar, aVar, new os2.g(factory6, 17));
            case 17:
                ku5.j api3 = (ku5.j) hVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api3, "api");
                Set set = (Set) api3.f189714s.get();
                vc.s.k(set);
                return set;
            case 18:
                return oje.e.a(cVar.Q.a(), hVar.f174889h);
            case 19:
                w9j.a factory7 = cVar.R.a();
                vc.s.j(factory7);
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                return new w9j.b();
            case 20:
                mkd.g view = hVar.i;
                rkd.m factory8 = cVar.S.a();
                vc.s.j(factory8);
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory8, "factory");
                return factory8.a(view);
            case 21:
                ku5.j api4 = (ku5.j) hVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api4, "api");
                ut5.i iVar = (ut5.i) api4.f189713r.get();
                vc.s.k(iVar);
                return iVar;
            case 22:
                ku5.j api5 = (ku5.j) hVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api5, "api");
                return api5.b();
            case 23:
                ku5.j api6 = (ku5.j) hVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api6, "api");
                return api6.f189705g;
            case 24:
                jki.p pVar = (jki.p) hVar.M.get();
                ut5.e eVar = (ut5.e) hVar.I.get();
                v9j.a aVar2 = (v9j.a) hVar.F.get();
                w9j.e eVarB = cVar.R.b();
                vc.s.j(eVarB);
                mkd.d dVar = (mkd.d) hVar.G.get();
                bi5.a aVar3 = (bi5.a) hVar.f174894p.get();
                rr5.b modelExtensionHolder = (rr5.b) hVar.C.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder, "modelExtensionHolder");
                nsh.o oVar = modelExtensionHolder.f256694a;
                jr5.a aVar4 = (jr5.a) cVar.I.f218531b.get();
                vc.s.j(aVar4);
                xh5.a aVarA = cVar.f174833h.a();
                vc.s.j(aVarA);
                return new nje.n(pVar, eVar, aVar2, eVarB, dVar, aVar3, oVar, aVar4, aVarA, (qje.c) cVar.l0.get(), (qje.d) cVar.f174836k0.get());
            case 25:
                bbj.c cVarA = cVar.T.a();
                vc.s.j(cVarA);
                return new nje.o(cVarA, new pje.a(), (bi5.b) hVar.K.get(), new nje.q((Clock) hVar.L.get()), new iv5.a());
            case 26:
                smd.s factory9 = cVar.O.a();
                ci5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory9, "factory");
                return new si5.d();
            case 27:
                return oje.d.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        jje.c cVar = (jje.c) this.f173102b;
        jje.i iVar = (jje.i) this.d;
        int i = this.f173103c;
        switch (i) {
            case 0:
                ev5.d factory = ((ku5.f) cVar.N).d();
                vc.s.j(factory);
                pt5.s viewDelegate = (pt5.s) iVar.f174910n.get();
                qt5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                return new w(viewDelegate);
            case 1:
                ev5.d dVarD = ((ku5.f) cVar.N).d();
                vc.s.j(dVarD);
                ev5.d factory2 = ((ku5.f) iVar.f174907j.N).d();
                vc.s.j(factory2);
                Optional transactionsFilterProvider = Optional.empty();
                qt5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
                return qt5.b.a(dVarD, factory2.a((pt5.t) gj7.b.m(transactionsFilterProvider)), (pt5.r) iVar.f174908l.get(), (pt5.m) iVar.f174909m.get());
            case 2:
                BaseScreen screen = iVar.f174902a;
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                CryptoPortfolioScreen cryptoPortfolioScreen = (CryptoPortfolioScreen) screen;
                vc.s.k(cryptoPortfolioScreen);
                return cryptoPortfolioScreen;
            case 3:
                ev5.d dVarD2 = ((ku5.f) cVar.N).d();
                vc.s.j(dVarD2);
                return qt5.c.a(dVarD2, Optional.empty(), Optional.empty());
            case 4:
                return ci5.b.a(cVar.O.a(), iVar.f174903b, (bi5.a) iVar.f174911p.get());
            case 5:
                smd.s factory3 = cVar.O.a();
                ci5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return new si5.b((ji5.i) factory3.f264432a, (xh5.a) factory3.f264433b);
            case 6:
                return kxa.j.l((j60.a) iVar.f174915t.get());
            case 7:
                return h30.l.p((com.revolut.kompot.navigable.a) iVar.f174913r.get(), (rp0.m) iVar.f174914s.get());
            case 8:
                return new rp0.m();
            case 9:
                return obk.d.C(((rs5.c) cVar.H).k(), iVar.f174904c, (pr5.a) iVar.v.get());
            case 10:
                fn2.c factory4 = ((rs5.c) cVar.H).k();
                oje.k.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return new fs5.b((fnc.s) factory4.f136517b);
            case 11:
                return obk.d.B(((rs5.c) cVar.H).j(), iVar.d, (qr5.a) iVar.f174917x.get());
            case 12:
                z factory5 = ((rs5.c) cVar.H).j();
                oje.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return new hs5.b((j5c.a) factory5.f136369b);
            case 13:
                ku5.j api2 = (ku5.j) iVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api2, "api");
                return api2.a();
            case 14:
                hd.r rVarH = cVar.f174841q.h();
                ut5.l lVar = iVar.e;
                nw5.j jVarD = cVar.P.d();
                vc.s.j(jVarD);
                return obk.d.s(rVarH, lVar, jVarD, (l0) iVar.z.get(), (j60.a) iVar.f174915t.get(), new jx0.a((pr5.a) iVar.v.get(), iVar.f174907j.d(), new vr5.a()));
            case 15:
                BaseScreen screen2 = iVar.f174902a;
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen2, "screen");
                return new l0(screen2.m2());
            case 16:
                rr5.c cVar2 = iVar.f;
                ash.j jVar = iVar.f174905g;
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) iVar.f174913r.get();
                p56.a factory6 = new p56.a(((rs5.c) cVar.H).D, 18);
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return rga.l.z(cVar2, jVar, aVar, new os2.g(factory6, 17));
            case 17:
                ku5.j api3 = (ku5.j) iVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api3, "api");
                Set set = (Set) api3.f189714s.get();
                vc.s.k(set);
                return set;
            case 18:
                return oje.e.a(cVar.Q.a(), iVar.f174906h);
            case 19:
                w9j.a factory7 = cVar.R.a();
                vc.s.j(factory7);
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                return new w9j.b();
            case 20:
                mkd.g view = iVar.i;
                rkd.m factory8 = cVar.S.a();
                vc.s.j(factory8);
                oje.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory8, "factory");
                return factory8.a(view);
            case 21:
                ku5.j api4 = (ku5.j) iVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api4, "api");
                ut5.i iVar2 = (ut5.i) api4.f189713r.get();
                vc.s.k(iVar2);
                return iVar2;
            case 22:
                ku5.j api5 = (ku5.j) iVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api5, "api");
                return api5.b();
            case 23:
                ku5.j api6 = (ku5.j) iVar.A.get();
                oje.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(api6, "api");
                return api6.f189705g;
            case 24:
                jki.p pVar = (jki.p) iVar.M.get();
                ut5.e eVar = (ut5.e) iVar.I.get();
                v9j.a aVar2 = (v9j.a) iVar.F.get();
                w9j.e eVarB = cVar.R.b();
                vc.s.j(eVarB);
                mkd.d dVar = (mkd.d) iVar.G.get();
                bi5.a aVar3 = (bi5.a) iVar.f174911p.get();
                rr5.b modelExtensionHolder = (rr5.b) iVar.C.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder, "modelExtensionHolder");
                nsh.o oVar = modelExtensionHolder.f256694a;
                jr5.a aVar4 = (jr5.a) cVar.I.f218531b.get();
                vc.s.j(aVar4);
                xh5.a aVarA = cVar.f174833h.a();
                vc.s.j(aVarA);
                return new nje.n(pVar, eVar, aVar2, eVarB, dVar, aVar3, oVar, aVar4, aVarA, (qje.c) cVar.l0.get(), (qje.d) cVar.f174836k0.get());
            case 25:
                bbj.c cVarA = cVar.T.a();
                vc.s.j(cVarA);
                return new nje.o(cVarA, new pje.a(), (bi5.b) iVar.K.get(), new nje.q((Clock) iVar.L.get()), new iv5.a());
            case 26:
                smd.s factory9 = cVar.O.a();
                ci5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory9, "factory");
                return new si5.d();
            case 27:
                return oje.d.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        a3 a3Var = (a3) this.f173102b;
        jm4.r rVar = a3Var.f175965b;
        e0 e0Var = (e0) this.d;
        CollateralMoveMoneyScreenContract$InputData collateralMoveMoneyScreenContract$InputData = e0Var.f176044a;
        a3 a3Var2 = e0Var.f176045b;
        int i = this.f173103c;
        if (i == 0) {
            return kxa.j.k((j60.a) e0Var.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) e0Var.f176046c.get(), (rp0.m) e0Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            wsg.n nVarB = a3Var.o.b();
            j60.a aVar = (j60.a) e0Var.e.get();
            n4 n4Var = (n4) rVar.D.get();
            vc.s.j(n4Var);
            al4.q qVarA = rVar.a();
            wj0.a aVarI = ((nj0.d) a3Var.M).i();
            vc.s.j(aVarI);
            mq4.k kVar = new mq4.k();
            qd0.b bVarN = a3Var2.k.n();
            vc.s.j(bVarN);
            return new x(nVarB, aVar, n4Var, qVarA, aVarI, kVar, new ow4.a(bVarN, 0), collateralMoveMoneyScreenContract$InputData, (cli.n) e0Var.f176048h.get());
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(i);
            }
            nq4.b.Companion.getClass();
            return new mp0.d(11);
        }
        u80.o oVar = new u80.o();
        InputFilter inputFilter = (InputFilter) e0Var.f176047g.get();
        je6.h hVarC = ((xf6.t) a3Var2.f175977n).c();
        vc.s.j(hVarC);
        oq4.f fVar = new oq4.f(oVar, inputFilter, hVarC, new oq4.d(), new oq4.j());
        qd0.b bVarN2 = a3Var2.k.n();
        vc.s.j(bVarN2);
        return new mq4.o(collateralMoveMoneyScreenContract$InputData, fVar, new oq4.b(new u80.m(bVarN2)), new oq4.h());
    }

    private final Object d() {
        j0 j0Var = (j0) this.d;
        a3 a3Var = (a3) this.f173102b;
        pb5.a aVar = a3Var.d;
        int i = this.f173103c;
        if (i == 0) {
            return kxa.j.m((j60.a) j0Var.f.get());
        }
        if (i == 1) {
            return y.r((com.revolut.kompot.navigable.a) j0Var.d.get(), (rp0.m) j0Var.e.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new om4.q();
            }
            if (i != 5) {
                throw new AssertionError(i);
            }
            n3i.b bVarA = a3Var.v.a();
            lb5.b bVarA2 = aVar.a();
            vc.s.j(bVarA2);
            return new om4.p(bVarA, bVarA2, (ck4.b) j0Var.i.get(), a3Var.f.e());
        }
        CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData = j0Var.f176143a;
        lb5.b bVarA3 = aVar.a();
        vc.s.j(bVarA3);
        al4.n nVarS = a3Var.f175965b.s();
        vc.s.j(nVarS);
        zwc.a aVar2 = (zwc.a) a3Var.f175986t.f.get();
        vc.s.j(aVar2);
        vt4.b bVar = new vt4.b();
        vp4.a aVar3 = new vp4.a();
        sf0.h hVarB = a3Var.f175984s.b();
        vc.s.j(hVarB);
        i1j.a aVar4 = (i1j.a) a3Var.f175968d0.get();
        j60.a aVar5 = (j60.a) j0Var.f.get();
        vj4.a aVar6 = (vj4.a) a3Var.u.f314413g.get();
        vc.s.j(aVar6);
        return new com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a(creditCardAutopaySettingsFlowContract$InputData, bVarA3, nVarS, aVar2, bVar, aVar3, hVarB, aVar4, aVar5, aVar6);
    }

    private final Object e() {
        m0 m0Var = (m0) this.d;
        a3 a3Var = (a3) this.f173102b;
        l70.e eVar = a3Var.k;
        int i = this.f173103c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            w80.b bVarJ = eVar.j();
            vc.s.j(bVarJ);
            return new bu4.o(bVarJ, new du4.a());
        }
        CreditCardBoletoPaymentAmountContract$InputData creditCardBoletoPaymentAmountContract$InputData = m0Var.f176193a;
        om4.w wVar = (om4.w) a3Var.f175965b.E.get();
        vc.s.j(wVar);
        w80.b bVarJ2 = eVar.j();
        vc.s.j(bVarJ2);
        wj0.a aVarI = ((nj0.d) a3Var.M).i();
        vc.s.j(aVarI);
        return new bu4.m(creditCardBoletoPaymentAmountContract$InputData, wVar, bVarJ2, aVarI, (cli.n) m0Var.f176195c.get());
    }

    private final Object f() {
        a3 a3Var = (a3) this.f173102b;
        q0 q0Var = (q0) this.d;
        a3 a3Var2 = q0Var.f176261c;
        int i = this.f173103c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) q0Var.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) q0Var.d.get(), (rp0.m) q0Var.e.get());
            case 2:
                return new rp0.m();
            case 3:
                ssi.m extension = (ssi.m) q0Var.i.get();
                kq4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                oqk.l transactionsWidgetActionExtensionProvider = a3Var.N.b();
                vc.s.j(transactionsWidgetActionExtensionProvider);
                j60.a bottomDialogExtension = (j60.a) q0Var.f.get();
                l0 popupMenuDialogDisplayer = (l0) q0Var.f176263h.get();
                kq4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                return transactionsWidgetActionExtensionProvider.a(bottomDialogExtension, popupMenuDialogDisplayer);
            case 5:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) q0Var.d.get();
                kq4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new l0(controller.m2());
            case 6:
                mkd.g view = q0Var.f176259a;
                rkd.m factory = a3Var.O.a();
                vc.s.j(factory);
                kq4.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(view);
            case 7:
                CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData = q0Var.f176260b;
                al4.n nVarS = a3Var.f175965b.s();
                vc.s.j(nVarS);
                whf.b bVarA = a3Var.f175971h.a();
                vc.s.j(bVarA);
                an4.e eVar = new an4.e(((eyd.b) a3Var2.F).c());
                lq4.g gVar = new lq4.g();
                j60.a aVar = (j60.a) q0Var.f.get();
                mkd.d dVar = (mkd.d) q0Var.k.get();
                ssi.m mVar = (ssi.m) q0Var.i.get();
                lq4.c cVar = new lq4.c();
                lq4.b bVar = new lq4.b();
                lq4.f fVar = new lq4.f();
                whf.n nVarB = a3Var2.f175971h.b();
                vc.s.j(nVarB);
                return new jq4.n(creditCardCashbackDetailsScreenContract$InputData, nVarS, bVarA, eVar, gVar, aVar, dVar, mVar, new jq4.p(cVar, new lq4.e(bVar, fVar, nVarB)));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        s0 s0Var = (s0) this.d;
        a3 a3Var = (a3) this.f173102b;
        jm4.r rVar = a3Var.f175965b;
        int i = this.f173103c;
        if (i != 0) {
            if (i == 1) {
                return new d0();
            }
            throw new AssertionError(i);
        }
        CreditCardChoosePaymentsScreenContract$InputData creditCardChoosePaymentsScreenContract$InputData = s0Var.f176346a;
        al4.n nVarS = rVar.s();
        vc.s.j(nVarS);
        ang.f fVarE = a3Var.f.e();
        om4.w wVar = (om4.w) rVar.E.get();
        vc.s.j(wVar);
        al4.m mVarR = rVar.r();
        vc.s.j(mVarR);
        return new com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a(creditCardChoosePaymentsScreenContract$InputData, nVarS, fVarE, wVar, mVarR, a3Var.o.a(), (cli.n) s0Var.f176347b.get());
    }

    private final Object h() {
        u0 u0Var = (u0) this.d;
        a3 a3Var = u0Var.f176375b;
        a3 a3Var2 = (a3) this.f173102b;
        jm4.r rVar = a3Var2.f175965b;
        int i = this.f173103c;
        switch (i) {
            case 0:
                Object extension = (f15.a) u0Var.f176376c.get();
                cr4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 1:
                j15.e provider = a3Var2.C.a();
                vc.s.j(provider);
                cr4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider.a();
            case 2:
                CreditCardDetailsScreenContract$InputData creditCardDetailsScreenContract$InputData = u0Var.f176374a;
                al4.n nVarS = rVar.s();
                vc.s.j(nVarS);
                e3 e3Var = (e3) a3Var2.l0.get();
                al4.q qVarA = rVar.a();
                mt8.d dVarB = a3Var2.D.b();
                vc.s.j(dVarB);
                ang.f fVarE = a3Var2.f.e();
                xq3.t tVar = (xq3.t) a3Var2.E.F.get();
                vc.s.j(tVar);
                an4.e eVar = new an4.e(((eyd.b) a3Var.F).c());
                pm4.e eVar2 = new pm4.e(new bp4.i());
                f15.a aVar = (f15.a) u0Var.f176376c.get();
                ra5.b bVar = (ra5.b) a3Var2.G.f223537p.get();
                vc.s.j(bVar);
                gte.a aVarB = a3Var2.f175982r.b();
                vc.s.j(aVarB);
                h3 h3VarB = a3Var2.H.b();
                vc.s.j(h3VarB);
                al4.p pVarI = rVar.i();
                al4.o oVar = (al4.o) a3Var2.m0.get();
                lt4.d dVar = new lt4.d();
                lal.a creditCardInfoSectionsInteractor = u0Var.c();
                nr4.b creditCardDisplayAmountToggleInteractor = u0Var.b();
                egk.e pricingPlansUiInteractor = a3Var.K.e();
                vc.s.j(pricingPlansUiInteractor);
                ffk.t pricingPlanInteractor = a3Var.i.f();
                vc.s.j(pricingPlanInteractor);
                al4.q creditCardProductInteractor = a3Var.f175965b.a();
                dnk.l infoSectionsSubtitleMapper = new dnk.l(a3Var.f175976m.g(), 1);
                er4.i creditCardInfoSectionsBadgeMapper = new er4.i();
                Intrinsics.checkNotNullParameter(creditCardInfoSectionsInteractor, "creditCardInfoSectionsInteractor");
                Intrinsics.checkNotNullParameter(creditCardDisplayAmountToggleInteractor, "creditCardDisplayAmountToggleInteractor");
                Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
                Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
                Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
                Intrinsics.checkNotNullParameter(infoSectionsSubtitleMapper, "infoSectionsSubtitleMapper");
                Intrinsics.checkNotNullParameter(creditCardInfoSectionsBadgeMapper, "creditCardInfoSectionsBadgeMapper");
                b9k.f fVar = new b9k.f();
                fVar.f13817b = creditCardInfoSectionsInteractor;
                fVar.f13816a = creditCardDisplayAmountToggleInteractor;
                fVar.f13818c = pricingPlansUiInteractor;
                fVar.d = pricingPlanInteractor;
                fVar.e = creditCardProductInteractor;
                fVar.f = infoSectionsSubtitleMapper;
                fVar.f13819g = creditCardInfoSectionsBadgeMapper;
                lal.a aVarC = u0Var.c();
                nr4.b bVarB = u0Var.b();
                ajk.f fVarH = a3Var2.K.h();
                vt4.a aVar2 = new vt4.a();
                lb5.b bVarA = a3Var2.d.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.credit.card.impl.ui.details.a(creditCardDetailsScreenContract$InputData, nVarS, e3Var, qVarA, dVarB, fVarE, tVar, eVar, eVar2, aVar, bVar, aVarB, h3VarB, pVarI, oVar, dVar, fVar, aVarC, bVarB, fVarH, aVar2, bVarA, (cli.n) u0Var.f176379j.get());
            case 3:
                fr4.d dVar2 = (fr4.d) u0Var.e.get();
                fr4.e eVar3 = (fr4.e) u0Var.f.get();
                fr4.g gVar = (fr4.g) u0Var.f176377g.get();
                m93.g gVarI = a3Var.e.i();
                vc.s.j(gVarI);
                return new br4.m0(dVar2, eVar3, gVar, new rm4.c(gVarI), (fr4.b) u0Var.f176378h.get(), new er4.k(), (fr4.h) u0Var.i.get(), a3Var2.L.b(), new er4.a());
            case 4:
                return new er4.c();
            case 5:
                return new er4.d();
            case 6:
                return new er4.f(a3Var2.f175976m.g());
            case 7:
                return new er4.b();
            case 8:
                return new er4.g();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        l70.e eVar = ((a3) this.f173102b).k;
        int i = this.f173103c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            w80.b bVarJ = eVar.j();
            vc.s.j(bVarJ);
            return new fw4.m(new u80.o(), bVarJ);
        }
        x0 x0Var = (x0) this.d;
        CreditCardDownPaymentScreenContract$InputData creditCardDownPaymentScreenContract$InputData = x0Var.f176429a;
        cli.n nVar = (cli.n) x0Var.f176431c.get();
        w80.b bVarJ2 = eVar.j();
        vc.s.j(bVarJ2);
        return new fw4.j(creditCardDownPaymentScreenContract$InputData, nVar, bVarJ2);
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        Object uVar;
        Object vVar;
        Object fVar;
        Object dVar;
        Set setB;
        switch (this.f173101a) {
            case 0:
                c cVar = (c) this.f173102b;
                j jVar = (j) this.d;
                int i = this.f173103c;
                if (i == 0) {
                    return kxa.j.k((j60.a) jVar.e.get());
                }
                if (i == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) jVar.f173106c.get(), (rp0.m) jVar.d.get());
                }
                if (i == 2) {
                    return new rp0.m();
                }
                if (i != 3) {
                    if (i == 4) {
                        return new xdi.w(jVar.f173105b, new zdi.d(), new zdi.f(), new zdi.e());
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) jVar.f173107g.get();
                RevPointsPocketOnboardingScreenContract$InputData revPointsPocketOnboardingScreenContract$InputData = jVar.f173105b;
                ldi.f fVarA = cVar.f173080b.a();
                vc.s.j(fVarA);
                ffk.t tVarF = cVar.d.f();
                vc.s.j(tVarF);
                mre.c cVarB = cVar.e.b();
                vc.s.j(cVarB);
                jgk.v vVarD = cVar.f.d();
                vc.s.j(vVarD);
                return new xdi.u(nVar, revPointsPocketOnboardingScreenContract$InputData, fVarA, tVarF, cVarB, vVarD, new zdi.c(), new zdi.a(), (j60.a) jVar.e.get());
            case 1:
                c cVar2 = (c) this.f173102b;
                j jVar2 = (j) this.d;
                int i2 = this.f173103c;
                if (i2 == 0) {
                    return kxa.j.k((j60.a) jVar2.e.get());
                }
                if (i2 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) jVar2.f173106c.get(), (rp0.m) jVar2.d.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new xdi.w(jVar2.f173105b, new zdi.d(), new zdi.f(), new zdi.e());
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar2 = (cli.n) jVar2.f173107g.get();
                RevPointsPocketOnboardingScreenContract$InputData revPointsPocketOnboardingScreenContract$InputData2 = jVar2.f173105b;
                ldi.f fVarA2 = cVar2.f173080b.a();
                vc.s.j(fVarA2);
                ffk.t tVarF2 = cVar2.d.f();
                vc.s.j(tVarF2);
                mre.c cVarB2 = cVar2.e.b();
                vc.s.j(cVarB2);
                jgk.v vVarD2 = cVar2.f.d();
                vc.s.j(vVarD2);
                return new xdi.u(nVar2, revPointsPocketOnboardingScreenContract$InputData2, fVarA2, tVarF2, cVarB2, vVarD2, new zdi.c(), new zdi.a(), (j60.a) jVar2.e.get());
            case 2:
                jef.a aVar = (jef.a) this.d;
                int i3 = this.f173103c;
                if (i3 == 0) {
                    return new sef.k((jki.p) aVar.f173361b.get(), aVar.f173360a, (kef.a) ((jef.g) this.f173102b).f173383h.get());
                }
                if (i3 == 1) {
                    return new sef.i();
                }
                throw new AssertionError(i3);
            case 3:
                jef.b bVar2 = (jef.b) this.d;
                jef.g gVar = (jef.g) this.f173102b;
                int i5 = this.f173103c;
                if (i5 == 0) {
                    return new uef.l((jki.p) bVar2.f173364b.get(), bVar2.f173363a, (kef.a) gVar.f173383h.get());
                }
                if (i5 == 1) {
                    return new uef.k((dff.a) gVar.f173384j.get());
                }
                throw new AssertionError(i5);
            case 4:
                jef.c cVar3 = (jef.c) this.d;
                jef.g gVar2 = (jef.g) this.f173102b;
                int i6 = this.f173103c;
                if (i6 == 0) {
                    return new yef.n((jki.p) cVar3.f173367b.get(), cVar3.f173366a, (eff.a) gVar2.i.get());
                }
                if (i6 == 1) {
                    return new yef.m((f01.a) gVar2.f173385l.get());
                }
                throw new AssertionError(i6);
            case 5:
                jef.d dVar2 = (jef.d) this.d;
                jef.g gVar3 = (jef.g) this.f173102b;
                int i21 = this.f173103c;
                if (i21 == 0) {
                    return new aff.n((jki.p) dVar2.f173370b.get(), dVar2.f173369a, (kef.a) gVar3.f173383h.get());
                }
                if (i21 == 1) {
                    return new aff.k((dff.a) gVar3.f173384j.get());
                }
                throw new AssertionError(i21);
            case 6:
                jef.e eVar = (jef.e) this.f173102b;
                jef.g gVar4 = (jef.g) this.d;
                int i22 = this.f173103c;
                switch (i22) {
                    case 0:
                        TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData = gVar4.f173379a;
                        hef.a aVarA = eVar.f173374c.a();
                        vc.s.j(aVarA);
                        bVar = new com.revolut.feature.transaction.recogniser.impl.ui.flow.b(transactionRecogniserFlowContract$InputData, aVarA);
                        break;
                    case 1:
                        return new kef.a((nef.d) gVar4.f173382g.get());
                    case 2:
                        TransactionRecogniserService transactionRecogniserService = (TransactionRecogniserService) gVar4.e.get();
                        ne0.j jVar3 = (ne0.j) gVar4.f.get();
                        ue0.c cVar4 = (ue0.c) eVar.f173375g.get();
                        oef.b bVar3 = new oef.b();
                        oef.a recogniserTransactionMapper = new oef.a();
                        Intrinsics.checkNotNullParameter(recogniserTransactionMapper, "recogniserTransactionMapper");
                        bVar = new nef.d(transactionRecogniserService, jVar3, cVar4, bVar3, new nd.o(), new nd.n(new oef.a()));
                        break;
                    case 3:
                        Retrofit retrofit = eVar.d;
                        ref.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(TransactionRecogniserService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        TransactionRecogniserService transactionRecogniserService2 = (TransactionRecogniserService) objCreate;
                        vc.s.k(transactionRecogniserService2);
                        return transactionRecogniserService2;
                    case 4:
                        ref.b.Companion.getClass();
                        return new ne0.d();
                    case 5:
                        return new eff.b();
                    case 6:
                        jsb.b bVar4 = (jsb.b) ((isb.a) eVar.e).f168170b.get();
                        vc.s.j(bVar4);
                        return new dff.b(bVar4);
                    case 7:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) gVar4.k.get();
                        ref.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new f01.c(controller.m2());
                    default:
                        throw new AssertionError(i22);
                }
                return bVar;
            case 7:
                jg5.g gVar5 = (jg5.g) this.f173102b;
                jg5.f fVar2 = (jg5.f) this.d;
                int i32 = this.f173103c;
                if (i32 == 0) {
                    return kxa.j.k((j60.a) fVar2.d.get());
                }
                if (i32 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) fVar2.f173919b.get(), (rp0.m) fVar2.f173920c.get());
                }
                if (i32 == 2) {
                    return new rp0.m();
                }
                if (i32 != 3) {
                    if (i32 != 4) {
                        throw new AssertionError(i32);
                    }
                    kg5.a cryptoExchangeFeesItemMapper = new kg5.a();
                    Intrinsics.checkNotNullParameter(cryptoExchangeFeesItemMapper, "cryptoExchangeFeesItemMapper");
                    return new lg5.j();
                }
                cli.n nVar3 = (cli.n) fVar2.f.get();
                CryptoFeaturesControllerContract$InputData cryptoFeaturesControllerContract$InputData = fVar2.f173918a;
                po5.a aVarD = ((yo5.w) gVar5.f173924c).d();
                vc.s.j(aVarD);
                g0 g0VarA = gVar5.d.a();
                mf5.c cVarA = gVar5.e.a();
                vc.s.j(cVarA);
                return new com.revolut.feature.crypto.features.impl.ui.features.a(nVar3, cryptoFeaturesControllerContract$InputData, aVarD, g0VarA, cVarA);
            case 8:
                jje.b bVar5 = (jje.b) this.d;
                jje.c cVar5 = (jje.c) this.f173102b;
                ei5.d dVar3 = cVar5.f174833h;
                vv5.e eVar2 = cVar5.f174838m;
                nl5.e eVar3 = cVar5.f174842r;
                int i33 = this.f173103c;
                if (i33 == 0) {
                    return kxa.j.k((j60.a) bVar5.e.get());
                }
                if (i33 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) bVar5.f174823c.get(), (rp0.m) bVar5.d.get());
                }
                if (i33 == 2) {
                    return new rp0.m();
                }
                if (i33 != 3) {
                    throw new AssertionError(i33);
                }
                wje.s sVar = new wje.s(new zl5.a((ul5.g) bVar5.f174822b.f174842r.f217024s.get()));
                CryptoSettingsScreenContract$InputData cryptoSettingsScreenContract$InputData = bVar5.f174821a;
                xv5.c cVarA2 = eVar2.a();
                vc.s.j(cVarA2);
                j60.a aVar2 = (j60.a) bVar5.e.get();
                xv5.g gVar6 = (xv5.g) eVar2.f292456h.get();
                vc.s.j(gVar6);
                tl5.b bVar6 = (tl5.b) eVar3.f217023r.get();
                vc.s.j(bVar6);
                jl5.a aVar3 = (jl5.a) eVar3.f217025t.get();
                vc.s.j(aVar3);
                i4b.f fVarA3 = eVar3.a();
                sl5.f fVar3 = (sl5.f) eVar3.z.get();
                vc.s.j(fVar3);
                xh5.a aVarA2 = dVar3.a();
                vc.s.j(aVarA2);
                toa.a aVarA3 = cVar5.o.a();
                vc.s.j(aVarA3);
                jla.h hVarA = cVar5.f174827b.a();
                ji5.i iVarC = dVar3.c();
                vc.s.j(iVarC);
                lje.b bVar7 = (lje.b) cVar5.f174831e0.get();
                gte.a aVarB = cVar5.f174832g.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.tab.crypto.impl.ui.settings.a(sVar, cryptoSettingsScreenContract$InputData, cVarA2, aVar2, gVar6, bVar6, aVar3, fVarA3, fVar3, aVarA2, aVarA3, hVarA, iVarC, bVar7, aVarB, cVar5.f174825a.c(), new iq6.a(), new hq6.a());
            case 9:
                jje.d dVar4 = (jje.d) this.d;
                jje.c cVar6 = (jje.c) this.f173102b;
                int i43 = this.f173103c;
                switch (i43) {
                    case 0:
                        return kxa.j.r((j60.a) dVar4.f.get());
                    case 1:
                        return kxa.j.p((com.revolut.kompot.navigable.a) dVar4.d.get(), (rp0.m) dVar4.e.get(), new j60.e());
                    case 2:
                        return new rp0.m();
                    case 3:
                        uVar = new qje.u((cli.n) dVar4.f174852h.get(), (bke.y) dVar4.f174856n.get(), (eke.h) dVar4.f174857p.get());
                        return uVar;
                    case 4:
                        jje.c cVar7 = dVar4.f174849b;
                        rje.e eVar4 = new rje.e(new wqi.a());
                        nd.n nVarE = cVar7.e();
                        pak.h hVar = new pak.h((vje.a) cVar7.i0.get());
                        gte.a aVarB2 = cVar7.f174832g.b();
                        vc.s.j(aVarB2);
                        uje.a aVar4 = new uje.a(eVar4, nVarE, hVar, aVarB2);
                        itb.c cVarB3 = cVar6.v.b();
                        vc.s.j(cVarB3);
                        vVar = new qje.v(aVar4, cVarB3);
                        return vVar;
                    case 5:
                        ku5.g gVar7 = cVar6.f174841q;
                        go5.c cVar8 = cVar6.f174845w;
                        vv5.e eVar5 = cVar6.f174838m;
                        ei5.d dVar5 = cVar6.f174833h;
                        gv5.d dVarG = gVar7.g();
                        xh5.a aVarA4 = dVar5.a();
                        vc.s.j(aVarA4);
                        qje.m mVar = (qje.m) dVar4.f174853j.get();
                        qje.n nVar4 = (qje.n) dVar4.k.get();
                        bn2.p pVarC = cVar6.f174840p.c();
                        gte.a aVarB3 = cVar6.f174832g.b();
                        vc.s.j(aVarB3);
                        rje.h hVar2 = (rje.h) dVar4.f174854l.get();
                        sh5.d dVarF = dVar5.f();
                        vc.s.j(dVarF);
                        wif.a aVarA5 = cVar6.z.a();
                        ji5.i iVarC2 = dVar5.c();
                        vc.s.j(iVarC2);
                        nwg.a factory = ((ewg.h) cVar6.A).a();
                        jje.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        kwg.l lVarA = factory.a(gwg.a.CRYPTO);
                        j60.a aVar5 = (j60.a) dVar4.f.get();
                        tje.a aVar6 = (tje.a) cVar6.j0.get();
                        lje.b bVar8 = (lje.b) cVar6.f174831e0.get();
                        xv5.c cVarA3 = eVar5.a();
                        vc.s.j(cVarA3);
                        xv5.g gVar8 = (xv5.g) eVar5.f292456h.get();
                        vc.s.j(gVar8);
                        po5.a aVarD2 = ((yo5.w) cVar8).d();
                        vc.s.j(aVarD2);
                        ap5.b bVarE = ((yo5.w) cVar8).e();
                        vc.s.j(bVarE);
                        fbj.a aVarA6 = ((qbj.m) cVar6.B).a();
                        vc.s.j(aVarA6);
                        g0 g0VarA2 = cVar6.C.a();
                        c90.c cVar9 = (c90.c) dVar4.f174855m.get();
                        o5c.a aVar7 = (o5c.a) cVar6.f174847y.f202894q.get();
                        vc.s.j(aVar7);
                        vh5.a aVar8 = (vh5.a) dVar4.i.get();
                        jje.c cVar10 = dVar4.f174849b;
                        wwa.b bVarA = cVar10.D.a();
                        vc.s.j(bVarA);
                        gte.a aVarB4 = cVar10.f174832g.b();
                        vc.s.j(aVarB4);
                        qje.e eVar6 = new qje.e(bVarA, aVarB4);
                        ur5.c cVarD = cVar6.d();
                        k18.c cVarB4 = cVar6.G.b();
                        ss5.a aVar9 = (ss5.a) ((rs5.c) cVar6.H).H.get();
                        vc.s.j(aVar9);
                        qje.d dVar6 = (qje.d) cVar6.f174836k0.get();
                        jr5.a aVar10 = (jr5.a) cVar6.I.f218531b.get();
                        vc.s.j(aVar10);
                        hc5.a aVarA7 = ((gc5.c) cVar6.k).a();
                        vc.s.j(aVarA7);
                        til.m mVarA = cVar6.J.a();
                        vc.s.j(mVarA);
                        return new bke.y(dVarG, aVarA4, mVar, nVar4, pVarC, aVarB3, hVar2, dVarF, aVarA5, iVarC2, lVarA, aVar5, aVar6, bVar8, cVarA3, gVar8, aVarD2, bVarE, aVarA6, g0VarA2, cVar9, aVar7, aVar8, eVar6, cVarD, cVarB4, aVar9, dVar6, aVar10, aVarA7, mVarA, cVar6.K.a());
                    case 6:
                        lo5.p pVarB = ((yo5.w) cVar6.f174845w).b();
                        vc.s.j(pVarB);
                        r0 r0VarA = cVar6.f174846x.a();
                        j5c.a aVarA8 = cVar6.f174847y.a();
                        vc.s.j(aVarA8);
                        vVar = new rje.d(pVarB, r0VarA, aVarA8, (vh5.a) dVar4.i.get());
                        return vVar;
                    case 7:
                        ii5.a factory2 = cVar6.f174833h.d();
                        vc.s.j(factory2);
                        wh5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.a();
                    case 8:
                        return new rje.f();
                    case 9:
                        return new rje.j(cVar6.z.a());
                    case 10:
                        ViewController viewController = dVar4.f174848a;
                        fke.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController, "viewController");
                        uVar = new c90.c(viewController.m2());
                        return uVar;
                    case 11:
                        vVar = new eke.h(cVar6.v.a(), cVar6.L.f136167c.j(), (j40.a) dVar4.o.get(), cVar6.M.d());
                        return vVar;
                    case 12:
                        h30.q factory3 = ((h30.n) cVar6.f).s();
                        j40.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        uVar = new j40.f((l30.b) factory3.f148941b, (os2.g) factory3.f148942c, (j30.c) factory3.d, (df0.b) factory3.e);
                        return uVar;
                    case 13:
                        return f9f.b.i(cVar6.f174843s);
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                jje.e eVar7 = (jje.e) this.d;
                jje.c cVar11 = (jje.c) this.f173102b;
                int i59 = this.f173103c;
                switch (i59) {
                    case 0:
                        return kxa.j.r((j60.a) eVar7.f174864h.get());
                    case 1:
                        return kxa.j.p((com.revolut.kompot.navigable.a) eVar7.f.get(), (rp0.m) eVar7.f174863g.get(), new j60.e());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension = (ake.d) eVar7.f174869p.get();
                        fke.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar5 = (yji.n) extension;
                        vc.s.k(nVar5);
                        return nVar5;
                    case 4:
                        fVar = new ake.f((bke.y) eVar7.o.get());
                        return fVar;
                    case 5:
                        ku5.g gVar9 = cVar11.f174841q;
                        go5.c cVar12 = cVar11.f174845w;
                        vv5.e eVar8 = cVar11.f174838m;
                        ei5.d dVar7 = cVar11.f174833h;
                        gv5.d dVarG2 = gVar9.g();
                        xh5.a aVarA9 = dVar7.a();
                        vc.s.j(aVarA9);
                        qje.m mVar2 = (qje.m) eVar7.k.get();
                        qje.n nVar6 = (qje.n) eVar7.f174866l.get();
                        bn2.p pVarC2 = cVar11.f174840p.c();
                        gte.a aVarB5 = cVar11.f174832g.b();
                        vc.s.j(aVarB5);
                        rje.h hVar3 = (rje.h) eVar7.f174867m.get();
                        sh5.d dVarF2 = dVar7.f();
                        vc.s.j(dVarF2);
                        wif.a aVarA10 = cVar11.z.a();
                        ji5.i iVarC3 = dVar7.c();
                        vc.s.j(iVarC3);
                        nwg.a factory4 = ((ewg.h) cVar11.A).a();
                        jje.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        kwg.l lVarA2 = factory4.a(gwg.a.CRYPTO);
                        j60.a aVar11 = (j60.a) eVar7.f174864h.get();
                        tje.a aVar12 = (tje.a) cVar11.j0.get();
                        lje.b bVar9 = (lje.b) cVar11.f174831e0.get();
                        xv5.c cVarA4 = eVar8.a();
                        vc.s.j(cVarA4);
                        xv5.g gVar10 = (xv5.g) eVar8.f292456h.get();
                        vc.s.j(gVar10);
                        po5.a aVarD3 = ((yo5.w) cVar12).d();
                        vc.s.j(aVarD3);
                        ap5.b bVarE2 = ((yo5.w) cVar12).e();
                        vc.s.j(bVarE2);
                        fbj.a aVarA11 = ((qbj.m) cVar11.B).a();
                        vc.s.j(aVarA11);
                        g0 g0VarA3 = cVar11.C.a();
                        c90.c cVar13 = (c90.c) eVar7.f174868n.get();
                        o5c.a aVar13 = (o5c.a) cVar11.f174847y.f202894q.get();
                        vc.s.j(aVar13);
                        vh5.a aVar14 = (vh5.a) eVar7.f174865j.get();
                        jje.c cVar14 = eVar7.d;
                        wwa.b bVarA2 = cVar14.D.a();
                        vc.s.j(bVarA2);
                        gte.a aVarB6 = cVar14.f174832g.b();
                        vc.s.j(aVarB6);
                        qje.e eVar9 = new qje.e(bVarA2, aVarB6);
                        ur5.c cVarD2 = cVar11.d();
                        k18.c cVarB5 = cVar11.G.b();
                        ss5.a aVar15 = (ss5.a) ((rs5.c) cVar11.H).H.get();
                        vc.s.j(aVar15);
                        qje.d dVar8 = (qje.d) cVar11.f174836k0.get();
                        jr5.a aVar16 = (jr5.a) cVar11.I.f218531b.get();
                        vc.s.j(aVar16);
                        hc5.a aVarA12 = ((gc5.c) cVar11.k).a();
                        vc.s.j(aVarA12);
                        til.m mVarA2 = cVar11.J.a();
                        vc.s.j(mVarA2);
                        return new bke.y(dVarG2, aVarA9, mVar2, nVar6, pVarC2, aVarB5, hVar3, dVarF2, aVarA10, iVarC3, lVarA2, aVar11, aVar12, bVar9, cVarA4, gVar10, aVarD3, bVarE2, aVarA11, g0VarA3, cVar13, aVar13, aVar14, eVar9, cVarD2, cVarB5, aVar15, dVar8, aVar16, aVarA12, mVarA2, cVar11.K.a());
                    case 6:
                        lo5.p pVarB2 = ((yo5.w) cVar11.f174845w).b();
                        vc.s.j(pVarB2);
                        r0 r0VarA2 = cVar11.f174846x.a();
                        j5c.a aVarA13 = cVar11.f174847y.a();
                        vc.s.j(aVarA13);
                        dVar = new rje.d(pVarB2, r0VarA2, aVarA13, (vh5.a) eVar7.f174865j.get());
                        return dVar;
                    case 7:
                        ii5.a factory5 = cVar11.f174833h.d();
                        vc.s.j(factory5);
                        wh5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        return factory5.a();
                    case 8:
                        return new rje.f();
                    case 9:
                        return new rje.j(cVar11.z.a());
                    case 10:
                        ViewController viewController2 = eVar7.f174860a;
                        fke.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController2, "viewController");
                        fVar = new c90.c(viewController2.m2());
                        return fVar;
                    case 11:
                        d16.a aVar17 = eVar7.f174861b;
                        e4m.e extensionProvider = eVar7.f174871r;
                        gte.a featureToggleInteractor = cVar11.f174832g.b();
                        vc.s.j(featureToggleInteractor);
                        Intrinsics.checkNotNullParameter(extensionProvider, "extensionProvider");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        if (((jte.d) featureToggleInteractor).c(DeFiAccountsApi$Toggles$CryptoDeFiAccount.f71633c)) {
                            Object obj2 = extensionProvider.get();
                            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModelExtension");
                            setB = y0.b((yji.n) obj2);
                        } else {
                            setB = h0.f322473a;
                        }
                        vc.s.k(setB);
                        return setB;
                    case 12:
                        d16.a aVar18 = eVar7.f174861b;
                        n16.b bVar10 = cVar11.u;
                        mil.a aVar19 = bVar10.o;
                        nd.o provider = new nd.o(aVar19, bVar10.f211256p);
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        Object obj3 = aVar19.get();
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        return (dje.a) obj3;
                    case 13:
                        itb.c cVarB6 = cVar11.v.b();
                        vc.s.j(cVarB6);
                        eVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        jje.c cVar15 = eVar7.d;
                        d16.b bVar11 = cVar15.f174844t;
                        i iVar = eVar7.f174873t;
                        ite.a aVar20 = cVar15.f174832g;
                        gte.a aVarB7 = aVar20.b();
                        vc.s.j(aVarB7);
                        builderBuilderWithExpectedSize.addAll((Iterable) cwi.u.p(bVar11, iVar, aVarB7));
                        rje.e eVar10 = new rje.e(new wqi.a());
                        nd.n nVarE2 = cVar15.e();
                        pak.h hVar4 = new pak.h((vje.a) cVar15.i0.get());
                        gte.a aVarB8 = aVar20.b();
                        vc.s.j(aVarB8);
                        builderBuilderWithExpectedSize.add(new ake.b(new uje.a(eVar10, nVarE2, hVar4, aVarB8)));
                        dVar = new zje.p(cVarB6, builderBuilderWithExpectedSize.build());
                        return dVar;
                    case 14:
                        d16.b bVar12 = cVar11.f174844t;
                        n16.b bVar13 = cVar11.u;
                        mil.a aVar21 = bVar13.o;
                        mil.a aVar22 = bVar13.f211256p;
                        nd.o provider2 = new nd.o(aVar21, aVar22);
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        Object obj4 = aVar22.get();
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        return (dje.c) obj4;
                    case 15:
                        dVar = new eke.h(cVar11.v.a(), cVar11.L.f136167c.j(), (j40.a) eVar7.v.get(), cVar11.M.d());
                        return dVar;
                    case 16:
                        h30.q factory6 = ((h30.n) cVar11.f).s();
                        j40.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        fVar = new j40.f((l30.b) factory6.f148941b, (os2.g) factory6.f148942c, (j30.c) factory6.d, (df0.b) factory6.e);
                        return fVar;
                    case 17:
                        eVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize2.addAll((Iterable) eVar7.f174875x.get());
                        fVar = new eke.b(j6.a.g(eVar7.f174869p, builderBuilderWithExpectedSize2));
                        return fVar;
                    case 18:
                        d16.a aVar23 = eVar7.f174861b;
                        e4m.e extensionProvider2 = eVar7.f174871r;
                        gte.a featureToggleInteractor2 = cVar11.f174832g.b();
                        vc.s.j(featureToggleInteractor2);
                        Intrinsics.checkNotNullParameter(extensionProvider2, "extensionProvider");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor2, "featureToggleInteractor");
                        Set setB2 = ((jte.d) featureToggleInteractor2).c(DeFiAccountsApi$Toggles$CryptoDeFiAccount.f71633c) ? y0.b(extensionProvider2.get()) : h0.f322473a;
                        vc.s.k(setB2);
                        return setB2;
                    case 19:
                        return f9f.b.i(cVar11.f174843s);
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                return a();
            case 12:
                return b();
            case 13:
                int i66 = this.f173103c;
                if (i66 == 0) {
                    return new pk8.i((cli.n) ((jk8.c) this.d).f175132a.get(), ((jk8.a) this.f173102b).a());
                }
                if (i66 == 1) {
                    return new pk8.j();
                }
                throw new AssertionError(i66);
            case 14:
                jm4.u uVar2 = (jm4.u) this.d;
                a3 a3Var = uVar2.f176372b;
                a3 a3Var2 = (a3) this.f173102b;
                jm4.r rVar = a3Var2.f175965b;
                int i74 = this.f173103c;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new AssertionError(i74);
                    }
                    m93.g gVarI = a3Var.e.i();
                    vc.s.j(gVarI);
                    return new hp4.m(new rm4.c(gVarI));
                }
                al4.d dVarO = rVar.o();
                vc.s.j(dVarO);
                al4.n nVarS = rVar.s();
                vc.s.j(nVarS);
                l93.f fVarJ = a3Var2.e.j();
                vc.s.j(fVarJ);
                mt8.d dVarB = a3Var2.D.b();
                vc.s.j(dVarB);
                return new hp4.k(dVarO, nVarS, fVarJ, dVarB, new an4.e(((eyd.b) a3Var.F).c()), rVar.d(), uVar2.f176371a, (cli.n) uVar2.f176373c.get());
            case 15:
                jm4.v vVar2 = (jm4.v) this.d;
                int i92 = this.f173103c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new gp4.f();
                    }
                    throw new AssertionError(i92);
                }
                cli.n nVar7 = (cli.n) vVar2.f176390b.get();
                AdditionalCardsCardholderCancelInvitationScreenContract$InputData additionalCardsCardholderCancelInvitationScreenContract$InputData = vVar2.f176389a;
                al4.d dVarO2 = ((a3) this.f173102b).f175965b.o();
                vc.s.j(dVarO2);
                return new gp4.e(nVar7, additionalCardsCardholderCancelInvitationScreenContract$InputData, dVarO2);
            case 16:
                a3 a3Var3 = (a3) this.f173102b;
                int i96 = this.f173103c;
                if (i96 == 0) {
                    al4.d dVarO3 = a3Var3.f175965b.o();
                    vc.s.j(dVarO3);
                    jm4.x xVar = (jm4.x) this.d;
                    return new ip4.l(dVarO3, xVar.f176426a, (cli.n) xVar.f176427b.get());
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                m93.d dVarF3 = a3Var3.e.f();
                vc.s.j(dVarF3);
                return new ip4.o(dVarF3);
            case 17:
                a3 a3Var4 = (a3) this.f173102b;
                jm4.y yVar = (jm4.y) this.d;
                AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = yVar.f176440a;
                int i99 = this.f173103c;
                if (i99 == 0) {
                    al4.d dVarO4 = a3Var4.f175965b.o();
                    vc.s.j(dVarO4);
                    qd0.b bVarN = yVar.f176441b.k.n();
                    vc.s.j(bVarN);
                    return new np4.o(dVarO4, new ow4.a(bVarN, 0), additionalCardsChangeLimitScreenContract$InputData, (cli.n) yVar.e.get());
                }
                if (i99 == 1) {
                    return new np4.r(additionalCardsChangeLimitScreenContract$InputData, new u80.o(), (w80.b) yVar.f176442c.get(), (InputFilter) yVar.d.get());
                }
                if (i99 != 2) {
                    if (i99 != 3) {
                        throw new AssertionError(i99);
                    }
                    op4.b.Companion.getClass();
                    return new mp0.d(11);
                }
                qd0.b languageProvider = a3Var4.k.n();
                vc.s.j(languageProvider);
                op4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 18:
                a0 a0Var = (a0) this.d;
                int i100 = this.f173103c;
                if (i100 == 0) {
                    return kxa.j.k((j60.a) a0Var.d.get());
                }
                if (i100 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) a0Var.f175954b.get(), (rp0.m) a0Var.f175955c.get());
                }
                if (i100 == 2) {
                    return new rp0.m();
                }
                if (i100 == 3) {
                    al4.d dVarO5 = ((a3) this.f173102b).f175965b.o();
                    vc.s.j(dVarO5);
                    return new com.revolut.feature.credit.card.impl.ui.additional_cards.management.a(dVarO5, (j60.a) a0Var.d.get(), new pp4.c(), a0Var.f175953a, (cli.n) a0Var.f.get());
                }
                if (i100 != 4) {
                    throw new AssertionError(i100);
                }
                pp4.a additionalCardholdersListMapper = new pp4.a();
                Intrinsics.checkNotNullParameter(additionalCardholdersListMapper, "additionalCardholdersListMapper");
                return new pp4.q();
            case 19:
                return c();
            case 20:
                jm4.h0 h0Var = (jm4.h0) this.d;
                int i101 = this.f173103c;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new ns4.l();
                    }
                    throw new AssertionError(i101);
                }
                CreditCardAnticipationConfirmationScreenContract$InputData creditCardAnticipationConfirmationScreenContract$InputData = h0Var.f176098a;
                al4.m mVarR = ((a3) this.f173102b).f175965b.r();
                vc.s.j(mVarR);
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a(creditCardAnticipationConfirmationScreenContract$InputData, mVarR, new vt4.b(), (cli.n) h0Var.f176099b.get());
            case 21:
                return d();
            case 22:
                jm4.l0 l0Var = (jm4.l0) this.d;
                a3 a3Var5 = (a3) this.f173102b;
                int i102 = this.f173103c;
                if (i102 != 0) {
                    if (i102 == 1) {
                        return new zt4.o();
                    }
                    throw new AssertionError(i102);
                }
                CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData = l0Var.f176179a;
                om4.w wVar = (om4.w) a3Var5.f175965b.E.get();
                vc.s.j(wVar);
                vt4.b bVar14 = new vt4.b();
                tqi.g gVarE = a3Var5.f175976m.e();
                c70.a aVarZ = a3Var5.k.z();
                vc.s.j(aVarZ);
                return new com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a(creditCardBoletoDetailsContract$InputData, wVar, bVar14, gVarE, aVarZ, (cli.n) l0Var.f176180b.get());
            case 23:
                return e();
            case 24:
                return f();
            case 25:
                jm4.r rVar2 = ((a3) this.f173102b).f175965b;
                jm4.r0 r0Var = (jm4.r0) this.d;
                int i103 = this.f173103c;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new us4.u(new vt4.h(), new vt4.e());
                    }
                    throw new AssertionError(i103);
                }
                CreditCardChooseFutureInstalmentsScreenContract$InputData creditCardChooseFutureInstalmentsScreenContract$InputData = r0Var.f176307a;
                al4.m mVarR2 = rVar2.r();
                vc.s.j(mVarR2);
                al4.n nVarS2 = rVar2.s();
                vc.s.j(nVarS2);
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a(creditCardChooseFutureInstalmentsScreenContract$InputData, mVarR2, nVarS2, (cli.n) r0Var.f176308b.get());
            case 26:
                return g();
            case 27:
                return h();
            case 28:
                return i();
            default:
                e1 e1Var = (e1) this.d;
                a3 a3Var6 = (a3) this.f173102b;
                nm4.f fVar4 = a3Var6.H;
                jm4.r rVar3 = a3Var6.f175965b;
                int i104 = this.f173103c;
                if (i104 == 0) {
                    return kxa.j.j((j60.a) e1Var.e.get());
                }
                if (i104 == 1) {
                    return v1.c.r((com.revolut.kompot.navigable.a) e1Var.f176051c.get(), (rp0.m) e1Var.d.get());
                }
                if (i104 == 2) {
                    return new rp0.m();
                }
                if (i104 != 3) {
                    if (i104 == 4) {
                        return new ds4.a0(new fs4.g(e1Var.f176050b.f175963a.f(), new bp4.f(), new fs4.a()));
                    }
                    throw new AssertionError(i104);
                }
                CreditCardInstalmentHubScreenContract$InputData creditCardInstalmentHubScreenContract$InputData = e1Var.f176049a;
                j60.a aVar24 = (j60.a) e1Var.e.get();
                fs4.c cVar16 = new fs4.c();
                al4.m mVarR3 = rVar3.r();
                vc.s.j(mVarR3);
                al4.n nVarS3 = rVar3.s();
                vc.s.j(nVarS3);
                fm4.a aVarA14 = a3Var6.f175963a.a();
                ang.f fVarE = a3Var6.f.e();
                h3 h3VarB = fVar4.b();
                vc.s.j(h3VarB);
                wli.x xVarD = ((s41.a) a3Var6.f175975l).d();
                g3 g3VarA = fVar4.a();
                vc.s.j(g3VarA);
                k0 k0VarQ = rVar3.q();
                vc.s.j(k0VarQ);
                return new com.revolut.feature.credit.card.impl.ui.instalment.hub.a(creditCardInstalmentHubScreenContract$InputData, aVar24, cVar16, mVarR3, nVarS3, aVarA14, fVarE, h3VarB, xVarD, g3VarA, k0VarQ, (cli.n) e1Var.f176052g.get());
        }
    }
}
