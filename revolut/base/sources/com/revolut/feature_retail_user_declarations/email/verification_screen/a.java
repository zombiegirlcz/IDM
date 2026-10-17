package com.revolut.feature_retail_user_declarations.email.verification_screen;

import a09.b;
import a0l.k;
import abi.e;
import abi.l;
import abi.q;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import pai.f;
import vai.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {

    @NotNull
    public static final l Companion = new l();
    public final EmailVerificationPromptContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rai.a f97600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f97601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pai.a f97602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xai.a f97603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f97604t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(EmailVerificationPromptContract$InputData inputData, rai.a emailAppIntentProvider, c emailVerificationCooldownTimer, pai.a emailVerificationInteractor, xai.a emailVerificationEventObserver, f statusDialogFactory, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(emailAppIntentProvider, "emailAppIntentProvider");
        Intrinsics.checkNotNullParameter(emailVerificationCooldownTimer, "emailVerificationCooldownTimer");
        Intrinsics.checkNotNullParameter(emailVerificationInteractor, "emailVerificationInteractor");
        Intrinsics.checkNotNullParameter(emailVerificationEventObserver, "emailVerificationEventObserver");
        Intrinsics.checkNotNullParameter(statusDialogFactory, "statusDialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f97600p = emailAppIntentProvider;
        this.f97601q = emailVerificationCooldownTimer;
        this.f97602r = emailVerificationInteractor;
        this.f97603s = emailVerificationEventObserver;
        this.f97604t = statusDialogFactory;
        this.u = d.b(this, new abi.a(inputData.f97597b), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new b(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        String str = this.o.d;
        Continuation continuation = null;
        if (str != null) {
            l2(new a1a.a(this, str, continuation, 29), new a9h.b(17));
        }
        yji.l.a1(this, this.f97603s.a(), null, null, new k(this, continuation, 24), 3);
    }

    public final void I2() {
        if (!this.f97601q.a()) {
            l2(new a01.e(this, null, 16), new yi5.b(26));
        } else {
            h.v2(this.v, EmailVerificationPromptContract$ModalStep.VerificationCooldown.f97599a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    public final void J2() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_email_sent_toast, null, null, 14);
        int i = R$drawable.uikit_icn_16_check_circle;
        Float fValueOf = Float.valueOf(20.0f);
        X1(new mii.f("EMAIL_VERIFICATION_SCREEN_RESENT_SHOT_DIALOG_ID", textLocalisedClause, null, new ConfigurableResourceImage(i, null, fValueOf, fValueOf, 926), null, null, LDSFile.EF_DG12_TAG));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
