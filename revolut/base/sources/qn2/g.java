package qn2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f247857b;

    static {
        int[] iArr = new int[mn2.a.values().length];
        try {
            iArr[mn2.a.CASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mn2.a.MOBILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f247856a = iArr;
        int[] iArr2 = new int[qo2.c.values().length];
        try {
            iArr2[qo2.c.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qo2.c.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qo2.c.BIWEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qo2.c.MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qo2.c.YEARLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f247857b = iArr2;
    }
}
