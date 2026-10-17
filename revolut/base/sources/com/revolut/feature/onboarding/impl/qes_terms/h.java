package com.revolut.feature.onboarding.impl.qes_terms;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsOtpChannel;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.qes.waiting_auth.WaitingAuthScreen;
import com.revolut.feature.onboarding.impl.qes.waiting_auth.WaitingAuthScreenContract$InputData;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreen;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$InputData;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$Mode;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlowContract$Step;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import hn0.n;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import skm.a2;
import y89.e;
import yji.l;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements oc9.d {
    public final i A;
    public final o99.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f78562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final QesTermsFlowInputData f78563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oe9.a f78564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cn0.c f78565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f78566t;
    public final nkl.b u;
    public final xjl.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kll.a f78567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mli.e f78568x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f78569y;
    public final cn0.e z;

    public h(o99.a eSignatureInteractor, ang.f userInteractor, QesTermsFlowInputData inputData, oe9.a passcodeVerificationDispatcher, cn0.c passcodeMetadataProvider, n securityRepositoryInteractor, nkl.b revolutSsoFlowsFactory, xjl.i revolutSsoFlowConfigurationInteractor, kll.a revolutSsoOnClientLaunchedControllerModelExtension, mli.e userLogoutInteractor, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, cn0.e primaryAuthCredentialsTypeProvider) {
        Intrinsics.checkNotNullParameter(eSignatureInteractor, "eSignatureInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(passcodeVerificationDispatcher, "passcodeVerificationDispatcher");
        Intrinsics.checkNotNullParameter(passcodeMetadataProvider, "passcodeMetadataProvider");
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoOnClientLaunchedControllerModelExtension, "revolutSsoOnClientLaunchedControllerModelExtension");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsTypeProvider, "primaryAuthCredentialsTypeProvider");
        this.o = eSignatureInteractor;
        this.f78562p = userInteractor;
        this.f78563q = inputData;
        this.f78564r = passcodeVerificationDispatcher;
        this.f78565s = passcodeMetadataProvider;
        this.f78566t = securityRepositoryInteractor;
        this.u = revolutSsoFlowsFactory;
        this.v = revolutSsoFlowConfigurationInteractor;
        this.f78567w = revolutSsoOnClientLaunchedControllerModelExtension;
        this.f78568x = userLogoutInteractor;
        this.f78569y = userOnboardingNavigationProvider;
        this.z = primaryAuthCredentialsTypeProvider;
        this.A = d8l.d.a(this, new oa4.c(this, 10));
    }

    public static final void I2(h hVar, ESignatureDetails eSignatureDetails) {
        Continuation continuation = null;
        k89.b bVar = eSignatureDetails != null ? eSignatureDetails.f78145b : null;
        switch (bVar == null ? -1 : oc9.f.f224144a[bVar.ordinal()]) {
            case -1:
                if (!hVar.f78563q.f78204g || hVar.f78567w.f185650l.d() == null) {
                    oki.h.t2(hVar, hVar.A, QesTermsFlowContract$Step.QesTerms.f78548a, false, TransitionAnimation.FADE.f98392a, false, 8);
                    return;
                } else {
                    hVar.l2(new oc9.h(hVar, continuation, 0), new yi5.b(26));
                    return;
                }
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                hVar.L2();
                return;
            case 2:
                hVar.R2();
                return;
            case 3:
                IllegalStateException illegalStateException = new IllegalStateException(eSignatureDetails.f78145b + " is not supported by passcode flow");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                hVar.R2();
                return;
            case 4:
            case 5:
            case 6:
                if (eSignatureDetails.f78144a.f78148b) {
                    hVar.K2(e.b.f311641a);
                    return;
                } else {
                    hVar.U2(eSignatureDetails.f78146c, new WaitingForQesResultScreenContract$Mode.PollResult(eSignatureDetails));
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r1.invoke(r0, r4) != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if (r3.a(r11, r4) == r5) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.onboarding.impl.qes_terms.h r17, de9.m r18, kotlin.jvm.functions.Function2 r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes_terms.h.J2(com.revolut.feature.onboarding.impl.qes_terms.h, de9.m, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    public static nk3.a V2(QesTermsOtpChannel qesTermsOtpChannel) {
        if (qesTermsOtpChannel instanceof QesTermsOtpChannel.Push) {
            return nk3.a.PUSH;
        }
        if (Intrinsics.f(qesTermsOtpChannel, QesTermsOtpChannel.Sms.f78206a)) {
            return nk3.a.SMS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void K2(y89.e eVar) {
        C2(eVar);
        if (this.f78563q.d) {
            oki.h.D2(this.A);
        }
    }

    public final void L2() {
        if (!this.f78563q.f78203c) {
            K2(e.b.f311641a);
            return;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_word_done, null, null, 14);
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        l.a1(this, X1(new y0("qes_terms_completed_dialog_id", new j0((Clause) textLocalisedClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4030), false, 4)), null, null, new oc9.g(this, null), 3);
    }

    @Override // yki.j
    public final void M0() {
        P2();
    }

    public final ResourceImage M2() {
        int i = oc9.f.f224145b[this.f78563q.f.ordinal()];
        if (i == 1) {
            return new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        if (i == 2) {
            return new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes_terms.h.N2(com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails, gim.c):java.lang.Object");
    }

    public final Object O2(ESignatureDetails eSignatureDetails, gim.i iVar) {
        k89.b bVar = eSignatureDetails != null ? eSignatureDetails.f78145b : null;
        switch (bVar == null ? -1 : oc9.f.f224144a[bVar.ordinal()]) {
            case -1:
                oki.h.t2(this, this.A, QesTermsFlowContract$Step.QesTerms.f78548a, false, TransitionAnimation.FADE.f98392a, false, 8);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                L2();
                break;
            case 2:
                R2();
                break;
            case 3:
            case 4:
                Object objN2 = N2(eSignatureDetails, iVar);
                return objN2 == fim.a.COROUTINE_SUSPENDED ? objN2 : Unit.f186387a;
            case 5:
                if (!eSignatureDetails.f78144a.f78148b) {
                    T2(eSignatureDetails.f78146c, new WaitingForQesResultScreenContract$Mode.PollResult(eSignatureDetails), null);
                } else {
                    K2(e.b.f311641a);
                }
                break;
            case 6:
                S2(eSignatureDetails, eSignatureDetails.f78146c);
                break;
        }
        return Unit.f186387a;
    }

    public final void P2() {
        l2(new oc9.h(this, null, 1), new nzj.n(1, this, h.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 25));
    }

    public final void Q2() {
        if (this.f78563q.e) {
            K2(e.a.f311640a);
        } else {
            oki.h.r2(this.A);
            P2();
        }
    }

    public final a2 R2() {
        return l.a1(this, X1(new y0("qes_terms_failed_dialog_id", new z(new TextLocalisedClause(R$string.qes_error_dialog_title, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new o95.c(this, null, 10), 3);
    }

    public final void S2(ESignatureDetails eSignatureDetails, List list) {
        QesTermsFlowInputData qesTermsFlowInputData = this.f78563q;
        l.j2(this, new WaitingAuthScreen(new WaitingAuthScreenContract$InputData(eSignatureDetails, list, qesTermsFlowInputData.f78202b, qesTermsFlowInputData.f78201a.e)), null, new oc9.e(this, 0), 1);
    }

    public final void T2(List list, WaitingForQesResultScreenContract$Mode.PollResult pollResult, String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.qes_validating_otp_title, null, null, 14);
        QesTermsFlowInputData qesTermsFlowInputData = this.f78563q;
        l.j2(this, new WaitingForQesResultScreen(new WaitingForQesResultScreenContract$InputData(pollResult, list, str, textLocalisedClause, qesTermsFlowInputData.f78202b, qesTermsFlowInputData.f78201a.f)), null, new oc9.e(this, 1), 1);
    }

    public final void U2(List list, WaitingForQesResultScreenContract$Mode waitingForQesResultScreenContract$Mode) {
        QesTermsFlowInputData qesTermsFlowInputData = this.f78563q;
        l.j2(this, new WaitingForQesResultScreen(new WaitingForQesResultScreenContract$InputData(waitingForQesResultScreenContract$Mode, list, null, new TextLocalisedClause(R$string.qes_waiting_for_code_title, null, null, 14), qesTermsFlowInputData.f78202b, qesTermsFlowInputData.f78201a.f)), null, new oc9.e(this, 2), 1);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
