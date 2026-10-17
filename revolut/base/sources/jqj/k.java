package jqj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f177742a;

    static {
        int[] iArr = new int[iqj.c.values().length];
        try {
            iArr[iqj.c.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iqj.c.FORCE_INCLUDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[iqj.c.FORCE_EXCLUDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f177742a = iArr;
    }
}
