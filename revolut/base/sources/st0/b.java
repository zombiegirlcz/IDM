package st0;

import ip0.gc;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265435a;

    static {
        int[] iArr = new int[gc.values().length];
        try {
            iArr[gc.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gc.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f265435a = iArr;
    }
}
