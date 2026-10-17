package n2c;

import m1c.w1;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211519a;

    static {
        int[] iArr = new int[w1.values().length];
        try {
            iArr[w1.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w1.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w1.NOT_REQUESTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f211519a = iArr;
    }
}
