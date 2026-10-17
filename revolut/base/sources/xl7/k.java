package xl7;

import kl7.j0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f306951b;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.Speed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.Braking.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r.Acceleration.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r.Corners.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r.Environment.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[r.Trips.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[r.HoursDriven.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f306950a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.ONE_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[j0.TWO_MONTHS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[j0.SIX_MONTHS.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[j0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f306951b = iArr2;
    }
}
