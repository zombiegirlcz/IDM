package com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentProductArticleKey;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a;
import do3.m;
import ffk.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import snk.u;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends h implements sik.b {

    @NotNull
    public static final sik.e Companion = new sik.e();
    public final StudentVerificationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uik.a f103292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tik.c f103293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f103294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cha.c f103295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e0 f103296t;
    public final g81.a u;
    public final u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ProductArticleParams f103297w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f103298x;

    public g(StudentVerificationFlowContract$InputData inputData, uik.a emailClientIntentProvider, tik.c resendCooldownTimer, zja.a productArticleInteractor, cha.c studentPlanInteractor, e0 studentVerificationInteractor, g81.a errorHandler, u studentInputFocusHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(emailClientIntentProvider, "emailClientIntentProvider");
        Intrinsics.checkNotNullParameter(resendCooldownTimer, "resendCooldownTimer");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        Intrinsics.checkNotNullParameter(studentVerificationInteractor, "studentVerificationInteractor");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(studentInputFocusHandler, "studentInputFocusHandler");
        this.o = inputData;
        this.f103292p = emailClientIntentProvider;
        this.f103293q = resendCooldownTimer;
        this.f103294r = productArticleInteractor;
        this.f103295s = studentPlanInteractor;
        this.f103296t = studentVerificationInteractor;
        this.u = errorHandler;
        this.v = studentInputFocusHandler;
        this.f103297w = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(StudentProductArticleKey.STUDENT));
        this.f103298x = d8l.d.a(this, new sik.d(this, 0));
    }

    public static final void I2(g gVar, do3.u uVar, String str) {
        i iVar = gVar.f103298x;
        m mVar = uVar.f116433b;
        if (mVar == null) {
            gVar.l2(new b(gVar, null), new yi5.b(26));
            return;
        }
        String str2 = mVar.f116407b;
        switch (sik.f.f263653a[mVar.f116406a.ordinal()]) {
            case 1:
                h.t2(gVar, iVar, new StudentVerificationFlowContract$Step.EmailValidation(str2, 2), false, null, false, 12);
                h.z2(iVar, new StudentVerificationFlowContract$Step.EmailVerification(str2, str), ModalDestination.Style.POPUP.f98311a);
                return;
            case 2:
                h.z2(iVar, new StudentVerificationFlowContract$Step.EmailReview(str2), ModalDestination.Style.POPUP.f98311a);
                return;
            case 3:
                gVar.C2(a.b.f103288a);
                return;
            case 4:
                h.z2(iVar, new StudentVerificationFlowContract$Step.EmailRejected(str2), ModalDestination.Style.POPUP.f98311a);
                return;
            case 5:
                h.t2(gVar, iVar, new StudentVerificationFlowContract$Step.StudentStatus(str2, uVar.f116434c), false, null, false, 12);
                return;
            case 6:
                throw new IllegalStateException(p.a.p("Illegal state StudentVerification.State.UNKNOWN for email=", str2, ". "));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new c(this, null), new sik.c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103298x;
    }
}
