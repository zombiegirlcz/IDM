package wnk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.StudentReviewPromptScreenContract$InputData;
import ffk.e0;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements g {
    public final e0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StudentReviewPromptScreenContract$InputData f298852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f298853q;

    public k(e0 studentVerificationInteractor, StudentReviewPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(studentVerificationInteractor, "studentVerificationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = studentVerificationInteractor;
        this.f298852p = inputData;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.f134829c, null, null, new wka.e(this, null, 9), 3);
        String str = this.f298852p.f103642b;
        if (str == null || this.f298853q) {
            return;
        }
        this.f298853q = true;
        C2(new j(str));
    }
}
