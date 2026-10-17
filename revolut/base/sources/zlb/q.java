package zlb;

import com.revolut.feature.retail.savings.api.domain.models.SavingsOption;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f323226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f323227b;

    static {
        int[] iArr = new int[SavingsOption.values().length];
        try {
            iArr[SavingsOption.BANK_SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsOption.FUND_SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f323226a = iArr;
        int[] iArr2 = new int[ncd.d.values().length];
        try {
            iArr2[ncd.d.INTEREST.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ncd.d.RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f323227b = iArr2;
    }
}
