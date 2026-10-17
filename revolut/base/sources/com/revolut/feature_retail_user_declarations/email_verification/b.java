package com.revolut.feature_retail_user_declarations.email_verification;

import ang.f;
import cbi.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vai.c;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements cbi.b {

    @NotNull
    private static final e Companion = new e();
    public final EmailVerificationFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f97611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pai.a f97612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f97613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f97614s;

    public b(EmailVerificationFlowInputData inputData, f userInteractor, pai.a emailVerificationInteractor, c emailVerificationCooldownTimer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(emailVerificationInteractor, "emailVerificationInteractor");
        Intrinsics.checkNotNullParameter(emailVerificationCooldownTimer, "emailVerificationCooldownTimer");
        this.o = inputData;
        this.f97611p = userInteractor;
        this.f97612q = emailVerificationInteractor;
        this.f97613r = emailVerificationCooldownTimer;
        this.f97614s = d.a(this, new c9f.c(this, 6));
    }

    public final void I2() {
        l.a1(this, X1(new y0("EMAIL_VERIFICATION_FLOW_RETRY_DIALOG_ID", new z(new TextLocalisedClause(R$string.signup_main_form_email_verify_status_failure_title, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), null, null, new cbi.f(this, null, 1), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new bwc.i(1, this, b.class, "onInitError", "onInitError(Ljava/lang/Throwable;)Z", 0, 12));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97614s;
    }
}
