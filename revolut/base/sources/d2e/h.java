package d2e;

import t1e.n;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110799a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.HERO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f110799a = iArr;
    }
}
