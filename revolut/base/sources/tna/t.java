package tna;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f272360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f272361c;

    static {
        int[] iArr = new int[xjg.k.values().length];
        try {
            iArr[xjg.k.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xjg.k.PREMIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f272359a = iArr;
        int[] iArr2 = new int[xjg.m.values().length];
        try {
            iArr2[xjg.m.SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[xjg.m.NIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[xjg.m.DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f272360b = iArr2;
        int[] iArr3 = new int[xjg.j.values().length];
        try {
            iArr3[xjg.j.PURPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[xjg.j.TEAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[xjg.j.ORANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[xjg.j.PINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[xjg.j.DEEP_BLUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[xjg.j.DYNAMIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[xjg.j.CYBERPUNK.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[xjg.j.DEFAULT.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        f272361c = iArr3;
    }
}
