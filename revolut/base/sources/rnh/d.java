package rnh;

import com.revolut.shared.feature.wealth.models.transaction.FeeType;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255691a;

    static {
        int[] iArr = new int[FeeType.values().length];
        try {
            iArr[FeeType.TRADING_PRO_FEE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeeType.PRIVATE_MARKETS_CUSTODY_FEE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f255691a = iArr;
    }
}
