package up2;

import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.QrScannerFlow;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameController;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreen;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.compliance_popup.InsightsComplianceBottomSheetScreen;
import com.revolut.feature.kyc.impl.common.screen.consent.KycConsentScreen;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSliderFlow;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreen;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import dy0.n0;
import ip0.r40;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import uyc.w;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f281830w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281830w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q((com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) this.v, (SwitchOutReview) this.f281830w, continuation, 0);
            case 1:
                q qVar = new q((upc.c) this.f281830w, continuation, 1);
                qVar.v = obj2;
                return qVar;
            case 2:
                q qVar2 = new q((uq5.f) this.f281830w, continuation, 2);
                qVar2.v = obj2;
                return qVar2;
            case 3:
                q qVar3 = new q((com.revolut.feature.insurance_common.ui.screen.documents.a) this.f281830w, continuation, 3);
                qVar3.v = obj2;
                return qVar3;
            case 4:
                q qVar4 = new q((com.revolut.feature.rev10_main_screen.impl.ui.slide.a) this.f281830w, continuation, 4);
                qVar4.v = obj2;
                return qVar4;
            case 5:
                q qVar5 = new q((MainContainerSliderFlow) this.f281830w, continuation, 5);
                qVar5.v = obj2;
                return qVar5;
            case 6:
                q qVar6 = new q((FreelancerAcquiringPaymentDetailsScreen) this.f281830w, continuation, 6);
                qVar6.v = obj2;
                return qVar6;
            case 7:
                q qVar7 = new q((KycConsentScreen) this.f281830w, continuation, 7);
                qVar7.v = obj2;
                return qVar7;
            case 8:
                q qVar8 = new q((uw2.g) this.f281830w, continuation, 8);
                qVar8.v = obj2;
                return qVar8;
            case 9:
                q qVar9 = new q((uwf.l) this.f281830w, continuation, 9);
                qVar9.v = obj2;
                return qVar9;
            case 10:
                q qVar10 = new q((ux.n) this.f281830w, continuation, 10);
                qVar10.v = obj2;
                return qVar10;
            case 11:
                q qVar11 = new q((InvoiceCustomerListScreen) this.f281830w, continuation, 11);
                qVar11.v = obj2;
                return qVar11;
            case 12:
                q qVar12 = new q((com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b) this.f281830w, continuation, 12);
                qVar12.v = obj2;
                return qVar12;
            case 13:
                q qVar13 = new q((uy6.p) this.f281830w, continuation, 13);
                qVar13.v = obj2;
                return qVar13;
            case 14:
                q qVar14 = new q((w) this.f281830w, continuation, 14);
                qVar14.v = obj2;
                return qVar14;
            case 15:
                return new q((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.v, (dj0.d) this.f281830w, continuation, 15);
            case 16:
                q qVar15 = new q((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f281830w, continuation, 16);
                qVar15.v = obj2;
                return qVar15;
            case 17:
                q qVar16 = new q((CryptoExchangeScreen) this.f281830w, continuation, 17);
                qVar16.v = obj2;
                return qVar16;
            case 18:
                q qVar17 = new q((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f281830w, continuation, 18);
                qVar17.v = obj2;
                return qVar17;
            case 19:
                q qVar18 = new q((TransactionLimitController) this.f281830w, continuation, 19);
                qVar18.v = obj2;
                return qVar18;
            case 20:
                q qVar19 = new q((com.revolut.feature.rev_points.impl.ui.trophy_room.details.c) this.f281830w, continuation, 20);
                qVar19.v = obj2;
                return qVar19;
            case 21:
                q qVar20 = new q((FreelancerSalesFiltersScreen) this.f281830w, continuation, 21);
                qVar20.v = obj2;
                return qVar20;
            case 22:
                q qVar21 = new q((v17.r) this.f281830w, continuation, 22);
                qVar21.v = obj2;
                return qVar21;
            case 23:
                q qVar22 = new q((InsightsComplianceBottomSheetScreen) this.f281830w, continuation, 23);
                qVar22.v = obj2;
                return qVar22;
            case 24:
                q qVar23 = new q((TravelExperiencesCategoriesFiltersScreen) this.f281830w, continuation, 24);
                qVar23.v = obj2;
                return qVar23;
            case 25:
                q qVar24 = new q((v1g.i) this.f281830w, continuation, 25);
                qVar24.v = obj2;
                return qVar24;
            case 26:
                q qVar25 = new q((CardHolderNameController) this.f281830w, continuation, 26);
                qVar25.v = obj2;
                return qVar25;
            case 27:
                q qVar26 = new q((TravelExperiencesPastAndCancelledScreen) this.f281830w, continuation, 27);
                qVar26.v = obj2;
                return qVar26;
            case 28:
                q qVar27 = new q((v2g.h) this.f281830w, continuation, 28);
                qVar27.v = obj2;
                return qVar27;
            default:
                q qVar28 = new q((QrScannerFlow) this.f281830w, continuation, 29);
                qVar28.v = obj2;
                return qVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((upc.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((com.revolut.kompot.navigable.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((n0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((r40) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((swf.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((xv.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((q) create((e60.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((q) create((bzh.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((q) create((StakingPocket) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((q) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((q) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04bf  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v92, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v99, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: up2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(oki.h hVar, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = hVar;
        this.f281830w = obj2;
    }
}
