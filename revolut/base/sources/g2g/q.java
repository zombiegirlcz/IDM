package g2g;

import myf.y;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140062a;

    static {
        int[] iArr = new int[y.values().length];
        try {
            iArr[y.CANCELLATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y.CATEGORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f140062a = iArr;
    }
}
