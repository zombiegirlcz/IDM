package ltf;

import android.content.Context;
import com.feature.navigation.hub.impl.ui.hub.NavigationHubController;
import com.feature.navigation.hub.impl.ui.hub.NavigationHubControllerContract$InputData;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlow;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreen;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.CreditAddressScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.CreditAddressScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.pse.flow.CreditCardPseRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.pse.flow.CreditCardPseRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreen;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2Controller;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2ControllerContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawContract$InputData;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawScreen;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreen;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreenContract$InputData;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreen;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreenContract$InputData;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreen;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreenContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreen;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.TransferInPriceUpdateFlow;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.TransferInPriceUpdateFlowContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreen;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.documents.ChooseDocumentsScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.statements.impl.costchargesreport.CostChargesController;
import com.youTransactor.uCube.rpc.Constants;
import dw3.t0;
import dw3.u0;
import e48.q;
import hvf.r;
import ip0.xh0;
import java.util.List;
import jm4.a3;
import jm4.f3;
import jm4.v1;
import jm4.v2;
import jm4.x3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kyk.v;
import ly.n;
import ly.o;
import r7d.t;
import skm.e0;
import vkm.z1;
import z0g.p;
import zhm.u;
import zu8.y;
import zu8.z;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f199863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f199864c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f199862a = i;
        this.f199863b = obj2;
        this.f199864c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        o oVar;
        int i = this.f199862a;
        Object obj2 = this.f199864c;
        Object obj3 = this.f199863b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = TransferReasonsReuseDeclarationScreen.Q;
                qji.b bVarU2 = ((TransferReasonsReuseDeclarationScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.di.TransferReasonsReuseDeclarationScreenInjector");
                nsf.d dVar = (nsf.d) bVarU2;
                return new nsf.g(dVar.f218811b, dVar.f218812c, (TransferReasonsReuseDeclarationScreenContract$InputData) obj2);
            case 1:
                RowDelegate.Model model = (RowDelegate.Model) obj3;
                return new wh(model.f53228a, model, u.c(new SwipeToActionDelegate.SwipeAction("ORDERS_MAPPER_SWIPE_ACTION_ID_CANCEL", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.wealth_orders_action_cancel, null, null, 14), xh0.NEGATIVE, null, this.f199864c, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            case 2:
                CreditCardPseRepayFlowContract$InputData creditCardPseRepayFlowContract$InputData = (CreditCardPseRepayFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((CreditCardPseRepayFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new v1(((a3) aVar.b()).Y, creditCardPseRepayFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 3:
                ChooseDocumentsScreen chooseDocumentsScreen = (ChooseDocumentsScreen) obj3;
                int i2 = ChooseDocumentsScreen.U;
                qji.b bVarU22 = chooseDocumentsScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.rfi.impl.ui.documents.di.UploadDocumentsScreenInjector");
                euh.e eVar = (euh.e) bVarU22;
                return new euh.h(eVar.f129583b, eVar.f129584c, chooseDocumentsScreen, (BaseQuestionScreenContract$InputData) obj2);
            case 4:
                AsftCancelBookingScreen asftCancelBookingScreen = (AsftCancelBookingScreen) obj3;
                AsftCancelBookingScreenContract$InputData asftCancelBookingScreenContract$InputData = (AsftCancelBookingScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = AsftCancelBookingScreen.R;
                phm.a aVar3 = (phm.a) ue0.e.j(asftCancelBookingScreen.m2()).a().get(lti.g.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                }
                lti.g gVar = ((lti.g) aVar.b()).o;
                asftCancelBookingScreenContract$InputData.getClass();
                return new lti.c(gVar, asftCancelBookingScreen, asftCancelBookingScreenContract$InputData);
            case 5:
                CreditCardStatementPageScreen creditCardStatementPageScreen = (CreditCardStatementPageScreen) obj3;
                CreditCardStatementPageScreenContract$InputData creditCardStatementPageScreenContract$InputData = (CreditCardStatementPageScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = CreditCardStatementPageScreen.Z;
                phm.a aVar4 = (phm.a) ue0.e.j(creditCardStatementPageScreen.m2()).a().get(a3.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new v2(((a3) aVar.b()).Y, creditCardStatementPageScreen, creditCardStatementPageScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 6:
                IncodeScreen incodeScreen = (IncodeScreen) obj3;
                qji.b bVarU23 = incodeScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.incode.screen.di.IncodeScreenInjector");
                y yVar = (y) bVarU23;
                return new z(yVar.f325413b, yVar.f325414c, incodeScreen, (IncodeScreenContract$InputData) obj2);
            case 7:
                KProperty[] kPropertyArr4 = TransitSectionScreen.f92548d0;
                qji.b bVarQ2 = ((TransitSectionScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.hub.transit_section.di.TransitSectionScreenInjector");
                r rVar = (r) bVarQ2;
                return new hvf.k(rVar.f155951b, rVar.f155952c, (TransitSectionScreenContract$InputData) obj2);
            case 8:
                CameraKitFlow cameraKitFlow = (CameraKitFlow) obj3;
                fv.e eVar2 = (fv.e) obj2;
                gy.a aVar5 = (gy.a) px.b.d(cameraKitFlow.m2()).f240533l.get();
                ly.c cVar = cameraKitFlow.K;
                CameraKitFlowContract$FlowType flow = cVar.f200604a;
                ((gy.c) aVar5).getClass();
                Intrinsics.checkNotNullParameter(flow, "flow");
                if (flow instanceof CameraKitFlowContract$FlowType.QrCode) {
                    oVar = ly.l.f200621a;
                } else if (flow instanceof CameraKitFlowContract$FlowType.ActiveLiveness) {
                    oVar = ly.j.f200619a;
                } else if (flow instanceof CameraKitFlowContract$FlowType.Document) {
                    oVar = ly.k.f200620a;
                } else {
                    if (!(flow instanceof CameraKitFlowContract$FlowType.Selfie)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = gy.b.f147768a[((CameraKitFlowContract$FlowType.Selfie) flow).f50795a.ordinal()];
                    if (i3 == 1) {
                        oVar = ly.m.f200622a;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oVar = n.f200623a;
                    }
                }
                Context applicationContext = cameraKitFlow.m2().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                my.a aVarD = ((my.a) oVar.a(applicationContext).a(cameraKitFlow)).p(oVar).d(cVar);
                Context applicationContext2 = cameraKitFlow.m2().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                return (my.b) aVarD.j(applicationContext2).n().c(eVar2).build();
            case 9:
                KProperty[] kPropertyArr5 = DirectDebitConfirmScreen.Q;
                qji.b bVarU24 = ((DirectDebitConfirmScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.account_confirm_v2.di.DirectDebitConfirmScreenInjector");
                x3 x3Var = (x3) bVarU24;
                return new f3(x3Var.f176438b, x3Var.f176439c, (DirectDebitConfirmScreenContract$InputData) obj2);
            case 10:
                OnboardingOtpDialogScreenContract$InputData onboardingOtpDialogScreenContract$InputData = (OnboardingOtpDialogScreenContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((OnboardingOtpDialogScreen) obj3).m2()).a().get(kyk.y.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", kyk.y.class, " is not found"));
                }
                v vVar = ((v) ((kyk.y) aVar.b())).A;
                onboardingOtpDialogScreenContract$InputData.getClass();
                return new kyk.k(vVar, onboardingOtpDialogScreenContract$InputData);
            case 11:
                TradeRevPointsTransferScreen tradeRevPointsTransferScreen = (TradeRevPointsTransferScreen) obj3;
                KProperty[] kPropertyArr6 = TradeRevPointsTransferScreen.U;
                qji.b bVarU25 = tradeRevPointsTransferScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.di.TradeRevPointsTransferScreenInjector");
                t1f.e eVar3 = (t1f.e) bVarU25;
                return new t1f.l(eVar3.f267288b, eVar3.f267289c, tradeRevPointsTransferScreen, (TradeRevPointsTransferScreenContract$InputData) obj2);
            case 12:
                KProperty[] kPropertyArr7 = TravelExperiencesSearchResultsScreen.i0;
                qji.b bVarQ22 = ((TravelExperiencesSearchResultsScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.search_results.di.TravelExperiencesSearchResultsScreenInjector");
                z0g.f fVar = (z0g.f) bVarQ22;
                return new p(fVar.f318359b, fVar.f318360c, (TravelExperiencesSearchResultsScreenContract$InputData) obj2);
            case 13:
                lk0.g gVar2 = (lk0.g) ((m3g.n) ((com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) obj3).t2()).d.get((oyf.b) obj2);
                return gVar2 != null ? efm.k.g(gVar2) : rfm.h.f253943a;
            case 14:
                CreditAddressScreen creditAddressScreen = (CreditAddressScreen) obj3;
                KProperty[] kPropertyArr8 = CreditAddressScreen.c0;
                qji.b bVarQ23 = creditAddressScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.di.CreditAddressScreenInjector");
                t0 t0Var = (t0) bVarQ23;
                return new u0(t0Var.f119809c, t0Var.d, creditAddressScreen, (CreditAddressScreenContract$InputData) obj2);
            case 15:
                KProperty[] kPropertyArr9 = PaymentMethodScreen.Q;
                qji.b bVarU26 = ((PaymentMethodScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.payment_method.di.PaymentMethodScreenInjector");
                m3c.e eVar4 = (m3c.e) bVarU26;
                return new m3c.i(eVar4.f202332b, eVar4.f202333c, (PaymentMethodScreenContract$InputData) obj2);
            case 16:
                JointWithdrawContract$InputData jointWithdrawContract$InputData = (JointWithdrawContract$InputData) obj2;
                KProperty[] kPropertyArr10 = JointWithdrawScreen.U;
                phm.a aVar7 = (phm.a) ue0.e.j(((JointWithdrawScreen) obj3).m2()).a().get(e48.g.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new q(((e48.g) aVar.b()).z, jointWithdrawContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
            case 17:
                z1 z1VarB = vkm.q.b(0, 6, null);
                e0.C((CoroutineScope) obj3, null, null, new m72.j(z1VarB, (m72.k) obj2, null), 3);
                return z1VarB;
            case 18:
                LoanRefinancedCreditListV2Controller loanRefinancedCreditListV2Controller = (LoanRefinancedCreditListV2Controller) obj3;
                LoanRefinancedCreditListV2ControllerContract$InputData loanRefinancedCreditListV2ControllerContract$InputData = (LoanRefinancedCreditListV2ControllerContract$InputData) obj2;
                KProperty[] kPropertyArr11 = LoanRefinancedCreditListV2Controller.U;
                phm.a aVar8 = (phm.a) ue0.e.j(loanRefinancedCreditListV2Controller.m2()).a().get(u45.h.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new u45.z(((u45.h) aVar.b()).B, loanRefinancedCreditListV2Controller, loanRefinancedCreditListV2ControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 19:
                DeferredPaymentScreen deferredPaymentScreen = (DeferredPaymentScreen) obj3;
                DeferredPaymentScreenContract$InputData deferredPaymentScreenContract$InputData = (DeferredPaymentScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = DeferredPaymentScreen.c0;
                phm.a aVar9 = (phm.a) ue0.e.j(deferredPaymentScreen.m2()).a().get(p7c.r.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new p7c.e(((p7c.r) aVar.b()).D, deferredPaymentScreen, deferredPaymentScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", p7c.r.class, " is not found"));
            case 20:
                PigeonContentScreen pigeonContentScreen = (PigeonContentScreen) obj3;
                KProperty[] kPropertyArr13 = PigeonContentScreen.f86281k0;
                qji.b bVarQ24 = pigeonContentScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.di.PigeonContentScreenInjector");
                t tVar = (t) ((v7d.a) bVarQ24);
                return new r7d.q(tVar.f252174b, tVar.f252175c, new n8d.a(), pigeonContentScreen, (PigeonContentScreenContract$InputData) obj2);
            case 21:
                CardRequestReviewScreen cardRequestReviewScreen = (CardRequestReviewScreen) obj3;
                CardRequestReviewScreen.Companion companion = CardRequestReviewScreen.INSTANCE;
                qji.b bVarQ25 = cardRequestReviewScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.junior.card_request.impl.ui.screen.request_review.di.CardRequestReviewScreenInjector");
                h98.g gVar3 = (h98.g) bVarQ25;
                return new h98.h(gVar3.f150192b, gVar3.f150193c, cardRequestReviewScreen, (CardRequestReviewScreenContract$InputData) obj2);
            case 22:
                CryptoHoldingScreen cryptoHoldingScreen = (CryptoHoldingScreen) obj3;
                io3.d dVar2 = (io3.d) obj2;
                KProperty[] kPropertyArr14 = CryptoHoldingScreen.V;
                phm.a aVar10 = (phm.a) ue0.e.j(cryptoHoldingScreen.m2()).a().get(t7j.a.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new q8j.g(((q8j.c) aVar.b()).M, cryptoHoldingScreen, new CryptoHoldingScreenContract$InputData(dVar2), cryptoHoldingScreen);
                }
                throw new IllegalStateException(a0.d.q("Api ", t7j.a.class, " is not found"));
            case 23:
                og5.d dVar3 = (og5.d) obj2;
                x8j.n nVar = ((com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) obj3).v;
                if (dVar3 instanceof og5.b) {
                    nVar.d3(((og5.b) dVar3).f225033a);
                } else {
                    if (!(dVar3 instanceof og5.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.g3(((og5.c) dVar3).f225034a, false);
                }
                return Unit.f186387a;
            case 24:
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar11 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) obj3;
                fh5.d dVar4 = (fh5.d) obj2;
                if (dVar4 instanceof fh5.b) {
                    aVar11.v.d3(((fh5.b) dVar4).f135148a);
                } else if (!(dVar4 instanceof fh5.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 25:
                KProperty[] kPropertyArr15 = NavigationHubController.R;
                qji.b bVarU27 = ((NavigationHubController) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.feature.navigation.hub.impl.ui.hub.di.NavigationHubControllerInjector");
                ga.c cVar2 = (ga.c) bVarU27;
                return new ga.b(cVar2.f141966b, cVar2.f141967c, (NavigationHubControllerContract$InputData) obj2);
            case 26:
                TransferInPriceUpdateFlowContract$InputData transferInPriceUpdateFlowContract$InputData = (TransferInPriceUpdateFlowContract$InputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((TransferInPriceUpdateFlow) obj3).m2()).a().get(l9f.k.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new l9f.j(((l9f.k) aVar.b()).v, transferInPriceUpdateFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l9f.k.class, " is not found"));
            case 27:
                RecurringDonationScheduleScreen recurringDonationScheduleScreen = (RecurringDonationScheduleScreen) obj3;
                KProperty[] kPropertyArr16 = RecurringDonationScheduleScreen.f0;
                qji.b bVarQ26 = recurringDonationScheduleScreen.Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.di.RecurringDonationScheduleScreenInjector");
                pa6.e eVar5 = (pa6.e) bVarQ26;
                return new pa6.q(eVar5.f234362b, eVar5.f234363c, recurringDonationScheduleScreen, (RecurringDonationScheduleScreenContract$InputData) obj2);
            case 28:
                qji.b bVarU28 = ((IDealStartRegistrationScreen) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.apm.services.ideal.impl.ui.registration.di.IDealStartRegistrationScreenInjector");
                fd2.j jVar = (fd2.j) ((kd2.a) bVarU28);
                return new fd2.l(jVar.f133878b, jVar.f133879c, (IDealStartRegistrationScreenContract$InputData) obj2);
            default:
                mfl.i iVar = (mfl.i) obj2;
                KProperty[] kPropertyArr17 = CostChargesController.R;
                phm.a aVar13 = (phm.a) ue0.e.j(((CostChargesController) obj3).m2()).a().get(rfl.b.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new rfl.a(((rfl.b) aVar.b()).e, iVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", rfl.b.class, " is not found"));
        }
    }
}
