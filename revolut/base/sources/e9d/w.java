package e9d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f123968b;

    static {
        int[] iArr = new int[j7d.a.values().length];
        try {
            iArr[j7d.a.PAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j7d.a.UPCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j7d.a.TRANSFERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f123967a = iArr;
        int[] iArr2 = new int[gj0.c.values().length];
        try {
            iArr2[gj0.c.CONTENT_REF.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[gj0.c.BRANCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[gj0.c.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f123968b = iArr2;
    }
}
