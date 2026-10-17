package ft0;

import ip0.hc;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137752a;

    static {
        int[] iArr = new int[hc.values().length];
        try {
            iArr[hc.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hc.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f137752a = iArr;
    }
}
