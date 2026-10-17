package ys;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316369a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.GREGORIAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.TAISHO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.SHOWA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.HEISEI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[x.REIWA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f316369a = iArr;
    }
}
