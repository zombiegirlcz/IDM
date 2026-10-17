package kae;

import androidx.room.util.DBUtil;
import cjk.b;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.impl.ui.chooser.BillersChooserScreen;
import com.revolut.feature.apm.upi.impl.qr.screens.amount.InputAmountScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreen;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.date_year.YearPickerBottomSheetController;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreen;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreen;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.expandable_disclaimer.ExpandableDisclaimerBottomSheetController;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker.ScreenerProductPickerScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreen;
import dfj.o0;
import dfj.p0;
import dfj.q0;
import dfj.r0;
import dfj.s0;
import dfj.t0;
import dfj.u0;
import dfj.v0;
import dfj.w0;
import dfj.x0;
import ip0.sp0;
import java.util.Iterator;
import java.util.List;
import k5e.k;
import k7c.l0;
import ka2.b0;
import kd8.p;
import kk9.n;
import kkk.t;
import klf.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kp7.w;
import kpb.l;
import kqh.u;
import nii.l1;
import nii.n1;
import skm.a2;
import skm.e0;
import vkm.j2;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f182469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, List list, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f182469w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((SubscriptionLabelScreen) this.f182469w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((i) this.f182469w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((EvidenceCategorySelectionScreen) this.f182469w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((com.revolut.feature.pix.impl.flow.qr_code_transaction.a) this.f182469w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d((p) this.f182469w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d((ExpandableDisclaimerBottomSheetController) this.f182469w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d((kea.c) this.f182469w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d((InputAmountScreen) this.f182469w, continuation, 7);
                dVar8.v = obj2;
                return dVar8;
            case 8:
                d dVar9 = new d((YearPickerBottomSheetController) this.f182469w, continuation, 8);
                dVar9.v = obj2;
                return dVar9;
            case 9:
                return new d((kge.d) this.v, (List) this.f182469w, continuation, 9);
            case 10:
                d dVar10 = new d((com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b) this.f182469w, continuation, 10);
                dVar10.v = obj2;
                return dVar10;
            case 11:
                d dVar11 = new d((kh4.g) this.f182469w, continuation, 11);
                dVar11.v = obj2;
                return dVar11;
            case 12:
                d dVar12 = new d((kh5.g) this.f182469w, continuation, 12);
                dVar12.v = obj2;
                return dVar12;
            case 13:
                d dVar13 = new d((com.revolut.feature.external_accounts.impl.ui.brazil.consents.a) this.f182469w, continuation, 13);
                dVar13.v = obj2;
                return dVar13;
            case 14:
                d dVar14 = new d((com.revolut.feature.shops.impl.ui.map_view.e) this.f182469w, continuation, 14);
                dVar14.v = obj2;
                return dVar14;
            case 15:
                d dVar15 = new d((PayLaterRepayAmountScreen) this.f182469w, continuation, 15);
                dVar15.v = obj2;
                return dVar15;
            case 16:
                d dVar16 = new d((n) this.f182469w, continuation, 16);
                dVar16.v = obj2;
                return dVar16;
            case 17:
                d dVar17 = new d((EsimMobilePlanMyNumbersScreen) this.f182469w, continuation, 17);
                dVar17.v = obj2;
                return dVar17;
            case 18:
                d dVar18 = new d((FamilyPlanInvitationScreen) this.f182469w, continuation, 18);
                dVar18.v = obj2;
                return dVar18;
            case 19:
                d dVar19 = new d((j2) this.f182469w, continuation, 19);
                dVar19.v = obj2;
                return dVar19;
            case 20:
                d dVar20 = new d((BillersChooserScreen) this.f182469w, continuation, 20);
                dVar20.v = obj2;
                return dVar20;
            case 21:
                d dVar21 = new d((km1.j) this.f182469w, continuation, 21);
                dVar21.v = obj2;
                return dVar21;
            case 22:
                d dVar22 = new d((knl.h) this.f182469w, continuation, 22);
                dVar22.v = obj2;
                return dVar22;
            case 23:
                d dVar23 = new d((com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) this.f182469w, continuation, 23);
                dVar23.v = obj2;
                return dVar23;
            case 24:
                d dVar24 = new d((w) this.f182469w, continuation, 24);
                dVar24.v = obj2;
                return dVar24;
            case 25:
                d dVar25 = new d((ProductMigrationScreen) this.f182469w, continuation, 25);
                dVar25.v = obj2;
                return dVar25;
            case 26:
                d dVar26 = new d((l) this.f182469w, continuation, 26);
                dVar26.v = obj2;
                return dVar26;
            case 27:
                d dVar27 = new d((ScreenerProductPickerScreen) this.f182469w, continuation, 27);
                dVar27.v = obj2;
                return dVar27;
            case 28:
                d dVar28 = new d((u) this.f182469w, continuation, 28);
                dVar28.v = obj2;
                return dVar28;
            default:
                return new d((u) this.v, (List) this.f182469w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((xu3.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((PixQrCodeDecodeData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((sp0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((x0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((cmf.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((LocationDomain) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((hha.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((kqh.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 12;
        int i3 = 25;
        int i5 = 3;
        int i6 = 11;
        int i21 = 17;
        int i22 = 6;
        boolean z = true;
        z = true;
        int i32 = 26;
        int i33 = 0;
        Object obj3 = this.f182469w;
        switch (i) {
            case 0:
                String label = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) ((SubscriptionLabelScreen) obj3).P.getValue();
                Intrinsics.h(label);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(label, "label");
                iVar.H2(iVar.f182478q, new k7c.n(label, i5));
                return Unit.f186387a;
            case 1:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof l1) {
                    i iVar2 = (i) obj3;
                    iVar2.l2(new l0(iVar2, esimPhoneNumberPortingProgress, i22), new k(iVar2, i21));
                } else {
                    int i43 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 2:
                xu3.a item = (xu3.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kb4.f fVar = (kb4.f) ((EvidenceCategorySelectionScreen) obj3).O.getValue();
                fVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                fVar.C2(new kb4.d(item.d));
                return Unit.f186387a;
            case 3:
                PixQrCodeDecodeData pixQrCodeDecodeData = (PixQrCodeDecodeData) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.pix.impl.flow.qr_code_transaction.a aVar5 = (com.revolut.feature.pix.impl.flow.qr_code_transaction.a) obj3;
                aVar5.H2(aVar5.f80698r, new kba.d(pixQrCodeDecodeData, 0));
                return Unit.f186387a;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                p pVar = (p) obj3;
                e0.C(coroutineScope, rd0.e.i(), null, new kd8.o(pVar, esimPhoneNumberPortingProgress, i33), 2);
                return e0.C(coroutineScope, rd0.e.i(), null, new kd8.o(pVar, esimPhoneNumberPortingProgress, z ? 1 : 0), 2);
            case 5:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kdc.c cVar = ((ExpandableDisclaimerBottomSheetController) obj3).O;
                Object obj4 = aVar7.d;
                cVar.getClass();
                if (obj4 instanceof x6c.a) {
                    cVar.C1(new ExternalDestination.Browser(((x6c.a) obj4).f303062a, null));
                }
                return Unit.f186387a;
            case 6:
                Data data = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((kea.c) obj3).r2().M0(new kea.a(data));
                return Unit.f186387a;
            case 7:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((InputAmountScreen) obj3).R2().I2(new kg2.j(charSequence.toString()));
                return Unit.f186387a;
            case 8:
                sp0 sp0Var = (sp0) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kg9.d dVar = ((YearPickerBottomSheetController) obj3).Q;
                int i59 = sp0Var.f166384b;
                dVar.getClass();
                dVar.C2(new kg9.b(i59));
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dge.b bVar = (dge.b) ((kge.d) this.v).f183974b;
                DBUtil.performBlocking(bVar.f114648a, false, true, new dge.a(bVar, cj9.c.X((List) obj3), i33));
                return Unit.f186387a;
            case 10:
                x0 x0Var = (x0) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b) obj3;
                yki.i iVar3 = bVar2.f100813s;
                if ((iVar3.d() instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.PortabilityInstruction) && !(x0Var instanceof q0) && !(x0Var instanceof r0) && !(x0Var instanceof s0) && !(x0Var instanceof t0) && !(x0Var instanceof u0) && !(x0Var instanceof o0) && !(x0Var instanceof v0)) {
                    if (Intrinsics.f(x0Var, p0.f114063a)) {
                        bVar2.C2(new a.C0615a(true));
                    } else {
                        if (!Intrinsics.f(x0Var, w0.f114140a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(bVar2, iVar3, EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.NumberTransferConfirmation.f100804a, true, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 11:
                Data data2 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mv3.h hVar = (mv3.h) data2.getContent();
                if (hVar != null) {
                    kh4.g gVar = (kh4.g) obj3;
                    ne0.j jVar = gVar.f184056c;
                    jVar.clear();
                    gVar.g(hVar);
                    jVar.f("OFFER_PARAMETERS_CACHE_KEY", hVar.f209124a);
                }
                return Unit.f186387a;
            case 12:
                Pair pair = (Pair) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kh5.g gVar2 = (kh5.g) obj3;
                gVar2.H2(gVar2.f184073r, new a83.p0((Data) pair.f186385a, (Data) pair.f186386b, i3));
                return Unit.f186387a;
            case 13:
                Data data3 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.consents.a aVar17 = (com.revolut.feature.external_accounts.impl.ui.brazil.consents.a) obj3;
                aVar17.H2(aVar17.f72562q, new b0(data3, 10));
                return Unit.f186387a;
            case 14:
                Data data4 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.shops.impl.ui.map_view.e eVar = (com.revolut.feature.shops.impl.ui.map_view.e) obj3;
                eVar.H2(eVar.u, new b0(data4, i6));
                return Unit.f186387a;
            case 15:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kk9.j jVar2 = (kk9.j) ((PayLaterRepayAmountScreen) obj3).c0.getValue();
                Intrinsics.h(clickData);
                n nVar = (n) jVar2;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "REPAYMENT_DUE_LIST_ID")) {
                    nVar.C1(new PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination(false));
                }
                return Unit.f186387a;
            case 16:
                Data data5 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) obj3).x2(new b0(data5, i2));
                return Unit.f186387a;
            case 17:
                EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory phoneNumberCategory = (EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kkj.l lVarE3 = ((EsimMobilePlanMyNumbersScreen) obj3).d();
                Intrinsics.h(phoneNumberCategory);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar22 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a) lVarE3;
                com.revolut.kompot.navigable.vc.modal.a aVar23 = aVar22.f101254x;
                com.revolut.kompot.navigable.vc.modal.a aVar24 = aVar22.f101254x;
                Intrinsics.checkNotNullParameter(phoneNumberCategory, "phoneNumberCategory");
                boolean z3 = phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInPending;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z3) {
                    EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInPending portInPending = (EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInPending) phoneNumberCategory;
                    EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = portInPending.f101227a;
                    EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber.i;
                    esimPhoneNumberPortingProgress = esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.i : 0;
                    boolean z4 = portInPending.f101228b;
                    if (z4 && esimPhoneNumberPortingProgress == 0) {
                        oki.h.v2(aVar23, new EsimMobilePlanMyNumbersScreenContract$ModalStep.CancelPortIn(esimSubscriptionPhoneNumber), bottom_dialog);
                    } else if (z4 || esimPhoneNumberPortingProgress == 0) {
                        oki.h.v2(aVar24, new EsimMobilePlanMyNumbersScreenContract$ModalStep.PhoneNumberActions(phoneNumberCategory.getF101234a()), bottom_dialog);
                    } else {
                        oki.h.v2(aVar23, new EsimMobilePlanMyNumbersScreenContract$ModalStep.PortInStatus(esimSubscriptionPhoneNumber, esimPhoneNumberPortingProgress), bottom_dialog);
                    }
                } else if (phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInEligible) {
                    EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInEligible portInEligible = (EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortInEligible) phoneNumberCategory;
                    if (portInEligible.f101226b) {
                        oki.h.v2(aVar24, new EsimMobilePlanMyNumbersScreenContract$ModalStep.PhoneNumberActions(phoneNumberCategory.getF101234a()), bottom_dialog);
                    } else {
                        aVar22.I2(portInEligible.f101225a);
                    }
                } else {
                    if (!(phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PortOutPending) && !(phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.PrimaryNumber) && !(phoneNumberCategory instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory.SecondaryNumber)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(aVar24, new EsimMobilePlanMyNumbersScreenContract$ModalStep.PhoneNumberActions(phoneNumberCategory.getF101234a()), bottom_dialog);
                }
                return Unit.f186387a;
            case 18:
                ty0.a aVar25 = (ty0.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kkk.o oVarE3 = ((FamilyPlanInvitationScreen) obj3).R2();
                Object obj5 = aVar25.d;
                t tVar = (t) oVarE3;
                tVar.getClass();
                b.AbstractC0155b abstractC0155b = obj5 instanceof b.AbstractC0155b ? (b.AbstractC0155b) obj5 : null;
                if (abstractC0155b != null) {
                    int i66 = 16;
                    if (abstractC0155b.equals(b.AbstractC0155b.C0156b.f24699a)) {
                        TermsScope.INSTANCE.getClass();
                        tVar.l2(new kb7.c(tVar, TermsScope.Q, esimPhoneNumberPortingProgress, i66), new yi5.b(i32));
                    } else if (abstractC0155b.equals(b.AbstractC0155b.a.f24698a)) {
                        TermsScope.INSTANCE.getClass();
                        tVar.l2(new kb7.c(tVar, TermsScope.P, esimPhoneNumberPortingProgress, i66), new yi5.b(i32));
                    } else if (abstractC0155b.equals(b.AbstractC0155b.c.f24700a)) {
                        hha.d dVar2 = (hha.d) ((kkk.i) ((j2) tVar.f185128w.f22677a).getValue()).f185101a.getContent();
                        if (dVar2 != null) {
                            tVar.l2(new kb7.c(tVar, dVar2, esimPhoneNumberPortingProgress, i21), new yi5.b(i32));
                        }
                    } else {
                        if (!(abstractC0155b instanceof cjk.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tVar.C1(new InsuranceEmbeddedDestinations.InsuranceDocumentsReview(((cjk.c) abstractC0155b).f24701a));
                    }
                }
                return Unit.f186387a;
            case 19:
                cmf.d dVar3 = (cmf.d) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j2 j2Var = (j2) obj3;
                y0.Companion.getClass();
                if (!y0.f185607c.contains(dVar3.f25224a.f)) {
                    if (!pd.b.j(dVar3.f25225b != null ? Boolean.valueOf(!y0.d.contains(r1.f314567b)) : null)) {
                        z = false;
                    }
                }
                j2Var.g(null, Boolean.valueOf(z));
                return Unit.f186387a;
            case 20:
                String newQuery = (String) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                km1.e eVar2 = (km1.e) ((BillersChooserScreen) obj3).N.getValue();
                Intrinsics.h(newQuery);
                km1.j jVar3 = (km1.j) eVar2;
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(newQuery, "newQuery");
                jVar3.H2(jVar3.f185679q, new k7c.n(newQuery, i2));
                return Unit.f186387a;
            case 21:
                Data data6 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                km1.j jVar4 = (km1.j) obj3;
                jVar4.H2(jVar4.f185679q, new b0(data6, i21));
                return Unit.f186387a;
            case 22:
                LocationDomain locationDomain = (LocationDomain) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                z1 z1Var = ((knl.h) obj3).o;
                Intrinsics.h(locationDomain);
                z1Var.k(locationDomain);
                return Unit.f186387a;
            case 23:
                Data data7 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) obj3).x2(new b0(data7, i3));
                return Unit.f186387a;
            case 24:
                hha.d dVar4 = (hha.d) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((w) obj3).f188203p = dVar4 != null ? dVar4.f152287a : null;
                return Unit.f186387a;
            case 25:
                Object obj6 = this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((ProductMigrationScreen) obj3).R.getValue();
                String listId = ((koi.j) obj6).getF55254b();
                ((qv0.p) obj6).getF55256g();
                lVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
                    lVar.f188224s.a();
                } else if (Intrinsics.f(listId, "DOCUMENTS_LIST_ITEM_ID")) {
                    lVar.C2(new kpb.e(lVar.o.f83380a));
                }
                return Unit.f186387a;
            case 26:
                Data data8 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) obj3;
                lVar2.H2(lVar2.f188225t, new b0(data8, i32));
                return Unit.f186387a;
            case 27:
                kqh.l lVar3 = (kqh.l) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kqh.e eVarE3 = ((ScreenerProductPickerScreen) obj3).R2();
                zel.f group = lVar3.f188415a;
                u uVar = (u) eVarE3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                uVar.C2(new kqh.j(group));
                return Unit.f186387a;
            case 28:
                Data data9 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u uVar2 = (u) obj3;
                uVar2.H2(uVar2.f188428t, new b0(data9, 27));
                List list = (List) data9.getContent();
                if (list != null) {
                    a2 a2Var = uVar2.f188427s;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    uVar2.f188427s = uVar2.n2(new d(uVar2, list, esimPhoneNumberPortingProgress, 29), new whi.b(i22));
                }
                return Unit.f186387a;
            default:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u uVar3 = (u) this.v;
                List list2 = (List) obj3;
                uVar3.H2(uVar3.f188428t, new k37.t(list2, i6));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    uVar3.n2(new kq5.d(uVar3, (zel.f) it8.next(), esimPhoneNumberPortingProgress, i5), new whi.b(i22));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f182469w = obj2;
    }
}
