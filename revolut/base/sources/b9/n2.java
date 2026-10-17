package b9;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f13422c;

    static {
        int[] iArr = new int[g1.values().length];
        f13422c = iArr;
        try {
            iArr[g1.Miter.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13422c[g1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13422c[g1.Bevel.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[f1.values().length];
        f13421b = iArr2;
        try {
            iArr2[f1.Butt.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f13421b[f1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f13421b[f1.Square.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[x.values().length];
        f13420a = iArr3;
        try {
            iArr3[x.xMidYMin.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f13420a[x.xMidYMid.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f13420a[x.xMidYMax.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f13420a[x.xMaxYMin.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f13420a[x.xMaxYMid.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f13420a[x.xMaxYMax.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f13420a[x.xMinYMid.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f13420a[x.xMinYMax.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
