package k8e;

import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlow;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$InputData;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlow;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$InputData;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListItemDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatQuickLinkBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatVoiceMessageBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ShimmeringTextBubbleDelegate;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreen;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreenContract$InputData;
import com.revolut.feature.apm.upi.impl.qr.screens.amount.InputAmountScreen;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreenContract$InputData;
import com.revolut.feature.crypto.locked.balance.api.navigation.ExcludedLockedBalancesInputData;
import com.revolut.feature.crypto.locked.balance.impl.ui.excluded_locked_balances.ExcludedLockedBalancesScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import com.revolut.feature.junior.card_request.impl.ui.flow.request_review.CardRequestReviewFlow;
import com.revolut.feature.junior.card_request.impl.ui.flow.request_review.CardRequestReviewFlowContract$InputData;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlow;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlow;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlowContract$InputData;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlow;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.TripsEditOptionsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.TripsEditOptionsController;
import com.revolut.feature.subaccount.impl.ui.invite.flow.VaultInviteFlow;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreen;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreenContract$InputData;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.PriceTargetsDetailsFlow;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.PriceTargetsDetailsFlowContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreenContract$InputData;
import dmc.r;
import fa0.k;
import fma.c0;
import h98.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ppd.b1;
import ppd.c1;
import q7k.j;
import ql7.a1;
import ql7.n;
import r6e.o;
import r6e.w;
import ufg.l;
import ufg.t;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f182131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182132c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f182130a = i;
        this.f182131b = obj2;
        this.f182132c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f182130a;
        Object obj2 = this.f182132c;
        Object obj3 = this.f182131b;
        switch (i) {
            case 0:
                d dVar = (d) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((VaultInviteFlow) obj3).m2()).a().get(o.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new w(((o) aVar.b()).K, dVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 1:
                TravelHotelTransfersHomeScreenContract$InputData travelHotelTransfersHomeScreenContract$InputData = (TravelHotelTransfersHomeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = TravelHotelTransfersHomeScreen.V;
                phm.a aVar3 = (phm.a) ue0.e.j(((TravelHotelTransfersHomeScreen) obj3).m2()).a().get(i8g.a.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new i8g.b(((i8g.a) aVar.b()).f, travelHotelTransfersHomeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", i8g.a.class, " is not found"));
            case 2:
                PaymentLinkQrScreenContract$InputData paymentLinkQrScreenContract$InputData = (PaymentLinkQrScreenContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((PaymentLinkQrScreen) obj3).m2()).a().get(f7k.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new q7k.h(((j) aVar.b()).G, paymentLinkQrScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
            case 3:
                CardRequestReviewFlowContract$InputData cardRequestReviewFlowContract$InputData = (CardRequestReviewFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((CardRequestReviewFlow) obj3).m2()).a().get(f98.a.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new h98.g(((i) aVar.b()).k, cardRequestReviewFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f98.a.class, " is not found"));
            case 4:
                AcceptConditionsScreenContract$InputData acceptConditionsScreenContract$InputData = (AcceptConditionsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = AcceptConditionsScreen.f89166a0;
                qji.b bVarQ2 = ((AcceptConditionsScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.di.AcceptConditionsScreenInjector");
                i9e.h hVar = (i9e.h) bVarQ2;
                i9e.o oVar = hVar.f159679b;
                i9e.h hVar2 = hVar.f159680c;
                acceptConditionsScreenContract$InputData.getClass();
                return new i9e.g(oVar, hVar2, acceptConditionsScreenContract$InputData);
            case 5:
                NavigationHubFlow navigationHubFlow = (NavigationHubFlow) obj3;
                NavigationHubFlowContract$InputData navigationHubFlowContract$InputData = (NavigationHubFlowContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(navigationHubFlow.m2()).a().get(ga.a.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new ga.c(((ga.a) aVar.b()).f141959h, navigationHubFlow, navigationHubFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ga.a.class, " is not found"));
            case 6:
                FormPermissionFlowContract$InputData formPermissionFlowContract$InputData = (FormPermissionFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((FormPermissionFlow) obj3).m2()).a().get(k.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new fa0.f(((k) aVar.b()).f133106j, formPermissionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
            case 7:
                CashbackPocketDetailsScreen cashbackPocketDetailsScreen = (CashbackPocketDetailsScreen) obj3;
                KProperty[] kPropertyArr3 = CashbackPocketDetailsScreen.g0;
                qji.b bVarQ22 = cashbackPocketDetailsScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.pocket.details.di.CashbackPocketDetailsScreenInjector");
                yc3.h hVar3 = (yc3.h) bVarQ22;
                return new yc3.b(hVar3.f312486b, hVar3.f312487c, cashbackPocketDetailsScreen, (CashbackPocketDetailsScreenContract$InputData) obj2);
            case 8:
                PriceTargetsDetailsFlowContract$InputData priceTargetsDetailsFlowContract$InputData = (PriceTargetsDetailsFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((PriceTargetsDetailsFlow) obj3).m2()).a().get(fdj.a.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new fdj.b(((fdj.a) aVar.b()).i, priceTargetsDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fdj.a.class, " is not found"));
            case 9:
                SwishConfirmationScreenContract$InputData swishConfirmationScreenContract$InputData = (SwishConfirmationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = SwishConfirmationScreen.Q;
                phm.a aVar9 = (phm.a) ue0.e.j(((SwishConfirmationScreen) obj3).m2()).a().get(he2.c.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new he2.d(((he2.c) aVar.b()).f151532h, swishConfirmationScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", he2.c.class, " is not found"));
            case 10:
                BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow = (BiometricPasscodeVerificationFlow) obj3;
                BiometricPasscodeVerificationFlowContract$InputData biometricPasscodeVerificationFlowContract$InputData = (BiometricPasscodeVerificationFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(biometricPasscodeVerificationFlow.m2()).a().get(he9.e.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new he9.d(((he9.e) aVar.b()).f, biometricPasscodeVerificationFlow, biometricPasscodeVerificationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", he9.e.class, " is not found"));
            case 11:
                kg2.e eVar = (kg2.e) obj2;
                InputAmountScreen.Companion aVar11 = InputAmountScreen.INSTANCE;
                phm.a aVar12 = (phm.a) ue0.e.j(((InputAmountScreen) obj3).m2()).a().get(if2.f.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new if2.c(((if2.f) aVar.b()).f160865w, eVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
            case 12:
                ExcludedLockedBalancesInputData excludedLockedBalancesInputData = (ExcludedLockedBalancesInputData) obj2;
                int i2 = ExcludedLockedBalancesScreen.V;
                phm.a aVar13 = (phm.a) ue0.e.j(((ExcludedLockedBalancesScreen) obj3).m2()).a().get(hh5.b.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", hh5.b.class, " is not found"));
                }
                hh5.b bVar = ((hh5.b) aVar.b()).f152255b;
                excludedLockedBalancesInputData.getClass();
                hh5.c cVar = new hh5.c();
                cVar.f152257a = e4m.b.b(new gp8.c(bVar, 27));
                return cVar;
            case 13:
                KProperty[] kPropertyArr5 = TravelMilesFlightSearchResultDetailsScreen.X;
                qji.b bVarU2 = ((TravelMilesFlightSearchResultDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.di.TravelMilesFlightSearchResultDetailsScreenInjector");
                t tVar = (t) bVarU2;
                return new l(tVar.f279793b, tVar.f279794c, (TravelMilesFlightSearchResultDetailsScreenContract$InputData) obj2);
            case 14:
                knm.b.j(((com.revolut.feature.rewards.impl.ui.details.flow.b) obj3).l1(), new ExternalDestination.Browser(((RewardFooterAction.OpenUrl) ((RewardFooterAction) obj2)).f84859a, null));
                return Unit.f186387a;
            case 15:
                lbm.l lVar = (lbm.l) obj3;
                final kj0.d dVar2 = (kj0.d) obj2;
                lVar.f193734c.c(pbm.d.class.getName(), new mbm.a() { // from class: kj0.i
                    @Override // mbm.a
                    public final void a(Object obj4) {
                        Object obj5 = ((pbm.d) obj4).f234753a;
                        Intrinsics.checkNotNullExpressionValue(obj5, "getAddedEntry(...)");
                        cj9.c.c((lbm.j) obj5, dVar2);
                    }
                });
                return lVar;
            case 16:
                com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar2 = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) obj3;
                cVar2.n2(new k0g.b(obj2, (Object) cVar2, false, (Continuation) null, 27), new whi.b(6));
                return Unit.f186387a;
            case 17:
                Function0 function0 = (Function0) obj2;
                if (((com.revolut.feature.product.lifecycle.flow.a) obj3).f81212s.d() == null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 18:
                OnboardingFlowContract$Input onboardingFlowContract$Input = (OnboardingFlowContract$Input) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((OnboardingFlow) obj3).m2()).a().get(r.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new dmc.i(((r) aVar.b()).f116039s, onboardingFlowContract$Input);
                }
                throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
            case 19:
                ((kmi.g) obj3).f185894a.unregisterReceiver((c49.c) obj2);
                return Unit.f186387a;
            case 20:
                DocumentsFlowContract$InputData documentsFlowContract$InputData = (DocumentsFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((DocumentsFlow) obj3).m2()).a().get(pla.b.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new fma.w(((c0) aVar.b()).G0, documentsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
            case 21:
                AddressPickerScreen addressPickerScreen = (AddressPickerScreen) obj3;
                KProperty[] kPropertyArr6 = AddressPickerScreen.f75543d0;
                qji.b bVarQ23 = addressPickerScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.di.AddressPickerScreenInjector");
                n nVar = (n) bVarQ23;
                return new ql7.f(nVar.f247399b, nVar.f247400c, addressPickerScreen, (AddressPickerScreenContract$InputData) obj2);
            case 22:
                KProperty[] kPropertyArr7 = TripsEditOptionsController.Q;
                qji.b bVarU22 = ((TripsEditOptionsController) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.di.TripsEditOptionsScreenInjector");
                c1 c1Var = (c1) bVarU22;
                return new b1(c1Var.f238386b, c1Var.f238387c, (TripsEditOptionsContract$InputData) obj2);
            case 23:
                ((ChatAttachmentListItemDelegate) obj3).d.onNext((ChatAttachmentListBubbleDelegate.AttachmentItem) obj2);
                return Unit.f186387a;
            case 24:
                ((ChatQuickLinkBubbleDelegate) obj3).k.onNext((ChatQuickLinkBubbleDelegate.Model) obj2);
                return Unit.f186387a;
            case 25:
                ((ChatSmartTileSendMoneyDelegate) obj3).k.b((ChatSmartTileSendMoneyDelegate.Model) obj2);
                return Unit.f186387a;
            case 26:
                ((ChatTableDelegate) obj3).e.onNext((ChatTableDelegate.Model) obj2);
                return Unit.f186387a;
            case 27:
                ((ChatVoiceMessageBubbleDelegate) obj3).f53927l.onNext((ChatVoiceMessageBubbleDelegate.Model) obj2);
                return Unit.f186387a;
            case 28:
                ((ShimmeringTextBubbleDelegate) obj3).k.onNext((ShimmeringTextBubbleDelegate.Model) obj2);
                return Unit.f186387a;
            default:
                MotorPlanSelectorScreen motorPlanSelectorScreen = (MotorPlanSelectorScreen) obj3;
                KProperty[] kPropertyArr8 = MotorPlanSelectorScreen.i0;
                qji.b bVarQ24 = motorPlanSelectorScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.di.MotorPlanSelectorScreenInjector");
                n nVar2 = (n) bVarQ24;
                return new a1(nVar2.f247399b, nVar2.f247400c, motorPlanSelectorScreen, (MotorPlanSelectorScreenContract$InputData) obj2);
        }
    }
}
