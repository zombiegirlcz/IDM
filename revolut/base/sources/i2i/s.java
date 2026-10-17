package i2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f157974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f157975c;

    static {
        int[] iArr = new int[r1i.h.values().length];
        try {
            iArr[r1i.h.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r1i.h.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f157973a = iArr;
        int[] iArr2 = new int[wd6.h.values().length];
        try {
            iArr2[wd6.h.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wd6.h.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f157974b = iArr2;
        int[] iArr3 = new int[wd6.c.values().length];
        try {
            iArr3[wd6.c.CRYPTO_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[wd6.c.COMMODITY_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wd6.c.FREELANCER_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[wd6.c.FIAT_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f157975c = iArr3;
    }
}
