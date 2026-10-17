package umk;

import ggk.p1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f281329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f281330c;

    static {
        int[] iArr = new int[p1.values().length];
        try {
            iArr[p1.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p1.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p1.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f281328a = iArr;
        int[] iArr2 = new int[com.revolut.retail.feature.pricing_plans.ui.api.models.f.values().length];
        try {
            iArr2[com.revolut.retail.feature.pricing_plans.ui.api.models.f.CENTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.retail.feature.pricing_plans.ui.api.models.f.BOTTOM_ALIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revolut.retail.feature.pricing_plans.ui.api.models.f.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f281329b = iArr2;
        int[] iArr3 = new int[com.revolut.retail.feature.pricing_plans.ui.api.models.d.values().length];
        try {
            iArr3[com.revolut.retail.feature.pricing_plans.ui.api.models.d.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[com.revolut.retail.feature.pricing_plans.ui.api.models.d.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[com.revolut.retail.feature.pricing_plans.ui.api.models.d.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f281330c = iArr3;
    }
}
