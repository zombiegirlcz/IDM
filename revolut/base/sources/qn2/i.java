package qn2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f247859b;

    static {
        int[] iArr = new int[wn2.d.values().length];
        try {
            iArr[wn2.d.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wn2.d.PARTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f247858a = iArr;
        int[] iArr2 = new int[mn2.a.values().length];
        try {
            iArr2[mn2.a.OVERSTAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[mn2.a.CASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[mn2.a.MOBILITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f247859b = iArr2;
    }
}
