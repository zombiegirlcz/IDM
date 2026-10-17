package wbf;

import com.revolut.shared.feature.wealth.models.portfolio.TradingOnboardingStatus;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296146a;

    static {
        int[] iArr = new int[TradingOnboardingStatus.values().length];
        try {
            iArr[TradingOnboardingStatus.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TradingOnboardingStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f296146a = iArr;
    }
}
