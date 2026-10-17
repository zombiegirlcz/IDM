package l0c;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlowContract$Step;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.bh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreenContract$ModalStep;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeCollectionScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeCollectionScreenContract$PasscodeScreenMode;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeScreen;
import com.revolut.feature.onboarding.impl.onboarding.passcode.flow.PasscodeFlowContract$Step;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreenContract$ModalStep;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreenContract$InputData;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Step;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentInputData;
import com.revolut.feature_retail_user_declarations.credit_consent.flow.CreditConsentFlowContract$Step;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$ModalStep;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreenContract$ModalStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191232b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f191231a = i;
        this.f191232b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        GlobalSearchScreen globalSearchScreen = (GlobalSearchScreen) this.f191232b;
        SmartTileSendMoneyDelegate.Model model = (SmartTileSendMoneyDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        xi0.b bVar = model.f53443b.f10579b.f10549c;
        qd0.b bVar2 = globalSearchScreen.z0;
        if (bVar2 == null) {
            Intrinsics.r("languageProvider");
            throw null;
        }
        u80.d dVar = new u80.d(((s80.b) bVar2).b());
        SmartTileSendMoneyDelegate.Companion aVar = SmartTileSendMoneyDelegate.INSTANCE;
        ihm.f consumer = globalSearchScreen.R;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        return new zp0.d(editText, bVar, dVar, null, new bh(consumer, model), false, false, 0, false, null, 1928);
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) this.f191232b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CryptoEarningScreenContract$ModalStep step = (CryptoEarningScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CryptoEarningScreenContract$ModalStep.StakeRisksDisclaimerDialog) {
            return aVar.e1(new nc5.g(((CryptoEarningScreenContract$ModalStep.StakeRisksDisclaimerDialog) step).f99984a));
        }
        if (step instanceof CryptoEarningScreenContract$ModalStep.StakingLockedBalancesDialog) {
            return aVar.e1(new nc5.e(((CryptoEarningScreenContract$ModalStep.StakingLockedBalancesDialog) step).f99985a));
        }
        if (step instanceof CryptoEarningScreenContract$ModalStep.TiersRateDialog) {
            return aVar.f99992r.a(((CryptoEarningScreenContract$ModalStep.TiersRateDialog) step).f99987a);
        }
        if (step instanceof CryptoEarningScreenContract$ModalStep.StakingRewardsDialog) {
            return aVar.e1(new nc5.f(((CryptoEarningScreenContract$ModalStep.StakingRewardsDialog) step).f99986a));
        }
        if (!(step instanceof CryptoEarningScreenContract$ModalStep.UnstakingPeriodDisclaimerDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        StakingModes.Manual manual = ((CryptoEarningScreenContract$ModalStep.UnstakingPeriodDisclaimerDialog) step).f99988a.f88082b.f88088c.f88071a;
        return aVar.e1(new nc5.h(manual != null ? manual.f88078c : 0));
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) this.f191232b;
        zof.f fVar = aVar.f102369s;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PeerToPeerReviewScreenContract$ModalStep step = (PeerToPeerReviewScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PeerToPeerReviewScreenContract$ModalStep.ReferenceStep) {
            ReferenceScreen referenceScreenB = ((qpf.h) fVar).b(new ReferenceInputData(40, new TextLocalisedClause(R$string.payments_bank_transfer_reference_title, null, null, 14), new TextLocalisedClause(R$string.payments_bank_transfer_reference_input_hint, null, null, 14), ((PeerToPeerReviewScreenContract$ModalStep.ReferenceStep) step).f102363a));
            final int i = 0;
            Function1 function1 = new Function1() { // from class: l9k.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            gpf.a output = (gpf.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            as1.q qVar = new as1.q(output, 2);
                            com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar2 = aVar;
                            aVar2.H2(aVar2.z, new kzc.a(qVar, aVar2, 29));
                            return Unit.f186387a;
                        default:
                            dpf.c output2 = (dpf.c) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof dpf.a)) {
                                if (!(output2 instanceof dpf.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bg2.p pVar = new bg2.p(output2, 8);
                                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar3 = aVar;
                                aVar3.H2(aVar3.z, new kzc.a(pVar, aVar3, 29));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            referenceScreenB.H = function1;
            return referenceScreenB;
        }
        if (!(step instanceof PeerToPeerReviewScreenContract$ModalStep.ScheduleStep)) {
            throw new NoWhenBranchMatchedException();
        }
        PeerToPeerReviewScreenContract$ModalStep.ScheduleStep scheduleStep = (PeerToPeerReviewScreenContract$ModalStep.ScheduleStep) step;
        qpf.h hVar = (qpf.h) fVar;
        ScheduleTransferScreen scheduleTransferScreenD = hVar.d(new ScheduleTransferInputData((TextLocalisedClause) null, scheduleStep.f102365b, scheduleStep.f102364a, (TextLocalisedClause) null, (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8185));
        final int i2 = 1;
        Function1 function12 = new Function1() { // from class: l9k.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        gpf.a output = (gpf.a) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        as1.q qVar = new as1.q(output, 2);
                        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar2 = aVar;
                        aVar2.H2(aVar2.z, new kzc.a(qVar, aVar2, 29));
                        return Unit.f186387a;
                    default:
                        dpf.c output2 = (dpf.c) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (!(output2 instanceof dpf.a)) {
                            if (!(output2 instanceof dpf.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bg2.p pVar = new bg2.p(output2, 8);
                            com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar3 = aVar;
                            aVar3.H2(aVar3.z, new kzc.a(pVar, aVar3, 29));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        scheduleTransferScreenD.H = function12;
        return scheduleTransferScreenD;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.core.backend_flow.impl.internal_flow.e eVar = (com.revolut.core.backend_flow.impl.internal_flow.e) this.f191232b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        InternalBackendFlowContract$Step step = (InternalBackendFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InternalBackendFlowContract$Step.Init) {
            throw new IllegalStateException("Use LazyFlowCoordinator transient state instead (step == null)");
        }
        if (step instanceof InternalBackendFlowContract$Step.Screen) {
            return eVar.K0(((InternalBackendFlowContract$Step.Screen) step).f51244a);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a aVar = (com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) this.f191232b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        JuniorIsaAddPhoneNumberScreenContract$ModalStep step = (JuniorIsaAddPhoneNumberScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof JuniorIsaAddPhoneNumberScreenContract$ModalStep.ChangeCountryCode)) {
            throw new NoWhenBranchMatchedException();
        }
        s7a.x xVar = new s7a.x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, ((JuniorIsaAddPhoneNumberScreenContract$ModalStep.ChangeCountryCode) step).f76770a, null, null, true, null, null, null, null, null, 2138963454);
        Object obj4 = aVar.f76772q.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        PickerController pickerController = new PickerController(xVar, (x7a.d) obj4);
        s block = new s(aVar, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        pickerController.H = block;
        return pickerController;
    }

    private final Object g(Object obj2, Object obj3) {
        lah.e eVar = (lah.e) this.f191232b;
        yki.l FlowCoordinator = (yki.l) obj2;
        CollectDepositInfoFlowContract$Step step = (CollectDepositInfoFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (lah.d.f193398a[step.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        CollectDepositInfoFlowContract$Input collectDepositInfoFlowContract$Input = eVar.o;
        WealthAddMoneyScreen wealthAddMoneyScreen = new WealthAddMoneyScreen(new CompositeAddMoneyScreenContract$Input(collectDepositInfoFlowContract$Input.f95551a, eVar.f193399p, collectDepositInfoFlowContract$Input.f95554g, collectDepositInfoFlowContract$Input.f95553c, collectDepositInfoFlowContract$Input.d, collectDepositInfoFlowContract$Input.f, false, collectDepositInfoFlowContract$Input.e));
        s block = new s(eVar, 28);
        Intrinsics.checkNotNullParameter(block, "block");
        wealthAddMoneyScreen.H = block;
        return wealthAddMoneyScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature_retail_user_declarations.credit_consent.flow.a aVar = (com.revolut.feature_retail_user_declarations.credit_consent.flow.a) this.f191232b;
        yki.l FlowCoordinator = (yki.l) obj2;
        CreditConsentFlowContract$Step step = (CreditConsentFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CreditConsentFlowContract$Step.ApplicationConsent)) {
            throw new NoWhenBranchMatchedException();
        }
        lai.f fVar = aVar.f97546s;
        CreditConsentInputData creditConsentInputData = aVar.o;
        String str = creditConsentInputData.f97539c;
        boolean z = creditConsentInputData.f97538b;
        fVar.getClass();
        Clause clause = null;
        Object[] objArr = 0;
        TextLocalisedClause textLocalisedClause = str != null ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.credit_card_prompt_subtitle, zhm.u.c(new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.credit_card_prompt_subtitle_t_and_cs_apply, null, new Click(30, (Integer) null, (Object) null, "CREDIT_CONSENT_TERMS_LINK", false), 10)), null, 12) : new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.credit_card_prompt_subtitle_no_terms, null, null, 14);
        ResourceImage resourceImage = z ? new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.credit_card_prompt_title, null, null, 14);
        PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo("https://assets.revolut.com/credit/premium/credit_card_prompt_spotlight.mp4", (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 114), clause, objArr == true ? 1 : 0, 6);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.credit_card_prompt_subtitle_actions_apply, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "CREDIT_CONSENT_PRIMARY_BUTTON", 30);
        LargeActionButton.ButtonStyle buttonStyle = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("CREDIT_CONSENT_PROMPT", textLocalisedClause2, textLocalisedClause, fullScreenMediaContent, null, null, resourceImage, null, null, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.credit_card_prompt_subtitle_actions_not_interested, null, null, 14), (ResourceImage) objArr2, buttonStyle, false, "CREDIT_CONSENT_SECONDARY_BUTTON", 30), null, objArr3, buttonStyle, null, null, null, null, null, null, null, 2095536), null, false, false, null, 30));
        s block = new s(aVar, 29);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    private final Object i(Object obj2, Object obj3) {
        laj.d dVar = (laj.d) this.f191232b;
        List cryptos = (List) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(cryptos, "cryptos");
        dVar.f193409b.f("KEY_NEWLY_ADDED_CRYPTO", cryptos);
        return Unit.f186387a;
    }

    private final Object j(Object obj2, Object obj3) {
        com.revolut.feature.onboarding.impl.onboarding.passcode.flow.a aVar = (com.revolut.feature.onboarding.impl.onboarding.passcode.flow.a) this.f191232b;
        yki.l FlowCoordinator = (yki.l) obj2;
        PasscodeFlowContract$Step step = (PasscodeFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PasscodeFlowContract$Step.Creation) {
            PasscodeFlowContract$Step.Creation creation = (PasscodeFlowContract$Step.Creation) step;
            PasscodeCollectionScreenContract$PasscodeScreenMode.Creation creation2 = new PasscodeCollectionScreenContract$PasscodeScreenMode.Creation(creation.f78468a, creation.f78469b);
            PasscodeScreen passcodeScreen = new PasscodeScreen(new PasscodeCollectionScreenContract$InputData(creation2));
            l9k.v block = new l9k.v(aVar, creation2, 5);
            Intrinsics.checkNotNullParameter(block, "block");
            passcodeScreen.H = block;
            return passcodeScreen;
        }
        if (!(step instanceof PasscodeFlowContract$Step.Confirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        PasscodeCollectionScreenContract$PasscodeScreenMode.Confirmation confirmation = new PasscodeCollectionScreenContract$PasscodeScreenMode.Confirmation(((PasscodeFlowContract$Step.Confirmation) step).f78467a);
        PasscodeScreen passcodeScreen2 = new PasscodeScreen(new PasscodeCollectionScreenContract$InputData(confirmation));
        l9k.v block2 = new l9k.v(aVar, confirmation, 5);
        Intrinsics.checkNotNullParameter(block2, "block");
        passcodeScreen2.H = block2;
        return passcodeScreen2;
    }

    private final Object k(Object obj2, Object obj3) {
        com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) this.f191232b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        OrderDetailsScreenContract$ModalStep step = (OrderDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof OrderDetailsScreenContract$ModalStep.AddTracking) {
            AddShippingTrackingScreen addShippingTrackingScreen = new AddShippingTrackingScreen(new AddShippingTrackingScreenContract$InputData(new AddShippingTrackingScreenContract$TrackingRequest.Add(aVar.o.f84619a)));
            l3l.m block = new l3l.m(1, aVar, com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a.class, "handleAddTrackingResult", "handleAddTrackingResult(Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$OutputData;)V", 0, 15);
            Intrinsics.checkNotNullParameter(block, "block");
            addShippingTrackingScreen.H = block;
            return addShippingTrackingScreen;
        }
        if (!(step instanceof OrderDetailsScreenContract$ModalStep.OpenTracking)) {
            if (step instanceof OrderDetailsScreenContract$ModalStep.FlightDetailsDisclaimer) {
                return new ActionsBottomSheetController(((hbc.b) aVar.f84628w).d());
            }
            throw new NoWhenBranchMatchedException();
        }
        ShippingTrackingScreen shippingTrackingScreen = new ShippingTrackingScreen(new ShippingTrackingScreenContract$InputData(aVar.o.f84619a, ((OrderDetailsScreenContract$ModalStep.OpenTracking) step).f84622a));
        l3l.m block2 = new l3l.m(1, aVar, com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a.class, "handleTrackingResult", "handleTrackingResult(Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreenContract$OutputData;)V", 0, 16);
        Intrinsics.checkNotNullParameter(block2, "block");
        shippingTrackingScreen.H = block2;
        return shippingTrackingScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x0cb1  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 3482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0c.v.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ v(x xVar, j jVar) {
        this.f191231a = 0;
        this.f191232b = jVar;
    }
}
