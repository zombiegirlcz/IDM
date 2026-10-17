package aqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8331a;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.AUTOMATICALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i0.ONE_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[hzi.a.values().length];
        try {
            iArr2[hzi.a.MANUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hzi.a.AUTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f8331a = iArr2;
    }
}
