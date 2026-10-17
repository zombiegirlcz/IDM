package ht0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f155143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f155144c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[hw0.w.values().length];
        try {
            iArr[hw0.w.GRADIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hw0.w.DASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hw0.w.HAIRLINE_DASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hw0.w.HAIRLINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f155142a = iArr;
        int[] iArr2 = new int[hw0.b.values().length];
        try {
            iArr2[hw0.b.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[hw0.b.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f155143b = iArr2;
        int[] iArr3 = new int[hw0.c.values().length];
        try {
            iArr3[hw0.c.ABOVE_LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[hw0.c.BELOW_LINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f155144c = iArr3;
        int[] iArr4 = new int[hw0.y.values().length];
        try {
            iArr4[hw0.y.BELOW_LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[hw0.y.ABOVE_LINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
