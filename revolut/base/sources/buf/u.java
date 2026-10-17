package buf;

import com.revolut.camerakit.validators.config.DocClassifierConfig;
import com.revolut.camerakit.validators.config.DocImageQualityValidatorConfig;
import com.revolut.camerakit.validators.config.DocumentFitFourCornerConfig;
import com.revolut.camerakit.validators.config.FaceQualityValidatorConfig;
import com.revolut.camerakit.vision_framework.common.DocQualityMapperKt;
import com.revolut.camerakit.vision_framework.generated.DocClassifier;
import com.revolut.camerakit.vision_framework.generated.DocCorners;
import com.revolut.camerakit.vision_framework.generated.DocImageQuality;
import com.revolut.camerakit.vision_framework.generated.FaceImageQualityConfig;
import com.revolut.camerakit.vision_framework.generated.FaceImageQualityThreasholds;
import com.revolut.camerakit.vision_framework.generated.FaceValidatorWrapper;
import com.revolut.core.ui_kit.storiesdelegates.CircleProgressStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.CircleProgressStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.MultibarStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.MultibarStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.SimpleStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.SimpleStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesPageDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate.SelectTaxRateScreen;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlow;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreen;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationControllerContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.CryptoCommodityBuyCollectionAmountScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreen;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreen;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlow;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlowContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreenContract$InputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreenContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.question.QuestionScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.question.QuestionScreenContract$InputData;
import dw3.p8;
import dw3.r8;
import java.io.File;
import jm4.j2;
import jm4.k2;
import jm4.p2;
import jm4.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.BERTags;
import us6.v1;
import us6.w1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18839c;

    public /* synthetic */ u(Object obj2, Object obj3, int i) {
        this.f18837a = i;
        this.f18838b = obj2;
        this.f18839c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws InterruptedException {
        b60.a aVar;
        String modelPath;
        String modelPath2;
        String modelPath3;
        String modelPath4;
        int i = this.f18837a;
        Object obj2 = this.f18839c;
        Object obj3 = this.f18838b;
        switch (i) {
            case 0:
                ManualTransferScreen manualTransferScreen = (ManualTransferScreen) obj3;
                ManualTransferContract$InputData manualTransferContract$InputData = (ManualTransferContract$InputData) obj2;
                KProperty[] kPropertyArr = ManualTransferScreen.f92464k0;
                qji.b bVarQ2 = manualTransferScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.di.ManualTransferScreenInjector");
                ytf.b bVar = (ytf.b) bVarQ2;
                ytf.e eVar = bVar.f316725b;
                ytf.b bVar2 = bVar.f316726c;
                manualTransferContract$InputData.getClass();
                return new ytf.d(eVar, bVar2, manualTransferScreen, manualTransferContract$InputData);
            case 1:
                KProperty[] kPropertyArr2 = CreditCardSettingsScreen.S;
                qji.b bVarU2 = ((CreditCardSettingsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.settings.screen.di.CreditCardSettingsScreenInjector");
                j2 j2Var = (j2) bVarU2;
                return new k2(j2Var.f176153b, j2Var.f176154c, (CreditCardSettingsScreenContract$InputData) obj2);
            case 2:
                RevPointsBuyingControllerScreenContract$InputData revPointsBuyingControllerScreenContract$InputData = (RevPointsBuyingControllerScreenContract$InputData) obj2;
                int i2 = RevPointsBuyingControllerScreen.X;
                phm.a aVar2 = (phm.a) ue0.e.j(((RevPointsBuyingControllerScreen) obj3).m2()).a().get(vub.a.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new vub.b(((vub.a) aVar.b()).i, revPointsBuyingControllerScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vub.a.class, " is not found"));
            case 3:
                CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen = (CreditCardStatementFinancingConfirmationScreen) obj3;
                KProperty[] kPropertyArr3 = CreditCardStatementFinancingConfirmationScreen.V;
                qji.b bVarU22 = creditCardStatementFinancingConfirmationScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.di.CreditCardStatementFinancingConfirmationScreenInjector");
                r2 r2Var = (r2) bVarU22;
                return new p2(r2Var.f176313b, r2Var.f176314c, creditCardStatementFinancingConfirmationScreen, (CreditCardStatementFinancingConfirmationScreenContract$InputData) obj2);
            case 4:
                FreelancerAddNotesScreenContract$InputData freelancerAddNotesScreenContract$InputData = (FreelancerAddNotesScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = FreelancerAddNotesScreen.T;
                phm.a aVar3 = (phm.a) ue0.e.j(((FreelancerAddNotesScreen) obj3).m2()).a().get(us6.q.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new us6.p(((us6.q) aVar.b()).Q, freelancerAddNotesScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
            case 5:
                TransportHubFlowContract$InputData transportHubFlowContract$InputData = (TransportHubFlowContract$InputData) obj2;
                KProperty[] kPropertyArr5 = TransportHubFlow.X;
                phm.a aVar4 = (phm.a) ue0.e.j(((TransportHubFlow) obj3).m2()).a().get(hvf.q.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new hvf.r(((hvf.q) aVar.b()).k, transportHubFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
            case 6:
                ((CircleProgressStoriesDelegate) obj3).e.invoke((CircleProgressStoriesModel) obj2);
                return Unit.f186387a;
            case 7:
                ((MultibarStoriesDelegate) obj3).e.invoke((MultibarStoriesModel) obj2);
                return Unit.f186387a;
            case 8:
                ((SimpleStoriesDelegate) obj3).e.invoke((SimpleStoriesModel) obj2);
                return Unit.f186387a;
            case 9:
                ((StickerStoriesPageDelegate) obj3).e.invoke((StickerStoriesModel) obj2);
                return Unit.f186387a;
            case 10:
                CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2 = (CryptoCommodityBuyCollectionAmountScreenV2) obj3;
                KProperty[] kPropertyArr6 = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                qji.b bVarQ22 = cryptoCommodityBuyCollectionAmountScreenV2.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.di.CryptoCommodityBuyCollectionAmountScreenInjector");
                mw5.j jVar = (mw5.j) bVarQ22;
                return new mw5.h(jVar.f209366b, jVar.f209367c, cryptoCommodityBuyCollectionAmountScreenV2, (CryptoCommodityBuyCollectionAmountScreenContract$InputData) obj2);
            case 11:
                WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen = (WidgetisedAnalyticsPnLScreen) obj3;
                KProperty[] kPropertyArr7 = WidgetisedAnalyticsPnLScreen.Y;
                qji.b bVarU23 = widgetisedAnalyticsPnLScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.pnl.di.WidgetisedAnalyticsPnLScreenInjector");
                ewg.k kVar = (ewg.k) bVarU23;
                return new ewg.m(kVar.d, kVar.e, widgetisedAnalyticsPnLScreen, (WidgetisedAnalyticsPnLScreenContract$InputData) obj2, widgetisedAnalyticsPnLScreen);
            case 12:
                c00.a aVar5 = (c00.a) obj3;
                FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig downloadableFaceQualityValidatorConfig = (FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig) obj2;
                File fileA = aVar5.f20077a.a(downloadableFaceQualityValidatorConfig.f50918a, downloadableFaceQualityValidatorConfig.f50919b);
                if (fileA == null || (modelPath = fileA.getAbsolutePath()) == null) {
                    return null;
                }
                i4b.f fVar = aVar5.f20082j;
                FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig.Thresholds thresholds = downloadableFaceQualityValidatorConfig.f50920c;
                float f = thresholds.f50921a;
                float f4 = thresholds.f50922b;
                float f5 = thresholds.f50923c;
                float f6 = thresholds.d;
                float f32 = thresholds.e;
                float f35 = thresholds.f;
                float f36 = thresholds.f50924g;
                float f37 = thresholds.f50925h;
                float f41 = thresholds.i;
                float f42 = thresholds.f50926j;
                float f57 = thresholds.k;
                e10.k faceValidatorConfig = new e10.k(new e10.m(f, f4, f5, f6, f32, f35, f36, f37, f41, f42, f57));
                Intrinsics.checkNotNullParameter(modelPath, "modelPath");
                Intrinsics.checkNotNullParameter(faceValidatorConfig, "faceValidatorConfig");
                ((c10.h) ((c10.g) fVar.f158330b)).a();
                FaceValidatorWrapper faceValidatorWrapperCreateFromFile = FaceValidatorWrapper.createFromFile(modelPath, new FaceImageQualityConfig(new FaceImageQualityThreasholds(f, f4, f5, f6, f32, f35, f36, f37, f41, f42, f57), BERTags.FLAGS, BERTags.FLAGS));
                Intrinsics.checkNotNullExpressionValue(faceValidatorWrapperCreateFromFile, "createFromFile(...)");
                return new c10.e(faceValidatorWrapperCreateFromFile);
            case 13:
                c00.a aVar6 = (c00.a) obj3;
                DocClassifierConfig docClassifierConfig = (DocClassifierConfig) obj2;
                File fileA2 = aVar6.f20077a.a(docClassifierConfig.f50904a, docClassifierConfig.f50905b);
                if (fileA2 == null || (modelPath2 = fileA2.getAbsolutePath()) == null) {
                    return null;
                }
                i4b.f fVar2 = aVar6.f20082j;
                Intrinsics.checkNotNullParameter(modelPath2, "modelPath");
                ((c10.h) ((c10.g) fVar2.f158330b)).a();
                DocClassifier docClassifierCreate = DocClassifier.create(modelPath2);
                Intrinsics.checkNotNullExpressionValue(docClassifierCreate, "create(...)");
                return new c10.a(docClassifierCreate);
            case 14:
                c00.a aVar7 = (c00.a) obj3;
                DocumentFitFourCornerConfig documentFitFourCornerConfig = (DocumentFitFourCornerConfig) obj2;
                File fileA3 = aVar7.f20077a.a(documentFitFourCornerConfig.f50912a, documentFitFourCornerConfig.f50913b);
                if (fileA3 == null || (modelPath3 = fileA3.getAbsolutePath()) == null) {
                    return null;
                }
                i4b.f fVar3 = aVar7.f20082j;
                Intrinsics.checkNotNullParameter(modelPath3, "modelPath");
                ((c10.h) ((c10.g) fVar3.f158330b)).a();
                DocCorners docCornersCreate = DocCorners.create(modelPath3);
                Intrinsics.checkNotNullExpressionValue(docCornersCreate, "create(...)");
                return new c10.f(docCornersCreate);
            case 15:
                c00.a aVar8 = (c00.a) obj3;
                DocImageQualityValidatorConfig docImageQualityValidatorConfig = (DocImageQualityValidatorConfig) obj2;
                File fileA4 = aVar8.f20077a.a(docImageQualityValidatorConfig.f50906a, docImageQualityValidatorConfig.f50907b);
                if (fileA4 == null || (modelPath4 = fileA4.getAbsolutePath()) == null) {
                    return null;
                }
                i4b.f fVar4 = aVar8.f20082j;
                DocImageQualityValidatorConfig.Thresholds thresholds2 = docImageQualityValidatorConfig.f50908c;
                e10.f docQualityConfig = new e10.f(new e10.h(thresholds2.f50909a, thresholds2.f50910b, thresholds2.f50911c, thresholds2.d));
                Intrinsics.checkNotNullParameter(modelPath4, "modelPath");
                Intrinsics.checkNotNullParameter(docQualityConfig, "docQualityConfig");
                ((c10.h) ((c10.g) fVar4.f158330b)).a();
                DocImageQuality docImageQualityCreate = DocImageQuality.create(modelPath4, DocQualityMapperKt.toFrameworkDocQualityConfig(docQualityConfig));
                Intrinsics.checkNotNullExpressionValue(docImageQualityCreate, "create(...)");
                return new c10.b(docImageQualityCreate);
            case 16:
                RevPointsRedeemScreen revPointsRedeemScreen = (RevPointsRedeemScreen) obj3;
                RevPointsRedeemScreenContract$InputData revPointsRedeemScreenContract$InputData = (RevPointsRedeemScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = RevPointsRedeemScreen.X;
                phm.a aVar9 = (phm.a) ue0.e.j(revPointsRedeemScreen.m2()).a().get(zxb.e.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new zxb.t(((zxb.e) aVar.b()).V, revPointsRedeemScreenContract$InputData, new c0c.t(revPointsRedeemScreen.T, revPointsRedeemScreen.P, revPointsRedeemScreen.Q.f, 0));
                }
                throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
            case 17:
                FreelancerWebsiteScreen freelancerWebsiteScreen = (FreelancerWebsiteScreen) obj3;
                FreelancerWebsiteScreenContract$InputData freelancerWebsiteScreenContract$InputData = (FreelancerWebsiteScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = FreelancerWebsiteScreen.S;
                qji.b bVarU24 = freelancerWebsiteScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.website.di.WebsiteScreenInjector");
                v1 v1Var = (v1) ((d17.a) bVarU24).b().mo3808a(freelancerWebsiteScreen);
                switch (v1Var.f282778a) {
                    case 0:
                        v1Var.d = freelancerWebsiteScreenContract$InputData;
                        break;
                    case 1:
                        v1Var.d = freelancerWebsiteScreenContract$InputData;
                        break;
                    default:
                        v1Var.d = freelancerWebsiteScreenContract$InputData;
                        break;
                }
                return (w1) v1Var.mo3783build();
            case 18:
                CardOrderFlow cardOrderFlow = (CardOrderFlow) obj3;
                CardOrderFlowContract$InputData cardOrderFlowContract$InputData = (CardOrderFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(cardOrderFlow.m2()).a().get(x13.p.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new x13.q(((x13.p) aVar.b()).T, new agk.a(), cardOrderFlow, cardOrderFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", x13.p.class, " is not found"));
            case 19:
                MissingFieldsScreen missingFieldsScreen = (MissingFieldsScreen) obj3;
                MissingFieldsScreenContract$InputData missingFieldsScreenContract$InputData = (MissingFieldsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = MissingFieldsScreen.S;
                phm.a aVar11 = (phm.a) ue0.e.j(missingFieldsScreen.m2()).a().get(b3j.t.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new b3j.w(((b3j.t) aVar.b()).f12108t, missingFieldsScreen, missingFieldsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", b3j.t.class, " is not found"));
            case 20:
                CancelLoanConfirmationController cancelLoanConfirmationController = (CancelLoanConfirmationController) obj3;
                KProperty[] kPropertyArr11 = CancelLoanConfirmationController.U;
                qji.b bVarU25 = cancelLoanConfirmationController.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.di.CancelLoanConfirmationControllerInjector");
                u45.j jVar2 = (u45.j) bVarU25;
                return new u45.d(jVar2.f277154b, jVar2.f277155c, cancelLoanConfirmationController, (CancelLoanConfirmationControllerContract$InputData) obj2);
            case 21:
                ((com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) obj3).P2(new til.o(3), (AccountActivationFlowContract$Step.Workflow) obj2);
                return Unit.f186387a;
            case 22:
                MoneyRequestRejectWithReasonScreen moneyRequestRejectWithReasonScreen = (MoneyRequestRejectWithReasonScreen) obj3;
                MoneyRequestRejectWithReasonContract$InputData moneyRequestRejectWithReasonContract$InputData = (MoneyRequestRejectWithReasonContract$InputData) obj2;
                KProperty[] kPropertyArr12 = MoneyRequestRejectWithReasonScreen.c0;
                phm.a aVar12 = (phm.a) ue0.e.j(moneyRequestRejectWithReasonScreen.m2()).a().get(t6k.e.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new t6k.d(((t6k.c) aVar.b()).f268376n, moneyRequestRejectWithReasonScreen, moneyRequestRejectWithReasonContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t6k.e.class, " is not found"));
            case 23:
                SubscriptionCancellationScreen subscriptionCancellationScreen = (SubscriptionCancellationScreen) obj3;
                KProperty[] kPropertyArr13 = SubscriptionCancellationScreen.m0;
                qji.b bVarQ23 = subscriptionCancellationScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.di.SubscriptionCancellationScreenInjector");
                r7d.t tVar = (r7d.t) ((v7d.a) bVarQ23);
                return new r7d.v(tVar.f252174b, tVar.f252175c, subscriptionCancellationScreen, (SubscriptionCancellationScreenContract$InputData.RecurrentPayment) obj2);
            case 24:
                cbh.y yVar = (cbh.y) obj3;
                return mra.d.b(yVar, new cbh.j(yVar.o.f95365a, new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, null, false, yVar.J2(), null), (ac4.g) obj2, null, false, 12);
            case 25:
                QuestionScreen questionScreen = (QuestionScreen) obj3;
                qji.b bVarQ24 = questionScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.question.di.QuestionScreenInjector");
                lal.a aVarA = ((oal.a) bVarQ24).A();
                aVarA.d = questionScreen;
                aVarA.e = (QuestionScreenContract$InputData) obj2;
                return (lal.f) aVarA.mo3800build();
            case 26:
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = (MoneyBoxAmountInputScreen) obj3;
                MoneyBoxAmountInputScreenContract$InputData moneyBoxAmountInputScreenContract$InputData = (MoneyBoxAmountInputScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = MoneyBoxAmountInputScreen.i0;
                qji.b bVarQ25 = moneyBoxAmountInputScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.retail.money_box_amount.di.MoneyBoxAmountInputScreenInjector");
                r6e.i iVarB = ((xbb.a) bVarQ25).b();
                switch (iVarB.f251739a) {
                    case 0:
                        iVarB.f251741c = moneyBoxAmountInputScreenContract$InputData;
                        break;
                    case 1:
                        iVarB.f251741c = moneyBoxAmountInputScreenContract$InputData;
                        break;
                    case 2:
                        iVarB.f251741c = moneyBoxAmountInputScreenContract$InputData;
                        break;
                    default:
                        iVarB.f251741c = moneyBoxAmountInputScreenContract$InputData;
                        break;
                }
                return (wpg.o) ((r6e.i) iVarB.S(moneyBoxAmountInputScreen)).mo3800build();
            case 27:
                AddOnsGoodbyeScreen addOnsGoodbyeScreen = (AddOnsGoodbyeScreen) obj3;
                lbf.f fVar5 = (lbf.f) obj2;
                KProperty[] kPropertyArr15 = AddOnsGoodbyeScreen.j0;
                qji.b bVarQ26 = addOnsGoodbyeScreen.Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                ubf.e eVar2 = (ubf.e) bVarQ26;
                ubf.d dVar = eVar2.f278874b;
                ubf.e eVar3 = eVar2.f278875c;
                fVar5.getClass();
                return new ubf.a(dVar, eVar3, addOnsGoodbyeScreen, fVar5);
            case 28:
                CreditLinkedAccountsV2ListScreen creditLinkedAccountsV2ListScreen = (CreditLinkedAccountsV2ListScreen) obj3;
                CreditLinkedAccountsV2ListScreenContract$InputData creditLinkedAccountsV2ListScreenContract$InputData = (CreditLinkedAccountsV2ListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr16 = CreditLinkedAccountsV2ListScreen.g0;
                qji.b bVarQ27 = creditLinkedAccountsV2ListScreen.Q2();
                Intrinsics.i(bVarQ27, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.di.CreditLinkedAccountsV2ListScreenInjector");
                p8 p8Var = (p8) ((dd4.a) bVarQ27).b().S(creditLinkedAccountsV2ListScreen);
                switch (p8Var.f119536a) {
                    case 0:
                        p8Var.d = creditLinkedAccountsV2ListScreenContract$InputData;
                        break;
                    default:
                        p8Var.d = creditLinkedAccountsV2ListScreenContract$InputData;
                        break;
                }
                return (r8) p8Var.mo3800build();
            default:
                SelectTaxRateScreenProvider$InputData selectTaxRateScreenProvider$InputData = (SelectTaxRateScreenProvider$InputData) obj2;
                int i3 = SelectTaxRateScreen.V;
                phm.a aVar13 = (phm.a) ue0.e.j(((SelectTaxRateScreen) obj3).m2()).a().get(ld1.l.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new ld1.v(((ld1.l) aVar.b()).f, selectTaxRateScreenProvider$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ld1.l.class, " is not found"));
        }
    }
}
