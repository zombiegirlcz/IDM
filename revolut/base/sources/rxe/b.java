package rxe;

import androidx.camera.video.MimeMatchedVideoCapabilities;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlow;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.CardPromptFlow;
import com.revolut.feature.card_screen.impl.prompts.CardPromptFlowContract$InputData;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreen;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesController;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2Screen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2ScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreenContract$InputData;
import com.revolut.feature.localisation.ui.api.navigation.DateInputInputData;
import com.revolut.feature.localisation.ui.impl.screens.date_input.DateInputScreen;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet.SplitBillLinkBottomSheetContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet.SplitBillLinkBottomSheetController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListController;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetController;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetControllerContract$InputData;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlow;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlowContract$InputData;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlow;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.revert_transfer.RevertTransferFlow;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreenContract$Input;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2ScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.flow.WidgetisedAnalyticsFlow;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsInputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreen;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreenContract$InputData;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlowContract$InputData;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreen;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BeneficiaryDetailsInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.IndiaWithdrawalFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.IndiaWithdrawalFlowContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.beneficiary_details.BeneficiaryDetailsController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityFlow;
import efm.d0;
import ewg.h;
import ewg.p;
import eya.j;
import i72.m;
import jm4.j0;
import jm4.p4;
import jy2.k;
import jy2.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kyk.v;
import kyk.y;
import m3c.g;
import ove.q;
import ove.t;
import p2k.l;
import r6e.o;
import te0.s;
import u45.o0;
import ufm.i;
import z0g.r;
import z0g.z;
import zxb.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f258140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f258141c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f258139a = i;
        this.f258140b = obj2;
        this.f258141c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r5v72 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f258139a;
        int i2 = 26;
        Object obj2 = this.f258141c;
        Object obj3 = this.f258140b;
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                phm.a aVar = (phm.a) ue0.e.j(((RevertTransferFlow) obj3).m2()).a().get(t.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( != 0) {
                    return new q(((t) b()).H, cVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 1:
                d0 d0VarFirstOrError = ((n) ((k) obj3)).x0().c(s.f270018a).firstOrError();
                rxb.f fVar = new rxb.f(15, new ry2.c((py2.c) obj2, 0));
                d0VarFirstOrError.getClass();
                i iVar = new i(d0VarFirstOrError, fVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 2:
                KProperty[] kPropertyArr = DirectDebitAccountDetailsScreen.c0;
                qji.b bVarQ2 = ((DirectDebitAccountDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.account_details_v2.di.DirectDebitAccountDetailsScreenInjector");
                j0 j0Var = (j0) bVarQ2;
                return new p4(j0Var.f176144b, j0Var.f176145c, (DirectDebitAccountDetailsScreenContract$InputData) obj2);
            case 3:
                InvitesListContract$InputData invitesListContract$InputData = (InvitesListContract$InputData) obj2;
                InvitesListController.Companion aVar2 = InvitesListController.INSTANCE;
                qji.b bVarU2 = ((InvitesListController) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.di.InvitesListScreenInjector");
                eya.f fVar2 = (eya.f) bVarU2;
                j jVar = fVar2.f130626b;
                eya.f fVar3 = fVar2.f130627c;
                invitesListContract$InputData.getClass();
                return new eya.d(jVar, fVar3, invitesListContract$InputData);
            case 4:
                WidgetisedAnalyticsInputData widgetisedAnalyticsInputData = (WidgetisedAnalyticsInputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((WidgetisedAnalyticsFlow) obj3).m2()).a().get(p.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                }
                h hVar = ((h) ((p) aVar4.b())).f130214x;
                AnalyticsProduct analyticsProduct = widgetisedAnalyticsInputData.f95140b;
                analyticsProduct.getClass();
                gwg.a aVar5 = widgetisedAnalyticsInputData.f95141c;
                aVar5.getClass();
                return new ewg.k(hVar, widgetisedAnalyticsInputData, analyticsProduct, aVar5);
            case 5:
                GlossaryHomeScreenContract$InputData glossaryHomeScreenContract$InputData = (GlossaryHomeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = GlossaryHomeScreen.Y;
                phm.a aVar6 = (phm.a) ue0.e.j(((GlossaryHomeScreen) obj3).m2()).a().get(nyj.h.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 != null) {
                    return new nyj.a(((nyj.c) ((nyj.h) aVar7.b())).f220889m, glossaryHomeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nyj.h.class, " is not found"));
            case 6:
                KycDetailsNationalityFlow kycDetailsNationalityFlow = (KycDetailsNationalityFlow) obj3;
                KycDetailsNationalityContract$InputData kycDetailsNationalityContract$InputData = (KycDetailsNationalityContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(kycDetailsNationalityFlow.m2()).a().get(y.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                }
                v vVar = ((v) ((y) aVar9.b())).A;
                kycDetailsNationalityContract$InputData.getClass();
                return new kyk.f(vVar, kycDetailsNationalityFlow, kycDetailsNationalityContract$InputData);
            case 7:
                return MimeMatchedVideoCapabilities.validatedData_delegate$lambda$0((VideoEncoderInfo.Finder) obj3, (MimeMatchedVideoCapabilities) obj2);
            case 8:
                RevPointsRelatedTransactionsBottomSheetControllerContract$InputData revPointsRelatedTransactionsBottomSheetControllerContract$InputData = (RevPointsRelatedTransactionsBottomSheetControllerContract$InputData) obj2;
                int i3 = RevPointsRelatedTransactionsBottomSheetController.V;
                phm.a aVar10 = (phm.a) ue0.e.j(((RevPointsRelatedTransactionsBottomSheetController) obj3).m2()).a().get(zxb.e.class);
                b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar11 != null) {
                    return new u(((zxb.e) aVar11.b()).V, revPointsRelatedTransactionsBottomSheetControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
            case 9:
                WealthNewsOverviewFlowContract$InputData wealthNewsOverviewFlowContract$InputData = (WealthNewsOverviewFlowContract$InputData) obj2;
                KProperty[] kPropertyArr3 = WealthNewsOverviewFlow.X;
                phm.a aVar12 = (phm.a) ue0.e.j(((WealthNewsOverviewFlow) obj3).m2()).a().get(l0k.c.class);
                b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar13 != null) {
                    return new l0k.i(((l0k.c) aVar13.b()).o, wealthNewsOverviewFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
            case 10:
                FinancialDifficultiesControllerContract$InputData financialDifficultiesControllerContract$InputData = (FinancialDifficultiesControllerContract$InputData) obj2;
                KProperty[] kPropertyArr4 = FinancialDifficultiesController.U;
                phm.a aVar14 = (phm.a) ue0.e.j(((FinancialDifficultiesController) obj3).m2()).a().get(i15.d.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new i15.e(((i15.d) aVar15.b()).f157559h, financialDifficultiesControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", i15.d.class, " is not found"));
            case 11:
                SplitBillLinkBottomSheetContract$InputData splitBillLinkBottomSheetContract$InputData = (SplitBillLinkBottomSheetContract$InputData) obj2;
                int i5 = SplitBillLinkBottomSheetController.U;
                phm.a aVar16 = (phm.a) ue0.e.j(((SplitBillLinkBottomSheetController) obj3).m2()).a().get(v0a.b.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new j1a.e(((j1a.i) aVar17.b()).f170313p, splitBillLinkBottomSheetContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
            case 12:
                TravelExperiencesCancellationScreen travelExperiencesCancellationScreen = (TravelExperiencesCancellationScreen) obj3;
                TravelExperiencesCancellationScreenContract$InputData travelExperiencesCancellationScreenContract$InputData = (TravelExperiencesCancellationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = TravelExperiencesCancellationScreen.f93021h0;
                qji.b bVarQ22 = travelExperiencesCancellationScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.di.TravelExperiencesCancellationScreenInjector");
                z0g.y yVar = (z0g.y) ((t1g.a) bVarQ22).q().S(travelExperiencesCancellationScreen);
                switch (yVar.f318469a) {
                    case 0:
                        yVar.d = travelExperiencesCancellationScreenContract$InputData;
                        break;
                    default:
                        yVar.d = travelExperiencesCancellationScreenContract$InputData;
                        break;
                }
                return (z) yVar.mo3800build();
            case 13:
                KProperty[] kPropertyArr6 = PaymentOptionsScreen.c0;
                qji.b bVarQ23 = ((PaymentOptionsScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.retail.feature.payment_options.impl.ui.screens.options.di.PaymentOptionsScreenInjector");
                q1k.b bVar = (q1k.b) bVarQ23;
                return new q1k.c(bVar.f241458b, bVar.f241459c, (PaymentOptionsScreenContract$InputData) obj2);
            case 14:
                StoreBrandDetailDiscountScreen storeBrandDetailDiscountScreen = (StoreBrandDetailDiscountScreen) obj3;
                StoreBrandDetailDiscountScreenContract$InputData storeBrandDetailDiscountScreenContract$InputData = (StoreBrandDetailDiscountScreenContract$InputData) obj2;
                h30.q qVar = storeBrandDetailDiscountScreen.K;
                qVar.getClass();
                storeBrandDetailDiscountScreenContract$InputData.getClass();
                qVar.e = storeBrandDetailDiscountScreenContract$InputData;
                qVar.d = storeBrandDetailDiscountScreen;
                return (k2e.b) qVar.mo3783build();
            case 15:
                TravelExperiencesOptionsV2Screen travelExperiencesOptionsV2Screen = (TravelExperiencesOptionsV2Screen) obj3;
                KProperty[] kPropertyArr7 = TravelExperiencesOptionsV2Screen.i0;
                qji.b bVarQ24 = travelExperiencesOptionsV2Screen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.di.TravelExperiencesOptionsV2ScreenInjector");
                z0g.f fVar4 = (z0g.f) bVarQ24;
                return new z0g.k(fVar4.f318359b, fVar4.f318360c, travelExperiencesOptionsV2Screen, (TravelExperiencesOptionsV2ScreenContract$InputData) obj2);
            case 16:
                IndiaWithdrawalFlowContract$InputData indiaWithdrawalFlowContract$InputData = (IndiaWithdrawalFlowContract$InputData) obj2;
                phm.a aVar18 = (phm.a) ue0.e.j(((IndiaWithdrawalFlow) obj3).m2()).a().get(p2k.a.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new p2k.d(((p2k.a) aVar19.b()).f232267c, indiaWithdrawalFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", p2k.a.class, " is not found"));
            case 17:
                DateInputInputData dateInputInputData = (DateInputInputData) obj2;
                KProperty[] kPropertyArr8 = DateInputScreen.P;
                phm.a aVar20 = (phm.a) ue0.e.j(((DateInputScreen) obj3).m2()).a().get(r39.c.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 != null) {
                    return new r39.b(((r39.c) aVar21.b()).f251229b, dateInputInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r39.c.class, " is not found"));
            case 18:
                OrderHistoryFlowContract$InputData orderHistoryFlowContract$InputData = (OrderHistoryFlowContract$InputData) obj2;
                phm.a aVar22 = (phm.a) ue0.e.j(((OrderHistoryFlow) obj3).m2()).a().get(m3c.j.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 != null) {
                    return new g(((m3c.j) aVar23.b()).f, orderHistoryFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", m3c.j.class, " is not found"));
            case 19:
                KProperty[] kPropertyArr9 = TravelExperiencesVisitorInformationScreen.c0;
                qji.b bVarQ25 = ((TravelExperiencesVisitorInformationScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.di.TravelExperiencesVisitorInformationScreenInjector");
                z0g.f fVar5 = (z0g.f) bVarQ25;
                return new r(fVar5.f318359b, fVar5.f318360c, (TravelExperiencesVisitorInformationScreenContract$InputData) obj2);
            case 20:
                CollectionScreen collectionScreen = (CollectionScreen) obj3;
                CollectionScreenContract$Input collectionScreenContract$Input = (CollectionScreenContract$Input) obj2;
                KProperty[] kPropertyArr10 = CollectionScreen.Y;
                phm.a aVar24 = (phm.a) ue0.e.j(collectionScreen.m2()).a().get(c4f.d.class);
                b60.a aVar25 = aVar24 != null ? (b60.a) aVar24.get() : null;
                if (aVar25 != null) {
                    return new c4f.c(((c4f.d) aVar25.b()).f21206g, collectionScreenContract$Input, new avk.j(collectionScreen, i2), new o5d.b(collectionScreen.V));
                }
                throw new IllegalStateException(a0.d.q("Api ", c4f.d.class, " is not found"));
            case 21:
                s4i.h hVar2 = (s4i.h) obj3;
                BaseBottomSheetController baseBottomSheetController = (BaseBottomSheetController) obj2;
                if (Intrinsics.f(hVar2.f259889w, baseBottomSheetController)) {
                    hVar2.f259889w = null;
                }
                if (Intrinsics.f(hVar2.f259890x, baseBottomSheetController)) {
                    hVar2.f259890x = null;
                }
                hVar2.L2();
                return Unit.f186387a;
            case 22:
                BeneficiaryDetailsInputData beneficiaryDetailsInputData = (BeneficiaryDetailsInputData) obj2;
                int i6 = BeneficiaryDetailsController.T;
                phm.a aVar26 = (phm.a) ue0.e.j(((BeneficiaryDetailsController) obj3).m2()).a().get(p2k.d0.class);
                b60.a aVar27 = aVar26 != null ? (b60.a) aVar26.get() : null;
                if (aVar27 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", p2k.d0.class, " is not found"));
                }
                p2k.n nVar = ((p2k.n) aVar27.b()).f232406h0;
                beneficiaryDetailsInputData.getClass();
                return new l(nVar, beneficiaryDetailsInputData);
            case 23:
                com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar28 = (com.revolut.feature.credit.application.plugins.impl.ui.banner.a) obj3;
                aVar28.l2(new s09.c(aVar28, ((hs3.j) obj2).f154900c, , 12), new yi5.b(i2));
                return Unit.f186387a;
            case 24:
                LoanSelectNewRepaymentDayV2ScreenContract$InputData loanSelectNewRepaymentDayV2ScreenContract$InputData = (LoanSelectNewRepaymentDayV2ScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = LoanSelectNewRepaymentDayV2Screen.T;
                phm.a aVar29 = (phm.a) ue0.e.j(((LoanSelectNewRepaymentDayV2Screen) obj3).m2()).a().get(u45.h.class);
                b60.a aVar30 = aVar29 != null ? (b60.a) aVar29.get() : null;
                if (aVar30 != null) {
                    return new u45.j0(((u45.h) aVar30.b()).B, loanSelectNewRepaymentDayV2ScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 25:
                BrandingSettingsScreen brandingSettingsScreen = (BrandingSettingsScreen) obj3;
                BrandingSettingsScreen.Companion aVar31 = BrandingSettingsScreen.INSTANCE;
                qji.b bVarU22 = brandingSettingsScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.shared.branding.impl.ui.settings.di.BrandingSettingsScreenInjector");
                o6d.c cVar2 = (o6d.c) bVarU22;
                return new o6d.e(cVar2.f222545c, cVar2.d, brandingSettingsScreen, (BrandingSharedDestination.InputData) obj2);
            case 26:
                MultibancoExternalEnrollmentFlow multibancoExternalEnrollmentFlow = (MultibancoExternalEnrollmentFlow) obj3;
                MultibancoExternalEnrollmentFlowContract$InputData multibancoExternalEnrollmentFlowContract$InputData = (MultibancoExternalEnrollmentFlowContract$InputData) obj2;
                phm.a aVar32 = (phm.a) ue0.e.j(multibancoExternalEnrollmentFlow.m2()).a().get(m.class);
                b60.a aVar33 = aVar32 != null ? (b60.a) aVar32.get() : null;
                if (aVar33 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                }
                m mVar = ((m) aVar33.b()).A;
                multibancoExternalEnrollmentFlow.m2().getClass();
                return new i72.p(mVar, multibancoExternalEnrollmentFlowContract$InputData);
            case 27:
                ContactsPickerFlowContract$InputData contactsPickerFlowContract$InputData = (ContactsPickerFlowContract$InputData) obj2;
                phm.a aVar34 = (phm.a) ue0.e.j(((ContactsPickerFlow) obj3).m2()).a().get(o.class);
                b60.a aVar35 = aVar34 != null ? (b60.a) aVar34.get() : null;
                if (aVar35 != null) {
                    return new r6e.e(((o) aVar35.b()).K, contactsPickerFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 28:
                CardPromptFlowContract$InputData cardPromptFlowContract$InputData = (CardPromptFlowContract$InputData) obj2;
                phm.a aVar36 = (phm.a) ue0.e.j(((CardPromptFlow) obj3).m2()).a().get(t83.c.class);
                b60.a aVar37 = aVar36 != null ? (b60.a) aVar36.get() : null;
                if (aVar37 != null) {
                    return new t83.b(((t83.c) aVar37.b()).d, cardPromptFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t83.c.class, " is not found"));
            default:
                LoanToggleBackupCardScreenContract$InputData loanToggleBackupCardScreenContract$InputData = (LoanToggleBackupCardScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = LoanToggleBackupCardScreen.f70599e0;
                phm.a aVar38 = (phm.a) ue0.e.j(((LoanToggleBackupCardScreen) obj3).m2()).a().get(u45.h.class);
                b60.a aVar39 = aVar38 != null ? (b60.a) aVar38.get() : null;
                if (aVar39 != null) {
                    return new o0(((u45.h) aVar39.b()).B, loanToggleBackupCardScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
        }
    }
}
