package mhk;

import kotlin.jvm.internal.Intrinsics;
import lhk.e0;
import lhk.r0;
import sf0.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f205580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f205581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ylk.a f205582c;

    public a(h serverErrorParser, r0 pricingPlanSubscriber, ylk.a statusDialogConfigProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(pricingPlanSubscriber, "pricingPlanSubscriber");
        Intrinsics.checkNotNullParameter(statusDialogConfigProvider, "statusDialogConfigProvider");
        this.f205580a = serverErrorParser;
        this.f205581b = pricingPlanSubscriber;
        this.f205582c = statusDialogConfigProvider;
    }

    public final e0 a(bgk.a planTermsWorkflowControllerExtension, xfk.b planDurableTermsControllerExtension, wfk.a globalPlansExtension) {
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansExtension, "globalPlansExtension");
        return new e0(this.f205580a, this.f205581b, this.f205582c, planTermsWorkflowControllerExtension, planDurableTermsControllerExtension, globalPlansExtension);
    }
}
