package rsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f257062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f257063c;

    static {
        int[] iArr = new int[tsd.a.values().length];
        try {
            iArr[tsd.a.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tsd.a.TAA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tsd.a.CFDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tsd.a.COMMODITIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tsd.a.ROBO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f257061a = iArr;
        int[] iArr2 = new int[cfl.b.values().length];
        try {
            iArr2[cfl.b.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cfl.b.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cfl.b.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[cfl.b.OFFBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[cfl.b.ACTIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[cfl.b.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        f257062b = iArr2;
        int[] iArr3 = new int[alc.k.values().length];
        try {
            iArr3[alc.k.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[alc.k.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[alc.k.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[alc.k.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        f257063c = iArr3;
    }
}
