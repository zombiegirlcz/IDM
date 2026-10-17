package kt0;

import ip0.sf;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189491a;

    static {
        int[] iArr = new int[sf.values().length];
        try {
            iArr[sf.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sf.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f189491a = iArr;
    }
}
