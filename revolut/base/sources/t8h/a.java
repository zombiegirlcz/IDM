package t8h;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268897a;

    static {
        int[] iArr = new int[WealthAccountType.values().length];
        try {
            iArr[WealthAccountType.SECURITIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WealthAccountType.TAA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WealthAccountType.ROBO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WealthAccountType.MARGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WealthAccountType.COMMODITIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f268897a = iArr;
    }
}
