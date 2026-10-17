package q2k;

import kq2.o;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f241735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f241736b;

    static {
        int[] iArr = new int[jli.c.values().length];
        try {
            iArr[jli.c.PERIOD_SELECTION_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jli.c.PERIOD_SELECTION_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f241735a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.TRADING_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[o.DIRECT_DEBIT_TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f241736b = iArr2;
    }
}
