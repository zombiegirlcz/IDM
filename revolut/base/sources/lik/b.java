package lik;

import kotlin.jvm.internal.Intrinsics;
import prk.u;
import qgk.f3;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f195539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f195540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f195541c;
    public final phm.a d;
    public final phm.a e;
    public final f3 f;

    public b(u factoryPlanSubscriberControllerModelExtension, u factoryPlanBillingPickerControllerModelExtension, u factoryPlanDurableTermsControllerExtension, u factoryPlanTermsWorkflowControllerExtension, u factoryGlobalPlansControllerExtension, f3 selectBillingFactoryDelegate) {
        Intrinsics.checkNotNullParameter(factoryPlanSubscriberControllerModelExtension, "factoryPlanSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(factoryPlanBillingPickerControllerModelExtension, "factoryPlanBillingPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(factoryPlanDurableTermsControllerExtension, "factoryPlanDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(factoryPlanTermsWorkflowControllerExtension, "factoryPlanTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(factoryGlobalPlansControllerExtension, "factoryGlobalPlansControllerExtension");
        Intrinsics.checkNotNullParameter(selectBillingFactoryDelegate, "selectBillingFactoryDelegate");
        this.f195539a = factoryPlanSubscriberControllerModelExtension;
        this.f195540b = factoryPlanBillingPickerControllerModelExtension;
        this.f195541c = factoryPlanDurableTermsControllerExtension;
        this.d = factoryPlanTermsWorkflowControllerExtension;
        this.e = factoryGlobalPlansControllerExtension;
        this.f = selectBillingFactoryDelegate;
    }
}
