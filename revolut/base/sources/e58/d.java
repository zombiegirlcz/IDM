package e58;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreenContract$InputData;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$InputData;
import com.revolut.feature.apm.iris.impl.ui.IrisFlow;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreen;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlow;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$InputData;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreen;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData;
import com.revolut.feature.contacts_chooser.impl.bridge.ContactsChooserFlow;
import com.revolut.feature.contacts_chooser.impl.bridge.ContactsChooserFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubScreenContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.AutoPayExternalAccountFlow;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.AutoPayExternalAccountFlowContract$InputData;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreen;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.SmartDrivingFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.SmartDrivingFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsContract$InputData;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsFlow;
import com.revolut.feature.revolutpay.impl.ui.native_move_money.RevolutPayMoveMoneyFlow;
import com.revolut.feature.revolutpay.impl.ui.native_move_money.RevolutPayMoveMoneyFlowContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.risk_screen.RiskScreen;
import com.revolut.feature.revolutpay.shared.ui.risk_screen.RiskScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreen;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreen;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreenContract$InputData;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreen;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreenContract$InputData;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureInputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.flow.PaymentLinksTransferFlow;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.WarningScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.WarningScreenContract$InputData;
import dw3.t4;
import dw3.z1;
import e48.n;
import g9g.a1;
import g9g.b1;
import g9g.q0;
import g9g.r0;
import if2.p;
import ip0.vd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nh2.o;
import nk7.v;
import o4e.l;
import p7c.r;
import p7c.s;
import p7c.w;
import q7k.k;
import ql7.h1;
import ql7.k0;
import ql7.x1;
import ql7.y1;
import r6e.x;
import r6e.y;
import r7d.t;
import ufg.b0;
import ufg.c0;
import z52.m;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f122779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f122780c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f122778a = i;
        this.f122779b = obj2;
        this.f122780c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r3v65 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f122778a;
        Object obj2 = this.f122780c;
        Object obj3 = this.f122779b;
        switch (i) {
            case 0:
                JointLimitsContract$InputData jointLimitsContract$InputData = (JointLimitsContract$InputData) obj2;
                phm.a aVar = (phm.a) ue0.e.j(((JointLimitsFlow) obj3).m2()).a().get(e48.g.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( == 0) {
                    throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
                }
                e48.g gVar = ((e48.g) b()).z;
                AccountId.Joint joint = jointLimitsContract$InputData.f76586a;
                joint.getClass();
                return new n(gVar, joint);
            case 1:
                AboutIssuerScreen aboutIssuerScreen = (AboutIssuerScreen) obj3;
                AboutIssuerScreenContract$InputData aboutIssuerScreenContract$InputData = (AboutIssuerScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = AboutIssuerScreen.U;
                phm.a aVar2 = (phm.a) ue0.e.j(aboutIssuerScreen.m2()).a().get(l.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 != null) {
                    return new o4e.a(((l) aVar3.b()).o, new k3h.e(aboutIssuerScreenContract$InputData.f88878a, wdh.a.FITCH), new k3h.c(aboutIssuerScreen.M, aboutIssuerScreen.N, aboutIssuerScreen.O, aboutIssuerScreen.P, aboutIssuerScreen.Q));
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 2:
                IrisNavigation$InputData irisNavigation$InputData = (IrisNavigation$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((IrisFlow) obj3).m2()).a().get(z52.e.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", z52.e.class, " is not found"));
                }
                z52.j jVar = ((z52.j) ((z52.e) aVar5.b())).o;
                irisNavigation$InputData.getClass();
                return new m(jVar, irisNavigation$InputData);
            case 3:
                DirectDebitReviewScreenContract$InputData directDebitReviewScreenContract$InputData = (DirectDebitReviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = DirectDebitReviewScreen.R;
                phm.a aVar6 = (phm.a) ue0.e.j(((DirectDebitReviewScreen) obj3).m2()).a().get(y67.d.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 != null) {
                    return new y67.c(((y67.d) aVar7.b()).f, directDebitReviewScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", y67.d.class, " is not found"));
            case 4:
                MoveMoneyAutomationLimitScreenContract$InputData moveMoneyAutomationLimitScreenContract$InputData = (MoveMoneyAutomationLimitScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = MoveMoneyAutomationLimitScreen.Q;
                phm.a aVar8 = (phm.a) ue0.e.j(((MoveMoneyAutomationLimitScreen) obj3).m2()).a().get(u7i.l.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 != null) {
                    return new u7i.i(((u7i.l) aVar9.b()).f277829h0, moveMoneyAutomationLimitScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u7i.l.class, " is not found"));
            case 5:
                BillSelectorScreen billSelectorScreen = (BillSelectorScreen) obj3;
                BillSelectorScreenContract$InputData billSelectorScreenContract$InputData = (BillSelectorScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = BillSelectorScreen.i0;
                qji.b bVarQ2 = billSelectorScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.di.BillSelectorScreenInjector");
                x xVar = (x) ((f8e.a) bVarQ2).b().S(billSelectorScreen);
                switch (xVar.f251816a) {
                    case 0:
                        xVar.d = billSelectorScreenContract$InputData;
                        break;
                    default:
                        xVar.d = billSelectorScreenContract$InputData;
                        break;
                }
                return (y) xVar.mo3800build();
            case 6:
                PaymentLinksFeatureInputData paymentLinksFeatureInputData = (PaymentLinksFeatureInputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((PaymentLinksTransferFlow) obj3).m2()).a().get(f7k.a.class);
                b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar11 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                }
                q7k.j jVar2 = ((q7k.j) aVar11.b()).G;
                paymentLinksFeatureInputData.getClass();
                return new k(jVar2, paymentLinksFeatureInputData);
            case 7:
                DebtsV2HubController.Companion aVar12 = DebtsV2HubController.INSTANCE;
                qji.b bVarU2 = ((DebtsV2HubController) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.di.DebtsV2HubScreenInjector");
                t4 t4Var = (t4) bVarU2;
                return new z1(t4Var.f119833c, t4Var.d, (DebtsV2HubScreenContract$InputData) obj2);
            case 8:
                RevolutPayMoveMoneyFlowContract$InputData revolutPayMoveMoneyFlowContract$InputData = (RevolutPayMoveMoneyFlowContract$InputData) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((RevolutPayMoveMoneyFlow) obj3).m2()).a().get(r.class);
                b60.a aVar14 = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar14 != null) {
                    return new s(((r) aVar14.b()).D, revolutPayMoveMoneyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
            case 9:
                KProperty[] kPropertyArr5 = TransactionsTroubleshooterTopLevelScreen.f86343k0;
                qji.b bVarQ22 = ((TransactionsTroubleshooterTopLevelScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.di.TransactionsTroubleshooterTopLevelScreenInjector");
                t tVar = (t) ((v7d.a) bVarQ22);
                return new r7d.y(tVar.f252174b, tVar.f252175c, (TransactionsTroubleshooterTopLevelScreenContract$InputData) obj2);
            case 10:
                TravelHotelsHomeBookingsScreen travelHotelsHomeBookingsScreen = (TravelHotelsHomeBookingsScreen) obj3;
                TravelHotelsHomeBookingsScreenContract$InputData travelHotelsHomeBookingsScreenContract$InputData = (TravelHotelsHomeBookingsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = TravelHotelsHomeBookingsScreen.T;
                qji.b bVarU22 = travelHotelsHomeBookingsScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.di.TravelHotelsHomeBookingsScreenInjector");
                q0 q0VarQ = ((lbg.a) bVarU22).q();
                switch (q0VarQ.f141797a) {
                    case 0:
                        q0VarQ.d = travelHotelsHomeBookingsScreenContract$InputData;
                        break;
                    default:
                        q0VarQ.d = travelHotelsHomeBookingsScreenContract$InputData;
                        break;
                }
                return (r0) ((q0) q0VarQ.mo3808a(travelHotelsHomeBookingsScreen)).mo3783build();
            case 11:
                WarningScreen warningScreen = (WarningScreen) obj3;
                qji.b bVarQ23 = warningScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.di.WarningScreenInjector");
                lal.a aVarH = ((oal.a) bVarQ23).H();
                aVarH.d = warningScreen;
                aVarH.e = (WarningScreenContract$InputData) obj2;
                return (lal.m) aVarH.mo3800build();
            case 12:
                ((ech.m) obj3).x2(new aae.e((vd) obj2, 3));
                return Unit.f186387a;
            case 13:
                TravelHotelsPriceBreakdownScreen travelHotelsPriceBreakdownScreen = (TravelHotelsPriceBreakdownScreen) obj3;
                TravelHotelsPriceBreakdownScreenContract$InputData travelHotelsPriceBreakdownScreenContract$InputData = (TravelHotelsPriceBreakdownScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = TravelHotelsPriceBreakdownScreen.R;
                qji.b bVarU23 = travelHotelsPriceBreakdownScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.di.TravelHotelsPriceBreakdownScreenInjector");
                a1 a1Var = (a1) ((fdg.a) bVarU23).b().mo3808a(travelHotelsPriceBreakdownScreen);
                switch (a1Var.f141592a) {
                    case 0:
                        travelHotelsPriceBreakdownScreenContract$InputData.getClass();
                        a1Var.d = travelHotelsPriceBreakdownScreenContract$InputData;
                        break;
                    case 1:
                        travelHotelsPriceBreakdownScreenContract$InputData.getClass();
                        a1Var.d = travelHotelsPriceBreakdownScreenContract$InputData;
                        break;
                    default:
                        travelHotelsPriceBreakdownScreenContract$InputData.getClass();
                        a1Var.d = travelHotelsPriceBreakdownScreenContract$InputData;
                        break;
                }
                return (b1) a1Var.mo3783build();
            case 14:
                KProperty[] kPropertyArr8 = AddNoteScreen.f60767b0;
                qji.b bVarQ24 = ((AddNoteScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.di.AddNoteScreenInjector");
                ld1.m mVar = (ld1.m) bVarQ24;
                return new ld1.b(mVar.f193969a, mVar.f193970b, (AddNoteScreenContract$InputData) obj2);
            case 15:
                KProperty[] kPropertyArr9 = RiskScreen.P;
                qji.b bVarU24 = ((RiskScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.risk_screen.di.RiskScreenInjector");
                p7c.x xVar2 = (p7c.x) bVarU24;
                return new w(xVar2.f233742b, xVar2.f233743c, (RiskScreenContract$InputData) obj2);
            case 16:
                UpiTransferReviewScreen upiTransferReviewScreen = (UpiTransferReviewScreen) obj3;
                UpiTransferReviewScreen.Companion aVar15 = UpiTransferReviewScreen.INSTANCE;
                qji.b bVarU25 = upiTransferReviewScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.screen.review.di.UpiTransferReviewScreenInjector");
                if2.n nVar = (if2.n) bVarU25;
                return new p(nVar.f160891b, nVar.f160892c, upiTransferReviewScreen, (UpiTransferReviewScreenContract$InputData) obj2);
            case 17:
                TravelMilesAirlineDetailsFlowContract$InputData travelMilesAirlineDetailsFlowContract$InputData = (TravelMilesAirlineDetailsFlowContract$InputData) obj2;
                phm.a aVar16 = (phm.a) ue0.e.j(((TravelMilesAirlineDetailsFlow) obj3).m2()).a().get(ffg.a.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new ufg.b(((ufg.g) aVar17.b()).A, travelMilesAirlineDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
            case 18:
                ChecklistCollectionScreenContract$InputData checklistCollectionScreenContract$InputData = (ChecklistCollectionScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = ChecklistCollectionScreen.T;
                phm.a aVar18 = (phm.a) ue0.e.j(((ChecklistCollectionScreen) obj3).m2()).a().get(vg3.a.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new vg3.h(((vg3.g) ((vg3.a) aVar19.b())).f288730l, checklistCollectionScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vg3.a.class, " is not found"));
            case 19:
                TravelMilesFlightDatePickerScreen travelMilesFlightDatePickerScreen = (TravelMilesFlightDatePickerScreen) obj3;
                TravelMilesFlightDatePickerScreenContract$InputData travelMilesFlightDatePickerScreenContract$InputData = (TravelMilesFlightDatePickerScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = TravelMilesFlightDatePickerScreen.Q;
                qji.b bVarU26 = travelMilesFlightDatePickerScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.di.TravelMilesFlightDatePickerScreenInjector");
                b0 b0Var = (b0) ((fhg.a) bVarU26).q().mo3808a(travelMilesFlightDatePickerScreen);
                switch (b0Var.f279670a) {
                    case 0:
                        b0Var.d = travelMilesFlightDatePickerScreenContract$InputData;
                        break;
                    default:
                        b0Var.d = travelMilesFlightDatePickerScreenContract$InputData;
                        break;
                }
                return (c0) b0Var.mo3783build();
            case 20:
                WeroP2MFlowContract$InputData weroP2MFlowContract$InputData = (WeroP2MFlowContract$InputData) obj2;
                phm.a aVar20 = (phm.a) ue0.e.j(((WeroP2MFlow) obj3).m2()).a().get(nh2.h.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                }
                o oVar = ((o) ((nh2.h) aVar21.b())).f215326t;
                weroP2MFlowContract$InputData.getClass();
                return new nh2.t(oVar, weroP2MFlowContract$InputData);
            case 21:
                ShopsPromptScreenContract$InputData shopsPromptScreenContract$InputData = (ShopsPromptScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = ShopsPromptScreen.c0;
                phm.a aVar22 = (phm.a) ue0.e.j(((ShopsPromptScreen) obj3).m2()).a().get(did.d.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 != null) {
                    return new did.o(((did.d) aVar23.b()).f115008y, shopsPromptScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
            case 22:
                AutoPayExternalAccountFlowContract$InputData autoPayExternalAccountFlowContract$InputData = (AutoPayExternalAccountFlowContract$InputData) obj2;
                phm.a aVar24 = (phm.a) ue0.e.j(((AutoPayExternalAccountFlow) obj3).m2()).a().get(yj4.b.class);
                b60.a aVar25 = aVar24 != null ? (b60.a) aVar24.get() : null;
                if (aVar25 != null) {
                    return new yj4.a(((yj4.b) aVar25.b()).f314412c, autoPayExternalAccountFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", yj4.b.class, " is not found"));
            case 23:
                CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen = (CFACInsuranceReviewClaimScreen) obj3;
                KProperty[] kPropertyArr13 = CFACInsuranceReviewClaimScreen.f75097h0;
                qji.b bVarQ25 = cFACInsuranceReviewClaimScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.di.CFACInsuranceReviewClaimScreenInjector");
                nk7.j jVar3 = (nk7.j) bVarQ25;
                return new v(jVar3.f216688b, jVar3.f216689c, cFACInsuranceReviewClaimScreen, (CFACInsuranceReviewClaimScreenContract$InputData) obj2);
            case 24:
                emk.k kVar = (emk.k) obj3;
                kVar.l2(new emk.j(kVar, (String) obj2, , 0), new yi5.b(26));
                return Unit.f186387a;
            case 25:
                ContactsChooserFlowContract$InputData contactsChooserFlowContract$InputData = (ContactsChooserFlowContract$InputData) obj2;
                phm.a aVar26 = (phm.a) ue0.e.j(((ContactsChooserFlow) obj3).m2()).a().get(an3.a.class);
                b60.a aVar27 = aVar26 != null ? (b60.a) aVar26.get() : null;
                if (aVar27 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", an3.a.class, " is not found"));
                }
                in3.e eVar = ((in3.e) aVar27.b()).i;
                contactsChooserFlowContract$InputData.getClass();
                return new in3.f(eVar, contactsChooserFlowContract$InputData);
            case 26:
                SmartDrivingFlowContract$InputData smartDrivingFlowContract$InputData = (SmartDrivingFlowContract$InputData) obj2;
                phm.a aVar28 = (phm.a) ue0.e.j(((SmartDrivingFlow) obj3).m2()).a().get(fl7.a.class);
                b60.a aVar29 = aVar28 != null ? (b60.a) aVar28.get() : null;
                if (aVar29 != null) {
                    return new h1(((k0) aVar29.b()).f247359n, smartDrivingFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 27:
                SubmitTaxResidencyFlow submitTaxResidencyFlow = (SubmitTaxResidencyFlow) obj3;
                SubmitTaxResidencyFlowContract$InputData submitTaxResidencyFlowContract$InputData = (SubmitTaxResidencyFlowContract$InputData) obj2;
                phm.a aVar30 = (phm.a) ue0.e.j(submitTaxResidencyFlow.m2()).a().get(ine.o.class);
                b60.a aVar31 = aVar30 != null ? (b60.a) aVar30.get() : null;
                if (aVar31 != null) {
                    return new ine.j(((ine.o) aVar31.b()).f162885l, submitTaxResidencyFlow, submitTaxResidencyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ine.o.class, " is not found"));
            case 28:
                EligibilityScreen eligibilityScreen = (EligibilityScreen) obj3;
                EligibilityScreenContract$InputData eligibilityScreenContract$InputData = (EligibilityScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = EligibilityScreen.f75585e0;
                qji.b bVarQ26 = eligibilityScreen.Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.di.EligibilityScreenInjector");
                x1 x1Var = (x1) ((fp7.a) bVarQ26).b().S(eligibilityScreen);
                switch (x1Var.f247524a) {
                    case 0:
                        x1Var.d = eligibilityScreenContract$InputData;
                        break;
                    default:
                        x1Var.d = eligibilityScreenContract$InputData;
                        break;
                }
                return (y1) x1Var.mo3800build();
            default:
                CategoryManagementCustomController categoryManagementCustomController = (CategoryManagementCustomController) obj3;
                CategoryManagementCustomContract$InputData categoryManagementCustomContract$InputData = (CategoryManagementCustomContract$InputData) obj2;
                KProperty[] kPropertyArr15 = CategoryManagementCustomController.T;
                phm.a aVar32 = (phm.a) ue0.e.j(categoryManagementCustomController.m2()).a().get(ppd.n.class);
                b60.a aVar33 = aVar32 != null ? (b60.a) aVar32.get() : null;
                if (aVar33 != null) {
                    return new ppd.s(((ppd.n) aVar33.b()).L0, categoryManagementCustomController, categoryManagementCustomContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
        }
    }
}
