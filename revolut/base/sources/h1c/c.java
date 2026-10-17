package h1c;

import android.os.Parcelable;
import aw0.e;
import aw0.i;
import aw0.n6;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.models.credit_health.CreditHealthContext;
import com.revolut.feature.credit.application.models.eligibility.CreditEligibilityCriteria;
import com.revolut.feature.credit.application.models.plugins.EntryPointParams;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CreditWaitingListV3;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.application.d;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3RootFlow;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import com.revolut.tracking.v3.CreditApplicationProductArticleContext;
import ft3.d1;
import ft3.j1;
import ft3.y0;
import grl.k9;
import grl.r2;
import gt3.f;
import h54.h;
import h54.o;
import igk.h0;
import igk.l0;
import igk.w;
import igk.x;
import ip0.md;
import it3.k;
import j54.i0;
import j54.s0;
import j54.z;
import j54.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jb3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kp0.m;
import om4.s3;
import org.jmrtd.lds.LDSFile;
import pth.g;
import skm.a2;
import til.s;
import vkm.j2;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148490b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f148489a = i;
        this.f148490b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj2, Object obj3) {
        int i;
        i eVar;
        i hVar;
        Integer numValueOf;
        Integer numValueOf2;
        d flowModel = (d) this.f148490b;
        qki.d dVar = flowModel.P;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CreditApplicationFlowContract$Step step = (CreditApplicationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        int i2 = 0;
        if (step instanceof CreditApplicationFlowContract$Step.CreditHealthPrompt) {
            j1 j1Var = flowModel.M2().f137810a;
            f fVar = flowModel.M2().f137811b;
            y0 y0Var = ((CreditApplicationFlowContract$State) ((j2) dVar.f22677a).getValue()).f.d;
            CreditHealthFlowController creditHealthFlowController = new CreditHealthFlowController(new CreditHealthFlowContract$InputData(new CreditHealthContext.BeforeApplication(j1Var, fVar, y0Var != null ? y0Var.c0() : null)));
            h54.i block = new h54.i(flowModel, i2);
            Intrinsics.checkNotNullParameter(block, "block");
            creditHealthFlowController.H = block;
            return creditHealthFlowController;
        }
        int i3 = 5;
        int i5 = 10;
        if (step instanceof CreditApplicationFlowContract$Step.ProductArticles) {
            CreditApplicationFlowContract$Step.ProductArticles productArticles = (CreditApplicationFlowContract$Step.ProductArticles) step;
            z zVar = flowModel.I;
            wi0.b countryCode = productArticles.f67079a;
            com.revolut.feature.credit.application.plugins.impl.ui.application.a variant = productArticles.f67081c;
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) zVar;
            CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = dVar2.f67111l;
            CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData2 = dVar2.f67111l;
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(variant, "variant");
            a2 a2Var = dVar2.f67117s;
            if (a2Var != null) {
                a2Var.f(null);
            }
            dVar2.f67116r.set(false);
            String str = creditApplicationFlowContract$InputData.e;
            ProductArticleParams productArticleParams = new ProductArticleParams(str != null ? new ProductArticleParams.ArticleReference.Id(str) : dVar2.Z2(countryCode, variant));
            k9 value = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            d1 d1Var = creditApplicationFlowContract$InputData.f67053a;
            f fVar2 = d1Var.f137811b;
            if (fVar2 == null) {
                fVar2 = (creditApplicationFlowContract$InputData2.f67053a.f137810a == j1.CREDIT_CARD && ((s3) dVar2.o).p()) ? gt3.c.PREMIUM : null;
            }
            CreditApplicationProductArticleContext creditApplicationProductArticleContextA = zr3.c.a(countryCode, d1.c(d1Var, fVar2, null, 5), creditApplicationFlowContract$InputData2.f67054b.f137797a);
            companion.getClass();
            ViewController viewControllerO2 = dVar2.o2(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, new AnalyticsProduct.Retail(value), new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationProductArticleContextA)), false, 32));
            dVar2.f67118t = viewControllerO2;
            viewControllerO2.k2(new md(dVar2, viewControllerO2, 29));
            h onQuit = new h(flowModel, i2);
            fb.c onResult = new fb.c(flowModel, productArticles, i5);
            Intrinsics.checkNotNullParameter(viewControllerO2, "<this>");
            Intrinsics.checkNotNullParameter(flowModel, "flowModel");
            Intrinsics.checkNotNullParameter(onQuit, "onQuit");
            Intrinsics.checkNotNullParameter(onResult, "onResult");
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            viewControllerO2.l2(new kpl.b(ref$BooleanRef, onQuit, 7));
            flowModel.a(viewControllerO2, new m(ref$BooleanRef, onResult, 3));
            return viewControllerO2;
        }
        if (step instanceof CreditApplicationFlowContract$Step.ResumeIntro) {
            if (((CreditApplicationFlowContract$Step.ResumeIntro) step) instanceof CreditApplicationFlowContract$Step.ResumeIntro.ForbearanceSelfService) {
                return flowModel.J2();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (step instanceof CreditApplicationFlowContract$Step.ProductIntro) {
            if (((CreditApplicationFlowContract$Step.ProductIntro) step) instanceof CreditApplicationFlowContract$Step.ProductIntro.ForbearanceSelfService) {
                return flowModel.J2();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (step instanceof CreditApplicationFlowContract$Step.WaitingList) {
            return ((jte.d) flowModel.f67097y.f156079a).c(CreditApplicationPluginsApi$Toggles$CreditWaitingListV3.f66277c) ? new WaitingListV3RootFlow(new WaitingListV3FlowContract$InputData(flowModel.M2().f137810a)) : new WaitingListRootFlow(new WaitingListFlowContract$InputData(flowModel.M2().f137810a));
        }
        int i6 = 4;
        if (step instanceof CreditApplicationFlowContract$Step.PlanSelection) {
            wi0.b userCountry = ((CreditApplicationFlowContract$Step.PlanSelection) step).f67076a;
            j24.c cVar = flowModel.C;
            r2 entryPointType = flowModel.L2();
            d1 productClassification = flowModel.M2();
            cVar.getClass();
            Intrinsics.checkNotNullParameter(userCountry, "userCountry");
            Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
            Intrinsics.checkNotNullParameter(productClassification, "productClassification");
            Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
            Intrinsics.checkNotNullParameter(productClassification, "productClassification");
            xfa.a aVar = new xfa.a(r0.j(new Pair("entryPointType", entryPointType.name()), new Pair("productType", l.w(productClassification).name())));
            wi0.b.Companion.getClass();
            boolean zF = Intrinsics.f(userCountry, wi0.b.A);
            h0 h0Var = h0.f161249a;
            ViewController viewControllerE1 = flowModel.e1(zF ? new w(new x(xfa.b.CREDIT_CARD, h0Var, (l0) null, aVar, 12)) : new w(new x(xfa.b.CREDIT_CARD, h0Var, new l0(4, new TextLocalisedClause(R$string.credit_application_plan_selection_title, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_back)), aVar, 4)));
            gwc.h block2 = new gwc.h(1, flowModel, d.class, "handlePlanSelectionResult", "handlePlanSelectionResult(Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanSelection$Output;)V", 0, 8);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        if (step instanceof CreditApplicationFlowContract$Step.PreApplicationChecks) {
            PreApplicationChecksScenario preApplicationChecksScenario = ((CreditApplicationFlowContract$Step.PreApplicationChecks) step).f67078a;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            a2.a aVar2 = new a2.a(ref$BooleanRef2, 11, ref$ObjectRef, flowModel);
            PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = new PreApplicationChecksScreenContract$InputData(flowModel.M2(), ((CreditApplicationFlowContract$State) ((j2) dVar.f22677a).getValue()).f, preApplicationChecksScenario);
            ViewController preApplicationChecksPromptScreen = ((preApplicationChecksScenario instanceof PreApplicationChecksScenario.ReadyWithInfo) || (preApplicationChecksScenario instanceof PreApplicationChecksScenario.RejectedUndisclosed)) ? new PreApplicationChecksPromptScreen(preApplicationChecksScreenContract$InputData) : new PreApplicationChecksScreen(preApplicationChecksScreenContract$InputData);
            dqd.a block3 = new dqd.a(ref$BooleanRef2, ref$ObjectRef, flowModel, aVar2, 20);
            Intrinsics.checkNotNullParameter(block3, "block");
            preApplicationChecksPromptScreen.H = block3;
            return preApplicationChecksPromptScreen;
        }
        if (step instanceof CreditApplicationFlowContract$Step.Plugin) {
            i0 i0Var = flowModel.E;
            PluginPayload pluginPayload = ((CreditApplicationFlowContract$Step.Plugin) step).f67077a;
            o onRecreate = new o(flowModel, null);
            j54.r0 r0Var = (j54.r0) i0Var;
            r0Var.getClass();
            Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
            Intrinsics.checkNotNullParameter(onRecreate, "onRecreate");
            rz3.c cVar2 = r0Var.f171552n;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
            PluginFlowControllerV2 pluginFlowControllerV2A = cVar2.f258503b.b(pluginPayload.f66247a).a(pluginPayload);
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            wi0.b bVar = pluginPayload.f66248b;
            EntryPointParams entryPointParams = pluginPayload.f66249c;
            CreditApplicationCommonContext creditApplicationCommonContextB = zr3.b.b(bVar, entryPointParams.f66246b, entryPointParams.f66245a, pluginPayload.f66247a);
            companion2.getClass();
            pluginFlowControllerV2A.K = new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextB));
            j2c.o block4 = new j2c.o(r0Var, 3, pluginPayload, onRecreate);
            Intrinsics.checkNotNullParameter(block4, "block");
            pluginFlowControllerV2A.H = block4;
            return pluginFlowControllerV2A;
        }
        if (step instanceof CreditApplicationFlowContract$Step.Workflow) {
            CreditApplicationFlowContract$Step.Workflow workflow = (CreditApplicationFlowContract$Step.Workflow) step;
            String applicationId = workflow.f67087a;
            String str2 = workflow.f67088b;
            wi0.b bVar2 = workflow.f67089c;
            boolean z = workflow.d;
            s0 s0Var = flowModel.F;
            EntryPointParams entryPointParams2 = new EntryPointParams(flowModel.D.f67054b.f137798b, flowModel.L2());
            AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
            CreditApplicationCommonContext creditApplicationCommonContextC = zr3.b.c(flowModel.L2(), flowModel.M2().f137810a, flowModel.M2().f137811b);
            companion3.getClass();
            AnalyticsContext analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextC));
            z0 params = new z0(str2, applicationId, bVar2, z, entryPointParams2, analyticsContext);
            j54.y0 y0Var2 = (j54.y0) s0Var;
            y0Var2.getClass();
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(params, "params");
            til.m mVar = y0Var2.f171588l;
            AnalyticsProduct.Companion companion4 = AnalyticsProduct.INSTANCE;
            k9 k9Var = k9.Credit;
            companion4.getClass();
            WorkflowConfiguration.Workflow configuration = new WorkflowConfiguration.Workflow(str2, bVar2, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG12_TAG);
            WorkflowFlowType.Regular flowType = new WorkflowFlowType.Regular(s.CROSS);
            til.i backgroundType = til.i.DEFAULT;
            ((g) mVar).getClass();
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            WorkflowFlow workflowFlow = new WorkflowFlow(new WorkflowFlowContract$InputData(analyticsContext, configuration, flowType, backgroundType, false, true));
            j2c.o block5 = new j2c.o(y0Var2, i6, applicationId, params);
            Intrinsics.checkNotNullParameter(block5, "block");
            workflowFlow.H = block5;
            return workflowFlow;
        }
        if (step instanceof CreditApplicationFlowContract$Step.ModalStep.NotEligible) {
            h hVar2 = new h(flowModel, i3);
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.credit_not_eligible_title, null, null, 14), new TextLocalisedClause(R$string.credit_not_eligible_description, null, null, 14), null, null, false, 28);
            e eVarA = k54.b.a(R$string.credit_not_eligible_button);
            boolean z3 = false;
            List listC = u.c(new eii.l((Clause) new TextLocalisedClause(R$string.credit_not_eligible_row_criteria, u.c(new TextLocalisedClause(R$string.credit_not_eligible_row_criteria_link, null, new Click(30, (Integer) null, (Object) null, "NOT_ELIGIBLE_CRITERIA_LINK_ID", false), 10)), null, 12), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, z3, null, false, 62), false, z3, (RowDelegate.Model.c) (0 == true ? 1 : 0), (Object) null, 488));
            k9 k9Var2 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar3, eVarA, listC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
            md6.s.E(rowActionsBottomSheetController, new fi7.s(2, flowModel, d.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 9), flowModel.N2(), new gwc.h(1, hVar2, kotlin.jvm.internal.s.class, "suspendConversion0", "createNotEligibleController$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6), new gvi.s(hVar2, flowModel, 24));
            return rowActionsBottomSheetController;
        }
        int i21 = 2;
        int i22 = 1;
        if (step instanceof CreditApplicationFlowContract$Step.ModalStep.EligibilityCriteria) {
            List criteria = ((CreditApplicationFlowContract$Step.ModalStep.EligibilityCriteria) step).f67068a;
            h hVar3 = new h(flowModel, i6);
            Intrinsics.checkNotNullParameter(criteria, "criteria");
            lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.credit_not_eligible_criteria_title, null, null, 14), new TextLocalisedClause(R$string.credit_not_eligible_criteria_description, null, null, 14), null, null, false, 28);
            e eVarA2 = k54.b.a(R$string.credit_not_eligible_criteria_button);
            List<CreditEligibilityCriteria> list = criteria;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (CreditEligibilityCriteria creditEligibilityCriteria : list) {
                TextClause textClause = new TextClause(creditEligibilityCriteria.f66242a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(creditEligibilityCriteria.f66243b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i32 = k54.a.f181385a[creditEligibilityCriteria.f66244c.ordinal()];
                if (i32 == 1) {
                    numValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_document);
                } else if (i32 == 2) {
                    numValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_utilities);
                } else if (i32 == 3) {
                    numValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_logo_revolut);
                } else {
                    if (i32 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf2 = null;
                }
                arrayList.add(new eii.l((Clause) textClause, (Clause) textClause2, (RowDelegate.Model.MainImage) (numValueOf2 != null ? new RowDelegate.Model.MainImage.Image40(new ResourceImage(numValueOf2.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62) : null), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
            }
            k9 k9Var3 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar4, eVarA2, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null));
            md6.s.E(rowActionsBottomSheetController2, new fi7.s(2, flowModel, d.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 7), flowModel.N2(), new gwc.h(1, hVar3, kotlin.jvm.internal.s.class, "suspendConversion0", "createEligibilityCriteriaController$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4), new gwe.d(hVar3, 28));
            return rowActionsBottomSheetController2;
        }
        if (step instanceof CreditApplicationFlowContract$Step.ModalStep.ResumeApplication) {
            CreditApplicationFlowContract$Step.ModalStep.ResumeApplication resumeApplication = (CreditApplicationFlowContract$Step.ModalStep.ResumeApplication) step;
            it3.d applicationStatus = resumeApplication.f67073a;
            w0 w0Var = resumeApplication.f67074b;
            h hVar4 = new h(flowModel, i21);
            Intrinsics.checkNotNullParameter(applicationStatus, "applicationStatus");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_credit_application_in_progress_title, null, null, 14);
            j1 j1Var2 = applicationStatus.f168328j;
            f fVar3 = applicationStatus.k;
            k kVar = applicationStatus.f168334r;
            switch (k54.d.f181389b[j1Var2.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_credit_card);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_credit_limit_increase);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_credit_limit_decrease);
                    break;
                case 4:
                    if ((kVar == null ? -1 : k54.d.f181388a[kVar.ordinal()]) == 1) {
                        IllegalStateException illegalStateException = new IllegalStateException("Resume application bottom sheet should not be available for fcc invitation");
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_family_credit_card);
                    }
                    break;
                case 5:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_credit_card);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(fVar3 == gt3.d.REFINANCING ? R$string.credit_credit_application_in_progress_subtitle_refinancing : R$string.credit_credit_application_in_progress_subtitle_loan);
                    break;
                case 7:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_pay_later);
                    break;
                case 8:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_mortgage);
                    break;
                case 9:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_refinancing_mortgage);
                    break;
                case 10:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_mortgage_renegotiation);
                    break;
                case 11:
                case 12:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_forbearance);
                    break;
                case 13:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_overdraft);
                    break;
                case 14:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_post_termination_repayment);
                    break;
                case 15:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_post_termination_settlements);
                    break;
                case 16:
                case 17:
                    numValueOf = Integer.valueOf(R$string.credit_credit_application_in_progress_subtitle_insurance);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            lw0.a aVar5 = new lw0.a(textLocalisedClause, numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null, null, null, false, 28);
            i hVar5 = applicationStatus.f168327h ? new aw0.h(false, new n6(new TextLocalisedClause(R$string.credit_credit_application_in_progress_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TAG_LOADING_RESUME", false, null, null, 1000), new n6(new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_button_secondary_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "TAG_LOADING_CANCELLATION", false, null, null, 1000), null, null, null, 121) : new e(false, null, null, new n6(new TextLocalisedClause(R$string.credit_credit_application_in_progress_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TAG_LOADING_RESUME", false, null, null, 1000), null, null, 55);
            k9 value2 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value2, "value");
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar5, hVar5, new AnalyticsProduct.Retail(value2), new AnalyticsContext(w0Var), null, 16));
            md6.s.E(actionsBottomSheetController, new fi7.s(2, flowModel, d.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 11), flowModel.N2(), new gwc.h(1, hVar4, kotlin.jvm.internal.s.class, "suspendConversion0", "createResumeApplicationController_4cAGVY4$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), new gvi.s(flowModel, applicationStatus, 23));
            return actionsBottomSheetController;
        }
        if (!(step instanceof CreditApplicationFlowContract$Step.ModalStep.OtherApplicationInProgress)) {
            int i33 = 6;
            if (step instanceof CreditApplicationFlowContract$Step.ModalStep.Maintenance) {
                h hVar6 = new h(flowModel, i22);
                lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R$string.application_maintenance_title, null, null, 14), new TextLocalisedClause(R$string.application_maintenance_description, null, null, 14), new lw0.b(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6), null), null, false, 24);
                e eVar2 = new e(false, null, null, new n6(new TextLocalisedClause(R$string.application_maintenance_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 k9Var4 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar6, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                md6.s.E(actionsBottomSheetController2, new fi7.s(2, flowModel, d.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 8), flowModel.N2(), new gwc.h(1, hVar6, kotlin.jvm.internal.s.class, "suspendConversion0", "createMaintenanceScreen$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5), new gwe.d(hVar6, 27));
                return actionsBottomSheetController2;
            }
            if (!(step instanceof CreditApplicationFlowContract$Step.ModalStep.UpdateRequired)) {
                if (!(step instanceof CreditApplicationFlowContract$Step.ModalStep.Cancellation)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditApplicationFlowContract$Step.ModalStep.Cancellation cancellation = (CreditApplicationFlowContract$Step.ModalStep.Cancellation) step;
                return ((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) flowModel.G).d3(cancellation.f67065a, cancellation.f67066b, cancellation.f67067c);
            }
            h hVar7 = new h(flowModel, i33);
            lw0.a aVar7 = new lw0.a(new TextLocalisedClause(R$string.application_update_required_title, null, null, 14), new TextLocalisedClause(R$string.application_update_required_description, null, null, 14), null, null, false, 28);
            e eVar3 = new e(false, null, null, new n6(new TextLocalisedClause(R$string.application_update_required_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
            k9 k9Var5 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar7, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
            md6.s.E(actionsBottomSheetController3, new fi7.s(2, flowModel, d.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 12), flowModel.N2(), new gwc.h(1, hVar7, kotlin.jvm.internal.s.class, "suspendConversion0", "createUpdateRequiredController$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10), new gvi.s(flowModel, hVar7, 25));
            return actionsBottomSheetController3;
        }
        CreditApplicationFlowContract$Step.ModalStep.OtherApplicationInProgress otherApplicationInProgress = (CreditApplicationFlowContract$Step.ModalStep.OtherApplicationInProgress) step;
        it3.d applicationStatus2 = otherApplicationInProgress.f67071a;
        w0 w0Var2 = otherApplicationInProgress.f67072b;
        h hVar8 = new h(flowModel, 3);
        Intrinsics.checkNotNullParameter(applicationStatus2, "applicationStatus");
        j1 j1Var3 = applicationStatus2.f168328j;
        int[] iArr = k54.c.f181386a;
        int i43 = iArr[j1Var3.ordinal()];
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause((i43 == 1 || i43 == 2) ? R$string.credit_credit_application_in_progress_title : R$string.credit_credit_onboarding_in_progress_message_title, null, null, 14);
        switch (iArr[j1Var3.ordinal()]) {
            case 1:
            case 2:
                i = R$string.credit_credit_application_in_progress_subtitle_forbearance;
                break;
            case 3:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_credit_card;
                break;
            case 4:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_credit_limit_increase;
                break;
            case 5:
                k kVar2 = applicationStatus2.f168334r;
                switch (kVar2 == null ? -1 : k54.c.f181387b[kVar2.ordinal()]) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i = R$string.credit_credit_onboarding_in_progress_message_subtitle_additional_credit_card_card_owner;
                        break;
                    case 0:
                    default:
                        i = R$string.credit_credit_onboarding_in_progress_message_subtitle_additional_credit_card_card_owner;
                        break;
                    case 1:
                        i = R$string.credit_credit_onboarding_in_progress_message_subtitle_additional_credit_card_invitee;
                        break;
                }
                break;
            case 6:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_credit_card;
                break;
            case 7:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_credit_limit_decrease;
                break;
            case 8:
                i = applicationStatus2.k == gt3.d.REFINANCING ? R$string.credit_credit_onboarding_in_progress_message_subtitle_refinancing : R$string.credit_credit_onboarding_in_progress_message_subtitle_loan;
                break;
            case 9:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_pay_later;
                break;
            case 10:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_mortgage;
                break;
            case 11:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_refinancing_mortgage;
                break;
            case 12:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_mortgage_renegotiation;
                break;
            case 13:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_overdraft;
                break;
            case 14:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_post_termination_repayment;
                break;
            case 15:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_post_termination_settlements;
                break;
            case 16:
            case 17:
                i = R$string.credit_credit_onboarding_in_progress_message_subtitle_insurance;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar8 = new lw0.a(textLocalisedClause2, new TextLocalisedClause(i, null, null, 14), null, null, false, 28);
        if (j1Var3.b()) {
            hVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.credit_credit_application_in_progress_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TAG_LOADING_RESUME", false, null, null, 1000), null, null, 55);
        } else {
            if (!applicationStatus2.f168327h) {
                eVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.credit_credit_onboarding_in_progress_message_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 value3 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value3, "value");
                ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar8, eVar, new AnalyticsProduct.Retail(value3), new AnalyticsContext(w0Var2), null, 16));
                md6.s.E(actionsBottomSheetController4, new fi7.s(2, flowModel, d.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 10), flowModel.N2(), new gwc.h(1, hVar8, kotlin.jvm.internal.s.class, "suspendConversion0", "createOtherApplicationInProgressController_4cAGVY4$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), new g31.e(applicationStatus2, 19, flowModel, hVar8));
                return actionsBottomSheetController4;
            }
            hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.credit_credit_onboarding_in_progress_message_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_button_secondary_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "TAG_LOADING_CANCELLATION", false, null, null, 1000), null, null, null, 121);
        }
        eVar = hVar;
        k9 value32 = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator72 = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value32, "value");
        ActionsBottomSheetController actionsBottomSheetController42 = new ActionsBottomSheetController(new dii.a(aVar8, eVar, new AnalyticsProduct.Retail(value32), new AnalyticsContext(w0Var2), null, 16));
        md6.s.E(actionsBottomSheetController42, new fi7.s(2, flowModel, d.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 10), flowModel.N2(), new gwc.h(1, hVar8, kotlin.jvm.internal.s.class, "suspendConversion0", "createOtherApplicationInProgressController_4cAGVY4$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), new g31.e(applicationStatus2, 19, flowModel, hVar8));
        return actionsBottomSheetController42;
    }

    /* JADX WARN: Removed duplicated region for block: B:240:0x0bba  */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 3162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1c.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
