package q50;

import q50.e;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f242230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f242231c;

    static {
        int[] iArr = new int[e.b.values().length];
        try {
            iArr[e.b.URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.b.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f242229a = iArr;
        int[] iArr2 = new int[e.d.values().length];
        try {
            iArr2[e.d.REV_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e.d.ACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f242230b = iArr2;
        int[] iArr3 = new int[e.f.values().length];
        try {
            iArr3[e.f.SECONDARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[e.f.PRIMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f242231c = iArr3;
    }
}
