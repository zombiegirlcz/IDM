package imk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162497a;

    static {
        int[] iArr = new int[com.revolut.retail.feature.pricing_plans.ui.api.models.c.values().length];
        try {
            iArr[com.revolut.retail.feature.pricing_plans.ui.api.models.c.LEGACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.retail.feature.pricing_plans.ui.api.models.c.CENTERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.retail.feature.pricing_plans.ui.api.models.c.LEFT_ALIGNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f162497a = iArr;
    }
}
