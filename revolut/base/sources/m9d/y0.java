package m9d;

import aw0.n6;
import com.revolut.feature.add_card_to_google_pay_shared.impl.add_to_google.AddToGooglePayBottomSheetController;
import com.revolut.feature.cash_topup.impl.ui.instructions.CashTopupInstructionsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogController;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.SecretAccountsRootScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.limits.JuniorSettingsLimitsScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerScreen;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusController;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.pastcancelled.TravelHotelsBookingsPastAndCancelledScreen;
import com.revolut.feature_retail_user_declarations.gender.GenderInfoBottomSheetController;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.FamilyPlanManagementScreen;
import com.revolut.shared.feature.wealth.statements.impl.costchargesreport.CostChargesController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y0((g1) this.v, continuation, 0);
            case 1:
                return new y0((CryptoHoldingScreen) this.v, continuation, 1);
            case 2:
                return new y0((maa.s) this.v, continuation, 2);
            case 3:
                return new y0((SecretAccountsRootScreen) this.v, continuation, 3);
            case 4:
                return new y0((PixQrCodeAdditionalInformationScreen) this.v, continuation, 4);
            case 5:
                return new y0((TravelHotelsBookingsPastAndCancelledScreen) this.v, continuation, 5);
            case 6:
                return new y0((GenderInfoBottomSheetController) this.v, continuation, 6);
            case 7:
                return new y0((CashTopupInstructionsScreen) this.v, continuation, 7);
            case 8:
                return new y0((md9.l) this.v, continuation, 8);
            case 9:
                return new y0((PartySizePickerScreen) this.v, continuation, 9);
            case 10:
                return new y0((CostChargesController) this.v, continuation, 10);
            case 11:
                return new y0((AddToGooglePayBottomSheetController) this.v, continuation, 11);
            case 12:
                return new y0((mhc.b) this.v, continuation, 12);
            case 13:
                return new y0((mib.k) this.v, continuation, 13);
            case 14:
                return new y0((mic.g0) this.v, continuation, 14);
            case 15:
                return new y0((mj4.d) this.v, continuation, 15);
            case 16:
                return new y0((mkc.a) this.v, continuation, 16);
            case 17:
                return new y0((Flow) this.v, continuation, 17);
            case 18:
                return new y0((FamilyPlanManagementScreen) this.v, continuation, 18);
            case 19:
                return new y0((InvestSettingsScreen) this.v, continuation, 19);
            case 20:
                return new y0((mlk.h0) this.v, continuation, 20);
            case 21:
                return new y0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.v, continuation, 21);
            case 22:
                return new y0((com.revolut.feature.profile.impl.ui.close_account.c) this.v, continuation, 22);
            case 23:
                return new y0((JuniorSettingsLimitsScreen) this.v, continuation, 23);
            case 24:
                return new y0((mp6.n) this.v, continuation, 24);
            case 25:
                return new y0((mq4.x) this.v, continuation, 25);
            case 26:
                return new y0((CryptoFeeBreakdownDialogController) this.v, continuation, 26);
            case 27:
                return new y0((SalarySwitchStatusController) this.v, continuation, 27);
            case 28:
                return new y0((br3.a) this.v, continuation, 28);
            default:
                return new y0((com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((y0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((y0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((y0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((y0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((y0) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((y0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((y0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((y0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((y0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((y0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0295  */
    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9d.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
