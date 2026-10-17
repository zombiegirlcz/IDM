package qse;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f248805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f248806b;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.RESOLVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f248805a = iArr;
        int[] iArr2 = new int[kse.e.values().length];
        try {
            iArr2[kse.e.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[kse.e.RESOLVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f248806b = iArr2;
    }
}
