package vd1;

import android.view.View;
import android.view.ViewGroup;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.currency_picker.LitePosCurrencyPickerFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.currency_picker.LitePosCurrencyPickerFlowContract$InputData;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.CooldownCheckFailedScreen;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.CooldownCheckFailedScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroRootFlow;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlow;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlowContract$InputData;
import com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change.ChangeSpareChangeScreen;
import com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change.ChangeSpareChangeScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreen;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlow;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$InputData;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.feedback.api.navigation.OneClickFeedbackFlowDescriptor;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreenContract$InputData;
import com.revolut.feature.onboarding.selfie.impl.intro.flow.OnboardingSelfieIntroFlow;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlow;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rfi_tool.api.RfiToolFlowInputData;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlow;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsController;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.TroubleshooterFlow;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.TroubleshooterFlowContract$InputData;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreen;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.policies.TravelHotelsPropertyPoliciesScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.policies.TravelHotelsPropertyPoliciesScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$InputData;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreen;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreenContract$InputData;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.footer.PricingPlanFooterInternalContract$TermsClauseClickParcel;
import cp6.e;
import dw3.c1;
import dw3.e6;
import g9g.c0;
import g9g.t;
import java.util.List;
import jm4.a3;
import jm4.k1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import ld1.k;
import ld1.l;
import lf9.m;
import mkh.i;
import mkh.s;
import mkh.u;
import nk7.r;
import nu0.n;
import oki.h;
import ppd.e0;
import ppd.j0;
import ql7.o;
import ql7.y;
import ue0.e;
import vg6.q;
import vge.x;
import xf6.o1;
import xf6.p1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f287771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f287772c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f287770a = i;
        this.f287771b = obj2;
        this.f287772c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        TabAccountsShotDialogAction.Success success;
        int i = this.f287770a;
        Object obj2 = this.f287772c;
        Object obj3 = this.f287771b;
        switch (i) {
            case 0:
                LitePosCurrencyPickerFlowContract$InputData litePosCurrencyPickerFlowContract$InputData = (LitePosCurrencyPickerFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) e.j(((LitePosCurrencyPickerFlow) obj3).m2()).a().get(l.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new k(((l) aVar.b()).f, litePosCurrencyPickerFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 1:
                vd9.c cVar = (vd9.c) obj2;
                phm.a aVar3 = (phm.a) e.j(((OnboardingSelfieIntroFlow) obj3).m2()).a().get(ud9.a.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new ud9.b(((ud9.a) aVar.b()).f279175c, cVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", ud9.a.class, " is not found"));
            case 2:
                KProperty[] kPropertyArr = TravelHotelsPropertyPoliciesScreen.Q;
                qji.b bVarU2 = ((TravelHotelsPropertyPoliciesScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.policies.di.TravelHotelsPropertyPoliciesScreenInjector");
                t tVar = (t) bVarU2;
                return new c0(tVar.f141813b, tVar.f141814c, (TravelHotelsPropertyPoliciesScreenContract$InputData) obj2);
            case 3:
                KProperty[] kPropertyArr2 = SharedAlertDetailsScreen.f0;
                qji.b bVarQ2 = ((SharedAlertDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.AlertDetailsScreenInjector");
                ned.d dVar = (ned.d) bVarQ2;
                return new ned.a(dVar.f214441b, dVar.f214442c, (SharedAlertDetailsScreenContract$InputData) obj2);
            case 4:
                TroubleshooterFlowContract$InputData troubleshooterFlowContract$InputData = (TroubleshooterFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) e.j(((TroubleshooterFlow) obj3).m2()).a().get(off.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new off.c(((off.a) aVar.b()).i, troubleshooterFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", off.a.class, " is not found"));
            case 5:
                LinkResultFlowContract$InputData linkResultFlowContract$InputData = (LinkResultFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) e.j(((LinkResultFlow) obj3).m2()).a().get(o1.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new p1(((o1) aVar.b()).e, linkResultFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o1.class, " is not found"));
            case 6:
                vg6.k kVar = (vg6.k) obj3;
                h.D2(kVar.u);
                q qVar = kVar.f288771r;
                NaviCommand naviCommand = kVar.o.e;
                qVar.getClass();
                kVar.C1(q.b(naviCommand, (String) obj2));
                return Unit.f186387a;
            case 7:
                x xVar = (x) obj3;
                ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) obj2;
                ProductAccountDescriptor$Value.Discover discover = (ProductAccountDescriptor$Value.Discover) productAccountDescriptor$Value;
                return new t38.e(xVar.h(discover.f89725a).a(discover.f89726b), 17, xVar, productAccountDescriptor$Value);
            case 8:
                KProperty[] kPropertyArr3 = TravelMilesAirlineDetailsScreen.U;
                qji.b bVarU22 = ((TravelMilesAirlineDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.di.TravelMilesAirlineDetailsScreenInjector");
                ufg.b bVar = (ufg.b) bVarU22;
                return new ufg.c(bVar.f279668b, bVar.f279669c, (TravelMilesAirlineDetailsScreenContract$InputData) obj2);
            case 9:
                h.t2((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) obj3, (yki.b) obj2, FamilyPlanFlowContract$Step.Checkout.f102982a, true, null, false, 12);
                return Unit.f186387a;
            case 10:
                PayBillsAndTaxesNavigation$InputData payBillsAndTaxesNavigation$InputData = (PayBillsAndTaxesNavigation$InputData) obj2;
                phm.a aVar6 = (phm.a) e.j(((BillsRoutingFlow) obj3).m2()).a().get(m.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                }
                m mVar = ((m) aVar.b()).u;
                payBillsAndTaxesNavigation$InputData.getClass();
                return new lf9.c(mVar, payBillsAndTaxesNavigation$InputData);
            case 11:
                SelfieIntroRootFlow selfieIntroRootFlow = (SelfieIntroRootFlow) obj3;
                SelfieIntroFlowContract$InputData selfieIntroFlowContract$InputData = (SelfieIntroFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) e.j(selfieIntroRootFlow.m2()).a().get(dw3.e.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                }
                Object objB = aVar.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                return new e6(((c1) ((dw3.e) objB)).m0, new iq3.a(), selfieIntroRootFlow, selfieIntroFlowContract$InputData);
            case 12:
                ShopsBidFlowContract$InputData shopsBidFlowContract$InputData = (ShopsBidFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) e.j(((ShopsBidFlow) obj3).m2()).a().get(did.d.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new did.e(((did.d) aVar.b()).f115008y, shopsBidFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
            case 13:
                com.revolut.retail.feature.pricing_plans.ui.impl.footer.d dVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.footer.d) obj3;
                dVar2.T2(new com.revolut.retail.feature.pricing_plans.ui.impl.footer.c(dVar2, (PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation) obj2, null), new yi5.b(27));
                return Unit.f186387a;
            case 14:
                CFACClaimsListScreenContract$InputData cFACClaimsListScreenContract$InputData = (CFACClaimsListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = CFACClaimsListScreen.f75134d0;
                qji.b bVarQ22 = ((CFACClaimsListScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.di.CFACClaimsListScreenInjector");
                r rVar = (r) bVarQ22;
                nk7.q qVar2 = rVar.f216721b;
                r rVar2 = rVar.f216722c;
                cFACClaimsListScreenContract$InputData.getClass();
                return new nk7.h(qVar2, rVar2, cFACClaimsListScreenContract$InputData);
            case 15:
                RfiToolFlowInputData rfiToolFlowInputData = (RfiToolFlowInputData) obj2;
                phm.a aVar9 = (phm.a) e.j(((RfiToolFlow) obj3).m2()).a().get(skc.b.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", skc.b.class, " is not found"));
                }
                skc.b bVar2 = ((skc.b) aVar.b()).d;
                rfiToolFlowInputData.getClass();
                return new skc.c(bVar2, rfiToolFlowInputData);
            case 16:
                com.revolut.feature.rfi_tool.impl.navigation.b bVar3 = (com.revolut.feature.rfi_tool.impl.navigation.b) obj2;
                Object obj4 = ((Ref$ObjectRef) obj3).f186409a;
                e.a aVar10 = obj4 instanceof e.a ? (e.a) obj4 : null;
                cp6.d dVar3 = aVar10 != null ? aVar10.f107881a : null;
                if (dVar3 != null) {
                    if (dVar3 instanceof cp6.b) {
                        cp6.b bVar4 = (cp6.b) dVar3;
                        success = new TabAccountsShotDialogAction.Success(bVar4.d, new TabAccountsShotDialogAction.Action.ShowModal(bVar4.e, new OneClickFeedbackFlowDescriptor(new OneClickFeedbackFlowContract$InputData.Comment(bVar4.f107878b, bVar4.f107879c))));
                    } else {
                        if (!(dVar3 instanceof cp6.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        success = new TabAccountsShotDialogAction.Success(((cp6.c) dVar3).f107880a, null);
                    }
                    bVar3.C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(success)), (AccountCreationTransitionAnimation) null, 12));
                } else {
                    h.D2(bVar3.u);
                }
                return Unit.f186387a;
            case 17:
                InvestDocumentsDetailsScreen investDocumentsDetailsScreen = (InvestDocumentsDetailsScreen) obj3;
                InvestDocumentsDetailsScreenContract$InputData investDocumentsDetailsScreenContract$InputData = (InvestDocumentsDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = InvestDocumentsDetailsScreen.c0;
                phm.a aVar11 = (phm.a) ue0.e.j(investDocumentsDetailsScreen.m2()).a().get(vhh.a.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new i(((s) ((u) aVar.b())).l0, investDocumentsDetailsScreen, investDocumentsDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
            case 18:
                ChangeSpareChangeScreen changeSpareChangeScreen = (ChangeSpareChangeScreen) obj3;
                ChangeSpareChangeScreenContract$InputData changeSpareChangeScreenContract$InputData = (ChangeSpareChangeScreenContract$InputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(changeSpareChangeScreen.m2()).a().get(nl5.e.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new nl5.d(((nl5.e) aVar.b()).f217018l, changeSpareChangeScreen, changeSpareChangeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nl5.e.class, " is not found"));
            case 19:
                DateOfBirthScreenContract$InputData dateOfBirthScreenContract$InputData = (DateOfBirthScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = DateOfBirthScreen.Q;
                phm.a aVar13 = (phm.a) ue0.e.j(((DateOfBirthScreen) obj3).m2()).a().get(um5.c.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new um5.d(((um5.c) aVar.b()).f281237h, dateOfBirthScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
            case 20:
                EditNoteScreenContract$InputData editNoteScreenContract$InputData = (EditNoteScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = EditNoteScreen.Q;
                phm.a aVar14 = (phm.a) ue0.e.j(((EditNoteScreen) obj3).m2()).a().get(mlf.d.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new mlf.a(((mlf.d) aVar.b()).C1, editNoteScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", mlf.d.class, " is not found"));
            case 21:
                KProperty[] kPropertyArr8 = CooldownCheckFailedScreen.P;
                qji.b bVarU23 = ((CooldownCheckFailedScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.di.CooldownCheckFailedScreenInjector");
                tn3.d dVar4 = (tn3.d) bVarU23;
                return new tn3.b(dVar4.f272294b, dVar4.f272295c, (CooldownCheckFailedScreenContract$InputData) obj2);
            case 22:
                ((vp0.c) obj3).f291001a.setVisibility(4);
                ((js0.b) obj2).run();
                return Unit.f186387a;
            case 23:
                ((ViewGroup) obj3).removeView((View) ((Ref$ObjectRef) obj2).f186409a);
                return Unit.f186387a;
            case 24:
                ClaimsDetailsScreen claimsDetailsScreen = (ClaimsDetailsScreen) obj3;
                KProperty[] kPropertyArr9 = ClaimsDetailsScreen.c0;
                qji.b bVarQ23 = claimsDetailsScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.di.ClaimsDetailsScreenInjector");
                ql7.s sVar = (ql7.s) bVarQ23;
                return new ql7.r(sVar.f247457b, sVar.f247458c, claimsDetailsScreen, (ClaimsDetailsScreenContract$InputData) obj2);
            case 25:
                KProperty[] kPropertyArr10 = IncomeSorterDestinationsController.U;
                qji.b bVarU24 = ((IncomeSorterDestinationsController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.di.IncomeSorterDestinationsControllerInjector");
                j0 j0Var = (j0) bVarU24;
                return new e0(j0Var.f238443b, j0Var.f238444c, (IncomeSorterDestinationsContract$InputData) obj2);
            case 26:
                ((vq0.e) obj3).f291289l = true;
                ((nu0.i) obj2).setSubtitlesShowingState(nu0.h.PAUSED);
                return Unit.f186387a;
            case 27:
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause text = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                wq0.d dVar5 = (wq0.d) ((n) obj3);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                dVar5.f299372a.setCaptions(text);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                ((vq0.m) obj2).f = "";
                return Unit.f186387a;
            case 28:
                CreditCardLimitDecreaseFlowContract$InputData creditCardLimitDecreaseFlowContract$InputData = (CreditCardLimitDecreaseFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((CreditCardLimitDecreaseFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new k1(((a3) aVar.b()).Y, creditCardLimitDecreaseFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            default:
                DeviceDeliveryScreen deviceDeliveryScreen = (DeviceDeliveryScreen) obj3;
                KProperty[] kPropertyArr11 = DeviceDeliveryScreen.c0;
                qji.b bVarQ24 = deviceDeliveryScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.di.DeviceDeliveryScreenInjector");
                o oVar = (o) bVarQ24;
                return new y(oVar.f247408b, oVar.f247409c, deviceDeliveryScreen, (DeviceDeliveryScreenContract$InputData) obj2);
        }
    }
}
