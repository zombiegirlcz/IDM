package jlh;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f175765a;

    static {
        int[] iArr = new int[WealthAccountType.values().length];
        try {
            iArr[WealthAccountType.COMMODITIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WealthAccountType.MARGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WealthAccountType.SECURITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WealthAccountType.TAA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WealthAccountType.ROBO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f175765a = iArr;
    }
}
