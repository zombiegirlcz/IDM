package ail;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5308a;

    static {
        int[] iArr = new int[zel.c.values().length];
        try {
            iArr[zel.c.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.c.MOST_BOUGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zel.c.MOST_SOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5308a = iArr;
    }
}
