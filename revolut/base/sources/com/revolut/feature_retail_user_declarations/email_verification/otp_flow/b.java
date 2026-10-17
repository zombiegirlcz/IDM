package com.revolut.feature_retail_user_declarations.email_verification.otp_flow;

import ang.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowInputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import d8l.d;
import f23.y;
import g23.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import vai.c;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements gbi.b {
    public final EmailVerificationOtpFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f97629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pai.a f97630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pai.f f97631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f97632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f97633t;

    public b(EmailVerificationOtpFlowInputData inputData, f userInteractor, pai.a emailVerificationInteractor, pai.f statusDialogFactory, c cooldownTimer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(emailVerificationInteractor, "emailVerificationInteractor");
        Intrinsics.checkNotNullParameter(statusDialogFactory, "statusDialogFactory");
        Intrinsics.checkNotNullParameter(cooldownTimer, "cooldownTimer");
        this.o = inputData;
        this.f97629p = userInteractor;
        this.f97630q = emailVerificationInteractor;
        this.f97631r = statusDialogFactory;
        this.f97632s = cooldownTimer;
        this.f97633t = d.a(this, new g75.i(this, 13));
    }

    public final void I2(String str) {
        this.f97631r.getClass();
        l.a1(this, X1(new y0("EMAIL_VERIFICATION_OTP_FLOW_RETRY_DIALOG_ID", new z(new TextLocalisedClause(R$string.signup_main_form_email_verify_status_failure_title, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), null, null, new y(this, str, (Continuation) null, 10), 3);
    }

    @Override // yki.j
    public final void M0() {
        EmailVerificationOtpFlowInputData.Origin origin = this.o.f97624a;
        Continuation continuation = null;
        if (origin instanceof EmailVerificationOtpFlowInputData.Origin.Onboarding) {
            l2(new a(this, ((EmailVerificationOtpFlowInputData.Origin.Onboarding) origin).f97625a, null), new yi5.b(26));
        } else {
            if (!(origin instanceof EmailVerificationOtpFlowInputData.Origin.PostOnboarding)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((EmailVerificationOtpFlowInputData.Origin.PostOnboarding) origin).f97626a;
            l2(new q(16, this, str, continuation), new gbi.c(this, str, 0));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97633t;
    }
}
