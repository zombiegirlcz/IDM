package uc4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f278984b;

    static {
        int[] iArr = new int[ju3.g.values().length];
        try {
            iArr[ju3.g.BOTTOM_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ju3.g.STATUS_DIALOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f278983a = iArr;
        int[] iArr2 = new int[ju3.f.values().length];
        try {
            iArr2[ju3.f.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ju3.f.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ju3.f.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f278984b = iArr2;
    }
}
