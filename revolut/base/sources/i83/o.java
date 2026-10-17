package i83;

import h93.n0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f159428b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.CAN_ACTIVATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.CANNOT_ACTIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f159427a = iArr;
        int[] iArr2 = new int[n0.values().length];
        try {
            iArr2[n0.EXPIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n0.REPLACED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n0.REACTIVATION_PERIOD_PASSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n0.CARD_LIMIT_REACHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n0.REFUNDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n0.LOST.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[n0.COMPROMISED.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[n0.TERMINATED_BY_USER.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[n0.TERMINATED_BY_REVOLUT.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[n0.UNDELIVERED.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[n0.DAMAGED.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[n0.ACTIVE_CHARGEBACK.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[n0.CANCELLED_CHARGEBACK.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[n0.SUCCESSFUL_CHARGEBACK.ordinal()] = 14;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[n0.TOO_MANY_CHARGEBACKS.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[n0.UNSUPPORTED.ordinal()] = 16;
        } catch (NoSuchFieldError unused18) {
        }
        f159428b = iArr2;
    }
}
