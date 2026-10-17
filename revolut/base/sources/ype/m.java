package ype;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f315858c;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.MISSING_TIN_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315856a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.DELETE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i.NOT_NOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i.CANT_PROVIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f315857b = iArr2;
        int[] iArr3 = new int[kpe.a.values().length];
        try {
            iArr3[kpe.a.DO.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[kpe.a.POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[kpe.a.DO_NOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f315858c = iArr3;
    }
}
