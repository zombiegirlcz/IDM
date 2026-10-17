package x7h;

import x7h.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303211a;

    static {
        int[] iArr = new int[a.C1684a.EnumC1685a.values().length];
        try {
            iArr[a.C1684a.EnumC1685a.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.C1684a.EnumC1685a.BOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.C1684a.EnumC1685a.CASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.C1684a.EnumC1685a.COMMODITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f303211a = iArr;
    }
}
