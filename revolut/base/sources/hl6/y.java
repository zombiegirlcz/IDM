package hl6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f153011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f153012b;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f153011a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[h.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f153012b = iArr2;
    }
}
