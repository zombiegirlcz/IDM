package e9h;

import vel.h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f123996b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.STOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.INDEX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.CURRENCY_PAIR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f123995a = iArr;
        int[] iArr2 = new int[h0h.a.values().length];
        try {
            iArr2[h0h.a.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[h0h.a.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[h0h.a.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[h0h.a.THREE_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[h0h.a.SIX_MONTHS.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[h0h.a.ONE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[h0h.a.FIVE_YEARS.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f123996b = iArr2;
    }
}
