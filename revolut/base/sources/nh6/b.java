package nh6;

import io3.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f215376a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.FASTER_PAYMENTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.SEPA_INSTANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.FAST_SG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.POLISH_DOMESTIC_EXPRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.JAPAN_DOMESTIC_STANDARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[n.ACH_STANDARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[n.SEPA_CREDIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[n.POLISH_DOMESTIC_STANDARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[n.CZECH_DOMESTIC_STANDARD.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[n.PAY_TO.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[n.NONE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f215376a = iArr;
    }
}
