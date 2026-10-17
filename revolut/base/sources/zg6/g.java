package zg6;

import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateLimitType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322081a;

    static {
        int[] iArr = new int[MandateLimitType.values().length];
        try {
            iArr[MandateLimitType.MAX_PER_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MandateLimitType.MAX_PER_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f322081a = iArr;
    }
}
