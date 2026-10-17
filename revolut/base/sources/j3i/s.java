package j3i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f171212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f171213b;

    static {
        int[] iArr = new int[r0i.c.values().length];
        try {
            iArr[r0i.c.TP_SL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0i.c.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0i.c.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f171212a = iArr;
        int[] iArr2 = new int[qta.f.values().length];
        try {
            iArr2[qta.f.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qta.f.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qta.f.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qta.f.SIX_MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[qta.f.YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[qta.f.FIVE_YEARS.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[qta.f.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f171213b = iArr2;
    }
}
