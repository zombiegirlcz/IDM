package sik;

import android.content.Intent;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextWithHighlightsClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.GraduateStudentFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.GraduateStudentFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.HideStudentFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_resend_bottom_sheet.StudentEmailResendBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.StudentReviewPromptScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.StudentReviewPromptScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_status.StudentStatusScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_status.StudentStatusScreenContract$InputData;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rch.o;
import sdi.k;
import wnk.i;
import wnk.j;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g f263652b;

    public /* synthetic */ d(com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar, int i) {
        this.f263651a = i;
        this.f263652b = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        StudentReviewPromptScreen studentReviewPromptScreen;
        int i = 26;
        switch (this.f263651a) {
            case 0:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                StudentVerificationFlowContract$Step step = (StudentVerificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof StudentVerificationFlowContract$Step.EmailValidation;
                int i2 = 2;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar = this.f263652b;
                if (z) {
                    StudentVerificationFlowContract$Step.EmailValidation emailValidation = (StudentVerificationFlowContract$Step.EmailValidation) step;
                    StudentEmailValidationScreen studentEmailValidationScreen = new StudentEmailValidationScreen(new StudentEmailValidationScreenContract$InputData(emailValidation.f103276a, emailValidation.f103277b, emailValidation.f103278c));
                    c block = new c(gVar, i2);
                    Intrinsics.checkNotNullParameter(block, "block");
                    studentEmailValidationScreen.H = block;
                    return studentEmailValidationScreen;
                }
                if (step instanceof StudentVerificationFlowContract$Step.EmailVerification) {
                    StudentVerificationFlowContract$Step.EmailVerification emailVerification = (StudentVerificationFlowContract$Step.EmailVerification) step;
                    String str = emailVerification.f103279a;
                    String str2 = emailVerification.f103280b;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.student_plans_verification_email_prompt_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.student_plans_verification_email_prompt_subtitle, u.c(TextWithHighlightsClause.Companion.a(TextWithHighlightsClause.INSTANCE, "{" + str + "}")), null, 12);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.student_plans_verification_email_prompt_action_resend_email, null, new Click(30, (Integer) null, (Object) null, "resend_student_email", false), 10);
                    StudentReviewPromptScreen studentReviewPromptScreen2 = new StudentReviewPromptScreen(new StudentReviewPromptScreenContract$InputData(new PromptMarketingScreenContract$InputData(textLocalisedClause, textLocalisedClause2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), null, pd.REGULAR, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ld.CAPTION, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.student_plans_verification_email_prompt_action_go_to_inbox, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, textLocalisedClause3, 57096), str2));
                    gVar.a(studentReviewPromptScreen2, new d(gVar, 2));
                    return studentReviewPromptScreen2;
                }
                if (step instanceof StudentVerificationFlowContract$Step.EmailReview) {
                    String str3 = ((StudentVerificationFlowContract$Step.EmailReview) step).f103275a;
                    studentReviewPromptScreen = new StudentReviewPromptScreen(new StudentReviewPromptScreenContract$InputData(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.student_plans_reviewing_email_prompt_title, null, null, 14), new TextLocalisedClause(R$string.student_plans_reviewing_email_prompt_subtitle, u.c(TextWithHighlightsClause.Companion.a(TextWithHighlightsClause.INSTANCE, "{" + str3 + "}")), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), null, pd.REGULAR, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ld.CAPTION, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.student_plans_reviewing_email_prompt_action_edit_email, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), null, null, null, null, null, 65032), null));
                    x5d.b.n(gVar, studentReviewPromptScreen, new o(2, gVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 8), new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.e(gVar, null), new qce.b(gVar, str3, 16));
                } else {
                    int i3 = 1;
                    if (!(step instanceof StudentVerificationFlowContract$Step.EmailRejected)) {
                        if (step instanceof StudentVerificationFlowContract$Step.ResendEmailBottomSheet) {
                            StudentEmailResendBottomSheet studentEmailResendBottomSheet = new StudentEmailResendBottomSheet();
                            c block2 = new c(gVar, 3);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            studentEmailResendBottomSheet.H = block2;
                            return studentEmailResendBottomSheet;
                        }
                        if (step instanceof StudentVerificationFlowContract$Step.StudentStatus) {
                            StudentVerificationFlowContract$Step.StudentStatus studentStatus = (StudentVerificationFlowContract$Step.StudentStatus) step;
                            StudentStatusScreen studentStatusScreen = new StudentStatusScreen(new StudentStatusScreenContract$InputData(studentStatus.f103285a));
                            k block3 = new k(gVar, studentStatus, 6);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            studentStatusScreen.H = block3;
                            return studentStatusScreen;
                        }
                        if (step instanceof StudentVerificationFlowContract$Step.HideStudent) {
                            HideStudentFlow hideStudentFlow = new HideStudentFlow();
                            c block4 = new c(gVar, 4);
                            Intrinsics.checkNotNullParameter(block4, "block");
                            hideStudentFlow.H = block4;
                            return hideStudentFlow;
                        }
                        if (step instanceof StudentVerificationFlowContract$Step.GraduateStudent) {
                            GraduateStudentFlow graduateStudentFlow = new GraduateStudentFlow(new GraduateStudentFlowContract$InputData(true));
                            c block5 = new c(gVar, i3);
                            Intrinsics.checkNotNullParameter(block5, "block");
                            graduateStudentFlow.H = block5;
                            return graduateStudentFlow;
                        }
                        if (!(step instanceof StudentVerificationFlowContract$Step.IntroProductArticle)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProductArticleParams productArticleParams = gVar.f103297w;
                        k9 k9Var = k9.Premium;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        ViewController viewControllerE1 = gVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 52));
                        viewControllerE1.k2(new sii.a(gVar, i3));
                        return viewControllerE1;
                    }
                    String str4 = ((StudentVerificationFlowContract$Step.EmailRejected) step).f103274a;
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.student_plans_email_not_recognised_prompt_title, null, null, 14);
                    int i5 = R$string.student_plans_email_not_recognised_prompt_subtitle;
                    TextWithHighlightsClause.Companion companion = TextWithHighlightsClause.INSTANCE;
                    studentReviewPromptScreen = new StudentReviewPromptScreen(new StudentReviewPromptScreenContract$InputData(new PromptMarketingScreenContract$InputData(textLocalisedClause4, new TextLocalisedClause(i5, u.c(TextWithHighlightsClause.Companion.a(companion, "{" + str4 + "}")), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), null, pd.REGULAR, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ld.CAPTION, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.student_plans_email_not_recognised_prompt_action_add_email_address, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, 65288), null));
                    x5d.b.n(gVar, studentReviewPromptScreen, new o(2, gVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 7), new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.d(gVar, null), new d(gVar, i3));
                }
                return studentReviewPromptScreen;
            case 1:
                i output = (i) obj2;
                oki.g handle = (oki.g) obj3;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(handle, "handle");
                boolean z3 = output instanceof i.c;
                Continuation continuation = null;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar2 = this.f263652b;
                if (z3) {
                    handle.pop();
                    oki.h.t2(gVar2, gVar2.f103298x, new StudentVerificationFlowContract$Step.EmailValidation(null, 7), false, null, false, 12);
                } else if (output instanceof i.a) {
                    gVar2.C2(a.C0635a.f103287a);
                } else if (output instanceof j) {
                    gVar2.l2(new h(gVar2, ((j) output).f298851a, handle, continuation, 1), new yi5.b(i));
                } else if (!(output instanceof i.d) && !(output instanceof wnk.h) && !(output instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                oki.g onResult = (oki.g) obj2;
                i output2 = (i) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean z4 = output2 instanceof i.c;
                Continuation continuation2 = null;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar3 = this.f263652b;
                if (z4) {
                    gVar3.f103292p.getClass();
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.APP_EMAIL");
                    intent.addFlags(268435456);
                    gVar3.C1(new ExternalDestination.ByIntent(intent, null));
                } else if (output2 instanceof i.b) {
                    oki.h.w2(gVar3.f103298x, StudentVerificationFlowContract$Step.ResendEmailBottomSheet.f103284a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (output2 instanceof j) {
                    gVar3.l2(new h(gVar3, ((j) output2).f298851a, onResult, continuation2, 1), new yi5.b(i));
                } else if (output2 instanceof i.a) {
                    onResult.pop();
                } else if (!(output2 instanceof i.d) && !(output2 instanceof wnk.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
