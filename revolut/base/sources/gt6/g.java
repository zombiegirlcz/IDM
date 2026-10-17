package gt6;

import lr6.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146561a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.PAYMENT_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.REFUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.REFUND_REVERSAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s.CHARGEBACK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s.CHARGEBACK_REVERSAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f146561a = iArr;
    }
}
