package glk;

import com.revolut.feature.pricingplans.models.subscribe_info.PricingPlanSubscribeInfoIneligibilityReason;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144715a;

    static {
        int[] iArr = new int[PricingPlanSubscribeInfoIneligibilityReason.values().length];
        try {
            iArr[PricingPlanSubscribeInfoIneligibilityReason.ACTIVE_MANAGED_PORTFOLIOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f144715a = iArr;
    }
}
