package up2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f281832b;

    static {
        int[] iArr = new int[mn2.a.values().length];
        try {
            iArr[mn2.a.OVERSTAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mn2.a.CASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mn2.a.MOBILITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f281831a = iArr;
        int[] iArr2 = new int[wn2.d.values().length];
        try {
            iArr2[wn2.d.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wn2.d.PARTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f281832b = iArr2;
    }
}
