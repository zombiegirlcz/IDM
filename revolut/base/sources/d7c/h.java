package d7c;

import e7c.d0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111921a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.DONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f111921a = iArr;
    }
}
