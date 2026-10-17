package com.revolut.feature.credit.application.plugins.impl.ui.email_verification;

import android.os.Parcelable;
import ang.f;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import hw3.k;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.h;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import oqk.i;
import org.jetbrains.annotations.NotNull;
import py3.e;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements pa4.a {

    @NotNull
    private static final pa4.c Companion = new pa4.c();
    public final yki.a A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EmailVerificationFlowContract$InputData f67630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f67631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f67632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f67633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xq3.k f67634t;
    public final e u;
    public final sp3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sf0.h f67635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v60.e f67636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f67637y;
    public EmailVerificationFlowContract$State z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmailVerificationFlowContract$InputData input, h timeProvider, f userInteractor, k verifyEmailInteractor, xq3.k creditEmailVerificationStateInteractor, e incorrectPluginCreditApplicationErrorChecker, sp3.a creditDataMonitoringFacade, sf0.h serverErrorParser, v60.e serverErrorsProvider, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(verifyEmailInteractor, "verifyEmailInteractor");
        Intrinsics.checkNotNullParameter(creditEmailVerificationStateInteractor, "creditEmailVerificationStateInteractor");
        Intrinsics.checkNotNullParameter(incorrectPluginCreditApplicationErrorChecker, "incorrectPluginCreditApplicationErrorChecker");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67630p = input;
        this.f67631q = timeProvider;
        this.f67632r = userInteractor;
        this.f67633s = verifyEmailInteractor;
        this.f67634t = creditEmailVerificationStateInteractor;
        this.u = incorrectPluginCreditApplicationErrorChecker;
        this.v = creditDataMonitoringFacade;
        this.f67635w = serverErrorParser;
        this.f67636x = serverErrorsProvider;
        ReentrantLock reentrantLock = creditEmailVerificationStateInteractor.f308081b;
        reentrantLock.lock();
        try {
            ss3.b bVar = creditEmailVerificationStateInteractor.f308080a;
            reentrantLock.unlock();
            String str = input.f67622a;
            str = str == null ? bVar != null ? bVar.f265263b : null : str;
            this.f67637y = str;
            FlowStep flowStep = str != null ? EmailVerificationFlowContract$Step.VerifyInProgress.f67628a : EmailVerificationFlowContract$Step.Initial.f67626a;
            this.z = new EmailVerificationFlowContract$State(0);
            this.A = d.a(this, flowStep, f0.f322471a, new p5f.c(this, 5));
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof pa4.e
            if (r0 == 0) goto L13
            r0 = r5
            pa4.e r0 = (pa4.e) r0
            int r1 = r0.f234336w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234336w = r1
            goto L18
        L13:
            pa4.e r0 = new pa4.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234336w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ang.f r4 = r4.f67632r
            efm.d0 r4 = r4.f(r3)
            r0.f234336w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            do3.n r5 = (do3.n) r5
            boolean r4 = r5.f116412h
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.P2(com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q2(com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c r21, kotlin.jvm.functions.Function1 r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.Q2(com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new yi5.b(26));
    }

    public final void R2(it3.d dVar) {
        xq3.k kVar = this.f67634t;
        ReentrantLock reentrantLock = kVar.f308081b;
        reentrantLock.lock();
        Continuation continuation = null;
        try {
            kVar.f308080a = null;
            Unit unit = Unit.f186387a;
            reentrantLock.unlock();
            l.a1(this, X1(new y0("email_verified_success", new j0((Clause) new TextLocalisedClause(R$string.email_verification_status_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.email_verification_status_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new i(this, dVar, continuation, 12), 3);
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
