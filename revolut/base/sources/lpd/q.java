package lpd;

import ip0.ep0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f198983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f198984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f198985c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[lzi.d.values().length];
        try {
            iArr[lzi.d.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lzi.d.LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f198983a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.ON_THE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d.WEEK_DAY_BEFORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.WEEK_DAY_AFTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f198984b = iArr2;
        int[] iArr3 = new int[ep0.values().length];
        try {
            iArr3[ep0.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ep0.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ep0.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[ep0.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ep0.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[ep0.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[ep0.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        f198985c = iArr3;
        int[] iArr4 = new int[lzi.b.values().length];
        try {
            iArr4[lzi.b.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[lzi.b.BEFORE_WEEKEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[lzi.b.AFTER_WEEKEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
