package bm9;

import android.os.Parcelable;
import be7.s;
import bi2.n;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.pay_with_smile.impl.R$string;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreen;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreenContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation.FallbackConfirmationScreen;
import com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation.FallbackConfirmationScreenContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlow;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$Step;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import nii.j0;
import nii.u1;
import nii.y0;
import oki.g;
import oki.h;
import skm.e0;
import xl9.i;
import yki.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c f16771b;

    public /* synthetic */ c(com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c cVar, int i) {
        this.f16770a = i;
        this.f16771b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f16770a;
        int i2 = 3;
        int i3 = 4;
        int i5 = 14;
        com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c cVar = this.f16771b;
        Continuation continuation = null;
        switch (i) {
            case 0:
                PayWithSmileEnrollmentFlowContract$InputData payWithSmileEnrollmentFlowContract$InputData = cVar.o;
                AnalyticsContext analyticsContext = cVar.f78979q;
                l FlowCoordinator = (l) obj2;
                PayWithSmileEnrollmentFlowContract$Step step = (PayWithSmileEnrollmentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                int i6 = 1;
                if (step instanceof PayWithSmileEnrollmentFlowContract$Step.Processing) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(new d67.f(new PromptContentDelegate.Model("id_pay_with_smile_processing_prompt", new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_processing_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_processing_description, null, null, 14), null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_cancel, null, null, 14), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870344), null, analyticsContext, true));
                    fullScreenPromptScreen.j2(new bc1.a(ref$ObjectRef, cVar, 12));
                    fullScreenPromptScreen.k2(new d(ref$ObjectRef, 0));
                    cVar.a(fullScreenPromptScreen, new c(cVar, i6));
                    return fullScreenPromptScreen;
                }
                if (step instanceof PayWithSmileEnrollmentFlowContract$Step.AcceptConsent) {
                    PayWithSmileConsentScreen payWithSmileConsentScreen = new PayWithSmileConsentScreen(new PayWithSmileConsentScreenContract$InputData(payWithSmileEnrollmentFlowContract$InputData.f78971a == null ? xl9.f.Enable : xl9.f.EnableAndPay, analyticsContext));
                    cVar.a(payWithSmileConsentScreen, new c(cVar, 2));
                    return payWithSmileConsentScreen;
                }
                if (step instanceof PayWithSmileEnrollmentFlowContract$Step.CreatePasscode) {
                    CreatePasscodeFlow createPasscodeFlow = new CreatePasscodeFlow(new CreatePasscodeFlowContract$InputData(payWithSmileEnrollmentFlowContract$InputData.f78971a == null ? zl9.d.SetPasscode : zl9.d.CreatePasscode));
                    cVar.a(createPasscodeFlow, new c(cVar, i3));
                    return createPasscodeFlow;
                }
                if (step instanceof PayWithSmileEnrollmentFlowContract$Step.FeatureUnavailable) {
                    FullScreenPromptScreen fullScreenPromptScreen2 = new FullScreenPromptScreen(new d67.f(new PromptContentDelegate.Model("id_pay_with_smile_unavailable_prompt", new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_unavailable_description, null, null, 14), null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D151", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870344), null, analyticsContext, true));
                    cVar.a(fullScreenPromptScreen2, new c(cVar, i2));
                    return fullScreenPromptScreen2;
                }
                if (!(step instanceof PayWithSmileEnrollmentFlowContract$Step.FallbackConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                PayWithSmileEnrollmentFlowContract$Step.FallbackConfirmation fallbackConfirmation = (PayWithSmileEnrollmentFlowContract$Step.FallbackConfirmation) step;
                FallbackConfirmationScreen fallbackConfirmationScreen = new FallbackConfirmationScreen(new FallbackConfirmationScreenContract$InputData(fallbackConfirmation.f78974a));
                cVar.a(fallbackConfirmationScreen, new a8a.a(fallbackConfirmation, cVar, 5));
                return fallbackConfirmationScreen;
            case 1:
                g onResult = (g) obj2;
                com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof c.C0497c) || (result instanceof c.a)) {
                    h.D2(cVar.f78980r);
                } else {
                    if (!(result instanceof c.d) && !(result instanceof d67.h) && !(result instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Result = " + result + " isn't supported by the flow");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 2:
                g onResult2 = (g) obj2;
                i result2 = (i) obj3;
                Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                Intrinsics.checkNotNullParameter(result2, "result");
                Continuation continuation2 = null;
                if (result2 instanceof xl9.g) {
                    cVar.l2(new s(cVar, result2, continuation2, i5), new yi5.b(26));
                } else {
                    if (!Intrinsics.f(result2, xl9.h.f306962a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String paymentId = cVar.o.f78971a;
                    if (paymentId != null) {
                        ul9.g gVar = cVar.f78978p;
                        nl9.a reason = nl9.a.CONSENT_SIGNING_ABANDONED;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        e0.C(gVar.d, null, null, new sxe.g(gVar, paymentId, reason, continuation2, 7), 3);
                    }
                    h.D2(cVar.f78980r);
                }
                return Unit.f186387a;
            case 3:
                g onResult3 = (g) obj2;
                com.revolut.feature.full_screen_prompt.c result3 = (com.revolut.feature.full_screen_prompt.c) obj3;
                Intrinsics.checkNotNullParameter(onResult3, "$this$onResult");
                Intrinsics.checkNotNullParameter(result3, "result");
                if ((result3 instanceof c.C0497c) || (result3 instanceof c.a)) {
                    h.D2(cVar.f78980r);
                } else {
                    if (!(result3 instanceof c.d) && !(result3 instanceof d67.h) && !(result3 instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Result = " + result3 + " isn't supported by the flow");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                }
                return Unit.f186387a;
            default:
                g onResult4 = (g) obj2;
                zl9.c it8 = (zl9.c) obj3;
                Intrinsics.checkNotNullParameter(onResult4, "$this$onResult");
                Intrinsics.checkNotNullParameter(it8, "it");
                y0 y0Var = new y0("id_passcode_created", new j0((Clause) new TextLocalisedClause(R$string.revolut_pay_biometric_payments_create_passcode_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4);
                com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c cVar2 = this.f16771b;
                yji.l.a1(cVar2, cVar2.X1(y0Var), null, null, new n(cVar2, continuation, 7), 3);
                return Unit.f186387a;
        }
    }
}
