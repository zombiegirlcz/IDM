package u7i;

import android.content.Context;
import au6.s1;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.FreelancerNewSalePickerScreenContract$InputData;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreenContract$InputData;
import com.revolut.feature.tab.credit.impl.ui.restore.CreditTabRestoreFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.TravelMilesRecommendedFlightsScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreenContract$InputData;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlowContract$InputData;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreenContract$InputData;
import et6.b1;
import et6.c1;
import et6.h1;
import et6.h3;
import et6.y2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import us6.h0;
import us6.j0;
import us6.l0;
import us6.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f277804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f277805c;

    public /* synthetic */ g(Object obj2, xki.e eVar, int i) {
        this.f277803a = i;
        this.f277804b = obj2;
        this.f277805c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f277803a) {
            case 0:
                MoveMoneyAutomationFlowContract$InputData moveMoneyAutomationFlowContract$InputData = ((h) this.f277805c).f277806a;
                zja.a aVarA = ((ika.b) ((l) this.f277804b).f277826e0).a();
                vc.s.j(aVarA);
                return new com.revolut.feature_move_money.impl.automation.flow.b(moveMoneyAutomationFlowContract$InputData, aVarA);
            case 1:
                i iVar = (i) this.f277805c;
                e7i.a aVar = new e7i.a();
                w80.b bVarJ = iVar.f277810b.f277824c.j();
                vc.s.j(bVarJ);
                e7i.t tVar = new e7i.t(aVar, new e7i.c(bVarJ), new e7i.d());
                MoveMoneyAutomationLimitScreenContract$InputData moveMoneyAutomationLimitScreenContract$InputData = iVar.f277809a;
                w80.b bVarJ2 = ((l) this.f277804b).f277824c.j();
                vc.s.j(bVarJ2);
                return new e7i.q(tVar, moveMoneyAutomationLimitScreenContract$InputData, bVarJ2);
            case 2:
                return new com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b(new tul.b(((uac.f) this.f277804b).f278571a.b()), ((uac.a) this.f277805c).f278561a, new zac.m());
            case 3:
                return new bbc.i(((uac.b) this.f277805c).f278563a, new tul.b(((uac.f) this.f277804b).f278571a.b()), new bbc.h());
            case 4:
                ud7.d dVar = (ud7.d) this.f277805c;
                ud7.b bVar = dVar.f279171b;
                kxk.o oVar = new kxk.o(bVar.f279168c, bVar.f279166a);
                ImageGalleryLightboxScreenContract$InputData imageGalleryLightboxScreenContract$InputData = dVar.f279170a;
                ud7.b bVar2 = (ud7.b) this.f277804b;
                return new xd7.i(oVar, imageGalleryLightboxScreenContract$InputData, bVar2.f279166a, bVar2.f279168c, (td7.a) bVar2.e.get());
            case 5:
                vd9.c cVar = ((ud9.b) this.f277805c).f279176a;
                ud9.a aVar2 = (ud9.a) this.f277804b;
                uq.a aVar3 = (uq.a) aVar2.f279173a.f273441c.get();
                vc.s.j(aVar3);
                return new com.revolut.feature.onboarding.selfie.impl.intro.flow.b(cVar, aVar3, aVar2.f279174b.e());
            case 6:
                ufg.h hVar = (ufg.h) this.f277805c;
                ufg.g gVar = hVar.f279736b;
                Context context = gVar.f279710b;
                hhg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                ihg.b bVar3 = new ihg.b(new ihg.d(new f01.c(context)), new ihg.a(), new xgg.e(gVar.f279717n.g()));
                ufg.g gVar2 = (ufg.g) this.f277804b;
                l80.e eVarH = gVar2.f279720r.h();
                vc.s.j(eVarH);
                return new com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c(bVar3, eVarH, hVar.f279735a, gVar2.c(), (vfg.e) gVar2.M.get());
            case 7:
                ufg.i iVar2 = (ufg.i) this.f277805c;
                bof.r rVar = new bof.r(iVar2.f279741a, new mig.f(), new mig.b());
                TravelMilesFlightLocationPickerScreenContract$InputData travelMilesFlightLocationPickerScreenContract$InputData = iVar2.f279741a;
                vfg.r rVarC = ((ufg.g) this.f277804b).c();
                ufg.g gVar3 = iVar2.f279742b;
                return new lig.p(rVar, travelMilesFlightLocationPickerScreenContract$InputData, rVarC, new vfg.k(new yk0.d(), gVar3.d()), new vfg.p(new lfg.l((ue0.c) gVar3.V.get())));
            case 8:
                ngg.n nVar = new ngg.n();
                TravelMilesFlightSearchDashboardPagerFlowContract$InputData travelMilesFlightSearchDashboardPagerFlowContract$InputData = ((ufg.j) this.f277805c).f279747a;
                ufg.g gVar4 = (ufg.g) this.f277804b;
                nyb.k kVarC = gVar4.f279712g.c();
                vc.s.j(kVarC);
                return new com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a(nVar, travelMilesFlightSearchDashboardPagerFlowContract$InputData, kVarC, gVar4.a());
            case 9:
                ufg.m mVar = (ufg.m) this.f277805c;
                thg.a menuItemsMapper = new thg.a();
                Intrinsics.checkNotNullParameter(menuItemsMapper, "menuItemsMapper");
                return new com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a(new rhg.w(), mVar.f279766a, ((ufg.g) this.f277804b).c());
            case 10:
                ufg.o oVar2 = (ufg.o) this.f277805c;
                vhg.g gVar5 = new vhg.g();
                vhg.i iVar3 = new vhg.i();
                ufg.g gVar6 = oVar2.f279776b;
                Context context2 = gVar6.f279710b;
                ohg.a aVar4 = ohg.b.Companion;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                jhg.b bVar4 = new jhg.b(new f01.c(context2));
                vhg.k kVar = new vhg.k();
                Context context3 = gVar6.f279710b;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(context3, "context");
                ihg.d dVar2 = new ihg.d(new f01.c(context3));
                vhg.a aVar5 = new vhg.a();
                gte.a aVarB = gVar6.e.b();
                vc.s.j(aVarB);
                kxk.o oVar3 = new kxk.o(gVar5, iVar3, new vhg.f(bVar4, kVar, dVar2, aVar5, aVarB), new vhg.h());
                TravelMilesFlightSearchResultsScreenContract$InputData travelMilesFlightSearchResultsScreenContract$InputData = oVar2.f279775a;
                vhg.b bVar5 = new vhg.b();
                vfg.o oVar4 = new vfg.o(new yk0.d(), gVar6.c());
                ufg.g gVar7 = (ufg.g) this.f277804b;
                vfg.r rVarC2 = gVar7.c();
                q06.l lVarA = gVar7.f279725y.a();
                vc.s.j(lVarA);
                gte.a aVarB2 = gVar7.e.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f(oVar3, travelMilesFlightSearchResultsScreenContract$InputData, bVar5, oVar4, rVarC2, lVarA, aVarB2);
            case 11:
                TravelMilesFlowContract$InputData travelMilesFlowContract$InputData = ((ufg.r) this.f277805c).f279786a;
                ufg.g gVar8 = (ufg.g) this.f277804b;
                eub.i iVarE = gVar8.f279712g.e();
                vc.s.j(iVarE);
                gte.a aVarB3 = gVar8.e.b();
                vc.s.j(aVarB3);
                zja.a aVarA2 = ((ika.b) gVar8.f279713h).a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.travel.miles.impl.ui.flow.b(travelMilesFlowContract$InputData, iVarE, aVarB3, aVarA2, gVar8.a());
            case 12:
                ufg.u uVar = (ufg.u) this.f277805c;
                iig.o oVar5 = new iig.o();
                iig.d dVar3 = new iig.d();
                iig.m mVar2 = new iig.m(new agg.d());
                iig.n nVar2 = new iig.n();
                iig.g gVar9 = new iig.g();
                TravelMilesRecommendedFlightsScreenContract$InputData travelMilesRecommendedFlightsScreenContract$InputData = uVar.f279795a;
                gig.t tVar2 = new gig.t(oVar5, dVar3, mVar2, nVar2, gVar9, new iig.i(travelMilesRecommendedFlightsScreenContract$InputData), new iig.h());
                ufg.g gVar10 = uVar.f279796b;
                sf0.h hVarB = gVar10.o.b();
                vc.s.j(hVarB);
                v60.e eVarA = gVar10.z.a();
                vc.s.j(eVarA);
                iig.f fVar = new iig.f(hVarB, eVarA);
                ufg.g gVar11 = (ufg.g) this.f277804b;
                return new gig.s(tVar2, travelMilesRecommendedFlightsScreenContract$InputData, fVar, new tnb.g0((lfg.w) gVar11.Y.get()), (vfg.q) gVar11.G.get(), (vfg.e) gVar11.M.get());
            case 13:
                ufh.i iVar4 = (ufh.i) this.f277804b;
                ael.d0 d0VarK = iVar4.f279858n.k();
                vc.s.j(d0VarK);
                ybl.k kVarD = iVar4.f279851b.d();
                vc.s.j(kVarD);
                vrl.s sVarD = iVar4.o.d();
                vc.s.j(sVarD);
                return new agh.j(d0VarK, kVarD, sVarD, ((ufh.b) this.f277805c).f279828a, new agh.k());
            case 14:
                ael.d0 d0VarK2 = ((ufh.i) this.f277804b).f279858n.k();
                vc.s.j(d0VarK2);
                ufh.h hVar2 = (ufh.h) this.f277805c;
                nbh.a instrumentImageProvider = new nbh.a();
                Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
                return new ngh.h(d0VarK2, new com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates.a(), hVar2.f279848a);
            case 15:
                CreditTabRestoreFlowContract$InputData creditTabRestoreFlowContract$InputData = ((uie.k) this.f277805c).f280398a;
                vie.i iVarB = ((uie.l) this.f277804b).f280400a.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.tab.credit.impl.ui.restore.a(creditTabRestoreFlowContract$InputData, iVarB);
            case 16:
                ReferralWithIncentiveFlowContract$InputData referralWithIncentiveFlowContract$InputData = ((us2.h) this.f277805c).f282402a;
                us2.j jVar = (us2.j) this.f277804b;
                vu.d dVar4 = (vu.d) jVar.f282412h.get();
                cpi.g gVarH = jVar.f282410c.h();
                vu.c cVar2 = (vu.c) jVar.f282408a.k.get();
                vc.s.j(cVar2);
                return new com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a(referralWithIncentiveFlowContract$InputData, dVar4, gVarH, cVar2);
            case 17:
                return new com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c(new ct6.b(), ((us6.a) this.f277805c).f282442a, ((zc6.a) ((us6.q) this.f277804b).J).e());
            case 18:
                us6.q qVar = (us6.q) this.f277804b;
                gr6.i iVarA = qVar.f282689l.a();
                vc.s.j(iVarA);
                l80.e eVarH2 = qVar.f282691m.h();
                vc.s.j(eVarH2);
                us6.g gVar12 = (us6.g) this.f277805c;
                FreelancerAcquiringOrderFiltersScreenContract$InputData freelancerAcquiringOrderFiltersScreenContract$InputData = gVar12.f282543a;
                l70.e eVar = gVar12.f282544b.f282691m;
                qd0.b languageProvider = eVar.n();
                vc.s.j(languageProvider);
                mu6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                t17.c cVar3 = new t17.c(new rx0.i(2, ((s80.b) languageProvider).b()));
                t70.b bVarG = eVar.g();
                vc.s.j(bVarG);
                return new com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a(iVarA, eVarH2, freelancerAcquiringOrderFiltersScreenContract$InputData, new lu6.s(cVar3, new t17.g(bVarG, new t17.p()), new t17.h(new t17.e()), new t17.a(), new t17.d(new t17.p(), new t17.e())));
            case 19:
                us6.q qVar2 = (us6.q) this.f277804b;
                b9k.f fVarC = qVar2.c();
                h3 h3Var = (h3) qVar2.f282677e1.get();
                gr6.e eVarA2 = qVar2.f282692n.a();
                vc.s.j(eVarA2);
                r10.v vVarG = qVar2.g();
                jf1.a aVarA3 = qVar2.f282717y.a();
                vc.s.j(aVarA3);
                w80.b bVarJ3 = qVar2.f282691m.j();
                vc.s.j(bVarJ3);
                cu6.a aVar6 = new cu6.a(bVarJ3, qVar2.b());
                jr6.m mVar3 = (jr6.m) qVar2.T0.get();
                us6.i iVar5 = (us6.i) this.f277805c;
                FreelancerAcquiringOrderListScreenContract$InputData inputData = iVar5.f282569a;
                us6.q qVar3 = iVar5.f282570b;
                iu6.d menuItemsFactory = new iu6.d();
                Intrinsics.checkNotNullParameter(menuItemsFactory, "menuItemsFactory");
                iu6.b regularFactory = new iu6.l();
                iu6.d menuItemsFactory2 = new iu6.d();
                Intrinsics.checkNotNullParameter(menuItemsFactory2, "menuItemsFactory");
                iu6.h inPersonFactory = new iu6.h();
                iu6.d menuItemsFactory3 = new iu6.d();
                Intrinsics.checkNotNullParameter(menuItemsFactory3, "menuItemsFactory");
                iu6.f eCommerceFactory = new iu6.f();
                pu6.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(regularFactory, "regularFactory");
                Intrinsics.checkNotNullParameter(inPersonFactory, "inPersonFactory");
                Intrinsics.checkNotNullParameter(eCommerceFactory, "eCommerceFactory");
                int i = pu6.a.f239833a[inputData.f73693a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        regularFactory = inPersonFactory;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        regularFactory = eCommerceFactory;
                    }
                }
                iu6.c cVar4 = new iu6.c();
                qu6.b bVarA = us6.q.a();
                u17.l lVar = new u17.l();
                u17.f fVar2 = new u17.f();
                t70.b bVarG2 = qVar3.f282691m.g();
                vc.s.j(bVarG2);
                u17.h hVar3 = new u17.h(bVarG2);
                u17.b bVar6 = new u17.b(new t17.a());
                t17.a acquiringFilterChipsMapper = new t17.a();
                Intrinsics.checkNotNullParameter(acquiringFilterChipsMapper, "acquiringFilterChipsMapper");
                u17.e eVar2 = new u17.e();
                t17.a acquiringFilterChipsMapper2 = new t17.a();
                Intrinsics.checkNotNullParameter(acquiringFilterChipsMapper2, "acquiringFilterChipsMapper");
                return new com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a(fVarC, h3Var, eVarA2, vVarG, aVarA3, aVar6, mVar3, inputData, new ou6.x(regularFactory, cVar4, bVarA, new ku6.b(lVar, fVar2, hVar3, bVar6, eVar2, new u17.a())));
            case 20:
                us6.q qVar4 = (us6.q) this.f277804b;
                gr6.i iVarA2 = qVar4.f282689l.a();
                vc.s.j(iVarA2);
                l80.e eVarH3 = qVar4.f282691m.h();
                vc.s.j(eVarH3);
                us6.l lVar2 = (us6.l) this.f277805c;
                FreelancerAcquiringPaymentFiltersScreenContract$InputData freelancerAcquiringPaymentFiltersScreenContract$InputData = lVar2.f282606a;
                qy5.a aVar7 = new qy5.a(new wu6.b());
                t17.a aVar8 = new t17.a();
                t17.d dVar5 = new t17.d(new t17.p(), new t17.e());
                t70.b bVarG3 = lVar2.f282607b.f282691m.g();
                vc.s.j(bVarG3);
                return new com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a(iVarA2, eVarH3, freelancerAcquiringPaymentFiltersScreenContract$InputData, new cv6.q(aVar7, aVar8, dVar5, new t17.g(bVarG3, new t17.p()), new t17.h(new t17.e())));
            case 21:
                et6.z zVarD = ((us6.q) this.f277804b).d();
                us6.n nVar3 = (us6.n) this.f277805c;
                us6.q qVar5 = nVar3.f282633b;
                fv6.a aVar9 = new fv6.a(qVar5.d());
                l80.e eVarH4 = qVar5.f282691m.h();
                vc.s.j(eVarH4);
                o7.b bVar7 = new o7.b(new av6.b(eVarH4));
                FreelancerAcquiringPaymentListScreenContract$InputData freelancerAcquiringPaymentListScreenContract$InputData = nVar3.f282632a;
                hv6.b bVar8 = new hv6.b(new wu6.b());
                l57.c cVar5 = new l57.c();
                l80.e eVarH5 = qVar5.f282691m.h();
                vc.s.j(eVarH5);
                o7.b bVar9 = new o7.b(new av6.b(eVarH5));
                iu6.c cVar6 = new iu6.c();
                u17.l lVar3 = new u17.l();
                t70.b bVarG4 = qVar5.f282691m.g();
                vc.s.j(bVarG4);
                return new com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b(zVarD, aVar9, bVar7, freelancerAcquiringPaymentListScreenContract$InputData, new fv6.x(bVar8, cVar5, bVar9, cVar6, new bv6.b(lVar3, new u17.h(bVarG4), new u17.b(new t17.a()), new u17.d(new qy5.a(new wu6.b())), new u17.c(new qy5.a(new wu6.b())))));
            case 22:
                b1 b1Var = (b1) ((us6.q) this.f277804b).f282682h0.get();
                us6.v vVar = (us6.v) this.f277805c;
                FreelancerCustomerDetailsScreenContract$InputData freelancerCustomerDetailsScreenContract$InputData = vVar.f282772a;
                qd0.b bVarN = vVar.f282773b.f282691m.n();
                vc.s.j(bVarN);
                return new iw6.m(b1Var, freelancerCustomerDetailsScreenContract$InputData, new iw6.p(bVarN));
            case 23:
                us6.q qVar6 = (us6.q) this.f277804b;
                c1 c1Var = (c1) qVar6.f282678f1.get();
                gr6.e eVarA3 = qVar6.f282692n.a();
                vc.s.j(eVarA3);
                r10.v vVarG2 = qVar6.g();
                h3 h3Var2 = (h3) qVar6.f282677e1.get();
                FreelancerNewSalePickerScreenContract$InputData freelancerNewSalePickerScreenContract$InputData = ((us6.c0) this.f277805c).f282470a;
                jf1.a aVarA4 = qVar6.f282717y.a();
                vc.s.j(aVarA4);
                c27.a pickerItemMapper = new c27.a();
                Intrinsics.checkNotNullParameter(pickerItemMapper, "pickerItemMapper");
                return new com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a(c1Var, eVarA3, vVarG2, h3Var2, freelancerNewSalePickerScreenContract$InputData, aVarA4, new b27.o());
            case 24:
                bgc.e eVarC = ((us6.q) this.f277804b).u.c();
                vc.s.j(eVarC);
                us6.f0 f0Var = (us6.f0) this.f277805c;
                FreelancerPerksDetailsScreenContract$InputData freelancerPerksDetailsScreenContract$InputData = f0Var.f282535a;
                us6.q qVar7 = f0Var.f282536b;
                kgc.d dVarB = qVar7.u.b();
                vc.s.j(dVarB);
                sf0.h hVarB2 = qVar7.H.b();
                vc.s.j(hVarB2);
                return new tz6.o(eVarC, freelancerPerksDetailsScreenContract$InputData, new tz6.q(dVarB, hVarB2));
            case 25:
                return new com.revolut.feature.freelancer.impl.ui.perks.flow.b((gr6.p) ((us6.q) this.f277804b).L0.get(), ((us6.g0) this.f277805c).f282546a);
            case 26:
                bgc.e eVarC2 = ((us6.q) this.f277804b).u.c();
                vc.s.j(eVarC2);
                o7.d dVar6 = new o7.d(eVarC2);
                kgc.d dVarB2 = ((h0) this.f277805c).f282561a.u.b();
                vc.s.j(dVarB2);
                return new wz6.g(dVar6, new wz6.i(dVarB2, new ft6.l()));
            case 27:
                j0 j0Var = (j0) this.f277805c;
                return new ow6.j(new i4b.f((s1) j0Var.f282587b.C1.get()), (y2) ((us6.q) this.f277804b).f282675d1.get(), j0Var.f282586a, new ow6.k());
            case 28:
                us6.q qVar8 = (us6.q) this.f277804b;
                gr6.o oVar6 = (gr6.o) qVar8.V0.get();
                h1 h1Var = (h1) qVar8.c0.get();
                l61.a aVarB4 = qVar8.f282699q.b();
                vc.s.j(aVarB4);
                l0 l0Var = (l0) this.f277805c;
                vw6.b pluginCommonFactory = new vw6.b(new o07.k());
                Intrinsics.checkNotNullParameter(pluginCommonFactory, "pluginCommonFactory");
                return new sw6.h(oVar6, h1Var, aVarB4, new kxk.o(new uw6.b(), new vw6.b(new o07.k()), l0Var.f282609a));
            default:
                us6.q qVar9 = (us6.q) this.f277804b;
                gr6.o oVar7 = (gr6.o) qVar9.V0.get();
                l61.a aVarB5 = qVar9.f282699q.b();
                vc.s.j(aVarB5);
                return new yw6.g(oVar7, aVarB5, new yw6.i(new ax6.a(), new vw6.b(new o07.k()), ((m0) this.f277805c).f282625a));
        }
    }
}
