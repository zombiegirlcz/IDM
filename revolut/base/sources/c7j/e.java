package c7j;

import wd6.h;
import wd6.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f22044c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h.TAKE_PROFIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h.STOP_LOSS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f22042a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[i.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[i.MERCHANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f22043b = iArr2;
        int[] iArr3 = new int[wd6.e.values().length];
        try {
            iArr3[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f22044c = iArr3;
        int[] iArr4 = new int[i7j.a.values().length];
        try {
            iArr4[i7j.a.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[i7j.a.ESTIMATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
