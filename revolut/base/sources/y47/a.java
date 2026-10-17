package y47;

import tof.m5;
import tof.q5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f310820b;

    static {
        int[] iArr = new int[m5.values().length];
        try {
            iArr[m5.MASTERCARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m5.VISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m5.AIRPLUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m5.AMERICAN_EXPRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m5.AMEX.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m5.DISCOVER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[m5.DINER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[m5.JCB.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[m5.MAESTRO.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[m5.PRIVATE_LABEL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[m5.UNKNOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f310819a = iArr;
        int[] iArr2 = new int[q5.values().length];
        try {
            iArr2[q5.PAY_WITH_REVOLUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[q5.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[q5.CARD_PRESENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[q5.BANK_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[q5.OPEN_BANKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[q5.APPLE_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[q5.GOOGLE_PAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        f310820b = iArr2;
    }
}
