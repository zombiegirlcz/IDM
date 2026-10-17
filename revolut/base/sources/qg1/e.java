package qg1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f245621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f245622b;

    static {
        int[] iArr = new int[kg1.d.values().length];
        try {
            iArr[kg1.d.TERMINATE_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kg1.d.REPLACE_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f245621a = iArr;
        int[] iArr2 = new int[c90.b.values().length];
        try {
            iArr2[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c90.b.XXHDPI.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c90.b.XXXHDPI.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f245622b = iArr2;
    }
}
