package qgk;

import android.content.Context;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.PlanKeepFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.PlanChangeConfirmationScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2ScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f246125c;
    public final Object d;

    public /* synthetic */ m(i0 i0Var, Object obj2, int i, int i2) {
        this.f246123a = i2;
        this.f246124b = i0Var;
        this.d = obj2;
        this.f246125c = i;
    }

    private final Object a() {
        t0 t0Var = (t0) this.d;
        i0 i0Var = this.f246124b;
        int i = this.f246125c;
        if (i == 0) {
            cli.n nVar = (cli.n) t0Var.d.get();
            PlanPageBottomSheetContract$InputData planPageBottomSheetContract$InputData = t0Var.f246238a;
            q06.l lVarA = i0Var.f.a();
            vc.s.j(lVarA);
            return new zmk.k(nVar, planPageBottomSheetContract$InputData, lVarA, i0Var.f246010b.f());
        }
        if (i == 1) {
            return new zmk.n((c90.c) t0Var.f246240c.get(), new dnk.l(t0Var.f246239b.e.g(), 0), new qfk.a());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        Context context = i0Var.C;
        ank.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new c90.c(context);
    }

    private final Object b() {
        i0 i0Var = this.f246124b;
        cri.b bVar = i0Var.k;
        ite.a aVar = i0Var.f246011c;
        i3 i3Var = i0Var.f246010b;
        v0 v0Var = (v0) this.d;
        i0 i0Var2 = v0Var.f246286b;
        int i = this.f246125c;
        if (i == 0) {
            return new com.revolut.retail.feature.pricing_plans.ui.impl.footer.d(((s41.a) bVar).d(), i3Var.f(), new ajk.c(i0Var2.f246010b.g()));
        }
        if (i != 1) {
            if (i == 2) {
                ihk.a.Companion.getClass();
                return new enk.o();
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
            gte.a aVarB = aVar.b();
            vc.s.j(aVarB);
            return new yik.d(aVarB);
        }
        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = v0Var.f246285a;
        com.revolut.retail.feature.pricing_plans.ui.impl.footer.e eVar = new com.revolut.retail.feature.pricing_plans.ui.impl.footer.e();
        dok.e eVar2 = new dok.e(new yik.b());
        dok.i iVar = new dok.i(v0Var.b());
        gte.a aVarB2 = i0Var2.f246011c.b();
        vc.s.j(aVarB2);
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e eVar3 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e(planPagerFlowContract$InputData, eVar, eVar2, iVar, aVarB2);
        PlanPagerFlowContract$InputData planPagerFlowContract$InputData2 = v0Var.f246285a;
        wli.x xVarD = ((s41.a) bVar).d();
        ffk.t tVarF = i0Var.f246013h.f();
        vc.s.j(tVarF);
        egk.e eVarE = i3Var.e();
        vc.s.j(eVarE);
        fkk.b planSelector = new fkk.b();
        Intrinsics.checkNotNullParameter(planSelector, "planSelector");
        ghk.b0 b0Var = new ghk.b0();
        enk.o oVar = (enk.o) v0Var.e.get();
        enk.o oVar2 = (enk.o) v0Var.e.get();
        enk.o oVar3 = (enk.o) v0Var.e.get();
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.a aVar2 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.a();
        yik.d dVar = (yik.d) v0Var.f.get();
        dgk.a aVar3 = (dgk.a) v0Var.d.get();
        ajk.b bVarF = i3Var.f();
        gte.a aVarB3 = aVar.b();
        vc.s.j(aVarB3);
        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d(eVar3, planPagerFlowContract$InputData2, xVarD, tVarF, eVarE, b0Var, oVar, oVar2, oVar3, aVar2, dVar, aVar3, bVarF, aVarB3);
    }

    private final Object c() {
        x0 x0Var = (x0) this.d;
        i0 i0Var = this.f246124b;
        efk.a aVar = i0Var.f246013h;
        int i = this.f246125c;
        if (i != 0) {
            if (i == 1) {
                return new ukk.q();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) x0Var.f246320b.get();
        PlanPartnersOffersScreenContract$InputData planPartnersOffersScreenContract$InputData = x0Var.f246319a;
        bgc.e eVarC = i0Var.f246012g.c();
        vc.s.j(eVarC);
        ffk.t tVarF = aVar.f();
        vc.s.j(tVarF);
        return new ukk.p(nVar, planPartnersOffersScreenContract$InputData, eVarC, tVarF, aVar.h(), new skk.a(), ((s41.a) i0Var.k).d(), i0Var.f246010b.f());
    }

    private final Object d() {
        y0 y0Var = (y0) this.d;
        int i = this.f246125c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            PlanPreviewScreenContract$InputData planPreviewScreenContract$InputData = y0Var.f246330a;
            gnk.c cVar = new gnk.c();
            egk.e eVarE = y0Var.f246331b.f246010b.e();
            vc.s.j(eVarE);
            return new fnk.q(planPreviewScreenContract$InputData, new fmc.z(cVar, eVarE), new gnk.d(), new gnk.a());
        }
        PlanPreviewScreenContract$InputData planPreviewScreenContract$InputData2 = y0Var.f246330a;
        i0 i0Var = this.f246124b;
        ang.f fVarE = i0Var.f246014j.e();
        wli.x xVarD = ((s41.a) i0Var.k).d();
        cli.n nVar = (cli.n) y0Var.f246332c.get();
        ffk.t tVarF = i0Var.f246013h.f();
        vc.s.j(tVarF);
        return new fnk.n(planPreviewScreenContract$InputData2, fVarE, xVarD, nVar, tVarF);
    }

    private final Object e() {
        i0 i0Var = this.f246124b;
        efk.a aVar = i0Var.f246013h;
        g3 g3Var = i0Var.u;
        a1 a1Var = (a1) this.d;
        agk.a aVar2 = a1Var.f245872a;
        int i = this.f246125c;
        switch (i) {
            case 0:
                return agk.b.B(aVar2, (zfk.c) a1Var.f245876h.get(), (xfk.b) a1Var.e.get(), (bgk.a) a1Var.f.get(), (wfk.a) a1Var.f245875g.get(), (bgk.a) a1Var.i.get());
            case 1:
                mhk.a aVarC = g3Var.c();
                vc.s.j(aVarC);
                return afj.y3.C(aVar2, aVarC, (xfk.b) a1Var.e.get(), (bgk.a) a1Var.f.get(), (wfk.a) a1Var.f245875g.get());
            case 2:
                fhk.a aVarB = g3Var.b();
                vc.s.j(aVarB);
                return afj.y3.b(aVar2, aVarB);
            case 3:
                ohk.a aVarD = g3Var.d();
                vc.s.j(aVarD);
                return afj.y3.D(aVar2, aVarD);
            case 4:
                dhk.a aVarA = g3Var.a();
                vc.s.j(aVarA);
                return afj.y3.z(aVar2, aVarA);
            case 5:
                ohk.a aVarD2 = g3Var.d();
                vc.s.j(aVarD2);
                return agk.b.y(aVar2, aVarD2);
            case 6:
                wli.x xVarD = ((s41.a) i0Var.k).d();
                ajk.b bVarF = i0Var.f246010b.f();
                zfk.c cVar = (zfk.c) a1Var.f245876h.get();
                ma3.a aVarA2 = i0Var.f246023w.a();
                vc.s.j(aVarA2);
                ffk.t tVarF = aVar.f();
                vc.s.j(tVarF);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b(xVarD, bVarF, cVar, aVarA2, tVarF, new ylk.a());
            case 7:
                PlanReferralsClaimFlowContract$InputData planReferralsClaimFlowContract$InputData = a1Var.f245873b;
                ffk.t tVarF2 = aVar.f();
                vc.s.j(tVarF2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c(planReferralsClaimFlowContract$InputData, tVarF2, (com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b) a1Var.k.get(), (zfk.c) a1Var.f245876h.get(), new com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        d1 d1Var = (d1) this.d;
        i0 i0Var = this.f246124b;
        zxb.k0 k0Var = i0Var.o;
        da3.j jVar = i0Var.f246017n;
        int i = this.f246125c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ia3.r rVarB = jVar.b();
            m93.g gVarI = jVar.i();
            vc.s.j(gVarI);
            return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.b(rVarB, gVarI);
        }
        cli.n nVar = (cli.n) d1Var.f245916b.get();
        PlanRevPointsCardsScreenContract$InputData planRevPointsCardsScreenContract$InputData = d1Var.f245915a;
        l93.f fVarJ = jVar.j();
        vc.s.j(fVarJ);
        nyb.p0 p0Var = (nyb.p0) k0Var.Z.get();
        vc.s.j(p0Var);
        mt8.d dVarB = i0Var.f246018p.b();
        vc.s.j(dVarB);
        com.revolut.feature.rev_points.api.navigation.a aVarA = i0Var.f246019q.a();
        vc.s.j(aVarA);
        ajk.f fVarH = i0Var.f246010b.h();
        fmk.a aVar = new fmk.a();
        eub.i iVarE = k0Var.e();
        vc.s.j(iVarE);
        wsg.n nVarB = i0Var.f246020r.b();
        nyb.j jVarB = k0Var.b();
        vc.s.j(jVarB);
        return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a(nVar, planRevPointsCardsScreenContract$InputData, fVarJ, p0Var, dVarB, aVarA, fVarH, aVar, iVarE, nVarB, jVarB);
    }

    private final Object g() {
        int i = this.f246125c;
        if (i == 0) {
            return new gik.h((cli.n) ((h1) this.d).f245997a.get(), ((c21.b) this.f246124b.O).c());
        }
        if (i == 1) {
            return new gik.i();
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        i1 i1Var = (i1) this.d;
        i0 i0Var = i1Var.f246026a;
        i0 i0Var2 = this.f246124b;
        int i = this.f246125c;
        if (i == 0) {
            return new com.revolut.retail.feature.pricing_plans.ui.impl.footer.d(((s41.a) i0Var2.k).d(), i0Var2.f246010b.f(), new ajk.c(i0Var.f246010b.g()));
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            mmk.e eVar = new mmk.e();
            dnk.l lVar = new dnk.l(i0Var.e.g(), 0);
            return new knk.o(eVar, new dnk.a(new dnk.c(new dnk.l(i0Var.e.g(), 0)), new dnk.d(), lVar), new dok.i(new dnk.l(i0Var.e.g(), 0)), new com.revolut.retail.feature.pricing_plans.ui.impl.footer.e());
        }
        cli.n nVar = (cli.n) i1Var.f246028c.get();
        wik.m mVarA = i0Var2.f246024x.a();
        ffk.t tVarF = i0Var2.f246013h.f();
        vc.s.j(tVarF);
        dnk.d dVar = new dnk.d();
        dgk.a aVar = (dgk.a) i1Var.f246027b.get();
        gte.a aVarB = i0Var2.f246011c.b();
        vc.s.j(aVarB);
        return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a(nVar, mVarA, tVarF, dVar, aVar, aVarB);
    }

    private final Object i() {
        i0 i0Var = this.f246124b;
        g3 g3Var = i0Var.u;
        k1 k1Var = (k1) this.d;
        agk.a aVar = k1Var.f246079a;
        int i = this.f246125c;
        switch (i) {
            case 0:
                return agk.b.B(aVar, (zfk.c) k1Var.f246083h.get(), (xfk.b) k1Var.e.get(), (bgk.a) k1Var.f.get(), (wfk.a) k1Var.f246082g.get(), (bgk.a) k1Var.i.get());
            case 1:
                mhk.a aVarC = g3Var.c();
                vc.s.j(aVarC);
                return afj.y3.C(aVar, aVarC, (xfk.b) k1Var.e.get(), (bgk.a) k1Var.f.get(), (wfk.a) k1Var.f246082g.get());
            case 2:
                fhk.a aVarB = g3Var.b();
                vc.s.j(aVarB);
                return afj.y3.b(aVar, aVarB);
            case 3:
                ohk.a aVarD = g3Var.d();
                vc.s.j(aVarD);
                return afj.y3.D(aVar, aVarD);
            case 4:
                dhk.a aVarA = g3Var.a();
                vc.s.j(aVarA);
                return afj.y3.z(aVar, aVarA);
            case 5:
                ohk.a aVarD2 = g3Var.d();
                vc.s.j(aVarD2);
                return agk.b.y(aVar, aVarD2);
            case 6:
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a(k1Var.f246080b, (zfk.c) k1Var.f246083h.get(), i0Var.f246010b.h(), ((s41.a) i0Var.k).d());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        l1 l1Var = (l1) this.d;
        i0 i0Var = this.f246124b;
        i3 i3Var = i0Var.f246010b;
        efk.a aVar = i0Var.f246013h;
        int i = this.f246125c;
        if (i != 0) {
            if (i == 1) {
                return new i3g.k(new lnk.b(new dnk.l(l1Var.f246102b.e.g(), 0)));
            }
            throw new AssertionError(i);
        }
        ffk.t tVarF = aVar.f();
        vc.s.j(tVarF);
        jgk.x xVar = (jgk.x) i3Var.S.get();
        vc.s.j(xVar);
        jgk.v vVarD = i3Var.d();
        vc.s.j(vVarD);
        mre.c cVarB = i0Var.D.b();
        vc.s.j(cVarB);
        cha.b bVarC = aVar.c();
        vc.s.j(bVarC);
        return new lnk.n(tVarF, xVar, vVarD, cVarB, bVarC, l1Var.f246101a, (cli.n) l1Var.f246103c.get());
    }

    private final Object k() {
        m1 m1Var = (m1) this.d;
        int i = this.f246125c;
        if (i != 0) {
            if (i == 1) {
                return new nnk.i();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) m1Var.f246136b.get();
        i0 i0Var = m1Var.f246135a;
        pre.c cVarA = i0Var.D.a();
        vc.s.j(cVarA);
        ang.f fVarE = i0Var.f246014j.e();
        gte.a aVarB = i0Var.f246011c.b();
        vc.s.j(aVarB);
        wik.q qVar = new wik.q(cVarA, fVarE, aVarB);
        i0 i0Var2 = this.f246124b;
        return new nnk.h(nVar, qVar, ((nj0.d) i0Var2.N).j(), i0Var2.e.e());
    }

    private final Object l() {
        i0 i0Var = this.f246124b;
        rkd.g gVar = i0Var.d;
        i3 i3Var = i0Var.f246010b;
        n1 n1Var = (n1) this.d;
        i0 i0Var2 = n1Var.d;
        int i = this.f246125c;
        if (i == 0) {
            nkd.a extension = (nkd.a) n1Var.e.get();
            pjk.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            nkd.b view = n1Var.f246159a;
            kld.a factory = (kld.a) gVar.K.get();
            vc.s.j(factory);
            pjk.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a(view);
        }
        if (i == 2) {
            mkd.g view2 = n1Var.f246160b;
            rkd.m factory2 = gVar.a();
            vc.s.j(factory2);
            pjk.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(view2, "view");
            Intrinsics.checkNotNullParameter(factory2, "factory");
            return factory2.a(view2);
        }
        if (i == 3) {
            cli.n nVar = (cli.n) n1Var.f246163h.get();
            PricingPlanBEDrivenScreenContract$InputData pricingPlanBEDrivenScreenContract$InputData = n1Var.f246161c;
            egk.e eVarE = i3Var.e();
            vc.s.j(eVarE);
            mkd.d dVar = (mkd.d) n1Var.f246162g.get();
            q06.l lVarA = i0Var.f.a();
            vc.s.j(lVarA);
            return new ojk.l0(nVar, pricingPlanBEDrivenScreenContract$InputData, eVarE, dVar, lVarA, new ajk.c(i0Var2.f246010b.g()), i3Var.f());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        dnk.l lVar = new dnk.l(i0Var2.e.g(), 0);
        ojk.t tVar = new ojk.t(new c7b.a(i0Var2.e.g(), 2), new dnk.l(i0Var2.e.g(), 0));
        ojk.p0 p0Var = new ojk.p0(new dnk.l(i0Var2.e.g(), 0), new ojk.n0());
        ojk.s sVar = new ojk.s();
        gte.a aVarB = i0Var2.f246011c.b();
        vc.s.j(aVarB);
        return new ojk.m0(new ojk.g0(lVar, tVar, p0Var, sVar, aVarB));
    }

    @Override // phm.a
    public final Object get() {
        Object dVar;
        int i = this.f246123a;
        int i2 = this.f246125c;
        Object obj2 = this.d;
        i0 i0Var = this.f246124b;
        switch (i) {
            case 0:
                n nVar = (n) obj2;
                i3 i3Var = i0Var.f246010b;
                efk.a aVar = i0Var.f246013h;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new kkk.x(new yik.b(), new dnk.k(new dnk.l(nVar.f246152c.e.g(), 0), new dnk.i((c90.c) nVar.d.get())), new kkk.b(), new cjk.b());
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    ViewController controller = nVar.f246151b;
                    lkk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return new c90.c(controller.m2());
                }
                ffk.t tVarF = aVar.f();
                vc.s.j(tVarF);
                egk.d dVarA = i3Var.a();
                vc.s.j(dVarA);
                jgk.v vVarD = i3Var.d();
                vc.s.j(vVarD);
                cha.b bVarC = aVar.c();
                vc.s.j(bVarC);
                mre.c cVarB = i0Var.D.b();
                vc.s.j(cVarB);
                si7.a aVarA = i0Var.F.a();
                vc.s.j(aVarA);
                return new kkk.t(tVarF, dVarA, vVarD, bVarC, cVarB, aVarA, nVar.f246150a, (cli.n) nVar.e.get());
            case 1:
                s sVar = (s) obj2;
                if (i2 == 0) {
                    okk.i extension = (okk.i) sVar.f246223c.get();
                    pkk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i2 == 1) {
                    o38.a aVarC = i0Var.H.c();
                    vc.s.j(aVarC);
                    return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b(aVarC, i0Var.I.c(), new okk.b(sVar.f246222b.J.a()));
                }
                if (i2 == 2) {
                    return new okk.l(sVar.f246221a, (cli.n) sVar.e.get(), (okk.i) sVar.f246223c.get());
                }
                if (i2 == 3) {
                    return new at.r(new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.c());
                }
                throw new AssertionError(i2);
            case 2:
                ite.a aVar2 = i0Var.f246011c;
                t tVar = (t) obj2;
                i0 i0Var2 = tVar.f246236b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new fu6.t(tVar.f246235a, new dnk.a(new dnk.c(new dnk.l(i0Var2.e.g(), 0)), new dnk.d(), new dnk.l(i0Var2.e.g(), 0)), new dnk.m(new dnk.c(new dnk.l(i0Var2.e.g(), 0)), new dnk.d(), new dnk.l(i0Var2.e.g(), 0)), new dok.e(new yik.b()), new com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a((yik.d) tVar.f246237c.get()));
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    gte.a aVarB = aVar2.b();
                    vc.s.j(aVarB);
                    return new yik.d(aVarB);
                }
                cli.n nVar2 = (cli.n) tVar.d.get();
                PlanBenefitsScreenContract$InputData planBenefitsScreenContract$InputData = tVar.f246235a;
                egk.e eVarE = i0Var2.f246010b.e();
                vc.s.j(eVarE);
                ymk.a aVar3 = new ymk.a(eVarE);
                ffk.t tVarF2 = i0Var.f246013h.f();
                vc.s.j(tVarF2);
                ffk.t tVarF3 = i0Var2.f246013h.f();
                vc.s.j(tVarF3);
                i4b.f fVar = new i4b.f(tVarF3);
                dnk.d dVar2 = new dnk.d();
                gte.a aVarB2 = aVar2.b();
                vc.s.j(aVarB2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a(nVar2, planBenefitsScreenContract$InputData, aVar3, tVarF2, fVar, dVar2, aVarB2);
            case 3:
                u uVar = (u) obj2;
                i3 i3Var2 = i0Var.f246010b;
                if (i2 == 0) {
                    cli.n nVar3 = (cli.n) uVar.d.get();
                    dnk.d dVar3 = new dnk.d();
                    egk.d dVarA2 = i3Var2.a();
                    vc.s.j(dVarA2);
                    ffk.t tVarF4 = i0Var.f246013h.f();
                    vc.s.j(tVarF4);
                    i4b.f fVar2 = new i4b.f(((s41.a) uVar.f246264b.k).d());
                    ajk.b bVarF = i3Var2.f();
                    gte.a aVarB3 = i0Var.f246011c.b();
                    vc.s.j(aVarB3);
                    return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a(nVar3, dVar3, dVarA2, tVarF4, fVar2, bVarF, aVarB3);
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    ViewController controller2 = uVar.f246263a;
                    ykk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    return new c90.c(controller2.m2());
                }
                yik.b bVar = new yik.b();
                mlk.f fVar3 = new mlk.f(new dnk.k(uVar.b(), new dnk.i((c90.c) uVar.f246265c.get())), new dnk.a(new dnk.c(uVar.b()), new dnk.d(), uVar.b()), new dnk.m(new dnk.c(uVar.b()), new dnk.d(), uVar.b()), (c90.c) uVar.f246265c.get());
                l80.e eVarH = i0Var.E.h();
                vc.s.j(eVarH);
                return new xkk.q(bVar, fVar3, eVarH);
            case 4:
                v vVar = (v) obj2;
                if (i2 == 0) {
                    n60.a aVar4 = (n60.a) vVar.e.get();
                    o5k.i.l(aVar4);
                    return aVar4;
                }
                if (i2 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) vVar.d.get());
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        return new olk.l(new tlk.c(vVar.f246281b.e.g()));
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar4 = (cli.n) vVar.f246283g.get();
                PlanCancelFeedbackScreenContract$InputData planCancelFeedbackScreenContract$InputData = vVar.f246280a;
                n60.a aVar5 = (n60.a) vVar.e.get();
                ffk.t tVarF5 = i0Var.f246013h.f();
                vc.s.j(tVarF5);
                return new olk.k(nVar4, planCancelFeedbackScreenContract$InputData, aVar5, tVarF5);
            case 5:
                y yVar = (y) obj2;
                if (i2 == 0) {
                    cli.n nVar5 = (cli.n) yVar.f246328b.get();
                    PlanChangeConfirmationScreenContract$InputData planChangeConfirmationScreenContract$InputData = yVar.f246327a;
                    ffk.t tVarF6 = i0Var.f246013h.f();
                    vc.s.j(tVarF6);
                    return new ulk.q(nVar5, planChangeConfirmationScreenContract$InputData, tVarF6);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                ulk.a headerMapper = new ulk.a();
                ulk.b itemsMapper = new ulk.b();
                Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
                Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
                return new ulk.r();
            case 6:
                i3 i3Var3 = i0Var.f246010b;
                efk.a aVar6 = i0Var.f246013h;
                g3 g3Var = i0Var.u;
                z zVar = (z) obj2;
                agk.a aVar7 = zVar.f246343a;
                switch (i2) {
                    case 0:
                        return agk.b.B(aVar7, (zfk.c) zVar.f246347h.get(), (xfk.b) zVar.e.get(), (bgk.a) zVar.f.get(), (wfk.a) zVar.f246346g.get(), (bgk.a) zVar.i.get());
                    case 1:
                        mhk.a aVarC2 = g3Var.c();
                        vc.s.j(aVarC2);
                        return afj.y3.C(aVar7, aVarC2, (xfk.b) zVar.e.get(), (bgk.a) zVar.f.get(), (wfk.a) zVar.f246346g.get());
                    case 2:
                        fhk.a aVarB4 = g3Var.b();
                        vc.s.j(aVarB4);
                        return afj.y3.b(aVar7, aVarB4);
                    case 3:
                        ohk.a aVarD = g3Var.d();
                        vc.s.j(aVarD);
                        return afj.y3.D(aVar7, aVarD);
                    case 4:
                        dhk.a aVarA2 = g3Var.a();
                        vc.s.j(aVarA2);
                        return afj.y3.z(aVar7, aVarA2);
                    case 5:
                        ohk.a aVarD2 = g3Var.d();
                        vc.s.j(aVarD2);
                        return agk.b.y(aVar7, aVarD2);
                    case 6:
                        rhk.c cVar = zVar.f246344b;
                        wli.x xVarD = ((s41.a) i0Var.k).d();
                        zfk.c cVar2 = (zfk.c) zVar.f246347h.get();
                        sh3.a aVarA3 = i0Var.v.a();
                        vc.s.j(aVarA3);
                        ffk.t tVarF7 = aVar6.f();
                        vc.s.j(tVarF7);
                        i0 i0Var3 = zVar.f246345c;
                        ffk.t tVarF8 = i0Var3.f246013h.f();
                        vc.s.j(tVarF8);
                        egk.d dVarA3 = i0Var3.f246010b.a();
                        vc.s.j(dVarA3);
                        l93.f fVarJ = i0Var3.f246017n.j();
                        vc.s.j(fVarJ);
                        utk.f fVar4 = new utk.f(tVarF8, dVarA3, fVarJ);
                        cha.a aVar8 = (cha.a) aVar6.K.get();
                        vc.s.j(aVar8);
                        ajk.f fVarH = i3Var3.h();
                        ajk.b bVarF2 = i3Var3.f();
                        ma3.a aVarA4 = i0Var.f246023w.a();
                        vc.s.j(aVarA4);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b(cVar, xVarD, cVar2, aVarA3, tVarF7, fVar4, aVar8, fVarH, bVarF2, aVarA4);
                    default:
                        throw new AssertionError(i2);
                }
            case 7:
                g3 g3Var2 = i0Var.u;
                a0 a0Var = (a0) obj2;
                agk.a aVar9 = a0Var.f245865a;
                switch (i2) {
                    case 0:
                        return agk.b.B(aVar9, (zfk.c) a0Var.f245869h.get(), (xfk.b) a0Var.e.get(), (bgk.a) a0Var.f.get(), (wfk.a) a0Var.f245868g.get(), (bgk.a) a0Var.i.get());
                    case 1:
                        mhk.a aVarC3 = g3Var2.c();
                        vc.s.j(aVarC3);
                        return afj.y3.C(aVar9, aVarC3, (xfk.b) a0Var.e.get(), (bgk.a) a0Var.f.get(), (wfk.a) a0Var.f245868g.get());
                    case 2:
                        fhk.a aVarB5 = g3Var2.b();
                        vc.s.j(aVarB5);
                        return afj.y3.b(aVar9, aVarB5);
                    case 3:
                        ohk.a aVarD3 = g3Var2.d();
                        vc.s.j(aVarD3);
                        return afj.y3.D(aVar9, aVarD3);
                    case 4:
                        dhk.a aVarA5 = g3Var2.a();
                        vc.s.j(aVarA5);
                        return afj.y3.z(aVar9, aVarA5);
                    case 5:
                        ohk.a aVarD4 = g3Var2.d();
                        vc.s.j(aVarD4);
                        return agk.b.y(aVar9, aVarD4);
                    case 6:
                        wli.x xVarD2 = ((s41.a) i0Var.k).d();
                        ajk.b bVarF3 = i0Var.f246010b.f();
                        zfk.c cVar3 = (zfk.c) a0Var.f245869h.get();
                        ma3.a aVarA6 = i0Var.f246023w.a();
                        vc.s.j(aVarA6);
                        ffk.t tVarF9 = i0Var.f246013h.f();
                        vc.s.j(tVarF9);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b(xVarD2, bVarF3, cVar3, aVarA6, tVarF9, new ylk.a());
                    case 7:
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a(a0Var.f245866b, (com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b) a0Var.k.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 8:
                c0 c0Var = (c0) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new amk.i();
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar6 = (cli.n) c0Var.f245901c.get();
                PlanDocumentsBottomSheetScreenContract$InputData planDocumentsBottomSheetScreenContract$InputData = c0Var.f245899a;
                ffk.t tVarF10 = c0Var.f245900b.f246013h.f();
                vc.s.j(tVarF10);
                return new amk.h(nVar6, planDocumentsBottomSheetScreenContract$InputData, new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.a(planDocumentsBottomSheetScreenContract$InputData, tVarF10), ((s41.a) i0Var.k).d(), i0Var.f246010b.f());
            case 9:
                f0 f0Var = (f0) obj2;
                if (i2 == 0) {
                    jki.p pVar = (jki.p) f0Var.f245951c.get();
                    pfk.x xVarD3 = i0Var.f246013h.d();
                    vc.s.j(xVarD3);
                    return new ilk.j(pVar, xVarD3);
                }
                if (i2 == 1) {
                    return new anl.j(new onh.b((rlk.b) f0Var.f245950b.get()));
                }
                if (i2 == 2) {
                    return new rlk.a();
                }
                throw new AssertionError(i2);
            case 10:
                i3 i3Var4 = i0Var.f246010b;
                j0 j0Var = (j0) obj2;
                i0 i0Var4 = j0Var.f246063b;
                switch (i2) {
                    case 0:
                        return kxa.j.k((j60.a) j0Var.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) j0Var.f246064c.get(), (rp0.m) j0Var.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        yfk.a extension2 = (yfk.a) j0Var.f246065g.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 4:
                        kik.a factory = (kik.a) i0Var.u.A.get();
                        vc.s.j(factory);
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Object obj3 = factory.f184249a.get();
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        yfk.a aVar10 = (yfk.a) obj3;
                        vc.s.k(aVar10);
                        return aVar10;
                    case 5:
                        PlanGiftBenefitsScreenContract$InputData planGiftBenefitsScreenContract$InputData = j0Var.f246062a;
                        wli.x xVarD4 = ((s41.a) i0Var.k).d();
                        cli.n nVar7 = (cli.n) j0Var.i.get();
                        ffk.t tVarF11 = i0Var.f246013h.f();
                        vc.s.j(tVarF11);
                        egk.e eVarE2 = i3Var4.e();
                        vc.s.j(eVarE2);
                        j60.a aVar11 = (j60.a) j0Var.e.get();
                        ibk.b bVar2 = (ibk.b) i0Var.A.D.get();
                        vc.s.j(bVar2);
                        return new emk.k(planGiftBenefitsScreenContract$InputData, xVarD4, nVar7, tVarF11, eVarE2, aVar11, bVar2, i3Var4.f(), (yfk.a) j0Var.f246065g.get());
                    case 6:
                        return new bof.r(new dnk.m(new dnk.c(new dnk.l(i0Var4.e.g(), 0)), new dnk.d(), new dnk.l(i0Var4.e.g(), 0)), new com.revolut.retail.feature.pricing_plans.ui.impl.footer.e(), new dok.e(new yik.b()), new dnk.a(new dnk.c(new dnk.l(i0Var4.e.g(), 0)), new dnk.d(), new dnk.l(i0Var4.e.g(), 0)));
                    default:
                        throw new AssertionError(i2);
                }
            case 11:
                ite.a aVar12 = i0Var.f246011c;
                if (i2 == 0) {
                    gte.a aVarB6 = aVar12.b();
                    vc.s.j(aVarB6);
                    return new phk.l(aVarB6);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                k0 k0Var = (k0) obj2;
                PlanGiftSendingFlowContract$InputData planGiftSendingFlowContract$InputData = k0Var.f246076a;
                phk.k kVar = (phk.k) k0Var.d.get();
                gte.a aVarB7 = aVar12.b();
                vc.s.j(aVarB7);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.a(planGiftSendingFlowContract$InputData, kVar, aVarB7);
            case 12:
                m0 m0Var = (m0) obj2;
                switch (i2) {
                    case 0:
                        fd6.a aVar13 = (fd6.a) m0Var.f.get();
                        va.g.t(aVar13);
                        return aVar13;
                    case 1:
                        return va.g.s(((zc6.a) i0Var.B).d(), (xc6.a) m0Var.e.get());
                    case 2:
                        return r6.b.k((zc6.a) i0Var.B, "factory");
                    case 3:
                        nkd.a extension3 = (nkd.a) m0Var.f246130h.get();
                        jmk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 4:
                        nkd.b view = m0Var.f246126a;
                        kld.a factory2 = (kld.a) i0Var.d.K.get();
                        vc.s.j(factory2);
                        jmk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.a(view);
                    case 5:
                        return va.g.u((xc6.a) m0Var.e.get());
                    case 6:
                        mkd.g view2 = m0Var.f246127b;
                        rkd.m factory3 = i0Var.d.a();
                        vc.s.j(factory3);
                        jmk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.a(view2);
                    case 7:
                        wik.u uVar2 = (wik.u) i0Var.f246010b.Q.get();
                        vc.s.j(uVar2);
                        return new kmk.f(uVar2);
                    case 8:
                        PlanHubV2ScreenContract$InputData planHubV2ScreenContract$InputData = m0Var.f246128c;
                        i0 i0Var5 = m0Var.d;
                        cli.n nVar8 = (cli.n) m0Var.f246133m.get();
                        u06.c cVar4 = i0Var.f;
                        i3 i3Var5 = i0Var.f246010b;
                        q06.l lVarA = cVar4.a();
                        vc.s.j(lVarA);
                        ajk.c cVar5 = new ajk.c(i0Var5.f246010b.g());
                        ffk.t tVarF12 = i0Var.f246013h.f();
                        vc.s.j(tVarF12);
                        egk.e eVarE3 = i3Var5.e();
                        vc.s.j(eVarE3);
                        mkd.d dVar4 = (mkd.d) m0Var.k.get();
                        ajk.b bVarF4 = i3Var5.f();
                        i4b.f fVarB = ((zc6.a) i0Var.B).b();
                        kmk.b bVar3 = (kmk.b) m0Var.f246132l.get();
                        mk0.a aVarA7 = i0Var5.V.a();
                        vc.s.j(aVarA7);
                        wik.g gVar = new wik.g(aVarA7);
                        mk0.a aVarA8 = i0Var5.V.a();
                        vc.s.j(aVarA8);
                        wik.g gVar2 = new wik.g(aVarA8);
                        lmk.a aVar14 = new lmk.a(i0Var5.W.b());
                        zja.a aVarA9 = ((ika.b) i0Var5.Q).a();
                        vc.s.j(aVarA9);
                        wik.m mVarA = i0Var5.f246024x.a();
                        gte.a aVarB8 = i0Var5.f246011c.b();
                        vc.s.j(aVarB8);
                        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a aVar15 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a(gVar2, aVar14, aVarA9, mVarA, aVarB8, new ajk.c(i0Var5.f246010b.g()));
                        ffk.t tVarF13 = i3Var5.e.f();
                        vc.s.j(tVarF13);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g(planHubV2ScreenContract$InputData, nVar8, lVarA, cVar5, tVarF12, eVarE3, dVar4, bVarF4, fVarB, bVar3, gVar, aVar15, new rul.e(tVarF13, (kjk.t) i3Var5.P.get(), x3.a()));
                    case 9:
                        dnk.l lVarB = m0Var.b();
                        i0 i0Var6 = m0Var.d;
                        ojk.t tVar2 = new ojk.t(new c7b.a(i0Var6.e.g(), 2), m0Var.b());
                        ojk.p0 p0Var = new ojk.p0(m0Var.b(), new ojk.n0());
                        ojk.s sVar2 = new ojk.s();
                        gte.a aVarB9 = i0Var6.f246011c.b();
                        vc.s.j(aVarB9);
                        return new cq9.m(new ojk.g0(lVarB, tVar2, p0Var, sVar2, aVarB9), new imk.n(m0Var.b()), new imk.l(new imk.c(m0Var.b(), new dok.e(new yik.b()), new imk.k(new c7b.a(i0Var6.e.g(), 2), m0Var.b()))), ((zc6.a) i0Var.B).c());
                    default:
                        throw new AssertionError(i2);
                }
            case 13:
                g3 g3Var3 = i0Var.u;
                n0 n0Var = (n0) obj2;
                agk.a aVar16 = n0Var.f246153a;
                switch (i2) {
                    case 0:
                        return agk.b.B(aVar16, (zfk.c) n0Var.f246157h.get(), (xfk.b) n0Var.e.get(), (bgk.a) n0Var.f.get(), (wfk.a) n0Var.f246156g.get(), (bgk.a) n0Var.i.get());
                    case 1:
                        mhk.a aVarC4 = g3Var3.c();
                        vc.s.j(aVarC4);
                        return afj.y3.C(aVar16, aVarC4, (xfk.b) n0Var.e.get(), (bgk.a) n0Var.f.get(), (wfk.a) n0Var.f246156g.get());
                    case 2:
                        fhk.a aVarB10 = g3Var3.b();
                        vc.s.j(aVarB10);
                        return afj.y3.b(aVar16, aVarB10);
                    case 3:
                        ohk.a aVarD5 = g3Var3.d();
                        vc.s.j(aVarD5);
                        return afj.y3.D(aVar16, aVarD5);
                    case 4:
                        dhk.a aVarA10 = g3Var3.a();
                        vc.s.j(aVarA10);
                        return afj.y3.z(aVar16, aVarA10);
                    case 5:
                        ohk.a aVarD6 = g3Var3.d();
                        vc.s.j(aVarD6);
                        return agk.b.y(aVar16, aVarD6);
                    case 6:
                        PlanKeepFlowContract$InputData planKeepFlowContract$InputData = n0Var.f246154b;
                        ffk.t tVarF14 = i0Var.f246013h.f();
                        vc.s.j(tVarF14);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a(planKeepFlowContract$InputData, tVarF14, new zhk.c());
                    default:
                        throw new AssertionError(i2);
                }
            case 14:
                i3 i3Var6 = i0Var.f246010b;
                efk.a aVar17 = i0Var.f246013h;
                q0 q0Var = (q0) obj2;
                i0 i0Var7 = q0Var.f246197a;
                switch (i2) {
                    case 0:
                        return kxa.j.l((j60.a) q0Var.d.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) q0Var.f246198b.get(), (rp0.m) q0Var.f246199c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        zfk.c planSubscriberControllerModelExtension = (zfk.c) q0Var.f.get();
                        fhk.a factory4 = i0Var7.u.b();
                        vc.s.j(factory4);
                        mhk.b bVar4 = mhk.c.Companion;
                        bVar4.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        ehk.g planDurableTermsControllerExtension = factory4.a();
                        ohk.a factory5 = i0Var7.u.d();
                        vc.s.j(factory5);
                        bVar4.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        ohk.g planTermsWorkflowControllerExtension = factory5.a();
                        dhk.a factory6 = i0Var7.u.a();
                        vc.s.j(factory6);
                        bVar4.getClass();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        dhk.e globalPlansControllerExtension = new dhk.e(factory6.f114822a);
                        bVar4.getClass();
                        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
                        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
                        Intrinsics.checkNotNullParameter(globalPlansControllerExtension, "globalPlansControllerExtension");
                        yji.n[] elements = {planDurableTermsControllerExtension, planSubscriberControllerModelExtension, planTermsWorkflowControllerExtension, globalPlansControllerExtension};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        Set setY0 = kotlin.collections.d.y0(elements);
                        vc.s.k(setY0);
                        return setY0;
                    case 4:
                        mhk.a factory7 = i0Var.u.c();
                        vc.s.j(factory7);
                        fhk.a factory8 = i0Var7.u.b();
                        vc.s.j(factory8);
                        mhk.b bVar5 = mhk.c.Companion;
                        bVar5.getClass();
                        Intrinsics.checkNotNullParameter(factory8, "factory");
                        ehk.g planDurableTermsControllerExtension2 = factory8.a();
                        ohk.a factory9 = i0Var7.u.d();
                        vc.s.j(factory9);
                        bVar5.getClass();
                        Intrinsics.checkNotNullParameter(factory9, "factory");
                        ohk.g planTermsWorkflowControllerExtension2 = factory9.a();
                        dhk.a factory10 = i0Var7.u.a();
                        vc.s.j(factory10);
                        bVar5.getClass();
                        Intrinsics.checkNotNullParameter(factory10, "factory");
                        dhk.e globalPlansControllerExtension2 = new dhk.e(factory10.f114822a);
                        bVar5.getClass();
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension2, "planDurableTermsControllerExtension");
                        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension2, "planTermsWorkflowControllerExtension");
                        Intrinsics.checkNotNullParameter(globalPlansControllerExtension2, "globalPlansControllerExtension");
                        return factory7.a(planTermsWorkflowControllerExtension2, planDurableTermsControllerExtension2, globalPlansControllerExtension2);
                    case 5:
                        cha.b bVarC2 = aVar17.c();
                        vc.s.j(bVarC2);
                        ffk.t tVarF15 = aVar17.f();
                        vc.s.j(tVarF15);
                        dVar = new vjk.d(bVarC2, tVarF15, new vjk.e());
                        break;
                    case 6:
                        cha.b bVarC3 = aVar17.c();
                        vc.s.j(bVarC3);
                        ffk.t tVarF16 = aVar17.f();
                        vc.s.j(tVarF16);
                        dVar = new yjk.c(bVarC3, tVarF16, (zfk.c) q0Var.f.get());
                        break;
                    case 7:
                        jki.p pVar2 = (jki.p) q0Var.f246202j.get();
                        ffk.t tVarF17 = aVar17.f();
                        vc.s.j(tVarF17);
                        egk.e eVarE4 = i3Var6.e();
                        vc.s.j(eVarE4);
                        j60.a aVar18 = (j60.a) q0Var.d.get();
                        pmk.d dVar5 = new pmk.d();
                        cha.b bVarC4 = aVar17.c();
                        vc.s.j(bVarC4);
                        sh3.a aVarA11 = i0Var.v.a();
                        vc.s.j(aVarA11);
                        ajk.f fVarH2 = i3Var6.h();
                        vjk.a aVar19 = (vjk.a) q0Var.f246201h.get();
                        yjk.a aVar20 = (yjk.a) q0Var.i.get();
                        wli.x xVarD5 = ((s41.a) i0Var.k).d();
                        ajk.b bVarF5 = i3Var6.f();
                        gte.a aVarB11 = i0Var.f246011c.b();
                        vc.s.j(aVarB11);
                        return new pmk.v(pVar2, tVarF17, eVarE4, aVar18, dVar5, bVarC4, aVarA11, fVarH2, aVar19, aVar20, xVarD5, bVarF5, aVarB11);
                    case 8:
                        jgk.u uVar3 = (jgk.u) i3Var6.V.get();
                        vc.s.j(uVar3);
                        zjk.c cVar6 = new zjk.c();
                        zjk.c cVar7 = new zjk.c();
                        jgk.u uVar4 = (jgk.u) i0Var7.f246010b.V.get();
                        vc.s.j(uVar4);
                        return new pmk.x(uVar3, cVar6, new pmk.c(cVar7, uVar4));
                    default:
                        throw new AssertionError(i2);
                }
                return dVar;
            case 15:
                g3 g3Var4 = i0Var.u;
                s0 s0Var = (s0) obj2;
                agk.a aVar21 = s0Var.f246224a;
                switch (i2) {
                    case 0:
                        return agk.b.B(aVar21, (zfk.c) s0Var.f246228h.get(), (xfk.b) s0Var.e.get(), (bgk.a) s0Var.f.get(), (wfk.a) s0Var.f246227g.get(), (bgk.a) s0Var.i.get());
                    case 1:
                        mhk.a aVarC5 = g3Var4.c();
                        vc.s.j(aVarC5);
                        return afj.y3.C(aVar21, aVarC5, (xfk.b) s0Var.e.get(), (bgk.a) s0Var.f.get(), (wfk.a) s0Var.f246227g.get());
                    case 2:
                        fhk.a aVarB12 = g3Var4.b();
                        vc.s.j(aVarB12);
                        return afj.y3.b(aVar21, aVarB12);
                    case 3:
                        ohk.a aVarD7 = g3Var4.d();
                        vc.s.j(aVarD7);
                        return afj.y3.D(aVar21, aVarD7);
                    case 4:
                        dhk.a aVarA12 = g3Var4.a();
                        vc.s.j(aVarA12);
                        return afj.y3.z(aVar21, aVarA12);
                    case 5:
                        ohk.a aVarD8 = g3Var4.d();
                        vc.s.j(aVarD8);
                        return agk.b.y(aVar21, aVarD8);
                    case 6:
                        wli.x xVarD6 = ((s41.a) i0Var.k).d();
                        ajk.b bVarF6 = i0Var.f246010b.f();
                        zfk.c cVar8 = (zfk.c) s0Var.f246228h.get();
                        ma3.a aVarA13 = i0Var.f246023w.a();
                        vc.s.j(aVarA13);
                        ffk.t tVarF18 = i0Var.f246013h.f();
                        vc.s.j(tVarF18);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b(xVarD6, bVarF6, cVar8, aVarA13, tVarF18, new ylk.a());
                    case 7:
                        PlanOfferFlowContract$InputData planOfferFlowContract$InputData = s0Var.f246225b;
                        com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar6 = (com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b) s0Var.k.get();
                        aik.a aVar22 = new aik.a();
                        zfk.c cVar9 = (zfk.c) s0Var.f246228h.get();
                        Context context = s0Var.f246226c.C;
                        bik.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d(planOfferFlowContract$InputData, bVar6, aVar22, cVar9, new qz0.n(context, null, null));
                    default:
                        throw new AssertionError(i2);
                }
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
                e1 e1Var = (e1) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.b(((blb.e) i0Var.f246015l).c());
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar9 = (cli.n) e1Var.f245937b.get();
                PlanSavingsAccountsScreenContract$InputData planSavingsAccountsScreenContract$InputData = e1Var.f245936a;
                djb.n nVarA = i0Var.f246016m.a();
                vc.s.j(nVarA);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.a(nVar9, planSavingsAccountsScreenContract$InputData, nVarA);
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
                rkd.g gVar3 = i0Var.d;
                i3 i3Var7 = i0Var.f246010b;
                o1 o1Var = (o1) obj2;
                i0 i0Var8 = o1Var.e;
                switch (i2) {
                    case 0:
                        nkd.a extension4 = (nkd.a) o1Var.f.get();
                        rjk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        vc.s.k(extension4);
                        return extension4;
                    case 1:
                        nkd.b view3 = o1Var.f246174a;
                        kld.a factory11 = (kld.a) gVar3.K.get();
                        vc.s.j(factory11);
                        rjk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view3, "view");
                        Intrinsics.checkNotNullParameter(factory11, "factory");
                        return factory11.a(view3);
                    case 2:
                        mkd.g view4 = o1Var.f246175b;
                        rkd.m factory12 = gVar3.a();
                        vc.s.j(factory12);
                        rjk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view4, "view");
                        Intrinsics.checkNotNullParameter(factory12, "factory");
                        return factory12.a(view4);
                    case 3:
                        cli.n nVar10 = (cli.n) o1Var.i.get();
                        q06.l lVarA2 = i0Var.f.a();
                        vc.s.j(lVarA2);
                        return new qjk.e(nVar10, lVarA2, new ajk.c(i0Var8.f246010b.g()), (mkd.d) o1Var.f246178h.get(), o1Var.f246176c, (qjk.q) o1Var.k.get(), i3Var7.f());
                    case 4:
                        dnk.l lVarB2 = o1Var.b();
                        ojk.t tVar3 = new ojk.t(new c7b.a(i0Var8.e.g(), 2), o1Var.b());
                        ojk.p0 p0Var2 = new ojk.p0(o1Var.b(), new ojk.n0());
                        ojk.s sVar3 = new ojk.s();
                        gte.a aVarB13 = i0Var8.f246011c.b();
                        vc.s.j(aVarB13);
                        return new qjk.h(new ojk.g0(lVarB2, tVar3, p0Var2, sVar3, aVarB13), o1Var.b(), new dok.e(new yik.b()));
                    case 5:
                        bgc.e eVarC = i0Var.f246012g.c();
                        vc.s.j(eVarC);
                        egk.e eVarE5 = i3Var7.e();
                        vc.s.j(eVarE5);
                        ffk.t tVarF19 = i0Var.f246013h.f();
                        vc.s.j(tVarF19);
                        f01.a aVar23 = (f01.a) o1Var.f246179j.get();
                        qjk.o oVar = new qjk.o();
                        qjk.n nVar11 = new qjk.n();
                        gte.a aVarB14 = i0Var8.f246011c.b();
                        vc.s.j(aVarB14);
                        qjk.p pVar3 = new qjk.p(aVar23, oVar, nVar11, aVarB14);
                        vf5.d dVar6 = (vf5.d) ((tf5.l) i0Var.i).f270262n.get();
                        vc.s.j(dVar6);
                        return new qjk.t(eVarC, eVarE5, tVarF19, pVar3, dVar6, new buf.n(i0Var8.f246014j.e(), 1), i0Var.f246014j.e());
                    case 6:
                        ViewController viewController = o1Var.d;
                        rjk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController, "viewController");
                        return new f01.c(viewController.m2());
                    default:
                        throw new AssertionError(i2);
                }
        }
    }
}
