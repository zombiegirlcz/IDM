package anf;

import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f7734b;

    static {
        int[] iArr = new int[y6.values().length];
        try {
            iArr[y6.CARD_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y6.ATM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y6.TOPUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7733a = iArr;
        int[] iArr2 = new int[yt8.i.values().length];
        try {
            iArr2[yt8.i.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yt8.i.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yt8.i.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f7734b = iArr2;
    }
}
