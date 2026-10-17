package d8f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112263b;

    static {
        int[] iArr = new int[ilc.a.values().length];
        try {
            iArr[ilc.a.SG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ilc.a.US.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ilc.a.EEA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ilc.a.GB.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f112262a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.MULTIPLE_TABS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o.SINGLE_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f112263b = iArr2;
    }
}
