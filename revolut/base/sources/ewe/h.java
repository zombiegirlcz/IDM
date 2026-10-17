package ewe;

import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130171a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.INVEST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[n.REVPAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[n.REVX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[n.THREE_DS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[n.CARD_CHECKOUT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[n.CARD_CHECKOUT_IND_GLOBAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f130171a = iArr;
    }
}
