package ft6;

import lr6.d0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137942a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.CARD_PRESENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.BANK_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d0.GOOGLE_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d0.APPLE_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[d0.OPEN_BANKING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[d0.REVOLUT_PAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[d0.CLICK_TO_PAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f137942a = iArr;
    }
}
