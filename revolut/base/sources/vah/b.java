package vah;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287294a;

    static {
        int[] iArr = new int[WealthAccountType.values().length];
        try {
            iArr[WealthAccountType.ROBO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WealthAccountType.SECURITIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WealthAccountType.MARGIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WealthAccountType.COMMODITIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WealthAccountType.TAA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f287294a = iArr;
    }
}
