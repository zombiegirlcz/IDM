package yoc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315650b;

    static {
        int[] iArr = new int[glc.k.values().length];
        try {
            iArr[glc.k.DATETIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[glc.k.ONLY_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315649a = iArr;
        int[] iArr2 = new int[ilc.c.values().length];
        try {
            iArr2[ilc.c.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ilc.c.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ilc.c.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ilc.c.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f315650b = iArr2;
    }
}
