package av6;

import pr6.j;
import pr6.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9926b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.REVOLUT_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.GOOGLE_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.APPLE_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.TAP_TO_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f9925a = iArr;
        int[] iArr2 = new int[j.values().length];
        try {
            iArr2[j.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j.CARD_PRESENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[j.PAY_WITH_REVOLUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[j.GOOGLE_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[j.APPLE_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[j.APPLE_TAP_TO_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[j.BANK_TRANSFER.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[j.CASH.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[j.CLICK_TO_PAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[j.OPEN_BANKING.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[j.SEPA_DIRECT_DEBIT.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        f9926b = iArr2;
    }
}
