package azl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f11491b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.LEFT_TO_RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.RIGHT_TO_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11490a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.FROM_RIGHT_TO_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[l.FROM_LEFT_TO_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f11491b = iArr2;
    }
}
