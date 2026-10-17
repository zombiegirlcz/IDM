package vlc;

import vlc.d;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f290360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f290361c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[d.EnumC1604d.values().length];
        try {
            iArr[d.EnumC1604d.CONSERVATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.EnumC1604d.CAUTIOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.EnumC1604d.BALANCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.EnumC1604d.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.EnumC1604d.AGGRESSIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f290359a = iArr;
        int[] iArr2 = new int[d.f.values().length];
        try {
            iArr2[d.f.CORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[d.f.SUSTAINABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f290360b = iArr2;
        int[] iArr3 = new int[d.a.b.values().length];
        try {
            iArr3[d.a.b.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[d.a.b.BOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[d.a.b.CASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[d.a.b.COMMODITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f290361c = iArr3;
        int[] iArr4 = new int[xdh.a.values().length];
        try {
            iArr4[xdh.a.CONSERVATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[xdh.a.CAUTIOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[xdh.a.BALANCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[xdh.a.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[xdh.a.AGGRESSIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
        int[] iArr5 = new int[xdh.d.values().length];
        try {
            iArr5[xdh.d.CORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[xdh.d.SUSTAINABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        e = iArr5;
        int[] iArr6 = new int[pdh.c.values().length];
        try {
            iArr6[pdh.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[pdh.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[pdh.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[pdh.c.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[pdh.c.ONE_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[pdh.c.THREE_YEARS.ordinal()] = 6;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[pdh.c.FIVE_YEARS.ordinal()] = 7;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[pdh.c.TEN_YEARS.ordinal()] = 8;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[pdh.c.ALL.ordinal()] = 9;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[pdh.c.YEAR_TO_DATE.ordinal()] = 10;
        } catch (NoSuchFieldError unused28) {
        }
        f = iArr6;
    }
}
