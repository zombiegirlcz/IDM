package wrj;

import android.media.MediaFormat;
import androidx.camera.video.internal.muxer.Media3MuxerImpl;
import androidx.camera.video.internal.muxer.MediaMuxerImpl;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlow;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreen;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreen;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlowContract$InputData;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.TransactionFilterFlow;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.TransactionFilterFlowContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreenContract$InputData;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreen;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreenContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogScreen;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreen;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreenContract$InputData;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreen;
import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreen;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.TravelHotelsRoomsSelectionFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import com.revolut.feature_restricted_access_malware.impl.flow.MaliciousSoftwarePromptFlow;
import com.revolut.feature_restricted_access_malware.impl.flow.MaliciousSoftwarePromptFlowContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlowContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreenContract$InputData;
import dw3.s4;
import g9g.o0;
import g9g.s0;
import g9g.t0;
import jm4.a3;
import jm4.y1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kyk.v;
import kyk.w;
import kyk.y;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f299615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f299616c;

    public /* synthetic */ m(Object obj2, Object obj3, int i) {
        this.f299614a = i;
        this.f299615b = obj2;
        this.f299616c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f299614a;
        Object obj2 = this.f299616c;
        Object obj3 = this.f299615b;
        switch (i) {
            case 0:
                UpcomingPaymentsContract$InputData upcomingPaymentsContract$InputData = (UpcomingPaymentsContract$InputData) obj2;
                KProperty[] kPropertyArr = UpcomingPaymentsScreen.f101528d0;
                phm.a aVar2 = (phm.a) ue0.e.j(((UpcomingPaymentsScreen) obj3).m2()).a().get(erj.h.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new erj.n(((erj.h) aVar.b()).u, upcomingPaymentsContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", erj.h.class, " is not found"));
            case 1:
                BizumRegistrationFlowContract$InputData bizumRegistrationFlowContract$InputData = (BizumRegistrationFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((BizumRegistrationFlow) obj3).m2()).a().get(ms1.j.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new ms1.n(((ms1.j) aVar.b()).B, bizumRegistrationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
            case 2:
                CreditCardRepayCustomAmountFlowContract$InputData creditCardRepayCustomAmountFlowContract$InputData = (CreditCardRepayCustomAmountFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((CreditCardRepayCustomAmountFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new y1(((a3) aVar.b()).Y, creditCardRepayCustomAmountFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 3:
                TransactionFilterFlowContract$InputData transactionFilterFlowContract$InputData = (TransactionFilterFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((TransactionFilterFlow) obj3).m2()).a().get(ku5.g.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new ku5.l(((ku5.g) aVar.b()).u, transactionFilterFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ku5.g.class, " is not found"));
            case 4:
                AccountClosureProgressScreen accountClosureProgressScreen = (AccountClosureProgressScreen) obj3;
                AccountClosureProgressScreenContract$InputData accountClosureProgressScreenContract$InputData = (AccountClosureProgressScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = AccountClosureProgressScreen.R;
                phm.a aVar6 = (phm.a) ue0.e.j(accountClosureProgressScreen.m2()).a().get(ztg.n.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new ztg.i(((ztg.n) aVar.b()).f325156n, accountClosureProgressScreenContract$InputData, accountClosureProgressScreen);
                }
                throw new IllegalStateException(a0.d.q("Api ", ztg.n.class, " is not found"));
            case 5:
                ShowCardPinScreen showCardPinScreen = (ShowCardPinScreen) obj3;
                ShowCardPinScreen.Companion aVar7 = ShowCardPinScreen.INSTANCE;
                qji.b bVarU2 = showCardPinScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.di.ShowCardPinScreenInjector");
                return (iwh.j) ((xv2.a) ((xv2.b) bVarU2).b().mo3808a(showCardPinScreen)).e0((ShowCardPinScreenContract$InputData) obj2).mo3783build();
            case 6:
                ww0.b bVar = (ww0.b) obj3;
                h01.a aVar8 = (h01.a) obj2;
                if (bVar.f300571g != aVar8) {
                    bVar.f300571g = aVar8;
                    xw0.f fVar = bVar.f300569b;
                    h01.a aVar9 = h01.a.ACTIVE;
                    boolean z = aVar8 == aVar9;
                    if (z != fVar.f309314c) {
                        fVar.f309314c = z;
                        boolean z3 = fVar.f309313b;
                        if (z3) {
                            fVar.f309313b = false;
                            xw0.d dVar = fVar.d;
                            if (dVar != null) {
                                dVar.c();
                                dVar.f309309j = null;
                                dVar.k = null;
                            }
                            fVar.d = null;
                        }
                        if (z3) {
                            fVar.a();
                        }
                    }
                    if (bVar.f300571g == aVar9) {
                        h80.e.f149935b.addObserver(bVar);
                    } else {
                        h80.e.f149935b.removeObserver(bVar);
                    }
                    if (bVar.f300571g != aVar9 && bVar.f300572h) {
                        bVar.onPause(h80.e.f149934a);
                    }
                }
                return Unit.f186387a;
            case 7:
                WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen = (WidgetisedAnalyticsPerformanceScreen) obj3;
                WidgetisedAnalyticsPerformanceContract$InputData widgetisedAnalyticsPerformanceContract$InputData = (WidgetisedAnalyticsPerformanceContract$InputData) obj2;
                KProperty[] kPropertyArr3 = WidgetisedAnalyticsPerformanceScreen.X;
                qji.b bVarU22 = widgetisedAnalyticsPerformanceScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.performance.di.WidgetisedAnalyticsPerformanceScreenInjector");
                ewg.k kVar = (ewg.k) bVarU22;
                return new ewg.l(kVar.d, kVar.e, widgetisedAnalyticsPerformanceScreen, widgetisedAnalyticsPerformanceContract$InputData, widgetisedAnalyticsPerformanceScreen);
            case 8:
                TradingOnboardingOpenDocumentFlowContract$InputData tradingOnboardingOpenDocumentFlowContract$InputData = (TradingOnboardingOpenDocumentFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((TradingOnboardingOpenDocumentFlow) obj3).m2()).a().get(y.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                }
                v vVar = ((v) ((y) aVar.b())).A;
                tradingOnboardingOpenDocumentFlowContract$InputData.getClass();
                return new w(vVar, tradingOnboardingOpenDocumentFlowContract$InputData);
            case 9:
                return Integer.valueOf(Media3MuxerImpl.addTrack$lambda$1((Media3MuxerImpl) obj3, (MediaFormat) obj2));
            case 10:
                return Integer.valueOf(MediaMuxerImpl.addTrack$lambda$1((MediaMuxerImpl) obj3, (MediaFormat) obj2));
            case 11:
                ExternalCardDetailsScreenContract$InputData externalCardDetailsScreenContract$InputData = (ExternalCardDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = ExternalCardDetailsScreen.T;
                qji.b bVarU23 = ((ExternalCardDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.screens.external_card_details.di.ExternalCardDetailsScreenInjector");
                qve.e eVar = (qve.e) bVarU23;
                qve.k kVar2 = eVar.f249586b;
                qve.e eVar2 = eVar.f249587c;
                externalCardDetailsScreenContract$InputData.getClass();
                return new qve.f(kVar2, eVar2, externalCardDetailsScreenContract$InputData);
            case 12:
                RecurringPaymentsManageSplitDialogContract$InputData recurringPaymentsManageSplitDialogContract$InputData = (RecurringPaymentsManageSplitDialogContract$InputData) obj2;
                int i2 = RecurringPaymentsManageSplitDialogScreen.Q;
                phm.a aVar11 = (phm.a) ue0.e.j(((RecurringPaymentsManageSplitDialogScreen) obj3).m2()).a().get(v0a.b.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new j1a.b(((j1a.i) aVar.b()).f170313p, recurringPaymentsManageSplitDialogContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
            case 13:
                CardPersonalisationController cardPersonalisationController = (CardPersonalisationController) obj3;
                KProperty[] kPropertyArr5 = CardPersonalisationController.T;
                qji.b bVarU24 = cardPersonalisationController.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.di.CardPersonalisationControllerInjector");
                x13.q qVar = (x13.q) bVarU24;
                return new x13.r(qVar.f302174c, qVar.d, cardPersonalisationController, (CardPersonalisationControllerContract$InputData) obj2, cardPersonalisationController);
            case 14:
                TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen = (TravelExperiencesPickupDetailsScreen) obj3;
                KProperty[] kPropertyArr6 = TravelExperiencesPickupDetailsScreen.f0;
                qji.b bVarQ2 = travelExperiencesPickupDetailsScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.di.TravelExperiencesPickupDetailsScreenInjector");
                z0g.f fVar2 = (z0g.f) bVarQ2;
                return new z0g.m(fVar2.f318359b, fVar2.f318360c, travelExperiencesPickupDetailsScreen, (TravelExperiencesPickupDetailsScreenContract$InputData) obj2);
            case 15:
                h3g.a aVar12 = (h3g.a) obj2;
                ((x2g.o) obj3).getClass();
                return new TravelExperiencesBookingPrerequisiteQuestion(aVar12.f149114a.b(), aVar12.f149114a.f92762b);
            case 16:
                QrScanningScreen qrScanningScreen = (QrScanningScreen) obj3;
                g12.l lVar = (g12.l) obj2;
                KProperty[] kPropertyArr7 = QrScanningScreen.S;
                qji.b bVarU25 = qrScanningScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.di.QrScanningScreenInjector");
                p12.j jVar = (p12.j) ((y32.a) bVarU25).b().mo3808a(qrScanningScreen);
                switch (jVar.f231685a) {
                    case 0:
                        lVar.getClass();
                        jVar.d = lVar;
                        break;
                    default:
                        lVar.getClass();
                        jVar.d = lVar;
                        break;
                }
                return (p12.k) jVar.mo3783build();
            case 17:
                qji.b bVarU26 = ((OnboardingContactSyncNotifyScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.di.OnboardingContactSyncNotifyScreenInjector");
                s3a.d dVar2 = (s3a.d) bVarU26;
                return new s3a.e(dVar2.f259502b, dVar2.f259503c, (OnboardingContactSyncNotifyScreenContract$InputData) obj2);
            case 18:
                UserPermissionSelectorScreen userPermissionSelectorScreen = (UserPermissionSelectorScreen) obj3;
                KProperty[] kPropertyArr8 = UserPermissionSelectorScreen.f89049d0;
                qji.b bVarQ22 = userPermissionSelectorScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.subaccount.impl.ui.create.screen.permission.di.UserPermissionSelectorScreenInjector");
                r6e.e eVar3 = (r6e.e) bVarQ22;
                return new r6e.t(eVar3.f251726b, eVar3.f251727c, userPermissionSelectorScreen, (UserPermissionSelectorScreenContract$InputData) obj2);
            case 19:
                DebtsHubScreen debtsHubScreen = (DebtsHubScreen) obj3;
                KProperty[] kPropertyArr9 = DebtsHubScreen.f67442e0;
                qji.b bVarQ23 = debtsHubScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.di.DebtsHubScreenInjector");
                s4 s4Var = (s4) bVarQ23;
                return new dw3.y1(s4Var.f119751c, s4Var.d, debtsHubScreen, (DebtsHubScreenContract$InputData) obj2);
            case 20:
                MaliciousSoftwarePromptFlowContract$InputData.Default r4 = (MaliciousSoftwarePromptFlowContract$InputData.Default) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((MaliciousSoftwarePromptFlow) obj3).m2()).a().get(w9i.a.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w9i.a.class, " is not found"));
                }
                Object objB = aVar.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature_restricted_access_malware.impl.di.MaliciousSoftwareApiComponent");
                return new w9i.c(((w9i.a) objB).f, r4);
            case 21:
                TravelHotelsRoomsSelectionScreenContract$InputData travelHotelsRoomsSelectionScreenContract$InputData = (TravelHotelsRoomsSelectionScreenContract$InputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((TravelHotelsRoomsSelectionFlow) obj3).m2()).a().get(g9g.d.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new o0(((g9g.d) aVar.b()).L, travelHotelsRoomsSelectionScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", g9g.d.class, " is not found"));
            case 22:
                CancelScreen cancelScreen = (CancelScreen) obj3;
                qji.b bVarQ24 = cancelScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.di.CancelScreenInjector");
                lal.a aVarC = ((oal.a) bVarQ24).c();
                aVarC.d = cancelScreen;
                aVarC.e = (CancelScreenContract$InputData) obj2;
                return (lal.c) aVarC.mo3800build();
            case 23:
                CashTopUpFlowContract$InputData cashTopUpFlowContract$InputData = (CashTopUpFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((CashTopUpFlow) obj3).m2()).a().get(bb3.a.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new mb3.o(((mb3.p) aVar.b()).i, cashTopUpFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
            case 24:
                KProperty[] kPropertyArr10 = CharitiesCollectionDetailsScreen.c0;
                qji.b bVarQ25 = ((CharitiesCollectionDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.di.CollectionDetailsScreenInjector");
                pa6.n nVar = (pa6.n) bVarQ25;
                return new pa6.h(nVar.f234406b, nVar.f234407c, (CharitiesCollectionDetailsScreenContract$InputData) obj2);
            case 25:
                TravelHotelsBedOptionsSelectionScreen travelHotelsBedOptionsSelectionScreen = (TravelHotelsBedOptionsSelectionScreen) obj3;
                TravelHotelsBedOptionsSelectionScreenContract$InputData travelHotelsBedOptionsSelectionScreenContract$InputData = (TravelHotelsBedOptionsSelectionScreenContract$InputData) obj2;
                int i3 = TravelHotelsBedOptionsSelectionScreen.T;
                qji.b bVarU27 = travelHotelsBedOptionsSelectionScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.di.TravelHotelsBedOptionsSelectionScreenInjector");
                s0 s0Var = (s0) ((ybg.a) bVarU27).c().mo3808a(travelHotelsBedOptionsSelectionScreen);
                switch (s0Var.f141809a) {
                    case 0:
                        s0Var.d = travelHotelsBedOptionsSelectionScreenContract$InputData;
                        break;
                    case 1:
                        s0Var.d = travelHotelsBedOptionsSelectionScreenContract$InputData;
                        break;
                    default:
                        s0Var.d = travelHotelsBedOptionsSelectionScreenContract$InputData;
                        break;
                }
                return (t0) s0Var.mo3783build();
            case 26:
                KProperty[] kPropertyArr11 = ImageGalleryLightboxScreen.R;
                qji.b bVarU28 = ((ImageGalleryLightboxScreen) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.image_gallery.screens.lightbox.di.ImageGalleryLightboxScreenInjector");
                return new ud7.d(((ud7.b) bVarU28).d, (ImageGalleryLightboxScreenContract$InputData) obj2);
            case 27:
                RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen = (RevPointsPocketOnboardingScreen) obj3;
                RevPointsPocketOnboardingScreenContract$InputData revPointsPocketOnboardingScreenContract$InputData = (RevPointsPocketOnboardingScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = RevPointsPocketOnboardingScreen.V;
                phm.a aVar16 = (phm.a) ue0.e.j(revPointsPocketOnboardingScreen.m2()).a().get(jdi.c.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return (jdi.j) ((ydi.a) ((ydi.b) aVar.b()).b().mo3808a(revPointsPocketOnboardingScreen)).A(revPointsPocketOnboardingScreenContract$InputData).mo3783build();
                }
                throw new IllegalStateException(a0.d.q("Api ", jdi.c.class, " is not found"));
            case 28:
                ShippingContactsScreen shippingContactsScreen = (ShippingContactsScreen) obj3;
                KProperty[] kPropertyArr13 = ShippingContactsScreen.U;
                qji.b bVarU29 = shippingContactsScreen.U2();
                Intrinsics.i(bVarU29, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.di.ShippingContactsScreenInjector");
                return (bac.g) ((yec.c) ((yec.d) bVarU29).y().mo3808a(shippingContactsScreen)).n((ShippingContactsScreenDescriptor$InputData) obj2).mo3783build();
            default:
                KProperty[] kPropertyArr14 = SharedCompletedAlertsScreen.f86726e0;
                qji.b bVarQ26 = ((SharedCompletedAlertsScreen) obj3).Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreenInjector");
                ned.g gVar = (ned.g) ((ted.a) bVarQ26);
                return new ned.j(gVar.f214455b, gVar.f214456c, (SharedCompletedAlertsScreenContract$InputData) obj2);
        }
    }
}
