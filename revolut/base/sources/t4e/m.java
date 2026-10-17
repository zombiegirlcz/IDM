package t4e;

import jel.o1;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267986a;

    static {
        int[] iArr = new int[o1.values().length];
        try {
            iArr[o1.COUPON_RATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o1.CALL_ACCUMULATING_RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o1.MAX_RETURN_PERCENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o1.FINAL_PAYOUT_PROFIT_MULTIPLIER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o1.CAPITAL_PROTECTION_PERFORMANCE_BASIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[o1.FINAL_PAYOUT_PERFORMANCE_BASIS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[o1.CAPITAL_PROTECTION_BARRIER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[o1.CAPITAL_PROTECTION_PROTECTED_AMOUNT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[o1.FINAL_PAYOUT_LOSS_MULTIPLIER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[o1.NOTES_TERM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f267986a = iArr;
    }
}
