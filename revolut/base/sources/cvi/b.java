package cvi;

import android.app.Activity;
import androidx.compose.animation.core.AnimateAsStateKt;
import aw0.o9;
import com.google.android.gms.wallet.Wallet;
import com.google.firebase.messaging.t;
import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimStatusNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.status.ApmAliasClaimStatusScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowController;
import com.revolut.feature.crypto.exchange.fees.impl.ui.learnmore.CryptoExchangeFeesLearnMoreBottomSheet;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsControllerContract$InputData;
import com.revolut.feature.customer_present.tips.api.navigation.CustomerPresentTipsFlowDescriptor$InputData;
import com.revolut.feature.customer_present.tips.impl.flow.tips.CustomerPresentTipsFlow;
import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlow;
import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreenContract$InputData;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreen;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreenContract$Input;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidget;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreen;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreenContract$InputData;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreen;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlow;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsScreenContract$Configuration;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsController;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsControllerContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperiencesQuestionsScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary.TravelFlightsItineraryScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary.TravelFlightsItineraryScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.TravelHotelsRoomsSelectionBookingScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.TravelHotelsRoomsSelectionBookingScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$InputData;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow.JuniorUpgradeFlow;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow.JuniorUpgradeFlowContract$InputData;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import cul.n0;
import f4g.p;
import g9g.e0;
import g9g.h0;
import g9g.p0;
import grl.t9;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lu7.s;
import lu7.w;
import ned.m;
import org.jmrtd.lds.LDSFile;
import ove.b0;
import ove.c0;
import ove.d0;
import p12.q;
import p12.v;
import r5b.r;
import r6e.o;
import ukm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109465c;

    public /* synthetic */ b(d8b.k kVar, String str, CobrandedCardsWidget cobrandedCardsWidget) {
        this.f109463a = 20;
        this.f109464b = str;
        this.f109465c = cobrandedCardsWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        TextClause textClause;
        int i = this.f109463a;
        int i2 = 0;
        Object obj2 = this.f109465c;
        Object obj3 = this.f109464b;
        switch (i) {
            case 0:
                AsftNumberOfTravelersPickerScreen asftNumberOfTravelersPickerScreen = (AsftNumberOfTravelersPickerScreen) obj3;
                KProperty[] kPropertyArr = AsftNumberOfTravelersPickerScreen.R;
                qji.b bVarU2 = asftNumberOfTravelersPickerScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.di.AsftNumberOfTravelersPickerScreenInjector");
                lti.k kVar = (lti.k) bVarU2;
                return new lti.i(kVar.f199922a, kVar.f199923b, asftNumberOfTravelersPickerScreen, (AsftNumberOfTravelersPickerScreenContract$InputData) obj2);
            case 1:
                SchemeInsuranceDetailsScreen schemeInsuranceDetailsScreen = (SchemeInsuranceDetailsScreen) obj3;
                SchemeInsuranceDetailsScreenContract$InputData schemeInsuranceDetailsScreenContract$InputData = (SchemeInsuranceDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = SchemeInsuranceDetailsScreen.S;
                phm.a aVar2 = (phm.a) ue0.e.j(schemeInsuranceDetailsScreen.m2()).a().get(s.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new w(((s) aVar.b()).o, schemeInsuranceDetailsScreen, schemeInsuranceDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
            case 2:
                CheckoutScreenContract$InputData checkoutScreenContract$InputData = (CheckoutScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = CheckoutTopupScreen.Y;
                qji.b bVarU22 = ((CheckoutTopupScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.di.CheckoutScreenComponent.Injector");
                b0 b0Var = (b0) bVarU22;
                d0 d0Var = b0Var.f230032c;
                b0 b0Var2 = b0Var.d;
                checkoutScreenContract$InputData.getClass();
                return new c0(d0Var, b0Var2, checkoutScreenContract$InputData);
            case 3:
                CryptoCollectionDetailsController cryptoCollectionDetailsController = (CryptoCollectionDetailsController) obj3;
                CryptoCollectionDetailsControllerContract$InputData cryptoCollectionDetailsControllerContract$InputData = (CryptoCollectionDetailsControllerContract$InputData) obj2;
                KProperty[] kPropertyArr4 = CryptoCollectionDetailsController.U;
                phm.a aVar3 = (phm.a) ue0.e.j(cryptoCollectionDetailsController.m2()).a().get(mw5.l.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new mw5.f(((mw5.l) aVar.b()).f209388x, cryptoCollectionDetailsController, cryptoCollectionDetailsControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
            case 4:
                JuniorUpgradeFlowContract$InputData juniorUpgradeFlowContract$InputData = (JuniorUpgradeFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((JuniorUpgradeFlow) obj3).m2()).a().get(yxj.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new yxj.b(((yxj.a) aVar.b()).f317704b, juniorUpgradeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", yxj.a.class, " is not found"));
            case 5:
                RewardDetailsScreenContract$Input rewardDetailsScreenContract$Input = (RewardDetailsScreenContract$Input) obj2;
                KProperty[] kPropertyArr5 = RewardDetailsScreen.Q;
                phm.a aVar5 = (phm.a) ue0.e.j(((RewardDetailsScreen) obj3).m2()).a().get(eya.j.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", eya.j.class, " is not found"));
                }
                eya.j jVar = ((eya.j) aVar.b()).f130644n;
                rewardDetailsScreenContract$Input.getClass();
                return new eya.h(jVar, rewardDetailsScreenContract$Input);
            case 6:
                CustomerPresentTipsFlowDescriptor$InputData customerPresentTipsFlowDescriptor$InputData = (CustomerPresentTipsFlowDescriptor$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((CustomerPresentTipsFlow) obj3).m2()).a().get(c06.c.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
                }
                c06.c cVar = ((c06.c) aVar.b()).f20175c;
                customerPresentTipsFlowDescriptor$InputData.getClass();
                return new c06.d(cVar, customerPresentTipsFlowDescriptor$InputData);
            case 7:
                return ((t) obj3).f(new n0((d08.b) obj2, 25));
            case 8:
                ni0.k kVar2 = ((d0f.a) obj3).f110356b;
                Wallet.WalletOptions.Builder internal = new Wallet.WalletOptions.Builder();
                Intrinsics.checkNotNullParameter(internal, "<this>");
                Intrinsics.checkNotNullParameter(internal, "internal");
                internal.setEnvironment(1);
                Wallet.WalletOptions walletOptionsBuild = internal.build();
                Intrinsics.checkNotNullExpressionValue(walletOptionsBuild, "build(...)");
                Intrinsics.checkNotNullParameter(walletOptionsBuild, "<this>");
                return kVar2.a((Activity) obj2, new ni0.c(walletOptionsBuild));
            case 9:
                return AnimateAsStateKt.animateValueAsState$lambda$7$0((u) obj3, obj2);
            case 10:
                ApmAliasClaimStatusNavigation$InputData apmAliasClaimStatusNavigation$InputData = (ApmAliasClaimStatusNavigation$InputData) obj2;
                KProperty[] kPropertyArr6 = ApmAliasClaimStatusScreen.Q;
                phm.a aVar7 = (phm.a) ue0.e.j(((ApmAliasClaimStatusScreen) obj3).m2()).a().get(v.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                }
                v vVar = ((v) aVar.b()).K;
                apmAliasClaimStatusNavigation$InputData.getClass();
                return new q(vVar, apmAliasClaimStatusNavigation$InputData);
            case 11:
                KProperty[] kPropertyArr7 = TravelExperiencesDestinationDiscoveryScreen.U;
                qji.b bVarU23 = ((TravelExperiencesDestinationDiscoveryScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.discovery.di.TravelExperiencesDestinationDiscoveryScreenInjector");
                z0g.f fVar = (z0g.f) bVarU23;
                return new z0g.h(fVar.f318359b, fVar.f318360c, (TravelExperiencesDestinationDiscoveryScreenContract$InputData) obj2);
            case 12:
                CurrencyChooserFlowDestination.InputData inputData = (CurrencyChooserFlowDestination.InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((CurrencyChooserFlow) obj3).m2()).a().get(g2j.f.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", g2j.f.class, " is not found"));
                }
                g2j.f fVar2 = ((g2j.f) aVar.b()).J;
                inputData.getClass();
                return new g2j.h(fVar2, inputData);
            case 13:
                TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = (TravelExperienceQuestionsScreen) obj3;
                KProperty[] kPropertyArr8 = TravelExperienceQuestionsScreen.i0;
                qji.b bVarQ2 = travelExperienceQuestionsScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.questions.di.TravelExperiencesVisitorsDetailsScreenInjector");
                z0g.f fVar3 = (z0g.f) bVarQ2;
                return new z0g.s(fVar3.f318359b, fVar3.f318360c, travelExperienceQuestionsScreen, (TravelExperiencesQuestionsScreenContract$InputData) obj2);
            case 14:
                h3g.a aVar9 = (h3g.a) obj2;
                ((com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) obj3).getClass();
                return new TravelExperiencesBookingPrerequisiteQuestion(aVar9.f149114a.b(), aVar9.f149114a.f92762b);
            case 15:
                DeliveryAddressScreen.a aVar10 = DeliveryAddressScreen.Companion;
                qji.b bVarU24 = ((DeliveryAddressScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.di.DeliveryAddressScreenInjector");
                m3c.e eVar = (m3c.e) bVarU24;
                return new m3c.b(eVar.f202332b, eVar.f202333c, (DeliveryAddressScreenContract$InputData) obj2);
            case 16:
                KProperty[] kPropertyArr9 = TravelFlightsItineraryScreen.T;
                qji.b bVarU25 = ((TravelFlightsItineraryScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.itinerary.di.TravelFlightsItineraryScreenInjector");
                p pVar = (p) bVarU25;
                return new f4g.s(pVar.f132168b, pVar.f132169c, (TravelFlightsItineraryScreenContract$InputData) obj2);
            case 17:
                ConsentPromptScreen consentPromptScreen = (ConsentPromptScreen) obj3;
                qji.b bVarQ22 = consentPromptScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.di.ConsentPromptScreenInjector");
                a7d.c cVar2 = (a7d.c) bVarQ22;
                return new a7d.d(cVar2.f1842b, cVar2.f1843c, consentPromptScreen, (ConsentPromptScreenContract$InputData) obj2);
            case 18:
                CommodityOrderEditScreen commodityOrderEditScreen = (CommodityOrderEditScreen) obj3;
                KProperty[] kPropertyArr10 = CommodityOrderEditScreen.W;
                qji.b bVarU26 = commodityOrderEditScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.di.CommodityOrderEditScreenInjector");
                r6j.d dVar = (r6j.d) bVarU26;
                return new r6j.b(dVar.f251895b, dVar.f251896c, commodityOrderEditScreen, (CommodityOrderEditScreenContract$InputData) obj2);
            case 19:
                return new u45.c0(czi.c.o(((LoanRepaymentFlowController) obj3).m2()).B, (LoanRepaymentFlowContract$InputData) obj2);
            case 20:
                String widgetId = (String) obj3;
                CobrandedCardsWidget widget = (CobrandedCardsWidget) obj2;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(widget, "widget");
                w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.DATA, AnalyticsContext.INSTANCE);
                i = widget.f82488c != r.WARNING ? 0 : 1;
                TextClause textClause2 = i != 0 ? null : new TextClause(widget.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (i != 0) {
                    textClause = new TextClause(widget.d, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                } else {
                    String str = widget.e;
                    textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                }
                return new AvatarWidgetDelegate.Model(widgetId, new UrlImage(widget.f82487b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), null, null, false, false, 507902), textClause2, textClause, null, null, null, null, i != 0 ? new WarningCircleBadge(dw0.a.Suspicious) : null, new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)), new AnalyticsContext(w0VarE), 1952);
            case 21:
                BillsEditFlow billsEditFlow = (BillsEditFlow) obj3;
                BillsEditFlowContract$InputData billsEditFlowContract$InputData = (BillsEditFlowContract$InputData) obj2;
                phm.a aVar11 = (phm.a) ue0.e.j(billsEditFlow.m2()).a().get(o.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new r6e.d(((o) aVar.b()).K, billsEditFlow, billsEditFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 22:
                HiddenAccountsFlowContract$InputData hiddenAccountsFlowContract$InputData = (HiddenAccountsFlowContract$InputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((HiddenAccountsFlow) obj3).m2()).a().get(ta7.d.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new ta7.e(((ta7.d) aVar.b()).f269122g, hiddenAccountsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ta7.d.class, " is not found"));
            case 23:
                SubscriptionDetailsController subscriptionDetailsController = (SubscriptionDetailsController) obj3;
                SubscriptionDetailsControllerContract$InputData subscriptionDetailsControllerContract$InputData = (SubscriptionDetailsControllerContract$InputData) obj2;
                KProperty[] kPropertyArr11 = SubscriptionDetailsController.j0;
                phm.a aVar13 = (phm.a) ue0.e.j(subscriptionDetailsController.m2()).a().get(f9e.a.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new i9e.q(((i9e.o) aVar.b()).G, subscriptionDetailsController, subscriptionDetailsControllerContract$InputData, new SubscriptionDetailsScreenContract$Configuration(subscriptionDetailsControllerContract$InputData.f89248b, subscriptionDetailsControllerContract$InputData.f89247a, subscriptionDetailsControllerContract$InputData.f89249c));
                }
                throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
            case 24:
                PasscodeScreen passcodeScreen = (PasscodeScreen) obj3;
                PasscodeScreenContract$InputData passcodeScreenContract$InputData = (PasscodeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = PasscodeScreen.c0;
                qji.b bVarQ23 = passcodeScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.passcode.di.PasscodeScreenInjector");
                he9.f fVarB = ((he9.k) bVarQ23).b();
                switch (fVarB.f151614a) {
                    case 0:
                        fVarB.f151616c = passcodeScreenContract$InputData;
                        break;
                    case 1:
                        fVarB.f151616c = passcodeScreenContract$InputData;
                        break;
                    case 2:
                        fVarB.f151616c = passcodeScreenContract$InputData;
                        break;
                    case 3:
                        fVarB.f151616c = passcodeScreenContract$InputData;
                        break;
                    case 4:
                        fVarB.f151616c = passcodeScreenContract$InputData;
                        break;
                    case 5:
                        fVarB.f151616c = passcodeScreenContract$InputData;
                        break;
                    default:
                        fVarB.f151616c = passcodeScreenContract$InputData;
                        break;
                }
                return (he9.j) ((he9.f) fVarB.S(passcodeScreen)).mo3800build();
            case 25:
                InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen = (InboundSwiftTransferStatusScreen) obj3;
                InboundSwiftTransferStatusScreenContract$InputData inboundSwiftTransferStatusScreenContract$InputData = (InboundSwiftTransferStatusScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = InboundSwiftTransferStatusScreen.S;
                phm.a aVar14 = (phm.a) ue0.e.j(inboundSwiftTransferStatusScreen.m2()).a().get(tce.a.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                }
                rde.h hVar = ((rde.h) aVar.b()).k;
                inboundSwiftTransferStatusScreen.m2().getClass();
                return new rde.c(hVar, inboundSwiftTransferStatusScreenContract$InputData);
            case 26:
                KProperty[] kPropertyArr14 = TravelHotelsRoomsSelectionBookingScreen.Q;
                qji.b bVarU27 = ((TravelHotelsRoomsSelectionBookingScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.di.TravelHotelsRoomsSelectionBookingScreenInjector");
                g9g.d dVar2 = ((p0) bVarU27).f141776b;
                ((TravelHotelsRoomsSelectionBookingScreenContract$InputData) obj2).getClass();
                h0 h0Var = new h0();
                h0Var.f141684a = e4m.b.b(new e0(dVar2, h0Var, i, i));
                h0Var.f141685b = e4m.b.b(new e0(dVar2, h0Var, i2, i));
                h0Var.f141686c = e4m.b.b(new e0(dVar2, h0Var, 2, i));
                return h0Var;
            case 27:
                TravelHotelsTravellerInformationEditScreenContract$InputData travelHotelsTravellerInformationEditScreenContract$InputData = (TravelHotelsTravellerInformationEditScreenContract$InputData) obj2;
                KProperty[] kPropertyArr15 = TravelHotelsTravellerInformationEditScreen.Q;
                qji.b bVarU28 = ((TravelHotelsTravellerInformationEditScreen) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.di.TravelHotelsTravellerInformationEditScreenInjector");
                g9g.t tVar = (g9g.t) bVarU28;
                g9g.d dVar3 = tVar.f141813b;
                g9g.t tVar2 = tVar.f141814c;
                travelHotelsTravellerInformationEditScreenContract$InputData.getClass();
                return new g9g.n0(dVar3, tVar2, travelHotelsTravellerInformationEditScreenContract$InputData);
            case 28:
                String str2 = (String) obj2;
                int i3 = CryptoExchangeFeesLearnMoreBottomSheet.U;
                phm.a aVar15 = (phm.a) ue0.e.j(((CryptoExchangeFeesLearnMoreBottomSheet) obj3).m2()).a().get(tf5.e.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new tf5.i(((tf5.e) aVar.b()).o, str2);
                }
                throw new IllegalStateException(a0.d.q("Api ", tf5.e.class, " is not found"));
            default:
                qji.b bVarQ24 = ((SharedFavouritesInitScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreenInjector");
                ned.g gVar = (ned.g) ((ted.a) bVarQ24);
                return new m(gVar.f214455b, gVar.f214456c, (SharedFavouritesInitScreenContract$InputData) obj2);
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f109463a = i;
        this.f109464b = obj2;
        this.f109465c = obj3;
    }
}
