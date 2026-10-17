package jgh;

import jel.b1;
import jel.l0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f174056b;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.PRIVATE_EQUITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.PRIVATE_CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l0.REAL_ESTATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l0.INFRASTRUCTURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l0.LIQUID_ASSETS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f174055a = iArr;
        int[] iArr2 = new int[b1.values().length];
        try {
            iArr2[b1.BUYOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b1.BUYOUT_GENERAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[b1.BUYOUT_LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[b1.BUYOUT_MEDIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[b1.BUYOUT_SMALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[b1.PRIMARIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[b1.SECONDARIES.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[b1.CO_INVESTMENTS.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[b1.GROWTH_EQUITY.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[b1.VENTURE_CAPITAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[b1.DIRECT_LENDING.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[b1.DIRECT_LENDING_GENERAL.ordinal()] = 12;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[b1.DIRECT_LENDING_SPONSOR_BACKED.ordinal()] = 13;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[b1.DIRECT_LENDING_NOT_SPONSOR_BACKED.ordinal()] = 14;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[b1.MEZZANINE.ordinal()] = 15;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[b1.DISTRESSED.ordinal()] = 16;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[b1.SPECIAL_SITUATIONS.ordinal()] = 17;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[b1.VENTURE_DEBT.ordinal()] = 18;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[b1.CORE.ordinal()] = 19;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[b1.CORE_PLUS.ordinal()] = 20;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[b1.VALUE_ADDED.ordinal()] = 21;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[b1.OPPORTUNISTIC.ordinal()] = 22;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[b1.DEBT.ordinal()] = 23;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[b1.CASH_AND_CASH_EQUIVALENTS.ordinal()] = 24;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[b1.OTHER_LIQUID_ASSETS.ordinal()] = 25;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[b1.OTHER.ordinal()] = 26;
        } catch (NoSuchFieldError unused31) {
        }
        f174056b = iArr2;
    }
}
