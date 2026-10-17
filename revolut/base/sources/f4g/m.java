package f4g;

import android.app.Activity;
import android.content.Context;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewControllerContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.email.confirm.EmailConfirmationScreenContract$InputData;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlowContract$InputData;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsAccountsSelectionControllerDescriptor$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.open_document.SavingsDocumentLauncherFlowContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.documents.TravelFlightsDocumentsScreenContract$InputData;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementContract$InputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$InputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreenContract$InputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f132151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f132152c;

    public /* synthetic */ m(Object obj2, qji.b bVar, int i) {
        this.f132150a = i;
        this.f132151b = obj2;
        this.f132152c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f132150a) {
            case 0:
                y5g.m mVar = new y5g.m();
                TravelFlightsDocumentsScreenContract$InputData travelFlightsDocumentsScreenContract$InputData = ((n) this.f132152c).f132156a;
                b bVar = (b) this.f132151b;
                return new y5g.k(mVar, travelFlightsDocumentsScreenContract$InputData, (h4g.e) bVar.z.get(), bVar.f132059h.d());
            case 1:
                return new k6g.j(new k6g.k(), ((u) this.f132152c).f132197a, (b4g.f) ((b) this.f132151b).f132067s.get(), new j5g.b());
            case 2:
                return new com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b(new com.revolut.feature.travel.flights.impl.ui.screen.post_booking.c(), ((x) this.f132152c).f132214a, (b4g.f) ((b) this.f132151b).f132067s.get());
            case 3:
                com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.b bVar2 = new com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.b();
                TravelFlightsDatesSelectionScreenContract$InputData travelFlightsDatesSelectionScreenContract$InputData = ((h0) this.f132152c).f132123b;
                l80.e eVarH = ((b) this.f132151b).d.h();
                vc.s.j(eVarH);
                return new com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.a(bVar2, travelFlightsDatesSelectionScreenContract$InputData, eVarH);
            case 4:
                j0 j0Var = (j0) this.f132152c;
                TravelFlightsDiscoverScreenContract$InputData travelFlightsDiscoverScreenContract$InputData = j0Var.f132133b;
                qd0.b bVarN = j0Var.f132134c.d.n();
                vc.s.j(bVarN);
                qee.s sVar = new qee.s(new x5g.b(new p4g.b(bVarN)));
                b bVar3 = (b) this.f132151b;
                return new com.revolut.feature.travel.flights.impl.ui.screen.discover.a(travelFlightsDiscoverScreenContract$InputData, sVar, (h4g.k) bVar3.v.get(), (h4g.i) bVar3.f132070x.get());
            case 5:
                com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.b bVar4 = new com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.b();
                TravelFlightsDatesSelectionScreenContract$InputData travelFlightsDatesSelectionScreenContract$InputData2 = ((h0) this.f132152c).f132123b;
                l80.e eVarH2 = ((b) this.f132151b).d.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.a(bVar4, travelFlightsDatesSelectionScreenContract$InputData2, eVarH2);
            case 6:
                j0 j0Var2 = (j0) this.f132152c;
                TravelFlightsDiscoverScreenContract$InputData travelFlightsDiscoverScreenContract$InputData2 = j0Var2.f132133b;
                qd0.b bVarN2 = j0Var2.f132134c.d.n();
                vc.s.j(bVarN2);
                qee.s sVar2 = new qee.s(new x5g.b(new p4g.b(bVarN2)));
                b bVar5 = (b) this.f132151b;
                return new com.revolut.feature.travel.flights.impl.ui.screen.discover.a(travelFlightsDiscoverScreenContract$InputData2, sVar2, (h4g.k) bVar5.v.get(), (h4g.i) bVar5.f132070x.get());
            case 7:
                return new i7g.g(new i7g.i(new k7g.a()), ((y0) this.f132152c).f132222b, (b4g.f) ((b) this.f132151b).f132067s.get());
            case 8:
                return new i7g.g(new i7g.i(new k7g.a()), ((y0) this.f132152c).f132222b, (b4g.f) ((b) this.f132151b).f132067s.get());
            case 9:
                return new com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a(((f6h.b) this.f132152c).f132427a, ((f6h.c) this.f132151b).e.L(), new s6h.m());
            case 10:
                return new com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.a(new n6h.f(), new n6h.a(), ((f6h.c) this.f132151b).e.L(), ((f6h.d) this.f132152c).f132438a);
            case 11:
                f6h.e eVar = (f6h.e) this.f132152c;
                WealthMarginMinimumRequirementContract$InputData wealthMarginMinimumRequirementContract$InputData = eVar.f132440a;
                fmc.z zVar = new fmc.z((c6h.a) eVar.f132441b.o.get(), new yk0.d());
                f6h.c cVar = (f6h.c) this.f132151b;
                ael.t tVarF = cVar.i.f();
                vc.s.j(tVarF);
                return new com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a(wealthMarginMinimumRequirementContract$InputData, zVar, tVarF, cVar.e.d(), new q6h.j());
            case 12:
                FormPermissionFlowContract$InputData formPermissionFlowContract$InputData = ((fa0.f) this.f132152c).f133031a;
                w39.b bVarA = ((fa0.k) this.f132151b).d.a();
                vc.s.j(bVarA);
                return new com.revolut.core.backend_flow.impl.flow.permission.b(formPermissionFlowContract$InputData, bVarA);
            case 13:
                fdk.g gVar = (fdk.g) this.f132151b;
                return new com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c(((s41.a) gVar.e).d(), new jdk.a(((fdk.b) this.f132152c).f133970a.f.g()), (gdk.a) gVar.f133996w.get());
            case 14:
                fdk.g gVar2 = (fdk.g) this.f132151b;
                gdk.a aVar = (gdk.a) gVar2.f133996w.get();
                l80.e eVarH3 = gVar2.f133987j.h();
                vc.s.j(eVarH3);
                return new ldk.y(aVar, eVarH3, new ldk.a0(new pdk.c(), new pdk.d(), new pdk.h(new pdk.f(((fdk.c) this.f132152c).f133972a.f.g())), new pdk.a(), new pdk.b(), new yik.b()));
            case 15:
                fdk.d dVar = (fdk.d) this.f132152c;
                MonthlyDrawHubScreenContract$InputData monthlyDrawHubScreenContract$InputData = dVar.f133974a;
                fdk.g gVar3 = (fdk.g) this.f132151b;
                gdk.d dVar2 = (gdk.d) gVar3.z.get();
                ffk.t tVarF2 = gVar3.k.f();
                vc.s.j(tVarF2);
                fdk.g gVar4 = dVar.f133975b;
                pqi.a aVar2 = gVar4.f;
                qdk.g gVar5 = new qdk.g(aVar2.g());
                l80.e eVarH4 = gVar4.f133987j.h();
                vc.s.j(eVarH4);
                return new qdk.w0(monthlyDrawHubScreenContract$InputData, dVar2, tVarF2, new m5e.o(gVar5, new qdk.n(eVarH4), new qdk.f(), new qdk.x0(), new qdk.k(aVar2.g()), new qdk.e(aVar2.g()), new qdk.i(aVar2.g()), new qdk.c(aVar2.g()), new qdk.y0(), new qdk.a(aVar2.g()), new yik.b()));
            case 16:
                fdk.e eVar2 = (fdk.e) this.f132152c;
                MonthlyDrawsFlowContract$InputData monthlyDrawsFlowContract$InputData = eVar2.f133977a;
                fdk.g gVar6 = (fdk.g) this.f132151b;
                return new com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d(monthlyDrawsFlowContract$InputData, ((s41.a) gVar6.e).d(), (gdk.d) gVar6.z.get(), new hdk.k(), new hdk.c(eVar2.f133978b.f.g()), gVar6.f133988l.a());
            case 17:
                return new com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.a(((fdk.h) this.f132152c).f133999a, ((s41.a) ((fdk.g) this.f132151b).e).d());
            case 18:
                fdk.i iVar = (fdk.i) this.f132152c;
                PlanRewardsRevealScreenContract$InputData planRewardsRevealScreenContract$InputData = iVar.f134001a;
                fdk.g gVar7 = (fdk.g) this.f132151b;
                bdk.j jVar = (bdk.j) gVar7.v.get();
                ffk.t tVarF3 = gVar7.k.f();
                vc.s.j(tVarF3);
                fdk.g gVar8 = iVar.f134002b;
                Context context = gVar8.f133983b;
                return new udk.z(planRewardsRevealScreenContract$InputData, jVar, tVarF3, new kbb.c(context, kqi.b.a(context), gVar8.f133989m.b()), new udk.b0(new yik.b()));
            case 19:
                ChangeNameFlowContract$InputData changeNameFlowContract$InputData = ((fma.a) this.f132152c).f136035a;
                fma.h hVar = (fma.h) this.f132151b;
                jvh.a aVarA = hVar.f136137m.a();
                vc.s.j(aVarA);
                til.m mVarA = hVar.f136138n.a();
                vc.s.j(mVarA);
                return new com.revolut.feature.profile.impl.ui.details.name.flow.b(changeNameFlowContract$InputData, aVarA, mVarA);
            case 20:
                EmailConfirmationScreenContract$InputData emailConfirmationScreenContract$InputData = ((fma.e) this.f132152c).f136089a;
                fma.h hVar2 = (fma.h) this.f132151b;
                ang.f fVarE = hVar2.f136134h.e();
                sf0.h hVarB = hVar2.f136139p.b();
                vc.s.j(hVarB);
                v60.e eVarA = hVar2.f136140q.a();
                vc.s.j(eVarA);
                return new wma.f(emailConfirmationScreenContract$InputData, fVarE, hVarB, eVarA, new wma.g());
            case 21:
                VerifyEmailFlowContract$InputData verifyEmailFlowContract$InputData = ((fma.i) this.f132152c).f136160a;
                fma.h hVar3 = (fma.h) this.f132151b;
                ang.f fVarE2 = hVar3.f136134h.e();
                l80.h hVarV = hVar3.o.v();
                vc.s.j(hVarV);
                sf0.h hVarB2 = hVar3.f136139p.b();
                vc.s.j(hVarB2);
                v60.e eVarA2 = hVar3.f136140q.a();
                vc.s.j(eVarA2);
                return new com.revolut.feature.profile.impl.ui.details.email.c(verifyEmailFlowContract$InputData, fVarE2, hVarV, hVarB2, eVarA2);
            case 22:
                fma.x xVar = (fma.x) this.f132152c;
                wna.u uVar = new wna.u();
                gte.a aVarB = xVar.f136233a.e.b();
                vc.s.j(aVarB);
                wna.v vVar = new wna.v(uVar, aVarB);
                fma.c0 c0Var = (fma.c0) this.f132151b;
                xo.h hVarA = c0Var.f136059h0.a();
                jma.f fVarA = c0Var.f136077w0.a();
                fma.j jVar2 = c0Var.f136067p;
                am2.a aVarI = jVar2.f136165a.i();
                avd.b bVarC = c0Var.u0.c();
                gte.a aVarB2 = c0Var.e.b();
                vc.s.j(aVarB2);
                return new wna.t(vVar, hVarA, fVarA, aVarI, bVarC, aVarB2, jVar2.f136167c.f());
            case 23:
                SelfTerminationFlowContract$InputData selfTerminationFlowContract$InputData = ((fma.f0) this.f132152c).f136095a;
                fma.c0 c0Var2 = (fma.c0) this.f132151b;
                ffk.t tVarF4 = c0Var2.C.f();
                vc.s.j(tVarF4);
                wik.m mVarA2 = c0Var2.D.a();
                wli.x xVarD = ((s41.a) c0Var2.E).d();
                sf0.h hVarB3 = c0Var2.F.b();
                vc.s.j(hVarB3);
                v60.e eVarA3 = c0Var2.G.a();
                vc.s.j(eVarA3);
                return new com.revolut.feature.profile.impl.ui.close_account.c(selfTerminationFlowContract$InputData, tVarF4, mVarA2, xVarD, hVarB3, eVarA3);
            case 24:
                SavingsDocumentLauncherFlowContract$InputData savingsDocumentLauncherFlowContract$InputData = ((fnb.d) this.f132152c).f136604a;
                fnb.b bVar6 = (fnb.b) ((fnb.e) this.f132151b).f136606a;
                mre.c cVarB = bVar6.f136595g.b();
                vc.s.j(cVarB);
                gnb.b bVarA2 = bVar6.a();
                f80.a aVarX = bVar6.d.x();
                vc.s.j(aVarX);
                return new lnb.b(savingsDocumentLauncherFlowContract$InputData, new hnb.d(cVarB, bVarA2, aVarX));
            case 25:
                SavingsAccountsSelectionControllerDescriptor$InputData savingsAccountsSelectionControllerDescriptor$InputData = ((fnb.f) this.f132152c).f136609a;
                fnb.e eVar3 = (fnb.e) this.f132151b;
                ijb.a aVarG = ((blb.e) eVar3.f136607b).g();
                vc.s.j(aVarG);
                gnb.b bVarA3 = ((fnb.b) eVar3.f136606a).a();
                ang.f fVarE3 = eVar3.f136608c.e();
                gte.a aVarB3 = eVar3.d.b();
                vc.s.j(aVarB3);
                return new nnb.o(savingsAccountsSelectionControllerDescriptor$InputData, aVarG, bVarA3, fVarE3, aVarB3, new nnb.q());
            case 26:
                rtd.a aVar3 = ((fq6.a) this.f132151b).f137191c;
                yud.g gVarD = aVar3.d();
                vc.s.j(gVarD);
                avd.b bVarC2 = aVar3.c();
                vc.s.j(bVarC2);
                fq6.b bVar7 = (fq6.b) this.f132152c;
                return new jq6.k(gVarD, bVarC2, new jq6.m(bVar7.f137196b.e.h(), bVar7.f137195a));
            case 27:
                return new com.revolut.feature.raffle.impl.flow.a(((fta.c) this.f132152c).f137988a, ((fta.b) this.f132151b).e.c());
            case 28:
                ew2.w wVar = new ew2.w();
                fw2.e eVar4 = (fw2.e) this.f132152c;
                AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData = eVar4.f138534a;
                fw2.d dVar3 = (fw2.d) this.f132151b;
                z6l.s sVarE = dVar3.f138525g.e();
                l93.b bVarG = dVar3.f138524c.g();
                vc.s.j(bVarG);
                wg1.b bVarB = dVar3.f138522a.b();
                vc.s.j(bVarB);
                li0.b bVarC3 = t2d.c.c(dVar3.f138526h.f271230a);
                li0.a aVar4 = new li0.a();
                li0.d dVar4 = new li0.d();
                ang.f fVarE4 = dVar3.i.e();
                wsg.b bVarA4 = dVar3.f138527j.a();
                al4.b bVarN3 = dVar3.k.n();
                vc.s.j(bVarN3);
                fk3.a aVarA2 = dVar3.f138528l.a();
                vc.s.j(aVarA2);
                ecm.q qVarA = dVar3.f138529m.a();
                da3.j jVar3 = eVar4.f138536c.f138524c;
                l93.f fVarJ = jVar3.j();
                vc.s.j(fVarJ);
                ha3.f fVarD = jVar3.d();
                vc.s.j(fVarD);
                Activity activity = eVar4.f138535b;
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) eVar4.d.get();
                jw2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                yy0.f fVarQ = jh.d.f(controller.m2()).Q();
                vc.s.k(fVarQ);
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) eVar4.d.get();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                ja3.f fVar = new ja3.f(activity, new c90.c(controller2.m2()), fVarD, fVarJ, fVarQ);
                hw2.a aVar5 = new hw2.a();
                l80.e eVarH5 = dVar3.e.h();
                vc.s.j(eVarH5);
                gte.a aVarB4 = dVar3.d.b();
                vc.s.j(aVarB4);
                return new com.revolut.feature.card_add_to_googlepay.impl.a(wVar, addToGooglePayViewControllerContract$InputData, sVarE, bVarG, bVarB, bVarC3, aVar4, dVar4, fVarE4, bVarA4, bVarN3, aVarA2, qVarA, fVar, aVar5, eVarH5, aVarB4, (com.revolut.kompot.navigable.a) eVar4.d.get());
            default:
                GooglePayConfirmationFlowContract$InputData googlePayConfirmationFlowContract$InputData = ((fw2.h) this.f132152c).f138543a;
                yw2.a aVar6 = new yw2.a();
                gte.a aVarB5 = ((fw2.d) this.f132151b).d.b();
                vc.s.j(aVarB5);
                return new com.revolut.feature.card_add_to_googlepay.impl.verification.a(googlePayConfirmationFlowContract$InputData, aVar6, aVarB5);
        }
    }
}
