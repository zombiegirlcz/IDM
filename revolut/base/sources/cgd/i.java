package cgd;

import tx0.n3;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23937a;

    static {
        int[] iArr = new int[n3.values().length];
        try {
            iArr[n3.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n3.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f23937a = iArr;
    }
}
