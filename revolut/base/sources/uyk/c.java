package uyk;

import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284445a;

    static {
        int[] iArr = new int[EndPromptType.values().length];
        try {
            iArr[EndPromptType.JOINT_TRADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EndPromptType.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EndPromptType.ROBO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EndPromptType.ROBO_REMEDIATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EndPromptType.STOCK_LENDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f284445a = iArr;
    }
}
