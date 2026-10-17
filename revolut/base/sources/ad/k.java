package ad;

import md.w1;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3200a;

    static {
        int[] iArr = new int[w1.values().length];
        f3200a = iArr;
        try {
            iArr[w1.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3200a[w1.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3200a[w1.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
