package f2c;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131507a;

    static {
        int[] iArr = new int[RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode.values().length];
        try {
            iArr[RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode.RETURN_OPT_IN_RESULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode.NAVIGATE_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f131507a = iArr;
    }
}
