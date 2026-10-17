package r74;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f252011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f252012c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ht3.l.values().length];
        try {
            iArr[ht3.l.MEDIA_CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ht3.l.BACKGROUND_MEDIA_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ht3.l.FULLSCREEN_MEDIA_CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f252010a = iArr;
        int[] iArr2 = new int[ht3.j.values().length];
        try {
            iArr2[ht3.j.HTML_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ht3.j.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f252011b = iArr2;
        int[] iArr3 = new int[ht3.b.values().length];
        try {
            iArr3[ht3.b.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ht3.b.SEMI_ACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ht3.b.FLAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f252012c = iArr3;
        int[] iArr4 = new int[ht3.f.values().length];
        try {
            iArr4[ht3.f.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[ht3.f.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
