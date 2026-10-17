package b7i;

import c7i.q;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13041a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.Top.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.Bottom.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f13041a = iArr;
    }
}
