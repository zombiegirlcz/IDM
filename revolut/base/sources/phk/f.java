package phk;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$BillingOptionHandlingMode;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236321a;

    static {
        int[] iArr = new int[PlanBillingPickerContract$BillingOptionHandlingMode.values().length];
        try {
            iArr[PlanBillingPickerContract$BillingOptionHandlingMode.ReturnSelection.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlanBillingPickerContract$BillingOptionHandlingMode.ExecuteActions.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f236321a = iArr;
    }
}
