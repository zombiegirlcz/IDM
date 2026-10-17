package lik;

import kotlin.jvm.internal.Intrinsics;
import phk.k;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f195536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfk.c f195537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f195538c;
    public final xfk.b d;
    public final bgk.a e;
    public final wfk.a f;

    public a(g planSelectBillingControllerModelExtension, zfk.c planSubscriberControllerExtension, k planBillingPickerControllerModelExtension, xfk.b planDurableTermsControllerExtension, bgk.a planTermsWorkflowControllerExtension, wfk.a globalPlansExtension) {
        Intrinsics.checkNotNullParameter(planSelectBillingControllerModelExtension, "planSelectBillingControllerModelExtension");
        Intrinsics.checkNotNullParameter(planSubscriberControllerExtension, "planSubscriberControllerExtension");
        Intrinsics.checkNotNullParameter(planBillingPickerControllerModelExtension, "planBillingPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansExtension, "globalPlansExtension");
        this.f195536a = planSelectBillingControllerModelExtension;
        this.f195537b = planSubscriberControllerExtension;
        this.f195538c = planBillingPickerControllerModelExtension;
        this.d = planDurableTermsControllerExtension;
        this.e = planTermsWorkflowControllerExtension;
        this.f = globalPlansExtension;
    }
}
