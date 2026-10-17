package l4h;

import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f192133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f192134c;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.CFD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f192132a = iArr;
        int[] iArr2 = new int[eel.i.values().length];
        try {
            iArr2[eel.i.PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[eel.i.YTM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f192133b = iArr2;
        int[] iArr3 = new int[eel.c.values().length];
        try {
            iArr3[eel.c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[eel.c.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[eel.c.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[eel.c.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[eel.c.ONE_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[eel.c.FIVE_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[eel.c.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[eel.c.YEAR_TO_DATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[eel.c.TEN_YEARS.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        f192134c = iArr3;
    }
}
