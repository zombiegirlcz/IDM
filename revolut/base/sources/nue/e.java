package nue;

import yte.m;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219301a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.OPEN_BANKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.PAY_TO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.MCY_NET_BANKING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m.NET_BANKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m.MCY_UPI_APP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[m.UPI_APP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[m.PIX_SMART_TRANSFER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[m.AKAHU.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[m.GMO_PG_BANK_DIRECT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f219301a = iArr;
    }
}
