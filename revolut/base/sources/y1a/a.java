package y1a;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.revolut.core.backend_flow.impl.ui.transactions.TransactionsSelectionController;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlow;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreen;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInControllerContract$InputData;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentController;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentControllerContract$InputData;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoActivity;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoFlow;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoFlowContract$InputData;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreen;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.PayBillsAndTaxesFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlow;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlowContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreenContract$InputData;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import com.revolut.feature.pockets.impl.ui.add_new.AddNewPocketFlow;
import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlow;
import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlowContract$InputData;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreen;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.TravelHotelsSortingOptionSelectorScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.TravelHotelsSortingOptionSelectorScreenContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreenContract$InputData;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.PendingPaymentBottomSheetFlow;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreenContract$InputData;
import dw3.a0;
import dw3.r3;
import dw3.u3;
import dw3.y;
import fa0.v;
import fa0.w;
import g9g.c1;
import g9g.d0;
import g9g.d1;
import g9g.l0;
import j1a.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import oda.o;
import p2k.m;
import p8a.b1;
import p8a.n;
import s3a.k;
import s3a.r;
import y4d.l;
import y99.f0;
import y99.h;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f310349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f310350c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f310348a = i;
        this.f310349b = obj2;
        this.f310350c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f310348a;
        Object obj2 = this.f310350c;
        Object obj3 = this.f310349b;
        switch (i) {
            case 0:
                RecurringSplitFlowContract$InputData recurringSplitFlowContract$InputData = (RecurringSplitFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((RecurringSplitFlow) obj3).m2()).a().get(v0a.b.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new j1a.d(((i) aVar.b()).f170313p, recurringSplitFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
            case 1:
                KProperty[] kPropertyArr = NewZealandTransferNoteScreen.c0;
                qji.b bVarQ2 = ((NewZealandTransferNoteScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.di.NewZealandNoteScreenInjector");
                p2k.i iVar = (p2k.i) bVarQ2;
                return new m(iVar.f232358c, iVar.d, (NewZealandTransferNoteScreenContract$InputData) obj2);
            case 2:
                RecipientSelectionFlowContract$InputData recipientSelectionFlowContract$InputData = (RecipientSelectionFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((RecipientSelectionFlow) obj3).m2()).a().get(r.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new s3a.i(((k) ((r) aVar.b())).g0, recipientSelectionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
            case 3:
                RevolutXFiatBalancesDetailsScreen revolutXFiatBalancesDetailsScreen = (RevolutXFiatBalancesDetailsScreen) obj3;
                RevolutXFiatBalancesDetailsController$InputData revolutXFiatBalancesDetailsController$InputData = (RevolutXFiatBalancesDetailsController$InputData) obj2;
                KProperty[] kPropertyArr2 = RevolutXFiatBalancesDetailsScreen.V;
                phm.a aVar4 = (phm.a) ue0.e.j(revolutXFiatBalancesDetailsScreen.m2()).a().get(x4c.b.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", x4c.b.class, " is not found"));
                }
                Object objB = aVar.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.revolut_x_balances.impl.fiat.di.RevolutXFiatBalancesDetailsScreenInjector");
                x4c.b bVar = ((x4c.b) objB).f302853g;
                revolutXFiatBalancesDetailsController$InputData.getClass();
                return new x4c.c(bVar, revolutXFiatBalancesDetailsScreen, revolutXFiatBalancesDetailsController$InputData);
            case 4:
                l lVar = (l) obj2;
                DisplayCurrencyPreviewController.Companion aVar5 = DisplayCurrencyPreviewController.INSTANCE;
                phm.a aVar6 = (phm.a) ue0.e.j(((DisplayCurrencyPreviewController) obj3).m2()).a().get(v4d.d.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", v4d.d.class, " is not found"));
                }
                v4d.d dVar = ((v4d.d) aVar.b()).f286032a;
                lVar.getClass();
                return new v4d.c(dVar, lVar);
            case 5:
                RatingsDetailsScreenContract$InputData ratingsDetailsScreenContract$InputData = (RatingsDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = RatingsDetailsScreen.f95432e0;
                phm.a aVar7 = (phm.a) ue0.e.j(((RatingsDetailsScreen) obj3).m2()).a().get(m2h.b.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new z3h.f(((z3h.g) aVar.b()).f319291s, ratingsDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
            case 6:
                BirthCityScreen birthCityScreen = (BirthCityScreen) obj3;
                KProperty[] kPropertyArr4 = BirthCityScreen.f67177b0;
                qji.b bVarQ22 = birthCityScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.di.BirthCityScreenInjector");
                a0 a0Var = (a0) bVarQ22;
                return new y(a0Var.f118228c, a0Var.d, birthCityScreen, (BirthCityScreenContract$InputData) obj2);
            case 7:
                CardsListFlowContract$InputData cardsListFlowContract$InputData = (CardsListFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((CardsListFlow) obj3).m2()).a().get(h63.a.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new z73.c(((z73.b) aVar.b()).f319873x, cardsListFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", h63.a.class, " is not found"));
            case 8:
                KProperty[] kPropertyArr5 = SwitchToNewCreditCardPromptScreen.Q;
                qji.b bVarU2 = ((SwitchToNewCreditCardPromptScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.di.SwitchToNewCreditCardPromptScreenInjector");
                t83.b bVar2 = (t83.b) bVarU2;
                return new t83.e(bVar2.f268816b, bVar2.f268817c, (SwitchToNewCreditCardPromptScreenContract$InputData) obj2);
            case 9:
                MissingInfoFlow missingInfoFlow = (MissingInfoFlow) obj3;
                MissingInfoFlowContract$InputData missingInfoFlowContract$InputData = (MissingInfoFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(missingInfoFlow.m2()).a().get(ca9.a.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ca9.a.class, " is not found"));
                }
                ca9.a aVar11 = ((ca9.a) aVar10.b()).f22538c;
                ComponentCallbacks2 componentCallbacks2M2 = missingInfoFlow.m2();
                Intrinsics.i(componentCallbacks2M2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.missinginfo.MissingInfoRouterProvider");
                ca9.c cVar = ((MissingInfoActivity) ((f0) componentCallbacks2M2)).u0;
                if (cVar == null) {
                    Intrinsics.r("activityComponent");
                    throw null;
                }
                h hVar = (h) cVar.f22543b.f22565l.get();
                hVar.getClass();
                missingInfoFlow.m2().getClass();
                return new ca9.b(aVar11, missingInfoFlowContract$InputData, hVar);
            case 10:
                PostTerminationPlanManualRepaymentControllerContract$InputData postTerminationPlanManualRepaymentControllerContract$InputData = (PostTerminationPlanManualRepaymentControllerContract$InputData) obj2;
                KProperty[] kPropertyArr6 = PostTerminationPlanManualRepaymentController.T;
                phm.a aVar12 = (phm.a) ue0.e.j(((PostTerminationPlanManualRepaymentController) obj3).m2()).a().get(oa5.b.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new oa5.d(((oa5.b) aVar.b()).i, postTerminationPlanManualRepaymentControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", oa5.b.class, " is not found"));
            case 11:
                KProperty[] kPropertyArr7 = ReviewTrustedAccountScreen.P;
                qji.b bVarU22 = ((ReviewTrustedAccountScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.di.ReviewTrustedAccountScreenInjector");
                n nVar = (n) bVarU22;
                return new b1(nVar.f234031b, nVar.f234032c, (ReviewTrustedAccountScreenContract$InputData) obj2);
            case 12:
                PendingPaymentBottomSheetInputData pendingPaymentBottomSheetInputData = (PendingPaymentBottomSheetInputData) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((PendingPaymentBottomSheetFlow) obj3).m2()).a().get(wak.f.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", wak.f.class, " is not found"));
                }
                wak.f fVar = ((wak.f) aVar.b()).f295969g;
                pendingPaymentBottomSheetInputData.getClass();
                return new wak.b(fVar, pendingPaymentBottomSheetInputData);
            case 13:
                SimpleConfirmationScreen simpleConfirmationScreen = (SimpleConfirmationScreen) obj3;
                qji.b bVarQ23 = simpleConfirmationScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.di.SimpleConfirmationScreenInjector");
                lal.a aVarD = ((oal.a) bVarQ23).D();
                aVarD.d = simpleConfirmationScreen;
                aVarD.e = (SimpleConfirmationScreenContract$InputData) obj2;
                return (lal.h) aVarD.mo3800build();
            case 14:
                TransactionsSelectionController transactionsSelectionController = (TransactionsSelectionController) obj3;
                FormScreen formScreen = (FormScreen) obj2;
                int i2 = TransactionsSelectionController.f51291b0;
                qji.b bVarU23 = transactionsSelectionController.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.transactions.di.TransactionsControllerInjector");
                v vVarW = ((na0.d) bVarU23).w();
                switch (vVarW.f133163a) {
                    case 0:
                        vVarW.d = formScreen;
                        break;
                    default:
                        vVarW.d = formScreen;
                        break;
                }
                return (w) ((v) vVarW.mo3808a(transactionsSelectionController)).mo3783build();
            case 15:
                yki.b bVar3 = (yki.b) obj3;
                com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar14 = (com.revolut.feature.cash_topup.impl.ui.flow.barcode.a) obj2;
                if (bVar3.d() == null) {
                    aVar14.getClass();
                    Intrinsics.checkNotNullParameter(bVar3, "<this>");
                    bVar3.n();
                }
                return Unit.f186387a;
            case 16:
                com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar4 = (com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b) obj2;
                if (((Ref$ObjectRef) obj3).f186409a == null) {
                    oki.h.D2(bVar4.z);
                }
                return Unit.f186387a;
            case 17:
                KontomatikSignInController kontomatikSignInController = (KontomatikSignInController) obj3;
                KProperty[] kPropertyArr8 = KontomatikSignInController.U;
                qji.b bVarU24 = kontomatikSignInController.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.di.KontomatikSignInControllerScreenInjector");
                r3 r3Var = (r3) bVarU24;
                return new u3(r3Var.f119647c, r3Var.d, kontomatikSignInController, (KontomatikSignInControllerContract$InputData) obj2);
            case 18:
                RevolutCardReadyScreen revolutCardReadyScreen = (RevolutCardReadyScreen) obj3;
                RevolutCardReadyScreenContract$InputData revolutCardReadyScreenContract$InputData = (RevolutCardReadyScreenContract$InputData) obj2;
                qji.b bVarU25 = revolutCardReadyScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.revolut_card_ready.screen.di.RevolutCardReadyScreenInjector");
                uc9.a aVar15 = (uc9.a) bVarU25;
                uc9.b bVar5 = aVar15.f279003b;
                uc9.a aVar16 = aVar15.f279004c;
                Activity activityM2 = revolutCardReadyScreen.m2();
                activityM2.getClass();
                return new uc9.c(bVar5, aVar16, revolutCardReadyScreen, revolutCardReadyScreenContract$InputData, activityM2);
            case 19:
                TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen = (TravelHotelsDatesPickerScreen) obj3;
                TravelHotelsDatesPickerScreenContract$InputData travelHotelsDatesPickerScreenContract$InputData = (TravelHotelsDatesPickerScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = TravelHotelsDatesPickerScreen.P;
                qji.b bVarU26 = travelHotelsDatesPickerScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.di.TravelHotelsDatesPickerScreenInjector");
                c1 c1Var = (c1) ((zcg.a) bVarU26).s().mo3808a(travelHotelsDatesPickerScreen);
                switch (c1Var.f141612a) {
                    case 0:
                        travelHotelsDatesPickerScreenContract$InputData.getClass();
                        c1Var.d = travelHotelsDatesPickerScreenContract$InputData;
                        break;
                    default:
                        travelHotelsDatesPickerScreenContract$InputData.getClass();
                        c1Var.d = travelHotelsDatesPickerScreenContract$InputData;
                        break;
                }
                return (d1) c1Var.mo3783build();
            case 20:
                KProperty[] kPropertyArr10 = TravelHotelsRoomDetailsAmendmentScreen.Q;
                qji.b bVarU27 = ((TravelHotelsRoomDetailsAmendmentScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.di.TravelHotelsRoomDetailsAmendmentScreenInjector");
                g9g.g gVar = (g9g.g) bVarU27;
                return new d0(gVar.f141671b, gVar.f141672c, (TravelHotelsRoomDetailsAmendmentScreenContract$InputData) obj2);
            case 21:
                AddNewPocketContract$InputData addNewPocketContract$InputData = (AddNewPocketContract$InputData) obj2;
                phm.a aVar17 = (phm.a) ue0.e.j(((AddNewPocketFlow) obj3).m2()).a().get(o.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                }
                o oVar = ((o) aVar.b()).P;
                addNewPocketContract$InputData.getClass();
                return new oda.f(oVar, addNewPocketContract$InputData);
            case 22:
                OpenNewPocketFlow openNewPocketFlow = (OpenNewPocketFlow) obj3;
                OpenNewPocketFlowContract$InputData openNewPocketFlowContract$InputData = (OpenNewPocketFlowContract$InputData) obj2;
                phm.a aVar18 = (phm.a) ue0.e.j(openNewPocketFlow.m2()).a().get(o.class);
                aVar = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                }
                o oVar2 = ((o) aVar.b()).P;
                zfe.d dVar2 = zfe.e.Companion;
                Activity activityM22 = openNewPocketFlow.m2();
                dVar2.getClass();
                return new oda.i(oVar2, openNewPocketFlowContract$InputData, zfe.d.a(activityM22));
            case 23:
                SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen = (SharedCreateAlertRevampedScreen) obj3;
                KProperty[] kPropertyArr11 = SharedCreateAlertRevampedScreen.f0;
                qji.b bVarQ24 = sharedCreateAlertRevampedScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.di.CreateAlertScreenInjector");
                ned.c cVar2 = (ned.c) bVarQ24;
                ned.e eVar = cVar2.f214438b;
                ned.c cVar3 = cVar2.f214439c;
                wuk.g gVar2 = sharedCreateAlertRevampedScreen.f86734e0;
                gVar2.getClass();
                return new ned.l(eVar, cVar3, sharedCreateAlertRevampedScreen, (SharedCreateAlertScreenContract$InputData) obj2, gVar2);
            case 24:
                SharedCreateAlertScreen sharedCreateAlertScreen = (SharedCreateAlertScreen) obj3;
                SharedCreateAlertScreenContract$InputData.Create create = (SharedCreateAlertScreenContract$InputData.Create) obj2;
                KProperty[] kPropertyArr12 = SharedCreateAlertScreen.f0;
                qji.b bVarQ25 = sharedCreateAlertScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.di.CreateAlertScreenInjector");
                ned.c cVar4 = (ned.c) bVarQ25;
                ned.e eVar2 = cVar4.f214438b;
                ned.c cVar5 = cVar4.f214439c;
                wuk.g gVar3 = sharedCreateAlertScreen.f86738e0;
                gVar3.getClass();
                return new ned.l(eVar2, cVar5, sharedCreateAlertScreen, create, gVar3);
            case 25:
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar6 = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) obj3;
                bVar6.x2(new y8a.h((cgd.m) obj2, 29));
                bVar6.E2();
                return Unit.f186387a;
            case 26:
                KProperty[] kPropertyArr13 = FinalChecksScreen.c0;
                qji.b bVarQ26 = ((FinalChecksScreen) obj3).Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.di.FinalChecksScreenInjector");
                jef.g gVar4 = (jef.g) bVarQ26;
                return new jef.c(gVar4.f173380b, gVar4.f173381c, (FinalChecksScreenContract$InputData) obj2);
            case 27:
                int i3 = TravelHotelsSortingOptionSelectorScreen.U;
                qji.b bVarU28 = ((TravelHotelsSortingOptionSelectorScreen) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.di.TravelHotelsSortingOptionSelectorScreenInjector");
                g9g.n nVar2 = (g9g.n) bVarU28;
                return new l0(nVar2.f141747b, nVar2.f141748c, (TravelHotelsSortingOptionSelectorScreenContract$InputData) obj2);
            case 28:
                PayBillsAndTaxesNavigation$InputData payBillsAndTaxesNavigation$InputData = (PayBillsAndTaxesNavigation$InputData) obj2;
                phm.a aVar19 = (phm.a) ue0.e.j(((PayBillsAndTaxesFlow) obj3).m2()).a().get(lf9.m.class);
                aVar = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", lf9.m.class, " is not found"));
                }
                lf9.m mVar = ((lf9.m) aVar.b()).u;
                payBillsAndTaxesNavigation$InputData.getClass();
                return new lf9.n(mVar, payBillsAndTaxesNavigation$InputData);
            default:
                SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen = (SharedFavouritesAddAssetScreen) obj3;
                SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData = (SharedFavouritesAddAssetScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = SharedFavouritesAddAssetScreen.f86802h0;
                qji.b bVarQ27 = sharedFavouritesAddAssetScreen.Q2();
                Intrinsics.i(bVarQ27, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedAddAssetScreenInjector");
                fgd.h hVar2 = (fgd.h) ((yfd.b) bVarQ27).b().S(sharedFavouritesAddAssetScreen);
                switch (hVar2.f135054a) {
                    case 0:
                        hVar2.f135056c = sharedFavouritesAddAssetScreenContract$InputData;
                        break;
                    default:
                        hVar2.f135056c = sharedFavouritesAddAssetScreenContract$InputData;
                        break;
                }
                return (fgd.i) hVar2.mo3800build();
        }
    }
}
