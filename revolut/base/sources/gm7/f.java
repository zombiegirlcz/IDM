package gm7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f144789b;

    static {
        int[] iArr = new int[yn7.d.values().length];
        try {
            iArr[yn7.d.SUBSTITUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yn7.d.ADDITIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f144788a = iArr;
        int[] iArr2 = new int[eo7.c.values().length];
        try {
            iArr2[eo7.c.PERMANENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[eo7.c.TEMPORARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f144789b = iArr2;
    }
}
