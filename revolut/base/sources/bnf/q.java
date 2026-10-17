package bnf;

import tof.v6;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17162c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[y6.values().length];
        try {
            iArr[y6.ATM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y6.CARD_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y6.TOPUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y6.TOPUP_RETURN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[y6.TOPUP_CHARGEBACK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[y6.TRANSFER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[y6.EXCHANGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[y6.REWARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[y6.FEE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[y6.REFUND.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[y6.CARD_REFUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f17160a = iArr;
        int[] iArr2 = new int[v6.values().length];
        try {
            iArr2[v6.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[v6.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[v6.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[v6.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[v6.REVERTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[v6.DECLINED.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        f17161b = iArr2;
        int[] iArr3 = new int[yt8.i.values().length];
        try {
            iArr3[yt8.i.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[yt8.i.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[yt8.i.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[yt8.i.PASSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        f17162c = iArr3;
        int[] iArr4 = new int[b95.a.values().length];
        try {
            iArr4[b95.a.PERSONAL_LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[b95.a.REFINANCING_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[b95.a.MORTGAGE_LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        d = iArr4;
    }
}
