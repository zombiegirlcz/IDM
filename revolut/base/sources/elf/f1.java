package elf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127323a;

    static {
        int[] iArr = new int[gal.g.values().length];
        try {
            iArr[gal.g.ACCEPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gal.g.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f127323a = iArr;
    }
}
