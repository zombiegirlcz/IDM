package u45;

import b9.w2;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.see_all.TravelMilesAirlineSeeAllScreenContract$InputData;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$InputData;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import dw3.f2;
import et6.h1;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import z0h.q1;

/* JADX INFO: loaded from: classes21.dex */
public final class w0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f277244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f277245c;
    public final Object d;

    public /* synthetic */ w0(Object obj2, Object obj3, int i, int i2) {
        this.f277243a = i2;
        this.f277244b = obj2;
        this.d = obj3;
        this.f277245c = i;
    }

    private final Object a() {
        ufg.d dVar = (ufg.d) this.d;
        ufg.g gVar = (ufg.g) this.f277244b;
        int i = this.f277245c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            l80.e dateProvider = gVar.f279720r.h();
            vc.s.j(dateProvider);
            Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
            return new ahg.q();
        }
        cli.n nVar = (cli.n) dVar.f279680b.get();
        TravelMilesAirlineSeeAllScreenContract$InputData travelMilesAirlineSeeAllScreenContract$InputData = dVar.f279679a;
        vfg.e eVar = (vfg.e) gVar.M.get();
        jwb.e eVarB = gVar.i.b();
        vc.s.j(eVarB);
        return new ahg.n(nVar, travelMilesAirlineSeeAllScreenContract$InputData, eVar, eVarB);
    }

    private final Object b() {
        ufg.g gVar = (ufg.g) this.f277244b;
        t1f.h hVar = gVar.f279715l;
        ufg.e eVar = (ufg.e) this.d;
        int i = this.f277245c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) eVar.f279687c.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) eVar.f279685a.get(), (rp0.m) eVar.f279686b.get());
            case 2:
                return new rp0.m();
            case 3:
                dyb.a extension = (dyb.a) eVar.e.get();
                dig.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                o7.b provider = gVar.f279712g.d();
                dig.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                vc.s.k(aVarE);
                return aVarE;
            case 5:
                bgg.a aVar = (bgg.a) eVar.f279688g.get();
                cdj.b.C(aVar);
                return aVar;
            case 6:
                return new bgg.b(new eig.u(), (j60.a) eVar.f279687c.get(), (vfg.d) gVar.I.get());
            case 7:
                return new com.revolut.feature.travel.miles.impl.ui.screen.home.search.a((cli.n) eVar.i.get(), hVar.c(), hVar.a(), (dyb.a) eVar.e.get());
            case 8:
                return new at.r(new ugg.b(), 3);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        ufg.g gVar = (ufg.g) this.f277244b;
        ufg.f fVar = (ufg.f) this.d;
        int i = this.f277245c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) fVar.f279702c.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) fVar.f279700a.get(), (rp0.m) fVar.f279701b.get());
            case 2:
                return new rp0.m();
            case 3:
                dyb.a extension = (dyb.a) fVar.e.get();
                dhg.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                o7.b provider = gVar.f279712g.d();
                dhg.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                vc.s.k(aVarE);
                return aVarE;
            case 5:
                bgg.a aVar = (bgg.a) fVar.f279703g.get();
                cdj.b.C(aVar);
                return aVar;
            case 6:
                return new bgg.b(new eig.u(), (j60.a) fVar.f279702c.get(), (vfg.d) gVar.I.get());
            case 7:
                return new chg.j((cli.n) fVar.i.get(), (vfg.e) gVar.M.get(), (dyb.a) fVar.e.get(), (bgg.a) fVar.f279703g.get());
            case 8:
                return new at.r(new ugg.b(), 2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.f277245c;
        if (i != 0) {
            if (i == 1) {
                return new tig.d(new agg.d());
            }
            throw new AssertionError(i);
        }
        ufg.t tVar = (ufg.t) this.d;
        TravelMilesRecommendedFlightsFlowContract$InputData travelMilesRecommendedFlightsFlowContract$InputData = tVar.f279792a;
        tig.b bVar = (tig.b) tVar.d.get();
        f80.a aVarX = ((ufg.g) this.f277244b).f279720r.x();
        vc.s.j(aVarX);
        return new com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.a(travelMilesRecommendedFlightsFlowContract$InputData, bVar, aVarX);
    }

    private final Object e() {
        ufg.g gVar = (ufg.g) this.f277244b;
        ufg.y yVar = (ufg.y) this.d;
        int i = this.f277245c;
        if (i == 0) {
            return new qgg.o((jki.p) yVar.f279807c.get(), yVar.f279806b, gVar.f279719q.e(), (vfg.d) gVar.I.get(), (qgg.b) yVar.d.get());
        }
        if (i == 1) {
            return new qgg.p(yVar.f279806b);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        sf0.h hVarB = gVar.o.b();
        vc.s.j(hVarB);
        return new qgg.c(hVarB);
    }

    private final Object f() {
        ufg.g gVar = (ufg.g) this.f277244b;
        ufg.y yVar = (ufg.y) this.d;
        int i = this.f277245c;
        if (i == 0) {
            return new qgg.o((jki.p) yVar.f279807c.get(), yVar.f279806b, gVar.f279719q.e(), (vfg.d) gVar.I.get(), (qgg.b) yVar.d.get());
        }
        if (i == 1) {
            return new qgg.p(yVar.f279806b);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        sf0.h hVarB = gVar.o.b();
        vc.s.j(hVarB);
        return new qgg.c(hVarB);
    }

    private final Object g() {
        ufg.c0 c0Var = (ufg.c0) this.d;
        int i = this.f277245c;
        if (i == 0) {
            return new ehg.h((cli.n) c0Var.f279678c.get(), c0Var.f279677b);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        l80.e eVarH = ((ufg.g) this.f277244b).f279720r.h();
        vc.s.j(eVarH);
        return new ehg.j(eVarH);
    }

    private final Object h() {
        ufg.c0 c0Var = (ufg.c0) this.d;
        int i = this.f277245c;
        if (i == 0) {
            return new ehg.h((cli.n) c0Var.f279678c.get(), c0Var.f279677b);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        l80.e eVarH = ((ufg.g) this.f277244b).f279720r.h();
        vc.s.j(eVarH);
        return new ehg.j(eVarH);
    }

    private final Object i() {
        ufg.e0 e0Var = (ufg.e0) this.d;
        ufg.g gVar = (ufg.g) this.f277244b;
        int i = this.f277245c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) e0Var.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) e0Var.f279692b.get(), (rp0.m) e0Var.f279693c.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) e0Var.f279694g.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) gVar.u).d(), (xc6.a) e0Var.f.get());
            case 5:
                return r6.b.k((zc6.a) gVar.u, "factory");
            case 6:
                dyb.a extension = (dyb.a) e0Var.i.get();
                big.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 7:
                o7.b provider = gVar.f279712g.d();
                big.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                vc.s.k(aVarE);
                return aVarE;
            case 8:
                bgg.a aVar2 = (bgg.a) e0Var.k.get();
                cdj.b.C(aVar2);
                return aVar2;
            case 9:
                return new bgg.b(new eig.u(), (j60.a) e0Var.d.get(), (vfg.d) gVar.I.get());
            case 10:
                return va.g.u((xc6.a) e0Var.f.get());
            case 11:
                cli.n nVar = (cli.n) e0Var.f279699n.get();
                tsk.t tVarA = gVar.f279715l.a();
                qr0.i iVarC = gVar.f279715l.c();
                nyb.m0 m0VarG = gVar.f279712g.g();
                vc.s.j(m0VarG);
                dyb.a aVar3 = (dyb.a) e0Var.i.get();
                lfg.o oVarB = gVar.b();
                a29.b bVarA = gVar.f279723w.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.travel.miles.impl.ui.screen.home.e(nVar, tVarA, iVarC, m0VarG, aVar3, oVarB, bVarA, ((zc6.a) gVar.u).b());
            case 12:
                fub.k kVarD = gVar.k.d();
                vc.s.j(kVarD);
                return new aig.r(kVarD, new ugg.b(), ((zc6.a) gVar.u).c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        ufg.e0 e0Var = (ufg.e0) this.d;
        ufg.g gVar = (ufg.g) this.f277244b;
        int i = this.f277245c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) e0Var.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) e0Var.f279692b.get(), (rp0.m) e0Var.f279693c.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) e0Var.f279694g.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) gVar.u).d(), (xc6.a) e0Var.f.get());
            case 5:
                return r6.b.k((zc6.a) gVar.u, "factory");
            case 6:
                dyb.a extension = (dyb.a) e0Var.i.get();
                big.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 7:
                o7.b provider = gVar.f279712g.d();
                big.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                vc.s.k(aVarE);
                return aVarE;
            case 8:
                bgg.a aVar2 = (bgg.a) e0Var.k.get();
                cdj.b.C(aVar2);
                return aVar2;
            case 9:
                return new bgg.b(new eig.u(), (j60.a) e0Var.d.get(), (vfg.d) gVar.I.get());
            case 10:
                return va.g.u((xc6.a) e0Var.f.get());
            case 11:
                cli.n nVar = (cli.n) e0Var.f279699n.get();
                tsk.t tVarA = gVar.f279715l.a();
                qr0.i iVarC = gVar.f279715l.c();
                nyb.m0 m0VarG = gVar.f279712g.g();
                vc.s.j(m0VarG);
                dyb.a aVar3 = (dyb.a) e0Var.i.get();
                lfg.o oVarB = gVar.b();
                a29.b bVarA = gVar.f279723w.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.travel.miles.impl.ui.screen.home.e(nVar, tVarA, iVarC, m0VarG, aVar3, oVarB, bVarA, ((zc6.a) gVar.u).b());
            case 12:
                fub.k kVarD = gVar.k.d();
                vc.s.j(kVarD);
                return new aig.r(kVarD, new ugg.b(), ((zc6.a) gVar.u).c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        ufg.g0 g0Var = (ufg.g0) this.d;
        ufg.g gVar = (ufg.g) this.f277244b;
        int i = this.f277245c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) g0Var.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) g0Var.f279727b.get(), (rp0.m) g0Var.f279728c.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) g0Var.f279729g.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) gVar.u).d(), (xc6.a) g0Var.f.get());
            case 5:
                return r6.b.k((zc6.a) gVar.u, "factory");
            case 6:
                dyb.a extension = (dyb.a) g0Var.i.get();
                fig.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 7:
                o7.b provider = gVar.f279712g.d();
                fig.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                vc.s.k(aVarE);
                return aVarE;
            case 8:
                bgg.a aVar2 = (bgg.a) g0Var.k.get();
                cdj.b.C(aVar2);
                return aVar2;
            case 9:
                return new bgg.b(new eig.u(), (j60.a) g0Var.d.get(), (vfg.d) gVar.I.get());
            case 10:
                return va.g.u((xc6.a) g0Var.f.get());
            case 11:
                cli.n nVar = (cli.n) g0Var.f279734n.get();
                e4m.e eVar = gVar.I;
                zxb.k0 k0Var = gVar.f279712g;
                vfg.d dVar = (vfg.d) eVar.get();
                j60.a aVar3 = (j60.a) g0Var.d.get();
                vfg.e eVar2 = (vfg.e) gVar.M.get();
                gfg.c cVar = (gfg.c) gVar.P.get();
                nyb.m0 m0VarG = k0Var.g();
                vc.s.j(m0VarG);
                nyb.k kVarC = k0Var.c();
                vc.s.j(kVarC);
                dyb.a aVar4 = (dyb.a) g0Var.i.get();
                lfg.o oVarB = gVar.b();
                a29.b bVarA = gVar.f279723w.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.travel.miles.impl.ui.screen.main.e(nVar, dVar, aVar3, eVar2, cVar, m0VarG, kVarC, aVar4, oVarB, bVarA, (bgg.a) g0Var.k.get(), ((zc6.a) gVar.u).b());
            case 12:
                fub.k kVarD = gVar.k.d();
                vc.s.j(kVarD);
                return new eig.t(kVarD, new ugg.b(), ((zc6.a) gVar.u).c());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object bVar;
        switch (this.f277243a) {
            case 0:
                x0 x0Var = (x0) this.d;
                h hVar = (h) this.f277244b;
                j35.a aVar2 = hVar.f277124a;
                ax4.e eVar = hVar.A;
                int i = this.f277245c;
                if (i == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(hVar.f277138q, (com.revolut.kompot.navigable.a) x0Var.f277251c.get());
                }
                if (i == 1) {
                    LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension = (LoanRepaymentAccountModelExtension) x0Var.e.get();
                    trl.f.n(loanRepaymentAccountModelExtension);
                    return loanRepaymentAccountModelExtension;
                }
                if (i == 2) {
                    l35.b bVar2 = (l35.b) hVar.L.get();
                    y45.i iVarI = aVar2.i();
                    vc.s.j(iVarI);
                    h6i.o oVarH = hVar.z.h();
                    l35.h hVarF = x0Var.f277250b.f277124a.f();
                    vc.s.j(hVarF);
                    return new com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b(bVar2, iVarI, oVarH, new c55.f0(hVarF));
                }
                if (i == 3) {
                    lx4.a aVarE = eVar.e();
                    return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) hVar.f277139r).d());
                }
                if (i != 4) {
                    if (i == 5) {
                        return new kxk.o(new mx4.h(), eVar.c());
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) x0Var.f277253h.get();
                ReviewPaymentV2ControllerContract$InputData reviewPaymentV2ControllerContract$InputData = x0Var.f277249a;
                LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension2 = (LoanRepaymentAccountModelExtension) x0Var.e.get();
                y45.j jVarH = aVar2.h();
                vc.s.j(jVarH);
                return new l85.n(nVar, reviewPaymentV2ControllerContract$InputData, loanRepaymentAccountModelExtension2, jVarH, (cx4.a) x0Var.f277252g.get(), hVar.f277137p.a());
            case 1:
                l70.e eVar2 = ((h) this.f277244b).f277138q;
                f2 f2Var = (f2) this.d;
                int i2 = this.f277245c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new py4.h((c90.c) f2Var.d.get());
                    }
                    if (i2 == 2) {
                        return qw7.u.y(f2Var.f118708c);
                    }
                    throw new AssertionError(i2);
                }
                c70.a aVarZ = eVar2.z();
                vc.s.j(aVarZ);
                r70.c cVarA = eVar2.A();
                vc.s.j(cVarA);
                return new py4.f(aVarZ, cVarA, f2Var.f118707b, (jki.p) f2Var.e.get());
            case 2:
                l70.e eVar3 = ((h) this.f277244b).f277138q;
                f2 f2Var2 = (f2) this.d;
                int i3 = this.f277245c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new py4.h((c90.c) f2Var2.d.get());
                    }
                    if (i3 == 2) {
                        return qw7.u.y(f2Var2.f118708c);
                    }
                    throw new AssertionError(i3);
                }
                c70.a aVarZ2 = eVar3.z();
                vc.s.j(aVarZ2);
                r70.c cVarA2 = eVar3.A();
                vc.s.j(cVarA2);
                return new py4.f(aVarZ2, cVarA2, f2Var2.f118707b, (jki.p) f2Var2.e.get());
            case 3:
                u7a.b bVar3 = (u7a.b) this.d;
                s7a.x xVar = bVar3.f277722b;
                x7a.d dVar = bVar3.f277721a;
                u7a.a aVar3 = (u7a.a) this.f277244b;
                int i5 = this.f277245c;
                if (i5 == 0) {
                    aVar = new com.revolut.feature.picker.a(dVar, xVar, (cli.n) bVar3.d.get());
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new AssertionError(i5);
                        }
                        v60.e eVarA = aVar3.f277718a.a();
                        vc.s.j(eVarA);
                        sf0.h hVarB = aVar3.f277719b.b();
                        vc.s.j(hVarB);
                        return new v7a.a(hVarB, eVarA);
                    }
                    aVar = new s7a.s0(dVar, xVar, (v7a.b) bVar3.f277723c.get());
                }
                return aVar;
            case 4:
                u7i.l lVar = (u7i.l) this.f277244b;
                u7i.j jVar = (u7i.j) this.d;
                u7i.l lVar2 = jVar.f277813b;
                int i6 = this.f277245c;
                if (i6 == 0) {
                    n60.a aVar4 = (n60.a) jVar.e.get();
                    o5k.i.l(aVar4);
                    return aVar4;
                }
                if (i6 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) jVar.d.get());
                }
                if (i6 == 2) {
                    Object extension = (v5i.b) jVar.f277815g.get();
                    d7i.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar2 = (yji.n) extension;
                    vc.s.k(nVar2);
                    return nVar2;
                }
                if (i6 == 3) {
                    e6i.b extensionProvider = (e6i.b) lVar.f277835n0.get();
                    d7i.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extensionProvider, "extensionProvider");
                    return extensionProvider.a();
                }
                if (i6 != 4) {
                    if (i6 != 5) {
                        throw new AssertionError(i6);
                    }
                    o7.b bVar4 = new o7.b(lVar2.f277833m.a());
                    f7i.d dVar2 = new f7i.d(jVar.f277812a);
                    he2.b footerDescriptionProvider = new he2.b(new g7i.d(), new g7i.b());
                    Intrinsics.checkNotNullParameter(footerDescriptionProvider, "footerDescriptionProvider");
                    return new c7i.o0(bVar4, dVar2, new g7i.a(), new qy5.a(new f7i.a(), new f7i.e()));
                }
                cli.n nVar3 = (cli.n) jVar.i.get();
                MoveMoneyAutomationScreenContract$InputData moveMoneyAutomationScreenContract$InputData = jVar.f277812a;
                w80.b bVarJ = lVar.f277824c.j();
                vc.s.j(bVarJ);
                w5i.d dVarD = lVar2.z.d();
                vc.s.j(dVarD);
                z6i.c cVar = new z6i.c(dVarD);
                v7i.a aVar5 = lVar2.z;
                w5i.a aVarA = aVar5.a();
                vc.s.j(aVarA);
                c7i.b bVar5 = new c7i.b(aVarA, new r10.r(jVar.b(), aVar5.h(), new h6i.a()), jVar.f277814c.f277807b, new b7i.d());
                zq.a aVar6 = new zq.a(lVar2.z.h(), lVar2.G.b(), new b7i.d());
                e7i.b bVar6 = new e7i.b();
                kpj.f fVar = new kpj.f(new m7i.a(), new m7i.k(), new m7i.b(), new m7i.m(), new m7i.d(), new m7i.e(), new m7i.g());
                wtc.b1 b1Var = (wtc.b1) lVar2.E.f292061b0.get();
                vc.s.j(b1Var);
                l7i.e eVar4 = new l7i.e(b1Var);
                zq.a aVar7 = new zq.a(lVar2.z.h(), lVar2.G.b(), new b7i.d());
                v7i.a aVar8 = lVar2.z;
                h6i.o oVarH2 = aVar8.h();
                m6i.k0 k0Var = new m6i.k0();
                h6i.o oVarH3 = aVar8.h();
                usg.a aVar9 = lVar2.G;
                wsg.n nVarB = aVar9.b();
                mj8.b bVar7 = lVar2.H;
                hj8.a aVarA2 = bVar7.a();
                vc.s.j(aVarA2);
                te8.v vVarD = lVar2.I.d();
                vc.s.j(vVarD);
                anb.s sVar = lVar2.J;
                djb.n nVarA = sVar.a();
                vc.s.j(nVarA);
                hj8.a aVarA3 = bVar7.a();
                vc.s.j(aVarA3);
                wsg.n nVarB2 = aVar9.b();
                bw9.a aVar10 = lVar2.K;
                jpc.e eVar5 = new jpc.e(aVarA3, nVarB2, aVar10.a());
                wpg.l lVar3 = (wpg.l) lVar2.v;
                ppg.b bVarB = lVar3.b();
                vc.s.j(bVarB);
                jla.h hVarA = lVar2.L.a();
                cw9.d dVarA = aVar10.a();
                ite.a aVar11 = lVar2.f277830j;
                gte.a aVarB = aVar11.b();
                vc.s.j(aVarB);
                k6i.k kVar = new k6i.k(nVarB, aVarA2, vVarD, nVarA, eVar5, bVarB, hVarA, dVarA, aVarB);
                wsg.b bVarA = aVar9.a();
                xqe.b bVarA2 = lVar2.M.a();
                vc.s.j(bVarA2);
                ppg.b bVarB2 = lVar3.b();
                vc.s.j(bVarB2);
                gte.a aVarB2 = aVar11.b();
                vc.s.j(aVarB2);
                o6i.f fVar2 = new o6i.f(bVarA, bVarA2, bVarB2, aVarB2);
                ppg.b bVarB3 = lVar3.b();
                vc.s.j(bVarB3);
                n6i.x xVar2 = new n6i.x(bVarB3, new h6i.q0(lVar2.K.a(), lVar2.N.h()));
                djb.n nVarA2 = sVar.a();
                vc.s.j(nVarA2);
                n6i.s sVar2 = new n6i.s(nVarA2);
                wsg.n nVarB3 = aVar9.b();
                h1 h1VarN = lVar2.O.n();
                vc.s.j(h1VarN);
                w5i.c cVarC = aVar8.c();
                vc.s.j(cVarC);
                w5i.a aVarA4 = aVar8.a();
                vc.s.j(aVarA4);
                lVar2.P.a();
                m6i.h0 h0Var = new m6i.h0(oVarH3, kVar, fVar2, xVar2, sVar2, nVarB3, h1VarN, cVarC, aVarA4, new n6i.h(), lVar2.Q.i(), new za7.c());
                wsg.n nVarB4 = aVar9.b();
                h6i.o oVarH4 = aVar8.h();
                fk3.a aVarA5 = lVar2.i.a();
                vc.s.j(aVarA5);
                i7i.g gVar = new i7i.g(aVar7, new kbb.c(oVarH2, k0Var, new hd.r(h0Var, nVarB4, oVarH4, new m6i.l(aVarA5, new n6i.o(aVar9.b(), lVar2.f277840s.c(), new h6i.q0(lVar2.K.a(), lVar2.N.h()))), new k7i.i(aVar8.h(), jVar.b()), new jul.o(lVar2.Q.i(), new za7.c())), new jul.o(lVar2.Q.i(), new za7.c())));
                xua.a aVarA6 = lVar2.d.a();
                vc.s.j(aVarA6);
                k7i.g gVar2 = new k7i.g(aVarA6, new he2.b(new v8i.c()));
                wzi.a aVarA7 = ((ctj.b) lVar2.f0).a();
                vc.s.j(aVarA7);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) lVar2.W).c();
                vc.s.j(aVarC);
                return new com.revolut.feature_move_money.impl.automation.screen.c(nVar3, moveMoneyAutomationScreenContract$InputData, bVarJ, cVar, bVar5, aVar6, bVar6, fVar, eVar4, gVar, new k7i.i(gVar2, new k7i.e(aVarA7, aVarC)), (n60.a) jVar.e.get(), new c7i.p0(), lVar.a(), (v5i.b) jVar.f277815g.get());
            case 5:
                u7i.m mVar = (u7i.m) this.d;
                u7i.l lVar4 = (u7i.l) this.f277244b;
                int i21 = this.f277245c;
                switch (i21) {
                    case 0:
                        wj0.a idempotencyKeyHolder = ((nj0.d) lVar4.f277838q).i();
                        vc.s.j(idempotencyKeyHolder);
                        l80.e dateProvider = lVar4.f277824c.h();
                        vc.s.j(dateProvider);
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder, dateProvider, "payments_recurring_transfer");
                        break;
                    case 1:
                        wj0.a idempotencyKeyHolder2 = ((nj0.d) lVar4.f277838q).i();
                        vc.s.j(idempotencyKeyHolder2);
                        l80.e dateProvider2 = lVar4.f277824c.h();
                        vc.s.j(dateProvider2);
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder2, dateProvider2, "payments_automation");
                        break;
                    case 2:
                        wj0.a idempotencyKeyHolder3 = ((nj0.d) lVar4.f277838q).i();
                        vc.s.j(idempotencyKeyHolder3);
                        l80.e dateProvider3 = lVar4.f277824c.h();
                        vc.s.j(dateProvider3);
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder3, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider3, "dateProvider");
                        bVar = new m60.b(idempotencyKeyHolder3, dateProvider3, "MOVE_MONEY_IDEMPOTENCY_TAG");
                        break;
                    case 3:
                        pak.h priceQuoteTraceIdControllerExtensionFactory = lVar4.f277839r.a();
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory, "priceQuoteTraceIdControllerExtensionFactory");
                        return priceQuoteTraceIdControllerExtensionFactory.a("move_money_price_quote");
                    case 4:
                        w2 jointMcyErrorGuardianControllerExtensionProvider = lVar4.f277840s.b();
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(jointMcyErrorGuardianControllerExtensionProvider, "jointMcyErrorGuardianControllerExtensionProvider");
                        return jointMcyErrorGuardianControllerExtensionProvider.S();
                    case 5:
                        r10.f factory = lVar4.f277841t.a();
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.d();
                    case 6:
                        Object extension2 = (x7i.e) mVar.f277852m.get();
                        x7i.n.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar4 = (yji.n) extension2;
                        vc.s.k(nVar4);
                        return nVar4;
                    case 7:
                        o8l.c cVarB = lVar4.f.b();
                        w5i.e eVar6 = (w5i.e) lVar4.f277831k0.get();
                        n7i.k0 k0VarQ = mVar.q();
                        u7i.l lVar5 = mVar.e;
                        g48.r0 r0VarC = lVar5.f277840s.c();
                        MoveMoneyInputData moveMoneyInputData = mVar.f277845a;
                        n7i.k kVar2 = new n7i.k(r0VarC, moveMoneyInputData, new n7i.l0(moveMoneyInputData, new n7i.g0(moveMoneyInputData), new n7i.m0()), lVar5.f277842w.a());
                        p0i.b bVarE = lVar5.f277834n.e();
                        vc.s.j(bVarE);
                        wj0.a aVarI = ((nj0.d) lVar5.f277838q).i();
                        vc.s.j(aVarI);
                        x7i.q qVar = new x7i.q(bVarE, aVarI);
                        rea.m mVarF = lVar4.f277843x.f();
                        v8i.a aVar12 = new v8i.a();
                        MoveMoneyInputData moveMoneyInputData2 = mVar.f277845a;
                        tyh.j jVar2 = lVar5.f277844y;
                        sf0.h hVarB2 = jVar2.f275660a.b();
                        vc.s.j(hVarB2);
                        gte.a aVarB3 = jVar2.f275661b.b();
                        vc.s.j(aVarB3);
                        k7i.i firmPriceDevianceChecker = new k7i.i(hVarB2, aVarB3);
                        g8i.a dealableQuoteEligibilityChecker = mVar.c();
                        w5i.d moveMoneyQuoteInteractor = lVar5.z.d();
                        vc.s.j(moveMoneyQuoteInteractor);
                        Intrinsics.checkNotNullParameter(firmPriceDevianceChecker, "firmPriceDevianceChecker");
                        Intrinsics.checkNotNullParameter(dealableQuoteEligibilityChecker, "dealableQuoteEligibilityChecker");
                        Intrinsics.checkNotNullParameter(moveMoneyQuoteInteractor, "moveMoneyQuoteInteractor");
                        uc.d dVar3 = new uc.d();
                        dVar3.f278952a = firmPriceDevianceChecker;
                        dVar3.f278953b = dealableQuoteEligibilityChecker;
                        dVar3.f278954c = moveMoneyQuoteInteractor;
                        bVar = new x7i.l(cVarB, eVar6, k0VarQ, kVar2, qVar, mVarF, aVar12, moveMoneyInputData2, dVar3, new q7i.a());
                        break;
                    case 8:
                        zof.f fVarD = lVar4.A.d();
                        vc.s.j(fVarD);
                        MoveMoneyInputData moveMoneyInputData3 = mVar.f277845a;
                        u7i.l lVar6 = mVar.e;
                        g1 g1Var = (g1) mVar.f277854p.get();
                        hsc.c cVarB2 = lVar4.B.b();
                        m41.c cVar2 = lVar6.C;
                        ite.a aVar13 = lVar6.f277830j;
                        gsc.c cVar3 = lVar6.B;
                        xmg.a aVar14 = lVar6.f277828h;
                        k61.a aVarE2 = cVar2.e();
                        vc.s.j(aVarE2);
                        f4h.a aVar15 = new f4h.a(aVarE2, new q6i.a());
                        c8i.v vVar = new c8i.v(aVar14.e(), ((s99.a) lVar6.D).b());
                        w5i.d dVarD2 = lVar6.z.d();
                        vc.s.j(dVarD2);
                        z1l.d dVar4 = new z1l.d(dVarD2);
                        zq.a aVar16 = new zq.a(cVar3.a(), cVar3.c(), new d8i.a());
                        vtc.t tVar = lVar6.E;
                        wtc.t0 t0Var = new wtc.t0((cuc.u) tVar.Y.get(), tVar.f292070l.a());
                        l61.a aVarB4 = aVar14.b();
                        vc.s.j(aVarB4);
                        gte.a aVarB5 = aVar13.b();
                        vc.s.j(aVarB5);
                        a8i.g gVar3 = new a8i.g(t0Var, aVarB4, aVarB5);
                        gte.a aVarB6 = aVar13.b();
                        vc.s.j(aVarB6);
                        a8i.d dVar5 = new a8i.d(aVarB6);
                        a8i.e eVar7 = new a8i.e();
                        p2b.j jVarH2 = lVar6.F.h();
                        vc.s.j(jVarH2);
                        com.revolut.feature_move_money.impl.flow.delegate.a aVar17 = new com.revolut.feature_move_money.impl.flow.delegate.a(aVar15, vVar, dVar4, aVar16, gVar3, dVar5, eVar7, new a8i.b(jVarH2));
                        t99.k kVarA = ((s99.a) lVar4.D).a();
                        vc.s.j(kVarA);
                        o7i.h walletBalanceLimitBottomSheetFactory = new o7i.h();
                        p7i.b moveMoneyKillSwitchDialogFactory = new p7i.b();
                        o7i.a cfdMarginCallRiskIncreaseBottomSheetFactory = new o7i.a();
                        Intrinsics.checkNotNullParameter(walletBalanceLimitBottomSheetFactory, "walletBalanceLimitBottomSheetFactory");
                        Intrinsics.checkNotNullParameter(moveMoneyKillSwitchDialogFactory, "moveMoneyKillSwitchDialogFactory");
                        Intrinsics.checkNotNullParameter(cfdMarginCallRiskIncreaseBottomSheetFactory, "cfdMarginCallRiskIncreaseBottomSheetFactory");
                        return new com.revolut.feature_move_money.impl.flow.e(fVarD, moveMoneyInputData3, g1Var, cVarB2, aVar17, kVarA, new o7i.b(), new o7i.g(), mVar.f277846b, mVar.f277847c, (x7i.e) mVar.f277852m.get(), new b7i.f(mVar.j(), lVar6.z.h(), new b7i.g(), new b7i.d()));
                    case 9:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) mVar.o.get();
                        b8i.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return rp0.x0.a(g1.Companion, controller.D2());
                    default:
                        throw new AssertionError(i21);
                }
                return bVar;
            case 6:
                u7i.r rVar = (u7i.r) this.d;
                u7i.l lVar7 = rVar.f277892b;
                int i22 = this.f277245c;
                if (i22 == 0) {
                    ppk.f fVarA = lVar7.g0.a();
                    u80.t tVarU = lVar7.f277824c.u();
                    vc.s.j(tVarU);
                    return new v6i.m(new tb4.t(fVarA, tVarU), ((u7i.l) this.f277244b).f277833m.c(), (cli.n) rVar.f277893c.get(), rVar.f277891a);
                }
                if (i22 != 1) {
                    throw new AssertionError(i22);
                }
                t70.b bVarG = lVar7.f277824c.g();
                vc.s.j(bVarG);
                n8b.a aVarA8 = lVar7.V.a();
                vc.s.j(aVarA8);
                return new qee.s(new x6i.b(bVarG, aVarA8));
            case 7:
                u8b.b bVar8 = (u8b.b) this.d;
                int i32 = this.f277245c;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new z8b.k();
                    }
                    throw new AssertionError(i32);
                }
                cli.n nVar5 = (cli.n) bVar8.f278152b.get();
                z8b.h hVar2 = bVar8.f278151a;
                u8b.a aVar18 = (u8b.a) this.f277244b;
                fk3.a aVarA9 = aVar18.f278150c.a();
                vc.s.j(aVarA9);
                nw5.j jVarD = aVar18.d.d();
                vc.s.j(jVarD);
                xv5.c cVarA3 = aVar18.e.a();
                vc.s.j(cVarA3);
                return new z8b.j(nVar5, hVar2, new x8b.d(aVarA9, jVarD, cVarA3));
            case 8:
                u8h.a aVar19 = (u8h.a) this.d;
                u8h.b bVar9 = (u8h.b) this.f277244b;
                int i33 = this.f277245c;
                if (i33 == 0) {
                    aah.i factory2 = (aah.i) bVar9.f278210p.get();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return factory2.a();
                }
                if (i33 == 1) {
                    return new dah.k(new dah.j((q1) aVar19.e.get()), aVar19.f278199b, new zjh.j((z0h.d) aVar19.f278200c.k.get()));
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                aah.i factory3 = (aah.i) bVar9.f278210p.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.b();
            case 9:
                uac.e eVar8 = (uac.e) this.d;
                uac.f fVar3 = (uac.f) this.f277244b;
                ite.a aVar20 = fVar3.f278572b;
                vac.a aVar21 = fVar3.f278571a;
                int i43 = this.f277245c;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new AssertionError(i43);
                    }
                    com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) eVar8.f278570c.get();
                    mbc.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    return new rp0.l0(controller2.m2());
                }
                OrderDetailsScreenContract$InputData orderDetailsScreenContract$InputData = eVar8.f278568a;
                nbc.c cVar4 = new nbc.c();
                rp0.l0 l0Var = (rp0.l0) eVar8.d.get();
                tul.b bVar10 = new tul.b(aVar21.b());
                tul.b bVar11 = new tul.b(aVar21.b());
                gte.a aVarB7 = aVar20.b();
                vc.s.j(aVarB7);
                ash.i iVarI2 = ((tc7.d) fVar3.f278573c).i();
                vc.s.j(iVarI2);
                wac.d dVar6 = new wac.d(bVar11, aVarB7, iVarI2);
                whf.b transactionsContentProvider = fVar3.d.a();
                vc.s.j(transactionsContentProvider);
                nyb.m0 revPointsTransactionsInteractor = fVar3.e.g();
                vc.s.j(revPointsTransactionsInteractor);
                Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
                Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
                ryc.a aVar22 = new ryc.a();
                aVar22.f258289a = transactionsContentProvider;
                aVar22.f258290b = revPointsTransactionsInteractor;
                gte.a aVarB8 = aVar20.b();
                vc.s.j(aVarB8);
                lsh.b bVar12 = (lsh.b) fVar3.f.f155055m.get();
                vc.s.j(bVar12);
                c70.a aVarZ3 = fVar3.f278574g.z();
                vc.s.j(aVarZ3);
                kac.e eVar9 = (kac.e) aVar21.o.get();
                vc.s.j(eVar9);
                nbc.d dVar7 = new nbc.d(eVar8.b());
                nbc.b bVarB4 = eVar8.b();
                uac.f fVar4 = eVar8.f278569b;
                kac.e eVar10 = (kac.e) fVar4.f278571a.o.get();
                vc.s.j(eVar10);
                kbc.c cVar5 = new kbc.c();
                gte.a aVarB9 = fVar4.f278572b.b();
                vc.s.j(aVarB9);
                return new com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a(orderDetailsScreenContract$InputData, cVar4, l0Var, bVar10, dVar6, aVar22, aVarB8, bVar12, aVarZ3, eVar9, new lbc.c0(dVar7, bVarB4, eVar10, cVar5, aVarB9));
            case 10:
                uac.h hVar3 = (uac.h) this.d;
                int i59 = this.f277245c;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) hVar3.f278582c.get();
                    sbc.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller3, "controller");
                    return new rp0.l0(controller3.m2());
                }
                ShippingTrackingScreenContract$InputData shippingTrackingScreenContract$InputData = hVar3.f278580a;
                rbc.a aVar23 = new rbc.a();
                rp0.l0 l0Var2 = (rp0.l0) hVar3.d.get();
                c70.a aVarZ4 = ((uac.f) this.f277244b).f278574g.z();
                vc.s.j(aVarZ4);
                return new com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a(shippingTrackingScreenContract$InputData, aVar23, l0Var2, aVarZ4, new rbc.q(new tbc.c(hVar3.b()), hVar3.b(), new kbc.b()));
            case 11:
                ubf.d dVar8 = (ubf.d) this.f277244b;
                ubf.a aVar24 = (ubf.a) this.d;
                int i66 = this.f277245c;
                switch (i66) {
                    case 0:
                        return kxa.j.l((j60.a) aVar24.d.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) aVar24.f278847b.get(), (rp0.m) aVar24.f278848c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        jki.p pVar = (jki.p) aVar24.f278851j.get();
                        kbf.a aVar25 = (kbf.a) dVar8.E.get();
                        ang.f fVarE = dVar8.f278866q.e();
                        wbf.o oVar = (wbf.o) dVar8.F.get();
                        lbf.f fVar5 = aVar24.f278846a;
                        ccf.u uVar = (ccf.u) aVar24.k.get();
                        wbf.b bVar13 = (wbf.b) dVar8.V.get();
                        wbf.i iVar = (wbf.i) dVar8.W.get();
                        acf.h hVar4 = (acf.h) aVar24.f278852l.get();
                        ybl.l lVarF = dVar8.f.f();
                        gte.a aVarB10 = dVar8.e.b();
                        vc.s.j(aVarB10);
                        return new ccf.t(pVar, aVar25, fVarE, oVar, fVar5, uVar, bVar13, iVar, hVar4, lVarF, aVarB10);
                    case 4:
                        return new ccf.a((acf.c) aVar24.f.get(), (acf.c) aVar24.f278849g.get(), (acf.a) aVar24.f278850h.get(), (acf.k) aVar24.i.get());
                    case 5:
                        return new acf.e();
                    case 6:
                        return new acf.f();
                    case 7:
                        return new acf.b();
                    case 8:
                        return new acf.k();
                    case 9:
                        return new ccf.v();
                    case 10:
                        return new acf.j();
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                ubf.e eVar11 = (ubf.e) this.d;
                int i74 = this.f277245c;
                if (i74 == 0) {
                    return kxa.j.m((j60.a) eVar11.f.get());
                }
                if (i74 == 1) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) eVar11.d.get(), (rp0.m) eVar11.e.get());
                }
                if (i74 == 2) {
                    return new rp0.m();
                }
                if (i74 != 3) {
                    throw new AssertionError(i74);
                }
                gte.a aVarB11 = ((ubf.d) this.f277244b).e.b();
                vc.s.j(aVarB11);
                return new com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.a(aVarB11);
            case 13:
                uc9.c cVar6 = (uc9.c) this.d;
                int i92 = this.f277245c;
                if (i92 == 0) {
                    yc9.h hVar5 = new yc9.h();
                    RevolutCardReadyScreenContract$InputData revolutCardReadyScreenContract$InputData = cVar6.f279008a;
                    da3.j jVar3 = cVar6.f279010c.f279005a;
                    l93.f fVarJ = jVar3.j();
                    vc.s.j(fVarJ);
                    ha3.f fVarD2 = jVar3.d();
                    vc.s.j(fVarD2);
                    return new yc9.g(hVar5, revolutCardReadyScreenContract$InputData, new ja3.f(cVar6.f279009b, (c90.c) cVar6.f.get(), fVarD2, fVarJ, (yy0.f) cVar6.e.get()), t2d.c.c(((uc9.b) this.f277244b).f279006b.f271230a));
                }
                if (i92 != 1) {
                    if (i92 != 2) {
                        throw new AssertionError(i92);
                    }
                    com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) cVar6.d.get();
                    zc9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller4, "controller");
                    return new c90.c(controller4.m2());
                }
                com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) cVar6.d.get();
                zc9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller5, "controller");
                yy0.f fVarQ = jh.d.f(controller5.m2()).Q();
                vc.s.k(fVarQ);
                return fVarQ;
            case 14:
                ufg.a aVar26 = (ufg.a) this.d;
                TravelMilesAccountRegistrationTaxIdScreenContract$InputData travelMilesAccountRegistrationTaxIdScreenContract$InputData = aVar26.f279661a;
                int i96 = this.f277245c;
                if (i96 == 0) {
                    return new sgg.j((cli.n) aVar26.f279662b.get(), travelMilesAccountRegistrationTaxIdScreenContract$InputData, (vfg.d) ((ufg.g) this.f277244b).I.get());
                }
                if (i96 == 1) {
                    return new sgg.l(travelMilesAccountRegistrationTaxIdScreenContract$InputData);
                }
                throw new AssertionError(i96);
            case 15:
                w1c.j jVar4 = ((ufg.g) this.f277244b).f279716m;
                int i99 = this.f277245c;
                if (i99 == 0) {
                    ufg.b bVar14 = (ufg.b) this.d;
                    return new com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a(bVar14.f279667a, (tig.b) bVar14.d.get(), jVar4.a(), jVar4.b());
                }
                if (i99 == 1) {
                    return new tig.d(new agg.d());
                }
                throw new AssertionError(i99);
            case 16:
                ufg.c cVar7 = (ufg.c) this.d;
                ufg.g gVar4 = cVar7.f279674b;
                ufg.g gVar5 = (ufg.g) this.f277244b;
                int i100 = this.f277245c;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new AssertionError(i100);
                    }
                    f01.c cVarG = gVar5.f279717n.g();
                    agg.d dVar9 = new agg.d();
                    xgg.e eVar12 = new xgg.e(gVar4.f279717n.g());
                    agg.d travelMilesFormatter = new agg.d();
                    Intrinsics.checkNotNullParameter(travelMilesFormatter, "travelMilesFormatter");
                    return new vgg.c0(cVarG, dVar9, eVar12, new xgg.c(), new xgg.f());
                }
                cli.n nVar6 = (cli.n) cVar7.f279675c.get();
                TravelMilesAirlineDetailsScreenContract$InputData travelMilesAirlineDetailsScreenContract$InputData = cVar7.f279673a;
                vfg.e eVar13 = (vfg.e) gVar5.M.get();
                nyb.k kVarC = gVar5.f279712g.c();
                vc.s.j(kVarC);
                jwb.e eVarB = gVar5.i.b();
                vc.s.j(eVarB);
                vfg.d dVar10 = (vfg.d) gVar5.I.get();
                gte.a aVarB12 = gVar5.e.b();
                vc.s.j(aVarB12);
                sf0.h hVarB3 = gVar4.o.b();
                vc.s.j(hVarB3);
                qgg.c cVar8 = new qgg.c(hVarB3);
                nne.b bVar15 = (nne.b) gVar5.f279718p.o.get();
                vc.s.j(bVar15);
                return new com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b(nVar6, travelMilesAirlineDetailsScreenContract$InputData, eVar13, kVarC, eVarB, dVar10, aVarB12, cVar8, bVar15);
            case 17:
                return a();
            case 18:
                return b();
            case 19:
                return c();
            case 20:
                return d();
            case 21:
                int i101 = this.f277245c;
                if (i101 == 0) {
                    return new jig.e((cli.n) ((ufg.v) this.d).f279798a.get(), ((ufg.g) this.f277244b).c());
                }
                if (i101 == 1) {
                    return new jig.f();
                }
                throw new AssertionError(i101);
            case 22:
                return e();
            case 23:
                return f();
            case 24:
                return g();
            case 25:
                return h();
            case 26:
                return i();
            case 27:
                return j();
            case 28:
                return k();
            default:
                ufg.g0 g0Var = (ufg.g0) this.d;
                ufg.g gVar6 = (ufg.g) this.f277244b;
                int i102 = this.f277245c;
                switch (i102) {
                    case 0:
                        return kxa.j.k((j60.a) g0Var.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) g0Var.f279727b.get(), (rp0.m) g0Var.f279728c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        fd6.a aVar27 = (fd6.a) g0Var.f279729g.get();
                        va.g.t(aVar27);
                        return aVar27;
                    case 4:
                        return va.g.s(((zc6.a) gVar6.u).d(), (xc6.a) g0Var.f.get());
                    case 5:
                        return r6.b.k((zc6.a) gVar6.u, "factory");
                    case 6:
                        dyb.a extension3 = (dyb.a) g0Var.i.get();
                        fig.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 7:
                        o7.b provider = gVar6.f279712g.d();
                        fig.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        dyb.a aVarE3 = provider.e();
                        vc.s.k(aVarE3);
                        return aVarE3;
                    case 8:
                        bgg.a aVar28 = (bgg.a) g0Var.k.get();
                        cdj.b.C(aVar28);
                        return aVar28;
                    case 9:
                        return new bgg.b(new eig.u(), (j60.a) g0Var.d.get(), (vfg.d) gVar6.I.get());
                    case 10:
                        return va.g.u((xc6.a) g0Var.f.get());
                    case 11:
                        cli.n nVar7 = (cli.n) g0Var.f279734n.get();
                        e4m.e eVar14 = gVar6.I;
                        zxb.k0 k0Var2 = gVar6.f279712g;
                        vfg.d dVar11 = (vfg.d) eVar14.get();
                        j60.a aVar29 = (j60.a) g0Var.d.get();
                        vfg.e eVar15 = (vfg.e) gVar6.M.get();
                        gfg.c cVar9 = (gfg.c) gVar6.P.get();
                        nyb.m0 m0VarG = k0Var2.g();
                        vc.s.j(m0VarG);
                        nyb.k kVarC2 = k0Var2.c();
                        vc.s.j(kVarC2);
                        dyb.a aVar30 = (dyb.a) g0Var.i.get();
                        lfg.o oVarB = gVar6.b();
                        a29.b bVarA3 = gVar6.f279723w.a();
                        vc.s.j(bVarA3);
                        return new com.revolut.feature.travel.miles.impl.ui.screen.main.e(nVar7, dVar11, aVar29, eVar15, cVar9, m0VarG, kVarC2, aVar30, oVarB, bVarA3, (bgg.a) g0Var.k.get(), ((zc6.a) gVar6.u).b());
                    case 12:
                        fub.k kVarD = gVar6.k.d();
                        vc.s.j(kVarD);
                        return new eig.t(kVarD, new ugg.b(), ((zc6.a) gVar6.u).c());
                    default:
                        throw new AssertionError(i102);
                }
        }
    }
}
