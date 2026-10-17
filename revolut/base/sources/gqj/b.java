package gqj;

import lzi.i;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f145747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f145748c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i.CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f145746a = iArr;
        int[] iArr2 = new int[lzi.b.values().length];
        try {
            iArr2[lzi.b.BEFORE_WEEKEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[lzi.b.AFTER_WEEKEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[lzi.b.EXACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f145747b = iArr2;
        int[] iArr3 = new int[lzi.d.values().length];
        try {
            iArr3[lzi.d.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[lzi.d.LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f145748c = iArr3;
        int[] iArr4 = new int[lzi.f.values().length];
        try {
            iArr4[lzi.f.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[lzi.f.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[lzi.f.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[lzi.f.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[lzi.f.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[lzi.f.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[lzi.f.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        d = iArr4;
    }
}
