package gue;

import m5l.b;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146903a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.VISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.MAESTRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.MASTERCARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.AMEX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.DINERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[b.DISCOVER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[b.JCB.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[b.MULTIBANCO.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[b.RU_PAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[b.AIRPLUS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[b.DANKORT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[b.UNION_PAY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f146903a = iArr;
    }
}
