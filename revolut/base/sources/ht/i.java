package ht;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f155112b;

    static {
        int[] iArr = new int[nq.b.values().length];
        try {
            iArr[nq.b.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nq.b.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f155111a = iArr;
        int[] iArr2 = new int[nq.c.values().length];
        try {
            iArr2[nq.c.TILT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nq.c.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f155112b = iArr2;
    }
}
