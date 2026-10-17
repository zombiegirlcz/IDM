package ufg;

import android.content.Context;
import android.view.View;
import au6.u1;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreenContract$InputData;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$InputData;
import com.revolut.feature.wealth.private_equity.api.WealthPrivateEquityApi$Toggles$PreTradeStateRevamp;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$FundDetailsScreenConfig;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import et6.b1;
import et6.f1;
import et6.h1;
import et6.h3;
import et6.j3;
import et6.k3;
import et6.p1;
import et6.y1;
import i60.b;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rp0.g1;
import rp0.k1;
import rp0.x0;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f279757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f279758c;
    public final Object d;

    public /* synthetic */ k0(Object obj2, Object obj3, int i, int i2) {
        this.f279756a = i2;
        this.f279757b = obj2;
        this.d = obj3;
        this.f279758c = i;
    }

    private final Object a() {
        us2.j jVar = (us2.j) this.f279757b;
        k5j.c cVar = jVar.f282408a;
        us2.i iVar = (us2.i) this.d;
        us2.j jVar2 = iVar.f282405a;
        int i = this.f279758c;
        if (i == 0) {
            vu.d dVar = (vu.d) jVar.f282412h.get();
            n5j.i iVar2 = (n5j.i) jVar.d.f181515b.get();
            vc.s.j(iVar2);
            c70.a aVarZ = jVar.e.z();
            vc.s.j(aVarZ);
            return new ht2.w(dVar, iVar2, aVarZ, (g1) iVar.f282407c.get(), (zs2.b) iVar.d.get(), (cli.n) iVar.e.get());
        }
        if (i == 1) {
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) iVar.f282406b.get();
            it2.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return x0.a(g1.Companion, controller.D2());
        }
        if (i == 2) {
            vu.g gVarA = cVar.a();
            vc.s.j(gVarA);
            return new zs2.c(gVarA);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        vu.g gVarA2 = jVar2.f282408a.a();
        vc.s.j(gVarA2);
        fnc.s commonSection = new fnc.s(gVarA2);
        jt2.g itemsSection = iVar.b();
        vu.b cdnProvider = (vu.b) jVar2.f282408a.f.get();
        vc.s.j(cdnProvider);
        Intrinsics.checkNotNullParameter(commonSection, "commonSection");
        Intrinsics.checkNotNullParameter(itemsSection, "itemsSection");
        Intrinsics.checkNotNullParameter(cdnProvider, "cdnProvider");
        r10.w wVar = new r10.w();
        wVar.f250865a = commonSection;
        wVar.f250866b = itemsSection;
        vu.g gVarA3 = jVar2.f282408a.a();
        vc.s.j(gVarA3);
        fnc.s sVar = new fnc.s(gVarA3);
        jt2.g gVarB = iVar.b();
        vu.b bVar = (vu.b) jVar2.f282408a.f.get();
        vc.s.j(bVar);
        jt2.u uVar = new jt2.u(sVar, gVarB, bVar);
        vu.c cVar2 = (vu.c) cVar.k.get();
        vc.s.j(cVar2);
        return new ht2.x(wVar, uVar, cVar2);
    }

    private final Object b() {
        int i = this.f279758c;
        if (i == 0) {
            return new fx6.i((h1) ((us6.q) this.f279757b).c0.get(), (cli.n) ((us6.c) this.d).f282468a.get());
        }
        if (i == 1) {
            return new fx6.j();
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        us6.d dVar = (us6.d) this.d;
        int i = this.f279758c;
        if (i == 0) {
            return kxa.j.k((j60.a) dVar.f282483c.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) dVar.f282481a.get(), (rp0.m) dVar.f282482b.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            Object extension = (kda.b) dVar.e.get();
            d07.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 4) {
            if (i == 5) {
                return new c07.e((kda.b) dVar.e.get(), new c07.f());
            }
            throw new AssertionError(i);
        }
        j60.a bottomDialogControllerExtension = (j60.a) dVar.f282483c.get();
        ct6.n factory = (ct6.n) ((us6.q) this.f279757b).f282698p1.get();
        d07.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(bottomDialogControllerExtension);
    }

    private final Object d() {
        us6.q qVar = (us6.q) this.f279757b;
        int i = this.f279758c;
        if (i == 0) {
            r10.f fVarD = qVar.f282712w.d();
            j3 j3Var = (j3) qVar.A1.get();
            us6.e eVar = (us6.e) this.d;
            return new a07.r(fVarD, j3Var, eVar.f282498a, (cli.n) eVar.f282499b.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        gr6.e eVarA = qVar.f282692n.a();
        vc.s.j(eVarA);
        return new a07.t(eVarA, new l07.a());
    }

    private final Object e() {
        us6.f fVar = (us6.f) this.d;
        us6.q qVar = (us6.q) this.f279757b;
        int i = this.f279758c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f282533b.get();
            gu6.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return x0.a(g1.Companion, controller.D2());
        }
        b9k.f fVarC = qVar.c();
        c70.a aVarZ = qVar.f282691m.z();
        vc.s.j(aVarZ);
        gr6.a aVarA = qVar.f282681h.a();
        vc.s.j(aVarA);
        FreelancerAcquiringOrderDetailsScreenContract$InputData freelancerAcquiringOrderDetailsScreenContract$InputData = fVar.f282532a;
        o7.b bVar = new o7.b((u1) qVar.f282716x1.get());
        tqi.g gVarE = qVar.o.e();
        g1 g1Var = (g1) fVar.f282534c.get();
        qu6.b bVarA = us6.q.a();
        hu6.a aVar = new hu6.a();
        ru6.e eVar = new ru6.e(new iu6.j());
        ru6.k kVar = new ru6.k(new jw6.d());
        ru6.h hVar = new ru6.h();
        ru6.f fVar2 = new ru6.f();
        ru6.l lVar = new ru6.l();
        ru6.n nVar = new ru6.n();
        ru6.m mVar = new ru6.m();
        ru6.p pVar = new ru6.p();
        ru6.w wVar = new ru6.w(new qu6.d(new wu6.b(), new hv6.b(new wu6.b())));
        iu6.j clauseFactory = new iu6.j();
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
        return new com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a(fVarC, aVarZ, aVarA, freelancerAcquiringOrderDetailsScreenContract$InputData, bVar, gVarE, g1Var, new fu6.t(bVarA, aVar, eVar, kVar, hVar, fVar2, lVar, nVar, mVar, pVar, wVar, new ru6.y(), new ru6.z(), new ru6.a0()));
    }

    private final Object f() {
        us6.q qVar = (us6.q) this.f279757b;
        us6.k kVar = (us6.k) this.d;
        us6.q qVar2 = kVar.f282596b;
        int i = this.f279758c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) kVar.f282597c.get();
            vu6.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return x0.a(g1.Companion, controller.D2());
        }
        et6.z zVarD = qVar.d();
        b9k.f acquiringOrderInteractor = qVar.c();
        et6.z acquiringPaymentInteractor = qVar.d();
        f1 equivalentAmountInteractor = qVar.e();
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(acquiringPaymentInteractor, "acquiringPaymentInteractor");
        Intrinsics.checkNotNullParameter(equivalentAmountInteractor, "equivalentAmountInteractor");
        r10.r rVar = new r10.r();
        rVar.f250851a = acquiringOrderInteractor;
        rVar.f250852b = acquiringPaymentInteractor;
        rVar.f250853c = equivalentAmountInteractor;
        c70.a aVarZ = qVar.f282691m.z();
        vc.s.j(aVarZ);
        FreelancerAcquiringPaymentDetailsScreenContract$InputData freelancerAcquiringPaymentDetailsScreenContract$InputData = kVar.f282595a;
        g1 g1Var = (g1) kVar.d.get();
        Context context = qVar2.d;
        vu6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        phm.a aVar = (phm.a) ue0.e.j(context).a().get(djf.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
        }
        whf.b bVarA = ((djf.c) aVar2.b()).a();
        vc.s.k(bVarA);
        hv6.b bVar = new hv6.b(new wu6.b());
        iv6.c cVar = new iv6.c(new jw6.d(), new jw6.c(qVar2.o.g()));
        iv6.d dVar = new iv6.d();
        iv6.f fVar = new iv6.f(us6.q.a());
        iv6.i factory = new iv6.i();
        Context context2 = qVar2.d;
        phm.a aVar3 = (phm.a) kii.e.l(context2, "context", context2, djf.c.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
        }
        thf.g transactionItemMapper = ((djf.c) aVar4.b()).e();
        vc.s.k(transactionItemMapper);
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        iv6.h hVar = new iv6.h(transactionItemMapper);
        iv6.j jVar = new iv6.j();
        wu6.b paymentClauseFactory = new wu6.b();
        Intrinsics.checkNotNullParameter(paymentClauseFactory, "paymentClauseFactory");
        iv6.l lVar = new iv6.l();
        wu6.d timelineClauseFactory = new wu6.d();
        Intrinsics.checkNotNullParameter(timelineClauseFactory, "timelineClauseFactory");
        return new com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a(zVarD, rVar, aVarZ, freelancerAcquiringPaymentDetailsScreenContract$InputData, g1Var, bVarA, new uu6.r(bVar, cVar, dVar, fVar, hVar, jVar, lVar, new iv6.o(), new iv6.p(), new iv6.q()));
    }

    private final Object g() {
        us6.q qVar = (us6.q) this.f279757b;
        us6.o oVar = (us6.o) this.d;
        int i = this.f279758c;
        if (i == 0) {
            b1 b1Var = (b1) qVar.f282682h0.get();
            zi1.d dVarA = qVar.E.a();
            vc.s.j(dVarA);
            return new zv6.k(b1Var, dVarA, oVar.f282638a, (jki.p) oVar.f282640c.get());
        }
        if (i == 1) {
            return new zv6.l((zzl.b) oVar.f282639b.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        aw6.a.Companion.getClass();
        return new zzl.c();
    }

    private final Object h() {
        int i = this.f279758c;
        if (i != 0) {
            if (i == 1) {
                return new bw6.m();
            }
            throw new AssertionError(i);
        }
        p1 p1Var = (p1) ((us6.q) this.f279757b).f282693n0.get();
        us6.p pVar = (us6.p) this.d;
        return new bw6.l(p1Var, pVar.f282654a, (cli.n) pVar.f282655b.get());
    }

    private final Object i() {
        us6.s sVar = (us6.s) this.d;
        us6.d0 d0Var = (us6.d0) this.f279757b;
        int i = this.f279758c;
        if (i != 0) {
            if (i == 1) {
                return new jz6.o(sVar.f282740a, (sz6.a) d0Var.f282488g.get(), (lz6.c) d0Var.f282489h.get(), (cli.n) sVar.f282742c.get());
            }
            if (i == 2) {
                return new jz6.p();
            }
            throw new AssertionError(i);
        }
        lz6.c extension = (lz6.c) d0Var.f282489h.get();
        kz6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    private final Object j() {
        us6.t tVar = (us6.t) this.d;
        int i = this.f279758c;
        if (i == 0) {
            return new h07.j((k3) ((us6.q) this.f279757b).f282688k1.get(), new h07.l(), (cli.n) tVar.f282752b.get(), tVar.f282751a);
        }
        if (i == 1) {
            return new h07.k();
        }
        throw new AssertionError(i);
    }

    private final Object k() {
        us6.y yVar = (us6.y) this.d;
        int i = this.f279758c;
        if (i == 0) {
            return new j07.i((k3) ((us6.q) this.f279757b).f282688k1.get(), (jki.p) yVar.f282808c.get(), yVar.f282806a);
        }
        if (i == 1) {
            return new j07.j((zzl.b) yVar.f282807b.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        k07.a.Companion.getClass();
        return new zzl.c();
    }

    private final Object l() {
        us6.b0 b0Var = (us6.b0) this.d;
        us6.q qVar = b0Var.f282456b;
        us6.q qVar2 = (us6.q) this.f279757b;
        int i = this.f279758c;
        if (i == 0) {
            Object extension = (ex6.b) b0Var.d.get();
            z17.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            sf0.h hVarB = qVar.H.b();
            vc.s.j(hVarB);
            v60.e eVarA = qVar.I.a();
            vc.s.j(eVarA);
            ex6.d extension2 = new ex6.d(hVarB, eVarA);
            z17.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension2, "extension");
            return extension2;
        }
        if (i == 2) {
            a27.k kVar = new a27.k((gr6.k) qVar.f282715x0.get(), (jr6.o) qVar.O0.get(), (gr6.p) qVar.L0.get(), (h3) qVar.f282677e1.get());
            FreelancerNewSaleFlowContract$InputData freelancerNewSaleFlowContract$InputData = b0Var.f282455a;
            gr6.a aVarA = qVar2.f282681h.a();
            vc.s.j(aVarA);
            return new com.revolut.feature.freelancer.impl.ui.sales.new_sale.a(kVar, freelancerNewSaleFlowContract$InputData, aVarA, (jr6.m) qVar2.T0.get(), (gr6.p) qVar2.L0.get(), (ex6.b) b0Var.d.get());
        }
        if (i != 3) {
            if (i == 4) {
                return new com.revolut.feature.freelancer.impl.ui.onboarding.validation.a((y1) qVar2.f282701r0.get());
            }
            throw new AssertionError(i);
        }
        k3 k3Var = (k3) qVar2.f282688k1.get();
        wj0.a aVarI = ((nj0.d) qVar2.K).i();
        vc.s.j(aVarI);
        return new e17.j(k3Var, aVarI, (sz6.a) b0Var.f282458g.get());
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        Object cVar;
        Object k1Var;
        Object bVar;
        switch (this.f279756a) {
            case 0:
                l0 l0Var = (l0) this.d;
                g gVar2 = l0Var.f279764c;
                g gVar3 = (g) this.f279757b;
                zxb.k0 k0Var = gVar3.f279712g;
                int i = this.f279758c;
                if (i == 0) {
                    n60.a aVar = (n60.a) l0Var.e.get();
                    o5k.i.l(aVar);
                    return aVar;
                }
                if (i == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) l0Var.d.get());
                }
                if (i != 2) {
                    throw new AssertionError(i);
                }
                TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData = l0Var.f279763b;
                agg.d dVar = new agg.d();
                agg.a aVar2 = new agg.a();
                qd0.b bVarN = gVar2.f279720r.n();
                vc.s.j(bVarN);
                pig.a0 a0Var = new pig.a0(travelMilesTransferScreenContract$InputData, dVar, aVar2, new pgg.b(bVarN));
                i90.b bVar2 = new i90.b();
                TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData2 = l0Var.f279763b;
                nyb.k kVarC = k0Var.c();
                vc.s.j(kVarC);
                wsg.n nVarB = gVar3.f279721s.b();
                vfg.d dVar2 = (vfg.d) gVar3.I.get();
                qd0.b bVarN2 = gVar2.f279720r.n();
                vc.s.j(bVarN2);
                pig.b bVar3 = new pig.b(bVarN2);
                wj0.a aVarI = ((nj0.d) gVar3.f279709a).i();
                vc.s.j(aVarI);
                n60.a aVar3 = (n60.a) l0Var.e.get();
                agg.a aVar4 = new agg.a();
                gte.a aVarB = gVar3.e.b();
                vc.s.j(aVarB);
                wub.a aVarA = gVar3.f279722t.a();
                vc.s.j(aVarA);
                nyb.i0 i0VarF = k0Var.f();
                vc.s.j(i0VarF);
                return new com.revolut.feature.travel.miles.impl.ui.screen.transfer.a(a0Var, bVar2, travelMilesTransferScreenContract$InputData2, kVarC, nVarB, dVar2, bVar3, aVarI, aVar3, aVar4, aVarB, aVarA, i0VarF);
            case 1:
                l0 l0Var2 = (l0) this.d;
                g gVar4 = l0Var2.f279764c;
                g gVar5 = (g) this.f279757b;
                zxb.k0 k0Var2 = gVar5.f279712g;
                int i2 = this.f279758c;
                if (i2 == 0) {
                    n60.a aVar5 = (n60.a) l0Var2.e.get();
                    o5k.i.l(aVar5);
                    return aVar5;
                }
                if (i2 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) l0Var2.d.get());
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData3 = l0Var2.f279763b;
                agg.d dVar3 = new agg.d();
                agg.a aVar6 = new agg.a();
                qd0.b bVarN3 = gVar4.f279720r.n();
                vc.s.j(bVarN3);
                pig.a0 a0Var2 = new pig.a0(travelMilesTransferScreenContract$InputData3, dVar3, aVar6, new pgg.b(bVarN3));
                i90.b bVar4 = new i90.b();
                TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData4 = l0Var2.f279763b;
                nyb.k kVarC2 = k0Var2.c();
                vc.s.j(kVarC2);
                wsg.n nVarB2 = gVar5.f279721s.b();
                vfg.d dVar4 = (vfg.d) gVar5.I.get();
                qd0.b bVarN4 = gVar4.f279720r.n();
                vc.s.j(bVarN4);
                pig.b bVar5 = new pig.b(bVarN4);
                wj0.a aVarI2 = ((nj0.d) gVar5.f279709a).i();
                vc.s.j(aVarI2);
                n60.a aVar7 = (n60.a) l0Var2.e.get();
                agg.a aVar8 = new agg.a();
                gte.a aVarB2 = gVar5.e.b();
                vc.s.j(aVarB2);
                wub.a aVarA2 = gVar5.f279722t.a();
                vc.s.j(aVarA2);
                nyb.i0 i0VarF2 = k0Var2.f();
                vc.s.j(i0VarF2);
                return new com.revolut.feature.travel.miles.impl.ui.screen.transfer.a(a0Var2, bVar4, travelMilesTransferScreenContract$InputData4, kVarC2, nVarB2, dVar4, bVar5, aVarI2, aVar7, aVar8, aVarB2, aVarA2, i0VarF2);
            case 2:
                ufh.a aVar9 = (ufh.a) this.d;
                ufh.i iVar = (ufh.i) this.f279757b;
                int i3 = this.f279758c;
                switch (i3) {
                    case 0:
                        return efk.j.d((dtl.a) aVar9.f279818m.get());
                    case 1:
                        return efk.j.q(iVar.e.a(), aVar9.f279811a, (dtl.b) aVar9.f279817l.get());
                    case 2:
                        return efk.j.r(iVar.e.a());
                    case 3:
                        return f0k.d.g(aVar9.f279812b, ((z3h.g) iVar.f).h(), (e3h.d) aVar9.o.get(), aVar9.d);
                    case 4:
                        FundDetailsContract$InputData inputData = aVar9.f279813c;
                        FundDetailsContract$FundDetailsScreenConfig fundDetailsContract$FundDetailsScreenConfig = inputData.f95733a;
                        gte.a featureToggleInteractor = iVar.f279853g.b();
                        vc.s.j(featureToggleInteractor);
                        zfh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        boolean zC = ((jte.d) featureToggleInteractor).c(WealthPrivateEquityApi$Toggles$PreTradeStateRevamp.f95727c);
                        TradingAccountType.Gia gia = TradingAccountType.Gia.f105270a;
                        if (zC) {
                            String str = fundDetailsContract$FundDetailsScreenConfig.f95732a;
                            eel.c cVar2 = eel.c.ONE_YEAR;
                            return new e3h.d(str, zhm.u.c(cVar2), cVar2, y0.b(gia), false, null, true, true, false, null, 1056);
                        }
                        String str2 = fundDetailsContract$FundDetailsScreenConfig.f95732a;
                        eel.c cVar3 = eel.c.SIX_MONTHS;
                        eel.c cVar4 = eel.c.ONE_YEAR;
                        return new e3h.d(str2, zhm.v.k(cVar3, cVar4, eel.c.FIVE_YEAR, eel.c.ALL), cVar4, y0.b(gia), false, null, false, false, true, null, 1056);
                    case 5:
                        return oyj.c.f(((z3h.g) iVar.f).a(), aVar9.e, (n2h.a) aVar9.f279822r.get());
                    case 6:
                        jid.z zVarA = ((z3h.g) iVar.f).a();
                        FundDetailsContract$InputData inputData2 = aVar9.f279813c;
                        yfh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        return oyj.c.h(zVarA, new n2h.e(inputData2.f95733a.f95732a, true), new tnb.g0((gdh.a) aVar9.f279821q.get()));
                    case 7:
                        kbb.c factory = iVar.f279854h.a();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.s();
                    case 8:
                        ViewController view = aVar9.f;
                        zfh.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        return (FundDetailsScreen) view;
                    case 9:
                        return kii.e.j((u8h.b) iVar.i, "factory");
                    case 10:
                        fsl.t tVarA = iVar.f279855j.a();
                        vc.s.j(tVarA);
                        return fp8.c.p(tVarA, aVar9.f279814g, (fsl.i) aVar9.f279825w.get());
                    case 11:
                        fsl.t tVarA2 = iVar.f279855j.a();
                        vc.s.j(tVarA2);
                        return fp8.c.q(tVarA2, (fsl.c) aVar9.v.get());
                    case 12:
                        zfh.e.Companion.getClass();
                        return new zfh.c();
                    case 13:
                        return ige.d.m(iVar.k.b(), (htl.g) aVar9.f279827y.get(), (htl.d) aVar9.z.get());
                    case 14:
                        return ige.d.n(iVar.k.b());
                    case 15:
                        m2h.b bVar6 = iVar.f;
                        return vtc.p0.h(new a4h.c(), aVar9.f279815h, (v2h.b) aVar9.B.get());
                    case 16:
                        m2h.b bVar7 = iVar.f;
                        a4h.c factory2 = new a4h.c();
                        w2h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return new a4h.b();
                    case 17:
                        hbh.j jVarA = iVar.f279856l.a();
                        vc.s.j(jVarA);
                        return hy1.g.k(jVarA, aVar9.i, (h1h.b) aVar9.D.get());
                    case 18:
                        hbh.j jVarA2 = iVar.f279856l.a();
                        vc.s.j(jVarA2);
                        return hy1.g.l(jVarA2);
                    case 19:
                        f1h.c cVarA = iVar.f279857m.a();
                        vc.s.j(cVarA);
                        return fp8.c.s(cVarA, (f1h.f) aVar9.F.get(), (f1h.b) aVar9.G.get());
                    case 20:
                        f1h.c cVarA2 = iVar.f279857m.a();
                        vc.s.j(cVarA2);
                        return fp8.c.t(cVarA2);
                    case 21:
                        return efk.j.e((dtl.b) aVar9.f279817l.get());
                    case 22:
                        zdl.c cVar5 = iVar.f279858n;
                        zdl.f fVar = iVar.f279851b;
                        zdl.c cVar6 = iVar.f279858n;
                        ael.d0 d0VarK = cVar5.k();
                        vc.s.j(d0VarK);
                        ael.q qVarE = cVar6.e();
                        vc.s.j(qVarE);
                        ybl.b bVarB = cVar6.b();
                        vc.s.j(bVarB);
                        e4m.e eVar = aVar9.f279820p;
                        f3h.a aVar10 = aVar9.f279816j;
                        ufh.i iVar2 = aVar9.k;
                        e3h.a extensions = (e3h.a) eVar.get();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        i4h.p0 p0Var = extensions.f122271b;
                        fsl.m mVarB = iVar.f279855j.b();
                        vc.s.j(mVarB);
                        hbh.o oVar = (hbh.o) iVar.f279856l.d.get();
                        vc.s.j(oVar);
                        h1h.b bVar8 = (h1h.b) aVar9.D.get();
                        ybl.k kVarD = fVar.d();
                        vc.s.j(kVarD);
                        n2h.a aVar11 = (n2h.a) aVar9.f279822r.get();
                        ybl.d dVarH = cVar6.h();
                        vc.s.j(dVarH);
                        vrl.s sVarD = iVar.o.d();
                        vc.s.j(sVarD);
                        ybl.l lVarF = iVar.f279859p.f();
                        wfh.b bVar9 = new wfh.b();
                        d1h.e eVar2 = (d1h.e) aVar9.u.get();
                        Map mapA = fVar.a();
                        vc.s.j(mapA);
                        wfh.v vVar = new wfh.v();
                        ite.a aVar12 = iVar2.f279853g;
                        m2h.b bVar10 = iVar2.f;
                        l70.e eVar3 = iVar2.f279860q;
                        gte.a aVarB3 = aVar12.b();
                        vc.s.j(aVarB3);
                        igh.w wVar = new igh.w(aVarB3);
                        e3h.f fVarN = f0k.d.n(aVar10, ((z3h.g) iVar2.f).h());
                        igh.q qVar = new igh.q(new kpj.f(iVar2.f279859p.H()), new ufl.b(new tfl.a()));
                        vfh.a aVar13 = new vfh.a();
                        e3h.f fVarN2 = f0k.d.n(aVar10, ((z3h.g) iVar2.f).h());
                        l80.e eVarH = eVar3.h();
                        vc.s.j(eVarH);
                        gte.a aVarB4 = aVar12.b();
                        vc.s.j(aVarB4);
                        igh.z zVar = new igh.z(aVar13, fVarN2, eVarH, aVarB4);
                        igh.j jVar = new igh.j((f01.a) aVar9.J.get());
                        nbh.a instrumentImageProvider = new nbh.a();
                        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
                        vfh.d holdingItemMapper = new vfh.d();
                        Intrinsics.checkNotNullParameter(holdingItemMapper, "holdingItemMapper");
                        igh.f fVar2 = new igh.f(new jgh.e(), new jgh.p(), new jgh.j(), new jgh.i((f01.a) aVar9.J.get()));
                        l80.e eVarH2 = eVar3.h();
                        vc.s.j(eVarH2);
                        igh.t tVar = new igh.t(eVarH2);
                        igh.n nVar = new igh.n(new vfh.a());
                        igh.c cVar7 = new igh.c(new vfh.a());
                        igh.a0 a0Var3 = new igh.a0();
                        a4h.d dVar5 = new a4h.d();
                        fsl.k kVar = (fsl.k) aVar9.K.get();
                        igh.g gVar6 = new igh.g();
                        m3h.c cVarM = oyj.c.m(((z3h.g) bVar10).a());
                        d1h.h hVar = (d1h.h) aVar9.L.get();
                        gte.a aVarB5 = aVar12.b();
                        vc.s.j(aVarB5);
                        return new com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d(d0VarK, qVarE, bVarB, p0Var, mVarB, oVar, bVar8, kVarD, aVar11, dVarH, sVarD, lVarF, bVar9, eVar2, mapA, vVar, new igh.b0(wVar, fVarN, qVar, zVar, jVar, fVar2, tVar, nVar, cVar7, a0Var3, dVar5, kVar, gVar6, cVarM, hVar, aVarB5), aVar9.f279813c);
                    case 23:
                        ViewController controller = aVar9.f;
                        zfh.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new f01.c(controller.m2());
                    case 24:
                        fsl.t tVarA3 = iVar.f279855j.a();
                        vc.s.j(tVarA3);
                        return fp8.c.r(tVarA3, iVar.k.a());
                    case 25:
                        return kii.e.k((u8h.b) iVar.i);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                ufh.c cVar8 = (ufh.c) this.d;
                ufh.i iVar3 = (ufh.i) this.f279757b;
                zdl.c cVar9 = iVar3.f279858n;
                u8h.c cVar10 = iVar3.i;
                int i5 = this.f279758c;
                if (i5 == 0) {
                    ViewController view2 = cVar8.f279830a;
                    dgh.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(view2, "view");
                    return (FundHighlightsScreen) view2;
                }
                if (i5 == 1) {
                    return kii.e.j((u8h.b) cVar10, "factory");
                }
                if (i5 != 2) {
                    if (i5 == 3) {
                        return kii.e.k((u8h.b) cVar10);
                    }
                    throw new AssertionError(i5);
                }
                ybl.b bVarB2 = cVar9.b();
                vc.s.j(bVarB2);
                ael.d0 d0VarK2 = cVar9.k();
                vc.s.j(d0VarK2);
                cgh.b bVar11 = new cgh.b();
                d1h.e eVar4 = (d1h.e) cVar8.e.get();
                vfh.a aVar14 = new vfh.a();
                l80.e eVarH3 = cVar8.f279832c.f279860q.h();
                vc.s.j(eVarH3);
                return new com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.a(bVarB2, d0VarK2, bVar11, eVar4, new cgh.t(aVar14, eVarH3, (d1h.h) cVar8.f.get()), cVar8.f279831b);
            case 4:
                ufh.d dVar6 = (ufh.d) this.d;
                ufh.i iVar4 = dVar6.f279835b;
                ufh.i iVar5 = (ufh.i) this.f279757b;
                jdh.b bVar12 = iVar5.f279854h;
                zdl.c cVar11 = iVar5.f279858n;
                int i6 = this.f279758c;
                if (i6 == 0) {
                    kbb.c factory3 = bVar12.a();
                    Intrinsics.checkNotNullParameter(factory3, "factory");
                    return factory3.s();
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                ybl.b bVarB3 = cVar11.b();
                vc.s.j(bVarB3);
                ybl.d dVarH2 = cVar11.h();
                vc.s.j(dVarH2);
                ael.q qVarE2 = cVar11.e();
                vc.s.j(qVarE2);
                ybl.k kVarD2 = iVar5.f279851b.d();
                vc.s.j(kVarD2);
                kdh.b bVarB4 = bVar12.b();
                gdh.a aVar15 = (gdh.a) dVar6.f279836c.get();
                nwg.a factory4 = ((ewg.h) iVar4.f279861r).a();
                fgh.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return new com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b(bVarB3, dVarH2, qVarE2, kVarD2, bVarB4, aVar15, factory4.a(gwg.a.TRADING), iVar5.f279859p.f(), new com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.c(new kpj.f(iVar4.f279859p.H()), new ufl.b(new tfl.a())), dVar6.f279834a);
            case 5:
                ufh.g gVar7 = (ufh.g) this.d;
                ufh.i iVar6 = (ufh.i) this.f279757b;
                zdl.c cVar12 = iVar6.f279858n;
                u8h.c cVar13 = iVar6.i;
                int i21 = this.f279758c;
                if (i21 == 0) {
                    return f0k.d.g(gVar7.f279841a, ((z3h.g) iVar6.f).h(), (e3h.d) gVar7.f279844g.get(), gVar7.f279843c);
                }
                if (i21 == 1) {
                    kgh.l inputData3 = gVar7.f279842b;
                    l80.e dateProvider = iVar6.f279860q.h();
                    vc.s.j(dateProvider);
                    lgh.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData3, "inputData");
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    LocalDate localDate = inputData3.f183997b;
                    boolean z = localDate != null && ((l80.f) dateProvider).e().minusMonths(12L).compareTo((ChronoLocalDate) localDate) <= 0;
                    return new e3h.d(inputData3.f183996a, z ? zhm.v.k(eel.c.SIX_MONTHS, eel.c.ALL) : zhm.v.k(eel.c.ONE_YEAR, eel.c.FIVE_YEAR, eel.c.ALL), z ? eel.c.SIX_MONTHS : eel.c.ONE_YEAR, y0.b(TradingAccountType.Gia.f105270a), false, null, true, false, false, null, NewHope.SENDA_BYTES);
                }
                if (i21 == 2) {
                    ViewController view3 = gVar7.d;
                    lgh.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(view3, "view");
                    return (FundPerformanceScreen) view3;
                }
                if (i21 == 3) {
                    return kii.e.j((u8h.b) cVar13, "factory");
                }
                if (i21 != 4) {
                    if (i21 == 5) {
                        return kii.e.k((u8h.b) cVar13);
                    }
                    throw new AssertionError(i21);
                }
                ael.d0 d0VarK3 = cVar12.k();
                vc.s.j(d0VarK3);
                ybl.b bVarB5 = cVar12.b();
                vc.s.j(bVarB5);
                ybl.k kVarD3 = iVar6.f279851b.d();
                vc.s.j(kVarD3);
                vrl.s sVarD2 = iVar6.o.d();
                vc.s.j(sVarD2);
                kgh.a aVar16 = new kgh.a();
                ybl.l lVarF2 = iVar6.f279859p.f();
                d1h.e eVar5 = (d1h.e) gVar7.f279846j.get();
                e3h.a extensions2 = (e3h.a) gVar7.f279845h.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                i4h.p0 p0Var2 = extensions2.f122271b;
                gte.a aVarB6 = iVar6.f279853g.b();
                vc.s.j(aVarB6);
                f3h.a aVar17 = gVar7.e;
                ufh.i iVar7 = gVar7.f;
                e3h.f fVarN3 = f0k.d.n(aVar17, ((z3h.g) iVar7.f).h());
                gte.a aVarB7 = iVar7.f279853g.b();
                vc.s.j(aVarB7);
                return new com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a(d0VarK3, bVarB5, kVarD3, sVarD2, aVar16, lVarF2, eVar5, p0Var2, aVarB6, new gig.t(new mgh.e(fVarN3, aVarB7), new mgh.l(new vfh.a()), new mgh.h(new vfh.a()), new mgh.a(), new mgh.c(), (d1h.h) gVar7.k.get()), gVar7.f279842b);
            case 6:
                uhi.a aVar18 = (uhi.a) this.f279757b;
                uhi.b bVar13 = (uhi.b) this.d;
                int i22 = this.f279758c;
                switch (i22) {
                    case 0:
                        gVar = new iri.g((iri.j) aVar18.f280235l.get(), new iri.b(), bq.i.f(bVar13.f280236a), bq.i.l(bVar13.f280236a));
                        break;
                    case 1:
                        return new iri.l(new iri.b(), bq.i.f(bVar13.f280236a), (iri.d) bVar13.e.get());
                    case 2:
                        return new iri.d(bq.i.f(bVar13.f280236a));
                    case 3:
                        return kpi.f.a();
                    case 4:
                        Context contextI = bq.i.i(bVar13.f280236a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar13.f280236a);
                        t70.g gVarO = aVar18.f280229a.o();
                        vc.s.j(gVarO);
                        gVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 5:
                        return new tpi.i((rpi.c) bVar13.i.get(), gsi.c.a(bVar13.f280236a));
                    case 6:
                        return new rpi.b(bq.i.b(bVar13.f280236a));
                    case 7:
                        return new rpi.h(bq.i.b(bVar13.f280236a));
                    case 8:
                        return new opi.b(bq.i.f(bVar13.f280236a));
                    case 9:
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(bVar13.f280236a);
                        ppi.d dVar7 = (ppi.d) aVar18.f280230b.e.get();
                        vc.s.j(dVar7);
                        gVar = new ppi.c(baseDelegatesActivityF2, dVar7);
                        break;
                    case 10:
                        return new k3l.d(bq.i.b(bVar13.f280236a));
                    case 11:
                        return new thi.c(bq.i.d(bVar13.f280236a), bVar13.f280237b, bq.i.l(bVar13.f280236a));
                    default:
                        throw new AssertionError(i22);
                }
                return gVar;
            case 7:
                ui3.e eVar6 = (ui3.e) this.f279757b;
                ui3.d dVar8 = (ui3.d) this.d;
                int i32 = this.f279758c;
                switch (i32) {
                    case 0:
                        ypi.h hVar2 = dVar8.f280293b;
                        fsi.g gVar8 = dVar8.f280292a;
                        return new ypi.e(hVar2, bq.i.b(gVar8), bq.i.o(gVar8), bq.i.g(gVar8));
                    case 1:
                        return new hqi.f(dVar8.f280294c, bq.i.b(dVar8.f280292a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI2 = bq.i.i(dVar8.f280292a);
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(dVar8.f280292a);
                        t70.g gVarO2 = eVar6.f280304a.o();
                        vc.s.j(gVarO2);
                        cVar = new npi.c(contextI2, baseDelegatesActivityF3, gVarO2);
                        break;
                    case 4:
                        return new tpi.i((rpi.c) dVar8.f280297j.get(), gsi.c.a(dVar8.f280292a));
                    case 5:
                        return new rpi.b(bq.i.b(dVar8.f280292a));
                    case 6:
                        return new rpi.h(bq.i.b(dVar8.f280292a));
                    case 7:
                        cVar = new iri.g((iri.j) eVar6.d.get(), (iri.m) eVar6.e.get(), bq.i.f(dVar8.f280292a), bq.i.l(dVar8.f280292a));
                        break;
                    case 8:
                        cVar = new iri.l((iri.m) eVar6.e.get(), bq.i.f(dVar8.f280292a), (iri.d) dVar8.f280300n.get());
                        break;
                    case 9:
                        return new iri.d(bq.i.f(dVar8.f280292a));
                    case 10:
                        return new opi.b(bq.i.f(dVar8.f280292a));
                    case 11:
                        return new qi3.l(bq.i.l(dVar8.f280292a), (f9b.f) dVar8.f280302q.get(), (qi3.r) eVar6.f280308h.get(), (com.revolut.feature.chooser.c) eVar6.f280307g.get(), dVar8.d, (ypi.i) dVar8.f.get(), (hqi.l) dVar8.f280295g.get(), (opi.d) dVar8.f280301p.get(), (tpi.j) dVar8.k.get(), bq.i.o(dVar8.f280292a));
                    case 12:
                        return bq.i.t(dVar8.f280292a);
                    default:
                        throw new AssertionError(i32);
                }
                return cVar;
            case 8:
                um5.a aVar19 = (um5.a) this.d;
                um5.c cVar14 = (um5.c) this.f279757b;
                int i33 = this.f279758c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new mm5.p();
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar2 = (cli.n) aVar19.f281229b.get();
                zm5.e eVar7 = new zm5.e(cVar14.f281235c, zm5.h.a(), new zm5.a());
                ActionRequiredScreenContract$InputData actionRequiredScreenContract$InputData = aVar19.f281228a;
                nm5.d dVar9 = (nm5.d) cVar14.f281241n.get();
                nm5.f fVar3 = (nm5.f) cVar14.f281239l.get();
                asi.d dVarC = ((j51.a) cVar14.d).c();
                vc.s.j(dVarC);
                return new mm5.o(nVar2, eVar7, actionRequiredScreenContract$InputData, dVar9, fVar3, dVarC);
            case 9:
                um5.e eVar8 = (um5.e) this.d;
                int i43 = this.f279758c;
                if (i43 == 0) {
                    return new ym5.j((ym5.g) eVar8.f281246b.get(), eVar8.f281245a, (nm5.f) ((um5.c) this.f279757b).f281239l.get());
                }
                if (i43 == 1) {
                    return new ym5.k();
                }
                throw new AssertionError(i43);
            case 10:
                um5.f fVar4 = (um5.f) this.d;
                int i59 = this.f279758c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new bn5.l();
                    }
                    throw new AssertionError(i59);
                }
                bn5.i iVar8 = (bn5.i) fVar4.f281250c.get();
                PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = fVar4.f281248a;
                um5.c cVar15 = fVar4.f281249b;
                n8b.b bVarB6 = cVar15.f.b();
                vc.s.j(bVarB6);
                fk3.a aVarA3 = cVar15.f281236g.a();
                vc.s.j(aVarA3);
                return new com.revolut.feature.crypto.tfr.validation.impl.pob.a(iVar8, placeOfBirthScreenContract$InputData, new bn5.n(bVarB6, aVarA3), (nm5.f) ((um5.c) this.f279757b).f281239l.get());
            case 11:
                us2.c cVar16 = (us2.c) this.d;
                int i66 = this.f279758c;
                if (i66 == 0) {
                    return new xs2.e((cli.n) cVar16.d.get(), cVar16.f282385b);
                }
                if (i66 == 1) {
                    f01.a aVar20 = (f01.a) cVar16.f282386c.get();
                    vu.g gVarA = ((us2.j) this.f279757b).f282408a.a();
                    vc.s.j(gVarA);
                    return new xs2.g(aVar20, gVarA);
                }
                if (i66 != 2) {
                    throw new AssertionError(i66);
                }
                ViewController viewController = cVar16.f282384a;
                ys2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return new f01.c(viewController.m2());
            case 12:
                us2.j jVar2 = (us2.j) this.f279757b;
                l70.e eVar9 = jVar2.e;
                k5j.c cVar17 = jVar2.f282408a;
                us2.d dVar10 = (us2.d) this.d;
                int i74 = this.f279758c;
                switch (i74) {
                    case 0:
                        n60.b bVar14 = (n60.b) dVar10.d.get();
                        o5k.i.m(bVar14);
                        return bVar14;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) dVar10.f282389c.get());
                    case 2:
                        com.revolut.kompot.navigable.a aVar21 = (com.revolut.kompot.navigable.a) dVar10.f282389c.get();
                        i60.b.Companion.getClass();
                        return b.a.a(aVar21);
                    case 3:
                        y80.a aVarR = eVar9.r();
                        vc.s.j(aVarR);
                        rs2.b bVar15 = (rs2.b) jVar2.f282415m.get();
                        g1 g1Var = (g1) dVar10.f282390g.get();
                        zs2.b bVar16 = (zs2.b) dVar10.f282391h.get();
                        f01.a aVar22 = (f01.a) dVar10.i.get();
                        c70.a aVarZ = eVar9.z();
                        vc.s.j(aVarZ);
                        cpi.g gVarH = jVar2.f282410c.h();
                        InviteContactsScreenContract$InputData inviteContactsScreenContract$InputData = dVar10.f282387a;
                        h60.d dVar11 = (h60.d) dVar10.f.get();
                        vu.c cVar18 = (vu.c) cVar17.k.get();
                        vc.s.j(cVar18);
                        vu.g gVarA2 = cVar17.a();
                        vc.s.j(gVarA2);
                        return new com.revolut.feature.business.referrals.ui.screens.invite_contacts.a(aVarR, bVar15, g1Var, bVar16, aVar22, aVarZ, gVarH, inviteContactsScreenContract$InputData, dVar11, cVar18, gVarA2, (cli.n) dVar10.f282392j.get());
                    case 4:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) dVar10.f282389c.get();
                        at2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        x0 x0Var = g1.Companion;
                        View view4 = controller2.D2();
                        View viewFindViewById = controller2.D2().findViewById(R$id.inviteContacts_actions);
                        x0Var.getClass();
                        Intrinsics.checkNotNullParameter(view4, "view");
                        k1Var = new k1(view4, viewFindViewById);
                        break;
                    case 5:
                        vu.g gVarA3 = cVar17.a();
                        vc.s.j(gVarA3);
                        return new zs2.c(gVarA3);
                    case 6:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) dVar10.f282389c.get();
                        at2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        k1Var = new f01.c(controller3.m2());
                        break;
                    case 7:
                        vu.g gVarA4 = cVar17.a();
                        vc.s.j(gVarA4);
                        return new zs2.s(gVarA4);
                    default:
                        throw new AssertionError(i74);
                }
                return k1Var;
            case 13:
                us2.j jVar3 = (us2.j) this.f279757b;
                k5j.c cVar19 = jVar3.f282408a;
                us2.e eVar10 = (us2.e) this.d;
                int i92 = this.f279758c;
                if (i92 == 0) {
                    vu.d dVar12 = (vu.d) jVar3.f282412h.get();
                    vu.g gVarA5 = cVar19.a();
                    vc.s.j(gVarA5);
                    return new bt2.k(dVar12, gVarA5, (cli.n) eVar10.f282395c.get(), eVar10.f282393a);
                }
                if (i92 != 1) {
                    throw new AssertionError(i92);
                }
                vu.g gVarA6 = eVar10.f282394b.f282408a.a();
                vc.s.j(gVarA6);
                ws2.f fVar5 = new ws2.f(gVarA6);
                vu.g gVarA7 = cVar19.a();
                vc.s.j(gVarA7);
                return new bt2.n(fVar5, gVarA7);
            case 14:
                us2.f fVar6 = (us2.f) this.d;
                ReferralCampaignStateScreenContract$InputData referralCampaignStateScreenContract$InputData = fVar6.f282396a;
                us2.j jVar4 = (us2.j) this.f279757b;
                int i96 = this.f279758c;
                if (i96 == 0) {
                    return new com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.a((vu.d) jVar4.f282412h.get(), referralCampaignStateScreenContract$InputData, (cli.n) fVar6.f282397b.get());
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                ws2.a aVar23 = (ws2.a) jVar4.f282413j.get();
                vu.g gVarA8 = jVar4.f282408a.a();
                vc.s.j(gVarA8);
                return new com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.b(referralCampaignStateScreenContract$InputData, aVar23, gVarA8);
            case 15:
                us2.g gVar9 = (us2.g) this.d;
                us2.j jVar5 = (us2.j) this.f279757b;
                int i99 = this.f279758c;
                if (i99 == 0) {
                    com.revolut.kompot.navigable.a aVar24 = (com.revolut.kompot.navigable.a) gVar9.f282400b.get();
                    i60.b.Companion.getClass();
                    return b.a.a(aVar24);
                }
                if (i99 == 1) {
                    return new ft2.i(gVar9.f282399a, (vu.d) jVar5.f282412h.get(), (h60.d) gVar9.f282401c.get(), (cli.n) gVar9.d.get());
                }
                if (i99 != 2) {
                    throw new AssertionError(i99);
                }
                ws2.a aVar25 = (ws2.a) jVar5.f282413j.get();
                ws2.g gVar10 = (ws2.g) jVar5.k.get();
                vu.g gVarA9 = jVar5.f282408a.a();
                vc.s.j(gVarA9);
                return new com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.b(aVar25, gVar10, gVarA9);
            case 16:
                return a();
            case 17:
                int i100 = this.f279758c;
                if (i100 == 0) {
                    return new ew6.g((p1) ((us6.q) this.f279757b).f282693n0.get(), (jki.p) ((us6.b) this.d).f282453a.get());
                }
                if (i100 == 1) {
                    return new ew6.h(new fw6.a());
                }
                throw new AssertionError(i100);
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
                us6.q qVar2 = (us6.q) this.f279757b;
                vs6.a aVar26 = qVar2.f282681h;
                us6.d0 d0Var = (us6.d0) this.d;
                int i101 = this.f279758c;
                if (i101 == 0) {
                    gr6.a aVarA4 = aVar26.a();
                    vc.s.j(aVarA4);
                    us6.q qVar3 = d0Var.f282487c;
                    gr6.a aVarA5 = qVar3.f282681h.a();
                    vc.s.j(aVarA5);
                    mt8.d dVarB = qVar3.N.b();
                    vc.s.j(dVarB);
                    qz6.i eligibilityChecker = new qz6.i(aVarA5, dVarB, qVar3.O.a());
                    pz6.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(eligibilityChecker, "eligibilityChecker");
                    y1 y1Var = (y1) qVar2.f282701r0.get();
                    jr6.r rVar = (jr6.r) qVar2.X0.get();
                    gr6.p pVar = (gr6.p) qVar2.L0.get();
                    FreelancerOnboardingFlowContract$InputData freelancerOnboardingFlowContract$InputData = d0Var.f282485a;
                    rz6.a aVar27 = new rz6.a();
                    til.m mVarA = qVar2.P.a();
                    vc.s.j(mVarA);
                    jf1.a aVarA6 = qVar2.f282717y.a();
                    vc.s.j(aVarA6);
                    zfe.e eVar11 = d0Var.f282486b;
                    gr6.m mVarB2 = aVar26.b();
                    vc.s.j(mVarB2);
                    bVar = new com.revolut.feature.freelancer.impl.ui.onboarding.flow.b(aVarA4, eligibilityChecker, y1Var, rVar, pVar, freelancerOnboardingFlowContract$InputData, aVar27, mVarA, aVarA6, eVar11, mVarB2);
                } else {
                    if (i101 == 1) {
                        nz6.b flowModel = (nz6.b) d0Var.e.get();
                        pz6.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                        oz6.a aVar28 = (oz6.a) flowModel;
                        vc.s.k(aVar28);
                        return aVar28;
                    }
                    if (i101 == 2) {
                        return new lz6.c((oz6.a) d0Var.f.get(), (sz6.a) d0Var.f282488g.get());
                    }
                    if (i101 != 3) {
                        if (i101 == 4) {
                            return new e17.e((oz6.a) d0Var.f.get(), (sz6.a) d0Var.f282488g.get());
                        }
                        throw new AssertionError(i101);
                    }
                    bVar = new com.revolut.feature.freelancer.impl.ui.onboarding.validation.a((y1) qVar2.f282701r0.get());
                }
                return bVar;
        }
    }
}
