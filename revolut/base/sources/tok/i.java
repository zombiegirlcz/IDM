package tok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ButtonStyle;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273241a;

    static {
        int[] iArr = new int[PricingPlanWaitlistLayout$ButtonStyle.values().length];
        try {
            iArr[PricingPlanWaitlistLayout$ButtonStyle.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PricingPlanWaitlistLayout$ButtonStyle.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f273241a = iArr;
    }
}
